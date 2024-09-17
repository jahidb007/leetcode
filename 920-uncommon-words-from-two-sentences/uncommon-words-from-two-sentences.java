class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> result = new ArrayList();
        Map<String,Integer> fs = new HashMap();

        for(String s : s1.split(" ")){
            if(fs.containsKey(s)){
                fs.put(s, fs.get(s) + 1);
            }else fs.put(s, 1);
        }

        for(String s : s2.split(" ")){
            if(fs.containsKey(s)){
                fs.put(s, fs.get(s) + 1);
            }else fs.put(s, 1);
        }
        
        for (Map.Entry<String, Integer> entry : fs.entrySet()) {
            if(entry.getValue() == 1){
                result.add(entry.getKey());
            }
        }

        String[] st = new String[result.size()];

        int i = 0;
        for(String s : result){
            st[i] = s;
            i++;
        }

        return st;
    }
}