package object;

import inf.Create;

import javax.swing.*;

public class Label implements Create {

    @Override
    public void crate(String text) {
        JLabel label = new JLabel(text);
    }

    @Override
    public void crate() {
        JLabel label = new JLabel();
    }
}