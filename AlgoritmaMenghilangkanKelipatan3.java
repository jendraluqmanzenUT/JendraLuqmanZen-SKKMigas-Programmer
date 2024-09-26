import java.util.Arrays;

public class AlgoritmaMenghilangkanKelipatan3 {
    public static void main(String[] args) {
        int[] n = {12, 9, 13, 6, 10, 4, 7, 2};

        int max_size = n.length;
        int[] hasil = new int[max_size];
        int index = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 3 != 0) {
                hasil[index] = n[i];
                index++;
            }
        }

        int[] hasilFinal = Arrays.copyOf(hasil, index);

        Arrays.sort(hasilFinal);

        System.out.println(Arrays.toString(hasilFinal));
    }
}
