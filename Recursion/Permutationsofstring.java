public class Permutationsofstring {
    public static void permutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            //"abc" -> "ac" if currchar is b 
            String newstr = str.substring(0,i)+str.substring(i+1);//excluding currchar
            permutation(newstr,permutation+currchar);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        permutation(str, "");
            
    }
}
