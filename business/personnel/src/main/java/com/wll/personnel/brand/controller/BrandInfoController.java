package com.wll.personnel.brand.controller;

import com.alibaba.fastjson.JSONObject;
import com.wll.beans.brand.BrandInfo;
import com.wll.personnel.brand.service.BrandInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "brandInfo",method = RequestMethod.POST)
public class BrandInfoController {
    @Autowired
    private BrandInfoService brandInfoService;
    @RequestMapping(value = "selectAll")
    public JSONObject selectBrandInfoAll(){
        JSONObject json = new JSONObject();
        List<BrandInfo> brandInfos = brandInfoService.selectAllBrand();
        json.put("brandInfos",brandInfos);
        return json;
    }
}
