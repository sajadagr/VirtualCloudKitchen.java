package pizza.VirtualCloudKitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pizza.VirtualCloudKitchen.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods if needed
}
