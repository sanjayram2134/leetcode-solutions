class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int digit = 1; digit < 10; digit++) {
            int num = digit;
            int nextDigit = digit + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    result.add(num);
                }
                nextDigit++;
            }
        }

        result.sort(null);  // Sorting the result list

        return result;
}
}