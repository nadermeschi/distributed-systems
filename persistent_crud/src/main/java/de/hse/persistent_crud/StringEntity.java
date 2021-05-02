package de.hse.persistent_crud;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class StringEntity {
    @Id
    private String data;

    // empty constructor 
    public StringEntity() {}

    public StringEntity(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

}