/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class AdministrarTexto {
       File archivo=null;
       Scanner sc=null;
       String datos;

    public AdministrarTexto() {
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
      
    
       
    public void cargarArchivo(){
    try
    {
     archivo=new File("./Expresion.txt");
      sc=new Scanner (archivo);
      while (sc.hasNext())
      {
          this.datos=sc.nextLine();
      }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    sc.close();
    }
   
}
