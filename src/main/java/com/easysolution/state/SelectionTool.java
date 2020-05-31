package com.easysolution.state;

public class SelectionTool implements Tool {
    public void mouseUp() {
        System.out.println("rectangle Selected");
    }

    public void mouseDown() {
        System.out.println("draw rectangle");
    }
}
