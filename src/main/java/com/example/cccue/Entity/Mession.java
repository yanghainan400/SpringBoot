package com.example.cccue.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Mession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messionId;
    private String name;
    private String brief;
    private long fPersonId;
    private long pPersonId;
    private Date publishDate;
    private Date deadLine;
    private String state;
}
