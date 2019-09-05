package Arrays;

public class array2 {
    // sum of elements in an array

    public static void main (String[]args){
         int [] array = {45,67,88,2,4,61,50,99};
         int total =0;

    // For statement to add the elements together

    for (int counter =0; counter < array.length; counter++) {
        total += array[counter];
    }
        System.out.printf("The total for the elements is: %d%n", total);

    }
}
