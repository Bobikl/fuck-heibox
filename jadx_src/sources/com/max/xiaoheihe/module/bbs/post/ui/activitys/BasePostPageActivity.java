package com.max.xiaoheihe.module.bbs.post.ui.activitys;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.transition.Slide;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.core.graphics.h0;
import androidx.core.view.g3;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import bb.c;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.gson.JsonObject;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt;
import com.max.hbcommon.analytics.d;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewDurationObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewTimeObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbcustomview.SlideViewPager;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt;
import com.max.xiaoheihe.bean.SourceInfoObj;
import com.max.xiaoheihe.bean.SourceType;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSCreateCommentResult;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.max.xiaoheihe.bean.bbs.HighlightInfo;
import com.max.xiaoheihe.bean.bbs.LinkBatteryObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.bbs.WikiEntryObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.account.component.FollowButton;
import com.max.xiaoheihe.module.account.p0;
import com.max.xiaoheihe.module.account.q0;
import com.max.xiaoheihe.module.bbs.AddAtUserActivity;
import com.max.xiaoheihe.module.bbs.LikeAnimResourceManager;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import df.p70;
import io.reactivex.android.schedulers.a;
import io.reactivex.schedulers.b;
import io.reactivex.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: BasePostPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nBasePostPageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1639:1\n262#2,2:1640\n262#2,2:1642\n*S KotlinDebug\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity\n*L\n281#1:1640,2\n290#1:1642,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class BasePostPageActivity extends BaseActivity implements com.max.xiaoheihe.module.bbs.adapter.x.a, kf.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b, kf.b, p0, pf.a.InterfaceC1254a {
    public static final int A4 = 5;
    public static final int B4 = 6;
    public static final int C4 = 2;
    public static final int D4 = 1;
    public static final int E4 = 2;
    public static final int F4 = 4;
    public static final int G4 = 8;
    public static final int H4 = 16;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @dl.d
    public static final a f81579i4 = new a(null);

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final int f81580j4 = 8;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    @dl.d
    public static final String f81581k4 = "comment_id";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    @dl.d
    public static final String f81582l4 = "prev";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    @dl.d
    public static final String f81583m4 = "next";

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    @dl.d
    public static final String f81584n4 = "page_style";

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    @dl.d
    public static final String f81585o4 = "page_style_news_content";

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    @dl.d
    public static final String f81586p4 = "page_style_news_comments";

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    @dl.d
    public static final String f81587q4 = "page_style_video_content";

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    @dl.d
    public static final String f81588r4 = "page_style_video_comments";

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    @dl.d
    public static final String f81589s4 = "page_style_wiki_comments";

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    @dl.d
    public static final String f81590t4 = "page_style_post";

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    @dl.d
    public static final String f81591u4 = "page_style_concept_content";

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    @dl.d
    public static final String f81592v4 = "page_style_picture";

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    @dl.d
    public static final String f81593w4 = "action_share";

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    @dl.d
    public static final String f81594x4 = "action_favour";

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    @dl.d
    public static final String f81595y4 = "action_charge";

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    @dl.d
    public static final String f81596z4 = "action_comment";

    @dl.e
    private BBSLinkRecObj G2;
    private long G3;

    @dl.e
    private WikiEntryObj J3;
    private int L3;
    public BottomEditorBarPostPageImpl M;

    @dl.e
    private String M3;
    protected androidx.viewpager.widget.a N;

    @dl.e
    private String N3;
    public SlideViewPager O;
    private int O3;
    protected FrameLayout P;

    @dl.e
    private VideoInfoObj P3;

    @dl.e
    private SlidingTabLayout R;
    private boolean R3;

    @dl.e
    private Result<BBSLinkTreeObj> T;
    private boolean T3;

    @dl.e
    private LinkInfoObj U;
    private boolean U3;

    @dl.e
    private LoadingDialog V;

    @dl.e
    private String W3;
    protected androidx.activity.result.g<Intent> X;
    private boolean X3;
    private boolean Y3;
    private long Z;
    private long Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private long f81597a0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private boolean f81598a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private boolean f81600b4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private String f81601c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @dl.e
    private p70 f81602c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @dl.e
    private String f81603d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @dl.e
    private BubbleTipPopup f81604e4;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.analytics.j f81607h4;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private String f81608p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private String f81609p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private String f81611x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.e
    private String f81612x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private String f81613y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f81614y2;

    @dl.d
    private Handler L = new Handler();

    @dl.d
    private final ArrayList<KeyDescObj> Q = new ArrayList<>();

    @dl.d
    private String S = "";

    @dl.d
    private String W = "";
    private final int Y = 3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f81599b0 = -1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f81610p3 = true;

    @dl.d
    private String K3 = "1";
    private boolean Q3 = true;
    private boolean S3 = true;

    @dl.d
    private HashMap<String, String> V3 = new HashMap<>();

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    @dl.d
    private final AnimatorSet f81605f4 = new AnimatorSet();

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    @dl.d
    private final AnimatorSet f81606g4 = new AnimatorSet();

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    @t0({"SMAP\nBasePostPageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$setUserTitleProgress$1$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1639:1\n262#2,2:1640\n262#2,2:1642\n262#2,2:1644\n262#2,2:1646\n*S KotlinDebug\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$setUserTitleProgress$1$2$1\n*L\n346#1:1640,2\n347#1:1642,2\n351#1:1644,2\n352#1:1646,2\n*E\n"})
    public static final class a0 implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<LinearLayout> f81615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference<SlidingTabLayout> f81616c;

        a0(WeakReference<LinearLayout> weakReference, WeakReference<SlidingTabLayout> weakReference2) {
            this.f81615b = weakReference;
            this.f81616c = weakReference2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28704, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28703, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            LinearLayout linearLayout = this.f81615b.get();
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            SlidingTabLayout slidingTabLayout = this.f81616c.get();
            if (slidingTabLayout == null) {
                return;
            }
            slidingTabLayout.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28705, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28702, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            LinearLayout linearLayout = this.f81615b.get();
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            SlidingTabLayout slidingTabLayout = this.f81616c.get();
            if (slidingTabLayout == null) {
                return;
            }
            slidingTabLayout.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<BBSCreateCommentResult<BBSFloorCommentObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void a(@dl.d BBSCreateCommentResult<BBSFloorCommentObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28667, new Class[]{BBSCreateCommentResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostPageActivity.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(BasePostPageActivity.this.getString(R.string.comment_success));
                } else {
                    com.max.hbutils.utils.c.f73533a.c(result.getMsg());
                }
                BasePostPageActivity.this.b4(result.getResult());
                BasePostPageActivity.M1(BasePostPageActivity.this);
                if (BasePostPageActivity.this.P2() != null) {
                    LoadingDialog loadingDialogP2 = BasePostPageActivity.this.P2();
                    f0.m(loadingDialogP2);
                    loadingDialogP2.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28665, new Class[0], Void.TYPE).isSupported && BasePostPageActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28666, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BasePostPageActivity.this.isActive()) {
                super.onError(e10);
                if (BasePostPageActivity.this.P2() != null) {
                    LoadingDialog loadingDialogP2 = BasePostPageActivity.this.P2();
                    f0.m(loadingDialogP2);
                    loadingDialogP2.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28668, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSCreateCommentResult) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class b0 implements com.max.hbcommon.analytics.d.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<q0> f81618b;

        b0(WeakReference<q0> weakReference) {
            this.f81618b = weakReference;
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ String H() {
            return com.max.hbcommon.analytics.e.a(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean d2() {
            return com.max.hbcommon.analytics.e.c(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        @dl.e
        public PathSrcNode getClickSrc() {
            return null;
        }

        @Override // com.max.hbcommon.analytics.d.f
        @dl.e
        public String getPageAdditional() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28720, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            q0 q0Var = this.f81618b.get();
            if (q0Var != null) {
                return q0Var.getPageAdditional();
            }
            return null;
        }

        @Override // com.max.hbcommon.analytics.d.f
        @dl.e
        public String getPagePath() {
            return lb.d.U1;
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean isPageVisited() {
            return com.max.hbcommon.analytics.e.e(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void l1(View view) {
            com.max.hbcommon.analytics.e.f(this, view);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean o3() {
            return com.max.hbcommon.analytics.e.d(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void onPageVisitSuccess() {
            com.max.hbcommon.analytics.e.g(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public void setClickSrc(@dl.e PathSrcNode pathSrcNode) {
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void setPageVisited(boolean z10) {
            com.max.hbcommon.analytics.e.h(this, z10);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ String v3() {
            return com.max.hbcommon.analytics.e.b(this);
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    @t0({"SMAP\nBasePostPageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$doPickAction$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1639:1\n1#2:1640\n*E\n"})
    public static final class c implements oe.t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // oe.t
        public void onCancel() {
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 28669, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LocalMedia localMedia = arrayList.get(i10);
                    if (localMedia != null) {
                        BasePostPageActivity.this.H3().getImgPathList().add(localMedia.G());
                    }
                }
            }
            com.max.xiaoheihe.module.bbs.adapter.x mUploadImgShowerAdapter = BasePostPageActivity.this.H3().getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                mUploadImgShowerAdapter.r(BasePostPageActivity.this.H3().getImgPathList());
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class c0 implements r6.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f81620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<q0> f81621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BasePostPageActivity f81622c;

        c0(Ref.BooleanRef booleanRef, WeakReference<q0> weakReference, BasePostPageActivity basePostPageActivity) {
            this.f81620a = booleanRef;
            this.f81621b = weakReference;
            this.f81622c = basePostPageActivity;
        }

        @Override // r6.b
        public void a(@dl.e SmartSwipeWrapper smartSwipeWrapper, @dl.e com.billy.android.swipe.f fVar, int i10, boolean z10, float f10) {
        }

        @Override // r6.b
        public void b(@dl.e SmartSwipeWrapper smartSwipeWrapper, @dl.e com.billy.android.swipe.f fVar) {
        }

        @Override // r6.b
        public void c(@dl.e SmartSwipeWrapper smartSwipeWrapper, @dl.e com.billy.android.swipe.f fVar, int i10, int i11, float f10) {
        }

        @Override // r6.b
        public void d(@dl.e SmartSwipeWrapper smartSwipeWrapper, @dl.e com.billy.android.swipe.f fVar, int i10) {
            com.max.hbcommon.analytics.j jVar;
            if (PatchProxy.proxy(new Object[]{smartSwipeWrapper, fVar, new Integer(i10)}, this, changeQuickRedirect, false, 28722, new Class[]{SmartSwipeWrapper.class, com.billy.android.swipe.f.class, Integer.TYPE}, Void.TYPE).isSupported || (jVar = this.f81622c.f81607h4) == null) {
                return;
            }
            jVar.f();
        }

        @Override // r6.b
        public void e(@dl.e SmartSwipeWrapper smartSwipeWrapper, @dl.e com.billy.android.swipe.f fVar, int i10) {
            com.max.hbcommon.analytics.j jVar;
            if (PatchProxy.proxy(new Object[]{smartSwipeWrapper, fVar, new Integer(i10)}, this, changeQuickRedirect, false, 28723, new Class[]{SmartSwipeWrapper.class, com.billy.android.swipe.f.class, Integer.TYPE}, Void.TYPE).isSupported || (jVar = this.f81622c.f81607h4) == null) {
                return;
            }
            jVar.e();
        }

        @Override // r6.b
        public void f(@dl.e SmartSwipeWrapper smartSwipeWrapper, @dl.e com.billy.android.swipe.f fVar, int i10) {
            if (PatchProxy.proxy(new Object[]{smartSwipeWrapper, fVar, new Integer(i10)}, this, changeQuickRedirect, false, 28721, new Class[]{SmartSwipeWrapper.class, com.billy.android.swipe.f.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Ref.BooleanRef booleanRef = this.f81620a;
            if (booleanRef.f124884b) {
                booleanRef.f124884b = false;
                q0 q0Var = this.f81621b.get();
                if (q0Var != null) {
                    q0Var.M3();
                }
            }
        }

        @Override // r6.b
        public void g(@dl.e SmartSwipeWrapper smartSwipeWrapper, @dl.e com.billy.android.swipe.f fVar) {
        }

        @Override // r6.b
        public void h(@dl.e SmartSwipeWrapper smartSwipeWrapper, @dl.e com.billy.android.swipe.f fVar, int i10, float f10, float f11, float f12) {
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class d implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(@dl.e String[] strArr, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 28670, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageActivity basePostPageActivity = BasePostPageActivity.this;
            String strP0 = com.max.xiaoheihe.utils.d.p0(strArr);
            f0.o(strP0, "getStringFromArray(urls)");
            basePostPageActivity.v4(strP0);
            if (com.max.hbcommon.utils.c.u(BasePostPageActivity.this.G2()) && com.max.hbcommon.utils.c.u(BasePostPageActivity.this.H3().getEditor().getContentText()) && !BasePostPageActivity.this.H3().N()) {
                return;
            }
            BasePostPageActivity.this.n2();
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.e String str) {
            LoadingDialog loadingDialogP2;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28671, new Class[]{String.class}, Void.TYPE).isSupported || (loadingDialogP2 = BasePostPageActivity.this.P2()) == null) {
                return;
            }
            loadingDialogP2.c();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class d0 implements BaseBottomEditorBar.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar.b
        public void a() {
            com.billy.android.swipe.consumer.f fVarX0;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28724, new Class[0], Void.TYPE).isSupported || (fVarX0 = BasePostPageActivity.this.X0()) == null) {
                return;
            }
            fVarX0.X1();
        }

        @Override // com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar.b
        public void b() {
            com.billy.android.swipe.consumer.f fVarX0;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28725, new Class[0], Void.TYPE).isSupported || (fVarX0 = BasePostPageActivity.this.X0()) == null) {
                return;
            }
            fVarX0.N0();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    @t0({"SMAP\nBasePostPageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$getLinkTree$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1639:1\n1#2:1640\n*E\n"})
    public static final class e extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81639c;

        e(String str) {
            this.f81639c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28672, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BasePostPageActivity.this.isActive()) {
                super.onError(e10);
                String message = e10.getMessage();
                if (message != null && StringsKt__StringsKt.W2(message, "删除", false, 2, null)) {
                    BasePostPageActivity.this.X3 = true;
                } else {
                    BasePostPageActivity.this.X3 = false;
                }
                BasePostPageActivity.this.c4(null, this.f81639c);
            }
        }

        public void onNext(@dl.d Result<BBSLinkTreeObj> result) {
            LinkInfoObj link;
            String post_comment_tips;
            KeyDescObj bottom_toast;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28673, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostPageActivity.this.isActive()) {
                super.onNext(result);
                BasePostPageActivity.this.X3 = false;
                BasePostPageActivity.this.c4(result, this.f81639c);
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = BasePostPageActivity.this.H3();
                BBSLinkTreeObj result2 = result.getResult();
                String linkid = null;
                bottomEditorBarPostPageImplH3.setLikeLottieV2Key(result2 != null ? result2.getLike_lottie_key() : null);
                BasePostPageActivity.this.H3().setLottieAnimContextRef(new WeakReference<>(((BaseActivity) BasePostPageActivity.this).f66601b));
                BBSLinkTreeObj result3 = result.getResult();
                if (result3 != null && (bottom_toast = result3.getBottom_toast()) != null) {
                    BasePostPageActivity basePostPageActivity = BasePostPageActivity.this;
                    if (!basePostPageActivity.W3()) {
                        com.max.xiaoheihe.utils.s.f95742a.a(bottom_toast.getDesc(), bottom_toast.getProtocol());
                        basePostPageActivity.Z4(true);
                    }
                }
                BBSLinkTreeObj result4 = result.getResult();
                if (result4 != null && (post_comment_tips = result4.getPost_comment_tips()) != null) {
                    if (!(true ^ kotlin.text.u.V1(post_comment_tips))) {
                        post_comment_tips = null;
                    }
                    if (post_comment_tips != null) {
                        BasePostPageActivity basePostPageActivity2 = BasePostPageActivity.this;
                        basePostPageActivity2.H3().setDefaultEditTextHint(post_comment_tips);
                        basePostPageActivity2.H3().getEditor().setHint(post_comment_tips);
                    }
                }
                BasePostPageActivity basePostPageActivity3 = BasePostPageActivity.this;
                BBSLinkTreeObj result5 = result.getResult();
                if (result5 != null && (link = result5.getLink()) != null) {
                    linkid = link.getLinkid();
                }
                basePostPageActivity3.f81603d4 = linkid;
                BasePostPageActivity.this.k5();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28674, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void onNext(@dl.d Result<UserPostLimitsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28675, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostPageActivity.this.isActive()) {
                super.onNext(result);
                BasePostPageActivity.this.f81600b4 = true;
                UserPostLimitsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                if (!result2.isCan_post_comment() && !com.max.hbcommon.utils.c.u(result2.getMsg_post_comment())) {
                    com.max.hbutils.utils.c.d(result2.getMsg_post_comment());
                }
                Integer numValueOf = Integer.valueOf(com.max.hbutils.utils.n.q(result2.getMax_input_limit_post_comment()));
                if (!(numValueOf.intValue() > 0)) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    BasePostPageActivity.this.H3().setPostCommentTextNumMaxLimit(numValueOf.intValue());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28676, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28677, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageActivity.this.i0();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = false;
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28678, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((BaseActivity) BasePostPageActivity.this).f66601b) && i0.d(((BaseActivity) BasePostPageActivity.this).f66601b)) {
                if (!BasePostPageActivity.this.H3().R()) {
                    if (!com.max.hbcommon.utils.c.u(BasePostPageActivity.this.H3().getEditor().getContentText()) || BasePostPageActivity.this.H3().N() || (BasePostPageActivity.this.H3().getImgPathList() != null && BasePostPageActivity.this.H3().getImgPathList().size() > 0)) {
                        BasePostPageActivity.this.q2();
                        return;
                    } else {
                        com.max.hbutils.utils.c.f(BasePostPageActivity.this.getString(R.string.content_empty_msg));
                        return;
                    }
                }
                if (com.max.hbcommon.utils.c.u(BasePostPageActivity.this.H3().getEditor().getContentText()) && !BasePostPageActivity.this.H3().N()) {
                    com.max.hbutils.utils.c.d(BasePostPageActivity.this.getString(R.string.content_empty_msg));
                    return;
                }
                LoadingDialog loadingDialogP2 = BasePostPageActivity.this.P2();
                if (loadingDialogP2 != null && loadingDialogP2.i()) {
                    z10 = true;
                }
                if (!z10) {
                    BasePostPageActivity basePostPageActivity = BasePostPageActivity.this;
                    Activity mContext = ((BaseActivity) basePostPageActivity).f66601b;
                    f0.o(mContext, "mContext");
                    basePostPageActivity.B4(new LoadingDialog(mContext, BasePostPageActivity.this.getString(R.string.commiting), true).r());
                }
                BasePostPageActivity.this.l4();
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class i implements View.OnDragListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f81643a = new i();
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnDragListener
        public final boolean onDrag(View view, DragEvent dragEvent) {
            return true;
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28679, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageActivity.this.d4();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    @t0({"SMAP\nBasePostPageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$initBottomBar$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1639:1\n1#2:1640\n*E\n"})
    public static final class k implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f81645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f81646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private Runnable f81647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private Runnable f81648e;

        /* JADX INFO: compiled from: BasePostPageActivity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BasePostPageActivity f81650b;

            a(BasePostPageActivity basePostPageActivity) {
                this.f81650b = basePostPageActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28681, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f81650b.H3().P0();
                if (this.f81650b.H3().I0()) {
                    this.f81650b.H3().setComboTipVisible(false);
                }
            }
        }

        /* JADX INFO: compiled from: BasePostPageActivity.kt */
        public static final class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BasePostPageActivity f81651b;

            b(BasePostPageActivity basePostPageActivity) {
                this.f81651b = basePostPageActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28682, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f81651b.k2();
                this.f81651b.H3().R0();
            }
        }

        k() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@dl.d View v10, @dl.d MotionEvent event) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, event}, this, changeQuickRedirect, false, 28680, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(v10, "v");
            f0.p(event, "event");
            BasePostPageActivity.this.w4(false);
            int action = event.getAction();
            if (action == 0) {
                boolean z10 = BasePostPageActivity.this.H3().J0();
                this.f81645b = z10;
                if (!z10) {
                    BasePostPageActivity.this.H3().y0(f0.g(BasePostPageActivity.this.z2(), i0.j()));
                    this.f81648e = new a(BasePostPageActivity.this);
                    this.f81647d = new b(BasePostPageActivity.this);
                    Handler handlerD2 = BasePostPageActivity.this.D2();
                    Runnable runnable = this.f81648e;
                    f0.m(runnable);
                    handlerD2.postDelayed(runnable, 500L);
                    Handler handlerD3 = BasePostPageActivity.this.D2();
                    Runnable runnable2 = this.f81647d;
                    f0.m(runnable2);
                    handlerD3.postDelayed(runnable2, 2000L);
                }
                this.f81646c = System.currentTimeMillis();
            } else if (action == 1) {
                if (!this.f81645b) {
                    Runnable runnable3 = this.f81648e;
                    if (runnable3 != null) {
                        BasePostPageActivity.this.D2().removeCallbacks(runnable3);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.f81646c < 2000) {
                        Runnable runnable4 = this.f81647d;
                        if (runnable4 != null) {
                            BasePostPageActivity.this.D2().removeCallbacks(runnable4);
                        }
                        if (jCurrentTimeMillis - this.f81646c < 500) {
                            if (jCurrentTimeMillis - BasePostPageActivity.this.Z3 > 500) {
                                BasePostPageActivity.this.Z3 = jCurrentTimeMillis;
                                BasePostPageActivity.this.i2();
                            }
                            BasePostPageActivity.this.H3().x0(f0.g(BasePostPageActivity.this.z2(), i0.j()), false);
                        } else {
                            BasePostPageActivity.this.H3().x0(f0.g(BasePostPageActivity.this.z2(), i0.j()), true);
                        }
                        BasePostPageActivity.this.H3().R0();
                    }
                } else if (System.currentTimeMillis() - BasePostPageActivity.this.Z3 > 500) {
                    BasePostPageActivity.this.Z3 = System.currentTimeMillis();
                    BasePostPageActivity.this.H3().setLikeBtnCheckState(false, false);
                    BasePostPageActivity.this.i2();
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28683, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageActivity.this.f2();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28684, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageActivity.this.h2();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28685, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageActivity.this.y2().b(AddAtUserActivity.N1(((BaseActivity) BasePostPageActivity.this).f66601b, i0.j()));
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28686, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) BasePostPageActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.x0(mContext, com.max.xiaoheihe.module.search.page.e.M.a(true)).C(BasePostPageActivity.this.Y).A();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28687, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageActivity.this.H3().g0();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28688, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (BasePostPageActivity.this.H3().O()) {
                BasePostPageActivity.this.H3().setEmojiShowing(false);
                if (BasePostPageActivity.this.H3().getExpressionShowFragment() != null) {
                    BasePostPageActivity.this.H3().setExpressionImageResource(R.drawable.bbs_emoji_filled_24x24);
                    com.max.hbexpression.q expressionShowFragment = BasePostPageActivity.this.H3().getExpressionShowFragment();
                    f0.m(expressionShowFragment);
                    expressionShowFragment.C();
                }
                BasePostPageActivity basePostPageActivity = BasePostPageActivity.this;
                basePostPageActivity.showSoftKeyboard(basePostPageActivity.H3().getEditor());
            } else {
                BasePostPageActivity basePostPageActivity2 = BasePostPageActivity.this;
                basePostPageActivity2.hideSoftKeyboard(basePostPageActivity2.H3().getEditor());
                BasePostPageActivity.this.k4();
            }
            BasePostPageActivity.this.H3().h0();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    @t0({"SMAP\nBasePostPageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$initWindow$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1639:1\n162#2,8:1640\n*S KotlinDebug\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$initWindow$1\n*L\n568#1:1640,8\n*E\n"})
    public static final class r implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f81658b = new r();
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // androidx.core.view.z0
        @dl.d
        public final n3 a(@dl.d View v10, @dl.d n3 windowInsets) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, windowInsets}, this, changeQuickRedirect, false, 28689, new Class[]{View.class, n3.class}, n3.class);
            if (patchProxyResultProxy.isSupported) {
                return (n3) patchProxyResultProxy.result;
            }
            f0.p(v10, "v");
            f0.p(windowInsets, "windowInsets");
            h0 h0VarF = windowInsets.f(n3.m.i());
            f0.o(h0VarF, "windowInsets.getInsets(W…Compat.Type.systemBars())");
            v10.setPadding(h0VarF.f20742a, v10.getPaddingTop(), h0VarF.f20744c, h0VarF.f20745d);
            return windowInsets;
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class s implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28690, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BasePostPageActivity.this.p2();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28691, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (i0.e(((BaseActivity) BasePostPageActivity.this).f66601b)) {
                BasePostPageActivity basePostPageActivity = BasePostPageActivity.this;
                basePostPageActivity.showSoftKeyboard(basePostPageActivity.H3().getEditor());
                boolean z10 = !BasePostPageActivity.this.H3().P();
                BasePostPageActivity.this.u2();
                if (z10) {
                    if (com.max.hbcommon.utils.c.u(BasePostPageActivity.this.C3())) {
                        BasePostPageActivity.this.H3().setContentText("");
                    } else {
                        BasePostPageActivity.this.H3().setContentText(BasePostPageActivity.this.C3());
                    }
                }
            }
            if (BasePostPageActivity.this.H3().I0()) {
                BasePostPageActivity.this.H3().setComboTipVisible(false);
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class u implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            View.OnClickListener editorClickListener;
            if (!PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28692, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported && z10 && BasePostPageActivity.this.r2() && (editorClickListener = BasePostPageActivity.this.H3().getEditorClickListener()) != null) {
                editorClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BasePostFragment basePostFragmentB2;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28693, new Class[]{View.class}, Void.TYPE).isSupported || (basePostFragmentB2 = BasePostPageActivity.this.B2()) == null) {
                return;
            }
            basePostFragmentB2.z4();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class w implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 28695, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            Editable text;
            boolean z10 = false;
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 28694, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == -1) {
                if (BasePostPageActivity.this.H3().getEditor().getSelectionEnd() > 0) {
                    Editable text2 = BasePostPageActivity.this.H3().getEditor().getText();
                    if (text2 != null && text2.charAt(BasePostPageActivity.this.H3().getEditor().getSelectionEnd() - 1) == '@') {
                        z10 = true;
                    }
                    if (z10 && (text = BasePostPageActivity.this.H3().getEditor().getText()) != null) {
                        text.replace(BasePostPageActivity.this.H3().getEditor().getSelectionEnd() - 1, BasePostPageActivity.this.H3().getEditor().getSelectionEnd(), "");
                    }
                }
                ExpressionEditText editor = BasePostPageActivity.this.H3().getEditor();
                int selectionEnd = BasePostPageActivity.this.H3().getEditor().getSelectionEnd();
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                Intent intentA = activityResult.a();
                sb2.append(intentA != null ? intentA.getStringExtra("user_name") : null);
                String string = sb2.toString();
                Intent intentA2 = activityResult.a();
                editor.y(new HighlightInfo("info_at", selectionEnd, string, intentA2 != null ? intentA2.getStringExtra("user_id") : null));
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f81677c;

        x(BBSUserInfoObj bBSUserInfoObj) {
            this.f81677c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28696, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) BasePostPageActivity.this).f66601b;
            f0.o(mContext, "mContext");
            String userid = this.f81677c.getUserid();
            f0.o(userid, "userInfo.userid");
            com.max.xiaoheihe.base.router.b.U(mContext, userid, this.f81677c.getSteamid()).A();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    public static final class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p70 f81678b;

        y(p70 p70Var) {
            this.f81678b = p70Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28697, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f81678b.f114464b.performClick();
        }
    }

    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    @t0({"SMAP\nBasePostPageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$setUserTitleProgress$1$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1639:1\n262#2,2:1640\n262#2,2:1642\n262#2,2:1644\n262#2,2:1646\n*S KotlinDebug\n*F\n+ 1 BasePostPageActivity.kt\ncom/max/xiaoheihe/module/bbs/post/ui/activitys/BasePostPageActivity$setUserTitleProgress$1$1$1\n*L\n315#1:1640,2\n316#1:1642,2\n320#1:1644,2\n321#1:1646,2\n*E\n"})
    public static final class z implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<LinearLayout> f81679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference<SlidingTabLayout> f81680c;

        z(WeakReference<LinearLayout> weakReference, WeakReference<SlidingTabLayout> weakReference2) {
            this.f81679b = weakReference;
            this.f81680c = weakReference2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28700, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28699, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            LinearLayout linearLayout = this.f81679b.get();
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            SlidingTabLayout slidingTabLayout = this.f81680c.get();
            if (slidingTabLayout == null) {
                return;
            }
            slidingTabLayout.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28701, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28698, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            LinearLayout linearLayout = this.f81679b.get();
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            SlidingTabLayout slidingTabLayout = this.f81680c.get();
            if (slidingTabLayout == null) {
                return;
            }
            slidingTabLayout.setVisibility(0);
        }
    }

    public static final /* synthetic */ void M1(BasePostPageActivity basePostPageActivity) {
        if (PatchProxy.proxy(new Object[]{basePostPageActivity}, null, changeQuickRedirect, true, 28652, new Class[]{BasePostPageActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        basePostPageActivity.e2();
    }

    public static final /* synthetic */ void N1(BasePostPageActivity basePostPageActivity, LinkInfoObj linkInfoObj, Map map) {
        if (PatchProxy.proxy(new Object[]{basePostPageActivity, linkInfoObj, map}, null, changeQuickRedirect, true, 28654, new Class[]{BasePostPageActivity.class, LinkInfoObj.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        basePostPageActivity.m2(linkInfoObj, map);
    }

    private final void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28588, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getWindow().setFormat(-3);
        getWindow().addFlags(16777216);
        com.max.hbutils.utils.t.h0(getWindow());
        g3.c(getWindow(), false);
        j1.a2(W0(), r.f81658b);
        com.max.hbutils.utils.t.M(this.f66601b, true);
    }

    public static final /* synthetic */ void b2(BasePostPageActivity basePostPageActivity, LinkInfoObj linkInfoObj, Map map) {
        if (PatchProxy.proxy(new Object[]{basePostPageActivity, linkInfoObj, map}, null, changeQuickRedirect, true, 28653, new Class[]{BasePostPageActivity.class, LinkInfoObj.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        basePostPageActivity.j5(linkInfoObj, map);
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28649, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.V3.clear();
        this.W3 = null;
    }

    private final void j5(final LinkInfoObj linkInfoObj, final Map<String, String> map) {
        PopupWindow popupWindowK;
        if (PatchProxy.proxy(new Object[]{linkInfoObj, map}, this, changeQuickRedirect, false, 28645, new Class[]{LinkInfoObj.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("link_id", linkInfoObj.getLinkid());
        mb.y yVarC = mb.y.c(this.f66602c);
        f0.o(yVarC, "inflate(mInflater)");
        TextView textView = yVarC.f131831c;
        textView.setText("收藏成功");
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        yVarC.f131830b.setText("加入收藏夹");
        yVarC.b().setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity$showAddCollectFolderTip$onActionListener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28706, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                d.d("4", lb.d.f131261u0, null, jsonObject);
                z<Result<CollectionFolders>> zVarA4 = i.a().v(1).I5(b.d()).a4(a.c());
                final BasePostPageActivity basePostPageActivity = this;
                final LinkInfoObj linkInfoObj2 = linkInfoObj;
                final Map<String, String> map2 = map;
                this.V((BasePostPageActivity$showAddCollectFolderTip$onActionListener$1$disposable$1) zVarA4.J5(new com.max.hbcommon.network.d<Result<CollectionFolders>>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity$showAddCollectFolderTip$onActionListener$1$disposable$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.hbcommon.network.d, io.reactivex.g0
                    public void onError(@dl.d Throwable e10) {
                        if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 28707, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(e10, "e");
                        if (basePostPageActivity.isActive()) {
                            super.onError(e10);
                        }
                    }

                    public void onNext(@dl.d Result<CollectionFolders> result) {
                        boolean z10 = true;
                        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28708, new Class[]{Result.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(result, "result");
                        if (basePostPageActivity.isActive()) {
                            BubbleTipPopup bubbleTipPopup = basePostPageActivity.f81604e4;
                            if (bubbleTipPopup != null) {
                                bubbleTipPopup.G();
                            }
                            CollectionFolders result2 = result.getResult();
                            List<CollectionFolder> folders = result2 != null ? result2.getFolders() : null;
                            if (folders != null && !folders.isEmpty()) {
                                z10 = false;
                            }
                            if (z10) {
                                BasePostPageActivity.N1(basePostPageActivity, linkInfoObj2, map2);
                                return;
                            }
                            BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                            Activity mContext = ((BaseActivity) basePostPageActivity).f66601b;
                            f0.o(mContext, "mContext");
                            LayoutInflater mInflater = ((BaseActivity) basePostPageActivity).f66602c;
                            f0.o(mInflater, "mInflater");
                            String linkid = linkInfoObj2.getLinkid();
                            f0.o(linkid, "linkInfoObj.linkid");
                            Map<String, String> map3 = map2;
                            LifecycleCoroutineScope lifecycleCoroutineScopeA = androidx.lifecycle.z.a(basePostPageActivity);
                            final BasePostPageActivity basePostPageActivity2 = basePostPageActivity;
                            BBSKtUtils.Companion.r(companion, mContext, mInflater, linkid, map3, folders, null, lifecycleCoroutineScopeA, new yh.a<Boolean>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity$showAddCollectFolderTip$onActionListener$1$disposable$1$onNext$1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                {
                                    super(0);
                                }

                                @dl.d
                                public final Boolean a() {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28710, new Class[0], Boolean.class);
                                    return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(basePostPageActivity2.isActive());
                                }

                                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                                @Override // yh.a
                                public /* bridge */ /* synthetic */ Boolean invoke() {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28711, new Class[0], Object.class);
                                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                                }
                            }, null, c.b.C2, null);
                        }
                    }

                    @Override // com.max.hbcommon.network.d, io.reactivex.g0
                    public /* bridge */ /* synthetic */ void onNext(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28709, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        onNext((Result<CollectionFolders>) obj);
                    }
                }));
            }
        });
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        BubbleTipPopup bubbleTipPopupR = new BubbleTipPopup.a(mContext).c(H3().getBottomBar()).u(yVarC.b(), -1).b(-1).a(-2).i0(48).n1(false).d(false).p0(0.0f).t0(0.0f).y(true).x(false).n(true).o(3000L).r();
        this.f81604e4 = bubbleTipPopupR;
        if (bubbleTipPopupR != null && (popupWindowK = bubbleTipPopupR.K()) != null) {
            popupWindowK.setAnimationStyle(0);
            Slide slide = new Slide();
            slide.setSlideEdge(80);
            popupWindowK.setEnterTransition(slide);
            Slide slide2 = new Slide();
            slide2.setSlideEdge(80);
            popupWindowK.setExitTransition(slide2);
        }
        BubbleTipPopup bubbleTipPopup = this.f81604e4;
        if (bubbleTipPopup != null) {
            bubbleTipPopup.O();
        }
        com.max.hbcommon.analytics.d.d("3", lb.d.f131261u0, null, jsonObject);
    }

    private final void m2(LinkInfoObj linkInfoObj, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, map}, this, changeQuickRedirect, false, 28646, new Class[]{LinkInfoObj.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        BBSKtUtils.Companion.j(companion, mContext, androidx.lifecycle.z.a(this), new yh.a<Boolean>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity$createCollectionFolderAndAddLink$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Boolean a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28663, new Class[0], Boolean.class);
                return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(this.f81635b.isActive());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Boolean invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28664, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        }, linkInfoObj.getLinkid(), map, null, 32, null);
    }

    private final void m5() {
        LinkInfoObj linkInfoObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28579, new Class[0], Void.TYPE).isSupported || (linkInfoObj = this.U) == null) {
            return;
        }
        H3().U0(com.max.hbutils.utils.n.q(linkInfoObj.getFavour_count()));
    }

    private final void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28648, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!H3().R()) {
            this.W3 = H3().getEditor().getContentText();
            return;
        }
        String str = this.M3;
        if (str == null || f0.g("-1", str)) {
            return;
        }
        HashMap<String, String> map = this.V3;
        String str2 = this.M3;
        f0.m(str2);
        String contentText = H3().getEditor().getContentText();
        f0.o(contentText, "vgBottomBar.editor.getContentText()");
        map.put(str2, contentText);
    }

    @Override // kf.a
    @dl.e
    public String A() {
        return this.f81613y1;
    }

    @dl.e
    public abstract PostCommentFragment A2();

    @dl.d
    public final HashMap<String, String> A3() {
        return this.V3;
    }

    public final void A4(@dl.e String str) {
        this.f81601c0 = str;
    }

    @dl.e
    public abstract BasePostFragment B2();

    @dl.e
    public final String B3() {
        return this.M3;
    }

    public final void B4(@dl.e LoadingDialog loadingDialog) {
        this.V = loadingDialog;
    }

    public final boolean C2() {
        return this.S3;
    }

    @dl.e
    public final String C3() {
        return this.W3;
    }

    public final void C4(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28571, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.K3 = str;
    }

    @Override // pf.a.InterfaceC1254a
    public void D() {
        com.max.hbcommon.analytics.j jVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28586, new Class[0], Void.TYPE).isSupported || (jVar = this.f81607h4) == null) {
            return;
        }
        jVar.e();
    }

    @dl.d
    public final Handler D2() {
        return this.L;
    }

    @dl.e
    public final String D3() {
        return this.N3;
    }

    public final void D4(@dl.e String str) {
        this.f81611x1 = str;
    }

    @dl.d
    public final AnimatorSet E2() {
        return this.f81606g4;
    }

    public final void E4(@dl.e String str) {
        this.f81608p1 = str;
    }

    @dl.d
    public final AnimatorSet F3() {
        return this.f81605f4;
    }

    public final void F4(@dl.e LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 28567, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.U = linkInfoObj;
        m5();
    }

    @Override // kf.b
    public void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28641, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l3().removeAllViews();
        l3().setVisibility(8);
        i4();
        this.f66601b.setRequestedOrientation(1);
        int i10 = this.f81599b0;
        if (i10 != -1) {
            com.max.hbutils.utils.t.P(this.f66601b, i10);
        }
        this.f66601b.getWindow().clearFlags(1024);
    }

    @dl.d
    public final String G2() {
        return this.W;
    }

    public final int G3() {
        return this.O3;
    }

    public final void G4(@dl.e String str) {
        this.f81613y1 = str;
    }

    public abstract void H2();

    @dl.d
    public final BottomEditorBarPostPageImpl H3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28558, new Class[0], BottomEditorBarPostPageImpl.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomEditorBarPostPageImpl) patchProxyResultProxy.result;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.M;
        if (bottomEditorBarPostPageImpl != null) {
            return bottomEditorBarPostPageImpl;
        }
        f0.S("vgBottomBar");
        return null;
    }

    public final void H4(@dl.e Result<BBSLinkTreeObj> result) {
        this.T = result;
    }

    @Override // kf.a
    public void I1() {
    }

    @dl.e
    public final LinkInfoObj I2() {
        BBSLinkTreeObj result;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28590, new Class[0], LinkInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkInfoObj) patchProxyResultProxy.result;
        }
        Result<BBSLinkTreeObj> result2 = this.T;
        if (result2 == null || (result = result2.getResult()) == null) {
            return null;
        }
        return result.getLink();
    }

    @dl.e
    public final VideoInfoObj I3() {
        return this.P3;
    }

    public final void I4(@dl.d androidx.viewpager.widget.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 28561, new Class[]{androidx.viewpager.widget.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.N = aVar;
    }

    @dl.e
    public final p70 J2() {
        return this.f81602c4;
    }

    public final void J4(@dl.e BBSLinkRecObj bBSLinkRecObj) {
        this.G2 = bBSLinkRecObj;
    }

    public final int K2() {
        return this.L3;
    }

    public final void K3(@dl.d Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 28576, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(intent, "intent");
        this.f81611x1 = intent.getStringExtra("h_src");
        this.f81608p1 = intent.getStringExtra("link_id");
        this.f81613y1 = intent.getStringExtra("link_tag");
        this.f81609p2 = intent.getStringExtra(PostPageFactory.f81471g);
        this.f81614y2 = intent.getBooleanExtra(PostPageFactory.f81473i, false);
        this.f81612x2 = intent.getStringExtra("comment_id");
        this.G2 = (BBSLinkRecObj) intent.getSerializableExtra(PostPageFactory.f81474j);
        this.f81610p3 = intent.getBooleanExtra(PostPageFactory.f81475k, true);
        this.G3 = intent.getLongExtra(PostPageFactory.f81476l, 0L);
        this.J3 = (WikiEntryObj) intent.getSerializableExtra("wiki");
        this.O3 = intent.getIntExtra(PostPageFactory.f81479o, 0);
        this.P3 = (VideoInfoObj) intent.getSerializableExtra("video_info");
        F4((LinkInfoObj) intent.getSerializableExtra(PostPageFactory.f81482r));
    }

    public final void K4(@dl.e String str) {
        this.f81609p2 = str;
    }

    @Override // pf.a.InterfaceC1254a
    public void L() {
        com.max.hbcommon.analytics.j jVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28585, new Class[0], Void.TYPE).isSupported || (jVar = this.f81607h4) == null) {
            return;
        }
        jVar.f();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public boolean L1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28650, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : x2();
    }

    @dl.e
    public final String L2() {
        return this.f81612x2;
    }

    public final void L3(@dl.d com.sankuai.waimai.router.core.i request) {
        if (PatchProxy.proxy(new Object[]{request}, this, changeQuickRedirect, false, 28577, new Class[]{com.sankuai.waimai.router.core.i.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        this.f81611x1 = com.max.xiaoheihe.router.interceptors.m.g(request, "h_src");
        this.f81608p1 = com.max.xiaoheihe.router.interceptors.m.g(request, "link_id");
        this.f81613y1 = com.max.xiaoheihe.router.interceptors.m.g(request, "link_tag");
        this.f81609p2 = com.max.xiaoheihe.router.interceptors.m.g(request, PostPageFactory.f81471g);
        this.f81614y2 = com.max.xiaoheihe.router.interceptors.m.b(request, PostPageFactory.f81473i, false);
        this.f81612x2 = com.max.xiaoheihe.router.interceptors.m.g(request, "comment_id");
        this.G2 = (BBSLinkRecObj) com.max.xiaoheihe.router.interceptors.m.f(request, PostPageFactory.f81474j);
        this.f81610p3 = com.max.xiaoheihe.router.interceptors.m.b(request, PostPageFactory.f81475k, true);
        this.G3 = com.max.xiaoheihe.router.interceptors.m.d(request, PostPageFactory.f81476l, 0L);
        this.J3 = (WikiEntryObj) com.max.xiaoheihe.router.interceptors.m.f(request, "wiki");
    }

    public final void L4(boolean z10) {
        this.f81610p3 = z10;
    }

    @Override // kf.a
    public void M2(@dl.e String str, @dl.e String str2) {
    }

    public final boolean M3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28591, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        LinkInfoObj linkInfoObjI2 = I2();
        return linkInfoObjI2 == null || linkInfoObjI2.getUser() == null || !f0.g("1", linkInfoObjI2.getIs_article()) || i0.q(linkInfoObjI2.getUser().getUserid()) || f0.g("1", linkInfoObjI2.getFollow_status()) || f0.g("3", linkInfoObjI2.getFollow_status());
    }

    public final void M4(@dl.e SlidingTabLayout slidingTabLayout) {
        this.R = slidingTabLayout;
    }

    public final void N3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28587, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Q3();
        S3();
        this.f81601c0 = i0.j();
        this.f66601b.setRequestedOrientation(1);
        Intent intent = getIntent();
        f0.o(intent, "intent");
        K3(intent);
        j4();
    }

    public final void N4(long j10) {
        this.f81597a0 = j10;
    }

    @dl.e
    public final String O2() {
        return this.f81601c0;
    }

    public final void O3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28604, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzbartest", "initBottomBar");
        n5();
        H3().getEditor().setOnDragListener(i.f81643a);
        H3().getMask().setOnClickListener(new j());
        H3().B0();
        H3().setLikeTouchListener(new k());
        H3().setChargeOnClickListener(new l());
        H3().setCollectOnClickListener(new m());
        H3().setIvAtVisible(true);
        H3().setAtOnClickListener(new n());
        H3().setAddGameOnClickListener(new o());
        H3().setIvCYVisible(true);
        H3().setCYOnClickListener(new p());
        H3().setExpressionOnClickListener(new q());
        H3().setAddOnClickListener(new g());
        H3().setSendOnClickListener(new h());
    }

    public final void O4(int i10) {
        this.f81599b0 = i10;
    }

    @Override // com.max.xiaoheihe.module.account.p0
    public void P1(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28651, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        AccelWorldScreenShotKt.d(str, new SourceInfoObj(SourceType.link.getKey(), this.f81608p1));
    }

    @dl.e
    public final LoadingDialog P2() {
        return this.V;
    }

    public final void P3() {
        LinkBatteryObj battery;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28581, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObj = this.U;
        if ((linkInfoObj != null ? linkInfoObj.getBattery() : null) != null) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = H3();
            LinkInfoObj linkInfoObj2 = this.U;
            f0.m(linkInfoObj2);
            bottomEditorBarPostPageImplH3.setChargeBtnText(linkInfoObj2.getBattery().getCount());
            LinkInfoObj linkInfoObj3 = this.U;
            if ((linkInfoObj3 == null || (battery = linkInfoObj3.getBattery()) == null || !battery.getCharged()) ? false : true) {
                BottomEditorBarPostPageImpl.setChargeBtnState$default(H3(), true, false, 2, null);
            }
        }
    }

    public final void P4(@dl.d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 28565, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameLayout, "<set-?>");
        this.P = frameLayout;
    }

    @dl.d
    public final String Q2() {
        return this.K3;
    }

    public void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28582, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.g gVarC = df.g.c(this.f66602c);
        f0.o(gVarC, "inflate(mInflater)");
        setContentView(gVarC.b());
        BaseBottomEditorBar bottomEditorBar = gVarC.f110734c.getInstance();
        f0.n(bottomEditorBar, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl");
        g5((BottomEditorBarPostPageImpl) bottomEditorBar);
        SlideViewPager slideViewPager = gVarC.f110736e;
        f0.o(slideViewPager, "viewBinding.vp");
        S4(slideViewPager);
        q3().setOffscreenPageLimit(2);
        q3().setNoScroll(false);
        FrameLayout frameLayout = gVarC.f110735d;
        f0.o(frameLayout, "viewBinding.vgWebFullscreen");
        P4(frameLayout);
    }

    public final void Q4(long j10) {
        this.G3 = j10;
    }

    @Override // kf.a
    public void R2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28643, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("[mLinkInfoObj] " + this.U + "!!");
        m5();
    }

    public abstract void R3();

    public final void R4(long j10) {
        this.Z = j10;
    }

    @dl.e
    public final String S2() {
        return this.f81611x1;
    }

    public final void S4(@dl.d SlideViewPager slideViewPager) {
        if (PatchProxy.proxy(new Object[]{slideViewPager}, this, changeQuickRedirect, false, 28563, new Class[]{SlideViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(slideViewPager, "<set-?>");
        this.O = slideViewPager;
    }

    @dl.e
    public final String T2() {
        return this.f81608p1;
    }

    public final void T3(@dl.d PostCommentFragment postCommentFragment, @dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment, bBSFloorCommentObj}, this, changeQuickRedirect, false, 28601, new Class[]{PostCommentFragment.class, BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(postCommentFragment, "postCommentFragment");
        if (!H3().R() && bBSFloorCommentObj != null && bBSFloorCommentObj.getComment() != null) {
            postCommentFragment.f6(bBSFloorCommentObj.getComment());
            return;
        }
        String str = this.N3;
        f0.m(bBSFloorCommentObj);
        postCommentFragment.g6(str, bBSFloorCommentObj.getComment());
    }

    public final void T4(@dl.e WikiEntryObj wikiEntryObj) {
        this.J3 = wikiEntryObj;
    }

    public final boolean U3() {
        return this.R3;
    }

    public final void U4(boolean z10) {
        this.f81598a4 = z10;
    }

    @dl.e
    public final LinkInfoObj V2() {
        return this.U;
    }

    public final boolean V3() {
        return this.Q3;
    }

    public final void V4(@dl.d HashMap<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 28572, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.V3 = map;
    }

    @dl.e
    public final String W2() {
        return this.f81613y1;
    }

    public final boolean W3() {
        return this.Y3;
    }

    public final void W4(@dl.e String str) {
        this.M3 = str;
    }

    @Override // kf.a
    @dl.d
    public String X() {
        return this.S3 ? "0" : "1";
    }

    @dl.e
    public final Result<BBSLinkTreeObj> X2() {
        return this.T;
    }

    public final boolean X3() {
        return this.f81614y2;
    }

    public final void X4(@dl.e String str) {
        this.W3 = str;
    }

    @dl.d
    public final ArrayList<KeyDescObj> Y2() {
        return this.Q;
    }

    public final boolean Y3() {
        return this.T3;
    }

    public final void Y4(@dl.e String str) {
        this.N3 = str;
    }

    public final boolean Z3() {
        return this.U3;
    }

    public final void Z4(boolean z10) {
        this.Y3 = z10;
    }

    @dl.d
    public final androidx.viewpager.widget.a a3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28560, new Class[0], androidx.viewpager.widget.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.viewpager.widget.a) patchProxyResultProxy.result;
        }
        androidx.viewpager.widget.a aVar = this.N;
        if (aVar != null) {
            return aVar;
        }
        f0.S("mPagerAdapter");
        return null;
    }

    public final void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28596, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.S(this, new s());
    }

    public final void a5(boolean z10) {
        this.f81614y2 = z10;
    }

    @Override // kf.a
    public void b3(@dl.e String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 28623, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported || f0.g("page_style_video_content", str) || !ad.a.a(ad.a.f1206m, false)) {
            return;
        }
        if (H3().R() || com.max.hbcommon.utils.c.u(H3().getEditor().getContentText()) || H3().N()) {
            m4();
        }
    }

    public abstract void b4(@dl.e BBSFloorCommentObj bBSFloorCommentObj);

    public final void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28595, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.getAppbarActionButtonView().setPadding(ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 14.0f), 0);
        this.f66616q.getAppbarActionButtonXView().setPadding(ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 10.0f), 0);
    }

    public void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28603, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (H3().S()) {
            H3().setComboTipVisible(false);
            return;
        }
        H3().setComboTipVisible(true);
        H3().setTipShown(true);
        com.max.hbcache.c.z("combo_tip_shown", "1");
    }

    @Override // kf.a
    @dl.e
    public String c3() {
        return this.f81611x1;
    }

    public abstract void c4(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str);

    public final void c5(boolean z10) {
        this.T3 = z10;
    }

    @Override // kf.a
    public void d(@dl.e ShareImageDialogFragment shareImageDialogFragment) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogFragment}, this, changeQuickRedirect, false, 28629, new Class[]{ShareImageDialogFragment.class}, Void.TYPE).isSupported || shareImageDialogFragment == null) {
            return;
        }
        shareImageDialogFragment.show(getSupportFragmentManager(), PostPageFactory.M);
    }

    @Override // kf.a
    @SuppressLint({"AutoDispose"})
    public void d3(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 28622, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        if (!com.max.hbcommon.utils.c.u(this.f81609p2)) {
            String str8 = this.f81609p2;
            f0.m(str8);
            map.put(PostPageFactory.f81471g, str8);
        }
        if (!com.max.hbcommon.utils.c.u(this.f81612x2)) {
            String str9 = this.f81612x2;
            f0.m(str9);
            map.put("comment_id", str9);
        }
        if (f0.g("1", str)) {
            map.put("reload", "1");
        }
        Map<String, String> mapX = l0.X(this.G2);
        f0.o(mapX, "getRecommendParameters(mRecObj)");
        map.putAll(mapX);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s(this.f81611x1, this.f81608p1, str2, str3, this.K3, str4, str5, str6, null, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(str7)));
    }

    public final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28611, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        hideSoftKeyboard(H3().getEditor());
        H3().getEditor().clearFocus();
        j2();
    }

    public final void d5(@dl.e BBSUserInfoObj bBSUserInfoObj, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, str}, this, changeQuickRedirect, false, 28573, new Class[]{BBSUserInfoObj.class, String.class}, Void.TYPE).isSupported || this.f81602c4 != null || bBSUserInfoObj == null) {
            return;
        }
        p70 p70VarC = p70.c(this.f66602c);
        this.f66616q.setContentView(p70VarC.b(), 16);
        p70VarC.f114464b.setAvatar(bBSUserInfoObj.getAvatar(), bBSUserInfoObj.getAvatar_decoration());
        p70VarC.f114465c.setText(bBSUserInfoObj.getUsername());
        p70VarC.b().setAlpha(0.0f);
        FollowButton vFollowBtn = p70VarC.f114466d;
        f0.o(vFollowBtn, "vFollowBtn");
        vFollowBtn.setVisibility(i0.q(bBSUserInfoObj.getUserid()) ^ true ? 0 : 8);
        p70VarC.f114464b.setOnClickListener(new x(bBSUserInfoObj));
        p70VarC.f114465c.setOnClickListener(new y(p70VarC));
        this.f81602c4 = p70VarC;
        h4(str);
        p70 p70Var = this.f81602c4;
        LinearLayout root = p70Var != null ? p70Var.b() : null;
        if (root == null) {
            return;
        }
        f0.o(root, "root");
        root.setVisibility(8);
    }

    @dl.e
    public final BBSLinkRecObj e3() {
        return this.G2;
    }

    public final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28605, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H3().setEditorClickListener(new t());
        H3().setEditorOnFocusChangeListener(new u());
        H3().I(this);
    }

    public final void e5(float f10) {
        p70 p70Var;
        LinearLayout linearLayoutB;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 28574, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (p70Var = this.f81602c4) == null || (linearLayoutB = p70Var.b()) == null) {
            return;
        }
        SlidingTabLayout titleTabLayout = this.f66616q.getTitleTabLayout();
        if (f10 < 1.0f) {
            if (this.f81605f4.isRunning()) {
                this.f81605f4.cancel();
            }
            if (this.f81606g4.isRunning() || titleTabLayout.getAlpha() >= 1.0f) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayoutB, "alpha", linearLayoutB.getAlpha(), 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(titleTabLayout, "alpha", titleTabLayout.getAlpha(), 1.0f);
            WeakReference weakReference = new WeakReference(titleTabLayout);
            WeakReference weakReference2 = new WeakReference(linearLayoutB);
            AnimatorSet animatorSet = this.f81606g4;
            animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new z(weakReference2, weakReference));
            animatorSet.start();
            return;
        }
        if (this.f81606g4.isRunning()) {
            this.f81606g4.cancel();
        }
        if (this.f81605f4.isRunning() || linearLayoutB.getAlpha() >= 1.0f) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(titleTabLayout, "alpha", titleTabLayout.getAlpha(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(linearLayoutB, "alpha", linearLayoutB.getAlpha(), 1.0f);
        WeakReference weakReference3 = new WeakReference(titleTabLayout);
        WeakReference weakReference4 = new WeakReference(linearLayoutB);
        AnimatorSet animatorSet2 = this.f81605f4;
        animatorSet2.playSequentially(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new a0(weakReference4, weakReference3));
        animatorSet2.start();
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28639, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        H3().expressionDeleteClick(view);
    }

    public final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28578, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Q3 = false;
        com.max.xiaoheihe.module.bbs.g gVarG4 = com.max.xiaoheihe.module.bbs.g.g4(getLinkId(), this.f81611x1);
        gVarG4.l4(this);
        gVarG4.M3(getSupportFragmentManager(), MallOrderDetailObj.ORDER_TYPE_CHARGE);
    }

    @dl.e
    public final String f3() {
        return this.f81609p2;
    }

    public abstract void f4();

    public final void f5(int i10) {
        this.O3 = i10;
    }

    public final boolean g3() {
        return this.f81610p3;
    }

    public final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28589, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.t.J(this);
    }

    public final void g5(@dl.d BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl) {
        if (PatchProxy.proxy(new Object[]{bottomEditorBarPostPageImpl}, this, changeQuickRedirect, false, 28559, new Class[]{BottomEditorBarPostPageImpl.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bottomEditorBarPostPageImpl, "<set-?>");
        this.M = bottomEditorBarPostPageImpl;
    }

    @Override // kf.a
    @dl.e
    public String getLinkId() {
        return this.f81608p1;
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28647, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", this.f81608p1);
        List[] listArr = new List[1];
        LinkInfoObj linkInfoObj = this.U;
        listArr[0] = linkInfoObj != null ? linkInfoObj.getTopics() : null;
        if (!com.max.hbcommon.utils.c.w(listArr)) {
            LinkInfoObj linkInfoObj2 = this.U;
            ArrayList<BBSTopicObj> topics = linkInfoObj2 != null ? linkInfoObj2.getTopics() : null;
            f0.m(topics);
            BBSTopicObj bBSTopicObj = topics.get(0);
            f0.m(bBSTopicObj);
            jsonObject.addProperty("topic_id", bBSTopicObj.getTopic_id());
        }
        BBSLinkRecObj bBSLinkRecObj = this.G2;
        if (bBSLinkRecObj != null) {
            jsonObject.addProperty("idx", bBSLinkRecObj.getIndex());
        }
        jsonObject.addProperty("h_src", this.f81611x1);
        return jsonObject.toString();
    }

    @Override // kf.a
    public void h0(@dl.d LinkInfoObj linkInfoObj, @dl.d Map<String, String> params, @dl.d yh.l<? super Boolean, b2> callback) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, params, callback}, this, changeQuickRedirect, false, 28644, new Class[]{LinkInfoObj.class, Map.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linkInfoObj, "linkInfoObj");
        f0.p(params, "params");
        f0.p(callback, "callback");
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), e1.c(), null, new BasePostPageActivity$collectionLinkV2$1(linkInfoObj, params, callback, this, null), 2, null);
    }

    public abstract void h2();

    @dl.e
    public final SlidingTabLayout h3() {
        return this.R;
    }

    public final void h4(@dl.e String str) {
        p70 p70Var;
        FollowButton followButton;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28575, new Class[]{String.class}, Void.TYPE).isSupported || (p70Var = this.f81602c4) == null || (followButton = p70Var.f114466d) == null) {
            return;
        }
        if (f0.g("1", str)) {
            followButton.setFollowState(FollowButton.FollowState.Followed);
        } else if (f0.g("2", str)) {
            followButton.setFollowState(FollowButton.FollowState.FollowBack);
        } else if (f0.g("3", str)) {
            followButton.setFollowState(FollowButton.FollowState.FollowedEachOther);
        } else {
            followButton.setFollowState(FollowButton.FollowState.Follow);
        }
        followButton.setOnClickListener(new v());
        followButton.setTitleStyle();
    }

    public final void h5(@dl.e VideoInfoObj videoInfoObj) {
        this.P3 = videoInfoObj;
    }

    public final void hideSoftKeyboard(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28599, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // kf.a
    @dl.e
    public BBSLinkRecObj i() {
        return this.G2;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28620, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a4();
    }

    public abstract void i2();

    public final long i3() {
        return this.f81597a0;
    }

    public abstract void i4();

    public final void i5(boolean z10) {
        this.U3 = z10;
    }

    public final void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28610, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o4();
        H3().w();
        this.N3 = "-1";
        this.M3 = "-1";
        H3().b0();
    }

    public final void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28593, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new w());
        f0.o(gVarRegisterForActivityResult, "protected fun registerLa…uncher = atLauncher\n    }");
        p4(gVarRegisterForActivityResult);
        H3().getEditor().E = y2();
    }

    @Override // kf.a
    public void k(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28630, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzbartest", "onCommentStateChanged  state==" + str);
        LinkInfoObj linkInfoObj = this.U;
        if (linkInfoObj != null) {
            f0.m(linkInfoObj);
            linkInfoObj.setDisable_comment(str);
        }
        this.f81598a4 = true;
        this.S3 = !f0.g("1", str);
        n5();
        f4();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
    }

    public abstract void k2();

    public final int k3() {
        return this.f81599b0;
    }

    public final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28594, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H3().setEmojiShowing(true);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = H3();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        f0.o(supportFragmentManager, "supportFragmentManager");
        bottomEditorBarPostPageImplH3.setVgExpressionVisible(supportFragmentManager, true);
    }

    public final synchronized void k5() {
        LinkInfoObj linkInfoObj;
        BBSUserInfoObj user;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28584, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (isActive()) {
            if (L1() && (linkInfoObj = this.U) != null && (user = linkInfoObj.getUser()) != null && getSupportFragmentManager().r0(R.id.base_fragment_container) == null) {
                q3().setNoScroll(true);
                kotlin.jvm.internal.u uVar = null;
                kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new BasePostPageActivity$tryInitMeHomeFragment$1$1(this, null), 3, null);
                j1();
                if (q3().getCurrentItem() == a3().getCount() - 1) {
                    com.billy.android.swipe.consumer.f fVarX0 = X0();
                    if (fVarX0 != null) {
                        fVarX0.N0();
                    }
                    kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new BasePostPageActivity$tryInitMeHomeFragment$1$2(this, null), 3, null);
                }
                q0 q0VarA = q0.f79171d.a(user.getUserid(), user.getSteamid(), this.f81611x1, getPagePath(), true);
                WeakReference weakReference = new WeakReference(q0VarA);
                this.f81607h4 = new com.max.hbcommon.analytics.j(new b0(weakReference), z10, 2, uVar);
                getSupportFragmentManager().u().y(R.id.base_fragment_container, q0VarA).p();
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.f124884b = true;
                com.billy.android.swipe.consumer.f fVarX1 = X0();
                if (fVarX1 != null) {
                    fVarX1.b(new c0(booleanRef, weakReference, this));
                }
                H3().setOnEditorBarExpand(new d0());
            }
        }
    }

    @Override // kf.a
    public void l(@dl.e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28627, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28580, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H3().W(H3().Q());
    }

    @dl.d
    public final FrameLayout l3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28564, new Class[0], FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            return frameLayout;
        }
        f0.S("mVgWebFullscreen");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    public final void l4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28602, new Class[0], Void.TYPE).isSupported && i0.g(this.f66601b)) {
            if (!com.max.hbcommon.utils.c.u(H3().getEditor().getContentText()) || H3().N()) {
                LoadingDialog loadingDialog = this.V;
                if (loadingDialog != null) {
                    f0.m(loadingDialog);
                    if (!loadingDialog.i()) {
                        Activity mContext = this.f66601b;
                        f0.o(mContext, "mContext");
                        this.V = new LoadingDialog(mContext, getString(R.string.commiting), true).r();
                    }
                } else {
                    Activity mContext2 = this.f66601b;
                    f0.o(mContext2, "mContext");
                    this.V = new LoadingDialog(mContext2, getString(R.string.commiting), true).r();
                }
                n2();
            }
        }
    }

    public final void l5(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28597, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        H3().setChargeBtnState(true, true);
        H3().setChargeBtnText(String.valueOf(Integer.parseInt(H3().getChargeText().toString()) + i10));
    }

    @Override // kf.a
    public void m(@dl.e BBSCommentObj bBSCommentObj, @dl.e BBSCommentObj bBSCommentObj2) {
        if (PatchProxy.proxy(new Object[]{bBSCommentObj, bBSCommentObj2}, this, changeQuickRedirect, false, 28624, new Class[]{BBSCommentObj.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.m(bBSCommentObj2);
        this.M3 = bBSCommentObj2.getCommentid();
        f0.m(bBSCommentObj);
        this.N3 = bBSCommentObj.getCommentid();
        showSoftKeyboard(H3().getEditor());
        if (com.max.hbcommon.utils.c.u(this.V3.get(this.M3))) {
            H3().setContentText("");
        } else {
            H3().setContentText(this.V3.get(this.M3));
        }
        H3().c0(bBSCommentObj2.getText(), bBSCommentObj2.getUser().getAvartar(), bBSCommentObj2.getUser().getUsername());
    }

    @Override // kf.a
    public boolean m0(@dl.e String str) {
        return false;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28621, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && H3().getImgPathList().size() > 0 && i10 >= 0 && i10 < H3().getImgPathList().size()) {
            H3().getImgPathList().remove(i10);
            com.max.xiaoheihe.module.bbs.adapter.x mUploadImgShowerAdapter = H3().getMUploadImgShowerAdapter();
            f0.m(mUploadImgShowerAdapter);
            mUploadImgShowerAdapter.notifyItemRemoved(i10);
        }
    }

    public final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28612, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d4();
        this.N3 = "-1";
        this.M3 = "-1";
        H3().b0();
    }

    public final void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28617, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o2(null, null);
    }

    public final long n3() {
        return this.G3;
    }

    public abstract void n4();

    public final void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28608, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzbartest", "updateCommentState  enableComment==" + this.S3);
        r4(this.S3);
        H3().A(this.S3, i0.s());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplH3 = H3();
        LinkInfoObj linkInfoObj = this.U;
        bottomEditorBarPostPageImplH3.setCommentBtnText(linkInfoObj != null ? linkInfoObj.getComment_num() : null);
        LinkInfoObj linkInfoObj2 = this.U;
        String sp_like_key = linkInfoObj2 != null ? linkInfoObj2.getSp_like_key() : null;
        if (!com.max.hbcommon.utils.c.u(sp_like_key) && sp_like_key != null && LikeAnimResourceManager.f79963a.m(sp_like_key) && !f0.g(sp_like_key, H3().getSp_like_key())) {
            H3().setSp_like_key(sp_like_key);
        }
        PostCommentFragment postCommentFragmentA2 = A2();
        if (postCommentFragmentA2 != null) {
            postCommentFragmentA2.p6();
        }
    }

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 28638, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        H3().o0(expressionObj);
    }

    public final void o2(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 28618, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            f0.m(str2);
            map.put("Cookie", str2);
        }
        String contentText = H3().getEditor().getContentText();
        f0.o(contentText, "vgBottomBar.editor.getContentText()");
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V4(this.f81611x1, map, this.f81608p1, contentText, this.N3, this.M3, this.W, H3().N() ? "1" : "0", null, str, y3()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28631, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
        if (i11 == -1 && this.Y == i10) {
            GameObj gameObj = (GameObj) (intent != null ? intent.getSerializableExtra(com.max.hbsearch.l.B) : null);
            if (gameObj != null) {
                H3().getEditor().x(gameObj);
                return;
            }
            return;
        }
        if (i10 != 9991 || intent == null) {
            return;
        }
        PostUtils.f81983a.u(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28642, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (a1() != null) {
            com.billy.android.swipe.consumer.f fVarX0 = X0();
            if (f0.e(fVarX0 != null ? Float.valueOf(fVarX0.c0()) : null, 1.0f)) {
                com.billy.android.swipe.consumer.f fVarX1 = X0();
                if (fVarX1 != null) {
                    fVarX1.j(true);
                    return;
                }
                return;
            }
        }
        if (l3().getVisibility() == 0) {
            G();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28636, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.removeCallbacksAndMessages(null);
        com.max.hbcommon.analytics.j jVar = this.f81607h4;
        if (jVar != null) {
            jVar.d();
        }
        if (!com.max.hbcommon.utils.c.u(this.f81608p1) && this.Z > 0) {
            BBSLinkViewTimeObj bBSLinkViewTimeObjK = com.max.hbcommon.analytics.d.k();
            BBSLinkViewDurationObj bBSLinkViewDurationObj = new BBSLinkViewDurationObj();
            bBSLinkViewDurationObj.setId(com.max.hbutils.utils.n.q(this.f81608p1));
            bBSLinkViewDurationObj.setDuration((int) ((this.Z / 1000.0f) + 0.5f));
            bBSLinkViewDurationObj.setDuration_ms((int) this.Z);
            BBSLinkRecObj bBSLinkRecObj = this.G2;
            if (bBSLinkRecObj != null) {
                bBSLinkViewDurationObj.setAl(bBSLinkRecObj.getAl());
                bBSLinkViewDurationObj.setRec(com.max.hbutils.utils.n.q(bBSLinkRecObj.getFrom()));
                bBSLinkViewDurationObj.setPage_tab(com.max.hbutils.utils.n.q(bBSLinkRecObj.getPage_tab()));
                bBSLinkViewDurationObj.setIdx(com.max.hbutils.utils.n.q(bBSLinkRecObj.getIndex()));
                bBSLinkViewDurationObj.setFrom_recommend_list(bBSLinkRecObj.getFrom());
                bBSLinkViewDurationObj.setIndex(bBSLinkRecObj.getIndex());
                bBSLinkViewDurationObj.setRec_mark(bBSLinkRecObj.getRec_mark());
                bBSLinkViewDurationObj.setRecTags(bBSLinkRecObj.getRecTags());
                bBSLinkViewDurationObj.setImpressionID(bBSLinkRecObj.getImpressionID());
                bBSLinkViewDurationObj.setSessionID(bBSLinkRecObj.getSessionID());
                bBSLinkViewDurationObj.setPos(bBSLinkRecObj.getPos());
                bBSLinkViewDurationObj.setNewsid(bBSLinkRecObj.getNewsid());
            }
            bBSLinkViewDurationObj.setType("link");
            bBSLinkViewDurationObj.setTime(com.max.hbutils.utils.w.C());
            bBSLinkViewDurationObj.setH_src(this.f81611x1);
            bBSLinkViewTimeObjK.getDuration().add(bBSLinkViewDurationObj);
            com.max.hbcommon.utils.k.p(com.max.hbutils.utils.k.p(bBSLinkViewTimeObjK));
            bBSLinkViewTimeObjK.clear();
            v2(String.valueOf((int) ((this.Z / 1000.0f) + 0.5f)), null);
        }
        BubbleTipPopup bubbleTipPopup = this.f81604e4;
        if (bubbleTipPopup != null) {
            bubbleTipPopup.G();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@dl.e Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 28637, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        if (intent != null) {
            K3(intent);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28633, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28632, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        com.max.hbcommon.utils.d.b("zzzzbartest", "onResume  ");
        n5();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28635, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        this.f81597a0 = System.currentTimeMillis();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28634, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        this.Z += System.currentTimeMillis() - this.f81597a0;
    }

    @Override // kf.a
    public void p1() {
        this.Q3 = false;
    }

    public final void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28600, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.e.i(this.f66601b, H3().getImgPathList().size() > 0 ? 9 - H3().getImgPathList().size() : 9, new c());
    }

    public final long p3() {
        return this.Z;
    }

    public final void p4(@dl.d androidx.activity.result.g<Intent> gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 28570, new Class[]{androidx.activity.result.g.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gVar, "<set-?>");
        this.X = gVar;
    }

    public final void q2() {
        boolean z10 = false;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28615, new Class[0], Void.TYPE).isSupported && i0.g(this.f66601b)) {
            LoadingDialog loadingDialog = this.V;
            if (loadingDialog != null && loadingDialog.i()) {
                z10 = true;
            }
            if (!z10) {
                Activity mContext = this.f66601b;
                f0.o(mContext, "mContext");
                this.V = new LoadingDialog(mContext, getString(R.string.commiting), true).r();
            }
            if (H3().getImgPathList().size() > 0) {
                this.W = "";
                com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), H3().getImgPathList(), "bbs", new d());
            } else {
                this.W = "";
                n2();
            }
        }
    }

    @dl.d
    public final SlideViewPager q3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28562, new Class[0], SlideViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (SlideViewPager) patchProxyResultProxy.result;
        }
        SlideViewPager slideViewPager = this.O;
        if (slideViewPager != null) {
            return slideViewPager;
        }
        f0.S("mVp");
        return null;
    }

    public final void q4(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28566, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.S = str;
    }

    @Override // kf.a
    public void r1(@dl.e BBSUserInfoObj bBSUserInfoObj, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, str}, this, changeQuickRedirect, false, 28626, new Class[]{BBSUserInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        H3().k0(str);
        h4(str);
    }

    public boolean r2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28606, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.S3 && i0.e(this.f66601b) && !isFinishing();
    }

    @dl.e
    public final WikiEntryObj r3() {
        return this.J3;
    }

    public void r4(boolean z10) {
        int iE = 0;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28607, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzbartest", "setEditBarVisibility  show==" + z10);
        boolean z11 = z10 && this.f81598a4;
        if (z11) {
            int contentMinHeight = H3().getContentMinHeight();
            Resources resources = this.f66601b.getResources();
            f0.o(resources, "mContext.resources");
            iE = ShareCardDrawUtilsKt.e(contentMinHeight, resources);
        }
        ViewGroup.LayoutParams layoutParams = q3().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = iE;
        q3().setLayoutParams(marginLayoutParams);
        H3().setBottomBarVisible(z11);
    }

    public final boolean s3() {
        return this.f81598a4;
    }

    public final void s4(boolean z10) {
        this.S3 = z10;
    }

    @Override // kf.b
    public void showCustomView(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28640, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        l3().removeAllViews();
        l3().addView(view);
        l3().setVisibility(0);
        this.f66616q.setVisibility(8);
        this.f66617r.setVisibility(8);
        this.f66601b.setRequestedOrientation(0);
        this.f81599b0 = com.max.hbutils.utils.t.q(this.f66601b);
        this.f66601b.getWindow().addFlags(1024);
        com.max.hbutils.utils.t.s(this);
        com.max.hbutils.utils.t.v(this.f66601b);
    }

    public final void showSoftKeyboard(@dl.d View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28598, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        if (!view.requestFocus() || (inputMethodManager = (InputMethodManager) getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    public final void t3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28613, new Class[0], Void.TYPE).isSupported || this.f81600b4) {
            return;
        }
        HashMap map = new HashMap(16);
        if (!com.max.hbcommon.utils.c.u(this.f81608p1)) {
            String str = this.f81608p1;
            f0.m(str);
            map.put("link_id", str);
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b6(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    public final void t4(boolean z10) {
        this.R3 = z10;
    }

    public final void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28609, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (i0.s() && !H3().Q()) {
            t3();
        }
        H3().B();
    }

    @dl.e
    public final String u3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28592, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.U == null) {
            return null;
        }
        if (f0.g("3", this.f81613y1) || f0.g("14", this.f81613y1)) {
            String string = getString(R.string.game_comments);
            f0.o(string, "{\n                getStr…e_comments)\n            }");
            return string;
        }
        LinkInfoObj linkInfoObj = this.U;
        f0.m(linkInfoObj);
        if (linkInfoObj.getRelated_status() != null) {
            LinkInfoObj linkInfoObj2 = this.U;
            f0.m(linkInfoObj2);
            if (f0.g("roll_room", linkInfoObj2.getRelated_status().getContent_type())) {
                v0 v0Var = v0.f124986a;
                String string2 = getString(R.string.room_number_format);
                f0.o(string2, "getString(R.string.room_number_format)");
                LinkInfoObj linkInfoObj3 = this.U;
                f0.m(linkInfoObj3);
                String str = String.format(string2, Arrays.copyOf(new Object[]{linkInfoObj3.getRelated_status().getRoom_detail().getRoom_id()}, 1));
                f0.o(str, "format(format, *args)");
                return str;
            }
        }
        if (f0.g("21", this.f81613y1)) {
            String string3 = getString(R.string.timeline_post);
            f0.o(string3, "{\n                getStr…eline_post)\n            }");
            return string3;
        }
        String string4 = getString(R.string.subject);
        f0.o(string4, "{\n                getStr…ng.subject)\n            }");
        return string4;
    }

    public final void u4(@dl.d Handler handler) {
        if (PatchProxy.proxy(new Object[]{handler}, this, changeQuickRedirect, false, 28557, new Class[]{Handler.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(handler, "<set-?>");
        this.L = handler;
    }

    @Override // kf.a
    public void v(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 28625, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zG = (f0.g("3", this.f81613y1) || f0.g("14", this.f81613y1)) ? f0.g("1", str) : f0.g("1", str);
        if (this.Q3) {
            H3().setLikeBtnCheckState(zG, false);
        } else {
            H3().setLikeBtnCheckState(zG, zG);
        }
        H3().setLikeBtnText(str2);
    }

    @Override // kf.a
    public boolean v0() {
        return this.X3;
    }

    public final void v2(@dl.d String viewTimeSeconds, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{viewTimeSeconds, str}, this, changeQuickRedirect, false, 28616, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewTimeSeconds, "viewTimeSeconds");
        Map<String, String> mapY3 = y3();
        mapY3.put("viewTime", viewTimeSeconds);
        if (!com.max.hbcommon.utils.c.u(str)) {
            mapY3.put("scrollRate", str);
        }
        if (!com.max.hbcommon.utils.c.u(this.f81611x1)) {
            String str2 = this.f81611x1;
            f0.m(str2);
            mapY3.put("h_src", str2);
        }
        if (!com.max.hbcommon.utils.c.u(this.f81608p1)) {
            String str3 = this.f81608p1;
            f0.m(str3);
            mapY3.put("link_id", str3);
        }
        com.max.xiaoheihe.network.i.a().x8("9", mapY3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.p());
    }

    public final void v4(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28568, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.W = str;
    }

    @Override // kf.a
    public boolean w0() {
        return this.f81610p3;
    }

    @dl.d
    public final PostPageFactory.PostType w3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28619, new Class[0], PostPageFactory.PostType.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostPageFactory.PostType) patchProxyResultProxy.result;
        }
        String str = this.f81613y1;
        LinkInfoObj linkInfoObj = this.U;
        PostPageFactory.PostType postTypeM = com.max.xiaoheihe.module.bbs.utils.b.m(str, linkInfoObj != null ? linkInfoObj.getUse_concept_type() : null);
        f0.o(postTypeM, "getPostPageType(\n       …se_concept_type\n        )");
        return postTypeM;
    }

    public final void w4(boolean z10) {
        this.Q3 = z10;
    }

    public final boolean x2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28583, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !ad.a.b(ad.a.f1209p, false, 2, null);
    }

    public final void x4(@dl.e p70 p70Var) {
        this.f81602c4 = p70Var;
    }

    @Override // kf.a
    public void y(@dl.e String str) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 28628, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f0.g("1", str)) {
            H3().setCollectBtnCheckState(true, !this.Q3);
        } else {
            H3().setCollectBtnCheckState(false, false);
            z10 = false;
        }
        this.R3 = z10;
    }

    @dl.d
    public final androidx.activity.result.g<Intent> y2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28569, new Class[0], androidx.activity.result.g.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.activity.result.g) patchProxyResultProxy.result;
        }
        androidx.activity.result.g<Intent> gVar = this.X;
        if (gVar != null) {
            return gVar;
        }
        f0.S("atLauncher");
        return null;
    }

    @dl.d
    public final Map<String, String> y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28614, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        Map<String, String> mapX = l0.X(this.G2);
        return mapX == null ? new HashMap(16) : mapX;
    }

    public final void y4(int i10) {
        this.L3 = i10;
    }

    @dl.d
    public final String z2() {
        return this.S;
    }

    public final void z4(@dl.e String str) {
        this.f81612x2 = str;
    }
}
