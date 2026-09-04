package com.max.xiaoheihe.module.magic;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.max.hbcommon.utils.i;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyParamsObj;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.HostPingHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.reactivex.schedulers.b;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import yh.a;
import yh.l;

/* JADX INFO: compiled from: MagicUtil.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MagicUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final MagicUtil f89378a = new MagicUtil();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89379b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: MagicUtil.kt */
    public enum ConnectType {
        None,
        IP_Direct,
        Proxy,
        VPN,
        R_Proxy;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static ConnectType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 39771, new Class[]{String.class}, ConnectType.class);
            return (ConnectType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ConnectType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ConnectType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 39770, new Class[0], ConnectType[].class);
            return (ConnectType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: MagicUtil.kt */
    public static final class a implements HostPingHelper.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProxyParamsObj f89380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f89381b;

        a(ProxyParamsObj proxyParamsObj, yh.a<b2> aVar) {
            this.f89380a = proxyParamsObj;
            this.f89381b = aVar;
        }

        @Override // com.max.xiaoheihe.module.webview.HostPingHelper.a
        public void a(@e HashMap<String, String> map) {
            if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39774, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f89380a.setHost(map);
            this.f89381b.invoke();
        }
    }

    private MagicUtil() {
    }

    @d
    public final ConnectType a(@e SteamWalletJsObj steamWalletJsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 39766, new Class[]{SteamWalletJsObj.class}, ConnectType.class);
        if (patchProxyResultProxy.isSupported) {
            return (ConnectType) patchProxyResultProxy.result;
        }
        if (steamWalletJsObj == null) {
            return ConnectType.None;
        }
        if (steamWalletJsObj.getAcc_proxy() != null || i.d()) {
            return ConnectType.VPN;
        }
        if (steamWalletJsObj.getHost() != null) {
            return ConnectType.IP_Direct;
        }
        return (steamWalletJsObj.getSteam_proxy() == null || steamWalletJsObj.getSteam_proxy().getProxy() == null) ? ConnectType.None : ConnectType.Proxy;
    }

    @d
    public final ConnectType b(@e SteamWalletJsObj steamWalletJsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 39767, new Class[]{SteamWalletJsObj.class}, ConnectType.class);
        if (patchProxyResultProxy.isSupported) {
            return (ConnectType) patchProxyResultProxy.result;
        }
        if (steamWalletJsObj == null) {
            return ConnectType.None;
        }
        if (steamWalletJsObj.getAcc_proxy() != null || i.d()) {
            return ConnectType.VPN;
        }
        if (steamWalletJsObj.getR_proxy() != null && c.x(steamWalletJsObj.getR_proxy().getEnable())) {
            SteamAcceptGameParams addwishlist_steam = steamWalletJsObj.getAddwishlist_steam();
            if (!c.u(addwishlist_steam != null ? addwishlist_steam.getR_url() : null)) {
                return ConnectType.R_Proxy;
            }
        }
        if (steamWalletJsObj.getHost() != null) {
            return ConnectType.IP_Direct;
        }
        return (steamWalletJsObj.getSteam_proxy() == null || steamWalletJsObj.getSteam_proxy().getProxy() == null) ? ConnectType.None : ConnectType.Proxy;
    }

    @xh.i
    public final void c(@d Context context, @d ProxyParamsObj data, @d final yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{context, data, callback}, this, changeQuickRedirect, false, 39769, new Class[]{Context.class, ProxyParamsObj.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(data, "data");
        f0.p(callback, "callback");
        if (data.getAcc_proxy() != null) {
            TradeInfoUtilKt.b0(context, false, data.getAcc_proxy().getAppid(), null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.magic.MagicUtil$prepareConnectStrategy$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39773, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39772, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    callback.invoke();
                }
            }, 8, null);
            return;
        }
        if (data.getSteam_proxy() == null || data.getSteam_proxy().getHosts() == null || data.getSteam_proxy().getHosts().size() <= 0) {
            callback.invoke();
            return;
        }
        HostPingHelper.Companion companion = HostPingHelper.f94175a;
        HashMap<String, ArrayList<String>> hosts = data.getSteam_proxy().getHosts();
        f0.o(hosts, "data.steam_proxy.hosts");
        companion.b(context, hosts, new a(data, callback));
    }

    public final void d(@d final Context context, @d final l<? super SteamWalletJsObj, b2> callback) {
        if (PatchProxy.proxy(new Object[]{context, callback}, this, changeQuickRedirect, false, 39768, new Class[]{Context.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(callback, "callback");
        com.max.xiaoheihe.network.i.a().h7("addfreelicense").I5(b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.d<Result<SteamWalletJsObj>>() { // from class: com.max.xiaoheihe.module.magic.MagicUtil$toSteamAddFreeLicense$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object] */
            public void onNext(@d Result<SteamWalletJsObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39775, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (result.getResult() != null) {
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    ?? data = result.getResult();
                    objectRef.f124891b = data;
                    MagicUtil magicUtil = MagicUtil.f89378a;
                    Context context2 = context;
                    f0.o(data, "data");
                    final l<SteamWalletJsObj, b2> lVar = callback;
                    magicUtil.c(context2, (ProxyParamsObj) data, new a<b2>() { // from class: com.max.xiaoheihe.module.magic.MagicUtil$toSteamAddFreeLicense$1$onNext$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39778, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39777, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            l<SteamWalletJsObj, b2> lVar2 = lVar;
                            SteamWalletJsObj data2 = objectRef.f124891b;
                            f0.o(data2, "data");
                            lVar2.invoke(data2);
                        }
                    });
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39776, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<SteamWalletJsObj>) obj);
            }
        });
    }
}
