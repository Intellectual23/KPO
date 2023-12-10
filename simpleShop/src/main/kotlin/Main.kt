fun main(args: Array<String>) {
    var Lenta: Shop = Shop();
    Lenta.ShowProducts();
    Lenta.RegisterUser();
    Lenta.SignUp();
    Lenta.BuyProduct("Water", 1) // Лень делать выбор товара в консоли, и так пойдет!)
    Lenta.BuyProduct("Bag", 1)
    Lenta.SignOut();
    Lenta.ShowProducts();
}