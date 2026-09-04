package com.max.xiaoheihe.bean.webintercept;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TagJsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TagJsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String js;

    @e
    private String tag;

    public TagJsObj(@e String str, @e String str2) {
        this.tag = str;
        this.js = str2;
    }

    public static /* synthetic */ TagJsObj copy$default(TagJsObj tagJsObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tagJsObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16234, new Class[]{TagJsObj.class, String.class, String.class, Integer.TYPE, Object.class}, TagJsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TagJsObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tagJsObj.tag;
        }
        if ((i10 & 2) != 0) {
            str2 = tagJsObj.js;
        }
        return tagJsObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.tag;
    }

    @e
    public final String component2() {
        return this.js;
    }

    @d
    public final TagJsObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 16233, new Class[]{String.class, String.class}, TagJsObj.class);
        return patchProxyResultProxy.isSupported ? (TagJsObj) patchProxyResultProxy.result : new TagJsObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16237, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagJsObj)) {
            return false;
        }
        TagJsObj tagJsObj = (TagJsObj) obj;
        return f0.g(this.tag, tagJsObj.tag) && f0.g(this.js, tagJsObj.js);
    }

    @e
    public final String getJs() {
        return this.js;
    }

    @e
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16236, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.tag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.js;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setJs(@e String str) {
        this.js = str;
    }

    public final void setTag(@e String str) {
        this.tag = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16235, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TagJsObj(tag=" + this.tag + ", js=" + this.js + ')';
    }
}
