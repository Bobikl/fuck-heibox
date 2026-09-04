package com.max.hblogistics.bean.address;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class AddressInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4994990273363158736L;
    private String city;
    private String code;
    private String detail;
    private String district;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f70991id;
    private String is_default;
    private String name;
    private String phone;
    private String province;

    public String getCity() {
        return this.city;
    }

    public String getCode() {
        return this.code;
    }

    public String getDetail() {
        return this.detail;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getId() {
        return this.f70991id;
    }

    public String getIs_default() {
        return this.is_default;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getProvince() {
        return this.province;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setId(String str) {
        this.f70991id = str;
    }

    public void setIs_default(String str) {
        this.is_default = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setProvince(String str) {
        this.province = str;
    }
}
