package kotlin.reflect;

import kotlin.u0;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface n<V> extends kotlin.reflect.c<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<V> {
        @dl.d
        n<V> a();
    }

    /* JADX INFO: compiled from: KProperty.kt */
    public static final class b {
        @u0(version = "1.1")
        public static /* synthetic */ void a() {
        }

        @u0(version = "1.1")
        public static /* synthetic */ void b() {
        }
    }

    /* JADX INFO: compiled from: KProperty.kt */
    public interface c<V> extends a<V>, i<V> {
    }

    @dl.d
    c<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
