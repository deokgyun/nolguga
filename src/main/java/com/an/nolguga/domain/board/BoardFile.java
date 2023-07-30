package com.an.nolguga.domain.board;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "board_file")
public class BoardFile {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @Column(name = "file_name")
    private String fileName;

    // getters and setters
}
