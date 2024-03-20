package utilerias;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Diego Valenzuela Parra - 00000247700
 * @author Juventino López García - 00000248547
 */
public class JButtonRenderer implements TableCellRenderer {

    private final JButton button;
    
    public JButtonRenderer(String text) {
        this.button = new JButton(text);
        this.button.setFont(new Font("Sans Serif", Font.BOLD, 16));
        this.button.setBackground(new Color(188, 149, 92));
        this.button.setForeground(new Color(242, 242, 242));
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this.button;
    }
    
}