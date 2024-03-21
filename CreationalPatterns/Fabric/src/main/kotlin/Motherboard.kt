data class Motherboard(
    val nomenclatureNumber: String, val name: String, val price: Double,
    val socketType: String, val cpuCount: Int, val memoryType: String
) : Component {
    override fun showComponentInfo() {
        print(
            "Motherboard: $name ($nomenclatureNumber)\n" +
                    "Price: $price\n" +
                    "Socket Type: $socketType\n" +
                    "CPU Count: $cpuCount\n" +
                    "Memory Type: $memoryType"
        )
    }
}