import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
    JFrame frame = new JFrame("Tic Tac Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    boolean gameOver = false;
    JButton[][] button = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentPlayer = playerX;
    public TicTacToe() {
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setBackground(Color.darkGray);
        textLabel.setForeground(Color.white);
        textLabel.setFont(new Font("Arial", Font.BOLD, 30));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setOpaque(true);
        textLabel.setText("Tic Tac Toe");

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(3,3));
        boardPanel.setBackground(Color.darkGray);
        frame.add(boardPanel);

        for(int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++) {
                JButton tile = new JButton();
                button[r][c] = tile;
                tile.setBackground(Color.DARK_GRAY);
                tile.setForeground(Color.white);
                tile.setFont(new Font("Arial", Font.BOLD, 45));
                tile.setFocusable(false);
                boardPanel.add(tile);
                tile.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (gameOver) return;
                        JButton tile = (JButton) e.getSource();
                        if (tile.getText() == ""){
                        tile.setText(currentPlayer);
                        checkWinner();
                        if(!gameOver){

                            currentPlayer = currentPlayer == playerX ? playerO : playerX;
                            textLabel.setText(currentPlayer + " 's Turn.");
                        }
                        }
                    }
                });
            }
    }

    void checkWinner() {
        // Check rows
        for (int r = 0; r < 3; r++) {
            if (!button[r][0].getText().isEmpty() &&
                    button[r][0].getText().equals(button[r][1].getText()) &&
                    button[r][1].getText().equals(button[r][2].getText())) {
                setWinner(button[r][0], button[r][1], button[r][2]);
                gameOver = true;
                return;
            }
        }

        // Check columns
        for (int c = 0; c < 3; c++) {
            if (!button[0][c].getText().isEmpty() &&
                    button[0][c].getText().equals(button[1][c].getText()) &&
                    button[1][c].getText().equals(button[2][c].getText())) {
                setWinner(button[0][c], button[1][c], button[2][c]);
                gameOver = true;
                return;
            }
        }

        // Check diagonals
        if (!button[0][0].getText().isEmpty() &&
                button[0][0].getText().equals(button[1][1].getText()) &&
                button[1][1].getText().equals(button[2][2].getText())) {
            setWinner(button[0][0], button[1][1], button[2][2]);
            gameOver = true;
            return;
        }

        if (!button[0][2].getText().isEmpty() &&
                button[0][2].getText().equals(button[1][1].getText()) &&
                button[1][1].getText().equals(button[2][0].getText())) {
            setWinner(button[0][2], button[1][1], button[2][0]);
            gameOver = true;
            return;
        }

        // Check for a draw (if all buttons are filled)
        boolean draw = true;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (button[r][c].getText().isEmpty()) {
                    draw = false;
                    break;
                }
            }
            if (!draw) break;
        }
        if (draw) {
            textLabel.setText("It's a draw!");
            gameOver = true;
        }
    }

    void setWinner(JButton... tiles) {
        for (JButton tile : tiles) {
            tile.setForeground(Color.green);
            tile.setBackground(Color.gray);
        }
        textLabel.setText(currentPlayer + " is a winner!");
    }

    public static void main(String[] args) {
        TicTacToe n = new TicTacToe();
    }
}