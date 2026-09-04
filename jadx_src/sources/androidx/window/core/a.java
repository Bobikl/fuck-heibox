package androidx.window.core;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/window/core/a;", "Landroidx/window/core/f;", "", "tag", "message", "Lkotlin/b2;", "debug", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f28485a = new a();

    private a() {
    }

    @Override // androidx.window.core.f
    public void debug(@dl.d String tag, @dl.d String message) {
        f0.p(tag, "tag");
        f0.p(message, "message");
        Log.d(tag, message);
    }
}
