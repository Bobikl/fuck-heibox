package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: versionSpecificBehavior.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public static final boolean a(@dl.d a version) {
        f0.p(version, "version");
        return version.a() == 1 && version.b() >= 4;
    }

    public static final boolean b(@dl.d a version) {
        f0.p(version, "version");
        return a(version);
    }
}
