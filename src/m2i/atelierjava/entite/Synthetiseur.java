/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class Synthetiseur {

    protected boolean onOff;
    protected String instrument;
    protected int volume;

    //////allumage///////////////////////////
    public void allumageOnOff() {
        if (onOff == false) {
            onOff = true;
            instrument = "la clarinette";
            volume = 5;
            } else {
            onOff = false;
        }
    }

    //////volumePlus////////////////////////
    public void volumePlus() {
        if (volume < 10) {
            volume++;
        }
    }

    //////volumeMoins///////////////////////
    public void volumeMoins() {
        if (volume > 0) {
            volume--;
        }
    }

    ///////jouerNote///////////////////////
    public void jouerNote(String note) {
        if(this.onOff == true){
            System.out.println("Le synthetiseur est sur la position : " + onOff + ", L'instrument utilisé est " + instrument + ", le volume est à " + volume +", la note utilisée est le " + note);
        }else{
            System.out.println("Le synthetiseur est éteint");
        }
    }
    
    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    

}
