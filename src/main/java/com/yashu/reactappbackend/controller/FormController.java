package com.yashu.reactappbackend.controller;

import com.yashu.reactappbackend.model.FormData;
import com.yashu.reactappbackend.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class FormController {

    @Autowired
    FormService formService;

    @GetMapping("/allData")
     public List<FormData> getAllFormData(){
         return formService.getAllFormData();
     }
    @GetMapping("/address/{address}")
    public List<FormData> getDataByAddress(@PathVariable String address){
        return formService.getDataByAddress(address);
    }

    @PostMapping("/addData")
    public String addData(@RequestBody FormData formData){
      return  formService.addData(formData);
    }
}
