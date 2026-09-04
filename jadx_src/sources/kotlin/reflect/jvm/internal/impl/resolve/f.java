package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.b2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: MemberComparator.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements Comparator<kotlin.reflect.jvm.internal.impl.descriptors.k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f127556b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DescriptorRenderer f127557c = DescriptorRenderer.f127411a.b(new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f127558d = false;

    /* JADX INFO: compiled from: MemberComparator.java */
    public static final class a implements yh.l<kotlin.reflect.jvm.internal.impl.renderer.b, b2> {
        a() {
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b2 invoke(kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
            bVar.l(false);
            bVar.h(true);
            bVar.p(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            bVar.g(DescriptorRendererModifier.ALL);
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: MemberComparator.java */
    public static class b implements Comparator<kotlin.reflect.jvm.internal.impl.descriptors.k> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f127559b = new b();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @dl.e
        public static Integer c(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
            int iD = d(kVar2) - d(kVar);
            if (iD != 0) {
                return Integer.valueOf(iD);
            }
            if (d.B(kVar) && d.B(kVar2)) {
                return 0;
            }
            int iCompareTo = kVar.getName().compareTo(kVar2.getName());
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }

        private static int d(kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
            if (d.B(kVar)) {
                return 8;
            }
            if (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.j) {
                return 7;
            }
            if (kVar instanceof o0) {
                return ((o0) kVar).l0() == null ? 6 : 5;
            }
            if (kVar instanceof w) {
                return ((w) kVar).l0() == null ? 4 : 3;
            }
            if (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                return 2;
            }
            return kVar instanceof x0 ? 1 : 0;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
            Integer numC = c(kVar, kVar2);
            if (numC != null) {
                return numC.intValue();
            }
            return 0;
        }
    }

    private f() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar2) {
        int iOrdinal;
        Integer numC = b.c(kVar, kVar2);
        if (numC != null) {
            return numC.intValue();
        }
        if ((kVar instanceof x0) && (kVar2 instanceof x0)) {
            DescriptorRenderer descriptorRenderer = f127557c;
            int iCompareTo = descriptorRenderer.y(((x0) kVar).E0()).compareTo(descriptorRenderer.y(((x0) kVar2).E0()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else if ((kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (kVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) kVar;
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) kVar2;
            r0 r0VarL0 = aVar.l0();
            r0 r0VarL1 = aVar2.l0();
            if (r0VarL0 != null) {
                DescriptorRenderer descriptorRenderer2 = f127557c;
                int iCompareTo2 = descriptorRenderer2.y(r0VarL0.getType()).compareTo(descriptorRenderer2.y(r0VarL1.getType()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            List<b1> listI = aVar.i();
            List<b1> listI2 = aVar2.i();
            for (int i10 = 0; i10 < Math.min(listI.size(), listI2.size()); i10++) {
                DescriptorRenderer descriptorRenderer3 = f127557c;
                int iCompareTo3 = descriptorRenderer3.y(listI.get(i10).getType()).compareTo(descriptorRenderer3.y(listI2.get(i10).getType()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = listI.size() - listI2.size();
            if (size != 0) {
                return size;
            }
            List<y0> typeParameters = aVar.getTypeParameters();
            List<y0> typeParameters2 = aVar2.getTypeParameters();
            for (int i11 = 0; i11 < Math.min(typeParameters.size(), typeParameters2.size()); i11++) {
                List<d0> upperBounds = typeParameters.get(i11).getUpperBounds();
                List<d0> upperBounds2 = typeParameters2.get(i11).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i12 = 0; i12 < upperBounds.size(); i12++) {
                    DescriptorRenderer descriptorRenderer4 = f127557c;
                    int iCompareTo4 = descriptorRenderer4.y(upperBounds.get(i12)).compareTo(descriptorRenderer4.y(upperBounds2.get(i12)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((aVar instanceof CallableMemberDescriptor) && (aVar2 instanceof CallableMemberDescriptor) && (iOrdinal = ((CallableMemberDescriptor) aVar).b().ordinal() - ((CallableMemberDescriptor) aVar2).b().ordinal()) != 0) {
                return iOrdinal;
            }
        } else {
            if (!(kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) || !(kVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
                throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", kVar, kVar.getClass(), kVar2, kVar2.getClass()));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) kVar;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) kVar2;
            if (dVar.b().ordinal() != dVar2.b().ordinal()) {
                return dVar.b().ordinal() - dVar2.b().ordinal();
            }
            if (dVar.r0() != dVar2.r0()) {
                return dVar.r0() ? 1 : -1;
            }
        }
        DescriptorRenderer descriptorRenderer5 = f127557c;
        int iCompareTo5 = descriptorRenderer5.s(kVar).compareTo(descriptorRenderer5.s(kVar2));
        return iCompareTo5 != 0 ? iCompareTo5 : d.g(kVar).getName().compareTo(d.g(kVar2).getName());
    }
}
