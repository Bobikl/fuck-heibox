package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.n0;
import java.io.InputStream;

/* JADX INFO: compiled from: AssetUriLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class a<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f41308c = "android_asset";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41309d = "file:///android_asset/";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41310e = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f41311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0334a<Data> f41312b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public interface InterfaceC0334a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0334a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f41313a;

        public b(AssetManager assetManager) {
            this.f41313a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0334a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new a(this.f41313a, this);
        }
    }

    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class c implements p<Uri, InputStream>, InterfaceC0334a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f41314a;

        public c(AssetManager assetManager) {
            this.f41314a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0334a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, InputStream> d(s sVar) {
            return new a(this.f41314a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0334a<Data> interfaceC0334a) {
        this.f41311a = assetManager;
        this.f41312b = interfaceC0334a;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(uri), this.f41312b.a(this.f41311a, uri.toString().substring(f41310e)));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && f41308c.equals(uri.getPathSegments().get(0));
    }
}
