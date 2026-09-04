package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TagDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TagDetailObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String name;

    public TagDetailObj(@e String str, @e String str2) {
        this.name = str;
        this.desc = str2;
    }

    public static /* synthetic */ TagDetailObj copy$default(TagDetailObj tagDetailObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tagDetailObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15014, new Class[]{TagDetailObj.class, String.class, String.class, Integer.TYPE, Object.class}, TagDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TagDetailObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tagDetailObj.name;
        }
        if ((i10 & 2) != 0) {
            str2 = tagDetailObj.desc;
        }
        return tagDetailObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final TagDetailObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15013, new Class[]{String.class, String.class}, TagDetailObj.class);
        return patchProxyResultProxy.isSupported ? (TagDetailObj) patchProxyResultProxy.result : new TagDetailObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15017, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagDetailObj)) {
            return false;
        }
        TagDetailObj tagDetailObj = (TagDetailObj) obj;
        return f0.g(this.name, tagDetailObj.name) && f0.g(this.desc, tagDetailObj.desc);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15016, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15015, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TagDetailObj(name=" + this.name + ", desc=" + this.desc + ')';
    }
}
