object ComponentFactory {
    fun CreateComponent(type: String, nomenclatureNumber: String, name: String, price: Double, vararg params: Any): Component{
        return when(type){
            "MotherBoard" -> Motherboard(nomenclatureNumber,name,price,params[0] as String, params[1] as Int, params[2] as String)
            "CPU" -> Processor(nomenclatureNumber, name, price, params[0] as String,
                params[1] as Int, params[2] as Double)
            "HardDrive" -> HardDrive(nomenclatureNumber, name, price, params[0] as Int,
                params[1] as Int)
            else -> throw IllegalArgumentException("Unknown component type")
        }
    }
}