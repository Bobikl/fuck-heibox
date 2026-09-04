package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f126536a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final d f126537b = new d(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final d f126538c = new d(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final d f126539d = new d(JvmPrimitiveType.BYTE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final d f126540e = new d(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final d f126541f = new d(JvmPrimitiveType.INT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final d f126542g = new d(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final d f126543h = new d(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final d f126544i = new d(JvmPrimitiveType.DOUBLE);

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class a extends j {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.d
        private final j f126545j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d j elementType) {
            super(null);
            f0.p(elementType, "elementType");
            this.f126545j = elementType;
        }

        @dl.d
        public final j i() {
            return this.f126545j;
        }
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final d a() {
            return j.f126537b;
        }

        @dl.d
        public final d b() {
            return j.f126539d;
        }

        @dl.d
        public final d c() {
            return j.f126538c;
        }

        @dl.d
        public final d d() {
            return j.f126544i;
        }

        @dl.d
        public final d e() {
            return j.f126542g;
        }

        @dl.d
        public final d f() {
            return j.f126541f;
        }

        @dl.d
        public final d g() {
            return j.f126543h;
        }

        @dl.d
        public final d h() {
            return j.f126540e;
        }
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class c extends j {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.d
        private final String f126546j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d String internalName) {
            super(null);
            f0.p(internalName, "internalName");
            this.f126546j = internalName;
        }

        @dl.d
        public final String i() {
            return this.f126546j;
        }
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class d extends j {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.e
        private final JvmPrimitiveType f126547j;

        public d(@dl.e JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f126547j = jvmPrimitiveType;
        }

        @dl.e
        public final JvmPrimitiveType i() {
            return this.f126547j;
        }
    }

    private j() {
    }

    public /* synthetic */ j(kotlin.jvm.internal.u uVar) {
        this();
    }

    @dl.d
    public String toString() {
        return l.f126548a.e(this);
    }
}
