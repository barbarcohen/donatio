package cz.donatio.api;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Rudolf on 30/06/16.
 */
@XmlRootElement
public class UserDTO {
    private Long id;

    private String login;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
