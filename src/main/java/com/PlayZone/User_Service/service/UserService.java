package com.PlayZone.User_Service.service;

import com.PlayZone.User_Service.config.BeanCreationClass;
import com.PlayZone.User_Service.entity.EndUser;
import com.PlayZone.User_Service.exceptions.LoginException;
import com.PlayZone.User_Service.repository.EndUserRepo;
import com.PlayZone.User_Service.requestDto.UserRequestDto;
import com.PlayZone.User_Service.responseDto.UserResponseDto;
import com.PlayZone.User_Service.validations.ValidateEmail;
import com.PlayZone.User_Service.validations.ValidatePhoneNumber;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private EndUserRepo endUserRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ValidateEmail validateEmail;

    @Autowired
    private ValidatePhoneNumber validatePhoneNumber;


    public UserResponseDto registerUser(UserRequestDto userRequestDto){

        validateEmail.checkIfEmailExist(userRequestDto.getEmail());
        validatePhoneNumber.checkIfPhoneExist(userRequestDto.getPhoneNumber());
        validatePhoneNumber.checkPhoneNumberLength(userRequestDto.getPhoneNumber());

        EndUser endUser = new EndUser();
        //dtoToEntity model mapper
        modelMapper.map(userRequestDto,endUser);

        EndUser userEntity = endUserRepo.save(endUser);

        //entityToDto model mapper pending
       UserResponseDto userResponseDto = new UserResponseDto();
        modelMapper.map(endUser,userResponseDto);

        return userResponseDto;
    }

    public UserResponseDto loginById(int id)  {
        System.out.println("the id is :"+id);
        EndUser userEntity = endUserRepo.findById(id)
                                        .orElseThrow(()-> new LoginException("entity details are not available for this id : "+id));

        System.out.println("the enduser is :" +userEntity);

        UserResponseDto userResponseDto = new UserResponseDto();
        modelMapper.map(userEntity,userResponseDto);
        System.out.println("check the mapped one :"+userResponseDto);
        return userResponseDto;
    }
}
