package lecture.ch10_Exception.Queue.App;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import lecture.ch10_Exception.Queue.Queue;
import lecture.ch10_Exception.Queue.QueueException.*;


// queue에 Exception 처리
public class QueueExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Queue queue = new Queue();
        int kin = 0;

        do {
            System.out.println("-----------------");
            System.out.println("1. enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. print queue");
            System.out.println("4. exit");

            kin = input.nextInt();
            System.out.printf("-> key input : %d\n", kin);

            try {
                switch(kin) {
                    case 1 -> queue.enqueue(rand.nextInt(20));
                    case 2 -> queue.dequeue();
                    case 3 -> queue.printQueue();
                }
                
            } catch(InputMismatchException e) {
                System.out.println(e);
            } catch(IllegalStateException | NoSuchElementException e) {
                System.out.println(e);
            } catch(QueueFullException | QueueEmptyException | QueueDisableException e) {
                System.out.println(e);
                e.printStackTrace();
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                return;
            }
        } while(kin != 4);
        
        input.close();
    }
}
