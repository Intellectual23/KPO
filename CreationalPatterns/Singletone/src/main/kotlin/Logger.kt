import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
object Logger {
    private val logFile = File("log.txt")
    private val jsonLogFile = File("log.json")
    private val gson: Gson = GsonBuilder().setPrettyPrinting().create()
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())

    @Synchronized
    fun log(type: LogType, source: String, content: String) {
        val timestamp = dateFormat.format(Date())
        val message = LogMessage(type, source, timestamp, content)

        writeToTextLog(message)
        writeToJsonLog(message)
    }

    private fun writeToTextLog(message: LogMessage) {
        logFile.appendText("[${message.timestamp}] [${message.type}] [${message.source}] ${message.content}\n")
    }

    private fun writeToJsonLog(message: LogMessage) {
        val jsonMessage = gson.toJson(message)
        jsonLogFile.appendText("$jsonMessage\n")
    }
}