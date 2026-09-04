package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public interface o extends k {

    /* JADX INFO: compiled from: DataSource.java */
    public interface a {
        o a();
    }

    long a(r rVar) throws IOException;

    Map<String, List<String>> b();

    void close() throws IOException;

    void e(u0 u0Var);

    @androidx.annotation.p0
    Uri getUri();
}
