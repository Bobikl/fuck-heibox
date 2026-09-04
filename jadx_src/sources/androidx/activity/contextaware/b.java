package androidx.activity.contextaware;

import android.content.Context;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ContextAwareHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final Set<c> f1475a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private volatile Context f1476b;

    public final void a(@d c listener) {
        f0.p(listener, "listener");
        Context context = this.f1476b;
        if (context != null) {
            listener.a(context);
        }
        this.f1475a.add(listener);
    }

    public final void b() {
        this.f1476b = null;
    }

    public final void c(@d Context context) {
        f0.p(context, "context");
        this.f1476b = context;
        Iterator<c> it = this.f1475a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @e
    public final Context d() {
        return this.f1476b;
    }

    public final void e(@d c listener) {
        f0.p(listener, "listener");
        this.f1475a.remove(listener);
    }
}
