package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicAddFreeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicAddFreeAssets implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f76976id;

    @e
    private String key;

    @e
    private String source;

    public EpicAddFreeAssets(@e String str, int i10, @e String str2) {
        this.source = str;
        this.f76976id = i10;
        this.key = str2;
    }

    public static /* synthetic */ EpicAddFreeAssets copy$default(EpicAddFreeAssets epicAddFreeAssets, String str, int i10, String str2, int i11, Object obj) {
        Object[] objArr = {epicAddFreeAssets, str, new Integer(i10), str2, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15147, new Class[]{EpicAddFreeAssets.class, String.class, cls, String.class, cls, Object.class}, EpicAddFreeAssets.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicAddFreeAssets) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            str = epicAddFreeAssets.source;
        }
        if ((i11 & 2) != 0) {
            i10 = epicAddFreeAssets.f76976id;
        }
        if ((i11 & 4) != 0) {
            str2 = epicAddFreeAssets.key;
        }
        return epicAddFreeAssets.copy(str, i10, str2);
    }

    @e
    public final String component1() {
        return this.source;
    }

    public final int component2() {
        return this.f76976id;
    }

    @e
    public final String component3() {
        return this.key;
    }

    @d
    public final EpicAddFreeAssets copy(@e String str, int i10, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10), str2}, this, changeQuickRedirect, false, 15146, new Class[]{String.class, Integer.TYPE, String.class}, EpicAddFreeAssets.class);
        return patchProxyResultProxy.isSupported ? (EpicAddFreeAssets) patchProxyResultProxy.result : new EpicAddFreeAssets(str, i10, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15150, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicAddFreeAssets)) {
            return false;
        }
        EpicAddFreeAssets epicAddFreeAssets = (EpicAddFreeAssets) obj;
        return f0.g(this.source, epicAddFreeAssets.source) && this.f76976id == epicAddFreeAssets.f76976id && f0.g(this.key, epicAddFreeAssets.key);
    }

    public final int getId() {
        return this.f76976id;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15149, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.source;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f76976id) * 31;
        String str2 = this.key;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setId(int i10) {
        this.f76976id = i10;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setSource(@e String str) {
        this.source = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15148, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicAddFreeAssets(source=" + this.source + ", id=" + this.f76976id + ", key=" + this.key + ')';
    }
}
