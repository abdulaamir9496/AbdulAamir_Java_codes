package July20_23_System_Desing;
//Good and Bad KISS Principles
public class KISS_Principles {
    public static void main(String[] args) {
        //Game Design
        boolean jump = true;
        boolean run = true;
        boolean fly = false;
        boolean weapon = false;
        
        //God Mode - All 4 powers
        //Legend Mode - Run and Weapon
        //else - Regular Mode
        
        //Bad implementation
        /*if(jump == true)
        {
            if(run == true)
            {
                if(fly == true)
                {
                    if(weapon == true){
                        System.out.println("God Mode is Activated");
                    }
                }
            }
        } else if (run == true)
        {
            if (weapon == true)
            {
                System.out.println("Legend Mode is Activated");
            }
        }
        else
        {
            System.out.println("Regular Mode is Activated");
        }*/
        
        //Good Implementation
        if(jump && run && fly && weapon)
        {
            System.out.println("God Mode is Activated");
        } else if (run && weapon) 
        {
            System.out.println("Legend Mode is Activated");
        }
        else
        {
            System.out.println("Regular Mode is Activated");
        }
    }
}
