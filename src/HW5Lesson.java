
/**
 * Java Level 1. Lesson 5.
 *
 * @author  Aleksander Kyurkchu
 * @version dated 26 Sep 2018
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HW5Lesson {

   static Person[] persArray = new Person[5];

    public static void main(String[] args) {

         setPerson(persArray);
         getDaten(persArray);
    }

    public static void setPerson( Person[] persArrayv) {

        persArrayv[0] = new Person("Ivanov Ivan", "Engineer1", " ivivan1@mailbox.com ", "892312312", 35000,
                30);
        persArrayv[1] = new Person("Petrov Petr", "Engineer2", " ivivan2@mailbox.com ", "892312316", 36000,
                45);
        persArrayv[2] = new Person("Kozlov Stepan", "Engineer3", " ivivan3@mailbox.com ", "892312317", 37000,
                60);
        persArrayv[3] = new Person("Suprin  Andrei", "Engineer4", " ivivan4@mailbox.com ", "892312318", 38000,
                52);
        persArrayv[4] = new Person("Kapustin  Oleg","Engineer4", " ivivan5@mailbox.com ", "892312319", 39000,
                30);
    }

     public static void getDaten(Person [] persArrayv){

         for(int i =0 ; i < persArrayv.length; i++){

          if (persArrayv[i].age > 40) System . out . println ( "Name:" + persArrayv[i].getName() + "  Position:" + persArrayv[i].getPosition() + "  Email:" + persArrayv[i].getEmail()
                                    + " Telephon:" + persArrayv[i].getTelephonnum() + " Salary:" + persArrayv[i].getSalary() + " Age:" + persArrayv[i].getAge() );

       }

   }
  // not used
   public static Person readFromFile(Person [] persArrayv) {

       Person person = new Person(null,null,null,null,0,0);

       try {
           File file = new File("D:/Lesson_5/file.txt");
           //создаем объект FileReader для объекта File
           FileReader fr = new FileReader(file);
           //создаем BufferedReader с существующего FileReader для построчного считывания
           BufferedReader reader = new BufferedReader(fr);
           // считаем сначала первую строку
           String line = reader.readLine();

           while (line != null) {
               System.out.println(line);
               // считываем остальные строки в цикл
               line = reader.readLine();
           }

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return person;
   }

    // class Person
    public static class Person {
        private String name;
        private String position;
        private String email;
        private String telephonnum;
        private int salary;
        private int age;

        // constructor
        public Person(String name, String position,String email, String telephonnum, int salary, int age) {
            this.name = name;
            this.position = position;
            this.telephonnum = telephonnum;
            this.email = email;
            this.salary = salary;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public String getTelephonnum() {
            return telephonnum;
        }

        public void setTelephonnum(String telephonnum) {
            this.telephonnum = telephonnum;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

}