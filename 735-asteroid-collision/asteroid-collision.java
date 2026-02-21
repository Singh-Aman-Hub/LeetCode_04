class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        int[] res = new int[asteroids.length];
        int top = -1; 

        for (int a : asteroids) {

            while (top >= 0 && res[top] > 0 && a < 0) {

                if (res[top] < -a) {
                    top--; 
                }
                else if (res[top] == -a) {
                    top--;
                    a = 0;
                    break;
                }
                else {
                    a = 0;
                    break;
                }
            }

            if (a != 0) {
                res[++top] = a;
            }
        }

        return Arrays.copyOf(res, top + 1);
    }
}