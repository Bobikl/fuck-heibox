package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkSpecialTagObj;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialItem;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialListObj;
import com.max.xiaoheihe.utils.e0;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ma;
import dl.d;
import fi.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlin.text.Regex;
import kotlin.z;
import ng.j;
import yh.l;

/* JADX INFO: compiled from: PostGameMaterialFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostGameMaterialFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostGameMaterialFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostGameMaterialFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,425:1\n106#2,15:426\n1#3:441\n329#4,4:442\n329#4,4:446\n*S KotlinDebug\n*F\n+ 1 PostGameMaterialFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostGameMaterialFragment\n*L\n44#1:426,15\n287#1:442,4\n290#1:446,4\n*E\n"})
@o(parameters = 0)
public final class PostGameMaterialFragment extends BasePostFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f81860v = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final z f81861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ma f81862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.game.heybox.gamematerial.ui.d f81863u;

    /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
    public static final class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29243, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            PostGameMaterialFragment.this.t5().s();
        }
    }

    /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
    public static final class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29244, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            PostGameMaterialFragment.this.s5().f113360d.setNoMoreData(true);
        }
    }

    /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
    public static final class c implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f81866a = -1;

        c() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public void a(@dl.d View v10, int i10, int i11, int i12) {
            Object[] objArr = {v10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29245, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
        }

        public final int b() {
            return this.f81866a;
        }

        public final void c(int i10) {
            this.f81866a = i10;
        }
    }

    /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
    public static final class d implements j0<Result<GameMaterialListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Result<GameMaterialListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29247, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(result);
        }

        public final void b(@dl.e Result<GameMaterialListObj> result) {
            GameMaterialListObj result2;
            ArrayList<GameMaterialItem> materialList;
            com.max.xiaoheihe.module.game.heybox.gamematerial.ui.d dVar;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29246, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            PostGameMaterialFragment.this.s5().f113360d.P();
            PostGameMaterialFragment.this.s5().f113360d.w();
            if (result == null || (result2 = result.getResult()) == null || (materialList = result2.getMaterialList()) == null || (dVar = PostGameMaterialFragment.this.f81863u) == null) {
                return;
            }
            com.max.xiaoheihe.module.game.heybox.gamematerial.ui.d.s(dVar, materialList, false, 2, null);
        }
    }

    /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
    public static final class e implements j0<com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.d> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.d dVar) {
            if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 29249, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(dVar);
        }

        public final void b(com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.d dVar) {
            if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 29248, new Class[]{com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.d.class}, Void.TYPE).isSupported) {
                return;
            }
            PostGameMaterialFragment.this.A4(dVar.e());
        }
    }

    /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f81869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f81870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f81871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f81872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f81873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f81874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f81875h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f81876i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f81877j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f81878k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f81879l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f81880m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f81881n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ExpressionTextView f81882o;

        /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f81884c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ View f81885d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f81886e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ View f81887f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f81888g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f81889h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f81890i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f81891j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f81892k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f81893l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ TextView f81894m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f81895n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ ExpressionTextView f81896o;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameMaterialFragment$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
            public static final class C0704a implements ValueAnimator.AnimatorUpdateListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f81897b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f81898c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ f f81899d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ TextView f81900e;

                C0704a(View view, int i10, f fVar, TextView textView) {
                    this.f81897b = view;
                    this.f81898c = i10;
                    this.f81899d = fVar;
                    this.f81900e = textView;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
                    if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29264, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(animation, "animation");
                    ViewGroup.LayoutParams layoutParams = this.f81897b.getLayoutParams();
                    f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    Object animatedValue = animation.getAnimatedValue();
                    f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    ((RelativeLayout.LayoutParams) layoutParams).topMargin = ((Integer) animatedValue).intValue();
                    Object animatedValue2 = animation.getAnimatedValue();
                    f0.n(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) animatedValue2).intValue() / u.u(this.f81898c, 1);
                    if (this.f81899d.a()) {
                        iIntValue++;
                    }
                    this.f81900e.setMaxLines(iIntValue);
                    this.f81897b.requestLayout();
                }
            }

            /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
            public static final class b implements ValueAnimator.AnimatorUpdateListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f81901b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f81902c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ f f81903d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ ExpressionTextView f81904e;

                b(View view, int i10, f fVar, ExpressionTextView expressionTextView) {
                    this.f81901b = view;
                    this.f81902c = i10;
                    this.f81903d = fVar;
                    this.f81904e = expressionTextView;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
                    if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29265, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(animation, "animation");
                    ViewGroup.LayoutParams layoutParams = this.f81901b.getLayoutParams();
                    f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    Object animatedValue = animation.getAnimatedValue();
                    f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    ((RelativeLayout.LayoutParams) layoutParams).topMargin = ((Integer) animatedValue).intValue();
                    Object animatedValue2 = animation.getAnimatedValue();
                    f0.n(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) animatedValue2).intValue() / u.u(this.f81902c, 1);
                    if (this.f81903d.a()) {
                        iIntValue++;
                    }
                    this.f81904e.setMaxLines(iIntValue);
                    this.f81901b.requestLayout();
                }
            }

            a(ImageView imageView, View view, int i10, View view2, int i11, int i12, int i13, int i14, int i15, int i16, TextView textView, int i17, ExpressionTextView expressionTextView) {
                this.f81884c = imageView;
                this.f81885d = view;
                this.f81886e = i10;
                this.f81887f = view2;
                this.f81888g = i11;
                this.f81889h = i12;
                this.f81890i = i13;
                this.f81891j = i14;
                this.f81892k = i15;
                this.f81893l = i16;
                this.f81894m = textView;
                this.f81895n = i17;
                this.f81896o = expressionTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ObjectAnimator objectAnimatorOfFloat;
                ValueAnimator valueAnimatorOfInt;
                ValueAnimator valueAnimatorOfInt2;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29263, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
                aVar.q("updateLinkHeader, isExpanded = " + f.this.a());
                if (f.this.a()) {
                    ImageView imageView = this.f81884c;
                    objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, androidx.constraintlayout.motion.widget.f.f18721i, imageView.getRotation(), 0.0f);
                    f0.o(objectAnimatorOfFloat, "ofFloat(ivExpand, \"rotat…\", ivExpand.rotation, 0f)");
                    ViewGroup.LayoutParams layoutParams = this.f81885d.getLayoutParams();
                    f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    valueAnimatorOfInt = ValueAnimator.ofInt(((RelativeLayout.LayoutParams) layoutParams).topMargin, this.f81886e);
                    f0.o(valueAnimatorOfInt, "ofInt(\n                 …                        )");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("updateLinkHeader, topMargin = ");
                    ViewGroup.LayoutParams layoutParams2 = this.f81885d.getLayoutParams();
                    f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    sb2.append(((RelativeLayout.LayoutParams) layoutParams2).topMargin);
                    aVar.q(sb2.toString());
                    ViewGroup.LayoutParams layoutParams3 = this.f81887f.getLayoutParams();
                    f0.n(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    valueAnimatorOfInt2 = ValueAnimator.ofInt(((RelativeLayout.LayoutParams) layoutParams3).topMargin, this.f81888g);
                    f0.o(valueAnimatorOfInt2, "ofInt(\n                 …                        )");
                } else {
                    ImageView imageView2 = this.f81884c;
                    objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView2, androidx.constraintlayout.motion.widget.f.f18721i, imageView2.getRotation(), 180.0f);
                    f0.o(objectAnimatorOfFloat, "ofFloat(\n               …                        )");
                    aVar.q("updateLinkHeader, aLines = " + this.f81889h + ", bLines = " + this.f81890i + ", originalOffsetTitle = " + this.f81886e);
                    valueAnimatorOfInt = ValueAnimator.ofInt(this.f81886e, this.f81891j);
                    f0.o(valueAnimatorOfInt, "ofInt(\n                 …                        )");
                    valueAnimatorOfInt2 = ValueAnimator.ofInt(this.f81888g, this.f81892k);
                    f0.o(valueAnimatorOfInt2, "ofInt(\n                 …                        )");
                }
                valueAnimatorOfInt.addUpdateListener(new C0704a(this.f81885d, this.f81893l, f.this, this.f81894m));
                valueAnimatorOfInt2.addUpdateListener(new b(this.f81887f, this.f81895n, f.this, this.f81896o));
                f fVar = f.this;
                fVar.b(!fVar.a());
                arrayList.add(objectAnimatorOfFloat);
                arrayList.add(valueAnimatorOfInt);
                arrayList.add(valueAnimatorOfInt2);
                animatorSet.setDuration(200L);
                animatorSet.playTogether(arrayList);
                animatorSet.start();
            }
        }

        f(ImageView imageView, TextView textView, View view, int i10, View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, ExpressionTextView expressionTextView) {
            this.f81870c = imageView;
            this.f81871d = textView;
            this.f81872e = view;
            this.f81873f = i10;
            this.f81874g = view2;
            this.f81875h = i11;
            this.f81876i = i12;
            this.f81877j = i13;
            this.f81878k = i14;
            this.f81879l = i15;
            this.f81880m = i16;
            this.f81881n = i17;
            this.f81882o = expressionTextView;
        }

        public final boolean a() {
            return this.f81869b;
        }

        public final void b(boolean z10) {
            this.f81869b = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@dl.d View v10) {
            if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, 29262, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
            if (this.f81870c.getVisibility() == 8) {
                return;
            }
            TextView textView = this.f81871d;
            textView.post(new a(this.f81870c, this.f81872e, this.f81873f, this.f81874g, this.f81875h, this.f81876i, this.f81877j, this.f81878k, this.f81879l, this.f81880m, textView, this.f81881n, this.f81882o));
        }
    }

    /* JADX INFO: compiled from: PostGameMaterialFragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f81906c;

        g(BBSUserInfoObj bBSUserInfoObj) {
            this.f81906c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29266, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) PostGameMaterialFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.T(mContext, this.f81906c.getUserid()).A();
        }
    }

    public PostGameMaterialFragment() {
        final yh.a<c1> aVar = new yh.a<c1>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameMaterialFragment$postPageViewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29250, new Class[0], c1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (c1) patchProxyResultProxy.result;
                }
                Fragment fragmentRequireParentFragment = this.f81907b.requireParentFragment();
                f0.o(fragmentRequireParentFragment, "requireParentFragment()");
                return fragmentRequireParentFragment;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29251, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final z zVarB = b0.b(LazyThreadSafetyMode.NONE, new yh.a<c1>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameMaterialFragment$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29252, new Class[0], c1.class);
                return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : (c1) aVar.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29253, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar2 = null;
        this.f81861s = FragmentViewModelLazyKt.h(this, n0.d(com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameMaterialFragment$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29254, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29255, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameMaterialFragment$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29257, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @d
            public final u2.a invoke() {
                u2.a aVar3;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29256, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar4 = aVar2;
                if (aVar4 != null && (aVar3 = (u2.a) aVar4.invoke()) != null) {
                    return aVar3;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                return rVar != null ? rVar.getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameMaterialFragment$special$$inlined$viewModels$default$4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @d
            public final y0.b invoke() {
                y0.b defaultViewModelProviderFactory;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29258, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                y0.b defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29259, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    private final void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29225, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N4(1);
        Activity activity = this.mContext;
        RecyclerView recyclerView = s5().f113359c;
        f0.o(recyclerView, "binding.rv");
        com.max.xiaoheihe.module.game.heybox.gamematerial.ui.e.a(activity, recyclerView);
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        RecyclerView recyclerView2 = s5().f113359c;
        f0.o(recyclerView2, "binding.rv");
        this.f81863u = new com.max.xiaoheihe.module.game.heybox.gamematerial.ui.d(mContext, recyclerView2);
        s5().f113359c.setAdapter(this.f81863u);
        s5().f113360d.S(new a());
        s5().f113360d.f0(new b());
        s5().f113358b.setOnVerticalScrollChangeListener(new c());
        t5().t().k(this, new d());
        t5().k().k(this, new e());
    }

    private final void w5(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 29239, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkInfoObj linkInfoObjD4 = d4();
        List<BBSTextObj> listB = k.b(linkInfoObjD4 != null ? linkInfoObjD4.getText() : null, BBSTextObj.class);
        if (!com.max.hbcommon.utils.c.w(listB)) {
            for (BBSTextObj bBSTextObj : listB) {
                if (bBSTextObj != null && f0.g("text", bBSTextObj.getType())) {
                    arrayList.add(bBSTextObj.getText());
                }
            }
        }
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            textView.setVisibility(8);
            return;
        }
        String strH3 = CollectionsKt___CollectionsKt.h3(arrayList, "\n", null, null, 0, null, new l<String, CharSequence>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostGameMaterialFragment$updateLinkDesc$text$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final CharSequence a(@d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29260, new Class[]{String.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return it;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29261, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        }, 30, null);
        if (com.max.hbcommon.utils.c.u(strH3)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strH3);
            textView.setVisibility(0);
        }
    }

    private final void x5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29238, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        BBSUserInfoObj user = linkInfoObjD4 != null ? linkInfoObjD4.getUser() : null;
        if (user == null) {
            return;
        }
        RelativeLayout relativeLayoutB = s5().f113361e.b();
        f0.o(relativeLayoutB, "binding.vgMaterialHeader.root");
        HeyBoxAvatarView heyBoxAvatarView = s5().f113361e.f118240b;
        f0.o(heyBoxAvatarView, "binding.vgMaterialHeader.ivAvatar");
        TextView textView = s5().f113361e.f118245g;
        f0.o(textView, "binding.vgMaterialHeader.tvUserName");
        LinearLayout linearLayout = s5().f113361e.f118251m;
        f0.o(linearLayout, "binding.vgMaterialHeader.vgTitle");
        TextView textView2 = s5().f113361e.f118244f;
        f0.o(textView2, "binding.vgMaterialHeader.tvTitle");
        ExpressionTextView expressionTextView = s5().f113361e.f118242d;
        f0.o(expressionTextView, "binding.vgMaterialHeader.tvDesc");
        TextView textView3 = s5().f113361e.f118243e;
        f0.o(textView3, "binding.vgMaterialHeader.tvMaterialInfo");
        ImageView imageView = s5().f113361e.f118241c;
        f0.o(imageView, "binding.vgMaterialHeader.ivExpand");
        RelativeLayout relativeLayout = s5().f113361e.f118252n;
        f0.o(relativeLayout, "binding.vgMaterialHeader.vgUser");
        LinearLayout linearLayout2 = s5().f113361e.f118246h;
        f0.o(linearLayout2, "binding.vgMaterialHeader.vgCards");
        RelativeLayout relativeLayout2 = s5().f113361e.f118249k;
        f0.o(relativeLayout2, "binding.vgMaterialHeader.vgPanelSubA");
        LinearLayout linearLayout3 = s5().f113361e.f118250l;
        f0.o(linearLayout3, "binding.vgMaterialHeader.vgPanelSubB");
        LinkInfoObj linkInfoObjD5 = d4();
        if ((linkInfoObjD5 != null ? linkInfoObjD5.getUser() : null) != null) {
            if (!com.max.hbcommon.utils.c.u(user.getUserid())) {
                g gVar = new g(user);
                heyBoxAvatarView.setOnClickListener(gVar);
                textView.setOnClickListener(gVar);
            }
            heyBoxAvatarView.setAvatar(user.getAvartar(), user.getAvatar_decoration());
            textView.setText(com.max.xiaoheihe.utils.d.M1(user.getUsername()));
            com.max.xiaoheihe.utils.d.j1((RelativeLayout) relativeLayoutB.findViewById(R.id.rl_medal_level), user);
            LinkInfoObj linkInfoObjD6 = d4();
            if (com.max.hbcommon.utils.c.u(linkInfoObjD6 != null ? linkInfoObjD6.getTitle() : null)) {
                linearLayout2 = linearLayout2;
                relativeLayout = relativeLayout;
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                LinkInfoObj linkInfoObjD7 = d4();
                f0.m(linkInfoObjD7);
                LinkSpecialTagObj special_tag = linkInfoObjD7.getSpecial_tag();
                if (special_tag != null) {
                    String name = special_tag.getName();
                    int iE1 = com.max.xiaoheihe.utils.d.e1(special_tag.getColor());
                    int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_11);
                    int color = this.mContext.getResources().getColor(R.color.white);
                    int iF = ViewUtils.f(this.mContext, 2.0f);
                    spannableStringBuilder.append((CharSequence) name).append((CharSequence) " ");
                    com.max.hbcustomview.spans.b bVar = new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(name, dimensionPixelSize, color, iE1, iE1, iF, ViewUtils.f(this.mContext, 5.0f), ViewUtils.f(this.mContext, 3.0f)), 0);
                    f0.m(name);
                    spannableStringBuilder.setSpan(bVar, 0, name.length(), 33);
                }
                LinkInfoObj linkInfoObjD8 = d4();
                f0.m(linkInfoObjD8);
                String title = linkInfoObjD8.getTitle();
                f0.o(title, "mLinkInfoObj!!.title");
                spannableStringBuilder.append((CharSequence) new Regex("\n").m(title, ""));
                textView2.setText(spannableStringBuilder);
            }
            w5(expressionTextView);
            v0 v0Var = v0.f124986a;
            LinkInfoObj linkInfoObjD9 = d4();
            f0.m(linkInfoObjD9);
            Activity activity = this.mContext;
            LinkInfoObj linkInfoObjD10 = d4();
            f0.m(linkInfoObjD10);
            String str = String.format("%s次%s·发布于%s", Arrays.copyOf(new Object[]{linkInfoObjD9.getClick(), this.mContext.getString(R.string.view), w.v(activity, linkInfoObjD10.getCreate_at())}, 3));
            f0.o(str, "format(format, *args)");
            textView3.setText(str);
            imageView.setVisibility((textView2.getVisibility() == 0 || expressionTextView.getVisibility() == 0) ? 0 : 8);
            int i10 = e0.i(textView2, ViewUtils.W(textView2));
            int i11 = e0.i(expressionTextView, ViewUtils.W(expressionTextView));
            int iV = ViewUtils.V(linearLayout);
            int iF2 = textView2.getVisibility() == 0 ? iV + ViewUtils.f(getContext(), 6.0f) : 0;
            int iF3 = textView2.getVisibility() == 0 ? (iV * i10) + ViewUtils.f(getContext(), 6.0f) : 0;
            int iV2 = ViewUtils.V(expressionTextView);
            int i12 = expressionTextView.getVisibility() == 0 ? iV2 : 0;
            int i13 = i11 * i12;
            imageView.setVisibility((textView2.getVisibility() != 8 || i11 > 1) ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = iF2;
            relativeLayout2.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = linearLayout3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = i12;
            linearLayout3.setLayoutParams(layoutParams4);
            relativeLayout.setOnClickListener(new f(imageView, textView2, relativeLayout2, iF2, linearLayout3, i12, i10, i11, iF3, i13, iV, iV2, expressionTextView));
            linearLayout2.setVisibility(8);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void A4(@dl.e Result<BBSLinkTreeObj> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29241, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        super.A4(result);
        s5().f113360d.P();
        s5().f113360d.w();
        if (result == null) {
            showError();
            return;
        }
        n5();
        l5();
        h5();
        j5();
        x5();
        U4();
        kf.a aVarG4 = g4();
        if (aVarG4 != null) {
            aVarG4.p1();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29227, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String str = f0.g("2", linkInfoObjD4.getIs_award_link()) ? "0" : "2";
        o5(str);
        m5(str);
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        Q3(linkInfoObjD5.getLinkid(), str);
        T3("syncWeb('award')");
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void C4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29226, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String str = f0.g("1", linkInfoObjD4.getIs_award_link()) ? "0" : "1";
        o5(str);
        m5(str);
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        Q3(linkInfoObjD5.getLinkid(), str);
        T3("syncWeb('award')");
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U3(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29228, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i5(str);
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String linkid = linkInfoObjD4.getLinkid();
        f0.m(str);
        V3(linkid, null, str);
        T3("syncWeb('favor')");
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void Z3(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29237, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.d3(str, String.valueOf(h4()), BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, null, "0", "0", i4());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29233, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        i5(linkInfoObjD4.getIs_favour());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void i5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29234, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.y(str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29223, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        O4("page_style_video_content");
        ma maVarD = ma.d(this.mInflater, null, false);
        f0.o(maVarD, "inflate(mInflater, null, false)");
        v5(maVarD);
        setContentView(s5());
        u5();
        initViews();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29235, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        k5(linkInfoObjD4.getFollow_status());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void k5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29236, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        if (linkInfoObjD4.getUser() != null) {
            kf.a aVarG4 = g4();
            f0.m(aVarG4);
            LinkInfoObj linkInfoObjD5 = d4();
            f0.m(linkInfoObjD5);
            aVarG4.r1(linkInfoObjD5.getUser(), str);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29231, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        m5(linkInfoObjD4.getIs_award_link());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void m5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29232, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        aVarG4.M2(str, linkInfoObjD4.getLink_award_num());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29229, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        o5(linkInfoObjD4.getIs_award_link());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void o5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29230, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        aVarG4.v(str, linkInfoObjD4 != null ? linkInfoObjD4.getLink_award_num() : null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29240, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        BasePostFragment.a4(this, null, 1, null);
    }

    @dl.d
    public final ma s5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29221, new Class[0], ma.class);
        if (patchProxyResultProxy.isSupported) {
            return (ma) patchProxyResultProxy.result;
        }
        ma maVar = this.f81862t;
        if (maVar != null) {
            return maVar;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e t5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29220, new Class[0], com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e) patchProxyResultProxy.result : (com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e) this.f81861s.getValue();
    }

    public final void u5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29224, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getArguments();
    }

    public final void v5(@dl.d ma maVar) {
        if (PatchProxy.proxy(new Object[]{maVar}, this, changeQuickRedirect, false, 29222, new Class[]{ma.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(maVar, "<set-?>");
        this.f81862t = maVar;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void y4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29242, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (d4() != null) {
            LinkInfoObj linkInfoObjD4 = d4();
            f0.m(linkInfoObjD4);
            linkInfoObjD4.setIs_favour(str);
            h5();
        }
        if (g4() == null || !f0.g("1", str)) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        aVarG4.l("action_favour", true);
    }
}
