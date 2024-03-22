SELECT a.artist_name, COUNT(t.track_id) AS track_count
FROM artists a
JOIN albums al ON a.artist_id = al.artist_id
JOIN tracks t ON al.album_id = t.album_id
GROUP BY a.artist_name
ORDER BY track_count DESC
LIMIT 3;
