package erp.app.erp_backend.service;

import erp.app.erp_backend.model.Category;
import erp.app.erp_backend.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<Category> getCategories() {
        return this.categoryRepository.findAll();
    }
    public Category getCategory(Long id) throws NoSuchElementException {
        return this.categoryRepository.findById(id).orElseThrow();
    }
    public Category postCategory(Category category) {
        return this.categoryRepository.save(category);
    }
    public List<Category> postCategories(List<Category> categories) {
        return this.categoryRepository.saveAll(categories);
    }
    public void deleteCategoryById(Long id) {
        this.categoryRepository.deleteById(id);
    }
    public void deleteCategory(Category category) {
        this.categoryRepository.delete(category);
    }
}
