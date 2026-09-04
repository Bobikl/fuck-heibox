package com.max.hbcommon.bean;

import bb.c;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FiltersObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8120703763648863852L;
    private boolean checked;
    private String desc;

    @SerializedName(alternate = {"items"}, value = "filters")
    private List<KeyDescObj> filters;
    private String group_name;
    private String key;
    private String multiselect;
    private String tab;
    private String value;
    private List<KeyDescObj> values;

    public String getDesc() {
        return this.desc;
    }

    public List<KeyDescObj> getFilters() {
        return this.filters;
    }

    public String getGroup_name() {
        return this.group_name;
    }

    public String getKey() {
        return this.key;
    }

    public String getMultiselect() {
        return this.multiselect;
    }

    public String getTab() {
        return this.tab;
    }

    public String getValue() {
        return this.value;
    }

    public List<KeyDescObj> getValues() {
        return this.values;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setFilters(List<KeyDescObj> list) {
        this.filters = list;
    }

    public void setGroup_name(String str) {
        this.group_name = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMultiselect(String str) {
        this.multiselect = str;
    }

    public void setTab(String str) {
        this.tab = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setValues(List<KeyDescObj> list) {
        this.values = list;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.I3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FiltersObj{desc='" + this.desc + "', key='" + this.key + "', value='" + this.value + "', tab='" + this.tab + "', filters=" + this.filters + ", values=" + this.values + ", multiselect='" + this.multiselect + "', group_name='" + this.group_name + "', checked=" + this.checked + '}';
    }
}
