package erp.app.erp_backend.service;

import erp.app.erp_backend.model.Type;
import erp.app.erp_backend.repository.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    private final TypeRepository typeRepository;
    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<Type> getTypes() {
        return this.typeRepository.findAll();
    }
}
