package com.max.hbcustomview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class CProgressButton extends AppCompatButton {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f68341u = "CProgressButton";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f68342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f68343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private STATE f68346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f68347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f68348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f68349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f68350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f68351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f68352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f68353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f68354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f68355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f68356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f68357t;

    public enum STATE {
        PROGRESS,
        NORMAL;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static STATE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32483p3, new Class[]{String.class}, STATE.class);
            return patchProxyResultProxy.isSupported ? (STATE) patchProxyResultProxy.result : (STATE) Enum.valueOf(STATE.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static STATE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32460o3, new Class[0], STATE[].class);
            return patchProxyResultProxy.isSupported ? (STATE[]) patchProxyResultProxy.result : (STATE[]) values().clone();
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f68358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f68359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68360d;

        public class a implements Parcelable.Creator<SavedState> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public SavedState a(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.f.f32528r3, new Class[]{Parcel.class}, SavedState.class);
                return patchProxyResultProxy.isSupported ? (SavedState) patchProxyResultProxy.result : new SavedState(parcel, null);
            }

            public SavedState[] b(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Type inference failed for: r9v2, types: [com.max.hbcustomview.CProgressButton$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.f.f32572t3, new Class[]{Parcel.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [com.max.hbcustomview.CProgressButton$SavedState[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32550s3, new Class[]{Integer.TYPE}, Object[].class);
                return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f68360d = parcel.readInt();
            this.f68359c = parcel.readInt() == 1;
            this.f68358b = parcel.readInt() == 1;
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32506q3, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f68360d);
            parcel.writeInt(this.f68358b ? 1 : 0);
            parcel.writeInt(this.f68359c ? 1 : 0);
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.f32183c3, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            CProgressButton.a(CProgressButton.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class b implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32253f3, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            CProgressButton.this.f68348k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32230e3, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            CProgressButton.this.f68348k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32207d3, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            CProgressButton.this.f68348k = true;
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.f32276g3, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            CProgressButton.a(CProgressButton.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class d implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32345j3, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            CProgressButton.this.f68347j = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32322i3, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            CProgressButton.this.setText("");
            CProgressButton.this.f68347j = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32299h3, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            CProgressButton.this.setText("");
            CProgressButton.this.f68347j = true;
        }
    }

    public class e extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f68365m = "CircularProgressDrawabl";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f68368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f68371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Context f68372g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private RectF f68373h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private RectF f68374i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Paint f68375j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Path f68376k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f68367b = -90.0f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f68366a = 0.0f;

        public e(Context context, int i10, int i11, int i12, int i13) {
            this.f68368c = i10;
            this.f68372g = context;
            this.f68370e = i12;
            this.f68369d = i11;
            this.f68371f = i13;
        }

        private Paint a(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32437n3, new Class[]{Integer.TYPE}, Paint.class);
            if (patchProxyResultProxy.isSupported) {
                return (Paint) patchProxyResultProxy.result;
            }
            if (this.f68375j == null) {
                Paint paint = new Paint();
                this.f68375j = paint;
                paint.setAntiAlias(true);
                this.f68375j.setColor(this.f68371f);
            }
            if (i10 == 0) {
                this.f68375j.setStyle(Paint.Style.FILL);
            } else {
                this.f68375j.setStyle(Paint.Style.STROKE);
                this.f68375j.setStrokeWidth(i10);
            }
            return this.f68375j;
        }

        private RectF b(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32414m3, new Class[]{Integer.TYPE}, RectF.class);
            if (patchProxyResultProxy.isSupported) {
                return (RectF) patchProxyResultProxy.result;
            }
            int i11 = i10 / 2;
            float f10 = i11;
            float fD = d() - i11;
            RectF rectF = new RectF(f10, f10, fD, fD);
            this.f68374i = rectF;
            return rectF;
        }

        private RectF c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32391l3, new Class[0], RectF.class);
            if (patchProxyResultProxy.isSupported) {
                return (RectF) patchProxyResultProxy.result;
            }
            int iD = d();
            int i10 = iD / 3;
            float f10 = i10;
            float f11 = iD - i10;
            RectF rectF = new RectF(f10, f10, f11, f11);
            this.f68373h = rectF;
            return rectF;
        }

        public int d() {
            return this.f68368c;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32368k3, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
                return;
            }
            Rect bounds = getBounds();
            if (this.f68376k == null) {
                this.f68376k = new Path();
            }
            this.f68376k.reset();
            this.f68376k.addArc(b(this.f68370e), 0.0f, 360.0f);
            this.f68376k.offset(bounds.left, bounds.top);
            canvas.drawPath(this.f68376k, a(this.f68370e));
            this.f68376k.reset();
            this.f68376k.addArc(b(this.f68369d), this.f68367b, this.f68366a);
            this.f68376k.offset(bounds.left, bounds.top);
            canvas.drawPath(this.f68376k, a(this.f68369d));
            this.f68376k.reset();
            this.f68376k.addRoundRect(c(), CProgressButton.this.f68357t, CProgressButton.this.f68357t, Path.Direction.CCW);
            this.f68376k.offset(bounds.left, bounds.top);
            canvas.drawPath(this.f68376k, a(0));
        }

        public void e(float f10) {
            this.f68366a = f10;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public CProgressButton(Context context) {
        this(context, null);
    }

    public CProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CProgressButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68346i = STATE.NORMAL;
        this.f68349l = 40.0f;
        this.f68350m = 90.0f;
        this.f68351n = 500L;
        this.f68353p = 100;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.M, 0, 0);
        try {
            this.f68354q = typedArrayObtainStyledAttributes.getInteger(R.styleable.CProgressButton_c_progress_color, 0);
            this.f68342e = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CProgressButton_c_progress_drawable_xml);
            this.f68356s = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CProgressButton_c_progress_stroke_width, -1.0f);
            this.f68349l = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.CProgressButton_c_progress_radius, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            if (this.f68354q == 0) {
                this.f68354q = getResources().getColor(R.color.black);
            }
            if (this.f68342e == null) {
                throw new NullPointerException("drawable_xml can not be null");
            }
            if (this.f68356s == -1) {
                this.f68356s = e(getContext(), 1.0f);
            }
            if (this.f68349l == -1.0f) {
                throw new NullPointerException("radius must can not be null");
            }
            this.f68355r = this.f68356s * 4;
            this.f68357t = e(context, 2.0f);
            i();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    static /* synthetic */ void a(CProgressButton cProgressButton, int i10) {
        if (PatchProxy.proxy(new Object[]{cProgressButton, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32160b3, new Class[]{CProgressButton.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cProgressButton.setBound(i10);
    }

    public static int e(Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.f.Y2, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.V2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f68342e, "cornerRadius", this.f68349l, this.f68350m);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (this.f68344g - this.f68345h) / 2);
        valueAnimatorOfInt.setDuration(this.f68351n).addUpdateListener(new c());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.f68351n);
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.addListener(new d());
        animatorSet.start();
    }

    private void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.U2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f68342e, "cornerRadius", this.f68350m, this.f68349l);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((this.f68344g - this.f68345h) / 2, 0);
        valueAnimatorOfInt.setDuration(this.f68351n).addUpdateListener(new a());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.f68351n);
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    private void j(STATE state, boolean z10) {
        if (PatchProxy.proxy(new Object[]{state, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.O2, new Class[]{STATE.class, Boolean.TYPE}, Void.TYPE).isSupported || state == this.f68346i || getWidth() == 0 || this.f68347j || this.f68348k) {
            return;
        }
        this.f68346i = state;
        if (!z10) {
            this.f68348k = false;
            this.f68347j = false;
            setBound(0);
        } else if (state == STATE.PROGRESS) {
            g();
        } else if (state == STATE.NORMAL) {
            h();
        }
    }

    private void setBound(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.R2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f68344g == 0) {
            this.f68344g = (getWidth() - getPaddingLeft()) - getPaddingRight();
        }
        if (this.f68345h == 0) {
            this.f68345h = (getHeight() - getPaddingTop()) - getPaddingRight();
        }
        this.f68342e.setBounds(getPaddingLeft() + i10, getPaddingTop(), (getPaddingLeft() + this.f68344g) - i10, getPaddingTop() + this.f68345h);
        invalidate();
    }

    private void setProgress(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.S2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68352o = i10;
        if (this.f68347j || this.f68348k) {
            return;
        }
        STATE state = this.f68346i;
        STATE state2 = STATE.PROGRESS;
        if (state != state2) {
            j(state2, true);
        }
        int i11 = this.f68352o;
        int i12 = this.f68353p;
        if (i11 >= i12) {
            this.f68352o = i12;
        }
        if (this.f68352o <= 0) {
            this.f68352o = 0;
        }
        setBound(0);
        invalidate();
    }

    public void f(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Z2, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setProgress(i10);
    }

    public STATE getState() {
        return this.f68346i;
    }

    public void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32137a3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j(STATE.NORMAL, true);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        STATE state;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.T2, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        STATE state2 = this.f68346i;
        if (state2 == STATE.NORMAL || (state2 == (state = STATE.PROGRESS) && this.f68347j)) {
            this.f68342e.draw(canvas);
            return;
        }
        if (state2 != state || this.f68347j) {
            return;
        }
        if (this.f68343f == null) {
            int paddingLeft = ((this.f68344g - this.f68345h) / 2) + getPaddingLeft();
            e eVar = new e(getContext(), this.f68345h, this.f68355r, this.f68356s, this.f68354q);
            this.f68343f = eVar;
            eVar.setBounds(paddingLeft, getPaddingTop(), this.f68345h + paddingLeft, getPaddingTop() + this.f68345h);
        }
        this.f68343f.e((360.0f / this.f68353p) * this.f68352o);
        this.f68343f.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.P2, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        this.f68344g = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.f68345h = (getHeight() - getPaddingTop()) - getPaddingRight();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, changeQuickRedirect, false, bb.c.f.X2, new Class[]{Parcelable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f68352o = savedState.f68360d;
        this.f68348k = savedState.f68358b;
        this.f68347j = savedState.f68359c;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(this.f68352o);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.W2, new Class[0], Parcelable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Parcelable) patchProxyResultProxy.result;
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f68360d = this.f68352o;
        savedState.f68358b = this.f68348k;
        savedState.f68359c = this.f68347j;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Q2, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        this.f68344g = (i10 - getPaddingLeft()) - getPaddingRight();
        this.f68345h = (i11 - getPaddingTop()) - getPaddingRight();
        STATE state = this.f68346i;
        if (state == STATE.NORMAL || (state == STATE.PROGRESS && this.f68347j)) {
            setBound(0);
        } else {
            invalidate();
        }
    }
}
