package se.iths.sebastian.records_streams.model;

public record Mouse(String title, int dpi) {
    @Override
    public String toString() {
        return "Mouse{" +
                "title='" + title + '\'' +
                ", dpi=" + dpi +
                '}';
    }
}
