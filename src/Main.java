import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир! ");
        task1();
        task2();
        task3();
        task4();



    }

    private static void task4() {
        System.out.println(" Задача 3 ");
        String fullName = "Иванов Семён Семёнович";
        String rep =  fullName.replace('ё', 'e');
        System.out.println(rep);
    }

    private static void task3() {
        System.out.println(" Задача 2 ");
        String  firstName = "Ivan" ;
        String middleName =  "Ivanovich";
        String lastName = "Ivanov" ;
        String fullName = String.format("Данные ФИО сотрудника для заполнения отчета — %s %s %s", lastName, firstName, middleName );
        System.out.println(fullName);



    }

    private static void task2() {
        System.out.println( "Задача 1");
        String  firstName = "Ivan" ;
        String middleName =  "Ivanovich";
        String lastName = "Ivanov" ;
        String  fullName = "ФИО сотрудника —" + lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);


    }

    private static void task1() {
        System.out.println( " Урок  ");
        String phone = "+919-586-37-72";
        phone =phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone =phone.replace("+","");
        if (phone.length()==10) {
//            phone = '7' + phone;
        }else  if (phone.length()>11) {
            throw new RuntimeException(" Телефон слишком длиный ");
        }else if (phone.length()<10){
            throw new RuntimeException(" телефон слишком кородкий ");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас постороний!");

        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79195863772";
        if (phone.equals(expectedPhone)) {
            System.out.println(" Успех ");
        } else {
            System.out.println(" неудача ");
        }

    }
}