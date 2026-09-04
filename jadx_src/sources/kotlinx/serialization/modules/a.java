package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: kotlinx.serialization.modules.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class C1195a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlinx.serialization.g<?> f130797a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1195a(@dl.d kotlinx.serialization.g<?> serializer) {
            super(null);
            f0.p(serializer, "serializer");
            this.f130797a = serializer;
        }

        @Override // kotlinx.serialization.modules.a
        @dl.d
        public kotlinx.serialization.g<?> a(@dl.d List<? extends kotlinx.serialization.g<?>> typeArgumentsSerializers) {
            f0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f130797a;
        }

        @dl.d
        public final kotlinx.serialization.g<?> b() {
            return this.f130797a;
        }

        public boolean equals(@dl.e Object obj) {
            return (obj instanceof C1195a) && f0.g(((C1195a) obj).f130797a, this.f130797a);
        }

        public int hashCode() {
            return this.f130797a.hashCode();
        }
    }

    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final l<List<? extends kotlinx.serialization.g<?>>, kotlinx.serialization.g<?>> f130798a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@dl.d l<? super List<? extends kotlinx.serialization.g<?>>, ? extends kotlinx.serialization.g<?>> provider) {
            super(null);
            f0.p(provider, "provider");
            this.f130798a = provider;
        }

        @Override // kotlinx.serialization.modules.a
        @dl.d
        public kotlinx.serialization.g<?> a(@dl.d List<? extends kotlinx.serialization.g<?>> typeArgumentsSerializers) {
            f0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f130798a.invoke(typeArgumentsSerializers);
        }

        @dl.d
        public final l<List<? extends kotlinx.serialization.g<?>>, kotlinx.serialization.g<?>> b() {
            return this.f130798a;
        }
    }

    private a() {
    }

    public /* synthetic */ a(u uVar) {
        this();
    }

    @dl.d
    public abstract kotlinx.serialization.g<?> a(@dl.d List<? extends kotlinx.serialization.g<?>> list);
}
