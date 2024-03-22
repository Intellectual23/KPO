INSERT INTO artists (artist_name) VALUES ('Artist1'), ('Artist2');
INSERT INTO genres (genre_name) VALUES ('Rock'), ('Rap');
INSERT INTO albums (album_name, artist_id, genre_id) VALUES ('Album1', 1, 1), ('Album2', 2, 2);
INSERT INTO tracks (track_name, album_id) VALUES ('Track1', 1), ('Track2', 2), ('Track3', 2);
