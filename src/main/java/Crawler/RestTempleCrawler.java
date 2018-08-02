package Crawler;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: dainan
 * @Date: 2018/7/6 11:24
 * @Description:
 */
public class RestTempleCrawler {
    private static Object  getBody(String Url){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        /*s*/
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        List<String> cookies = new ArrayList<String>();
        cookies.add("ssoid=" + "645160138b*24957a6f60c4505cd8995");
        headers.put(HttpHeaders.COOKIE,cookies);
        headers.put("access-token",Arrays.asList("645160138b*24957a6f60c4505cd8995"));
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<String, Object>();
        //设置前台参数
        params.add("req", "1");
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity(params,headers);
        ResponseEntity<String> baseRspBean = restTemplate.postForEntity(Url, httpEntity, String.class);

        return baseRspBean;
    }

   public static void main(String[] args){
       String url = "https://www.tianyancha.com/company/2358526869";
       Object result =  getBody(url);
   }
}
