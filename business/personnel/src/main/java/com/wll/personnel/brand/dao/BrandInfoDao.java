package com.wll.personnel.brand.dao;

import com.wll.beans.brand.BrandInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 总公司品牌 数据层
 *
 * @author zmx
 * @date 2019-06-25
 */
@Component
public interface BrandInfoDao {
    /**
     * 查询总公司品牌所有信息
     *
     * @return 总公司品牌集合
     */
    List<BrandInfo> selectBrandInfoAll();

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
     * 新增总公司品牌
     *
     * @param brandInfo 总公司品牌信息
     * @return 结果
     */
    int insertBrandInfo(BrandInfo brandInfo);

    /**
     * 选择性新增总公司品牌
     *
     * @param brandInfo 总公司品牌信息
     * @return 结果
     */
    int insertBrandInfoSelective(BrandInfo brandInfo);

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
    int deleteBrandInfoByIds(@Param("brandIds") String brandIds);
    /**
     * 根据brandId查询所有品牌
     */
    List<BrandInfo> selectBrandInfoList(@Param("brandId") String brandId);
}