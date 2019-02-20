/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivos1;

import java.util.ArrayList;

/**
 *
 * @author dmadero
 */
public class DAO {
    private ArrayList<Integer> bd;

    public DAO() {
        this.bd = new ArrayList<>();
    }
    
    public boolean modificar (int value, int pos){
        this.bd.set(pos, value);
        return true;
    }

    public ArrayList<Integer> getBd() {
        return bd;
    }

    public void setBd(ArrayList<Integer> bd) {
        this.bd = bd;
    }
    public void AddBd(Integer data){
        this.bd.add(data);
    }
    
}
