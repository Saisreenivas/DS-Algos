public class KMPAlgorithm {
    public void KMPSearch(String pat, String txt){
        
        int[] lpsArray = lps(pat, pat.length(), new int[pat.length()]);

        int i=0,j=0;

        while(i<txt.length()){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            if(j== pat.length()){
                System.out.println("Found At: " + (i-j));
                j = lpsArray[j-1];
            }else if(i<txt.length() && pat.charAt(j) != txt.charAt(i)){
                if(j==0){
                    i++;
                }else{
                    j = lpsArray[j-1];
                }
            }
        }
    }

    public int[] lps(String pat, int M, int[] lpsArray){
        int len=0;
        lpsArray[0] = 0;
        int i=1;
        while(i<M){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lpsArray[i] = len;
                i++;
            }else{
                if(len == 0){
                    i++;
                }else{
                    len = lpsArray[len-1];
                }
            }
        }

        return lpsArray;
    }
    
    public static void main(String[] args) {
        String pat = "BABABAB";
        String txt = "ABABBBBBABBBBBAABABABABBABABABA";
        KMPAlgorithm x = new KMPAlgorithm();
        x.KMPSearch(pat, txt);
    }
}