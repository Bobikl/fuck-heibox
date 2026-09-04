package com.max.basebbs.bean.video;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class VideoOptionUrlsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2037779592746001873L;
    private String desc;
    private String seg_type;
    private String src;
    private String type;
    private String vid;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Wf, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoOptionUrlsObj)) {
            return false;
        }
        VideoOptionUrlsObj videoOptionUrlsObj = (VideoOptionUrlsObj) obj;
        return Objects.equals(getDesc(), videoOptionUrlsObj.getDesc()) && Objects.equals(getSeg_type(), videoOptionUrlsObj.getSeg_type()) && Objects.equals(getSrc(), videoOptionUrlsObj.getSrc()) && Objects.equals(getType(), videoOptionUrlsObj.getType()) && Objects.equals(getVid(), videoOptionUrlsObj.getVid());
    }

    public String getDesc() {
        return this.desc;
    }

    public String getSeg_type() {
        return this.seg_type;
    }

    public String getSrc() {
        return this.src;
    }

    public String getType() {
        return this.type;
    }

    public String getVid() {
        return this.vid;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Xf, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getDesc(), getSeg_type(), getSrc(), getType(), getVid());
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setSeg_type(String str) {
        this.seg_type = str;
    }

    public void setSrc(String str) {
        this.src = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVid(String str) {
        this.vid = str;
    }
}
