package com.java.interviewprograms.toughq;

import java.util.ArrayList;

public class RatInAMaze {

    //initialize string direction
    static String direction = "DLRU";

    // Arrays to represent change in rows and columns
    static int[] dr = {1,0,0,-1};
    static int[] dc = {0,-1,1,0};

    //function to check if the cell(row, col) is inside the maze and unblocked
    public static boolean isValid(int row, int col,int n, int[][] maze){
        return row >=0 && col >= 0  && row < n && col < n && maze[row][col] == 1;
    }

    // Function to get all valid paths
    public static void findPath(int row, int col, int[][] maze, int n, ArrayList<String> ans, StringBuilder currentPath){

        // if we reach the bottom right cell of the matrix,
        // add the current path to ans and return
        if(row == n-1 && col == n-1){
            ans.add(currentPath.toString());
            return;
        }
        // mark the current cell as blocked
        maze[row][col] = 0;

        for (int i = 0; i < 4; i++) {
       // find the next row based on the current row
            // row and the dr[] array
            int nextRow = row + dr[i];

            // find the next col based on the current col
            // column (col) and the dc[] array
            int nextCol = col + dc[i];

            // check if the next cell is valid or not
            if(isValid(nextRow,nextCol,n,maze)){
                currentPath.append(direction.charAt(i));
                // recursively call the FindPath function
                // for the next cell
                findPath(nextRow,nextCol,maze,n,ans,currentPath);
                // Remove the last direction when backtracking
                currentPath.deleteCharAt(currentPath.length()-1);
            }
        }
        // make the current cell as blocked
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
        // list to store all the valid paths
        ArrayList<String> result = new ArrayList<>();
        // store the current path
        StringBuilder currentPath = new StringBuilder();

        if (maze[0][0] !=0 && maze[n-1][n-1] !=0){
            //Function call to get all valid paths
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
