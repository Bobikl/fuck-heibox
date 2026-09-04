package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LinkImageObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2231788898353262130L;
    private String degree;
    private String height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76963id;
    private int index;
    private String path;
    private String url;
    private String width;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14325, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.f76963id;
        String str2 = ((LinkImageObj) obj).f76963id;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public String getDegree() {
        return this.degree;
    }

    public String getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f76963id;
    }

    public int getIndex() {
        return this.index;
    }

    public String getPath() {
        return this.path;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWidth() {
        return this.width;
    }

    public void setDegree(String str) {
        this.degree = str;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setId(String str) {
        this.f76963id = str;
    }

    public void setIndex(int i10) {
        this.index = i10;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(String str) {
        this.width = str;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14326, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LinkImageObj{id='" + this.f76963id + "', path='" + this.path + "', url='" + this.url + "'}";
    }
}
