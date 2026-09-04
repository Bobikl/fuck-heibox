package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: StringLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class w<Data> implements o<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f41445a;

    /* JADX INFO: compiled from: StringLoader.java */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        public o<String, AssetFileDescriptor> d(@n0 s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: StringLoader.java */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<String, ParcelFileDescriptor> d(@n0 s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: StringLoader.java */
    public static class c implements p<String, InputStream> {
        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<String, InputStream> d(@n0 s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }
    }

    public w(o<Uri, Data> oVar) {
        this.f41445a = oVar;
    }

    @p0
    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(@n0 String str, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.f41445a.b(uriE)) {
            return null;
        }
        return this.f41445a.a(uriE, i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 String str) {
        return true;
    }
}
