package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\b*\n\u0010\u0006\"\u00020\u00032\u00020\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", ak.av, "Runnable", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class y2 {

    /* JADX INFO: compiled from: Runnable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/b2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<kotlin.b2> f130511b;

        public a(yh.a<kotlin.b2> aVar) {
            this.f130511b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f130511b.invoke();
        }
    }

    @dl.d
    public static final Runnable a(@dl.d yh.a<kotlin.b2> aVar) {
        return new a(aVar);
    }
}
