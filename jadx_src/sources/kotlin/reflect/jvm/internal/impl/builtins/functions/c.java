package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.m;

/* JADX INFO: compiled from: FunctionClassScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends GivenFunctionsMemberScope {

    /* JADX INFO: compiled from: FunctionClassScope.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125375a;

        static {
            int[] iArr = new int[FunctionClassKind.values().length];
            try {
                iArr[FunctionClassKind.Function.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FunctionClassKind.SuspendFunction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f125375a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d m storageManager, @dl.d b containingClass) {
        super(storageManager, containingClass);
        f0.p(storageManager, "storageManager");
        f0.p(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @dl.d
    protected List<w> j() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarM = m();
        f0.n(dVarM, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i10 = a.f125375a[((b) dVarM).V0().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? CollectionsKt__CollectionsKt.E() : s.k(d.F.a((b) m(), true));
        }
        return s.k(d.F.a((b) m(), false));
    }
}
