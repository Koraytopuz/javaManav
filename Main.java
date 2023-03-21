import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,total;

        Scanner inp=new Scanner(System.in);
        System.out.println("Armut kaç kilo?: ");
        armut= inp.nextDouble();
        System.out.println("Elma kaç kilo?: ");
        elma= inp.nextDouble();
        System.out.println("Domates kaç kilo?: ");
        domates= inp.nextDouble();
        System.out.println("Muz kaç kilo?: ");
        muz= inp.nextDouble();
        System.out.println("Patlıcan kaç kilo?: ");
        patlican= inp.nextDouble();
        armut=2.14*armut;
        elma=3.67*elma;
        domates=1.11*domates;
        muz=0.95*muz;
        patlican=5.00*patlican;
        total=armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar: "+total+"TL");
    }
}