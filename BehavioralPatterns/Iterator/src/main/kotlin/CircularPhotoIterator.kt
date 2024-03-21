class CircularPhotoIterator(private var photos: List<String>): PhotoIterator {
    private var index = 0

    override fun hasNext(): Boolean {
        return photos.isNotEmpty();
    }

    override fun next(): String {
        val photo = photos[index];
        index = (index + 1) % photos.size;
        return photo;
    }
}