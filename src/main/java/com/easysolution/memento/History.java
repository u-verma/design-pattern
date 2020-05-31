package com.easysolution.memento;

import java.util.Stack;

public class History {

    private Stack states = new Stack<EditorState>();

    public void createHistory(EditorState editorState){
        states.push(editorState);
    }

    public EditorState restoreHistory(){
        return (EditorState) states.pop();
    }
}
