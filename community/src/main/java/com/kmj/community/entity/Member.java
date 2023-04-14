package com.kmj.community.entity;

import javax.persistence.*;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    @Column(name = "user_id")
    private String userId;
    private String password;
}
