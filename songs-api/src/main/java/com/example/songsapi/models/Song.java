package com.example.songsapi.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "SONGS")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SONG_NAME")
    private String songName;

    @Column(name = "SONG_LENGTH")
    private String songLength;

    @Column(name = "ARTIST_NAME")
    private String artistName;

    public Song(String songName, String songLength, String artistName) {
        this.songName = songName;
        this.songLength = songLength;
        this.artistName = artistName;
    }
}