package com.java.interviewprograms.toughq;

import java.util.ArrayList;

public class RatInAMaze {

    static String direction = "DLRU";

    static int[] dr = {1,0,0,-1};
    static int[] dc = {0,-1,1,0};

    static boolean isValid(int row, int col,int n, int[][] maze){
        return row >=0 && col >= 0  && row < n && col < n && maze[row][col] == 1;
    }

    static void findPath(int row, int col, int[][] maze, int n, ArrayList<String> ans, StringBuilder currentPath){
        if(row == n-1 && col == n-1){
            ans.add(currentPath.toString());
            return;
        }
        maze[row][col] = 0;

        for (int i = 0; i < 4; i++) {
            int nextRow = row + dr[i];
            int nextCol = col + dc[i];

            if(isValid(nextRow,nextCol,n,maze)){
                currentPath.append(direction.charAt(i));
                findPath(nextRow,nextCol,maze,n,ans,currentPath);
                currentPath.deleteCharAt(currentPath.length()-1);
            }
        }
        maze[row][col] = 1;
    }

    public static void main(String[] args) {
        int[] [] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

//        int[] [] maze = {
//                {1, 0, 0, 0},
//                {1, 1, 0, 0},
//                {1, 1, 0, 0},
//                {0, 1, 1, 1}
//        };


        int n = maze.length;
        ArrayList<String> result = new ArrayList<>();

        StringBuilder currentPath = new StringBuilder();

        if (maze[0][0] !=0 && maze[n-1][n-1] !=0){
            findPath(0,0,maze,n,result,currentPath);
        }
        if(result.size()==0){
            System.out.println(-1);
        }
        else{
            for(String path:result){
                System.out.println(path+" ");
            }
        }
        System.out.println();
    }
}
