package com.max.xiaoheihe.module.search;

import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import com.max.hbsearch.k;
import com.max.hbsearch.l;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.search.page.f;
import com.max.xiaoheihe.module.search.page.g;
import com.max.xiaoheihe.module.search.page.h;
import com.max.xiaoheihe.module.search.page.i;
import com.max.xiaoheihe.module.trade.TradeDiscoverySecondaryFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchFragmentFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f91628o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f91614a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f91615b = "topic_id";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f91616c = l.W;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f91617d = l.X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String f91618e = "wiki";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final String f91619f = "page_type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f91620g = l.f72320a0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final String f91621h = "topic_menu";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final String f91622i = "hashtag_name";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f91623j = l.f72324c0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final String f91624k = ChannelsDetailActivity.V3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final String f91625l = "shortcut_key";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final String f91626m = "shortcut_value";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f91627n = "filter_list";

    private b() {
    }

    @dl.d
    public final String a() {
        return f91627n;
    }

    @dl.d
    public final String b() {
        return f91624k;
    }

    @dl.d
    public final String c() {
        return f91623j;
    }

    @dl.d
    public final String d() {
        return f91622i;
    }

    @dl.d
    public final String e() {
        return f91619f;
    }

    @dl.d
    public final String f() {
        return f91620g;
    }

    @dl.d
    public final String g() {
        return f91625l;
    }

    @dl.d
    public final String h() {
        return f91626m;
    }

    @dl.d
    public final String i() {
        return f91616c;
    }

    @dl.d
    public final String j() {
        return f91615b;
    }

    @dl.d
    public final String k() {
        return f91621h;
    }

    @dl.d
    public final String l() {
        return f91617d;
    }

    @dl.d
    public final String m() {
        return f91618e;
    }

    @dl.d
    public final k n(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42887, new Class[]{Integer.TYPE}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        if (i10 == 1) {
            return new com.max.xiaoheihe.module.search.page.e();
        }
        if (i10 == 5) {
            return new h();
        }
        if (i10 == 7) {
            return new i();
        }
        if (i10 == 11) {
            return new com.max.xiaoheihe.module.search.pagev2.c();
        }
        switch (i10) {
            case 13:
                return new g();
            case 14:
                return new com.max.xiaoheihe.module.search.page.d();
            case 15:
                return new com.max.xiaoheihe.module.search.page.k();
            default:
                switch (i10) {
                    case 17:
                        return new com.max.xiaoheihe.module.search.page.a();
                    case 18:
                        return new com.max.xiaoheihe.module.search.pagev2.b();
                    case 19:
                        return new com.max.xiaoheihe.module.search.page.b();
                    case 20:
                        return new com.max.xiaoheihe.module.search.page.c();
                    default:
                        switch (i10) {
                            case 31:
                                return new f();
                            case 32:
                                return new f();
                            case 33:
                                return new f();
                            default:
                                switch (i10) {
                                    case 35:
                                        return new com.max.xiaoheihe.module.trade.e();
                                    case 36:
                                        return new TradeDiscoverySecondaryFragment();
                                    case 37:
                                        return new com.max.xiaoheihe.module.search.pagev2.c();
                                    default:
                                        return new com.max.xiaoheihe.module.search.pagev2.c();
                                }
                        }
                }
        }
    }

    @dl.d
    public final k o(@dl.d String gametype, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gametype, bundle}, this, changeQuickRedirect, false, 42889, new Class[]{String.class, Bundle.class}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        f0.p(gametype, "gametype");
        f fVar = new f();
        Object objClone = bundle != null ? bundle.clone() : null;
        f0.n(objClone, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle2 = (Bundle) objClone;
        bundle2.putString(f91624k, gametype);
        fVar.setArguments(bundle2);
        return fVar;
    }

    @dl.d
    public final k p(int i10, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bundle}, this, changeQuickRedirect, false, 42888, new Class[]{Integer.TYPE, Bundle.class}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        k kVarN = n(i10);
        kVarN.setArguments(bundle);
        return kVarN;
    }

    @dl.d
    public final k q(@dl.d Bundle args) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{args}, this, changeQuickRedirect, false, 42886, new Class[]{Bundle.class}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        f0.p(args, "args");
        k kVarN = n(args.getInt(f91619f));
        kVarN.setArguments(args);
        return kVarN;
    }
}
