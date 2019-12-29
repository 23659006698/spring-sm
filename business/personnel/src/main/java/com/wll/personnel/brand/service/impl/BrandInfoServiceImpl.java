package com.wll.personnel.brand.service.impl;


import com.github.pagehelper.PageInfo;
import com.wll.beans.brand.BrandInfo;
import com.wll.personnel.brand.dao.BrandInfoDao;
import com.wll.personnel.brand.service.BrandInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 总公司品牌 服务层实现
 *
 * @author
 * @date 2019-06-25
 */
@Service
public class BrandInfoServiceImpl implements BrandInfoService {
    @Autowired
    private BrandInfoDao brandInfoDao;


    @Override
    public List<BrandInfo> selectBrandInfoSelective(BrandInfo brandInfo) {
        return null;
    }

    @Override
    public BrandInfo selectBrandInfoOne(BrandInfo brandInfo) {
        return null;
    }

    @Override
    public BrandInfo selectBrandInfoById(String brandId) {
        return null;
    }

    @Override
    public PageInfo<BrandInfo> selectBrandInfoListPage(BrandInfo brandInfo, String classIds, int page, int size) {
        return null;
    }

    @Override
    public String insertBrandInfo(BrandInfo brandInfo) {
        return null;
    }

    @Override
    public String insertBrandInfoSelective(BrandInfo brandInfo) {
        return null;
    }

    @Override
    public int updateBrandInfo(BrandInfo brandInfo) {
        return 0;
    }

    @Override
    public int updateBrandInfoSelective(BrandInfo brandInfo) {
        return 0;
    }

    @Override
    public int updateBrandIsStatus(BrandInfo brandInfo) {
        return 0;
    }

    @Override
    public int deleteBrandInfoById(String brandId) {
        return 0;
    }

    @Override
    public int deleteBrandInfoByIds(String brandIds) {
        return 0;
    }

    @Override
    public List<BrandInfo> selectAllBrand() {
        List<BrandInfo> brandInfos = brandInfoDao.selectBrandInfoAll();
        return brandInfos;
    }

}
