class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            while (!stack.isEmpty() &&
                   asteroid < 0 &&
                   stack.peek() > 0 &&
                   stack.peek() < -asteroid) {

                stack.pop();
            }

            if (!stack.isEmpty() &&
                asteroid < 0 &&
                stack.peek() > 0 &&
                stack.peek() == -asteroid) {

                stack.pop();
            }
            else if (stack.isEmpty() ||
                     stack.peek() < 0 ||
                     asteroid > 0) {

                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}