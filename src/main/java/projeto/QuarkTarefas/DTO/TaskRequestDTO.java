package projeto.QuarkTarefas.DTO;

import projeto.QuarkTarefas.domain.priorities.Priority;

import java.time.LocalDate;

public record TaskRequestDTO(
        String id,                    // Pode ser null na criação
        String title,
        String description,
        String responsibleId,         // Passa apenas o ID do responsável
        Priority priority,
        LocalDate deadline
)
{}