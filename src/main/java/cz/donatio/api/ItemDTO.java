package cz.donatio.api;

import cz.donatio.domain.User;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Rudolf on 28/06/16.
 */
@XmlRootElement
public class ItemDTO {

    private Long id;
    private String name;
    private String description;
    private User owner;
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
