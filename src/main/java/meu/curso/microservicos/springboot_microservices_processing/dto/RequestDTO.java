package meu.curso.microservicos.springboot_microservices_processing.dto;

public class RequestDTO {

    private Long id;
    private String description;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
