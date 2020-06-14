package com.rsjava.school.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cleaners")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Cleaner extends EntityBase {

    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "surname")
    private String surname;
}
