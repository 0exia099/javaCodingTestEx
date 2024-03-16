package ch7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ExplorerEx2 {
    //n*m 얼음 틀. 구멍 0, 칸막이 1. 상하좌우 연결되면 하나의 구멍. 해당 틀로 만들어지는 얼음 갯수
    static class Area{
        public int x;
        public int y;
        public Area(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void solution(int[][] arr){
        boolean[][] vi = new boolean[arr.length][arr[0].length];
        for(boolean[] temp : vi){
            Arrays.fill(temp, false);
        }
        int count = 0;
        Queue<Area> queue = new LinkedList<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == 0 && !vi[i][j]){
                    count++;
                    vi[i][j]=true;
                    if(j + 1 < arr[0].length && arr[i][j+1]==0)
                        queue.offer(new Area(i,j+1));
                    if(i + 1 < arr.length && arr[i+1][j]==0)
                        queue.offer(new Area(i+1,j));
                    if(j - 1 >=0 && arr[i][j-1]==0)
                        queue.offer(new Area(i,j-1));
                    if(i - 1 >= 0 && arr[i-1][j]==0)
                        queue.offer(new Area(i-1,j));
                }
                while(queue.size() > 0){
                    Area newArea = queue.poll();
                    if(!vi[newArea.x][newArea.y]){
                        vi[newArea.x][newArea.y]=true;
                        if(newArea.y + 1 < arr[0].length && arr[newArea.x][newArea.y+1]==0)
                            queue.offer(new Area(newArea.x,newArea.y+1));
                        if(newArea.x + 1 < arr.length && arr[newArea.x+1][newArea.y]==0)
                            queue.offer(new Area(newArea.x+1,newArea.y));
                        if(newArea.y - 1 >=0 && arr[newArea.x][newArea.y-1]==0)
                            queue.offer(new Area(newArea.x,newArea.y-1));
                        if(newArea.x - 1 >= 0 && arr[newArea.x-1][newArea.y]==0)
                            queue.offer(new Area(newArea.x-1,newArea.y));
                    }
                }
            }
        }
        System.out.println(count);
    }
}
