package dream.team.cetriolo.sprintbootapp.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mat_materia")
public class Materia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mat_id")
    private Long id;

    @Column(name = "mat_nome")
    private String nome;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "materias")
    private Set<Usuario> usuarios;


    
    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlunos(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}