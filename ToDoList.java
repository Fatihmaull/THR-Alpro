import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("===== APLIKASI TO-DO LIST =====");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tampilkan Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    showTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }

        System.out.println("Terima kasih telah menggunakan aplikasi To-Do List.");
        scanner.close();
    }

    private static void addTask() {
        System.out.print("Masukkan nama tugas: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Tugas \"" + task + "\" telah ditambahkan.");
    }

    private static void showTasks() {
        System.out.println("Daftar Tugas:");
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas untuk dihapus.");
            return;
        }

        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (index < 1 || index > tasks.size()) {
            System.out.println("Nomor tugas tidak valid.");
            return;
        }

        String removedTask = tasks.remove(index - 1);
        System.out.println("Tugas \"" + removedTask + "\" telah dihapus.");
    }
}
