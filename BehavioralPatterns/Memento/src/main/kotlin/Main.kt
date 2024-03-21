import java.util.*

fun main() {
    val textDocument = TextDocument("Initial Text\n")

    val scanner = Scanner(System.`in`)
    var input: String

    do {
        println("\nOptions:")
        println("add - Enter new text")
        println("edit - Replace current text with new text")
        println("watch - View current text")
        println("cancel - Cancel last change")

        input = scanner.nextLine()

        when (input) {
            "add" -> {
                print("Enter new text: ")
                val newText = scanner.nextLine()
                textDocument.add(newText)
            }
            "edit" -> {
                print("Enter new text: ")
                val newText = scanner.nextLine()
                textDocument.edit(newText)
            }
            "watch" -> textDocument.watch()
            "cancel" -> textDocument.cancel()
            else -> println("Invalid command")
        }
    } while (input != "exit")
}