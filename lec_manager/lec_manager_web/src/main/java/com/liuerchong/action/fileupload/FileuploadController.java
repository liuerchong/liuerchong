package com.liuerchong.action.fileupload;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.liuerchong.fastdfs.FastDFSFile;
import com.liuerchong.fastdfs.FileManager;

//@Controller
public class FileuploadController {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add( BindingResult br,MultipartFile attach, HttpServletRequest request)
	        throws IOException, MyException {
		
	    if (br.hasErrors()) {
	        return "user/add";
	    }
	    // 获取文件后缀名 
	    String ext = attach.getOriginalFilename().substring(attach.getOriginalFilename().lastIndexOf(".")+1);
	    FastDFSFile file = new FastDFSFile(attach.getBytes(),ext);
	    NameValuePair[] meta_list = new NameValuePair[4];
	    meta_list[0] = new NameValuePair("fileName", attach.getOriginalFilename());
	    meta_list[1] = new NameValuePair("fileLength", String.valueOf(attach.getSize()));
	    meta_list[2] = new NameValuePair("fileExt", ext);
	    meta_list[3] = new NameValuePair("fileAuthor", "WangLiang");
	    String filePath = FileManager.upload(file,meta_list);
	    //user.setFilePath(filePath);
	    //users.put(user.getUsername(), user);
	    return filePath;
	}
	
	//@RequestMapping(value = "/download", method = RequestMethod.GET)
	/*public ResponseEntity<byte[]> download( Model model,HttpServletResponse response) throws IOException, MyException {
	    //User u = 
	    		//users.get(username);
	    String filePath = u.getFilePath();
	    String substr = filePath.substring(filePath.indexOf("group"));
	    String group = substr.split("/")[0];
	    String remoteFileName = substr.substring(substr.indexOf("/")+1);
	    String specFileName = username + substr.substring(substr.indexOf("."));
	    return FileManager.download(group, remoteFileName,specFileName);
	}*/
}
