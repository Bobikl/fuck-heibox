package org.apache.tools.tar;

import java.io.IOException;

/* JADX INFO: compiled from: TarArchiveSparseEntry.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements c {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f137267a0;

    public a(byte[] bArr) throws IOException {
        this.f137267a0 = h.n(bArr, 504);
    }

    public boolean a() {
        return this.f137267a0;
    }
}
