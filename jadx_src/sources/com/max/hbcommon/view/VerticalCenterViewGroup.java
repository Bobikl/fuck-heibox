package com.max.hbcommon.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: VerticalCenterViewGroup.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class VerticalCenterViewGroup extends ConstraintLayout {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 0;
    public static final int S = 48;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int J;
    private boolean K;
    private final int L;
    private boolean M;

    @dl.d
    private Runnable N;
    private boolean O;
    private int P;

    /* JADX INFO: compiled from: VerticalCenterViewGroup.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public VerticalCenterViewGroup(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public VerticalCenterViewGroup(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public VerticalCenterViewGroup(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.K = true;
        this.N = new Runnable() { // from class: com.max.hbcommon.view.d
            @Override // java.lang.Runnable
            public final void run() {
                VerticalCenterViewGroup.D(this.f68331b);
            }
        };
        int iL0 = di.d.L0(48 * context.getResources().getDisplayMetrics().density);
        this.L = iL0;
        setLayoutParams(new ViewGroup.LayoutParams(iL0, iL0));
    }

    public /* synthetic */ VerticalCenterViewGroup(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(VerticalCenterViewGroup this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.f.F2, new Class[]{VerticalCenterViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.E();
    }

    private final void E() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.A2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = getContext().getResources().getDisplayMetrics().heightPixels / 2;
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            F();
            return;
        }
        if (this.K || this.M) {
            return;
        }
        this.M = true;
        int i11 = rect.top;
        int i12 = rect.bottom;
        int i13 = this.L / 2;
        int i14 = (i12 - i11) / 2;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int iL0 = di.d.L0(0 * f10);
        int iL1 = di.d.L0(this.P * f10);
        int i15 = ((i10 - i13) + iL0 >= i11 && (i10 + i13) + iL0 <= i12) ? ((i10 - i11) - i13) + iL0 : (i14 - i13) + iL0;
        int i16 = this.J;
        int i17 = this.L;
        layout(i16, i15 + iL1, i16 + i17, i15 + i17 + iL1);
    }

    private final void F() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.D2, new Class[0], Void.TYPE).isSupported || this.O) {
            return;
        }
        this.O = true;
        removeCallbacks(this.N);
        postDelayed(this.N, 100L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.B2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.K = true;
        E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.C2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.K = false;
        this.M = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.E2, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.J = i10;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            E();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32703z2, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.L, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
    }
}
