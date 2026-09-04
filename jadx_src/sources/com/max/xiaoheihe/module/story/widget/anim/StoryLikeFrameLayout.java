package com.max.xiaoheihe.module.story.widget.anim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j0;
import com.airbnb.lottie.g;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryStatInfoObj;
import com.max.hbstory.d;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.viewpage2.video.a;
import com.max.hbutils.anim.OneshotLottieAnimHelper;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.utils.DeviceServiceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.HashMap;
import java.util.Random;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: StoryLikeFrameLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryLikeFrameLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryLikeFrameLayout.kt\ncom/max/xiaoheihe/module/story/widget/anim/StoryLikeFrameLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
@o(parameters = 0)
public final class StoryLikeFrameLayout extends FrameLayout implements a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f92068i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final c f92069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private d f92070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private final Drawable f92072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private ImageView f92073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f92074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f92075h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryLikeFrameLayout(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryLikeFrameLayout(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryLikeFrameLayout(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f92072e = androidx.core.content.d.i(context, R.drawable.hb_r_icon_like_gradient);
        setClipChildren(false);
    }

    public /* synthetic */ StoryLikeFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final /* synthetic */ void a(StoryLikeFrameLayout storyLikeFrameLayout, float f10, float f11) {
        Object[] objArr = {storyLikeFrameLayout, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 43739, new Class[]{StoryLikeFrameLayout.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        storyLikeFrameLayout.h(f10, f11);
    }

    public static final /* synthetic */ void b(StoryLikeFrameLayout storyLikeFrameLayout) {
        if (PatchProxy.proxy(new Object[]{storyLikeFrameLayout}, null, changeQuickRedirect, true, 43742, new Class[]{StoryLikeFrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLikeFrameLayout.i();
    }

    public static final /* synthetic */ void d(StoryLikeFrameLayout storyLikeFrameLayout) {
        if (PatchProxy.proxy(new Object[]{storyLikeFrameLayout}, null, changeQuickRedirect, true, 43741, new Class[]{StoryLikeFrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLikeFrameLayout.j();
    }

    public static final /* synthetic */ void g(StoryLikeFrameLayout storyLikeFrameLayout) {
        if (PatchProxy.proxy(new Object[]{storyLikeFrameLayout}, null, changeQuickRedirect, true, 43740, new Class[]{StoryLikeFrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLikeFrameLayout.p();
    }

    private final int getLikeCount() {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43731, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        d mStoryContext = getMStoryContext();
        if (mStoryContext == null || (storyItemsObjM = StoryUtilsKt.m(mStoryContext, getMPosition())) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
            return 0;
        }
        return stat_info.getLink_award_num();
    }

    private final float getRandomRotate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43737, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : new Random().nextInt(20) - 10;
    }

    private final void h(final float f10, final float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43734, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f92075h) {
            DeviceServiceUtil.f95244a.b(50L);
        }
        StoryUtilsKt.p(this, getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$addHeartView$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 43743, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                String double_click_lottie_key = storyItemsObj != null ? storyItemsObj.getDouble_click_lottie_key() : null;
                if (!(true ^ (double_click_lottie_key == null || kotlin.text.u.V1(double_click_lottie_key)))) {
                    double_click_lottie_key = null;
                }
                if (double_click_lottie_key != null) {
                    final StoryLikeFrameLayout storyLikeFrameLayout = this.f92076b;
                    final float f12 = f10;
                    final float f13 = f11;
                    AccelWorldLottieKt.h(double_click_lottie_key, null, new l<g, b2>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$addHeartView$1$2$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d g lottieComposition) {
                            if (PatchProxy.proxy(new Object[]{lottieComposition}, this, changeQuickRedirect, false, 43745, new Class[]{g.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(lottieComposition, "lottieComposition");
                            Context context = storyLikeFrameLayout.getContext();
                            f0.o(context, "context");
                            new OneshotLottieAnimHelper.a(context).o(f12, f13).k(lottieComposition).r(storyLikeFrameLayout).a().m();
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(g gVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 43746, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(gVar);
                            return b2.f124493a;
                        }
                    }, 2, null);
                    return;
                }
                StoryLikeFrameLayout storyLikeFrameLayout2 = this.f92076b;
                float f14 = f10;
                float f15 = f11;
                Context context = storyLikeFrameLayout2.getContext();
                f0.o(context, "context");
                new OneshotLottieAnimHelper.a(context).o(f14, f15).j(R.raw.default_double_click_upvote).r(storyLikeFrameLayout2).a().m();
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 43744, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    private final void i() {
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43730, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f92075h = false;
        setLikeCount(Math.max(0, getLikeCount() - 1));
        d mStoryContext = getMStoryContext();
        if (mStoryContext == null || (gVarD = mStoryContext.d()) == null) {
            return;
        }
        gVarD.e0(false);
    }

    private final void j() {
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43729, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f92075h = true;
        setLikeCount(getLikeCount() + 1);
        d mStoryContext = getMStoryContext();
        if (mStoryContext == null || (gVarD = mStoryContext.d()) == null) {
            return;
        }
        gVarD.e0(true);
    }

    private final ImageView k(Drawable drawable, float f10, float f11) {
        Object[] objArr = {drawable, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43735, new Class[]{Drawable.class, cls, cls}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f92073f;
        return imageView == null ? l(this, drawable, f10, f11) : imageView;
    }

    private static final ImageView l(StoryLikeFrameLayout storyLikeFrameLayout, Drawable drawable, float f10, float f11) {
        Object[] objArr = {storyLikeFrameLayout, drawable, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 43738, new Class[]{StoryLikeFrameLayout.class, Drawable.class, cls, cls}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        layoutParams.leftMargin = (int) (f10 - (drawable.getIntrinsicWidth() / 2));
        layoutParams.topMargin = (int) ((f11 - drawable.getIntrinsicHeight()) - ViewUtils.f(storyLikeFrameLayout.getContext(), 30.0f));
        ImageView imageView = new ImageView(storyLikeFrameLayout.getContext());
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix = new Matrix();
        matrix.postRotate(storyLikeFrameLayout.getRandomRotate());
        imageView.setImageMatrix(matrix);
        imageView.setImageDrawable(drawable);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private final AnimatorSet m(ImageView imageView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 43736, new Class[]{ImageView.class}, AnimatorSet.class);
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

    private final void n() {
        d mStoryContext;
        Fragment fragmentB;
        d mStoryContext2;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43733, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null) {
            return;
        }
        gVarD.m().k(fragmentB, new j0<com.max.hbstory.g.a>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$observeContinuousClickEvent$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(com.max.hbstory.g.a aVar) {
                if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 43748, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(aVar);
            }

            public final void b(final com.max.hbstory.g.a aVar) {
                if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 43747, new Class[]{com.max.hbstory.g.a.class}, Void.TYPE).isSupported) {
                    return;
                }
                final StoryLikeFrameLayout storyLikeFrameLayout = this.f92082a;
                StoryUtilsKt.f(storyLikeFrameLayout, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$observeContinuousClickEvent$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43750, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43749, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryLikeFrameLayout.a(storyLikeFrameLayout, aVar.g(), aVar.h());
                    }
                });
            }
        });
    }

    private final void o() {
        d mStoryContext;
        Fragment fragmentB;
        d mStoryContext2;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43727, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null) {
            return;
        }
        gVarD.r().k(fragmentB, new j0<com.max.hbstory.g.a>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$observeDoubleClickEvent$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(com.max.hbstory.g.a aVar) {
                if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 43752, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(aVar);
            }

            public final void b(final com.max.hbstory.g.a aVar) {
                if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 43751, new Class[]{com.max.hbstory.g.a.class}, Void.TYPE).isSupported) {
                    return;
                }
                final StoryLikeFrameLayout storyLikeFrameLayout = this.f92085a;
                StoryUtilsKt.f(storyLikeFrameLayout, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$observeDoubleClickEvent$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43754, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43753, new Class[0], Void.TYPE).isSupported && aVar.f() == 2) {
                            StoryLikeFrameLayout.a(storyLikeFrameLayout, aVar.g(), aVar.h());
                            StoryLikeFrameLayout.g(storyLikeFrameLayout);
                        }
                    }
                });
            }
        });
    }

    private final void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StoryUtilsKt.p(this, getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$onLike$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                com.max.hbstory.c cVarC;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 43755, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null) {
                    return;
                }
                final StoryLikeFrameLayout storyLikeFrameLayout = this.f92088b;
                final int mPosition = storyLikeFrameLayout.getMPosition();
                StoryStatInfoObj storyStatInfoObjK = StoryUtilsKt.k(storyLikeFrameLayout, storyLikeFrameLayout.getMPosition());
                if ((storyStatInfoObjK == null || storyStatInfoObjK.is_award_link()) ? false : true) {
                    StoryLikeFrameLayout.d(storyLikeFrameLayout);
                    d mStoryContext = storyLikeFrameLayout.getMStoryContext();
                    if (mStoryContext == null || (cVarC = mStoryContext.c()) == null) {
                        return;
                    }
                    StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
                    cVarC.f(card_id_info != null ? card_id_info.getItem_id() : null, storyItemsObj.getH_src(), "1", new HashMap(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$onLike$1$1$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43757, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }
                    }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout$onLike$1$1$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 43759, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2(th2);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@dl.d Throwable it) {
                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43758, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(it, "it");
                            if (mPosition == storyLikeFrameLayout.getMPosition()) {
                                StoryLikeFrameLayout.b(storyLikeFrameLayout);
                            }
                        }
                    });
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 43756, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    private final void setLikeCount(int i10) {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43732, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        d mStoryContext = getMStoryContext();
        StoryStatInfoObj stat_info = (mStoryContext == null || (storyItemsObjM = StoryUtilsKt.m(mStoryContext, getMPosition())) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null) ? null : link_card_info.getStat_info();
        if (stat_info == null) {
            return;
        }
        stat_info.setLink_award_num(i10);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 43725, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 43726, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        this.f92075h = false;
        if (this.f92074g) {
            return;
        }
        this.f92074g = true;
        o();
        n();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f92069b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92071d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public d getMStoryContext() {
        return this.f92070c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92071d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e d dVar) {
        this.f92070c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
    }
}
