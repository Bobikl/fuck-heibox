package com.max.xiaoheihe.module.proxy;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.max.hbcommon.utils.i;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.proxy.Host;
import com.max.xiaoheihe.bean.proxy.ProxyItemObj;
import com.max.xiaoheihe.bean.proxy.ProxyListObj;
import com.max.xiaoheihe.module.game.c2;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.HostPingHelper;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: ProxyManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class ProxyManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    public static final String f91543i = "bind_steam";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final String f91544j = "bind_destiny2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private final String f91546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final String f91547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private a f91548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private String f91549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private ProxyListObj f91550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private ProxyItemObj f91551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final Companion f91541g = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f91542h = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private static final HashMap<String, ProxyManager> f91545k = new HashMap<>();

    /* JADX INFO: compiled from: ProxyManager.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @e
        public final ProxyManager a(@d String id2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{id2}, this, changeQuickRedirect, false, 42853, new Class[]{String.class}, ProxyManager.class);
            if (patchProxyResultProxy.isSupported) {
                return (ProxyManager) patchProxyResultProxy.result;
            }
            f0.p(id2, "id");
            return (ProxyManager) ProxyManager.f91545k.get(id2);
        }

        public final void b(@d String id2) {
            if (PatchProxy.proxy(new Object[]{id2}, this, changeQuickRedirect, false, 42854, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(id2, "id");
            ProxyManager.f91545k.remove(id2);
        }

        public final void c(@d String id2, boolean z10) {
            if (PatchProxy.proxy(new Object[]{id2, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42852, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(id2, "id");
            ProxyManager proxyManagerA = a(id2);
            if (proxyManagerA != null) {
                k.f(r0.a(e1.e()), null, null, new ProxyManager$Companion$showSelectLinesDialogById$1$1(z10, proxyManagerA, null), 3, null);
            }
        }

        @d
        public final com.max.xiaoheihe.module.mall.ProxyType d(@e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42855, new Class[]{String.class}, com.max.xiaoheihe.module.mall.ProxyType.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.max.xiaoheihe.module.mall.ProxyType) patchProxyResultProxy.result;
            }
            if (f0.g(str, ProxyType.acc.getKey())) {
                return com.max.xiaoheihe.module.mall.ProxyType.ACC;
            }
            if (f0.g(str, ProxyType.r_proxy.getKey())) {
                return com.max.xiaoheihe.module.mall.ProxyType.R_PROXY;
            }
            return f0.g(str, ProxyType.ip_direct.getKey()) ? com.max.xiaoheihe.module.mall.ProxyType.DNS_IP_DIRECT : com.max.xiaoheihe.module.mall.ProxyType.DIRECT;
        }
    }

    /* JADX INFO: compiled from: ProxyManager.kt */
    public enum ProxyType {
        acc("acc"),
        r_proxy(WebviewFragment.O4),
        ip_direct(WebviewFragment.I4),
        web_proxy("web_proxy");

        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        private final String key;

        ProxyType(String str) {
            this.key = str;
        }

        public static ProxyType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 42861, new Class[]{String.class}, ProxyType.class);
            return (ProxyType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ProxyType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ProxyType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 42860, new Class[0], ProxyType[].class);
            return (ProxyType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }

        @d
        public final String getKey() {
            return this.key;
        }
    }

    /* JADX INFO: compiled from: ProxyManager.kt */
    public interface a {
        void a(@e ProxyItemObj proxyItemObj);
    }

    /* JADX INFO: compiled from: ProxyManager.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<ProxyListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42862, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            a aVarC = ProxyManager.this.c();
            if (aVarC != null) {
                aVarC.a(null);
            }
        }

        public void onNext(@d Result<ProxyListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42863, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            ProxyManager.this.t(null);
            ProxyManager.this.r(result.getResult());
            ProxyListObj result2 = result.getResult();
            if (result2 != null) {
                ProxyManager proxyManager = ProxyManager.this;
                List<ProxyItemObj> lines = result2.getLines();
                if (lines != null) {
                    List<ProxyItemObj> list = lines.size() > 0 ? lines : null;
                    if (list != null) {
                        proxyManager.t(list.get(0));
                        if (!i.d()) {
                            if (!com.max.hbcommon.utils.c.u(result2.getDefault_line())) {
                                for (ProxyItemObj proxyItemObj : list) {
                                    if (f0.g(result2.getDefault_line(), proxyItemObj.getKey())) {
                                        proxyManager.t(proxyItemObj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            for (ProxyItemObj proxyItemObj2 : list) {
                                if (f0.g(ProxyType.acc.getKey(), proxyItemObj2.getKey())) {
                                    proxyManager.t(proxyItemObj2);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            ProxyManager proxyManager2 = ProxyManager.this;
            proxyManager2.p(proxyManager2.g());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42864, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ProxyListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ProxyManager.kt */
    public static final class c implements HostPingHelper.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProxyItemObj f91556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProxyManager f91557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProxyItemObj f91558c;

        c(ProxyItemObj proxyItemObj, ProxyManager proxyManager, ProxyItemObj proxyItemObj2) {
            this.f91556a = proxyItemObj;
            this.f91557b = proxyManager;
            this.f91558c = proxyItemObj2;
        }

        @Override // com.max.xiaoheihe.module.webview.HostPingHelper.a
        public void a(@e HashMap<String, String> map) {
            if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 42867, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f91556a.setFilter_hosts(map);
            ProxyManager.b(this.f91557b, this.f91558c);
        }
    }

    public ProxyManager(@e String str, @e String str2, @e a aVar) {
        this.f91546a = str;
        this.f91547b = str2;
        this.f91548c = aVar;
        String str3 = System.currentTimeMillis() + str + str2;
        this.f91549d = str3;
        f91545k.put(str3, this);
        d();
    }

    public static final /* synthetic */ void b(ProxyManager proxyManager, ProxyItemObj proxyItemObj) {
        if (PatchProxy.proxy(new Object[]{proxyManager, proxyItemObj}, null, changeQuickRedirect, true, 42851, new Class[]{ProxyManager.class, ProxyItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        proxyManager.k(proxyItemObj);
    }

    @SuppressLint({"CheckResult"})
    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42842, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().Zb(this.f91546a, this.f91547b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b());
    }

    private final void k(ProxyItemObj proxyItemObj) {
        if (PatchProxy.proxy(new Object[]{proxyItemObj}, this, changeQuickRedirect, false, 42844, new Class[]{ProxyItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = this.f91548c;
        if (aVar != null) {
            aVar.a(proxyItemObj);
        }
        o();
    }

    private final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42850, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.f91546a);
        ProxyItemObj proxyItemObj = this.f91551f;
        jsonObject.addProperty("line", proxyItemObj != null ? proxyItemObj.getKey() : null);
        b2 b2Var = b2.f124493a;
        com.max.hbcommon.analytics.d.d("1", lb.d.f131155f, null, jsonObject);
    }

    private final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42849, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.f91546a);
        ProxyItemObj proxyItemObj = this.f91551f;
        jsonObject.addProperty("line", proxyItemObj != null ? proxyItemObj.getKey() : null);
        b2 b2Var = b2.f124493a;
        com.max.hbcommon.analytics.d.d("1", lb.d.f131148e, null, jsonObject);
    }

    private final void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42848, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.f91546a);
        ProxyItemObj proxyItemObj = this.f91551f;
        jsonObject.addProperty("line", proxyItemObj != null ? proxyItemObj.getKey() : null);
        b2 b2Var = b2.f124493a;
        com.max.hbcommon.analytics.d.d("1", lb.d.f131141d, null, jsonObject);
    }

    private final void u() {
        ProxyListObj proxyListObj;
        List<ProxyItemObj> lines;
        int size = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42847, new Class[0], Void.TYPE).isSupported || (proxyListObj = this.f91550e) == null) {
            return;
        }
        if (proxyListObj != null && (lines = proxyListObj.getLines()) != null) {
            size = lines.size();
        }
        if (size > 0) {
            Activity activityA = com.max.hbutils.utils.e.b().a();
            FragmentActivity fragmentActivity = activityA instanceof FragmentActivity ? (FragmentActivity) activityA : null;
            if (fragmentActivity != null) {
                FragmentActivity fragmentActivity2 = fragmentActivity.isFinishing() ^ true ? fragmentActivity : null;
                if (fragmentActivity2 != null) {
                    c2.f86546n.a(proxyListObj, this).M3(fragmentActivity2.getSupportFragmentManager(), "SwitchProxyLineDialogFragment");
                }
            }
        }
    }

    @e
    public final a c() {
        return this.f91548c;
    }

    @e
    public final ProxyListObj e() {
        return this.f91550e;
    }

    @d
    public final String f() {
        return this.f91549d;
    }

    @e
    public final ProxyItemObj g() {
        return this.f91551f;
    }

    @e
    public final String h() {
        return this.f91546a;
    }

    @e
    public final String i() {
        return this.f91547b;
    }

    public final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42846, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u();
        m();
    }

    public final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42845, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n();
    }

    public final void p(@e final ProxyItemObj proxyItemObj) {
        ArrayList<String> ips;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{proxyItemObj}, this, changeQuickRedirect, false, 42843, new Class[]{ProxyItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f91551f = proxyItemObj;
        if (proxyItemObj == null) {
            k(proxyItemObj);
            return;
        }
        if (f0.g(ProxyType.acc.getKey(), proxyItemObj.getKey())) {
            Activity context = com.max.hbutils.utils.e.b().a();
            f0.o(context, "context");
            AccProxyObj acc_proxy = proxyItemObj.getAcc_proxy();
            String appid = acc_proxy != null ? acc_proxy.getAppid() : null;
            AccProxyObj acc_proxy2 = proxyItemObj.getAcc_proxy();
            TradeInfoUtilKt.Y(context, false, appid, acc_proxy2 != null ? acc_proxy2.getMsg() : null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.proxy.ProxyManager$select$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42866, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42865, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    ProxyManager.b(this.f91559b, proxyItemObj);
                }
            });
            return;
        }
        if (f0.g(ProxyType.ip_direct.getKey(), proxyItemObj.getKey())) {
            List<Host> hosts = proxyItemObj.getHosts();
            if (hosts != null && !hosts.isEmpty()) {
                z10 = false;
            }
            if (!z10) {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                List<Host> hosts2 = proxyItemObj.getHosts();
                f0.m(hosts2);
                for (Host host : hosts2) {
                    String host2 = host.getHost();
                    if (host2 != null && (ips = host.getIps()) != null) {
                        map.put(host2, ips);
                    }
                }
                HostPingHelper.Companion companion = HostPingHelper.f94175a;
                Activity activityA = com.max.hbutils.utils.e.b().a();
                f0.o(activityA, "getInstance().currentActivity");
                companion.b(activityA, map, new c(proxyItemObj, this, proxyItemObj));
                return;
            }
        }
        k(proxyItemObj);
    }

    public final void q(@e a aVar) {
        this.f91548c = aVar;
    }

    public final void r(@e ProxyListObj proxyListObj) {
        this.f91550e = proxyListObj;
    }

    public final void s(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42841, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f91549d = str;
    }

    public final void t(@e ProxyItemObj proxyItemObj) {
        this.f91551f = proxyItemObj;
    }
}
