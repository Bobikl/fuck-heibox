package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.types.l1;

/* JADX INFO: compiled from: KotlinTypePreparator.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReference implements yh.l<si.g, l1> {
    KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @dl.d
    public final String getName() {
        return "prepareType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final kotlin.reflect.h getOwner() {
        return n0.d(KotlinTypePreparator.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final l1 invoke(@dl.d si.g p10) {
        f0.p(p10, "p0");
        return ((KotlinTypePreparator) this.receiver).a(p10);
    }
}
