package com.google.common.base;

/* JADX INFO: compiled from: Ticker.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f56731a = new a();

    /* JADX INFO: compiled from: Ticker.java */
    public class a extends e0 {
        a() {
        }

        @Override // com.google.common.base.e0
        public long a() {
            return v.l();
        }
    }

    protected e0() {
    }

    public static e0 b() {
        return f56731a;
    }

    public abstract long a();
}
