package com.max.xiaoheihe.module.littleprogram;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import androidx.core.view.g3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.q0;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbminiprogram.f;
import com.max.hbutils.utils.t;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.router.interceptors.l;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import dl.e;
import ig.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;
import xh.m;

/* JADX INFO: compiled from: MiniProgramContainerActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nMiniProgramContainerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniProgramContainerActivity.kt\ncom/max/xiaoheihe/module/littleprogram/MiniProgramContainerActivity\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,175:1\n176#2,2:176\n*S KotlinDebug\n*F\n+ 1 MiniProgramContainerActivity.kt\ncom/max/xiaoheihe/module/littleprogram/MiniProgramContainerActivity\n*L\n120#1:176,2\n*E\n"})
@d(interceptors = {l.class, yc.a.class}, path = {lb.d.R3, lb.d.T3, lb.d.U3, lb.d.X3, lb.d.f131132b4, lb.d.Z3, lb.d.V3, lb.d.W3, lb.d.Y3, lb.d.f131125a4, lb.d.K3, "/game/pubg/detail_container_v2", lb.d.f131216n4, lb.d.F2, lb.d.G2, lb.d.I2, lb.d.H2, lb.d.L2, lb.d.J2, lb.d.K2, b.f88755p, lb.d.f131139c4, lb.d.f131248s1, lb.d.f131255t1, lb.d.f131189j5, "/flutter/heybox_voice", lb.d.B5, lb.d.f131231p5})
@o(parameters = 0)
public final class MiniProgramContainerActivity extends BaseActivity implements f {

    @dl.d
    public static final a L = new a(null);
    public static final int M = 0;

    @dl.d
    public static final String N = "router_path";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: MiniProgramContainerActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ Intent c(a aVar, Context context, String str, Bundle bundle, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, str, bundle, new Integer(i10), obj}, null, changeQuickRedirect, true, 38565, new Class[]{a.class, Context.class, String.class, Bundle.class, Integer.TYPE, Object.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            return aVar.b(context, str, bundle);
        }

        @dl.d
        @i
        @m
        public final Intent a(@dl.d Context context, @dl.d String path) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path}, this, changeQuickRedirect, false, 38566, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(path, "path");
            return c(this, context, path, null, 4, null);
        }

        @dl.d
        @i
        @m
        public final Intent b(@dl.d Context context, @dl.d String path, @e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, path, bundle}, this, changeQuickRedirect, false, 38564, new Class[]{Context.class, String.class, Bundle.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(path, "path");
            Intent intent = new Intent(context, (Class<?>) MiniProgramContainerActivity.class);
            intent.putExtra(MiniProgramContainerActivity.N, path);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            return intent;
        }

        @m
        public final void d(@dl.d Context context, @dl.d String path, @e Bundle bundle) {
            if (PatchProxy.proxy(new Object[]{context, path, bundle}, this, changeQuickRedirect, false, 38563, new Class[]{Context.class, String.class, Bundle.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(path, "path");
            g.f74531b.q("LittleProgramContainerActivity， start, path = " + path + ", params = " + bundle);
            Activity activityA = context instanceof Activity ? (Activity) context : com.max.hbutils.utils.e.b().a();
            Intent intent = new Intent(activityA, (Class<?>) MiniProgramContainerActivity.class);
            intent.putExtra(MiniProgramContainerActivity.N, path);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            activityA.startActivity(intent);
        }
    }

    private final Bundle M1(String str, Bundle bundle) {
        AccountDetailObj account_detail;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bundle}, this, changeQuickRedirect, false, 38557, new Class[]{String.class, Bundle.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        String userid = null;
        if (kotlin.text.u.v2(str, "/flutter", false, 2, null)) {
            if (bundle == null) {
                bundle = androidx.core.os.e.a();
            }
            if (i0.s()) {
                User userO = i0.o();
                if (userO != null && (account_detail = userO.getAccount_detail()) != null) {
                    userid = account_detail.getUserid();
                }
                bundle.putString("my_heybox_id", userid);
            }
        }
        return bundle;
    }

    @dl.d
    @i
    @m
    public static final Intent N1(@dl.d Context context, @dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 38562, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : L.a(context, str);
    }

    @dl.d
    @i
    @m
    public static final Intent O1(@dl.d Context context, @dl.d String str, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, bundle}, null, changeQuickRedirect, true, 38561, new Class[]{Context.class, String.class, Bundle.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : L.b(context, str, bundle);
    }

    @m
    public static final void Q1(@dl.d Context context, @dl.d String str, @e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{context, str, bundle}, null, changeQuickRedirect, true, 38560, new Class[]{Context.class, String.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        L.d(context, str, bundle);
    }

    @dl.d
    public final Map<String, Object> R1(@dl.d Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 38556, new Class[]{Bundle.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        f0.p(bundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String key : bundle.keySet()) {
            Object obj = bundle.get(key);
            if (obj != null) {
                f0.o(key, "key");
                linkedHashMap.put(key, obj);
            }
        }
        return linkedHashMap;
    }

    @e
    public final Fragment T() {
        FragmentManager childFragmentManager;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38555, new Class[0], Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.nav_fragment);
        if (fragmentR0 == null || (childFragmentManager = fragmentR0.getChildFragmentManager()) == null) {
            return null;
        }
        return childFragmentManager.O0();
    }

    @Override // com.max.hbminiprogram.f
    public void e0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38559, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.nav_fragment);
        f0.n(fragmentR0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        if (com.max.xiaoheihe.module.miniprogram.b.a(((NavHostFragment) fragmentR0).i3())) {
            return;
        }
        finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38558, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        g.f74531b.q("LittleProgramContainerActivity, finish");
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38554, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        t.b0(this, 0, null);
        t.M(this.f66601b, true);
        setContentView(R.layout.layout_mini_program_fragment_container);
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.nav_fragment);
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LittleProgramContainerActivity, extras = ");
        Bundle extras = getIntent().getExtras();
        sb2.append(extras != null ? R1(extras) : null);
        aVar.q(sb2.toString());
        if (fragmentR0 instanceof NavHostFragment) {
            g3.c(getWindow(), false);
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(N);
                if (com.max.hbcommon.utils.c.u(stringExtra)) {
                    return;
                }
                NavHostFragment navHostFragment = (NavHostFragment) fragmentR0;
                NavController navControllerI3 = navHostFragment.i3();
                q0 q0VarZ = navControllerI3.Z();
                Context contextRequireContext = navHostFragment.requireContext();
                f0.o(contextRequireContext, "fragment.requireContext()");
                FragmentManager childFragmentManager = navHostFragment.getChildFragmentManager();
                f0.o(childFragmentManager, "fragment.childFragmentManager");
                q0VarZ.b(new zc.a(contextRequireContext, childFragmentManager, R.id.nav_fragment));
                NavGraph navGraphB = navControllerI3.Y().b(R.navigation.mini_program_graph);
                f0.m(stringExtra);
                if (!kotlin.text.u.v2(stringExtra, "/", false, 2, null)) {
                    stringExtra = IOUtils.DIR_SEPARATOR_UNIX + stringExtra;
                }
                navGraphB.P0(stringExtra);
                navControllerI3.q1(navGraphB, M1(stringExtra, getIntent().getExtras()));
            }
        }
    }
}
