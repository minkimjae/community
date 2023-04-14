package com.kmj.community.entity;

import javax.persistence.*;

@Entity
@Table(name = "freeboard_comment")
public class FreeBoardComment {
    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long id;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "freeboard_id")
    private FreeBoard board;
}
