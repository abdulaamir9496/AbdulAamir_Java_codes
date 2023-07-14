package March_27_23_Map_and_Generics;

import java.util.HashMap;
import java.util.WeakHashMap;

//HashMap vs WeakHashMap & How GC is invoking the finalize method internally
class Employee      //if no parent, so its parent will be 'object'
{
    private int empId;     //Properties
    private String empName;       //Properties

    public Employee(int empId, String empName)      //specialized method / initializing values using constructor
    {
        this.empId = empId;
        this.empName = empName;
    }

    public String toString() {
        return empId + "";
    }

    public void finalize() {
        System.out.println("clean up by GC before de-allocating memory from HEAP area");
    }
}

public class HashMapVsWeakHashMap {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Starks");  //emp is having address

        HashMap hm = new HashMap();
        //WeakHashMap hm = new WeakHashMap();  //will not dominate GC and finalized will get invoked for clean-up
        hm.put(emp, "Good Programming");
        System.out.println(hm);

        emp = null;      //emp is now null and emp is now eligible for GC

        System.gc();       //explicit invoing the GC

        System.out.println(hm);     //Even after eligible for GC, still it's not getting invoked
        //HashMap is dominating and finalize is not getting invoked for clean-up

        System.out.println("Last Line of Code");

    }
}
