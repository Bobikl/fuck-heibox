package kotlinx.serialization.internal;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: InlineClassDescriptor.kt */
    public static final class a<T> implements h0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.serialization.g<T> f130731a;

        a(kotlinx.serialization.g<T> gVar) {
            this.f130731a = gVar;
        }

        @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
        @dl.d
        public kotlinx.serialization.descriptors.f a() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.r
        public void b(@dl.d kotlinx.serialization.encoding.h encoder, T t10) {
            kotlin.jvm.internal.f0.p(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.internal.h0
        @dl.d
        public kotlinx.serialization.g<?>[] c() {
            return h0.a.a(this);
        }

        @Override // kotlinx.serialization.c
        public T d(@dl.d kotlinx.serialization.encoding.f decoder) {
            kotlin.jvm.internal.f0.p(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.serialization.internal.h0
        @dl.d
        public kotlinx.serialization.g<?>[] e() {
            return new kotlinx.serialization.g[]{this.f130731a};
        }
    }

    @kotlinx.serialization.f
    @dl.d
    public static final <T> kotlinx.serialization.descriptors.f a(@dl.d String name, @dl.d kotlinx.serialization.g<T> primitiveSerializer) {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(primitiveSerializer, "primitiveSerializer");
        return new m0(name, new a(primitiveSerializer));
    }
}
