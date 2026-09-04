package com.max.basebbs.bean.video;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class VideoUrlsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6424120030159029865L;
    private String length;
    private String order;
    private String url;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Yf, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUrlsObj)) {
            return false;
        }
        VideoUrlsObj videoUrlsObj = (VideoUrlsObj) obj;
        return Objects.equals(getLength(), videoUrlsObj.getLength()) && Objects.equals(getOrder(), videoUrlsObj.getOrder()) && Objects.equals(getUrl(), videoUrlsObj.getUrl());
    }

    public String getLength() {
        return this.length;
    }

    public String getOrder() {
        return this.order;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Zf, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getLength(), getOrder(), getUrl());
    }

    public void setLength(String str) {
        this.length = str;
    }

    public void setOrder(String str) {
        this.order = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
