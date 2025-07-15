package com.PlayZone.User_Service.validations;

import com.PlayZone.User_Service.entity.EndUser;
import com.PlayZone.User_Service.exceptions.PhoneException;
import com.PlayZone.User_Service.repository.EndUserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ValidatePhoneNumber {

    @Autowired
    private EndUserRepo endUserRepo;

     public void checkIfPhoneExist(String phoneNumber){
         List<EndUser> endUsers = endUserRepo.findByPhoneNumber(phoneNumber);
         if (!endUsers.isEmpty()){
             throw new PhoneException("Phone number "+phoneNumber +" is already used, please use other number");
         }
     }
}
