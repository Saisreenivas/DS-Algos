package Practice;

public class KMPAlgorithm {
    public void KMPSearch(String txt, String pat){
        int[] lps = lpsArray(pat, pat.length(), new int[pat.length()]);
        int j=0, i=0;
        while(i< txt.length()){
            if(txt.charAt(i) == pat.charAt(j)){
                j++;
                i++;
            }
            if(j== pat.length()){
                System.out.println("Found At Index: " + (i-j));
                j = lps[j-1];
            }else if( i < txt.length() && pat.charAt(j) != txt.charAt(i)){
                if(j ==0){
                    i = i+1;
                }else{
                    j = lps[j-1];
                }
            }
        }
    }

    public int[] lpsArray(String pat, int M, int[] lps){

        int len = 0;
        lps[0] = 0;
        int i=1;
        while(i < M){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }else{
                    len = lps[len-1];
                }
            }
        }

        return lps;
    }
    
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        KMPAlgorithm x = new KMPAlgorithm();
        x.KMPSearch(text,pat);
    }
}