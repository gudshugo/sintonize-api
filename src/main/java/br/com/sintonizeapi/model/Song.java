package br.com.sintonizeapi.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    @Id
    private int id;

    private String description;

    private String spotifyHref;

    private LocalDate createdAt;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id")
    private Track track;

}
