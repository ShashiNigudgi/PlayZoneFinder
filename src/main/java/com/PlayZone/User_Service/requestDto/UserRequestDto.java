package com.PlayZone.User_Service.requestDto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserRequestDto {


    @NotBlank(message = "email is mandatory")
    private String email;
    @NotBlank(message = "phone number is mandatory")
    private String phoneNumber;
    @NotBlank(message = "password is required")
    private String password;
    @NotBlank(message = "first name is required")
    private String firstName;
    private String middleName;
    @NotBlank(message = "last name is required")
    private String lastName;

    public UserRequestDto() {
    }

    public UserRequestDto( String email, String phoneNumber, String password, String firstName, String middleName, String lastName) {

        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }



    public @NotBlank(message = "email is mandatory") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "email is mandatory") String email) {
        this.email = email;
    }

    public @NotBlank(message = "phone number is mandatory") String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NotBlank(message = "phone number is mandatory") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public @NotBlank(message = "password is required") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "password is required") String password) {
        this.password = password;
    }

    public @NotBlank(message = "first name is required") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "first name is required") String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public @NotBlank(message = "last name is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "last name is required") String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserRequestDto{" +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
