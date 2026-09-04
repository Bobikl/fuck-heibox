package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.gson.JsonObject;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.hbcommon.base.d;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSCommentsObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSNoCommentTipObj;
import com.max.xiaoheihe.bean.bbs.BBSSubCommentsObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity;
import com.max.xiaoheihe.view.SubCommentView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.socialize.media.UMImage;
import df.la;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import kotlin.z;

/* JADX INFO: compiled from: PostCommentFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCommentFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostCommentFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1630:1\n262#2,2:1631\n262#2,2:1633\n262#2,2:1635\n*S KotlinDebug\n*F\n+ 1 PostCommentFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostCommentFragment\n*L\n858#1:1631,2\n860#1:1633,2\n861#1:1635,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public class PostCommentFragment extends BasePostFragment implements com.max.xiaoheihe.module.bbs.adapter.c.k0 {

    @dl.d
    public static final a W = new a(null);
    public static final int X = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private List<? extends KeyDescObj> A;

    @dl.e
    private BBSLinkRecObj E;

    @dl.e
    private LoadingDialog F;
    public com.max.hbcommon.base.adapter.s<BBSLinkObj> J;

    @dl.e
    private com.max.hbcommon.analytics.j K;
    private boolean M;

    @dl.e
    private com.max.hbcommon.analytics.j N;
    private boolean P;

    @dl.e
    private com.max.xiaoheihe.module.bbs.i<com.max.hbcommon.base.adapter.s<BBSLinkObj>> Q;

    @dl.e
    private LoadingDialog R;

    @dl.e
    private String T;

    @dl.e
    private BBSNoCommentTipObj U;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public la f81787s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private View f81788t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private View f81789u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.bbs.adapter.c f81790v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private String f81794z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final List<BBSCommentsObj> f81791w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private String f81792x = "0";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private String f81793y = "0";
    private boolean B = true;

    @dl.d
    private String C = "1";

    @dl.d
    private String D = "prev";

    @dl.d
    private ArrayList<BBSLinkObj> G = new ArrayList<>();

    @dl.d
    private ArrayList<BBSLinkObj> H = new ArrayList<>();

    @dl.d
    private ArrayList<BBSLinkObj> I = new ArrayList<>();
    private boolean L = true;
    private boolean O = true;

    @dl.d
    private final HashMap<String, Long> S = new HashMap<>();

    @dl.d
    private final z V = b0.b(LazyThreadSafetyMode.NONE, new yh.a<PostCommentFragment$noCommentAdapterListener$2.a>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment$noCommentAdapterListener$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostCommentFragment.kt */
        @t0({"SMAP\nPostCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCommentFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostCommentFragment$noCommentAdapterListener$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1630:1\n262#2,2:1631\n262#2,2:1633\n262#2,2:1635\n*S KotlinDebug\n*F\n+ 1 PostCommentFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostCommentFragment$noCommentAdapterListener$2$1\n*L\n140#1:1631,2\n143#1:1633,2\n154#1:1635,2\n*E\n"})
        public static final class a extends RecyclerView.AdapterDataObserver {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PostCommentFragment f81820a;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment$noCommentAdapterListener$2$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PostCommentFragment.kt */
            public static final class ViewOnClickListenerC0703a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ BBSNoCommentTipObj f81821b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ PostCommentFragment f81822c;

                ViewOnClickListenerC0703a(BBSNoCommentTipObj bBSNoCommentTipObj, PostCommentFragment postCommentFragment) {
                    this.f81821b = bBSNoCommentTipObj;
                    this.f81822c = postCommentFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z10 = true;
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29134, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    String protocol = this.f81821b.getProtocol();
                    if (protocol != null && protocol.length() != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f81822c.w6(this.f81821b.getAction());
                        return;
                    }
                    Activity mContext = ((d) this.f81822c).mContext;
                    f0.o(mContext, "mContext");
                    com.max.xiaoheihe.base.router.b.j0(mContext, this.f81821b.getProtocol());
                }
            }

            a(PostCommentFragment postCommentFragment) {
                this.f81820a = postCommentFragment;
            }

            private final void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29132, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (this.f81820a.N5().isEmpty()) {
                    LinearLayout linearLayout = this.f81820a.E5().f112949j;
                    f0.o(linearLayout, "binding.llNoCommentTip");
                    linearLayout.setVisibility(0);
                    b();
                    return;
                }
                LinearLayout linearLayout2 = this.f81820a.E5().f112949j;
                f0.o(linearLayout2, "binding.llNoCommentTip");
                linearLayout2.setVisibility(8);
                FragmentActivity activity = this.f81820a.getActivity();
                BasePostPageActivity basePostPageActivity = activity instanceof BasePostPageActivity ? (BasePostPageActivity) activity : null;
                if (basePostPageActivity != null) {
                    PostCommentFragment postCommentFragment = this.f81820a;
                    String strC3 = basePostPageActivity.C3();
                    if (strC3 == null || u.V1(strC3)) {
                        String strZ5 = postCommentFragment.Z5();
                        if (strZ5 == null || u.V1(strZ5)) {
                            return;
                        }
                        basePostPageActivity.X4(postCommentFragment.Z5());
                    }
                }
            }

            private final void b() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29133, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                BBSNoCommentTipObj bBSNoCommentTipObj = this.f81820a.U;
                if (bBSNoCommentTipObj == null) {
                    LinearLayout linearLayout = this.f81820a.E5().f112949j;
                    f0.o(linearLayout, "binding.llNoCommentTip");
                    linearLayout.setVisibility(8);
                    return;
                }
                la laVarE5 = this.f81820a.E5();
                PostCommentFragment postCommentFragment = this.f81820a;
                com.max.hbimage.b.K(bBSNoCommentTipObj.getIcon(), laVarE5.f112947h);
                laVarE5.f112958s.setText(bBSNoCommentTipObj.getTitle());
                laVarE5.f112957r.setText(bBSNoCommentTipObj.getBtn_title());
                com.max.hbimage.b.K(bBSNoCommentTipObj.getBtn_icon(), laVarE5.f112946g);
                laVarE5.f112944e.setBackground(ViewUtils.i(ViewUtils.f(((d) postCommentFragment).mContext, 3.0f), ((d) postCommentFragment).mContext.getColor(R.color.black_start), ((d) postCommentFragment).mContext.getColor(R.color.black_end)));
                laVarE5.f112944e.setOnClickListener(new ViewOnClickListenerC0703a(bBSNoCommentTipObj, postCommentFragment));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29128, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i10, int i11) {
                Object[] objArr = {new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29129, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i10, int i11) {
                Object[] objArr = {new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29130, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i10, int i11) {
                Object[] objArr = {new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29131, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                a();
            }
        }

        {
            super(0);
        }

        @dl.d
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29126, new Class[0], a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(this.f81819b);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment$noCommentAdapterListener$2$a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29127, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public interface b {
        @dl.e
        Result<BBSLinkTreeObj> O1();
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29092, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (result.getMsg() != null) {
                com.max.hbutils.utils.c.f(result.getMsg());
                if (f0.g(ITagManager.SUCCESS, result.getStatus())) {
                    PostCommentFragment.x5(PostCommentFragment.this);
                    BasePostFragment.a4(PostCommentFragment.this, null, 1, null);
                }
            }
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29093, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f81799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81800d;

        d(boolean z10, String str) {
            this.f81799c = z10;
            this.f81800d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29094, new Class[0], Void.TYPE).isSupported && PostCommentFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29095, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (PostCommentFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            BBSUserInfoObj user;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29096, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (PostCommentFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(PostCommentFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                Iterator<BBSCommentsObj> it = PostCommentFragment.this.N5().iterator();
                while (it.hasNext()) {
                    BBSCommentsObj next = it.next();
                    if (this.f81799c) {
                        if (next.getComment() != null && next.getComment().size() > 0) {
                            String commentid = next.getComment().get(0).getCommentid();
                            if (!com.max.hbcommon.utils.c.u(commentid) && kotlin.text.u.L1(commentid, this.f81800d, true)) {
                                it.remove();
                                com.max.xiaoheihe.module.bbs.adapter.c cVarM5 = PostCommentFragment.this.M5();
                                if (cVarM5 != null) {
                                    cVarM5.notifyDataSetChanged();
                                }
                                PostCommentFragment postCommentFragment = PostCommentFragment.this;
                                BBSCommentObj bBSCommentObj = next.getComment().get(0);
                                postCommentFragment.t6(commentid, (bBSCommentObj == null || (user = bBSCommentObj.getUser()) == null) ? null : user.getUserid());
                            }
                        }
                    } else if (next.getComment() != null && next.getComment().size() > 0) {
                        Iterator<BBSCommentObj> it2 = next.getComment().iterator();
                        while (it2.hasNext()) {
                            String commentid2 = it2.next().getCommentid();
                            if (!com.max.hbcommon.utils.c.u(commentid2) && kotlin.text.u.L1(commentid2, this.f81800d, true)) {
                                it2.remove();
                                com.max.xiaoheihe.module.bbs.adapter.c cVarM6 = PostCommentFragment.this.M5();
                                if (cVarM6 != null) {
                                    cVarM6.notifyDataSetChanged();
                                }
                            }
                        }
                    }
                }
                PostCommentFragment.A5(PostCommentFragment.this);
                com.max.xiaoheihe.module.bbs.adapter.c cVarM7 = PostCommentFragment.this.M5();
                f0.m(cVarM7);
                cVarM7.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29097, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81802c;

        e(String str) {
            this.f81802c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29098, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29099, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29100, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c.f(PostCommentFragment.this.getString(R.string.success));
            } else {
                com.max.hbutils.utils.c.f(result.getMsg());
            }
            for (BBSCommentsObj bBSCommentsObj : PostCommentFragment.this.N5()) {
                if (bBSCommentsObj.getComment() != null && bBSCommentsObj.getComment().size() > 0) {
                    String commentid = bBSCommentsObj.getComment().get(0).getCommentid();
                    if (!com.max.hbcommon.utils.c.u(commentid) && kotlin.text.u.L1(commentid, this.f81802c, true)) {
                        bBSCommentsObj.getComment().get(0).setImgs(null);
                        if (PostCommentFragment.this.M5() != null) {
                            com.max.xiaoheihe.module.bbs.adapter.c cVarM5 = PostCommentFragment.this.M5();
                            f0.m(cVarM5);
                            cVarM5.notifyDataSetChanged();
                        }
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29101, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f81805d;

        f(String str, String str2) {
            this.f81804c = str;
            this.f81805d = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29102, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            if (PostCommentFragment.this.isActive()) {
                com.max.hbutils.utils.c.f(f0.g("1", this.f81804c) ? "插眼失败，请稍后再试" : "取消插眼失败，请稍后再试");
            }
        }

        public void onNext(@dl.d Result<?> result) {
            Result<BBSLinkTreeObj> resultF4;
            BBSLinkTreeObj result2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29103, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (PostCommentFragment.this.isActive()) {
                BBSCommentsObj current_comment = null;
                if (PostCommentFragment.this.f4() != null && (resultF4 = PostCommentFragment.this.f4()) != null && (result2 = resultF4.getResult()) != null) {
                    current_comment = result2.getCurrent_comment();
                }
                if (current_comment != null) {
                    for (BBSCommentObj bBSCommentObj : current_comment.getComment()) {
                        if (f0.g(this.f81805d, bBSCommentObj.getCommentid())) {
                            bBSCommentObj.setIs_cy(this.f81804c);
                            break;
                        }
                    }
                    PostCommentFragment.B5(PostCommentFragment.this);
                }
                if (!com.max.hbcommon.utils.c.w(PostCommentFragment.this.N5())) {
                    Iterator<BBSCommentsObj> it = PostCommentFragment.this.N5().iterator();
                    while (it.hasNext()) {
                        for (BBSCommentObj bBSCommentObj2 : it.next().getComment()) {
                            if (f0.g(this.f81805d, bBSCommentObj2.getCommentid())) {
                                bBSCommentObj2.setIs_cy(this.f81804c);
                                break;
                            }
                        }
                    }
                }
                com.max.xiaoheihe.module.bbs.adapter.c cVarM5 = PostCommentFragment.this.M5();
                f0.m(cVarM5);
                cVarM5.notifyDataSetChanged();
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    return;
                }
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29104, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29105, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29106, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29107, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c.f(PostCommentFragment.this.getString(R.string.success));
            } else {
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29108, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<BBSSubCommentsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubCommentView f81808c;

        h(SubCommentView subCommentView) {
            this.f81808c = subCommentView;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29109, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (PostCommentFragment.this.isActive()) {
                super.onError(e10);
                this.f81808c.q();
                PostCommentFragment.v5(PostCommentFragment.this);
            }
        }

        public void onNext(@dl.d Result<BBSSubCommentsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29110, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (PostCommentFragment.this.isActive()) {
                this.f81808c.p(result.getResult());
                PostCommentFragment.v5(PostCommentFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29111, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSSubCommentsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<BBSLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29112, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<BBSLinkListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29113, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (PostCommentFragment.this.isActive()) {
                if (result.getResult() != null) {
                    PostCommentFragment.this.T5().clear();
                    if (!com.max.hbcommon.utils.c.w(result.getResult().getLinks())) {
                        PostCommentFragment.this.T5().addAll(result.getResult().getLinks());
                    }
                }
                if (com.max.hbcommon.utils.c.w(PostCommentFragment.this.T5())) {
                    PostCommentFragment.this.E5().f112951l.setVisibility(8);
                    return;
                }
                PostCommentFragment.this.E5().f112951l.setVisibility(0);
                PostCommentFragment.this.E5().f112961v.getRoot().setVisibility(8);
                PostCommentFragment.this.S5().notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29114, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkListResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class j extends com.max.hbcommon.base.adapter.s<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostCommentFragment.kt */
        public static final class a implements com.max.hbimage.b.q {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<ImageView> f81811a;

            a(Ref.ObjectRef<ImageView> objectRef) {
                this.f81811a = objectRef;
            }

            @Override // com.max.hbimage.b.q
            public void a(@dl.d Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 29117, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(drawable, "drawable");
                this.f81811a.f124891b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f81811a.f124891b.setImageDrawable(drawable);
            }

            @Override // com.max.hbimage.b.q
            public /* synthetic */ void b(Drawable drawable) {
                com.max.hbimage.d.a(this, drawable);
            }

            @Override // com.max.hbimage.b.q
            public void onLoadFailed(@dl.d Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 29118, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(drawable, "drawable");
            }
        }

        /* JADX INFO: compiled from: PostCommentFragment.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostCommentFragment f81812b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f81813c;

            b(PostCommentFragment postCommentFragment, BBSLinkObj bBSLinkObj) {
                this.f81812b = postCommentFragment;
                this.f81813c = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29119, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.E(this.f81812b.getContext(), this.f81813c);
            }
        }

        j(Activity activity, ArrayList<BBSLinkObj> arrayList) {
            super(activity, arrayList, R.layout.item_more_like_post);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, android.view.View] */
        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 29115, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ((CardView) viewHolder.i(R.id.vg_item)).setRadius(ViewUtils.p(((com.max.hbcommon.base.d) PostCommentFragment.this).mContext, viewHolder.itemView, ViewUtils.ViewType.IMAGE));
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? I = viewHolder.i(R.id.iv_image);
            objectRef.f124891b = I;
            ((ImageView) I).setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (f0.g("1", data.getThumb().getFill_type())) {
                ((ImageView) objectRef.f124891b).setImageResource(R.drawable.common_default_placeholder_375x210);
                com.max.hbimage.b.X(PostCommentFragment.this.getContext(), (View) objectRef.f124891b, data.getThumb().getUrl(), new a(objectRef));
            } else {
                com.max.hbimage.b.L(data.getThumb().getUrl(), (ImageView) objectRef.f124891b, R.drawable.common_default_placeholder_375x210);
            }
            if (com.max.hbcommon.utils.c.u(data.getTitle())) {
                viewHolder.p(R.id.tv_title, data.getDescription());
            } else {
                viewHolder.p(R.id.tv_title, data.getTitle());
            }
            if (com.max.hbcommon.utils.c.x(data.getHas_video())) {
                viewHolder.i(R.id.vg_video_play).setVisibility(0);
                viewHolder.i(R.id.vg_video_play).setBackground(com.max.hbutils.utils.q.o(PostCommentFragment.this.getContext(), R.color.text_primary_1_color_alpha65, 2.0f));
            } else {
                viewHolder.i(R.id.vg_video_play).setVisibility(8);
            }
            viewHolder.itemView.setTag(data);
            viewHolder.itemView.setOnClickListener(new b(PostCommentFragment.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 29116, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSLinkObj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class k implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29120, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            PostCommentFragment.x5(PostCommentFragment.this);
            BasePostFragment.a4(PostCommentFragment.this, null, 1, null);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class l implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29121, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            if (f0.g("1", PostCommentFragment.this.C)) {
                PostCommentFragment postCommentFragment = PostCommentFragment.this;
                postCommentFragment.N4(postCommentFragment.h4() + 1);
            }
            PostCommentFragment.this.D = "next";
            BasePostFragment.a4(PostCommentFragment.this, null, 1, null);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class m implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f81816a = -1;

        m() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public void a(@dl.d View v10, int i10, int i11, int i12) {
            Object[] objArr = {v10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29122, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
            PostCommentFragment.this.u6(v10, i10, i11, i12, this.f81816a);
            if (i12 != this.f81816a) {
                this.f81816a = i12;
            }
        }

        public final int b() {
            return this.f81816a;
        }

        public final void c(int i10) {
            this.f81816a = i10;
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class n extends pg.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // pg.g, pg.c
        public void i(@dl.d ng.f footer, boolean z10, float f10, int i10, int i11, int i12) {
            Object[] objArr = {footer, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29123, new Class[]{ng.f.class, Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(footer, "footer");
            if (PostCommentFragment.this.isActive()) {
                PostCommentFragment.this.E5().f112942c.setStickyOffset(i10);
            }
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class o implements com.max.hbcommon.analytics.d.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
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
        @dl.d
        public String getPageAdditional() {
            LinkInfoObj linkInfoObjD4;
            ArrayList<BBSTopicObj> topics;
            BBSTopicObj bBSTopicObj;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29124, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", PostCommentFragment.this.c4());
            List[] listArr = new List[1];
            LinkInfoObj linkInfoObjD5 = PostCommentFragment.this.d4();
            listArr[0] = linkInfoObjD5 != null ? linkInfoObjD5.getTopics() : null;
            if (!com.max.hbcommon.utils.c.w(listArr) && (linkInfoObjD4 = PostCommentFragment.this.d4()) != null && (topics = linkInfoObjD4.getTopics()) != null && (bBSTopicObj = topics.get(0)) != null) {
                jsonObject.addProperty("topic_id", bBSTopicObj.getTopic_id());
            }
            jsonObject.addProperty("h_src", PostCommentFragment.this.b4());
            LinkInfoObj linkInfoObjD6 = PostCommentFragment.this.d4();
            jsonObject.addProperty(PostPageFactory.f81484t, linkInfoObjD6 != null ? linkInfoObjD6.getHas_video() : null);
            jsonObject.addProperty("link_tag", PostCommentFragment.this.e4());
            String string = jsonObject.toString();
            f0.o(string, "additional.toString()");
            return string;
        }

        @Override // com.max.hbcommon.analytics.d.f
        @dl.d
        public String getPagePath() {
            return lb.d.V;
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

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class p implements com.max.hbcommon.analytics.d.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
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
        @dl.d
        public String getPageAdditional() {
            LinkInfoObj linkInfoObjD4;
            ArrayList<BBSTopicObj> topics;
            BBSTopicObj bBSTopicObj;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29125, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", PostCommentFragment.this.c4());
            List[] listArr = new List[1];
            LinkInfoObj linkInfoObjD5 = PostCommentFragment.this.d4();
            listArr[0] = linkInfoObjD5 != null ? linkInfoObjD5.getTopics() : null;
            if (!com.max.hbcommon.utils.c.w(listArr) && (linkInfoObjD4 = PostCommentFragment.this.d4()) != null && (topics = linkInfoObjD4.getTopics()) != null && (bBSTopicObj = topics.get(0)) != null) {
                jsonObject.addProperty("topic_id", bBSTopicObj.getTopic_id());
            }
            jsonObject.addProperty("h_src", PostCommentFragment.this.b4());
            LinkInfoObj linkInfoObjD6 = PostCommentFragment.this.d4();
            jsonObject.addProperty(PostPageFactory.f81484t, linkInfoObjD6 != null ? linkInfoObjD6.getHas_video() : null);
            jsonObject.addProperty("link_tag", PostCommentFragment.this.e4());
            String string = jsonObject.toString();
            f0.o(string, "additional.toString()");
            return string;
        }

        @Override // com.max.hbcommon.analytics.d.f
        @dl.d
        public String getPagePath() {
            return lb.d.W;
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

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class q extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29135, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29136, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29137, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c.f(PostCommentFragment.this.getString(R.string.success));
            } else {
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29138, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class r extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81827c;

        r(String str) {
            this.f81827c = str;
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29139, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (PostCommentFragment.this.isActive()) {
                super.onNext((Result) result);
                Iterator<BBSCommentsObj> it = PostCommentFragment.this.N5().iterator();
                while (it.hasNext()) {
                    BBSCommentsObj next = it.next();
                    if (next.getComment() != null && next.getComment().size() > 0) {
                        String commentid = next.getComment().get(0).getCommentid();
                        if (!com.max.hbcommon.utils.c.u(commentid) && kotlin.text.u.L1(commentid, this.f81827c, true)) {
                            it.remove();
                            if (PostCommentFragment.this.M5() != null) {
                                com.max.xiaoheihe.module.bbs.adapter.c cVarM5 = PostCommentFragment.this.M5();
                                f0.m(cVarM5);
                                cVarM5.notifyDataSetChanged();
                            }
                        }
                    }
                }
                PostCommentFragment.A5(PostCommentFragment.this);
                com.max.xiaoheihe.module.bbs.adapter.c cVarM6 = PostCommentFragment.this.M5();
                f0.m(cVarM6);
                cVarM6.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29140, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    @t0({"SMAP\nPostCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCommentFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostCommentFragment$putCommentToTop$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1630:1\n766#2:1631\n857#2,2:1632\n1855#2,2:1634\n*S KotlinDebug\n*F\n+ 1 PostCommentFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostCommentFragment$putCommentToTop$1\n*L\n1348#1:1631\n1348#1:1632,2\n1350#1:1634,2\n*E\n"})
    public static final class s extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81829c;

        s(String str) {
            this.f81829c = str;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
        public void onNext(@dl.d Result<?> result) {
            String top_comment;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29141, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (result.getMsg() != null) {
                com.max.hbutils.utils.c.f(result.getMsg());
                if (f0.g(ITagManager.SUCCESS, result.getStatus())) {
                    Iterator<BBSCommentsObj> it = PostCommentFragment.this.N5().iterator();
                    while (it.hasNext()) {
                        BBSCommentsObj next = it.next();
                        if (next.getComment() != null && next.getComment().size() > 0) {
                            String commentid = next.getComment().get(0).getCommentid();
                            if (!com.max.hbcommon.utils.c.u(commentid) && kotlin.text.u.L1(commentid, this.f81829c, true)) {
                                it.remove();
                                next.getComment().get(0).setTop_comment("1");
                                PostCommentFragment.this.N5().add(0, next);
                                break;
                            }
                        }
                    }
                    List<BBSCommentsObj> listN5 = PostCommentFragment.this.N5();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listN5) {
                        List<BBSCommentObj> comment = ((BBSCommentsObj) obj).getComment();
                        if (comment != null) {
                            f0.o(comment, "comment");
                            BBSCommentObj bBSCommentObj = (BBSCommentObj) CollectionsKt___CollectionsKt.R2(comment, 0);
                            if (bBSCommentObj != null) {
                                top_comment = bBSCommentObj.getTop_comment();
                            } else {
                                top_comment = null;
                            }
                        } else {
                            top_comment = null;
                        }
                        if (f0.g(top_comment, "1")) {
                            arrayList.add(obj);
                        }
                    }
                    String str = this.f81829c;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        List<BBSCommentObj> comment2 = ((BBSCommentsObj) it2.next()).getComment();
                        if (comment2 != null) {
                            f0.o(comment2, "comment");
                            BBSCommentObj bBSCommentObj2 = (BBSCommentObj) CollectionsKt___CollectionsKt.R2(comment2, 0);
                            if (bBSCommentObj2 != null && !f0.g(bBSCommentObj2.getCommentid(), str)) {
                                bBSCommentObj2.setTop_comment("0");
                            }
                        }
                    }
                    if (PostCommentFragment.this.M5() != null) {
                        com.max.xiaoheihe.module.bbs.adapter.c cVarM5 = PostCommentFragment.this.M5();
                        f0.m(cVarM5);
                        cVarM5.notifyDataSetChanged();
                    }
                }
            }
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29142, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class t implements ReportReasonFragment.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f81830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostCommentFragment f81831b;

        t(String str, PostCommentFragment postCommentFragment) {
            this.f81830a = str;
            this.f81831b = postCommentFragment;
        }

        @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
        public void a(@dl.d String report_reason, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{report_reason, str}, this, changeQuickRedirect, false, 29143, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(report_reason, "report_reason");
            com.max.xiaoheihe.module.bbs.utils.b.S(this.f81830a, report_reason, str, this.f81831b.b4());
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class u implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FilterButtonView f81832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostCommentFragment f81833b;

        u(FilterButtonView filterButtonView, PostCommentFragment postCommentFragment) {
            this.f81832a = filterButtonView;
            this.f81833b = postCommentFragment;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 29144, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f81832a.setChecked(true);
            this.f81832a.setText(keyDescObj.getText());
            PostCommentFragment.w5(this.f81833b, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class v extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29145, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29146, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29147, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29148, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29149, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (f0.g("1", PostCommentFragment.this.Q5())) {
                PostCommentFragment.this.S6("0");
                com.max.hbutils.utils.c.f73533a.c("已显示插眼");
            } else {
                PostCommentFragment.this.S6("1");
                com.max.hbutils.utils.c.f73533a.c("已屏蔽插眼");
            }
            PostCommentFragment.x5(PostCommentFragment.this);
            BasePostFragment.a4(PostCommentFragment.this, null, 1, null);
        }
    }

    /* JADX INFO: compiled from: PostCommentFragment.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29150, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostCommentFragment postCommentFragment = PostCommentFragment.this;
            FilterButtonView filterButtonView = postCommentFragment.E5().f112943d;
            f0.o(filterButtonView, "binding.fbvSort");
            PostCommentFragment.z5(postCommentFragment, filterButtonView, PostCommentFragment.this.A);
        }
    }

    public static final /* synthetic */ void A5(PostCommentFragment postCommentFragment) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment}, null, changeQuickRedirect, true, 29085, new Class[]{PostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postCommentFragment.i7();
    }

    private final void A6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29032, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Long> entry : this.S.entrySet()) {
            f0.o(entry, "commentItemReportStartTimeMap.entries");
            String key = entry.getKey();
            Long v10 = entry.getValue();
            f0.o(v10, "v");
            long jLongValue = jCurrentTimeMillis - v10.longValue();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", c4());
            jsonObject.addProperty("comment_id", key);
            jsonObject.addProperty("h_src", b4());
            jsonObject.addProperty("way", "close_page");
            com.max.hbcommon.analytics.d.e("2", lb.d.X, String.valueOf(com.max.hbutils.utils.w.a(jLongValue)), String.valueOf(jLongValue), jsonObject, null, true);
            arrayList.add(key);
        }
        this.S.clear();
    }

    public static final /* synthetic */ void B5(PostCommentFragment postCommentFragment) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment}, null, changeQuickRedirect, true, 29087, new Class[]{PostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postCommentFragment.j7();
    }

    private final void C5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29031, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new PostCommentFragment$addCurrentCommentItemReportData$1(this, null), 3, null);
    }

    private final void C6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29072, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N4(1);
        this.D = "prev";
    }

    public static /* synthetic */ void E6(PostCommentFragment postCommentFragment, String str, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 29045, new Class[]{PostCommentFragment.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToComment");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        postCommentFragment.D6(str, z10);
    }

    @SuppressLint({"AutoDispose"})
    private final void W5() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29079, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strN4 = n4();
        if (strN4 != null && StringsKt__StringsKt.W2(strN4, "comments", false, 2, null)) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        LinkInfoObj linkInfoObjD4 = d4();
        addDisposable((io.reactivex.disposables.b) eVarA.y6(linkInfoObjD4 != null ? linkInfoObjD4.getLinkid() : null, b4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private final PostCommentFragment$noCommentAdapterListener$2.a Y5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29009, new Class[0], PostCommentFragment$noCommentAdapterListener$2.a.class);
        return patchProxyResultProxy.isSupported ? (PostCommentFragment$noCommentAdapterListener$2.a) patchProxyResultProxy.result : (PostCommentFragment$noCommentAdapterListener$2.a) this.V.getValue();
    }

    private final void d6() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29081, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.R) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final void e6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29078, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5().f112951l.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        E5().f112951l.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.mContext, 4.0f), ViewUtils.f(this.mContext, 12.0f)));
        U6(new j(this.mContext, this.G));
        E5().f112951l.setAdapter(S5());
        RecyclerView recyclerView = E5().f112951l;
        f0.o(recyclerView, "binding.rvMorelike");
        this.Q = new com.max.xiaoheihe.module.bbs.i<>(this, recyclerView, BBSLinkObj.class);
    }

    private final void g7() {
        LoadingDialog loadingDialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29080, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.R == null) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            this.R = new LoadingDialog(mContext, "");
        }
        LoadingDialog loadingDialog2 = this.R;
        if (loadingDialog2 != null && !loadingDialog2.i()) {
            z10 = true;
        }
        if (!z10 || (loadingDialog = this.R) == null) {
            return;
        }
        loadingDialog.r();
    }

    private final void h7(FilterButtonView filterButtonView, List<? extends KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{filterButtonView, list}, this, changeQuickRedirect, false, 29049, new Class[]{FilterButtonView.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        if (activity != null) {
            f0.n(activity, "null cannot be cast to non-null type android.app.Activity");
            if (activity.isFinishing()) {
                return;
            }
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList<KeyDescObj> arrayList = new ArrayList(list);
        for (KeyDescObj keyDescObj : arrayList) {
            keyDescObj.setDesc(keyDescObj.getText());
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new u(filterButtonView, this));
        heyBoxPopupMenu.show();
    }

    private final void i7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29048, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f81791w.isEmpty() || !this.B) {
            if (f0.g("1", this.C) || !this.B) {
                E5().f112956q.setVisibility(8);
                return;
            } else {
                E5().f112956q.setVisibility(0);
                E5().f112956q.setText(R.string.all_comments_loaded);
                return;
            }
        }
        TextView textView = E5().f112956q;
        f0.o(textView, "binding.tvFooterDesc");
        textView.setVisibility(8);
        if (this.U == null) {
            LinearLayout linearLayout = E5().f112949j;
            f0.o(linearLayout, "binding.llNoCommentTip");
            linearLayout.setVisibility(8);
            TextView textView2 = E5().f112956q;
            f0.o(textView2, "binding.tvFooterDesc");
            textView2.setVisibility(0);
            E5().f112956q.setText(R.string.no_comment);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    private final void j7() {
        boolean z10;
        Result<BBSLinkTreeObj> resultF4;
        BBSLinkTreeObj result;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29040, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (g4() == null) {
            z10 = false;
        } else {
            kf.a aVarG4 = g4();
            if (f0.g("1", aVarG4 != null ? aVarG4.X() : null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        BBSCommentsObj current_comment = (f4() == null || (resultF4 = f4()) == null || (result = resultF4.getResult()) == null) ? null : result.getCurrent_comment();
        if (!z10 || current_comment == null) {
            if (ad.a.b(ad.a.f1215v, false, 2, null)) {
                E5().B.b().setVisibility(8);
                return;
            } else {
                E5().A.b().setVisibility(8);
                return;
            }
        }
        if (ad.a.b(ad.a.f1215v, false, 2, null)) {
            E5().B.b().setVisibility(0);
        } else {
            E5().A.b().setVisibility(0);
        }
        com.max.hbcommon.base.adapter.s.e eVar = ad.a.b(ad.a.f1215v, false, 2, null) ? new com.max.hbcommon.base.adapter.s.e(R.layout.item_current_comment_header_v2, E5().B.b()) : new com.max.hbcommon.base.adapter.s.e(R.layout.item_current_comment_header, E5().A.b());
        ArrayList arrayList = new ArrayList();
        arrayList.add(current_comment);
        com.max.xiaoheihe.module.bbs.adapter.c cVar = new com.max.xiaoheihe.module.bbs.adapter.c(this.mContext, arrayList, this);
        cVar.H(eVar);
        cVar.I(eVar, current_comment);
        E5().f112961v.getRoot().setVisibility(8);
    }

    private final void m6() {
        com.max.hbcommon.analytics.j jVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29020, new Class[0], Void.TYPE).isSupported || (jVar = this.N) == null) {
            return;
        }
        jVar.d();
    }

    public static final /* synthetic */ void v5(PostCommentFragment postCommentFragment) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment}, null, changeQuickRedirect, true, 29086, new Class[]{PostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postCommentFragment.d6();
    }

    private final void v6(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 29050, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.U1(this.A, keyDescObj);
        C6();
        BasePostFragment.a4(this, null, 1, null);
    }

    public static final /* synthetic */ void w5(PostCommentFragment postCommentFragment, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment, keyDescObj}, null, changeQuickRedirect, true, 29084, new Class[]{PostCommentFragment.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        postCommentFragment.v6(keyDescObj);
    }

    public static final /* synthetic */ void x5(PostCommentFragment postCommentFragment) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment}, null, changeQuickRedirect, true, 29082, new Class[]{PostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postCommentFragment.C6();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    private final void y6() {
        Object tag;
        BBSCommentObj bBSCommentObj;
        String commentid;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29030, new Class[0], Void.TYPE).isSupported && isActive()) {
            RecyclerView.LayoutManager layoutManager = E5().f112950k.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (((iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1) ? 0 : (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1) > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int[] iArr = new int[2];
                    E5().C.getLocationInWindow(iArr);
                    int measuredHeight = iArr[1] + E5().C.getMeasuredHeight();
                    if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                        while (true) {
                            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                            if (viewFindViewByPosition == null) {
                                tag = null;
                            } else {
                                if (!ic.a.f119343a.g(viewFindViewByPosition, measuredHeight)) {
                                    viewFindViewByPosition = null;
                                }
                                if (viewFindViewByPosition != null) {
                                    tag = viewFindViewByPosition.getTag(R.id.comment);
                                } else {
                                    tag = null;
                                }
                            }
                            BBSCommentsObj bBSCommentsObj = tag instanceof BBSCommentsObj ? (BBSCommentsObj) tag : null;
                            if (bBSCommentsObj != null && !com.max.hbcommon.utils.c.w(bBSCommentsObj.getComment()) && (bBSCommentObj = bBSCommentsObj.getComment().get(0)) != null && (commentid = bBSCommentObj.getCommentid()) != null) {
                                f0.o(commentid, "commentid");
                                arrayList.add(commentid);
                                if (!this.S.containsKey(commentid)) {
                                    this.S.put(commentid, Long.valueOf(jCurrentTimeMillis));
                                }
                            }
                            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                                break;
                            } else {
                                iFindFirstVisibleItemPosition++;
                            }
                        }
                    }
                    if (com.max.hbcommon.utils.c.w(arrayList)) {
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry<String, Long> entry : this.S.entrySet()) {
                        f0.o(entry, "commentItemReportStartTimeMap.entries");
                        String key = entry.getKey();
                        Long v10 = entry.getValue();
                        if (!arrayList.contains(key)) {
                            f0.o(v10, "v");
                            long jLongValue = jCurrentTimeMillis - v10.longValue();
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("link_id", c4());
                            jsonObject.addProperty("comment_id", key);
                            jsonObject.addProperty("h_src", b4());
                            jsonObject.addProperty("way", "scroll_dismiss");
                            com.max.hbcommon.analytics.d.e("2", lb.d.X, String.valueOf(com.max.hbutils.utils.w.a(jLongValue)), String.valueOf(jLongValue), jsonObject, null, true);
                            arrayList2.add(key);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        this.S.remove((String) it.next());
                    }
                }
            }
        }
    }

    public static final /* synthetic */ void z5(PostCommentFragment postCommentFragment, FilterButtonView filterButtonView, List list) {
        if (PatchProxy.proxy(new Object[]{postCommentFragment, filterButtonView, list}, null, changeQuickRedirect, true, 29083, new Class[]{PostCommentFragment.class, FilterButtonView.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        postCommentFragment.h7(filterButtonView, list);
    }

    private final void z6(LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 29039, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!f0.g("1", linkInfoObj.getDisable_comment())) {
            this.B = true;
            E5().f112953n.b0(true);
            return;
        }
        this.B = false;
        la laVarE5 = E5();
        laVarE5.f112961v.getRoot().setVisibility(8);
        if (ad.a.b(ad.a.f1215v, false, 2, null)) {
            laVarE5.B.b().setVisibility(8);
        } else {
            laVarE5.A.b().setVisibility(8);
        }
        laVarE5.C.setVisibility(8);
        laVarE5.f112956q.setVisibility(8);
        laVarE5.f112950k.setVisibility(8);
        laVarE5.f112953n.b0(false);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void A4(@dl.e Result<BBSLinkTreeObj> result) {
        BBSLinkTreeObj result2;
        BBSLinkTreeObj result3;
        BBSLinkTreeObj result4;
        BBSLinkTreeObj result5;
        LinkInfoObj link;
        BBSLinkTreeObj result6;
        if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29058, new Class[]{Result.class}, Void.TYPE).isSupported && isActive()) {
            E5().f112953n.P();
            E5().f112953n.w();
            super.A4(result);
            if (result == null) {
                kf.a aVarG4 = g4();
                if (aVarG4 != null && aVarG4.v0()) {
                    showEmpty(R.drawable.common_tag_common_45x45, "该内容已被删除");
                    return;
                } else {
                    if (getViewStatus() != 0) {
                        showError();
                        return;
                    }
                    return;
                }
            }
            Result<BBSLinkTreeObj> resultF4 = f4();
            List<BBSCommentsObj> comments = null;
            String has_more_floors = (resultF4 == null || (result6 = resultF4.getResult()) == null) ? null : result6.getHas_more_floors();
            if (has_more_floors == null) {
                has_more_floors = "1";
            }
            this.C = has_more_floors;
            E5().f112953n.V(f0.g("1", this.C));
            Result<BBSLinkTreeObj> resultF5 = f4();
            if (resultF5 != null && (result5 = resultF5.getResult()) != null && (link = result5.getLink()) != null) {
                z6(link);
            }
            W5();
            kf.a aVarG5 = g4();
            boolean z10 = aVarG5 != null ? !f0.g("1", aVarG5.X()) : false;
            if (h4() == 1) {
                this.f81791w.clear();
                j7();
                k7();
            }
            Result<BBSLinkTreeObj> resultF6 = f4();
            this.U = (resultF6 == null || (result4 = resultF6.getResult()) == null) ? null : result4.getPost_comment_no_more_info();
            Result<BBSLinkTreeObj> resultF7 = f4();
            this.T = (resultF7 == null || (result3 = resultF7.getResult()) == null) ? null : result3.getPost_comment_auto_filled_text();
            Result<BBSLinkTreeObj> resultF8 = f4();
            if (resultF8 != null && (result2 = resultF8.getResult()) != null) {
                comments = result2.getComments();
            }
            if (z10 && comments != null) {
                for (BBSCommentsObj bBSCommentsObj : comments) {
                    if (!f0.g("next", this.D) || !this.f81791w.contains(bBSCommentsObj)) {
                        if (bBSCommentsObj != null) {
                            this.f81791w.add(bBSCommentsObj);
                        }
                    }
                }
                com.max.xiaoheihe.module.bbs.adapter.c cVar = this.f81790v;
                if (cVar != null) {
                    cVar.notifyDataSetChanged();
                }
            }
            i7();
            if (!f0.g("page_style_news_content", i4())) {
                U4();
            }
            C5();
        }
    }

    public final void B6() {
        com.max.xiaoheihe.module.bbs.i<com.max.hbcommon.base.adapter.s<BBSLinkObj>> iVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29033, new Class[0], Void.TYPE).isSupported || (iVar = this.Q) == null) {
            return;
        }
        iVar.q();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void D2(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29069, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ab(str, b4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new r(str)));
    }

    public boolean D5() {
        return true;
    }

    public final void D6(@dl.e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29044, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || str == null || !(E5().f112950k.getLayoutManager() instanceof LinearLayoutManager)) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = E5().f112950k.getLayoutManager();
        f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int size = this.f81791w.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            BBSCommentsObj bBSCommentsObj = this.f81791w.get(i10);
            if (f0.g(str, !com.max.hbcommon.utils.c.w(bBSCommentsObj.getComment()) ? bBSCommentsObj.getComment().get(0).getCommentid() : null)) {
                break;
            } else {
                i10++;
            }
        }
        if (ad.a.b(ad.a.f1215v, false, 2, null)) {
            E5().B.b().getVisibility();
        } else {
            E5().A.b().getVisibility();
        }
        if (i10 != -1) {
            F6();
            linearLayoutManager.scrollToPositionWithOffset(i10, 0);
        }
    }

    @dl.d
    public final la E5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29000, new Class[0], la.class);
        if (patchProxyResultProxy.isSupported) {
            return (la) patchProxyResultProxy.result;
        }
        la laVar = this.f81787s;
        if (laVar != null) {
            return laVar;
        }
        f0.S("binding");
        return null;
    }

    @dl.e
    public final String F5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29047, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        if (linkInfoObjD4 != null) {
            return linkInfoObjD4.getComment_num();
        }
        return null;
    }

    public final void F6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29043, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5().f112942c.v0(E5().C);
    }

    @dl.e
    public final com.max.hbcommon.analytics.j G5() {
        return this.N;
    }

    public void G6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29041, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5().f112942c.v0(c6());
    }

    @dl.e
    public final com.max.hbcommon.analytics.j H5() {
        return this.K;
    }

    public final void H6(@dl.d la laVar) {
        if (PatchProxy.proxy(new Object[]{laVar}, this, changeQuickRedirect, false, 29001, new Class[]{la.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(laVar, "<set-?>");
        this.f81787s = laVar;
    }

    @dl.e
    public String I5() {
        View viewFindViewByPosition;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29035, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!(E5().f112950k.getLayoutManager() instanceof LinearLayoutManager)) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = E5().f112950k.getLayoutManager();
        f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || (viewFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null || !(viewFindViewByPosition.getTag() instanceof BBSCommentsObj)) {
            return null;
        }
        Object tag = viewFindViewByPosition.getTag();
        f0.n(tag, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.BBSCommentsObj");
        BBSCommentsObj bBSCommentsObj = (BBSCommentsObj) tag;
        if (com.max.hbcommon.utils.c.w(bBSCommentsObj.getComment())) {
            return null;
        }
        return bBSCommentsObj.getComment().get(0).getCommentid();
    }

    public final void I6(boolean z10) {
        this.O = z10;
    }

    @dl.e
    public final HBShareData J5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29051, new Class[0], HBShareData.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBShareData) patchProxyResultProxy.result;
        }
        if (d4() == null) {
            return null;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        String title = linkInfoObjD4 != null ? linkInfoObjD4.getTitle() : null;
        String strK4 = k4();
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        return new HBShareData(false, true, title, strK4, linkInfoObjD5.getShare_url(), null, l4(), q4(false), null, null, null, null, null, bb.c.k.L0, null);
    }

    public final void J6(@dl.e com.max.hbcommon.analytics.j jVar) {
        this.N = jVar;
    }

    @dl.d
    public final ArrayList<BBSLinkObj> K5() {
        return this.I;
    }

    public final void K6(boolean z10) {
        this.P = z10;
    }

    @dl.e
    public String L5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29036, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!(E5().f112950k.getLayoutManager() instanceof LinearLayoutManager)) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = E5().f112950k.getLayoutManager();
        f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if ((iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1 <= 0 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return null;
        }
        while (true) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
            if (viewFindViewByPosition != null && (viewFindViewByPosition.getTag() instanceof BBSCommentsObj)) {
                Object tag = viewFindViewByPosition.getTag();
                f0.n(tag, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.BBSCommentsObj");
                BBSCommentsObj bBSCommentsObj = (BBSCommentsObj) tag;
                if (!com.max.hbcommon.utils.c.w(bBSCommentsObj.getComment())) {
                    return bBSCommentsObj.getComment().get(0).getCommentid();
                }
            }
            if (iFindLastVisibleItemPosition == iFindFirstVisibleItemPosition) {
                return null;
            }
            iFindLastVisibleItemPosition--;
        }
    }

    public final void L6(boolean z10) {
        this.L = z10;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @dl.e
    public LinkInfoObj M1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29077, new Class[0], LinkInfoObj.class);
        return patchProxyResultProxy.isSupported ? (LinkInfoObj) patchProxyResultProxy.result : d4();
    }

    @dl.e
    public final com.max.xiaoheihe.module.bbs.adapter.c M5() {
        return this.f81790v;
    }

    public final void M6(@dl.e com.max.hbcommon.analytics.j jVar) {
        this.K = jVar;
    }

    @dl.d
    public final List<BBSCommentsObj> N5() {
        return this.f81791w;
    }

    public final void N6(boolean z10) {
        this.M = z10;
    }

    @dl.e
    public final LoadingDialog O5() {
        return this.F;
    }

    public final void O6(@dl.d ArrayList<BBSLinkObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 29006, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.I = arrayList;
    }

    @dl.e
    public final View P5() {
        return this.f81789u;
    }

    public final void P6(@dl.e com.max.xiaoheihe.module.bbs.adapter.c cVar) {
        this.f81790v = cVar;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    public void Q(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29066, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        W4(str, str2, "comment");
    }

    @dl.d
    public final String Q5() {
        return this.f81793y;
    }

    public final void Q6(@dl.e LoadingDialog loadingDialog) {
        this.F = loadingDialog;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    public void R1(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29064, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        ReportReasonFragment.f80025u.a(new t(str, this), ReportReasonFragment.ObjectType.comment, null, null, str).show(getChildFragmentManager(), "ForbidReasonFragment");
    }

    @dl.e
    public final View R5() {
        return this.f81788t;
    }

    public final void R6(@dl.e View view) {
        this.f81789u = view;
    }

    @dl.d
    public final com.max.hbcommon.base.adapter.s<BBSLinkObj> S5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29007, new Class[0], com.max.hbcommon.base.adapter.s.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.s<BBSLinkObj> sVar = this.J;
        if (sVar != null) {
            return sVar;
        }
        f0.S("mMoreLikeAdapter");
        return null;
    }

    public final void S6(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29003, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f81793y = str;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void T(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29071, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    @dl.d
    public final ArrayList<BBSLinkObj> T5() {
        return this.G;
    }

    public final void T6(@dl.e View view) {
        this.f81788t = view;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U3(@dl.e String str, @dl.e String str2) {
    }

    @dl.d
    public final String U5() {
        return this.f81792x;
    }

    public final void U6(@dl.d com.max.hbcommon.base.adapter.s<BBSLinkObj> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 29008, new Class[]{com.max.hbcommon.base.adapter.s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.J = sVar;
    }

    @dl.e
    public final BBSLinkRecObj V5() {
        return this.E;
    }

    public final void V6(@dl.d ArrayList<BBSLinkObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 29004, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.G = arrayList;
    }

    public final void W6(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29002, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f81792x = str;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void X0(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29063, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().p8(b4(), str, str2, o4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new v()));
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void X2(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29070, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new s(str)));
    }

    public int X5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29034, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        View view = this.f81789u;
        if (view != null) {
            f0.m(view);
            return view.getHeight();
        }
        View view2 = this.f81788t;
        if (view2 == null) {
            return 0;
        }
        f0.m(view2);
        return view2.getHeight();
    }

    public final void X6(@dl.e BBSLinkRecObj bBSLinkRecObj) {
        this.E = bBSLinkRecObj;
    }

    public final void Y6(@dl.e String str) {
        this.T = str;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    public void Z1(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29067, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        a5(str, str2, "comment");
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void Z3(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29057, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.d3(str, String.valueOf(h4()), BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, n1(), this.f81792x, this.f81793y, i4());
    }

    @dl.e
    public final String Z5() {
        return this.T;
    }

    public final void Z6(@dl.e String str) {
        this.f81794z = str;
    }

    @dl.e
    public final String a6() {
        return this.f81794z;
    }

    public final void a7(@dl.d ArrayList<BBSLinkObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 29005, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.H = arrayList;
    }

    @dl.d
    public final ArrayList<BBSLinkObj> b6() {
        return this.H;
    }

    public final void b7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29055, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        com.max.hbshare.d.z(this.mContext, J5());
    }

    @dl.e
    public View c6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29042, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : E5().f112942c.getChildAt(0);
    }

    public final void c7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29056, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        com.max.hbshare.d.A(this.mContext, J5());
    }

    public final void d7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29054, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        com.max.hbshare.d.B(this.mContext, J5());
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void e(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29065, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    public final void e7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29053, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        com.max.hbshare.d.C(this.mContext, J5());
    }

    public final void f6(@dl.e BBSCommentsObj bBSCommentsObj) {
        if (PatchProxy.proxy(new Object[]{bBSCommentsObj}, this, changeQuickRedirect, false, 29037, new Class[]{BBSCommentsObj.class}, Void.TYPE).isSupported || this.f81790v == null) {
            return;
        }
        List<BBSCommentsObj> list = this.f81791w;
        f0.m(bBSCommentsObj);
        list.add(0, bBSCommentsObj);
        i7();
        com.max.xiaoheihe.module.bbs.adapter.c cVar = this.f81790v;
        if (cVar != null) {
            cVar.notifyItemInserted(0);
        }
        F6();
    }

    public final void f7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29052, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        com.max.hbshare.d.D(this.mContext, J5());
    }

    public final void g6(@dl.e String str, @dl.e BBSCommentsObj bBSCommentsObj) {
        if (PatchProxy.proxy(new Object[]{str, bBSCommentsObj}, this, changeQuickRedirect, false, 29038, new Class[]{String.class, BBSCommentsObj.class}, Void.TYPE).isSupported || bBSCommentsObj == null || this.f81790v == null) {
            return;
        }
        int i10 = -1;
        int size = this.f81791w.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (f0.g(str, this.f81791w.get(i11).getComment().get(0).getCommentid())) {
                BBSCommentObj bBSCommentObj = bBSCommentsObj.getComment().get(0);
                bBSCommentObj.setIs_local(true);
                if (!this.f81791w.get(i11).getComment().contains(bBSCommentObj)) {
                    this.f81791w.get(i11).getComment().add(bBSCommentObj);
                }
                i10 = i11;
                break;
            }
        }
        com.max.xiaoheihe.module.bbs.adapter.c cVar = this.f81790v;
        if (cVar != null) {
            cVar.notifyItemChanged(i10);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void h5() {
    }

    public final boolean h6() {
        return this.O;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void i5(@dl.e String str) {
    }

    public final boolean i6() {
        return this.P;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29013, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        if (f4() == null) {
            b bVar = null;
            if (getParentFragment() instanceof b) {
                androidx.activity.result.b parentFragment = getParentFragment();
                f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment.PostCommentContainer");
                bVar = (b) parentFragment;
            } else if (getActivity() instanceof b) {
                LayoutInflater.Factory activity = getActivity();
                f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment.PostCommentContainer");
                bVar = (b) activity;
            }
            if (bVar != null) {
                A4(bVar.O1());
            }
        }
    }

    public void initViews() {
        com.max.xiaoheihe.module.bbs.adapter.c cVar;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29015, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N4(1);
        E5().f112950k.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f81790v = new com.max.xiaoheihe.module.bbs.adapter.c(this.mContext, this.f81791w, this);
        if (D5() && (cVar = this.f81790v) != null) {
            cVar.registerAdapterDataObserver(Y5());
        }
        E5().f112950k.setAdapter(this.f81790v);
        kotlin.jvm.internal.u uVar = null;
        E5().f112950k.setItemAnimator(null);
        E5().f112953n.S(new k());
        E5().f112953n.f0(new l());
        E5().f112942c.setOnVerticalScrollChangeListener(new m());
        E5().f112953n.k0(new n());
        int i10 = 2;
        this.K = new com.max.hbcommon.analytics.j(new o(), z10, i10, uVar);
        this.N = new com.max.hbcommon.analytics.j(new p(), z10, i10, uVar);
        e6();
        E5().D.setVisibility(8);
        E5().f112955p.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29011, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        la laVarD = la.d(this.mInflater, null, false);
        f0.o(laVarD, "inflate(mInflater, null, false)");
        H6(laVarD);
        setContentView(E5());
        super.installViews(view);
        O4("page_style_news_comments");
        x6();
        initViews();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void j(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29068, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().j(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q()));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void j5() {
    }

    public final boolean j6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29024, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ViewUtils.f0(E5().f112950k);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void k5(@dl.e String str) {
    }

    public final boolean k6() {
        return this.L;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    public void k7() {
        LinkInfoObj linkInfoObjD4;
        String link_tag;
        LinkInfoObj linkInfoObjD5;
        String link_tag2;
        LinkInfoObj linkInfoObjD6;
        BBSTopicObj topic;
        BBSLinkTreeObj result;
        Result<BBSLinkTreeObj> resultF4;
        BBSLinkTreeObj result2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29046, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Result<BBSLinkTreeObj> resultF5 = f4();
        List<KeyDescObj> sort_filter = ((resultF5 != null ? resultF5.getResult() : null) == null || (resultF4 = f4()) == null || (result2 = resultF4.getResult()) == null) ? null : result2.getSort_filter();
        E5().f112956q.setVisibility(0);
        Result<BBSLinkTreeObj> resultF6 = f4();
        boolean zX = com.max.hbcommon.utils.c.x((resultF6 == null || (result = resultF6.getResult()) == null) ? null : result.getCy_control());
        E5().F.setVisibility(0);
        E5().f112954o.setVisibility(zX ? 0 : 8);
        if (com.max.hbcommon.utils.c.u(F5())) {
            E5().f112955p.setText("评论");
        } else {
            E5().f112955p.setText("评论 " + F5());
        }
        E5().f112954o.setOnClickListener(new w());
        if (f0.g("page_style_video_content", i4())) {
            E5().f112954o.setVisibility(8);
        } else {
            LinkInfoObj linkInfoObjD7 = d4();
            if ((linkInfoObjD7 != null ? linkInfoObjD7.getTopic() : null) == null) {
                linkInfoObjD4 = d4();
                if (linkInfoObjD4 != null) {
                    link_tag = linkInfoObjD4.getLink_tag();
                } else {
                    link_tag = null;
                }
                if (f0.g("10", link_tag)) {
                    E5().f112954o.setVisibility(8);
                } else {
                    linkInfoObjD5 = d4();
                    if (linkInfoObjD5 != null) {
                        link_tag2 = linkInfoObjD5.getLink_tag();
                    } else {
                        link_tag2 = null;
                    }
                    if (f0.g("3", link_tag2)) {
                        E5().f112954o.setVisibility(8);
                    } else {
                        linkInfoObjD6 = d4();
                        if (f0.g("14", linkInfoObjD6 != null ? linkInfoObjD6.getLink_tag() : null)) {
                            E5().f112954o.setVisibility(8);
                        }
                    }
                }
            } else {
                LinkInfoObj linkInfoObjD8 = d4();
                if (com.max.hbcommon.utils.c.u((linkInfoObjD8 == null || (topic = linkInfoObjD8.getTopic()) == null) ? null : topic.getName())) {
                    E5().f112954o.setVisibility(8);
                } else {
                    linkInfoObjD4 = d4();
                    if (linkInfoObjD4 != null) {
                        link_tag = linkInfoObjD4.getLink_tag();
                    } else {
                        link_tag = null;
                    }
                    if (f0.g("10", link_tag)) {
                        E5().f112954o.setVisibility(8);
                    } else {
                        linkInfoObjD5 = d4();
                        if (linkInfoObjD5 != null) {
                            link_tag2 = linkInfoObjD5.getLink_tag();
                        } else {
                            link_tag2 = null;
                        }
                        if (f0.g("3", link_tag2)) {
                            E5().f112954o.setVisibility(8);
                        } else {
                            linkInfoObjD6 = d4();
                            if (f0.g("14", linkInfoObjD6 != null ? linkInfoObjD6.getLink_tag() : null)) {
                                E5().f112954o.setVisibility(8);
                            }
                        }
                    }
                }
            }
        }
        if (f0.g("20", e4()) || sort_filter == null || !(!sort_filter.isEmpty())) {
            E5().F.setVisibility(8);
            return;
        }
        E5().F.setVisibility(0);
        KeyDescObj keyDescObjN = com.max.xiaoheihe.utils.d.N(this.A);
        if (keyDescObjN == null) {
            keyDescObjN = sort_filter.get(0);
            this.A = sort_filter;
            com.max.xiaoheihe.utils.d.U1(sort_filter, keyDescObjN);
        }
        E5().f112943d.setText(keyDescObjN.getText());
        E5().F.setOnClickListener(new x());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void l5() {
    }

    public final boolean l6() {
        return this.M;
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    public void m(@dl.e BBSCommentObj bBSCommentObj, @dl.e BBSCommentObj bBSCommentObj2) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{bBSCommentObj, bBSCommentObj2}, this, changeQuickRedirect, false, 29073, new Class[]{BBSCommentObj.class, BBSCommentObj.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.m(bBSCommentObj, bBSCommentObj2);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void m5(@dl.e String str) {
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @dl.e
    public String n1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29060, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObjN = com.max.xiaoheihe.utils.d.N(this.A);
        if (keyDescObjN != null) {
            return keyDescObjN.getKey();
        }
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void n5() {
    }

    public final void n6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29019, new Class[0], Void.TYPE).isSupported || this.O) {
            return;
        }
        this.O = true;
        com.max.hbcommon.analytics.j jVar = this.N;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void o5(@dl.e String str) {
    }

    public final void o6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29018, new Class[0], Void.TYPE).isSupported && this.O) {
            this.O = false;
            com.max.hbcommon.analytics.j jVar = this.N;
            if (jVar != null) {
                jVar.f();
            }
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.max.xiaoheihe.module.bbs.adapter.c cVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29012, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        m6();
        d6();
        this.R = null;
        if (!D5() || (cVar = this.f81790v) == null) {
            return;
        }
        cVar.unregisterAdapterDataObserver(Y5());
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentHide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29017, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentHide();
        if (f0.g(i4(), "page_style_news_comments")) {
            n6();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29016, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        if (f0.g(i4(), "page_style_news_comments")) {
            o6();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onInvisible() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29027, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onInvisible();
        com.max.heybox.hblog.g.f74531b.M("reportItem onInvisible " + n0.d(getClass()).F());
        A6();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29028, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        com.max.heybox.hblog.g.f74531b.M("reportItem onPause " + n0.d(getClass()).F());
        A6();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29026, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        com.max.heybox.hblog.g.f74531b.M("reportItem onResume " + n0.d(getClass()).F());
        C5();
    }

    @Override // com.max.hbcommon.base.d
    public void onVisible() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29025, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onVisible();
        com.max.heybox.hblog.g.f74531b.M("reportItem onVisible " + n0.d(getClass()).F());
        C5();
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void p(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29062, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().p(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(str)));
    }

    public void p6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29059, new Class[0], Void.TYPE).isSupported || g4() == null) {
            return;
        }
        if (f0.g("page_style_news_comments", i4()) || f0.g("page_style_video_comments", i4()) || f0.g("page_style_wiki_comments", i4())) {
            kf.a aVarG4 = g4();
            f0.m(aVarG4);
            if (!f0.g("1", aVarG4.X())) {
                U4();
            } else {
                showEmpty(R.drawable.ic_0icon_hdeftg_2_1_46, R.string.disable_comment_placeholder);
            }
        }
    }

    public final void q6() {
        com.max.hbcommon.analytics.j jVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29023, new Class[0], Void.TYPE).isSupported || (jVar = this.K) == null) {
            return;
        }
        jVar.d();
    }

    public final void r6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29022, new Class[0], Void.TYPE).isSupported || this.L) {
            return;
        }
        this.L = true;
        com.max.hbcommon.analytics.j jVar = this.K;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void s0(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29076, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C3(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(str2, str)));
    }

    public void s6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29021, new Class[0], Void.TYPE).isSupported && this.L) {
            this.L = false;
            com.max.hbcommon.analytics.j jVar = this.K;
            if (jVar != null) {
                jVar.f();
            }
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void t3(@dl.e String str, @dl.d SubCommentView subView) {
        if (PatchProxy.proxy(new Object[]{str, subView}, this, changeQuickRedirect, false, 29074, new Class[]{String.class, SubCommentView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(subView, "subView");
        g7();
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().W4(str, subView.getmLastVal(), b4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(subView)));
    }

    public void t6(@dl.e String str, @dl.e String str2) {
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    public void u3(@dl.e BBSCommentObj bBSCommentObj) {
        if (PatchProxy.proxy(new Object[]{bBSCommentObj}, this, changeQuickRedirect, false, 29075, new Class[]{BBSCommentObj.class}, Void.TYPE).isSupported || bBSCommentObj == null) {
            return;
        }
        v0 v0Var = v0.f124986a;
        String BBS_COMMENT_SHARE_PAGE = lb.a.Z2;
        f0.o(BBS_COMMENT_SHARE_PAGE, "BBS_COMMENT_SHARE_PAGE");
        String str = String.format(BBS_COMMENT_SHARE_PAGE, Arrays.copyOf(new Object[]{bBSCommentObj.getCommentid()}, 1));
        f0.o(str, "format(format, *args)");
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.bbs_share_comment_title);
        f0.o(strN0, "getString(R.string.bbs_share_comment_title)");
        String str2 = String.format(strN0, Arrays.copyOf(new Object[]{bBSCommentObj.getUser().getUsername()}, 1));
        f0.o(str2, "format(format, *args)");
        V4(str2, com.max.xiaoheihe.utils.d.n0(R.string.bbs_share_comment_desc), str, (bBSCommentObj.getImgs() == null || f0.g("image/gif", bBSCommentObj.getImgs().get(0).getMimetype())) ? new UMImage(this.mContext, R.drawable.share_thumbnail) : new UMImage(this.mContext, bBSCommentObj.getImgs().get(0).getUrl()));
    }

    public void u6(@dl.d View v10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {v10, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29029, new Class[]{View.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(v10, "v");
        com.max.heybox.hblog.g.f74531b.M("onScrollChangeComment  " + n0.d(getClass()).F() + "  scrollY: " + i10 + "   oldScrollY: " + i11 + "  scrollState: " + i12 + "  oldScrollState: " + i13);
        int i14 = i10 - i11;
        if (g4() != null && i12 != i13) {
            kf.a aVarG4 = g4();
            f0.m(aVarG4);
            aVarG4.b3(i4(), i12);
        }
        String strI5 = i10 > X5() ? I5() : null;
        if (g4() != null) {
            kf.a aVarG5 = g4();
            f0.m(aVarG5);
            aVarG5.d1(this, i14, strI5, L5());
        }
        y6();
    }

    public void w6(@dl.e String str) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29010, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!kotlin.text.u.L1("comment", str, true)) {
            if (kotlin.text.u.L1("share", str, true)) {
                D4();
                return;
            }
            return;
        }
        FragmentActivity activity = getActivity();
        BasePostPageActivity basePostPageActivity = activity instanceof BasePostPageActivity ? (BasePostPageActivity) activity : null;
        if (basePostPageActivity != null) {
            String str2 = this.T;
            if (str2 != null && !kotlin.text.u.V1(str2)) {
                z10 = false;
            }
            if (!z10) {
                basePostPageActivity.X4(this.T);
            }
            basePostPageActivity.H3().getEditor().requestFocus();
        }
    }

    public void x6() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29014, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        this.f81794z = arguments.getString(PostPageFactory.f81471g);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.c.k0
    @SuppressLint({"AutoDispose"})
    public void y0(@dl.e String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29061, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d4(str, o4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(z10, str)));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void y4(@dl.e String str) {
    }
}
