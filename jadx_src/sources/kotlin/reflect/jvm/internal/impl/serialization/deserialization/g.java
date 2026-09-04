package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: ContractDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f127851a = a.f127852a;

    /* JADX INFO: compiled from: ContractDeserializer.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f127852a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private static final g f127853b = new C1178a();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ContractDeserializer.kt */
        public static final class C1178a implements g {
            C1178a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
            @dl.e
            public Pair a(@dl.d ProtoBuf.Function proto, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.w ownerFunction, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable, @dl.d TypeDeserializer typeDeserializer) {
                f0.p(proto, "proto");
                f0.p(ownerFunction, "ownerFunction");
                f0.p(typeTable, "typeTable");
                f0.p(typeDeserializer, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        @dl.d
        public final g a() {
            return f127853b;
        }
    }

    @dl.e
    Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, Object> a(@dl.d ProtoBuf.Function function, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.w wVar, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @dl.d TypeDeserializer typeDeserializer);
}
