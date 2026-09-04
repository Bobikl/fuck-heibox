package com.transitionseverywhere.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.util.Property;
import androidx.annotation.n0;

/* JADX INFO: compiled from: IntProperty.java */
/* JADX INFO: loaded from: classes4.dex */
@TargetApi(14)
public abstract class b<T> extends Property<T, Integer> {

    /* JADX INFO: compiled from: IntProperty.java */
    public class a extends x.b<T> {
        a(String str) {
            super(str);
        }

        @Override // x.b, android.util.Property
        @n0
        /* JADX INFO: renamed from: a */
        public Integer get(@n0 T t10) {
            return b.this.get(t10);
        }

        @Override // x.b
        public void c(@n0 T t10, int i10) {
            b.this.d(t10, i10);
        }
    }

    public b() {
        super(Integer.class, null);
    }

    @Override // android.util.Property
    @n0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(T t10) {
        return 0;
    }

    @n0
    @SuppressLint({"NewApi"})
    public Property<T, Integer> b() {
        return new a(null);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void set(@n0 T t10, @n0 Integer num) {
        d(t10, num.intValue());
    }

    public abstract void d(@n0 T t10, int i10);
}
