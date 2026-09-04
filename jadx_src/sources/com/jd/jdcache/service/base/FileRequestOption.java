package com.jd.jdcache.service.base;

import androidx.annotation.Keep;
import dl.d;
import dl.e;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: JDCacheFileRepoDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public class FileRequestOption {

    @e
    private final String cookie;

    @e
    private final Map<String, String> header;

    @d
    private String method;

    @e
    private final String userAgent;

    public FileRequestOption() {
        this(null, null, null, null, 15, null);
    }

    public FileRequestOption(@d String method, @e Map<String, String> map, @e String str, @e String str2) {
        f0.p(method, "method");
        this.method = method;
        this.header = map;
        this.userAgent = str;
        this.cookie = str2;
    }

    public /* synthetic */ FileRequestOption(String str, Map map, String str2, String str3, int i10, u uVar) {
        this((i10 & 1) != 0 ? "GET" : str, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }

    @e
    public final String getCookie() {
        return this.cookie;
    }

    @e
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @d
    public final String getMethod() {
        return this.method;
    }

    @e
    public final String getUserAgent() {
        return this.userAgent;
    }

    public final void setMethod(@d String str) {
        f0.p(str, "<set-?>");
        this.method = str;
    }
}
