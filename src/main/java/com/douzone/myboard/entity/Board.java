package com.douzone.myboard.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
public class Board {

    @Id
    Long boardId;

    String title;
    String boardContent;
    LocalDate createdDt;
    LocalDate modifiedDt;
    LocalDate deletedDt;

    @ManyToOne
    @JoinColumn(name = "userId")
    User user;
}
