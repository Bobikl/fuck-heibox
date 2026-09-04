package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: FragmentContainer.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class q {
    @androidx.annotation.n0
    @Deprecated
    public Fragment b(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, @androidx.annotation.p0 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @androidx.annotation.p0
    public abstract View c(@androidx.annotation.d0 int i10);

    public abstract boolean d();
}
