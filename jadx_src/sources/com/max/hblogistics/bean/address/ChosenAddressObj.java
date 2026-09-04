package com.max.hblogistics.bean.address;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class ChosenAddressObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2734700121720723171L;
    private String city;
    private String district;
    private String province;

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvince() {
        return this.province;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setProvince(String str) {
        this.province = str;
    }
}
