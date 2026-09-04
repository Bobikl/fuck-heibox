package com.max.xiaoheihe.module.littleprogram.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.gson.JsonObject;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewDurationObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewTimeObj;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSCreateCommentResult;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.HighlightInfo;
import com.max.xiaoheihe.bean.bbs.LinkBatteryObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.bbs.WikiEntryObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.AddAtUserActivity;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.PostPageParam;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import dl.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import u2.a;

/* JADX INFO: compiled from: BasePostPageFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nBasePostPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageFragment.kt\ncom/max/xiaoheihe/module/littleprogram/base/BasePostPageFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,1063:1\n106#2,15:1064\n*S KotlinDebug\n*F\n+ 1 BasePostPageFragment.kt\ncom/max/xiaoheihe/module/littleprogram/base/BasePostPageFragment\n*L\n112#1:1064,15\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public abstract class BasePostPageFragment extends NativeLittleProgramFragment implements com.max.xiaoheihe.module.bbs.adapter.x.a, kf.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b, kf.b {

    @dl.d
    public static final String G2 = "comment_id";

    @dl.d
    public static final String G3 = "next";

    @dl.d
    public static final String J3 = "page_style";

    @dl.d
    public static final String K3 = "page_style_news_content";

    @dl.d
    public static final String L3 = "page_style_news_comments";

    @dl.d
    public static final String M3 = "page_style_video_content";

    @dl.d
    public static final String N3 = "page_style_video_comments";

    @dl.d
    public static final String O3 = "page_style_wiki_comments";

    @dl.d
    public static final String P3 = "page_style_post";

    @dl.d
    public static final String Q3 = "page_style_concept_content";

    @dl.d
    public static final String R3 = "page_style_picture";

    @dl.d
    public static final String S3 = "action_share";

    @dl.d
    public static final String T3 = "action_favour";

    @dl.d
    public static final String U3 = "action_charge";

    @dl.d
    public static final String V3 = "action_comment";
    public static final int W3 = 5;
    public static final int X3 = 6;
    public static final int Y3 = 2;
    public static final int Z3 = 1;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final int f88766a4 = 2;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final int f88767b4 = 4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final int f88768c4 = 8;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final int f88769d4 = 16;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @dl.d
    public static final String f88770p3 = "prev";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    public static final a f88771x2 = new a(null);

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f88772y2 = 8;

    @dl.e
    private LoadingDialog A;

    @dl.d
    private String B;
    protected androidx.activity.result.g<Intent> C;
    private final int D;
    private int E;
    private long F;
    private int G;

    @dl.e
    private String H;

    @dl.e
    private String I;

    @dl.e
    private String J;

    @dl.e
    private String K;

    @dl.e
    private String L;

    @dl.e
    private String M;
    private boolean N;

    @dl.e
    private BBSLinkRecObj O;
    private boolean P;
    private long Q;

    @dl.e
    private WikiEntryObj R;

    @dl.d
    private String S;
    private int T;

    @dl.e
    private String U;

    @dl.e
    private String V;
    private int W;

    @dl.e
    private VideoInfoObj X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f88773a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f88774b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f88775c0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final z f88776p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f88777p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f88778p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private Handler f88779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected BottomEditorBarPostPageImpl f88780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected androidx.viewpager.widget.a f88781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewPager f88782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected FrameLayout f88783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final ArrayList<KeyDescObj> f88784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private SlidingTabLayout f88785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private String f88786x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    private HashMap<String, String> f88787x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private Result<BBSLinkTreeObj> f88788y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private String f88789y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private LinkInfoObj f88790z;

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<BBSCreateCommentResult<BBSFloorCommentObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void a(@dl.d BBSCreateCommentResult<BBSFloorCommentObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38785, new Class[]{BBSCreateCommentResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostPageFragment.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(BasePostPageFragment.this.getString(R.string.comment_success));
                } else {
                    com.max.hbutils.utils.c.f73533a.c(result.getMsg());
                }
                BasePostPageFragment.this.i6(result.getResult());
                BasePostPageFragment.I4(BasePostPageFragment.this);
                if (BasePostPageFragment.this.l5() != null) {
                    LoadingDialog loadingDialogL5 = BasePostPageFragment.this.l5();
                    f0.m(loadingDialogL5);
                    loadingDialogL5.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38783, new Class[0], Void.TYPE).isSupported && BasePostPageFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38784, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BasePostPageFragment.this.isActive()) {
                super.onError(e10);
                if (BasePostPageFragment.this.l5() != null) {
                    LoadingDialog loadingDialogL5 = BasePostPageFragment.this.l5();
                    f0.m(loadingDialogL5);
                    loadingDialogL5.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38786, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSCreateCommentResult) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    @t0({"SMAP\nBasePostPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageFragment.kt\ncom/max/xiaoheihe/module/littleprogram/base/BasePostPageFragment$doPickAction$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1063:1\n1#2:1064\n*E\n"})
    public static final class c implements oe.t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // oe.t
        public void onCancel() {
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 38787, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LocalMedia localMedia = arrayList.get(i10);
                    if (localMedia != null) {
                        BasePostPageFragment.this.O5().getImgPathList().add(localMedia.G());
                    }
                }
            }
            com.max.xiaoheihe.module.bbs.adapter.x mUploadImgShowerAdapter = BasePostPageFragment.this.O5().getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                mUploadImgShowerAdapter.r(BasePostPageFragment.this.O5().getImgPathList());
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
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
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 38788, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment basePostPageFragment = BasePostPageFragment.this;
            String strP0 = com.max.xiaoheihe.utils.d.p0(strArr);
            f0.o(strP0, "getStringFromArray(urls)");
            basePostPageFragment.B6(strP0);
            if (com.max.hbcommon.utils.c.u(BasePostPageFragment.this.f5()) && com.max.hbcommon.utils.c.u(BasePostPageFragment.this.O5().getEditor().getContentText()) && !BasePostPageFragment.this.O5().N()) {
                return;
            }
            BasePostPageFragment.this.T4();
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.e String str) {
            LoadingDialog loadingDialogL5;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38789, new Class[]{String.class}, Void.TYPE).isSupported || (loadingDialogL5 = BasePostPageFragment.this.l5()) == null) {
                return;
            }
            loadingDialogL5.c();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88795c;

        e(String str) {
            this.f88795c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38790, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BasePostPageFragment.this.isActive()) {
                super.onError(e10);
                BasePostPageFragment.this.j6(null, this.f88795c);
            }
        }

        public void onNext(@dl.d Result<BBSLinkTreeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38791, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostPageFragment.this.isActive()) {
                super.onNext(result);
                BasePostPageFragment.this.j6(result, this.f88795c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38792, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void onNext(@dl.d Result<UserPostLimitsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38793, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (BasePostPageFragment.this.isActive()) {
                super.onNext(result);
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
                    BasePostPageFragment.this.O5().setPostCommentTextNumMaxLimit(numValueOf.intValue());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38794, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38795, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (BasePostPageFragment.this.O5().O()) {
                BasePostPageFragment.this.O5().setEmojiShowing(false);
                if (BasePostPageFragment.this.O5().getExpressionShowFragment() != null) {
                    BasePostPageFragment.this.O5().setExpressionImageResource(R.drawable.bbs_emoji_filled_24x24);
                    com.max.hbexpression.q expressionShowFragment = BasePostPageFragment.this.O5().getExpressionShowFragment();
                    f0.m(expressionShowFragment);
                    expressionShowFragment.C();
                }
                BasePostPageFragment basePostPageFragment = BasePostPageFragment.this;
                basePostPageFragment.k7(basePostPageFragment.O5().getEditor());
            } else {
                BasePostPageFragment basePostPageFragment2 = BasePostPageFragment.this;
                basePostPageFragment2.S5(basePostPageFragment2.O5().getEditor());
                BasePostPageFragment.this.p6();
            }
            BasePostPageFragment.this.O5().h0();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38796, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.i0();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = false;
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38797, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) BasePostPageFragment.this).mContext) && i0.d(((com.max.hbcommon.base.d) BasePostPageFragment.this).mContext)) {
                if (!BasePostPageFragment.this.O5().R()) {
                    if (!com.max.hbcommon.utils.c.u(BasePostPageFragment.this.O5().getEditor().getContentText()) || BasePostPageFragment.this.O5().N() || (BasePostPageFragment.this.O5().getImgPathList() != null && BasePostPageFragment.this.O5().getImgPathList().size() > 0)) {
                        BasePostPageFragment.this.W4();
                        return;
                    } else {
                        com.max.hbutils.utils.c.f(BasePostPageFragment.this.getString(R.string.content_empty_msg));
                        return;
                    }
                }
                if (com.max.hbcommon.utils.c.u(BasePostPageFragment.this.O5().getEditor().getContentText()) && !BasePostPageFragment.this.O5().N()) {
                    com.max.hbutils.utils.c.d(BasePostPageFragment.this.getString(R.string.content_empty_msg));
                    return;
                }
                LoadingDialog loadingDialogL5 = BasePostPageFragment.this.l5();
                if (loadingDialogL5 != null && loadingDialogL5.i()) {
                    z10 = true;
                }
                if (!z10) {
                    BasePostPageFragment basePostPageFragment = BasePostPageFragment.this;
                    Activity mContext = ((com.max.hbcommon.base.d) basePostPageFragment).mContext;
                    f0.o(mContext, "mContext");
                    basePostPageFragment.G6(new LoadingDialog(mContext, BasePostPageFragment.this.getString(R.string.commiting), true).r());
                }
                BasePostPageFragment.this.q6();
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class j implements View.OnDragListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f88800a = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnDragListener
        public final boolean onDrag(View view, DragEvent dragEvent) {
            return true;
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38798, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.k6();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    @t0({"SMAP\nBasePostPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePostPageFragment.kt\ncom/max/xiaoheihe/module/littleprogram/base/BasePostPageFragment$initBottomBar$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1063:1\n1#2:1064\n*E\n"})
    public static final class l implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f88802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f88803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private Runnable f88804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private Runnable f88805e;

        /* JADX INFO: compiled from: BasePostPageFragment.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BasePostPageFragment f88807b;

            a(BasePostPageFragment basePostPageFragment) {
                this.f88807b = basePostPageFragment;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38800, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f88807b.O5().P0();
                if (this.f88807b.O5().I0()) {
                    this.f88807b.O5().setComboTipVisible(false);
                }
            }
        }

        /* JADX INFO: compiled from: BasePostPageFragment.kt */
        public static final class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BasePostPageFragment f88808b;

            b(BasePostPageFragment basePostPageFragment) {
                this.f88808b = basePostPageFragment;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38801, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f88808b.R4();
                this.f88808b.O5().R0();
            }
        }

        l() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@dl.d View v10, @dl.d MotionEvent event) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, event}, this, changeQuickRedirect, false, 38799, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(v10, "v");
            f0.p(event, "event");
            BasePostPageFragment.this.C6(false);
            int action = event.getAction();
            if (action == 0) {
                boolean z10 = BasePostPageFragment.this.O5().J0();
                this.f88802b = z10;
                if (!z10) {
                    BasePostPageFragment.this.O5().y0(f0.g(BasePostPageFragment.this.a5(), i0.j()));
                    this.f88805e = new a(BasePostPageFragment.this);
                    this.f88804d = new b(BasePostPageFragment.this);
                    Handler handlerE5 = BasePostPageFragment.this.e5();
                    Runnable runnable = this.f88805e;
                    f0.m(runnable);
                    handlerE5.postDelayed(runnable, 500L);
                    Handler handlerE6 = BasePostPageFragment.this.e5();
                    Runnable runnable2 = this.f88804d;
                    f0.m(runnable2);
                    handlerE6.postDelayed(runnable2, 2000L);
                }
                this.f88803c = System.currentTimeMillis();
            } else if (action == 1) {
                if (this.f88802b) {
                    BasePostPageFragment.this.O5().setLikeBtnCheckState(false, false);
                    BasePostPageFragment.this.P4();
                } else {
                    Runnable runnable3 = this.f88805e;
                    if (runnable3 != null) {
                        BasePostPageFragment.this.e5().removeCallbacks(runnable3);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.f88803c < 2000) {
                        Runnable runnable4 = this.f88804d;
                        if (runnable4 != null) {
                            BasePostPageFragment.this.e5().removeCallbacks(runnable4);
                        }
                        if (jCurrentTimeMillis - this.f88803c < 500) {
                            BasePostPageFragment.this.P4();
                            BasePostPageFragment.this.O5().x0(f0.g(BasePostPageFragment.this.a5(), i0.j()), false);
                        } else {
                            BasePostPageFragment.this.O5().x0(f0.g(BasePostPageFragment.this.a5(), i0.j()), true);
                        }
                        BasePostPageFragment.this.O5().R0();
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38802, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.N4();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38803, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.O4();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38804, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.m0(null);
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38805, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.Z4().b(AddAtUserActivity.N1(((com.max.hbcommon.base.d) BasePostPageFragment.this).mContext, i0.j()));
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38806, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) BasePostPageFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.x0(mContext, com.max.xiaoheihe.module.search.page.e.M.a(true)).C(BasePostPageFragment.this.D).A();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38807, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.O5().g0();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38808, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) BasePostPageFragment.this).mContext.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class t implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38809, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.V4();
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class u extends androidx.activity.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
            super(true);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38810, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("BasePostPageFragment, handleOnBackPressed");
            if (BasePostPageFragment.this.A5().getVisibility() == 0) {
                BasePostPageFragment.this.G();
            } else {
                setEnabled(false);
                BasePostPageFragment.this.requireActivity().getOnBackPressedDispatcher().f();
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38811, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (i0.e(((com.max.hbcommon.base.d) BasePostPageFragment.this).mContext)) {
                BasePostPageFragment basePostPageFragment = BasePostPageFragment.this;
                basePostPageFragment.k7(basePostPageFragment.O5().getEditor());
                boolean z10 = !BasePostPageFragment.this.O5().P();
                BasePostPageFragment.this.X4();
                if (z10) {
                    if (com.max.hbcommon.utils.c.u(BasePostPageFragment.this.L5())) {
                        BasePostPageFragment.this.O5().setContentText("");
                    } else {
                        BasePostPageFragment.this.O5().setContentText(BasePostPageFragment.this.L5());
                    }
                }
            }
            if (BasePostPageFragment.this.O5().I0()) {
                BasePostPageFragment.this.O5().setComboTipVisible(false);
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class w implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            View.OnClickListener editorClickListener;
            if (!PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38812, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported && BasePostPageFragment.this.c5() && i0.e(((com.max.hbcommon.base.d) BasePostPageFragment.this).mContext) && z10 && BasePostPageFragment.this.getActivity() != null) {
                FragmentActivity activity = BasePostPageFragment.this.getActivity();
                f0.m(activity);
                if (activity.isFinishing() || (editorClickListener = BasePostPageFragment.this.O5().getEditorClickListener()) == null) {
                    return;
                }
                editorClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38813, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BasePostPageFragment.this.m0(null);
        }
    }

    /* JADX INFO: compiled from: BasePostPageFragment.kt */
    public static final class y implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 38815, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            Editable text;
            boolean z10 = false;
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 38814, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == -1) {
                if (BasePostPageFragment.this.O5().getEditor().getSelectionEnd() > 0) {
                    Editable text2 = BasePostPageFragment.this.O5().getEditor().getText();
                    if (text2 != null && text2.charAt(BasePostPageFragment.this.O5().getEditor().getSelectionEnd() - 1) == '@') {
                        z10 = true;
                    }
                    if (z10 && (text = BasePostPageFragment.this.O5().getEditor().getText()) != null) {
                        text.replace(BasePostPageFragment.this.O5().getEditor().getSelectionEnd() - 1, BasePostPageFragment.this.O5().getEditor().getSelectionEnd(), "");
                    }
                }
                ExpressionEditText editor = BasePostPageFragment.this.O5().getEditor();
                int selectionEnd = BasePostPageFragment.this.O5().getEditor().getSelectionEnd();
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

    public BasePostPageFragment() {
        final yh.a<Fragment> aVar = new yh.a<Fragment>() { // from class: com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final Fragment a() {
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Fragment invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38816, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final z zVarB = b0.b(LazyThreadSafetyMode.NONE, new yh.a<c1>() { // from class: com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38817, new Class[0], c1.class);
                return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : (c1) aVar.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38818, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar2 = null;
        this.f88776p = FragmentViewModelLazyKt.h(this, n0.d(com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38819, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38820, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment$special$$inlined$viewModels$default$4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38822, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @d
            public final a invoke() {
                a aVar3;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38821, new Class[0], a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (a) patchProxyResultProxy.result;
                }
                yh.a aVar4 = aVar2;
                if (aVar4 != null && (aVar3 = (a) aVar4.invoke()) != null) {
                    return aVar3;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                return rVar != null ? rVar.getDefaultViewModelCreationExtras() : a.C1270a.f140743b;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.littleprogram.base.BasePostPageFragment$special$$inlined$viewModels$default$5
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38823, new Class[0], y0.b.class);
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38824, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
        this.f88779q = new Handler();
        this.f88784v = new ArrayList<>();
        this.f88786x = "";
        this.B = "";
        this.D = 3;
        this.G = -1;
        this.P = true;
        this.S = "1";
        this.Y = true;
        this.f88773a0 = true;
        this.f88774b0 = true;
        this.f88787x1 = new HashMap<>();
        this.f88778p2 = true;
    }

    public static final /* synthetic */ void I4(BasePostPageFragment basePostPageFragment) {
        if (PatchProxy.proxy(new Object[]{basePostPageFragment}, null, changeQuickRedirect, true, 38782, new Class[]{BasePostPageFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        basePostPageFragment.M4();
    }

    private final void M4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38778, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88787x1.clear();
        this.f88789y1 = null;
    }

    private final void t6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38777, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!O5().R()) {
            this.f88789y1 = O5().getEditor().getContentText();
            return;
        }
        String str = this.U;
        if (str == null || f0.g("-1", str)) {
            return;
        }
        HashMap<String, String> map = this.f88787x1;
        String str2 = this.U;
        f0.m(str2);
        String contentText = O5().getEditor().getContentText();
        f0.o(contentText, "vgBottomBar.editor.getContentText()");
        map.put(str2, contentText);
    }

    @Override // kf.a
    @dl.e
    public String A() {
        return this.K;
    }

    @dl.d
    public final FrameLayout A5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38711, new Class[0], FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f88783u;
        if (frameLayout != null) {
            return frameLayout;
        }
        f0.S("mVgWebFullscreen");
        return null;
    }

    public final void A6(@dl.d Handler handler) {
        if (PatchProxy.proxy(new Object[]{handler}, this, changeQuickRedirect, false, 38704, new Class[]{Handler.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(handler, "<set-?>");
        this.f88779q = handler;
    }

    public final long B5() {
        return this.Q;
    }

    public final void B6(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38714, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.B = str;
    }

    public final int C5() {
        return this.E;
    }

    public final void C6(boolean z10) {
        this.Y = z10;
    }

    @dl.d
    public final ViewPager D5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38709, new Class[0], ViewPager.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewPager) patchProxyResultProxy.result;
        }
        ViewPager viewPager = this.f88782t;
        if (viewPager != null) {
            return viewPager;
        }
        f0.S("mVp");
        return null;
    }

    public final void D6(int i10) {
        this.T = i10;
    }

    @dl.e
    public final WikiEntryObj E5() {
        return this.R;
    }

    public final void E6(@dl.e String str) {
        this.M = str;
    }

    public final void F5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38749, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        if (!com.max.hbcommon.utils.c.u(this.I)) {
            String str = this.I;
            f0.m(str);
            map.put("link_id", str);
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b6(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    public final void F6(@dl.e String str) {
        this.H = str;
    }

    @Override // kf.b
    public void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38775, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        A5().removeAllViews();
        A5().setVisibility(8);
        n6();
        this.mContext.setRequestedOrientation(1);
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e G5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38703, new Class[0], com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e) patchProxyResultProxy.result : (com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.e) this.f88776p.getValue();
    }

    public final void G6(@dl.e LoadingDialog loadingDialog) {
        this.A = loadingDialog;
    }

    @dl.d
    public final PostPageFactory.PostType H5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38755, new Class[0], PostPageFactory.PostType.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostPageFactory.PostType) patchProxyResultProxy.result;
        }
        String str = this.K;
        LinkInfoObj linkInfoObj = this.f88790z;
        PostPageFactory.PostType postTypeM = com.max.xiaoheihe.module.bbs.utils.b.m(str, linkInfoObj != null ? linkInfoObj.getUse_concept_type() : null);
        f0.o(postTypeM, "getPostPageType(\n       …se_concept_type\n        )");
        return postTypeM;
    }

    public final void H6(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38717, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.S = str;
    }

    @Override // kf.a
    public void I1() {
    }

    @dl.d
    public final Map<String, String> I5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38750, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        Map<String, String> mapX = l0.X(this.O);
        return mapX == null ? new HashMap(16) : mapX;
    }

    public final void I6(@dl.e String str) {
        this.J = str;
    }

    @dl.d
    public final HashMap<String, String> J5() {
        return this.f88787x1;
    }

    public final void J6(@dl.e String str) {
        this.I = str;
    }

    @dl.e
    public final String K5() {
        return this.U;
    }

    public final void K6(@dl.e LinkInfoObj linkInfoObj) {
        this.f88790z = linkInfoObj;
    }

    public final void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38740, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (O5().S()) {
            O5().setComboTipVisible(false);
            return;
        }
        O5().setComboTipVisible(true);
        O5().setTipShown(true);
        com.max.hbcache.c.z("combo_tip_shown", "1");
    }

    @dl.e
    public final String L5() {
        return this.f88789y1;
    }

    public final void L6(@dl.e String str) {
        this.K = str;
    }

    @Override // kf.a
    public void M2(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38762, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zG = (f0.g("3", this.K) || f0.g("14", this.K)) ? f0.g("1", str) : f0.g("1", str);
        O5().setLikeBtnCheckState(zG, zG);
        O5().setLikeBtnText(str2);
    }

    @dl.e
    public final String M5() {
        return this.V;
    }

    public final void M6(@dl.e Result<BBSLinkTreeObj> result) {
        this.f88788y = result;
    }

    public final void N4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38721, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Y = false;
        com.max.xiaoheihe.module.bbs.g gVarG4 = com.max.xiaoheihe.module.bbs.g.g4(getLinkId(), this.J);
        gVarG4.l4(getActivity());
        gVarG4.M3(getChildFragmentManager(), MallOrderDetailObj.ORDER_TYPE_CHARGE);
    }

    public final int N5() {
        return this.W;
    }

    public final void N6(@dl.d androidx.viewpager.widget.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 38708, new Class[]{androidx.viewpager.widget.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f88781s = aVar;
    }

    public abstract void O4();

    @dl.d
    public final BottomEditorBarPostPageImpl O5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38705, new Class[0], BottomEditorBarPostPageImpl.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomEditorBarPostPageImpl) patchProxyResultProxy.result;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f88780r;
        if (bottomEditorBarPostPageImpl != null) {
            return bottomEditorBarPostPageImpl;
        }
        f0.S("vgBottomBar");
        return null;
    }

    public final void O6(@dl.e BBSLinkRecObj bBSLinkRecObj) {
        this.O = bBSLinkRecObj;
    }

    public abstract void P4();

    @dl.e
    public final VideoInfoObj P5() {
        return this.X;
    }

    public final void P6(@dl.e String str) {
        this.L = str;
    }

    public final void Q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38746, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t6();
        O5().w();
        this.V = "-1";
        this.U = "-1";
        O5().b0();
    }

    public void Q5(@dl.d Bundle arguments) {
        if (PatchProxy.proxy(new Object[]{arguments}, this, changeQuickRedirect, false, 38726, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arguments, "arguments");
        this.J = arguments.getString("h_src");
        this.I = arguments.getString("link_id");
        this.K = arguments.getString("link_tag");
        this.L = arguments.getString(PostPageFactory.f81471g);
        this.N = arguments.getBoolean(PostPageFactory.f81473i, false);
        this.M = arguments.getString("comment_id");
        this.O = (BBSLinkRecObj) arguments.getSerializable(PostPageFactory.f81474j);
        this.P = arguments.getBoolean(PostPageFactory.f81475k, true);
        this.Q = arguments.getLong(PostPageFactory.f81476l, 0L);
        this.R = (WikiEntryObj) arguments.getSerializable("wiki");
        this.W = arguments.getInt(PostPageFactory.f81479o, 0);
        this.X = (VideoInfoObj) arguments.getSerializable("video_info");
        this.f88790z = (LinkInfoObj) arguments.getSerializable(PostPageFactory.f81482r);
        l7();
    }

    public final void Q6(boolean z10) {
        this.P = z10;
    }

    public void R2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38780, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kf.a.C1123a.c(this, i10);
    }

    public abstract void R4();

    public void R5(@dl.d PostPageParam postPageParam) {
        if (PatchProxy.proxy(new Object[]{postPageParam}, this, changeQuickRedirect, false, 38727, new Class[]{PostPageParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(postPageParam, "postPageParam");
        this.J = postPageParam.t();
        this.I = postPageParam.v();
        this.K = postPageParam.w();
        this.L = postPageParam.z();
        this.M = postPageParam.r();
        Boolean bool = Boolean.TRUE;
        this.N = bool.equals(postPageParam.A());
        this.O = postPageParam.y();
        this.P = bool.equals(postPageParam.B());
        this.Q = postPageParam.E();
        this.R = postPageParam.F();
        l7();
    }

    public final void R6(@dl.e SlidingTabLayout slidingTabLayout) {
        this.f88785w = slidingTabLayout;
    }

    public final void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38722, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        O5().W(O5().Q());
    }

    public final void S5(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38736, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        FragmentActivity activity = getActivity();
        InputMethodManager inputMethodManager = (InputMethodManager) (activity != null ? activity.getSystemService("input_method") : null);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public final void S6(long j10) {
        this.F = j10;
    }

    public final void T4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38753, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        U4(null, null);
    }

    public final boolean T5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38731, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        LinkInfoObj linkInfoObjH5 = h5();
        return linkInfoObjH5 == null || linkInfoObjH5.getUser() == null || !f0.g("1", linkInfoObjH5.getIs_article()) || i0.q(linkInfoObjH5.getUser().getUserid()) || f0.g("1", linkInfoObjH5.getFollow_status()) || f0.g("3", linkInfoObjH5.getFollow_status());
    }

    public final void T6(int i10) {
        this.G = i10;
    }

    public final void U4(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38754, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            f0.m(str2);
            map.put("Cookie", str2);
        }
        String contentText = O5().getEditor().getContentText();
        f0.o(contentText, "vgBottomBar.editor.getContentText()");
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V4(this.J, map, this.I, contentText, this.V, this.U, this.B, O5().N() ? "1" : "0", null, str, I5()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    public final void U5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38725, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Z5();
        X5();
        this.H = i0.j();
        this.mContext.setRequestedOrientation(1);
        o6();
    }

    public final void U6(@dl.d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 38712, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameLayout, "<set-?>");
        this.f88783u = frameLayout;
    }

    public final void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38737, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.e.i(this.mContext, O5().getImgPathList().size() > 0 ? 9 - O5().getImgPathList().size() : 9, new c());
    }

    public final void V5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38741, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        O5().A0();
        O5().setChargeBtnVisible(false);
        O5().setShareBtnVisible(!(getActivity() instanceof com.max.hbminiprogram.h));
        O5().setCommentBtnVisible(getActivity() instanceof com.max.hbminiprogram.h);
        O5().setLikeBtnVisible(false);
        O5().setCollectBtnVisible(false);
        m7();
        O5().getEditor().setOnDragListener(j.f88800a);
        O5().getMask().setOnClickListener(new k());
        O5().B0();
        O5().setLikeTouchListener(new l());
        O5().setChargeOnClickListener(new m());
        O5().setCollectOnClickListener(new n());
        O5().setCommentOnClickListener(new o());
        O5().setIvAtVisible(true);
        O5().setAtOnClickListener(new p());
        O5().setAddGameOnClickListener(new q());
        O5().setIvCYVisible(true);
        O5().setCYOnClickListener(new r());
        O5().setExpressionOnClickListener(new g());
        O5().setAddOnClickListener(new h());
        O5().setSendOnClickListener(new i());
    }

    public final void V6(long j10) {
        this.Q = j10;
    }

    public final void W4() {
        boolean z10 = false;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38751, new Class[0], Void.TYPE).isSupported && i0.g(this.mContext)) {
            LoadingDialog loadingDialog = this.A;
            if (loadingDialog != null && loadingDialog.i()) {
                z10 = true;
            }
            if (!z10) {
                Activity mContext = this.mContext;
                f0.o(mContext, "mContext");
                this.A = new LoadingDialog(mContext, getString(R.string.commiting), true).r();
            }
            if (O5().getImgPathList().size() > 0) {
                this.B = "";
                com.max.xiaoheihe.module.upload.g.h(this.mContext, getCompositeDisposable(), O5().getImgPathList(), "bbs", new d());
            } else {
                this.B = "";
                T4();
            }
        }
    }

    public final void W5() {
        LinkBatteryObj battery;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38723, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObj = this.f88790z;
        if ((linkInfoObj != null ? linkInfoObj.getBattery() : null) != null) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImplO5 = O5();
            LinkInfoObj linkInfoObj2 = this.f88790z;
            f0.m(linkInfoObj2);
            bottomEditorBarPostPageImplO5.setChargeBtnText(linkInfoObj2.getBattery().getCount());
            LinkInfoObj linkInfoObj3 = this.f88790z;
            if ((linkInfoObj3 == null || (battery = linkInfoObj3.getBattery()) == null || !battery.getCharged()) ? false : true) {
                BottomEditorBarPostPageImpl.setChargeBtnState$default(O5(), true, false, 2, null);
            }
        }
    }

    public final void W6(int i10) {
        this.E = i10;
    }

    @Override // kf.a
    @dl.d
    public String X() {
        return this.f88773a0 ? "0" : "1";
    }

    public final void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38745, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (i0.s() && !O5().Q()) {
            F5();
        }
        O5().B();
    }

    public void X5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38724, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.g gVarC = df.g.c(this.mInflater);
        f0.o(gVarC, "inflate(mInflater)");
        setContentView(gVarC);
        BaseBottomEditorBar bottomEditorBar = gVarC.f110734c.getInstance();
        f0.n(bottomEditorBar, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl");
        h7((BottomEditorBarPostPageImpl) bottomEditorBar);
        ViewPager viewPager = gVarC.f110736e;
        f0.o(viewPager, "viewBinding.vp");
        X6(viewPager);
        FrameLayout frameLayout = gVarC.f110735d;
        f0.o(frameLayout, "viewBinding.vgWebFullscreen");
        U6(frameLayout);
    }

    public final void X6(@dl.d ViewPager viewPager) {
        if (PatchProxy.proxy(new Object[]{viewPager}, this, changeQuickRedirect, false, 38710, new Class[]{ViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewPager, "<set-?>");
        this.f88782t = viewPager;
    }

    public final void Y4(@dl.d String viewTimeSeconds, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{viewTimeSeconds, str}, this, changeQuickRedirect, false, 38752, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewTimeSeconds, "viewTimeSeconds");
        Map<String, String> mapI5 = I5();
        mapI5.put("viewTime", viewTimeSeconds);
        if (!com.max.hbcommon.utils.c.u(str)) {
            mapI5.put("scrollRate", str);
        }
        if (!com.max.hbcommon.utils.c.u(this.J)) {
            String str2 = this.J;
            f0.m(str2);
            mapI5.put("h_src", str2);
        }
        if (!com.max.hbcommon.utils.c.u(this.I)) {
            String str3 = this.I;
            f0.m(str3);
            mapI5.put("link_id", str3);
        }
        com.max.xiaoheihe.network.i.a().x8("9", mapI5).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.p());
    }

    public abstract void Y5();

    public final void Y6(@dl.e WikiEntryObj wikiEntryObj) {
        this.R = wikiEntryObj;
    }

    @dl.d
    public final androidx.activity.result.g<Intent> Z4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38715, new Class[0], androidx.activity.result.g.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.activity.result.g) patchProxyResultProxy.result;
        }
        androidx.activity.result.g<Intent> gVar = this.C;
        if (gVar != null) {
            return gVar;
        }
        f0.S("atLauncher");
        return null;
    }

    public void Z5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38729, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBar.getAppbarTitleTextView().setVisibility(8);
        this.mTitleBarDivider.setVisibility(0);
        this.mTitleBar.a0();
        this.mTitleBar.getAppbarNavButtonView().setOnClickListener(new s());
    }

    public final void Z6(@dl.d HashMap<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38718, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.f88787x1 = map;
    }

    @dl.d
    public final String a5() {
        return this.f88786x;
    }

    public final void a6(@dl.d PostCommentFragment postCommentFragment, @dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment, bBSFloorCommentObj}, this, changeQuickRedirect, false, 38738, new Class[]{PostCommentFragment.class, BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(postCommentFragment, "postCommentFragment");
        if (!O5().R() && bBSFloorCommentObj != null && bBSFloorCommentObj.getComment() != null) {
            postCommentFragment.f6(bBSFloorCommentObj.getComment());
            return;
        }
        String str = this.V;
        f0.m(bBSFloorCommentObj);
        postCommentFragment.g6(str, bBSFloorCommentObj.getComment());
    }

    public final void a7(@dl.e String str) {
        this.U = str;
    }

    @Override // kf.a
    public void b3(@dl.e String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 38759, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported || f0.g("page_style_video_content", str)) {
            return;
        }
        if (O5().R() || com.max.hbcommon.utils.c.u(O5().getEditor().getContentText()) || O5().N()) {
            r6();
        }
    }

    @dl.e
    public abstract PostCommentFragment b5();

    public final boolean b6() {
        return this.Z;
    }

    public final void b7(@dl.e String str) {
        this.f88789y1 = str;
    }

    @Override // kf.a
    @dl.e
    public String c3() {
        return this.J;
    }

    public final boolean c5() {
        return this.f88773a0;
    }

    public final boolean c6() {
        return this.Y;
    }

    public final void c7(@dl.e String str) {
        this.V = str;
    }

    @Override // kf.a
    public void d(@dl.e ShareImageDialogFragment shareImageDialogFragment) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogFragment}, this, changeQuickRedirect, false, 38765, new Class[]{ShareImageDialogFragment.class}, Void.TYPE).isSupported || shareImageDialogFragment == null) {
            return;
        }
        shareImageDialogFragment.show(getChildFragmentManager(), PostPageFactory.M);
    }

    public void d3(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 38758, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        if (!com.max.hbcommon.utils.c.u(this.L)) {
            String str8 = this.L;
            f0.m(str8);
            map.put(PostPageFactory.f81471g, str8);
        }
        if (!com.max.hbcommon.utils.c.u(this.M)) {
            String str9 = this.M;
            f0.m(str9);
            map.put("comment_id", str9);
        }
        if (f0.g("1", str)) {
            map.put("reload", "1");
        }
        Map<String, String> mapX = l0.X(this.O);
        f0.o(mapX, "getRecommendParameters(mRecObj)");
        map.putAll(mapX);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s(this.J, this.I, str2, str3, this.S, str4, str5, str6, null, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(str7)));
    }

    public final boolean d5() {
        return this.f88778p2;
    }

    public final boolean d6() {
        return this.N;
    }

    public final void d7(boolean z10) {
        this.N = z10;
    }

    @dl.d
    public final Handler e5() {
        return this.f88779q;
    }

    public final boolean e6() {
        return this.f88775c0;
    }

    public final void e7(boolean z10) {
        this.f88775c0 = z10;
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38773, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        O5().expressionDeleteClick(view);
    }

    @dl.d
    public final String f5() {
        return this.B;
    }

    public final boolean f6() {
        return this.f88774b0;
    }

    public final void f7(boolean z10) {
        this.f88774b0 = z10;
    }

    public abstract void g5();

    public final boolean g6() {
        return this.f88777p1;
    }

    public final void g7(int i10) {
        this.W = i10;
    }

    @Override // kf.a
    @dl.e
    public String getLinkId() {
        return this.I;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38776, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", this.I);
        BBSLinkRecObj bBSLinkRecObj = this.O;
        if (bBSLinkRecObj != null) {
            jsonObject.addProperty("idx", bBSLinkRecObj.getIndex());
        }
        jsonObject.addProperty("h_src", this.J);
        return jsonObject.toString();
    }

    public void h0(@dl.d LinkInfoObj linkInfoObj, @dl.d Map<String, String> map, @dl.d yh.l<? super Boolean, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, map, lVar}, this, changeQuickRedirect, false, 38781, new Class[]{LinkInfoObj.class, Map.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        kf.a.C1123a.a(this, linkInfoObj, map, lVar);
    }

    @dl.e
    public final LinkInfoObj h5() {
        BBSLinkTreeObj result;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38730, new Class[0], LinkInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkInfoObj) patchProxyResultProxy.result;
        }
        Result<BBSLinkTreeObj> result2 = this.f88788y;
        if (result2 == null || (result = result2.getResult()) == null) {
            return null;
        }
        return result.getLink();
    }

    public final void h6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38734, new Class[0], Void.TYPE).isSupported && (getActivity() instanceof AppCompatActivity)) {
            PermissionManager permissionManager = PermissionManager.f71603a;
            FragmentActivity activity = getActivity();
            f0.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            permissionManager.S((AppCompatActivity) activity, new t());
        }
    }

    public final void h7(@dl.d BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl) {
        if (PatchProxy.proxy(new Object[]{bottomEditorBarPostPageImpl}, this, changeQuickRedirect, false, 38706, new Class[]{BottomEditorBarPostPageImpl.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bottomEditorBarPostPageImpl, "<set-?>");
        this.f88780r = bottomEditorBarPostPageImpl;
    }

    @Override // kf.a
    @dl.e
    public BBSLinkRecObj i() {
        return this.O;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38756, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h6();
    }

    public final int i5() {
        return this.T;
    }

    public abstract void i6(@dl.e BBSFloorCommentObj bBSFloorCommentObj);

    public final void i7(@dl.e VideoInfoObj videoInfoObj) {
        this.X = videoInfoObj;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbcommon.base.d
    public void initBaseData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38719, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Q5(arguments);
        }
        super.initBaseData();
    }

    @dl.e
    public final String j5() {
        return this.M;
    }

    public abstract void j6(@dl.e Result<BBSLinkTreeObj> result, @dl.e String str);

    public final void j7(boolean z10) {
        this.f88777p1 = z10;
    }

    @Override // kf.a
    public void k(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38766, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkInfoObj linkInfoObj = this.f88790z;
        if (linkInfoObj != null) {
            f0.m(linkInfoObj);
            linkInfoObj.setDisable_comment(str);
        }
        this.f88773a0 = !f0.g("1", str);
        m7();
        m6();
    }

    @dl.e
    public final String k5() {
        return this.H;
    }

    public final void k6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38747, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        S5(O5().getEditor());
        O5().getEditor().clearFocus();
        Q4();
    }

    public final void k7(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38735, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        if (view.requestFocus()) {
            FragmentActivity activity = getActivity();
            InputMethodManager inputMethodManager = (InputMethodManager) (activity != null ? activity.getSystemService("input_method") : null);
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 1);
            }
        }
    }

    public void l(@dl.e String str, boolean z10) {
    }

    @dl.e
    public final LoadingDialog l5() {
        return this.A;
    }

    public void l6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38742, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        O5().setEditorClickListener(new v());
        O5().setEditorOnFocusChangeListener(new w());
        O5().setCommentOnClickListener(new x());
        O5().I(this);
    }

    public final void l7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.I;
        if (str != null) {
            G5().w(str);
        }
        String str2 = this.J;
        if (str2 != null) {
            G5().v(str2);
        }
        String str3 = this.L;
        if (str3 != null) {
            G5().z(str3);
        }
        String str4 = this.M;
        if (str4 != null) {
            G5().u(str4);
        }
        BBSLinkRecObj bBSLinkRecObj = this.O;
        if (bBSLinkRecObj != null) {
            G5().y(bBSLinkRecObj);
        }
    }

    @Override // kf.a
    public void m(@dl.e BBSCommentObj bBSCommentObj, @dl.e BBSCommentObj bBSCommentObj2) {
        if (PatchProxy.proxy(new Object[]{bBSCommentObj, bBSCommentObj2}, this, changeQuickRedirect, false, 38760, new Class[]{BBSCommentObj.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.m(bBSCommentObj2);
        this.U = bBSCommentObj2.getCommentid();
        f0.m(bBSCommentObj);
        this.V = bBSCommentObj.getCommentid();
        k7(O5().getEditor());
        if (com.max.hbcommon.utils.c.u(this.f88787x1.get(this.U))) {
            O5().setContentText("");
        } else {
            O5().setContentText(this.f88787x1.get(this.U));
        }
        O5().c0(bBSCommentObj2.getText(), bBSCommentObj2.getUser().getAvartar(), bBSCommentObj2.getUser().getUsername());
    }

    @Override // kf.a
    public boolean m0(@dl.e String str) {
        return false;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38757, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && O5().getImgPathList().size() > 0 && i10 < O5().getImgPathList().size()) {
            O5().getImgPathList().remove(i10);
            com.max.xiaoheihe.module.bbs.adapter.x mUploadImgShowerAdapter = O5().getMUploadImgShowerAdapter();
            f0.m(mUploadImgShowerAdapter);
            mUploadImgShowerAdapter.notifyItemRemoved(i10);
        }
    }

    @dl.d
    public final String m5() {
        return this.S;
    }

    public abstract void m6();

    public void m7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38744, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w6(this.f88773a0);
        O5().A(this.f88773a0, i0.s());
        PostCommentFragment postCommentFragmentB5 = b5();
        if (postCommentFragmentB5 != null) {
            postCommentFragmentB5.p6();
        }
    }

    @dl.e
    public final String n5() {
        return this.J;
    }

    public abstract void n6();

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 38772, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        O5().o0(expressionObj);
    }

    @dl.e
    public final String o5() {
        return this.I;
    }

    public final void o6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38732, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new y());
        f0.o(gVarRegisterForActivityResult, "protected fun registerLa…uncher = atLauncher\n    }");
        u6(gVarRegisterForActivityResult);
        O5().getEditor().E = Z4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38767, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(getActivity()).onActivityResult(i10, i11, intent);
        if (i11 == -1 && this.D == i10) {
            GameObj gameObj = (GameObj) (intent != null ? intent.getSerializableExtra(com.max.hbsearch.l.B) : null);
            if (gameObj != null) {
                O5().getEditor().x(gameObj);
            }
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 38720, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.c(this, new u());
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38771, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.I) && this.E > 0) {
            BBSLinkViewTimeObj bBSLinkViewTimeObjK = com.max.hbcommon.analytics.d.k();
            BBSLinkViewDurationObj bBSLinkViewDurationObj = new BBSLinkViewDurationObj();
            bBSLinkViewDurationObj.setId(com.max.hbutils.utils.n.q(this.I));
            bBSLinkViewDurationObj.setDuration(this.E);
            BBSLinkRecObj bBSLinkRecObj = this.O;
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
            bBSLinkViewDurationObj.setH_src(this.J);
            bBSLinkViewTimeObjK.getDuration().add(bBSLinkViewDurationObj);
            com.max.hbcommon.utils.k.p(com.max.hbutils.utils.k.p(bBSLinkViewTimeObjK));
            bBSLinkViewTimeObjK.clear();
            Y4(String.valueOf(this.E), null);
        }
        super.onDestroy();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38768, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        m7();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38770, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        this.F = System.currentTimeMillis();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38769, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        this.E += (int) ((System.currentTimeMillis() - this.F) / ((long) 1000));
    }

    @dl.e
    public final LinkInfoObj p5() {
        return this.f88790z;
    }

    public final void p6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38733, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        O5().setEmojiShowing(true);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImplO5 = O5();
        FragmentManager childFragmentManager = getChildFragmentManager();
        f0.o(childFragmentManager, "childFragmentManager");
        bottomEditorBarPostPageImplO5.setVgExpressionVisible(childFragmentManager, true);
    }

    @dl.e
    public final String q5() {
        return this.K;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public final void q6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38739, new Class[0], Void.TYPE).isSupported && i0.g(this.mContext)) {
            if (!com.max.hbcommon.utils.c.u(O5().getEditor().getContentText()) || O5().N()) {
                LoadingDialog loadingDialog = this.A;
                if (loadingDialog != null) {
                    f0.m(loadingDialog);
                    if (!loadingDialog.i()) {
                        Activity mContext = this.mContext;
                        f0.o(mContext, "mContext");
                        this.A = new LoadingDialog(mContext, getString(R.string.commiting), true).r();
                    }
                } else {
                    Activity mContext2 = this.mContext;
                    f0.o(mContext2, "mContext");
                    this.A = new LoadingDialog(mContext2, getString(R.string.commiting), true).r();
                }
                T4();
            }
        }
    }

    @Override // kf.a
    public void r1(@dl.e BBSUserInfoObj bBSUserInfoObj, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, str}, this, changeQuickRedirect, false, 38763, new Class[]{BBSUserInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        O5().k0(str);
    }

    @dl.e
    public final Result<BBSLinkTreeObj> r5() {
        return this.f88788y;
    }

    public final void r6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38748, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k6();
        this.V = "-1";
        this.U = "-1";
        O5().b0();
    }

    @dl.d
    public final ArrayList<KeyDescObj> s5() {
        return this.f88784v;
    }

    public abstract void s6();

    @Override // kf.b
    public void showCustomView(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38774, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        A5().removeAllViews();
        A5().addView(view);
        A5().setVisibility(0);
        this.mTitleBar.setVisibility(8);
        this.mTitleBarDivider.setVisibility(8);
        this.mContext.setRequestedOrientation(0);
    }

    @dl.d
    public final androidx.viewpager.widget.a t5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38707, new Class[0], androidx.viewpager.widget.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.viewpager.widget.a) patchProxyResultProxy.result;
        }
        androidx.viewpager.widget.a aVar = this.f88781s;
        if (aVar != null) {
            return aVar;
        }
        f0.S("mPagerAdapter");
        return null;
    }

    @dl.e
    public final BBSLinkRecObj u5() {
        return this.O;
    }

    public final void u6(@dl.d androidx.activity.result.g<Intent> gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 38716, new Class[]{androidx.activity.result.g.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gVar, "<set-?>");
        this.C = gVar;
    }

    @Override // kf.a
    public void v(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38761, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zG = (f0.g("3", this.K) || f0.g("14", this.K)) ? f0.g("1", str) : f0.g("1", str);
        if (this.Y) {
            O5().setLikeBtnCheckState(zG, false);
        } else {
            O5().setLikeBtnCheckState(zG, zG);
        }
        O5().setLikeBtnText(str2);
    }

    @Override // kf.a
    public boolean v0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38779, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : kf.a.C1123a.b(this);
    }

    @dl.e
    public final String v5() {
        return this.L;
    }

    public final void v6(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38713, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f88786x = str;
    }

    @Override // kf.a
    public boolean w0() {
        return this.P;
    }

    public final boolean w5() {
        return this.P;
    }

    public void w6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38743, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iF = z10 ? ViewUtils.f(this.mContext, 49.0f) : 0;
        ViewGroup.LayoutParams layoutParams = D5().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = iF;
        D5().setLayoutParams(marginLayoutParams);
        O5().setBottomBarVisible(z10);
    }

    @dl.e
    public final SlidingTabLayout x5() {
        return this.f88785w;
    }

    public final void x6(boolean z10) {
        this.f88773a0 = z10;
    }

    @Override // kf.a
    public void y(@dl.e String str) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38764, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f0.g("1", str)) {
            O5().setCollectBtnCheckState(true, !this.Y);
        } else {
            O5().setCollectBtnCheckState(false, false);
            z10 = false;
        }
        this.Z = z10;
    }

    public final long y5() {
        return this.F;
    }

    public final void y6(boolean z10) {
        this.f88778p2 = z10;
    }

    public final int z5() {
        return this.G;
    }

    public final void z6(boolean z10) {
        this.Z = z10;
    }
}
