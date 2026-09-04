package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private static r f52540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final RootTelemetryConfiguration f52541c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private RootTelemetryConfiguration f52542a;

    private r() {
    }

    @androidx.annotation.n0
    @v8.a
    public static synchronized r b() {
        if (f52540b == null) {
            f52540b = new r();
        }
        return f52540b;
    }

    @v8.a
    @androidx.annotation.p0
    public RootTelemetryConfiguration a() {
        return this.f52542a;
    }

    @z8.d0
    public final synchronized void c(@androidx.annotation.p0 RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.f52542a = f52541c;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f52542a;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.h() < rootTelemetryConfiguration.h()) {
                this.f52542a = rootTelemetryConfiguration;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
