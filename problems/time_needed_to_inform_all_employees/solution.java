class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
       int[] time = new int[n];
        int maxTime = -1;
        for(int i=0;i<n;i++){
         time[i] =   calculateTime(i,n,headID,manager,informTime,time);
          if(maxTime<time[i]){
             maxTime = time[i];
         }
        }

        return maxTime;
    }



 private  int calculateTime(int i, int n, int headId, int[] manager, int[] infoTime,int[] time) {

        if(time[i] != 0){
            return time[i];
        }


        if(i == headId){
            return infoTime[i];
        }


        time[i] = infoTime[i] + calculateTime(manager[i],n,headId,manager,infoTime,time);

        return time[i];

    }

}