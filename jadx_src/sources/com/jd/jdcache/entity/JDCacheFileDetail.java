package com.jd.jdcache.entity;

import androidx.annotation.Keep;
import androidx.collection.k;
import dl.d;
import dl.e;
import java.io.File;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: JDCacheFileDetail.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class JDCacheFileDetail {
    private long lastModified;

    @d
    private String path;
    private long totalSpace;

    /* JADX WARN: Illegal instructions before constructor call */
    public JDCacheFileDetail(@d File file) {
        f0.p(file, "file");
        String absolutePath = file.getAbsolutePath();
        f0.o(absolutePath, "getAbsolutePath(...)");
        this(absolutePath, file.lastModified(), file.getTotalSpace());
    }

    public JDCacheFileDetail(@d String path, long j10, long j11) {
        f0.p(path, "path");
        this.path = path;
        this.lastModified = j10;
        this.totalSpace = j11;
    }

    public /* synthetic */ JDCacheFileDetail(String str, long j10, long j11, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? 0L : j11);
    }

    public static /* synthetic */ JDCacheFileDetail copy$default(JDCacheFileDetail jDCacheFileDetail, String str, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jDCacheFileDetail.path;
        }
        if ((i10 & 2) != 0) {
            j10 = jDCacheFileDetail.lastModified;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = jDCacheFileDetail.totalSpace;
        }
        return jDCacheFileDetail.copy(str, j12, j11);
    }

    @d
    public final String component1() {
        return this.path;
    }

    public final long component2() {
        return this.lastModified;
    }

    public final long component3() {
        return this.totalSpace;
    }

    @d
    public final JDCacheFileDetail copy(@d String path, long j10, long j11) {
        f0.p(path, "path");
        return new JDCacheFileDetail(path, j10, j11);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JDCacheFileDetail)) {
            return false;
        }
        JDCacheFileDetail jDCacheFileDetail = (JDCacheFileDetail) obj;
        return f0.g(this.path, jDCacheFileDetail.path) && this.lastModified == jDCacheFileDetail.lastModified && this.totalSpace == jDCacheFileDetail.totalSpace;
    }

    public final boolean exists() {
        return new File(this.path).exists();
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    @d
    public final String getPath() {
        return this.path;
    }

    public final long getTotalSpace() {
        return this.totalSpace;
    }

    public final boolean hasChanged() {
        File file = new File(this.path);
        return (file.exists() && file.lastModified() == this.lastModified) ? false : true;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + k.a(this.lastModified)) * 31) + k.a(this.totalSpace);
    }

    public final void setLastModified(long j10) {
        this.lastModified = j10;
    }

    public final void setPath(@d String str) {
        f0.p(str, "<set-?>");
        this.path = str;
    }

    public final void setTotalSpace(long j10) {
        this.totalSpace = j10;
    }

    @d
    public String toString() {
        return "JDCacheFileDetail(path=" + this.path + ", lastModified=" + this.lastModified + ", totalSpace=" + this.totalSpace + ')';
    }
}
