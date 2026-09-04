package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PlatformRandom extends kotlin.random.a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final a f125031e = new a(null);

    @Deprecated
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final java.util.Random f125032d;

    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public PlatformRandom(@dl.d java.util.Random impl) {
        f0.p(impl, "impl");
        this.f125032d = impl;
    }

    @Override // kotlin.random.a
    @dl.d
    public java.util.Random r() {
        return this.f125032d;
    }
}
