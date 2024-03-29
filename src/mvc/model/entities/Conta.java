/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model.entities;

import java.math.BigDecimal;
import java.util.Objects;
import mvc.model.dao.AtivoDAO;

/**
 *
 * @author pedro
 */
public class Conta {
    private static int serial;
    private final int id;
    
    private BigDecimal saldo;
    private BigDecimal limite;
    
    private Data data;
    
    private Cliente titular;
    private AtivoDAO ativos;
    
    public Conta(){
        this.id = ++Conta.serial;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public Data getData() {
        return data;
    }

    public Cliente getTitular() {
        return titular;
    }

    public AtivoDAO getAtivos() {
        return ativos;
    }
    
    public void entrada(BigDecimal valor){
        this.saldo.add(valor);
    }
    
    public void retirada(BigDecimal valor){
        this.saldo.subtract(valor);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.saldo);
        hash = 67 * hash + Objects.hashCode(this.limite);
        hash = 67 * hash + Objects.hashCode(this.data);
        hash = 67 * hash + Objects.hashCode(this.titular);
        hash = 67 * hash + Objects.hashCode(this.ativos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.saldo, other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.limite, other.limite)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.titular, other.titular)) {
            return false;
        }
        if (!Objects.equals(this.ativos, other.ativos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", saldo=" + saldo + ", limite=" + limite + ", data=" + data + ", titular=" + titular + ", ativos=" + ativos + '}';
    }
}
