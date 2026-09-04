package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0006\u001a\u00020\u00052\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/f0;", "", "Lkotlin/Function0;", "Lkotlin/b2;", "onDisposeEffect", "Landroidx/compose/runtime/e0;", ak.av, "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12769a = 0;

    /* JADX INFO: compiled from: Effects.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.a<kotlin.b2> f12770a;

        public a(yh.a<kotlin.b2> aVar) {
            this.f12770a = aVar;
        }

        @Override // androidx.compose.runtime.e0
        public void dispose() {
            this.f12770a.invoke();
        }
    }

    @dl.d
    public final e0 a(@dl.d yh.a<kotlin.b2> onDisposeEffect) {
        kotlin.jvm.internal.f0.p(onDisposeEffect, "onDisposeEffect");
        return new a(onDisposeEffect);
    }
}
