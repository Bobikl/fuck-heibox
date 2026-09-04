package com.google.common.net;

/* JADX INFO: compiled from: UrlEscapers.java */
/* JADX INFO: loaded from: classes7.dex */
@a
@o9.b
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f59003b = "-._~!$'()*,;&=@:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f59002a = "-_.*";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.common.escape.h f59004c = new j(f59002a, true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.common.escape.h f59005d = new j("-._~!$'()*,;&=@:+", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.common.escape.h f59006e = new j("-._~!$'()*,;&=@:+/?", false);

    private k() {
    }

    public static com.google.common.escape.h a() {
        return f59004c;
    }

    public static com.google.common.escape.h b() {
        return f59006e;
    }

    public static com.google.common.escape.h c() {
        return f59005d;
    }
}
