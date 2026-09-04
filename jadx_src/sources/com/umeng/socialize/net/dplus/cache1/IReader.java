package com.umeng.socialize.net.dplus.cache1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IReader<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106341a;
    public T result;

    public IReader(String str) {
        this.f106341a = str;
    }

    public static double formatSize(long j10) {
        return (j10 / 1024.0d) / 1024.0d;
    }

    public abstract void create(String str);

    public String getLogFileName() {
        return this.f106341a;
    }
}
