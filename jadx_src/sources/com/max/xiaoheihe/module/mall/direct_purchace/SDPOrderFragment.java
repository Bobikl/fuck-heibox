package com.max.xiaoheihe.module.mall.direct_purchace;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.hbcommon.base.adapter.w;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.MallPriceCamelView;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.AlertObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.game.recommend.RecGoodsObj;
import com.max.xiaoheihe.bean.mall.MallOrderBottomBtnObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.mall.MallSteamOrderObj;
import com.max.xiaoheihe.bean.mall.cart.RelatedRecommend;
import com.max.xiaoheihe.bean.mall.cart.SteamPurchaseOrderDetailObj;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PostType;
import com.max.xiaoheihe.module.mall.cardshare.fragment.actions.SDPOrderShowCardShareKt;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import df.nc0;
import df.ob;
import df.yp;
import dl.d;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: SDPOrderFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nSDPOrderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SDPOrderFragment.kt\ncom/max/xiaoheihe/module/mall/direct_purchace/SDPOrderFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,816:1\n262#2,2:817\n262#2,2:819\n304#2,2:821\n304#2,2:823\n262#2,2:825\n262#2,2:827\n304#2,2:829\n304#2,2:831\n304#2,2:833\n304#2,2:835\n304#2,2:837\n304#2,2:839\n*S KotlinDebug\n*F\n+ 1 SDPOrderFragment.kt\ncom/max/xiaoheihe/module/mall/direct_purchace/SDPOrderFragment\n*L\n343#1:817,2\n385#1:819,2\n396#1:821,2\n397#1:823,2\n456#1:825,2\n468#1:827,2\n424#1:829,2\n425#1:831,2\n426#1:833,2\n427#1:835,2\n428#1:837,2\n429#1:839,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class SDPOrderFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f90564j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f90565k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final String f90566l = "order_id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final String f90567m = "Steam交易号";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f90568n = "订单详情";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final String f90569o = "1";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final String f90570p = "2";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f90571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f90572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private SteamPurchaseOrderDetailObj f90573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ob f90574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f90575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f90576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private q f90577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final com.max.hbshare.c.b f90578i;

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final SDPOrderFragment a(@dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 41938, new Class[]{Bundle.class}, SDPOrderFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (SDPOrderFragment) patchProxyResultProxy.result;
            }
            SDPOrderFragment sDPOrderFragment = new SDPOrderFragment();
            sDPOrderFragment.setArguments(bundle);
            return sDPOrderFragment;
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41939, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SDPOrderFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41940, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (SDPOrderFragment.this.isActive()) {
                ((com.max.hbcommon.base.d) SDPOrderFragment.this).mContext.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41941, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<SteamPurchaseOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41943, new Class[0], Void.TYPE).isSupported && SDPOrderFragment.this.isActive()) {
                ob obVar = SDPOrderFragment.this.f90574e;
                ob obVar2 = null;
                if (obVar == null) {
                    f0.S("binding");
                    obVar = null;
                }
                obVar.f114174o.A(0);
                ob obVar3 = SDPOrderFragment.this.f90574e;
                if (obVar3 == null) {
                    f0.S("binding");
                } else {
                    obVar2 = obVar3;
                }
                obVar2.f114174o.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41942, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SDPOrderFragment.this.isActive()) {
                super.onError(e10);
                SDPOrderFragment.U3(SDPOrderFragment.this);
                ob obVar = SDPOrderFragment.this.f90574e;
                ob obVar2 = null;
                if (obVar == null) {
                    f0.S("binding");
                    obVar = null;
                }
                obVar.f114174o.A(0);
                ob obVar3 = SDPOrderFragment.this.f90574e;
                if (obVar3 == null) {
                    f0.S("binding");
                } else {
                    obVar2 = obVar3;
                }
                obVar2.f114174o.p(0);
            }
        }

        public void onNext(@dl.d Result<SteamPurchaseOrderDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41944, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (SDPOrderFragment.this.isActive()) {
                super.onNext(result);
                SDPOrderFragment.this.f90573d = result.getResult();
                SDPOrderFragment.R3(SDPOrderFragment.this);
                SDPOrderFragment.this.i4();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41945, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamPurchaseOrderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41946, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            SDPOrderFragment.this.f90571b = 0;
            SDPOrderFragment.O3(SDPOrderFragment.this);
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ListSectionHeader f90582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90583c;

        e(ListSectionHeader listSectionHeader, String str) {
            this.f90582b = listSectionHeader;
            this.f90583c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41958, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f90582b.getContext();
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.k0(context, this.f90583c);
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41959, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) SDPOrderFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.i0(mContext, lb.d.f131195k4);
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f90585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90586c;

        g(RecyclerView recyclerView, String str) {
            this.f90585b = recyclerView;
            this.f90586c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41960, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f90585b.getContext();
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.k0(context, this.f90586c);
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41965, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SDPOrderFragment.Q3(SDPOrderFragment.this);
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41966, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SDPOrderFragment.Q3(SDPOrderFragment.this);
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SteamPurchaseOrderDetailObj f90590c;

        j(SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
            this.f90590c = steamPurchaseOrderDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41967, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(((com.max.hbcommon.base.d) SDPOrderFragment.this).mContext, this.f90590c.getTrans_id());
            com.max.hbutils.utils.c.f(SDPOrderFragment.this.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class k implements com.max.xiaoheihe.module.mall.cart.ui.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // com.max.xiaoheihe.module.mall.cart.ui.c
        public boolean a() {
            return false;
        }

        @Override // com.max.xiaoheihe.module.mall.cart.ui.c
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41968, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", SteamDirectPurchaseTool.f90642n, null, null);
            SDPOrderFragment.L3(SDPOrderFragment.this);
        }

        @Override // com.max.xiaoheihe.module.mall.cart.ui.c
        public void c() {
        }

        @Override // com.max.xiaoheihe.module.mall.cart.ui.c
        public boolean d() {
            return false;
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class l implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41969, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SDPOrderFragment.P3(SDPOrderFragment.this, 0, "1");
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class m implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f90606b = new m();
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41970, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HBShareData f90608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f90609d;

        n(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f90608c = hBShareData;
            this.f90609d = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41971, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.D(((com.max.hbcommon.base.d) SDPOrderFragment.this).mContext, this.f90608c);
            this.f90609d.dismiss();
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HBShareData f90611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f90612d;

        o(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f90611c = hBShareData;
            this.f90612d = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41972, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.C(((com.max.hbcommon.base.d) SDPOrderFragment.this).mContext, this.f90611c);
            this.f90612d.dismiss();
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HBShareData f90614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f90615d;

        p(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f90614c = hBShareData;
            this.f90615d = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41973, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.z(((com.max.hbcommon.base.d) SDPOrderFragment.this).mContext, this.f90614c);
            this.f90615d.dismiss();
        }
    }

    /* JADX INFO: compiled from: SDPOrderFragment.kt */
    public static final class q implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 41975, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(SDPOrderFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 41974, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(SDPOrderFragment.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    public SDPOrderFragment() {
        q qVar = new q();
        this.f90577h = qVar;
        this.f90578i = new com.max.hbshare.c.b(com.max.hbshare.c.f72545a, qVar);
    }

    public static final /* synthetic */ void L3(SDPOrderFragment sDPOrderFragment) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment}, null, changeQuickRedirect, true, 41936, new Class[]{SDPOrderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        sDPOrderFragment.W3();
    }

    public static final /* synthetic */ void O3(SDPOrderFragment sDPOrderFragment) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment}, null, changeQuickRedirect, true, 41934, new Class[]{SDPOrderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        sDPOrderFragment.b4();
    }

    public static final /* synthetic */ void P3(SDPOrderFragment sDPOrderFragment, int i10, String str) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment, new Integer(i10), str}, null, changeQuickRedirect, true, 41935, new Class[]{SDPOrderFragment.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        sDPOrderFragment.f4(i10, str);
    }

    public static final /* synthetic */ void Q3(SDPOrderFragment sDPOrderFragment) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment}, null, changeQuickRedirect, true, 41937, new Class[]{SDPOrderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        sDPOrderFragment.h4();
    }

    public static final /* synthetic */ void R3(SDPOrderFragment sDPOrderFragment) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment}, null, changeQuickRedirect, true, 41933, new Class[]{SDPOrderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        sDPOrderFragment.j4();
    }

    public static final /* synthetic */ void U3(SDPOrderFragment sDPOrderFragment) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment}, null, changeQuickRedirect, true, 41932, new Class[]{SDPOrderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        sDPOrderFragment.showError();
    }

    private final float V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41908, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        Activity activity = this.mContext;
        if (activity == null) {
            return 0.0f;
        }
        return ViewUtils.h0(activity, ViewUtils.m(activity, ViewUtils.L(activity), ViewUtils.f(this.mContext, 100.0f)));
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41910, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f90572c;
        if (str == null) {
            f0.S("mOrderId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.s0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final Drawable X3(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 41921, new Class[]{Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableO = com.max.hbutils.utils.q.o(this.mContext, R.color.background_layer_2_color, f10);
        f0.o(gradientDrawableO, "getRectShape(mContext, R…er_2_color, cardRadiusDP)");
        return gradientDrawableO;
    }

    private final Drawable Y3(float f10, float f11, float f12, float f13) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41923, new Class[]{cls, cls, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableP = com.max.hbutils.utils.q.p(this.mContext, R.color.background_layer_2_color, f10, f11, f12, f13);
        f0.o(gradientDrawableP, "getRectShape(\n          …   bottomLeftDp\n        )");
        return gradientDrawableP;
    }

    @SuppressLint({"AutoDispose"})
    private final void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41909, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f90572c;
        if (str == null) {
            f0.S("mOrderId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.R7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void c4(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41926, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        d4(view, R.id.vg_create_post);
        d4(view, R.id.vg_post);
        d4(view, R.id.vg_copy_link);
        d4(view, R.id.vg_save);
        d4(view, R.id.vg_qq);
        d4(view, R.id.vg_wechat_timeline);
        d4(view, R.id.vg_wechat_friends);
    }

    private static final void d4(View view, @d0 int i10) {
        View viewFindViewById;
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, null, changeQuickRedirect, true, 41930, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported || (viewFindViewById = view.findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    private final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41907, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBar.a0();
        ob obVar = this.f90574e;
        if (obVar == null) {
            f0.S("binding");
            obVar = null;
        }
        SmartRefreshLayout smartRefreshLayout = obVar.f114174o;
        smartRefreshLayout.S(new d());
        smartRefreshLayout.b0(false);
        float fV3 = V3();
        obVar.f114184y.setBackground(X3(fV3));
        obVar.f114182w.setBackground(X3(fV3));
        obVar.f114181v.setBackground(Y3(fV3, fV3, 0.0f, 0.0f));
        obVar.f114161b.setBackground(X3(0.0f));
        obVar.f114162c.setBackground(X3(0.0f));
        obVar.f114163d.setBackground(X3(0.0f));
        obVar.f114164e.setBackground(X3(0.0f));
        obVar.f114165f.setBackground(X3(0.0f));
        obVar.f114166g.setBackground(Y3(0.0f, 0.0f, fV3, fV3));
    }

    private final void f4(final int i10, final String str) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, 41912, new Class[]{Integer.TYPE, String.class}, Void.TYPE).isSupported && isActive()) {
            final long j10 = 2000;
            if (i10 >= 5) {
                t4();
                return;
            }
            com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
            String str2 = this.f90572c;
            if (str2 == null) {
                f0.S("mOrderId");
                str2 = null;
            }
            addDisposable((io.reactivex.disposables.b) eVarA.A1(str2, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<MallSteamOrderObj>>() { // from class: com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment$listenOrderState$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public void onError(@d Throwable e10) {
                    if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41947, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(e10, "e");
                    if (this.f90593b.isActive()) {
                        super.onError(e10);
                    }
                }

                public void onNext(@d Result<MallSteamOrderObj> mallSteamOrderObjResult) {
                    if (PatchProxy.proxy(new Object[]{mallSteamOrderObjResult}, this, changeQuickRedirect, false, 41948, new Class[]{Result.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(mallSteamOrderObjResult, "mallSteamOrderObjResult");
                    if (this.f90593b.isActive()) {
                        super.onNext(mallSteamOrderObjResult);
                        MallSteamOrderObj result = mallSteamOrderObjResult.getResult();
                        f0.m(result);
                        if (f0.g(result.getState(), "3")) {
                            SDPOrderFragment.O3(this.f90593b);
                        } else {
                            k.f(r0.a(e1.c()), null, null, new SDPOrderFragment$listenOrderState$1$onNext$1(j10, this.f90593b, i10, str, null), 3, null);
                        }
                    }
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41949, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    onNext((Result<MallSteamOrderObj>) obj);
                }
            }));
        }
    }

    @dl.d
    @xh.m
    public static final SDPOrderFragment g4(@dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 41931, new Class[]{Bundle.class}, SDPOrderFragment.class);
        return patchProxyResultProxy.isSupported ? (SDPOrderFragment) patchProxyResultProxy.result : f90564j.a(bundle);
    }

    private final void h4() {
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj;
        MallOrderBottomBtnObj bottom_button;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41924, new Class[0], Void.TYPE).isSupported || (steamPurchaseOrderDetailObj = this.f90573d) == null || (bottom_button = steamPurchaseOrderDetailObj.getBottom_button()) == null || steamPurchaseOrderDetailObj.getShare_info() == null || !f0.g("share", bottom_button.getType())) {
            return;
        }
        u4(steamPurchaseOrderDetailObj);
    }

    private final void j4() {
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41911, new Class[0], Void.TYPE).isSupported || (steamPurchaseOrderDetailObj = this.f90573d) == null) {
            return;
        }
        w4();
        showContentView();
        this.mTitleBar.setTitle(f90568n);
        ob obVar = this.f90574e;
        if (obVar == null) {
            f0.S("binding");
            obVar = null;
        }
        nc0 nc0Var = obVar.f114183x;
        nc0Var.b().setVisibility(0);
        TextView textView = nc0Var.f113801c;
        String title = steamPurchaseOrderDetailObj.getTitle();
        if (title == null) {
            title = "";
        }
        textView.setText(title);
        TextView textView2 = nc0Var.f113800b;
        String desc = steamPurchaseOrderDetailObj.getDesc();
        textView2.setText(desc != null ? desc : "");
        q4();
        ob obVar2 = this.f90574e;
        if (obVar2 == null) {
            f0.S("binding");
            obVar2 = null;
        }
        ConstraintLayout constraintLayout = obVar2.f114181v;
        constraintLayout.setVisibility(0);
        constraintLayout.setOnClickListener(new f());
        l4(steamPurchaseOrderDetailObj);
        o4();
        r4();
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj2 = this.f90573d;
        if (com.max.hbcommon.utils.c.x(steamPurchaseOrderDetailObj2 != null ? steamPurchaseOrderDetailObj2.is_finished() : null)) {
            return;
        }
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj3 = this.f90573d;
        if ((steamPurchaseOrderDetailObj3 != null ? steamPurchaseOrderDetailObj3.getNot_finish_alert() : null) != null) {
            if (!this.f90576g) {
                this.f90576g = true;
                com.max.hbcommon.analytics.d.d("3", SteamDirectPurchaseTool.f90641m, null, null);
            }
            t4();
        }
    }

    private final void k4(RecGoodsObj recGoodsObj) {
        if (PatchProxy.proxy(new Object[]{recGoodsObj}, this, changeQuickRedirect, false, 41915, new Class[]{RecGoodsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ob obVar = this.f90574e;
        if (obVar == null) {
            f0.S("binding");
            obVar = null;
        }
        RecyclerView onGetRecGoodsSuccess$lambda$7 = obVar.f114173n;
        f0.o(onGetRecGoodsSuccess$lambda$7, "onGetRecGoodsSuccess$lambda$7");
        onGetRecGoodsSuccess$lambda$7.setVisibility(0);
        onGetRecGoodsSuccess$lambda$7.setLayoutManager(new LinearLayoutManager(onGetRecGoodsSuccess$lambda$7.getContext(), 0, false));
        if (onGetRecGoodsSuccess$lambda$7.getItemDecorationCount() <= 0) {
            onGetRecGoodsSuccess$lambda$7.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(onGetRecGoodsSuccess$lambda$7.getContext(), 6.0f), ViewUtils.f(onGetRecGoodsSuccess$lambda$7.getContext(), 12.0f), 0));
        }
        w wVar = new w(onGetRecGoodsSuccess$lambda$7.getContext(), new com.max.xiaoheihe.module.mall.k(onGetRecGoodsSuccess$lambda$7.getContext(), recGoodsObj.getItems()), new g(onGetRecGoodsSuccess$lambda$7, recGoodsObj.getProtocol()));
        wVar.J(-1);
        wVar.H(R.color.transparent);
        onGetRecGoodsSuccess$lambda$7.setAdapter(wVar);
    }

    private final void l4(SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseOrderDetailObj}, this, changeQuickRedirect, false, 41919, new Class[]{SteamPurchaseOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ob obVar = this.f90574e;
        if (obVar == null) {
            f0.S("binding");
            obVar = null;
        }
        obVar.A.setVisibility(8);
        obVar.f114185z.removeAllViews();
        yp ypVarD = yp.d(getLayoutInflater(), obVar.f114185z, false);
        f0.o(ypVarD, "inflate(\n               …  false\n                )");
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        p4(mContext, ypVarD);
        if (obVar.f114185z.getChildCount() > 0) {
            View view = new View(this.mContext);
            view.setBackgroundResource(R.color.divider_secondary_1_color);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ViewUtils.f(this.mContext, 0.5f));
            layoutParams.topMargin = ViewUtils.f(this.mContext, 8.0f);
            layoutParams.bottomMargin = ViewUtils.f(this.mContext, 8.5f);
            layoutParams.leftMargin = ViewUtils.f(this.mContext, 108.0f);
            obVar.f114185z.addView(view, layoutParams);
        }
        obVar.f114185z.addView(ypVarD.b());
    }

    private final void m4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41918, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null || kotlin.text.u.V1(str)) {
            n4(this);
            return;
        }
        int color = Color.parseColor("#8C9196");
        RegexOption regexOption = RegexOption.DOT_MATCHES_ALL;
        Regex regex = new Regex("\\[Question](.*?)(?=\\[|$)", regexOption);
        Regex regex2 = new Regex("\\[Answer](.*?)(?=\\[|$)", regexOption);
        ob obVar = null;
        List listC3 = SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.k1(Regex.f(regex, str, 0, 2, null), new yh.l<kotlin.text.k, String>() { // from class: com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment$parseBuyTipContent$questionMatches$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final String a(@d kotlin.text.k it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41963, new Class[]{kotlin.text.k.class}, String.class);
                if (patchProxyResultProxy.isSupported) {
                    return (String) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return StringsKt__StringsKt.F5(it.c().get(1)).toString();
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ String invoke(kotlin.text.k kVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar}, this, changeQuickRedirect, false, 41964, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(kVar);
            }
        }));
        List listC4 = SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.k1(Regex.f(regex2, str, 0, 2, null), new yh.l<kotlin.text.k, String>() { // from class: com.max.xiaoheihe.module.mall.direct_purchace.SDPOrderFragment$parseBuyTipContent$answerMatches$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final String a(@d kotlin.text.k it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41961, new Class[]{kotlin.text.k.class}, String.class);
                if (patchProxyResultProxy.isSupported) {
                    return (String) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return StringsKt__StringsKt.F5(it.c().get(1)).toString();
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ String invoke(kotlin.text.k kVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar}, this, changeQuickRedirect, false, 41962, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(kVar);
            }
        }));
        ob obVar2 = this.f90574e;
        if (obVar2 == null) {
            f0.S("binding");
        } else {
            obVar = obVar2;
        }
        if (!(!CollectionsKt___CollectionsKt.Q5(listC3).isEmpty()) || !(!CollectionsKt___CollectionsKt.Q5(listC4).isEmpty())) {
            n4(this);
            return;
        }
        List listL = CollectionsKt__CollectionsKt.L(obVar.f114161b, obVar.f114163d, obVar.f114165f);
        int size = listC3.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 < listL.size()) {
                HBLineHeightTextView parseBuyTipContent$lambda$15$lambda$13 = (HBLineHeightTextView) listL.get(i10);
                parseBuyTipContent$lambda$15$lambda$13.setText(((String) listC3.get(i10)).toString());
                parseBuyTipContent$lambda$15$lambda$13.setTextColor(color);
                f0.o(parseBuyTipContent$lambda$15$lambda$13, "parseBuyTipContent$lambda$15$lambda$13");
                parseBuyTipContent$lambda$15$lambda$13.setVisibility(0);
            }
        }
        List listL2 = CollectionsKt__CollectionsKt.L(obVar.f114162c, obVar.f114164e, obVar.f114166g);
        int size2 = listC4.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (i11 < listL2.size()) {
                HBLineHeightTextView parseBuyTipContent$lambda$15$lambda$14 = (HBLineHeightTextView) listL2.get(i11);
                parseBuyTipContent$lambda$15$lambda$14.setText(((String) listC4.get(i11)).toString());
                parseBuyTipContent$lambda$15$lambda$14.setTextColor(color);
                f0.o(parseBuyTipContent$lambda$15$lambda$14, "parseBuyTipContent$lambda$15$lambda$14");
                parseBuyTipContent$lambda$15$lambda$14.setVisibility(0);
            }
        }
    }

    private static final void n4(SDPOrderFragment sDPOrderFragment) {
        if (PatchProxy.proxy(new Object[]{sDPOrderFragment}, null, changeQuickRedirect, true, 41929, new Class[]{SDPOrderFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        ob obVar = sDPOrderFragment.f90574e;
        if (obVar == null) {
            f0.S("binding");
            obVar = null;
        }
        HBLineHeightTextView buyTip0 = obVar.f114161b;
        f0.o(buyTip0, "buyTip0");
        buyTip0.setVisibility(8);
        HBLineHeightTextView buyTip1 = obVar.f114162c;
        f0.o(buyTip1, "buyTip1");
        buyTip1.setVisibility(8);
        HBLineHeightTextView buyTip2 = obVar.f114163d;
        f0.o(buyTip2, "buyTip2");
        buyTip2.setVisibility(8);
        HBLineHeightTextView buyTip3 = obVar.f114164e;
        f0.o(buyTip3, "buyTip3");
        buyTip3.setVisibility(8);
        HBLineHeightTextView buyTip4 = obVar.f114165f;
        f0.o(buyTip4, "buyTip4");
        buyTip4.setVisibility(8);
        HBLineHeightTextView buyTip5 = obVar.f114166g;
        f0.o(buyTip5, "buyTip5");
        buyTip5.setVisibility(8);
    }

    private final void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41928, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj = this.f90573d;
        ob obVar = null;
        MallOrderBottomBtnObj bottom_button = steamPurchaseOrderDetailObj != null ? steamPurchaseOrderDetailObj.getBottom_button() : null;
        if (bottom_button == null || bottom_button.isHidden()) {
            ob obVar2 = this.f90574e;
            if (obVar2 == null) {
                f0.S("binding");
            } else {
                obVar = obVar2;
            }
            obVar.f114167h.setVisibility(8);
            return;
        }
        ob obVar3 = this.f90574e;
        if (obVar3 == null) {
            f0.S("binding");
            obVar3 = null;
        }
        obVar3.f114167h.setVisibility(0);
        ob obVar4 = this.f90574e;
        if (obVar4 == null) {
            f0.S("binding");
            obVar4 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = obVar4.f114180u;
        if (f0.g(bottom_button.getStyle(), "1")) {
            bottomButtonLeftItemView.setShowLeftButton(false);
            bottomButtonLeftItemView.setShowRightButton(true);
            bottomButtonLeftItemView.setRightText(bottom_button.getDesc());
            bottomButtonLeftItemView.setRightClickListener(new h());
        } else if (f0.g(bottom_button.getStyle(), "2")) {
            bottomButtonLeftItemView.setShowLeftButton(true);
            bottomButtonLeftItemView.setShowRightButton(false);
            bottomButtonLeftItemView.setLeftTextColor(androidx.core.content.d.f(bottomButtonLeftItemView.getContext(), R.color.lib_permission_text_primary_1_color));
            bottomButtonLeftItemView.setLeftBackground(new ColorDrawable(androidx.core.content.d.f(bottomButtonLeftItemView.getContext(), R.color.divider_secondary_1_color)));
            bottomButtonLeftItemView.setLeftText(bottom_button.getDesc());
            bottomButtonLeftItemView.setLeftClickListener(new i());
        }
        ob obVar5 = this.f90574e;
        if (obVar5 == null) {
            f0.S("binding");
            obVar5 = null;
        }
        TextView textView = obVar5.f114175p;
        if (com.max.hbcommon.utils.c.u(bottom_button.getTips())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(bottom_button.getTips());
        Activity activity = this.mContext;
        ob obVar6 = this.f90574e;
        if (obVar6 == null) {
            f0.S("binding");
        } else {
            obVar = obVar6;
        }
        textView.setBackgroundDrawable(ViewUtils.x(ViewUtils.o(activity, obVar.f114175p), textView.getResources().getColor(R.color.orange_start), textView.getResources().getColor(R.color.orange_end)));
        textView.setVisibility(0);
    }

    private final void p4(Context context, yp ypVar) {
        if (PatchProxy.proxy(new Object[]{context, ypVar}, this, changeQuickRedirect, false, 41920, new Class[]{Context.class, yp.class}, Void.TYPE).isSupported) {
            return;
        }
        ypVar.b().getLayoutParams().height = ViewUtils.f(context, 108.0f);
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj = this.f90573d;
        if (steamPurchaseOrderDetailObj != null) {
            ypVar.f118012b.setVisibility(0);
            String image = steamPurchaseOrderDetailObj.getImage();
            if (image != null) {
                com.max.hbimage.b.d0(image, ypVar.f118012b, ViewUtils.f(context, 1.0f));
            }
            ypVar.f118013c.setImageResource(R.drawable.sku_background_empty);
        }
        ypVar.f118017g.setVisibility(8);
        TextView textView = ypVar.f118015e;
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj2 = this.f90573d;
        textView.setText(steamPurchaseOrderDetailObj2 != null ? steamPurchaseOrderDetailObj2.getName() : null);
        ypVar.f118014d.setVisibility(8);
        MallPriceCamelView mallPriceCamelView = ypVar.f118019i;
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj3 = this.f90573d;
        mallPriceCamelView.setPrice(steamPurchaseOrderDetailObj3 != null ? steamPurchaseOrderDetailObj3.getRmb() : null);
        ypVar.f118016f.setVisibility(8);
    }

    private final void q4() {
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41917, new Class[0], Void.TYPE).isSupported || (steamPurchaseOrderDetailObj = this.f90573d) == null) {
            return;
        }
        ob obVar = this.f90574e;
        if (obVar == null) {
            f0.S("binding");
            obVar = null;
        }
        obVar.f114182w.setVisibility(0);
        obVar.f114178s.setText(f90567m);
        obVar.f114177r.setText(steamPurchaseOrderDetailObj.getTrans_id());
        m4(steamPurchaseOrderDetailObj.getTip_v2());
        j jVar = new j(steamPurchaseOrderDetailObj);
        obVar.f114177r.setOnClickListener(jVar);
        obVar.f114169j.setOnClickListener(jVar);
    }

    private final void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41914, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TitleBar mTitleBar = this.mTitleBar;
        f0.o(mTitleBar, "mTitleBar");
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj = this.f90573d;
        com.max.xiaoheihe.module.mall.cart.ui.a.b(mTitleBar, mContext, steamPurchaseOrderDetailObj != null ? steamPurchaseOrderDetailObj.getMore_option_btns() : null, new k());
    }

    private final void t4() {
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj;
        AlertObj not_finish_alert;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41913, new Class[0], Void.TYPE).isSupported || (steamPurchaseOrderDetailObj = this.f90573d) == null || (not_finish_alert = steamPurchaseOrderDetailObj.getNot_finish_alert()) == null) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).y(not_finish_alert.getTitle()).l(not_finish_alert.getMsg()).u(not_finish_alert.getConfirm_btn_text(), new l()).o(not_finish_alert.getCancel_btn_text(), m.f90606b).F();
    }

    private final void u4(SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj) {
        Activity mContext;
        Activity mContext2;
        if (PatchProxy.proxy(new Object[]{steamPurchaseOrderDetailObj}, this, changeQuickRedirect, false, 41927, new Class[]{SteamPurchaseOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ShareInfoObj share_info = steamPurchaseOrderDetailObj.getShare_info();
        com.max.hbshare.c.a(com.max.hbshare.c.f72545a, "3", null, share_info != null ? share_info.getExtra_data() : null);
        List<CardObjV2> cm_cards_v2 = steamPurchaseOrderDetailObj.getCm_cards_v2();
        if (!(cm_cards_v2 == null || cm_cards_v2.isEmpty()) && (mContext2 = this.mContext) != null && this.mInflater != null) {
            f0.o(mContext2, "mContext");
            LayoutInflater mInflater = this.mInflater;
            f0.o(mInflater, "mInflater");
            SDPOrderShowCardShareKt.d(this, mContext2, mInflater, steamPurchaseOrderDetailObj);
            return;
        }
        List<CardObj> cm_cards = steamPurchaseOrderDetailObj.getCm_cards();
        if (!(cm_cards == null || cm_cards.isEmpty()) && (mContext = this.mContext) != null && this.mInflater != null) {
            f0.o(mContext, "mContext");
            LayoutInflater mInflater2 = this.mInflater;
            f0.o(mInflater2, "mInflater");
            SDPOrderShowCardShareKt.c(this, mContext, mInflater2, steamPurchaseOrderDetailObj);
            return;
        }
        ShareInfoObj share_info2 = steamPurchaseOrderDetailObj.getShare_info();
        if (this.mContext.isFinishing() || share_info2 == null || share_info2.getShare_window() == null) {
            return;
        }
        ShareWindowObj share_window = share_info2.getShare_window();
        com.max.hbcommon.component.bottomsheet.a aVar = new com.max.hbcommon.component.bottomsheet.a();
        SpannableString spannableString = new SpannableString(share_window.getDesc());
        if (!com.max.hbcommon.utils.c.u(share_window.getDesc_highlight()) && !com.max.hbcommon.utils.c.u(share_window.getDesc())) {
            String desc = share_window.getDesc();
            f0.m(desc);
            String desc_highlight = share_window.getDesc_highlight();
            f0.m(desc_highlight);
            if (StringsKt__StringsKt.W2(desc, desc_highlight, false, 2, null)) {
                String desc2 = share_window.getDesc();
                f0.m(desc2);
                String desc_highlight2 = share_window.getDesc_highlight();
                f0.m(desc_highlight2);
                int iS3 = StringsKt__StringsKt.s3(desc2, desc_highlight2, 0, false, 6, null);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.coupon_orange));
                String desc_highlight3 = share_window.getDesc_highlight();
                f0.m(desc_highlight3);
                spannableString.setSpan(foregroundColorSpan, iS3, desc_highlight3.length() + iS3, 17);
            }
        }
        View weChatShareView = this.mInflater.inflate(R.layout.layout_mall_order_share, (ViewGroup) null);
        weChatShareView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        aVar.h(R.drawable.bottom_sheets_key_discount_28x28).n(R.drawable.bottom_sheets_broken_coupon_80x80).k(true).x(true).l(spannableString).r(weChatShareView);
        com.max.hbcommon.component.bottomsheet.q qVarA = aVar.a();
        SpannableString spannableString2 = new SpannableString(share_window.getTitle());
        if (!com.max.hbcommon.utils.c.u(share_window.getTitle_highlight()) && !com.max.hbcommon.utils.c.u(share_window.getTitle())) {
            String title = share_window.getTitle();
            f0.m(title);
            String title_highlight = share_window.getTitle_highlight();
            f0.m(title_highlight);
            if (StringsKt__StringsKt.W2(title, title_highlight, false, 2, null)) {
                String title2 = share_window.getTitle();
                f0.m(title2);
                String title_highlight2 = share_window.getTitle_highlight();
                f0.m(title_highlight2);
                int iS4 = StringsKt__StringsKt.s3(title2, title_highlight2, 0, false, 6, null);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.coupon_orange));
                String title_highlight3 = share_window.getTitle_highlight();
                f0.m(title_highlight3);
                spannableString2.setSpan(foregroundColorSpan2, iS4, title_highlight3.length() + iS4, 17);
            }
        }
        f0.o(weChatShareView, "weChatShareView");
        c4(weChatShareView);
        View viewFindViewById = weChatShareView.findViewById(R.id.vg_wechat_timeline);
        View viewFindViewById2 = weChatShareView.findViewById(R.id.vg_wechat_friends);
        View viewFindViewById3 = weChatShareView.findViewById(R.id.vg_qq);
        viewFindViewById.setVisibility(0);
        viewFindViewById2.setVisibility(0);
        viewFindViewById3.setVisibility(0);
        HBShareData hBShareData = new HBShareData(false, true, share_info2.getShare_title(), share_info2.getShare_desc(), share_info2.getShare_url(), null, !com.max.hbcommon.utils.c.u(share_info2.getShare_img()) ? new UMImage(this.mContext, share_info2.getShare_img()) : new UMImage(this.mContext, R.drawable.share_thumbnail), this.f90578i, null, null, null, null, null, bb.c.k.L0, null);
        viewFindViewById.setOnClickListener(new n(hBShareData, qVarA));
        viewFindViewById2.setOnClickListener(new o(hBShareData, qVarA));
        viewFindViewById3.setOnClickListener(new p(hBShareData, qVarA));
        qVarA.M3(getChildFragmentManager(), "share_bottom_dialog");
        if (qVarA.isViewCreated()) {
            qVarA.l4().setText(spannableString2);
            qVarA.e4().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            View viewD4 = qVarA.d4();
            f0.n(viewD4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) viewD4).getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).height = -2;
            ViewGroup.LayoutParams layoutParams2 = qVarA.m4().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = ViewUtils.f(this.mContext, 56.0f);
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.height = -2;
        }
    }

    private final void w4() {
        ShareInfoObj share_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41922, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj = this.f90573d;
        this.f90578i.a((steamPurchaseOrderDetailObj == null || (share_info = steamPurchaseOrderDetailObj.getShare_info()) == null) ? null : share_info.getExtra_data());
    }

    public final int Z3() {
        return this.f90575f;
    }

    @dl.d
    public final com.max.hbshare.c.b a4() {
        return this.f90578i;
    }

    public final void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41916, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj = this.f90573d;
        ob obVar = null;
        RelatedRecommend related_recommend = steamPurchaseOrderDetailObj != null ? steamPurchaseOrderDetailObj.getRelated_recommend() : null;
        List<MallProductObj> items = related_recommend != null ? related_recommend.getItems() : null;
        if (related_recommend != null) {
            if (!(items == null || items.isEmpty())) {
                RecGoodsObj recGoodsObj = new RecGoodsObj();
                recGoodsObj.setItems(items);
                String proto = related_recommend.getProto();
                if (proto == null) {
                    proto = "";
                }
                recGoodsObj.setProtocol(proto);
                k4(recGoodsObj);
                ob obVar2 = this.f90574e;
                if (obVar2 == null) {
                    f0.S("binding");
                } else {
                    obVar = obVar2;
                }
                ListSectionHeader onGetList$lambda$10 = obVar.f114172m;
                f0.o(onGetList$lambda$10, "onGetList$lambda$10");
                onGetList$lambda$10.setVisibility(0);
                String title = related_recommend.getTitle();
                onGetList$lambda$10.setTitleText(title != null ? title : "");
                onGetList$lambda$10.setMoreColor(androidx.core.content.d.f(this.mContext, R.color.text_primary_1_color));
                String proto2 = related_recommend.getProto();
                if (proto2 != null) {
                    onGetList$lambda$10.setMoreClickListener(new e(onGetList$lambda$10, proto2));
                }
                showContentView();
                return;
            }
        }
        ob obVar3 = this.f90574e;
        if (obVar3 == null) {
            f0.S("binding");
            obVar3 = null;
        }
        RecyclerView recyclerView = obVar3.f114173n;
        f0.o(recyclerView, "binding.rvRecGoods");
        recyclerView.setVisibility(8);
        ob obVar4 = this.f90574e;
        if (obVar4 == null) {
            f0.S("binding");
        } else {
            obVar = obVar4;
        }
        ListSectionHeader listSectionHeader = obVar.f114172m;
        f0.o(listSectionHeader, "binding.lshTitle");
        listSectionHeader.setVisibility(8);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41905, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ob obVarC = ob.c(this.mInflater);
        f0.o(obVarC, "inflate(mInflater)");
        this.f90574e = obVarC;
        if (obVarC == null) {
            f0.S("binding");
            obVarC = null;
        }
        setContentView(obVarC);
        e4();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("order_id") : null;
        if (string == null) {
            return;
        }
        this.f90572c = string;
        showLoading();
        b4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41906, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b4();
    }

    public final void s4(int i10) {
        this.f90575f = i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v4(@dl.d File imageFile, int i10, int i11, @dl.e String str) {
        Object[] objArr = {imageFile, new Integer(i10), new Integer(i11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41925, new Class[]{File.class, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageFile, "imageFile");
        FragmentActivity activity = getActivity();
        if (activity != null && i0.e(activity)) {
            Intent intentA = PostTabActivity.f82577y1.a(activity, PostType.Picture);
            BBSTextObj bBSTextObj = new BBSTextObj();
            bBSTextObj.setText(imageFile.getAbsolutePath());
            bBSTextObj.setHeight(String.valueOf(i11));
            bBSTextObj.setWidth(String.valueOf(i10));
            bBSTextObj.setUrl("");
            PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
            List<BBSTextObj> imgPathList = pictureVideoLinkDraftObj.getImgPathList();
            if (imgPathList != null) {
                imgPathList.add(bBSTextObj);
            }
            intentA.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
            if (str != null) {
                intentA.putExtra(PictureVideoEditPostFragment.f82334c4, str);
            }
            activity.startActivityForResult(intentA, 9991);
        }
    }
}
