package com.PlayZone.User_Service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EndUser extends User{



   @OneToMany(mappedBy = "requestedTo")
   private List<JoinRequest> joinRequests ;

   @OneToMany(mappedBy = "requestedBy")
   private List<JoinRequest> requestedByMe;
   //private List<User> user;
}
