package androidx.activity;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
public final class ActivityViewModelLazyKt$viewModels$4 extends Lambda implements yh.a<u2.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.a<u2.a> f1345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f1346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewModelLazyKt$viewModels$4(yh.a<? extends u2.a> aVar, ComponentActivity componentActivity) {
        super(0);
        this.f1345b = aVar;
        this.f1346c = componentActivity;
    }

    @Override // yh.a
    @dl.d
    public final u2.a invoke() {
        u2.a aVarInvoke;
        yh.a<u2.a> aVar = this.f1345b;
        if (aVar != null && (aVarInvoke = aVar.invoke()) != null) {
            return aVarInvoke;
        }
        u2.a defaultViewModelCreationExtras = this.f1346c.getDefaultViewModelCreationExtras();
        f0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
