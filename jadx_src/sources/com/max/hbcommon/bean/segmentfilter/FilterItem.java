package com.max.hbcommon.bean.segmentfilter;

import bb.c;
import com.google.gson.annotations.SerializedName;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FilterItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6933563669831129965L;
    private boolean custom_checked;
    private int custom_index;
    private String desc;
    private String down_count;
    private boolean hide = false;
    private String img_url;
    private String key;
    private List<String> show_sort_type;
    private boolean single;

    @SerializedName(alternate = {"value"}, value = "up_count")
    private String up_count;

    public FilterItem deepCopyByJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.M5, new Class[0], FilterItem.class);
        return patchProxyResultProxy.isSupported ? (FilterItem) patchProxyResultProxy.result : (FilterItem) k.a(k.p(this), FilterItem.class);
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.N5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.key;
        String str2 = ((FilterItem) obj).key;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int getCustom_index() {
        return this.custom_index;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDown_count() {
        return this.down_count;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getShow_sort_type() {
        return this.show_sort_type;
    }

    public String getUp_count() {
        return this.up_count;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.O5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isCustom_checked() {
        return this.custom_checked;
    }

    public boolean isHide() {
        return this.hide;
    }

    public boolean isSingle() {
        return this.single;
    }

    public void setCustom_checked(boolean z10) {
        this.custom_checked = z10;
    }

    public void setCustom_index(int i10) {
        this.custom_index = i10;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDown_count(String str) {
        this.down_count = str;
    }

    public void setHide(boolean z10) {
        this.hide = z10;
    }

    public void setImg_url(String str) {
        this.img_url = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setShow_sort_type(List<String> list) {
        this.show_sort_type = list;
    }

    public void setSingle(boolean z10) {
        this.single = z10;
    }

    public void setUp_count(String str) {
        this.up_count = str;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.P5, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FilterItem{key='" + this.key + "', desc='" + this.desc + "', single=" + this.single + ", custom_checked=" + this.custom_checked + '}';
    }
}
