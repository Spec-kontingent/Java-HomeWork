public class dz5 {
    public static void main(String[] args) {
int N=2;
double  A=-34;
double  B=60.5;
if (B!=0) {
switch (N){
    case 1: System.out.println(A+B);
        break;
    case 2: System.out.println(A-B);
        break;
    case 3: System.out.println(A*B);
        break;
    case 4: System.out.println(A/B);
        break;
    default:System.out.println("Число N не находится в диапазоне между 1 и 4");
}}
else {System.out.println("Число В не может равняться нулю");}
}
}
