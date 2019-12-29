package com.wll.personnel.brand.service;

import com.github.pagehelper.PageInfo;
import com.wll.beans.brand.BrandInfo;

import java.util.List;

/**
 * 总公司品牌 服务层
 *
 * @author zmx
 * @date 2019-06-25
 */
public interface BrandInfoService {


    /**
     * 按条件查询总公司品牌
     *
     * @param brandInfo 总公司品牌信息
     * @return 总公司品牌集合
     */
    List<BrandInfo> selectBrandInfoSelective(BrandInfo brandInfo);

    /**
     * 按条件查询总公司品牌
     *
     * @param brandInfo 总公司品牌信息
     * @return 总公司品牌
     */
    BrandInfo selectBrandInfoOne(BrandInfo brandInfo);

    /**
     * 根据id查询总公司品牌
     *
     * @param brandId 总公司品牌ID
     * @return 总公司品牌信息
     */
    BrandInfo selectBrandInfoById(String brandId);


    /**
     * 分页查询总公司品牌信息
     *
     * @param page      当前页
     * @param size      当页行数
     * @param brandInfo 条件对象
     * @return 总公司品牌集合
     */
    PageInfo<BrandInfo> selectBrandInfoListPage(BrandInfo brandInfo, String classIds, int page, int size);

    /**
     * 新增总公司品牌
     *
     * @param brandInfo 总公司品牌信息
     * @return 结果
     */
    String insertBrandInfo(BrandInfo brandInfo);

    /**
     * 选择性新增总公司品牌
     *
     * @param brandInfo 总公司品牌信息
     * @return 结果
     */
    String insertBrandInfoSelective(BrandInfo brandInfo);

    /**
     * 修改总公司品牌
     *
     * @param brandInfo 总公司品牌信息
     * @return 结果
     */
    int updateBrandInfo(BrandInfo brandInfo);

    /**
     * 选择性修改总公司品牌
     *
     * @param brandInfo 总公司品牌信息
     * @return 结果
     */
    int updateBrandInfoSelective(BrandInfo brandInfo);
    /**
     * 修改总公司品牌状态
     *
     * @param brandInfo 总公司品牌信息
     * @return 结果
     */
    int updateBrandIsStatus(BrandInfo brandInfo);
    /**
     * 删除总公司品牌
     *
     * @param brandId 总公司品牌ID
     * @return 结果
     */
    int deleteBrandInfoById(String brandId);

    /**
     * 批量删除总公司品牌
     *
     * @param brandIds 需要删除的数据ID
     * @return 结果
     */
    int deleteBrandInfoByIds(String brandIds);


    /**
     * 查詢全部品牌
     */
    List<BrandInfo> selectAllBrand();

}
