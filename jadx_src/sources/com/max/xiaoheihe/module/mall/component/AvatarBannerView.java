package com.max.xiaoheihe.module.mall.component;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ke0;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kb.c;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AvatarBannerView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class AvatarBannerView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90524e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ke0 f90525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private List<String> f90526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final a f90527d;

    /* JADX INFO: compiled from: AvatarBannerView.kt */
    @o(parameters = 0)
    public static final class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90528b = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        private final WeakReference<AvatarBannerView> f90529a;

        public a(@d AvatarBannerView bannerView) {
            f0.p(bannerView, "bannerView");
            this.f90529a = new WeakReference<>(bannerView);
        }

        @Override // android.os.Handler
        public void handleMessage(@d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 41843, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            super.handleMessage(msg);
            AvatarBannerView avatarBannerView = this.f90529a.get();
            if (avatarBannerView != null) {
                avatarBannerView.g();
            }
        }
    }

    /* JADX INFO: compiled from: AvatarBannerView.kt */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<AvatarBannerView> f90530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AvatarBannerView f90531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f90532d;

        b(WeakReference<AvatarBannerView> weakReference, AvatarBannerView avatarBannerView, float f10) {
            this.f90530b = weakReference;
            this.f90531c = avatarBannerView;
            this.f90532d = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@d ValueAnimator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 41844, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
            AvatarBannerView avatarBannerView = this.f90530b.get();
            if (avatarBannerView != null) {
                AvatarBannerView avatarBannerView2 = this.f90531c;
                float f10 = this.f90532d;
                Object animatedValue = animator.getAnimatedValue();
                f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                if (fFloatValue == 1.0f) {
                    fFloatValue = 0.0f;
                    AvatarBannerView.b(avatarBannerView2);
                }
                ImageView imageViewA = AvatarBannerView.a(avatarBannerView, 0);
                if (imageViewA != null) {
                    imageViewA.setScaleX(fFloatValue);
                    imageViewA.setScaleY(fFloatValue);
                }
                ImageView imageViewA2 = AvatarBannerView.a(avatarBannerView, 1);
                if (imageViewA2 != null) {
                    imageViewA2.setTranslationX(f10 * fFloatValue);
                }
                ImageView imageViewA3 = AvatarBannerView.a(avatarBannerView, 2);
                if (imageViewA3 != null) {
                    imageViewA3.setTranslationX(f10 * fFloatValue);
                }
                ImageView imageViewA4 = AvatarBannerView.a(avatarBannerView, 3);
                if (imageViewA4 != null) {
                    float f11 = 1.0f - fFloatValue;
                    imageViewA4.setScaleX(f11);
                    imageViewA4.setScaleY(f11);
                }
            }
        }
    }

    public AvatarBannerView(@e Context context) {
        this(context, null);
    }

    public AvatarBannerView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarBannerView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public AvatarBannerView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f90526c = new ArrayList();
        this.f90527d = new a(this);
        c();
    }

    public static final /* synthetic */ ImageView a(AvatarBannerView avatarBannerView, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{avatarBannerView, new Integer(i10)}, null, changeQuickRedirect, true, 41842, new Class[]{AvatarBannerView.class, Integer.TYPE}, ImageView.class);
        return patchProxyResultProxy.isSupported ? (ImageView) patchProxyResultProxy.result : avatarBannerView.d(i10);
    }

    public static final /* synthetic */ void b(AvatarBannerView avatarBannerView) {
        if (PatchProxy.proxy(new Object[]{avatarBannerView}, null, changeQuickRedirect, true, 41841, new Class[]{AvatarBannerView.class}, Void.TYPE).isSupported) {
            return;
        }
        avatarBannerView.f();
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41834, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "context");
        ke0 ke0VarB = ke0.b(c.d(context), this);
        f0.o(ke0VarB, "inflate(context.layoutInflater(), this)");
        setBinding(ke0VarB);
    }

    private final ImageView d(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 41839, new Class[]{Integer.TYPE}, ImageView.class);
        return patchProxyResultProxy.isSupported ? (ImageView) patchProxyResultProxy.result : (ImageView) getChildAt(i10);
    }

    private final void e() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41836, new Class[0], Void.TYPE).isSupported && this.f90526c.size() >= 4) {
            for (int i10 = 0; i10 < 4; i10++) {
                ImageView imageViewD = d(i10);
                if (imageViewD != null) {
                    com.max.hbimage.b.H(this.f90526c.get(i10), imageViewD);
                    imageViewD.setBackground(q.o(getContext(), R.color.white_alpha50, 11.0f));
                }
            }
        }
    }

    private final void f() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41838, new Class[0], Void.TYPE).isSupported && this.f90526c.size() >= 4) {
            List<String> list = this.f90526c;
            list.add(0, list.remove(list.size() - 1));
            e();
        }
    }

    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41837, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        Context context = getContext();
        f0.o(context, "context");
        valueAnimatorOfFloat.addUpdateListener(new b(new WeakReference(this), this, com.max.accelworld.c.a(15.0f, context)));
        valueAnimatorOfFloat.start();
        this.f90527d.sendEmptyMessageDelayed(-1, 3000L);
    }

    @d
    public final ke0 getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41831, new Class[0], ke0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ke0) patchProxyResultProxy.result;
        }
        ke0 ke0Var = this.f90525b;
        if (ke0Var != null) {
            return ke0Var;
        }
        f0.S("binding");
        return null;
    }

    @Override // android.view.View
    @d
    public final a getHandler() {
        return this.f90527d;
    }

    @d
    public final List<String> getImgList() {
        return this.f90526c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41840, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.f90527d.removeCallbacksAndMessages(null);
    }

    public final void setBinding(@d ke0 ke0Var) {
        if (PatchProxy.proxy(new Object[]{ke0Var}, this, changeQuickRedirect, false, 41832, new Class[]{ke0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ke0Var, "<set-?>");
        this.f90525b = ke0Var;
    }

    public final void setImages(@d List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 41835, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        this.f90526c = list;
        if (list.size() >= 4) {
            e();
        }
        this.f90527d.sendEmptyMessageDelayed(-1, 2000L);
    }

    public final void setImgList(@d List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 41833, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f90526c = list;
    }
}
