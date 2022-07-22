package day2;

public class ControlFlowStatements {


    public static void main(String[] args) {

        System.out.println("findMax = " + findMax(-2, -2, -3));


        double balance = 120;
        int score=5;
       // 8

        if (score >= 8) {
            balance += 70;

//            if (score > 6) {
//                balance+= 20;
        //}

        } else {
            if (score <= 6) {
                balance -= 10;
            }
        }

System.out.println(balance);

        int i=1,j=-1,k=-1;
        int x=-1, y=-1, z=-1;

        if (i>0) if (j>0) x=0; else if (k>0) y=0; else z=0;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }

    // use only 1 way if!!
    public static int findMax(int a, int b ,int c ){
// TEST DATA:
//        1 , 2 , 3
//        1, 1, 3
//        1,1,1
//        1, 1, 0  FAIL!!!

        if (a>=b && a>=c){
            return a;
        }

        if (b>=a && b>=c){
            return b;
        }

        return c;

    }

}


