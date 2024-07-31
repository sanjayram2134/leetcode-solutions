public class Solution {
      public int minHeightShelves(int[][] books, int shelfWidth) {
        Integer[][] memo = new Integer[books.length][shelfWidth + 1];
        return minHeight(books, shelfWidth, 0, 0, 0, memo);
    }

    private int minHeight(int[][] books, int shelfWidth, int index, int currentWidth, int currentHeight, Integer[][] memo) {
        if (index == books.length) {
            return currentHeight;
        }

        if (memo[index][currentWidth] != null) {
            return memo[index][currentWidth];
        }

        int thickness = books[index][0];
        int height = books[index][1];

        // Option 1: Place book on the current shelf if it fits
        int heightWithCurrentShelf = Integer.MAX_VALUE;
        if (currentWidth + thickness <= shelfWidth) {
            heightWithCurrentShelf = minHeight(books, shelfWidth, index + 1, currentWidth + thickness, Math.max(currentHeight, height), memo);
        }

        // Option 2: Place book on the next shelf
        int heightWithNextShelf = currentHeight + minHeight(books, shelfWidth, index + 1, thickness, height, memo);

        memo[index][currentWidth] = Math.min(heightWithCurrentShelf, heightWithNextShelf);
        return memo[index][currentWidth];
    }

   
}
