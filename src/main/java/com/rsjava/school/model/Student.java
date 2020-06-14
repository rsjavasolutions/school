package com.rsjava.school.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Student extends EntityBase {

    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "surname")
    private String surname;
    @NonNull
    @Column(name = "group_number")
    private String groupNumber;

}
