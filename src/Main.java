import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b=0,c;
        System.out.print("Bir sayı giriniz: ");
        a = sc.nextInt();
        for(int i=1;i<a;i++){
            if(a%i==0){
                b +=i;
            }
        }
        if(b==a){
            System.out.print(a+" Sayısı mükemmel sayıdır!");
        }
        else{
            System.out.print(a+" Sayısı mükemmel sayı değildir!");
        }
    }
}