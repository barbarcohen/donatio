package cz.donatio.api;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Rudolf on 28/06/16.
 */
@XmlRootElement
public class ItemToCreateDTO {
    private String name;
    private String description;

    public ItemToCreateDTO() {
    }

    public ItemToCreateDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
