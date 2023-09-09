package Task_5_strings;

public class task_ {
    public static void main(String[] args) {
        String st = "ala";
        System.out.println(test(st));
    }

    public static boolean test(String st){
        st = st.toLowerCase();
        StringBuilder newST = new StringBuilder();

        for(int i = st.length()-1; i >= 0; i--){
            char ch = st.charAt(i);
            newST.append(ch);
        }

        if(st.contentEquals(newST)){
            return true;
        }else{
            return false;
        }

    }
}
