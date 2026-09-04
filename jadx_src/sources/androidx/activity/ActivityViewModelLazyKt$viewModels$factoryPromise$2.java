package androidx.activity;

import androidx.lifecycle.y0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$2 extends Lambda implements yh.a<y0.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f1348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityViewModelLazyKt$viewModels$factoryPromise$2(ComponentActivity componentActivity) {
        super(0);
        this.f1348b = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    @dl.d
    public final y0.b invoke() {
        y0.b defaultViewModelProviderFactory = this.f1348b.getDefaultViewModelProviderFactory();
        f0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
