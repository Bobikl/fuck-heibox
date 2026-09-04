package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.y0[] f128053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final c1[] f128054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f128055e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(@dl.d List<? extends kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters, @dl.d List<? extends c1> argumentsList) {
        this((kotlin.reflect.jvm.internal.impl.descriptors.y0[]) parameters.toArray(new kotlin.reflect.jvm.internal.impl.descriptors.y0[0]), (c1[]) argumentsList.toArray(new c1[0]), false, 4, null);
        kotlin.jvm.internal.f0.p(parameters, "parameters");
        kotlin.jvm.internal.f0.p(argumentsList, "argumentsList");
    }

    public c0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0[] parameters, @dl.d c1[] arguments, boolean z10) {
        kotlin.jvm.internal.f0.p(parameters, "parameters");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        this.f128053c = parameters;
        this.f128054d = arguments;
        this.f128055e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    public /* synthetic */ c0(kotlin.reflect.jvm.internal.impl.descriptors.y0[] y0VarArr, c1[] c1VarArr, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(y0VarArr, c1VarArr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean b() {
        return this.f128055e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.e
    public c1 e(@dl.d d0 key) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = key.O0().d();
        kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0 ? (kotlin.reflect.jvm.internal.impl.descriptors.y0) fVarD : null;
        if (y0Var == null) {
            return null;
        }
        int index = y0Var.getIndex();
        kotlin.reflect.jvm.internal.impl.descriptors.y0[] y0VarArr = this.f128053c;
        if (index >= y0VarArr.length || !kotlin.jvm.internal.f0.g(y0VarArr[index].r(), y0Var.r())) {
            return null;
        }
        return this.f128054d[index];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean f() {
        return this.f128054d.length == 0;
    }

    @dl.d
    public final c1[] i() {
        return this.f128054d;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.y0[] j() {
        return this.f128053c;
    }
}
