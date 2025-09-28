package ex1_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingNumberApp {
    public static void main(String[] args) {
        // Створюємо вікно
        JFrame frame = new JFrame("Number Input App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Створюємо компоненти
        JLabel titleLabel = new JLabel("Введіть ціле число:");
        JTextField numberField = new JTextField(10);
        JButton showButton = new JButton("Показати число");
        JLabel resultLabel = new JLabel();

        // Додаємо обробник подій для кнопки
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    resultLabel.setText("Ви ввели число " + number);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Будь ласка, введіть коректне число!");
                }
            }
        });

        // Додаємо компоненти до вікна
        frame.add(titleLabel);
        frame.add(numberField);
        frame.add(showButton);
        frame.add(resultLabel);

        // Відображаємо вікно
        frame.setVisible(true);
    }
}