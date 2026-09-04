package com.google.android.material.color;

import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;

/* JADX INFO: compiled from: HarmonizedColorsOptions.java */
/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    @androidx.annotation.n
    private final int[] f53744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final i f53745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.f
    private final int f53746c;

    /* JADX INFO: compiled from: HarmonizedColorsOptions.java */
    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private i f53748b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        @androidx.annotation.n
        private int[] f53747a = new int[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.f
        private int f53749c = R.attr.colorPrimary;

        @n0
        public k d() {
            return new k(this);
        }

        @s9.a
        @n0
        public b e(@androidx.annotation.f int i10) {
            this.f53749c = i10;
            return this;
        }

        @s9.a
        @n0
        public b f(@p0 i iVar) {
            this.f53748b = iVar;
            return this;
        }

        @s9.a
        @n0
        public b g(@n0 @androidx.annotation.n int[] iArr) {
            this.f53747a = iArr;
            return this;
        }
    }

    private k(b bVar) {
        this.f53744a = bVar.f53747a;
        this.f53745b = bVar.f53748b;
        this.f53746c = bVar.f53749c;
    }

    @n0
    public static k a() {
        return new b().f(i.c()).d();
    }

    @androidx.annotation.f
    public int b() {
        return this.f53746c;
    }

    @p0
    public i c() {
        return this.f53745b;
    }

    @n0
    @androidx.annotation.n
    public int[] d() {
        return this.f53744a;
    }

    @e1
    int e(@e1 int i10) {
        i iVar = this.f53745b;
        return (iVar == null || iVar.e() == 0) ? i10 : this.f53745b.e();
    }
}
