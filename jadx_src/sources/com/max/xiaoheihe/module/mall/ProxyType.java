package com.max.xiaoheihe.module.mall;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
public enum ProxyType {
    DIRECT(0),
    ACC(1),
    R_PROXY(2),
    DNS_IP_DIRECT(4),
    PROXY(5);


    @dl.d
    public static final a Companion = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    /* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
    @t0({"SMAP\nFetchSignInCookiesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchSignInCookiesActivity.kt\ncom/max/xiaoheihe/module/mall/ProxyType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,453:1\n1#2:454\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.e
        public final ProxyType a(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40875, new Class[]{Integer.TYPE}, ProxyType.class);
            if (patchProxyResultProxy.isSupported) {
                return (ProxyType) patchProxyResultProxy.result;
            }
            for (ProxyType proxyType : ProxyType.valuesCustom()) {
                if (proxyType.getValue() == i10) {
                    return proxyType;
                }
            }
            return null;
        }
    }

    ProxyType(int i10) {
        this.value = i10;
    }

    public static ProxyType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 40874, new Class[]{String.class}, ProxyType.class);
        return (ProxyType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ProxyType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ProxyType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 40873, new Class[0], ProxyType[].class);
        return (ProxyType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final int getValue() {
        return this.value;
    }
}
