    	
class NameNotFoundException extends Exception{
    		NameNotFoundException(String message){
    			super(message);
    		}
    	}

class InvalidSalaryException extends Exception{
    		InvalidSalaryException(String message){
    			super(message);
    		}
    	}  

class Employee{
    	double salary;
    	String name;
    	
    	Employee(String name,double salary) throws NameNotFoundException,InvalidSalaryException {
    		if(name==null) {
    			throw new NameNotFoundException("Employee name cannot be null");
    		}
    		if(salary<0) {
    			throw new InvalidSalaryException("salary cannot be negative");
    		}
    		this.salary=salary;
    		this.name=name;
    	}
    	
    	public String toString() {
    		return "Employee{name="+name+",salary="+salary+"}";
    	}
    }
public class CustomExceptionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee e1= new Employee("Kshitij",50000000);
			System.out.println(e1);
			
			Employee e2= new Employee("Ansh",-7000000);
			System.out.println(e2);
		}
		catch(NameNotFoundException | InvalidSalaryException e) {
			System.out.println("Exception caught:"+e.getMessage());
		}

	}

}
