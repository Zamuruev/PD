package proj.pd.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "projects")
public class Project extends BaseEntity {

    private String name;
    private String description;
    private UUID managerID;
    private List<User> users;

    public Project() {
        users= new ArrayList<>();
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(nullable = false)
    public UUID getManagerID() {
        return managerID;
    }

    public void setManagerID(UUID managerID) {
        this.managerID = managerID;
    }

    @ManyToMany(mappedBy = "projects")
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
