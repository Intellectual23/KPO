class Processor(val nomenclatureNumber: String, val name: String, val price: Double, val socketType: String, val coreCount: Int, val frequency: Double) : Component{
    override fun showComponentInfo() {
        print("CPU: $name ($nomenclatureNumber)\n" +
                "Price: $price\n" +
                "Socket Type: $socketType\n" +
                "Core Count: $coreCount\n" +
                "Frequency: $frequency GHz")
    }
}