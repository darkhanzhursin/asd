package counter;
import command.Command;
import command.DecrementCommand;
import command.HistoryList;
import command.IncrementCommand;
import observer.BinaryObserver;
import observer.OvalObserver;
import observer.RectObserver;
import observer.TextObserver;
import state.SingleDigit;

import java.awt.Dimension;
import java.awt.Toolkit;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameCounter extends JFrame {
    private JButton jButtonIncrement = new JButton();
    private JButton jButtondecrement = new JButton();
    private JButton jButtonundo = new JButton();
    private JButton jButtonredo = new JButton();
    
    private Counter counter;

    public JFrameCounter() {
        try {
            counter = new Counter();
            counter.setCounterState(new SingleDigit(counter));

            BinaryObserver binaryObserver = new BinaryObserver();
            TextObserver textObserver = new TextObserver();
            RectObserver rectObserver = new RectObserver();
            OvalObserver ovalObserver = new OvalObserver();

            counter.addObserver(binaryObserver);
            counter.addObserver(textObserver);
            counter.addObserver(rectObserver);
            counter.addObserver(ovalObserver);

            jbInit();
            TextFrame textframe = new TextFrame();
            textframe.setVisible(true);
            RectFrame rectframe = new RectFrame();
            rectframe.setVisible(true);
            OvalFrame ovalframe = new OvalFrame();
            ovalframe.setVisible(true);
            BinaryFrame binaryFrame = new BinaryFrame();
            binaryFrame.setVisible(true);
            textObserver.setTextFrame(textframe);
            rectObserver.setRectFrame(rectframe);
            ovalObserver.setOvalFrame(ovalframe);
            binaryObserver.setBinaryFrame(binaryFrame);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	JFrameCounter frame = new JFrameCounter();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        frame.setLocation( ( screenSize.width - frameSize.width ) / 2, ( screenSize.height - frameSize.height ) / 2 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
        
    }

    private void jbInit() throws Exception {
        HistoryList historyList = new HistoryList();
        IncrementCommand incrementCommand = new IncrementCommand(counter);
        DecrementCommand decrementCommand = new DecrementCommand(counter);
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(297, 169));
        jButtonIncrement.setText("+");
        jButtonIncrement.setBounds(new Rectangle(30, 25, 73, 22));
        jButtonIncrement.setActionCommand("increment");
        jButtonIncrement.addActionListener(e -> {
            jButtonIncrement_actionPerformed(e, incrementCommand);
            historyList.addCommand(incrementCommand);
        });
        jButtondecrement.setText("-");
        jButtondecrement.setBounds(new Rectangle(155, 25, 73, 22));
        jButtondecrement.setActionCommand("decrement");
        jButtondecrement.addActionListener(e -> {
            jButtondecrement_actionPerformed(e, decrementCommand);
            historyList.addCommand(decrementCommand);
        });
        jButtonundo.setText("undo");
        jButtonundo.setBounds(new Rectangle(30, 80, 73, 22));
        jButtonundo.addActionListener(e -> {
            jButtonundo_actionPerformed(e);
            historyList.undo();
        });
        jButtonredo.setText("redo");
        jButtonredo.setBounds(new Rectangle(155, 80, 73, 22));
        jButtonredo.addActionListener(e -> {
            jButtonredo_actionPerformed(e);
            historyList.redo();
        });
        this.getContentPane().add(jButtonredo, null);
        this.getContentPane().add(jButtonundo, null);
        this.getContentPane().add(jButtondecrement, null);
        this.getContentPane().add(jButtonIncrement, null);
    }

    private void jButtonIncrement_actionPerformed(ActionEvent e, Command command) {
      command.execute();
    }

    private void jButtondecrement_actionPerformed(ActionEvent e, Command command) {
    	command.execute();
    }

    private void jButtonundo_actionPerformed(ActionEvent e) {
    	System.out.println("undo");
    }

    private void jButtonredo_actionPerformed(ActionEvent e) {
    	System.out.println("redo");
    }
}
