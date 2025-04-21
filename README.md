
# Student Attendance Portal

## Overview
The **Student Attendance Portal** is a Command-Line Interface (CLI) application written in **Java**, using the **Hibernate Framework** for **Object-Relational Mapping (ORM)**. This application is designed to manage student attendance records. It allows the user to store, retrieve, and manage attendance data for students across different courses and batches.

The project features two major batches: **Batch 2-3** and **Batch 2-4**, each having separate **Courses** and **Students** tables. The Hibernate framework is utilized for mapping these entities to a database, ensuring seamless data persistence.

---

## Features
- **Data Persistence:** Utilizes **Hibernate (JPA)** to store and retrieve student attendance data in a relational database.
- **Batch Management:** Supports **Batch 2-3** and **Batch 2-4** student and course management.
- **Student Attendance Records:** Allows adding, viewing, and searching student attendance based on roll number, date, and course.
- **Queries:** Provides functionality to query student attendance based on specific dates and roll numbers.
- **Menu Options:** Offers an interactive CLI menu for performing various tasks, such as adding attendance, viewing records, and searching data.

---

## Technologies Used
- **Java** - Programming language used for development.
- **Hibernate Framework (JPA)** - For Object-Relational Mapping and data persistence.
- **MySQL** -for storing attendance data.
- **Maven**  - For project dependency management.

---

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) version 8 or above.
- Hibernate and JDBC driver configured for your database.
- A MySQL  database setup.

### Steps
1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd Student-Attendance-Portal
   ```

2. **Set up Hibernate Configuration:**
   - Open the `hibernate.cfg.xml` file located in the **resources** folder.
   - Update the database connection details like `url`, `username`, and `password` to match your local database.

3. **Compile the project:**
   If using Maven:
   ```
   mvn clean install
   ```

   Or compile manually using **javac** and package the application into a JAR file.

4. **Run the Application:**
   Execute the `Main` class:
   ```
   java -cp <your-classpath> Main
   ```

---

## How to Use

### Main Menu
Upon starting the application, the user is presented with the following options:

1. **Add Student Attendance** - Add attendance records for students.
2. **Search Attendance** - Search attendance records by student roll number, date, or course.
3. **View All Students' Attendance on a Specific Date** - View the attendance of all students in a batch for a given date.
4. **Exit** - Exit the application.

### Example Usage:

1. **Add Attendance:**
   - Select the option to add student attendance.
   - Enter student roll number, course, and the date of attendance.
   
2. **Search Attendance:**
   - Select the option to search by roll number and date.
   - Enter the student’s roll number and the date to retrieve the records.

3. **View Attendance by Date:**
   - Select the option to view all students who attended a specific course on a given date.
   
---

## Database Structure
The database is structured into four main tables, divided by batches:
- **Batch 2-3 Courses**: Table for storing course information for Batch 2-3.
- **Batch 2-3 Students**: Table for storing student information for Batch 2-3.
- **Batch 2-4 Courses**: Table for storing course information for Batch 2-4.
- **Batch 2-4 Students**: Table for storing student information for Batch 2-4.

### Relationships:
- Each student is associated with multiple courses.
- Each course is associated with multiple students (many-to-many relationship).

---

## Classes Overview
1. **Main Class:**
   - The entry point of the application, responsible for initiating the menu and handling user input.

2. **Menu Utility Class:**
   - Handles menu navigation and function execution, including CRUD operations for managing student attendance.

3. **Student and Course Entities:**
   - These classes represent students and courses in each batch. They are mapped to the database using Hibernate ORM.

4. **Attendance Records:**
   - Stores attendance data for each student in a course on a specific date.

---

## Limitations and Future Improvements
- **Caching:** Although EhCache was not implemented, it could be added in the future to improve the performance of data retrieval operations.
- **GUI Support:** The application could be expanded to include a graphical user interface (GUI) for easier user interaction.
- **Database Schema:** The schema can be further optimized for scalability, and additional features like report generation can be added.

---

## Conclusion
The **Student Attendance Portal** is a robust CLI application for managing student attendance data efficiently. With Hibernate ORM and a relational database backend, it ensures seamless data storage, retrieval, and management of student attendance records. The project can be extended in the future to include additional features and performance enhancements.

---

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
