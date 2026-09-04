package com.max.xiaoheihe.module.bbs.post.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import com.airbnb.lottie.g;
import com.max.hbutils.anim.OneshotLottieAnimHelper;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Random;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import yh.l;

/* JADX INFO: compiled from: SimplePostLikeFrameLayout.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nSimplePostLikeFrameLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimplePostLikeFrameLayout.kt\ncom/max/xiaoheihe/module/bbs/post/ui/SimplePostLikeFrameLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
@o(parameters = 0)
public final class SimplePostLikeFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f81572e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final Drawable f81573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private ImageView f81574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private String f81575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePostLikeFrameLayout(@d Context context) {
        super(context);
        f0.p(context, "context");
        this.f81573b = androidx.core.content.d.i(getContext(), R.drawable.hb_r_icon_like_gradient);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePostLikeFrameLayout(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f81573b = androidx.core.content.d.i(getContext(), R.drawable.hb_r_icon_like_gradient);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePostLikeFrameLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f81573b = androidx.core.content.d.i(getContext(), R.drawable.hb_r_icon_like_gradient);
    }

    private final ImageView a(Drawable drawable, float f10, float f11) {
        Object[] objArr = {drawable, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28552, new Class[]{Drawable.class, cls, cls}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        layoutParams.leftMargin = (int) (f10 - (drawable.getIntrinsicWidth() / 2));
        layoutParams.topMargin = (int) ((f11 - drawable.getIntrinsicHeight()) - ViewUtils.f(getContext(), 30.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix = new Matrix();
        matrix.postRotate(getRandomRotate());
        imageView.setImageMatrix(matrix);
        imageView.setImageDrawable(drawable);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private final AnimatorSet b(ImageView imageView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 28553, new Class[]{ImageView.class}, AnimatorSet.class);
        if (patchProxyResultProxy.isSupported) {
            return (AnimatorSet) patchProxyResultProxy.result;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, -ViewUtils.f(getContext(), 22.0f));
        objectAnimatorOfFloat4.setDuration(300L);
        objectAnimatorOfFloat4.setStartDelay(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.setDuration(600L);
        return animatorSet;
    }

    private final float getRandomRotate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28554, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : new Random().nextInt(20) - 10;
    }

    public final void c(final float f10, final float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28551, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        String str = this.f81575d;
        if (!(str == null || u.V1(str))) {
            AccelWorldLottieKt.h(this.f81575d, null, new l<g, b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.SimplePostLikeFrameLayout$showLikeAnim$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@d g lottieComposition) {
                    if (PatchProxy.proxy(new Object[]{lottieComposition}, this, changeQuickRedirect, false, 28555, new Class[]{g.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(lottieComposition, "lottieComposition");
                    Context context = this.f81576b.getContext();
                    f0.o(context, "context");
                    new OneshotLottieAnimHelper.a(context).o(f10, f11).k(lottieComposition).r(this.f81576b).a().m();
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(g gVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 28556, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(gVar);
                    return b2.f124493a;
                }
            }, 2, null);
            return;
        }
        Context context = getContext();
        f0.o(context, "context");
        new OneshotLottieAnimHelper.a(context).o(f10, f11).j(R.raw.default_double_click_upvote).r(this).a().m();
    }

    public final void setDoubleClickLottieKey(@e String str) {
        this.f81575d = str;
    }
}
