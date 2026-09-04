package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Options implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int reason;

    @e
    private String text;

    /* JADX WARN: Multi-variable type inference failed */
    public Options() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public Options(@e String str, int i10) {
        this.text = str;
        this.reason = i10;
    }

    public /* synthetic */ Options(String str, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0 : i10);
    }

    public static /* synthetic */ Options copy$default(Options options, String str, int i10, int i11, Object obj) {
        Object[] objArr = {options, str, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15969, new Class[]{Options.class, String.class, cls, cls, Object.class}, Options.class);
        if (patchProxyResultProxy.isSupported) {
            return (Options) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            str = options.text;
        }
        if ((i11 & 2) != 0) {
            i10 = options.reason;
        }
        return options.copy(str, i10);
    }

    @e
    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.reason;
    }

    @d
    public final Options copy(@e String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 15968, new Class[]{String.class, Integer.TYPE}, Options.class);
        return patchProxyResultProxy.isSupported ? (Options) patchProxyResultProxy.result : new Options(str, i10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15972, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return f0.g(this.text, options.text) && this.reason == options.reason;
    }

    public final int getReason() {
        return this.reason;
    }

    @e
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15971, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.text;
        return ((str != null ? str.hashCode() : 0) * 31) + this.reason;
    }

    public final void setReason(int i10) {
        this.reason = i10;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15970, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Options(text=" + this.text + ", reason=" + this.reason + ')';
    }
}
