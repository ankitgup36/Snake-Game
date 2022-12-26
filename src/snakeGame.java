import javax.swing.*;
import java.awt.*;

public class snakeGame {
    JFrame jFrame ;
    snakeGame(){
        jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(10,10,905,700);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // panel creation
        MyPanel newMyPanel = new MyPanel();
        newMyPanel.setBackground(Color.gray);
        jFrame.add(newMyPanel);
    }
    public static void main(String[] args) {
        snakeGame sg = new snakeGame();
    }
}