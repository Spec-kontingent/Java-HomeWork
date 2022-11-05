public class dz4 {
    public static void main(String[] args) {
int year=2023;
if (year<=0) {System.out.println("Год введен неверно");}
       else if (year%4==0&year%100==0&year%400>0) {System.out.println(year + " год не високосный и содержит 365 дней"); }
       else if (year%4==0) {System.out.println(year+" год високосный и содержит 366 дней");}
       else {System.out.println(year + " год не високосный и содержит 365 дней");}
}}
