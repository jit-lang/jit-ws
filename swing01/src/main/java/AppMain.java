import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Mar 27 17:41:03 JST 2019
 */



/**
 * @author JavaCommons Technologies
 */
public class AppMain extends JFrame {
    public static void main(String[] args) {
        AppMain frame = new AppMain();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public AppMain() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        this.textArea1.setText("テスト");
        /*
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        this.dispose();
        */
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - JavaCommons Technologies
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        setResizable(false);
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("text");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(button1)
                    .addGap(35, 35, 35)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - JavaCommons Technologies
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
