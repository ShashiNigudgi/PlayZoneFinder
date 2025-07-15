package com.PlayZone.User_Service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JoinRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer joinRequestId;
    private Integer slotId;
    @ManyToOne
    @JoinColumn(name="requestedTo")
    private EndUser requestedTo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "requestedBy",nullable = false)
    private EndUser requestedBy;

}
