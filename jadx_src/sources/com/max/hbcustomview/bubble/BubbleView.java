package com.max.hbcustomview.bubble;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import bb.c;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BubbleView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class BubbleView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private Context f69035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private Paint f69036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private RectF f69037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private TailDirection f69038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private View f69039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f69040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f69042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f69043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f69044k;

    /* JADX INFO: compiled from: BubbleView.kt */
    public enum TailDirection {
        Left,
        Top,
        Right,
        Bottom,
        TOP_END;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<TailDirection> getEntries() {
            return $ENTRIES;
        }

        public static TailDirection valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.f.Yh, new Class[]{String.class}, TailDirection.class);
            return (TailDirection) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(TailDirection.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static TailDirection[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.f.Xh, new Class[0], TailDirection[].class);
            return (TailDirection[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: BubbleView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69045a;

        static {
            int[] iArr = new int[TailDirection.valuesCustom().length];
            try {
                iArr[TailDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TailDirection.Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TailDirection.TOP_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TailDirection.Right.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TailDirection.Bottom.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f69045a = iArr;
        }
    }

    /* JADX INFO: compiled from: BubbleView.kt */
    public static final class b extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnimatorSet f69046b;

        b(AnimatorSet animatorSet) {
            this.f69046b = animatorSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, c.f.Zh, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            this.f69046b.start();
        }
    }

    public BubbleView(@e Context context) {
        this(context, null);
    }

    public BubbleView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BubbleView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        float fA;
        super(context, attributeSet, i10, i11);
        this.f69038e = TailDirection.Bottom;
        Context context2 = this.f69035b;
        if (context2 != null) {
            ic.a aVar = ic.a.f119343a;
            f0.m(context2);
            fA = aVar.a(context2, 2.0f);
        } else {
            fA = 10.0f;
        }
        this.f69040g = fA;
        this.f69041h = R.color.text_primary_1_color_alpha90;
        this.f69042i = 18.0f;
        this.f69043j = 39.0f;
        this.f69044k = 21.0f;
        d(context);
    }

    public final void a(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Qh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = a.f69045a[this.f69038e.ordinal()];
        if (i11 == 1) {
            setPadding(i10, 0, 0, 0);
            return;
        }
        if (i11 == 2) {
            setPadding(0, i10, 0, 0);
            return;
        }
        if (i11 == 3) {
            setPadding(0, i10, 0, 0);
        } else if (i11 == 4) {
            setPadding(0, 0, i10, 0);
        } else {
            if (i11 != 5) {
                return;
            }
            setPadding(0, 0, 0, i10);
        }
    }

    public final void b(@e Canvas canvas) {
        RectF rectF;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.Sh, new Class[]{Canvas.class}, Void.TYPE).isSupported || (rectF = this.f69037d) == null || this.f69036c == null || canvas == null) {
            return;
        }
        f0.m(rectF);
        float f10 = this.f69040g;
        Paint paint = this.f69036c;
        f0.m(paint);
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }

    public final void c(@e Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.Th, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        Path path = new Path();
        int i10 = a.f69045a[this.f69038e.ordinal()];
        if (i10 == 1) {
            float f10 = 2;
            path.moveTo(this.f69042i, this.f69044k - (this.f69043j / f10));
            path.lineTo(this.f69042i, this.f69044k + (this.f69043j / f10));
            path.lineTo(0.0f, this.f69044k);
            path.close();
        } else if (i10 == 2) {
            path.moveTo(this.f69044k, 0.0f);
            float f11 = 2;
            path.lineTo(this.f69044k - (this.f69043j / f11), this.f69042i);
            path.lineTo(this.f69044k + (this.f69043j / f11), this.f69042i);
            path.close();
        } else if (i10 == 3) {
            float f12 = 2;
            float width = (getWidth() - (this.f69043j / f12)) - this.f69044k;
            path.moveTo(width, 0.0f);
            path.lineTo(width - (this.f69043j / f12), this.f69042i);
            path.lineTo(width + (this.f69043j / f12), this.f69042i);
            path.close();
        } else if (i10 == 4) {
            float f13 = 2;
            path.moveTo(getWidth() - this.f69042i, this.f69044k - (this.f69043j / f13));
            path.lineTo(getWidth() - this.f69042i, this.f69044k + (this.f69043j / f13));
            path.lineTo(getWidth(), this.f69044k);
            path.close();
        } else if (i10 == 5) {
            path.moveTo(this.f69044k, getHeight());
            float f14 = 2;
            path.lineTo(this.f69044k - (this.f69043j / f14), getHeight() - this.f69042i);
            path.lineTo(this.f69044k + (this.f69043j / f14), getHeight() - this.f69042i);
            path.close();
        }
        Paint paint = this.f69036c;
        if (paint == null || canvas == null) {
            return;
        }
        f0.m(paint);
        canvas.drawPath(path, paint);
    }

    public final void d(@e Context context) {
        Resources resources;
        Paint paint;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.f.Rh, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69035b = context;
        Paint paint2 = new Paint();
        this.f69036c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Context context2 = this.f69035b;
        if (context2 != null && (resources = context2.getResources()) != null && (paint = this.f69036c) != null) {
            paint.setColor(resources.getColor(this.f69041h));
        }
        Context context3 = this.f69035b;
        if (context3 != null) {
            ic.a aVar = ic.a.f119343a;
            f0.m(context3);
            setTailWidth(aVar.a(context3, 5.0f));
            Context context4 = this.f69035b;
            f0.m(context4);
            setTailHeight(aVar.a(context4, 2.0f));
            Context context5 = this.f69035b;
            f0.m(context5);
            this.f69044k = aVar.a(context5, 7.0f);
        }
        this.f69037d = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        View view = this.f69039f;
        if (view != null) {
            addView(view);
        }
        a((int) this.f69042i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.Wh, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int iB;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Vh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TailDirection tailDirection = this.f69038e;
        String str = (tailDirection == TailDirection.Top || tailDirection == TailDirection.Bottom || tailDirection == TailDirection.TOP_END) ? "translationY" : "translationX";
        int i10 = a.f69045a[tailDirection.ordinal()];
        if (i10 == 1) {
            ic.a aVar = ic.a.f119343a;
            Context context = getContext();
            f0.o(context, "getContext(...)");
            iB = aVar.b(context, 4);
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            ic.a aVar2 = ic.a.f119343a;
            Context context2 = getContext();
            f0.o(context2, "getContext(...)");
            iB = -aVar2.b(context2, 4);
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            ic.a aVar3 = ic.a.f119343a;
            Context context3 = getContext();
            f0.o(context3, "getContext(...)");
            iB = aVar3.b(context3, 4);
        }
        float f10 = iB;
        AnimatorSet animatorSet = new AnimatorSet();
        float f11 = -f10;
        animatorSet.playSequentially(ObjectAnimator.ofFloat(this, str, f11, 0.0f, f10), ObjectAnimator.ofFloat(this, str, f10, 0.0f, f11));
        animatorSet.addListener(new b(animatorSet));
        animatorSet.setDuration(500L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
    }

    public final int getColorRes() {
        return this.f69041h;
    }

    @e
    public final View getContentView() {
        return this.f69039f;
    }

    @d
    public final TailDirection getDirection() {
        return this.f69038e;
    }

    public final float getRadius() {
        return this.f69040g;
    }

    public final float getTailHeight() {
        return this.f69042i;
    }

    public final float getTailPosition() {
        return this.f69044k;
    }

    public final float getTailWidth() {
        return this.f69043j;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        RectF rectF;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Uh, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = a.f69045a[this.f69038e.ordinal()];
        if (i14 == 1) {
            rectF = new RectF(this.f69042i, 0.0f, i10, i11);
        } else if (i14 == 2 || i14 == 3) {
            rectF = new RectF(0.0f, this.f69042i, i10, i11);
        } else if (i14 == 4) {
            rectF = new RectF(0.0f, 0.0f, i10 - this.f69042i, i11);
        } else {
            if (i14 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            rectF = new RectF(0.0f, 0.0f, i10, i11 - this.f69042i);
        }
        this.f69037d = rectF;
    }

    public final void setColorRes(int i10) {
        Resources resources;
        Paint paint;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Nh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f69035b;
        if (context != null && (resources = context.getResources()) != null && (paint = this.f69036c) != null) {
            paint.setColor(resources.getColor(i10));
        }
        this.f69041h = i10;
    }

    public final void setContentView(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.f.Lh, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69039f = view;
        if (view != null) {
            removeAllViews();
            addView(view);
        }
    }

    public final void setDirection(@d TailDirection value) {
        if (PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, c.f.Kh, new Class[]{TailDirection.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(value, "value");
        this.f69038e = value;
        a((int) this.f69042i);
    }

    public final void setRadius(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.f.Mh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f69035b;
        if (context != null) {
            ic.a aVar = ic.a.f119343a;
            f0.m(context);
            f10 = aVar.a(context, f10);
        }
        this.f69040g = f10;
    }

    public final void setTailHeight(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.f.Oh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f69035b;
        if (context != null) {
            ic.a aVar = ic.a.f119343a;
            f0.m(context);
            f10 = aVar.a(context, f10);
        }
        this.f69042i = f10;
        a((int) f10);
    }

    public final void setTailPosition(float f10) {
        this.f69044k = f10;
    }

    public final void setTailWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.f.Ph, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f69035b;
        if (context != null) {
            ic.a aVar = ic.a.f119343a;
            f0.m(context);
            f10 = aVar.a(context, f10);
        }
        this.f69043j = f10;
    }
}
