public class Droid
{ 
	int batteryLevel;
	String name;
	
	/**
	 * 
	 * @param droidName
	 */
	public Droid(String droidName) 
  {
	  name = droidName;
	  batteryLevel = 100;
  }
	
	/**
	 * 
	 * @param args
	 */
  public static void main (String[]args)
  {
	  Droid codey = new Droid("Codey");
	  System.out.println(codey);
	  codey.performTask("Dancing");
	  System.out.println(codey.batteryLevel);
	  codey.performTask("Cooking");
	  System.out.println(codey.batteryLevel);

  }
  
  public String toString()
  {
	  return "Hello, I'm the droid: " + name;
  }
  
  public void performTask(String task) 
  {
	  System.out.println(name +" is performing task: " + task);
	  batteryLevel -=10;
  }
  
  
}