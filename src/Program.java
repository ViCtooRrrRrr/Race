import java.util.Scanner;
public class Program {
    static SomeThing mThing;
    public static void main(String[] args) {
        mThing = new SomeThing();
        System.out.println("Выберите надежного букмекера \n1.MellBet \n2.WilliamHill");
        Scanner scan12 = new Scanner(System.in);
        Integer ВыборКонторы = scan12.nextInt();
        System.out.println(" Сумма ставки");
        Scanner scan = new Scanner(System.in);
        Integer ставкаБудет = scan.nextInt();
        System.out.println("Выберите лошадь 1 или 2");
        Scanner scanner = new Scanner(System.in);
        Integer какаяЛошадь = scan.nextInt();
        int лошадь1 =1;
        int лошадь2 =1;
        long растояниеЗаОдинШаг = (long) (21 + Math.random() * 40);
        long растояниеЗаОдинШаг2 = (long) (21 + Math.random() * 40);
        while (лошадь1<1000){
            лошадь1+=растояниеЗаОдинШаг;
        }
        while (лошадь2<1000){
            лошадь2+=растояниеЗаОдинШаг2;
        }
        if (растояниеЗаОдинШаг<растояниеЗаОдинШаг2){
            System.out.println(" Вторая Лошадь победила");
            System.out.println();
        }
        else if (растояниеЗаОдинШаг>растояниеЗаОдинШаг2){
            System.out.println("Первая Лошадь победила");
            System.out.println();
        }
        else {
            System.out.println("Ничья");
            System.out.println();
        }
        mThing.start();
    }
}

