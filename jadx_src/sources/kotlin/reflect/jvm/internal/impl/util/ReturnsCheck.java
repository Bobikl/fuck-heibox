package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ReturnsCheck implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f128213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<kotlin.reflect.jvm.internal.impl.builtins.g, d0> f128214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f128215c;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsBoolean extends ReturnsCheck {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final ReturnsBoolean f128216d = new ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", new yh.l<kotlin.reflect.jvm.internal.impl.builtins.g, d0>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.builtins.g gVar) {
                    f0.p(gVar, "$this$null");
                    j0 booleanType = gVar.n();
                    f0.o(booleanType, "booleanType");
                    return booleanType;
                }
            }, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsInt extends ReturnsCheck {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final ReturnsInt f128218d = new ReturnsInt();

        private ReturnsInt() {
            super("Int", new yh.l<kotlin.reflect.jvm.internal.impl.builtins.g, d0>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt.1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.builtins.g gVar) {
                    f0.p(gVar, "$this$null");
                    j0 intType = gVar.D();
                    f0.o(intType, "intType");
                    return intType;
                }
            }, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsUnit extends ReturnsCheck {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final ReturnsUnit f128220d = new ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", new yh.l<kotlin.reflect.jvm.internal.impl.builtins.g, d0>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit.1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.builtins.g gVar) {
                    f0.p(gVar, "$this$null");
                    j0 unitType = gVar.Z();
                    f0.o(unitType, "unitType");
                    return unitType;
                }
            }, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ReturnsCheck(String str, yh.l<? super kotlin.reflect.jvm.internal.impl.builtins.g, ? extends d0> lVar) {
        this.f128213a = str;
        this.f128214b = lVar;
        this.f128215c = "must return " + str;
    }

    public /* synthetic */ ReturnsCheck(String str, yh.l lVar, u uVar) {
        this(str, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @dl.e
    public String a(@dl.d w wVar) {
        return f.a.a(this, wVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean b(@dl.d w functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        return f0.g(functionDescriptor.getReturnType(), this.f128214b.invoke(DescriptorUtilsKt.j(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @dl.d
    public String getDescription() {
        return this.f128215c;
    }
}
