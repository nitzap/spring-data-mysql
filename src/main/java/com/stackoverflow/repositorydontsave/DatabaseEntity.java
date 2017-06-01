package com.stackoverflow.repositorydontsave;

import javax.persistence.*;

/**
 * Created by gcasanova on 5/31/17.
 */
@Entity()
@Table(name = "entity")
public class DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
