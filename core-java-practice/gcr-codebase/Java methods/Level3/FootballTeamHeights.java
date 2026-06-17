public class FootballTeamHeights {
    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.print("Player heights in cms: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println();
        System.out.println("Shortest height is " + findShortestHeight(heights) + " cms");
        System.out.println("Tallest height is " + findTallestHeight(heights) + " cms");
        System.out.println("Mean height is " + findMeanHeight(heights) + " cms");
    }
}
