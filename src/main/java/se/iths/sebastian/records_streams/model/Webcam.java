package se.iths.sebastian.records_streams.model;

public record Webcam(String title, int megapixels) {
    @Override
    public String toString() {
        return "Webcam{" +
                "title='" + title + '\'' +
                ", megapixels=" + megapixels +
                '}';
    }
}
