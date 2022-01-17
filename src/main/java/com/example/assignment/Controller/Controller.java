package com.example.assignment.Controller;

import com.example.assignment.Entity.Freegeoip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
public class Controller {
@Autowired
private RestTemplate restTemplate;


@GetMapping("/getdata")
public String getData(){
    String forObject = this.restTemplate.getForObject("https://freegeoip.app/json/", String.class);
    return forObject;
}
@GetMapping("/getcsv")
public String JsonToCsv(HttpServletResponse response) throws IOException {
    Freegeoip forObject = this.restTemplate.getForObject("https://freegeoip.app/json/", Freegeoip.class);

    response.setContentType("text/csv");
    String fileName ="user.csv";
    String HeaderKey ="content";
    String headervalue="attachment;filename"+fileName;
    response.setHeader(HeaderKey,headervalue);

    ICsvBeanWriter csWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);

    String[] csvHeader={"ip","country_code","country_name","region_code","region_name","city","zip_code","time_zone","latitude","longitude","metro_code"};
    String[] nameMapping={"ip","country_code","country_name","region_code","region_name","city","zip_code","time_zone","latitude","longitude","metro_code"};
    csWriter.writeHeader(csvHeader);
    csWriter.write(forObject,nameMapping);
    csWriter.close();
  return response.getWriter().toString();
}

}
