package com.PlayZone.User_Service.config;

import com.PlayZone.User_Service.validations.ValidateEmail;
import com.PlayZone.User_Service.validations.ValidatePhoneNumber;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sound.midi.VoiceStatus;

@Configuration
public class BeanCreationClass {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public ValidateEmail validateEmail(){
        return new ValidateEmail();
    }

    @Bean
    public ValidatePhoneNumber validatePhoneNumber(){
        return new ValidatePhoneNumber();
    }

}
