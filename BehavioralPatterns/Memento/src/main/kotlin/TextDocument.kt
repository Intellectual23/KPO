import java.util.*

class TextDocument(var text: String) {
    private val history: Stack<String> = Stack()

    init {
        saveToHistory()
    }

    private fun saveToHistory() {
        history.push(text)
    }

    fun add(newText: String) {
        text += newText
        saveToHistory()
    }

    fun edit(newText: String) {
        text = newText
        saveToHistory()
    }

    fun cancel() {
        if (history.size > 1) {
            history.pop()
            text = history.peek()
        } else {
            println("Cannot cancel further")
        }
    }

    fun watch() {
        println("Current Text:\n$text")
    }
}