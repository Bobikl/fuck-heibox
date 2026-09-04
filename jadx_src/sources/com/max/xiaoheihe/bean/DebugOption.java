package com.max.xiaoheihe.bean;

import android.view.View;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DebugOption.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class DebugOption {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private CompoundButton.OnCheckedChangeListener checkedChangeListener;
    private boolean checkedState;

    @e
    private View.OnClickListener clickListener;

    @d
    private String name;
    private int type;

    public DebugOption(int i10, @e View.OnClickListener onClickListener, @e CompoundButton.OnCheckedChangeListener onCheckedChangeListener, boolean z10, @d String name) {
        f0.p(name, "name");
        this.type = i10;
        this.clickListener = onClickListener;
        this.checkedChangeListener = onCheckedChangeListener;
        this.checkedState = z10;
        this.name = name;
    }

    public /* synthetic */ DebugOption(int i10, View.OnClickListener onClickListener, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, boolean z10, String str, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : onClickListener, (i11 & 4) != 0 ? null : onCheckedChangeListener, (i11 & 8) != 0 ? false : z10, str);
    }

    public static /* synthetic */ DebugOption copy$default(DebugOption debugOption, int i10, View.OnClickListener onClickListener, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, boolean z10, String str, int i11, Object obj) {
        int i12 = i10;
        boolean z11 = z10;
        Object[] objArr = {debugOption, new Integer(i12), onClickListener, onCheckedChangeListener, new Byte(z11 ? (byte) 1 : (byte) 0), str, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.m.VL, new Class[]{DebugOption.class, cls, View.OnClickListener.class, CompoundButton.OnCheckedChangeListener.class, Boolean.TYPE, String.class, cls, Object.class}, DebugOption.class);
        if (patchProxyResultProxy.isSupported) {
            return (DebugOption) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            i12 = debugOption.type;
        }
        View.OnClickListener onClickListener2 = (i11 & 2) != 0 ? debugOption.clickListener : onClickListener;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = (i11 & 4) != 0 ? debugOption.checkedChangeListener : onCheckedChangeListener;
        if ((i11 & 8) != 0) {
            z11 = debugOption.checkedState;
        }
        return debugOption.copy(i12, onClickListener2, onCheckedChangeListener2, z11, (i11 & 16) != 0 ? debugOption.name : str);
    }

    public final int component1() {
        return this.type;
    }

    @e
    public final View.OnClickListener component2() {
        return this.clickListener;
    }

    @e
    public final CompoundButton.OnCheckedChangeListener component3() {
        return this.checkedChangeListener;
    }

    public final boolean component4() {
        return this.checkedState;
    }

    @d
    public final String component5() {
        return this.name;
    }

    @d
    public final DebugOption copy(int i10, @e View.OnClickListener onClickListener, @e CompoundButton.OnCheckedChangeListener onCheckedChangeListener, boolean z10, @d String name) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), onClickListener, onCheckedChangeListener, new Byte(z10 ? (byte) 1 : (byte) 0), name}, this, changeQuickRedirect, false, c.m.UL, new Class[]{Integer.TYPE, View.OnClickListener.class, CompoundButton.OnCheckedChangeListener.class, Boolean.TYPE, String.class}, DebugOption.class);
        if (patchProxyResultProxy.isSupported) {
            return (DebugOption) patchProxyResultProxy.result;
        }
        f0.p(name, "name");
        return new DebugOption(i10, onClickListener, onCheckedChangeListener, z10, name);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.YL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugOption)) {
            return false;
        }
        DebugOption debugOption = (DebugOption) obj;
        return this.type == debugOption.type && f0.g(this.clickListener, debugOption.clickListener) && f0.g(this.checkedChangeListener, debugOption.checkedChangeListener) && this.checkedState == debugOption.checkedState && f0.g(this.name, debugOption.name);
    }

    @e
    public final CompoundButton.OnCheckedChangeListener getCheckedChangeListener() {
        return this.checkedChangeListener;
    }

    public final boolean getCheckedState() {
        return this.checkedState;
    }

    @e
    public final View.OnClickListener getClickListener() {
        return this.clickListener;
    }

    @d
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.XL, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.type * 31;
        View.OnClickListener onClickListener = this.clickListener;
        int iHashCode = (i10 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.checkedChangeListener;
        int iHashCode2 = (iHashCode + (onCheckedChangeListener != null ? onCheckedChangeListener.hashCode() : 0)) * 31;
        boolean z10 = this.checkedState;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((iHashCode2 + r10) * 31) + this.name.hashCode();
    }

    public final void setCheckedChangeListener(@e CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.checkedChangeListener = onCheckedChangeListener;
    }

    public final void setCheckedState(boolean z10) {
        this.checkedState = z10;
    }

    public final void setClickListener(@e View.OnClickListener onClickListener) {
        this.clickListener = onClickListener;
    }

    public final void setName(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.TL, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.name = str;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.WL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DebugOption(type=" + this.type + ", clickListener=" + this.clickListener + ", checkedChangeListener=" + this.checkedChangeListener + ", checkedState=" + this.checkedState + ", name=" + this.name + ')';
    }
}
