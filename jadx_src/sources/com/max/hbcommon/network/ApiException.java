package com.max.hbcommon.network;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes9.dex */
public class ApiException extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f68000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f68001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f68002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Result f68003e;

    public ApiException(String str, String str2, String str3, String str4, Result result) {
        super(str2);
        this.f68000b = str;
        this.f68001c = str3;
        this.f68002d = str4;
        this.f68003e = result;
    }

    public String a() {
        return this.f68001c;
    }

    public String b() {
        return this.f68002d;
    }

    public Result c() {
        return this.f68003e;
    }

    public String d() {
        return this.f68000b;
    }
}
