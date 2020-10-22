package model;

import java.util.ArrayList;
import java.util.List;

public class SortLogic {

	public List<NamePrice> execute(List<NamePrice> namePriceList){

		List<NamePrice> namePriceList3 = new ArrayList<NamePrice>();

		for(NamePrice namePrice: namePriceList) {
			namePriceList3.add(namePrice);
		}

		for(int i = 0; i < namePriceList3.size();i++) {
			for(int j = 0; j < namePriceList3.size();j++) {
				if(namePriceList3.get(i).getPrice() > namePriceList3.get(j).getPrice()) {

					NamePrice temp = namePriceList3.get(i);
					namePriceList3.set(i, namePriceList3.get(j));
					namePriceList3.set(j, temp);

				}

			}

		}



		return namePriceList3;
	}
}
