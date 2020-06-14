package com.rsjava.school.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "notes")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Note extends EntityBase {

    @NonNull
    @Column(name = "number")
    private String number;
    @ManyToOne
    @JoinColumn(name = "notepad_id")
    @JsonIgnore
    private Notepad notepad;
}
