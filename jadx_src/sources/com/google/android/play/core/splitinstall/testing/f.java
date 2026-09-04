package com.google.android.play.core.splitinstall.testing;

import androidx.annotation.p0;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f56412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f56413c;

    /* synthetic */ f(Integer num, Map map, e eVar) {
        this.f56412b = num;
        this.f56413c = map;
    }

    @Override // com.google.android.play.core.splitinstall.testing.y
    @l9.a
    @p0
    public final Integer a() {
        return this.f56412b;
    }

    @Override // com.google.android.play.core.splitinstall.testing.y
    public final Map b() {
        return this.f56413c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            Integer num = this.f56412b;
            if (num != null ? num.equals(yVar.a()) : yVar.a() == null) {
                if (this.f56413c.equals(yVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f56412b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f56413c.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f56412b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f56413c) + z5.g.f141884d;
    }
}
