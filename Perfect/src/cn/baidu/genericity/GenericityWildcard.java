package cn.baidu.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型通配符
 * 
 * @author CGB
 */
public class GenericityWildcard {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("我们都是好孩子!");
		list.add("我们都是好孩子!");
		list.add("我们都是乖宝宝!");
		
		method(list);
		
		ArrayList<Integer> list2= new ArrayList<>();
		list2.add(123);
		list2.add(123);
		list2.add(1234);
		
		method(list2);
	}
	
	//通配符的方式
	public static void method(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

	//泛型方法的方式
	public static <E> void method2(List<E> e){
		for (Object object : e) {
			System.out.println(object);
		}
	}
	
	
	
}
