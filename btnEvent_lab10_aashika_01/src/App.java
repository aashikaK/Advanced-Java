import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
    JButton circleBtn, squareBtn, triangleBtn;
    String shape = "";

    public App() {
        circleBtn = new JButton("Circle");
        squareBtn = new JButton("Square");
        triangleBtn = new JButton("Triangle");

        circleBtn.setBounds(20, 50, 80, 30);
        squareBtn.setBounds(120, 50, 80, 30);
        triangleBtn.setBounds(220, 50, 100, 30);

        circleBtn.addActionListener(this);
        squareBtn.addActionListener(this);
        triangleBtn.addActionListener(this);

        add(circleBtn);
        add(squareBtn);
        add(triangleBtn);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == circleBtn) {
            shape = "Circle";
        } else if (e.getSource() == squareBtn) {
            shape = "Square";
        } else if (e.getSource() == triangleBtn) {
            shape = "Triangle";
        }
        repaint(); // repaint the frame
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int w = getWidth();
        int h = getHeight();
        int size = Math.min(w, h) / 3;
        int x = (w - size) / 2;
        int y = (h - size) / 2;

        switch (shape) {
            case "Circle":
                g.setColor(Color.RED);
                g.fillOval(x, y, size, size);
                break;
            case "Square":
                g.setColor(Color.BLUE);
                g.fillRect(x, y, size, size);
                break;
            case "Triangle":
                g.setColor(Color.GREEN);
                int[] xPoints = {w / 2, x, x + size};
                int[] yPoints = {y, y + size, y + size};
                g.fillPolygon(xPoints, yPoints, 3);
                break;
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
