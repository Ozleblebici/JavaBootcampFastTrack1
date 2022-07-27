package day4;

public class UserDefExp {


    public static void main(String[] args) {

        try {
            throw new TalhaExp(5);
        }catch (TalhaExp obj){
            System.out.println(obj);
        }
    }



}





class TalhaExp extends Exception{
    int x;
    TalhaExp(int y){
        this.x=y;
    }


    public String toString(){
        return  ("This is my exp messages and my x value is" + x) ;
    }


}
