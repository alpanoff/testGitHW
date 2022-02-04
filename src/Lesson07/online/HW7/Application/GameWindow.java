package Lesson07.online.HW7.Application;

import javax.swing.*;
import java.awt.*;

//создаём окно приложения в котором будут игровое поле. настройки и др.
public class GameWindow extends JFrame {
    //задаем размер окна по высоте и ширине по заданным координатам на экране
    private int winWidth;
    private int winHeight;
    private int winPosX;
    private int winPosY;

    private JButton buttonStartGame;
    private JButton buttonEndGame;

//панель поля
    private GameField gameField;
    //панель кнопок
    private JPanel panelSettings;
    //панель настроек и кнопок
    private JPanel panelControls;


    GameWindow() {

        prepareWindow();
        //панель настроек
        prepareGameSettingsPanel();
        //панель кнопок
        prepareGameButtons();
        //панель кнопок и настроек
        prepareGameControlsPanel();
         //добавляем поле
                gameField = new GameField();
                panelSettings.add(panelControls, BorderLayout.NORTH);

                add(panelSettings, BorderLayout.EAST);
                add(gameField);



        //панель кнопок
 //       panelSettings = new JPanel();
 //       panelSettings.setLayout(new GridLayout(2,1));//добавляем 2 строки и 1 столбец
        // добавляем кнопки в панель
 //       panelSettings.add(buttonStartGame);
//        panelSettings.add(buttonEndGame);

 //       add(panelSettings, BorderLayout.EAST);//добавляем панель с кнопками

 //       add(gameField);//добавляем поле



//кнопки слева и справа
 //       add(buttonStartGame, BorderLayout.WEST);
 //       add(buttonEndGame, BorderLayout.EAST);
        //устанавливаем менеджер положения
//        setLayout(new GridLayout(15,15));
 //       for (int i = 0; i < 30; i++) {
 //           add(new Button("Text" + i));

 //       }





        setVisible(true);//отображение окна


    }

    //метод вывода окна в приложении
    private void prepareWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//при нажатии на крестик приложение закроется
        this.winWidth = 1024;
        this.winHeight = 768;
        this.winPosX = 300;
        this.winPosY = 150 ;
        setSize(winWidth, winHeight);
        setLocation(winPosX, winPosY);
        setTitle("Application");

    }
    //панель настроек
    private void prepareGameSettingsPanel() {
        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayout(2, 1));
    }
    //метод панель кнопок
    private void prepareGameButtons() {
        //добавляем кнопки
        buttonStartGame = new JButton("Start Game");
        buttonEndGame = new JButton("End Game");

    }
    //метод панель кнопок и настроек
    private void prepareGameControlsPanel() {
        panelControls = new JPanel();
        panelControls.setLayout(new GridLayout(6,1));
        //кнопки
        panelControls.add(buttonStartGame);
        panelControls.add(buttonEndGame);

    }

}
