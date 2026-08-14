// Last updated: 8/14/2026, 11:33:45 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String,List<String>>map=new HashMap<>();
4        for(String str:strs){
5            char ch[]=str.toCharArray();
6            Arrays.sort(ch);
7            String key=new String(ch);
8            if(!map.containsKey(key)){
9                map.put(key,new ArrayList<>());
10            }
11            map.get(key).add(str);
12        }
13        return new ArrayList<>(map.values());
14    }
15}