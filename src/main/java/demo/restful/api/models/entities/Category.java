package demo.restful.api.models.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Collate;

import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    private static final Long serialVersionId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    @Collate("utf8mb4_general_ci")
    private String name;

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
}
