package com.max.xiaoheihe.bean.account.tab;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TabKeyObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TabKeyObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String key;

    @e
    private String title;

    public TabKeyObj(@e String str, @e String str2) {
        this.title = str;
        this.key = str2;
    }

    public static /* synthetic */ TabKeyObj copy$default(TabKeyObj tabKeyObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tabKeyObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14089, new Class[]{TabKeyObj.class, String.class, String.class, Integer.TYPE, Object.class}, TabKeyObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TabKeyObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tabKeyObj.title;
        }
        if ((i10 & 2) != 0) {
            str2 = tabKeyObj.key;
        }
        return tabKeyObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.key;
    }

    @d
    public final TabKeyObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14088, new Class[]{String.class, String.class}, TabKeyObj.class);
        return patchProxyResultProxy.isSupported ? (TabKeyObj) patchProxyResultProxy.result : new TabKeyObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14092, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabKeyObj)) {
            return false;
        }
        TabKeyObj tabKeyObj = (TabKeyObj) obj;
        return f0.g(this.title, tabKeyObj.title) && f0.g(this.key, tabKeyObj.key);
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14091, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14090, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TabKeyObj(title=" + this.title + ", key=" + this.key + ')';
    }
}
