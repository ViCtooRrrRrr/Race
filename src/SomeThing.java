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
        System.out.println("Выберите лошадь 3 или 4");
        Scanner scanner = new Scanner(System.in);
        Integer какаяЛошадь = scan.nextInt();
        int лошадь3 =1;
        int лошадь4 =1;
        long растояниеЗаОдинШаг = (long) (15 + Math.random() * 40);
        long растояниеЗаОдинШаг2 = (long) (15 + Math.random() * 40);
        while (лошадь3<1000){
        лошадь3+=растояниеЗаОдинШаг;
        }
        while (лошадь4<1000){
            лошадь4+=растояниеЗаОдинШаг2;
        }
        if (растояниеЗаОдинШаг<растояниеЗаОдинШаг2){
            System.out.println("Четвертая лошадь победила");
        }
        else if (растояниеЗаОдинШаг>растояниеЗаОдинШаг2){
            System.out.println("Третья Лошадь победила");
        }
        else {
            System.out.println("Ничья");
        }
    }
}

