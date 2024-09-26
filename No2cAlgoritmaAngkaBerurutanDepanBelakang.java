public class No2cAlgoritmaAngkaBerurutanDepanBelakang{
    public static void main(String[] args) {
        int n = 5;
        int currentNum = 1;
        boolean ascending = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                if (ascending) {
                    if (currentNum < n) {
                        currentNum++;
                    } else {
                        ascending = false;
                        currentNum--;
                    }
                } else {
                    if (currentNum > 1) {
                        currentNum--;
                    } else {
                        ascending = true;
                        currentNum++;
                    }
                }
            }
            System.out.println();
        }
    }
}