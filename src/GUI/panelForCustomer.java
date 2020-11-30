package GUI;

import javax.swing.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class panelForCustomer extends JPanel {
    private Box box_top;
    private JTextField textField;
    private MyJPanel myPanel;
    private JButton Button_customer_add;
    private JButton Button_customer_search;



    public panelForCustomer(Employee employee){

    	Box horizontalBox = Box.createHorizontalBox();
    	Box horizontalBox_add = Box.createHorizontalBox();
    	Box verticalBox = Box.createVerticalBox();
    	add(verticalBox);

    	Button_customer_add = new JButton("+ 新增客户");
    	Button_customer_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Todu
            }
        });
    	horizontalBox_add.add(Button_customer_add);

    	JLabel Label_customer_customerSearchTitle = new JLabel("客户名称:   ");
    	horizontalBox.add(Label_customer_customerSearchTitle);
    	
    	textField = new JTextField();
    	horizontalBox.add(textField);
    	textField.setColumns(10);
    	
    	Button_customer_search = new JButton("查  询");
    	horizontalBox.add(Button_customer_search);
        //box_top = Box.createHorizontalBox();

        verticalBox.add(horizontalBox);
        verticalBox.add(horizontalBox_add);
        Vector<Object> name_customer = new Vector<>();
        /**
         *缺少关联数据库操作
         */
        /**
         * test code
         */
        name_customer.add("ID");
        name_customer.add("Name");
        name_customer.add("PhoneNumber");
        name_customer.add("address");
        myPanel = new MyJPanel(verticalBox,name_customer,99);
        this.add(myPanel);
    }

}
