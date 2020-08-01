package CodingCompetitions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RGBNumber {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        /*  4
            RBGB
            1054
            output: 4051
        */
        int N = Integer.parseInt(br.readLine().trim());
        String S = br.readLine();
        String A = br.readLine();
        
        String out_ = solve(N,S,A);
        System.out.println(out_);

        wr.close();
        br.close();
    }



    static String solve(int N, String S, String A){
        // Write your code here
        PriorityQueue<Integer> red = new PriorityQueue(new Compara());
        PriorityQueue<Integer> green = new PriorityQueue(new Compara());
        PriorityQueue<Integer> blue = new PriorityQueue(new Compara());
        for(int i=0;i<N;i++){
            switch(S.charAt(i)){
                case 'R':
                    red.add(Character.getNumericValue(A.charAt(i)));
                    break;
                case 'G':
                    green.add(Character.getNumericValue(A.charAt(i)));
                    break;
                case 'B':
                    blue.add(Character.getNumericValue(A.charAt(i)));
                    break;
                default:
                    break;
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i=0;i<N;i++){
            switch (S.charAt(i)) {
                case 'R':
                    res.append(red.poll());
                    break;
                case 'G':
                    res.append(green.poll());
                    break;
                case 'B':
                    res.append(blue.poll());
                    break;
                
                default:
                    break;
            }
        }



        return res.toString();
    }
}

class Compara implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b) {
        return  (b)-(a);
    }
}