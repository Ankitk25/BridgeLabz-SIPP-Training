import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicPlaylist myPlaylist = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("🎵 Welcome to the Music Playlist 🎵");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Song");
            System.out.println("2. Play Next Song");
            System.out.println("3. Remove Song");
            System.out.println("4. Show Playlist");
            System.out.println("5. Quit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after int

            switch (choice) {
                case 1:
                    System.out.print("Enter song name to add: ");
                    String songToAdd = scanner.nextLine();
                    myPlaylist.addSong(songToAdd);
                    break;

                case 2:
                    myPlaylist.playNext();
                    break;

                case 3:
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    myPlaylist.removeSong(songToRemove);
                    break;

                case 4:
                    myPlaylist.showPlaylist();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting... 🎧 Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1–5.");
            }
        }

        scanner.close();
    }
}
