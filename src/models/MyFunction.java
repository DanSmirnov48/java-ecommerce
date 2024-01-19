package models;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyFunction {
    
    private ImageIcon resizeImg(String imgPath, byte[] OLEimg, int width, int height){
        ImageIcon myImg;
        if(imgPath != null){
            myImg = new ImageIcon(imgPath);
        }else{
            myImg = new ImageIcon(OLEimg);
        }
        var img = myImg.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon myImage = new ImageIcon(img);
        return myImage;
    }
        
    public String BrowseImage(JLabel lbl){
        String path = null;
        var FileChooser = new JFileChooser();
        FileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        FileNameExtensionFilter FileFilter = new FileNameExtensionFilter("*.images", "jpg", "png", "gif");
        FileChooser.addChoosableFileFilter(FileFilter);

        int FileState = FileChooser.showSaveDialog(null);
        if (FileState == JFileChooser.APPROVE_OPTION){
            File selectedFile = FileChooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();

            lbl.setIcon(resizeImg(path, null, lbl.getWidth(), lbl.getHeight()));
        }else if (FileState == JFileChooser.CANCEL_OPTION){
            System.out.println("No Image was selected");
        }
        return path;
    }
}
