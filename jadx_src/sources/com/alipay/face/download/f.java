package com.alipay.face.download;

import android.content.Context;

/* JADX INFO: compiled from: BioResDownloader.java */
/* JADX INFO: loaded from: classes6.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f38718a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38719b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38720c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38721d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38722e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38723f = 10000;

    /* JADX INFO: compiled from: BioResDownloader.java */
    public interface a {
        int a();

        com.alipay.face.download.b b();

        void cancel();
    }

    /* JADX INFO: compiled from: BioResDownloader.java */
    public interface b {
        void a(a aVar, int i10, String str);

        void b(a aVar);

        void c(a aVar, long j10, long j11);

        void d(a aVar);
    }

    a a(Context context, com.alipay.face.download.b bVar, b bVar2);

    void destroy();

    void init(Context context);
}
