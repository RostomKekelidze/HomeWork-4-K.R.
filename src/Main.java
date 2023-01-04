public class Main {
    public static void main(String[] args) {

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен," + age + "то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен," + age + "то он не достиг совершеннолетия, нужно немного подождать");
        }

        int degrees = 5;
        if (degrees >= 5) {
            System.out.println("На улице" + degrees + "градусов,можно идти без шапки");
        } else {
            System.out.println("На улице" + degrees + "градусов,нужно надеть шапку");
        }

        int speed = 60;
        if (speed >= 60) {
            System.out.println("Если скорость" + speed + ",то придеться заплатить штраф");
        } else {
            System.out.println("Если скорость" + speed + ",то можно ездить спокойно");

        }
        int human = 20;

        if (human >= 2 && human <= 6) {
            ;
            System.out.println("Если возраст человека равен" + human + "то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека равен" + human + "то ему не нужно ходить в детский сад");
        }
        if (human >= 7 && human <= 18) {
            ;
            System.out.println("Если возраст человека равен" + human + "то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека равен" + human + "то ему не нужно ходить в школу");
        }
        if (human >= 18 && human < 24) {
            ;
            System.out.println("Если возраст человека равен" + human + "то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен" + human + "то ему не нужно ходить в университет");
        }
        if (human >= 24) ;
        System.out.println("Если возраст человека равен" + human + "то ему пора ходить на работу");


        int kidAge = 6;
        if (kidAge < 5) {
            System.out.println
                    ("Если возраст ребенка равен" + kidAge + "то он  может кататься на аттракционе");
        } else if (kidAge < 14) {
            System.out.println(
                    "Если возраст ребенка равен" + kidAge
                            + "то он  может кататься в cопровождении взрослых");
    } else {
        System.out.println(
                "Если возраст ребенка равен"
                        + kidAge
                        + "то он  может кататься без cопровождении взрослых");
             }
        int totalCapacity = 102;
        int seatCapasity =60;
        int currentPersonns = 32;
        if (totalCapacity == currentPersonns) {
            System.out.println("Свободных мест нет");
        } else {
            if (currentPersonns >= seatCapasity) {
                System.out.println("Есть только стоячие места");
            }else{
                System.out.println("Есть сидячие места");
            }
            int one = 1;
            int two = 2;
            int three = 3;

            if (one> two) {
                if (one > three) {
                    System.out.println(one);
                } else {
                    System.out.println(three);
                }
            } else {
                if (two >three) {
                    System.out.println(two);
                }else{
                    System.out.println(three);


                }
            }
        }

         }
    }