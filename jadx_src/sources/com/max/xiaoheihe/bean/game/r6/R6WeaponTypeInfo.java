package com.max.xiaoheihe.bean.game.r6;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: R6WeaponTypeInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class R6WeaponTypeInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private String f77003id;

    @e
    private String name_cn;

    public R6WeaponTypeInfo(@e String str, @e String str2) {
        this.f77003id = str;
        this.name_cn = str2;
    }

    public static /* synthetic */ R6WeaponTypeInfo copy$default(R6WeaponTypeInfo r6WeaponTypeInfo, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{r6WeaponTypeInfo, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15326, new Class[]{R6WeaponTypeInfo.class, String.class, String.class, Integer.TYPE, Object.class}, R6WeaponTypeInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (R6WeaponTypeInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = r6WeaponTypeInfo.f77003id;
        }
        if ((i10 & 2) != 0) {
            str2 = r6WeaponTypeInfo.name_cn;
        }
        return r6WeaponTypeInfo.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.f77003id;
    }

    @e
    public final String component2() {
        return this.name_cn;
    }

    @d
    public final R6WeaponTypeInfo copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15325, new Class[]{String.class, String.class}, R6WeaponTypeInfo.class);
        return patchProxyResultProxy.isSupported ? (R6WeaponTypeInfo) patchProxyResultProxy.result : new R6WeaponTypeInfo(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15329, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R6WeaponTypeInfo)) {
            return false;
        }
        R6WeaponTypeInfo r6WeaponTypeInfo = (R6WeaponTypeInfo) obj;
        return f0.g(this.f77003id, r6WeaponTypeInfo.f77003id) && f0.g(this.name_cn, r6WeaponTypeInfo.name_cn);
    }

    @e
    public final String getId() {
        return this.f77003id;
    }

    @e
    public final String getName_cn() {
        return this.name_cn;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15328, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f77003id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name_cn;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setId(@e String str) {
        this.f77003id = str;
    }

    public final void setName_cn(@e String str) {
        this.name_cn = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15327, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "R6WeaponTypeInfo(id=" + this.f77003id + ", name_cn=" + this.name_cn + ')';
    }
}
