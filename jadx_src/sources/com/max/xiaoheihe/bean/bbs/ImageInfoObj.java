package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ImageInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7508330673812135458L;
    private String fill_type;
    private String height;
    private ImageOriginalInfoObj originalinfo;
    private String originalurl;
    private String qrCodeParsed;
    private String ratio;
    private String url;
    private String width;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14313, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageInfoObj)) {
            return false;
        }
        ImageInfoObj imageInfoObj = (ImageInfoObj) obj;
        return Objects.equals(getUrl(), imageInfoObj.getUrl()) && Objects.equals(getOriginalurl(), imageInfoObj.getOriginalurl()) && Objects.equals(getOriginalinfo(), imageInfoObj.getOriginalinfo()) && Objects.equals(getQrCodeParsed(), imageInfoObj.getQrCodeParsed()) && Objects.equals(getWidth(), imageInfoObj.getWidth()) && Objects.equals(getHeight(), imageInfoObj.getHeight()) && Objects.equals(getRatio(), imageInfoObj.getRatio()) && Objects.equals(getFill_type(), imageInfoObj.getFill_type());
    }

    public String getFill_type() {
        return this.fill_type;
    }

    public String getHeight() {
        return this.height;
    }

    public ImageOriginalInfoObj getOriginalinfo() {
        return this.originalinfo;
    }

    public String getOriginalurl() {
        return this.originalurl;
    }

    public String getQrCodeParsed() {
        return this.qrCodeParsed;
    }

    public String getRatio() {
        return this.ratio;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14314, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getUrl(), getOriginalurl(), getOriginalinfo(), getQrCodeParsed(), getWidth(), getHeight(), getRatio(), getFill_type());
    }

    public void setFill_type(String str) {
        this.fill_type = str;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setOriginalinfo(ImageOriginalInfoObj imageOriginalInfoObj) {
        this.originalinfo = imageOriginalInfoObj;
    }

    public void setOriginalurl(String str) {
        this.originalurl = str;
    }

    public void setQrCodeParsed(String str) {
        this.qrCodeParsed = str;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(String str) {
        this.width = str;
    }
}
