package com.github.piasy.biv.loader.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.n0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.j;
import com.bumptech.glide.request.target.p;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.z;

/* JADX INFO: compiled from: GlideImageLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements k8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j f43431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, f> f43432b = new HashMap(3);

    /* JADX INFO: compiled from: GlideImageLoader.java */
    public class a extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean[] f43433f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k8.a.InterfaceC1122a f43434g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean[] zArr, k8.a.InterfaceC1122a interfaceC1122a) {
            super(str);
            this.f43433f = zArr;
            this.f43434g = interfaceC1122a;
        }

        @Override // com.github.piasy.biv.loader.glide.e.d
        public void a() {
            this.f43433f[0] = true;
            this.f43434g.onStart();
        }

        @Override // com.github.piasy.biv.loader.glide.f, com.bumptech.glide.request.target.p
        /* JADX INFO: renamed from: b */
        public void onResourceReady(@n0 File file, com.bumptech.glide.request.transition.f<? super File> fVar) {
            super.onResourceReady(file, fVar);
            if (this.f43433f[0]) {
                this.f43434g.onCacheMiss(l8.a.a(file), file);
            } else {
                this.f43434g.onCacheHit(l8.a.a(file), file);
            }
            this.f43434g.onSuccess(file);
        }

        @Override // com.github.piasy.biv.loader.glide.e.d
        public void onDownloadFinish() {
            this.f43434g.onFinish();
        }

        @Override // com.github.piasy.biv.loader.glide.f, com.bumptech.glide.request.target.p
        public void onLoadFailed(Drawable drawable) {
            super.onLoadFailed(drawable);
            this.f43434g.onFail(new GlideLoaderException(drawable));
        }

        @Override // com.github.piasy.biv.loader.glide.e.d
        public void onProgress(int i10) {
            this.f43434g.onProgress(i10);
        }
    }

    protected c(Context context, z zVar) {
        e.d(Glide.e(context), zVar);
        this.f43431a = Glide.F(context);
    }

    private void d(f fVar) {
        if (fVar != null) {
            this.f43431a.q(fVar);
        }
    }

    private synchronized void f(int i10, f fVar) {
        this.f43432b.put(Integer.valueOf(i10), fVar);
    }

    public static c g(Context context) {
        return h(context, null);
    }

    public static c h(Context context, z zVar) {
        return new c(context, zVar);
    }

    @Override // k8.a
    public void a(int i10, Uri uri, k8.a.InterfaceC1122a interfaceC1122a) {
        a aVar = new a(uri.toString(), new boolean[1], interfaceC1122a);
        b(i10);
        f(i10, aVar);
        e(uri, aVar);
    }

    @Override // k8.a
    public synchronized void b(int i10) {
        d(this.f43432b.remove(Integer.valueOf(i10)));
    }

    @Override // k8.a
    public void c(Uri uri) {
        e(uri, new g());
    }

    @Override // k8.a
    public synchronized void cancelAll() {
        Iterator it = new ArrayList(this.f43432b.values()).iterator();
        while (it.hasNext()) {
            d((f) it.next());
        }
    }

    protected void e(Uri uri, p<File> pVar) {
        this.f43431a.u().e(uri).z1(pVar);
    }
}
