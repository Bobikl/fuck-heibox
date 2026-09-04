package com.max.hblogistics.bean.logistics;

import com.max.hblogistics.bean.address.AddressInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ExpressDetailObj implements Serializable {
    public static final String LOGISTICS_STATUS_BEING_DELIVERED = "2";
    public static final String LOGISTICS_STATUS_NOT_SHIPPED = "0";
    public static final String LOGISTICS_STATUS_ON_THE_WAY = "1";
    public static final String LOGISTICS_STATUS_SINGED = "3";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7782642419670902268L;
    private AddressInfoObj address;
    private String delivery_status;
    private String express_name;
    private String img;
    private String is_sign;
    private String name;
    private String number;
    private String order_id;
    private String status_img;
    private List<ExpressTrailObj> trails;

    public AddressInfoObj getAddress() {
        return this.address;
    }

    public String getDelivery_status() {
        return this.delivery_status;
    }

    public String getExpress_name() {
        return this.express_name;
    }

    public String getImg() {
        return this.img;
    }

    public String getIs_sign() {
        return this.is_sign;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getStatus_img() {
        return this.status_img;
    }

    public List<ExpressTrailObj> getTrails() {
        return this.trails;
    }

    public void setAddress(AddressInfoObj addressInfoObj) {
        this.address = addressInfoObj;
    }

    public void setDelivery_status(String str) {
        this.delivery_status = str;
    }

    public void setExpress_name(String str) {
        this.express_name = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setIs_sign(String str) {
        this.is_sign = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setStatus_img(String str) {
        this.status_img = str;
    }

    public void setTrails(List<ExpressTrailObj> list) {
        this.trails = list;
    }
}
