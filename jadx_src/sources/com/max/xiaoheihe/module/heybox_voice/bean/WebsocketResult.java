package com.max.xiaoheihe.module.heybox_voice.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WebsocketResult.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@o(parameters = 0)
public final class WebsocketResult {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private Integer f88630id;

    @e
    private final String status;

    public WebsocketResult(@e Integer num, @e String str) {
        this.f88630id = num;
        this.status = str;
    }

    public static /* synthetic */ WebsocketResult copy$default(WebsocketResult websocketResult, Integer num, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{websocketResult, num, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 38518, new Class[]{WebsocketResult.class, Integer.class, String.class, Integer.TYPE, Object.class}, WebsocketResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebsocketResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            num = websocketResult.f88630id;
        }
        if ((i10 & 2) != 0) {
            str = websocketResult.status;
        }
        return websocketResult.copy(num, str);
    }

    @e
    public final Integer component1() {
        return this.f88630id;
    }

    @e
    public final String component2() {
        return this.status;
    }

    @d
    public final WebsocketResult copy(@e Integer num, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, str}, this, changeQuickRedirect, false, 38517, new Class[]{Integer.class, String.class}, WebsocketResult.class);
        return patchProxyResultProxy.isSupported ? (WebsocketResult) patchProxyResultProxy.result : new WebsocketResult(num, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38521, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebsocketResult)) {
            return false;
        }
        WebsocketResult websocketResult = (WebsocketResult) obj;
        return f0.g(this.f88630id, websocketResult.f88630id) && f0.g(this.status, websocketResult.status);
    }

    @e
    public final Integer getId() {
        return this.f88630id;
    }

    @e
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38520, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.f88630id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.status;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setId(@e Integer num) {
        this.f88630id = num;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38519, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WebsocketResult(id=" + this.f88630id + ", status=" + this.status + ')';
    }
}
