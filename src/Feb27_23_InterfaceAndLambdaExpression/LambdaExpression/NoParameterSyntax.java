package Feb27_23_InterfaceAndLambdaExpression.LambdaExpression;
@FunctionalInterface
interface I
{
    void Runner(int avg, int per);
    //void walking();     //can't work with multiple methods
}
public class NoParameterSyntax {
    public static void main(String[] args) {
        //code in details, Without using Lambda Expression
        /*I obj = new I()
        {
            public void Runner()
            {
                System.out.println("Runner is Running...");
            }
        };
        obj.Runner();*/
        //Using Lambda Expression in 'Functional Interface' with only logic in multi-line
        /*I obj = () ->
        {
            System.out.println("Runner is Running...");
        };
        obj.Runner();*/

        //Using Lambda Expression in 'Functional Interface' with only logic in single-line
        I obj = (avg, Per) -> System.out.println("Runner is Running..." + avg + ":" + Per);
        obj.Runner(75, 150);

        //KEY POINT: Advantage of this Lambda Expression is we can short write the code
    }
}
