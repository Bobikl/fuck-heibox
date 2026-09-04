package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.m;

/* JADX INFO: compiled from: CloneableClassScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends GivenFunctionsMemberScope {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final C1141a f125520e = new C1141a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f125521f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CloneableClassScope.kt */
    public static final class C1141a {
        private C1141a() {
        }

        public /* synthetic */ C1141a(u uVar) {
            this();
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.f a() {
            return a.f125521f;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f("clone");
        f0.o(fVarF, "identifier(\"clone\")");
        f125521f = fVarF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d m storageManager, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d containingClass) {
        super(storageManager, containingClass);
        f0.p(storageManager, "storageManager");
        f0.p(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @dl.d
    protected List<w> j() {
        d0 d0VarM1 = d0.m1(m(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), f125521f, CallableMemberDescriptor.Kind.DECLARATION, t0.f125942a);
        d0VarM1.S0(null, m().b0(), CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), DescriptorUtilsKt.j(m()).i(), Modality.OPEN, r.f125866c);
        return s.k(d0VarM1);
    }
}
