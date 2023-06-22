package Feb14_23_RevisionClass;

class Books {
    private int pgNo;  //Now can use within this call only to set and get pgNo value. But not outside the class.
    //Requirement: Some other class person/developer should assign the value to this dataMember: pgNo;
    //For that we need to do some activity/ task means "methods" has to be written

    /*void setPgNo(int x) {  //then what is the use of using setter and getter.
         // Even after this we were able to update and return the values of 'x'
        pgNo = x;
    }*/

    //But we have option to customize as per our requirements as shown below
    void setPgNo(int x) {
        if (x > 0) {
            pgNo = x;
        } else {
            System.out.println("Why are you giving negative value");
        }
        pgNo = x;
    }

    int getPgNo() {
        return pgNo;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Books b = new Books();
        //b.pgNo = -100;  Error
        //System.out.println(b.pgNo);   Error

        b.setPgNo(-100);
        System.out.println(b.getPgNo());
    }
}
