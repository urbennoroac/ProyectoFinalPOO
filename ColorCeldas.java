/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


/**
 *
 * @author urbennoroac
 */
public class ColorCeldas extends DefaultTableCellRenderer{
    public static final TableCellRenderer RENDERER = new DefaultTableCellRenderer();
    
    public boolean isCellEditable (int row, int column)
    {
       return false;
   }
    
    @Override
    public Component getTableCellRendererComponent (JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        Component c = RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, 3);
        
        
        if(table.getColumnModel().getColumn(column).getIdentifier().equals("Estado")){
            if(value.toString().equals("Entregada")){

            c.setForeground(Color.GREEN);
            
        }else if(value.toString().equals("Pendiente")){
                c.setForeground(Color.red);
            }else if(value.toString().equals("En Progreso")){
            c.setForeground(Color.ORANGE);
            }else{
            c.setForeground(Color.BLUE);
            }
}else{
            c.setForeground(Color.BLACK);
        }
        return c;
        
    
    } 
}
