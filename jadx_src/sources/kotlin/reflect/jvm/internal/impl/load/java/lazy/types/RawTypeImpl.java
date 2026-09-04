package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.text.StringsKt__StringsKt;
import yh.l;

/* JADX INFO: compiled from: RawType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RawTypeImpl extends y implements i0 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(@dl.d j0 lowerBound, @dl.d j0 upperBound) {
        this(lowerBound, upperBound, false);
        f0.p(lowerBound, "lowerBound");
        f0.p(upperBound, "upperBound");
    }

    private RawTypeImpl(j0 j0Var, j0 j0Var2, boolean z10) {
        super(j0Var, j0Var2);
        if (z10) {
            return;
        }
        e.f128071a.d(j0Var, j0Var2);
    }

    private static final boolean b1(String str, String str2) {
        return f0.g(str, StringsKt__StringsKt.d4(str2, "out ")) || f0.g(str2, androidx.webkit.b.f28327e);
    }

    private static final List<String> c1(DescriptorRenderer descriptorRenderer, d0 d0Var) {
        List<c1> listM0 = d0Var.M0();
        ArrayList arrayList = new ArrayList(t.Y(listM0, 10));
        Iterator<T> it = listM0.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.z((c1) it.next()));
        }
        return arrayList;
    }

    private static final String d1(String str, String str2) {
        if (!StringsKt__StringsKt.V2(str, kotlin.text.y.f128596e, false, 2, null)) {
            return str;
        }
        return StringsKt__StringsKt.x5(str, kotlin.text.y.f128596e, null, 2, null) + kotlin.text.y.f128596e + str2 + kotlin.text.y.f128597f + StringsKt__StringsKt.t5(str, kotlin.text.y.f128597f, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public j0 V0() {
        return W0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public String Y0(@dl.d DescriptorRenderer renderer, @dl.d kotlin.reflect.jvm.internal.impl.renderer.b options) {
        f0.p(renderer, "renderer");
        f0.p(options, "options");
        String strY = renderer.y(W0());
        String strY2 = renderer.y(X0());
        if (options.d()) {
            return "raw (" + strY + ".." + strY2 + ')';
        }
        if (X0().M0().isEmpty()) {
            return renderer.v(strY, strY2, TypeUtilsKt.i(this));
        }
        List<String> listC1 = c1(renderer, W0());
        List<String> listC2 = c1(renderer, X0());
        String strH3 = CollectionsKt___CollectionsKt.h3(listC1, ", ", null, null, 0, null, new l<String, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d String it) {
                f0.p(it, "it");
                return "(raw) " + it;
            }
        }, 30, null);
        List<Pair> listD6 = CollectionsKt___CollectionsKt.d6(listC1, listC2);
        boolean z10 = true;
        if (!(listD6 instanceof Collection) || !listD6.isEmpty()) {
            for (Pair pair : listD6) {
                if (!b1((String) pair.e(), (String) pair.f())) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            strY2 = d1(strY2, strH3);
        }
        String strD1 = d1(strY, strH3);
        return f0.g(strD1, strY2) ? strD1 : renderer.v(strD1, strY2, TypeUtilsKt.i(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl V0(boolean z10) {
        return new RawTypeImpl(W0().V0(z10), X0().V0(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public y Y0(@dl.d f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 d0VarA = kotlinTypeRefiner.a(W0());
        f0.n(d0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 d0VarA2 = kotlinTypeRefiner.a(X0());
        f0.n(d0VarA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((j0) d0VarA, (j0) d0VarA2, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl U0(@dl.d w0 newAttributes) {
        f0.p(newAttributes, "newAttributes");
        return new RawTypeImpl(W0().U0(newAttributes), X0().U0(newAttributes));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.y, kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = O0().d();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        Object[] objArr = 0;
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
        if (dVar != null) {
            MemberScope memberScopeB0 = dVar.B0(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0));
            f0.o(memberScopeB0, "classDescriptor.getMemberScope(RawSubstitution())");
            return memberScopeB0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + O0().d()).toString());
    }
}
