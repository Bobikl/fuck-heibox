package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: compiled from: WindowIdApi18.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(18)
public class a1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowId f27826a;

    a1(@androidx.annotation.n0 View view) {
        this.f27826a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof a1) && ((a1) obj).f27826a.equals(this.f27826a);
    }

    public int hashCode() {
        return this.f27826a.hashCode();
    }
}
