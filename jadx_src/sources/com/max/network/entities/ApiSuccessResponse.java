package com.max.network.entities;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ApiSuccessResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ApiSuccessResponse<T> extends ApiResponse<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final ApiResponse<T> raw;
    private final T response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiSuccessResponse(T t10, @d ApiResponse<T> raw) {
        super(t10, raw.getStatus(), raw.getMsg(), null, 8, null);
        f0.p(raw, "raw");
        this.response = t10;
        this.raw = raw;
    }

    public static /* synthetic */ ApiSuccessResponse copy$default(ApiSuccessResponse apiSuccessResponse, Object obj, ApiResponse apiResponse, int i10, Object obj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{apiSuccessResponse, obj, apiResponse, new Integer(i10), obj2}, null, changeQuickRedirect, true, c.m.Hd, new Class[]{ApiSuccessResponse.class, Object.class, ApiResponse.class, Integer.TYPE, Object.class}, ApiSuccessResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiSuccessResponse) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            obj = apiSuccessResponse.response;
        }
        if ((i10 & 2) != 0) {
            apiResponse = apiSuccessResponse.raw;
        }
        return apiSuccessResponse.copy(obj, apiResponse);
    }

    public final T component1() {
        return this.response;
    }

    @d
    public final ApiResponse<T> component2() {
        return this.raw;
    }

    @d
    public final ApiSuccessResponse<T> copy(T t10, @d ApiResponse<T> raw) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, raw}, this, changeQuickRedirect, false, c.m.Gd, new Class[]{Object.class, ApiResponse.class}, ApiSuccessResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiSuccessResponse) patchProxyResultProxy.result;
        }
        f0.p(raw, "raw");
        return new ApiSuccessResponse<>(t10, raw);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.Kd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiSuccessResponse)) {
            return false;
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) obj;
        return f0.g(this.response, apiSuccessResponse.response) && f0.g(this.raw, apiSuccessResponse.raw);
    }

    @d
    public final ApiResponse<T> getRaw() {
        return this.raw;
    }

    public final T getResponse() {
        return this.response;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Jd, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        T t10 = this.response;
        return ((t10 != null ? t10.hashCode() : 0) * 31) + this.raw.hashCode();
    }

    @Override // com.max.network.entities.ApiResponse
    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Id, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ApiSuccessResponse(response=" + this.response + ", raw=" + this.raw + ')';
    }
}
