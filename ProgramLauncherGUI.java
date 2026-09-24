import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ProgramLauncherGUI {

    private static final String JAVA_HOME = System.getProperty("java.home");
    private static final String JAVA_COMMAND = JAVA_HOME + File.separator + "bin" + File.separator + "java";

    public static void main(String[] args) {
        // Ensure GUI runs on the Swing Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("School Activity Launcher");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 500);
            frame.setLocationRelativeTo(null);

            // Create a panel with a grid layout for vertical buttons
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(9, 1, 8, 8));
            panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

            JLabel titleLabel = new JLabel("Choose a school activity:", JLabel.CENTER);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
            panel.add(titleLabel);

            // Activity names and corresponding filenames
            String[] activities
                "1. Biodata",
                "2. Calculator",
                "3. Relational Operators",
                "4. Menu Select",
                "5. Menu Select Copy",
                "6. Midterm Activity 1",
                "7. Midterm Activity 2"
            };

            String[] fileNames = {
                "Biodata.java",
                "Calculator.java",
                "RelationalOperators.java",
                "MenuSelect.java",
                "MenuSelectCopy.java",
                "MidtermAct1.java",
                "MidtermAct2.java"
            };

            // Generate buttons dynamically
            for (int i = 0; i < activities.length; i++) {
                final String fileName = fileNames[i];
                JButton button = new JButton(activities[i]);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        runProgram(fileName);
                    }
                });
                panel.add(button);
            }

            // Exit Button
            JButton exitButton = new JButton("8. Exit");
            exitButton.addActionListener(e -> System.exit(0));
            panel.add(exitButton);

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private static void runProgram(String fileName) {
        // Run subprocess in a separate thread so it doesn't freeze the GUI window
        new Thread(() -> {
            try {
                Process process = new ProcessBuilder(JAVA_COMMAND, fileName)
                        .inheritIO()
                        .start();
                process.waitFor();
            } catch (IOException exception) {
                JOptionPane.showMessageDialog(null, "Could not start " + fileName + ": " + exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                JOptionPane.showMessageDialog(null, "The program was interrupted.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }).start();
    }
}
    
