package com.rsjava.school.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professors")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Professor extends EntityBase {

    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "surname")
    private String surname;
    @NonNull
    @Column(name = "title")
    private String title;

}
