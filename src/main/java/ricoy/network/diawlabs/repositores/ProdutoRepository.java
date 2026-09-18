package ricoy.network.diawlabs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ricoy.network.diawlabs.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

// Rommel essa parte do repository foi feita com claudinho
// No readme ela não tem, mas ele me explicou que nas versões
// Atuais ele era necessario pro Service Funcionar