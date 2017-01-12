package com.dmitring.yastaskmanager.user_service.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String email;

    @Column
    private String password;
}
