class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obs = new HashSet();

        for(int[] a : obstacles){
            obs.add(a[0]+","+a[1]);
        }

        int x = 0;
        int y = 0;
        int px = 0;
        int py = 1;

        int maxDist = 0;

        for(int com : commands){
            if(com == -2){
                if (py != 0){
                    px = -1 * py;
                    py = 0;
                }else if (px != 0){
                    py = px;
                    px = 0;
                }
            }else if( com == -1){
                if (py != 0){
                    px =  py;
                    py = 0;
                }else if (px != 0){
                    py = -1 * px;
                    px = 0;
                }

            }else{
                for(int i = 0 ; i < com; i++){
                    x += px;
                    y += py;

                    if(obs.contains(x+","+y)){
                        x -= px;
                        y -= py;

                        int dist = (x * x) + ( y * y);
                        if(maxDist < dist){
                            maxDist = dist;
                        }


                        break;
                    }

                }
            }

            int dist = (x * x) + ( y * y);
                if(maxDist < dist){
                    maxDist = dist;
                }
        }



        return maxDist;
    }
}