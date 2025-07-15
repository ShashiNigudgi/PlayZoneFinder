package com.PlayZone.User_Service.validations;

import com.PlayZone.User_Service.entity.EndUser;
import com.PlayZone.User_Service.exceptions.EmailException;
import com.PlayZone.User_Service.repository.EndUserRepo;
import com.PlayZone.User_Service.requestDto.UserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ValidateEmail {

    @Autowired
    private EndUserRepo endUserRepo;

    public Boolean validateEmail(String message) {
        return false;
    }

    public void checkIfEmailExist(String userEmail) {
        List<EndUser> endUsers = endUserRepo.findByEmail(userEmail);
        if (endUsers!=null && !endUsers.isEmpty()) {
            throw new EmailException("Email " + userEmail + " is already used, Please use other email id");
        }
    }
}
