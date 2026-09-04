package com.max.xiaoheihe.module.story.comment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.z;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.n30;
import dl.e;
import java.util.HashMap;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;

/* JADX INFO: compiled from: StoryPostCommentFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryPostCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryPostCommentFragment.kt\ncom/max/xiaoheihe/module/story/comment/StoryPostCommentFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n262#2,2:312\n1#3:314\n*S KotlinDebug\n*F\n+ 1 StoryPostCommentFragment.kt\ncom/max/xiaoheihe/module/story/comment/StoryPostCommentFragment\n*L\n52#1:312,2\n*E\n"})
@SuppressLint({"AutoDispose"})
@o(parameters = 0)
public final class StoryPostCommentFragment extends PostCommentFragment {
    public static final int G2 = 30;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    public static final a f91985x2 = new a(null);

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f91986y2 = 8;

    @dl.d
    private final com.max.hbstory.d Y;
    private final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final boolean f91987a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.story.comment.a f91988b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @e
    private final kf.a f91989c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @e
    private io.reactivex.disposables.a f91990p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private n30 f91991p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f91992x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @e
    private ConceptLinkContentRender f91993y1;

    /* JADX INFO: compiled from: StoryPostCommentFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: StoryPostCommentFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43682, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (StoryPostCommentFragment.this.isActive()) {
                super.onError(e10);
                StoryPostCommentFragment.this.A4(null);
            }
        }

        public void onNext(@dl.d Result<BBSLinkTreeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43683, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (StoryPostCommentFragment.this.isActive()) {
                super.onNext(result);
                StoryPostCommentFragment.this.A4(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43684, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: StoryPostCommentFragment.kt */
    public static final class c implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public final void a(View v10, int i10, int i11, int i12) {
            g gVarD;
            g gVarD2;
            Object[] objArr = {v10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43685, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            StoryPostCommentFragment storyPostCommentFragment = StoryPostCommentFragment.this;
            f0.o(v10, "v");
            storyPostCommentFragment.u6(v10, i10, i11, i12, StoryPostCommentFragment.this.q7());
            StoryPostCommentFragment.this.u7(i12);
            if (i12 == 1 && i10 != 0 && (gVarD2 = StoryPostCommentFragment.this.Y.d()) != null) {
                gVarD2.p0(false);
            }
            if (i10 != 0 || (gVarD = StoryPostCommentFragment.this.Y.d()) == null) {
                return;
            }
            gVarD.p0(true);
        }
    }

    /* JADX INFO: compiled from: StoryPostCommentFragment.kt */
    public static final class d implements ConceptLinkContentRender.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43687, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryPostCommentFragment.this.C4();
        }

        @Override // com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender.b
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43688, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryPostCommentFragment.this.B4();
        }

        @Override // com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender.b
        public void c() {
        }

        @Override // com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender.b
        public void d() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43686, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryPostCommentFragment.this.z4();
        }
    }

    public StoryPostCommentFragment(@dl.d com.max.hbstory.d storyContext, int i10, boolean z10, @dl.d com.max.xiaoheihe.module.story.comment.a fakeEditorInteract, @e kf.a aVar) {
        f0.p(storyContext, "storyContext");
        f0.p(fakeEditorInteract, "fakeEditorInteract");
        this.Y = storyContext;
        this.Z = i10;
        this.f91987a0 = z10;
        this.f91988b0 = fakeEditorInteract;
        this.f91989c0 = aVar;
        this.f91992x1 = -1;
        r7();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        io.reactivex.disposables.a aVar2 = this.f91990p1;
        if (aVar2 != null) {
            aVar2.c((io.reactivex.disposables.b) i.a().s(o7(), p7(), "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, "1", null, "0", "0", null, s0.z()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<BBSLinkTreeObj>>() { // from class: com.max.xiaoheihe.module.story.comment.StoryPostCommentFragment.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public void onError(@dl.d Throwable e10) {
                    if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43675, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(e10, "e");
                    if (StoryPostCommentFragment.this.isActive()) {
                        super.onError(e10);
                        StoryPostCommentFragment.this.A4(null);
                    }
                }

                public void onNext(@dl.d Result<BBSLinkTreeObj> result) {
                    if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43676, new Class[]{Result.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(result, "result");
                    if (StoryPostCommentFragment.this.isActive()) {
                        super.onNext(result);
                        k.f(z.a(StoryPostCommentFragment.this), null, null, new StoryPostCommentFragment$1$onNext$1(jCurrentTimeMillis, StoryPostCommentFragment.this, result, null), 3, null);
                    }
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43677, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    onNext((Result<BBSLinkTreeObj>) obj);
                }
            }));
        }
    }

    public /* synthetic */ StoryPostCommentFragment(com.max.hbstory.d dVar, int i10, boolean z10, com.max.xiaoheihe.module.story.comment.a aVar, kf.a aVar2, int i11, u uVar) {
        this(dVar, i10, (i11 & 4) != 0 ? false : z10, aVar, (i11 & 16) != 0 ? null : aVar2);
    }

    public static final /* synthetic */ void m7(StoryPostCommentFragment storyPostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{storyPostCommentFragment}, null, changeQuickRedirect, true, 43673, new Class[]{StoryPostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        storyPostCommentFragment.s7();
    }

    public static final /* synthetic */ void n7(StoryPostCommentFragment storyPostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{storyPostCommentFragment}, null, changeQuickRedirect, true, 43674, new Class[]{StoryPostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        storyPostCommentFragment.t7();
    }

    private final String o7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43656, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObjM = StoryUtilsKt.m(this.Y, this.Z);
        if (storyItemsObjM != null) {
            return storyItemsObjM.getH_src();
        }
        return null;
    }

    private final String p7() {
        StoryCardIdInfoObj card_id_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43657, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObjM = StoryUtilsKt.m(this.Y, this.Z);
        if (storyItemsObjM == null || (card_id_info = storyItemsObjM.getCard_id_info()) == null) {
            return null;
        }
        return card_id_info.getItem_id();
    }

    private final void r7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43666, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91990p1 = new io.reactivex.disposables.a();
    }

    private final void s7() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43658, new Class[0], Void.TYPE).isSupported && this.f91987a0) {
            n30 n30VarD = n30.d(this.mInflater, E5().f112942c, false);
            f0.o(n30VarD, "inflate(\n               …      false\n            )");
            this.f91991p2 = n30VarD;
            ConsecutiveScrollerLayout consecutiveScrollerLayout = E5().f112942c;
            n30 n30Var = this.f91991p2;
            n30 n30Var2 = null;
            if (n30Var == null) {
                f0.S("linkInfoBinding");
                n30Var = null;
            }
            consecutiveScrollerLayout.addView(n30Var.b(), 0, new ConsecutiveScrollerLayout.LayoutParams(-1, -2));
            E5().f112953n.i0(false);
            io.reactivex.disposables.a aVar = this.f91990p1;
            f0.m(aVar);
            Activity activity = this.mContext;
            f0.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            n30 n30Var3 = this.f91991p2;
            if (n30Var3 == null) {
                f0.S("linkInfoBinding");
            } else {
                n30Var2 = n30Var3;
            }
            NestedScrollView nestedScrollViewB = n30Var2.b();
            f0.o(nestedScrollViewB, "linkInfoBinding.root");
            this.f91993y1 = new ConceptLinkContentRender(aVar, appCompatActivity, nestedScrollViewB, false);
            v7();
        }
    }

    private final void t7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43659, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v7();
        n5();
        l5();
        h5();
        j5();
        kf.a aVarG4 = g4();
        if (aVarG4 != null) {
            aVarG4.p1();
        }
    }

    private final void v7() {
        LinkInfoObj linkInfoObjD4;
        ConceptLinkContentRender conceptLinkContentRender;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43665, new Class[0], Void.TYPE).isSupported || (linkInfoObjD4 = d4()) == null || (conceptLinkContentRender = this.f91993y1) == null) {
            return;
        }
        conceptLinkContentRender.Q(new d());
        conceptLinkContentRender.W(linkInfoObjD4, null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void A4(@e Result<BBSLinkTreeObj> result) {
        BBSLinkTreeObj result2;
        String post_comment_tips;
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43672, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        super.A4(result);
        if (result == null || (result2 = result.getResult()) == null || (post_comment_tips = result2.getPost_comment_tips()) == null) {
            return;
        }
        if (!(true ^ kotlin.text.u.V1(post_comment_tips))) {
            post_comment_tips = null;
        }
        if (post_comment_tips != null) {
            this.f91988b0.b(post_comment_tips);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void Z3(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43667, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        if (f0.g("1", str)) {
            map.put("reload", "1");
        }
        addDisposable((io.reactivex.disposables.b) i.a().s(o7(), p7(), String.valueOf(h4()), BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, "0", n1(), "0", "0", null, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void installViews(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43655, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        View root = E5().f112961v.getRoot();
        f0.o(root, "binding.vDivTop.root");
        root.setVisibility(this.f91987a0 ? 0 : 8);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void j5() {
        LinkInfoObj linkInfoObjD4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43660, new Class[0], Void.TYPE).isSupported || (linkInfoObjD4 = d4()) == null) {
            return;
        }
        k5(linkInfoObjD4.getFollow_status());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void k5(@e String str) {
        BBSUserInfoObj user;
        String userid;
        g gVarD;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43661, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ConceptLinkContentRender conceptLinkContentRender = this.f91993y1;
        if (conceptLinkContentRender != null) {
            conceptLinkContentRender.G(str);
        }
        LinkInfoObj linkInfoObjD4 = d4();
        BBSUserInfoObj user2 = linkInfoObjD4 != null ? linkInfoObjD4.getUser() : null;
        if (user2 == null) {
            return;
        }
        kf.a aVarG4 = g4();
        if (aVarG4 != null) {
            aVarG4.r1(user2, str);
        }
        LinkInfoObj linkInfoObjD5 = d4();
        if (linkInfoObjD5 == null || (user = linkInfoObjD5.getUser()) == null || (userid = user.getUserid()) == null || (gVarD = this.Y.d()) == null) {
            return;
        }
        if (!f0.g(str, "1") && !f0.g(str, "3")) {
            z10 = false;
        }
        gVarD.a0(new g.b(z10, userid));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43669, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.b5(context);
        b5(context);
        M4(this.f91989c0);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43670, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        q6();
        io.reactivex.disposables.a aVar = this.f91990p1;
        if (aVar != null) {
            aVar.dispose();
        }
        io.reactivex.disposables.a aVar2 = this.f91990p1;
        if (aVar2 != null) {
            aVar2.f();
        }
        this.f91990p1 = null;
        super.onDestroy();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d
    public void onFragmentHide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43663, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentHide();
        if (this.f91987a0) {
            r6();
        } else {
            n6();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43662, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        if (this.f91987a0) {
            s6();
        } else {
            o6();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 43668, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        E5().f112953n.i0(false);
        E5().f112942c.setOnVerticalScrollChangeListener(new c());
    }

    public final int q7() {
        return this.f91992x1;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43664, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ConceptLinkContentRender conceptLinkContentRender = this.f91993y1;
        if (conceptLinkContentRender != null) {
            conceptLinkContentRender.C();
        }
        super.s6();
    }

    public final void u7(int i10) {
        this.f91992x1 = i10;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public void w6(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43671, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (kotlin.text.u.L1("comment", str, true)) {
            this.f91988b0.a(Z5());
        } else if (kotlin.text.u.L1("share", str, true)) {
            super.w6(str);
        }
    }
}
