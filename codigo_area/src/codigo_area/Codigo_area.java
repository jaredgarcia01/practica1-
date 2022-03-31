/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo_area;

public class codigo_area
{ String aulas,biblioteca,zonaverde,laboratorio,canchita; public codigo_area
        (String aulas, String laboratorio, String Biblioteca, String zonaverde, String canchita)
        { this.aulas = this.biblioteca; this.laboratorio = this.zonaverde;
         this.canchita = canchita; } public codigo_area()
        { } public String getAulas() 
        { System.out.println("codigo de las aulas Us01"); return aulas; } 
        public void setAulas(String Aulas)
        { this.aulas = aulas; } 
        public String getBiblioteca()
        { System.out.println("Codigo de la biblioteca450");
        return biblioteca; } public void setbiblioteca(String biblioteca)
        { this.biblioteca = biblioteca; } public String getzonaverde()
        { System.out.println("Codigo de la zona verde ZV01"); 
        return zonaverde; } public void setzonaerdE(String zonaverde)
        { this.zonaverde = zonaverde; } 
        public String getlaboratorio(){ System.out.println("Codigo de laboratorio LAB01");
        return laboratorio; } 
        public void setlabpratorio(String laboratorio)
        { this.laboratorio = laboratorio; } 
        public String getcanchita()
        { System.out.println("Codigo de la canchita CA01");
        return canchita; } public void setcanchita(String canchita) 
        { this.canchita = canchita; }
        
}
