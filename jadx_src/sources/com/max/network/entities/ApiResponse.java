package com.max.network.entities;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ApiResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ApiResponse<T> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final Throwable error;

    @e
    private final String msg;

    @e
    private final T result;

    @e
    private final String status;

    public ApiResponse() {
        this(null, null, null, null, 15, null);
    }

    public ApiResponse(@e T t10, @e String str, @e String str2, @e Throwable th2) {
        this.result = t10;
        this.status = str;
        this.msg = str2;
        this.error = th2;
    }

    public /* synthetic */ ApiResponse(Object obj, String str, String str2, Throwable th2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : th2);
    }

    @e
    public Throwable getError() {
        return this.error;
    }

    @e
    public String getMsg() {
        return this.msg;
    }

    @e
    public T getResult() {
        return this.result;
    }

    @e
    public String getStatus() {
        return this.status;
    }

    public final boolean isSuccess() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ed, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(getStatus(), ITagManager.SUCCESS);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Fd, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ApiResponse(status=" + getStatus() + ", msg=" + getMsg() + ", error=" + getError() + ", result=" + getResult() + ')';
    }
}
