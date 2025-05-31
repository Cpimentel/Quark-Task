package projeto.QuarkTarefas.services;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.QuarkTarefas.DTO.TaskResponseDTO;
import projeto.QuarkTarefas.repositories.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<TaskResponseDTO> getAllTasks() {
        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskResponseDTO(
                        task.getId(),
                        task.getTitle(),
                        task.getDescription(),
                        task.getResponsible().getName(),  // ou outro campo
                        task.getPriority(),
                        task.getDeadline()
                ))
                .toList();
}
}
