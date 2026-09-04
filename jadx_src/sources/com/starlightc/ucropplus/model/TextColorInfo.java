package com.starlightc.ucropplus.model;

import androidx.annotation.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TextColorInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextColorInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private Integer f98064id;
    private int value;

    public TextColorInfo(@l int i10, @e Integer num) {
        this.value = i10;
        this.f98064id = num;
    }

    public /* synthetic */ TextColorInfo(int i10, Integer num, int i11, u uVar) {
        this((i11 & 1) != 0 ? -1 : i10, num);
    }

    public static /* synthetic */ TextColorInfo copy$default(TextColorInfo textColorInfo, int i10, Integer num, int i11, Object obj) {
        Object[] objArr = {textColorInfo, new Integer(i10), num, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50124, new Class[]{TextColorInfo.class, cls, Integer.class, cls, Object.class}, TextColorInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextColorInfo) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            i10 = textColorInfo.value;
        }
        if ((i11 & 2) != 0) {
            num = textColorInfo.f98064id;
        }
        return textColorInfo.copy(i10, num);
    }

    public final int component1() {
        return this.value;
    }

    @e
    public final Integer component2() {
        return this.f98064id;
    }

    @d
    public final TextColorInfo copy(@l int i10, @e Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), num}, this, changeQuickRedirect, false, 50123, new Class[]{Integer.TYPE, Integer.class}, TextColorInfo.class);
        return patchProxyResultProxy.isSupported ? (TextColorInfo) patchProxyResultProxy.result : new TextColorInfo(i10, num);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50127, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextColorInfo)) {
            return false;
        }
        TextColorInfo textColorInfo = (TextColorInfo) obj;
        return this.value == textColorInfo.value && f0.g(this.f98064id, textColorInfo.f98064id);
    }

    @e
    public final Integer getId() {
        return this.f98064id;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50126, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.value * 31;
        Integer num = this.f98064id;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public final void setId(@e Integer num) {
        this.f98064id = num;
    }

    public final void setValue(int i10) {
        this.value = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50125, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TextColorInfo(value=" + this.value + ", id=" + this.f98064id + ')';
    }
}
