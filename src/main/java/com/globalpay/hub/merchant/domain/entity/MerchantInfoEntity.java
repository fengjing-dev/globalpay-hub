package com.globalpay.hub.merchant.domain.entity;

import lombok.Data;

/**
 * 商户信息
 * @author fatina 2026/07/09
 */
@Data
public class MerchantInfoEntity {

    /**
     * 商户信息ID
     */
    private Long merchantInfoId;

    /**
     * 商户ID
     */
    private Long merchantId;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 商户英文名称
     */
    private String merchantEnName;

    /**
     * 商户所属国家
     */
    private Long merchantCountry;

    /**
     * 商户营业地址
     */
    private String merchantBusinessAddress;
}
