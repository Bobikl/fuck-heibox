package com.tencent.qmsp.sdk.a;

import com.tencent.qmsp.sdk.f.h;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f101675a = {org.apache.tools.tar.c.J, 125, -96, 80};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f101676b = {107, 124, -70, 66, 61};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f101677c = {107, 67, -107, 117, 97};

    public static String a() {
        return com.tencent.qmsp.sdk.app.a.getContext().getDir(com.tencent.qmsp.sdk.c.b.f101769a + h.a(f101675a), 0).toString();
    }

    public static String b() {
        return a() + File.separator + h.a(f101676b);
    }

    public static String c() {
        return a() + File.separator + h.a(f101677c);
    }
}
