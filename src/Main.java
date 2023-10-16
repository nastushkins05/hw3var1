public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        System.out.println();
        System.out.println("Number 2");
        int tempa = 4;
        if (tempa < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println();
        System.out.println("Number 3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " +speed+ " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " +speed+ " то можно ездить спокойно");
        }

        System.out.println();
        System.out.println("Number 4");
        int age1 = 16;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("детсад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("школа");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("универ");
        }
        if (age1 >= 24) {
            System.out.println("работа");
        }

        System.out.println();
        System.out.println("Number 5");
        int age2 = 11;
        if (age2 <= 5) {
            System.out.println("Если возраст ребенка равен " +age2+" нельзя кататься");
        }
        if (age2 > 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " +age2+ " только с сопровождением");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " может без сопровождения");
        }

        System.out.println();
        System.out.println("Number 6");
        int seats = 60;
        int totalseats = 102;
        int n = 45;
        if (n > totalseats) {
            System.out.println("Мест нет");
        } else {
            if (n < seats) {
                System.out.println("Есть сидячее");
            } else {
                System.out.println("Есть стоящее");

            }
        }

        System.out.println();
        System.out.println("Number 7");
        int one = 124;
        int two = 536;
        int three = -1;
        int max;
        if (one < two ) {
            max = two;
        } else {
            max = one;
        }
        if (max > three) {
            System.out.println("Наибольшее число " + max);
        } else {
            System.out.println("Наибольшее число "+three);
        }



    }
}