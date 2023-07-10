package app;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.io.File;

public class MenuPrincipal extends JMenuBar {
    public MenuPrincipal(){
        ajouterMenuFichier();
        ajouterMenuQuitter();
    }

    public void ajouterMenuFichier() {
        JMenu menu = new JMenu("File");
        JMenuItem importOption = new JMenuItem("Import");
        JMenuItem saveOption = new JMenuItem("Save");

        importOption.addActionListener((ActionEvent e) -> {
            JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            fileChooser.setDialogTitle("Sélectionnez une image");
            fileChooser.setAcceptAllFileFilterUsed(false);

            int returnValue = fileChooser.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {

                File selectedFile = fileChooser.getSelectedFile();

                System.out.println(selectedFile.getAbsolutePath());
            }
        });

        menu.add(importOption);
        menu.add(saveOption);
        this.add(menu);
    }

    public void ajouterMenuQuitter() {
        JMenuItem quitOption = new JMenuItem("Quit");

        quitOption.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        this.add(quitOption);
    }
}
