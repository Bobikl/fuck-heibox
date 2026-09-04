package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0011¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/n2;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/j1;", "value", "Landroidx/compose/runtime/m2;", "e", "(Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lyh/a;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class n2<T> extends j1<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(@dl.d yh.a<? extends T> defaultFactory) {
        super(defaultFactory);
        kotlin.jvm.internal.f0.p(defaultFactory, "defaultFactory");
    }

    @Override // androidx.compose.runtime.v
    @dl.d
    @h
    public m2<T> e(T t10, @dl.e p pVar, int i10) {
        pVar.T(-1121811719);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1121811719, i10, -1, "androidx.compose.runtime.StaticProvidableCompositionLocal.provided (CompositionLocal.kt:139)");
        }
        StaticValueHolder staticValueHolder = new StaticValueHolder(t10);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return staticValueHolder;
    }
}
