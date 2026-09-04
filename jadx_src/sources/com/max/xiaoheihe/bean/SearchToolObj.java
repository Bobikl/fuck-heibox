package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchToolObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchToolObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String btn_text;

    @e
    private String desc;

    @e
    private String image;

    @e
    private String protocol;

    @e
    private String tag;

    @e
    private String title;

    public SearchToolObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.image = str;
        this.title = str2;
        this.desc = str3;
        this.protocol = str4;
        this.tag = str5;
        this.btn_text = str6;
    }

    public static /* synthetic */ SearchToolObj copy$default(SearchToolObj searchToolObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchToolObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.WM, new Class[]{SearchToolObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SearchToolObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchToolObj) patchProxyResultProxy.result;
        }
        return searchToolObj.copy((i10 & 1) != 0 ? searchToolObj.image : str, (i10 & 2) != 0 ? searchToolObj.title : str2, (i10 & 4) != 0 ? searchToolObj.desc : str3, (i10 & 8) != 0 ? searchToolObj.protocol : str4, (i10 & 16) != 0 ? searchToolObj.tag : str5, (i10 & 32) != 0 ? searchToolObj.btn_text : str6);
    }

    @e
    public final String component1() {
        return this.image;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final String component3() {
        return this.desc;
    }

    @e
    public final String component4() {
        return this.protocol;
    }

    @e
    public final String component5() {
        return this.tag;
    }

    @e
    public final String component6() {
        return this.btn_text;
    }

    @d
    public final SearchToolObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, c.m.VM, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, SearchToolObj.class);
        return patchProxyResultProxy.isSupported ? (SearchToolObj) patchProxyResultProxy.result : new SearchToolObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.ZM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchToolObj)) {
            return false;
        }
        SearchToolObj searchToolObj = (SearchToolObj) obj;
        return f0.g(this.image, searchToolObj.image) && f0.g(this.title, searchToolObj.title) && f0.g(this.desc, searchToolObj.desc) && f0.g(this.protocol, searchToolObj.protocol) && f0.g(this.tag, searchToolObj.tag) && f0.g(this.btn_text, searchToolObj.btn_text);
    }

    @e
    public final String getBtn_text() {
        return this.btn_text;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTag() {
        return this.tag;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.YM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protocol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tag;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.btn_text;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBtn_text(@e String str) {
        this.btn_text = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTag(@e String str) {
        this.tag = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.XM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchToolObj(image=" + this.image + ", title=" + this.title + ", desc=" + this.desc + ", protocol=" + this.protocol + ", tag=" + this.tag + ", btn_text=" + this.btn_text + ')';
    }
}
