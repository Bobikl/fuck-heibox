package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallUnitObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5212921495170038576L;

    /* JADX INFO: renamed from: cc, reason: collision with root package name */
    private String f77008cc;
    private String img;
    private String name;
    private String rate;
    private String value;

    public String getCc() {
        return this.f77008cc;
    }

    public String getImg() {
        return this.img;
    }

    public String getName() {
        return this.name;
    }

    public String getRate() {
        return this.rate;
    }

    public String getValue() {
        return this.value;
    }

    public void setCc(String str) {
        this.f77008cc = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRate(String str) {
        this.rate = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
