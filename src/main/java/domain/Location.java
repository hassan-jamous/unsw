package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private String lat;
    private String lng;

    public Location() {
    }

    public Location(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Location)) {
            return false;
        }
        return this.lat.equals(((Location) other).getLat()) && this.lng.equals(((Location) other).getLng());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.lat, this.lng);
    }
}
