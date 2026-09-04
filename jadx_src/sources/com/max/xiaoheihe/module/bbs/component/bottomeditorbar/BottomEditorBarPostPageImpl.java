package com.max.xiaoheihe.module.bbs.component.bottomeditorbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.u0;
import androidx.compose.runtime.internal.o;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.n;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.module.bbs.LikeAnimResourceManager;
import com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ge;
import df.he;
import dl.d;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nBottomEditorBarPostPageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomEditorBarPostPageImpl.kt\ncom/max/xiaoheihe/module/bbs/component/bottomeditorbar/BottomEditorBarPostPageImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,851:1\n13579#2,2:852\n13579#2,2:854\n13579#2,2:856\n13579#2,2:858\n260#3:860\n*S KotlinDebug\n*F\n+ 1 BottomEditorBarPostPageImpl.kt\ncom/max/xiaoheihe/module/bbs/component/bottomeditorbar/BottomEditorBarPostPageImpl\n*L\n226#1:852,2\n238#1:854,2\n248#1:856,2\n271#1:858,2\n315#1:860\n*E\n"})
@o(parameters = 0)
public class BottomEditorBarPostPageImpl extends BaseBottomEditorBar {

    @dl.d
    public static final a S3 = new a(null);
    public static final int T3 = 8;
    private static final int U3 = 500;
    private static final int V3 = 276;
    private static final int W3 = 369;
    private static final int X3 = 220;
    private static final int Y3 = 8;
    private static final int Z3 = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean G2;
    private boolean G3;
    private boolean J3;
    private boolean K3;
    private boolean L3;

    @dl.e
    private String M3;

    @dl.e
    private String N3;

    @dl.e
    private WeakReference<Activity> O3;
    private int P3;

    @dl.e
    private BubbleTipPopup Q3;

    @dl.e
    private FloatingLikeLottieAnimation.a R3;

    @dl.e
    private he T;

    @dl.e
    private ge U;

    @dl.e
    private ge V;

    @dl.e
    private ge W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private ge f80960a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f80961b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private View.OnTouchListener f80962c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f80963p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f80964p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f80965p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f80966x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.e
    private Runnable f80967x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f80968y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f80969y2;

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class b extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 27967, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            he heVar = BottomEditorBarPostPageImpl.this.T;
            ShineButton shineButton = heVar != null ? heVar.f111412e : null;
            if (shineButton == null) {
                return;
            }
            shineButton.setProgressHeight(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 27966, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            he heVar = BottomEditorBarPostPageImpl.this.T;
            ShineButton shineButton = heVar != null ? heVar.f111412e : null;
            if (shineButton == null) {
                return;
            }
            shineButton.setProgressHeight(1.0f);
        }
    }

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class c extends n<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void c(@dl.d Drawable resource, @dl.e com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            ShineButton shineButton;
            ShineButton shineButton2;
            ShineButton shineButton3;
            ShineButton shineButton4;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, 27968, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(resource, "resource");
            he heVar = BottomEditorBarPostPageImpl.this.T;
            if (heVar != null && (shineButton4 = heVar.f111412e) != null) {
                shineButton4.setBackgroundDrawable(resource);
            }
            he heVar2 = BottomEditorBarPostPageImpl.this.T;
            if (heVar2 != null && (shineButton3 = heVar2.f111412e) != null) {
                shineButton3.setShape(resource);
            }
            he heVar3 = BottomEditorBarPostPageImpl.this.T;
            ShineButton shineButton5 = heVar3 != null ? heVar3.f111412e : null;
            if (shineButton5 != null) {
                shineButton5.setProgressHeight(1.0f);
            }
            he heVar4 = BottomEditorBarPostPageImpl.this.T;
            if (heVar4 != null && (shineButton2 = heVar4.f111412e) != null) {
                shineButton2.setBtnColor(0);
            }
            he heVar5 = BottomEditorBarPostPageImpl.this.T;
            if (heVar5 != null && (shineButton = heVar5.f111412e) != null) {
                shineButton.setBtnFillColor(0);
            }
            FloatingLikeLottieAnimation.a aVar = BottomEditorBarPostPageImpl.this.R3;
            if (aVar != null && aVar.b()) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            BottomEditorBarPostPageImpl.t0(BottomEditorBarPostPageImpl.this, resource);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, 27969, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Drawable) obj, fVar);
        }
    }

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class d extends n<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void c(@dl.d Drawable resource, @dl.e com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            ShineButton shineButton;
            ShineButton shineButton2;
            ShineButton shineButton3;
            ShineButton shineButton4;
            ShineButton shineButton5;
            if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, 27970, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(resource, "resource");
            he heVar = BottomEditorBarPostPageImpl.this.T;
            if (heVar != null && (shineButton5 = heVar.f111412e) != null) {
                shineButton5.setBackgroundDrawable(resource);
            }
            he heVar2 = BottomEditorBarPostPageImpl.this.T;
            if (heVar2 != null && (shineButton4 = heVar2.f111412e) != null) {
                shineButton4.setShape(resource);
            }
            he heVar3 = BottomEditorBarPostPageImpl.this.T;
            ShineButton shineButton6 = heVar3 != null ? heVar3.f111412e : null;
            if (shineButton6 != null) {
                shineButton6.setProgressHeight(1.0f);
            }
            he heVar4 = BottomEditorBarPostPageImpl.this.T;
            if (heVar4 != null && (shineButton3 = heVar4.f111412e) != null) {
                shineButton3.setBtnColor(0);
            }
            he heVar5 = BottomEditorBarPostPageImpl.this.T;
            if (heVar5 != null && (shineButton2 = heVar5.f111412e) != null) {
                shineButton2.setBtnFillColor(0);
            }
            he heVar6 = BottomEditorBarPostPageImpl.this.T;
            if (heVar6 == null || (shineButton = heVar6.f111412e) == null) {
                return;
            }
            shineButton.setChecked(true, false);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, 27971, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Drawable) obj, fVar);
        }
    }

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class e extends n<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f80974f;

        e(boolean z10) {
            this.f80974f = z10;
        }

        public void c(@dl.d Drawable resource, @dl.e com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            ShineButton shineButton;
            ShineButton shineButton2;
            ShineButton shineButton3;
            ShineButton shineButton4;
            ShineButton shineButton5;
            if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, 27972, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(resource, "resource");
            he heVar = BottomEditorBarPostPageImpl.this.T;
            if (heVar != null && (shineButton5 = heVar.f111412e) != null) {
                shineButton5.setBackgroundDrawable(resource);
            }
            he heVar2 = BottomEditorBarPostPageImpl.this.T;
            if (heVar2 != null && (shineButton4 = heVar2.f111412e) != null) {
                shineButton4.setShape(resource);
            }
            he heVar3 = BottomEditorBarPostPageImpl.this.T;
            ShineButton shineButton6 = heVar3 != null ? heVar3.f111412e : null;
            if (shineButton6 != null) {
                shineButton6.setProgressHeight(1.0f);
            }
            he heVar4 = BottomEditorBarPostPageImpl.this.T;
            if (heVar4 != null && (shineButton3 = heVar4.f111412e) != null) {
                shineButton3.setBtnColor(0);
            }
            he heVar5 = BottomEditorBarPostPageImpl.this.T;
            if (heVar5 != null && (shineButton2 = heVar5.f111412e) != null) {
                shineButton2.setBtnFillColor(0);
            }
            he heVar6 = BottomEditorBarPostPageImpl.this.T;
            if (heVar6 == null || (shineButton = heVar6.f111412e) == null) {
                return;
            }
            shineButton.setChecked(false, this.f80974f);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, 27973, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Drawable) obj, fVar);
        }
    }

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class f extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BottomEditorBarPostPageImpl f80976b;

            a(BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl) {
                this.f80976b = bottomEditorBarPostPageImpl;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27975, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                BottomEditorBarPostPageImpl.s0(this.f80976b, R.raw.like_combo_1);
            }
        }

        f() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27974, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = BottomEditorBarPostPageImpl.this;
            BottomEditorBarPostPageImpl.q0(bottomEditorBarPostPageImpl, new a(bottomEditorBarPostPageImpl));
        }
    }

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class g extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BottomEditorBarPostPageImpl f80978b;

            a(BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl) {
                this.f80978b = bottomEditorBarPostPageImpl;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27977, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                BottomEditorBarPostPageImpl.s0(this.f80978b, R.raw.like_combo_2);
            }
        }

        g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27976, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = BottomEditorBarPostPageImpl.this;
            BottomEditorBarPostPageImpl.q0(bottomEditorBarPostPageImpl, new a(bottomEditorBarPostPageImpl));
        }
    }

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class h extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BottomEditorBarPostPageImpl f80980b;

            a(BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl) {
                this.f80980b = bottomEditorBarPostPageImpl;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27979, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                BottomEditorBarPostPageImpl.s0(this.f80980b, R.raw.like_combo_3);
            }
        }

        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27978, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = BottomEditorBarPostPageImpl.this;
            BottomEditorBarPostPageImpl.q0(bottomEditorBarPostPageImpl, new a(bottomEditorBarPostPageImpl));
        }
    }

    /* JADX INFO: compiled from: BottomEditorBarPostPageImpl.kt */
    public static final class i extends n<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public void c(@dl.d Drawable resource, @dl.e com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            ShineButton shineButton;
            ShineButton shineButton2;
            ShineButton shineButton3;
            ShineButton shineButton4;
            if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, 27980, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(resource, "resource");
            com.max.hbcommon.utils.d.b("zzzzsetLikeBtnCheckStat", "set shape");
            he heVar = BottomEditorBarPostPageImpl.this.T;
            if (heVar != null && (shineButton4 = heVar.f111412e) != null) {
                shineButton4.setBackgroundDrawable(resource);
            }
            he heVar2 = BottomEditorBarPostPageImpl.this.T;
            if (heVar2 != null && (shineButton3 = heVar2.f111412e) != null) {
                shineButton3.setShape(resource);
            }
            he heVar3 = BottomEditorBarPostPageImpl.this.T;
            ShineButton shineButton5 = heVar3 != null ? heVar3.f111412e : null;
            if (shineButton5 != null) {
                shineButton5.setProgressHeight(1.0f);
            }
            he heVar4 = BottomEditorBarPostPageImpl.this.T;
            if (heVar4 != null && (shineButton2 = heVar4.f111412e) != null) {
                shineButton2.setBtnColor(0);
            }
            he heVar5 = BottomEditorBarPostPageImpl.this.T;
            if (heVar5 == null || (shineButton = heVar5.f111412e) == null) {
                return;
            }
            shineButton.setBtnFillColor(0);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, 27981, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Drawable) obj, fVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public BottomEditorBarPostPageImpl(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public BottomEditorBarPostPageImpl(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public BottomEditorBarPostPageImpl(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f80965p3 = true;
        this.P3 = l.h(context, R.color.text_primary_1_color);
        getMBinding().b().setVisibility(0);
    }

    public /* synthetic */ BottomEditorBarPostPageImpl(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void C0(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27960, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        bb.d.d(textView, 2);
    }

    private final Bitmap M0(Bitmap bitmap, ShineButton shineButton) {
        Object objB;
        Bitmap bitmapCreateScaledBitmap;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, shineButton}, this, changeQuickRedirect, false, 27928, new Class[]{Bitmap.class, ShineButton.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            Result.a aVar = Result.f124476c;
            if (bitmap == null) {
                bitmapCreateScaledBitmap = null;
            } else {
                float f10 = ViewUtils.f(getContext(), 24.0f);
                float width = (bitmap.getWidth() / shineButton.getWidth()) * f10;
                float height = (bitmap.getHeight() / shineButton.getHeight()) * f10;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
                f0.o(bitmapCreateBitmap, "createBitmap(\n          …g.ARGB_8888\n            )");
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f11 = 2;
                canvas.translate((width - bitmap.getWidth()) / f11, (height - bitmap.getHeight()) / f11);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 72, 72, false);
            }
            objB = Result.b(bitmapCreateScaledBitmap);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        return (Bitmap) (Result.i(objB) ? null : objB);
    }

    private final void N0(int i10) {
        ShineButton shineButton;
        ShineButton shineButton2;
        ShineButton shineButton3;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27916, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.V;
        if (geVar != null && (shineButton3 = geVar.f110952c) != null) {
            shineButton3.setMaskColor(this.P3);
        }
        ge geVar2 = this.U;
        if (geVar2 != null && (shineButton2 = geVar2.f110952c) != null) {
            shineButton2.setMaskColor(this.P3);
        }
        he heVar = this.T;
        if (heVar == null || (shineButton = heVar.f111412e) == null) {
            return;
        }
        shineButton.setMaskColor(this.P3);
    }

    private final void O0(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, 27959, new Class[]{Runnable.class}, Void.TYPE).isSupported || runnable == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    private final void Q0(@u0 int i10) {
        he heVar;
        ShineButton shineButton;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27954, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (heVar = this.T) == null || (shineButton = heVar.f111412e) == null) {
            return;
        }
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            Context context2 = getContext();
            f0.o(context2, "context");
            int iC = com.max.accelworld.c.c(500, context2);
            Context context3 = getContext();
            f0.o(context3, "context");
            int iC2 = com.max.accelworld.c.c(276, context3);
            Context context4 = getContext();
            f0.o(context4, "context");
            int iC3 = com.max.accelworld.c.c(369, context4);
            Context context5 = getContext();
            f0.o(context5, "context");
            int iC4 = com.max.accelworld.c.c(220, context5);
            Context context6 = getContext();
            f0.o(context6, "context");
            int iC5 = com.max.accelworld.c.c(8, context6);
            Context context7 = getContext();
            f0.o(context7, "context");
            int iC6 = com.max.accelworld.c.c(5, context7);
            Rect rect = new Rect();
            shineButton.getGlobalVisibleRect(rect);
            float f10 = rect.left - iC3;
            float f11 = 2;
            new FloatingLikeLottieAnimation.Builder(activity).t(f10 + (iC / f11) + iC5, (rect.top - iC4) + (iC2 / f11) + iC6).G(i10).I(500, 276).a().g();
        }
    }

    private final void S0(Drawable drawable) {
        he heVar;
        final ShineButton shineButton;
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 27926, new Class[]{Drawable.class}, Void.TYPE).isSupported || (heVar = this.T) == null || (shineButton = heVar.f111412e) == null) {
            return;
        }
        WeakReference<Activity> weakReference = this.O3;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity == null) {
            return;
        }
        FloatingLikeLottieAnimation.a aVar = this.R3;
        if (aVar != null) {
            aVar.a();
        }
        if (!(drawable instanceof BitmapDrawable)) {
            shineButton.setChecked(true, false);
            this.R3 = FloatingLikeLottieAnimation.Builder.z(new FloatingLikeLottieAnimation.Builder(activity).u(shineButton), shineButton, null, null, 6, null).F(this.N3).O(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl$tryShowSpLikeV2LottieAnim$likeLottieAnimation$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@d FloatingLikeLottieAnimation.Builder builder) {
                    if (PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 27988, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(builder, "builder");
                    shineButton.setVisibility(4);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 27989, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(builder);
                    return b2.f124493a;
                }
            }).M(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl$tryShowSpLikeV2LottieAnim$likeLottieAnimation$2
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@d FloatingLikeLottieAnimation.Builder builder) {
                    if (PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 27990, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(builder, "builder");
                    shineButton.setVisibility(0);
                    this.R3 = null;
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 27991, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(builder);
                    return b2.f124493a;
                }
            }).P(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl$tryShowSpLikeV2LottieAnim$likeLottieAnimation$3
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@d FloatingLikeLottieAnimation.Builder it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 27992, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    shineButton.setVisibility(0);
                    this.R3 = null;
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 27993, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(builder);
                    return b2.f124493a;
                }
            }).a().g();
            return;
        }
        shineButton.setCancel();
        shineButton.A();
        Bitmap bitmapM0 = M0(((BitmapDrawable) drawable).getBitmap(), shineButton);
        if (bitmapM0 != null) {
            this.R3 = FloatingLikeLottieAnimation.Builder.B(new FloatingLikeLottieAnimation.Builder(activity).u(shineButton), bitmapM0, null, false, 6, null).F(this.N3).O(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl$tryShowSpLikeV2LottieAnim$1$lottieAnimation$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@d FloatingLikeLottieAnimation.Builder it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 27982, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    shineButton.setVisibility(4);
                    shineButton.setChecked(true, false);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 27983, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(builder);
                    return b2.f124493a;
                }
            }).M(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl$tryShowSpLikeV2LottieAnim$1$lottieAnimation$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@d FloatingLikeLottieAnimation.Builder it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 27984, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    shineButton.setVisibility(0);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 27985, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(builder);
                    return b2.f124493a;
                }
            }).P(new yh.l<FloatingLikeLottieAnimation.Builder, b2>() { // from class: com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl$tryShowSpLikeV2LottieAnim$1$lottieAnimation$3
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@d FloatingLikeLottieAnimation.Builder it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 27986, new Class[]{FloatingLikeLottieAnimation.Builder.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    shineButton.setVisibility(0);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(FloatingLikeLottieAnimation.Builder builder) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder}, this, changeQuickRedirect, false, 27987, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(builder);
                    return b2.f124493a;
                }
            }).a().g();
        }
    }

    static /* synthetic */ void T0(BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl, Drawable drawable, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{bottomEditorBarPostPageImpl, drawable, new Integer(i10), obj}, null, changeQuickRedirect, true, 27927, new Class[]{BottomEditorBarPostPageImpl.class, Drawable.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryShowSpLikeV2LottieAnim");
        }
        if ((i10 & 1) != 0) {
            drawable = null;
        }
        bottomEditorBarPostPageImpl.S0(drawable);
    }

    public static final /* synthetic */ void q0(BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl, Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{bottomEditorBarPostPageImpl, runnable}, null, changeQuickRedirect, true, 27964, new Class[]{BottomEditorBarPostPageImpl.class, Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomEditorBarPostPageImpl.O0(runnable);
    }

    public static final /* synthetic */ void s0(BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl, int i10) {
        if (PatchProxy.proxy(new Object[]{bottomEditorBarPostPageImpl, new Integer(i10)}, null, changeQuickRedirect, true, 27965, new Class[]{BottomEditorBarPostPageImpl.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        bottomEditorBarPostPageImpl.Q0(i10);
    }

    private final void setButtonDarkStyle(ge geVar) {
        if (PatchProxy.proxy(new Object[]{geVar}, this, changeQuickRedirect, false, 27958, new Class[]{ge.class}, Void.TYPE).isSupported || geVar == null) {
            return;
        }
        geVar.f110952c.setBtnFillColor(z0(true));
        geVar.f110952c.setBtnColor(z0(false));
        geVar.f110952c.invalidate();
        geVar.f110953d.setTextColor(z0(false));
        geVar.f110951b.setColorFilter(z0(false));
    }

    private final void setButtonDarkStyle(he heVar) {
        if (PatchProxy.proxy(new Object[]{heVar}, this, changeQuickRedirect, false, 27957, new Class[]{he.class}, Void.TYPE).isSupported || heVar == null) {
            return;
        }
        heVar.f111412e.setBtnFillColor(z0(true));
        heVar.f111412e.setBtnColor(z0(false));
        heVar.f111412e.invalidate();
        heVar.f111413f.setTextColor(z0(false));
        heVar.f111409b.setColorFilter(z0(false));
    }

    public static /* synthetic */ void setChargeBtnState$default(BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {bottomEditorBarPostPageImpl, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 27942, new Class[]{BottomEditorBarPostPageImpl.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChargeBtnState");
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        bottomEditorBarPostPageImpl.setChargeBtnState(z10, z11);
    }

    public static final /* synthetic */ void t0(BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl, Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{bottomEditorBarPostPageImpl, drawable}, null, changeQuickRedirect, true, 27963, new Class[]{BottomEditorBarPostPageImpl.class, Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomEditorBarPostPageImpl.S0(drawable);
    }

    private final void u0(ge geVar) {
        if (PatchProxy.proxy(new Object[]{geVar}, this, changeQuickRedirect, false, 27920, new Class[]{ge.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView[] imageViewArr = {geVar.f110951b, geVar.f110952c};
        for (int i10 = 0; i10 < 2; i10++) {
            ImageView imageView = imageViewArr[i10];
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                f0.o(layoutParams, "layoutParams");
                Context context = getContext();
                f0.o(context, "context");
                layoutParams.width = com.max.accelworld.c.c(20, context);
                Context context2 = getContext();
                f0.o(context2, "context");
                layoutParams.height = com.max.accelworld.c.c(20, context2);
            }
            imageView.setLayoutParams(layoutParams);
        }
        TextView textView = geVar.f110953d;
        Context context3 = getContext();
        f0.o(context3, "context");
        textView.setTextSize(com.max.accelworld.c.g(10, context3));
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 != null) {
            f0.o(layoutParams2, "layoutParams");
            Context context4 = getContext();
            f0.o(context4, "context");
            layoutParams2.height = com.max.accelworld.c.c(11, context4);
        }
        textView.setLayoutParams(layoutParams2);
    }

    private final void v0() {
        he heVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27919, new Class[0], Void.TYPE).isSupported || (heVar = this.T) == null) {
            return;
        }
        ImageView[] imageViewArr = {heVar.f111409b, heVar.f111412e};
        for (int i10 = 0; i10 < 2; i10++) {
            ImageView imageView = imageViewArr[i10];
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                f0.o(layoutParams, "layoutParams");
                Context context = getContext();
                f0.o(context, "context");
                layoutParams.width = com.max.accelworld.c.c(20, context);
                Context context2 = getContext();
                f0.o(context2, "context");
                layoutParams.height = com.max.accelworld.c.c(20, context2);
            }
            imageView.setLayoutParams(layoutParams);
        }
        TextView textView = heVar.f111413f;
        Context context3 = getContext();
        f0.o(context3, "context");
        textView.setTextSize(com.max.accelworld.c.g(10, context3));
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 != null) {
            f0.o(layoutParams2, "layoutParams");
            Context context4 = getContext();
            f0.o(context4, "context");
            layoutParams2.height = com.max.accelworld.c.c(11, context4);
        }
        textView.setLayoutParams(layoutParams2);
    }

    private final void w0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27918, new Class[0], Void.TYPE).isSupported && ad.a.a(ad.a.f1200g, false)) {
            v0();
            ge[] geVarArr = {this.U, this.V, this.f80960a0};
            for (int i10 = 0; i10 < 3; i10++) {
                ge geVar = geVarArr[i10];
                if (geVar != null) {
                    u0(geVar);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void A0() {
        LinearLayout linearLayoutB;
        LinearLayout linearLayoutB2;
        LinearLayout linearLayoutB3;
        LinearLayout linearLayoutB4;
        RelativeLayout relativeLayoutB;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27917, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.T == null) {
            he heVarG = G(R.drawable.bbs_thumbs_up_filled_24x24, "0", this.f80965p3);
            this.T = heVarG;
            TextView textView = heVarG != null ? heVarG.f111413f : null;
            if (textView != null) {
                textView.setTypeface(bb.d.a().b(2));
            }
            he heVar = this.T;
            if (heVar != null && (relativeLayoutB = heVar.b()) != null) {
                relativeLayoutB.setOnTouchListener(this.f80962c0);
            }
            he heVar2 = this.T;
            if (heVar2 != null) {
                RelativeLayout relativeLayoutB2 = heVar2.b();
                f0.o(relativeLayoutB2, "it.root");
                r(relativeLayoutB2);
                TextView textView2 = heVar2.f111413f;
                f0.o(textView2, "it.text");
                C0(textView2);
            }
        }
        if (this.V == null) {
            String string = getContext().getString(R.string.favour);
            f0.o(string, "context.getString(R.string.favour)");
            ge geVarE = E(R.drawable.common_star_filled_24x24, string, this.f80965p3);
            this.V = geVarE;
            if (geVarE != null && (linearLayoutB4 = geVarE.b()) != null) {
                linearLayoutB4.setOnClickListener(this.f80966x1);
            }
            ge geVar = this.V;
            if (geVar != null) {
                LinearLayout linearLayoutB5 = geVar.b();
                f0.o(linearLayoutB5, "it.root");
                r(linearLayoutB5);
                TextView textView3 = geVar.f110953d;
                f0.o(textView3, "it.text");
                C0(textView3);
            }
        }
        if (this.U == null) {
            ge geVarE2 = E(R.drawable.bbs_battery_filled_24x24, "0", this.f80965p3);
            this.U = geVarE2;
            if (geVarE2 != null && (linearLayoutB3 = geVarE2.b()) != null) {
                linearLayoutB3.setOnClickListener(this.f80963p1);
            }
            ge geVar2 = this.U;
            if (geVar2 != null) {
                LinearLayout linearLayoutB6 = geVar2.b();
                f0.o(linearLayoutB6, "it.root");
                r(linearLayoutB6);
                TextView textView4 = geVar2.f110953d;
                f0.o(textView4, "it.text");
                C0(textView4);
            }
        }
        if (this.W == null) {
            String string2 = getContext().getString(R.string.share);
            f0.o(string2, "context.getString(R.string.share)");
            ge geVarE3 = E(R.drawable.ic_share_20, string2, false);
            this.W = geVarE3;
            if (geVarE3 != null && (linearLayoutB2 = geVarE3.b()) != null) {
                linearLayoutB2.setOnClickListener(this.f80968y1);
            }
            ge geVar3 = this.W;
            if (geVar3 != null) {
                LinearLayout linearLayoutB7 = geVar3.b();
                f0.o(linearLayoutB7, "it.root");
                r(linearLayoutB7);
                TextView textView5 = geVar3.f110953d;
                f0.o(textView5, "it.text");
                C0(textView5);
            }
        }
        if (this.f80960a0 == null) {
            String string3 = getContext().getString(R.string.comment);
            f0.o(string3, "context.getString(R.string.comment)");
            ge geVarE4 = E(R.drawable.bbs_comment_filled_24x24, string3, false);
            this.f80960a0 = geVarE4;
            if (geVarE4 != null && (linearLayoutB = geVarE4.b()) != null) {
                linearLayoutB.setOnClickListener(this.f80964p2);
            }
            ge geVar4 = this.f80960a0;
            if (geVar4 != null) {
                LinearLayout linearLayoutB8 = geVar4.b();
                f0.o(linearLayoutB8, "it.root");
                r(linearLayoutB8);
                TextView textView6 = geVar4.f110953d;
                f0.o(textView6, "it.text");
                C0(textView6);
            }
        }
        ge[] geVarArr = {this.U, this.f80960a0};
        for (int i10 = 0; i10 < 2; i10++) {
            ge geVar5 = geVarArr[i10];
            TextView textView7 = geVar5 != null ? geVar5.f110953d : null;
            if (textView7 != null) {
                textView7.setTypeface(bb.d.a().b(2));
            }
        }
        w0();
        N0(this.P3);
        invalidate();
    }

    public final void B0() {
        ShineButton shineButton;
        ShineButton shineButton2;
        ShineButton shineButton3;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27952, new Class[0], Void.TYPE).isSupported && this.f80965p3) {
            he heVar = this.T;
            if (heVar != null && (shineButton3 = heVar.f111412e) != null) {
                shineButton3.setAllowProcess(true);
            }
            ge geVar = this.U;
            if (geVar != null && (shineButton2 = geVar.f110952c) != null) {
                shineButton2.setAllowProcess(true);
            }
            ge geVar2 = this.V;
            if (geVar2 == null || (shineButton = geVar2.f110952c) == null) {
                return;
            }
            shineButton.setAllowProcess(true);
        }
    }

    public final boolean D0() {
        ShineButton shineButton;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27943, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ge geVar = this.U;
        return (geVar == null || (shineButton = geVar.f110952c) == null || !shineButton.x()) ? false : true;
    }

    public final boolean E0() {
        LinearLayout linearLayoutB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27939, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ge geVar = this.U;
        return (geVar == null || (linearLayoutB = geVar.b()) == null || linearLayoutB.getVisibility() != 0) ? false : true;
    }

    public final boolean F0() {
        return this.L3;
    }

    public final boolean G0() {
        ShineButton shineButton;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27936, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ge geVar = this.V;
        return (geVar == null || (shineButton = geVar.f110952c) == null || !shineButton.x()) ? false : true;
    }

    public final boolean H0() {
        LinearLayout linearLayoutB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27933, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ge geVar = this.V;
        return (geVar == null || (linearLayoutB = geVar.b()) == null || linearLayoutB.getVisibility() != 0) ? false : true;
    }

    public final boolean I0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27962, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BubbleTipPopup bubbleTipPopup = this.Q3;
        return bubbleTipPopup != null && bubbleTipPopup.L();
    }

    public final boolean J0() {
        ShineButton shineButton;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27930, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        he heVar = this.T;
        return (heVar == null || (shineButton = heVar.f111412e) == null || !shineButton.x()) ? false : true;
    }

    public final boolean K0() {
        RelativeLayout relativeLayoutB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27922, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        he heVar = this.T;
        return (heVar == null || (relativeLayoutB = heVar.b()) == null || relativeLayoutB.getVisibility() != 0) ? false : true;
    }

    public final boolean L0() {
        LinearLayout linearLayoutB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27949, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ge geVar = this.W;
        return (geVar == null || (linearLayoutB = geVar.b()) == null || linearLayoutB.getVisibility() != 0) ? false : true;
    }

    public final void P0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27953, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Timer timer = new Timer();
        timer.schedule(new f(), 0L, 450L);
        timer.schedule(new g(), 150L, 450L);
        timer.schedule(new h(), 300L, 450L);
        setTimer(timer);
    }

    public final void R0() {
        Timer timer;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27955, new Class[0], Void.TYPE).isSupported || getTimer() == null || (timer = getTimer()) == null) {
            return;
        }
        timer.cancel();
    }

    public final void U0(int i10) {
        String string;
        ShineButton shineButton;
        boolean zX = false;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27935, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 > 1) {
            setCollectBtnText(String.valueOf(i10));
            return;
        }
        ge geVar = this.V;
        if (geVar != null && (shineButton = geVar.f110952c) != null) {
            zX = shineButton.x();
        }
        if (zX) {
            string = getContext().getString(R.string.collected);
            f0.o(string, "context.getString(R.string.collected)");
        } else {
            string = getContext().getString(R.string.favour);
            f0.o(string, "context.getString(R.string.favour)");
        }
        setCollectBtnText(string);
    }

    @dl.e
    public final View.OnClickListener getChargeOnClickListener() {
        return this.f80963p1;
    }

    @dl.d
    public final CharSequence getChargeText() {
        TextView textView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27940, new Class[0], CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        ge geVar = this.U;
        CharSequence text = (geVar == null || (textView = geVar.f110953d) == null) ? null : textView.getText();
        return text == null ? "" : text;
    }

    @dl.e
    public final View.OnClickListener getCollectOnClickListener() {
        return this.f80966x1;
    }

    @dl.e
    public final BubbleTipPopup getComTibBubble() {
        return this.Q3;
    }

    @dl.e
    public final View.OnClickListener getCommentOnClickListener() {
        return this.f80964p2;
    }

    public final boolean getEnableCharge() {
        return this.G2;
    }

    public final boolean getEnableCollect() {
        return this.f80969y2;
    }

    public final boolean getEnableCombo() {
        return this.f80965p3;
    }

    public final boolean getEnableComment() {
        return this.K3;
    }

    public final boolean getEnableShare() {
        return this.J3;
    }

    public final boolean getEnablelike() {
        return this.G3;
    }

    @dl.e
    public final String getLikeLottieV2Key() {
        return this.N3;
    }

    @dl.d
    public final CharSequence getLikeText() {
        TextView textView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27924, new Class[0], CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        he heVar = this.T;
        CharSequence text = (heVar == null || (textView = heVar.f111413f) == null) ? null : textView.getText();
        return text == null ? "" : text;
    }

    @dl.e
    public final View.OnTouchListener getLikeTouchListener() {
        return this.f80962c0;
    }

    @dl.e
    public final WeakReference<Activity> getLottieAnimContextRef() {
        return this.O3;
    }

    public final int getMaskColor() {
        return this.P3;
    }

    public final boolean getNeedBoldNumTextAfterLiked() {
        return this.f80961b0;
    }

    @dl.e
    public final View.OnClickListener getShareOnClickListener() {
        return this.f80968y1;
    }

    @dl.e
    public final String getSp_like_key() {
        return this.M3;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar
    public void setBarDarkStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27956, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.setBarDarkStyle();
        setButtonDarkStyle(this.T);
        setButtonDarkStyle(this.U);
        setButtonDarkStyle(this.V);
        setButtonDarkStyle(this.W);
        setButtonDarkStyle(this.f80960a0);
        invalidate();
    }

    public final void setChargeBtnState(boolean z10, boolean z11) {
        ShineButton shineButton;
        TextView textView;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27941, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.L3 = z10;
        int iZ0 = z0(z10);
        ge geVar = this.U;
        if (geVar != null && (textView = geVar.f110953d) != null) {
            textView.setTextColor(iZ0);
        }
        ge geVar2 = this.U;
        ShineButton shineButton2 = geVar2 != null ? geVar2.f110952c : null;
        if (shineButton2 != null) {
            shineButton2.setProgressHeight(z10 ? 0.0f : 1.0f);
        }
        ge geVar3 = this.U;
        if (geVar3 == null || (shineButton = geVar3.f110952c) == null) {
            return;
        }
        shineButton.setChecked(z10, z11);
    }

    public final void setChargeBtnText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27937, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.U;
        TextView textView = geVar != null ? geVar.f110953d : null;
        if (textView == null) {
            return;
        }
        if (str == null) {
            str = "0";
        }
        textView.setText(str);
    }

    public final void setChargeBtnVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27938, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setTriple(z10);
        ge geVar = this.U;
        LinearLayout linearLayoutB = geVar != null ? geVar.b() : null;
        if (linearLayoutB == null) {
            return;
        }
        linearLayoutB.setVisibility(z10 ? 0 : 8);
    }

    public final void setChargeOnClickListener(@dl.e View.OnClickListener onClickListener) {
        LinearLayout linearLayoutB;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27905, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.U;
        if (geVar != null && (linearLayoutB = geVar.b()) != null) {
            linearLayoutB.setOnClickListener(onClickListener);
        }
        this.f80963p1 = onClickListener;
    }

    public final void setCharged(boolean z10) {
        this.L3 = z10;
    }

    public final void setCollectBtnCheckState(boolean z10, boolean z11) {
        ShineButton shineButton;
        LinearLayout linearLayoutB;
        TextView textView;
        ShineButton shineButton2;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27934, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.V;
        if (geVar != null && (shineButton2 = geVar.f110952c) != null) {
            shineButton2.setChecked(z10, z11);
        }
        if (z10) {
            ge geVar2 = this.V;
            shineButton = geVar2 != null ? geVar2.f110952c : null;
            if (shineButton != null) {
                shineButton.setProgressHeight(0.0f);
            }
        } else {
            ge geVar3 = this.V;
            shineButton = geVar3 != null ? geVar3.f110952c : null;
            if (shineButton != null) {
                shineButton.setProgressHeight(1.0f);
            }
        }
        int iZ0 = z0(z10);
        ge geVar4 = this.V;
        if (geVar4 != null && (textView = geVar4.f110953d) != null) {
            textView.setTextColor(iZ0);
        }
        ge geVar5 = this.V;
        if (geVar5 == null || (linearLayoutB = geVar5.b()) == null) {
            return;
        }
        linearLayoutB.invalidate();
    }

    public final void setCollectBtnText(@dl.d String string) {
        if (PatchProxy.proxy(new Object[]{string}, this, changeQuickRedirect, false, 27931, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(string, "string");
        ge geVar = this.V;
        TextView textView = geVar != null ? geVar.f110953d : null;
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void setCollectBtnVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27932, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.V;
        LinearLayout linearLayoutB = geVar != null ? geVar.b() : null;
        if (linearLayoutB == null) {
            return;
        }
        linearLayoutB.setVisibility(z10 ? 0 : 8);
    }

    public final void setCollectOnClickListener(@dl.e View.OnClickListener onClickListener) {
        LinearLayout linearLayoutB;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27906, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.V;
        if (geVar != null && (linearLayoutB = geVar.b()) != null) {
            linearLayoutB.setOnClickListener(onClickListener);
        }
        this.f80966x1 = onClickListener;
    }

    public final void setComTibBubble(@dl.e BubbleTipPopup bubbleTipPopup) {
        this.Q3 = bubbleTipPopup;
    }

    public final void setComboTipVisible(boolean z10) {
        RelativeLayout relativeLayoutB;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27961, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            BubbleTipPopup bubbleTipPopup = this.Q3;
            if (bubbleTipPopup != null) {
                bubbleTipPopup.G();
                return;
            }
            return;
        }
        if (this.Q3 == null) {
            Drawable drawable = getResources().getDrawable(R.drawable.expression_heygirl_qiaokaixin);
            drawable.setBounds(0, 0, ViewUtils.f(getContext(), 18.0f), ViewUtils.f(getContext(), 18.0f));
            String str = T() ? "长按点赞，为作者一键三连吧~" : "长按点赞，为作者一键二连吧~";
            TextView textView = new TextView(getContext());
            textView.setCompoundDrawables(drawable, null, null, null);
            textView.setText(str);
            textView.setTextColor(-1);
            textView.setBackgroundResource(R.drawable.text_primary_alpha90_2dp);
            textView.setTextSize(1, 12.0f);
            Context context = getContext();
            f0.o(context, "context");
            BubbleTipPopup.a aVarP1 = new BubbleTipPopup.a(context).v(textView).p1(str);
            he heVar = this.T;
            if (heVar == null || (relativeLayoutB = heVar.b()) == null) {
                relativeLayoutB = this;
            }
            this.Q3 = aVarP1.c(relativeLayoutB).r1(17).i0(48).x(true).y(false).z0(ViewUtils.f(getContext(), 14.0f)).B0(ViewUtils.f(getContext(), 14.0f)).z(false).p0(-ViewUtils.f(getContext(), 12.0f)).w(ViewUtils.f(getContext(), 2.0f)).n(false).r();
        }
        BubbleTipPopup bubbleTipPopup2 = this.Q3;
        if (bubbleTipPopup2 != null) {
            bubbleTipPopup2.O();
        }
        com.max.hbcache.c.z("combo_tip_shown", "1");
    }

    public final void setCommentBtnText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27946, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.f80960a0;
        TextView textView = geVar != null ? geVar.f110953d : null;
        if (textView == null) {
            return;
        }
        if (str == null) {
            str = "0";
        }
        textView.setText(str);
    }

    public final void setCommentBtnVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27947, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.f80960a0;
        LinearLayout linearLayoutB = geVar != null ? geVar.b() : null;
        if (linearLayoutB == null) {
            return;
        }
        linearLayoutB.setVisibility(z10 ? 0 : 8);
    }

    public final void setCommentOnClickListener(@dl.e View.OnClickListener onClickListener) {
        LinearLayout linearLayoutB;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27908, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.f80960a0;
        if (geVar != null && (linearLayoutB = geVar.b()) != null) {
            linearLayoutB.setOnClickListener(onClickListener);
        }
        this.f80964p2 = onClickListener;
    }

    public final void setEnableCharge(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27910, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.U;
        LinearLayout linearLayoutB = geVar != null ? geVar.b() : null;
        if (linearLayoutB != null) {
            linearLayoutB.setVisibility(z10 ? 0 : 8);
        }
        this.G2 = z10;
    }

    public final void setEnableCollect(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27909, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.V;
        LinearLayout linearLayoutB = geVar != null ? geVar.b() : null;
        if (linearLayoutB != null) {
            linearLayoutB.setVisibility(z10 ? 0 : 8);
        }
        this.f80969y2 = z10;
    }

    public final void setEnableCombo(boolean z10) {
        this.f80965p3 = z10;
    }

    public final void setEnableComment(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27913, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.f80960a0;
        LinearLayout linearLayoutB = geVar != null ? geVar.b() : null;
        if (linearLayoutB != null) {
            linearLayoutB.setVisibility(z10 ? 0 : 8);
        }
        this.K3 = z10;
    }

    public final void setEnableShare(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27912, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.W;
        LinearLayout linearLayoutB = geVar != null ? geVar.b() : null;
        if (linearLayoutB != null) {
            linearLayoutB.setVisibility(z10 ? 0 : 8);
        }
        this.J3 = z10;
    }

    public final void setEnablelike(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27911, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        he heVar = this.T;
        RelativeLayout relativeLayoutB = heVar != null ? heVar.b() : null;
        if (relativeLayoutB != null) {
            relativeLayoutB.setVisibility(z10 ? 0 : 8);
        }
        this.G3 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117  */
    /* JADX WARN: Code duplicated, block: B:83:0x0137  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setLikeBtnCheckState(boolean z10, boolean z11) {
        ?? r10;
        ShineButton shineButton;
        ShineButton shineButton2;
        ShineButton shineButton3;
        RelativeLayout relativeLayoutB;
        TextView textView;
        TextView textView2;
        FloatingLikeLottieAnimation.a aVar;
        he heVar;
        Float fValueOf;
        he heVar2;
        ?? r11;
        he heVar3;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        LottieAnimationView lottieAnimationView3;
        LottieAnimationView lottieAnimationView4;
        LottieAnimationView lottieAnimationView5;
        LottieAnimationView lottieAnimationView6;
        RelativeLayout relativeLayoutB2;
        boolean z12 = false;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27925, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        he heVar4 = this.T;
        if (heVar4 == null || (relativeLayoutB2 = heVar4.b()) == null) {
            r10 = false;
        } else {
            if ((relativeLayoutB2.getVisibility() == 0) == true) {
                r10 = true;
            } else {
                r10 = false;
            }
        }
        if (r10 == false) {
            z11 = false;
        }
        if (com.max.hbcommon.utils.c.u(this.M3)) {
            if (com.max.hbcommon.utils.c.u(this.N3)) {
                he heVar5 = this.T;
                if (heVar5 != null && (shineButton = heVar5.f111412e) != null) {
                    shineButton.setChecked(z10, z11);
                }
                if (z10) {
                    he heVar6 = this.T;
                    ShineButton shineButton4 = heVar6 != null ? heVar6.f111412e : null;
                    if (shineButton4 != null) {
                        shineButton4.setProgressHeight(0.0f);
                    }
                } else {
                    he heVar7 = this.T;
                    ShineButton shineButton5 = heVar7 != null ? heVar7.f111412e : null;
                    if (shineButton5 != null) {
                        shineButton5.setProgressHeight(1.0f);
                    }
                }
            } else {
                if (z10 && z11) {
                    FloatingLikeLottieAnimation.a aVar2 = this.R3;
                    if (aVar2 != null && aVar2.b()) {
                        z12 = true;
                    }
                    if (!z12) {
                        T0(this, null, 1, null);
                    }
                } else if (z10) {
                    he heVar8 = this.T;
                    if (heVar8 != null && (shineButton3 = heVar8.f111412e) != null) {
                        shineButton3.setChecked(true, false);
                    }
                } else {
                    FloatingLikeLottieAnimation.a aVar3 = this.R3;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    he heVar9 = this.T;
                    if (heVar9 != null && (shineButton2 = heVar9.f111412e) != null) {
                        shineButton2.setChecked(false, z11);
                    }
                }
                if (z10) {
                    he heVar10 = this.T;
                    ShineButton shineButton6 = heVar10 != null ? heVar10.f111412e : null;
                    if (shineButton6 != null) {
                        shineButton6.setProgressHeight(0.0f);
                    }
                } else {
                    he heVar11 = this.T;
                    ShineButton shineButton7 = heVar11 != null ? heVar11.f111412e : null;
                    if (shineButton7 != null) {
                        shineButton7.setProgressHeight(1.0f);
                    }
                }
            }
        } else if (z10) {
            he heVar12 = this.T;
            if (f0.e((heVar12 == null || (lottieAnimationView6 = heVar12.f111411d) == null) ? null : Float.valueOf(lottieAnimationView6.getProgress()), 1.0f)) {
                he heVar13 = this.T;
                if (((heVar13 == null || (lottieAnimationView5 = heVar13.f111411d) == null || lottieAnimationView5.getVisibility() != 0) ? false : true) == true) {
                    he heVar14 = this.T;
                    if (((heVar14 == null || (lottieAnimationView4 = heVar14.f111411d) == null || lottieAnimationView4.getVisibility() != 4) ? false : true) == false) {
                        if (z10) {
                            heVar = this.T;
                            if (heVar != null) {
                                fValueOf = null;
                            } else {
                                fValueOf = null;
                            }
                            if (!f0.e(fValueOf, 0.0f)) {
                                heVar2 = this.T;
                                if (heVar2 == null) {
                                    r11 = false;
                                } else {
                                    r11 = false;
                                }
                                if (r11 != true) {
                                    heVar3 = this.T;
                                    if (heVar3 != null) {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        if (!z10) {
                                            if (z10) {
                                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                                            } else {
                                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                                aVar = this.R3;
                                                if (aVar != null) {
                                                    aVar.a();
                                                }
                                            }
                                        } else if (z10) {
                                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                                        } else {
                                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                            aVar = this.R3;
                                            if (aVar != null) {
                                                aVar.a();
                                            }
                                        }
                                    }
                                } else if (!z10) {
                                    if (z10) {
                                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                                    } else {
                                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                        aVar = this.R3;
                                        if (aVar != null) {
                                            aVar.a();
                                        }
                                    }
                                } else if (z10) {
                                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                                } else {
                                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                    aVar = this.R3;
                                    if (aVar != null) {
                                        aVar.a();
                                    }
                                }
                            } else if (!z10) {
                                if (z10) {
                                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                                } else {
                                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                    aVar = this.R3;
                                    if (aVar != null) {
                                        aVar.a();
                                    }
                                }
                            } else if (z10) {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                            } else {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                aVar = this.R3;
                                if (aVar != null) {
                                    aVar.a();
                                }
                            }
                        } else if (!z10) {
                            if (z10) {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                            } else {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                aVar = this.R3;
                                if (aVar != null) {
                                    aVar.a();
                                }
                            }
                        } else if (z10) {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                        } else {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                            aVar = this.R3;
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    }
                } else if (z10) {
                    heVar = this.T;
                    if (heVar != null) {
                        fValueOf = null;
                    } else {
                        fValueOf = null;
                    }
                    if (!f0.e(fValueOf, 0.0f)) {
                        heVar2 = this.T;
                        if (heVar2 == null) {
                            r11 = false;
                        } else {
                            r11 = false;
                        }
                        if (r11 != true) {
                            heVar3 = this.T;
                            if (heVar3 != null) {
                                z12 = true;
                            }
                            if (!z12) {
                                if (!z10) {
                                    if (z10) {
                                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                                    } else {
                                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                        aVar = this.R3;
                                        if (aVar != null) {
                                            aVar.a();
                                        }
                                    }
                                } else if (z10) {
                                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                                } else {
                                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                    aVar = this.R3;
                                    if (aVar != null) {
                                        aVar.a();
                                    }
                                }
                            }
                        } else if (!z10) {
                            if (z10) {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                            } else {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                aVar = this.R3;
                                if (aVar != null) {
                                    aVar.a();
                                }
                            }
                        } else if (z10) {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                        } else {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                            aVar = this.R3;
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    } else if (!z10) {
                        if (z10) {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                        } else {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                            aVar = this.R3;
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    } else if (z10) {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                    } else {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                        aVar = this.R3;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                } else if (!z10) {
                    if (z10) {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                    } else {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                        aVar = this.R3;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                } else if (z10) {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                } else {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                    aVar = this.R3;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } else if (z10) {
                heVar = this.T;
                if (heVar != null) {
                    fValueOf = null;
                } else {
                    fValueOf = null;
                }
                if (!f0.e(fValueOf, 0.0f)) {
                    heVar2 = this.T;
                    if (heVar2 == null) {
                        r11 = false;
                    } else {
                        r11 = false;
                    }
                    if (r11 != true) {
                        heVar3 = this.T;
                        if (heVar3 != null) {
                            z12 = true;
                        }
                        if (!z12) {
                            if (!z10) {
                                if (z10) {
                                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                                } else {
                                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                    aVar = this.R3;
                                    if (aVar != null) {
                                        aVar.a();
                                    }
                                }
                            } else if (z10) {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                            } else {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                aVar = this.R3;
                                if (aVar != null) {
                                    aVar.a();
                                }
                            }
                        }
                    } else if (!z10) {
                        if (z10) {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                        } else {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                            aVar = this.R3;
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    } else if (z10) {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                    } else {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                        aVar = this.R3;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                } else if (!z10) {
                    if (z10) {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                    } else {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                        aVar = this.R3;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                } else if (z10) {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                } else {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                    aVar = this.R3;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } else if (!z10) {
                if (z10) {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                } else {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                    aVar = this.R3;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } else if (z10) {
                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
            } else {
                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                aVar = this.R3;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } else if (z10) {
            heVar = this.T;
            if (heVar != null || (lottieAnimationView3 = heVar.f111411d) == null) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(lottieAnimationView3.getProgress());
            }
            if (!f0.e(fValueOf, 0.0f)) {
                heVar2 = this.T;
                if (heVar2 == null && (lottieAnimationView2 = heVar2.f111411d) != null && lottieAnimationView2.getVisibility() == 4) {
                    r11 = true;
                } else {
                    r11 = false;
                }
                if (r11 != true) {
                    heVar3 = this.T;
                    if (heVar3 != null && (lottieAnimationView = heVar3.f111411d) != null && lottieAnimationView.getVisibility() == 0) {
                        z12 = true;
                    }
                    if (!z12) {
                        if (!z10) {
                            if (z10) {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                            } else {
                                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                                aVar = this.R3;
                                if (aVar != null) {
                                    aVar.a();
                                }
                            }
                        } else if (z10) {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                        } else {
                            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                            aVar = this.R3;
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    }
                } else if (!z10) {
                    if (z10) {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                    } else {
                        Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                        aVar = this.R3;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                } else if (z10) {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                } else {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                    aVar = this.R3;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } else if (!z10) {
                if (z10) {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
                } else {
                    Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                    aVar = this.R3;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } else if (z10) {
                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
            } else {
                Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
                aVar = this.R3;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } else if (!z10 && z11) {
            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new c());
        } else if (z10) {
            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.b(this.M3)).z1(new d());
        } else {
            Glide.F(getContext()).load(LikeAnimResourceManager.f79963a.d(this.M3)).z1(new e(z11));
            aVar = this.R3;
            if (aVar != null) {
                aVar.a();
            }
        }
        int iZ0 = z0(z10);
        he heVar15 = this.T;
        if (heVar15 != null && (textView2 = heVar15.f111413f) != null) {
            textView2.setTextColor(iZ0);
        }
        if (z11) {
            if (z10) {
                he heVar16 = this.T;
                textView = heVar16 != null ? heVar16.f111413f : null;
                if (textView != null) {
                    textView.setTypeface(bb.d.a().b(5));
                }
            } else {
                he heVar17 = this.T;
                textView = heVar17 != null ? heVar17.f111413f : null;
                if (textView != null) {
                    textView.setTypeface(bb.d.a().b(2));
                }
            }
        }
        he heVar18 = this.T;
        if (heVar18 == null || (relativeLayoutB = heVar18.b()) == null) {
            return;
        }
        relativeLayoutB.invalidate();
    }

    public final void setLikeBtnText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27923, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        he heVar = this.T;
        TextView textView = heVar != null ? heVar.f111413f : null;
        if (textView == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    public final void setLikeBtnVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27921, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        he heVar = this.T;
        RelativeLayout relativeLayoutB = heVar != null ? heVar.b() : null;
        if (relativeLayoutB == null) {
            return;
        }
        relativeLayoutB.setVisibility(z10 ? 0 : 8);
    }

    public final void setLikeLottieV2Key(@dl.e String str) {
        this.N3 = str;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setLikeTouchListener(@dl.e View.OnTouchListener onTouchListener) {
        RelativeLayout relativeLayoutB;
        if (PatchProxy.proxy(new Object[]{onTouchListener}, this, changeQuickRedirect, false, 27904, new Class[]{View.OnTouchListener.class}, Void.TYPE).isSupported) {
            return;
        }
        he heVar = this.T;
        if (heVar != null && (relativeLayoutB = heVar.b()) != null) {
            relativeLayoutB.setOnTouchListener(onTouchListener);
        }
        this.f80962c0 = onTouchListener;
    }

    public final void setLottieAnimContextRef(@dl.e WeakReference<Activity> weakReference) {
        this.O3 = weakReference;
    }

    public final void setMaskColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27915, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.P3 = i10;
        N0(i10);
    }

    public final void setNeedBoldNumTextAfterLiked(boolean z10) {
        this.f80961b0 = z10;
    }

    public final void setShareBtnIcon(int i10) {
        ge geVar;
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27945, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (geVar = this.W) == null || (imageView = geVar.f110951b) == null) {
            return;
        }
        imageView.setImageResource(i10);
    }

    public final void setShareBtnText(@dl.d String string) {
        if (PatchProxy.proxy(new Object[]{string}, this, changeQuickRedirect, false, 27944, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(string, "string");
        ge geVar = this.W;
        TextView textView = geVar != null ? geVar.f110953d : null;
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void setShareBtnVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27948, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.W;
        LinearLayout linearLayoutB = geVar != null ? geVar.b() : null;
        if (linearLayoutB == null) {
            return;
        }
        linearLayoutB.setVisibility(z10 ? 0 : 8);
    }

    public final void setShareOnClickListener(@dl.e View.OnClickListener onClickListener) {
        LinearLayout linearLayoutB;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 27907, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        ge geVar = this.W;
        if (geVar != null && (linearLayoutB = geVar.b()) != null) {
            linearLayoutB.setOnClickListener(onClickListener);
        }
        this.f80968y1 = onClickListener;
    }

    public final void setSp_like_key(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27914, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.M3 = str;
        if (str != null) {
            Glide.F(getContext()).b(LikeAnimResourceManager.f79963a.c(str)).z1(new i());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0(boolean z10, boolean z11) {
        ShineButton shineButton;
        ge geVar;
        ShineButton shineButton2;
        ShineButton shineButton3;
        ge geVar2;
        ShineButton shineButton4;
        ShineButton shineButton5;
        ShineButton shineButton6;
        ShineButton shineButton7;
        boolean z12 = false;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27951, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (z11) {
            he heVar = this.T;
            if (heVar != null && (shineButton7 = heVar.f111412e) != null) {
                shineButton7.p();
            }
        } else {
            he heVar2 = this.T;
            if (heVar2 != null && (shineButton = heVar2.f111412e) != null) {
                shineButton.E();
            }
        }
        he heVar3 = this.T;
        if (heVar3 != null && (shineButton6 = heVar3.f111412e) != null) {
            shineButton6.p();
        }
        ge geVar3 = this.V;
        if (((geVar3 == null || (shineButton5 = geVar3.f110952c) == null || !shineButton5.x()) ? false : true) == false && (geVar2 = this.V) != null && (shineButton4 = geVar2.f110952c) != null) {
            shineButton4.p();
        }
        ge geVar4 = this.U;
        if (geVar4 != null && (shineButton3 = geVar4.f110952c) != null && shineButton3.x()) {
            z12 = true;
        }
        if (z12 || z10 || (geVar = this.U) == null || (shineButton2 = geVar.f110952c) == null) {
            return;
        }
        shineButton2.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(boolean z10) {
        ShineButton shineButton;
        ge geVar;
        ShineButton shineButton2;
        ShineButton shineButton3;
        ge geVar2;
        ShineButton shineButton4;
        ShineButton shineButton5;
        ShineButton shineButton6;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27950, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.M3)) {
            he heVar = this.T;
            if (heVar != null && (shineButton = heVar.f111412e) != null) {
                shineButton.r();
            }
        } else {
            he heVar2 = this.T;
            if (heVar2 != null && (shineButton6 = heVar2.f111412e) != null) {
                shineButton6.s(new b());
            }
        }
        ge geVar3 = this.V;
        if (((geVar3 == null || (shineButton5 = geVar3.f110952c) == null || !shineButton5.x()) ? false : true) == false && (geVar2 = this.V) != null && (shineButton4 = geVar2.f110952c) != null) {
            shineButton4.r();
        }
        ge geVar4 = this.U;
        if (((geVar4 == null || (shineButton3 = geVar4.f110952c) == null || !shineButton3.x()) ? false : true) || z10 || (geVar = this.U) == null || (shineButton2 = geVar.f110952c) == null) {
            return;
        }
        shineButton2.r();
    }

    public int z0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27929, new Class[]{Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (getDarkStyle()) {
            return z10 ? getContext().getResources().getColor(R.color.white) : getContext().getResources().getColor(R.color.text_04);
        }
        return z10 ? getContext().getResources().getColor(R.color.text_primary_1_color) : getContext().getResources().getColor(R.color.text_secondary_1_color);
    }
}
