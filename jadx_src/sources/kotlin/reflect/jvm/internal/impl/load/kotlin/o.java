package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

/* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface o {

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface a {
        void a(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar2);

        @dl.e
        a b(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar);

        void c(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2);

        void d(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.e Object obj);

        @dl.e
        b e(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar);

        void visitEnd();
    }

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface b {
        void a(@dl.e Object obj);

        @dl.e
        a b(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar);

        void c(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar);

        void d(@dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar);

        void visitEnd();
    }

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface c {
        @dl.e
        a b(@dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d t0 t0Var);

        void visitEnd();
    }

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface d {
        @dl.e
        e a(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d String str);

        @dl.e
        c b(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d String str, @dl.e Object obj);
    }

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface e extends c {
        @dl.e
        a a(int i10, @dl.d kotlin.reflect.jvm.internal.impl.name.b bVar, @dl.d t0 t0Var);
    }

    @dl.d
    kotlin.reflect.jvm.internal.impl.name.b f();

    void g(@dl.d d dVar, @dl.e byte[] bArr);

    @dl.d
    String getLocation();

    @dl.d
    KotlinClassHeader h();

    void i(@dl.d c cVar, @dl.e byte[] bArr);
}
