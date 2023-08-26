public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        System.out.println("Задача 2. Вариант 1");
        var dog1 = dog+4;
        var cat1 = cat+4;
        var paper1 = paper+4;
        System.out.println("dog = " + dog1);
        System.out.println("cat = " + cat1);
        System.out.println("paper = " + paper1);
        System.out.println();

        System.out.println("Задача 2. Вариант 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        System.out.println("Задача 3. Вариант 1");
        var dog2 = dog-3.5;
        var cat2 = cat-1.6;
        var paper2 = paper-7639;
        System.out.println("dog = " + dog2);
        System.out.println("cat = " + cat2);
        System.out.println("paper = " + paper2);
        System.out.println();

        System.out.println("Задача 3. Вариант 2");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        System.out.println("Задача 4.");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);
        System.out.println();

        System.out.println("Задача 5.");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);
        System.out.println();

        System.out.println("Задача 6,7.");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxersWeight = boxerWeight1+boxerWeight2;
        var differenceWeight = boxerWeight2-boxerWeight1;
        System.out.println("Масса одного боксера: " + boxerWeight1 + " кг.");
        System.out.println("Масса второго боксера: " + boxerWeight2 + " кг.");
        System.out.println("Общая масса двух бойцов: " + boxersWeight + " кг.");
        System.out.println("Разница между массами бойцов: " + differenceWeight + " кг.");
        System.out.println("Разница между массами бойцов: " + boxerWeight2%boxerWeight1 + " кг.");
        System.out.println();

        System.out.println("Задача 8.");
        var hoursOFJob = 640;
        var hoursOfJobEachWorker = 8;
        var workers = hoursOFJob/hoursOfJobEachWorker;
        System.out.println("Всего между работниками поделено " + hoursOFJob + " часов работы.");
        System.out.println("Каждый работник посвящает " + hoursOfJobEachWorker + " часов работе.");
        System.out.println("Всего работников в компании " + workers + " человек.");
        workers+=94;
        hoursOFJob= workers*hoursOfJobEachWorker;
        System.out.println("Если в компании работает " + workers + ", то всего " + hoursOFJob + " часов работы может быть поделено между сотрудниками.");
    }
}