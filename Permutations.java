1class Solution {
2    List<List<Integer>> result= new ArrayList<>();
3    HashSet<Integer> set=new HashSet<>();
4    public List<List<Integer>> permute(int[] nums) {
5        List<Integer> temp=new ArrayList<>();
6            solve(nums,temp);
7            return result;
8        
9    }
10
11    public void solve(int[] nums,List<Integer> temp){
12        if(temp.size()==nums.length){
13            result.add(new ArrayList<>(temp));
14            return;
15        }
16
17        for(int i=0;i<nums.length;i++){
18            if(!set.contains(nums[i])){
19                set.add(nums[i]);
20                temp.add(nums[i]);
21
22                solve(nums,temp);
23
24                temp.remove(temp.size()-1);
25                set.remove(nums[i]);
26            }
27        }
28        return;
29    }
30}