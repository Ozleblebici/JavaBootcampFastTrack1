package day3;

public class WhileLoop {




    public static void main(String[] args) {
// Ex-1
        int n=0;
        int sum=0;
        while(n<100){
            sum+=n;
            n+=2;
        }
        System.out.println("sum = " + sum);


// Ex-2

        int number=30;

        while(number>20){
            System.out.println("in the loop");
            number--;
        }



//        Ex-3


        int i=1;

        while(i<=10){
            System.out.println("Loop Start, i: " + i);
            if((i)%2==0){
                System.out.println("if cond , i:" +i);
            }
            i++;
        }


    }
}
