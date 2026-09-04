package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameScreenshotObj implements Serializable {
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_MOVIE = "movie";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2677897418250227845L;
    private boolean checked;
    private String thumbnail;
    private String type;
    private String url;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14857, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GameScreenshotObj gameScreenshotObj = (GameScreenshotObj) obj;
        return c.C(this.thumbnail, gameScreenshotObj.thumbnail) && c.C(this.type, gameScreenshotObj.type) && c.C(this.url, gameScreenshotObj.url);
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14858, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = c.u(this.thumbnail) ? 0 : this.thumbnail.hashCode();
        if (!c.u(this.type)) {
            iHashCode = (iHashCode * 31) + this.type.hashCode();
        }
        return !c.u(this.url) ? (iHashCode * 31) + this.url.hashCode() : iHashCode;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
