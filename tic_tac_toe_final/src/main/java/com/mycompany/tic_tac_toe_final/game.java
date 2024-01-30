package com.mycompany.tic_tac_toe_final;


import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class game extends javax.swing.JFrame {
    private String startGame="X";
    private int i=0;
    public game() {
        initComponents();
    }
    private void choose_a_player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        }
        else{
            startGame="X";
        }
    }
    private void winingGame(){
        String b1=txtbtn1.getText();
        String b2=txtbtn2.getText();
        String b3=txtbtn3.getText();
        
        String b4=txtbtn4.getText();
        String b5=txtbtn5.getText();
        String b6=txtbtn6.getText();
        
        String b7=txtbtn7.getText();
        String b8=txtbtn8.getText();
        String b9=txtbtn9.getText();
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
            txtbtn1.setBackground(Color.black);
            txtbtn2.setBackground(Color.black);
            txtbtn3.setBackground(Color.black);
            
            txtbtn1.setForeground(Color.white);
            txtbtn2.setForeground(Color.white);
            txtbtn3.setForeground(Color.white);
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);           
            txtbtn4.setBackground(Color.black);
            txtbtn5.setBackground(Color.black);
            txtbtn6.setBackground(Color.black);
            
            txtbtn4.setForeground(Color.white);
            txtbtn5.setForeground(Color.white);
            txtbtn6.setForeground(Color.white);      
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn7.setBackground(Color.black);
            txtbtn8.setBackground(Color.black);
            txtbtn9.setBackground(Color.black);
            
            txtbtn7.setForeground(Color.white);
            txtbtn8.setForeground(Color.white);
            txtbtn9.setForeground(Color.white);        
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.black);
            txtbtn4.setBackground(Color.black);
            txtbtn7.setBackground(Color.black);
            
            txtbtn1.setForeground(Color.white);
            txtbtn4.setForeground(Color.white);
            txtbtn7.setForeground(Color.white);          
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn2.setBackground(Color.black);
            txtbtn5.setBackground(Color.black);
            txtbtn8.setBackground(Color.black);
            
            txtbtn2.setForeground(Color.white);
            txtbtn5.setForeground(Color.white);
            txtbtn8.setForeground(Color.white);        
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn3.setBackground(Color.black);
            txtbtn6.setBackground(Color.black);
            txtbtn9.setBackground(Color.black);
            
            txtbtn3.setForeground(Color.white);
            txtbtn6.setForeground(Color.white);
            txtbtn9.setForeground(Color.white);         
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.black);
            txtbtn5.setBackground(Color.black);
            txtbtn9.setBackground(Color.black);
            
            txtbtn1.setForeground(Color.white);
            txtbtn5.setForeground(Color.white);
            txtbtn9.setForeground(Color.white);           
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn3.setBackground(Color.black);
            txtbtn5.setBackground(Color.black);
            txtbtn7.setBackground(Color.black);
            
            txtbtn3.setForeground(Color.white);
            txtbtn5.setForeground(Color.white);
            txtbtn7.setForeground(Color.white);         
        }
        
        
        
        // PLAYER O CODING
        
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.black);
            txtbtn2.setBackground(Color.black);
            txtbtn3.setBackground(Color.black);
            
            txtbtn1.setForeground(Color.white);
            txtbtn2.setForeground(Color.white);
            txtbtn3.setForeground(Color.white);
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn4.setBackground(Color.black);
            txtbtn5.setBackground(Color.black);
            txtbtn6.setBackground(Color.black);
            
            txtbtn4.setForeground(Color.white);
            txtbtn5.setForeground(Color.white);
            txtbtn6.setForeground(Color.white);    
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn7.setBackground(Color.black);
            txtbtn8.setBackground(Color.black);
            txtbtn9.setBackground(Color.black);
            
            txtbtn7.setForeground(Color.white);
            txtbtn8.setForeground(Color.white);
            txtbtn9.setForeground(Color.white);  
 
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.black);
            txtbtn4.setBackground(Color.black);
            txtbtn7.setBackground(Color.black);
            
            txtbtn1.setForeground(Color.white);
            txtbtn4.setForeground(Color.white);
            txtbtn7.setForeground(Color.white); 
            
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn2.setBackground(Color.black);
            txtbtn5.setBackground(Color.black);
            txtbtn8.setBackground(Color.black);
            
            txtbtn2.setForeground(Color.white);
            txtbtn5.setForeground(Color.white);
            txtbtn8.setForeground(Color.white);               
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             txtbtn3.setBackground(Color.black);
            txtbtn6.setBackground(Color.black);
            txtbtn9.setBackground(Color.black);
            
            txtbtn3.setForeground(Color.white);
            txtbtn6.setForeground(Color.white);
            txtbtn9.setForeground(Color.white);    
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.black);
            txtbtn5.setBackground(Color.black);
            txtbtn9.setBackground(Color.black);
            
            txtbtn1.setForeground(Color.white);
            txtbtn5.setForeground(Color.white);
            txtbtn9.setForeground(Color.white);                
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            txtbtn3.setBackground(Color.black);
            txtbtn5.setBackground(Color.black);
            txtbtn7.setBackground(Color.black);
            
            txtbtn3.setForeground(Color.white);
            txtbtn5.setForeground(Color.white);
            txtbtn7.setForeground(Color.white);         
        }
        if(i==9){
            JOptionPane.showMessageDialog(this, "No one wins ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            i=0;
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 0, 0));
        txtexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        try{
        if (txtbtn1.getText().equals("X")|| txtbtn1.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Cell is already occupied, invalid move. Please select a different cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn1.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn1.setForeground(Color.black);
                i++;
            } else {
                txtbtn1.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }}
        catch(NullPointerException e){
                txtbtn1.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn1.setForeground(Color.black);
                i++;
            } else {
                txtbtn1.setForeground(Color.red);
                i++;
            }
           choose_a_player();
           winingGame();
        }   
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        try{
        if (txtbtn2.getText().equals("X")|| txtbtn2.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn2.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn2.setForeground(Color.black);
                i++;
            } else {
                txtbtn2.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }}
        catch(NullPointerException e){
                txtbtn2.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn2.setForeground(Color.black);
                i++;
            } else {
                txtbtn2.setForeground(Color.red);
                i++;
            }
           choose_a_player();
           winingGame();
        }   
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        try{
            if (txtbtn3.getText().equals("X")|| txtbtn3.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn3.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn3.setForeground(Color.black);
                i++;
            } else {
                txtbtn3.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            txtbtn3.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn3.setForeground(Color.black);
                i++;
            } else {
                txtbtn3.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        try{
            if (txtbtn4.getText().equals("X")|| txtbtn4.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn4.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn4.setForeground(Color.black);
                i++;
            } else {
                txtbtn4.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            txtbtn4.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn4.setForeground(Color.black);
                i++;
            } else {
                txtbtn4.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
       try{
            if (txtbtn5.getText().equals("X")|| txtbtn5.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn5.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn5.setForeground(Color.black);
                i++;
            } else {
                txtbtn5.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            txtbtn5.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn5.setForeground(Color.black);
                i++;
            } else {
                txtbtn5.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        try{
            if (txtbtn6.getText().equals("X")|| txtbtn6.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn6.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn6.setForeground(Color.black);
                i++;
            } else {
                txtbtn6.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            txtbtn6.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn6.setForeground(Color.black);
                i++;
            } else {
                txtbtn6.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        try{
            if (txtbtn8.getText().equals("X")|| txtbtn8.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn8.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn8.setForeground(Color.black);
                i++;
            } else {
                txtbtn8.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            txtbtn8.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn8.setForeground(Color.black);
                i++;
            } else {
                txtbtn8.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        try{
            if (txtbtn7.getText().equals("X")|| txtbtn7.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn7.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn7.setForeground(Color.black);
                i++;
            } else {
                txtbtn7.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            txtbtn7.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn7.setForeground(Color.black);
                i++;
            } else {
                txtbtn7.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        try{
            if (txtbtn9.getText().equals("X")|| txtbtn9.getText().equals("O")) {
            
            JOptionPane.showMessageDialog(null, "Invalid move: cell already occupied. Please choose another cell.", "Error", JOptionPane.ERROR_MESSAGE);          
        }
        else{
           txtbtn9.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn9.setForeground(Color.black);
                i++;
            } else {
                txtbtn9.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
        }
        catch(NullPointerException e){
            txtbtn9.setText(startGame);
           if (startGame.equalsIgnoreCase("X")) {
                txtbtn9.setForeground(Color.black);
                i++;
            } else {
                txtbtn9.setForeground(Color.red);
                i++;
            }
            choose_a_player();
            winingGame();
        }
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
            // TODO add your handling code here:
            JFrame frame=new JFrame("Exit");
            if(JOptionPane.showConfirmDialog(frame,"confirm if you want to Exit","Tic Tac,Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn1.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
       
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.lightGray);
        txtbtn3.setBackground(Color.lightGray);
        txtbtn4.setBackground(Color.lightGray);
        txtbtn5.setBackground(Color.lightGray);
        txtbtn6.setBackground(Color.lightGray);
        txtbtn7.setBackground(Color.lightGray);
        txtbtn8.setBackground(Color.lightGray);
        txtbtn9.setBackground(Color.lightGray);
        i=0;
    }//GEN-LAST:event_txtresetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
