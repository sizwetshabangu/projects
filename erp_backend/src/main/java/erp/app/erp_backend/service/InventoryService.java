package erp.app.erp_backend.service;

import erp.app.erp_backend.model.Inventory;
import erp.app.erp_backend.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<Inventory> getInventories() {
        return this.inventoryRepository.findAll();
    }
}
