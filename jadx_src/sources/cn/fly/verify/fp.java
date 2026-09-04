package cn.fly.verify;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fp {
    protected abstract InputStream a() throws Throwable;

    protected abstract long b() throws Throwable;

    public InputStream c() throws Throwable {
        return new fo(a());
    }
}
