class SnapshotArray {
 int snap_id = 0;

    //List<Map<Integer,Integer>> listList = new ArrayList<>();
   // Map<Integer,Integer> integerIntegerMap = new HashMap<>();

   TreeMap<Integer,Integer>[] treeMaps;
    public SnapshotArray(int length) {
        treeMaps = new TreeMap[length];
        for(int i = 0 ; i <length;i++){
            treeMaps[i] = new TreeMap<>();
            treeMaps[i].put(0,0);
        }
    }

    public void set(int index, int val) {
       treeMaps[index].put(snap_id,val);
    }

    public int snap() {
      return snap_id++;
    }

    public int get(int index, int snap_id) {
       /* try{
         return this.listList.get(snap_id).get(index);
        }catch (Exception e){
            return 0;
        }
*/
        return     treeMaps[index].floorEntry(snap_id).getValue();

     //   return mapMap.get(snap_id).get(index);

    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */