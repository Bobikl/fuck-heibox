package c2;

import com.google.android.gms.common.internal.s;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lc2/c;", "", "Lc2/b;", s.a.f52543a, "Lkotlin/b2;", ak.av, ak.aF, "b", "<init>", "()V", "customview-poolingcontainer_release"}, k = 1, mv = {1, 6, 0})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final ArrayList<b> f35568a = new ArrayList<>();

    public final void a(@d b listener) {
        f0.p(listener, "listener");
        this.f35568a.add(listener);
    }

    public final void b() {
        for (int iG = CollectionsKt__CollectionsKt.G(this.f35568a); -1 < iG; iG--) {
            this.f35568a.get(iG).a();
        }
    }

    public final void c(@d b listener) {
        f0.p(listener, "listener");
        this.f35568a.remove(listener);
    }
}
