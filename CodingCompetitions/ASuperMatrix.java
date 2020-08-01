package CodingCompetitions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ASuperMatrix {
    static int solve(int N, int X, int Y, int Z, int T, int[] A){
        // Write your code here and return the result.
        X--;
        Y--;
        Z--;
        T--;
        // System.out.println(X + " " + Y + " " + Z + " " + T);
        int res = -1;
        for(int i=X;i<=Z;i++){
            for(int j=Y;j<=T;j++){
                // System.out.println(res + " "+ A[i] + " " + A[j]);
                if(res == -1){
                    res = A[i]&A[j];
                }else{
                    res = res^(A[i]&A[j]);
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        /* 
            3 1 2 2 3
            1 2 3
            output:1
            */
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int X = Integer.parseInt(line[1]);
        int Y = Integer.parseInt(line[2]);
        int Z = Integer.parseInt(line[3]);
        int T = Integer.parseInt(line[4]);

        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A=0;i_A<A.length;i_A++){
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int out_ = solve(N,X,Y,Z,T,A);
        System.out.println(out_);

        wr.close();
        br.close();

    }
}