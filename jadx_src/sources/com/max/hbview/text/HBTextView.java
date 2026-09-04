package com.max.hbview.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import bb.c;
import com.max.hbview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class HBTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f73839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f73840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f73841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f73842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f73843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f73844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f73845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f73846i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBTextView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBTextView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HBTextView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        g(attributeSet);
    }

    private final int f(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, this, changeQuickRedirect, false, c.k.Yx, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private final void g(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, c.k.Wx, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        h(attributeSet);
        this.f73839b = getPaddingTop();
        this.f73840c = getPaddingBottom();
        this.f73841d = getTextSize();
        setLineSpacing((float) Math.ceil(this.f73842e), 0.0f);
        float f10 = 2;
        float f11 = 3;
        setExtraTopPadding((int) Math.ceil(((this.f73842e - this.f73841d) / f10) - f11));
        setExtraBottomPadding((int) Math.ceil(((this.f73842e - this.f73841d) / f10) - f11));
    }

    private final void h(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, c.k.Xx, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f73789k0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i10 = R.styleable.HBTextView_textLineHeight;
        Context context = getContext();
        f0.o(context, "getContext(...)");
        this.f73842e = typedArrayObtainStyledAttributes.getDimension(i10, f(context, 0.0f));
        this.f73843f = typedArrayObtainStyledAttributes.getInt(R.styleable.HBTextView_textLineHeightStyle, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setExtraBottomPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.cy, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f73846i = i10;
        this.f73844g = true;
        setPadding(getPaddingLeft(), this.f73839b + this.f73845h, getPaddingRight(), this.f73840c + this.f73846i);
    }

    private final void setExtraTopPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.ay, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f73845h = i10;
        this.f73844g = true;
        setPadding(getPaddingLeft(), this.f73839b + this.f73845h, getPaddingRight(), this.f73840c + this.f73846i);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.Zx, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f73844g) {
            this.f73839b = i11 - this.f73845h;
            this.f73840c = i13 - this.f73846i;
            this.f73844g = false;
        }
        super.setPadding(i10, i11, i12, i13);
    }
}
