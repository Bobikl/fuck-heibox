package com.previewlibrary.wight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.core.view.j1;
import com.github.chrisbanes.photoview.PhotoView;
import com.previewlibrary.R;

/* JADX INFO: loaded from: classes6.dex */
public class SmoothImageView extends PhotoView {
    private static int B = 400;
    private static boolean C = false;
    private static boolean D = false;
    private static final int E = 5;
    private j A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f96383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Status f96385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f96386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f96387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f96388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f96389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f96390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f96391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f96392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f96393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f96394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f96395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ValueAnimator f96396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f96397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f96398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f96399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f96400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f96401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f96402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f96403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private h f96404y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private i f96405z;

    public enum Status {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96406b = 0;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i10 = this.f96406b;
            if (i10 != 0) {
                SmoothImageView.this.offsetTopAndBottom(iIntValue - i10);
            }
            this.f96406b = iIntValue;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96408b = 0;

        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i10 = this.f96408b;
            if (i10 != 0) {
                SmoothImageView.this.offsetLeftAndRight(iIntValue - i10);
            }
            this.f96408b = iIntValue;
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (SmoothImageView.this.f96403x != null) {
                SmoothImageView.this.f96403x.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothImageView.this.setScaleX(fFloatValue);
            SmoothImageView.this.setScaleY(fFloatValue);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothImageView.this.f96390k.f96418f = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
            SmoothImageView.this.f96390k.f96419g = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
            SmoothImageView.this.f96390k.f96414b = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
            SmoothImageView.this.f96390k.f96415c = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
            SmoothImageView.this.f96390k.f96416d = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
            SmoothImageView.this.f96390k.f96417e = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
            SmoothImageView.this.invalidate();
        }
    }

    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (SmoothImageView.this.A != null) {
                SmoothImageView.this.A.a(SmoothImageView.this.f96385f);
            }
            if (SmoothImageView.this.f96385f == Status.STATE_IN) {
                SmoothImageView.this.f96385f = Status.STATE_NORMAL;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SmoothImageView smoothImageView = SmoothImageView.this;
            int i10 = R.id.item_image_key;
            if (smoothImageView.getTag(i10) != null) {
                SmoothImageView.this.setTag(i10, null);
                SmoothImageView.this.setOnLongClickListener(null);
            }
        }
    }

    public interface g {
        void a(int i10);
    }

    public interface h {
        void a();
    }

    public class i implements Cloneable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f96414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f96415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f96416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f96417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f96418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f96419g;

        private i() {
        }

        /* synthetic */ i(SmoothImageView smoothImageView, a aVar) {
            this();
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i clone() {
            try {
                return (i) super.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    public interface j {
        void a(Status status);
    }

    public SmoothImageView(Context context) {
        super(context);
        this.f96383d = false;
        this.f96384e = true;
        this.f96385f = Status.STATE_NORMAL;
        this.f96397r = 0.5f;
        this.f96400u = false;
        this.f96401v = false;
        this.f96402w = 0;
        v();
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96383d = false;
        this.f96384e = true;
        this.f96385f = Status.STATE_NORMAL;
        this.f96397r = 0.5f;
        this.f96400u = false;
        this.f96401v = false;
        this.f96402w = 0;
        v();
    }

    private void A() {
        this.f96392m = false;
        if (this.f96390k == null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f96396q = valueAnimator;
        valueAnimator.setDuration(B);
        this.f96396q.setInterpolator(new AccelerateDecelerateInterpolator());
        Status status = this.f96385f;
        if (status == Status.STATE_IN) {
            this.f96396q.setValues(PropertyValuesHolder.ofFloat("animScale", this.f96388i.f96419g, this.f96389j.f96419g), PropertyValuesHolder.ofInt("animAlpha", this.f96388i.f96418f, this.f96389j.f96418f), PropertyValuesHolder.ofFloat("animLeft", this.f96388i.f96414b, this.f96389j.f96414b), PropertyValuesHolder.ofFloat("animTop", this.f96388i.f96415c, this.f96389j.f96415c), PropertyValuesHolder.ofFloat("animWidth", this.f96388i.f96416d, this.f96389j.f96416d), PropertyValuesHolder.ofFloat("animHeight", this.f96388i.f96417e, this.f96389j.f96417e));
        } else if (status == Status.STATE_OUT) {
            i iVar = this.f96389j;
            float f10 = this.f96390k.f96419g;
            iVar.f96419g = f10;
            this.f96396q.setValues(PropertyValuesHolder.ofFloat("animScale", f10, this.f96388i.f96419g), PropertyValuesHolder.ofInt("animAlpha", this.f96389j.f96418f, this.f96388i.f96418f), PropertyValuesHolder.ofFloat("animLeft", this.f96389j.f96414b, this.f96388i.f96414b), PropertyValuesHolder.ofFloat("animTop", this.f96389j.f96415c, this.f96388i.f96415c), PropertyValuesHolder.ofFloat("animWidth", this.f96389j.f96416d, this.f96388i.f96416d), PropertyValuesHolder.ofFloat("animHeight", this.f96389j.f96417e, this.f96388i.f96417e));
        }
        this.f96396q.addUpdateListener(new e());
        this.f96396q.addListener(new f());
        this.f96396q.start();
    }

    public static int getDuration() {
        return B;
    }

    private boolean p() {
        if (y() <= this.f96397r) {
            z();
            return true;
        }
        t();
        setTag(R.id.item_image_key, Boolean.TRUE);
        h hVar = this.f96404y;
        if (hVar == null) {
            return true;
        }
        hVar.a();
        return true;
    }

    private void q(MotionEvent motionEvent) {
        this.f96398s = (int) motionEvent.getX();
        this.f96399t = (int) motionEvent.getY();
        if (this.f96405z == null) {
            w();
        }
        this.f96401v = false;
        i iVar = this.f96405z;
        if (iVar != null) {
            float f10 = iVar.f96415c;
            int i10 = (int) f10;
            int i11 = (int) (iVar.f96417e + f10);
            int i12 = this.f96399t;
            if (i12 >= i10 && i11 >= i12) {
                this.f96401v = true;
            }
        }
        this.f96400u = false;
    }

    private boolean r(MotionEvent motionEvent) {
        if (!this.f96401v && motionEvent.getPointerCount() == 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i10 = x10 - this.f96398s;
        int i11 = y10 - this.f96399t;
        if ((!this.f96400u && (Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < 5)) || getScale() != 1.0f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.f96395p && motionEvent.getPointerCount() == 1) {
            this.f96385f = Status.STATE_MOVE;
            offsetLeftAndRight(i10);
            offsetTopAndBottom(i11);
            float fY = y();
            float f10 = 1.0f - (0.1f * fY);
            setScaleY(f10);
            setScaleX(f10);
            this.f96400u = true;
            this.f96402w = (int) ((1.0f - (fY * 0.5f)) * 255.0f);
            invalidate();
            if (this.f96402w < 0) {
                this.f96402w = 0;
            }
            g gVar = this.f96403x;
            if (gVar != null) {
                gVar.a(this.f96402w);
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static void setDuration(int i10) {
        B = i10;
    }

    public static void setFullscreen(boolean z10) {
        C = z10;
    }

    public static void setIsScale(boolean z10) {
        D = z10;
    }

    private void t() {
        i iVar = this.f96405z;
        if (iVar != null) {
            i iVarClone = iVar.clone();
            iVarClone.f96415c = this.f96405z.f96415c + getTop();
            iVarClone.f96414b = this.f96405z.f96414b + getLeft();
            iVarClone.f96418f = this.f96402w;
            this.f96390k = iVarClone.clone();
            this.f96389j = iVarClone.clone();
        }
    }

    private void v() {
        Paint paint = new Paint();
        this.f96386g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f96386g.setColor(j1.f21601t);
        this.f96387h = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private void w() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.f96388i != null && this.f96389j != null && this.f96390k != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f96393n = bitmap.getWidth();
            this.f96394o = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f96393n = colorDrawable.getIntrinsicWidth();
            this.f96394o = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f96393n = bitmapCreateBitmap.getWidth();
            this.f96394o = bitmapCreateBitmap.getHeight();
        }
        a aVar = null;
        i iVar = new i(this, aVar);
        this.f96388i = iVar;
        iVar.f96418f = 0;
        if (this.f96391l == null) {
            this.f96391l = new Rect();
        }
        i iVar2 = this.f96388i;
        Rect rect = this.f96391l;
        iVar2.f96414b = rect.left;
        if (C) {
            iVar2.f96415c = rect.top;
        } else {
            iVar2.f96415c = rect.top - com.previewlibrary.view.b.a(getContext().getApplicationContext());
        }
        this.f96388i.f96416d = this.f96391l.width();
        this.f96388i.f96417e = this.f96391l.height();
        float fWidth = this.f96391l.width() / this.f96393n;
        float fHeight = this.f96391l.height() / this.f96394o;
        i iVar3 = this.f96388i;
        if (fWidth <= fHeight) {
            fWidth = fHeight;
        }
        iVar3.f96419g = fWidth;
        float width = getWidth() / this.f96393n;
        float height = getHeight() / this.f96394o;
        i iVar4 = new i(this, aVar);
        this.f96389j = iVar4;
        if (width >= height) {
            width = height;
        }
        iVar4.f96419g = width;
        iVar4.f96418f = 255;
        int i10 = (int) (this.f96393n * width);
        int i11 = (int) (width * this.f96394o);
        iVar4.f96414b = (getWidth() - i10) / 2;
        this.f96389j.f96415c = (getHeight() - i11) / 2;
        i iVar5 = this.f96389j;
        iVar5.f96416d = i10;
        iVar5.f96417e = i11;
        Status status = this.f96385f;
        if (status == Status.STATE_IN) {
            this.f96390k = this.f96388i.clone();
        } else if (status == Status.STATE_OUT) {
            this.f96390k = iVar5.clone();
        }
        this.f96405z = this.f96389j;
    }

    private float y() {
        if (this.f96405z == null) {
            w();
        }
        return Math.abs(getTop() / this.f96405z.f96417e);
    }

    private void z() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new a());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new b());
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.f96402w, 255);
        valueAnimatorOfInt3.addUpdateListener(new c());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(B);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    public void B(j jVar) {
        setOnTransformListener(jVar);
        this.f96392m = true;
        this.f96385f = Status.STATE_IN;
        invalidate();
    }

    public void C(j jVar) {
        if (getTop() != 0) {
            offsetTopAndBottom(-getTop());
        }
        if (getLeft() != 0) {
            offsetLeftAndRight(-getLeft());
        }
        float fMin = Math.min(getWidth() / this.f96393n, getHeight() / this.f96394o);
        if (getScaleX() != fMin) {
            setScaleX(fMin);
            setScaleY(fMin);
        }
        setOnTransformListener(jVar);
        this.f96392m = true;
        this.f96385f = Status.STATE_OUT;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!D) {
            if (action == 0) {
                this.f96383d = false;
                q(motionEvent);
            } else if (action == 1) {
                this.f96383d = false;
                if (this.f96400u) {
                    return p();
                }
            } else {
                if (action == 2) {
                    this.f96383d = true;
                    return r(motionEvent);
                }
                if (action == 3) {
                    this.f96383d = false;
                    if (this.f96400u) {
                        return p();
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        if (getScale() != 1.0f) {
            if (action == 1 || action == 3) {
                this.f96383d = false;
                if (this.f96400u) {
                    return p();
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        if (action == 0) {
            this.f96383d = false;
            q(motionEvent);
        } else if (action == 1) {
            this.f96383d = false;
            if (this.f96400u) {
                return p();
            }
        } else {
            if (action == 2) {
                this.f96383d = true;
                return r(motionEvent);
            }
            if (action == 3) {
                this.f96383d = false;
                if (this.f96400u) {
                    return p();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f96393n = 0;
        this.f96394o = 0;
        this.f96391l = null;
        C = false;
        ValueAnimator valueAnimator = this.f96396q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f96396q.clone();
            this.f96396q = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.f96385f;
        if (status != Status.STATE_OUT && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.f96386g.setAlpha(0);
                canvas.drawPaint(this.f96386g);
                super.onDraw(canvas);
                return;
            } else {
                this.f96386g.setAlpha(255);
                canvas.drawPaint(this.f96386g);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.f96388i == null || this.f96389j == null || this.f96390k == null) {
            w();
        }
        i iVar = this.f96390k;
        if (iVar == null) {
            super.onDraw(canvas);
            return;
        }
        this.f96386g.setAlpha(iVar.f96418f);
        canvas.drawPaint(this.f96386g);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f96387h;
        float f10 = this.f96390k.f96419g;
        matrix.setScale(f10, f10);
        float f11 = this.f96393n;
        i iVar2 = this.f96390k;
        float f12 = iVar2.f96419g;
        this.f96387h.postTranslate((-((f11 * f12) - iVar2.f96416d)) / 2.0f, (-((this.f96394o * f12) - iVar2.f96417e)) / 2.0f);
        i iVar3 = this.f96390k;
        canvas.translate(iVar3.f96414b, iVar3.f96415c);
        i iVar4 = this.f96390k;
        canvas.clipRect(0.0f, 0.0f, iVar4.f96416d, iVar4.f96417e);
        canvas.concat(this.f96387h);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f96392m) {
            A();
        }
    }

    public void s() {
        if (getDrawable() == null || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f96393n = bitmap.getWidth();
            this.f96394o = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f96393n = colorDrawable.getIntrinsicWidth();
            this.f96394o = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f96393n = bitmapCreateBitmap.getWidth();
            this.f96394o = bitmapCreateBitmap.getHeight();
        }
        a aVar = null;
        i iVar = new i(this, aVar);
        this.f96388i = iVar;
        iVar.f96418f = 0;
        if (this.f96391l == null) {
            this.f96391l = new Rect();
        }
        i iVar2 = this.f96388i;
        Rect rect = this.f96391l;
        iVar2.f96414b = rect.left;
        if (C) {
            iVar2.f96415c = rect.top;
        } else {
            iVar2.f96415c = rect.top - com.previewlibrary.view.b.a(getContext().getApplicationContext());
        }
        this.f96388i.f96416d = this.f96391l.width();
        this.f96388i.f96417e = this.f96391l.height();
        float fWidth = this.f96391l.width() / this.f96393n;
        float fHeight = this.f96391l.height() / this.f96394o;
        i iVar3 = this.f96388i;
        if (fWidth <= fHeight) {
            fWidth = fHeight;
        }
        iVar3.f96419g = fWidth;
        float width = getWidth() / this.f96393n;
        float height = getHeight() / this.f96394o;
        i iVar4 = new i(this, aVar);
        this.f96389j = iVar4;
        if (width >= height) {
            width = height;
        }
        iVar4.f96419g = width;
        iVar4.f96418f = 255;
        int i10 = (int) (this.f96393n * width);
        int i11 = (int) (width * this.f96394o);
        iVar4.f96414b = (getWidth() - i10) / 2;
        this.f96389j.f96415c = (getHeight() - i11) / 2;
        i iVar5 = this.f96389j;
        iVar5.f96416d = i10;
        iVar5.f96417e = i11;
        Status status = this.f96385f;
        if (status == Status.STATE_IN) {
            this.f96390k = this.f96388i.clone();
        } else if (status == Status.STATE_OUT) {
            this.f96390k = iVar5.clone();
        }
        this.f96405z = this.f96389j;
    }

    public void setAlphaChangeListener(g gVar) {
        this.f96403x = gVar;
    }

    public void setDrag(boolean z10, float f10) {
        this.f96395p = z10;
        this.f96397r = f10;
    }

    public void setOnTransformListener(j jVar) {
        this.A = jVar;
    }

    public void setThumbRect(Rect rect) {
        this.f96391l = rect;
    }

    public void setTransformOutListener(h hVar) {
        this.f96404y = hVar;
    }

    public boolean u() {
        if (getScale() == 1.0f) {
            return true;
        }
        setScale(1.0f, true);
        return false;
    }

    public boolean x() {
        return this.f96400u;
    }
}
