
package Interfaz;

import static Interfaz.F_Calendario.Contenedor;
import calendarionet.CalendarioNet;
import javax.swing.table.DefaultTableModel;


public class Listas extends javax.swing.JFrame {

    // ----------------------------------
    // Atributos
    // ----------------------------------
    
    //-- Se declara el atributo modelo para crear la tabla --//
    public DefaultTableModel Modelo;
    int contador = 0;
    
    // ----------------------------------
    // Constructor
    // ----------------------------------
    public Listas()
    {
        initComponents();
        
        //-- Codigo para mostrar la tabla en el centro de la pantalla --//
        this.setLocationRelativeTo(null);
        
        //-- Ejecuta los metodos de la clase --//
        MostrarInter();
    }

    // ----------------------------------
    // Metodos
    // ----------------------------------
    public void MostrarInter ( )
    {
        //-- Crea la tabla --//
        String data [][] = {};
        String col [] = {"Nombre","Descripcion","Dia","Hora"};
        Modelo = new DefaultTableModel(data,col);
        Datos.setModel(Modelo);
    }
    
    public void MostrarTodos ( )
    {
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) F_Calendario.Contenedor.get(i);
            Modelo.insertRow(contador, new Object[]{});
            Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
            Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
            Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
            Modelo.setValueAt(p.getHora_del_evento(), contador, 3);  
        }
    }
    
    public void MostrarDatosCaso1 ( )
    {
        String Num = "1";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
    
    public void MostrarDatosCaso2 ( )
    {
        String Num = "2";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
    
    public void MostrarDatosCaso3 ( )
    {
        String Num = "3";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
    
    public void MostrarDatosCaso4 ( )
    {
        String Num = "4";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
        
    public void MostrarDatosCaso5 ( )
    {
        String Num = "5";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
            
    public void MostrarDatosCaso6 ( )
    {
        String Num = "6";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                
    public void MostrarDatosCaso7 ( )
    {
        String Num = "7";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                    
    public void MostrarDatosCaso8( )
    {
        String Num = "8";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                        
    public void MostrarDatosCaso9 ( )
    {
        String Num = "9";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                            
    public void MostrarDatosCaso10 ( )
    {
        String Num = "10";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                
    public void MostrarDatosCaso11 ( )
    {
        String Num = "11";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                    
    public void MostrarDatosCaso12 ( )
    {
        String Num = "12";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                        
    public void MostrarDatosCaso13 ( )
    {
        String Num = "13";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                            
    public void MostrarDatosCaso14 ( )
    {
        String Num = "14";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                                
    public void MostrarDatosCaso15 ( )
    {
        String Num = "15";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
    
        public void MostrarDatosCaso16 ( )
    {
        String Num = "16";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
    
    public void MostrarDatosCaso17 ( )
    {
        String Num = "17";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
    
    public void MostrarDatosCaso18 ( )
    {
        String Num = "18";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
    
    public void MostrarDatosCaso19 ( )
    {
        String Num = "19";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
        
    public void MostrarDatosCaso20 ( )
    {
        String Num = "20";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
            
    public void MostrarDatosCaso21 ( )
    {
        String Num = "21";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                
    public void MostrarDatosCaso22 ( )
    {
        String Num = "22";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                    
    public void MostrarDatosCaso23( )
    {
        String Num = "23";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                        
    public void MostrarDatosCaso24 ( )
    {
        String Num = "24";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                            
    public void MostrarDatosCaso25 ( )
    {
        String Num = "25";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                
    public void MostrarDatosCaso26 ( )
    {
        String Num = "26";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                    
    public void MostrarDatosCaso27 ( )
    {
        String Num = "27";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                        
    public void MostrarDatosCaso28 ( )
    {
        String Num = "28";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                            
    public void MostrarDatosCaso29 ( )
    {
        String Num = "29";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
                                                
    public void MostrarDatosCaso30 ( )
    {
        String Num = "30";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }
    
        public void MostrarDatosCaso31 ( )
    {
        String Num = "31";
        
        CalendarioNet p;
        for (int i=0; i < F_Calendario.Contenedor.size(); i++)
        {
            p = (CalendarioNet) Contenedor.get(i);
            if (Num.equalsIgnoreCase(p.getDia_del_evento()))
                {
                    p = (CalendarioNet) F_Calendario.Contenedor.get(i);
                    Modelo.insertRow(contador, new Object[]{});
                    Modelo.setValueAt(p.getNombre_del_evento(), contador, 0);
                    Modelo.setValueAt(p.getDescripcion_del_evento(), contador, 1);
                    Modelo.setValueAt(p.getDia_del_evento(), contador, 2);
                    Modelo.setValueAt(p.getHora_del_evento(), contador, 3);
                }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eventos del dia");

        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Datos);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Eventos del dia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
