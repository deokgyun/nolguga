package com.an.nolguga.domain.user;

import com.an.nolguga.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Users extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(length = 16, nullable = false)
    private String nickname;

    @Column(length = 12)
    private String memberAuth="ROLE_USER";

}