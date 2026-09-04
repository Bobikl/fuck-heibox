package com.github.piasy.biv.loader.glide;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.request.target.p;
import java.io.File;
import okhttp3.z;

/* JADX INFO: compiled from: GlideCustomImageLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<? extends d> f43430c;

    private b(Context context, z zVar, Class<? extends d> cls) {
        super(context, zVar);
        this.f43430c = cls;
    }

    public static b i(Context context, Class<? extends d> cls) {
        return j(context, null, cls);
    }

    public static b j(Context context, z zVar, Class<? extends d> cls) {
        return new b(context, zVar, cls);
    }

    @Override // com.github.piasy.biv.loader.glide.c
    protected void e(Uri uri, p<File> pVar) {
        Class<? extends d> cls = this.f43430c;
        if (cls == null) {
            super.e(uri, pVar);
            return;
        }
        try {
            d dVarNewInstance = cls.newInstance();
            dVarNewInstance.a(uri);
            this.f43431a.u().d(dVarNewInstance).z1(pVar);
        } catch (IllegalAccessException unused) {
            super.e(uri, pVar);
        } catch (InstantiationException unused2) {
            super.e(uri, pVar);
        }
    }
}
