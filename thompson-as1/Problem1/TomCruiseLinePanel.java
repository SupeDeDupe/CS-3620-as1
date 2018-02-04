
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 * @author Sarah Thompson
 * @version February 4, 2017
 */
public class TomCruiseLinePanel extends JPanel
{
   private JLabel addonLabel, roomLabel, headerLabel;
   private JRadioButton interior, ocean, balcony, suite;
   private JCheckBox beverage, klondike, helicopter, climbing, lumberjack, scientology;
   private ButtonGroup roomButtons;
   private JButton compute;
   private JPanel panel1, panel2, panel3, panel4;
   
   public TomCruiseLinePanel()
   {
      headerLabel = new JLabel ("Select Cruise Package");
      headerLabel.setFont (new Font ("Helvetica", Font.PLAIN, 22));
      roomLabel = new JLabel ("Room Selection");
      roomLabel.setFont (new Font ("Helvetica", Font.PLAIN, 22));
      addonLabel = new JLabel ("Add-on Packages");
      addonLabel.setFont (new Font ("Helvetica", Font.PLAIN, 22));
      roomButtons = new ButtonGroup();
      compute = new JButton("Compute");
      compute.addActionListener(new ButtonListener());
      
      panel1 = new JPanel();
      panel2 = new JPanel();
      panel3 = new JPanel();
      panel4 = new JPanel();

      interior = new JRadioButton ("Interior - $1000", true);
      interior.setBackground (Color.white);
      ocean = new JRadioButton ("Ocean View - $1500");
      ocean.setBackground (Color.white);
      balcony = new JRadioButton ("Balcony - $2000");
      balcony.setBackground (Color.white);
      suite = new JRadioButton ("Suite - $3000");
      suite.setBackground (Color.white);
      
      RoomListener roomListener = new RoomListener();
      interior.addActionListener (roomListener);
      ocean.addActionListener (roomListener);
      balcony.addActionListener (roomListener);
      suite.addActionListener (roomListener);
      
      beverage = new JCheckBox ("Beverage - $700");
      beverage.setBackground (Color.white);
      klondike = new JCheckBox ("Klondike - $50");
      klondike.setBackground (Color.white);
      helicopter = new JCheckBox ("Helicopter - $200");
      helicopter.setBackground (Color.white);
      climbing = new JCheckBox ("Climbing - $60");
      climbing.setBackground (Color.white);
      lumberjack = new JCheckBox ("Lumberjack - $15");
      lumberjack.setBackground (Color.white);
      scientology = new JCheckBox ("Scientology - $500");
      scientology.setBackground (Color.white);
      
      AddonListener addonListener = new AddonListener();
      beverage.addItemListener (addonListener);
      klondike.addItemListener (addonListener);
      helicopter.addItemListener (addonListener);
      climbing.addItemListener (addonListener);
      lumberjack.addItemListener (addonListener);
      scientology.addItemListener (addonListener);

      roomButtons.add(interior);
      roomButtons.add(ocean);
      roomButtons.add(balcony);
      roomButtons.add(suite);
      
      panel1.add (headerLabel);
      panel1.setBackground (Color.white);
      panel1.setPreferredSize (new Dimension(750, 50));
      
      panel2.add (roomLabel);
      panel2.add (interior);
      panel2.add (ocean);
      panel2.add (balcony);
      panel2.add (suite);
      panel2.setBackground (Color.white);
      panel2.setPreferredSize (new Dimension(750, 30));
      
      panel3.add (addonLabel);
      panel3.add (beverage);
      panel3.add (klondike);
      panel3.add (helicopter);
      panel3.add (climbing);
      panel3.add (lumberjack);
      panel3.add (scientology);
      panel3.setBackground (Color.white);
      panel3.setPreferredSize (new Dimension(750, 30));
      
      
      panel4.add(compute);
      panel4.setBackground (Color.white);
      panel4.setPreferredSize (new Dimension(750, 100));
      
      add(panel1);
      add(panel2);
      add(panel3);
      add(panel4);

      setBackground (Color.white);
      setPreferredSize (new Dimension(750, 300));
   }

   //*****************************************************************
   //  Represents the listener for add-on checkboxes.
   //*****************************************************************
   private class AddonListener implements ItemListener
   {
      public void itemStateChanged (ItemEvent event)
      {
         /*
          int style = Font.PLAIN;

         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC;

         beverageLabel.setFont (new Font ("Helvetica", style, 36));
         */
      }
   }
   
   //*****************************************************************
   //  Represents the listener for radio buttons.
   //*****************************************************************
   private class RoomListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         Object source = event.getSource();
         /*
         if (source == comedy)
            quote.setText (comedyQuote);
         else
            if (source == philosophy)
               quote.setText (philosophyQuote);
            else
               quote.setText (carpentryQuote);
               */
      }
   }
   
   //*****************************************************************
   //  Represents a listener for button Compute events.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         /*count++;
         label.setText("Pushes: " + count);*/
      }
   }
}
