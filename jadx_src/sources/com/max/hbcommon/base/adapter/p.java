package com.max.hbcommon.base.adapter;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.f0;
import androidx.annotation.t0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.Pair;

/* JADX INFO: compiled from: RecyclerViewItemWatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Rect f66783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @t0
    private int f66785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @t0
    private int f66786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @t0
    private int f66787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @t0
    private int f66788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @t0
    private int f66789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @t0
    private int f66790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f66792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private Integer f66794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private Integer f66795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private Integer f66796n;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public p(@dl.e Integer num) {
        this.f66783a = new Rect();
        this.f66784b = -1;
        this.f66792j = 8;
        if (num != null) {
            e(num.intValue());
        }
    }

    public /* synthetic */ p(Integer num, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : num);
    }

    private final boolean d() {
        return this.f66792j == 0 && this.f66787e > 0 && this.f66788f > 0;
    }

    public final int a() {
        return this.f66784b;
    }

    public final void b(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d a0 listener, boolean z10, @f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{viewHolder, listener, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.mz, new Class[]{RecyclerView.ViewHolder.class, a0.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(listener, "listener");
        boolean z12 = this.f66791i;
        Pair<Boolean, Float> pairC = c(i10);
        if (!z10 && pairC.e().booleanValue()) {
            z11 = true;
        }
        this.f66791i = z11;
        com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", ObservableItem, handlePartialImpressionVisible previousPartiallyVisible = " + z12 + ", partiallyVisible = " + this.f66791i + ", thresholdPercentage = " + i10 + ", viewHolder.bindingAdapterPosition = " + viewHolder.getBindingAdapterPosition() + ", detachEvent = " + z10);
        boolean z13 = this.f66791i;
        if (z13 != z12) {
            if (z13) {
                listener.c(this.f66784b, viewHolder);
            } else {
                listener.b(this.f66784b, viewHolder);
            }
        }
        if (this.f66791i) {
            listener.a(this.f66784b, viewHolder, pairC.f().floatValue());
        }
    }

    @dl.d
    public final Pair<Boolean, Float> c(@f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.nz, new Class[]{Integer.TYPE}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        int i11 = this.f66785c * this.f66786d;
        int i12 = this.f66787e * this.f66788f;
        float f10 = (i12 / i11) * 100;
        com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", ObservableItem, isPartiallyVisible totalArea = " + i11 + ", visibleArea = " + i12 + ", visibleAreaPercentage = " + f10 + ", thresholdPercentage = " + i10);
        if (i10 == 0) {
            return new Pair<>(Boolean.valueOf(d()), Float.valueOf(f10));
        }
        return new Pair<>(Boolean.valueOf(this.f66792j == 0 && f10 >= ((float) i10)), Float.valueOf(f10));
    }

    public final void e(int i10) {
        this.f66784b = i10;
        this.f66793k = false;
        this.f66794l = null;
        this.f66795m = null;
        this.f66796n = null;
    }

    public final void f(int i10) {
        this.f66784b += i10;
    }

    public final boolean g(@dl.d View view, @dl.d ViewGroup parent, boolean z10) {
        Object[] objArr = {view, parent, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.lz, new Class[]{View.class, ViewGroup.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(parent, "parent");
        this.f66783a.setEmpty();
        boolean z11 = view.getLocalVisibleRect(this.f66783a) && !z10;
        this.f66785c = view.getHeight();
        this.f66786d = view.getWidth();
        this.f66789g = parent.getHeight();
        this.f66790h = parent.getWidth();
        this.f66787e = z11 ? this.f66783a.height() : 0;
        this.f66788f = z11 ? this.f66783a.width() : 0;
        this.f66792j = view.getVisibility();
        com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", ObservableItem update detachEvent = " + z10 + ", viewDrawn = " + z11 + ", localVisibleRect = " + this.f66783a + ", viewVisibility = " + this.f66792j + ", visibleHeight = " + this.f66787e + ", visibleWidth = " + this.f66788f + ", viewportHeight = " + this.f66789g + ", viewportWidth = " + this.f66790h);
        return this.f66785c > 0 && this.f66786d > 0;
    }
}
