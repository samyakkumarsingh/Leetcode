1class Solution {
2    List<String> result=new ArrayList<>();
3    public List<String> letterCasePermutation(String s) {
4        StringBuilder sb=new StringBuilder();
5        solve(0,s,sb);
6        return result;
7        
8    }
9
10    public void solve(int i,String s,StringBuilder sb){
11            if(i==s.length()){
12            result.add(sb.toString());
13             return;
14            }
15            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
16            {
17                sb.append(s.charAt(i));
18                solve(i+1,s,sb);
19                sb.deleteCharAt(sb.length()-1);
20            }
21
22            else{
23           
24            
25                sb.append(Character.toLowerCase(s.charAt(i)));
26                solve(i+1,s,sb);
27                sb.deleteCharAt(sb.length()-1);
28            
29            
30            
31                sb.append(Character.toUpperCase(s.charAt(i)));
32                solve(i+1,s,sb);
33                sb.deleteCharAt(sb.length()-1);
34            }   
35            
36            
37
38            
39        return;
40
41
42    }
43}