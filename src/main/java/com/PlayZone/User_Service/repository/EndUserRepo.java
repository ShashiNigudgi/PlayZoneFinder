package com.PlayZone.User_Service.repository;

import com.PlayZone.User_Service.entity.EndUser;
import com.PlayZone.User_Service.entity.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface EndUserRepo extends JpaRepository<EndUser, Integer>{
    List<EndUser> findByEmail(String email);
    List<EndUser> findByPhoneNumber(String phoneNumber);
}
