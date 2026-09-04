package com.max.network.entities;

import androidx.collection.k;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;

/* JADX INFO: compiled from: ApiLoadingResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ApiLoadingResponse<T> extends ApiResponse<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long current;
    private final long total;

    public ApiLoadingResponse(long j10, long j11) {
        super(null, null, null, null, 15, null);
        this.current = j10;
        this.total = j11;
    }

    public static /* synthetic */ ApiLoadingResponse copy$default(ApiLoadingResponse apiLoadingResponse, long j10, long j11, int i10, Object obj) {
        Object[] objArr = {apiLoadingResponse, new Long(j10), new Long(j11), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.m.Bd, new Class[]{ApiLoadingResponse.class, cls, cls, Integer.TYPE, Object.class}, ApiLoadingResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (ApiLoadingResponse) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            j10 = apiLoadingResponse.current;
        }
        if ((i10 & 2) != 0) {
            j11 = apiLoadingResponse.total;
        }
        return apiLoadingResponse.copy(j10, j11);
    }

    public final long component1() {
        return this.current;
    }

    public final long component2() {
        return this.total;
    }

    @d
    public final ApiLoadingResponse<T> copy(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Ad, new Class[]{cls, cls}, ApiLoadingResponse.class);
        return patchProxyResultProxy.isSupported ? (ApiLoadingResponse) patchProxyResultProxy.result : new ApiLoadingResponse<>(j10, j11);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiLoadingResponse)) {
            return false;
        }
        ApiLoadingResponse apiLoadingResponse = (ApiLoadingResponse) obj;
        return this.current == apiLoadingResponse.current && this.total == apiLoadingResponse.total;
    }

    public final long getCurrent() {
        return this.current;
    }

    public final long getTotal() {
        return this.total;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Dd, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (k.a(this.current) * 31) + k.a(this.total);
    }

    @Override // com.max.network.entities.ApiResponse
    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Cd, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ApiLoadingResponse(current=" + this.current + ", total=" + this.total + ')';
    }
}
