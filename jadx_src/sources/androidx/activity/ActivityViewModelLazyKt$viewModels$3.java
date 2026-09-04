package androidx.activity;

import androidx.lifecycle.b1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
public final class ActivityViewModelLazyKt$viewModels$3 extends Lambda implements yh.a<b1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f1344b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$3(ComponentActivity componentActivity) {
        super(0);
        this.f1344b = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    @dl.d
    public final b1 invoke() {
        b1 viewModelStore = this.f1344b.getViewModelStore();
        f0.o(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}
