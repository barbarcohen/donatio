package cz.donatio.domain;

import cz.donatio.service.DateUtil;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Rudolf on 28/06/16.
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private User owner;

    @Column(nullable = false)
    private Date created;

    public Item(String name, String description, User owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.created = DateUtil.getDate();
    }

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
