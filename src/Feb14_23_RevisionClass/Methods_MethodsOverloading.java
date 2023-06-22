package Feb14_23_RevisionClass;

class Calculator {
    int add(int x, int y)   //declaring Parameters
    {
        /*int result = x+y;
        return result;*/
        return x + y;
    }
    /*void add(int x, int y)   //'add(int, int)' is already defined in 'Feb14_23_RevisionClass.Calculator'
    {
        //Error: same methods with same parameters are not allowed
    }*/
    float add(int x, float y) {     //declaring Parameters
        return x + y;
    }
    int add(int x, int y, int z) {    //declaring Parameters
        return x + y + z;
    }
    double add(int x, double y, double z) {   //declaring Parameters
        return x + y + z;
    }
    double add(double x, double y, double z) {    //declaring Parameters
        return x + y + z;
    }
}

public class Methods_MethodsOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();    //Object
        calc.add(10, 20);    //after passing Arguments
        calc.add(5, 6, 7);   //after passing Arguments
        calc.add(10, 10.0, 1.0);    //after passing Arguments
        calc.add(20.5, 3.7, 4.7);    //after passing Arguments
    }
}
