package com.irshita.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collation = "person")
public class Person {
    @Id
    private int pid;
    private String pname;
    private String pemail;
    private String pmobile;
    private String paddeess;
}
