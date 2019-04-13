package com.duxiaoyue.utils;

import java.io.*;

/**
 * @author 一笑奈何
 * @create 2019-04-11 19:15
 * @desc
 **/

public class JSONToString {
    public static void main(String[] args) throws IOException {
        readJsonData("G:\\QQ下载和保存的文档\\1291482971\\FileRecv\\文件列表 - 液压与气压传动.json");
    }
    public static String readJsonData(String pactFile) throws IOException {
        // 读取文件数据
        //System.out.println("读取文件数据util");

        StringBuffer strbuffer = new StringBuffer();
        File myFile = new File(pactFile);//"D:"+File.separatorChar+"DStores.json"
        if (!myFile.exists()) {
            System.err.println("Can't Find " + pactFile);
        }
        try {
            FileInputStream fis = new FileInputStream(pactFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
            BufferedReader in  = new BufferedReader(inputStreamReader);

            String str;
            while ((str = in.readLine()) != null) {
                strbuffer.append(str);  //new String(str,"UTF-8")
            }
            in.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        //System.out.println("读取文件结束util");
        System.out.println(strbuffer.toString());
        return strbuffer.toString();
    }
    }

