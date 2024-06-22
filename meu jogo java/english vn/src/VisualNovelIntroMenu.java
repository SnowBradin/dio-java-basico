import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualNovelIntroMenu {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Visual Novel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Create a panel for the menu
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create the title label
        JLabel titleLabel = new JLabel("Embark into Rick's life");
        titleLabel.setFont(new Font("Commence!", Font.BOLD, 36));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Create the start button
        JButton startButton = new JButton("Incept");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to start the game
                JOptionPane.showMessageDialog(frame, "Starting the game...");
                // Here you can switch to the game screen or start the game logic
            }
        });

        // Create the load button
        JButton loadButton = new JButton("Load Game");
        loadButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to load a saved game
                JOptionPane.showMessageDialog(frame, "Loading the game...");
                // Here you can implement the loading functionality
            }
        });

        // Create the exit button
        JButton exitButton = new JButton("Give up");
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to exit the game
                frame.dispose();
            }
        });

        // Add components to the panel
        panel.add(Box.createRigidArea(new Dimension(0, 50))); // Spacing
        panel.add(titleLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 50))); // Spacing
        panel.add(startButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing
        panel.add(loadButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing
        panel.add(exitButton);

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}
