package com.max.hbcustomview.seekbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.l;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FloatValueSeekBar.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class FloatValueSeekBar extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SeekBar f69273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f69274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final LinkedList<a> f69275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @xh.e
    public float f69277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    @xh.e
    public int f69278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @xh.e
    public float f69279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    @xh.e
    public Drawable f69280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    @xh.e
    public Drawable f69281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @xh.e
    public int f69282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @xh.e
    public int f69283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @xh.e
    public float f69284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @xh.e
    public float f69285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @xh.e
    public float f69286o;

    /* JADX INFO: compiled from: FloatValueSeekBar.kt */
    public interface a {
        void a(int i10, boolean z10);

        void b(int i10, boolean z10);
    }

    /* JADX INFO: compiled from: FloatValueSeekBar.kt */
    public static final class b implements SeekBar.OnSeekBarChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f69287a;

        b() {
        }

        public final boolean a() {
            return this.f69287a;
        }

        public final void b(boolean z10) {
            this.f69287a = z10;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@dl.e SeekBar seekBar, int i10, boolean z10) {
            if (PatchProxy.proxy(new Object[]{seekBar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.ho, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Log.d("cqtest", "on progress change");
            FloatValueSeekBar.f(FloatValueSeekBar.this, i10);
            this.f69287a = z10;
            Iterator it = FloatValueSeekBar.this.f69275d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b(i10, z10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@dl.e SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@dl.e SeekBar seekBar) {
            if (PatchProxy.proxy(new Object[]{seekBar}, this, changeQuickRedirect, false, bb.c.f.f32340io, new Class[]{SeekBar.class}, Void.TYPE).isSupported) {
                return;
            }
            Iterator it = FloatValueSeekBar.this.f69275d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(FloatValueSeekBar.this.f69282k, this.f69287a);
            }
            this.f69287a = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatValueSeekBar(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        this.f69275d = new LinkedList<>();
        this.f69277f = 28.0f;
        this.f69278g = -1;
        this.f69279h = 2.0f;
        post(new Runnable() { // from class: com.max.hbcustomview.seekbar.d
            @Override // java.lang.Runnable
            public final void run() {
                FloatValueSeekBar.d(this.f69370b);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatValueSeekBar(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f69275d = new LinkedList<>();
        this.f69277f = 28.0f;
        this.f69278g = -1;
        this.f69279h = 2.0f;
        post(new Runnable() { // from class: com.max.hbcustomview.seekbar.d
            @Override // java.lang.Runnable
            public final void run() {
                FloatValueSeekBar.d(this.f69370b);
            }
        });
        h(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatValueSeekBar(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f69275d = new LinkedList<>();
        this.f69277f = 28.0f;
        this.f69278g = -1;
        this.f69279h = 2.0f;
        post(new Runnable() { // from class: com.max.hbcustomview.seekbar.d
            @Override // java.lang.Runnable
            public final void run() {
                FloatValueSeekBar.d(this.f69370b);
            }
        });
        h(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FloatValueSeekBar this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.f.f5do, new Class[]{FloatValueSeekBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.k();
        this$0.j();
        this$0.i();
    }

    public static final /* synthetic */ void f(FloatValueSeekBar floatValueSeekBar, int i10) {
        if (PatchProxy.proxy(new Object[]{floatValueSeekBar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.go, new Class[]{FloatValueSeekBar.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        floatValueSeekBar.o(i10);
    }

    private final void h(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.f.On, new Class[]{AttributeSet.class}, Void.TYPE).isSupported || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.C0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f69277f = typedArrayObtainStyledAttributes.getFloat(R.styleable.FloatValueSeekBar_tvTextSize, 12.0f);
        this.f69278g = typedArrayObtainStyledAttributes.getColor(R.styleable.FloatValueSeekBar_tvTextColor, -1);
        this.f69280i = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FloatValueSeekBar_sbThumb);
        this.f69281j = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FloatValueSeekBar_sbProgressDrawable);
        this.f69282k = typedArrayObtainStyledAttributes.getInt(R.styleable.FloatValueSeekBar_sbProgress, 0);
        this.f69283l = typedArrayObtainStyledAttributes.getColor(R.styleable.FloatValueSeekBar_tvShadowColor, 0);
        this.f69284m = typedArrayObtainStyledAttributes.getFloat(R.styleable.FloatValueSeekBar_tvShadowDX, 0.0f);
        this.f69285n = typedArrayObtainStyledAttributes.getFloat(R.styleable.FloatValueSeekBar_tvShadowDY, 0.0f);
        this.f69286o = typedArrayObtainStyledAttributes.getFloat(R.styleable.FloatValueSeekBar_tvShadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Un, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SeekBar seekBar = this.f69273b;
        SeekBar seekBar2 = null;
        if (seekBar == null) {
            f0.S("seekBar");
            seekBar = null;
        }
        seekBar.setProgress(this.f69282k);
        SeekBar seekBar3 = this.f69273b;
        if (seekBar3 == null) {
            f0.S("seekBar");
            seekBar3 = null;
        }
        seekBar3.setThumb(this.f69280i);
        SeekBar seekBar4 = this.f69273b;
        if (seekBar4 == null) {
            f0.S("seekBar");
            seekBar4 = null;
        }
        seekBar4.setProgressDrawable(this.f69281j);
        setTextSize(this.f69277f);
        p();
        TextView textView = this.f69274c;
        if (textView == null) {
            f0.S("textView");
            textView = null;
        }
        textView.setTextColor(this.f69278g);
        o(this.f69282k);
        TextView textView2 = this.f69274c;
        if (textView2 == null) {
            f0.S("textView");
            textView2 = null;
        }
        textView2.postInvalidate();
        SeekBar seekBar5 = this.f69273b;
        if (seekBar5 == null) {
            f0.S("seekBar");
            seekBar5 = null;
        }
        seekBar5.postInvalidate();
        TextView textView3 = this.f69274c;
        if (textView3 == null) {
            f0.S("textView");
            textView3 = null;
        }
        textView3.requestLayout();
        SeekBar seekBar6 = this.f69273b;
        if (seekBar6 == null) {
            f0.S("seekBar");
        } else {
            seekBar2 = seekBar6;
        }
        seekBar2.requestLayout();
        this.f69276e = true;
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Qn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SeekBar seekBar = this.f69273b;
        if (seekBar == null) {
            f0.S("seekBar");
            seekBar = null;
        }
        seekBar.setOnSeekBarChangeListener(new b());
    }

    @SuppressLint({"InflateParams"})
    private final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Pn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.float_value_seek_bar, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(R.id.seekbar);
        f0.o(viewFindViewById, "findViewById(...)");
        this.f69273b = (SeekBar) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_progress);
        f0.o(viewFindViewById2, "findViewById(...)");
        this.f69274c = (TextView) viewFindViewById2;
        addView(viewInflate, -1, -1);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(FloatValueSeekBar this$0, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{this$0, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.fo, new Class[]{FloatValueSeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.setProgress(i10, z10);
    }

    private final void n(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Xn, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        SeekBar seekBar = null;
        if (Build.VERSION.SDK_INT >= 24) {
            SeekBar seekBar2 = this.f69273b;
            if (seekBar2 == null) {
                f0.S("seekBar");
            } else {
                seekBar = seekBar2;
            }
            seekBar.setProgress(i10, z10);
            return;
        }
        SeekBar seekBar3 = this.f69273b;
        if (seekBar3 == null) {
            f0.S("seekBar");
        } else {
            seekBar = seekBar3;
        }
        seekBar.setProgress(i10);
    }

    private final void o(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Tn, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = this.f69280i;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.f69282k = i10;
        TextView textView = this.f69274c;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("textView");
            textView = null;
        }
        textView.setText(String.valueOf(this.f69282k));
        ic.a aVar = ic.a.f119343a;
        SeekBar seekBar = this.f69273b;
        if (seekBar == null) {
            f0.S("seekBar");
            seekBar = null;
        }
        int iF = aVar.f(seekBar);
        TextView textView3 = this.f69274c;
        if (textView3 == null) {
            f0.S("textView");
            textView3 = null;
        }
        int iF2 = aVar.f(textView3);
        TextView textView4 = this.f69274c;
        if (textView4 == null) {
            f0.S("textView");
            textView4 = null;
        }
        ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        float f10 = this.f69282k;
        SeekBar seekBar2 = this.f69273b;
        if (seekBar2 == null) {
            f0.S("seekBar");
            seekBar2 = null;
        }
        float max = f10 / seekBar2.getMax();
        Context context = getContext();
        f0.o(context, "getContext(...)");
        layoutParams2.leftMargin = (int) (((iF * max) - (iF2 * 0.5f)) + ((intrinsicWidth + aVar.a(context, 2.0f)) * (1 - (2 * max))));
        TextView textView5 = this.f69274c;
        if (textView5 == null) {
            f0.S("textView");
            textView5 = null;
        }
        textView5.setLayoutParams(layoutParams2);
        TextView textView6 = this.f69274c;
        if (textView6 == null) {
            f0.S("textView");
        } else {
            textView2 = textView6;
        }
        textView2.requestLayout();
    }

    private final void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Rn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f69274c;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("textView");
            textView = null;
        }
        textView.setShadowLayer(this.f69286o, this.f69284m, this.f69285n, this.f69283l);
        TextView textView3 = this.f69274c;
        if (textView3 == null) {
            f0.S("textView");
        } else {
            textView2 = textView3;
        }
        textView2.invalidate();
    }

    public static /* synthetic */ void setProgress$default(FloatValueSeekBar floatValueSeekBar, int i10, boolean z10, int i11, Object obj) {
        Object[] objArr = {floatValueSeekBar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Wn, new Class[]{FloatValueSeekBar.class, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        floatValueSeekBar.setProgress(i10, z10);
    }

    public static /* synthetic */ void setTextShadow$default(FloatValueSeekBar floatValueSeekBar, float f10, float f11, float f12, int i10, int i11, Object obj) {
        float f13 = f11;
        float f14 = f12;
        Object[] objArr = {floatValueSeekBar, new Float(f10), new Float(f13), new Float(f14), new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Zn, new Class[]{FloatValueSeekBar.class, cls, cls, cls, cls2, cls2, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f14 = 0.0f;
        }
        floatValueSeekBar.setTextShadow(f10, f13, f14, (i11 & 8) == 0 ? i10 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVisibility$lambda$1(FloatValueSeekBar this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.f.eo, new Class[]{FloatValueSeekBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.o(this$0.f69282k);
    }

    public final void g(@dl.d a listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, bb.c.f.bo, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        this.f69275d.add(listener);
    }

    public final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.co, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69275d.clear();
    }

    public final void setProgress(final int i10, final boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Vn, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f69276e) {
            n(i10, z10);
        } else {
            post(new Runnable() { // from class: com.max.hbcustomview.seekbar.e
                @Override // java.lang.Runnable
                public final void run() {
                    FloatValueSeekBar.m(this.f69371b, i10, z10);
                }
            });
        }
    }

    public final void setTextShadow(float f10, float f11, float f12, int i10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Yn, new Class[]{cls, cls, cls, Integer.TYPE}, Void.TYPE).isSupported && this.f69276e) {
            ic.a aVar = ic.a.f119343a;
            Context context = getContext();
            f0.o(context, "getContext(...)");
            this.f69286o = aVar.a(context, f10);
            Context context2 = getContext();
            f0.o(context2, "getContext(...)");
            this.f69284m = aVar.a(context2, f11);
            Context context3 = getContext();
            f0.o(context3, "getContext(...)");
            this.f69285n = aVar.a(context3, f12);
            this.f69283l = i10;
            p();
        }
    }

    public final void setTextSize(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.ao, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69277f = f10;
        TextView textView = this.f69274c;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("textView");
            textView = null;
        }
        textView.setTextSize(1, f10);
        TextView textView3 = this.f69274c;
        if (textView3 == null) {
            f0.S("textView");
        } else {
            textView2 = textView3;
        }
        textView2.postInvalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Sn, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setVisibility(i10);
        if (this.f69276e) {
            post(new Runnable() { // from class: com.max.hbcustomview.seekbar.c
                @Override // java.lang.Runnable
                public final void run() {
                    FloatValueSeekBar.setVisibility$lambda$1(this.f69369b);
                }
            });
        }
    }
}
