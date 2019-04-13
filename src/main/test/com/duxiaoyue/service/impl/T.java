package com.duxiaoyue.service.impl;

import java.io.*;

/**
 * @author 一笑奈何
 * @create 2019-04-11 15:55
 * @desc
 **/

public class T {
    public static void main(String[] args) throws IOException {
        File file=new File("G:\\QQ下载和保存的文档\\1291482971\\FileRecv\\文件列表 - 液压与气压传动.json");
        InputStream inputStream=new FileInputStream(file);
        OutputStream outputStream=new FileOutputStream(new File("F://duxiaoyue//a.txt"));
        byte[] array=new byte[1024];
        int len=0;
        while ((inputStream.read(array))!=-1){
        outputStream.write(array,0,len);

        }
        outputStream.close();
        inputStream.close();
    }
}
