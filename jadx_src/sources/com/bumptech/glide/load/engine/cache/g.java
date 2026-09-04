package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import androidx.annotation.p0;
import java.io.File;

/* JADX INFO: compiled from: ExternalPreferredCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends d {

    /* JADX INFO: compiled from: ExternalPreferredCacheDiskCacheFactory.java */
    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41059b;

        a(Context context, String str) {
            this.f41058a = context;
            this.f41059b = str;
        }

        @p0
        private File b() {
            File cacheDir = this.f41058a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f41059b != null ? new File(cacheDir, this.f41059b) : cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir;
            File fileB = b();
            if ((fileB == null || !fileB.exists()) && (externalCacheDir = this.f41058a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) {
                return this.f41059b != null ? new File(externalCacheDir, this.f41059b) : externalCacheDir;
            }
            return fileB;
        }
    }

    public g(Context context) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a.f41035b, 262144000L);
    }

    public g(Context context, long j10) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a.f41035b, j10);
    }

    public g(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
