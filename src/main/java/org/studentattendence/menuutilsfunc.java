package org.studentattendence;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.studentattendence.dbtables.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.studentattendence.Main.*;

public class menuutilsfunc
{
    public static void OS()
    {
        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert23("Operating Systems");
                break;
                case 2:
                    get23("Operating Systems");
                    OS();
                    break;
            case 3:
                menu23();
        }
    }
    public static void CS()
    {
        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert23("Communication Skills");
                break;
            case 2:
                get23("Communication Skills");
                break;
            case 3:
                menu23();
        }
    }
    public static void SDA()
    {
        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert23("Software Design & Architecture");
                break;
            case 2:
                get23("Software Design & Architecture");
                break;
            case 3:
                menu23();
        }

    }
    public static void DWH()
    {
        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert23("Data Warehousing");
                break;
            case 2:
                get23("Data Warehousing");
                break;
            case 3:
                menu23();
        }
    }
    public static void CN()
    {
        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert23("Commputer Networks");
                break;
            case 2:
                get23("Computer Networks");
                break;
            case 3:
                menu23();
        }

    }
    public static void FE()
    {

        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert24("Functional English");
                break;
            case 2:
                get24("Functional English");
                FE();
                break;
            case 3:
                menu24();
        }
    }
    public static void PF()
    {

        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert24("Programming Fundamentals");
                break;
            case 2:
                get24("Programming Fundamentals");
                PF();
                break;
            case 3:
                menu24();
        }
    }
    public static void AC()
    {

        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert24("Applied Calculus");
                break;
            case 2:
                get24("Applied Calculus");
                AC();
                break;
            case 3:
                menu24();
        }
    }
    public static void PY()
    {

        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert24("Physics");
                break;
            case 2:
                get24("Physics");
                PY();
                break;
            case 3:
                menu24();
        }
    }
    public static void IICT()
    {

        System.out.print("\t\t\t 1. Mark Attendence\n");
        System.out.print("\t\t\t 2. Get Student Attendence for Specific Date\n");
        System.out.print("\t\t\t 3. Go Back to Subject Menu\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1:
                insert24("Intro to Info & Comm Technologies");
                break;
            case 2:
                get24("Intro to Info & Comm Technologies");
                IICT();
                break;
            case 3:
                menu24();
        }
    }
    public static void insert23(String coursename)
    {
        courseID cid= new courseID();
        System.out.println("Enter the date you are marking the Attendence in format(YYYY-MM-DD)");
        String date= Main.scanner.nextLine();
        LocalDate ciddate= LocalDate.parse(date);
        cid.setDate(ciddate);
        cid.setCourseName(coursename);
        Batch_23Courses c= new Batch_23Courses();
        c.setCourse(cid);
        System.out.println("Enter the Roll Numbers of the Students you want to Mark:");
        String stdrolls=Main.scanner.nextLine();
        String[] rolls=stdrolls.split(",");
        List<Batch_23Students> sdlist= new ArrayList<Batch_23Students>();
        for(String roll:rolls)
        {
            Batch_23Students temp= new Batch_23Students();
            temp.setStudent_id(roll);
            temp.setCourse23(c);
            sdlist.add(temp);
        }
        c.setSd(sdlist);
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.persist(c);
        for(Batch_23Students sd:sdlist)
            session.saveOrUpdate(sd);
        session.getTransaction().commit();
        System.out.println("Reached Success");
        globalmenu()
        ;
    }
    public static void insert24(String coursename)
    {

        courseID cid= new courseID();
        System.out.println("Enter the date you are marking the Attendence in format(YYYY-MM-DD)");
        String date= Main.scanner.nextLine();
        LocalDate ciddate= LocalDate.parse(date);
        cid.setDate(ciddate);
        cid.setCourseName(coursename);
        Batch_24Courses c= new Batch_24Courses();
        c.setCourse(cid);
        System.out.println("Enter the Roll Numbers of the Students you want to Mark:");
        String stdrolls=Main.scanner.nextLine();
        String[] rolls=stdrolls.split(",");
        List<Batch_24Students> sdlist= new ArrayList<Batch_24Students>();
        for(String roll:rolls)
        {
            Batch_24Students temp= new Batch_24Students();
            temp.setStudent_id(roll);
            temp.setCourse24(c);
            sdlist.add(temp);
        }
        c.setSd(sdlist);
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.persist(c);
        for(Batch_24Students sd:sdlist)
            session.saveOrUpdate(sd);
        session.getTransaction().commit();
        System.out.println("Reached Success");
        globalmenu()
        ;

    }
    public static void get23(String coursename)
    {
        System.out.print("\t\t\t1.Fetch Students List for an Specific Date\n");
        System.out.print("\t\t\t2.Fetch Attendence Dates of an Student\n");
        System.out.print("\t\t\t3.Go Back\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice) 
        {
            case 1:
                getstudentlist(coursename," batch_23students"," course23_date"," course23_CourseName");
                get23(coursename);
                break;
            case 2:
                getattendencelist(coursename,"batch_23students","course23_CourseName");
                get23(coursename);
                break;
                case 3:
                    return;

        }
        

    }

    private static void getstudentlist(String coursename,String studenttablename,String coursetabledate,String coursetable_coursename)
    {
        if(studenttablename.equals(" batch_23students"))
        {

            System.out.println("Enter the Date in the format YYYY-MM-DD");
            String date= Main.scanner.nextLine();
            LocalDate ciddate= LocalDate.parse(date);
            Session session=sessionFactory.openSession();
            NativeQuery q= session.createNativeQuery("select * from student_attendence."+studenttablename+" where"+coursetable_coursename+" ='"+coursename+"' and"+coursetabledate+"='"+ciddate+"'");
            q.addEntity(Batch_23Students.class);
            q.setCacheable(true);
            List<Batch_23Students> list23=q.list();
            String sb = "";
            for(Batch_23Students row:list23)
            {
                System.out.println(row.getStudent_id()+" "+row.getCourse23().getCourse().getCourseName());
            }
            System.out.println(sb);
            return;
        }
        else if (studenttablename.equals(" batch_24students"))
        {

            System.out.println("Enter the Date in the format YYYY-MM-DD");
            String date= Main.scanner.nextLine();
            LocalDate ciddate= LocalDate.parse(date);
            Session session=sessionFactory.openSession();
            NativeQuery q= session.createNativeQuery("select * from student_attendence."+studenttablename+" where"+coursetable_coursename+" ='"+coursename+"' and"+coursetabledate+"='"+ciddate+"'");
            q.addEntity(Batch_24Students.class);
            q.setCacheable(true);
            List<Batch_24Students> list23=q.list();
            StringBuilder sb= new StringBuilder();
            for(Batch_24Students row:list23)
            {
                System.out.println(row.getStudent_id());
            }
            System.out.println(sb);
            return;
        }
        else
            System.err.println("Something went wrong");
    }

    private static void getattendencelist(String coursename,String studenttablename,String coursetable_coursename)
    {
        if(studenttablename.equals("batch_23students"))
        {
            System.out.println("Enter the Student roll number in format (23SW01) :");
            String roll= Main.scanner.nextLine();
            Session session=sessionFactory.openSession();
            NativeQuery query= session.createNativeQuery("select * from student_attendence."+studenttablename+" where student_id='"+roll+"'");
            query.addEntity(Batch_23Students.class);
            query.setCacheable(true);
            List<Batch_23Students> list23=query.list();
            for(Batch_23Students row:list23)
            {
                System.out.println(row.getCourse23().getCourse().getDate()+" "+row.getCourse23().getCourse().getCourseName());
            }
            return;
        }
        else if (studenttablename.equals("batch_24students"))
        {
            System.out.println("Enter the Student roll number in format (24SW01) :");
            String roll= Main.scanner.nextLine();
            Session session=sessionFactory.openSession();
            NativeQuery query= session.createNativeQuery("select * from student_attendence."+studenttablename+" where student_id='"+roll+"' and "+coursetable_coursename+" ='"+coursename+"'");
            query.setCacheable(true);
            query.addEntity(Batch_24Students.class);
            List<Batch_24Students> list24=query.list();
            for(Batch_24Students row:list24)
            {
                System.out.println(row.getCourse24().getCourse().getDate());
            }
            return;
        }
        else
            System.err.println("Something bad happened");

        
    }

    public static void get24(String coursename)
    {
        System.out.print("\t\t\t1.Fetch Students List for an Specific Date\n");
        System.out.print("\t\t\t2.Fetch Attendence Dates of an Student\n");
        System.out.print("\t\t\t3.Go Back\n");
        int choice= Main.scanner.nextInt();
        scanner.nextLine();
        switch(choice)
        {
            case 1:
                getstudentlist(coursename," batch_24students"," course24_date"," course24_CourseName");
                get24(coursename);
                break;
            case 2:
                getattendencelist(coursename,"batch_24students","course24_CourseName");
                get24(coursename);
                break;
            case 3:
                return;

        }
    }
}
