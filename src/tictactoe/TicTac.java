package tictactoe;

import javax.swing.JOptionPane;

public class TicTac extends javax.swing.JFrame {

    public static boolean win = false, boardfull = false;
    public static char[][] tictac = new char[3][3];
    public static int cnt = 0;
    //assume human start
    private char comp = 'O', human = 'X', currentPlayer = 'X';
    public static char a = 0, b = 0, c = 0;
    private static boolean humanFirst = true;

    public TicTac() {
            initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
       // System.out.println("Is human first? "+humanFirst);
        if(humanFirst){
            jButton1.setText("-");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
        }else{
            jButton1.setText("O");
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tic-Tac-Toe");

        l1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>                        

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
        if (humanFirst) {
            l1.setText("Player 1 is X and Player 2 is O. Player 1 starts first.");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tictac[i][j] = '-';
                }
            }
        }else{
            l1.setText("Player 1 is O and Player 2 is X. Player 1 starts first.");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tictac[i][j] = '-';
                }
            }
            tictac[0][0] = 'O';
        }
    }

    public int minimax(char[][] board, int depth, boolean isMax) {
        int score = evaluate(board);
        //if comp win
        if (score == 10) {
            return score;
        }
        //if human win
        if (score == -10) {
            return score;
        }
        //if board is full
        if (!isMoreMove(board)) {
            return 0;
        }

        //if now is maximizer's move
        if (isMax) {
            int best = -1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        //make a move
                        board[i][j] = comp;
                        best = Math.max(best, minimax(board, depth + 1, !isMax));
                        //reset
                        board[i][j] = '-';
                    }
                }
            }
            return best;
        } else {
            int best = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        board[i][j] = human;
                        best = Math.min(best, minimax(board, depth + 1, !isMax));
                        board[i][j] = '-';
                    }
                }
            }
            return best;
        }
    }

    public int[] findBestMove(char[][] board) {
        int[] bestMove = {-1, -1};
        //will never return -1000
        int bestScore = -1000;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    //make one move
                    board[i][j] = comp;
                    //find the score
                    int score = minimax(board, 0, false);
                    //reset
                    board[i][j] = '-';
                    if (bestScore < score) {
                        bestMove[0] = i;
                        bestMove[1] = j;
                        bestScore = score;
                    }
                }
            }
        }
        return bestMove;
    }

    public void convert(int row, int col) {
        if (row == 0 && col == 0) {
            String d = Character.toString(comp);
            jButton1.setText(d);
            tictac[row][col] = comp;
        } else if (row == 0 && col == 1) {
            String d = Character.toString(comp);
            jButton3.setText(d);
            tictac[row][col] = comp;
        } else if (row == 0 && col == 2) {
            String d = Character.toString(comp);
            jButton2.setText(d);
            tictac[row][col] = comp;
        } else if (row == 1 && col == 0) {
            String d = Character.toString(comp);
            jButton4.setText(d);
            tictac[row][col] = comp;
        } else if (row == 1 && col == 1) {
            String d = Character.toString(comp);
            jButton5.setText(d);
            tictac[row][col] = comp;
        } else if (row == 1 && col == 2) {
            String d = Character.toString(comp);
            jButton6.setText(d);
            tictac[row][col] = comp;
        } else if (row == 2 && col == 0) {
            String d = Character.toString(comp);
            jButton7.setText(d);
            tictac[row][col] = comp;
        } else if (row == 2 && col == 1) {
            String d = Character.toString(comp);
            jButton9.setText(d);
            tictac[row][col] = comp;
        } else if (row == 2 && col == 2) {
            String d = Character.toString(comp);
            jButton8.setText(d);
            tictac[row][col] = comp;
        }
    }

    public void compMove() {
        char[][] board2 = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board2[i][j] = tictac[i][j];
            }
        }
        int[] position = findBestMove(board2);
        convert(position[0], position[1]);
        WinOrDraw();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int row = 0, col = 0;
        if (tictac[row][col] == '-') {
            String d = Character.toString(human);
            jButton1.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = 0, col = 1;
        if (tictac[row][col] == '-') {
            String d = new String(Character.toString(human));
            jButton3.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = 0, col = 2;
        if (tictac[row][col] == '-') {
            String d = new String(Character.toString(human));
            jButton2.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = 1, col = 0;
        if (tictac[row][col] == '-') {

            String d = new String(Character.toString(human));
            jButton4.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = 1, col = 1;
        if (tictac[row][col] == '-') {
            String d = new String(Character.toString(human));
            jButton5.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = 1, col = 2;
        if (tictac[row][col] == '-') {
            String d = new String(Character.toString(human));
            jButton6.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = 2, col = 0;
        if (tictac[row][col] == '-') {
            String d = new String(Character.toString(human));
            jButton7.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = 2, col = 1;
        if (tictac[row][col] == '-') {
            String d = new String(Character.toString(human));
            jButton9.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = 2, col = 2;
        if (tictac[row][col] == '-') {
            String d = new String(Character.toString(human));
            jButton8.setText(d);
            tictac[row][col] = human;
            WinOrDraw();
            if(this.isMoreMove(tictac)){
                compMove();
            }
        }
    }

    public boolean isMoreMove(char tictac[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tictac[i][j] == '-') {
                    return true;
                }
            }
        }
        return false;
    }

    public int evaluate(char tictac[][]) {
        for (int i = 0; i < 3; i++) {
            a = tictac[i][0];
            b = tictac[i][1];
            c = tictac[i][2];
            if (a == b && b == c && a != '-') {
                return result(a);
            }
        }

        for (int i = 0; i < 3; i++) {
            a = tictac[0][i];
            b = tictac[1][i];
            c = tictac[2][i];
            if (a == b && b == c && a != '-') {
                return result(a);
            }
        }

        a = tictac[0][0];
        b = tictac[1][1];
        c = tictac[2][2];
        if (a == b && b == c && a != '-') {
            return result(a);
        }

        a = tictac[0][2];
        b = tictac[1][1];
        c = tictac[2][0];
        if (a == b && b == c && a != '-') {
            win = true;
            return result(a);
        }
        //if no one win return 0
        return 0;
    }

    public void WinOrDraw() {
        for (int i = 0; i < 3; i++) {
            a = tictac[i][0];
            b = tictac[i][1];
            c = tictac[i][2];
            if (a == b && b == c && a != '-') {
                resultAfterMove(a);
            }
        }

        for (int i = 0; i < 3; i++) {
            a = tictac[0][i];
            b = tictac[1][i];
            c = tictac[2][i];
            if (a == b && b == c && a != '-') {
                resultAfterMove(a);
            }
        }

        a = tictac[0][0];
        b = tictac[1][1];
        c = tictac[2][2];
        if (a == b && b == c && a != '-') {
            resultAfterMove(a);
        }

        a = tictac[0][2];
        b = tictac[1][1];
        c = tictac[2][0];
        if (a == b && b == c && a != '-') {
            resultAfterMove(a);
        }
        if (!isMoreMove(tictac)) {
            l1.setText("Draw");
            humanFirst = !humanFirst;
            int confirmdialog = JOptionPane.showConfirmDialog(this, "The match is a draw. Do you wish to play again?");
            if(confirmdialog == JOptionPane.YES_OPTION){
                this.dispose();
                new TicTac().setVisible(true);
            }    
            else
                this.dispose();
        }
    }

    public void resultAfterMove(char c) {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        if (c == comp && !humanFirst) {
            l1.setText("Player 1 wins!!");
            humanFirst = !humanFirst;
            int confirmdialog = JOptionPane.showConfirmDialog(this, "Player 1 wins! Do you wish to play again?");
            if(confirmdialog == JOptionPane.YES_OPTION){
                this.dispose();
                new TicTac().setVisible(true);
            }    
            else
                this.dispose();
        } else {
            l1.setText("Player 2 wins!!");
            humanFirst = !humanFirst;
            int confirmdialog = JOptionPane.showConfirmDialog(this, "Player 2 wins! Do you wish to play again?");
            if(confirmdialog == JOptionPane.YES_OPTION){
                this.dispose();
                new TicTac().setVisible(true);
            }    
            else
                this.dispose();
        }
    }

    public int result(char c) {
        if (c == comp) {
            return 10;
        } else {
            return -10;
        }
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    // End of variables declaration                   
}
