CREATE TABLE artists (
    artist_id SERIAL PRIMARY KEY,
    artist_name VARCHAR(50) NOT NULL
);

CREATE TABLE genres (
    genre_id SERIAL PRIMARY KEY,
    genre_name VARCHAR(50) NOT NULL
);

CREATE TABLE albums (
    album_id SERIAL PRIMARY KEY,
    album_name VARCHAR(50) NOT NULL,
    artist_id INT REFERENCES artists(artist_id),
    genre_id INT REFERENCES genres(genre_id)
);

CREATE TABLE tracks (
    track_id SERIAL PRIMARY KEY,
    track_name VARCHAR(50) NOT NULL,
    album_id INT REFERENCES albums(album_id)
);

CREATE VIEW tracks_view AS
SELECT t.track_name, a.artist_name, g.genre_name, al.album_name
FROM tracks t
JOIN albums al ON t.album_id = al.album_id
JOIN artists a ON al.artist_id = a.artist_id
JOIN genres g ON al.genre_id = g.genre_id;
