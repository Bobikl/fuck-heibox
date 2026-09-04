package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.o;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CapturedTypeConstructorKt {

    /* JADX INFO: compiled from: CapturedTypeConstructor.kt */
    public static final class a extends o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f127510d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1 f1Var, boolean z10) {
            super(f1Var);
            this.f127510d = z10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o, kotlin.reflect.jvm.internal.impl.types.f1
        public boolean b() {
            return this.f127510d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.o, kotlin.reflect.jvm.internal.impl.types.f1
        @e
        public c1 e(@d d0 key) {
            f0.p(key, "key");
            c1 c1VarE = super.e(key);
            if (c1VarE == null) {
                return null;
            }
            f fVarD = key.O0().d();
            return CapturedTypeConstructorKt.b(c1VarE, fVarD instanceof y0 ? (y0) fVarD : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 b(final c1 c1Var, y0 y0Var) {
        if (y0Var == null || c1Var.c() == Variance.INVARIANT) {
            return c1Var;
        }
        if (y0Var.n() != c1Var.c()) {
            return new e1(c(c1Var));
        }
        if (!c1Var.b()) {
            return new e1(c1Var.getType());
        }
        m NO_LOCKS = LockBasedStorageManager.f127923e;
        f0.o(NO_LOCKS, "NO_LOCKS");
        return new e1(new LazyWrappedType(NO_LOCKS, new yh.a<d0>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$createCapturedIfNeeded$1
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d0 invoke() {
                d0 type = c1Var.getType();
                f0.o(type, "this@createCapturedIfNeeded.type");
                return type;
            }
        }));
    }

    @d
    public static final d0 c(@d c1 typeProjection) {
        f0.p(typeProjection, "typeProjection");
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean d(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return d0Var.O0() instanceof b;
    }

    @d
    public static final f1 e(@d f1 f1Var, boolean z10) {
        f0.p(f1Var, "<this>");
        if (!(f1Var instanceof c0)) {
            return new a(f1Var, z10);
        }
        c0 c0Var = (c0) f1Var;
        y0[] y0VarArrJ = c0Var.j();
        List<Pair> listUA = ArraysKt___ArraysKt.UA(c0Var.i(), c0Var.j());
        ArrayList arrayList = new ArrayList(t.Y(listUA, 10));
        for (Pair pair : listUA) {
            arrayList.add(b((c1) pair.e(), (y0) pair.f()));
        }
        return new c0(y0VarArrJ, (c1[]) arrayList.toArray(new c1[0]), z10);
    }

    public static /* synthetic */ f1 f(f1 f1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return e(f1Var, z10);
    }
}
