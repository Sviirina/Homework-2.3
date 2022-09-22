public class Main {
    public static void main(String[] args) {
        //Задание 6
        System.out.println("Задание 6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        System.out.println("Общий вес двух боксеров: " + (boxerOne + boxerTwo));
        System.out.println("Разница в весе двух боксеров: " + (boxerTwo - boxerOne));

        //Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница в весе двух боксеров (Способ 1): " + (boxerTwo - boxerOne));
        System.out.println("Разница в весе двух боксеров (Способ 2): " + (boxerTwo % boxerOne));

        //Задание 7
        System.out.println("Задание 8");
        var totalHours = 640;
        var hoursPerWorking = 8;
        var totalEmployees = totalHours / hoursPerWorking;
        System.out.println("Всего работников в компании - " + totalHours / hoursPerWorking + " человек");
        totalEmployees = totalEmployees + 94;
        totalHours = totalEmployees * hoursPerWorking;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");




    }
}