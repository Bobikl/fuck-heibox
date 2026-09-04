package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: ExternalCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class f extends d {

    /* JADX INFO: compiled from: ExternalCacheDiskCacheFactory.java */
    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41057b;

        a(Context context, String str) {
            this.f41056a = context;
            this.f41057b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir = this.f41056a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f41057b != null ? new File(externalCacheDir, this.f41057b) : externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a.f41035b, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a.f41034a);
    }

    public f(Context context, int i10) {
        this(context, com.bumptech.glide.load.engine.cache.a.InterfaceC0327a.f41035b, i10);
    }

    public f(Context context, String str, int i10) {
        super(new a(context, str), i10);
    }
}
