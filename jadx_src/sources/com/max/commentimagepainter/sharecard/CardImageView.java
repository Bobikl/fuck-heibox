package com.max.commentimagepainter.sharecard;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: CardImageView.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nCardImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardImageView.kt\ncom/max/commentimagepainter/sharecard/CardImageView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,144:1\n11155#2:145\n11266#2,4:146\n*S KotlinDebug\n*F\n+ 1 CardImageView.kt\ncom/max/commentimagepainter/sharecard/CardImageView\n*L\n95#1:145\n95#1:146,4\n*E\n"})
public final class CardImageView extends AppCompatImageView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f65272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f65273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f65274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Path f65275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final RectF f65276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final Integer[] f65277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final GradientDrawable f65278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ValueAnimator f65279i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public CardImageView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public CardImageView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public CardImageView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        Resources resources = getResources();
        f0.o(resources, "getResources(...)");
        this.f65272b = ShareCardDrawUtilsKt.e(bb.c.b.f30919s1, resources);
        Resources resources2 = getResources();
        f0.o(resources2, "getResources(...)");
        this.f65273c = ShareCardDrawUtilsKt.e(bb.c.b.f30943t3, resources2);
        Resources resources3 = context.getResources();
        f0.o(resources3, "getResources(...)");
        this.f65274d = ShareCardDrawUtilsKt.e(16, resources3);
        this.f65275e = new Path();
        this.f65276f = new RectF();
        Integer[] numArr = {Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(0, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(5, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(12, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(20, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(25, 0, bb.c.b.f31029x1, 255)), Integer.valueOf(Color.argb(22, 31, 203, 252)), Integer.valueOf(Color.argb(20, 62, bb.c.b.f30940t0, bb.c.b.P1)), Integer.valueOf(Color.argb(20, 93, 147, bb.c.b.M1)), Integer.valueOf(Color.argb(17, 123, 119, bb.c.b.J1)), Integer.valueOf(Color.argb(20, 154, 92, bb.c.b.H1)), Integer.valueOf(Color.argb(20, 188, 61, bb.c.b.D1)), Integer.valueOf(Color.argb(22, 219, 33, bb.c.b.A1)), Integer.valueOf(Color.argb(25, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(20, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(12, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(7, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1)), Integer.valueOf(Color.argb(0, 255, 0, bb.c.b.f31029x1))};
        this.f65277g = numArr;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, ArraysKt___ArraysKt.dz(numArr));
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        Resources resources4 = getResources();
        f0.o(resources4, "getResources(...)");
        gradientDrawable.setCornerRadius(ShareCardDrawUtilsKt.e(12, resources4));
        this.f65278h = gradientDrawable;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(numArr.length - 1, 0);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.commentimagepainter.sharecard.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CardImageView.g(this.f65357b, valueAnimator);
            }
        });
        this.f65279i = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    public /* synthetic */ CardImageView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(CardImageView this$0, ValueAnimator animator) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{this$0, animator}, null, changeQuickRedirect, true, bb.c.b.Ch, new Class[]{CardImageView.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        Integer[] numArr = this$0.f65277g;
        ArrayList arrayList = new ArrayList(numArr.length);
        int length = numArr.length;
        int i11 = 0;
        while (i10 < length) {
            numArr[i10].intValue();
            Integer[] numArr2 = this$0.f65277g;
            arrayList.add(Integer.valueOf(numArr2[(i11 + iIntValue) % numArr2.length].intValue()));
            i10++;
            i11++;
        }
        this$0.f65278h.setColors(CollectionsKt___CollectionsKt.P5(arrayList));
        this$0.invalidate();
    }

    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31067yh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f65279i.start();
    }

    public final void i() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31089zh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.f65279i.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ah, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f65279i.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@dl.d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.b.Bh, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        float width = (getWidth() - this.f65272b) / 2.0f;
        float height = (getHeight() - this.f65273c) / 2.0f;
        this.f65275e.reset();
        RectF rectF = this.f65276f;
        rectF.set(width, height, this.f65272b + width, this.f65273c + height);
        Path path = this.f65275e;
        int i10 = this.f65274d;
        path.addRoundRect(rectF, i10, i10, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.f65275e);
        int i11 = (int) width;
        int i12 = (int) height;
        this.f65278h.setBounds(i11, i12, this.f65272b + i11, this.f65273c + i12);
        this.f65278h.draw(canvas);
        canvas.restore();
    }
}
