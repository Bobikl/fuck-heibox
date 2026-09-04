package com.max.network.entities;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ApiErrorResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ApiErrorResponse<T> extends ApiResponse<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final Throwable throwable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiErrorResponse(@d Throwable throwable) {
        super(null, null, null, throwable, 7, null);
        f0.p(throwable, "throwable");
        this.throwable = throwable;
    }

    public static /* synthetic */ ApiErrorResponse copy$default(ApiErrorResponse apiErrorResponse, Throwable th2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiErrorResponse, th2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.f35001rd, new Class[]{ApiErrorResponse.class, Throwable.class, Integer.TYPE, Object.class}, ApiErrorResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiErrorResponse) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            th2 = apiErrorResponse.throwable;
        }
        return apiErrorResponse.copy(th2);
    }

    @d
    public final Throwable component1() {
        return this.throwable;
    }

    @d
    public final ApiErrorResponse<T> copy(@d Throwable throwable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{throwable}, this, changeQuickRedirect, false, c.m.f34979qd, new Class[]{Throwable.class}, ApiErrorResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiErrorResponse) patchProxyResultProxy.result;
        }
        f0.p(throwable, "throwable");
        return new ApiErrorResponse<>(throwable);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.f35067ud, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiErrorResponse) && f0.g(this.throwable, ((ApiErrorResponse) obj).throwable);
    }

    @d
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35045td, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.throwable.hashCode();
    }

    @Override // com.max.network.entities.ApiResponse
    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35023sd, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ApiErrorResponse(throwable=" + this.throwable + ')';
    }
}
