package kotlin.random;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends kotlin.random.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final a f125043d = new a();

    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<java.util.Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    }

    @Override // kotlin.random.a
    @dl.d
    public java.util.Random r() {
        java.util.Random random = this.f125043d.get();
        f0.o(random, "implStorage.get()");
        return random;
    }
}
