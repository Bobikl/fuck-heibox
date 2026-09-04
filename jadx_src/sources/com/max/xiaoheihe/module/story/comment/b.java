package com.max.xiaoheihe.module.story.comment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentsObj;
import com.max.xiaoheihe.bean.bbs.BBSCreateCommentResult;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.bean.bbs.HighlightInfo;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.RecommendStateObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.WebWithNativeRecommendInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.AddAtUserActivity;
import com.max.xiaoheihe.module.bbs.adapter.x;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.bb0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import oe.t;

/* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryCommentEditorDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryCommentEditorDialog.kt\ncom/max/xiaoheihe/module/story/comment/StoryCommentEditorDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,667:1\n1#2:668\n162#3,8:669\n*S KotlinDebug\n*F\n+ 1 StoryCommentEditorDialog.kt\ncom/max/xiaoheihe/module/story/comment/StoryCommentEditorDialog\n*L\n650#1:669,8\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b extends com.max.hbcommon.base.swipeback.a implements com.max.hbexpression.q.a, com.max.hbexpression.q.b {
    public static final int G = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private androidx.activity.result.g<Intent> A;
    private boolean B;
    private androidx.activity.result.g<Intent> C;

    @dl.e
    private yh.a<b2> D;
    private boolean E;

    @dl.d
    private k F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final com.max.hbstory.d f92003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f92004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final yh.l<BBSCommentsObj, b2> f92005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final yh.p<String, BBSCommentsObj, b2> f92006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private bb0 f92007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private BaseBottomEditorBar f92008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private LoadingDialog f92009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private String f92010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private io.reactivex.disposables.a f92011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f92012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private WebWithNativeRecommendInfoObj f92013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f92014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f92015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private BBSLinkRecObj f92016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private String f92017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final List<BBSCommentsObj> f92018y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.bbs.adapter.c f92019z;

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class a extends com.max.hbcommon.network.d<BBSCreateCommentResult<BBSFloorCommentObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92021c;

        a(BaseBottomEditorBar baseBottomEditorBar) {
            this.f92021c = baseBottomEditorBar;
        }

        public void a(@dl.d BBSCreateCommentResult<BBSFloorCommentObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43632, new Class[]{BBSCreateCommentResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (b.this.B) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(b.this.getString(R.string.comment_success));
                } else {
                    com.max.hbutils.utils.c.f73533a.c(result.getMsg());
                }
                b.this.M4(result.getResult());
                b.l4(b.this, this.f92021c.getLocalRecommendState());
                if (b.this.f92009p != null) {
                    LoadingDialog loadingDialog = b.this.f92009p;
                    f0.m(loadingDialog);
                    loadingDialog.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43630, new Class[0], Void.TYPE).isSupported && b.this.B) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43631, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (b.this.B) {
                super.onError(e10);
                if (b.this.f92009p != null) {
                    LoadingDialog loadingDialog = b.this.f92009p;
                    f0.m(loadingDialog);
                    loadingDialog.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43633, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSCreateCommentResult) obj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.story.comment.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class C0866b implements t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92022a;

        C0866b(BaseBottomEditorBar baseBottomEditorBar) {
            this.f92022a = baseBottomEditorBar;
        }

        @Override // oe.t
        public void onCancel() {
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 43634, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LocalMedia localMedia = arrayList.get(i10);
                    if (localMedia != null) {
                        this.f92022a.getImgPathList().add(localMedia.G());
                    }
                }
            }
            x mUploadImgShowerAdapter = this.f92022a.getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                mUploadImgShowerAdapter.r(this.f92022a.getImgPathList());
            }
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class c implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92024b;

        c(BaseBottomEditorBar baseBottomEditorBar) {
            this.f92024b = baseBottomEditorBar;
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
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 43635, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            b bVar = b.this;
            String strP0 = com.max.xiaoheihe.utils.d.p0(strArr);
            f0.o(strP0, "getStringFromArray(urls)");
            bVar.f92010q = strP0;
            if (com.max.hbcommon.utils.c.u(b.this.f92010q) && com.max.hbcommon.utils.c.u(this.f92024b.getEditor().getContentText()) && !this.f92024b.N()) {
                return;
            }
            b.V3(b.this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.e String str) {
            LoadingDialog loadingDialog;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43636, new Class[]{String.class}, Void.TYPE).isSupported || (loadingDialog = b.this.f92009p) == null) {
                return;
            }
            loadingDialog.c();
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void onNext(@dl.d Result<UserPostLimitsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43637, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (b.this.B) {
                super.onNext(result);
                b.this.E = true;
                UserPostLimitsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                Integer numValueOf = Integer.valueOf(com.max.hbutils.utils.n.q(result2.getMax_input_limit_post_comment()));
                if (!(numValueOf.intValue() > 0)) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    b bVar = b.this;
                    int iIntValue = numValueOf.intValue();
                    BaseBottomEditorBar baseBottomEditorBar = bVar.f92008o;
                    if (baseBottomEditorBar == null) {
                        return;
                    }
                    baseBottomEditorBar.setPostCommentTextNumMaxLimit(iIntValue);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43638, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92026b;

        e(BaseBottomEditorBar baseBottomEditorBar) {
            this.f92026b = baseBottomEditorBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43639, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f92026b.g0();
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f92028c;

        f(BaseBottomEditorBar baseBottomEditorBar, b bVar) {
            this.f92027b = baseBottomEditorBar;
            this.f92028c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43640, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intentN1 = AddAtUserActivity.N1(this.f92027b.getContext(), i0.j());
            androidx.activity.result.g gVar = this.f92028c.A;
            if (gVar == null) {
                f0.S("atLauncher");
                gVar = null;
            }
            gVar.b(intentN1);
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f92030c;

        g(BaseBottomEditorBar baseBottomEditorBar, b bVar) {
            this.f92029b = baseBottomEditorBar;
            this.f92030c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43641, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SearchNewActivity.a aVar = SearchNewActivity.M;
            Context context = this.f92029b.getContext();
            f0.o(context, "context");
            Intent intentA = aVar.a(context);
            androidx.activity.result.g gVar = this.f92030c.C;
            if (gVar == null) {
                f0.S("gameResultLauncher");
                gVar = null;
            }
            gVar.b(intentA);
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f92032c;

        h(BaseBottomEditorBar baseBottomEditorBar, b bVar) {
            this.f92031b = baseBottomEditorBar;
            this.f92032c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43642, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f92031b.O()) {
                b.d4(this.f92032c, this.f92031b);
            } else {
                b.k4(this.f92032c, this.f92031b);
            }
            this.f92031b.h0();
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43643, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.f4(b.this);
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f92035c;

        j(BaseBottomEditorBar baseBottomEditorBar, b bVar) {
            this.f92034b = baseBottomEditorBar;
            this.f92035c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = false;
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43644, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(this.f92034b.getContext()) && i0.d(this.f92034b.getContext())) {
                if (!this.f92034b.R()) {
                    if (!com.max.hbcommon.utils.c.u(this.f92034b.getEditor().getContentText()) || (this.f92034b.N() && this.f92034b.getImgPathList().size() > 0)) {
                        b.X3(this.f92035c);
                        return;
                    } else {
                        com.max.hbutils.utils.c.f(this.f92035c.getString(R.string.content_empty_msg));
                        return;
                    }
                }
                if (com.max.hbcommon.utils.c.u(this.f92034b.getEditor().getContentText()) && !this.f92034b.N()) {
                    com.max.hbutils.utils.c.d(this.f92035c.getString(R.string.content_empty_msg));
                    return;
                }
                LoadingDialog loadingDialog = this.f92035c.f92009p;
                if (loadingDialog != null && loadingDialog.i()) {
                    z10 = true;
                }
                if (!z10) {
                    b bVar = this.f92035c;
                    Context context = this.f92034b.getContext();
                    f0.o(context, "context");
                    bVar.f92009p = new LoadingDialog(context, this.f92035c.getString(R.string.commiting), true).r();
                }
                b.g4(this.f92035c);
            }
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class k implements x.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
        public void i0() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43645, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            b.f4(b.this);
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
        public void m3(int i10) {
            BaseBottomEditorBar baseBottomEditorBar;
            if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43646, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && (baseBottomEditorBar = b.this.f92008o) != null && baseBottomEditorBar.getImgPathList().size() > 0 && i10 >= 0 && i10 < baseBottomEditorBar.getImgPathList().size()) {
                baseBottomEditorBar.getImgPathList().remove(i10);
                x mUploadImgShowerAdapter = baseBottomEditorBar.getMUploadImgShowerAdapter();
                if (mUploadImgShowerAdapter != null) {
                    mUploadImgShowerAdapter.notifyItemRemoved(i10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class l implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.hbpermission.c
        public final void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43647, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            b.W3(b.this);
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class m implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 43649, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            BaseBottomEditorBar baseBottomEditorBar;
            ExpressionEditText editor;
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 43648, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == -1) {
                Intent intentA = activityResult.a();
                Serializable serializableExtra = intentA != null ? intentA.getSerializableExtra(com.max.hbsearch.l.B) : null;
                GameObj gameObj = serializableExtra instanceof GameObj ? (GameObj) serializableExtra : null;
                if (gameObj == null || (baseBottomEditorBar = b.this.f92008o) == null || (editor = baseBottomEditorBar.getEditor()) == null) {
                    return;
                }
                editor.x(gameObj);
            }
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43650, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Dialog dialog = b.this.getDialog();
            if (dialog != null && dialog.isShowing()) {
                b.this.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43651, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseBottomEditorBar baseBottomEditorBar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43652, new Class[]{View.class}, Void.TYPE).isSupported || (baseBottomEditorBar = b.this.f92008o) == null) {
                return;
            }
            b.d4(b.this, baseBottomEditorBar);
        }
    }

    /* JADX INFO: compiled from: StoryCommentEditorDialog.kt */
    public static final class q implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseBottomEditorBar f92042a;

        q(BaseBottomEditorBar baseBottomEditorBar) {
            this.f92042a = baseBottomEditorBar;
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 43654, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            Editable text;
            boolean z10 = false;
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 43653, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == -1) {
                if (this.f92042a.getEditor().getSelectionEnd() > 0) {
                    Editable text2 = this.f92042a.getEditor().getText();
                    if (text2 != null && text2.charAt(this.f92042a.getEditor().getSelectionEnd() - 1) == '@') {
                        z10 = true;
                    }
                    if (z10 && (text = this.f92042a.getEditor().getText()) != null) {
                        text.replace(this.f92042a.getEditor().getSelectionEnd() - 1, this.f92042a.getEditor().getSelectionEnd(), "");
                    }
                }
                ExpressionEditText editor = this.f92042a.getEditor();
                int selectionEnd = this.f92042a.getEditor().getSelectionEnd();
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

    /* JADX WARN: Multi-variable type inference failed */
    public b(@dl.d com.max.hbstory.d storyContext, int i10, @dl.d yh.l<? super BBSCommentsObj, b2> commentCallback, @dl.d yh.p<? super String, ? super BBSCommentsObj, b2> replyCommentCallback) {
        f0.p(storyContext, "storyContext");
        f0.p(commentCallback, "commentCallback");
        f0.p(replyCommentCallback, "replyCommentCallback");
        this.f92003j = storyContext;
        this.f92004k = i10;
        this.f92005l = commentCallback;
        this.f92006m = replyCommentCallback;
        this.f92010q = "";
        this.f92017x = "1";
        this.f92018y = new ArrayList();
        this.F = new k();
    }

    private final RecommendStateObj A4() {
        return null;
    }

    private final void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43597, new Class[0], Void.TYPE).isSupported || this.E) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b6(s0.z()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private final Map<String, String> C4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43607, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        Map<String, String> mapX = l0.X(this.f92016w);
        return mapX == null ? new HashMap(16) : mapX;
    }

    private final void F4(BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar}, this, changeQuickRedirect, false, 43617, new Class[]{BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        baseBottomEditorBar.setEmojiShowing(false);
        if (baseBottomEditorBar.getExpressionShowFragment() != null) {
            baseBottomEditorBar.setExpressionImageResource(R.drawable.bbs_emoji_filled_24x24);
            com.max.hbexpression.q expressionShowFragment = baseBottomEditorBar.getExpressionShowFragment();
            f0.m(expressionShowFragment);
            expressionShowFragment.C();
        }
        if (baseBottomEditorBar.getEditor().requestFocus()) {
            ViewUtils.s0(baseBottomEditorBar.getEditor());
        }
    }

    private final void G4(BaseBottomEditorBar baseBottomEditorBar) {
        ConstraintLayout constraintLayoutB;
        Window window;
        Window window2;
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar}, this, changeQuickRedirect, false, 43618, new Class[]{BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewUtils.s0(baseBottomEditorBar.getEditor());
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setSoftInputMode(16);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            com.max.hbutils.utils.t.u(window);
            window.setNavigationBarColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
        }
        bb0 bb0Var = this.f92007n;
        if (bb0Var == null || (constraintLayoutB = bb0Var.b()) == null) {
            return;
        }
        constraintLayoutB.setPadding(constraintLayoutB.getPaddingLeft(), constraintLayoutB.getPaddingTop(), constraintLayoutB.getPaddingRight(), com.max.hbutils.utils.t.f73585f);
    }

    private final void H4(BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar}, this, changeQuickRedirect, false, 43598, new Class[]{BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        baseBottomEditorBar.I(this.F);
        baseBottomEditorBar.setIvCYVisible(true);
        baseBottomEditorBar.setCYOnClickListener(new e(baseBottomEditorBar));
        baseBottomEditorBar.setIvAtVisible(true);
        baseBottomEditorBar.setAtOnClickListener(new f(baseBottomEditorBar, this));
        baseBottomEditorBar.setAddGameOnClickListener(new g(baseBottomEditorBar, this));
        baseBottomEditorBar.setExpressionOnClickListener(new h(baseBottomEditorBar, this));
        baseBottomEditorBar.setAddOnClickListener(new i());
        baseBottomEditorBar.setSendOnClickListener(new j(baseBottomEditorBar, this));
    }

    private final void I4(BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar}, this, changeQuickRedirect, false, 43595, new Class[]{BaseBottomEditorBar.class}, Void.TYPE).isSupported || baseBottomEditorBar == null) {
            return;
        }
        G4(baseBottomEditorBar);
        m4(baseBottomEditorBar);
        H4(baseBottomEditorBar);
    }

    private final void J4(BBSCommentsObj bBSCommentsObj) {
        if (PatchProxy.proxy(new Object[]{bBSCommentsObj}, this, changeQuickRedirect, false, 43610, new Class[]{BBSCommentsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f92005l.invoke(bBSCommentsObj);
    }

    private final void K4(String str, BBSCommentsObj bBSCommentsObj) {
        if (PatchProxy.proxy(new Object[]{str, bBSCommentsObj}, this, changeQuickRedirect, false, 43609, new Class[]{String.class, BBSCommentsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f92006m.invoke(str, bBSCommentsObj);
    }

    private final void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43590, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            PermissionManager.f71603a.S(fragmentActivity, new l());
        }
    }

    private final void N4() {
        BaseBottomEditorBar baseBottomEditorBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43611, new Class[0], Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null) {
            return;
        }
        ViewUtils.X(baseBottomEditorBar.getEditor());
        baseBottomEditorBar.getEditor().clearFocus();
        n4();
    }

    private final void O4() {
        BaseBottomEditorBar baseBottomEditorBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43591, new Class[0], Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null) {
            return;
        }
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new q(baseBottomEditorBar));
        f0.o(gVarRegisterForActivityResult, "{\n            atLauncher…er = atLauncher\n        }");
        this.A = gVarRegisterForActivityResult;
        ExpressionEditText editor = baseBottomEditorBar.getEditor();
        androidx.activity.result.g<Intent> gVar = this.A;
        if (gVar == null) {
            f0.S("atLauncher");
            gVar = null;
        }
        editor.E = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    private final void P4() {
        BaseBottomEditorBar baseBottomEditorBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43599, new Class[0], Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null || !i0.g(getContext())) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(baseBottomEditorBar.getEditor().getContentText()) || baseBottomEditorBar.N()) {
            LoadingDialog loadingDialog = this.f92009p;
            if (loadingDialog != null) {
                f0.m(loadingDialog);
                if (!loadingDialog.i()) {
                    Context context = baseBottomEditorBar.getContext();
                    f0.o(context, "it.context");
                    this.f92009p = new LoadingDialog(context, getString(R.string.commiting), true).r();
                }
            } else {
                Context context2 = baseBottomEditorBar.getContext();
                f0.o(context2, "it.context");
                this.f92009p = new LoadingDialog(context2, getString(R.string.commiting), true).r();
            }
            o4();
        }
    }

    private final void Q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43613, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N4();
        this.f92015v = "-1";
        this.f92014u = "-1";
        BaseBottomEditorBar baseBottomEditorBar = this.f92008o;
        if (baseBottomEditorBar != null) {
            baseBottomEditorBar.b0();
        }
    }

    public static final /* synthetic */ void V3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43628, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.o4();
    }

    private final void V4(String str, String str2) {
        BaseBottomEditorBar baseBottomEditorBar;
        com.max.xiaoheihe.module.bbs.adapter.c cVar;
        View.OnClickListener editorClickListener;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 43605, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null || !this.B || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        this.f92017x = str;
        baseBottomEditorBar.setRecommendCheck(com.max.hbcommon.utils.c.x(str));
        if (i0.s()) {
            try {
                if (!com.max.hbcommon.utils.c.w(this.f92018y)) {
                    int size = this.f92018y.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f92018y.get(i10).setRecommendStateForResult(i0.j(), str) && (cVar = this.f92019z) != null) {
                            cVar.notifyItemChanged(i10);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (!com.max.hbcommon.utils.c.x(str2) || !i0.s() || this.f92012s || (editorClickListener = baseBottomEditorBar.getEditorClickListener()) == null) {
            return;
        }
        editorClickListener.onClick(baseBottomEditorBar.getEditor());
    }

    public static final /* synthetic */ void W3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43627, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.q4();
    }

    public static final /* synthetic */ void X3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43626, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.r4();
    }

    private final void Y4(BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar}, this, changeQuickRedirect, false, 43616, new Class[]{BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewUtils.X(baseBottomEditorBar.getEditor());
        baseBottomEditorBar.setEmojiShowing(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        f0.o(childFragmentManager, "childFragmentManager");
        baseBottomEditorBar.setVgExpressionVisible(childFragmentManager, true);
    }

    private final void Z4() {
        BaseBottomEditorBar baseBottomEditorBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43614, new Class[0], Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null || this.f92013t == null) {
            return;
        }
        if (i0.s()) {
            baseBottomEditorBar.getEditor().setEnabled(!this.f92012s);
        }
        String comment_hint = null;
        if (this.f92012s) {
            WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj = this.f92013t;
            if (webWithNativeRecommendInfoObj != null) {
                comment_hint = webWithNativeRecommendInfoObj.getCommented_hint();
            }
        } else {
            WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj2 = this.f92013t;
            if (webWithNativeRecommendInfoObj2 != null) {
                comment_hint = webWithNativeRecommendInfoObj2.getComment_hint();
            }
        }
        if (comment_hint != null) {
            baseBottomEditorBar.setDefaultEditTextHint(comment_hint);
            baseBottomEditorBar.getEditor().setHint(comment_hint);
        }
    }

    private final void a5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43606, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        this.f92017x = str;
        V4(str, null);
    }

    public static final /* synthetic */ void d4(b bVar, BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{bVar, baseBottomEditorBar}, null, changeQuickRedirect, true, 43622, new Class[]{b.class, BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.F4(baseBottomEditorBar);
    }

    public static final /* synthetic */ void f4(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43624, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.L4();
    }

    public static final /* synthetic */ void g4(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43625, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.P4();
    }

    public static final /* synthetic */ void k4(b bVar, BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{bVar, baseBottomEditorBar}, null, changeQuickRedirect, true, 43623, new Class[]{b.class, BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.Y4(baseBottomEditorBar);
    }

    public static final /* synthetic */ void l4(b bVar, String str) {
        if (PatchProxy.proxy(new Object[]{bVar, str}, null, changeQuickRedirect, true, 43629, new Class[]{b.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.a5(str);
    }

    private final void m4(BaseBottomEditorBar baseBottomEditorBar) {
        if (PatchProxy.proxy(new Object[]{baseBottomEditorBar}, this, changeQuickRedirect, false, 43596, new Class[]{BaseBottomEditorBar.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i0.s()) {
            BaseBottomEditorBar baseBottomEditorBar2 = this.f92008o;
            if ((baseBottomEditorBar2 == null || baseBottomEditorBar2.Q()) ? false : true) {
                B4();
            }
        }
        baseBottomEditorBar.B();
    }

    private final void n4() {
        BaseBottomEditorBar baseBottomEditorBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43612, new Class[0], Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null) {
            return;
        }
        Z4();
        baseBottomEditorBar.w();
        this.f92015v = "-1";
        this.f92014u = "-1";
        baseBottomEditorBar.b0();
    }

    private final void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43615, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p4(null, null);
    }

    @SuppressLint({"AutoDispose"})
    private final void p4(String str, String str2) {
        BaseBottomEditorBar baseBottomEditorBar;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 43604, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null) {
            return;
        }
        HashMap map = new HashMap();
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            f0.m(str2);
            map.put("Cookie", str2);
        }
        String contentText = baseBottomEditorBar.getEditor().getContentText();
        f0.o(contentText, "editor.contentText");
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V4(s4(), map, t4(), contentText, this.f92015v, this.f92014u, this.f92010q, baseBottomEditorBar.N() ? "1" : "0", (this.f92013t == null || baseBottomEditorBar.R()) ? null : baseBottomEditorBar.getLocalRecommendState(), str, C4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(baseBottomEditorBar)));
    }

    private final void q4() {
        BaseBottomEditorBar baseBottomEditorBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43592, new Class[0], Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null) {
            return;
        }
        com.max.mediaselector.e.i(getContext(), baseBottomEditorBar.getImgPathList().size() > 0 ? 9 - baseBottomEditorBar.getImgPathList().size() : 9, new C0866b(baseBottomEditorBar));
    }

    private final void r4() {
        BaseBottomEditorBar baseBottomEditorBar;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43601, new Class[0], Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null || !i0.g(baseBottomEditorBar.getContext())) {
            return;
        }
        LoadingDialog loadingDialog = this.f92009p;
        if (loadingDialog != null && loadingDialog.i()) {
            z10 = true;
        }
        if (!z10) {
            Context context = baseBottomEditorBar.getContext();
            f0.o(context, "context");
            this.f92009p = new LoadingDialog(context, getString(R.string.commiting), true).r();
        }
        if (baseBottomEditorBar.getImgPathList().size() > 0) {
            this.f92010q = "";
            com.max.xiaoheihe.module.upload.g.h(baseBottomEditorBar.getContext(), getCompositeDisposable(), baseBottomEditorBar.getImgPathList(), "bbs", new c(baseBottomEditorBar));
        } else {
            this.f92010q = "";
            o4();
        }
    }

    private final String s4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43602, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObjM = StoryUtilsKt.m(this.f92003j, this.f92004k);
        if (storyItemsObjM != null) {
            return storyItemsObjM.getH_src();
        }
        return null;
    }

    private final String t4() {
        StoryCardIdInfoObj card_id_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43603, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StoryItemsObj storyItemsObjM = StoryUtilsKt.m(this.f92003j, this.f92004k);
        if (storyItemsObjM == null || (card_id_info = storyItemsObjM.getCard_id_info()) == null) {
            return null;
        }
        return card_id_info.getItem_id();
    }

    @dl.d
    public final yh.p<String, BBSCommentsObj, b2> D4() {
        return this.f92006m;
    }

    @dl.d
    public final com.max.hbstory.d E4() {
        return this.f92003j;
    }

    public final void M4(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        RecommendStateObj recommendStateObjA4;
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 43608, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dismiss();
        BaseBottomEditorBar baseBottomEditorBar = this.f92008o;
        if (baseBottomEditorBar == null) {
            return;
        }
        if (!baseBottomEditorBar.R()) {
            this.f92012s = true;
            Z4();
        }
        if (bBSFloorCommentObj != null) {
            baseBottomEditorBar.setEditAddCY(false);
            baseBottomEditorBar.setCYIconColor(R.color.text_secondary_1_color);
            if (baseBottomEditorBar.R() || bBSFloorCommentObj.getComment() == null) {
                K4(this.f92015v, bBSFloorCommentObj.getComment());
            } else {
                if (i0.s() && (recommendStateObjA4 = A4()) != null) {
                    bBSFloorCommentObj.getComment().setRecommendExtraForResult(i0.j(), recommendStateObjA4.getExtra());
                }
                J4(bBSFloorCommentObj.getComment());
            }
            baseBottomEditorBar.getImgPathList().clear();
            x mUploadImgShowerAdapter = baseBottomEditorBar.getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                mUploadImgShowerAdapter.r(baseBottomEditorBar.getImgPathList());
            }
            this.f92010q = "";
            Q4();
            if (bBSFloorCommentObj.getReply_push_state() != null && f0.g("1", bBSFloorCommentObj.getReply_push_state().getPush_state())) {
                v.a(baseBottomEditorBar.getContext(), v.f95761b, null);
            }
        }
    }

    public final void R4(@dl.d String string) {
        ExpressionEditText editor;
        if (PatchProxy.proxy(new Object[]{string}, this, changeQuickRedirect, false, 43585, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(string, "string");
        BaseBottomEditorBar baseBottomEditorBar = this.f92008o;
        if (baseBottomEditorBar == null || (editor = baseBottomEditorBar.getEditor()) == null) {
            return;
        }
        editor.setContentText(string);
    }

    public final void S4(@dl.e String str) {
        BaseBottomEditorBar baseBottomEditorBar;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43587, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null && !u.V1(str)) {
            z10 = false;
        }
        if (z10 || (baseBottomEditorBar = this.f92008o) == null) {
            return;
        }
        baseBottomEditorBar.setDefaultEditTextHint(str);
        baseBottomEditorBar.getEditor().setHint(str);
    }

    public final void T4(@dl.e com.max.xiaoheihe.module.bbs.adapter.c cVar) {
        this.f92019z = cVar;
    }

    public final void U4(@dl.e BBSLinkRecObj bBSLinkRecObj) {
        this.f92016w = bBSLinkRecObj;
    }

    public final void W4(@dl.d yh.a<b2> onDismissListener) {
        if (PatchProxy.proxy(new Object[]{onDismissListener}, this, changeQuickRedirect, false, 43581, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onDismissListener, "onDismissListener");
        this.D = onDismissListener;
    }

    public final void X4(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        BaseBottomEditorBar baseBottomEditorBar;
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 43589, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported || (baseBottomEditorBar = this.f92008o) == null) {
            return;
        }
        baseBottomEditorBar.c0(str, str2, str3);
    }

    public final void b5(@dl.d String rootID, @dl.d String replyID) {
        if (PatchProxy.proxy(new Object[]{rootID, replyID}, this, changeQuickRedirect, false, 43600, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootID, "rootID");
        f0.p(replyID, "replyID");
        this.f92015v = rootID;
        this.f92014u = replyID;
    }

    @Override // com.max.hbcommon.base.swipeback.a, androidx.fragment.app.j
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43588, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BaseBottomEditorBar baseBottomEditorBar = this.f92008o;
        ViewUtils.X(baseBottomEditorBar != null ? baseBottomEditorBar.getEditor() : null);
        super.dismiss();
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        bb0 bb0Var;
        BottomEditorBar bottomEditorBar;
        BaseBottomEditorBar bottomEditorBar2;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43620, new Class[]{View.class}, Void.TYPE).isSupported || (bb0Var = this.f92007n) == null || (bottomEditorBar = bb0Var.f108896c) == null || (bottomEditorBar2 = bottomEditorBar.getInstance()) == null) {
            return;
        }
        bottomEditorBar2.expressionDeleteClick(view);
    }

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        bb0 bb0Var;
        BottomEditorBar bottomEditorBar;
        BaseBottomEditorBar bottomEditorBar2;
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 43619, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported || (bb0Var = this.f92007n) == null || (bottomEditorBar = bb0Var.f108896c) == null || (bottomEditorBar2 = bottomEditorBar.getInstance()) == null) {
            return;
        }
        bottomEditorBar2.o0(expressionObj);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43584, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        this.B = true;
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 43583, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new m());
        f0.o(gVarRegisterForActivityResult, "override fun onCreate(sa…        }\n        }\n    }");
        this.C = gVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        View mask;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 43593, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        bb0 bb0VarC = bb0.c(LayoutInflater.from(getContext()));
        f0.o(bb0VarC, "inflate(LayoutInflater.from(context))");
        this.f92007n = bb0VarC;
        ConstraintLayout constraintLayoutB = bb0VarC.b();
        f0.o(constraintLayoutB, "binding.root");
        constraintLayoutB.setOnClickListener(new n());
        this.f92008o = bb0VarC.f108896c.getInstance();
        O4();
        BaseBottomEditorBar baseBottomEditorBar = this.f92008o;
        if (baseBottomEditorBar != null) {
            baseBottomEditorBar.e0(false);
        }
        BaseBottomEditorBar baseBottomEditorBar2 = this.f92008o;
        if (baseBottomEditorBar2 != null && (mask = baseBottomEditorBar2.getMask()) != null) {
            mask.setOnClickListener(new o());
        }
        BaseBottomEditorBar baseBottomEditorBar3 = this.f92008o;
        if (baseBottomEditorBar3 != null) {
            baseBottomEditorBar3.setEditorClickListener(new p());
        }
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43621, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        clearCompositeDisposable();
        this.f92011r = null;
        this.B = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 43582, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        yh.a<b2> aVar = this.D;
        if (aVar != null) {
            aVar.invoke();
        }
        this.D = null;
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 43594, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        I4(this.f92008o);
        BaseBottomEditorBar baseBottomEditorBar = this.f92008o;
        ViewUtils.s0(baseBottomEditorBar != null ? baseBottomEditorBar.getEditor() : null);
    }

    @dl.d
    public final yh.l<BBSCommentsObj, b2> u4() {
        return this.f92005l;
    }

    @dl.e
    public final String v4() {
        ExpressionEditText editor;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43586, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        BaseBottomEditorBar baseBottomEditorBar = this.f92008o;
        if (baseBottomEditorBar == null || (editor = baseBottomEditorBar.getEditor()) == null) {
            return null;
        }
        return editor.getContentText();
    }

    @dl.e
    public final com.max.xiaoheihe.module.bbs.adapter.c w4() {
        return this.f92019z;
    }

    @dl.d
    public final List<BBSCommentsObj> x4() {
        return this.f92018y;
    }

    public final int y4() {
        return this.f92004k;
    }

    @dl.e
    public final BBSLinkRecObj z4() {
        return this.f92016w;
    }
}
