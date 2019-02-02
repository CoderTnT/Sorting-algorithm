package sort;

/**
 * @author liaoshaojie
 * @creatdate 2019/2/2
 * @describe 选择排序 从数组第一位开始每次选出最小或者最大的值，补到第一位，下次循环从第二位开始一直到最后一位。
 */
public class SortTogether {

    public static int[] fastSort(int[] s) {

        for (int j = 0; j < s.length; j++) {
            int minIndex = j;
            for (int i = j+1; i < s.length; i++) {
                if (s[i] < s[minIndex]) {
                    minIndex = i;
                }
            }
            swap(s,j,minIndex);
        }
        return s;
    }

    private static void swap(int[] s, int i, int j) {
        int temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
