package c8;

import java.io.File;

/* JADX INFO: compiled from: FileLastModifiedCleanStrategy.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f35631a;

    public b(long j10) {
        this.f35631a = j10;
    }

    @Override // c8.a
    public boolean a(File file) {
        return System.currentTimeMillis() - file.lastModified() > this.f35631a;
    }
}
