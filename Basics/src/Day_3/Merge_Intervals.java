package Day_3;

import static java.lang.Math.max;

public class Merge_Intervals {
    static void merge(int[][] intervals){
        int[] current=new int[2];
        int[] next=new int[2];
        for(int i=1;i< intervals.length;i++){
            current=intervals[i-1];
            next=intervals[i];
            if(next[0]<=current[1]){
                //merging
                current[1]=max(current[1],next[1]);
            }
        }
        System.out.println("merged interval");
        for (int i=0;i<intervals.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(intervals[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void main() {
        int[][] intervals={{1,4},{2,5},{7,9},{8,12},{13,15}};
        merge(intervals);
    }
}
