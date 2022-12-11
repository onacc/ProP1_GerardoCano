/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prop1_gerardocano;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gcano
 */
public class Cancion {
    private String nombre;
    private String album;
    private String artist;
    private int year;
    private int dur;
     private ArrayList<String> info;
     
    //private ArrayList<String> info;

    public Cancion(String nombre, String album, String artist, int year, int dur) {
        this.nombre = nombre;
        this.album = album;
        this.artist = artist;
        this.year = year;
        this.dur = dur;
    }

    Cancion() {
        System.out.println("hola");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }
    public void agregar(){
        info = new ArrayList<>();
        ArrayList<String> can = new ArrayList<>();
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre de la cancion");
        can.add(nombre);
        album = JOptionPane.showInputDialog(null,"Ingrese el nombre del album");
        can.add(album);
        artist = JOptionPane.showInputDialog(null,"Ingrese el nombre del artista");
        can.add(artist);
        
        dur = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Duracion de la cancion(segundos)"));
        can.add(String.valueOf(dur));
        
        
        year = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese año que salio"));
        can.add(String.valueOf(year));
        String cancion = can.toString();
        
        info.add(cancion);
        
    }
    public void mostrar(){
        String infor = "";
        for (int i = 0; i < info.size();i++){ 		      
	        JOptionPane.showMessageDialog(null,""); 		
	      }
    }
    public String aString(){
        return "Nombre de la Cancion " +nombre
                +"\n"+"Nombre del album "+album
                +"\n"+"Nombre del artista "+artist
                +"\n"+"Año de lanzamiento "+year
                +"\n"+"Duracion de la cancion "+dur;
                
    }
    
    
}
