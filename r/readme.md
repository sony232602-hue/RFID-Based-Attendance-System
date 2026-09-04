RFID-Based Attendance System
📌 Overview

The RFID-Based Attendance System is an embedded and Java-based attendance management project designed to automate student attendance.

An RFID card is assigned to each student. When the student scans the RFID card using an RFID reader, the RFID ID is sent to the controller. The system identifies the student and records attendance.

The project can be implemented as a software simulation or extended into a real hardware prototype using Arduino/ESP32 and an MFRC522 RFID reader.

🎯 Objectives
Automate classroom attendance.
Reduce manual attendance work.
Identify students using RFID cards.
Record attendance with date and time.
Prevent duplicate attendance.
Reject unknown RFID cards.
Provide an attendance report.
Demonstrate integration between electronics hardware and Java software.
🛠️ Technologies Used
Software
Java
JDK 17+
JUnit 5
Object-Oriented Programming
Git
GitHub
Hardware
Arduino Uno / ESP32
MFRC522 RFID Reader
RFID Cards/Tags
USB cable
Computer
✨ Features
RFID-based student identification
Student registration
Automatic attendance marking
Date and time recording
Duplicate attendance prevention
Unknown-card detection
Attendance report
Java simulation
JUnit testing
Arduino RFID interface
📂 Project Structure
RFID-Attendance-System/
│
├── arduino/
│   └── rfid_attendance.ino
│
├── java/
│   ├── Main.java
│   ├── Student.java
│   ├── Attendance.java
│   └── AttendanceSystem.java
│
├── test/
│   └── AttendanceSystemTest.java
│
├── README.md
└── screenshots/

🔌 Hardware Architecture
       RFID Card
           │
           ▼
    ┌──────────────┐
    │ RFID Reader  │
    │   MFRC522    │
    └──────┬───────┘
           │
           ▼
    ┌──────────────┐
    │ Arduino/ESP32│
    └──────┬───────┘
           │
       Serial/Wi-Fi
           │
           ▼
    ┌──────────────┐
    │ Java Program │
    └──────┬───────┘
           │
           ▼
    Attendance Record

🔄 Working Principle
START
  ↓
Initialize RFID Reader
  ↓
Student Scans RFID Card
  ↓
Read RFID UID
  ↓
Send UID to Controller
  ↓
Java Receives RFID ID
  ↓
Search Student Database
  ↓
Student Found?
 ┌──────────────┐
 │              │
NO             YES
 │              │
 ▼              ▼
Reject       Check Attendance
Card             │
                 ▼
          Already Marked?
          ┌──────┴──────┐
         YES           NO
          │             │
          ▼             ▼
       Reject       Mark PRESENT
                        │
                        ▼
                  Store Date/Time
                        │
                        ▼
                       END

🧠 Java Concepts Used
Encapsulation

Student and attendance information is stored using private fields.

Abstraction

The attendance system hides the internal process of finding students and recording attendance.

Classes and Objects

Separate classes are used for:

Student
Attendance
AttendanceSystem
Main
Collections

ArrayList is used to store students and attendance records.

🔐 Security Features

The system checks whether the scanned RFID card is registered.

Unknown cards are rejected:

RFID → Search Student → Not Found → Access Rejected


The system also prevents the same student from being marked multiple times during the attendance session.

🧪 Testing

JUnit 5 tests include:

Student registration
Valid RFID detection
Invalid RFID detection
Duplicate attendance
Attendance count

Expected result:

Tests run: 5
Failures: 0
Errors: 0
BUILD SUCCESSFUL

▶️ Run Java Simulation

Compile:

javac *.java


Run:

java Main

🔧 Hardware Setup

For the physical prototype:

Connect the MFRC522 RFID reader to Arduino.
Upload rfid_attendance.ino.
Open the Serial Monitor.
Scan an RFID card.
Note the RFID UID.
Register the UID in the Java application.
Scan the card again.
The Java system marks the student's attendance.
🚀 Future Enhancements
MySQL database
Java Swing/JavaFX dashboard
ESP32 Wi-Fi communication
Web-based attendance dashboard
Faculty login
Student login
Monthly attendance reports
PDF report generation
Email notifications
Cloud database
Multiple classroom support
Automatic percentage calculation
Face recognition integration
OLED/LCD display
Buzzer for successful card scanning
🎓 Academic Information

Project: RFID-Based Attendance System
Course: B.Tech – Electronics and Communication Engineering
Year: 3rd Year
Domain: Embedded Systems + IoT + Java
Project Type: Mini Project

⚠️ Disclaimer

This project is intended for educational purposes. The software simulation does not itself provide a production-grade attendance or access-control system.