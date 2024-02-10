import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame{
    final private Font mainFont = new Font("Segoe", Font.BOLD, 20);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

 public void initialize(){
                         /*FORM Panle */
    JLabel lblFirstName = new JLabel("FIRST NAME");
    lblFirstName.setFont(mainFont);

    tfFirstName = new JTextField();
    tfFirstName.setFont(mainFont);
    
    JLabel lblLastName = new JLabel("LAST NAME");
    lblLastName.setFont(mainFont);

    tfLastName = new JTextField();  
    tfLastName.setFont(mainFont);


    JPanel formPanel = new JPanel();
    formPanel.setLayout(new GridLayout(4,1,5,5));
    formPanel.setOpaque(false);
    formPanel.add(lblFirstName);
    formPanel.add(tfFirstName);
    formPanel.add(lblLastName);
    formPanel.add(tfLastName);
/****************************WELCOME LABEL******************/
    lbWelcome = new JLabel();
    lbWelcome.setFont(mainFont);
/****************************BUTTONS PANEL******************/
    JButton btnOK = new JButton("OKAY");
    btnOK.setFont(mainFont);
    btnOK.addActionListener(new ActionListener() {
    
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String firstName = tfFirstName.getText();
            String lastName = tfLastName.getText();
            lbWelcome.setText(" Hello !! " + firstName + " " + lastName);
        }
    });
    JButton btnClear = new JButton("CLEAR");
    btnClear.setFont(mainFont);
    btnClear.addActionListener(new ActionListener() {
    
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            tfFirstName.setText("");
            tfLastName.setText("");
            lbWelcome.setText("");
        }
    });
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(1,2,5,5));
    buttonPanel.setOpaque(false);
    buttonPanel.add(btnOK);
    buttonPanel.add(btnClear);

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(new Color(128,128,255));
    mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    mainPanel.add(formPanel, BorderLayout.NORTH);
    mainPanel.add(lbWelcome, BorderLayout.CENTER);
    mainPanel.add(buttonPanel, BorderLayout.SOUTH);

    add(mainPanel);


    setTitle("Welcome to TO-DO LIST");
    setSize(500,600);
    setMinimumSize(new Dimension(400,400));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args) {
      mainframe mf = new mainframe();
      mf.initialize();
  }
    
}