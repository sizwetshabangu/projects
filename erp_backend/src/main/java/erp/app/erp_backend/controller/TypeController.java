package erp.app.erp_backend.controller;

import erp.app.erp_backend.model.Type;
import erp.app.erp_backend.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/inventory/type")
public class TypeController {
    private final TypeService typeService;
    @GetMapping
    public ResponseEntity<List<Type>> getTypes() {
        return ResponseEntity.ok(this.typeService.getTypes());
    }
}
