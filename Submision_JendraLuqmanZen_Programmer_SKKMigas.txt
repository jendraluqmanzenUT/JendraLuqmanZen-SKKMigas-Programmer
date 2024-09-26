Nama      : Jendra Luqman Zen
Posisi    : Programmer
Tanggal   : 26 September 2024
No HP     : 082133668379



#####Soal no 1 Buatlah algoritma untuk menampilkan angka 1 s/d n, dengan ketentuan: kelipatan 3 diganti "OK", kelipatan 4 diganti "YES", kelipatan 3 & 4 diganti "OKYES"#####
Contoh output di bawah adalah ketika nilai "n" = 15

a. 1 OK YES OK 5 OKYES 7 OK YES OK 11 OKYES 13 OK YES

public class No1AlgoritmaOkYes {
    public static void main(String[] args) {
        int n = 15; // 15 adalah contoh dari soal

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print("OKYES ");
            } else if (i % 3 == 0) {
                System.out.print("OK ");
            } else if (i % 4 == 0) {
                System.out.print("YES ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
############################################################################
#####Soal no 2 Buatlah algoritma untuk membuat pola angka berikut ini sesuai dengan nilai n######
a. public class No2aAlgoritmaAngkaPiramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

b. public class No2bAlgoritmaAngkaPiramidberakhiran1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

c. public class No2cAlgoritmaAngkaBerurutanDepanBelakang{
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

d. public class No2dAlgoritmaAngkaMengular {
    public static void main(String[] args) {
        int n = 5; // Ukuran matriks
        int[][] matrix = new int[n][n];

        int num = 1;


        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = num++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
############################################################################

#####Soal no 3 buatlah alghoritma untuk membuang semua nilai dengan kelipatan 3 adan mengurutkan sisanya dalam array baru secara ascending #####

import java.util.Arrays;

public class No3AlgoritmaMenghilangkanKelipatan3 {
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

############################################################################

#####Soal no 4 Membuat SQL QUERY sesuai dengan gambar dan relasi#####

a. SELECT *
FROM barang
WHERE harga_satuan > 10000
ORDER BY harga_satuan ASC;

b. SELECT *
FROM pelanggan
WHERE nama LIKE '%g%' AND alamat = 'BANDUNG';

c. SELECT 
    t.KODE,
    t.TANGGAL,
    p.NAMA AS NAMA_PELANGGAN,
    b.NAMA AS NAMA_BARANG,
    t.JUMLAH_BARANG AS JUMLAH,
    b.HARGA_SATUAN,
    (t.JUMLAH_BARANG * b.HARGA_SATUAN) AS TOTAL
FROM 
    transaksi t
INNER JOIN pelanggan p ON t.KODE_PELANGGAN = p.KODE_PELANGGAN
INNER JOIN barang b ON t.KODE_BARANG = b.KODE_BARANG;

d. SELECT 
    p.NAMA AS NAMA_PELANGGAN,
    COUNT(*) AS JUMLAH,
    SUM(t.JUMLAH_BARANG * b.HARGA_SATUAN) AS TOTAL_HARGA
FROM 
    transaksi t
INNER JOIN pelanggan p ON t.KODE_PELANGGAN = p.KODE_PELANGGAN
INNER JOIN barang b ON t.KODE_BARANG = b.KODE_BARANG
GROUP BY p.NAMA;
