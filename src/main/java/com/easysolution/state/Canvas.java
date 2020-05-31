package com.easysolution.state;

public class Canvas {

    private Tool tool;

    public Canvas(Tool tool) {
        this.tool = tool;
    }

    public void mouseUp(){
        this.tool.mouseUp();
    }

    public void mouseClose(){
        this.tool.mouseDown();
    }

}
