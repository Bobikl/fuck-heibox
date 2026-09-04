package com.max.xiaoheihe.module.story.widget.ui.root;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.o;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbstory.config.StoryRootViewBuilder;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import xh.i;

/* JADX INFO: compiled from: StoryOverlayTipsWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryOverlayTipsWidget extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f92146d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f92147e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final String f92148f = "StoryOverlayTipsWidget";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private StoryRootViewBuilder.OverlayTipsType f92149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private View f92150c;

    /* JADX INFO: compiled from: StoryOverlayTipsWidget.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: StoryOverlayTipsWidget.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92151a;

        static {
            int[] iArr = new int[StoryRootViewBuilder.OverlayTipsType.valuesCustom().length];
            try {
                iArr[StoryRootViewBuilder.OverlayTipsType.TYPE_VIDEO_TUTORIAL_TIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryRootViewBuilder.OverlayTipsType.TYPE_DOUBLE_CLICK_UPVOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryRootViewBuilder.OverlayTipsType.TYPE_NONE_TIPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f92151a = iArr;
        }
    }

    /* JADX INFO: compiled from: StoryOverlayTipsWidget.kt */
    public static final class c implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f92153c;

        c(LottieAnimationView lottieAnimationView) {
            this.f92153c = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 43893, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 43892, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            StoryOverlayTipsWidget.a(StoryOverlayTipsWidget.this, this.f92153c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 43894, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 43891, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }
    }

    /* JADX INFO: compiled from: StoryOverlayTipsWidget.kt */
    public static final class e implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f92155a;

        e(LottieAnimationView lottieAnimationView) {
            this.f92155a = lottieAnimationView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 43897, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f92155a.E();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 43896, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f92155a.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryOverlayTipsWidget(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryOverlayTipsWidget(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryOverlayTipsWidget(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f92149b = StoryRootViewBuilder.OverlayTipsType.TYPE_NONE_TIPS;
    }

    public /* synthetic */ StoryOverlayTipsWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final /* synthetic */ void a(StoryOverlayTipsWidget storyOverlayTipsWidget, View view) {
        if (PatchProxy.proxy(new Object[]{storyOverlayTipsWidget, view}, null, changeQuickRedirect, true, 43890, new Class[]{StoryOverlayTipsWidget.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        storyOverlayTipsWidget.f(view);
    }

    private final LottieAnimationView b(File file, String str, int i10) {
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file, str, new Integer(i10)}, this, changeQuickRedirect, false, 43884, new Class[]{File.class, String.class, Integer.TYPE}, LottieAnimationView.class);
        if (patchProxyResultProxy.isSupported) {
            return (LottieAnimationView) patchProxyResultProxy.result;
        }
        try {
            Result.a aVar = Result.f124476c;
            LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
            lottieAnimationView.setFailureListener(r.f95734k);
            AccelWorldLottieKt.a(lottieAnimationView, str);
            lottieAnimationView.j(new c(lottieAnimationView));
            lottieAnimationView.setRepeatCount(i10);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setBackground(new ColorDrawable(Color.parseColor("#B3000000")));
            objB = Result.b(lottieAnimationView);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            g.f74531b.q("[StoryOverlayTipsWidget][buildLottieAnimView] build failed\nlottieCacheFile: " + file + "\nerror: " + thE);
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (LottieAnimationView) objB;
    }

    static /* synthetic */ LottieAnimationView c(StoryOverlayTipsWidget storyOverlayTipsWidget, File file, String str, int i10, int i11, Object obj) {
        Object[] objArr = {storyOverlayTipsWidget, file, str, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 43885, new Class[]{StoryOverlayTipsWidget.class, File.class, String.class, cls, cls, Object.class}, LottieAnimationView.class);
        if (patchProxyResultProxy.isSupported) {
            return (LottieAnimationView) patchProxyResultProxy.result;
        }
        if ((i11 & 4) != 0) {
            i10 = 3;
        }
        return storyOverlayTipsWidget.b(file, str, i10);
    }

    private final View d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43883, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        File file = new File(r.r(r.f95729f));
        File file2 = file.exists() ? file : null;
        if (file2 != null) {
            return c(this, file2, r.f95729f, 0, 4, null);
        }
        g.f74531b.q("[StoryOverlayTipsWidget][generateDoubleClickUpvoteGuideView] file not exists");
        return null;
    }

    private final View e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43882, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        File file = new File(r.r(r.f95727d));
        File file2 = file.exists() ? file : null;
        if (file2 != null) {
            return c(this, file2, r.f95727d, 0, 4, null);
        }
        g.f74531b.q("[StoryOverlayTipsWidget][generateVideoTutorialView] file not exists");
        return null;
    }

    private final void f(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43886, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = b.f92151a[this.f92149b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            LottieAnimationView lottieAnimationView = view instanceof LottieAnimationView ? (LottieAnimationView) view : null;
            if (lottieAnimationView != null) {
                if (lottieAnimationView.A()) {
                    lottieAnimationView.p();
                }
                lottieAnimationView.setProgress(0.0f);
                lottieAnimationView.setVisibility(8);
            }
        }
    }

    private final void g() {
        View viewE;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43881, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
        int i10 = b.f92151a[this.f92149b.ordinal()];
        if (i10 == 1) {
            viewE = e();
        } else if (i10 == 2) {
            viewE = d();
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            viewE = null;
        }
        if (viewE == null) {
            return;
        }
        this.f92150c = viewE;
        viewE.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.story.widget.ui.root.StoryOverlayTipsWidget.d
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(@dl.d View p10) {
                if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 43895, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(p10, "p0");
                StoryOverlayTipsWidget.a(StoryOverlayTipsWidget.this, p10);
            }
        });
        addView(viewE, -1, -1);
    }

    private final void h(LottieAnimationView lottieAnimationView) {
        if (PatchProxy.proxy(new Object[]{lottieAnimationView}, this, changeQuickRedirect, false, 43889, new Class[]{LottieAnimationView.class}, Void.TYPE).isSupported) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(300L);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new e(lottieAnimationView));
        lottieAnimationView.startAnimation(alphaAnimation);
    }

    private final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43888, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = b.f92151a[this.f92149b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            View view = this.f92150c;
            LottieAnimationView lottieAnimationView = view instanceof LottieAnimationView ? (LottieAnimationView) view : null;
            if (lottieAnimationView != null) {
                h(lottieAnimationView);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@dl.d View changedView, int i10) {
        if (PatchProxy.proxy(new Object[]{changedView, new Integer(i10)}, this, changeQuickRedirect, false, 43887, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        if (i10 == 0) {
            i();
        }
    }

    public final void setOverlayTipsType(@dl.d StoryRootViewBuilder.OverlayTipsType overlayTipsType) {
        if (PatchProxy.proxy(new Object[]{overlayTipsType}, this, changeQuickRedirect, false, 43880, new Class[]{StoryRootViewBuilder.OverlayTipsType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(overlayTipsType, "overlayTipsType");
        this.f92149b = overlayTipsType;
        g();
    }
}
