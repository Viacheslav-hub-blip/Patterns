package Task_1_3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5,6};
        int offset = 0;

        for(int i = 0; i < array.length; i ++){
            if(array[i] == 2){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(array, array.length - offset)));


    }
}
