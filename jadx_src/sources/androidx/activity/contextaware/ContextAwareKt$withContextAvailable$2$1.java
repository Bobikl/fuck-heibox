package androidx.activity.contextaware;

import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1\n*L\n1#1,93:1\n*E\n"})
public final class ContextAwareKt$withContextAvailable$2$1 extends Lambda implements l<Throwable, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f1473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ContextAwareKt.a f1474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextAwareKt$withContextAvailable$2$1(a aVar, ContextAwareKt.a aVar2) {
        super(1);
        this.f1473b = aVar;
        this.f1474c = aVar2;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
        invoke2(th2);
        return b2.f124493a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@e Throwable th2) {
        this.f1473b.removeOnContextAvailableListener(this.f1474c);
    }
}
