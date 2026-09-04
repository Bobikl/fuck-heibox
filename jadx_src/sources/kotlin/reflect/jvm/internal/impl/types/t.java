package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: dynamicTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t extends y implements si.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final w0 f128176e;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(@dl.d kotlin.reflect.jvm.internal.impl.builtins.g builtIns, @dl.d w0 attributes) {
        kotlin.jvm.internal.f0.p(builtIns, "builtIns");
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        j0 j0VarH = builtIns.H();
        kotlin.jvm.internal.f0.o(j0VarH, "builtIns.nothingType");
        j0 j0VarI = builtIns.I();
        kotlin.jvm.internal.f0.o(j0VarI, "builtIns.nullableAnyType");
        super(j0VarH, j0VarI);
        this.f128176e = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y, kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return this.f128176e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y, kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public j0 V0() {
        return X0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public String Y0(@dl.d DescriptorRenderer renderer, @dl.d kotlin.reflect.jvm.internal.impl.renderer.b options) {
        kotlin.jvm.internal.f0.p(renderer, "renderer");
        kotlin.jvm.internal.f0.p(options, "options");
        return "dynamic";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public t V0(boolean z10) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public t Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public t U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        return new t(TypeUtilsKt.i(V0()), newAttributes);
    }
}
