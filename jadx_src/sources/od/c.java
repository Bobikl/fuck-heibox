package od;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: StoryConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private yh.a<? extends View> f132271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private yh.a<? extends View> f132272b;

    @dl.e
    public final yh.a<View> a() {
        return this.f132272b;
    }

    @dl.e
    public final yh.a<View> b() {
        return this.f132271a;
    }

    public final void c(@dl.e yh.a<? extends View> aVar) {
        this.f132272b = aVar;
    }

    public final void d(@dl.e yh.a<? extends View> aVar) {
        this.f132271a = aVar;
    }
}
