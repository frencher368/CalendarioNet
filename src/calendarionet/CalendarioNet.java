package calendarionet;

import Interfaz.F_Calendario;

public class CalendarioNet
{
    // ----------------------------------
    // Atributos
    // ----------------------------------
    private String Nombre_del_evento;
    private String Descripcion_del_evento;
    private String Hora_del_evento;
    private String Dia_del_evento;
   
    // ----------------------------------
    // Constructor
    // ----------------------------------
    public CalendarioNet(String Nombre_del_evento, String Descripcion_del_evento, String Hora_del_evento, String Dia_del_evento) {
        this.Nombre_del_evento = Nombre_del_evento;
        this.Descripcion_del_evento = Descripcion_del_evento;
        this.Hora_del_evento = Hora_del_evento;
        this.Dia_del_evento = Dia_del_evento;
    }
    
    // ----------------------------------
    // Metodos
    // ----------------------------------
    
    
    
    // ----------------------------------
    // Metodos Get and set
    // ----------------------------------
    public String getNombre_del_evento() {
        return Nombre_del_evento;
    }
    public String getDescripcion_del_evento() {
        return Descripcion_del_evento;
    }
    public String getHora_del_evento() {
        return Hora_del_evento;
    }
    public String getDia_del_evento() {
        return Dia_del_evento;
    }
    
    
    public void setNombre_del_evento(String Nombre_del_evento) {
        this.Nombre_del_evento = Nombre_del_evento;
    }
    public void setDescripcion_del_evento(String Descripcion_del_evento) {
        this.Descripcion_del_evento = Descripcion_del_evento;
    }
    public void setHora_del_evento(String Hora_del_evento) {
        this.Hora_del_evento = Hora_del_evento;
    }
    public void setDia_del_evento(String Dia_del_evento) {
        this.Dia_del_evento = Dia_del_evento;
    }
    
    // ----------------------------------
    // Main
    // ----------------------------------
    public static void main ( String arg []) throws Exception
	{
		F_Calendario p = new F_Calendario();
		p.setVisible(true);
	}	
}
