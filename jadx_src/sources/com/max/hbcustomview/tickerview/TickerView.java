package com.max.hbcustomview.tickerview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.n0;
import androidx.core.view.n;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class TickerView extends View {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f69594t = 12;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f69595u = -16777216;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f69596v = 350;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Interpolator f69597w = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f69598x = 8388611;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Paint f69599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f69600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.max.hbcustomview.tickerview.d f69601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ValueAnimator f69602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f69603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f69609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f69612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Interpolator f69613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f69614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f69615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TickerUtils.TickerTimeFormat f69616s;

    public enum ScrollingDirection {
        ANY,
        UP,
        DOWN;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static ScrollingDirection valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.ev, new Class[]{String.class}, ScrollingDirection.class);
            return patchProxyResultProxy.isSupported ? (ScrollingDirection) patchProxyResultProxy.result : (ScrollingDirection) Enum.valueOf(ScrollingDirection.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ScrollingDirection[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.dv, new Class[0], ScrollingDirection[].class);
            return patchProxyResultProxy.isSupported ? (ScrollingDirection[]) patchProxyResultProxy.result : (ScrollingDirection[]) values().clone();
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.av, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            TickerView.this.f69601d.i(valueAnimator.getAnimatedFraction());
            TickerView.b(TickerView.this);
            TickerView.this.invalidate();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.bv, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            TickerView.this.f69601d.h();
            TickerView.b(TickerView.this);
            TickerView.this.invalidate();
        }
    }

    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.cv, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            TickerView.this.setLayerType(1, null);
            TickerView.this.f69599b.setMaskFilter(null);
        }
    }

    public class d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f69621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f69622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f69623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f69624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f69625f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f69627h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f69628i;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f69626g = -16777216;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f69620a = 8388611;

        d(Resources resources) {
            this.f69627h = TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
        }

        void a(TypedArray typedArray) {
            if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, bb.c.f.fv, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69620a = typedArray.getInt(R.styleable.TickerView_android_gravity, this.f69620a);
            this.f69621b = typedArray.getColor(R.styleable.TickerView_android_shadowColor, this.f69621b);
            this.f69622c = typedArray.getFloat(R.styleable.TickerView_android_shadowDx, this.f69622c);
            this.f69623d = typedArray.getFloat(R.styleable.TickerView_android_shadowDy, this.f69623d);
            this.f69624e = typedArray.getFloat(R.styleable.TickerView_android_shadowRadius, this.f69624e);
            this.f69625f = typedArray.getString(R.styleable.TickerView_android_text);
            this.f69626g = typedArray.getColor(R.styleable.TickerView_android_textColor, this.f69626g);
            this.f69627h = typedArray.getDimension(R.styleable.TickerView_android_textSize, this.f69627h);
            this.f69628i = typedArray.getInt(R.styleable.TickerView_android_textStyle, this.f69628i);
        }
    }

    public TickerView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f69599b = textPaint;
        e eVar = new e(textPaint);
        this.f69600c = eVar;
        this.f69601d = new com.max.hbcustomview.tickerview.d(eVar);
        this.f69602e = ValueAnimator.ofFloat(1.0f);
        this.f69603f = new Rect();
        this.f69616s = TickerUtils.TickerTimeFormat.FORMAT_ANY;
        g(context, null, 0, 0);
    }

    public TickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint(1);
        this.f69599b = textPaint;
        e eVar = new e(textPaint);
        this.f69600c = eVar;
        this.f69601d = new com.max.hbcustomview.tickerview.d(eVar);
        this.f69602e = ValueAnimator.ofFloat(1.0f);
        this.f69603f = new Rect();
        this.f69616s = TickerUtils.TickerTimeFormat.FORMAT_ANY;
        g(context, attributeSet, 0, 0);
    }

    public TickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TextPaint textPaint = new TextPaint(1);
        this.f69599b = textPaint;
        e eVar = new e(textPaint);
        this.f69600c = eVar;
        this.f69601d = new com.max.hbcustomview.tickerview.d(eVar);
        this.f69602e = ValueAnimator.ofFloat(1.0f);
        this.f69603f = new Rect();
        this.f69616s = TickerUtils.TickerTimeFormat.FORMAT_ANY;
        g(context, attributeSet, i10, 0);
    }

    @TargetApi(21)
    public TickerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TextPaint textPaint = new TextPaint(1);
        this.f69599b = textPaint;
        e eVar = new e(textPaint);
        this.f69600c = eVar;
        this.f69601d = new com.max.hbcustomview.tickerview.d(eVar);
        this.f69602e = ValueAnimator.ofFloat(1.0f);
        this.f69603f = new Rect();
        this.f69616s = TickerUtils.TickerTimeFormat.FORMAT_ANY;
        g(context, attributeSet, i10, i11);
    }

    static /* synthetic */ void b(TickerView tickerView) {
        if (PatchProxy.proxy(new Object[]{tickerView}, null, changeQuickRedirect, true, bb.c.f.Zu, new Class[]{TickerView.class}, Void.TYPE).isSupported) {
            return;
        }
        tickerView.d();
    }

    private void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Qu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        boolean z10 = this.f69605h != f();
        boolean z11 = this.f69606i != e();
        if (z10 || z11) {
            requestLayout();
        }
    }

    private int e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Su, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((int) this.f69600c.b()) + getPaddingTop() + getPaddingBottom();
    }

    private int f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ru, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return ((int) (this.f69614q ? this.f69601d.e() : this.f69601d.f())) + getPaddingLeft() + getPaddingRight();
    }

    private void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Tu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69600c.e();
        d();
        invalidate();
    }

    private void j(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Xu, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        k(canvas, this.f69607j, this.f69603f, this.f69601d.e(), this.f69600c.b());
    }

    static void k(Canvas canvas, int i10, Rect rect, float f10, float f11) {
        Object[] objArr = {canvas, new Integer(i10), rect, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Yu, new Class[]{Canvas.class, Integer.TYPE, Rect.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        float f12 = (i10 & 16) == 16 ? rect.top + ((iHeight - f11) / 2.0f) : 0.0f;
        float f13 = (i10 & 1) == 1 ? rect.left + ((iWidth - f10) / 2.0f) : 0.0f;
        if ((i10 & 48) == 48) {
            f12 = 0.0f;
        }
        if ((i10 & 80) == 80) {
            f12 = rect.top + (iHeight - f11);
        }
        if ((i10 & 8388611) == 8388611) {
            f13 = 0.0f;
        }
        if ((i10 & n.f21702c) == 8388613) {
            f13 = rect.left + (iWidth - f10);
        }
        canvas.translate(f13, f12);
        canvas.clipRect(0.0f, 0.0f, f10, f11);
    }

    public void c(Animator.AnimatorListener animatorListener) {
        if (PatchProxy.proxy(new Object[]{animatorListener}, this, changeQuickRedirect, false, bb.c.f.Mu, new Class[]{Animator.AnimatorListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69602e.addListener(animatorListener);
    }

    public void g(Context context, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr = {context, attributeSet, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Bu, new Class[]{Context.class, AttributeSet.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        d dVar = new d(context.getResources());
        int[] iArr = R.styleable.f68708r3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TickerView_android_textAppearance, -1);
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            dVar.a(typedArrayObtainStyledAttributes2);
            typedArrayObtainStyledAttributes2.recycle();
        }
        dVar.a(typedArrayObtainStyledAttributes);
        this.f69613p = f69597w;
        this.f69612o = typedArrayObtainStyledAttributes.getInt(R.styleable.TickerView_ticker_animationDuration, 350);
        this.f69614q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TickerView_ticker_animateMeasurementChange, false);
        this.f69607j = dVar.f69620a;
        int i12 = dVar.f69621b;
        if (i12 != 0) {
            this.f69599b.setShadowLayer(dVar.f69624e, dVar.f69622c, dVar.f69623d, i12);
        }
        int i13 = dVar.f69628i;
        if (i13 != 0) {
            this.f69610m = i13;
            setTypeface(this.f69599b.getTypeface());
        }
        setTextColor(dVar.f69626g);
        setTextSize(dVar.f69627h);
        int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.TickerView_ticker_defaultCharacterList, 0);
        if (i14 == 1) {
            setCharacterLists(TickerUtils.b());
        } else if (i14 == 2) {
            setCharacterLists(TickerUtils.a());
        } else if (isInEditMode()) {
            setCharacterLists(TickerUtils.b());
        }
        int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.TickerView_ticker_defaultPreferredScrollingDirection, 0);
        if (i15 == 0) {
            this.f69600c.f(ScrollingDirection.ANY);
        } else if (i15 == 1) {
            this.f69600c.f(ScrollingDirection.UP);
        } else {
            if (i15 != 2) {
                throw new IllegalArgumentException("Unsupported ticker_defaultPreferredScrollingDirection: " + i15);
            }
            this.f69600c.f(ScrollingDirection.DOWN);
        }
        if (h()) {
            setText(dVar.f69625f, false);
        } else {
            this.f69615r = dVar.f69625f;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f69602e.addUpdateListener(new a());
        this.f69602e.addListener(new b());
    }

    public boolean getAnimateMeasurementChange() {
        return this.f69614q;
    }

    public long getAnimationDelay() {
        return this.f69611n;
    }

    public long getAnimationDuration() {
        return this.f69612o;
    }

    public Interpolator getAnimationInterpolator() {
        return this.f69613p;
    }

    public int getGravity() {
        return this.f69607j;
    }

    public String getText() {
        return this.f69604g;
    }

    public int getTextColor() {
        return this.f69608k;
    }

    public float getTextSize() {
        return this.f69609l;
    }

    public Typeface getTypeface() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Iu, new Class[0], Typeface.class);
        return patchProxyResultProxy.isSupported ? (Typeface) patchProxyResultProxy.result : this.f69599b.getTypeface();
    }

    public boolean h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Du, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f69601d.c() != null;
    }

    public void l(Animator.AnimatorListener animatorListener) {
        if (PatchProxy.proxy(new Object[]{animatorListener}, this, changeQuickRedirect, false, bb.c.f.Nu, new Class[]{Animator.AnimatorListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69602e.removeListener(animatorListener);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Wu, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        canvas.save();
        j(canvas);
        canvas.translate(0.0f, this.f69600c.a());
        this.f69601d.b(canvas, this.f69599b);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Uu, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f69605h = f();
        this.f69606i = e();
        setMeasuredDimension(View.resolveSize(this.f69605h, i10), View.resolveSize(this.f69606i, i11));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Vu, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        this.f69603f.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
    }

    public void setAnimateMeasurementChange(boolean z10) {
        this.f69614q = z10;
    }

    public void setAnimationDelay(long j10) {
        this.f69611n = j10;
    }

    public void setAnimationDuration(long j10) {
        this.f69612o = j10;
    }

    public void setAnimationInterpolator(Interpolator interpolator) {
        this.f69613p = interpolator;
    }

    public void setBlurMaskFilter(BlurMaskFilter.Blur blur, float f10) {
        if (PatchProxy.proxy(new Object[]{blur, new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Pu, new Class[]{BlurMaskFilter.Blur.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (blur == null || f10 <= 0.0f) {
            post(new c());
        } else {
            this.f69599b.setMaskFilter(new BlurMaskFilter(f10, blur));
        }
    }

    public void setCharacterLists(String... strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.f.Cu, new Class[]{String[].class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69601d.j(strArr);
        String str = this.f69615r;
        if (str != null) {
            setText(str, false);
            this.f69615r = null;
        }
    }

    public void setGravity(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Lu, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f69607j == i10) {
            return;
        }
        this.f69607j = i10;
        invalidate();
    }

    public void setPaintFlags(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ou, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69599b.setFlags(i10);
        i();
    }

    public void setPreferredScrollingDirection(ScrollingDirection scrollingDirection) {
        if (PatchProxy.proxy(new Object[]{scrollingDirection}, this, changeQuickRedirect, false, bb.c.f.Ku, new Class[]{ScrollingDirection.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69600c.f(scrollingDirection);
    }

    public void setText(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.Eu, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        setText(str, true ^ TextUtils.isEmpty(this.f69604g));
    }

    public void setText(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Fu, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || TextUtils.equals(str, this.f69604g)) {
            return;
        }
        if (this.f69602e.isRunning()) {
            this.f69602e.cancel();
        }
        this.f69604g = str;
        this.f69601d.m(str == null ? new char[0] : str.toCharArray(), this.f69616s);
        setContentDescription(str);
        if (z10) {
            this.f69602e.setStartDelay(this.f69611n);
            this.f69602e.setDuration(this.f69612o);
            this.f69602e.setInterpolator(this.f69613p);
            this.f69602e.start();
            return;
        }
        this.f69601d.i(1.0f);
        this.f69601d.h();
        d();
        invalidate();
    }

    public void setTextColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Gu, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f69608k == i10) {
            return;
        }
        this.f69608k = i10;
        this.f69599b.setColor(i10);
        invalidate();
    }

    public void setTextSize(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.Hu, new Class[]{Float.TYPE}, Void.TYPE).isSupported || this.f69609l == f10) {
            return;
        }
        this.f69609l = f10;
        this.f69599b.setTextSize(f10);
        i();
    }

    public void setTickerTimeFormat(@n0 TickerUtils.TickerTimeFormat tickerTimeFormat) {
        this.f69616s = tickerTimeFormat;
    }

    public void setTypeface(Typeface typeface) {
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, bb.c.f.Ju, new Class[]{Typeface.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69599b.setTypeface(typeface);
        i();
    }
}
