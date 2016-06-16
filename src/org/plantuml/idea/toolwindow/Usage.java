package org.plantuml.idea.toolwindow;

import javax.swing.*;

public class Usage extends JTextArea {
    public static final String TEXT =
            "- Open file, put the cursor inside of PlantUML code to render it\n"
                    + "- A new file can be created from template (File | New | select e.g. 'UML Sequence' template)\n"
                    + "- Diagram code can be placed anywhere, '*' are ignored for usage in Java comments\n"
                    + "- To render other than sequence diagram types, open settings and setup path to Graphviz\n"
                    + "- About screen tests your installation\n"
                    + "- You can disable automatic rendering and use shortcut Alt+D, or reload button in the toolbar\n"
                    + "- Image cache size can be tuned in the settings, if you have not enough heap.\n"
                    + "- You can use intention to reverse arrows (Alt+Enter)\n"
                    + "- Cursor on top of @startuml allows to use following intentions:\n"
                    + "  - disable syntax check\n"
                    + "  - enable partial rendering - renders each page on it's own, useful for big sequence diagram files\n"
                    + "";

    public Usage() {
        this("");
    }

    public Usage(String prefix) {
        setOpaque(false);
        setText(prefix + TEXT);
        setFont(getFont().deriveFont(14f)); // will only change size to 12pt
        setEditable(false);

    }
}