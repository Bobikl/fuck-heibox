package com.max.hblogistics.bean.address;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class AdminRegionsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4856938279864313314L;
    private ArrayList<AdminRegionObj> hot_city;
    private ArrayList<AdminRegionObj> pca;
    private String pca_version;

    public ArrayList<AdminRegionObj> getHot_city() {
        return this.hot_city;
    }

    public ArrayList<AdminRegionObj> getPca() {
        return this.pca;
    }

    public String getPca_version() {
        return this.pca_version;
    }

    public void setHot_city(ArrayList<AdminRegionObj> arrayList) {
        this.hot_city = arrayList;
    }

    public void setPca(ArrayList<AdminRegionObj> arrayList) {
        this.pca = arrayList;
    }

    public void setPca_version(String str) {
        this.pca_version = str;
    }
}
