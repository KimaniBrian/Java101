package Arrays;

public class Array1 {
    public static void main(String args[]){
// Declaration of the array and initialization of the array object
        int [] array = new int[10];

        System.out.printf("%s%8s%n", "Index", "Value");
// output each array element's value
        for(int counter = 0 ;  counter< array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
