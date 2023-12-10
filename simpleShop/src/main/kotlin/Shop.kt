class Shop {
    private var Products = mutableListOf<Product>()
    private var Users = mutableListOf<User>()
    public var curUser: User? = null

    init {
        Products.add(Product("Water", 50))
        Products.add(Product("Bread", 30))
        Products.add(Product("Salt", 20))
        Products.add(Product("Rum", 1800))
        Products.add(Product("Marzipan", 600))
        for (prod in Products) {
            prod.quantity = (1..5).random();
        }
        Products.add(Product("Bag", 5))
        Products.last.quantity = 999;
    }

    public fun ShowProducts() {
        for (prod in Products) {
            println("${prod.name} - ${prod.cost} rubles. Available: ${prod.quantity}")
        }
    }

    fun RegisterUser() {
        while (true) {
            print("Enter login: ")
            var login = readln()
            print("Enter password: ")
            var pass = readln()
            print("Enter password one more time: ")
            if (pass != readln()) {
                println("Error! Passwords are different. Try again.");
            } else {
                Users.add(User(login, pass))
                println("Registration complete!")
                return
            }
        }
    }

    fun SignUp() {
        print("Enter your login: ")
        val login = readln()
        for(user in Users){
            if(user.username ==  login) {
                while(true) {
                    print("Enter your password: ")
                    if (user.password == readln()) {

                        ///authentication

                        user.isAuthorized = true;
                        curUser = user;
                        println("Authentication complete!")
                        return
                    } else {
                        println("Error! Incorrect password!")
                    }
                }
            }
        }
        println("Error! This user doesn't exist")
        return
    }

    fun SignOut() {
        if(curUser!!.isAuthorized){
            curUser!!.isAuthorized = false;

            //exit

            println("Exit completed! Farewell, ${curUser!!.username}!")
        }
    }
    fun BuyProduct(productName: String, q: Int) {
        if(!curUser!!.isAuthorized){
            println("Error! You should sign up first!")
            return
        }
        for (prod in Products) {
            if (prod.name == productName) {
                prod.quantity -= q;
                print("${curUser?.username}, Enter your card number: ")
                PayForProduct(readln().toLong(), prod.cost * q)
                return
            }
        }
        println("Error! Product haven't been found: ")
    }

    private fun PayForProduct(cardNumber: Long, cost: Int) {

        ///pay

        println("Payment complete!")
    }

    inner class User(_username: String, _password: String) {
        internal val username: String = _username
        internal val password: String = _password
        internal var isAuthorized: Boolean = false;
    }
}