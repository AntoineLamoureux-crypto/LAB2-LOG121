package app;

import javax.swing.*;
import java.awt.*;

public class FenetrePrincipal extends JFrame  {
    private final PanneauVignette panneauVignette;
    private final PanneauTranslation panneauTranslation;
    private final PanneauZoom panneauZoom;
    private final MenuPrincipal menuPrincipal;

    public FenetrePrincipal() {
        this.panneauVignette = new PanneauVignette();
        this.panneauTranslation = new PanneauTranslation();
        this.panneauZoom = new PanneauZoom();
        this.menuPrincipal = new MenuPrincipal();

        this.setJMenuBar(this.menuPrincipal);

        this.add(panneauVignette);
        this.add(panneauTranslation);
        this.add(panneauZoom);

        this.setTitle("Fenêtre principal");
        this.setSize(1000, 500);
        this.setLayout(new GridLayout(1, 3));
        this.setVisible(true);
    }
}
