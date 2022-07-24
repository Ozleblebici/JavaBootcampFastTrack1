package day3;

public class ArrayLoopEx {


    public static void main(String[] args) {

        String[] str = {};


    }

//    For given an array , create a method and try to add given value for given index!!
//    Sample:
//
//    INPUT: String []arrayStr = { “A“ , “B” , “C“ , “D“ , “E“ };
//    Requested Method:  arrayInsertValue(arrayStr , 1, “XOX")    return  OUTPUT
//
//    OUTPUT: return an array-> {“A“ , “XOX“ , "B” , “C“ , “D“ , “E“ };

//    str = { “A“ , “B” , “C“}
//TestScenarios:
//    1- keyword = null , index = 1                 -> Exp. Result:  { “A“ , null, “B” , “CD“}
//    2- keyword = "D" , index = 3                  -> Exp. Result:  { “A“ , “B” , “C“ , "D"}
//    3- keyword = "D" , index = 0                  -> Exp. Result:  { "D", “A“ , “B” , “C“ }
//    4- keyword = "D" , index > 3  || index < 0    -> Exp. Result:  Return same array with error messages
//    5- str[] = blank keyword = "D" , index = 0    -> Exp. Result:  { "D" }
//    6- str[] = blank keyword = "D" , index > 0    -> Exp. Result:  Return same array with error messages
//    7- str[] = blank keyword = "D" , index > 0    -> Exp. Result:  Return same array with error messages

    public static String[] arrayInsertValue(String[] strArray, int indexKeyword, String keyword) {

        if (strArray == null) {
            System.err.println(" INVALID INPUT ARRAY!!");
            return null;
        } else if (indexKeyword > strArray.length || indexKeyword < 0) {
            System.err.println(" INVALID INPUT index keyword!!");
            return strArray;
        }

        String[] returnArray = new String[(strArray.length + 1)];

        if (strArray.length == 0) {
            returnArray[0] = keyword;
            return returnArray;
        }

//
//        for(){
//          // add all exist array element to new one!!
//            if (given elements index = i ){
//                add new keyword!!1
//                    update index !!!
//            }
//        }
        return returnArray;
    }

}


