package u2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<b<?>, Object> f140742a = new LinkedHashMap();

    /* JADX INFO: renamed from: u2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CreationExtras.kt */
    public static final class C1270a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final C1270a f140743b = new C1270a();

        private C1270a() {
        }

        @Override // u2.a
        @dl.e
        public <T> T a(@dl.d b<T> key) {
            f0.p(key, "key");
            return null;
        }
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    public interface b<T> {
    }

    @dl.e
    public abstract <T> T a(@dl.d b<T> bVar);

    @dl.d
    public final Map<b<?>, Object> b() {
        return this.f140742a;
    }
}
