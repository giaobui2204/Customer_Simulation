////////////////////////////////////////////////////////////////////////////////
// File:             (name of this file)
// Course:           (course number and section letter), (semester)
// Authors:          (your name and the names of other members of your group)
//
// Acknowledgements: (list anyone else other than your instructor who helped)
//                   (describe in detail the the ideas and help they provided)
//
// Online sources:   (include Web URLs and description of any information used)
////////////////////////////////////////////////////////////////////////////////

/**
   The <code>WidgetManipulator</code> class manipulates widgets.

   @author Brian Howard <bhoward@depauw.edu>
   @author Scott Thede <sthede@depauw.edu>
*/

public class Customer{
  private String name;
  private int arrivalTime;

  public Customer()
  {
    this.name = "Laura";
    this.arrivalTime = 42;
  }

  public Customer(String a, int b)
  {
    this.name = a;
    this.arrivalTime = b;
  }

  public int getArrivalTime()
  {
    return arrivalTime;
  }

  public String getName()
  {
    return name;
  }

  public void setArrivalTime(int newArrivalTime)
  {
    arrivalTime = newArrivalTime;
  }
  public void setName(String newName)
  {
    name = newName;
  }

  public String toString()
  {
    return "Customer {" + "name: " + getName() + ", " + "age: " + getArrivalTime() + " }";
  }

}
