package projeto.QuarkTarefas.services;

import projeto.QuarkTarefas.DTO.TaskResponseDTO;

import java.util.List;

public interface TaskService {

    List<TaskResponseDTO> getAllTasks();
}
