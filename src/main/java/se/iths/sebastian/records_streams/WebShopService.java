package se.iths.sebastian.records_streams;

import se.iths.sebastian.records_streams.model.Computer;
import se.iths.sebastian.records_streams.model.Headset;
import se.iths.sebastian.records_streams.model.Mouse;

import java.util.List;

public class WebShopService {

    public Computer findMostExpensiveComputer(List<Computer> computerList) {
        Computer computer = computerList.stream()
                .sorted((a, b) -> Double.compare(b.price(), a.price()))
                .findFirst()
                .orElseThrow();
        return computer;
    }

    public Mouse findFirstMouseByMinDpi(List<Mouse> mice, int minDpi) {
        return mice.stream()
                .filter(mouse -> mouse.dpi() >= minDpi)
                .findFirst()
                .orElseThrow();
    }

    public String findFirstHeadsetTitleUnderPrice(
            List<Headset> headsets, double maxPrice) {
        return headsets.stream()
                .filter(headset -> headset.price() < maxPrice)
                .map(headset -> headset.title())
                .findFirst()
                .orElseThrow();
    }
}
