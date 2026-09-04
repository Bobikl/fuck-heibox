package com.max.network.entities;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HttpError.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum HttpError {
    PAGE_NOT_FOUND(404, "page not found"),
    TOKEN_EXPIRE(3001, "token is expired"),
    PARAMS_ERROR(4003, "params is error");

    private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;

    @d
    private String errorMsg;

    HttpError(int i10, String str) {
        this.code = i10;
        this.errorMsg = str;
    }

    @d
    public static a<HttpError> getEntries() {
        return $ENTRIES;
    }

    public static HttpError valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.Nd, new Class[]{String.class}, HttpError.class);
        return (HttpError) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(HttpError.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static HttpError[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.Md, new Class[0], HttpError[].class);
        return (HttpError[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final int getCode() {
        return this.code;
    }

    @d
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final void setCode(int i10) {
        this.code = i10;
    }

    public final void setErrorMsg(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.Ld, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.errorMsg = str;
    }
}
