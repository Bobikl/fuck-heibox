package com.max.xiaoheihe.module.miniprogram;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.g3;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.fragment.BaseLittleProgramFragment;
import com.max.hbminiprogram.fragment.MiniProgramHostViewModel;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt;
import com.max.xiaoheihe.bean.SourceInfoObj;
import com.max.xiaoheihe.bean.SourceType;
import com.max.xiaoheihe.bean.WebCfgObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.steaminfo.SteamPrivacyJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.message.common.inter.ITagManager;
import df.p1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;
import kotlin.z;
import xh.m;

/* JADX INFO: compiled from: MiniProgramHostActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nMiniProgramHostActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniProgramHostActivity.kt\ncom/max/xiaoheihe/module/miniprogram/MiniProgramHostActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n75#2,13:677\n29#3:690\n5#3,2:691\n22#3:693\n7#3:694\n1#4:695\n1774#5,4:696\n*S KotlinDebug\n*F\n+ 1 MiniProgramHostActivity.kt\ncom/max/xiaoheihe/module/miniprogram/MiniProgramHostActivity\n*L\n75#1:677,13\n281#1:690\n281#1:691,2\n281#1:693\n281#1:694\n552#1:696,4\n*E\n"})
@o(parameters = 0)
public final class MiniProgramHostActivity extends WebActionActivity implements com.max.xiaoheihe.module.miniprogram.a {

    @dl.d
    public static final a C4 = new a(null);
    public static final int D4 = 8;

    @dl.d
    public static final String E4 = "/web_miniprogram";

    @dl.d
    public static final String F4 = "/root/web_miniprogram";

    @dl.d
    public static final String G4 = "/flutter/miniprogram";

    @dl.d
    public static final String H4 = "/flutter/heybox_voice";

    @dl.d
    public static final String I4 = "/flutter";

    @dl.d
    public static final String J4 = "fragment_path";

    @dl.d
    public static final String K4 = "mini_program_id";

    @dl.d
    public static final String L4 = "source";

    @dl.d
    public static final String M4 = "web_protocol";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A4;

    @dl.e
    private ArrayList<ArrayList<PathSrcNode>> B4;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private p1 f91050q4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private String f91051r4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private NavController f91052s4;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    @dl.d
    private final z f91053t4;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.littleprogram.a f91054u4;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    @dl.e
    private String f91055v4;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    @dl.e
    private String f91056w4;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private long f91057x4;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    @dl.e
    private MiniAppContainerReportBroadcastReceiver f91058y4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    @dl.e
    private BubbleTipPopup f91059z4;

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public final class MiniAppContainerReportBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public MiniAppContainerReportBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.e Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 42200, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            if (intent != null) {
                String stringExtra = intent.getStringExtra(com.max.xiaoheihe.module.littleprogram.b.H);
                if (f0.g(com.max.xiaoheihe.module.littleprogram.b.I, stringExtra)) {
                    MiniProgramHostActivity.Y3(MiniProgramHostActivity.this);
                } else if (f0.g(com.max.xiaoheihe.module.littleprogram.b.J, stringExtra)) {
                    MiniProgramHostActivity.this.f91057x4 = System.currentTimeMillis();
                }
            }
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context, @dl.e String str, @dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, bundle}, this, changeQuickRedirect, false, 42198, new Class[]{Context.class, String.class, Bundle.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intent = new Intent(context, (Class<?>) MiniProgramHostActivity.class);
            intent.putExtra(MiniProgramHostActivity.J4, str);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            return intent;
        }

        @dl.d
        @m
        public final Intent b(@dl.e Context context, @dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bundle}, this, changeQuickRedirect, false, 42199, new Class[]{Context.class, Bundle.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intent = new Intent(context, (Class<?>) MiniProgramHostActivity.class);
            intent.putExtra(MiniProgramHostActivity.J4, MiniProgramHostActivity.F4);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            return intent;
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class b implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 42202, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 42201, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.o(it, "it");
            if (it.booleanValue()) {
                MiniProgramHostActivity.c4(MiniProgramHostActivity.this);
            }
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class c implements com.max.hbminiprogram.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbminiprogram.c
        public final void a(@dl.e MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
            if (PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj}, this, changeQuickRedirect, false, 42203, new Class[]{MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported || miniProgramMenuInfoObj == null) {
                return;
            }
            MiniProgramHostActivity.V3(MiniProgramHostActivity.this).k().o(miniProgramMenuInfoObj);
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    @t0({"SMAP\nMiniProgramHostActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniProgramHostActivity.kt\ncom/max/xiaoheihe/module/miniprogram/MiniProgramHostActivity$initStarterDestination$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n1549#2:677\n1620#2,3:678\n*S KotlinDebug\n*F\n+ 1 MiniProgramHostActivity.kt\ncom/max/xiaoheihe/module/miniprogram/MiniProgramHostActivity$initStarterDestination$1\n*L\n310#1:677\n310#1:678,3\n*E\n"})
    public static final class d implements NavController.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MiniProgramHostActivity f91064b;

            a(MiniProgramHostActivity miniProgramHostActivity) {
                this.f91064b = miniProgramHostActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42205, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.heybox.hblog.g.f74531b.q("MiniProgramHostActivity, onBackPressedIgnoreIntercept, " + this.f91064b.T());
                MiniProgramHostActivity miniProgramHostActivity = this.f91064b;
                miniProgramHostActivity.P(((BaseActivity) miniProgramHostActivity).f66601b);
            }
        }

        d() {
        }

        @Override // androidx.navigation.NavController.b
        public final void a(@dl.d NavController navController, @dl.d NavDestination destination, @dl.e Bundle bundle) {
            if (PatchProxy.proxy(new Object[]{navController, destination, bundle}, this, changeQuickRedirect, false, 42204, new Class[]{NavController.class, NavDestination.class, Bundle.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(navController, "navController");
            f0.p(destination, "destination");
            kotlin.collections.i<NavBackStackEntry> iVarB = com.max.xiaoheihe.accelworld.o.b(navController);
            int size = iVarB.size();
            boolean z10 = MiniProgramHostActivity.this.A4 > size;
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MiniProgramHostActivity, addOnDestinationChangedListener, destination = ");
            sb2.append(destination);
            sb2.append(", isBack = ");
            sb2.append(z10);
            sb2.append(", curPopStackSize = ");
            sb2.append(MiniProgramHostActivity.this.A4);
            sb2.append(", newStackSize = ");
            sb2.append(size);
            sb2.append(", currentFragment = ");
            sb2.append(MiniProgramHostActivity.this.T());
            sb2.append(", currentDestination = ");
            sb2.append(navController.U());
            sb2.append(", previousBackStackEntry = ");
            NavBackStackEntry navBackStackEntryA0 = navController.a0();
            sb2.append(navBackStackEntryA0 != null ? navBackStackEntryA0.e() : null);
            sb2.append(". backQueue = ");
            ArrayList arrayList = new ArrayList(t.Y(iVarB, 10));
            for (NavBackStackEntry navBackStackEntry : iVarB) {
                arrayList.add(navBackStackEntry.e().F() + IOUtils.DIR_SEPARATOR_UNIX + ((Object) navBackStackEntry.e().B()));
            }
            sb2.append(CollectionsKt___CollectionsKt.Q5(arrayList));
            aVar.q(sb2.toString());
            MiniProgramHostActivity.this.A4 = size;
            MiniProgramHostActivity miniProgramHostActivity = MiniProgramHostActivity.this;
            View contentView = miniProgramHostActivity.W0();
            f0.o(contentView, "contentView");
            MiniProgramHostActivity.W3(miniProgramHostActivity, contentView);
            if (z10) {
                ((BaseActivity) MiniProgramHostActivity.this).f66608i.post(new a(MiniProgramHostActivity.this));
            }
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42206, new Class[]{View.class}, Void.TYPE).isSupported || MiniProgramHostActivity.X3(MiniProgramHostActivity.this)) {
                return;
            }
            MiniProgramHostActivity.this.b2();
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.max.xiaoheihe.module.littleprogram.a aVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42207, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BubbleTipPopup bubbleTipPopup = MiniProgramHostActivity.this.f91059z4;
            if (bubbleTipPopup != null) {
                bubbleTipPopup.G();
            }
            Fragment fragmentT = MiniProgramHostActivity.this.T();
            com.max.heybox.hblog.g.f74531b.q("MiniProgramHostActivity, vgLittleProgramMore click, currentFragment = " + fragmentT);
            if (fragmentT instanceof BaseLittleProgramFragment) {
                ((BaseLittleProgramFragment) fragmentT).g4();
            } else {
                if (MiniProgramHostActivity.this.g4() == null || (aVar = MiniProgramHostActivity.this.f91054u4) == null) {
                    return;
                }
                MiniProgramHostActivity miniProgramHostActivity = MiniProgramHostActivity.this;
                aVar.w(miniProgramHostActivity, miniProgramHostActivity.g4());
            }
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class g implements com.max.xiaoheihe.module.webview.t.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f91067a = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.xiaoheihe.module.webview.t.b
        public final void a(@dl.d JsonObject it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 42208, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class h implements com.max.xiaoheihe.module.webview.t.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f91068a;

        h(Fragment fragment) {
            this.f91068a = fragment;
        }

        @Override // com.max.xiaoheihe.module.webview.t.a
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42209, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ((WebviewFragment) this.f91068a).H6(WebviewFragment.f94359a5, null);
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 42210, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            WebviewFragment webviewFragmentN2 = MiniProgramHostActivity.this.N2();
            if (webviewFragmentN2 != null) {
                webviewFragmentN2.onRefresh();
            }
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class j implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f91070b = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42211, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Fragment fragmentT = MiniProgramHostActivity.this.T();
            if (fragmentT instanceof BaseLittleProgramFragment) {
                ((BaseLittleProgramFragment) fragmentT).onRefresh();
            }
        }
    }

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class l implements z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // androidx.core.view.z0
        @dl.d
        public final n3 a(@dl.d View view, @dl.d n3 insets) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, insets}, this, changeQuickRedirect, false, 42212, new Class[]{View.class, n3.class}, n3.class);
            if (patchProxyResultProxy.isSupported) {
                return (n3) patchProxyResultProxy.result;
            }
            f0.p(view, "view");
            f0.p(insets, "insets");
            MiniProgramHostActivity.V3(MiniProgramHostActivity.this).p(g3.a(MiniProgramHostActivity.this.getWindow(), view).f());
            return insets;
        }
    }

    public MiniProgramHostActivity() {
        final yh.a aVar = null;
        this.f91053t4 = new ViewModelLazy(n0.d(MiniProgramHostViewModel.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42221, new Class[0], b1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (b1) patchProxyResultProxy.result;
                }
                b1 viewModelStore = this.getViewModelStore();
                f0.o(viewModelStore, "viewModelStore");
                return viewModelStore;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42222, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42219, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                y0.b defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42220, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42224, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42223, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                if (aVar3 != null && (aVar2 = (u2.a) aVar3.invoke()) != null) {
                    return aVar2;
                }
                u2.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                f0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public static final /* synthetic */ MiniProgramHostViewModel V3(MiniProgramHostActivity miniProgramHostActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramHostActivity}, null, changeQuickRedirect, true, 42193, new Class[]{MiniProgramHostActivity.class}, MiniProgramHostViewModel.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramHostViewModel) patchProxyResultProxy.result : miniProgramHostActivity.i4();
    }

    public static final /* synthetic */ void W3(MiniProgramHostActivity miniProgramHostActivity, View view) {
        if (PatchProxy.proxy(new Object[]{miniProgramHostActivity, view}, null, changeQuickRedirect, true, 42196, new Class[]{MiniProgramHostActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        miniProgramHostActivity.hideSoftKeyboard(view);
    }

    public static final /* synthetic */ boolean X3(MiniProgramHostActivity miniProgramHostActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramHostActivity}, null, changeQuickRedirect, true, 42194, new Class[]{MiniProgramHostActivity.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : miniProgramHostActivity.p4();
    }

    public static final /* synthetic */ void Y3(MiniProgramHostActivity miniProgramHostActivity) {
        if (PatchProxy.proxy(new Object[]{miniProgramHostActivity}, null, changeQuickRedirect, true, 42197, new Class[]{MiniProgramHostActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        miniProgramHostActivity.q4();
    }

    public static final /* synthetic */ void Z3(MiniProgramHostActivity miniProgramHostActivity) {
        if (PatchProxy.proxy(new Object[]{miniProgramHostActivity}, null, changeQuickRedirect, true, 42195, new Class[]{MiniProgramHostActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        miniProgramHostActivity.r4();
    }

    public static final /* synthetic */ void c4(MiniProgramHostActivity miniProgramHostActivity) {
        if (PatchProxy.proxy(new Object[]{miniProgramHostActivity}, null, changeQuickRedirect, true, 42192, new Class[]{MiniProgramHostActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        miniProgramHostActivity.v4();
    }

    private final Bundle d4(String str, Bundle bundle) {
        AccountDetailObj account_detail;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bundle}, this, changeQuickRedirect, false, 42172, new Class[]{String.class, Bundle.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        if (f0.g(str, F4) || f0.g(str, E4)) {
            Intent intent = new Intent();
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            return e4(intent);
        }
        String userid = null;
        if (!kotlin.text.u.v2(str, "/flutter", false, 2, null)) {
            return bundle;
        }
        if (bundle == null) {
            bundle = androidx.core.os.e.a();
        }
        if (!i0.s()) {
            return bundle;
        }
        User userO = i0.o();
        if (userO != null && (account_detail = userO.getAccount_detail()) != null) {
            userid = account_detail.getUserid();
        }
        bundle.putString("my_heybox_id", userid);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0083  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    private final Bundle e4(Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 42173, new Class[]{Intent.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        L2(intent);
        k4();
        int iE1 = -1;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MiniProgramHostActivity, initWebFragment, pageurl = ");
        sb2.append(this.S);
        sb2.append(", intent = ");
        sb2.append(intent != null ? intent.getExtras() : null);
        aVar.q(sb2.toString());
        if (!com.max.hbcommon.utils.c.u(this.S)) {
            String pageurl = this.S;
            f0.o(pageurl, "pageurl");
            if (!StringsKt__StringsKt.W2(pageurl, "game/pubg/get_match_detail", false, 2, null)) {
                String pageurl2 = this.S;
                f0.o(pageurl2, "pageurl");
                if (!StringsKt__StringsKt.W2(pageurl2, "game/pubg/get_single_match_detail", false, 2, null)) {
                    if (!com.max.hbcommon.utils.c.u(this.Q)) {
                        iE1 = com.max.xiaoheihe.utils.d.e1(this.Q);
                    }
                }
            }
            iE1 = getResources().getColor(R.color.text_primary_1_color);
        } else if (!com.max.hbcommon.utils.c.u(this.Q)) {
            iE1 = com.max.xiaoheihe.utils.d.e1(this.Q);
        }
        Bundle bundleB = new com.max.xiaoheihe.module.webview.u(this.S).f(iE1).p(this.f94281x2).u(this.f94283y2).r(this.G2).e(this.f94279p3).q(this.U).h(this.W).o(this.G3).t(new ProxyAddressObj(this.f94269c0, this.f94277p1)).j(true).B(this.O3).n(this.f94280x1).y(this.X).g(this.f94274g4).A(this.f94272e4).z(this.f94273f4).l(new IpDirectObj(this.Z3, this.f94266a4)).k(this.J3).b();
        SteamPrivacyJsObj steamPrivacyJsObj = this.U3;
        if (steamPrivacyJsObj != null) {
            bundleB.putSerializable("steam_privacy_js", steamPrivacyJsObj);
        }
        bundleB.putString(com.max.xiaoheihe.module.proxy.a.f91563d, intent != null ? intent.getStringExtra(com.max.xiaoheihe.module.proxy.a.f91563d) : null);
        return bundleB;
    }

    private final String f4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42168, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (f0.g(str, E4)) {
            return F4;
        }
        if (f0.g(str, "/flutter/heybox_voice")) {
            return "/flutter/heybox_voice";
        }
        return kotlin.text.u.v2(str, "/flutter", false, 2, null) ? G4 : str;
    }

    private final void hideSoftKeyboard(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42163, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Object systemService = this.f66601b.getSystemService("input_method");
        f0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private final MiniProgramHostViewModel i4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42154, new Class[0], MiniProgramHostViewModel.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramHostViewModel) patchProxyResultProxy.result : (MiniProgramHostViewModel) this.f91053t4.getValue();
    }

    @dl.d
    @m
    public static final Intent j4(@dl.e Context context, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bundle}, null, changeQuickRedirect, true, 42191, new Class[]{Context.class, Bundle.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : C4.b(context, bundle);
    }

    private final void k4() {
        WebProtocolObj webProtocolObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42164, new Class[0], Void.TYPE).isSupported || (webProtocolObj = this.O3) == null) {
            return;
        }
        WebCfgObj webview = webProtocolObj.getWebview();
        if (webview != null) {
            this.S = webview.getUrl();
            this.Q = webview.getBg();
            this.f94283y2 = webview.isRefresh();
            this.G2 = webview.isDisable_navi();
            this.f94279p3 = webview.isAllow_display_keyboard();
        }
        if (this.O3.isNetwork()) {
            this.G3 = this.O3.valueOf("network_js");
        }
        if (com.max.hbcommon.utils.c.x(this.O3.valueOf("show_loading"))) {
            this.f94281x2 = WebviewFragment.V4;
        }
    }

    private final void l4() {
        Serializable serializable;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42156, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        this.f91055v4 = extras != null ? extras.getString("mini_program_id") : null;
        this.f91056w4 = extras != null ? extras.getString("source") : null;
        if ((com.max.hbcommon.utils.c.u(this.f91055v4) || com.max.hbcommon.utils.c.u(this.f91056w4)) && extras != null && (serializable = extras.getSerializable("web_protocol")) != null && (serializable instanceof WebProtocolObj)) {
            if (com.max.hbcommon.utils.c.u(this.f91055v4)) {
                this.f91055v4 = ((WebProtocolObj) serializable).getMini_program_id();
            }
            if (com.max.hbcommon.utils.c.u(this.f91056w4)) {
                this.f91056w4 = ((WebProtocolObj) serializable).getParam("source");
            }
        }
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MiniProgramHostActivity, initHostData, intent = ");
        Intent intent2 = getIntent();
        sb2.append(intent2 != null ? intent2.getExtras() : null);
        sb2.append(", source = ");
        sb2.append(this.f91056w4);
        sb2.append(", mMiniProgramId = ");
        sb2.append(this.f91055v4);
        aVar.q(sb2.toString());
        this.f91054u4 = new com.max.xiaoheihe.module.littleprogram.a(this, this.f91055v4);
        i4().n().k(this, new b());
        String str = this.f91055v4;
        if (str != null) {
            i4().r(str);
        }
        com.max.xiaoheihe.module.littleprogram.a aVar2 = this.f91054u4;
        if (aVar2 != null) {
            aVar2.b(new c());
        }
        com.max.xiaoheihe.module.littleprogram.a aVar3 = this.f91054u4;
        if (aVar3 != null) {
            aVar3.o(this.f91055v4, this.f91056w4);
        }
    }

    private final void m4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42167, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null || com.max.hbcommon.utils.c.u(str)) {
            com.max.hbutils.utils.c.f("小程序路径有误");
            return;
        }
        try {
            NavController navController = this.f91052s4;
            NavController navController2 = null;
            if (navController == null) {
                f0.S("navController");
                navController = null;
            }
            NavGraph navGraphB = navController.Y().b(R.navigation.mini_program_graph);
            if (!kotlin.text.u.v2(str, "/", false, 2, null)) {
                str = IOUtils.DIR_SEPARATOR_UNIX + str;
            }
            com.max.heybox.hblog.g.f74531b.q("MiniProgramHostActivity, initStarterDestination, route = " + str + ", navGraph.startDestinationId = " + navGraphB.E0() + ", navGraph.startDestinationRoute = " + navGraphB.F0() + ", nodes = " + navGraphB.A0());
            String strF4 = f4(str);
            navGraphB.P0(strF4);
            this.f91051r4 = strF4;
            NavController navController3 = this.f91052s4;
            if (navController3 == null) {
                f0.S("navController");
            } else {
                navController2 = navController3;
            }
            navController2.q1(navGraphB, d4(strF4, getIntent().getExtras()));
        } catch (Exception e10) {
            com.max.heybox.hblog.g.f74531b.w("MiniProgramHostActivity, " + e10.getMessage(), e10);
            com.max.hbutils.utils.c.f("小程序路径有误");
        }
    }

    private final void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42166, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String stringExtra = getIntent().getStringExtra(J4);
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.nav_host_fragment);
        f0.n(fragmentR0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f91052s4 = ((NavHostFragment) fragmentR0).i3();
        m4(stringExtra);
        NavController navController = this.f91052s4;
        if (navController == null) {
            f0.S("navController");
            navController = null;
        }
        navController.s(new d());
    }

    private final void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42157, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p1 p1Var = this.f91050q4;
        p1 p1Var2 = null;
        if (p1Var == null) {
            f0.S("mBinding");
            p1Var = null;
        }
        p1Var.f114381b.f115123f.setOnClickListener(new e());
        p1 p1Var3 = this.f91050q4;
        if (p1Var3 == null) {
            f0.S("mBinding");
        } else {
            p1Var2 = p1Var3;
        }
        p1Var2.f114381b.f115124g.setOnClickListener(new f());
        g3.c(getWindow(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean p4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42176, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Fragment fragmentT = T();
        if ((fragmentT instanceof WebviewFragment) && ((WebviewFragment) fragmentT).j7()) {
            com.max.xiaoheihe.accelworld.j.e(com.max.xiaoheihe.accelworld.j.h(WebviewFragment.f94359a5), (com.max.xiaoheihe.module.webview.t) fragmentT, g.f91067a, new h(fragmentT), null);
            return true;
        }
        if (fragmentT instanceof com.max.hbminiprogram.k) {
            return ((com.max.hbminiprogram.k) fragmentT).I0();
        }
        return false;
    }

    private final void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42184, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appid", this.f91055v4);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f91057x4;
        com.max.hbcommon.analytics.d.e("2", lb.d.f131140c5, String.valueOf(w.a(jCurrentTimeMillis)), String.valueOf(jCurrentTimeMillis), jsonObject, this.B4, true);
    }

    private final void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42159, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        boolean zF = g3.a(getWindow(), getWindow().getDecorView()).f();
        com.max.heybox.hblog.g.f74531b.q("MiniProgramHostActivity, refreshLittleProgramIcon, isAppearanceLightStatusBars = " + zF);
        p1 p1Var = null;
        if (zF) {
            p1 p1Var2 = this.f91050q4;
            if (p1Var2 == null) {
                f0.S("mBinding");
                p1Var2 = null;
            }
            p1Var2.f114381b.f115122e.setBackgroundResource(R.drawable.div_black_alpha50_stroke_16dp);
            int iE = com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color);
            p1 p1Var3 = this.f91050q4;
            if (p1Var3 == null) {
                f0.S("mBinding");
                p1Var3 = null;
            }
            p1Var3.f114381b.f115120c.setColorFilter(iE);
            p1 p1Var4 = this.f91050q4;
            if (p1Var4 == null) {
                f0.S("mBinding");
                p1Var4 = null;
            }
            p1Var4.f114381b.f115119b.setColorFilter(iE);
            p1 p1Var5 = this.f91050q4;
            if (p1Var5 == null) {
                f0.S("mBinding");
            } else {
                p1Var = p1Var5;
            }
            p1Var.f114381b.f115121d.setBackgroundResource(R.color.black_alpha50);
            return;
        }
        p1 p1Var6 = this.f91050q4;
        if (p1Var6 == null) {
            f0.S("mBinding");
            p1Var6 = null;
        }
        p1Var6.f114381b.f115122e.setBackgroundResource(R.drawable.white_alpha50_stroke_16dp);
        int iE2 = com.max.xiaoheihe.utils.d.E(R.color.white);
        p1 p1Var7 = this.f91050q4;
        if (p1Var7 == null) {
            f0.S("mBinding");
            p1Var7 = null;
        }
        p1Var7.f114381b.f115120c.setColorFilter(iE2);
        p1 p1Var8 = this.f91050q4;
        if (p1Var8 == null) {
            f0.S("mBinding");
            p1Var8 = null;
        }
        p1Var8.f114381b.f115119b.setColorFilter(iE2);
        p1 p1Var9 = this.f91050q4;
        if (p1Var9 == null) {
            f0.S("mBinding");
        } else {
            p1Var = p1Var9;
        }
        p1Var.f114381b.f115121d.setBackgroundResource(R.color.white_alpha50);
    }

    private final void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42158, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j1.a2(this.f66608i, new l());
        androidx.lifecycle.z.a(this).f(new MiniProgramHostActivity$registerStatusBarStyleChange$2(this, null));
    }

    private final void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42160, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BubbleTipPopup.a aVar = new BubbleTipPopup.a(this);
        p1 p1Var = this.f91050q4;
        if (p1Var == null) {
            f0.S("mBinding");
            p1Var = null;
        }
        BubbleTipPopup.a aVarU0 = aVar.c(p1Var.f114381b.f115124g).o1(R.string.add_to_my_mini_program_tip).s1(12.0f).p0(4.0f).i0(80).d(true).f(30.0f).u0(ViewUtils.f(this.f66601b, 16.0f), ViewUtils.f(this.f66601b, 9.0f), ViewUtils.f(this.f66601b, 16.0f), ViewUtils.f(this.f66601b, 9.0f));
        ic.a aVar2 = ic.a.f119343a;
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        BubbleTipPopup bubbleTipPopupR = aVarU0.w(aVar2.a(mContext, 2.0f)).y(false).x(true).r();
        this.f91059z4 = bubbleTipPopupR;
        if (bubbleTipPopupR != null) {
            bubbleTipPopupR.O();
        }
    }

    @Override // com.max.hbminiprogram.h
    @dl.e
    public String B() {
        return this.f91055v4;
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity, com.max.hbminiprogram.h
    public void B0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42162, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.B0(z10);
        Fragment fragmentT = T();
        if (fragmentT instanceof WebviewFragment) {
            ((WebviewFragment) fragmentT).X7(z10);
        }
        a();
    }

    @Override // com.max.hbminiprogram.h
    public void E(@dl.e Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 42169, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            NavController navController = this.f91052s4;
            if (navController == null) {
                f0.S("navController");
                navController = null;
            }
            navController.l0(com.max.xiaoheihe.accelworld.o.a(E4).hashCode(), e4(intent), new androidx.navigation.j0.a().b(R.anim.activity_open_enter_from_right).c(R.anim.activity_open_enter_to_left).e(R.anim.activity_close_enter_to_right).f(R.anim.activity_close_to_right).a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.max.xiaoheihe.module.miniprogram.a
    public void E0(@dl.e WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 42174, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f0.g("public", webProtocolObj != null ? webProtocolObj.valueOf("type") : null) && f0.g(ITagManager.SUCCESS, webProtocolObj.valueOf("state"))) {
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
            fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.make_public_success));
            fVar.l(com.max.xiaoheihe.utils.d.n0(R.string.make_public_success_desc));
            com.max.hbcommon.view.a aVarD = fVar.d();
            aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new i());
            aVarD.setOnDismissListener(j.f91070b);
            aVarD.show();
        }
    }

    @Override // com.max.hbminiprogram.h
    public /* synthetic */ void F(String str, Map map) {
        com.max.hbminiprogram.g.c(this, str, map);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public boolean K1() {
        return false;
    }

    @Override // com.max.hbminiprogram.h
    public void N() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42180, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        runOnUiThread(new k());
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity
    @dl.e
    public WebviewFragment N2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42178, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        Fragment fragmentT = T();
        if (fragmentT instanceof WebviewFragment) {
            return (WebviewFragment) fragmentT;
        }
        return null;
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity, com.max.xiaoheihe.module.account.p0
    public void P1(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42187, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f91055v4)) {
            super.P1(str);
        } else if (str != null) {
            AccelWorldScreenShotKt.d(str, new SourceInfoObj(SourceType.mini_program.getKey(), this.f91055v4));
        }
    }

    @Override // com.max.hbminiprogram.h
    public void Q() {
        com.max.xiaoheihe.module.littleprogram.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42185, new Class[0], Void.TYPE).isSupported || (aVar = this.f91054u4) == null) {
            return;
        }
        aVar.n(this.f91055v4, this.f91056w4);
    }

    @Override // com.max.hbminiprogram.h
    @dl.e
    public Fragment T() {
        FragmentManager childFragmentManager;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42177, new Class[0], Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.nav_host_fragment);
        if (fragmentR0 == null || (childFragmentManager = fragmentR0.getChildFragmentManager()) == null) {
            return null;
        }
        return childFragmentManager.O0();
    }

    @Override // com.max.xiaoheihe.module.miniprogram.a, com.max.hbminiprogram.h
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42189, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.miniprogram.a.C0840a.a(this);
    }

    @Override // com.max.hbminiprogram.f
    public void e0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42181, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        NavController navController = this.f91052s4;
        if (navController == null) {
            f0.S("navController");
            navController = null;
        }
        if (com.max.xiaoheihe.module.miniprogram.b.a(navController)) {
            return;
        }
        super.b2();
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity, com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42182, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        overridePendingTransition(R.anim.activity_stay, R.anim.activity_bottom_out);
    }

    @dl.e
    public final String g4() {
        return this.f91055v4;
    }

    @Override // com.max.hbminiprogram.h
    @dl.d
    public Context getContext() {
        return this;
    }

    @dl.e
    public final String h4() {
        return this.f91056w4;
    }

    @Override // com.max.xiaoheihe.module.miniprogram.a, com.max.hbminiprogram.h
    public void j(@dl.e Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{fragment}, this, changeQuickRedirect, false, 42190, new Class[]{Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.miniprogram.a.C0840a.c(this, fragment);
    }

    @Override // com.max.hbminiprogram.h
    @dl.e
    public com.max.hbminiprogram.i k0() {
        return this.f91054u4;
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity, com.max.hbcommon.base.BaseActivity
    public void k1() {
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 42155, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        overridePendingTransition(R.anim.activity_bottom_in, R.anim.activity_stay);
        this.f91057x4 = System.currentTimeMillis();
        MiniAppContainerReportBroadcastReceiver miniAppContainerReportBroadcastReceiver = new MiniAppContainerReportBroadcastReceiver();
        this.f91058y4 = miniAppContainerReportBroadcastReceiver;
        t1(miniAppContainerReportBroadcastReceiver, lb.a.f130948d0);
        p1 p1VarC = p1.c(this.f66602c);
        f0.o(p1VarC, "inflate(mInflater)");
        this.f91050q4 = p1VarC;
        p1 p1Var = null;
        if (p1VarC == null) {
            f0.S("mBinding");
            p1VarC = null;
        }
        setContentView(p1VarC.b());
        p1 p1Var2 = this.f91050q4;
        if (p1Var2 == null) {
            f0.S("mBinding");
        } else {
            p1Var = p1Var2;
        }
        com.max.hbutils.utils.t.b0(this, 0, p1Var.f114383d);
        com.max.hbutils.utils.t.M(this.f66601b, true);
        o4();
        l4();
        n4();
        this.B4 = com.max.hbcommon.analytics.l.f66572a.g();
        s4();
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity, com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42183, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        MiniAppContainerReportBroadcastReceiver miniAppContainerReportBroadcastReceiver = this.f91058y4;
        if (miniAppContainerReportBroadcastReceiver != null) {
            unregisterReceiver(miniAppContainerReportBroadcastReceiver);
        }
        q4();
    }

    @Override // android.app.Activity
    public void onEnterAnimationComplete() {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42165, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onEnterAnimationComplete();
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (MiniProgramHostActivity.class.isAnonymousClass()) {
            name = MiniProgramHostActivity.class.getName();
            f0.m(name);
        } else {
            name = MiniProgramHostActivity.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("onEnterAnimationComplete");
        aVar.q(sb2.toString());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @dl.d String[] permissions, @dl.d int[] grantResults) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), permissions, grantResults}, this, changeQuickRedirect, false, 42186, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(permissions, "permissions");
        f0.p(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        Fragment fragmentT = T();
        if (fragmentT != null) {
            fragmentT.onRequestPermissionsResult(i10, permissions, grantResults);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42161, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        NavController navController = this.f91052s4;
        if (navController == null) {
            f0.S("navController");
            navController = null;
        }
        boolean zJ0 = navController.J0();
        com.max.heybox.hblog.g.f74531b.q("MiniProgramHostActivity, onSupportNavigateUp, navigateUp = " + zJ0);
        return zJ0;
    }

    @Override // com.max.xiaoheihe.module.miniprogram.a, com.max.hbminiprogram.h
    public boolean p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42188, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : com.max.xiaoheihe.module.miniprogram.a.C0840a.b(this);
    }

    @Override // com.max.hbminiprogram.h
    public boolean p0() {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42179, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        NavController navController = this.f91052s4;
        if (navController == null) {
            f0.S("navController");
            navController = null;
        }
        kotlin.collections.i<NavBackStackEntry> iVarB = com.max.xiaoheihe.accelworld.o.b(navController);
        if ((iVarB instanceof Collection) && iVarB.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<NavBackStackEntry> it = iVarB.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if ((!(it.next().e() instanceof NavGraph)) && (i10 = i10 + 1) < 0) {
                    CollectionsKt__CollectionsKt.V();
                }
            }
        }
        return i10 == 1;
    }

    @Override // com.max.xiaoheihe.module.miniprogram.a
    public void q(@dl.e WebView webView, @dl.e Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{webView, bitmap}, this, changeQuickRedirect, false, 42175, new Class[]{WebView.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        w3(bitmap);
    }

    @Override // com.max.hbminiprogram.h
    public boolean s0(@dl.d String path, @dl.e Bundle bundle) {
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path, bundle}, this, changeQuickRedirect, false, 42170, new Class[]{String.class, Bundle.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(path, "path");
        try {
            NavController navController = null;
            if (kotlin.text.u.v2(path, "/", false, 2, null)) {
                str = path;
            } else {
                str = IOUtils.DIR_SEPARATOR_UNIX + path;
            }
            com.max.heybox.hblog.g.f74531b.q("MiniProgramHostActivity, navigate, path = " + path + ", getCurrentFragment = " + T() + ", route = " + str + ", bundle = " + bundle);
            String strF4 = f4(str);
            NavController navController2 = this.f91052s4;
            if (navController2 == null) {
                f0.S("navController");
            } else {
                navController = navController2;
            }
            navController.l0(com.max.xiaoheihe.accelworld.o.a(strF4).hashCode(), d4(strF4, bundle), new androidx.navigation.j0.a().b(R.anim.activity_open_enter_from_right).c(R.anim.activity_open_enter_to_left).e(R.anim.activity_close_enter_to_right).f(R.anim.activity_close_to_right).a());
            b0(this.f66601b);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void t4(@dl.e String str) {
        this.f91055v4 = str;
    }

    public final void u4(@dl.e String str) {
        this.f91056w4 = str;
    }

    @Override // com.max.hbminiprogram.h
    public void x0() {
        NavController navController;
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42171, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        NavController navController2 = this.f91052s4;
        if (navController2 == null) {
            f0.S("navController");
            navController = null;
        } else {
            navController = navController2;
        }
        String str2 = this.f91051r4;
        if (str2 == null) {
            f0.S("startDestinationRoute");
            str = null;
        } else {
            str = str2;
        }
        NavController.V0(navController, str, true, false, 4, null);
    }
}
