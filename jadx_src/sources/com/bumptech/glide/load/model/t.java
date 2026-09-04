package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.InputStream;

/* JADX INFO: compiled from: ResourceLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class t<Data> implements o<Integer, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f41430c = "ResourceLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f41431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f41432b;

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f41433a;

        public a(Resources resources) {
            this.f41433a = resources;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new t(this.f41433a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: ResourceLoader.java */
    @Deprecated
    public static class b implements p<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f41434a;

        public b(Resources resources) {
            this.f41434a = resources;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Integer, ParcelFileDescriptor> d(s sVar) {
            return new t(this.f41434a, sVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class c implements p<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f41435a;

        public c(Resources resources) {
            this.f41435a = resources;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Integer, InputStream> d(s sVar) {
            return new t(this.f41435a, sVar.d(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class d implements p<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f41436a;

        public d(Resources resources) {
            this.f41436a = resources;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Integer, Uri> d(s sVar) {
            return new t(this.f41436a, x.c());
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f41432b = resources;
        this.f41431a = oVar;
    }

    @p0
    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f41432b.getResourcePackageName(num.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + this.f41432b.getResourceTypeName(num.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + this.f41432b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable(f41430c, 5)) {
                return null;
            }
            Log.w(f41430c, "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> a(@n0 Integer num, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f41431a.a(uriD, i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Integer num) {
        return true;
    }
}
