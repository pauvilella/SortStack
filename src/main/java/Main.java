import java.util.Stack;
import java.util.Random;

public class Main {
    public static void sortStack1(Stack<Integer> s) {
        Stack<Integer> aux = new Stack<>();
        int temp;
        while(!s.isEmpty()) {
            temp = s.pop();

            if(aux.isEmpty()) {
                aux.push(temp);
                continue;
            }

            while(!aux.isEmpty() && aux.peek() > temp) {
                s.push(aux.pop());
            }
            aux.push(temp);
        }
        while(!aux.isEmpty()) {
            s.push(aux.pop());
        }
    }

    public static Stack<Integer> sortStack2(Stack<Integer> s) {
        Stack<Integer> aux = new Stack<>();
        int temp;
        while(!s.isEmpty()) {
            temp = s.pop();

            if(aux.isEmpty()) {
                aux.push(temp);
                continue;
            }

            while(!aux.isEmpty() && aux.peek() < temp) {
                s.push(aux.pop());
            }
            aux.push(temp);
        }

        return aux;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        Random random = new Random();
        Stack<Integer> s2 = new Stack<>();
        while(i < 100000) {
            int temp = random.nextInt(1000);
            s.push(temp);
            s2.push(temp);
            i++;
        }
        //System.out.println(s.toString());
        //System.out.println(s2.toString());
        long time1 = System.currentTimeMillis();
        sortStack1(s);
        System.out.println(System.currentTimeMillis()-time1);
        //System.out.println(s.toString());
        time1 = System.currentTimeMillis();
        Stack<Integer> result = sortStack2(s2);
        System.out.println(System.currentTimeMillis()-time1);
        //System.out.println(result.toString());
    }
}
