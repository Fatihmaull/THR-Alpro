using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Program Menghitung Luas dan Keliling Lingkaran");

        double jariJari;
        do
        {
            Console.Write("Masukkan panjang jari-jari lingkaran (dalam satuan meter): ");
        } while (!double.TryParse(Console.ReadLine(), out jariJari) || jariJari <= 0);

        double luas = HitungLuasLingkaran(jariJari);
        double keliling = HitungKelilingLingkaran(jariJari);

        Console.WriteLine($"Luas lingkaran dengan jari-jari {jariJari} meter adalah {luas} satuan persegi.");
        Console.WriteLine($"Keliling lingkaran dengan jari-jari {jariJari} meter adalah {keliling} satuan.");

        Console.WriteLine("Program selesai. Tekan tombol apa pun untuk keluar.");
        Console.ReadKey();
    }

    static double HitungLuasLingkaran(double jariJari)
    {
        return Math.PI * jariJari * jariJari;
    }

    static double HitungKelilingLingkaran(double jariJari)
    {
        return 2 * Math.PI * jariJari;
    }
}
