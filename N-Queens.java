1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        char [][] board= new char[n][n];
4        for( char rows[]:board){
5            Arrays.fill(rows,'.');
6        }
7        List<List<String>> fr=new ArrayList<>();
8        solve(board,0,n,fr);
9        return fr;
10    }
11
12    public void solve(char[][] board,int x,int n,List<List<String>> fr){
13
14    if(x == n){
15        List<String> co = new ArrayList<>();
16        for(char[] row : board){
17            co.add(new String(row));
18        }
19        fr.add(co);
20        return;
21    }
22
23    for(int y = 0; y < n; y++){
24        if(isSafe(board,x,y)){
25            board[x][y] = 'Q';
26            solve(board,x+1,n,fr);
27            board[x][y] = '.';
28        }
29    }
30}
31
32    public boolean isSafe(char[][] board,int x, int y){
33        for(int i=0;i<x;i++){
34            if(board[i][y]=='Q') 
35            return false;
36        }
37
38        int i=x-1;
39        int j=y-1;
40        while(i>=0&&j>=0){
41        if(board[i][j]=='Q') 
42        return false;
43        i--;
44        j--;
45        }
46
47        int p=x-1;
48        int q=y+1;
49        while(p>=0&&q<board.length){
50            if(board[p][q] == 'Q') 
51            return false;
52            p--;
53            q++;
54        }
55
56        return true;
57    }
58}