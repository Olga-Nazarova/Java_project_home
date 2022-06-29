//Написать программу вычисления n-ого треугольного числа
public class project_2{
    public static void main(String args[]){
        int n = 4;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println(" Переместить диск с 1 стержня " + from_rod + " на стрежень " + to_rod);
            return;
        }

        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);

        System.out.println(" Переместить диск " + n + " со стрежня " + from_rod + " на стержень " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
}
