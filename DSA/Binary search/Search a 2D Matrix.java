class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // Binary Search on rows
        int top = 0;
        int bottom = matrix.length - 1;

        while (top <= bottom) {

            int row = top + (bottom - top) / 2;

            if (target >= matrix[row][0] &&
                target <= matrix[row][matrix[row].length - 1]) {

                // Target could be in this row
                int left = 0;
                int right = matrix[row].length - 1;

                // Binary Search inside the row
                while (left <= right) {

                    int mid = left + (right - left) / 2;

                    if (matrix[row][mid] == target) {
                        return true;
                    }
                    else if (matrix[row][mid] < target) {
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }

                return false;
            }

            else if (target < matrix[row][0]) {
                bottom = row - 1;
            }

            else {
                top = row + 1;
            }
        }

        return false;
    }
}