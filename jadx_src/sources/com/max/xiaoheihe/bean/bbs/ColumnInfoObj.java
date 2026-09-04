package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ColumnInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ColumnInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private String f76961id;

    @e
    private String thumb;

    @e
    private String title;

    @e
    private String url;

    public ColumnInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.desc = str;
        this.f76961id = str2;
        this.thumb = str3;
        this.title = str4;
        this.url = str5;
    }

    public static /* synthetic */ ColumnInfoObj copy$default(ColumnInfoObj columnInfoObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{columnInfoObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 14243, new Class[]{ColumnInfoObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ColumnInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ColumnInfoObj) patchProxyResultProxy.result;
        }
        return columnInfoObj.copy((i10 & 1) != 0 ? columnInfoObj.desc : str, (i10 & 2) != 0 ? columnInfoObj.f76961id : str2, (i10 & 4) != 0 ? columnInfoObj.thumb : str3, (i10 & 8) != 0 ? columnInfoObj.title : str4, (i10 & 16) != 0 ? columnInfoObj.url : str5);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.f76961id;
    }

    @e
    public final String component3() {
        return this.thumb;
    }

    @e
    public final String component4() {
        return this.title;
    }

    @e
    public final String component5() {
        return this.url;
    }

    @d
    public final ColumnInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 14242, new Class[]{String.class, String.class, String.class, String.class, String.class}, ColumnInfoObj.class);
        return patchProxyResultProxy.isSupported ? (ColumnInfoObj) patchProxyResultProxy.result : new ColumnInfoObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14246, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnInfoObj)) {
            return false;
        }
        ColumnInfoObj columnInfoObj = (ColumnInfoObj) obj;
        return f0.g(this.desc, columnInfoObj.desc) && f0.g(this.f76961id, columnInfoObj.f76961id) && f0.g(this.thumb, columnInfoObj.thumb) && f0.g(this.title, columnInfoObj.title) && f0.g(this.url, columnInfoObj.url);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getId() {
        return this.f76961id;
    }

    @e
    public final String getThumb() {
        return this.thumb;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14245, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f76961id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumb;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setId(@e String str) {
        this.f76961id = str;
    }

    public final void setThumb(@e String str) {
        this.thumb = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14244, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ColumnInfoObj(desc=" + this.desc + ", id=" + this.f76961id + ", thumb=" + this.thumb + ", title=" + this.title + ", url=" + this.url + ')';
    }
}
