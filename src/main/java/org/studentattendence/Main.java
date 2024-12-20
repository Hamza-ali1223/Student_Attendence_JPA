package org.studentattendence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.studentattendence.dbtables.*;

import java.io.File;
import java.util.Scanner;

import static org.studentattendence.menuutilsfunc.*;

public class Main
{
    static Configuration cfg;
    static ServiceRegistry reg;
    static SessionFactory sessionFactory;
    static Scanner scanner= new Scanner(System.in);
    public static void connect()
    {
        cfg = new Configuration().configure(new File("src/main/resources/hibernate.cfg.xml"));
        cfg.addAnnotatedClass(Batch_23Courses.class);
        cfg.addAnnotatedClass(Batch_23Students.class);
        cfg.addAnnotatedClass(Batch_24Students.class);
        cfg.addAnnotatedClass(Batch_24Courses.class);
        reg= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        sessionFactory = cfg.buildSessionFactory();

    }
    public static void globalmenu()
    {
        System.out.print("\t\t\tFollowing Batches Attendence can be Marked:\n1.24-Batch\n2.23-Batch\n3.Exit\n\nEnter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
        case 1:
            menu24();
            break;
        case 2:
            menu23();
            break;
            case 3:
                sessionFactory.close();
                System.out.println("Byeeeeeee");
                System.exit(0);
                break;
        }


    }
    public static void menu23()
    {
        System.out.print("\t\t\t1. Add or remove OS Attendence\n");
        System.out.print("\t\t\t2. Add or remove Communication Skills Attendence\n");
        System.out.print("\t\t\t3. Add or remove Software Design Attendence\n");
        System.out.print("\t\t\t4. Add or remove Data_warehousing Attendence\n");
        System.out.print("\t\t\t5. Add or remove Computer Networks Attendence\n");
        System.out.print("\t\t\t6. Close\n");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                OS();
                break;
            case 2:
                CS();
                break;
            case 3:
                SDA();
                break;
            case 4:
                DWH();
                break;
            case 5:
                CN();
                break;
            case 6:
            {
                globalmenu();
            }
        }

    }
    public static void menu24()
    {
        System.out.print("\t\t\t1. Mark Attendence for Functional English\n");
        System.out.print("\t\t\t2. Mark Attendence for Programming Fundamentals\n");
        System.out.print("\t\t\t3. Mark Attendence for Applied Calculus\n");
        System.out.print("\t\t\t4. Mark Attendence for Physics\n");
        System.out.print("\t\t\t5. Mark Attendence for Intro to info & comm technologies\n");
        System.out.print("\t\t\t6. Return to Gloabl Menu\n");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice)
        {
            case 1:
                FE();
                break;
                case 2:
                    PF();
                    break;
            case 3:
                AC();
                break;
                case 4:
                    PY();
                    break;
                    case 5:
                        IICT();
                        break;
                        case 6:
                            globalmenu();
                            break;
        }
    }


    public static void main(String[] args)
    {
        connect();
        System.out.print("\t\t\tWelcome to Student Attendence Portal\n");
        System.out.print("\t\t\t------------------------------------\n");
        System.out.print("\t\t\t Note. Always First Connect Db to Program\n");
        System.out.print("\t\t\t Connecting the Database:Student_Attendence\n");
        globalmenu();
    }
}