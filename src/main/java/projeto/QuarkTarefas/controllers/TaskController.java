package projeto.QuarkTarefas.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.QuarkTarefas.domain.tasks.Task;
import projeto.QuarkTarefas.DTO.TaskRequestDTO;
import projeto.QuarkTarefas.DTO.TaskResponseDTO;
import projeto.QuarkTarefas.services.TaskService;
import projeto.QuarkTarefas.services.TaskServiceImpl;

import java.util.List;


@RestController
@RequestMapping("api/v1/task")
@RequiredArgsConstructor
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping
    public List<TaskResponseDTO> getAllTasks() {
        return taskService.getAllTasks();
    }
}
