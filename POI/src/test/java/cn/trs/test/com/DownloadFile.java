package cn.trs.test.com;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import cn.baidu.utils.UploadUtils;

public class DownloadFile extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fileName = "C:\\Users\\CGB\\Desktop\\大话数据结构.pdf";
		//设置浏览器打开数据的方式
		resp.setHeader("Content-Disposition", "attachment;filename="+fileName);  
		//设置文件MIME类型  
		resp.setContentType(getServletContext().getMimeType(fileName)); 
		//文件下载需要   一个流   两个头
		ServletOutputStream out = resp.getOutputStream();
	
        
        FileInputStream in = new FileInputStream(fileName);
        IOUtils.copy(in, out);
	
	}
	
	
	
	
	
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	
}
