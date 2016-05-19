package dao;

public class Visita {
    int id;
    String ingreso;
    String salida;
    int visitante_id;
    int departamentoPersonal_id;
    int estatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public int getVisitante_id() {
        return visitante_id;
    }

    public void setVisitante_id(int visitante_id) {
        this.visitante_id = visitante_id;
    }

    public int getDepartamentoPersonal_id() {
        return departamentoPersonal_id;
    }

    public void setDepartamentoPersonal_id(int departamentoPersonal_id) {
        this.departamentoPersonal_id = departamentoPersonal_id;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    
    
}
