package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.LineHeightSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBLineHeightTextView.kt */
/* JADX INFO: loaded from: classes10.dex */
public class HBLineHeightTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f68500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private b f68501c;

    /* JADX INFO: compiled from: HBLineHeightTextView.kt */
    public static final class a implements LineHeightSpan {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f68502b;

        public a(float f10) {
            this.f68502b = (int) Math.ceil(f10);
        }

        public final int a() {
            return this.f68502b;
        }

        public final void b(float f10) {
            if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.f32463o6, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f68502b = (int) Math.ceil(f10);
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(@dl.d CharSequence text, int i10, int i11, int i12, int i13, @dl.d Paint.FontMetricsInt fm) {
            Object[] objArr = {text, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), fm};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32486p6, new Class[]{CharSequence.class, cls, cls, cls, cls, Paint.FontMetricsInt.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(text, "text");
            f0.p(fm, "fm");
            Log.d("CustomLine", "height: " + this.f68502b + "  descent: " + fm.descent + "  bottom: " + fm.bottom + "  ascent: " + fm.ascent + "  top: " + fm.top + "  text: " + ((Object) text));
            int i14 = this.f68502b;
            int i15 = fm.top;
            double d10 = (double) (((float) (i14 - ((-i15) + fm.bottom))) / 2.0f);
            fm.top = i15 - ((int) Math.ceil(d10));
            int iFloor = fm.bottom + ((int) Math.floor(d10));
            fm.bottom = iFloor;
            fm.ascent = fm.top;
            fm.descent = iFloor;
        }
    }

    /* JADX INFO: compiled from: HBLineHeightTextView.kt */
    public static final class b extends SpannableStringBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private a f68503b;

        public /* bridge */ char a(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32531r6, new Class[]{Integer.TYPE}, Character.TYPE);
            return patchProxyResultProxy.isSupported ? ((Character) patchProxyResultProxy.result).charValue() : super.charAt(i10);
        }

        public /* bridge */ int b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32575t6, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : super.length();
        }

        public final void c(@dl.d CharSequence sequence, float f10) {
            if (PatchProxy.proxy(new Object[]{sequence, new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.f32509q6, new Class[]{CharSequence.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(sequence, "sequence");
            clear();
            clearSpans();
            a aVar = this.f68503b;
            if (aVar == null) {
                this.f68503b = new a(f10);
            } else {
                f0.m(aVar);
                aVar.b(f10);
            }
            append(sequence);
            setSpan(this.f68503b, 0, sequence.length(), 17);
        }

        @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
        public final /* bridge */ char charAt(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32553s6, new Class[]{Integer.TYPE}, Character.TYPE);
            return patchProxyResultProxy.isSupported ? ((Character) patchProxyResultProxy.result).charValue() : a(i10);
        }

        @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
        public final /* bridge */ int length() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32597u6, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBLineHeightTextView(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBLineHeightTextView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HBLineHeightTextView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        f(attributeSet);
    }

    private final void g(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.proxy(new Object[]{charSequence, bufferType}, this, changeQuickRedirect, false, bb.c.f.f32440n6, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(this.f68500b == 0.0f)) {
            if (!(charSequence == null || charSequence.length() == 0)) {
                if (this.f68501c == null) {
                    this.f68501c = new b();
                }
                b bVar = this.f68501c;
                f0.m(bVar);
                bVar.c(charSequence, this.f68500b);
                super.setText(this.f68501c, bufferType);
                return;
            }
        }
        super.setText(charSequence, bufferType);
    }

    public final void f(@dl.e AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.f32394l6, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.T0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i10 = R.styleable.HBLineHeightTextView_customLineHeight;
        ic.a aVar = ic.a.f119343a;
        Context context = getContext();
        f0.o(context, "getContext(...)");
        this.f68500b = typedArrayObtainStyledAttributes.getDimension(i10, aVar.a(context, 0.0f));
    }

    public final float getCustomLineHeight() {
        return this.f68500b;
    }

    public final void setCustomLineHeight(float f10) {
        this.f68500b = f10;
    }

    @Override // android.widget.TextView
    public void setText(@dl.e CharSequence charSequence, @dl.e TextView.BufferType bufferType) {
        if (PatchProxy.proxy(new Object[]{charSequence, bufferType}, this, changeQuickRedirect, false, bb.c.f.f32417m6, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE).isSupported) {
            return;
        }
        g(charSequence, bufferType);
    }
}
