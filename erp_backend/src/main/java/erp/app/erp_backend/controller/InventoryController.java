package erp.app.erp_backend.controller;

import erp.app.erp_backend.model.Inventory;
import erp.app.erp_backend.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/inventory")
public class InventoryController {
    private final InventoryService inventoryService;
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
    @GetMapping()
    public ResponseEntity<List<Inventory>> getInventories() {
        return ResponseEntity.ok(this.inventoryService.getInventories());
    }
}
