package obst;

/**
 *
 * @author Titouan Vervack 
 * A recursive way of doing things. 
 * The first implementation. Slow because it doesn't check for min in the k loop.
 */
public class Obst1 extends Obst {

    @Override
    protected void generateCostTable(Node[] tree, int[][] freqSums, int[][] cost) {
        int[][] roots = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cost[i][j] = getCost(i, j, freqSums, cost, 0, roots);
            }
        }
        buildOptimalTree(tree, freqSums, roots);
    }

    private int getCost(int i, int j, int[][] freqSum, int[][] cost, int depth, int[][] roots) {
        if (j < i) {
            return 0;
        }
        if (i == j) {
            roots[i][j] = i;
            return freqSum[i][j];
        }
        int[] subCost = new int[(j - i) + 1];
        //Try every kth key as root
        for (int k = i; k <= j; k++) {
            int first = (k == 0) ? 0 : getCost(i, k - 1, freqSum, cost, depth + 1, roots);
            int second = (k == size - 1) ? 0 : getCost(k + 1, j, freqSum, cost, depth + 1, roots);
            subCost[k - i] = first + second;
        }
        //Now get the minimal cost and add the frequency
        return freqSum[i][j] + getMin(subCost, roots, i, j);
    }

    private int getMin(int[] array, int[][] roots, int x, int y) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                roots[x][y] = i + x;
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return "Obst1";
    }
}