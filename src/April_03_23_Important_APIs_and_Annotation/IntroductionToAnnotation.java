package April_03_23_Important_APIs_and_Annotation;
//Introduction to annotations (In Hybernet, springboot, application building we will use annotations extensively)

@FunctionalInterface
//Functional interface: a functional interface has exactly one abstract method.
interface Demo
{
    void Disp();
    //void Disp1();   //Multiple non-overriding abstract methods found in interface April_03_23_Important_APIs_and_Annotation.Demo
}
//A program element annotated @Deprecated is one that programmers are discouraged from using.
// An element may be deprecated for any of several reasons, for example,
// its usage is likely to lead to errors; it may be changed incompatibly or removed in a future version
@Deprecated
class Plane
{
    public void PlaneFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Plane
{
    @Override
    public void PlaneFliesAtGoodHeight()
    {
        System.out.println("Plane flies at low");
    }
}
public class IntroductionToAnnotation {
    public static void main(String[] args) {
        Plane p = new CargoPlane();
        p.PlaneFliesAtGoodHeight();

    }
}
/*
Core java has limited annotations,
We can create our own annotations via custom annotations
 */