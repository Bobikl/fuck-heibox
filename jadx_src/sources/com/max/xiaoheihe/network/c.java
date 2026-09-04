package com.max.xiaoheihe.network;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.RequestTagMapObj;
import com.max.network.HBNetworkManager;
import com.max.network.config.NetworkConfig;
import com.max.network.interfaces.ConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.t;

/* JADX INFO: compiled from: HBConfigProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class c implements ConfigProvider<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f94836a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94837b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f94838c = "Heybox";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: HBConfigProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: HBConfigProvider.kt */
    public static final class b implements okhttp3.u {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // okhttp3.u
        @dl.d
        public final c0 intercept(@dl.d okhttp3.u.a chain) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, 47653, new Class[]{okhttp3.u.a.class}, c0.class);
            if (patchProxyResultProxy.isSupported) {
                return (c0) patchProxyResultProxy.result;
            }
            f0.p(chain, "chain");
            a0 a0VarRequest = chain.request();
            RequestTagMapObj requestTagMapObj = null;
            if (a0VarRequest.p(RequestTagMapObj.class) != null) {
                try {
                    requestTagMapObj = (RequestTagMapObj) a0VarRequest.p(RequestTagMapObj.class);
                } catch (Exception e10) {
                    com.max.heybox.hblog.g gVarZ = com.max.heybox.hblog.g.f74531b.z();
                    if (gVarZ != null) {
                        gVarZ.K(e10);
                    }
                }
            }
            boolean z10 = requestTagMapObj != null && com.max.hbcommon.utils.c.x(requestTagMapObj.get(com.max.hbcommon.network.b.f68049f));
            String strX = a0VarRequest.q().x();
            t.a aVarH = a0VarRequest.q().H();
            if (c.this.c(strX)) {
                aVarH.x(lb.a.f131033r1);
            }
            ob.a.k().b(aVarH, strX);
            return chain.proceed(a0VarRequest.n().a("Referer", "http://api.maxjia.com/").a("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").n("Cookie", ob.a.k().a(z10, a0VarRequest)).D(aVarH.h()).b());
        }
    }

    private final boolean a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47652, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        HBNetworkManager.Companion companion = HBNetworkManager.Companion;
        if (companion.getMallPathList() == null) {
            companion.setMallPathList(CollectionsKt__CollectionsKt.L("/store/register_order/", "/store/get_order_detail/", "/store/get_game_package_price/", "/store/check_buy_game_condition/", "/store/cancel_order/", "/store/purchase_code/", "/store/switch/proxy/", "/store/purchase_game_v3/", "/mall/cancel/orders/", "/mall/order/detail/v2/", "/mall/final/price/", "/mall/steam_info/", "/mall/check/purchase_code/", "/mall/check/pay/", "/mall/physical/order/confirm/receipt/", "/mall/pay/", "/mall/activite/proxy/", "/mall/coupons/", "/mall/activate/data/", "/pay/order/extra_info", "/pay/mall/unifiedorder", "/pay/ali_order_query/", "/pay/wx_order_query/"));
        }
        return com.max.hbcommon.network.b.f68054k.contains(str);
    }

    @dl.d
    public final ArrayList<okhttp3.u> b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47650, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : CollectionsKt__CollectionsKt.r(new b());
    }

    public final boolean c(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47651, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (HBNetworkManager.Companion.getToggleMallDomain()) {
            f0.m(str);
            if (a(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.max.network.interfaces.ConfigProvider
    @dl.d
    public String getGroup() {
        return f94838c;
    }

    @Override // com.max.network.interfaces.ConfigProvider
    @dl.d
    public NetworkConfig provideConfig() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47649, new Class[0], NetworkConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (NetworkConfig) patchProxyResultProxy.result;
        }
        NetworkConfig networkConfig = new NetworkConfig(n0.d(d.class), "https://" + lb.a.f131021p1 + IOUtils.DIR_SEPARATOR_UNIX, 0L, 4, null);
        networkConfig.setInterceptors(b());
        return networkConfig;
    }
}
