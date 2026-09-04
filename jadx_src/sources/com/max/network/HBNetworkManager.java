package com.max.network;

import bb.c;
import com.max.network.config.InvalidConfigGroupException;
import com.max.network.config.NetworkConfig;
import com.max.network.interfaces.ConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.m;
import yh.a;

/* JADX INFO: compiled from: HBNetworkManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HBNetworkManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private static List<String> mallPathList;
    private static boolean toggleMallDomain;

    @d
    private final HashMap<String, NetworkConfig> configMap;

    @d
    public static final Companion Companion = new Companion(null);

    @d
    private static final z<HBNetworkManager> instance$delegate = b0.b(LazyThreadSafetyMode.SYNCHRONIZED, new a<HBNetworkManager>() { // from class: com.max.network.HBNetworkManager$Companion$instance$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        @d
        public final HBNetworkManager invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34726fd, new Class[0], HBNetworkManager.class);
            return patchProxyResultProxy.isSupported ? (HBNetworkManager) patchProxyResultProxy.result : new HBNetworkManager(null);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.network.HBNetworkManager, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ HBNetworkManager invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34749gd, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    /* JADX INFO: compiled from: HBNetworkManager.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void getInstance$annotations() {
        }

        @m
        public static /* synthetic */ void getMallPathList$annotations() {
        }

        @m
        public static /* synthetic */ void getToggleMallDomain$annotations() {
        }

        @d
        public final HBNetworkManager getInstance() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34610ad, new Class[0], HBNetworkManager.class);
            return patchProxyResultProxy.isSupported ? (HBNetworkManager) patchProxyResultProxy.result : (HBNetworkManager) HBNetworkManager.instance$delegate.getValue();
        }

        @e
        public final List<String> getMallPathList() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34680dd, new Class[0], List.class);
            return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : HBNetworkManager.mallPathList;
        }

        public final boolean getToggleMallDomain() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34633bd, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : HBNetworkManager.toggleMallDomain;
        }

        public final void setMallPathList(@e List<String> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.m.f34703ed, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            HBNetworkManager.mallPathList = list;
        }

        public final void setToggleMallDomain(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.f34656cd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            HBNetworkManager.toggleMallDomain = z10;
        }
    }

    private HBNetworkManager() {
        this.configMap = new HashMap<>();
    }

    public /* synthetic */ HBNetworkManager(u uVar) {
        this();
    }

    @d
    public static final HBNetworkManager getInstance() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.Vc, new Class[0], HBNetworkManager.class);
        return patchProxyResultProxy.isSupported ? (HBNetworkManager) patchProxyResultProxy.result : Companion.getInstance();
    }

    @e
    public static final List<String> getMallPathList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.Yc, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : Companion.getMallPathList();
    }

    public static final boolean getToggleMallDomain() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.Wc, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : Companion.getToggleMallDomain();
    }

    public static final void setMallPathList(@e List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, c.m.Zc, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        Companion.setMallPathList(list);
    }

    public static final void setToggleMallDomain(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.m.Xc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Companion.setToggleMallDomain(z10);
    }

    @d
    public final NetworkConfig getConfig(@d String group) throws InvalidConfigGroupException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{group}, this, changeQuickRedirect, false, c.m.Sc, new Class[]{String.class}, NetworkConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (NetworkConfig) patchProxyResultProxy.result;
        }
        f0.p(group, "group");
        NetworkConfig networkConfig = this.configMap.get(group);
        if (networkConfig != null) {
            return networkConfig;
        }
        throw new InvalidConfigGroupException(group);
    }

    public final void setConfig(@d ConfigProvider<?> provider) {
        if (PatchProxy.proxy(new Object[]{provider}, this, changeQuickRedirect, false, c.m.Tc, new Class[]{ConfigProvider.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(provider, "provider");
        this.configMap.put(provider.getGroup(), provider.provideConfig());
    }

    public final void setConfig(@d String group, @e NetworkConfig networkConfig) {
        if (PatchProxy.proxy(new Object[]{group, networkConfig}, this, changeQuickRedirect, false, c.m.Uc, new Class[]{String.class, NetworkConfig.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(group, "group");
        this.configMap.put(group, networkConfig);
    }
}
