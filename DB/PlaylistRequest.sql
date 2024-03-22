SELECT playlist_name
FROM playlists
JOIN playlist_tracks ON playlists.playlist_id = playlist_tracks.playlist_id
JOIN tracks ON playlist_tracks.track_id = tracks.track_id
JOIN albums ON tracks.album_id = albums.album_id
JOIN genres ON albums.genre_id = genres.genre_id
WHERE genres.genre_name IN ('Rock', 'Rap')
GROUP BY playlist_name
HAVING COUNT(*) > 2;
