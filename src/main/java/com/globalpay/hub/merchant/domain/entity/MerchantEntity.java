package com.globalpay.hub.merchant.domain.entity;

import lombok.Data;

/**
 * 商户
 * @author fatina 2026/07/09
 */
@Data
public class MerchantEntity {

    /**
     * 商户ID
     */
    private Long merchantId;

    /**
     * 商户编码
     */
    private String merchantCode;

    /**
     * 商户类别编码
     */
    private Long mccCode;

    /**
     * 商户状态
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long modifyTime;
}
