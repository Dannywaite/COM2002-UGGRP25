import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JButton button;
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	if (shouldFill) {
	//natural height, maximum width
	c.fill = GridBagConstraints.HORIZONTAL;
	}

	button = new JButton("Time & Date");
	c.weightx = 1;
	c.gridwidth = 1;
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	pane.add(button, c);
	
	button = new JButton("Mon");
	c.weightx = 0.5;
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipadx = 30;
	c.gridx = 1;
	c.gridy = 0;
	pane.add(button, c);

	button = new JButton("Tue");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipadx = 30;
	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 0;
	pane.add(button, c);

	button = new JButton("Wed");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipadx = 30;
	c.weightx = 0.5;
	c.gridx = 3;
	c.gridy = 0;
	pane.add(button, c);

	button = new JButton("Thur");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipadx = 30;
	c.weightx = 0.0;
	c.gridx = 4;
	c.gridy = 0;
	pane.add(button, c);

	button = new JButton("Fri");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipadx = 30;
	c.ipady = 0;       
	c.gridx = 5;       
	c.gridwidth = 1;   
	c.gridy = 0;       
	pane.add(button, c);
	
	button = new JButton(" Timeslots");
//	c.fill = GridBagConstraints.VERTICAL;
	c.weightx = 1;
	c.gridx = 0; 
	c.gridy = 1; 
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.ipady = 20;
	pane.add(button,c);
	
	button = new JButton(" Timeslots");
//	c.fill = GridBagConstraints.VERTICAL;
	c.weightx = 1;
	c.gridx = 0; 
	c.gridy = 2; 
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.ipady = 20;
	pane.add(button,c);
	
	button = new JButton(" Timeslots");
//	c.fill = GridBagConstraints.VERTICAL;
	c.weightx = 1;
	c.gridx = 0; 
	c.gridy = 3; 
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.ipady = 20;
	pane.add(button,c);

		button = new JButton(" Timeslots");
//	c.fill = GridBagConstraints.VERTICAL;
	c.weightx = 1;
	c.gridx = 0; 
	c.gridy = 4; 
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.ipady = 20;
	pane.add(button,c);
	
		button = new JButton(" Timeslots");
//	c.fill = GridBagConstraints.VERTICAL;
	c.weightx = 1;
	c.gridx = 0; 
	c.gridy = 5; 
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.ipady = 20;
	pane.add(button,c);
	
	button = new JButton(" Timeslots");
//	c.fill = GridBagConstraints.VERTICAL;
	c.weightx = 1;
	c.gridx = 0; 
	c.gridy = 6; 
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.ipady = 20;
	pane.add(button,c);
	
	button = new JButton(" Timeslots");
//	c.fill = GridBagConstraints.VERTICAL;
	c.weightx = 1;
	c.gridx = 0; 
	c.gridy = 7; 
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.ipady = 20;
	pane.add(button,c);
	
	button = new JButton(" Timeslots");
//	c.fill = GridBagConstraints.VERTICAL;
	c.weightx = 1;
	c.gridx = 0; 
	c.gridy = 8; 
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.ipady = 20;
	pane.add(button,c);
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Calendar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}