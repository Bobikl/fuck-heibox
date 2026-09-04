package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.core.widget.NestedScrollView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.gson.JsonObject;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity;
import com.max.xiaoheihe.utils.DeviceServiceUtil;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import df.n30;
import dl.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PostPictureFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostPictureFragment extends PostCommentFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    public static final String f81915p2 = "is_concept";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    public static final String f81917x2 = "linkPostInfo";

    @dl.e
    private ConceptLinkContentRender Y;
    private n30 Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f81920b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private List<String> f81921c0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    public static final a f81916x1 = new a(null);

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f81918y1 = 8;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f81919a0 = true;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f81922p1 = -1;

    /* JADX INFO: compiled from: PostPictureFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ PostPictureFragment b(a aVar, boolean z10, LinkInfoObj linkInfoObj, String str, LinkInfoObj linkInfoObj2, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), linkInfoObj, str, linkInfoObj2, new Integer(i10), obj}, null, changeQuickRedirect, true, 29309, new Class[]{a.class, Boolean.TYPE, LinkInfoObj.class, String.class, LinkInfoObj.class, Integer.TYPE, Object.class}, PostPictureFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostPictureFragment) patchProxyResultProxy.result;
            }
            return aVar.a((i10 & 1) == 0 ? z10 ? 1 : 0 : false, (i10 & 2) != 0 ? null : linkInfoObj, (i10 & 4) != 0 ? null : str, (i10 & 8) == 0 ? linkInfoObj2 : null);
        }

        @dl.d
        public final PostPictureFragment a(boolean z10, @dl.e LinkInfoObj linkInfoObj, @dl.e String str, @dl.e LinkInfoObj linkInfoObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), linkInfoObj, str, linkInfoObj2}, this, changeQuickRedirect, false, 29308, new Class[]{Boolean.TYPE, LinkInfoObj.class, String.class, LinkInfoObj.class}, PostPictureFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostPictureFragment) patchProxyResultProxy.result;
            }
            PostPictureFragment postPictureFragment = new PostPictureFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(PostPictureFragment.f81915p2, z10);
            bundle.putSerializable(PostPageFactory.f81482r, linkInfoObj);
            bundle.putSerializable(PostPictureFragment.f81917x2, linkInfoObj2);
            bundle.putString(PostPageFactory.f81471g, str);
            postPictureFragment.setArguments(bundle);
            return postPictureFragment;
        }
    }

    /* JADX INFO: compiled from: PostPictureFragment.kt */
    public static final class b implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public final void a(View v10, int i10, int i11, int i12) {
            Object[] objArr = {v10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29310, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            PostPictureFragment postPictureFragment = PostPictureFragment.this;
            f0.o(v10, "v");
            postPictureFragment.u6(v10, i10, i11, i12, PostPictureFragment.this.f81922p1);
            PostPictureFragment.this.f81922p1 = i12;
            PostPictureFragment.l7(PostPictureFragment.this);
            if (ad.a.b(ad.a.f1199f, false, 2, null)) {
                n30 n30Var = PostPictureFragment.this.Z;
                if (n30Var == null) {
                    f0.S("linkInfoBinding");
                    n30Var = null;
                }
                int iV = ViewUtils.V(n30Var.f113650m);
                Activity mContext = ((com.max.hbcommon.base.d) PostPictureFragment.this).mContext;
                f0.o(mContext, "mContext");
                int iC = l.c(52.0f, mContext);
                if (iV > 0) {
                    Activity activity = ((com.max.hbcommon.base.d) PostPictureFragment.this).mContext;
                    BasePostPageActivity basePostPageActivity = activity instanceof BasePostPageActivity ? (BasePostPageActivity) activity : null;
                    if (basePostPageActivity != null) {
                        basePostPageActivity.e5((i10 - iV) / iC);
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: PostPictureFragment.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29311, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostPictureFragment.l7(PostPictureFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostPictureFragment.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f81926c;

        d(boolean z10) {
            this.f81926c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29314, new Class[0], Void.TYPE).isSupported || PostPictureFragment.this.a6() == null || this.f81926c) {
                return;
            }
            PostPictureFragment postPictureFragment = PostPictureFragment.this;
            PostCommentFragment.E6(postPictureFragment, postPictureFragment.a6(), false, 2, null);
            PostPictureFragment.this.Z6(null);
        }
    }

    /* JADX INFO: compiled from: PostPictureFragment.kt */
    public static final class e implements ConceptLinkContentRender.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29316, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostPictureFragment.this.C4();
        }

        @Override // com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender.b
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29317, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostPictureFragment.this.B4();
        }

        @Override // com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender.b
        public void c() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29318, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostPictureFragment.p7(PostPictureFragment.this);
        }

        @Override // com.max.xiaoheihe.module.bbs.concept.ConceptLinkContentRender.b
        public void d() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29315, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostPictureFragment.this.z4();
        }
    }

    public static final /* synthetic */ void l7(PostPictureFragment postPictureFragment) {
        if (PatchProxy.proxy(new Object[]{postPictureFragment}, null, changeQuickRedirect, true, 29306, new Class[]{PostPictureFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postPictureFragment.r7();
    }

    public static final /* synthetic */ void p7(PostPictureFragment postPictureFragment) {
        if (PatchProxy.proxy(new Object[]{postPictureFragment}, null, changeQuickRedirect, true, 29307, new Class[]{PostPictureFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postPictureFragment.t7();
    }

    private final void r7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29302, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (s7()) {
            N6(false);
            s6();
        } else {
            N6(true);
            r6();
        }
        if (j6()) {
            K6(false);
            o6();
        } else {
            K6(true);
            n6();
        }
    }

    private final boolean s7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29281, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        n30 n30Var = this.Z;
        if (n30Var == null) {
            f0.S("linkInfoBinding");
            n30Var = null;
        }
        return ViewUtils.f0(n30Var.b());
    }

    private final void t7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29287, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u7(true);
    }

    private final void u7(boolean z10) {
        String strH3;
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29289, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && i0.e(this.mContext)) {
            LinkInfoObj linkInfoObjD4 = d4();
            if (linkInfoObjD4 == null) {
                g.f74531b.v("[performUpvote] mLinkInfoObj should not be null!");
                return;
            }
            String str = "1";
            if (f0.g("1", linkInfoObjD4.getIs_award_link())) {
                if (z10) {
                    return;
                } else {
                    str = "0";
                }
            }
            if (z10) {
                DeviceServiceUtil.f95244a.b(50L);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("id", linkInfoObjD4.getLinkid());
                jsonObject.addProperty("idx", linkInfoObjD4.getIndex());
                jsonObject.addProperty("h_src", b4());
                ArrayList<BBSTopicObj> topics = linkInfoObjD4.getTopics();
                if (topics != null) {
                    f0.o(topics, "topics");
                    strH3 = CollectionsKt___CollectionsKt.h3(topics, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<BBSTopicObj, CharSequence>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostPictureFragment$performUpvote$addition$1$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @d
                        public final CharSequence a(BBSTopicObj bBSTopicObj) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 29312, new Class[]{BBSTopicObj.class}, CharSequence.class);
                            if (patchProxyResultProxy.isSupported) {
                                return (CharSequence) patchProxyResultProxy.result;
                            }
                            String topic_id = bBSTopicObj.getTopic_id();
                            f0.o(topic_id, "it.topic_id");
                            return topic_id;
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ CharSequence invoke(BBSTopicObj bBSTopicObj) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 29313, new Class[]{Object.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bBSTopicObj);
                        }
                    }, 30, null);
                } else {
                    strH3 = null;
                }
                jsonObject.addProperty("topic_id", strH3);
                com.max.hbcommon.analytics.d.d("4", lb.d.f131170h0, null, jsonObject);
            }
            o5(str);
            m5(str);
            Q3(linkInfoObjD4.getLinkid(), str);
            T3("syncWeb('award')");
        }
    }

    private final void v7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29304, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w7();
        n5();
        l5();
        h5();
        j5();
    }

    private final void w7() {
        LinkInfoObj linkInfoObjD4;
        ConceptLinkContentRender conceptLinkContentRender;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29286, new Class[0], Void.TYPE).isSupported || (linkInfoObjD4 = d4()) == null || (conceptLinkContentRender = this.Y) == null) {
            return;
        }
        conceptLinkContentRender.Q(new e());
        conceptLinkContentRender.W(linkInfoObjD4, this.f81921c0);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void A4(@dl.e Result<BBSLinkTreeObj> result) {
        LinkInfoObj link;
        if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29301, new Class[]{Result.class}, Void.TYPE).isSupported && isActive()) {
            super.A4(result);
            if (result == null) {
                return;
            }
            if (this.f81919a0 || r4()) {
                this.f81919a0 = false;
                G4(false);
                v7();
                View view = this.mContentView;
                if (view != null) {
                    view.post(new c());
                }
            }
            kf.a aVarG4 = g4();
            if (aVarG4 != null) {
                aVarG4.p1();
            }
            ConceptLinkContentRender conceptLinkContentRender = this.Y;
            if (conceptLinkContentRender != null) {
                BBSLinkTreeObj result2 = result.getResult();
                conceptLinkContentRender.O((result2 == null || (link = result2.getLink()) == null) ? null : link.getDouble_click_lottie_key());
            }
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void B4() {
        LinkInfoObj linkInfoObjD4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29290, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || (linkInfoObjD4 = d4()) == null) {
            return;
        }
        String str = f0.g("2", linkInfoObjD4.getIs_award_link()) ? "0" : "2";
        o5(str);
        m5(str);
        Q3(linkInfoObjD4.getLinkid(), str);
        T3("syncWeb('award')");
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void C4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29288, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u7(false);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U3(@dl.e String str, @dl.e String str2) {
        String linkid;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29291, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i5(str);
        LinkInfoObj linkInfoObjD4 = d4();
        if (linkInfoObjD4 == null || (linkid = linkInfoObjD4.getLinkid()) == null) {
            return;
        }
        V3(linkid, null, str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29285, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.U4();
        this.mContentView.post(new d(true));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void X4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29284, new Class[0], Void.TYPE).isSupported && d4() == null) {
            showLoading();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void h5() {
        LinkInfoObj linkInfoObjD4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29296, new Class[0], Void.TYPE).isSupported || (linkInfoObjD4 = d4()) == null) {
            return;
        }
        i5(linkInfoObjD4.getIs_favour());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void i5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29297, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.y(str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29280, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        n30 n30Var = null;
        if (arguments != null) {
            this.f81920b0 = arguments.getBoolean(f81915p2);
            Serializable serializable = arguments.getSerializable(PostPageFactory.f81482r);
            J4(serializable instanceof LinkInfoObj ? (LinkInfoObj) serializable : null);
        }
        LinkInfoObj linkInfoObjD4 = d4();
        this.f81921c0 = linkInfoObjD4 != null ? linkInfoObjD4.getThumbs() : null;
        super.installViews(view);
        n30 n30VarD = n30.d(this.mInflater, E5().f112942c, false);
        f0.o(n30VarD, "inflate(\n               …      false\n            )");
        this.Z = n30VarD;
        O4("page_style_picture");
        ConsecutiveScrollerLayout consecutiveScrollerLayout = E5().f112942c;
        n30 n30Var2 = this.Z;
        if (n30Var2 == null) {
            f0.S("linkInfoBinding");
            n30Var2 = null;
        }
        consecutiveScrollerLayout.addView(n30Var2.b(), 0, new ConsecutiveScrollerLayout.LayoutParams(-1, -2));
        E5().f112953n.i0(false);
        io.reactivex.disposables.a compositeDisposable = getCompositeDisposable();
        f0.o(compositeDisposable, "compositeDisposable");
        Activity activity = this.mContext;
        f0.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
        n30 n30Var3 = this.Z;
        if (n30Var3 == null) {
            f0.S("linkInfoBinding");
        } else {
            n30Var = n30Var3;
        }
        NestedScrollView nestedScrollViewB = n30Var.b();
        f0.o(nestedScrollViewB, "linkInfoBinding.root");
        this.Y = new ConceptLinkContentRender(compositeDisposable, appCompatActivity, nestedScrollViewB, this.f81920b0);
        if (d4() != null) {
            v7();
        }
        E5().f112942c.setOnVerticalScrollChangeListener(new b());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29299, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        k5(linkInfoObjD4.getFollow_status());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void k5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29300, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ConceptLinkContentRender conceptLinkContentRender = this.Y;
        if (conceptLinkContentRender != null) {
            conceptLinkContentRender.G(str);
        }
        LinkInfoObj linkInfoObjD4 = d4();
        BBSUserInfoObj user = linkInfoObjD4 != null ? linkInfoObjD4.getUser() : null;
        if (user == null || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.r1(user, str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void l5() {
        LinkInfoObj linkInfoObjD4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29294, new Class[0], Void.TYPE).isSupported || (linkInfoObjD4 = d4()) == null) {
            return;
        }
        m5(linkInfoObjD4.getIs_award_link());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void m5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29295, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        String link_award_num = linkInfoObjD4 != null ? linkInfoObjD4.getLink_award_num() : null;
        kf.a aVarG4 = g4();
        if (link_award_num == null || aVarG4 == null) {
            return;
        }
        aVarG4.M2(str, link_award_num);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void n5() {
        LinkInfoObj linkInfoObjD4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29292, new Class[0], Void.TYPE).isSupported || (linkInfoObjD4 = d4()) == null) {
            return;
        }
        o5(linkInfoObjD4.getIs_award_link());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void o5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29293, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        String link_award_num = linkInfoObjD4 != null ? linkInfoObjD4.getLink_award_num() : null;
        kf.a aVarG4 = g4();
        if (aVarG4 != null) {
            aVarG4.v(str, link_award_num);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29305, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        q6();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d
    public void onFragmentHide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29283, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentHide();
        if (!l6()) {
            r6();
        }
        if (i6()) {
            return;
        }
        n6();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29282, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        if (!l6()) {
            s6();
        }
        if (i6()) {
            return;
        }
        o6();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29303, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ConceptLinkContentRender conceptLinkContentRender = this.Y;
        if (conceptLinkContentRender != null) {
            conceptLinkContentRender.C();
        }
        super.s6();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void y4(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29298, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        if (linkInfoObjD4 != null) {
            linkInfoObjD4.setIs_favour(str);
            h5();
        }
        if (!f0.g("1", str) || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.l("action_favour", true);
    }
}
