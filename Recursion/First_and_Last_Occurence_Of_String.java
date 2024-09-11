public class First_and_Last_Occurence_Of_String {
    public static int first =-1;
    public static int last = -1;
    public static void first_and_last_occurence_Of_string(String str,int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        first_and_last_occurence_Of_string(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        first_and_last_occurence_Of_string(str, 0, 'a');
        
    }
}
