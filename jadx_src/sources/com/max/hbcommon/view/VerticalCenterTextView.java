package com.max.hbcommon.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: VerticalCenterTextView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class VerticalCenterTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f68264h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f68265i = 63;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private Runnable f68268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f68269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f68270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68271g;

    /* JADX INFO: compiled from: VerticalCenterTextView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public VerticalCenterTextView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public VerticalCenterTextView(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public VerticalCenterTextView(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f68267c = true;
        this.f68268d = new Runnable() { // from class: com.max.hbcommon.view.c
            @Override // java.lang.Runnable
            public final void run() {
                VerticalCenterTextView.g(this.f68330b);
            }
        };
    }

    public /* synthetic */ VerticalCenterTextView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(VerticalCenterTextView this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.f.f32681y2, new Class[]{VerticalCenterTextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.h();
    }

    private final void h() {
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32549s2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i11 = getContext().getResources().getDisplayMetrics().heightPixels / 2;
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            i();
            return;
        }
        if (this.f68267c || this.f68270f) {
            return;
        }
        this.f68270f = true;
        int i12 = rect.top;
        int i13 = rect.bottom;
        int measuredHeight = getMeasuredHeight() / 2;
        int i14 = (i13 - i12) / 2;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int iL0 = di.d.L0(63 * f10);
        int iL1 = di.d.L0(this.f68271g * f10);
        if ((i11 - measuredHeight) + iL0 < i12) {
            i10 = (i14 - measuredHeight) - iL0;
        } else {
            i10 = (i11 + measuredHeight) + iL0 > i13 ? (i14 - measuredHeight) + iL0 : ((i11 - i12) - measuredHeight) + iL0;
        }
        int i15 = this.f68266b;
        layout(i15, i10 + iL1, getMeasuredWidth() + i15, i10 + getMeasuredHeight() + iL1);
    }

    private final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32571t2, new Class[0], Void.TYPE).isSupported || this.f68269e) {
            return;
        }
        this.f68269e = true;
        removeCallbacks(this.f68268d);
        postDelayed(this.f68268d, 100L);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32593u2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.f68267c = true;
        h();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32615v2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.f68267c = false;
        this.f68270f = false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32659x2, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f68266b = i10;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            h();
        }
    }

    @Override // android.widget.TextView
    public void setText(@e CharSequence charSequence, @e TextView.BufferType bufferType) {
        if (PatchProxy.proxy(new Object[]{charSequence, bufferType}, this, changeQuickRedirect, false, bb.c.f.f32637w2, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68270f = false;
        super.setText(charSequence, bufferType);
    }
}
