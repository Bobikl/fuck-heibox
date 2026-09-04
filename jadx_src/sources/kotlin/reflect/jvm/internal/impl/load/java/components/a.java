package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.b2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.m;
import yh.l;

/* JADX INFO: compiled from: DescriptorResolverUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DescriptorResolverUtils.java */
    public static final class C1149a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f126034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f126035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f126036c;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DescriptorResolverUtils.java */
        public class C1150a implements l<CallableMemberDescriptor, b2> {
            C1150a() {
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e, "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // yh.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b2 invoke(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    a(0);
                }
                C1149a.this.f126034a.a(callableMemberDescriptor);
                return b2.f124493a;
            }
        }

        C1149a(m mVar, Set set, boolean z10) {
            this.f126034a = mVar;
            this.f126035b = set;
            this.f126036c = z10;
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.h
        public void a(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                f(0);
            }
            OverridingUtil.K(callableMemberDescriptor, new C1150a());
            this.f126035b.add(callableMemberDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.h
        public void d(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d Collection<? extends CallableMemberDescriptor> collection) {
            if (callableMemberDescriptor == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f126036c || callableMemberDescriptor.b() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                super.d(callableMemberDescriptor, collection);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.g
        public void e(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d CallableMemberDescriptor callableMemberDescriptor2) {
            if (callableMemberDescriptor == null) {
                f(1);
            }
            if (callableMemberDescriptor2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    @dl.e
    public static b1 b(@dl.d f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (fVar == null) {
            a(19);
        }
        if (dVar == null) {
            a(20);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> collectionH = dVar.h();
        if (collectionH.size() != 1) {
            return null;
        }
        for (b1 b1Var : collectionH.iterator().next().i()) {
            if (b1Var.getName().equals(fVar)) {
                return b1Var;
            }
        }
        return null;
    }

    @dl.d
    private static <D extends CallableMemberDescriptor> Collection<D> c(@dl.d f fVar, @dl.d Collection<D> collection, @dl.d Collection<D> collection2, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d m mVar, @dl.d OverridingUtil overridingUtil, boolean z10) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (dVar == null) {
            a(15);
        }
        if (mVar == null) {
            a(16);
        }
        if (overridingUtil == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.v(fVar, collection, collection2, dVar, new C1149a(mVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    @dl.d
    public static <D extends CallableMemberDescriptor> Collection<D> d(@dl.d f fVar, @dl.d Collection<D> collection, @dl.d Collection<D> collection2, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d m mVar, @dl.d OverridingUtil overridingUtil) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        if (mVar == null) {
            a(4);
        }
        if (overridingUtil == null) {
            a(5);
        }
        return c(fVar, collection, collection2, dVar, mVar, overridingUtil, false);
    }

    @dl.d
    public static <D extends CallableMemberDescriptor> Collection<D> e(@dl.d f fVar, @dl.d Collection<D> collection, @dl.d Collection<D> collection2, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d m mVar, @dl.d OverridingUtil overridingUtil) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (dVar == null) {
            a(9);
        }
        if (mVar == null) {
            a(10);
        }
        if (overridingUtil == null) {
            a(11);
        }
        return c(fVar, collection, collection2, dVar, mVar, overridingUtil, true);
    }
}
