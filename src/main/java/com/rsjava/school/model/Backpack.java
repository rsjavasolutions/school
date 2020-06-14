package com.rsjava.school.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "backpacks")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Backpack extends EntityBase {

    @NonNull
    @Column(name = "mark")
    private String mark;

}
