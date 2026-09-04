package androidx.compose.runtime;

import android.os.Trace;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/r2;", "", "", "name", ak.av, "token", "Lkotlin/b2;", "b", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r2 f13058a = new r2();

    private r2() {
    }

    @dl.e
    public final Object a(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        Trace.beginSection(name);
        return null;
    }

    public final void b(@dl.e Object obj) {
        Trace.endSection();
    }
}
