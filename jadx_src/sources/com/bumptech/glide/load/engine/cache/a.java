package com.bumptech.glide.load.engine.cache;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;

/* JADX INFO: compiled from: DiskCache.java */
/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskCache.java */
    public interface InterfaceC0327a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f41034a = 262144000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f41035b = "image_manager_disk_cache";

        @p0
        a build();
    }

    /* JADX INFO: compiled from: DiskCache.java */
    public interface b {
        boolean a(@n0 File file);
    }

    void a(com.bumptech.glide.load.c cVar, b bVar);

    @p0
    File b(com.bumptech.glide.load.c cVar);

    void c(com.bumptech.glide.load.c cVar);

    void clear();
}
