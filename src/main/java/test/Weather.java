package test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import weather.ChinaStockWebService;
import weather.ChinaStockWebServiceSoap;

public class Weather {
   
	public static void main(String[] args){
		List<String> list=new LinkedList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		ListIterator listIterator=list.listIterator();
		while(listIterator.hasNext()){
			String buf=(String)listIterator.next();
			System.out.println(buf);
		}
		
	}
}
