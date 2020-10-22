package model;

import java.util.ArrayList;
import java.util.List;

public class Logic {

	public List<NamePrice> execute (List<NamePrice> namePriceList ,double quantity){


		List<NamePrice> namePriceList2 = new ArrayList<>();

		for(int i = 0; i < namePriceList.size();i++) {

		namePriceList.get(i).getName();
		double x7 = namePriceList.get(i).getPrice() * quantity * 0.07;
		double x5 = namePriceList.get(i).getPrice() * quantity * 0.05;
		double x3 = namePriceList.get(i).getPrice() * quantity * 0.03;


		NamePrice a = new NamePrice(namePriceList.get(i).getName()+ ":7%",x7);
		NamePrice b = new NamePrice(namePriceList.get(i).getName()+ ":5%",x5);
		NamePrice c = new NamePrice(namePriceList.get(i).getName()+ ":3%",x3);

		namePriceList2.add(a);
		namePriceList2.add(b);
		namePriceList2.add(c);
		}




		return namePriceList2;
	}
}


