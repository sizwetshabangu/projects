package erp.app.erp_backend.repository;

import erp.app.erp_backend.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, UUID> {
}
