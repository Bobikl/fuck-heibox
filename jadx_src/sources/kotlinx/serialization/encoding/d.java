package kotlinx.serialization.encoding;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f130597a = a.f130600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f130598b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f130599c = -3;

    /* JADX INFO: compiled from: Decoding.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f130600a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f130601b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f130602c = -3;

        private a() {
        }
    }

    /* JADX INFO: compiled from: Decoding.kt */
    public static final class b {
        public static int a(@dl.d d dVar, @dl.d kotlinx.serialization.descriptors.f descriptor) {
            f0.p(descriptor, "descriptor");
            return -1;
        }

        public static /* synthetic */ Object b(d dVar, kotlinx.serialization.descriptors.f fVar, int i10, kotlinx.serialization.c cVar, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return dVar.i(fVar, i10, cVar, obj);
        }

        @kotlinx.serialization.d
        public static boolean c(@dl.d d dVar) {
            return false;
        }

        public static /* synthetic */ Object d(d dVar, kotlinx.serialization.descriptors.f fVar, int i10, kotlinx.serialization.c cVar, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return dVar.o(fVar, i10, cVar, obj);
        }
    }

    boolean A(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    short C(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    double D(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    @dl.d
    kotlinx.serialization.modules.e a();

    void c(@dl.d kotlinx.serialization.descriptors.f fVar);

    long d(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    int e(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    @dl.d
    String h(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    @dl.e
    @kotlinx.serialization.d
    <T> T i(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, @dl.d kotlinx.serialization.c<? extends T> cVar, @dl.e T t10);

    @kotlinx.serialization.d
    boolean j();

    @dl.d
    f k(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    <T> T o(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, @dl.d kotlinx.serialization.c<? extends T> cVar, @dl.e T t10);

    char q(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    int t(@dl.d kotlinx.serialization.descriptors.f fVar);

    int u(@dl.d kotlinx.serialization.descriptors.f fVar);

    float x(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    byte z(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);
}
