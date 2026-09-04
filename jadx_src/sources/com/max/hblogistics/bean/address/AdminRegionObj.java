package com.max.hblogistics.bean.address;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class AdminRegionObj implements Serializable {
    public static final String TYPE_CITY = "city";
    public static final String TYPE_DISTRICT = "district";
    public static final String TYPE_PROVINCE = "province";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7635161409229111727L;
    private boolean checked;
    private ArrayList<AdminRegionObj> children;
    private String code;
    private String letter;
    private String name;
    private String type;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.g.Jh, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdminRegionObj adminRegionObj = (AdminRegionObj) obj;
        String str = this.code;
        if (str == null ? adminRegionObj.code != null : !str.equals(adminRegionObj.code)) {
            return false;
        }
        String str2 = this.name;
        String str3 = adminRegionObj.name;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public ArrayList<AdminRegionObj> getChildren() {
        return this.children;
    }

    public String getCode() {
        return this.code;
    }

    public String getLetter() {
        return this.letter;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.Kh, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.code;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setChildren(ArrayList<AdminRegionObj> arrayList) {
        this.children = arrayList;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setLetter(String str) {
        this.letter = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
