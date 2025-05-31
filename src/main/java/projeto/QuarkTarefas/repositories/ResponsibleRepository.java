package projeto.QuarkTarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.QuarkTarefas.domain.responsibilities.Responsible;

public interface ResponsibleRepository extends JpaRepository<Responsible, String> {
}
