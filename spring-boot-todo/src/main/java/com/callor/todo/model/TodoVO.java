package com.callor.todo.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="tbl_todos")
public class TodoVO {

    @Id
    private long seq;
    private String date;
    private String context;


}
