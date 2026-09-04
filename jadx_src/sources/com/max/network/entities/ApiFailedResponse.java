package com.max.network.entities;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ApiFailedResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ApiFailedResponse<T> extends ApiResponse<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final String msg;

    public ApiFailedResponse(@e String str) {
        super(null, null, str, null, 11, null);
        this.msg = str;
    }

    public static /* synthetic */ ApiFailedResponse copy$default(ApiFailedResponse apiFailedResponse, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiFailedResponse, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.f35111wd, new Class[]{ApiFailedResponse.class, String.class, Integer.TYPE, Object.class}, ApiFailedResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiFailedResponse) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = apiFailedResponse.msg;
        }
        return apiFailedResponse.copy(str);
    }

    @e
    public final String component1() {
        return this.msg;
    }

    @d
    public final ApiFailedResponse<T> copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.f35089vd, new Class[]{String.class}, ApiFailedResponse.class);
        return patchProxyResultProxy.isSupported ? (ApiFailedResponse) patchProxyResultProxy.result : new ApiFailedResponse<>(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.f35177zd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiFailedResponse) && f0.g(this.msg, ((ApiFailedResponse) obj).msg);
    }

    @Override // com.max.network.entities.ApiResponse
    @e
    public String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35155yd, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.msg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.max.network.entities.ApiResponse
    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35133xd, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ApiFailedResponse(msg=" + this.msg + ')';
    }
}
