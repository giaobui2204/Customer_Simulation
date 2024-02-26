import java.util.PriorityQueue;

public class WaitingLine{
  private PriorityQueue<Customer> queue;

  public WaitingLine()
  {
    queue = new PriorityQueue<Customer>();
  }

  public void add(Customer c)
  {
    queue.add(c);
  }

  public Customer remove()
  {
    return queue.poll();
  }

  public boolean isEmpty(){
    return queue.isEmpty();
  }

  public static void main(String[] args) {
    Customer customer1 = new Customer("Laura", 29);
    Customer customer2 = new Customer("Susan", 15);
    Customer customer3 = new Customer("Helen", 10);

    System.out.println(customer1.toString());
    System.out.println(customer2.toString());
    System.out.println(customer3.toString());

    WaitingLine waitingLine = new WaitingLine();
    waitingLine.add(customer1);
    waitingLine.add(customer2);
    waitingLine.add(customer3);

    
  }

  
} 
