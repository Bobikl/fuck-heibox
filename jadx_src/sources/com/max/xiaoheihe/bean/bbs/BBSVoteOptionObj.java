package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSVoteOptionObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String imgpath;
    private String imgurl;
    private String text;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14206, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BBSVoteOptionObj bBSVoteOptionObj = (BBSVoteOptionObj) obj;
        String str = this.text;
        if (str == null ? bBSVoteOptionObj.text != null : !str.equals(bBSVoteOptionObj.text)) {
            return false;
        }
        String str2 = this.imgurl;
        if (str2 == null ? bBSVoteOptionObj.imgurl != null : !str2.equals(bBSVoteOptionObj.imgurl)) {
            return false;
        }
        String str3 = this.imgpath;
        String str4 = bBSVoteOptionObj.imgpath;
        if (str3 != null) {
            return str3.equals(str4);
        }
        return str4 == null;
    }

    public String getImgpath() {
        return this.imgpath;
    }

    public String getImgurl() {
        return this.imgurl;
    }

    public String getText() {
        return this.text;
    }

    public void setImgpath(String str) {
        this.imgpath = str;
    }

    public void setImgurl(String str) {
        this.imgurl = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}
