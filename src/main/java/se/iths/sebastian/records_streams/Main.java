package se.iths.sebastian.records_streams;

import se.iths.sebastian.records_streams.model.Computer;

import java.util.List;

public class Main {
    static void main() {

        Computer computer = new Computer("MacBook", 100);
        Computer pc = new Computer("PC", 10);
        List<Computer> computerList = List.of(computer, pc);

        WebShopService webShopService = new WebShopService();
//
//        Optional<Computer> mostExpensive =
//                webShopService.findMostExpensiveComputer(computerList);
//
//        if (mostExpensive.isPresent()) {
//            IO.println(mostExpensive.get());
//        }

        IO.println(webShopService.findMostExpensiveComputer(computerList));

//        System.out.printf("Dator med titel %s och pris %s",
//                computer.title(), computer.price());

    }
}
