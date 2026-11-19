class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;

        for (String s : sentences) {
            int count = 1;

            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }
}
