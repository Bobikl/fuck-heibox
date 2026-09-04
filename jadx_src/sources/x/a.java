package x;

import android.annotation.SuppressLint;
import android.util.Property;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: FloatProperty.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> extends Property<T, Float> {
    public a(@p0 String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @n0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract Float get(@n0 T t10);

    @Override // android.util.Property
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void set(@n0 T t10, @n0 Float f10) {
        c(t10, f10.floatValue());
    }

    public abstract void c(@n0 T t10, float f10);
}
