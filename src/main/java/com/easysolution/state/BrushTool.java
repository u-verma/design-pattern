package com.easysolution.state;

public class BrushTool implements Tool {
    public void mouseUp() {
        System.out.println("Brush Selected");
    }

    public void mouseDown() {
        System.out.println("Brush draw");
    }
}
