package com.efs.sdk.net.a.a;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public interface f {

    public interface a extends b {
        String b();

        String c();

        @dl.e
        byte[] d();
    }

    public interface b {
        String a();
    }

    public interface c extends d {
    }

    public interface d {
        String a();

        int b();
    }

    @dl.e
    InputStream a(String str, @dl.e String str2, @dl.e String str3, @dl.e InputStream inputStream);

    void a();

    void a(a aVar);

    void a(c cVar);

    String b();
}
