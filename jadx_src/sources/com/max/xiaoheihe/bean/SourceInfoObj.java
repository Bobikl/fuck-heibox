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

/* JADX INFO: compiled from: SourceInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SourceInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String source_id;

    @e
    private String source_type;

    public SourceInfoObj(@e String str, @e String str2) {
        this.source_type = str;
        this.source_id = str2;
    }

    public static /* synthetic */ SourceInfoObj copy$default(SourceInfoObj sourceInfoObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sourceInfoObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.gN, new Class[]{SourceInfoObj.class, String.class, String.class, Integer.TYPE, Object.class}, SourceInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SourceInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = sourceInfoObj.source_type;
        }
        if ((i10 & 2) != 0) {
            str2 = sourceInfoObj.source_id;
        }
        return sourceInfoObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.source_type;
    }

    @e
    public final String component2() {
        return this.source_id;
    }

    @d
    public final SourceInfoObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.fN, new Class[]{String.class, String.class}, SourceInfoObj.class);
        return patchProxyResultProxy.isSupported ? (SourceInfoObj) patchProxyResultProxy.result : new SourceInfoObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.jN, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceInfoObj)) {
            return false;
        }
        SourceInfoObj sourceInfoObj = (SourceInfoObj) obj;
        return f0.g(this.source_type, sourceInfoObj.source_type) && f0.g(this.source_id, sourceInfoObj.source_id);
    }

    @e
    public final String getSource_id() {
        return this.source_id;
    }

    @e
    public final String getSource_type() {
        return this.source_type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.iN, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.source_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source_id;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setSource_id(@e String str) {
        this.source_id = str;
    }

    public final void setSource_type(@e String str) {
        this.source_type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.hN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SourceInfoObj(source_type=" + this.source_type + ", source_id=" + this.source_id + ')';
    }
}
