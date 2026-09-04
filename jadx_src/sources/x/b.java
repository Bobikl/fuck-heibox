package x;

import android.annotation.SuppressLint;
import android.util.Property;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: IntProperty.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> extends Property<T, Integer> {
    public b(@p0 String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    @n0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract Integer get(@n0 T t10);

    @Override // android.util.Property
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void set(@n0 T t10, @n0 Integer num) {
        c(t10, num.intValue());
    }

    public abstract void c(@n0 T t10, int i10);
}
