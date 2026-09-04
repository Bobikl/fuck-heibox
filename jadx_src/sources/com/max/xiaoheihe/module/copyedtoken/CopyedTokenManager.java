package com.max.xiaoheihe.module.copyedtoken;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.ProtocalResultObj;
import com.max.xiaoheihe.bean.game.CopyedTokenResult;
import com.max.xiaoheihe.module.account.RegisterOrLoginActivityV2;
import com.max.xiaoheihe.module.ads.AdsActivity;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: CopyedTokenManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class CopyedTokenManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final CopyedTokenManager f83565a = new CopyedTokenManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83566b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CopyedTokenManager.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<ProtocalResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83567b;

        a(Context context) {
            this.f83567b = context;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31462, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<ProtocalResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31463, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            ProtocalResultObj result2 = result.getResult();
            if (result2 == null || com.max.hbcommon.utils.c.u(result2.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f83567b, result2.getProtocol());
            com.max.xiaoheihe.utils.d.g();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31464, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ProtocalResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: CopyedTokenManager.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<CopyedTokenResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f83568b;

        b(Activity activity) {
            this.f83568b = activity;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31465, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<CopyedTokenResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31466, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (result.getResult() != null) {
                CopyedTokenManager copyedTokenManager = CopyedTokenManager.f83565a;
                CopyedTokenResult result2 = result.getResult();
                f0.m(result2);
                copyedTokenManager.f(result2, this.f83568b);
                com.max.xiaoheihe.utils.d.g();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31467, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CopyedTokenResult>) obj);
        }
    }

    /* JADX INFO: compiled from: CopyedTokenManager.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f83569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyedTokenResult f83570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f83571d;

        c(Activity activity, CopyedTokenResult copyedTokenResult, com.max.hbcommon.view.a aVar) {
            this.f83569b = activity;
            this.f83570c = copyedTokenResult;
            this.f83571d = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31468, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f83569b, this.f83570c.getJump_protocol());
            this.f83571d.dismiss();
        }
    }

    /* JADX INFO: compiled from: CopyedTokenManager.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f83580b;

        d(com.max.hbcommon.view.a aVar) {
            this.f83580b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31469, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83580b.dismiss();
        }
    }

    private CopyedTokenManager() {
    }

    public static final /* synthetic */ void a(CopyedTokenManager copyedTokenManager, Context context, String str) {
        if (PatchProxy.proxy(new Object[]{copyedTokenManager, context, str}, null, changeQuickRedirect, true, 31453, new Class[]{CopyedTokenManager.class, Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        copyedTokenManager.d(context, str);
    }

    public static final /* synthetic */ void b(CopyedTokenManager copyedTokenManager, String str, Activity activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{copyedTokenManager, str, activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31452, new Class[]{CopyedTokenManager.class, String.class, Activity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        copyedTokenManager.e(str, activity, z10);
    }

    private final void d(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 31451, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
    }

    private final void e(String str, Activity activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31448, new Class[]{String.class, Activity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        i.a().B1(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(activity));
    }

    public final void c(@dl.d Activity activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31450, new Class[]{Activity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        if ((activity instanceof RegisterOrLoginActivityV2) || (activity instanceof AdsActivity)) {
            return;
        }
        k.f(r0.a(e1.e()), null, null, new CopyedTokenManager$checkForCopyedToken$1(com.max.hbcache.c.j("copyed_token_regex"), com.max.hbcache.c.j("chat_copyed_token_regex"), activity, z10, null), 3, null);
    }

    public final void f(@dl.d CopyedTokenResult data, @dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{data, activity}, this, changeQuickRedirect, false, 31449, new Class[]{CopyedTokenResult.class, Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        f0.p(activity, "activity");
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.layout_copyed_token_card, (ViewGroup) null);
        f0.n(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(activity).D(viewGroup).g(true).B(true).E(0).d();
        View viewFindViewById = viewGroup.findViewById(R.id.iv_cancel);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.iv_avatar);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById3 = viewGroup.findViewById(R.id.iv_img);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.tv_remark);
        f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.tv_title);
        f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.tv_desc);
        f0.n(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.tv_btn);
        f0.n(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.iv_bg);
        f0.n(viewFindViewById8, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView3 = (ImageView) viewFindViewById8;
        com.max.hbimage.b.L(data.getCard_producer_avatar(), (ImageView) viewFindViewById2, R.drawable.common_default_avatar_40x40);
        com.max.hbimage.b.L(data.getImg_url(), imageView2, R.drawable.common_default_placeholder_375x210);
        if (n.q(data.getImg_height()) > 0 && n.q(data.getImg_width()) > 0) {
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            layoutParams.width = ViewUtils.f(activity, n.q(data.getImg_width()));
            layoutParams.height = ViewUtils.f(activity, n.q(data.getImg_height()));
            imageView2.setLayoutParams(layoutParams);
        }
        if (!com.max.hbcommon.utils.c.u(data.getBackground())) {
            com.max.hbimage.b.K(data.getBackground(), imageView3);
        }
        textView.setText(data.getCard_producer_remark());
        textView2.setText(data.getTitle());
        textView3.setText(data.getDesc());
        textView4.setText(data.getButton_text());
        textView4.setOnClickListener(new c(activity, data, aVarD));
        if (!com.max.hbcommon.utils.c.u(data.getButton_color())) {
            textView4.setBackground(q.v(activity, com.max.xiaoheihe.utils.d.e1(data.getButton_color()), 2.0f));
        }
        imageView.setOnClickListener(new d(aVarD));
        aVarD.show();
    }
}
