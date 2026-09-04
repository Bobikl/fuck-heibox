package com.max.xiaoheihe.bean.game.steamproxy;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseProxyParamObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ProxyManage implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String type;

    public ProxyManage(@e String str) {
        this.type = str;
    }

    public static /* synthetic */ ProxyManage copy$default(ProxyManage proxyManage, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{proxyManage, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15423, new Class[]{ProxyManage.class, String.class, Integer.TYPE, Object.class}, ProxyManage.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProxyManage) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = proxyManage.type;
        }
        return proxyManage.copy(str);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @d
    public final ProxyManage copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15422, new Class[]{String.class}, ProxyManage.class);
        return patchProxyResultProxy.isSupported ? (ProxyManage) patchProxyResultProxy.result : new ProxyManage(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15426, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProxyManage) && f0.g(this.type, ((ProxyManage) obj).type);
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15425, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15424, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ProxyManage(type=" + this.type + ')';
    }
}
