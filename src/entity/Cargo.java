package entity;

import java.util.List;

public class Cargo {
    private Integer Id;
    private String descricao;
    private List<Funcao> funcao;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<entity.Funcao> getFuncao() {
        return funcao;
    }

    public void setFuncao(List<entity.Funcao> funcao) {
        this.funcao = funcao;
    }
}
