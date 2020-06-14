package com.rsjava.school.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "notepads")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Notepad extends EntityBase {

    @NonNull
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "notepad", cascade = CascadeType.ALL)
    private Set<Note> noteSet = new HashSet<>();

}
