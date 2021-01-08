package com.httpclient.test;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jourwon.httpclient.utils.MD5Utils;
import org.junit.Test;

import com.jourwon.httpclient.pojo.HttpClientResult;
import com.jourwon.httpclient.utils.HttpClientUtils;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Description: HttpClientUtils工具类测试
 *
 */
@SpringBootTest

public class HttpClientUtilsTest {

	/**
	 *
	 *
	 * @throws Exception
	 */

	String cookie = "Qx-Normal-Token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJGWUctSldUIiwiZXhwIjoxNjEwMzM2MjkxLCJpYXQiOjE2MDk5MDQyOTEsInRva2VuIjoiQkFEODI3OEMxMEU4RTRGNURGRjhDMTc0MjAyNkQ3Qzg4NENBNTU4QzMyQjMzNUI4MTk4MUIxNjQwOTM5MjFBMEZCQzMyNTMzNzNCNDI3RTEwNkVGNEZEQjZFQzEwQkE1QzNDQTUwQjlBNzUyQUJDNkQ5M0JBREIxNzkxREZFMDIzQTlFMjQ1MzkyMDE5RTE2QjIyRTc2Qjc2NjlDQUE5MjMyMTFGQUU0RThGMDNEOUI5ODBGNjUwMUJEMDFFNDgyODUwNEYzMkVDQ0QwQjVFNzUzQTkzMTYzODVDNkZGNUI0MjJCMzdBNUZBNUNDMkZDNTc3QTc0QTM3MDczQjYwRDhDMzcyQjM4OURBODNBODE4NDZDMkJBNUU5QTExNEQzNDM1NUZBNkY5Nzc2NjhDRDY1N0UzRTMwNkZDOTQ5Rjc4NUVFMjkyRTNCMjYzODhCOUVCQ0FDNjRFNEUwNUQzMTcyM0MzMjZFMkFGOEE3NjcwM0QxOUFEQzIyOURFQUE4RTk4MkVBRkEzRUQ0NEJFNTYwRkVFMzNGQjc1RkIyM0EifQ.29jFA5MYaFnimA-HBY34F0-D7hHAd6OH46eI6PS5cJ8";


	@Test
	public void getGroupLanguageAndroid() throws Exception {
		Map<String, String> headers = new TreeMap<>();
		Map<String, String> params = new TreeMap<>();
		headers.put("Cookie", cookie);
		params.put("deviceType", "android");
		params.put("appVersion", "26.1.2");
		params.put("appid", "4WE3M4A2E8");
		params.put("editionType", "personal");
		params.put("deviceId", "863323042650855android");
		params.put("timestamps", String.valueOf(System.currentTimeMillis()));
		params.put("nonce_str", "259677");
		params.put("privatekey", "WEAM65AS16EW2FA6VZCHHR6ZF4HW1R2K");

		params.forEach((k, v) -> System.out.println(k + "=" + v));

		StringBuilder s = new StringBuilder();
		params.forEach((k, v) -> s.append(k).append("=").append(v).append("&"));
		s.deleteCharAt(s.length() - 1);

		System.out.println("s ==> " + s.toString());
		String token = MD5Utils.md5(s.toString());

		System.out.println("token ==> " + token.toUpperCase());

		params.put("token", token.toUpperCase());
		params.remove("privatekey");

		HttpClientResult result = HttpClientUtils.doPost("https://www.fanyigou.com/sdoc/web/getGroupLanguage", headers, params);

		System.out.println(result);
	}



	@Test
	public void getGroupLanguageIOS() throws Exception {
		Map<String, String> headers = new TreeMap<>();
		Map<String, String> params = new TreeMap<>();
		headers.put("Cookie", cookie);
		params.put("deviceType", "iOS");
		params.put("appVersion", "6.7.4");
		params.put("appid", "4WE3M4A2E8");
		params.put("editionType", "personal");
		params.put("deviceId", "73BB21E8-C678-4449-AD87-F8EA33506EE9");
		params.put("timestamps", String.valueOf(System.currentTimeMillis()));
		params.put("nonce_str", "vqxkZQeNwNFVWZaE");
		params.put("privatekey", "WEAM65AS16EW2FA6VZCHHR6ZF4HW1R2K");

		params.forEach((k, v) -> System.out.println(k + "=" + v));

		StringBuilder s = new StringBuilder();
		params.forEach((k, v) -> s.append(k).append("=").append(v).append("&"));
		s.deleteCharAt(s.length() - 1);

		System.out.println("s ==> " + s.toString());
		String token = MD5Utils.md5(s.toString());

		System.out.println("token ==> " + token.toUpperCase());

		params.put("token", token.toUpperCase());
		params.remove("privatekey");

		HttpClientResult result = HttpClientUtils.doPost("https://www.fanyigou.com/sdoc/web/getGroupLanguage", headers, params);

		System.out.println(result);
	}

	@Test
	public void getGroupLanguageWeb() throws Exception {
		Map<String, String> headers = new TreeMap<>();
		Map<String, String> params = new TreeMap<>();
		headers.put("Cookie", cookie);
		params.put("deviceType", "web");
		//params.put("appVersion", "6.7.4");
		//params.put("appid", "4WE3M4A2E8");
		params.put("editionType", "personal");
		params.put("deviceId", "c246eae03e73c6a7c9bebc10c0c57b1b");
		params.put("timestamps", String.valueOf(System.currentTimeMillis()));
		params.put("nonce_str", "vqxkZQeNwNFVWZaE");
		params.put("privatekey", "WEAM65AS16EW2FA6VZCHHR6ZF4HW1R2K");

		params.forEach((k, v) -> System.out.println(k + "=" + v));

		StringBuilder s = new StringBuilder();
		params.forEach((k, v) -> s.append(k).append("=").append(v).append("&"));
		s.deleteCharAt(s.length() - 1);

		System.out.println("s ==> " + s.toString());
		String token = MD5Utils.md5(s.toString());

		System.out.println("token ==> " + token.toUpperCase());

		params.put("token", token.toUpperCase());
		params.remove("privatekey");

		HttpClientResult result = HttpClientUtils.doPost("https://www.fanyigou.com/sdoc/web/getGroupLanguage", headers, params);

		System.out.println(result);
	}
}
