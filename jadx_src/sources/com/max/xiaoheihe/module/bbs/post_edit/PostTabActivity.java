package com.max.xiaoheihe.module.bbs.post_edit;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.g3;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.b1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.PostModuleListObj;
import com.max.xiaoheihe.module.bbs.post_edit.post_setting.ActivityPostSettingViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.s1;
import df.tg0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: PostTabActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nPostTabActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,774:1\n75#2,13:775\n1#3:788\n95#4,14:789\n215#5,2:803\n*S KotlinDebug\n*F\n+ 1 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity\n*L\n93#1:775,13\n593#1:789,14\n697#1:803,2\n*E\n"})
@ig.d(path = {lb.d.f131157f1})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PostTabActivity extends BaseActivity implements z0, com.max.hbexpression.q.a, com.max.hbexpression.q.b {

    @dl.d
    public static final String G2 = "can_edit_modify_post_plan";

    @dl.d
    public static final String G3 = "draft_restore_dialog";

    @dl.d
    public static final String J3 = "report_extra";

    @dl.d
    public static final String K3 = "list";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @dl.d
    public static final String f82575p3 = "source";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    public static final String f82576x2 = "PostTabActivity_current_post_type";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.d
    public static final String f82578y2 = "show_template_picker";
    public s1 L;

    @dl.e
    private tg0 M;

    @dl.e
    private PostType N;

    @dl.e
    private String O;

    @dl.e
    private String Q;

    @dl.e
    private com.max.hbcommon.base.adapter.w R;
    private boolean S;

    @dl.e
    private String T;

    @dl.d
    private final kotlin.z V;

    @dl.e
    private ActivityPostSettingViewModel W;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f82580b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f82581c0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean f82583x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    public static final a f82577y1 = new a(null);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f82574p2 = 8;

    @dl.e
    private Integer P = 0;

    @dl.d
    private final Map<PostType, Fragment> U = new HashMap();
    private boolean X = true;

    @dl.d
    private final List<PostToolsV2TabType> Y = CollectionsKt__CollectionsKt.P(PostToolsV2TabType.GALLERY, PostToolsV2TabType.GAME_SHOT, PostToolsV2TabType.TEMPLATE);

    @dl.d
    private final Map<PostToolsV2TabType, PostToolV2Fragment> Z = new HashMap();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private final kotlin.z f82579a0 = kotlin.b0.c(new yh.a<PostTabActivity$postToolsV2PageChangeCallback$2.a>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity$postToolsV2PageChangeCallback$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostTabActivity.kt */
        public static final class a extends ViewPager2.OnPageChangeCallback {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PostTabActivity f82611a;

            a(PostTabActivity postTabActivity) {
                this.f82611a = postTabActivity;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                PostToolsV2TabType postToolsV2TabType;
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 30642, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (postToolsV2TabType = (PostToolsV2TabType) CollectionsKt___CollectionsKt.R2(this.f82611a.Y, i10)) == null) {
                    return;
                }
                PostTabActivity.Y1(this.f82611a).F(postToolsV2TabType);
            }
        }

        {
            super(0);
        }

        @dl.d
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30640, new Class[0], a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(this.f82610b);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity$postToolsV2PageChangeCallback$2$a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30641, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.d
    private final kotlin.z f82582p1 = kotlin.b0.c(new yh.a<PostTabActivity$editFragmentPageChangeCallback$2.a>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity$editFragmentPageChangeCallback$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostTabActivity.kt */
        public static final class a extends ViewPager2.OnPageChangeCallback {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PostTabActivity f82592a;

            a(PostTabActivity postTabActivity) {
                this.f82592a = postTabActivity;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 30609, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                super.onPageSelected(i10);
                if (i10 == 1) {
                    PostTabActivity.Y1(this.f82592a).A(PostType.Article);
                } else if (i10 != 2) {
                    PostTabActivity.Y1(this.f82592a).A(PostType.Picture);
                } else {
                    PostTabActivity.Y1(this.f82592a).A(PostType.Video);
                }
            }
        }

        {
            super(0);
        }

        @dl.d
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30607, new Class[0], a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(this.f82591b);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity$editFragmentPageChangeCallback$2$a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30608, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.d Context context, @dl.d PostType type) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, type}, this, changeQuickRedirect, false, 30606, new Class[]{Context.class, PostType.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(type, "type");
            Intent intent = new Intent(context, (Class<?>) PostTabActivity.class);
            intent.putExtra(PostTabActivity.f82576x2, type);
            return intent;
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82584a;

        static {
            int[] iArr = new int[PostType.valuesCustom().length];
            try {
                iArr[PostType.Picture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostType.Article.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostType.Video.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f82584a = iArr;
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<PostModuleListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 30610, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (PostTabActivity.this.isActive()) {
                if (PostTabActivity.Y1(PostTabActivity.this).v(PostTabActivity.this.T)) {
                    PostTabActivity.Y1(PostTabActivity.this).I(new Pair<>(null, e10));
                } else {
                    PostTabActivity.Z1(PostTabActivity.this);
                    PostTabActivity.e2(PostTabActivity.this);
                }
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void onNext(@dl.d Result<PostModuleListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 30611, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (PostTabActivity.this.isActive()) {
                if (PostTabActivity.Y1(PostTabActivity.this).v(PostTabActivity.this.T)) {
                    PostTabActivity.Y1(PostTabActivity.this).I(new Pair<>(result, null));
                    return;
                }
                PostTabActivity postTabActivity = PostTabActivity.this;
                PostModuleListObj result2 = result.getResult();
                postTabActivity.Q = result2 != null ? result2.getDraft_num() : null;
                PostTabActivity.Z1(PostTabActivity.this);
                PostTabActivity.e2(PostTabActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30612, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PostModuleListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: Animator.kt */
    @kotlin.jvm.internal.t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n99#2:137\n594#3,2:138\n98#4:140\n97#5:141\n*E\n"})
    public static final class d implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 30615, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            yh.a<b2> aVar;
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 30614, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animator, "animator");
            WeakReference<yh.a<b2>> weakReferenceS = PostTabActivity.Y1(PostTabActivity.this).s();
            if (weakReferenceS == null || (aVar = weakReferenceS.get()) == null) {
                return;
            }
            aVar.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 30613, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 30616, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animator, "animator");
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<ViewGroup> f82587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PostTabActivity f82588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f82589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f82590e;

        e(WeakReference<ViewGroup> weakReference, PostTabActivity postTabActivity, float f10, int i10) {
            this.f82587b = weakReference;
            this.f82588c = postTabActivity;
            this.f82589d = f10;
            this.f82590e = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 30617, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(valueAnimator, "valueAnimator");
            ViewGroup viewGroup = this.f82587b.get();
            if (viewGroup != null && this.f82588c.isActive()) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
                float fFloatValue = f10 != null ? f10.floatValue() : this.f82589d;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (int) (this.f82590e * fFloatValue);
                viewGroup.setLayoutParams(marginLayoutParams);
                if (Math.abs(fFloatValue - this.f82589d) <= 0.01f) {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30618, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostTabActivity.Y1(PostTabActivity.this).F(PostToolsV2TabType.GALLERY);
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30619, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostTabActivity.Y1(PostTabActivity.this).F(PostToolsV2TabType.GAME_SHOT);
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30620, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostTabActivity.Y1(PostTabActivity.this).F(PostToolsV2TabType.TEMPLATE);
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPostTabActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity$initPostToolsStyleV2$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n1#2:775\n*E\n"})
    public static final class i extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
            super(PostTabActivity.this);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0054  */
        /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public boolean containsItem(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 30624, new Class[]{Long.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            for (Object obj : PostTabActivity.this.Y) {
                if (((long) ((PostToolsV2TabType) obj).ordinal()) == j10) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            obj = null;
            if (obj != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 30622, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            PostToolsV2TabType postToolsV2TabType = (PostToolsV2TabType) CollectionsKt___CollectionsKt.R2(PostTabActivity.this.Y, i10);
            PostToolV2Fragment postToolV2FragmentA = PostToolV2Fragment.f82643u.a(postToolsV2TabType);
            PostTabActivity.this.Z.put(postToolsV2TabType, postToolV2FragmentA);
            return postToolV2FragmentA;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30621, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : PostTabActivity.this.Y.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 30623, new Class[]{Integer.TYPE}, Long.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Long) patchProxyResultProxy.result).longValue();
            }
            PostToolsV2TabType postToolsV2TabType = (PostToolsV2TabType) CollectionsKt___CollectionsKt.R2(PostTabActivity.this.Y, i10);
            if (postToolsV2TabType != null) {
                return postToolsV2TabType.ordinal();
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class j implements androidx.lifecycle.j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30628, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30627, new Class[]{Boolean.class}, Void.TYPE).isSupported || bool == null || !bool.booleanValue()) {
                return;
            }
            androidx.activity.result.b bVarN1 = PostTabActivity.N1(PostTabActivity.this);
            com.max.xiaoheihe.module.bbs.post_edit.k kVar = bVarN1 instanceof com.max.xiaoheihe.module.bbs.post_edit.k ? (com.max.xiaoheihe.module.bbs.post_edit.k) bVarN1 : null;
            if (kVar != null) {
                kVar.D();
            }
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPostTabActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity$initViewModel$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,774:1\n260#2:775\n262#2,2:776\n260#2:778\n262#2,2:779\n*S KotlinDebug\n*F\n+ 1 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity$initViewModel$3\n*L\n357#1:775\n358#1:776,2\n371#1:778\n372#1:779,2\n*E\n"})
    public static final class k implements androidx.lifecycle.j0<PostType> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostTabActivity.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f82601a;

            static {
                int[] iArr = new int[PostType.valuesCustom().length];
                try {
                    iArr[PostType.Video.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f82601a = iArr;
            }
        }

        k() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(PostType postType) {
            if (PatchProxy.proxy(new Object[]{postType}, this, changeQuickRedirect, false, 30630, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(postType);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0072  */
        /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
        public final void b(PostType postType) {
            boolean z10;
            LinearLayout linearLayout;
            ConstraintLayout constraintLayoutB;
            ViewPager2 viewPager2;
            RecyclerView.Adapter adapter;
            ConstraintLayout constraintLayoutB2;
            ViewPager2 viewPager3;
            RecyclerView.Adapter adapter2;
            if (PatchProxy.proxy(new Object[]{postType}, this, changeQuickRedirect, false, 30629, new Class[]{PostType.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((postType == null ? -1 : a.f82601a[postType.ordinal()]) != 1) {
                List list = PostTabActivity.this.Y;
                PostToolsV2TabType postToolsV2TabType = PostToolsV2TabType.GAME_SHOT;
                if (!list.contains(postToolsV2TabType)) {
                    PostTabActivity.this.Y.add(1, postToolsV2TabType);
                    tg0 tg0Var = PostTabActivity.this.M;
                    if (tg0Var != null && (viewPager2 = tg0Var.f116004k) != null && (adapter = viewPager2.getAdapter()) != null) {
                        adapter.notifyItemInserted(1);
                    }
                }
                tg0 tg0Var2 = PostTabActivity.this.M;
                if (tg0Var2 != null && (constraintLayoutB = tg0Var2.b()) != null) {
                    z10 = constraintLayoutB.getVisibility() == 0;
                }
                if (z10) {
                    tg0 tg0Var3 = PostTabActivity.this.M;
                    linearLayout = tg0Var3 != null ? tg0Var3.f115996c : null;
                    if (linearLayout == null) {
                        return;
                    }
                    linearLayout.setVisibility(0);
                    return;
                }
                return;
            }
            List list2 = PostTabActivity.this.Y;
            PostToolsV2TabType postToolsV2TabType2 = PostToolsV2TabType.GAME_SHOT;
            if (list2.contains(postToolsV2TabType2)) {
                PostTabActivity.this.Y.remove(postToolsV2TabType2);
                tg0 tg0Var4 = PostTabActivity.this.M;
                if (tg0Var4 != null && (viewPager3 = tg0Var4.f116004k) != null && (adapter2 = viewPager3.getAdapter()) != null) {
                    adapter2.notifyItemRemoved(1);
                }
            }
            tg0 tg0Var5 = PostTabActivity.this.M;
            if (tg0Var5 != null && (constraintLayoutB2 = tg0Var5.b()) != null) {
                z10 = constraintLayoutB2.getVisibility() == 0;
            }
            if (z10) {
                tg0 tg0Var6 = PostTabActivity.this.M;
                linearLayout = tg0Var6 != null ? tg0Var6.f115996c : null;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                if (PostTabActivity.Y1(PostTabActivity.this).t().f() == postToolsV2TabType2) {
                    PostTabActivity.Y1(PostTabActivity.this).F(PostToolsV2TabType.GALLERY);
                }
            }
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPostTabActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity$initViewModel$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,774:1\n262#2,2:775\n262#2,2:777\n262#2,2:779\n262#2,2:781\n262#2,2:783\n262#2,2:785\n262#2,2:787\n262#2,2:789\n262#2,2:791\n*S KotlinDebug\n*F\n+ 1 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity$initViewModel$4\n*L\n381#1:775,2\n382#1:777,2\n383#1:779,2\n393#1:781,2\n394#1:783,2\n395#1:785,2\n405#1:787,2\n406#1:789,2\n407#1:791,2\n*E\n"})
    public static final class l implements androidx.lifecycle.j0<PostToolsV2TabType> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostTabActivity.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f82603a;

            static {
                int[] iArr = new int[PostToolsV2TabType.valuesCustom().length];
                try {
                    iArr[PostToolsV2TabType.GALLERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PostToolsV2TabType.GAME_SHOT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PostToolsV2TabType.TEMPLATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f82603a = iArr;
            }
        }

        l() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(PostToolsV2TabType postToolsV2TabType) {
            if (PatchProxy.proxy(new Object[]{postToolsV2TabType}, this, changeQuickRedirect, false, 30632, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(postToolsV2TabType);
        }

        public final void b(PostToolsV2TabType tabType) {
            if (PatchProxy.proxy(new Object[]{tabType}, this, changeQuickRedirect, false, 30631, new Class[]{PostToolsV2TabType.class}, Void.TYPE).isSupported) {
                return;
            }
            int i10 = tabType == null ? -1 : a.f82603a[tabType.ordinal()];
            if (i10 == 1) {
                tg0 tg0Var = PostTabActivity.this.M;
                if (tg0Var != null) {
                    PostTabActivity postTabActivity = PostTabActivity.this;
                    View vGalleryTabUnderline = tg0Var.f116001h;
                    kotlin.jvm.internal.f0.o(vGalleryTabUnderline, "vGalleryTabUnderline");
                    vGalleryTabUnderline.setVisibility(0);
                    View vGameShotTabUnderline = tg0Var.f116002i;
                    kotlin.jvm.internal.f0.o(vGameShotTabUnderline, "vGameShotTabUnderline");
                    vGameShotTabUnderline.setVisibility(8);
                    View vTemplateTabUnderline = tg0Var.f116003j;
                    kotlin.jvm.internal.f0.o(vTemplateTabUnderline, "vTemplateTabUnderline");
                    vTemplateTabUnderline.setVisibility(8);
                    TextView tvGalleryTab = tg0Var.f115998e;
                    kotlin.jvm.internal.f0.o(tvGalleryTab, "tvGalleryTab");
                    PostTabActivity.a2(postTabActivity, tvGalleryTab);
                    TextView tvGameShotTab = tg0Var.f115999f;
                    kotlin.jvm.internal.f0.o(tvGameShotTab, "tvGameShotTab");
                    PostTabActivity.b2(postTabActivity, tvGameShotTab);
                    TextView tvTemplateTab = tg0Var.f116000g;
                    kotlin.jvm.internal.f0.o(tvTemplateTab, "tvTemplateTab");
                    PostTabActivity.b2(postTabActivity, tvTemplateTab);
                }
                PostTabActivity postTabActivity2 = PostTabActivity.this;
                kotlin.jvm.internal.f0.o(tabType, "tabType");
                PostTabActivity.f2(postTabActivity2, tabType);
                return;
            }
            if (i10 == 2) {
                tg0 tg0Var2 = PostTabActivity.this.M;
                if (tg0Var2 != null) {
                    PostTabActivity postTabActivity3 = PostTabActivity.this;
                    View vGameShotTabUnderline2 = tg0Var2.f116002i;
                    kotlin.jvm.internal.f0.o(vGameShotTabUnderline2, "vGameShotTabUnderline");
                    vGameShotTabUnderline2.setVisibility(0);
                    View vGalleryTabUnderline2 = tg0Var2.f116001h;
                    kotlin.jvm.internal.f0.o(vGalleryTabUnderline2, "vGalleryTabUnderline");
                    vGalleryTabUnderline2.setVisibility(8);
                    View vTemplateTabUnderline2 = tg0Var2.f116003j;
                    kotlin.jvm.internal.f0.o(vTemplateTabUnderline2, "vTemplateTabUnderline");
                    vTemplateTabUnderline2.setVisibility(8);
                    TextView tvGameShotTab2 = tg0Var2.f115999f;
                    kotlin.jvm.internal.f0.o(tvGameShotTab2, "tvGameShotTab");
                    PostTabActivity.a2(postTabActivity3, tvGameShotTab2);
                    TextView tvGalleryTab2 = tg0Var2.f115998e;
                    kotlin.jvm.internal.f0.o(tvGalleryTab2, "tvGalleryTab");
                    PostTabActivity.b2(postTabActivity3, tvGalleryTab2);
                    TextView tvTemplateTab2 = tg0Var2.f116000g;
                    kotlin.jvm.internal.f0.o(tvTemplateTab2, "tvTemplateTab");
                    PostTabActivity.b2(postTabActivity3, tvTemplateTab2);
                }
                PostTabActivity postTabActivity4 = PostTabActivity.this;
                kotlin.jvm.internal.f0.o(tabType, "tabType");
                PostTabActivity.f2(postTabActivity4, tabType);
                return;
            }
            if (i10 != 3) {
                return;
            }
            tg0 tg0Var3 = PostTabActivity.this.M;
            if (tg0Var3 != null) {
                PostTabActivity postTabActivity5 = PostTabActivity.this;
                View vTemplateTabUnderline3 = tg0Var3.f116003j;
                kotlin.jvm.internal.f0.o(vTemplateTabUnderline3, "vTemplateTabUnderline");
                vTemplateTabUnderline3.setVisibility(0);
                View vGameShotTabUnderline3 = tg0Var3.f116002i;
                kotlin.jvm.internal.f0.o(vGameShotTabUnderline3, "vGameShotTabUnderline");
                vGameShotTabUnderline3.setVisibility(8);
                View vGalleryTabUnderline3 = tg0Var3.f116001h;
                kotlin.jvm.internal.f0.o(vGalleryTabUnderline3, "vGalleryTabUnderline");
                vGalleryTabUnderline3.setVisibility(8);
                TextView tvTemplateTab3 = tg0Var3.f116000g;
                kotlin.jvm.internal.f0.o(tvTemplateTab3, "tvTemplateTab");
                PostTabActivity.a2(postTabActivity5, tvTemplateTab3);
                TextView tvGalleryTab3 = tg0Var3.f115998e;
                kotlin.jvm.internal.f0.o(tvGalleryTab3, "tvGalleryTab");
                PostTabActivity.b2(postTabActivity5, tvGalleryTab3);
                TextView tvGameShotTab3 = tg0Var3.f115999f;
                kotlin.jvm.internal.f0.o(tvGameShotTab3, "tvGameShotTab");
                PostTabActivity.b2(postTabActivity5, tvGameShotTab3);
            }
            PostTabActivity postTabActivity6 = PostTabActivity.this;
            kotlin.jvm.internal.f0.o(tabType, "tabType");
            PostTabActivity.f2(postTabActivity6, tabType);
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    @kotlin.jvm.internal.t0({"SMAP\nPostTabActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTabActivity.kt\ncom/max/xiaoheihe/module/bbs/post_edit/PostTabActivity$initViewModel$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n1#2:775\n*E\n"})
    public static final class m implements androidx.lifecycle.j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30634, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            tg0 tg0Var;
            ConstraintLayout constraintLayoutB;
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 30633, new Class[]{Boolean.class}, Void.TYPE).isSupported || !kotlin.jvm.internal.f0.g(bool, Boolean.FALSE) || (tg0Var = PostTabActivity.this.M) == null || (constraintLayoutB = tg0Var.b()) == null) {
                return;
            }
            PostTabActivity.r2(PostTabActivity.this, constraintLayoutB, 160L, 0L, 4, null);
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class n implements androidx.lifecycle.j0<Pair<? extends Result<PostModuleListObj>, ? extends Throwable>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Pair<? extends Result<PostModuleListObj>, ? extends Throwable> pair) {
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30636, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(pair);
        }

        public final void b(Pair<? extends Result<PostModuleListObj>, ? extends Throwable> pair) {
            PostModuleListObj result;
            String draft_num;
            if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 30635, new Class[]{Pair.class}, Void.TYPE).isSupported) {
                return;
            }
            Result<PostModuleListObj> resultE = pair.e();
            if (resultE != null && (result = resultE.getResult()) != null && (draft_num = result.getDraft_num()) != null) {
                PostTabActivity.this.Q = draft_num;
            }
            PostTabActivity.Z1(PostTabActivity.this);
            PostTabActivity.e2(PostTabActivity.this);
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class o extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f82607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Bundle bundle) {
            super(PostTabActivity.this);
            this.f82607c = bundle;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            Bundle arguments;
            Fragment fragment;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 30637, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 1) {
                NewLinkEditFragment newLinkEditFragment = new NewLinkEditFragment();
                newLinkEditFragment.setArguments(PostTabActivity.this.h2(this.f82607c));
                if (!NewLinkEditFragment.L4.g(this.f82607c.getInt("page_type", -1))) {
                    Intent intent = PostTabActivity.this.getIntent();
                    if (!kotlin.jvm.internal.f0.g(PostTabActivity.G3, intent != null ? intent.getStringExtra("source") : null) && (arguments = newLinkEditFragment.getArguments()) != null) {
                        arguments.putSerializable("page_type", 0);
                    }
                }
                Bundle arguments2 = newLinkEditFragment.getArguments();
                if (arguments2 != null) {
                    arguments2.putBoolean(PictureVideoEditPostFragment.f82333b4, true);
                }
                if (PostTabActivity.this.S) {
                    newLinkEditFragment.D();
                }
                newLinkEditFragment.p8(PostTabActivity.this.Q);
                PostTabActivity.this.U.put(PostType.Article, newLinkEditFragment);
                fragment = newLinkEditFragment;
            } else if (i10 != 2) {
                PictureVideoEditPostFragment pictureVideoEditPostFragment = new PictureVideoEditPostFragment();
                pictureVideoEditPostFragment.setArguments(PostTabActivity.this.h2(this.f82607c));
                Bundle arguments3 = pictureVideoEditPostFragment.getArguments();
                if (arguments3 != null) {
                    arguments3.putSerializable(PictureVideoEditPostFragment.f82332a4, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE);
                }
                Bundle arguments4 = pictureVideoEditPostFragment.getArguments();
                if (arguments4 != null) {
                    arguments4.putBoolean(PictureVideoEditPostFragment.f82333b4, true);
                }
                if (PostTabActivity.this.S) {
                    pictureVideoEditPostFragment.D();
                }
                pictureVideoEditPostFragment.N8(PostTabActivity.this.Q);
                PostTabActivity.this.U.put(PostType.Picture, pictureVideoEditPostFragment);
                fragment = pictureVideoEditPostFragment;
            } else {
                PictureVideoEditPostFragment pictureVideoEditPostFragment2 = new PictureVideoEditPostFragment();
                pictureVideoEditPostFragment2.setArguments(PostTabActivity.this.h2(this.f82607c));
                Bundle arguments5 = pictureVideoEditPostFragment2.getArguments();
                if (arguments5 != null) {
                    arguments5.putSerializable(PictureVideoEditPostFragment.f82332a4, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO);
                }
                Bundle arguments6 = pictureVideoEditPostFragment2.getArguments();
                if (arguments6 != null) {
                    arguments6.putBoolean(PictureVideoEditPostFragment.f82333b4, true);
                }
                if (PostTabActivity.this.S) {
                    pictureVideoEditPostFragment2.D();
                }
                pictureVideoEditPostFragment2.N8(PostTabActivity.this.Q);
                PostTabActivity.this.U.put(PostType.Video, pictureVideoEditPostFragment2);
                fragment = pictureVideoEditPostFragment2;
            }
            return fragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 3;
        }
    }

    /* JADX INFO: compiled from: PostTabActivity.kt */
    public static final class p implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyBoxPopupMenu f82609b;

        p(HeyBoxPopupMenu heyBoxPopupMenu) {
            this.f82609b = heyBoxPopupMenu;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 30643, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            PostTabActivity.this.i2().f115379e.setCurrentItem(com.max.hbutils.utils.n.q(keyDescObj.getKey()), true);
            this.f82609b.dismiss();
        }
    }

    public PostTabActivity() {
        final yh.a aVar = null;
        this.V = new ViewModelLazy(kotlin.jvm.internal.n0.d(PostTabActivityViewModel.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30646, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.getViewModelStore();
                kotlin.jvm.internal.f0.o(viewModelStore, "viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30647, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<androidx.lifecycle.y0.b>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final androidx.lifecycle.y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30644, new Class[0], androidx.lifecycle.y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (androidx.lifecycle.y0.b) patchProxyResultProxy.result;
                }
                androidx.lifecycle.y0.b defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.f0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ androidx.lifecycle.y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30645, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30649, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30648, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.f0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    private final void A2(PostType postType, boolean z10) {
        int i10 = 2;
        if (PatchProxy.proxy(new Object[]{postType, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30586, new Class[]{PostType.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = postType == null ? -1 : b.f82584a[postType.ordinal()];
        if (i11 == 1) {
            i10 = 0;
        } else if (i11 == 2) {
            i10 = 1;
        } else if (i11 != 3) {
            i10 = 0;
        }
        i2().f115379e.setCurrentItem(i10, z10);
    }

    static /* synthetic */ void B2(PostTabActivity postTabActivity, PostType postType, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{postTabActivity, postType, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 30587, new Class[]{PostTabActivity.class, PostType.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        postTabActivity.A2(postType, z10);
    }

    private final void G2(PostToolsV2TabType postToolsV2TabType) {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        if (PatchProxy.proxy(new Object[]{postToolsV2TabType}, this, changeQuickRedirect, false, 30579, new Class[]{PostToolsV2TabType.class}, Void.TYPE).isSupported) {
            return;
        }
        Integer numValueOf = Integer.valueOf(this.Y.indexOf(postToolsV2TabType));
        if (!(numValueOf.intValue() >= 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (!this.X) {
                tg0 tg0Var = this.M;
                if (tg0Var == null || (viewPager2 = tg0Var.f116004k) == null) {
                    return;
                }
                viewPager2.setCurrentItem(iIntValue, true);
                return;
            }
            this.X = false;
            tg0 tg0Var2 = this.M;
            if (tg0Var2 == null || (viewPager3 = tg0Var2.f116004k) == null) {
                return;
            }
            viewPager3.setCurrentItem(iIntValue, false);
        }
    }

    public static final /* synthetic */ Fragment N1(PostTabActivity postTabActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postTabActivity}, null, changeQuickRedirect, true, 30600, new Class[]{PostTabActivity.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : postTabActivity.T();
    }

    private final Fragment T() {
        PostType postType;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30597, new Class[0], Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        int currentItem = i2().f115379e.getCurrentItem();
        if (currentItem != 1) {
            postType = currentItem != 2 ? PostType.Picture : PostType.Video;
        } else {
            postType = PostType.Article;
        }
        return this.U.get(postType);
    }

    public static final /* synthetic */ PostTabActivityViewModel Y1(PostTabActivity postTabActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postTabActivity}, null, changeQuickRedirect, true, 30599, new Class[]{PostTabActivity.class}, PostTabActivityViewModel.class);
        return patchProxyResultProxy.isSupported ? (PostTabActivityViewModel) patchProxyResultProxy.result : postTabActivity.o2();
    }

    public static final /* synthetic */ void Z1(PostTabActivity postTabActivity) {
        if (PatchProxy.proxy(new Object[]{postTabActivity}, null, changeQuickRedirect, true, 30604, new Class[]{PostTabActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        postTabActivity.v2();
    }

    public static final /* synthetic */ void a2(PostTabActivity postTabActivity, TextView textView) {
        if (PatchProxy.proxy(new Object[]{postTabActivity, textView}, null, changeQuickRedirect, true, 30602, new Class[]{PostTabActivity.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        postTabActivity.y2(textView);
    }

    public static final /* synthetic */ void b2(PostTabActivity postTabActivity, TextView textView) {
        if (PatchProxy.proxy(new Object[]{postTabActivity, textView}, null, changeQuickRedirect, true, 30603, new Class[]{PostTabActivity.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        postTabActivity.z2(textView);
    }

    public static final /* synthetic */ void e2(PostTabActivity postTabActivity) {
        if (PatchProxy.proxy(new Object[]{postTabActivity}, null, changeQuickRedirect, true, 30605, new Class[]{PostTabActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        postTabActivity.x1();
    }

    public static final /* synthetic */ void f2(PostTabActivity postTabActivity, PostToolsV2TabType postToolsV2TabType) {
        if (PatchProxy.proxy(new Object[]{postTabActivity, postToolsV2TabType}, null, changeQuickRedirect, true, 30601, new Class[]{PostTabActivity.class, PostToolsV2TabType.class}, Void.TYPE).isSupported) {
            return;
        }
        postTabActivity.G2(postToolsV2TabType);
    }

    private final void initViewModel() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30576, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o2().J(new yh.a<Boolean>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity.initViewModel.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Boolean a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30625, new Class[0], Boolean.class);
                return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(PostTabActivity.this.f82583x1);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Boolean invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30626, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        o2().k().k(this, new j());
        o2().h().k(this, new k());
        o2().t().k(this, new l());
        o2().u().k(this, new m());
        o2().i().k(this, new n());
    }

    private final void initViews() {
        Integer num;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30573, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (getIntent() != null) {
            this.N = (PostType) getIntent().getSerializableExtra(f82576x2);
            this.O = getIntent().getStringExtra("h_src");
            this.P = Integer.valueOf(getIntent().getIntExtra(f82578y2, 0));
            this.T = getIntent().getStringExtra("source");
        }
        PostType postType = this.N;
        this.S = postType != null;
        if (postType == null || ((num = this.P) != null && num.intValue() == 1)) {
            this.N = PostType.Picture;
            if (o2().v(this.T)) {
                View viewInflate = i2().f115378d.inflate();
                if (viewInflate != null) {
                    this.M = tg0.a(viewInflate);
                }
                u2();
                PostTabActivityViewModel postTabActivityViewModelO2 = o2();
                Integer num2 = this.P;
                postTabActivityViewModelO2.F((num2 != null && num2.intValue() == 1) ? PostToolsV2TabType.TEMPLATE : PostToolsV2TabType.GALLERY);
            } else {
                E1();
                l2("0", 0);
            }
        } else {
            if (o2().v(this.T)) {
                View viewInflate2 = i2().f115378d.inflate();
                if (viewInflate2 != null) {
                    this.M = tg0.a(viewInflate2);
                }
                u2();
                o2().F(PostToolsV2TabType.GALLERY);
            } else {
                v2();
            }
            p2();
        }
        bf.c cVar = new bf.c(n3.m.i(), n3.m.d(), new yh.a<Boolean>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity$initViews$deferringInsetsListener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.e
            public final Boolean a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30638, new Class[0], Boolean.class);
                return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : PostTabActivity.Y1(this.f82598b).x().f();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Boolean invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30639, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        j1.y2(W0(), cVar);
        j1.a2(W0(), cVar);
        ViewPager2 viewPager2 = i2().f115379e;
        ViewPager2 viewPager3 = i2().f115379e;
        kotlin.jvm.internal.f0.o(viewPager3, "binding.vp");
        j1.y2(viewPager2, new bf.e(viewPager3, n3.m.i(), n3.m.d(), 1));
    }

    private final ViewPager2.OnPageChangeCallback k2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30570, new Class[0], ViewPager2.OnPageChangeCallback.class);
        return patchProxyResultProxy.isSupported ? (ViewPager2.OnPageChangeCallback) patchProxyResultProxy.result : (ViewPager2.OnPageChangeCallback) this.f82582p1.getValue();
    }

    @SuppressLint({"AutoDispose"})
    private final void l2(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 30581, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().I3(str, this.O, i10).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new c());
    }

    private final ViewPager2.OnPageChangeCallback m2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30569, new Class[0], ViewPager2.OnPageChangeCallback.class);
        return patchProxyResultProxy.isSupported ? (ViewPager2.OnPageChangeCallback) patchProxyResultProxy.result : (ViewPager2.OnPageChangeCallback) this.f82579a0.getValue();
    }

    private final PostTabActivityViewModel o2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30568, new Class[0], PostTabActivityViewModel.class);
        return patchProxyResultProxy.isSupported ? (PostTabActivityViewModel) patchProxyResultProxy.result : (PostTabActivityViewModel) this.V.getValue();
    }

    private final void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30596, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<Map.Entry<PostType, Fragment>> it = this.U.entrySet().iterator();
        while (it.hasNext()) {
            androidx.activity.result.b bVar = (Fragment) it.next().getValue();
            if (bVar instanceof com.max.xiaoheihe.module.bbs.post_edit.k) {
                ((com.max.xiaoheihe.module.bbs.post_edit.k) bVar).D();
            }
        }
    }

    private final void q2(ViewGroup viewGroup, long j10, long j11) {
        Object[] objArr = {viewGroup, new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30588, new Class[]{ViewGroup.class, cls, cls}, Void.TYPE).isSupported || viewGroup.getVisibility() == 8) {
            return;
        }
        int measuredHeight = viewGroup.getMeasuredHeight();
        WeakReference weakReference = new WeakReference(viewGroup);
        ValueAnimator animator = ValueAnimator.ofFloat(0.0f, -1.0f);
        animator.addUpdateListener(new e(weakReference, this, -1.0f, measuredHeight));
        kotlin.jvm.internal.f0.o(animator, "animator");
        animator.addListener(new d());
        animator.setStartDelay(j11);
        animator.setDuration(j10);
        animator.start();
    }

    static /* synthetic */ void r2(PostTabActivity postTabActivity, ViewGroup viewGroup, long j10, long j11, int i10, Object obj) {
        long j12 = j10;
        long j13 = j11;
        Object[] objArr = {postTabActivity, viewGroup, new Long(j12), new Long(j13), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 30589, new Class[]{PostTabActivity.class, ViewGroup.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            j12 = 300;
        }
        if ((i10 & 4) != 0) {
            j13 = 0;
        }
        postTabActivity.q2(viewGroup, j12, j13);
    }

    private final void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30575, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        tg0 tg0Var = this.M;
        if (tg0Var == null) {
            com.max.heybox.hblog.g.f74531b.v("[PostTabActivity][initPostToolsStyleV2] null postToolsV2Binding");
            return;
        }
        tg0Var.f115995b.setOnClickListener(new f());
        tg0Var.f115996c.setOnClickListener(new g());
        tg0Var.f115997d.setOnClickListener(new h());
        tg0Var.f116004k.setAdapter(new i());
        tg0Var.f116004k.registerOnPageChangeCallback(m2());
        E1();
        l2("0", 1);
    }

    private final void v2() {
        Bundle bundle;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30574, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (bundle = intent.getExtras()) == null) {
            bundle = new Bundle();
        }
        i2().f115379e.setAdapter(new o(bundle));
        i2().f115379e.registerOnPageChangeCallback(k2());
        i2().f115379e.setUserInputEnabled(false);
        RecyclerView.Adapter adapter = i2().f115379e.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        A2(this.N, false);
    }

    @dl.d
    @xh.m
    public static final Intent x2(@dl.d Context context, @dl.d PostType postType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, postType}, null, changeQuickRedirect, true, 30598, new Class[]{Context.class, PostType.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : f82577y1.a(context, postType);
    }

    private final void y2(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 30577, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.setTextColor(this.f66601b.getColor(R.color.text_primary_1_color));
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
    }

    private final void z2(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 30578, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.setTextColor(this.f66601b.getColor(R.color.text_primary_2_color));
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
    }

    public final void C2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30580, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey("0");
        keyDescObj.setDesc(getString(R.string.post_picture));
        keyDescObj.setChecked(i2().f115379e.getCurrentItem() == 0);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("1");
        keyDescObj2.setDesc(getString(R.string.post_article));
        keyDescObj2.setChecked(1 == i2().f115379e.getCurrentItem());
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setKey("2");
        keyDescObj3.setDesc(getString(R.string.post_video));
        keyDescObj3.setChecked(2 == i2().f115379e.getCurrentItem());
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.f66601b, arrayList, true);
        heyBoxPopupMenu.R(new p(heyBoxPopupMenu));
        heyBoxPopupMenu.show();
    }

    public final void D2(@dl.d s1 s1Var) {
        if (PatchProxy.proxy(new Object[]{s1Var}, this, changeQuickRedirect, false, 30567, new Class[]{s1.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(s1Var, "<set-?>");
        this.L = s1Var;
    }

    public final void E2(@dl.e PostType postType) {
        this.N = postType;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.z0
    public void a0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30591, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@dl.e MotionEvent motionEvent) {
        ViewPager2 viewPager2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 30590, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.f82580b0 = (int) motionEvent.getX();
            this.f82581c0 = (int) motionEvent.getY();
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            if (Math.abs(((int) motionEvent.getX()) - this.f82580b0) < Math.abs(((int) motionEvent.getY()) - this.f82581c0)) {
                tg0 tg0Var = this.M;
                viewPager2 = tg0Var != null ? tg0Var.f116004k : null;
                if (viewPager2 != null) {
                    viewPager2.setUserInputEnabled(false);
                }
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            this.f82580b0 = 0;
            this.f82581c0 = 0;
            tg0 tg0Var2 = this.M;
            viewPager2 = tg0Var2 != null ? tg0Var2.f116004k : null;
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        } else if (numValueOf != null) {
            numValueOf.intValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30594, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.b bVarT = T();
        if (bVarT instanceof com.max.hbexpression.q.b) {
            ((com.max.hbexpression.q.b) bVarT).expressionDeleteClick(view);
        }
    }

    @dl.d
    public final Bundle h2(@dl.d Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 30595, new Class[]{Bundle.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(bundle, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            Bundle bundleDeepCopy = bundle.deepCopy();
            kotlin.jvm.internal.f0.o(bundleDeepCopy, "{\n            this.deepCopy()\n        }");
            return bundleDeepCopy;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        return bundle2;
    }

    @dl.d
    public final s1 i2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30566, new Class[0], s1.class);
        if (patchProxyResultProxy.isSupported) {
            return (s1) patchProxyResultProxy.result;
        }
        s1 s1Var = this.L;
        if (s1Var != null) {
            return s1Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.e
    public final PostType j2() {
        return this.N;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30572, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        getWindow().setNavigationBarColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color));
        s1 s1VarC = s1.c(this.f66602c);
        kotlin.jvm.internal.f0.o(s1VarC, "inflate(mInflater)");
        D2(s1VarC);
        setContentView(i2().b());
        initViews();
        initViewModel();
    }

    @dl.e
    public final String n2() {
        return this.O;
    }

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 30593, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.b bVarT = T();
        if (bVarT instanceof com.max.hbexpression.q.a) {
            ((com.max.hbexpression.q.a) bVarT).o0(expressionObj);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30592, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentT = T();
        if (i10 != 69) {
            if (i10 != 2001) {
                if (i10 == 1001) {
                    Intent intent2 = i11 == -1 ? intent : null;
                    if (fragmentT instanceof NewLinkEditFragment) {
                        ((NewLinkEditFragment) fragmentT).S6(intent2);
                    } else if (fragmentT instanceof PictureVideoEditPostFragment) {
                        ((PictureVideoEditPostFragment) fragmentT).T6(intent2);
                    }
                } else if (i10 == 1002 && i11 == -1 && (fragmentT instanceof NewLinkEditFragment)) {
                    ((NewLinkEditFragment) fragmentT).E6(intent);
                }
            } else if (i11 == -1 && (fragmentT instanceof PictureVideoEditPostFragment)) {
                ((PictureVideoEditPostFragment) fragmentT).i7();
            }
        } else if (i11 == -1 && !(fragmentT instanceof NewLinkEditFragment) && (fragmentT instanceof PictureVideoEditPostFragment)) {
            ((PictureVideoEditPostFragment) fragmentT).R6(intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30584, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentT = T();
        if (fragmentT instanceof NewLinkEditFragment) {
            ((NewLinkEditFragment) fragmentT).onBackPressed();
        } else if (fragmentT instanceof PictureVideoEditPostFragment) {
            ((PictureVideoEditPostFragment) fragmentT).onBackPressed();
        } else {
            a0();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 30571, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        g3.c(getWindow(), false);
        if (ad.a.a(ad.a.I, false)) {
            return;
        }
        this.W = (ActivityPostSettingViewModel) new androidx.lifecycle.y0(this).a(ActivityPostSettingViewModel.class);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ViewPager2 viewPager2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30585, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        tg0 tg0Var = this.M;
        if (tg0Var != null && (viewPager2 = tg0Var.f116004k) != null) {
            viewPager2.unregisterOnPageChangeCallback(m2());
        }
        i2().f115379e.unregisterOnPageChangeCallback(k2());
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30582, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        this.f82583x1 = true;
        o2().y(this);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30583, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        this.f82583x1 = false;
    }
}
