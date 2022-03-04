public class Main {
    public static void main(String[] args) {
        int[][] testArr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Algorithm2DArrays.isFound(testArr1, 5));
        System.out.println(Algorithm2DArrays.isFound(testArr1, 12));
        System.out.println(Algorithm2DArrays.isFound(testArr1, 13));

        String[][] words = {{"hi", "bye", "howl", "goo"}, {"time", "owl", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "o"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "ow"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "goo"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "map"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "gone"));

        int[][] testArr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};

        // method modifies original testArr2 object
        int changes = Algorithm2DArrays.replaceEvensWithZero(testArr2);
        System.out.println("Number of changes: " + changes);

        System.out.println("2D Array modified:");
        for (int[] row : testArr2)
        {
            for (int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[][] testArr3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        System.out.println(Algorithm2DArrays.sumForRow(testArr3, 0));
        System.out.println(Algorithm2DArrays.sumForRow(testArr3, 1));
        System.out.println(Algorithm2DArrays.sumForRow(testArr3, 2));

    }
}
