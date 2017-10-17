package com.example.victor.fractioncalculator;

/**
 * Created by victor on 26.10.16.
 */

public class Fraction {

    private int numenator;
    private int denumenator;


    public Fraction () {
        numenator = 0;
        denumenator = 1;
    }

    public Fraction (int n, int d) {
        numenator = n;
        denumenator = d;
    }

    public Fraction (Fraction f) {
        numenator = f.numenator;
        denumenator = f.denumenator;
    }


    public int getInt () {
        return numenator / denumenator;
    }
    public Fraction add (Fraction f){
        Fraction result = new Fraction();
        Fraction f3 = new Fraction(this.numenator * f3.denumenator);
        Fraction f1 = new Fraction(this.numenator + f1.numenator) + f1.denumenator);
        Fraction f2 = new Fraction(this.denumenator * this.denumenato);
        return;
    }

    public Fraction add (Fraction f) {
        Fraction result = new Fraction(); // объект Fraction в которую запишем результат суммы
        Fraction f1 = new Fraction(this); // так как дроби возможно придется приводить к общему знаменателю
        Fraction f2 = new Fraction(f);    // создаем два локальных объекта Fraction, чтобы можно было их изменять
        if (!(f1.denumenator == f2.denumenator)) { // если знаменатели не равны, значит нужно привести к общему
            int common = findCommonDenomenator(this.denumenator, f.denumenator); // находим общий знаменатель
            f1.fetchToDenominator(common);   // приводим первую дробь к общему знаменателю
            f2.fetchToDenominator(common);      // приводим вторую дробь к общему знаменателю
        }
        result.numenator = f1.numenator + f2.numenator; // вычисляем числитель
        result.denumenator = f1.denumenator;           // вычисляем знаменатель

        return result;
    }

    public String getString() {
        return numenator + "/" + denumenator;
    }

    /*Метод который приводит дробь к новому знаменателю
    * */
    private void fetchToDenominator(int common) {
        numenator = numenator * common / denumenator;
        denumenator = common;
    }

    /*метод находит наименьший общий делитель для двух знаменателей*/
    private int findCommonDenomenator(int d1, int d2) {
        int factor = d1;
        while ((d1 % d2) != 0)
            d1 += factor;
        return d1;
    }

}
