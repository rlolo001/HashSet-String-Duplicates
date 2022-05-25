import java.util.Collections;
import java.util.HashSet;

public class ExerciseA {
    public static boolean noDuplicates(String[] arr){
        //created HashSet object naming it st
        HashSet<String> st = new HashSet<>();

        //created for loop to use the length of the array and an if statement that when it contains
        //the elements in the array it returns false, hashsets doesn't take duplicates
        for (int i = 0; i < arr.length; i++) {
            if(st.contains(arr[i])){
                return false;

//            if(st.containsAll(Collections.singleton(arr[i]))){
//                return false;
            }
            st.add(arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
    //initialize an array using String data type with variable name called arr1
    String [] arr1 = {"cars","airplanes","trucks","bikes"};

        System.out.println(noDuplicates(arr1));
    }
}
