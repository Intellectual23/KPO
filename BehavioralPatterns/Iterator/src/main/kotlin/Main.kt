import java.util.*

fun main() {
    val photos = listOf("photo1", "photo2", "photo3", "photo4")
    val photoIterator = CircularPhotoIterator(photos);
    while(true){
        println(photoIterator.next())
        Thread.sleep(1500)
    }
}