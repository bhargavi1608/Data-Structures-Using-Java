import java.util.HashSet;
public class UniqueSubsequence {
public static void printSubseq(String str, int idx, String newstr, HashSet<String>set) {
if(idx == str.length()) {
if(set.contains(newstr)) {
return;
}
set.add(newstr);
System.out.println(newstr);
return;
}
//choose
printSubseq(str, idx+1, newstr+str.charAt(idx), set);
//don't choose
printSubseq(str, idx+1, newstr, set);
}
public static void main(String args[]) {

String str2 = "aaa";
HashSet<String> set = new HashSet<>();
printSubseq(str2, 0, "", set);
}
}