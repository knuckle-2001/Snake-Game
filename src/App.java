import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        int boardWidth = 600 ;
        int boardHeight = boardWidth ;
        

        JFrame frame = new JFrame("Snake") ;

        //set the visibility of the JFrame
        frame.setVisible(true);

        //set the size of the JFrame
        frame.setSize(boardWidth,boardHeight) ;
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        //set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakegame = new SnakeGame(boardWidth, boardHeight) ;
        frame.add(snakegame) ;
        frame.pack();
        snakegame.requestFocus() ;
        
    }
}
