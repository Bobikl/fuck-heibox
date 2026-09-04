package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.util.o;

/* JADX INFO: compiled from: FunctionInvokeDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends d0 {

    @dl.d
    public static final a F = new a(null);

    /* JADX INFO: compiled from: FunctionInvokeDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        private final b1 b(d dVar, int i10, y0 y0Var) {
            String lowerCase;
            String strB = y0Var.getName().b();
            f0.o(strB, "typeParameter.name.asString()");
            if (f0.g(strB, androidx.exifinterface.media.a.f23244d5)) {
                lowerCase = "instance";
            } else if (f0.g(strB, androidx.exifinterface.media.a.S4)) {
                lowerCase = SocialConstants.PARAM_RECEIVER;
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                f0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            e eVarB = e.f125601z1.b();
            f fVarF = f.f(lowerCase);
            f0.o(fVarF, "identifier(name)");
            j0 j0VarV = y0Var.v();
            f0.o(j0VarV, "typeParameter.defaultType");
            t0 NO_SOURCE = t0.f125942a;
            f0.o(NO_SOURCE, "NO_SOURCE");
            return new ValueParameterDescriptorImpl(dVar, null, i10, eVarB, fVarF, j0VarV, false, false, false, null, NO_SOURCE);
        }

        @dl.d
        public final d a(@dl.d b functionClass, boolean z10) {
            f0.p(functionClass, "functionClass");
            List<y0> listW = functionClass.w();
            d dVar = new d(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z10, null);
            r0 r0VarB0 = functionClass.b0();
            List<r0> listE = CollectionsKt__CollectionsKt.E();
            List<? extends y0> listE2 = CollectionsKt__CollectionsKt.E();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listW) {
                if (!(((y0) obj).n() == Variance.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<h0> iterableC6 = CollectionsKt___CollectionsKt.c6(arrayList);
            ArrayList arrayList2 = new ArrayList(t.Y(iterableC6, 10));
            for (h0 h0Var : iterableC6) {
                arrayList2.add(d.F.b(dVar, h0Var.e(), (y0) h0Var.f()));
            }
            dVar.S0(null, r0VarB0, listE, listE2, arrayList2, ((y0) CollectionsKt___CollectionsKt.k3(listW)).v(), Modality.ABSTRACT, r.f125868e);
            dVar.a1(true);
            return dVar;
        }
    }

    private d(k kVar, d dVar, CallableMemberDescriptor.Kind kind, boolean z10) {
        super(kVar, dVar, e.f125601z1.b(), o.f128258i, kind, t0.f125942a);
        g1(true);
        i1(z10);
        Z0(false);
    }

    public /* synthetic */ d(k kVar, d dVar, CallableMemberDescriptor.Kind kind, boolean z10, u uVar) {
        this(kVar, dVar, kind, z10);
    }

    private final w q1(List<f> list) {
        f fVar;
        boolean z10;
        int size = i().size() - list.size();
        boolean z11 = true;
        if (size == 0) {
            List<b1> valueParameters = i();
            f0.o(valueParameters, "valueParameters");
            List listD6 = CollectionsKt___CollectionsKt.d6(list, valueParameters);
            if (!(listD6 instanceof Collection) || !listD6.isEmpty()) {
                Iterator it = listD6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    if (!f0.g((f) pair.a(), ((b1) pair.b()).getName())) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                return this;
            }
        }
        List<b1> valueParameters2 = i();
        f0.o(valueParameters2, "valueParameters");
        ArrayList arrayList = new ArrayList(t.Y(valueParameters2, 10));
        for (b1 b1Var : valueParameters2) {
            f name = b1Var.getName();
            f0.o(name, "it.name");
            int index = b1Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(b1Var.N(this, name, index));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.o.c cVarT0 = T0(TypeSubstitutor.f128039b);
        if (list.isEmpty()) {
            z11 = false;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((f) it2.next()) == null) {
                }
            }
            z11 = false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.o.c cVarI = cVarT0.G(z11).n(arrayList).i(a());
        f0.o(cVarI, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        w wVarN0 = super.N0(cVarI);
        f0.m(wVarN0);
        return wVarN0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean C() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d0, kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.d
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.o M0(@dl.d k newOwner, @dl.e w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e f fVar, @dl.d e annotations, @dl.d t0 source) {
        f0.p(newOwner, "newOwner");
        f0.p(kind, "kind");
        f0.p(annotations, "annotations");
        f0.p(source, "source");
        return new d(newOwner, (d) wVar, kind, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.e
    protected w N0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.impl.o.c configuration) {
        kotlin.reflect.jvm.internal.impl.types.d0 type;
        f0.p(configuration, "configuration");
        d dVar = (d) super.N0(configuration);
        if (dVar == null) {
            return null;
        }
        List<b1> listI = dVar.i();
        f0.o(listI, "substituted.valueParameters");
        boolean z10 = false;
        if (!(listI instanceof Collection) || !listI.isEmpty()) {
            Iterator<T> it = listI.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                type = ((b1) it.next()).getType();
                f0.o(type, "it.type");
            } while (!(kotlin.reflect.jvm.internal.impl.builtins.f.d(type) != null));
        } else {
            z10 = true;
            break;
        }
        if (z10) {
            return dVar;
        }
        List<b1> listI2 = dVar.i();
        f0.o(listI2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(t.Y(listI2, 10));
        Iterator<T> it2 = listI2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.d0 type2 = ((b1) it2.next()).getType();
            f0.o(type2, "it.type");
            arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.f.d(type2));
        }
        return dVar.q1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean g() {
        return false;
    }
}
