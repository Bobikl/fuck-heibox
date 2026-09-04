package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface m extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.p {

    /* JADX INFO: compiled from: KotlinClassFinder.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class C1165a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final byte[] f126550a;

            @dl.d
            public final byte[] b() {
                return this.f126550a;
            }
        }

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final o f126551a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.e
            private final byte[] f126552b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@dl.d o kotlinJvmBinaryClass, @dl.e byte[] bArr) {
                super(null);
                f0.p(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f126551a = kotlinJvmBinaryClass;
                this.f126552b = bArr;
            }

            public /* synthetic */ b(o oVar, byte[] bArr, int i10, kotlin.jvm.internal.u uVar) {
                this(oVar, (i10 & 2) != 0 ? null : bArr);
            }

            @dl.d
            public final o b() {
                return this.f126551a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.e
        public final o a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }
    }

    @dl.e
    a a(@dl.d mi.g gVar);

    @dl.e
    a c(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar);
}
