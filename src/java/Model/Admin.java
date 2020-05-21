package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eng Eslam khder
 */
@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "Code")
    private String code;
    @Column(name = "Password")
    private String password;
    @Column(name = "Name")
    private String name;
    
    @Column(name = "money")
    private String money;
    
    public Admin() {
    }

    public Admin(String code, String password) {
        this.code = code;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
    
}
