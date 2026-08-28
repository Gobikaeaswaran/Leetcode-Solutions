// Last updated: 8/28/2026, 11:47:19 AM
1class Solution {
2    public int maxPoints(int[][] points) {
3        if(points.length<=2){
4            return points.length;
5        }
6        int max=0;
7        for(int i=0;i<points.length;i++){
8            HashMap<String,Integer>map=new HashMap<>();
9            for(int j=i+1;j<points.length;j++){
10                int dy=points[j][1]-points[i][1];
11                int dx=points[j][0]-points[i][0];
12                if(dx==0){
13                    String slope="vertical";
14                    map.put(slope,map.getOrDefault(slope,0)+1);
15                    max=Math.max(max,map.get(slope));
16                }
17                else{
18                  int gcd=gcd(Math.abs(dy),Math.abs(dx));
19                dy=dy/gcd;
20                dx=dx/gcd;
21                if(dx<0){
22                    dy=-dy;
23                    dx=-dx;
24                }
25                String slope=dy+"/"+dx;
26                map.put(slope,map.getOrDefault(slope,0)+1);
27                max=Math.max(max,map.get(slope));
28            }
29        }
30        }
31        return max+1;
32    }
33    public int gcd(int a,int b){
34        while(b!=0){
35            int temp=a%b;
36            a=b;
37            b=temp;
38        }
39        return a;
40    }
41}