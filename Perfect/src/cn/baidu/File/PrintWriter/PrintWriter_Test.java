package cn.baidu.File.PrintWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Test {

	public static void main(String[] args) throws IOException {
		FileOutputStream out1 = new FileOutputStream("字符打印流.txt");
		PrintWriter out = new PrintWriter(out1);
		out.println("字符打印劉");
		out.println("字符打印劉");
		out.println("字符打印劉");
		out.flush();
		out.close();
		System.out.println("写入数据完成");
	}

}
