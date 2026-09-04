package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.m;
import java.util.List;

/* JADX INFO: compiled from: ResourceDrawableDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements com.bumptech.glide.load.g<Uri, Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Resources.Theme> f41650b = com.bumptech.glide.load.e.f("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f41651c = "android";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41652d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41653e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f41654f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f41655g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f41656h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f41657i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41658a;

    public g(Context context) {
        this.f41658a = context.getApplicationContext();
    }

    @n0
    private Context d(Uri uri, @n0 String str) {
        if (str.equals(this.f41658a.getPackageName())) {
            return this.f41658a;
        }
        try {
            return this.f41658a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f41658a.getPackageName())) {
                return this.f41658a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    @v
    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    @v
    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @v
    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.bumptech.glide.load.g
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<Drawable> b(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            Resources.Theme theme = ((String) m.e(authority)).equals(this.f41658a.getPackageName()) ? (Resources.Theme) fVar.c(f41650b) : null;
            return f.d(theme == null ? c.b(this.f41658a, contextD, iG) : c.a(this.f41658a, iG, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 Uri uri, @n0 com.bumptech.glide.load.f fVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
