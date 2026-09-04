package ii;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;

/* JADX INFO: compiled from: RuntimeModuleData.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f119384c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.h f119385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ii.a f119386b;

    /* JADX INFO: compiled from: RuntimeModuleData.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final k a(@dl.d ClassLoader classLoader) {
            f0.p(classLoader, "classLoader");
            g gVar = new g(classLoader);
            kotlin.reflect.jvm.internal.impl.load.kotlin.d.a aVar = kotlin.reflect.jvm.internal.impl.load.kotlin.d.f126489b;
            ClassLoader classLoader2 = b2.class.getClassLoader();
            f0.o(classLoader2, "Unit::class.java.classLoader");
            kotlin.reflect.jvm.internal.impl.load.kotlin.d.a.C1160a c1160aA = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f119383b, l.f119387a);
            return new k(c1160aA.a().a(), new ii.a(c1160aA.b(), gVar), null);
        }
    }

    private k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.h hVar, ii.a aVar) {
        this.f119385a = hVar;
        this.f119386b = aVar;
    }

    public /* synthetic */ k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.h hVar, ii.a aVar, u uVar) {
        this(hVar, aVar);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.h a() {
        return this.f119385a;
    }

    @dl.d
    public final d0 b() {
        return this.f119385a.p();
    }

    @dl.d
    public final ii.a c() {
        return this.f119386b;
    }
}
