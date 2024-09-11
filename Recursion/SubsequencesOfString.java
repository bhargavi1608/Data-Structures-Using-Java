public class SubsequencesOfString {
    public static void subsequences(String str, int idx, String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        //to be
        subsequences(str, idx+1, newstr+currchar);
        //or not to be
        subsequences(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str = "abbc";
        subsequences(str, 0, "");
    }
}
