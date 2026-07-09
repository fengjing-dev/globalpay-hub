package com.globalpay.hub.merchant.domain.entity;

import lombok.Data;

/**
 * 商户联系人信息
 * @author fatina 2026/07/09
 */
@Data
public class MerchantContactInfoEntity {

    /**
     * 商户联系人信息ID
     */
    private Long merchantContactInfoId;

    /**
     * 商户ID
     */
    private Long merchantId;

    /**
     * 名
     */
    private String firstName;

    /**
     * 姓
     */
    private String lastName;

    /**
     * 姓名
     */
    private String name;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 电话区号
     */
    private String areaCode;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 地址
     */
    private String address;
}
