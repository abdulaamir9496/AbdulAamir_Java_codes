package July20_23_System_Desing.Singleton_Design_Pattern;

public class DryFruits {
    public static void main(String[] args) {
        Fruits fruits = Fruits.getFruits();  //we can via getter method
        
        /*Fruits fruits = new Fruits();
        Fruits fruits1 = new Fruits();
        Fruits fruits2 = new Fruits();
        Fruits fruits3 = new Fruits();*/
        //It is allowing to create multiple 'objects.' We shouldn't allow creating more than 1 'object'
    }
}
