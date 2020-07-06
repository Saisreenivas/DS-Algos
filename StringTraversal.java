public class StringTraversal {
    public void ReverseString(String data){
        StringBuilder out = new StringBuilder();
        for(int i=0;i<data.length();i++){
            out.append(data.charAt(data.length()-1-i));
            // System.out.print(out.toString());
        }
        System.out.print(out.toString());
    }

    public static void main(String[] args) {
        // System.out.println("Hello");
        StringTraversal x = new StringTraversal();
        x.ReverseString("Hello");
    }
}