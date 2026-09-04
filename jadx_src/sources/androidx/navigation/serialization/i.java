package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.m0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NavTypeConverter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends m0<String> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final i f25283t = new i();

    private i() {
        super(false);
    }

    @Override // androidx.navigation.m0
    @dl.d
    public String c() {
        return "unknown";
    }

    @Override // androidx.navigation.m0
    @dl.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String b(@dl.d Bundle bundle, @dl.d String key) {
        f0.p(bundle, "bundle");
        f0.p(key, "key");
        return null;
    }

    @Override // androidx.navigation.m0
    @dl.d
    public String o(@dl.d String value) {
        f0.p(value, "value");
        return "null";
    }

    @Override // androidx.navigation.m0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@dl.d Bundle bundle, @dl.d String key, @dl.d String value) {
        f0.p(bundle, "bundle");
        f0.p(key, "key");
        f0.p(value, "value");
    }
}
