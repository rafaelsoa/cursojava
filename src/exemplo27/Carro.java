/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo27;

/**
 *
 * @author a965866
 */
public class Carro {
    
    private int id;
    Modelo modelo;
    private String placa; 
    private int ano;
    private int km;
    
    public Carro(){}
    
    public Carro (int id, Modelo modelo, String placa, int ano, int km){
    
        this.id= id;
        this.modelo = modelo;

        this.ano=ano;
        this.km=km;
        this.placa = placa; 
        
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", km=" + km + '}';
    }

  
    public int getKm(){
        return this.km;
    }
    public int setKm (){
    this.km = km; 
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
