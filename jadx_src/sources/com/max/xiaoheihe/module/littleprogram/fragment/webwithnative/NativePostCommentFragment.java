package com.max.xiaoheihe.module.littleprogram.fragment.webwithnative;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbpermission.PermissionManager;
import com.max.hbsearch.SearchNewActivity;
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
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.RecommendStateObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.WebWithNativeRecommendInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.AddAtUserActivity;
import com.max.xiaoheihe.module.bbs.LikeAnimResourceManager;
import com.max.xiaoheihe.module.bbs.adapter.x;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment;
import com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.expression.widget.ExpressionEditText;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import oe.t;

/* JADX INFO: compiled from: NativePostCommentFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nNativePostCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativePostCommentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/webwithnative/NativePostCommentFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1004:1\n262#2,2:1005\n*S KotlinDebug\n*F\n+ 1 NativePostCommentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/webwithnative/NativePostCommentFragment\n*L\n327#1:1005,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class NativePostCommentFragment extends PostCommentFragment implements com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b, x.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b {

    @dl.d
    public static final a R3 = new a(null);
    public static final int S3 = 8;

    @dl.d
    public static final String T3 = "bottom_bar_Color";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private String G3;
    private androidx.activity.result.g<Intent> K3;
    private boolean M3;

    @dl.e
    private WebWithNativeRecommendInfoObj N3;
    private boolean P3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f89319b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private String f89320c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f89321p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private BottomEditorBar f89322p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private String f89324x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.e
    private String f89325x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private BottomEditorBarPostPageImpl f89326y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.e
    private String f89327y2;
    private final int Y = 3;

    @dl.d
    private final String Z = "NativePostCommentFragment";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private final String f89318a0 = "window.changeLikeStatus";

    @dl.d
    private HashMap<String, String> G2 = new HashMap<>();

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f89323p3 = true;
    private boolean J3 = true;

    @dl.d
    private String L3 = "";

    @dl.e
    private String O3 = "1";

    @dl.d
    private List<RecommendStateObj> Q3 = new ArrayList();

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final NativePostCommentFragment a(@dl.e String str, boolean z10, @dl.e WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), webWithNativeRecommendInfoObj, str2}, this, changeQuickRedirect, false, 39679, new Class[]{String.class, Boolean.TYPE, WebWithNativeRecommendInfoObj.class, String.class}, NativePostCommentFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (NativePostCommentFragment) patchProxyResultProxy.result;
            }
            NativePostCommentFragment nativePostCommentFragment = new NativePostCommentFragment();
            Bundle bundle = new Bundle();
            bundle.putString("link_id", str);
            bundle.putBoolean(WebviewFragment.P4, z10);
            bundle.putSerializable(WebWithNativeContainerFragment.F, webWithNativeRecommendInfoObj);
            bundle.putString(NativePostCommentFragment.T3, str2);
            nativePostCommentFragment.setArguments(bundle);
            return nativePostCommentFragment;
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<BBSCreateCommentResult<BBSFloorCommentObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void a(@dl.d BBSCreateCommentResult<BBSFloorCommentObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39682, new Class[]{BBSCreateCommentResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (NativePostCommentFragment.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(NativePostCommentFragment.this.getString(R.string.comment_success));
                } else {
                    com.max.hbutils.utils.c.f73533a.c(result.getMsg());
                }
                NativePostCommentFragment.this.o8(result.getResult());
                NativePostCommentFragment.l7(NativePostCommentFragment.this);
                NativePostCommentFragment nativePostCommentFragment = NativePostCommentFragment.this;
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = nativePostCommentFragment.f89326y1;
                if (bottomEditorBarPostPageImpl == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl = null;
                }
                NativePostCommentFragment.Y7(nativePostCommentFragment, bottomEditorBarPostPageImpl.getLocalRecommendState());
                if (NativePostCommentFragment.this.O5() != null) {
                    LoadingDialog loadingDialogO5 = NativePostCommentFragment.this.O5();
                    f0.m(loadingDialogO5);
                    loadingDialogO5.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39680, new Class[0], Void.TYPE).isSupported && NativePostCommentFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39681, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (NativePostCommentFragment.this.isActive()) {
                super.onError(e10);
                if (NativePostCommentFragment.this.O5() != null) {
                    LoadingDialog loadingDialogO5 = NativePostCommentFragment.this.O5();
                    f0.m(loadingDialogO5);
                    loadingDialogO5.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39683, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSCreateCommentResult) obj);
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    @t0({"SMAP\nNativePostCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativePostCommentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/webwithnative/NativePostCommentFragment$doPickAction$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1004:1\n1#2:1005\n*E\n"})
    public static final class c implements t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // oe.t
        public void onCancel() {
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 39684, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LocalMedia localMedia = arrayList.get(i10);
                    if (localMedia != null) {
                        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = NativePostCommentFragment.this.f89326y1;
                        if (bottomEditorBarPostPageImpl2 == null) {
                            f0.S("vgBottomBar");
                            bottomEditorBarPostPageImpl2 = null;
                        }
                        bottomEditorBarPostPageImpl2.getImgPathList().add(localMedia.G());
                    }
                }
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = NativePostCommentFragment.this.f89326y1;
            if (bottomEditorBarPostPageImpl3 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl3 = null;
            }
            x mUploadImgShowerAdapter = bottomEditorBarPostPageImpl3.getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl4 == null) {
                    f0.S("vgBottomBar");
                } else {
                    bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl4;
                }
                mUploadImgShowerAdapter.r(bottomEditorBarPostPageImpl.getImgPathList());
            }
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
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
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 39685, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            NativePostCommentFragment nativePostCommentFragment = NativePostCommentFragment.this;
            String strP0 = com.max.xiaoheihe.utils.d.p0(strArr);
            f0.o(strP0, "getStringFromArray(urls)");
            nativePostCommentFragment.L3 = strP0;
            if (com.max.hbcommon.utils.c.u(NativePostCommentFragment.this.L3)) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = NativePostCommentFragment.this.f89326y1;
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
                if (bottomEditorBarPostPageImpl == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl = null;
                }
                if (com.max.hbcommon.utils.c.u(bottomEditorBarPostPageImpl.getEditor().getContentText())) {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl3 == null) {
                        f0.S("vgBottomBar");
                    } else {
                        bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl3;
                    }
                    if (!bottomEditorBarPostPageImpl2.N()) {
                        return;
                    }
                }
            }
            NativePostCommentFragment.m7(NativePostCommentFragment.this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.e String str) {
            LoadingDialog loadingDialogO5;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39686, new Class[]{String.class}, Void.TYPE).isSupported || (loadingDialogO5 = NativePostCommentFragment.this.O5()) == null) {
                return;
            }
            loadingDialogO5.c();
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<UserPostLimitsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(@dl.d Result<UserPostLimitsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39687, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (NativePostCommentFragment.this.isActive()) {
                super.onNext(result);
                UserPostLimitsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                if (!result2.isCan_post_comment() && !com.max.hbcommon.utils.c.u(result2.getMsg_post_comment())) {
                    com.max.hbutils.utils.c.d(result2.getMsg_post_comment());
                }
                Integer numValueOf = Integer.valueOf(com.max.hbutils.utils.n.q(result2.getMax_input_limit_post_comment()));
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
                if (!(numValueOf.intValue() > 0)) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    NativePostCommentFragment nativePostCommentFragment = NativePostCommentFragment.this;
                    int iIntValue = numValueOf.intValue();
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = nativePostCommentFragment.f89326y1;
                    if (bottomEditorBarPostPageImpl2 == null) {
                        f0.S("vgBottomBar");
                    } else {
                        bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl2;
                    }
                    bottomEditorBarPostPageImpl.setPostCommentTextNumMaxLimit(iIntValue);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39688, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserPostLimitsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
        
            if (r1.getImgPathList().size() > 0) goto L59;
         */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onClick(android.view.View r10) {
            /*
                Method dump skipped, instruction units count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.NativePostCommentFragment.f.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class g implements View.OnDragListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f89333a = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnDragListener
        public final boolean onDrag(View view, DragEvent dragEvent) {
            return true;
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39690, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            NativePostCommentFragment.L7(NativePostCommentFragment.this);
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39691, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            NativePostCommentFragment.this.a8();
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39692, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            NativePostCommentFragment.this.F6();
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39693, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intentN1 = AddAtUserActivity.N1(((com.max.hbcommon.base.d) NativePostCommentFragment.this).mContext, i0.j());
            androidx.activity.result.g gVar = NativePostCommentFragment.this.K3;
            if (gVar == null) {
                f0.S("atLauncher");
                gVar = null;
            }
            gVar.b(intentN1);
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39694, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            NativePostCommentFragment nativePostCommentFragment = NativePostCommentFragment.this;
            SearchNewActivity.a aVar = SearchNewActivity.M;
            Activity mContext = ((com.max.hbcommon.base.d) nativePostCommentFragment).mContext;
            f0.o(mContext, "mContext");
            nativePostCommentFragment.startActivityForResult(aVar.a(mContext), NativePostCommentFragment.this.Y);
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39695, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = NativePostCommentFragment.this.f89326y1;
            if (bottomEditorBarPostPageImpl == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl = null;
            }
            bottomEditorBarPostPageImpl.g0();
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39696, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = NativePostCommentFragment.this.f89326y1;
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
            if (bottomEditorBarPostPageImpl == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl = null;
            }
            if (bottomEditorBarPostPageImpl.O()) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl3 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl3 = null;
                }
                bottomEditorBarPostPageImpl3.setEmojiShowing(false);
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl4 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl4 = null;
                }
                if (bottomEditorBarPostPageImpl4.getExpressionShowFragment() != null) {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl5 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl5 = null;
                    }
                    bottomEditorBarPostPageImpl5.setExpressionImageResource(R.drawable.bbs_emoji_filled_24x24);
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl6 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl6 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl6 = null;
                    }
                    com.max.hbexpression.q expressionShowFragment = bottomEditorBarPostPageImpl6.getExpressionShowFragment();
                    f0.m(expressionShowFragment);
                    expressionShowFragment.C();
                }
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl7 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl7 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl7 = null;
                }
                ViewUtils.s0(bottomEditorBarPostPageImpl7.getEditor());
            } else {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl8 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl8 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl8 = null;
                }
                ViewUtils.X(bottomEditorBarPostPageImpl8.getEditor());
                NativePostCommentFragment.M7(NativePostCommentFragment.this);
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl9 = NativePostCommentFragment.this.f89326y1;
            if (bottomEditorBarPostPageImpl9 == null) {
                f0.S("vgBottomBar");
            } else {
                bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl9;
            }
            bottomEditorBarPostPageImpl2.h0();
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39697, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            NativePostCommentFragment.this.i0();
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class p implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39721, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            NativePostCommentFragment.n7(NativePostCommentFragment.this);
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39722, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
            if (i0.e(((com.max.hbcommon.base.d) NativePostCommentFragment.this).mContext)) {
                if (NativePostCommentFragment.this.N3 == null || !NativePostCommentFragment.this.P3) {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl2 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl2 = null;
                    }
                    ViewUtils.s0(bottomEditorBarPostPageImpl2.getEditor());
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl3 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl3 = null;
                    }
                    boolean z10 = !bottomEditorBarPostPageImpl3.P();
                    NativePostCommentFragment.q7(NativePostCommentFragment.this);
                    if (z10) {
                        if (com.max.hbcommon.utils.c.u(NativePostCommentFragment.this.G3)) {
                            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = NativePostCommentFragment.this.f89326y1;
                            if (bottomEditorBarPostPageImpl4 == null) {
                                f0.S("vgBottomBar");
                                bottomEditorBarPostPageImpl4 = null;
                            }
                            bottomEditorBarPostPageImpl4.setContentText("");
                        } else {
                            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = NativePostCommentFragment.this.f89326y1;
                            if (bottomEditorBarPostPageImpl5 == null) {
                                f0.S("vgBottomBar");
                                bottomEditorBarPostPageImpl5 = null;
                            }
                            bottomEditorBarPostPageImpl5.setContentText(NativePostCommentFragment.this.G3);
                        }
                    }
                } else {
                    WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj = NativePostCommentFragment.this.N3;
                    com.max.hbutils.utils.c.f(webWithNativeRecommendInfoObj != null ? webWithNativeRecommendInfoObj.getCommented_hint() : null);
                }
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl6 = NativePostCommentFragment.this.f89326y1;
            if (bottomEditorBarPostPageImpl6 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl6 = null;
            }
            if (bottomEditorBarPostPageImpl6.I0()) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl7 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl7 == null) {
                    f0.S("vgBottomBar");
                } else {
                    bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl7;
                }
                bottomEditorBarPostPageImpl.setComboTipVisible(false);
            }
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class r implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            if (!PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39723, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported && z10 && NativePostCommentFragment.p7(NativePostCommentFragment.this)) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl = null;
                }
                View.OnClickListener editorClickListener = bottomEditorBarPostPageImpl.getEditorClickListener();
                if (editorClickListener != null) {
                    editorClickListener.onClick(view);
                }
            }
        }
    }

    /* JADX INFO: compiled from: NativePostCommentFragment.kt */
    public static final class s implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 39725, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            boolean z10 = false;
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 39724, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == -1) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl = null;
                }
                if (bottomEditorBarPostPageImpl.getEditor().getSelectionEnd() > 0) {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl2 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl2 = null;
                    }
                    Editable text = bottomEditorBarPostPageImpl2.getEditor().getText();
                    if (text != null) {
                        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = NativePostCommentFragment.this.f89326y1;
                        if (bottomEditorBarPostPageImpl3 == null) {
                            f0.S("vgBottomBar");
                            bottomEditorBarPostPageImpl3 = null;
                        }
                        if (text.charAt(bottomEditorBarPostPageImpl3.getEditor().getSelectionEnd() - 1) == '@') {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = NativePostCommentFragment.this.f89326y1;
                        if (bottomEditorBarPostPageImpl4 == null) {
                            f0.S("vgBottomBar");
                            bottomEditorBarPostPageImpl4 = null;
                        }
                        Editable text2 = bottomEditorBarPostPageImpl4.getEditor().getText();
                        if (text2 != null) {
                            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = NativePostCommentFragment.this.f89326y1;
                            if (bottomEditorBarPostPageImpl5 == null) {
                                f0.S("vgBottomBar");
                                bottomEditorBarPostPageImpl5 = null;
                            }
                            int selectionEnd = bottomEditorBarPostPageImpl5.getEditor().getSelectionEnd() - 1;
                            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl6 = NativePostCommentFragment.this.f89326y1;
                            if (bottomEditorBarPostPageImpl6 == null) {
                                f0.S("vgBottomBar");
                                bottomEditorBarPostPageImpl6 = null;
                            }
                            text2.replace(selectionEnd, bottomEditorBarPostPageImpl6.getEditor().getSelectionEnd(), "");
                        }
                    }
                }
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl7 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl7 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl7 = null;
                }
                ExpressionEditText editor = bottomEditorBarPostPageImpl7.getEditor();
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl8 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl8 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl8 = null;
                }
                int selectionEnd2 = bottomEditorBarPostPageImpl8.getEditor().getSelectionEnd();
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                Intent intentA = activityResult.a();
                sb2.append(intentA != null ? intentA.getStringExtra("user_name") : null);
                String string = sb2.toString();
                Intent intentA2 = activityResult.a();
                editor.y(new HighlightInfo("info_at", selectionEnd2, string, intentA2 != null ? intentA2.getStringExtra("user_id") : null));
            }
        }
    }

    public static final /* synthetic */ int A7(NativePostCommentFragment nativePostCommentFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39664, new Class[]{NativePostCommentFragment.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : nativePostCommentFragment.h4();
    }

    private final void A8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39617, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5().f112965z.setBackgroundColor(0);
        E5().f112953n.setBackgroundColor(0);
        E5().f112942c.setBackgroundColor(0);
        E5().f112951l.setBackgroundColor(0);
        E5().C.setBackgroundColor(0);
        E5().f112952m.setBackgroundColor(com.max.xiaoheihe.utils.d.F(this.mContext, R.color.white_alpha5));
        E5().f112950k.setBackgroundColor(0);
        com.max.xiaoheihe.module.bbs.adapter.c cVarM5 = M5();
        if (cVarM5 != null) {
            cVarM5.T(this.f89321p1);
        }
        E5().f112955p.setTextColor(-1);
        E5().f112959t.setTextColor(-1);
        E5().f112962w.setBackgroundResource(R.color.white);
        E5().f112943d.setCheckedColor(-1);
        E5().f112943d.setNormalIconColor(com.max.xiaoheihe.utils.d.F(this.mContext, R.color.white_alpha60));
        E5().f112943d.setNormalTextColor(com.max.xiaoheihe.utils.d.F(this.mContext, R.color.white_alpha60));
        E5().f112961v.getRoot().setBackgroundResource(R.color.white_alpha2);
        ViewGroup.LayoutParams layoutParams = E5().C.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.LayoutParams");
        ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f42336c = false;
    }

    public static final /* synthetic */ BBSLinkRecObj B7(NativePostCommentFragment nativePostCommentFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39661, new Class[]{NativePostCommentFragment.class}, BBSLinkRecObj.class);
        return patchProxyResultProxy.isSupported ? (BBSLinkRecObj) patchProxyResultProxy.result : nativePostCommentFragment.V5();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    private final void B8() {
        String comment_hint;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39644, new Class[0], Void.TYPE).isSupported || this.N3 == null) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
        if (i0.s()) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = this.f89326y1;
            if (bottomEditorBarPostPageImpl2 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl2 = null;
            }
            bottomEditorBarPostPageImpl2.getEditor().setEnabled(!this.P3);
        }
        if (this.P3) {
            WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj = this.N3;
            if (webWithNativeRecommendInfoObj != null) {
                comment_hint = webWithNativeRecommendInfoObj.getCommented_hint();
            } else {
                comment_hint = null;
            }
        } else {
            WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj2 = this.N3;
            if (webWithNativeRecommendInfoObj2 != null) {
                comment_hint = webWithNativeRecommendInfoObj2.getComment_hint();
            } else {
                comment_hint = null;
            }
        }
        if (comment_hint != null) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
            if (bottomEditorBarPostPageImpl3 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl3 = null;
            }
            bottomEditorBarPostPageImpl3.setDefaultEditTextHint(comment_hint);
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
            if (bottomEditorBarPostPageImpl4 == null) {
                f0.S("vgBottomBar");
            } else {
                bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl4;
            }
            bottomEditorBarPostPageImpl.getEditor().setHint(comment_hint);
        }
    }

    private final void C8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39637, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzbartest", "updateCommentState  enableComment==" + this.f89323p3);
        x8(this.f89323p3);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.A(this.f89323p3, i0.s());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl3 = null;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        bottomEditorBarPostPageImpl3.setCommentBtnText(linkInfoObjD4 != null ? linkInfoObjD4.getComment_num() : null);
        LinkInfoObj linkInfoObjD5 = d4();
        String sp_like_key = linkInfoObjD5 != null ? linkInfoObjD5.getSp_like_key() : null;
        if (!com.max.hbcommon.utils.c.u(sp_like_key) && sp_like_key != null && LikeAnimResourceManager.f79963a.m(sp_like_key)) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
            if (bottomEditorBarPostPageImpl4 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl4 = null;
            }
            if (!f0.g(sp_like_key, bottomEditorBarPostPageImpl4.getSp_like_key())) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = this.f89326y1;
                if (bottomEditorBarPostPageImpl5 == null) {
                    f0.S("vgBottomBar");
                } else {
                    bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl5;
                }
                bottomEditorBarPostPageImpl2.setSp_like_key(sp_like_key);
            }
        }
        p6();
    }

    private final void D8(String str) {
        WebviewFragment webviewFragmentN2;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39628, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        this.O3 = str;
        z8(str, null);
        if (!isActive() || (webviewFragmentN2 = N2()) == null) {
            return;
        }
        webviewFragmentN2.H6(HeyboxWebProtocolHandler.f95003a.a(this.f89318a0, str), null);
    }

    public static final /* synthetic */ void L7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39669, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.p8();
    }

    public static final /* synthetic */ void M7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39670, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.t8();
    }

    public static final /* synthetic */ void N7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39671, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.u8();
    }

    public static final /* synthetic */ void O7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39665, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.v8();
    }

    public static final /* synthetic */ void S7(NativePostCommentFragment nativePostCommentFragment, String str) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment, str}, null, changeQuickRedirect, true, 39660, new Class[]{NativePostCommentFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.O4(str);
    }

    public static final /* synthetic */ void W7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39663, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.showContentView();
    }

    public static final /* synthetic */ void X7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39668, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.C8();
    }

    public static final /* synthetic */ void Y7(NativePostCommentFragment nativePostCommentFragment, String str) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment, str}, null, changeQuickRedirect, true, 39675, new Class[]{NativePostCommentFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.D8(str);
    }

    private final void Z7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39646, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G2.clear();
        this.G3 = null;
    }

    private final void b8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39639, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        B8();
        w8();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.w();
        this.f89327y2 = "-1";
        this.f89325x2 = "-1";
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl3;
        }
        bottomEditorBarPostPageImpl2.b0();
    }

    private final void c8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39626, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d8(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    private final void d8(String str, String str2) {
        String localRecommendState;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 39627, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        if (!com.max.hbcommon.utils.c.v(str, str2)) {
            f0.m(str2);
            map.put("Cookie", str2);
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        String contentText = bottomEditorBarPostPageImpl.getEditor().getContentText();
        f0.o(contentText, "vgBottomBar.editor.getContentText()");
        if (this.N3 == null) {
            localRecommendState = null;
        } else {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
            if (bottomEditorBarPostPageImpl3 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl3 = null;
            }
            if (bottomEditorBarPostPageImpl3.R()) {
                localRecommendState = null;
            } else {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
                if (bottomEditorBarPostPageImpl4 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl4 = null;
                }
                localRecommendState = bottomEditorBarPostPageImpl4.getLocalRecommendState();
            }
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String strB4 = b4();
        String strC4 = c4();
        String str3 = this.f89327y2;
        String str4 = this.f89325x2;
        String str5 = this.L3;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = this.f89326y1;
        if (bottomEditorBarPostPageImpl5 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl5;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.V4(strB4, map, strC4, contentText, str3, str4, str5, bottomEditorBarPostPageImpl2.N() ? "1" : "0", localRecommendState, str, k8()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void e8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39658, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        int size = 9;
        if (bottomEditorBarPostPageImpl.getImgPathList().size() > 0) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
            if (bottomEditorBarPostPageImpl3 == null) {
                f0.S("vgBottomBar");
            } else {
                bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl3;
            }
            size = 9 - bottomEditorBarPostPageImpl2.getImgPathList().size();
        }
        com.max.mediaselector.e.i(this.mContext, size, new c());
    }

    private final void f8() {
        boolean z10 = false;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39625, new Class[0], Void.TYPE).isSupported && i0.g(this.mContext)) {
            LoadingDialog loadingDialogO5 = O5();
            if (loadingDialogO5 != null && loadingDialogO5.i()) {
                z10 = true;
            }
            if (!z10) {
                Activity mContext = this.mContext;
                f0.o(mContext, "mContext");
                Q6(new LoadingDialog(mContext, getString(R.string.commiting), true).r());
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
            if (bottomEditorBarPostPageImpl == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl = null;
            }
            if (bottomEditorBarPostPageImpl.getImgPathList().size() <= 0) {
                this.L3 = "";
                c8();
                return;
            }
            this.L3 = "";
            Activity activity = this.mContext;
            io.reactivex.disposables.a compositeDisposable = getCompositeDisposable();
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
            if (bottomEditorBarPostPageImpl3 == null) {
                f0.S("vgBottomBar");
            } else {
                bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl3;
            }
            com.max.xiaoheihe.module.upload.g.h(activity, compositeDisposable, bottomEditorBarPostPageImpl2.getImgPathList(), "bbs", new d());
        }
    }

    private final boolean g8() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39636, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f89323p3 || !i0.e(this.mContext) || !isActive()) {
            return false;
        }
        if (this.N3 != null) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
            if (bottomEditorBarPostPageImpl == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl = null;
            }
            if (!bottomEditorBarPostPageImpl.R() && this.P3) {
                return false;
            }
        }
        return true;
    }

    private final void h8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39638, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
        if (i0.s()) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = this.f89326y1;
            if (bottomEditorBarPostPageImpl2 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl2 = null;
            }
            if (!bottomEditorBarPostPageImpl2.Q()) {
                j8();
            }
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl3;
        }
        bottomEditorBarPostPageImpl.B();
    }

    private final RecommendStateObj i8() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39630, new Class[0], RecommendStateObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecommendStateObj) patchProxyResultProxy.result;
        }
        if (!i0.s()) {
            return null;
        }
        String strJ = i0.j();
        for (RecommendStateObj recommendStateObj : this.Q3) {
            if (f0.g(strJ, recommendStateObj.getUser_id())) {
                return recommendStateObj;
            }
        }
        return null;
    }

    private final void j8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39648, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        if (!com.max.hbcommon.utils.c.u(c4())) {
            String strC4 = c4();
            f0.m(strC4);
            map.put("link_id", strC4);
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b6(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final Map<String, String> k8() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39631, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        Map<String, String> mapX = l0.X(V5());
        return mapX == null ? new HashMap(16) : mapX;
    }

    public static final /* synthetic */ void l7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39674, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.Z7();
    }

    private final void l8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39621, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzbartest", "initBottomBar");
        C8();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.getEditor().setOnDragListener(g.f89333a);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl3 = null;
        }
        bottomEditorBarPostPageImpl3.getMask().setOnClickListener(new h());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
        if (bottomEditorBarPostPageImpl4 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl4 = null;
        }
        bottomEditorBarPostPageImpl4.B0();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = this.f89326y1;
        if (bottomEditorBarPostPageImpl5 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl5 = null;
        }
        bottomEditorBarPostPageImpl5.setCollectOnClickListener(new i());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl6 = this.f89326y1;
        if (bottomEditorBarPostPageImpl6 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl6 = null;
        }
        bottomEditorBarPostPageImpl6.setCommentOnClickListener(new j());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl7 = this.f89326y1;
        if (bottomEditorBarPostPageImpl7 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl7 = null;
        }
        bottomEditorBarPostPageImpl7.setIvAtVisible(true);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl8 = this.f89326y1;
        if (bottomEditorBarPostPageImpl8 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl8 = null;
        }
        bottomEditorBarPostPageImpl8.setAtOnClickListener(new k());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl9 = this.f89326y1;
        if (bottomEditorBarPostPageImpl9 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl9 = null;
        }
        bottomEditorBarPostPageImpl9.setAddGameOnClickListener(new l());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl10 = this.f89326y1;
        if (bottomEditorBarPostPageImpl10 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl10 = null;
        }
        bottomEditorBarPostPageImpl10.setIvCYVisible(true);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl11 = this.f89326y1;
        if (bottomEditorBarPostPageImpl11 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl11 = null;
        }
        bottomEditorBarPostPageImpl11.setCYOnClickListener(new m());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl12 = this.f89326y1;
        if (bottomEditorBarPostPageImpl12 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl12 = null;
        }
        bottomEditorBarPostPageImpl12.setExpressionOnClickListener(new n());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl13 = this.f89326y1;
        if (bottomEditorBarPostPageImpl13 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl13 = null;
        }
        bottomEditorBarPostPageImpl13.setAddOnClickListener(new o());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl14 = this.f89326y1;
        if (bottomEditorBarPostPageImpl14 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl14 = null;
        }
        bottomEditorBarPostPageImpl14.setSendOnClickListener(new f());
        if (this.N3 == null) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl15 = this.f89326y1;
            if (bottomEditorBarPostPageImpl15 == null) {
                f0.S("vgBottomBar");
            } else {
                bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl15;
            }
            bottomEditorBarPostPageImpl2.setShowRecommendBtns(false);
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl16 = this.f89326y1;
        if (bottomEditorBarPostPageImpl16 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl16 = null;
        }
        bottomEditorBarPostPageImpl16.setShowRecommendBtns(true);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl17 = this.f89326y1;
        if (bottomEditorBarPostPageImpl17 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl17 = null;
        }
        WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj = this.N3;
        bottomEditorBarPostPageImpl17.setRecommendInfo(webWithNativeRecommendInfoObj != null ? webWithNativeRecommendInfoObj.getPositive_info() : null);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl18 = this.f89326y1;
        if (bottomEditorBarPostPageImpl18 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl18 = null;
        }
        WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj2 = this.N3;
        bottomEditorBarPostPageImpl18.setUnRecommendInfo(webWithNativeRecommendInfoObj2 != null ? webWithNativeRecommendInfoObj2.getNegative_info() : null);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl19 = this.f89326y1;
        if (bottomEditorBarPostPageImpl19 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl19;
        }
        bottomEditorBarPostPageImpl2.setRecommendCheck(true);
    }

    public static final /* synthetic */ void m7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39673, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.c8();
    }

    public static final /* synthetic */ void n7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39678, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.e8();
    }

    private final void n8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39657, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PermissionManager permissionManager = PermissionManager.f71603a;
        Activity activity = this.mContext;
        f0.n(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        permissionManager.S((FragmentActivity) activity, new p());
    }

    public static final /* synthetic */ void o7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39672, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.f8();
    }

    public static final /* synthetic */ boolean p7(NativePostCommentFragment nativePostCommentFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39677, new Class[]{NativePostCommentFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : nativePostCommentFragment.g8();
    }

    private final void p8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39620, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        ViewUtils.X(bottomEditorBarPostPageImpl.getEditor());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl3;
        }
        bottomEditorBarPostPageImpl2.getEditor().clearFocus();
        b8();
    }

    public static final /* synthetic */ void q7(NativePostCommentFragment nativePostCommentFragment) {
        if (PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39676, new Class[]{NativePostCommentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        nativePostCommentFragment.h8();
    }

    private final void q8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39635, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.A0();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl3 = null;
        }
        bottomEditorBarPostPageImpl3.setEnableShare(false);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
        if (bottomEditorBarPostPageImpl4 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl4 = null;
        }
        bottomEditorBarPostPageImpl4.setEnableCharge(false);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = this.f89326y1;
        if (bottomEditorBarPostPageImpl5 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl5 = null;
        }
        bottomEditorBarPostPageImpl5.setEnablelike(false);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl6 = this.f89326y1;
        if (bottomEditorBarPostPageImpl6 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl6 = null;
        }
        bottomEditorBarPostPageImpl6.setEnableCollect(false);
        if (this.f89321p1) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl7 = this.f89326y1;
            if (bottomEditorBarPostPageImpl7 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl7 = null;
            }
            bottomEditorBarPostPageImpl7.setBgColor(this.f89324x1);
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl8 = this.f89326y1;
            if (bottomEditorBarPostPageImpl8 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl8 = null;
            }
            bottomEditorBarPostPageImpl8.setBarDarkStyle();
        }
        l8();
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl9 = this.f89326y1;
        if (bottomEditorBarPostPageImpl9 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl9 = null;
        }
        bottomEditorBarPostPageImpl9.setEditorClickListener(new q());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl10 = this.f89326y1;
        if (bottomEditorBarPostPageImpl10 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl10 = null;
        }
        bottomEditorBarPostPageImpl10.setEditorOnFocusChangeListener(new r());
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl11 = this.f89326y1;
        if (bottomEditorBarPostPageImpl11 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl11;
        }
        bottomEditorBarPostPageImpl2.I(this);
    }

    private final void s8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39616, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new s());
        f0.o(gVarRegisterForActivityResult, "private fun registerLaun…uncher = atLauncher\n    }");
        this.K3 = gVarRegisterForActivityResult;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        androidx.activity.result.g<Intent> gVar = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        ExpressionEditText editor = bottomEditorBarPostPageImpl.getEditor();
        androidx.activity.result.g<Intent> gVar2 = this.K3;
        if (gVar2 == null) {
            f0.S("atLauncher");
        } else {
            gVar = gVar2;
        }
        editor.E = gVar;
    }

    private final void t8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39632, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.setEmojiShowing(true);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl3;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        f0.o(childFragmentManager, "childFragmentManager");
        bottomEditorBarPostPageImpl2.setVgExpressionVisible(childFragmentManager, true);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    private final void u8() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39633, new Class[0], Void.TYPE).isSupported && i0.g(this.mContext)) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
            if (bottomEditorBarPostPageImpl == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl = null;
            }
            if (com.max.hbcommon.utils.c.u(bottomEditorBarPostPageImpl.getEditor().getContentText())) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
                if (bottomEditorBarPostPageImpl3 == null) {
                    f0.S("vgBottomBar");
                } else {
                    bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl3;
                }
                if (!bottomEditorBarPostPageImpl2.N()) {
                    return;
                }
            }
            if (O5() != null) {
                LoadingDialog loadingDialogO5 = O5();
                f0.m(loadingDialogO5);
                if (!loadingDialogO5.i()) {
                    Activity mContext = this.mContext;
                    f0.o(mContext, "mContext");
                    Q6(new LoadingDialog(mContext, getString(R.string.commiting), true).r());
                }
            } else {
                Activity mContext2 = this.mContext;
                f0.o(mContext2, "mContext");
                Q6(new LoadingDialog(mContext2, getString(R.string.commiting), true).r());
            }
            c8();
        }
    }

    private final void v8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39619, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p8();
        this.f89327y2 = "-1";
        this.f89325x2 = "-1";
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.b0();
    }

    private final void w8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39645, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        if (!bottomEditorBarPostPageImpl.R()) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
            if (bottomEditorBarPostPageImpl3 == null) {
                f0.S("vgBottomBar");
            } else {
                bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl3;
            }
            this.G3 = bottomEditorBarPostPageImpl2.getEditor().getContentText();
            return;
        }
        String str = this.f89325x2;
        if (str == null || f0.g("-1", str)) {
            return;
        }
        HashMap<String, String> map = this.G2;
        String str2 = this.f89325x2;
        f0.m(str2);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
        if (bottomEditorBarPostPageImpl4 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl4;
        }
        String contentText = bottomEditorBarPostPageImpl2.getEditor().getContentText();
        f0.o(contentText, "vgBottomBar.editor.getContentText()");
        map.put(str2, contentText);
    }

    public static final /* synthetic */ String x7(NativePostCommentFragment nativePostCommentFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39662, new Class[]{NativePostCommentFragment.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : nativePostCommentFragment.b4();
    }

    public static final /* synthetic */ LinkInfoObj y7(NativePostCommentFragment nativePostCommentFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39667, new Class[]{NativePostCommentFragment.class}, LinkInfoObj.class);
        return patchProxyResultProxy.isSupported ? (LinkInfoObj) patchProxyResultProxy.result : nativePostCommentFragment.d4();
    }

    public static final /* synthetic */ String z7(NativePostCommentFragment nativePostCommentFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nativePostCommentFragment}, null, changeQuickRedirect, true, 39666, new Class[]{NativePostCommentFragment.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : nativePostCommentFragment.e4();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void A4(@dl.e Result<BBSLinkTreeObj> result) {
        BBSLinkTreeObj result2;
        if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39643, new Class[]{Result.class}, Void.TYPE).isSupported && isActive()) {
            super.A4(result);
            if (result != null) {
                n5();
                l5();
                h5();
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
                String is_commented = null;
                if (bottomEditorBarPostPageImpl == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl = null;
                }
                LinkInfoObj linkInfoObjD4 = d4();
                bottomEditorBarPostPageImpl.x(com.max.hbutils.utils.n.q(linkInfoObjD4 != null ? linkInfoObjD4.getComment_num() : null));
                if (d4() != null) {
                    LinkInfoObj linkInfoObjD5 = d4();
                    f0.m(linkInfoObjD5);
                    LinkInfoObj linkInfoObjD6 = d4();
                    linkInfoObjD5.setDisable_comment(linkInfoObjD6 != null ? linkInfoObjD6.getDisable_comment() : null);
                }
                LinkInfoObj linkInfoObjD7 = d4();
                this.f89323p3 = !f0.g("1", linkInfoObjD7 != null ? linkInfoObjD7.getDisable_comment() : null);
                C8();
                if (h4() == 1) {
                    Result<BBSLinkTreeObj> resultF4 = f4();
                    if (resultF4 != null && (result2 = resultF4.getResult()) != null) {
                        is_commented = result2.getIs_commented();
                    }
                    this.P3 = com.max.hbcommon.utils.c.x(is_commented);
                }
                B8();
                kf.a aVarG4 = g4();
                if (aVarG4 != null) {
                    aVarG4.p1();
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public boolean D5() {
        return false;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b
    public void F0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39653, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        E5().f112953n.i0(z10);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b
    public void J3(@dl.d WebviewFragment fragment) {
        if (PatchProxy.proxy(new Object[]{fragment}, this, changeQuickRedirect, false, 39649, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragment, "fragment");
        getChildFragmentManager().u().y(R.id.insert_fragment_container, fragment).n();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b
    @dl.e
    public WebviewFragment N2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39654, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        if (isActive()) {
            return (WebviewFragment) getChildFragmentManager().r0(R.id.insert_fragment_container);
        }
        return null;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b
    public void R(@dl.e String str, @dl.e String str2) {
    }

    public final void a8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39622, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J3 = false;
        if (ad.a.a(ad.a.E, false)) {
            x4();
        } else {
            w4();
        }
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39624, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.expressionDeleteClick(view);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void h5() {
        LinkInfoObj linkInfoObjD4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39640, new Class[0], Void.TYPE).isSupported || (linkInfoObjD4 = d4()) == null) {
            return;
        }
        i5(linkInfoObjD4.getIs_favour());
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39655, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n8();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void i5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39641, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.y(str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39615, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f89320c0 = arguments.getString("link_id");
            this.N3 = (WebWithNativeRecommendInfoObj) arguments.getSerializable(WebWithNativeContainerFragment.F);
        }
        Log.d(this.Z, "link_id: " + this.f89320c0);
        super.installViews(view);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.f89321p1 = arguments2.getBoolean(WebviewFragment.P4, false);
            this.f89324x1 = arguments2.getString(T3);
            if (this.f89321p1) {
                A8();
            }
        }
        com.max.xiaoheihe.module.bbs.adapter.c cVarM5 = M5();
        if (cVarM5 != null) {
            cVarM5.R(this.N3);
        }
        FrameLayout frameLayout = E5().f112964y;
        f0.o(frameLayout, "binding.vgBottomContainer");
        frameLayout.setVisibility(0);
        if (this.f89322p2 == null) {
            View viewInflate = this.mInflater.inflate(R.layout.layout_comment_editor, (ViewGroup) null, false);
            f0.n(viewInflate, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar");
            BottomEditorBar bottomEditorBar = (BottomEditorBar) viewInflate;
            this.f89322p2 = bottomEditorBar;
            if (bottomEditorBar == null) {
                f0.S("vBottomEditorBar");
                bottomEditorBar = null;
            }
            bottomEditorBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            BottomEditorBar bottomEditorBar2 = this.f89322p2;
            if (bottomEditorBar2 == null) {
                f0.S("vBottomEditorBar");
                bottomEditorBar2 = null;
            }
            BaseBottomEditorBar bottomEditorBar3 = bottomEditorBar2.getInstance();
            f0.n(bottomEditorBar3, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl");
            this.f89326y1 = (BottomEditorBarPostPageImpl) bottomEditorBar3;
        }
        FrameLayout frameLayout2 = E5().f112964y;
        BottomEditorBar bottomEditorBar4 = this.f89322p2;
        if (bottomEditorBar4 == null) {
            f0.S("vBottomEditorBar");
            bottomEditorBar4 = null;
        }
        frameLayout2.addView(bottomEditorBar4);
        E5().f112953n.i0(false);
        s8();
        q8();
        BasePostFragment.a4(this, null, 1, null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public void k7() {
        String comment_title;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39618, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k7();
        WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj = this.N3;
        if (webWithNativeRecommendInfoObj == null || (comment_title = webWithNativeRecommendInfoObj.getComment_title()) == null) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(F5())) {
            E5().f112955p.setText(comment_title);
            return;
        }
        E5().f112955p.setText(comment_title + ' ' + F5());
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39656, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        if (bottomEditorBarPostPageImpl.getImgPathList().size() <= 0 || i10 < 0) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl3 = null;
        }
        if (i10 < bottomEditorBarPostPageImpl3.getImgPathList().size()) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
            if (bottomEditorBarPostPageImpl4 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl4 = null;
            }
            bottomEditorBarPostPageImpl4.getImgPathList().remove(i10);
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = this.f89326y1;
            if (bottomEditorBarPostPageImpl5 == null) {
                f0.S("vgBottomBar");
            } else {
                bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl5;
            }
            x mUploadImgShowerAdapter = bottomEditorBarPostPageImpl2.getMUploadImgShowerAdapter();
            f0.m(mUploadImgShowerAdapter);
            mUploadImgShowerAdapter.notifyItemRemoved(i10);
        }
    }

    public final boolean m8() {
        return this.M3;
    }

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 39623, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.o0(expressionObj);
    }

    public final void o8(@dl.e BBSFloorCommentObj bBSFloorCommentObj) {
        RecommendStateObj recommendStateObjI8;
        if (PatchProxy.proxy(new Object[]{bBSFloorCommentObj}, this, changeQuickRedirect, false, 39629, new Class[]{BBSFloorCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        if (!bottomEditorBarPostPageImpl.R()) {
            this.P3 = true;
            B8();
        }
        if (bBSFloorCommentObj != null) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = this.f89326y1;
            if (bottomEditorBarPostPageImpl2 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl2 = null;
            }
            bottomEditorBarPostPageImpl2.setEditAddCY(false);
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
            if (bottomEditorBarPostPageImpl3 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl3 = null;
            }
            bottomEditorBarPostPageImpl3.setCYIconColor(R.color.text_secondary_1_color);
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
            if (bottomEditorBarPostPageImpl4 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl4 = null;
            }
            if (bottomEditorBarPostPageImpl4.R() || bBSFloorCommentObj.getComment() == null) {
                g6(this.f89327y2, bBSFloorCommentObj.getComment());
            } else {
                if (i0.s() && (recommendStateObjI8 = i8()) != null) {
                    bBSFloorCommentObj.getComment().setRecommendExtraForResult(i0.j(), recommendStateObjI8.getExtra());
                }
                f6(bBSFloorCommentObj.getComment());
            }
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = this.f89326y1;
            if (bottomEditorBarPostPageImpl5 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl5 = null;
            }
            bottomEditorBarPostPageImpl5.getImgPathList().clear();
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl6 = this.f89326y1;
            if (bottomEditorBarPostPageImpl6 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl6 = null;
            }
            x mUploadImgShowerAdapter = bottomEditorBarPostPageImpl6.getMUploadImgShowerAdapter();
            if (mUploadImgShowerAdapter != null) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl7 = this.f89326y1;
                if (bottomEditorBarPostPageImpl7 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl7 = null;
                }
                mUploadImgShowerAdapter.r(bottomEditorBarPostPageImpl7.getImgPathList());
            }
            this.L3 = "";
            kf.a aVarG4 = g4();
            if (aVarG4 != null) {
                aVarG4.l("action_comment", true);
            }
            v8();
            if (bBSFloorCommentObj.getReply_push_state() != null && f0.g("1", bBSFloorCommentObj.getReply_push_state().getPush_state())) {
                v.a(this.mContext, v.f95761b, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39647, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i11 != -1 || this.Y != i10) {
            if (i10 != 9991 || intent == null) {
                return;
            }
            PostUtils.Companion companion = PostUtils.f81983a;
            Activity activity = this.mContext;
            f0.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            companion.u((AppCompatActivity) activity, intent);
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
        GameObj gameObj = (GameObj) (intent != null ? intent.getSerializableExtra(com.max.hbsearch.l.B) : null);
        if (gameObj != null) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = this.f89326y1;
            if (bottomEditorBarPostPageImpl2 == null) {
                f0.S("vgBottomBar");
            } else {
                bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl2;
            }
            bottomEditorBarPostPageImpl.getEditor().x(gameObj);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 39614, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.b5(context);
        M4(new kf.a() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.NativePostCommentFragment.onAttach.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // kf.a
            @dl.e
            public String A() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39705, new Class[0], String.class);
                return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : NativePostCommentFragment.z7(NativePostCommentFragment.this);
            }

            @Override // kf.a
            public void I1() {
            }

            @Override // kf.a
            public void M2(@dl.e String str, @dl.e String str2) {
            }

            @Override // kf.a
            public void R2(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39710, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kf.a.C1123a.c(this, i10);
            }

            @Override // kf.a
            @dl.e
            public String X() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39707, new Class[0], String.class);
                if (patchProxyResultProxy.isSupported) {
                    return (String) patchProxyResultProxy.result;
                }
                return NativePostCommentFragment.this.f89323p3 ? "0" : "1";
            }

            @Override // kf.a
            public void b3(@dl.e String str, int i10) {
                if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 39699, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = NativePostCommentFragment.this.f89326y1;
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
                if (bottomEditorBarPostPageImpl == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl = null;
                }
                if (!bottomEditorBarPostPageImpl.R()) {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl3 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl3 = null;
                    }
                    if (!com.max.hbcommon.utils.c.u(bottomEditorBarPostPageImpl3.getEditor().getContentText())) {
                        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = NativePostCommentFragment.this.f89326y1;
                        if (bottomEditorBarPostPageImpl4 == null) {
                            f0.S("vgBottomBar");
                        } else {
                            bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl4;
                        }
                        if (!bottomEditorBarPostPageImpl2.N()) {
                            return;
                        }
                    }
                }
                NativePostCommentFragment.O7(NativePostCommentFragment.this);
            }

            @Override // kf.a
            @dl.e
            public String c3() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39703, new Class[0], String.class);
                return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : NativePostCommentFragment.x7(NativePostCommentFragment.this);
            }

            @Override // kf.a
            public void d(@dl.e ShareImageDialogFragment shareImageDialogFragment) {
                if (PatchProxy.proxy(new Object[]{shareImageDialogFragment}, this, changeQuickRedirect, false, 39702, new Class[]{ShareImageDialogFragment.class}, Void.TYPE).isSupported || shareImageDialogFragment == null) {
                    return;
                }
                shareImageDialogFragment.show(NativePostCommentFragment.this.getChildFragmentManager(), PostPageFactory.M);
            }

            @Override // kf.a
            public void d1(@dl.e Fragment fragment, int i10, @dl.e String str, @dl.e String str2) {
            }

            @Override // kf.a
            public void d3(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7) {
                if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 39698, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                NativePostCommentFragment.S7(NativePostCommentFragment.this, "page_style_news_content");
                HashMap map = new HashMap(16);
                if (f0.g("1", str)) {
                    map.put("reload", "1");
                }
                Map<String, String> mapX = l0.X(NativePostCommentFragment.B7(NativePostCommentFragment.this));
                f0.o(mapX, "getRecommendParameters(mRecObj)");
                map.putAll(mapX);
                NativePostCommentFragment.this.addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s(NativePostCommentFragment.x7(NativePostCommentFragment.this), NativePostCommentFragment.this.c4(), str2, str3, "0", str4, str5, str6, NativePostCommentFragment.this.N3 == null ? null : "1", map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new NativePostCommentFragment$onAttach$1$getLinkTree$1(NativePostCommentFragment.this)));
            }

            @Override // kf.a
            @dl.e
            public String getLinkId() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39704, new Class[0], String.class);
                return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : NativePostCommentFragment.this.f89320c0;
            }

            @Override // kf.a
            public void h0(@dl.d LinkInfoObj linkInfoObj, @dl.d Map<String, String> map, @dl.d yh.l<? super Boolean, b2> lVar) {
                if (PatchProxy.proxy(new Object[]{linkInfoObj, map, lVar}, this, changeQuickRedirect, false, 39711, new Class[]{LinkInfoObj.class, Map.class, yh.l.class}, Void.TYPE).isSupported) {
                    return;
                }
                kf.a.C1123a.a(this, linkInfoObj, map, lVar);
            }

            @Override // kf.a
            @dl.e
            public BBSLinkRecObj i() {
                return null;
            }

            @Override // kf.a
            public void k(@dl.e String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39706, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (NativePostCommentFragment.y7(NativePostCommentFragment.this) != null) {
                    LinkInfoObj linkInfoObjY7 = NativePostCommentFragment.y7(NativePostCommentFragment.this);
                    f0.m(linkInfoObjY7);
                    linkInfoObjY7.setDisable_comment(str);
                }
                NativePostCommentFragment.this.f89323p3 = !f0.g("1", str);
                NativePostCommentFragment.X7(NativePostCommentFragment.this);
            }

            @Override // kf.a
            public void l(@dl.e String str, boolean z10) {
            }

            @Override // kf.a
            public void m(@dl.e BBSCommentObj bBSCommentObj, @dl.e BBSCommentObj bBSCommentObj2) {
                if (PatchProxy.proxy(new Object[]{bBSCommentObj, bBSCommentObj2}, this, changeQuickRedirect, false, 39700, new Class[]{BBSCommentObj.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
                if (i0.s() && NativePostCommentFragment.this.N3 != null) {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl2 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl2 = null;
                    }
                    bottomEditorBarPostPageImpl2.getEditor().setEnabled(true);
                }
                NativePostCommentFragment nativePostCommentFragment = NativePostCommentFragment.this;
                f0.m(bBSCommentObj2);
                nativePostCommentFragment.f89325x2 = bBSCommentObj2.getCommentid();
                NativePostCommentFragment nativePostCommentFragment2 = NativePostCommentFragment.this;
                f0.m(bBSCommentObj);
                nativePostCommentFragment2.f89327y2 = bBSCommentObj.getCommentid();
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl3 == null) {
                    f0.S("vgBottomBar");
                    bottomEditorBarPostPageImpl3 = null;
                }
                ViewUtils.s0(bottomEditorBarPostPageImpl3.getEditor());
                if (com.max.hbcommon.utils.c.u((String) NativePostCommentFragment.this.G2.get(NativePostCommentFragment.this.f89325x2))) {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl4 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl4 = null;
                    }
                    bottomEditorBarPostPageImpl4.setContentText("");
                } else {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl5 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl5 == null) {
                        f0.S("vgBottomBar");
                        bottomEditorBarPostPageImpl5 = null;
                    }
                    bottomEditorBarPostPageImpl5.setContentText((CharSequence) NativePostCommentFragment.this.G2.get(NativePostCommentFragment.this.f89325x2));
                }
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl6 = NativePostCommentFragment.this.f89326y1;
                if (bottomEditorBarPostPageImpl6 == null) {
                    f0.S("vgBottomBar");
                } else {
                    bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl6;
                }
                bottomEditorBarPostPageImpl.c0(bBSCommentObj2.getText(), bBSCommentObj2.getUser().getAvartar(), bBSCommentObj2.getUser().getUsername());
            }

            @Override // kf.a
            public boolean m0(@dl.e String str) {
                return false;
            }

            @Override // kf.a
            public void p1() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39708, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                NativePostCommentFragment.this.J3 = false;
            }

            @Override // kf.a
            public void r1(@dl.e BBSUserInfoObj bBSUserInfoObj, @dl.e String str) {
            }

            @Override // kf.a
            public void v(@dl.e String str, @dl.e String str2) {
            }

            @Override // kf.a
            public boolean v0() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39709, new Class[0], Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : kf.a.C1123a.b(this);
            }

            @Override // kf.a
            public boolean w0() {
                return false;
            }

            @Override // kf.a
            public void y(@dl.e String str) {
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39701, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                NativePostCommentFragment nativePostCommentFragment = NativePostCommentFragment.this;
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
                if (f0.g("1", str)) {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl2 == null) {
                        f0.S("vgBottomBar");
                    } else {
                        bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl2;
                    }
                    bottomEditorBarPostPageImpl.setCollectBtnCheckState(true, !NativePostCommentFragment.this.J3);
                } else {
                    BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = NativePostCommentFragment.this.f89326y1;
                    if (bottomEditorBarPostPageImpl3 == null) {
                        f0.S("vgBottomBar");
                    } else {
                        bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl3;
                    }
                    bottomEditorBarPostPageImpl.setCollectBtnCheckState(false, false);
                    z10 = false;
                }
                nativePostCommentFragment.y8(z10);
            }
        });
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39652, new Class[0], Void.TYPE).isSupported && isActive()) {
            N4(1);
            BasePostFragment.a4(this, null, 1, null);
        }
    }

    public final void r8(@dl.e String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39650, new Class[]{String.class}, Void.TYPE).isSupported && isActive()) {
            if (str == null) {
                str = this.f89320c0;
            }
            this.f89320c0 = str;
            I4(str);
            onRefresh();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public void t6(@dl.e String str, @dl.e String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 39634, new Class[]{String.class, String.class}, Void.TYPE).isSupported && isActive()) {
            super.t6(str, str2);
            if (this.N3 == null || !f0.g(str2, i0.j())) {
                return;
            }
            this.P3 = false;
            B8();
        }
    }

    public final void x8(boolean z10) {
        int iE = 0;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39659, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = null;
        if (z10) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = this.f89326y1;
            if (bottomEditorBarPostPageImpl2 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl2 = null;
            }
            int contentMinHeight = bottomEditorBarPostPageImpl2.getContentMinHeight();
            Resources resources = this.mContext.getResources();
            f0.o(resources, "mContext.resources");
            iE = ShareCardDrawUtilsKt.e(contentMinHeight, resources);
        }
        ViewGroup.LayoutParams layoutParams = E5().f112953n.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = iE;
        E5().f112953n.setLayoutParams(marginLayoutParams);
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
        if (bottomEditorBarPostPageImpl3 == null) {
            f0.S("vgBottomBar");
        } else {
            bottomEditorBarPostPageImpl = bottomEditorBarPostPageImpl3;
        }
        bottomEditorBarPostPageImpl.setBottomBarVisible(z10);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void y4(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39642, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (d4() != null) {
            LinkInfoObj linkInfoObjD4 = d4();
            if (linkInfoObjD4 != null) {
                linkInfoObjD4.setIs_favour(str);
            }
            h5();
        }
        if (!f0.g("1", str) || (aVarG4 = g4()) == null) {
            return;
        }
        aVarG4.l("action_favour", true);
    }

    public final void y8(boolean z10) {
        this.M3 = z10;
    }

    public final void z8(@dl.e String str, @dl.e String str2) {
        com.max.xiaoheihe.module.bbs.adapter.c cVarM5;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 39651, new Class[]{String.class, String.class}, Void.TYPE).isSupported || !isActive() || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        this.O3 = str;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl = this.f89326y1;
        BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = null;
        if (bottomEditorBarPostPageImpl == null) {
            f0.S("vgBottomBar");
            bottomEditorBarPostPageImpl = null;
        }
        bottomEditorBarPostPageImpl.setRecommendCheck(com.max.hbcommon.utils.c.x(this.O3));
        if (i0.s()) {
            try {
                if (!com.max.hbcommon.utils.c.w(N5())) {
                    int size = N5().size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (N5().get(i10).setRecommendStateForResult(i0.j(), str) && (cVarM5 = M5()) != null) {
                            cVarM5.notifyItemChanged(i10);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (com.max.hbcommon.utils.c.x(str2) && i0.s() && !this.P3) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl3 = this.f89326y1;
            if (bottomEditorBarPostPageImpl3 == null) {
                f0.S("vgBottomBar");
                bottomEditorBarPostPageImpl3 = null;
            }
            View.OnClickListener editorClickListener = bottomEditorBarPostPageImpl3.getEditorClickListener();
            if (editorClickListener != null) {
                BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl4 = this.f89326y1;
                if (bottomEditorBarPostPageImpl4 == null) {
                    f0.S("vgBottomBar");
                } else {
                    bottomEditorBarPostPageImpl2 = bottomEditorBarPostPageImpl4;
                }
                editorClickListener.onClick(bottomEditorBarPostPageImpl2.getEditor());
            }
        }
    }
}
