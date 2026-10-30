package se.iths.sebastian.records_streams;

import se.iths.sebastian.records_streams.model.Computer;
import se.iths.sebastian.records_streams.model.Phone;

import java.util.List;

public class WebShopService {

    public Computer findMostExpensiveComputer(List<Computer> computerList) {
        Computer computer = computerList.stream()
                .sorted((a, b) -> Double.compare(b.price(), a.price()))
                .findFirst()
                .orElseThrow();
        return computer;



    }

}
public <maxPrice> Phone findFirstPhoneUnderPrice(List<Phone> phones double maxPrice) {
    return phones.stream()
            .filter(phone -> phone.price() - maxPrice)
            .findFirst()
            .orElseThrow();

 return phones;
}
