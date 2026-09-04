package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends d {

    /* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41061b;

        a(Context context, String str) {
            this.f41060a = context;
            this.f41061b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File cacheDir = this.f41060a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f41061b != null ? new File(cacheDir, this.f41061b) : cacheDir;
        }
    }

    public h(Context context) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a.f41035b, 262144000L);
    }

    public h(Context context, long j10) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a.f41035b, j10);
    }

    public h(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
