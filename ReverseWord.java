public class ReverseWord {
    public static String reverseWords(String s) {

        String[] arr=s.split(" ");
        int n=arr.length;
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="blue is sky the";
        System.out.println(reverseWords(s));
    } 
    
}
