import javax.swing.*;
import java.awt.*;

public class GUI
{
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;

    public static void main(String[] args)
    {
        new GUI(); //
    }

    //constructor class
    public GUI()
    {
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        window.setVisible(true); //set the window visible
    }

    //Method that generates the window for the notepad
    public void createWindow()
    {
        window = new JFrame("Notepad"); //top bar of window text
        window.setSize(800, 600); //size of window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //window closes when clicking X

    }

    //Method that generates the text area for the notepad
    public void createTextArea()
    {
        textArea = new JTextArea();

        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder()); //creates a general border for window (looks better imo but barely visible)
        window.add(scrollPane);
    }


    //Method that creates a bar at the top of the notepad with
    public void createMenuBar()
    {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        menuFile = new JMenu("File");
        menuBar.add(menuFile);

        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);

        menuColor = new JMenu("Color");
        menuBar.add(menuColor);
    }

    //Method to add & hold the items listed in the file section
    public void createFileMenu()
    {
        iNew = new JMenuItem("New");
        menuFile.add(iNew);

        iOpen = new JMenuItem("Open");
        menuFile.add(iOpen);

        iSave = new JMenuItem("Save");
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("Save As");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);
    }



}

