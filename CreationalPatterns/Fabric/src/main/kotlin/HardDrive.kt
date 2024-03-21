class HardDrive(val nomenclatureNumber: String, val name: String, val price: Double,
                val capacityGB: Int, val rotationSpeed: Int ): Component {
    override fun showComponentInfo() {
        print("Hard Drive: $name ($nomenclatureNumber)\n" +
                "Price: $price\n" +
                "Capacity: $capacityGB GB\n" +
                "Rotation Speed: $rotationSpeed RPM")
    }
}