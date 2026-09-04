package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: ResourceUriLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41437c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41438d = "ResourceUriLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<Integer, DataT> f41440b;

    /* JADX INFO: compiled from: ResourceUriLoader.java */
    public static final class a implements p<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41441a;

        a(Context context) {
            this.f41441a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, AssetFileDescriptor> d(@n0 s sVar) {
            return new u(this.f41441a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: ResourceUriLoader.java */
    public static final class b implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41442a;

        b(Context context) {
            this.f41442a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, InputStream> d(@n0 s sVar) {
            return new u(this.f41442a, sVar.d(Integer.class, InputStream.class));
        }
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.f41439a = context.getApplicationContext();
        this.f41440b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    @p0
    private o.a<DataT> g(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f41440b.a(Integer.valueOf(i12), i10, i11, fVar);
            }
            if (Log.isLoggable(f41438d, 5)) {
                Log.w(f41438d, "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable(f41438d, 5)) {
                Log.w(f41438d, "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    @p0
    private o.a<DataT> h(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f41439a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f41439a.getPackageName());
        if (identifier != 0) {
            return this.f41440b.a(Integer.valueOf(identifier), i10, i11, fVar);
        }
        if (!Log.isLoggable(f41438d, 5)) {
            return null;
        }
        Log.w(f41438d, "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // com.bumptech.glide.load.model.o
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> a(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, fVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, fVar);
        }
        if (!Log.isLoggable(f41438d, 5)) {
            return null;
        }
        Log.w(f41438d, "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f41439a.getPackageName().equals(uri.getAuthority());
    }
}
