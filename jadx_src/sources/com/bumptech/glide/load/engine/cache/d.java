package com.bumptech.glide.load.engine.cache;

import java.io.File;

/* JADX INFO: compiled from: DiskLruCacheFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements com.bumptech.glide.load.engine.cache.a.InterfaceC0327a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f41042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f41043d;

    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41044a;

        a(String str) {
            this.f41044a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f41044a);
        }
    }

    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41046b;

        b(String str, String str2) {
            this.f41045a = str;
            this.f41046b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f41045a, this.f41046b);
        }
    }

    /* JADX INFO: compiled from: DiskLruCacheFactory.java */
    public interface c {
        File a();
    }

    public d(c cVar, long j10) {
        this.f41042c = j10;
        this.f41043d = cVar;
    }

    public d(String str, long j10) {
        this(new a(str), j10);
    }

    public d(String str, String str2, long j10) {
        this(new b(str, str2), j10);
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0327a
    public com.bumptech.glide.load.engine.cache.a build() {
        File fileA = this.f41043d.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.d(fileA, this.f41042c);
        }
        return null;
    }
}
