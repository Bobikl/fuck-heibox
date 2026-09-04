package com.max.hbcustomview.recyclerview;

import android.content.Context;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MaxLineFlexboxLayoutManager.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class MaxLineFlexboxLayoutManager extends FlexboxLayoutManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxLineFlexboxLayoutManager(@dl.d Context context, int i10) {
        super(context);
        f0.p(context, "context");
        this.F = i10;
        super.setMaxLine(-1);
    }

    public final int c0() {
        return this.F;
    }

    public final void d0(int i10) {
        this.F = i10;
    }

    @Override // com.google.android.flexbox.FlexboxLayoutManager, com.google.android.flexbox.d
    @dl.d
    public List<f> getFlexLinesInternal() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Jl, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<f> flexLinesInternal = super.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        int i10 = this.F;
        if (i10 > 0 && size > i10) {
            flexLinesInternal.subList(i10, size).clear();
        }
        return flexLinesInternal.subList(0, this.F);
    }

    @Override // com.google.android.flexbox.FlexboxLayoutManager, com.google.android.flexbox.d
    public void setMaxLine(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Il, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.F = i10;
        super.setMaxLine(-1);
    }
}
