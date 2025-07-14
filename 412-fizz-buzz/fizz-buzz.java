class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>(n);  // 초기 용량 지정

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();

            if (i % 3 == 0) sb.append("Fizz");
            if (i % 5 == 0) sb.append("Buzz");

            if (sb.length() == 0) sb.append(i);

            results.add(sb.toString());
        }

        return results;
    }
}