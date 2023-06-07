class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if("".equals(digits)) {
            return result;
        }
       
        Integer n = Integer.parseInt(digits);
        String[] options = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combinations(n, "", options, result);

        return result;

    }

    public void combinations(int n, String output, String[] options, List<String> result) {
        if (n == 0) {
            result.add(output);
            output = "";
            return;
        }

        int tmp = n % 10;
        for (int i = 0; i < options[tmp].length(); i++) {
            combinations(n / 10,  options[tmp].charAt(i) + output, options, result);
        }

    }
}