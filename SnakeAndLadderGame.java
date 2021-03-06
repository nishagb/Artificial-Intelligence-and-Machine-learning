
package snakeandladdergame;

import java.awt.BasicStroke;
import static java.awt.BasicStroke.CAP_ROUND;
import static java.awt.BasicStroke.JOIN_ROUND;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SnakeAndLadderGame extends javax.swing.JFrame {

    /**
     * Creates new form SnakeAndLadderGame
     */
    public SnakeAndLadderGame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StandardOrCustomSelect = new javax.swing.ButtonGroup();
        StartScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumberOfPlayers = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        SecondScreen = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Player1NameField = new javax.swing.JTextField();
        Player2NameField = new javax.swing.JTextField();
        Player3NameField = new javax.swing.JTextField();
        BackToStartScreen = new javax.swing.JButton();
        toStandardOrCustom = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CustomizeButton = new javax.swing.JRadioButton();
        NormalButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        StandardGameScreen = new javax.swing.JPanel();
        StandardGamePanel = new javax.swing.JPanel();
        CreateStandardBoard = new javax.swing.JButton();
        RollDice = new javax.swing.JButton();
        StandardDiceLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        CustomGameCreateScreen = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LengthSlider = new javax.swing.JSlider();
        HeightSlider = new javax.swing.JSlider();
        LengthLabel = new javax.swing.JLabel();
        HeightLabel = new javax.swing.JLabel();
        CreateCustomBoard = new javax.swing.JButton();
        CustomGamePanel = new javax.swing.JPanel();
        SnakeOrLadder = new javax.swing.JComboBox();
        RollDice2 = new javax.swing.JButton();
        CustomDiceLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        StartScreen.setBackground(new java.awt.Color(102, 102, 255));
        StartScreen.setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("hi: Snake and Ladder Game");

        NumberOfPlayers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "2", "1" }));
        NumberOfPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfPlayersActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Number of players");

        StartButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StartScreenLayout = new javax.swing.GroupLayout(StartScreen);
        StartScreen.setLayout(StartScreenLayout);
        StartScreenLayout.setHorizontalGroup(
            StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartScreenLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addGroup(StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StartScreenLayout.setVerticalGroup(
            StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartScreenLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        getContentPane().add(StartScreen, "card2");

        SecondScreen.setBackground(new java.awt.Color(102, 102, 255));
        SecondScreen.setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel3.setText("Player 1");

        jLabel4.setText("Player 2");

        jLabel5.setText("Player 3");

        BackToStartScreen.setText("< Back");
        BackToStartScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToStartScreenActionPerformed(evt);
            }
        });

        toStandardOrCustom.setText("Next >");
        toStandardOrCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toStandardOrCustomActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter Player Names");

        StandardOrCustomSelect.add(CustomizeButton);
        CustomizeButton.setText("Customize game");

        StandardOrCustomSelect.add(NormalButton);
        NormalButton.setText("Standard Game");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Select Game Type");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.setBackground(java.awt.Color.magenta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SecondScreenLayout = new javax.swing.GroupLayout(SecondScreen);
        SecondScreen.setLayout(SecondScreenLayout);
        SecondScreenLayout.setHorizontalGroup(
            SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(SecondScreenLayout.createSequentialGroup()
                        .addGap(0, 291, Short.MAX_VALUE)
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addGroup(SecondScreenLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(189, 189, 189)
                                    .addComponent(Player3NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SecondScreenLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(189, 189, 189)
                                    .addComponent(Player2NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SecondScreenLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(189, 189, 189)
                                    .addComponent(Player1NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(SecondScreenLayout.createSequentialGroup()
                                    .addComponent(CustomizeButton)
                                    .addGap(81, 81, 81)
                                    .addComponent(NormalButton))
                                .addGroup(SecondScreenLayout.createSequentialGroup()
                                    .addComponent(BackToStartScreen)
                                    .addGap(81, 81, 81)
                                    .addComponent(toStandardOrCustom))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 259, Short.MAX_VALUE)))
                .addContainerGap())
        );

        SecondScreenLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Player1NameField, Player2NameField, Player3NameField, jLabel3, jLabel4, jLabel5});

        SecondScreenLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jPanel2, jPanel3});

        SecondScreenLayout.setVerticalGroup(
            SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondScreenLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SecondScreenLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(Player1NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Player2NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SecondScreenLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Player3NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomizeButton)
                    .addComponent(NormalButton))
                .addGap(60, 60, 60)
                .addGroup(SecondScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackToStartScreen)
                    .addComponent(toStandardOrCustom))
                .addGap(88, 88, 88))
        );

        SecondScreenLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Player1NameField, Player2NameField, Player3NameField, jPanel1, jPanel2, jPanel3});

        getContentPane().add(SecondScreen, "card3");

        StandardGameScreen.setBackground(new java.awt.Color(102, 102, 255));
        StandardGameScreen.setPreferredSize(new java.awt.Dimension(1000, 700));

        StandardGamePanel.setBackground(new java.awt.Color(255, 255, 255));
        StandardGamePanel.setForeground(new java.awt.Color(255, 255, 255));
        StandardGamePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StandardGamePanelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout StandardGamePanelLayout = new javax.swing.GroupLayout(StandardGamePanel);
        StandardGamePanel.setLayout(StandardGamePanelLayout);
        StandardGamePanelLayout.setHorizontalGroup(
            StandardGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        StandardGamePanelLayout.setVerticalGroup(
            StandardGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        CreateStandardBoard.setText("Start");
        CreateStandardBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateStandardBoardActionPerformed(evt);
            }
        });

        RollDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollDiceActionPerformed(evt);
            }
        });

        StandardDiceLabel.setBackground(new java.awt.Color(255, 255, 255));
        StandardDiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StandardGameScreenLayout = new javax.swing.GroupLayout(StandardGameScreen);
        StandardGameScreen.setLayout(StandardGameScreenLayout);
        StandardGameScreenLayout.setHorizontalGroup(
            StandardGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StandardGameScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StandardGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(StandardGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StandardGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(RollDice, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(CreateStandardBoard)
                        .addComponent(StandardDiceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );
        StandardGameScreenLayout.setVerticalGroup(
            StandardGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StandardGameScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StandardGameScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StandardGameScreenLayout.createSequentialGroup()
                        .addComponent(StandardGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(StandardGameScreenLayout.createSequentialGroup()
                        .addComponent(CreateStandardBoard)
                        .addGap(289, 289, 289)
                        .addComponent(RollDice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(StandardDiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(65, 65, 65))))
        );

        getContentPane().add(StandardGameScreen, "card4");

        CustomGameCreateScreen.setBackground(new java.awt.Color(102, 102, 255));
        CustomGameCreateScreen.setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel8.setText("Board Length");

        jLabel9.setText("Board Height");

        LengthSlider.setMajorTickSpacing(1);
        LengthSlider.setMaximum(12);
        LengthSlider.setMinimum(5);
        LengthSlider.setMinorTickSpacing(1);
        LengthSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LengthSliderMouseClicked(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LengthSliderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LengthSliderMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LengthSliderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LengthSliderMouseClicked(evt);
            }
        });
        LengthSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LengthSliderMouseClicked(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LengthSliderMouseClicked(evt);
            }
        });

        HeightSlider.setMaximum(12);
        HeightSlider.setMinimum(5);
        HeightSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HeightSliderMouseClicked(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeightSliderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HeightSliderMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HeightSliderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeightSliderMouseClicked(evt);
            }
        });
        HeightSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeightSliderMouseClicked(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HeightSliderMouseClicked(evt);
            }
        });

        LengthLabel.setText("12");

        HeightLabel.setText("12");

        CreateCustomBoard.setText("Create Board");
        CreateCustomBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCustomBoardActionPerformed(evt);
            }
        });

        CustomGamePanel.setBackground(new java.awt.Color(255, 255, 255));
        CustomGamePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CustomGamePanelMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustomGamePanelMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CustomGamePanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout CustomGamePanelLayout = new javax.swing.GroupLayout(CustomGamePanel);
        CustomGamePanel.setLayout(CustomGamePanelLayout);
        CustomGamePanelLayout.setHorizontalGroup(
            CustomGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        CustomGamePanelLayout.setVerticalGroup(
            CustomGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        SnakeOrLadder.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Snake", "Ladder" }));

        RollDice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollDice2ActionPerformed(evt);
            }
        });

        CustomDiceLabel.setBackground(new java.awt.Color(255, 255, 255));
        CustomDiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html>\nInstructions:<<br>\nPress and drag the mouse from one box<br>\nto another to spawn snake or ladder</html>");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomGameCreateScreenLayout = new javax.swing.GroupLayout(CustomGameCreateScreen);
        CustomGameCreateScreen.setLayout(CustomGameCreateScreenLayout);
        CustomGameCreateScreenLayout.setHorizontalGroup(
            CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HeightSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(99, 99, 99)
                                .addComponent(LengthSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CustomGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                        .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(CreateCustomBoard))
                    .addComponent(SnakeOrLadder, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CustomDiceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RollDice2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CustomGameCreateScreenLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HeightLabel, LengthLabel});

        CustomGameCreateScreenLayout.setVerticalGroup(
            CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8)
                            .addComponent(LengthSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(HeightSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CreateCustomBoard)))
                .addGap(19, 19, 19)
                .addGroup(CustomGameCreateScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                        .addComponent(CustomGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(CustomGameCreateScreenLayout.createSequentialGroup()
                        .addComponent(SnakeOrLadder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(RollDice2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(CustomDiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53))))
        );

        CustomGameCreateScreenLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {HeightLabel, LengthLabel});

        getContentPane().add(CustomGameCreateScreen, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
        
    	System.out.println("inside start");
    	if (numOfPlayers == 1) {
            jLabel3.setVisible(true);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            Player1NameField.setVisible(true);
            Player2NameField.setVisible(false);
            Player3NameField.setVisible(false);
            jPanel1.setVisible(true);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
        } else if (numOfPlayers == 2) {
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(false);
            Player1NameField.setVisible(true);
            Player2NameField.setVisible(true);
            Player3NameField.setVisible(false);
            jPanel1.setVisible(true);
            jPanel2.setVisible(true);
            jPanel3.setVisible(false);
        } else if (numOfPlayers == 3) {
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            Player1NameField.setVisible(true);
            Player2NameField.setVisible(true);
            Player3NameField.setVisible(true);
            jPanel1.setVisible(true);
            jPanel2.setVisible(true);
            jPanel3.setVisible(true);
        }
        StartScreen.setVisible(false);
        SecondScreen.setVisible(true);
System.out.println("after start");
    }//GEN-LAST:event_StartButtonActionPerformed

    private void NumberOfPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfPlayersActionPerformed
        // TODO add your handling code here:
        numOfPlayers = Integer.parseInt((String) NumberOfPlayers.getSelectedItem());

    }//GEN-LAST:event_NumberOfPlayersActionPerformed

    private void toStandardOrCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStandardOrCustomActionPerformed
        // TODO add your handling code here:

        if (StandardOrCustomSelect.getSelection().equals(NormalButton.getModel())) {
            SecondScreen.setVisible(false);
            CustomGameCreateScreen.setVisible(false);
            StandardGameScreen.setVisible(true);
        } else if (StandardOrCustomSelect.getSelection().equals(CustomizeButton.getModel())) {
            SecondScreen.setVisible(false);
            CustomGameCreateScreen.setVisible(true);
            StandardGameScreen.setVisible(false);

        }

    }//GEN-LAST:event_toStandardOrCustomActionPerformed

    private void BackToStartScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToStartScreenActionPerformed
        // TODO add your handling code here:
    	//System.out.println("inside start game");
        SecondScreen.setVisible(false);
        StartScreen.setVisible(true);
    }//GEN-LAST:event_BackToStartScreenActionPerformed

    private void LengthSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LengthSliderMouseClicked
        // TODO add your handling code here:
        LengthLabel.setText(String.valueOf(LengthSlider.getValue()));
    }//GEN-LAST:event_LengthSliderMouseClicked

    private void HeightSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeightSliderMouseClicked
        // TODO add your handling code here:
        HeightLabel.setText(String.valueOf(HeightSlider.getValue()));
    }//GEN-LAST:event_HeightSliderMouseClicked

    private void CreateCustomBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCustomBoardActionPerformed
        // TODO add your handling code here:
        IniializeIcons();
        Players = new Player[numOfPlayers];
        if (numOfPlayers == 1) {
            Players[0] = new Player(Player1NameField.getText(), Color.RED);
        } else if (numOfPlayers == 2) {
            Players[0] = new Player(Player1NameField.getText(), Color.RED);
            Players[1] = new Player(Player2NameField.getText(), Color.MAGENTA);
        } else if (numOfPlayers == 3) {
            Players[0] = new Player(Player1NameField.getText(), Color.RED);
            Players[1] = new Player(Player2NameField.getText(), Color.MAGENTA);
            Players[2] = new Player(Player3NameField.getText(), Color.BLUE);
        }
        Customboardlength = LengthSlider.getValue();
        Customboardheight = HeightSlider.getValue();
        gfx = (Graphics2D) CustomGamePanel.getGraphics();
        gfx.setColor(Color.white);
        int h = (int) CustomGamePanel.getSize().getHeight();
        int l = (int) CustomGamePanel.getSize().getWidth();
        gfx.fillRect(0, 0, l, h);
        Customboxsize = 45;
        Snakes = new Snake[Customboardlength * Customboardheight];
        Ladders = new Ladder[Customboardlength * Customboardheight];
        moves=0;
        DrawPlayers();
    }//GEN-LAST:event_CreateCustomBoardActionPerformed

    private void CreateStandardBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateStandardBoardActionPerformed
        // TODO add your handling code here:
        IniializeIcons();
        Players = new Player[numOfPlayers];
        if (numOfPlayers == 1) {
            Players[0] = new Player(Player1NameField.getText(), Color.RED);
        } else if (numOfPlayers == 2) {
            Players[0] = new Player(Player1NameField.getText(), Color.RED);
            Players[1] = new Player(Player2NameField.getText(), Color.MAGENTA);
        } else if (numOfPlayers == 3) {
            Players[0] = new Player(Player1NameField.getText(), Color.RED);
            Players[1] = new Player(Player2NameField.getText(), Color.MAGENTA);
            Players[2] = new Player(Player3NameField.getText(), Color.BLUE);
        }
        gfx = (Graphics2D) StandardGamePanel.getGraphics();
        Snakes = new Snake[8 * 8];
        Ladders = new Ladder[8 * 8];
        MakeSnake(17, 2);
        MakeSnake(26, 13);
        MakeSnake(63, 32);
        MakeSnake(59, 40);
        MakeSnake(47, 20);
        MakeLadder(23, 6);
        MakeLadder(3, 28);
        MakeLadder(24, 51);
        MakeLadder(39, 60);
        MakeLadder(43, 56);
        DrawPlayers();
        moves = 0;
    }//GEN-LAST:event_CreateStandardBoardActionPerformed

    private void CustomGamePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomGamePanelMousePressed
        // TODO add your handling code here:
        start = CustomGamePanel.getMousePosition();
    }//GEN-LAST:event_CustomGamePanelMousePressed

    private void CustomGamePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomGamePanelMouseReleased
        // TODO add your handling code here:
        end = CustomGamePanel.getMousePosition();
        int a = Findcell(start);
        int b = Findcell(end);
        if (SnakeOrLadder.getSelectedItem().toString() == "Snake") {
            MakeSnake(a, b);
        } else if (SnakeOrLadder.getSelectedItem().toString() == "Ladder") {
            MakeLadder(a, b);
        }
    }//GEN-LAST:event_CustomGamePanelMouseReleased

    private void RollDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollDiceActionPerformed
        // TODO add your handling code here:
    	//System.out.println("inside roll dice game");
        GameControl();
        RollDice.setText(Players[moves % numOfPlayers].getName() + " Play");
    }//GEN-LAST:event_RollDiceActionPerformed

    private void RollDice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollDice2ActionPerformed
        // TODO add your handling code here:
        GameControl();
        RollDice2.setText(Players[moves % numOfPlayers].getName() + " Play");
    }//GEN-LAST:event_RollDice2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Winners = null;
        try {
            FileInputStream fileIn = new FileInputStream("Winners.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Winners = (ArrayList) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            Winners = new ArrayList();
        } catch (ClassNotFoundException c) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
                        try {  
            FileOutputStream fileOut = new FileOutputStream("Winners.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Winners);
            out.close();
            fileOut.close();
        } catch (IOException i) { 
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CustomGameCreateScreen.setVisible(false);
        StartScreen.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        StandardGameScreen.setVisible(false);
        StartScreen.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CustomGamePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomGamePanelMouseEntered
        // TODO add your handling code here:
        DrawPlayers();
    }//GEN-LAST:event_CustomGamePanelMouseEntered

    private void StandardGamePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StandardGamePanelMouseEntered
        // TODO add your handling code here:
        DrawPlayers();
    }//GEN-LAST:event_StandardGamePanelMouseEntered

    private void GameControl(){
    	
        
        if (GameNotDone()) {
        	
            int d=Players[moves % numOfPlayers].play(Customboardlength, Customboardheight, Snakes, Ladders);
            setIcon(d);
            DrawPlayers();
            moves++;
            
            System.out.println(Players[(moves-1) % numOfPlayers].getName()+": number on dice : "+d+" and number of moves : "+moves);
        } if (GameNotDone());else {
        	//System.out.println(Players[moves-1 % numOfPlayers].getName()+" completed the game in : "+moves+" moves");
        	moves--;
            int flag=0;
            String a,b=Players[moves % numOfPlayers].getName();
            JOptionPane.showMessageDialog(null, Players[moves % numOfPlayers].getName() + " has completed the game in " + Integer.toString(Players[moves % numOfPlayers].getScore()) + " moves");
            
            
            
            for(int i=0;i<Winners.size();i++){
                a = ((Player)Winners.get(i)).getName();
                if(a.equals(b)){
                    flag=1;
                    if(((Player)Winners.get(i)).getBestScore()> Players[moves % numOfPlayers].getScore()){
                        JOptionPane.showMessageDialog(null,"You beat your previous best score of "+Integer.toString(((Player)Winners.get(i)).getBestScore()));
                        ((Player)Winners.get(i)).setBestScore(Players[moves % numOfPlayers].getScore());
                        break;
                    }
                }
            }
            if(flag==0){
                Players[moves % numOfPlayers].setBestScore(Players[moves % numOfPlayers].getScore());
                Winners.add(Players[moves % numOfPlayers]);               
            }
        
            //System.out.println("Total number of moves : "+moves++);
        }
        
    }
    
    private void DrawGrid() {
        gfx.setStroke(new BasicStroke(2,CAP_ROUND, JOIN_ROUND));
        Point2D.Float p=new Point2D.Float();
        int n;
        for (int i = 20; i < Customboardlength * Customboxsize; i += Customboxsize) {
            for (int j = 20; j < Customboardheight * Customboxsize; j += Customboxsize) {
                gfx.setColor(Color.green);
                gfx.fillRect(i, j, Customboxsize, Customboxsize);
                gfx.setColor(Color.BLACK);
                gfx.drawRect(i, j, Customboxsize, Customboxsize);
                p.x=i+10;p.y=j+10;
                n=Findcell(p);
                gfx.drawString(Integer.toString(n),i+Customboxsize/4, j+Customboxsize/4);
            }
        }
    }
    
    private void MakeLadder(int a, int b) {
        if (min(a, b) != 1 && Ladders[a - 1] == null && Ladders[b - 1] == null && Snakes[a - 1] == null && Snakes[b - 1] == null) {
            Ladders[min(a, b) - 1] = new Ladder(a, b);
            DrawLadder(a, b);
        } else {

            JOptionPane.showMessageDialog(null, "Snake or Ladder already present");
            DrawPlayers();
        }
    }

    private void MakeSnake(int a, int b) {
        if (max(a, b) != Customboardlength * Customboardheight && Ladders[a - 1] == null && Ladders[b - 1] == null && Snakes[a - 1] == null && Snakes[b - 1] == null) {
            Snakes[max(a, b) - 1] = new Snake(a, b);
            DrawSnake(a, b);
        } else {

            JOptionPane.showMessageDialog(null, "Snake or Ladder already present");
            DrawPlayers();
        }
    }

    private void DrawLadder(int a, int b) {
        gfx.setColor(Color.yellow);
        gfx.setStroke(new BasicStroke(5, CAP_ROUND, JOIN_ROUND));
        Point2D.Float s = StandardCell(a);
        Point2D.Float r = StandardCell(b);
        s.x += Customboxsize / 4;
        s.y += Customboxsize / 2;
        r.x += Customboxsize / 4;
        r.y += Customboxsize / 2;
        gfx.draw(new Line2D.Float(s, r));
        for (int i = 1; i < 5; i++) {
            int x = (int) ((r.x * i + s.x * (5 - i)) / 5);
            int y = (int) ((r.y * i + s.y * (5 - i)) / 5);
            gfx.drawLine(x, y, x + Customboxsize / 2, y);
        }
        s.x += Customboxsize / 2;
        r.x += Customboxsize / 2;
        gfx.draw(new Line2D.Float(s, r));
    }

    private void DrawSnake(int a, int b) {
        gfx.setColor(Color.GRAY);
        gfx.setStroke(new BasicStroke(10, CAP_ROUND, JOIN_ROUND));
        Point2D.Float s = StandardCell(a);
        Point2D.Float r = StandardCell(b);
        s.x += Customboxsize / 2;
        s.y += Customboxsize / 2;
        r.x += Customboxsize / 2;
        r.y += Customboxsize / 2;
        CubicCurve2D.Float q = new CubicCurve2D.Float();
        for (int i = 0; i < 5; i++) {
            int x1 = (int) ((r.x * i + s.x * (5 - i)) / 5);
            int y1 = (int) ((r.y * i + s.y * (5 - i)) / 5);
            int x2 = (int) ((r.x * (i + 1) + s.x * (4 - i)) / 5);
            int y2 = (int) ((r.y * (i + 1) + s.y * (4 - i)) / 5);
            q.setCurve(x1, y1, x1, y2, x2, y1, x2, y2);
            gfx.draw(q);
        }
    }

    private void DrawAllSnakes() {
        for (int i = 0; i < (Customboardlength * Customboardheight); i++) {
            if (Snakes[i] != null) {
                DrawSnake(Snakes[i].mouth, Snakes[i].tail);
            }
        }
    }

    private void DrawAllLadders() {
        for (int i = 0; i < (Customboardlength * Customboardheight); i++) {
            if (Ladders[i] != null) {
                DrawLadder(Ladders[i].mouth, Ladders[i].tail);
            }
        }
    }

    private Point2D.Float StandardCell(int n) {
        Point2D.Float p = new Point2D.Float();
        if ((n % (2 * Customboardlength)) >= 1 && (n % (2 * Customboardlength) <= Customboardlength)) {
            p.x = 20 + ((n - 1) % Customboardlength) * Customboxsize;
        } else {
            if ((n % (2 * Customboardlength)) == 0) {
                p.x = 20;
            } else {
                p.x = 20 + (Customboardlength - (n - Customboardlength) % Customboardlength) * Customboxsize;
            }
        }
        p.y = 20 + (Customboardheight - (((int) ((n - 1) / Customboardlength)) + 1)) * Customboxsize;
        return p;
    }

    private int Findcell(Point2D point) {
        int x = (int) ((point.getX() - 20) / Customboxsize) + 1;
        int y = (int) ((point.getY() - 20) / Customboxsize) + 1;
        if ((Customboardheight - y) % 2 == 0) {
            return (Customboardheight - y) * Customboardlength + x;
        } else {
            return (Customboardheight - y) * Customboardlength - x + 1 + Customboardlength;
        }
    }

    private void DrawPlayers() {
        DrawGrid();
        DrawAllSnakes();
        DrawAllLadders();
        Point2D p;
        for (int i = 0; i < numOfPlayers; i++) {
            p = StandardCell(Players[i].getPosition());
            gfx.setColor(Players[i].getColor());
            gfx.fill(new Ellipse2D.Double(p.getX() + (Customboxsize * (i + 1)) / 4, p.getY() + (Customboxsize / 2), (Customboxsize / 5), (Customboxsize / 5)));
        }
        RollDice.setText(Players[moves % numOfPlayers].getName() + " Play");
        RollDice2.setText(Players[moves % numOfPlayers].getName() + " Play");
    }

    private boolean GameNotDone() {
        for (int i = 0; i < numOfPlayers; i++) {
            if (Players[i].getPosition() == Customboardlength * Customboardheight) {
                return false;
            }
        }
        return true;
    }

    private void IniializeIcons(){
        for(int i=0;i<6;i++){
            icons[i]=new ImageIcon("dice"+Integer.toString(i+1)+".png");
        }
    }
    
    private void setIcon(int i){
        StandardDiceLabel.setIcon(icons[i-1]);
        CustomDiceLabel.setIcon(icons[i-1]);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    	System.out.println("game started");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                	SnakeNLadderEfficient sol=new SnakeNLadderEfficient();
                	System.out.println("Single source shortest path calculation:");
                    sol.init();
                	
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        }
        
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SnakeAndLadderGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SnakeAndLadderGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SnakeAndLadderGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SnakeAndLadderGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SnakeAndLadderGame().setVisible(true);
            }
        });
       
    }
    
    private ImageIcon[] icons = new ImageIcon[6];
    private ArrayList Winners;
    private int numOfPlayers = 3;
    private Graphics2D gfx;
    private Point2D start;
    private Point2D end;
    private int Customboardlength = 8;
    private int Customboardheight = 8;
    private int Customboxsize = 80;
    private Ladder[] Ladders;
    private Snake[] Snakes;
    private Player[] Players;
    private int moves = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToStartScreen;
    private javax.swing.JButton CreateCustomBoard;
    private javax.swing.JButton CreateStandardBoard;
    private javax.swing.JLabel CustomDiceLabel;
    private javax.swing.JPanel CustomGameCreateScreen;
    private javax.swing.JPanel CustomGamePanel;
    private javax.swing.JRadioButton CustomizeButton;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JSlider HeightSlider;
    private javax.swing.JLabel LengthLabel;
    private javax.swing.JSlider LengthSlider;
    private javax.swing.JRadioButton NormalButton;
    private javax.swing.JComboBox NumberOfPlayers;
    private javax.swing.JTextField Player1NameField;
    private javax.swing.JTextField Player2NameField;
    private javax.swing.JTextField Player3NameField;
    private javax.swing.JButton RollDice;
    private javax.swing.JButton RollDice2;
    private javax.swing.JPanel SecondScreen;
    private javax.swing.JComboBox SnakeOrLadder;
    private javax.swing.JLabel StandardDiceLabel;
    private javax.swing.JPanel StandardGamePanel;
    private javax.swing.JPanel StandardGameScreen;
    private javax.swing.ButtonGroup StandardOrCustomSelect;
    private javax.swing.JButton StartButton;
    private javax.swing.JPanel StartScreen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton toStandardOrCustom;
    // End of variables declaration//GEN-END:variables

}
