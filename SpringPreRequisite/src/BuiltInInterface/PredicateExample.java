package BuiltInInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		List<String>names=Arrays.asList("Amit","Supriya","Anita","Neha");
		
		Predicate<String>startWithA = s->s.startsWith("A");
		
		names.stream().filter(startWithA).forEach(System.out::println);

	}

}
