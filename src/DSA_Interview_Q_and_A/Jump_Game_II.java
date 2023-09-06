package DSA_Interview_Q_and_A;
public class Jump_Game_II {
        public int jump(int[] nums) {
            int n = nums.length;
            if (n <= 1) {
                return 0; // No jumps needed if already at the last index or there is only one element.
            }

            int jumps = 0;
            int currentMax = 0; // The maximum reachable index at the current jump.
            int nextMax = 0;    // The maximum reachable index at the next jump.

            for (int i = 0; i < n - 1; i++) {
                nextMax = Math.max(nextMax, i + nums[i]);

                if (i == currentMax) {
                    jumps++;
                    currentMax = nextMax;

                    if (currentMax >= n - 1) {
                        break; // If we can reach the last index, no need for further jumps.
                    }
                }
            }
            return jumps;
        }
        public static void main(String[] args) {
            Jump_Game_II jumpGame = new Jump_Game_II();
            int[] nums = {9,0,9,6,9,6,1,7,0,0,1,2,9,0,3};
            System.out.println(jumpGame.jump(nums)); // Output: 2 (Jump from index 0 to 1, then from index 1 to 4)
        }
    }