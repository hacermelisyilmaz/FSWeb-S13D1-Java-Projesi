public class Main {
        public static void main(String[] args) {
            /* Havlayan Köpeğimiz */
            System.out.println("Havlayan Köpeğimiz:");
            System.out.println(shouldWakeUp(true, 1));
            System.out.println(shouldWakeUp(false, 2));
            System.out.println(shouldWakeUp(true, 8));
            System.out.println(shouldWakeUp(true, -1));
            System.out.println("----------");

            /* Yaş Tespiti */
            System.out.println("Yaş Tespiti:");
            System.out.println(hasTeen(9, 99, 19));
            System.out.println(hasTeen(23, 15, 42));
            System.out.println(hasTeen(22, 23, 34));
            System.out.println("----------");

            /* Oyuncu Kedi */
            System.out.println("Oyuncu Kedi:");
            System.out.println(isCatPlaying(true, 10));
            System.out.println(isCatPlaying(false, 36));
            System.out.println(isCatPlaying(false, 35));
            System.out.println(isCatPlaying(true, 36));
            System.out.println("----------");

            /* Alan Hesaplama */
            System.out.println("Dikdörtgen Alan Hesaplama:");
            System.out.println(area(5.0, 4.0));
            System.out.println(area(-1.0, 4.0));

            System.out.println("Daire Alan Hesaplama:");
            System.out.println(area(5.0));
            System.out.println(area(-1.0));
        }
        public static boolean shouldWakeUp(boolean isBarking, int time) {
            if (time < 0 || time > 23) return false;
            return isBarking && (time < 8 || time > 20);
        }

        public static boolean hasTeen(int... ages) {
            for(int age: ages) {
                if (age <= 19 && age >= 13) {
                    return true;
                }
            }
            return false;
        }

        public static boolean isCatPlaying(boolean isSummer, int temp) {
            int upperLimitAdd = 0;
            if (isSummer) upperLimitAdd = 10;

            return temp <= 35 + upperLimitAdd && temp >= 25;
        }

        public static double area(double length1, double length2) {
            if (length1 < 0 || length2 < 0) return -1;
            return length1 * length2;
        }
        public static double area(double radius) {
            if (radius < 0) return -1;
            return radius * radius * Math.PI;
        }
}