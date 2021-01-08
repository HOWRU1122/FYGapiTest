package com.jourwon.httpclient.controller;

import com.jourwon.httpclient.db.TestResultDBManger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: get和post请求测试controller
 *
 */
@RestController
@RequestMapping("/reboot")
public class HelloWorldController {


	@GetMapping("/get")
	public String get() throws InterruptedException {


		return "1";
	}

	@GetMapping("/getWithParam")
	public String getWithParam(@RequestParam String message) {
		return "get带参请求成功,参数message: " + message;
	}


	@PostMapping("/post")
	public String post(@RequestHeader("User-Agent") String userAgent,
					   @RequestHeader("Accept") String accept,
					   @RequestHeader("Accept-Language") String acceptLanguage,
					   @RequestHeader("Accept-Encoding") String acceptEncoding,
					   @RequestHeader("Cookie") String cookie,
					   @RequestHeader("Connection") String conn) {
		// 打印请求头信息
		System.out.println("Cookie = " + cookie);
		System.out.println("Connection = " + conn);
		System.out.println("Accept = " + accept);
		System.out.println("Accept-Language = " + acceptLanguage);
		System.out.println("Accept-Encoding = " + acceptEncoding);
		System.out.println("User-Agent = " + userAgent);

		return "post带参请求成功";
	}

	@PostMapping("/postWithParam")
	public String postWithParam(@RequestParam String code, @RequestParam String message) {
		return "post无参请求成功,参数code: " + code + ",参数message: " + message;
	}



	@GetMapping("/getjd")

	public Integer postjd(String jd) throws SQLException {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Integer i = null;
		String sql = "select count(product_id) as numb from jd.jd_comment_count where `date` = CONCAT(DATE_SUB(CURDATE(), INTERVAL 1 DAY));";
		conn = TestResultDBManger.getConn();
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		List list = new ArrayList();
		if (rs.next()){
			i = rs.getInt("numb");
			System.out.println(rs.getInt("numb"));
		}
		return i;
	}

}