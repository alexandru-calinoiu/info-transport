package ro.gov.httpithub.infotransport.data;

public final class City {

    private final String id;

    private final String name;

    public City(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
