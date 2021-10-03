
package edu.poly.gamedoanso;

import java.awt.Dimension;

public class Doanso extends javax.swing.JFrame {
    private int socantim;
    
    //tạo ra 1 số ngẫu nhiên từ 1-100
    public void taoso(){
        socantim=(int)((Math.random() *100+1));
    }
    //check xem số người dùng nhập vào có trùng với số cần tìm không
    public void check(){
        //lấy giá trị chuỗi được nhập vào trong jtextfield và gán cho biến sonhapvao
        String sonhapvao=nhapso.getText();
        //nếu người dùng nhập vào không phải là số thì yêu cầu nhập vào số
        try{
        int sodanhap=Integer.parseInt(sonhapvao);//ép về kiểu int
        if(sodanhap<0||sodanhap>100){
            manhinh.setText("NHẬP TỪ 1-100 THÔI NHA BẠN!");
        }else{
        if(sodanhap<socantim){
            manhinh.setText("BẠN ĐOÁN SỐ LỚN HƠN THỬ XEM.");
        }
        else if(sodanhap>socantim){
            manhinh.setText("BẠN ĐOÁN SỐ NHỎ HƠN THỬ XEM.");
        }
        else if(sodanhap==socantim){
            manhinh.setText("CHÚC MỪNG! BẠN ĐÃ ĐOÁN ĐÚNG RỒI!!!");
            //lúc này ta cần tạo một số ngẫu nhiên khác 
            taoso();
        }
        }
        }catch(Exception e){
            manhinh.setText("NHẬP VÀO SỐ NGUYÊN THÔI NHA BẠN!");
        }finally{
            //tự động Focus vào ô nhập liệu
            nhapso.requestFocus();
            //tự động xóa trắng ô nhập liệu 
            nhapso.setText(null);
        }   
    }
    //đếm số lượt còn lại của người chơi
    public void soluot(){
        soluot.setText(String.valueOf((Integer.parseInt(soluot.getText()))-1));
        if(Integer.parseInt(soluot.getText())==0){
            manhinh.setText("BẠN THUA RỒI! THỬ CHƠI LẠI NHA!");
            //tạo số cần tìm mới
            taoso();
            //set số lượt về lại 10
            soluot.setText("10");
        }   
    }
    public Doanso() {
        initComponents();
    }
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        manhinh = new javax.swing.JLabel();
        soluot = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        newgame = new javax.swing.JButton();
        thu = new javax.swing.JButton();
        nhapso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manhinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manhinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manhinh.setText("HÃY ĐOÁN 1 SỐ TỪ 1-100 NHA!");
        manhinh.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        soluot.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        soluot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soluot.setText("10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(manhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(soluot, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(soluot, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        newgame.setText("Chơi lại");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });

        thu.setText("Thử");
        thu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuActionPerformed(evt);
            }
        });

        nhapso.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nhapso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapsoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(nhapso, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(thu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(newgame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jLabel1.setText("SỐ LƯỢT CÒN LẠI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//phương thức sự kiện khi nhấn enter
    private void nhapsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapsoActionPerformed
        check();
        soluot();
    }//GEN-LAST:event_nhapsoActionPerformed
//phương thức sự kiện khi bấm nút thử
    private void thuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuActionPerformed
       //chạy mothod check đồng thời chạy luôn mothod soluot để tính số lượt người dùng đã thử
       check();
       soluot();
    }//GEN-LAST:event_thuActionPerformed
//phương thức sự kiện khi bấm nút chơi lại
    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
       //khi bấm chơi lại thì tạo 1 số cần tìm mới, set lượt thử về lại 10 và màn hình như ban đầu
        taoso();
        soluot.setText("10");
        manhinh.setText("HÃY ĐOÁN 1 SỐ TỪ 1-100 NHA!");    
    }//GEN-LAST:event_newgameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Doanso gamedoanso=new Doanso();
        gamedoanso.taoso();
        gamedoanso.setVisible(true);
        //set kích thước màn hình
        gamedoanso.setSize(new Dimension(600,442));
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel manhinh;
    private javax.swing.JButton newgame;
    private javax.swing.JTextField nhapso;
    private javax.swing.JLabel soluot;
    private javax.swing.JButton thu;
    // End of variables declaration//GEN-END:variables
}
