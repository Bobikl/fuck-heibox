package com.google.android.play.core.splitinstall.testing;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f56407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f56408b;

    c() {
    }

    @Override // com.google.android.play.core.splitinstall.testing.x
    final x a(int i10) {
        this.f56407a = Integer.valueOf(i10);
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.x
    final x b(Map map) {
        if (map == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.f56408b = map;
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.x
    final y c() {
        if (this.f56408b != null) {
            return new f(this.f56407a, this.f56408b, null);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    @Override // com.google.android.play.core.splitinstall.testing.x
    final Map d() {
        Map map = this.f56408b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
