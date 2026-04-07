class Robot {
    int width;
    int height;
    int x;
    int y;
    int dir;
    int per;
    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
        this.per = 2 * (width + height) - 4;
    }
    
    public void step(int num) {
        if(per == 0){
            return;
        }
        num %= per;
        if(num == 0){
            if(x == 0 && y == 0){
                dir = 3;
            }
            return;
        }
        while(num > 0){
            if(dir == 0){ 
                int move = Math.min(num, width - 1 - x);
                x += move;
                num -= move;
                if(num > 0){
                    dir = 1;
                }
            } 
            else if(dir == 1){
                int move = Math.min(num, height - 1 - y);
                y += move;
                num -= move;
                if(num > 0){
                    dir = 2;
                }
            } 
            else if(dir == 2){ 
                int move = Math.min(num, x);
                x -= move;
                num -= move;
                if(num > 0){
                    dir = 3;
                }
            } 
            else{ 
                int move = Math.min(num, y);
                y -= move;
                num -= move;
                if(num > 0){
                    dir = 0;
                }
            }
        }
    }
    
    public int[] getPos() {
        return new int[]{x,y};
        
    }
    
    public String getDir() {
        if(dir == 0){
            return "East";
        }
        else if(dir == 1){
            return "North";
        }
        else if(dir == 2){
            return "West";
        }
        else{
            return "South";
        }
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */