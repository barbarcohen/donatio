package cz.donatio.domain;

import cz.donatio.service.DateUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rudolf on 30/06/16.
 */
@Entity
public class Request implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(optional = false)
    private Item item;

    @ManyToOne(optional = false)
    private User user;

    @Column(nullable = false)
    private Date requestedAt;

    @Column(nullable = false)
    private String status;

    public Request(User user, Item item) {
        this.user = user;
        this.item = item;
        this.status = "NEW";
        this.requestedAt = DateUtil.getDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(Date requestedAt) {
        this.requestedAt = requestedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
