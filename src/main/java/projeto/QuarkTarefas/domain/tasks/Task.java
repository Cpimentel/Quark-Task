package projeto.QuarkTarefas.domain.tasks;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projeto.QuarkTarefas.DTO.TaskRequestDTO;
import projeto.QuarkTarefas.domain.priorities.Priority;
import projeto.QuarkTarefas.domain.responsibilities.Responsible;

import java.time.LocalDate;

@Entity
@Table(name = "task")
@AllArgsConstructor
public class Task {

    public Task() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsible_id", nullable = false)
    private Responsible responsible;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Priority priority;

    @Column(nullable = false)
    private LocalDate deadline;


    public Task(TaskRequestDTO request, Responsible responsible) {
        this.id = request.id();
        this.title = request.title();
        this.description = request.description();
        this.responsible = responsible;
        this.priority = request.priority();
        this.deadline = request.deadline();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}