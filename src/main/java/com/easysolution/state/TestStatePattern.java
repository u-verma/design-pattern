package com.easysolution.state;

public class TestStatePattern {

    public static void main(String[] args) {
        Canvas canvas =  new Canvas(new BrushTool());
        canvas.mouseUp();
        canvas.mouseClose();

        Canvas canvas2 =  new Canvas(new SelectionTool());
        canvas2.mouseUp();
        canvas2.mouseClose();
    }
}
