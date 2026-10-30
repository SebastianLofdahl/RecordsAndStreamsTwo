package se.iths.sebastian.records_streams;

import se.iths.sebastian.records_streams.model.Computer;
import se.iths.sebastian.records_streams.model.Headset;
import se.iths.sebastian.records_streams.model.Mouse;
import se.iths.sebastian.records_streams.model.Webcam;

import java.util.List;

public class Main {
    static void main() {

        Computer computer = new Computer("MacBook", 100);
        Computer pc = new Computer("PC", 10);
        List<Computer> computerList = List.of(computer, pc);

        Webcam webcam = new Webcam("GoPro", 2000);
        Webcam webcam1 = new Webcam("Nova", 1800);
        List<Webcam> webcamList = List.of(webcam, webcam1);

        Mouse mouse = new Mouse("Razer", 9400);
        Mouse mouse1 = new Mouse("Logitech", 8600);
        List<Mouse> mouseList = List.of(mouse, mouse1);

        Headset headset = new Headset("Steelseries", 499.99);
        Headset headset1 = new Headset("Razer", 299.99);
        List<Headset> headsetList = List.of(headset, headset1);

        WebShopService webShopService = new WebShopService();

//        Optional<Computer> mostExpensive =
//                webShopService.findMostExpensiveComputer(computerList);
//
//        if (mostExpensive.isPresent()) {
//            IO.println(mostExpensive.get());
//        }

        IO.println(webShopService.findMostExpensiveComputer(computerList));
        IO.println(webShopService.findFirstMouseByMinDpi(mouseList, 8000));
        IO.println(webShopService.findFirstWebcamTitleByMinResolution(webcamList, 1200));
        IO.println(webShopService.findFirstHeadsetTitleUnderPrice(headsetList, 199.99));

//        System.out.printf("Dator med titel %s och pris %s",
//                computer.title(), computer.price());

    }
}
