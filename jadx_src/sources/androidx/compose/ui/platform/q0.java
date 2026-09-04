package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n0\tH\u0096\u0001J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0001J\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/q0;", "Landroidx/compose/runtime/saveable/c;", "", "value", "", ak.av, "", "key", "e", "", "", ak.aF, "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/c$a;", "b", "Lkotlin/b2;", "d", "saveableStateRegistry", "onDispose", "<init>", "(Landroidx/compose/runtime/saveable/c;Lyh/a;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class q0 implements androidx.compose.runtime.saveable.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.a<kotlin.b2> f15966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.runtime.saveable.c f15967b;

    public q0(@dl.d androidx.compose.runtime.saveable.c saveableStateRegistry, @dl.d yh.a<kotlin.b2> onDispose) {
        kotlin.jvm.internal.f0.p(saveableStateRegistry, "saveableStateRegistry");
        kotlin.jvm.internal.f0.p(onDispose, "onDispose");
        this.f15966a = onDispose;
        this.f15967b = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.c
    public boolean a(@dl.d Object value) {
        kotlin.jvm.internal.f0.p(value, "value");
        return this.f15967b.a(value);
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.d
    public androidx.compose.runtime.saveable.c.a b(@dl.d String key, @dl.d yh.a<? extends Object> valueProvider) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(valueProvider, "valueProvider");
        return this.f15967b.b(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.d
    public Map<String, List<Object>> c() {
        return this.f15967b.c();
    }

    public final void d() {
        this.f15966a.invoke();
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.e
    public Object e(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return this.f15967b.e(key);
    }
}
