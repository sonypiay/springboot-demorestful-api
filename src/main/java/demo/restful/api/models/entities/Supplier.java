package demo.restful.api.models.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Collate;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "suppliers")
public class Supplier implements Serializable {

    private static final Long serialVersionId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    @Collate("utf8mb4_general_ci")
    private String name;

    @Column(columnDefinition = "text")
    @Collate("utf8mb4_general_ci")
    private String alamat;

    @Column(length = 100, nullable = false, unique = true)
    @Collate("utf8mb4_general_ci")
    private String email;

    @ManyToMany(mappedBy = "suppliers")
    private Set<Product> products;

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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
