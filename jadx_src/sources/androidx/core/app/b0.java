package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: compiled from: MultiWindowModeChangedInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Configuration f19913b;

    public b0(boolean z10) {
        this.f19912a = z10;
        this.f19913b = null;
    }

    @androidx.annotation.w0(26)
    public b0(boolean z10, @androidx.annotation.n0 Configuration configuration) {
        this.f19912a = z10;
        this.f19913b = configuration;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(26)
    public Configuration a() {
        Configuration configuration = this.f19913b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.f19912a;
    }
}
