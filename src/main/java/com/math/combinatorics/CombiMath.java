package com.math.combinatorics;


public class CombiMath {

    /**
     * Факториал
     * Произведение всех натуральных чисел от 1 до n.
     *
     * @param num <= 20
     * @return long
     */
    public static long factorial(long num) {
        return ((num == 0) ? 1 : num * factorial(num - 1));
    }


    /**
     * Расчет количества всех возможных перестановок n членов.
     *
     * @param n <= 20
     * @return long
     */

    public static long numberOfPermutations(long n) {
        return factorial(n);
    }

    /**
     * Расчет всех возможных комбинайций, с помощью которых
     * можно выбрать m объектов из n объектов. (Без учета расположения объектов в выборке)
     * <p/>
     * Расчеты производятся путем сокращения дроби на максимальный факториал знаменателя ( (n-m)! или m! )
     * с целью экономии памяти во время промежуточных расчетов.
     * <p/>
     * Результаты вычислений симметричны относительно наибольшего значения. Т.е. при одинаковых n
     * результаты вычислений для m=1 и m=n-1 равны. Результат вычисления, при m максимально приближенном к n/2
     * - наибольший результат для данного множества.
     *
     * @param n <= 29
     * @param m <= n
     * @return long
     */

    public static long numberOfCombinations(long n, long m) {
        // Определяем наибольший факториал знаменателя
        if (m <= n - m) { // наибольший факториал = (n-m)
            long numerator = (n - m) + 1; // переменная для расчета числителя
            int temp = (int) (n - m) + 1; // временная переменная для умножения в числителе
            int count = (int) m - 1;
            for (int i = 0; i < count; i++) {
                numerator *= ++temp;
            }
            // числитель, сокращенный до вида a * (a+1) * (a+2) * ... * (a+k), где k = m
            // делим на оставшийся знаменатель m!
            return numerator / factorial(m);
        }
        // Выполняются те же действия, что и для предыдущего условия
        else if (m > n - m) { //наибольший факториал = m
            long numerator = m + 1;
            int temp = (int) m + 1;
            int count = (int) (n - m) - 1;

            for (int i = 0; i < count; i++) {
                numerator *= ++temp;
            }

            return numerator / factorial(n - m);
        }
        return 0;
    }

    /**
     * Расчет всех возможных комбинайций, с помощью которых
     * можно выбрать m объектов из n объектов, учитывая расположения объектов в выборке.
     * <p/>
     * Расчет производится так же как и без учёта расположения в выборке и
     * результат умножается на m!(все возможные расположения обьектов в выборке).
     *
     * @param n <= 28
     * @param m <= n
     * @return long
     */

    public static long numberOfPlacements(long n, long m) {
        return numberOfCombinations(n, m) * factorial(m);
    }

}
