package com.kmj.community.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "free_board")
public class FreeBoard {
    @Id @GeneratedValue
    @Column(name = "freeboard_id")
    private Long id;
    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member writer;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "board")
    private List<FreeBoardComment> comments = new ArrayList<>();
}
