package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultTimeBar extends View implements u0 {
    private static final long G2 = 1000;
    private static final float G3 = 1.0f;
    private static final float J3 = 0.0f;
    private static final String K3 = "android.widget.SeekBar";
    public static final int Q = 4;
    public static final int R = 26;
    public static final int S = 4;
    public static final int T = 12;
    public static final int U = 0;
    public static final int V = 16;
    public static final int W = -1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f50401a0 = 872415231;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f50402b0 = -855638017;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f50403c0 = -1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f50404p1 = -1291845888;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f50405p2 = 1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f50406p3 = 20;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f50407x1 = 872414976;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f50408x2 = -50;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f50409y1 = 0;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f50410y2 = 3;
    private final float A;
    private int B;
    private long C;
    private int D;
    private Rect E;
    private ValueAnimator F;
    private float G;
    private boolean H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private long M;
    private int N;

    @androidx.annotation.p0
    private long[] O;

    @androidx.annotation.p0
    private boolean[] P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f50411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f50412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f50413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f50414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f50415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f50416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f50417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f50418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f50419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Paint f50420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private final Drawable f50421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f50422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f50423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f50424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f50425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f50426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f50427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f50428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f50429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f50430u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final StringBuilder f50431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Formatter f50432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Runnable f50433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final CopyOnWriteArraySet<u0.a> f50434y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Point f50435z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public DefaultTimeBar(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public DefaultTimeBar(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, @androidx.annotation.p0 AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, @androidx.annotation.p0 AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f50411b = new Rect();
        this.f50412c = new Rect();
        this.f50413d = new Rect();
        this.f50414e = new Rect();
        Paint paint = new Paint();
        this.f50415f = paint;
        Paint paint2 = new Paint();
        this.f50416g = paint2;
        Paint paint3 = new Paint();
        this.f50417h = paint3;
        Paint paint4 = new Paint();
        this.f50418i = paint4;
        Paint paint5 = new Paint();
        this.f50419j = paint5;
        Paint paint6 = new Paint();
        this.f50420k = paint6;
        paint6.setAntiAlias(true);
        this.f50434y = new CopyOnWriteArraySet<>();
        this.f50435z = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A = f10;
        this.f50430u = e(f10, f50408x2);
        int iE = e(f10, 4);
        int iE2 = e(f10, 26);
        int iE3 = e(f10, 4);
        int iE4 = e(f10, 12);
        int iE5 = e(f10, 0);
        int iE6 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.f50551d, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.DefaultTimeBar_scrubber_drawable);
                this.f50421l = drawable;
                if (drawable != null) {
                    q(drawable);
                    iE2 = Math.max(drawable.getMinimumHeight(), iE2);
                }
                this.f50422m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_bar_height, iE);
                this.f50423n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_touch_target_height, iE2);
                this.f50424o = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_bar_gravity, 0);
                this.f50425p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_ad_marker_width, iE3);
                this.f50426q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_enabled_size, iE4);
                this.f50427r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_disabled_size, iE5);
                this.f50428s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_dragged_size, iE6);
                int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_color, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_buffered_color, f50402b0);
                int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_unplayed_color, f50401a0);
                int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_ad_marker_color, f50404p1);
                int i17 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_ad_marker_color, f50407x1);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f50422m = iE;
            this.f50423n = iE2;
            this.f50424o = 0;
            this.f50425p = iE3;
            this.f50426q = iE4;
            this.f50427r = iE5;
            this.f50428s = iE6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(f50402b0);
            paint3.setColor(f50401a0);
            paint4.setColor(f50404p1);
            paint5.setColor(f50407x1);
            this.f50421l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f50431v = sb2;
        this.f50432w = new Formatter(sb2, Locale.getDefault());
        this.f50433x = new Runnable() { // from class: com.google.android.exoplayer2.ui.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f50727b.k();
            }
        };
        Drawable drawable2 = this.f50421l;
        if (drawable2 != null) {
            this.f50429t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f50429t = (Math.max(this.f50427r, Math.max(this.f50426q, this.f50428s)) + 1) / 2;
        }
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f50729b.l(valueAnimator2);
            }
        });
        this.K = com.google.android.exoplayer2.j.f46377b;
        this.C = com.google.android.exoplayer2.j.f46377b;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int e(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private void f(Canvas canvas) {
        int i10;
        if (this.K <= 0) {
            return;
        }
        Rect rect = this.f50414e;
        int iS = com.google.android.exoplayer2.util.u0.s(rect.right, rect.left, this.f50412c.right);
        int iCenterY = this.f50414e.centerY();
        Drawable drawable = this.f50421l;
        if (drawable == null) {
            if (this.I || isFocused()) {
                i10 = this.f50428s;
            } else {
                i10 = isEnabled() ? this.f50426q : this.f50427r;
            }
            canvas.drawCircle(iS, iCenterY, (int) ((i10 * this.G) / 2.0f), this.f50420k);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.G)) / 2;
        int intrinsicHeight = ((int) (this.f50421l.getIntrinsicHeight() * this.G)) / 2;
        this.f50421l.setBounds(iS - intrinsicWidth, iCenterY - intrinsicHeight, iS + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f50421l.draw(canvas);
    }

    private void g(Canvas canvas) {
        int iHeight = this.f50412c.height();
        int iCenterY = this.f50412c.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.K <= 0) {
            Rect rect = this.f50412c;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f50417h);
            return;
        }
        Rect rect2 = this.f50413d;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f50412c.left, i12), this.f50414e.right);
        int i13 = this.f50412c.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f50417h);
        }
        int iMax2 = Math.max(i11, this.f50414e.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f50416g);
        }
        if (this.f50414e.width() > 0) {
            Rect rect3 = this.f50414e;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f50415f);
        }
        if (this.N == 0) {
            return;
        }
        long[] jArr = (long[]) com.google.android.exoplayer2.util.a.g(this.O);
        boolean[] zArr = (boolean[]) com.google.android.exoplayer2.util.a.g(this.P);
        int i14 = this.f50425p / 2;
        for (int i15 = 0; i15 < this.N; i15++) {
            int iWidth = ((int) ((((long) this.f50412c.width()) * com.google.android.exoplayer2.util.u0.t(jArr[i15], 0L, this.K)) / this.K)) - i14;
            Rect rect4 = this.f50412c;
            int iMin = rect4.left + Math.min(rect4.width() - this.f50425p, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f50425p, i10, zArr[i15] ? this.f50419j : this.f50418i);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.C;
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            return j10;
        }
        long j11 = this.K;
        if (j11 == com.google.android.exoplayer2.j.f46377b) {
            return 0L;
        }
        return j11 / ((long) this.B);
    }

    private String getProgressText() {
        return com.google.android.exoplayer2.util.u0.r0(this.f50431v, this.f50432w, this.L);
    }

    private long getScrubberPosition() {
        if (this.f50412c.width() <= 0 || this.K == com.google.android.exoplayer2.j.f46377b) {
            return 0L;
        }
        return (((long) this.f50414e.width()) * this.K) / ((long) this.f50412c.width());
    }

    private boolean j(float f10, float f11) {
        return this.f50411b.contains((int) f10, (int) f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        this.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f50411b);
    }

    private void m(float f10) {
        Rect rect = this.f50414e;
        Rect rect2 = this.f50412c;
        rect.right = com.google.android.exoplayer2.util.u0.s((int) f10, rect2.left, rect2.right);
    }

    private static int n(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private Point o(MotionEvent motionEvent) {
        this.f50435z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f50435z;
    }

    private boolean p(long j10) {
        long j11 = this.K;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.I ? this.J : this.L;
        long jT = com.google.android.exoplayer2.util.u0.t(j12 + j10, 0L, j11);
        if (jT == j12) {
            return false;
        }
        if (this.I) {
            z(jT);
        } else {
            v(jT);
        }
        x();
        return true;
    }

    private boolean q(Drawable drawable) {
        return com.google.android.exoplayer2.util.u0.f51536a >= 23 && r(drawable, getLayoutDirection());
    }

    private static boolean r(Drawable drawable, int i10) {
        return com.google.android.exoplayer2.util.u0.f51536a >= 23 && drawable.setLayoutDirection(i10);
    }

    @androidx.annotation.w0(29)
    private void s(int i10, int i11) {
        Rect rect = this.E;
        if (rect != null && rect.width() == i10 && this.E.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void v(long j10) {
        this.J = j10;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<u0.a> it = this.f50434y.iterator();
        while (it.hasNext()) {
            it.next().A(this, j10);
        }
    }

    private void w(boolean z10) {
        removeCallbacks(this.f50433x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<u0.a> it = this.f50434y.iterator();
        while (it.hasNext()) {
            it.next().s(this, this.J, z10);
        }
    }

    private void x() {
        this.f50413d.set(this.f50412c);
        this.f50414e.set(this.f50412c);
        long j10 = this.I ? this.J : this.L;
        if (this.K > 0) {
            int iWidth = (int) ((((long) this.f50412c.width()) * this.M) / this.K);
            Rect rect = this.f50413d;
            Rect rect2 = this.f50412c;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f50412c.width()) * j10) / this.K);
            Rect rect3 = this.f50414e;
            Rect rect4 = this.f50412c;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f50413d;
            int i10 = this.f50412c.left;
            rect5.right = i10;
            this.f50414e.right = i10;
        }
        invalidate(this.f50411b);
    }

    private void y() {
        Drawable drawable = this.f50421l;
        if (drawable != null && drawable.isStateful() && this.f50421l.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void z(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        Iterator<u0.a> it = this.f50434y.iterator();
        while (it.hasNext()) {
            it.next().z(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public void a(u0.a aVar) {
        this.f50434y.remove(aVar);
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public void b(u0.a aVar) {
        com.google.android.exoplayer2.util.a.g(aVar);
        this.f50434y.add(aVar);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        y();
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public long getPreferredUpdateDelay() {
        int iN = n(this.A, this.f50412c.width());
        if (iN != 0) {
            long j10 = this.K;
            if (j10 != 0 && j10 != com.google.android.exoplayer2.j.f46377b) {
                return j10 / ((long) iN);
            }
        }
        return Long.MAX_VALUE;
    }

    public void h(long j10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.F.setFloatValues(this.G, 0.0f);
        this.F.setDuration(j10);
        this.F.start();
    }

    public void i(boolean z10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = z10;
        this.G = 0.0f;
        invalidate(this.f50411b);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f50421l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, @androidx.annotation.p0 Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.I || z10) {
            return;
        }
        w(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(K3);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(K3);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.K <= 0) {
            return;
        }
        if (com.google.android.exoplayer2.util.u0.f51536a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (p(positionIncrement)) {
                            removeCallbacks(this.f50433x);
                            postDelayed(this.f50433x, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (p(positionIncrement)) {
                            removeCallbacks(this.f50433x);
                            postDelayed(this.f50433x, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.I) {
                            w(false);
                            return true;
                        }
                        break;
                }
            } else if (this.I) {
                w(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.H ? 0 : this.f50429t;
        if (this.f50424o == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f50423n;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f50422m;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f50423n) / 2;
            iMax = (i15 - this.f50422m) / 2;
        }
        this.f50411b.set(paddingLeft, paddingBottom, paddingRight, this.f50423n + paddingBottom);
        Rect rect = this.f50412c;
        Rect rect2 = this.f50411b;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f50422m + iMax);
        if (com.google.android.exoplayer2.util.u0.f51536a >= 29) {
            s(i14, i15);
        }
        x();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f50423n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f50423n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        y();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f50421l;
        if (drawable == null || !r(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.K > 0) {
            Point pointO = o(motionEvent);
            int i10 = pointO.x;
            int i11 = pointO.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f10 = i10;
                if (j(f10, i11)) {
                    m(f10);
                    v(getScrubberPosition());
                    x();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.I) {
                    w(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.I) {
                        w(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.I) {
                if (i11 < this.f50430u) {
                    int i12 = this.D;
                    m(i12 + ((i10 - i12) / 3));
                } else {
                    this.D = i10;
                    m(i10);
                }
                z(getScrubberPosition());
                x();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, @androidx.annotation.p0 Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (p(-getPositionIncrement())) {
                w(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (p(getPositionIncrement())) {
                w(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public void setAdGroupTimesMs(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr, int i10) {
        com.google.android.exoplayer2.util.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.N = i10;
        this.O = jArr;
        this.P = zArr;
        x();
    }

    public void setAdMarkerColor(@androidx.annotation.l int i10) {
        this.f50418i.setColor(i10);
        invalidate(this.f50411b);
    }

    public void setBufferedColor(@androidx.annotation.l int i10) {
        this.f50416g.setColor(i10);
        invalidate(this.f50411b);
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public void setBufferedPosition(long j10) {
        if (this.M == j10) {
            return;
        }
        this.M = j10;
        x();
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public void setDuration(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        if (this.I && j10 == com.google.android.exoplayer2.j.f46377b) {
            w(true);
        }
        x();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.u0
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.I || z10) {
            return;
        }
        w(true);
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public void setKeyCountIncrement(int i10) {
        com.google.android.exoplayer2.util.a.a(i10 > 0);
        this.B = i10;
        this.C = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public void setKeyTimeIncrement(long j10) {
        com.google.android.exoplayer2.util.a.a(j10 > 0);
        this.B = -1;
        this.C = j10;
    }

    public void setPlayedAdMarkerColor(@androidx.annotation.l int i10) {
        this.f50419j.setColor(i10);
        invalidate(this.f50411b);
    }

    public void setPlayedColor(@androidx.annotation.l int i10) {
        this.f50415f.setColor(i10);
        invalidate(this.f50411b);
    }

    @Override // com.google.android.exoplayer2.ui.u0
    public void setPosition(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        setContentDescription(getProgressText());
        x();
    }

    public void setScrubberColor(@androidx.annotation.l int i10) {
        this.f50420k.setColor(i10);
        invalidate(this.f50411b);
    }

    public void setUnplayedColor(@androidx.annotation.l int i10) {
        this.f50417h.setColor(i10);
        invalidate(this.f50411b);
    }

    public void t() {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = false;
        this.G = 1.0f;
        invalidate(this.f50411b);
    }

    public void u(long j10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = false;
        this.F.setFloatValues(this.G, 1.0f);
        this.F.setDuration(j10);
        this.F.start();
    }
}
