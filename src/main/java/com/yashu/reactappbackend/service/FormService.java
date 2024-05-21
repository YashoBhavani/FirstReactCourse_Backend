package com.yashu.reactappbackend.service;

import com.yashu.reactappbackend.model.FormData;
import com.yashu.reactappbackend.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {
    @Autowired
    FormRepository formRepository;
    public List<FormData> getAllFormData(){
        return formRepository.findAll();
    }

    public List<FormData> getDataByAddress(String address) {
        return formRepository.findByAddress(address);
    }

    public String addData(FormData formData) {
        System.out.println(formData);
        formRepository.save(formData);
        return "Success";
    }
}
