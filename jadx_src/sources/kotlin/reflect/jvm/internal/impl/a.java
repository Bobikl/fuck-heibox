package kotlin.reflect.jvm.internal.impl;

import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import kotlin.reflect.jvm.internal.impl.load.java.t;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.c;

/* JADX INFO: compiled from: SpecialJvmAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f125331a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final Set<b> f125332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final b f125333c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SpecialJvmAnnotations.kt */
    public static final class C1138a implements o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f125334a;

        C1138a(Ref.BooleanRef booleanRef) {
            this.f125334a = booleanRef;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.c
        @e
        public o.a b(@d b classId, @d t0 source) {
            f0.p(classId, "classId");
            f0.p(source, "source");
            if (!f0.g(classId, s.f126304a.a())) {
                return null;
            }
            this.f125334a.f124884b = true;
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.c
        public void visitEnd() {
        }
    }

    static {
        List listL = CollectionsKt__CollectionsKt.L(t.f126309a, t.f126319k, t.f126320l, t.f126312d, t.f126314f, t.f126317i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.m((c) it.next()));
        }
        f125332b = linkedHashSet;
        b bVarM = b.m(t.f126318j);
        f0.o(bVarM, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f125333c = bVarM;
    }

    private a() {
    }

    @d
    public final b a() {
        return f125333c;
    }

    @d
    public final Set<b> b() {
        return f125332b;
    }

    public final boolean c(@d o klass) {
        f0.p(klass, "klass");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        klass.i(new C1138a(booleanRef), null);
        return booleanRef.f124884b;
    }
}
