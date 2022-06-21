package com.github.bentaljaard.conference.models;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Attendee extends PanacheEntity {
    public String name;
    public String surname;
    public String email;
    public String company;
    public String role;
}
