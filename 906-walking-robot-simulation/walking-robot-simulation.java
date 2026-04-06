class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<obstacles.length;i++){
            set.add(obstacles[i][0]+","+obstacles[i][1]);
        }
        int x=0;
        int y=0;
        int max=0;
        char ch='N';
        for(int i=0;i<commands.length;i++){
            int curr=commands[i];
            if(curr==-1){
                if(ch=='N'){
                    ch='E';
                }
                else if(ch=='E'){
                    ch='S';
                }
                else if(ch=='S'){
                    ch='W';
                }
                else{
                    ch='N';
                }
            }
            if(curr==-2){
                if(ch=='N'){
                    ch='W';
                }
                else if(ch=='W'){
                    ch='S';
                }
                else if(ch=='S'){
                    ch='E';
                }
                else{
                    ch='N';
                }
            }
            else{
                if(ch=='N'){
                    for(int j=0;j<curr;j++){
                        if(set.contains(x+","+(y+1))) break;
                        y++;
                    }
                }
                if(ch=='S'){
                    for(int j=0;j<curr;j++){
                        if(set.contains(x+","+(y-1))) break;
                        y--;
                    }
            }
                if(ch=='W'){
                    for(int j=0;j<curr;j++){
                        if(set.contains((x-1)+","+y)) break;
                        x--;
                    }
                 }
                 if(ch=='E'){
                    for(int j=0;j<curr;j++){
                        if(set.contains((x+1)+","+y)) break;
                        x++;
                    }
                 }
            }
                 max=Math.max(max,(int)(Math.pow(x,2) + Math.pow(y,2)));
            }
            return max;
    }
}