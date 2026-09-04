package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ImageOriginalInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String fsize;
    private String imgs;
    private String is_original;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14315, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageOriginalInfoObj)) {
            return false;
        }
        ImageOriginalInfoObj imageOriginalInfoObj = (ImageOriginalInfoObj) obj;
        return Objects.equals(getFsize(), imageOriginalInfoObj.getFsize()) && Objects.equals(getImgs(), imageOriginalInfoObj.getImgs()) && Objects.equals(getIs_original(), imageOriginalInfoObj.getIs_original());
    }

    public String getFsize() {
        return this.fsize;
    }

    public String getImgs() {
        return this.imgs;
    }

    public String getIs_original() {
        return this.is_original;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14316, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getFsize(), getImgs(), getIs_original());
    }

    public void setFsize(String str) {
        this.fsize = str;
    }

    public void setImgs(String str) {
        this.imgs = str;
    }

    public void setIs_original(String str) {
        this.is_original = str;
    }
}
