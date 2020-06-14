package com.rsjava.school.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "notes")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Note extends EntityBase {

    @NonNull
    @Column(name = "number")
    private String number;

}
