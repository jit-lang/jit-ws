import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Mar 26 23:30:26 JST 2019
 */



/**
 * @author unknown
 */
public class TwinText extends JFrame {
    public static void open(String textLeft, String textRight) {
        TwinText frame = new TwinText();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.setLocationRelativeTo(null);
        frame.textPane1.setText(textLeft);
        frame.textPane2.setText(textRight);
        frame.setVisible(true);
    }
    public TwinText() {
        initComponents();
    }

    private void splitPane1ComponentResized(ComponentEvent e) {
        this.splitPane1.setDividerLocation(this.splitPane1.getWidth()/2);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - JavaCommons Technologies
        splitPane1 = new JSplitPane();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        scrollPane2 = new JScrollPane();
        textPane2 = new JTextPane();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== splitPane1 ========
        {
            splitPane1.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    splitPane1ComponentResized(e);
                }
            });

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            splitPane1.setLeftComponent(scrollPane1);

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(textPane2);
            }
            splitPane1.setRightComponent(scrollPane2);
        }
        contentPane.add(splitPane1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - JavaCommons Technologies
    private JSplitPane splitPane1;
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    private JScrollPane scrollPane2;
    private JTextPane textPane2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
