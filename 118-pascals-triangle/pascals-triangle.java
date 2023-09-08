class Solution {

    public List<List<Integer>> data = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        generatePascalNumber(numRows);
        return data;
    }

        private void generatePascalNumber(int i) {

        if (i == 1) {
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            data.add(ans);
            return;
        }

        generatePascalNumber(i - 1);

        List<Integer> prevList = data.get(i - 2);
        List<Integer> newList = new ArrayList<>();

        newList.add(1);

        for (int j = 0; j < prevList.size() - 1; j++) {
            newList.add(prevList.get(j) + prevList.get(j + 1));
        }
        newList.add(1);

        data.add(newList);


    }
}