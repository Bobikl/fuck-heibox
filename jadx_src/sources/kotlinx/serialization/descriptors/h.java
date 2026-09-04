package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.d
public abstract class h {

    /* JADX INFO: compiled from: SerialKinds.kt */
    @kotlinx.serialization.d
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f130589a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    @kotlinx.serialization.d
    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final b f130590a = new b();

        private b() {
            super(null);
        }
    }

    private h() {
    }

    public /* synthetic */ h(u uVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @dl.d
    public String toString() {
        String strF = n0.d(getClass()).F();
        f0.m(strF);
        return strF;
    }
}
