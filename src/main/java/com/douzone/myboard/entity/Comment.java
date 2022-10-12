package com.douzone.myboard.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    Long commentId;
    String commentContent;
    LocalDateTime createdAt;
    LocalDateTime modifiedAt;
    LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "boardId")
    Board board;

    @ManyToOne
    @JoinColumn(name = "userId")
    User user;
}
