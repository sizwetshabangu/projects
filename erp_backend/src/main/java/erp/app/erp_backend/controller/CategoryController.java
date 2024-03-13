package erp.app.erp_backend.controller;

import erp.app.erp_backend.model.Category;
import erp.app.erp_backend.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/inventory/category")
public class CategoryController {
    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        return ResponseEntity.ok(this.categoryService.getCategories());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable Long id) {
        return ResponseEntity.ok(this.categoryService.getCategory(id));
    }
    @PostMapping
    public ResponseEntity<Category> postCategory(@RequestBody Category category) {
        return ResponseEntity.ok(this.categoryService.postCategory(category));
    }
    @DeleteMapping
    public ResponseEntity<Object> deleteCategory(@RequestBody Category category){
        this.categoryService.deleteCategory(category);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCategory(@PathVariable Long id){
        this.categoryService.deleteCategoryById(id);
        return ResponseEntity.noContent().build();
    }

}
