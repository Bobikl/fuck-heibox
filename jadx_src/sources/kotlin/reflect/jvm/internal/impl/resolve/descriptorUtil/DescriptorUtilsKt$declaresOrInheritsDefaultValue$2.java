package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import dl.d;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.h;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import yh.l;

/* JADX INFO: compiled from: DescriptorUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements l<b1, Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 f127550d = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @d
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @d
    public final h getOwner() {
        return n0.d(b1.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @d
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // yh.l
    @d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(@d b1 p10) {
        f0.p(p10, "p0");
        return Boolean.valueOf(p10.W());
    }
}
