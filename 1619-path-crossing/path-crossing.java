class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> visited = new HashSet();
        int x = 0;
        int y = 0;
        visited.add(x+"_"+y);
        for(Character ch : path.toCharArray()){
            if(ch == 'N'){
                y++;

            }else if(ch == 'S'){
                y--;
            }else if(ch == 'E'){
                x++;
            }else if(ch == 'W'){
                x--;
            }
            
             if(visited.contains(x+"_"+y)){
                return true;
             }else visited.add(x+"_"+y);
        }

       

        return false;

    }
}