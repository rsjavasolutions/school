package com.rsjava.school.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "notepads")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Notepad extends EntityBase {

    @NonNull
    @Column(name = "title")
    private String title;

}
