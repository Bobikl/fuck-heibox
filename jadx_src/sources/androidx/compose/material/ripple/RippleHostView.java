package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.ui.graphics.w1;
import b1.n;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 42\u00020\u0001:\u00015B\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014J0\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016JQ\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010!J\u0006\u0010\"\u001a\u00020\u0004J3\u0010#\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0004R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "bounded", "Lkotlin/b2;", ak.aF, "pressed", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "r", "b", "onLayout", "refreshDrawableState", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "Landroidx/compose/foundation/interaction/i$b;", "interaction", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "radius", "Landroidx/compose/ui/graphics/l0;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Landroidx/compose/foundation/interaction/i$b;ZJIJFLyh/a;)V", "e", "f", "(JIJF)V", "d", "Landroidx/compose/material/ripple/l;", "Landroidx/compose/material/ripple/l;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "g", ak.av, "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f8481h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f8482i = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private l ripple;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Boolean bounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Long lastRippleStateChangeTimeMillis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Runnable resetRippleRunnable;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f8489f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final int[] f8483j = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final int[] f8484k = new int[0];

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostView(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
    }

    private final void c(boolean z10) {
        l lVar = new l(z10);
        setBackground(lVar);
        this.ripple = lVar;
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f8483j : f8484k;
            l lVar = this.ripple;
            if (lVar != null) {
                lVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.h
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.m2setRippleState$lambda2(this.f8518b);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, f8482i);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setRippleState$lambda-2, reason: not valid java name */
    public static final void m2setRippleState$lambda2(RippleHostView this$0) {
        f0.p(this$0, "this$0");
        l lVar = this$0.ripple;
        if (lVar != null) {
            lVar.setState(f8484k);
        }
        this$0.resetRippleRunnable = null;
    }

    public final void b(@dl.d androidx.compose.foundation.interaction.i.b interaction, boolean bounded, long size, int radius, long color, float alpha, @dl.d yh.a<b2> onInvalidateRipple) {
        f0.p(interaction, "interaction");
        f0.p(onInvalidateRipple, "onInvalidateRipple");
        if (this.ripple == null || !f0.g(Boolean.valueOf(bounded), this.bounded)) {
            c(bounded);
            this.bounded = Boolean.valueOf(bounded);
        }
        l lVar = this.ripple;
        f0.m(lVar);
        this.f8489f = onInvalidateRipple;
        f(size, radius, color, alpha);
        if (bounded) {
            lVar.setHotspot(b1.f.p(interaction.getPressPosition()), b1.f.r(interaction.getPressPosition()));
        } else {
            lVar.setHotspot(lVar.getBounds().centerX(), lVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f8489f = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            f0.m(runnable2);
            runnable2.run();
        } else {
            l lVar = this.ripple;
            if (lVar != null) {
                lVar.setState(f8484k);
            }
        }
        l lVar2 = this.ripple;
        if (lVar2 == null) {
            return;
        }
        lVar2.setVisible(false, false);
        unscheduleDrawable(lVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long size, int radius, long color, float alpha) {
        l lVar = this.ripple;
        if (lVar == null) {
            return;
        }
        lVar.c(radius);
        lVar.b(color, alpha);
        Rect rectA = w1.a(n.m(size));
        setLeft(rectA.left);
        setTop(rectA.top);
        setRight(rectA.right);
        setBottom(rectA.bottom);
        lVar.setBounds(rectA);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@dl.d Drawable who) {
        f0.p(who, "who");
        yh.a<b2> aVar = this.f8489f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
