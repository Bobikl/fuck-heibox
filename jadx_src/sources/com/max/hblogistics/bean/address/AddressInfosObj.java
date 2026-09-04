package com.max.hblogistics.bean.address;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class AddressInfosObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4365162902037953703L;
    private ArrayList<AddressInfoObj> addresses;
    private String pca_version;

    public ArrayList<AddressInfoObj> getAddresses() {
        return this.addresses;
    }

    public String getPca_version() {
        return this.pca_version;
    }

    public void setAddresses(ArrayList<AddressInfoObj> arrayList) {
        this.addresses = arrayList;
    }

    public void setPca_version(String str) {
        this.pca_version = str;
    }
}
