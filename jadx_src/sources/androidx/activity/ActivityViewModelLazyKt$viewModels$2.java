package androidx.activity;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$2\n*L\n1#1,90:1\n*E\n"})
public final class ActivityViewModelLazyKt$viewModels$2 extends Lambda implements yh.a<u2.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f1343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$2(ComponentActivity componentActivity) {
        super(0);
        this.f1343b = componentActivity;
    }

    @Override // yh.a
    @dl.d
    public final u2.a invoke() {
        u2.a defaultViewModelCreationExtras = this.f1343b.getDefaultViewModelCreationExtras();
        f0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
