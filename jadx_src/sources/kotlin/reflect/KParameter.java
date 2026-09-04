package kotlin.reflect;

import kotlin.u0;

/* JADX INFO: compiled from: KParameter.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface KParameter extends b {

    /* JADX INFO: compiled from: KParameter.kt */
    public enum Kind {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE
    }

    /* JADX INFO: compiled from: KParameter.kt */
    public static final class a {
        @u0(version = "1.1")
        public static /* synthetic */ void a() {
        }
    }

    @dl.d
    Kind b();

    boolean c();

    boolean f();

    int getIndex();

    @dl.e
    String getName();

    @dl.d
    r getType();
}
