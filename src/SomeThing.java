import java.util.Scanner;
class SomeThing extends Thread{
    @Override
    public void run() {
        System.out.println("Выберите надежного букмекера \n1.Фаворит Спорт \n2.Париматч");
        Scanner scan12 = new Scanner(System.in);
        Integer ВыборКонторы = scan12.nextInt();
        System.out.println(" Сумма ставки");
        Scanner scan = new Scanner(System.in);
        Integer ставкаБудет = scan.nextInt();
        System.out.println("Выберите лошадь 1 или 2");
        Scanner scanner = new Scanner(System.in);
        Integer какаяЛошадь = scan.nextInt();
        int лошадь =1;
        int лошадь2 =1;
        long растояниеЗаОдинШаг = (long) (15 + Math.random() * 40);
        long растояниеЗаОдинШаг2 = (long) (15 + Math.random() * 40);
        while (лошадь<1000){
        лошадь+=растояниеЗаОдинШаг;
        }
        while (лошадь2<1000){
            лошадь2+=растояниеЗаОдинШаг2;
        }
        if (растояниеЗаОдинШаг<растояниеЗаОдинШаг2){
            System.out.println("Вторая лошадь победила");
        }
        else if (растояниеЗаОдинШаг>растояниеЗаОдинШаг2){
            System.out.println("Первая Лошадь победила");
        }
        else {
            System.out.println("Ничья");
        }
    }
}

