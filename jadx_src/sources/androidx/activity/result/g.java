package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ActivityResultLauncher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class g<I> {
    @n0
    public abstract z.a<I, ?> a();

    public void b(@SuppressLint({"UnknownNullness"}) I i10) {
        c(i10, null);
    }

    public abstract void c(@SuppressLint({"UnknownNullness"}) I i10, @p0 androidx.core.app.i iVar);

    @k0
    public abstract void d();
}
