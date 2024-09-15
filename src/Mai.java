import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Main {
    public static void main(String[] args) {
        // создание окна
        JFrame frame = new JFrame("КРАКОЗЯБРА");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем две кнопки и определяем действия по нажатию
        JButton button1 = new JButton("Нажми меня");
        JButton button2 = new JButton("Тыкни в меня");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата кнопка 1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата кнопка 2");
            }
        });

        // Добавляем кнопки на панель содержимого
        frame.getContentPane().add(BorderLayout.NORTH, button1);
        frame.getContentPane().add(BorderLayout.SOUTH, button2);

        // Устанавливаем размер и отображаем окно
        frame.setSize(600, 600);
        frame.setLocation(500,130);
        frame.setVisible(true);
    }
}



