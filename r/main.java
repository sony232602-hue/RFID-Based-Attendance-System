import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AttendanceSystem system =
            new AttendanceSystem();

        Scanner scanner =
            new Scanner(System.in);

        // Sample students
        system.registerStudent(
            new Student(
                "A1B2C3D4",
                "23EC001",
                "Rahul",
                "ECE"
            )
        );

        system.registerStudent(
            new Student(
                "E5F6G7H8",
                "23EC002",
                "Priya",
                "ECE"
            )
        );

        system.registerStudent(
            new Student(
                "I9J0K1L2",
                "23EC003",
                "Arun",
                "ECE"
            )
        );

        int choice;

        System.out.println(
            "\n======================================"
        );

        System.out.println(
            "       RFID ATTENDANCE SYSTEM"
        );

        System.out.println(
            "======================================"
        );

        do {

            System.out.println(
                "\n------------- MENU -------------"
            );

            System.out.println(
                "1. Register Student"
            );

            System.out.println(
                "2. Scan RFID Card"
            );

            System.out.println(
                "3. Display Attendance"
            );

            System.out.println(
                "4. Exit"
            );

            System.out.println(
                "--------------------------------"
            );

            System.out.print(
                "Enter choice: "
            );

            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print(
                        "Enter RFID ID: "
                    );

                    String rfid =
                        scanner.nextLine();

                    System.out.print(
                        "Enter Roll Number: "
                    );

                    String roll =
                        scanner.nextLine();

                    System.out.print(
                        "Enter Name: "
                    );

                    String name =
                        scanner.nextLine();

                    System.out.print(
                        "Enter Branch: "
                    );

                    String branch =
                        scanner.nextLine();

                    system.registerStudent(
                        new Student(
                            rfid,
                            roll,
                            name,
                            branch
                        )
                    );

                    break;

                case 2:

                    System.out.print(
                        "\nScan RFID card / "
                        + "Enter RFID ID: "
                    );

                    String cardId =
                        scanner.nextLine();

                    system.markAttendance(
                        cardId
                    );

                    break;

                case 3:

                    system.displayAttendance();

                    break;

                case 4:

                    System.out.println(
                        "\nSystem shutting down..."
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice."
                    );
            }

        } while (choice != 4);

        scanner.close();
    }
}
