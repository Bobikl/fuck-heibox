package com.max.hbcustomview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public class ShootEmojiView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f68883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f68884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Random f68886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f68887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f68888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f68889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Interpolator f68890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f68891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f68892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f68893l;

    public class a extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f68894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f68895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ImageView f68896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImageView f68897e;

        a(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
            this.f68894b = imageView;
            this.f68895c = imageView2;
            this.f68896d = imageView3;
            this.f68897e = imageView4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.f32581tc, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onAnimationEnd(animator);
            ShootEmojiView.a(ShootEmojiView.this, this.f68894b);
            ShootEmojiView.a(ShootEmojiView.this, this.f68895c);
            ShootEmojiView.a(ShootEmojiView.this, this.f68896d);
            ShootEmojiView.a(ShootEmojiView.this, this.f68897e);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Path f68899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Path f68900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Path f68901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Path f68902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImageView[] f68903f;

        b(Path path, Path path2, Path path3, Path path4, ImageView[] imageViewArr) {
            this.f68899b = path;
            this.f68900c = path2;
            this.f68901d = path3;
            this.f68902e = path4;
            this.f68903f = imageViewArr;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.f32603uc, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue == 1.0f) {
                this.f68899b.reset();
                this.f68900c.reset();
                this.f68901d.reset();
                this.f68902e.reset();
            }
            ShootEmojiView.b(ShootEmojiView.this, this.f68899b, this.f68903f[0], fFloatValue);
            ShootEmojiView.b(ShootEmojiView.this, this.f68900c, this.f68903f[1], fFloatValue);
            ShootEmojiView.b(ShootEmojiView.this, this.f68901d, this.f68903f[2], fFloatValue);
            ShootEmojiView.b(ShootEmojiView.this, this.f68902e, this.f68903f[3], fFloatValue);
        }
    }

    public ShootEmojiView(Context context) {
        super(context);
        this.f68886e = new Random();
        this.f68892k = -1.0f;
        this.f68893l = -1.0f;
        this.f68883b = context;
        setWillNotDraw(false);
        j();
    }

    public ShootEmojiView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68886e = new Random();
        this.f68892k = -1.0f;
        this.f68893l = -1.0f;
        this.f68883b = context;
        setWillNotDraw(false);
        j();
    }

    static /* synthetic */ void a(ShootEmojiView shootEmojiView, View view) {
        if (PatchProxy.proxy(new Object[]{shootEmojiView, view}, null, changeQuickRedirect, true, bb.c.f.f32537rc, new Class[]{ShootEmojiView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        shootEmojiView.l(view);
    }

    static /* synthetic */ void b(ShootEmojiView shootEmojiView, Path path, ImageView imageView, float f10) {
        if (PatchProxy.proxy(new Object[]{shootEmojiView, path, imageView, new Float(f10)}, null, changeQuickRedirect, true, bb.c.f.f32559sc, new Class[]{ShootEmojiView.class, Path.class, ImageView.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        shootEmojiView.m(path, imageView, f10);
    }

    private void d(View view) {
        ViewGroup viewGroup;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32400lc, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f68883b;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || (viewGroup = (ViewGroup) activity.findViewById(android.R.id.content)) == null) {
                return;
            }
            viewGroup.addView(view);
        }
    }

    private void e(Path path, int i10) {
        if (PatchProxy.proxy(new Object[]{path, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32469oc, new Class[]{Path.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iMax = Math.max(1, this.f68884c / 4);
        int iMax2 = Math.max(1, (int) (this.f68893l / 8.0f));
        float fNextInt = this.f68886e.nextInt(iMax) + (iMax * i10);
        int i11 = (int) ((this.f68892k + fNextInt) / 2.0f);
        float fNextInt2 = (int) (((this.f68893l - this.f68886e.nextInt(iMax2)) - (iMax2 * i10)) + ((i10 != 3 ? 0 : 2) * iMax2));
        path.quadTo(i11, (int) (((this.f68893l + fNextInt2) / 2.0f) - iMax2), fNextInt, fNextInt2);
    }

    private ValueAnimator f(ImageView... imageViewArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewArr}, this, changeQuickRedirect, false, bb.c.f.f32492pc, new Class[]{ImageView[].class}, ValueAnimator.class);
        if (patchProxyResultProxy.isSupported) {
            return (ValueAnimator) patchProxyResultProxy.result;
        }
        Path path = new Path();
        Path path2 = new Path();
        Path path3 = new Path();
        Path path4 = new Path();
        path.moveTo(this.f68892k, this.f68893l);
        e(path, 0);
        path2.moveTo(this.f68892k, this.f68893l);
        e(path2, 1);
        path3.moveTo(this.f68892k, this.f68893l);
        e(path3, 2);
        path4.moveTo(this.f68892k, this.f68893l);
        e(path4, 3);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f68890i);
        valueAnimatorOfFloat.addUpdateListener(new b(path, path2, path3, path4, imageViewArr));
        return valueAnimatorOfFloat;
    }

    private AnimatorSet g(ImageView... imageViewArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageViewArr}, this, changeQuickRedirect, false, bb.c.f.f32446nc, new Class[]{ImageView[].class}, AnimatorSet.class);
        if (patchProxyResultProxy.isSupported) {
            return (AnimatorSet) patchProxyResultProxy.result;
        }
        ValueAnimator valueAnimatorF = f(imageViewArr);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorF);
        animatorSet.setDuration(500L);
        return animatorSet;
    }

    private float h(View view, float f10) {
        Object[] objArr = {view, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32331ic, new Class[]{View.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        return (view == null || (view instanceof ShootEmojiView) || view.getParent() == null) ? f10 : h((View) view.getParent(), f10 + view.getX());
    }

    private float i(View view, float f10) {
        Object[] objArr = {view, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32354jc, new Class[]{View.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        return (view == null || (view instanceof ShootEmojiView) || view.getParent() == null) ? f10 : i((View) view.getParent(), f10 + view.getY());
    }

    private void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32262fc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Paint paint = new Paint();
        this.f68887f = paint;
        paint.setColor(y1.a.f141526c);
        this.f68887f.setStyle(Paint.Style.STROKE);
        this.f68887f.setStrokeWidth(2.0f);
        this.f68887f.setTextSize(50.0f);
        this.f68887f.setAntiAlias(true);
        this.f68888g = new float[2];
        this.f68889h = new float[2];
        this.f68890i = new DecelerateInterpolator();
    }

    private void l(View view) {
        ViewGroup viewGroup;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.f32423mc, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f68883b;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || (viewGroup = (ViewGroup) activity.findViewById(android.R.id.content)) == null) {
                return;
            }
            viewGroup.removeView(view);
        }
    }

    private void m(Path path, ImageView imageView, float f10) {
        if (PatchProxy.proxy(new Object[]{path, imageView, new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.f32515qc, new Class[]{Path.class, ImageView.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        PathMeasure pathMeasure = new PathMeasure(path, false);
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.f68888g, this.f68889h);
        imageView.setX(this.f68888g[0]);
        imageView.setY(this.f68888g[1]);
    }

    public void c(View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32377kc, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f68892k = i10 > 0 ? i10 : (h(view, 0.0f) + (view.getWidth() / 2.0f)) - 40.0f;
        this.f68893l = i11 > 0 ? i11 : (i(view, 0.0f) - (view.getWidth() / 2.0f)) + 40.0f;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = 80;
        layoutParams.height = 80;
        int iMax = Math.max(this.f68891j.length, 1);
        ImageView imageView = new ImageView(this.f68883b);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(this.f68891j[new Random().nextInt(iMax)]);
        d(imageView);
        ImageView imageView2 = new ImageView(this.f68883b);
        imageView2.setLayoutParams(layoutParams);
        imageView2.setImageResource(this.f68891j[new Random().nextInt(iMax)]);
        d(imageView2);
        ImageView imageView3 = new ImageView(this.f68883b);
        imageView3.setLayoutParams(layoutParams);
        imageView3.setImageResource(this.f68891j[new Random().nextInt(iMax)]);
        d(imageView3);
        ImageView imageView4 = new ImageView(this.f68883b);
        imageView4.setLayoutParams(layoutParams);
        imageView4.setImageResource(this.f68891j[new Random().nextInt(iMax)]);
        d(imageView4);
        AnimatorSet animatorSetG = g(imageView, imageView2, imageView3, imageView4);
        animatorSetG.start();
        animatorSetG.addListener(new a(imageView, imageView2, imageView3, imageView4));
    }

    public void k(int[] iArr) {
        this.f68891j = iArr;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32308hc, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32285gc, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        this.f68884c = getMeasuredWidth();
        this.f68885d = getMeasuredHeight();
    }
}
