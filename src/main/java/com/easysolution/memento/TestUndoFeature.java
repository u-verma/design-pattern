package com.easysolution.memento;

public class TestUndoFeature {

    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("A");
        history.createHistory(editor.createState());
        editor.setContent("B");
        history.createHistory(editor.createState());
        editor.setContent("C");
        history.createHistory(editor.createState());

        editor.restore(history.restoreHistory());
        editor.restore(history.restoreHistory());
        System.out.println(editor.getContent());
    }
}
