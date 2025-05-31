package projeto.QuarkTarefas.DTO;


import projeto.QuarkTarefas.domain.priorities.Priority;

import java.time.LocalDate;

public record TaskResponseDTO(
        String id,
        String title,
        String description,
        String responsibleName,     // Mostra o nome do responsável ao invés do objeto completo
        Priority priority,
        LocalDate deadline
){}
