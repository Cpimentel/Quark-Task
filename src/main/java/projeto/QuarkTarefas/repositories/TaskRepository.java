package projeto.QuarkTarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.QuarkTarefas.domain.tasks.Task;

public interface TaskRepository extends JpaRepository<Task, String> {

}
