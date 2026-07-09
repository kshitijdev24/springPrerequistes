package BuiltInInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Supplier<Integer>randomNum=()->new Random().nextInt(100);
        System.out.println("Random:"+randomNum.get());
	}

}
