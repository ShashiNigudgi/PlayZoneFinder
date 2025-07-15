package com.PlayZone.User_Service.controller;

import com.PlayZone.User_Service.exceptions.LoginException;
import com.PlayZone.User_Service.requestDto.UserRequestDto;
import com.PlayZone.User_Service.responseDto.UserResponseDto;
import com.PlayZone.User_Service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/PlayZone/userService")
public class UserController {

   @Autowired
   private UserService userService;

    @PostMapping("/register")
    private ResponseEntity<UserResponseDto> registerUser(@RequestBody @Valid UserRequestDto userRequestDto){

        UserResponseDto userResponseDto = userService.registerUser(userRequestDto);
        return  ResponseEntity.status(HttpStatus.CREATED).body(userResponseDto);
    }

    @GetMapping("/login/{id}")
    private ResponseEntity<UserResponseDto> loginById(@PathVariable("id") int id) {

        UserResponseDto userResponseDto = userService.loginById(id);
        return ResponseEntity.status(HttpStatus.OK).body(userResponseDto);
    }

}
