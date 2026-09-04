package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.p0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.t;
import com.bumptech.glide.load.model.u;
import com.bumptech.glide.load.model.v;
import com.bumptech.glide.load.model.x;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bitmap.c0;
import com.bumptech.glide.load.resource.bitmap.e0;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.w;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.load.resource.bitmap.z;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: RegistryFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: compiled from: RegistryFactory.java */
    public class a implements com.bumptech.glide.util.h.b<Registry> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f40753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Glide f40754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f40755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y6.a f40756d;

        a(Glide glide, List list, y6.a aVar) {
            this.f40754b = glide;
            this.f40755c = list;
            this.f40756d = aVar;
        }

        @Override // com.bumptech.glide.util.h.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f40753a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            androidx.tracing.b.c("Glide registry");
            this.f40753a = true;
            try {
                return h.a(this.f40754b, this.f40755c, this.f40756d);
            } finally {
                this.f40753a = false;
                androidx.tracing.b.f();
            }
        }
    }

    private h() {
    }

    static Registry a(Glide glide, List<y6.c> list, @p0 y6.a aVar) {
        com.bumptech.glide.load.engine.bitmap_recycle.e eVarH = glide.h();
        com.bumptech.glide.load.engine.bitmap_recycle.b bVarG = glide.g();
        Context applicationContext = glide.k().getApplicationContext();
        e eVarG = glide.k().g();
        Registry registry = new Registry();
        b(applicationContext, registry, eVarH, bVarG, eVarG);
        c(applicationContext, glide, registry, list, aVar);
        return registry;
    }

    private static void b(Context context, Registry registry, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, e eVar2) {
        com.bumptech.glide.load.g jVar;
        com.bumptech.glide.load.g c0Var;
        registry.t(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.t(new r());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> listG = registry.g();
        com.bumptech.glide.load.resource.gif.a aVar = new com.bumptech.glide.load.resource.gif.a(context, listG, eVar, bVar);
        com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> gVarM = VideoDecoder.m(eVar);
        o oVar = new o(registry.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (i10 < 28 || !eVar2.b(c.C0321c.class)) {
            jVar = new com.bumptech.glide.load.resource.bitmap.j(oVar);
            c0Var = new c0(oVar, bVar);
        } else {
            c0Var = new w();
            jVar = new com.bumptech.glide.load.resource.bitmap.k();
        }
        if (i10 >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, com.bumptech.glide.load.resource.drawable.a.f(listG, bVar));
            registry.e("Animation", ByteBuffer.class, Drawable.class, com.bumptech.glide.load.resource.drawable.a.a(listG, bVar));
        }
        com.bumptech.glide.load.resource.drawable.g gVar = new com.bumptech.glide.load.resource.drawable.g(context);
        com.bumptech.glide.load.resource.bitmap.e eVar3 = new com.bumptech.glide.load.resource.bitmap.e(bVar);
        com.bumptech.glide.load.resource.transcode.a aVar2 = new com.bumptech.glide.load.resource.transcode.a();
        com.bumptech.glide.load.resource.transcode.d dVar = new com.bumptech.glide.load.resource.transcode.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new com.bumptech.glide.load.model.c()).a(InputStream.class, new v(bVar)).e(Registry.f40559m, ByteBuffer.class, Bitmap.class, jVar).e(Registry.f40559m, InputStream.class, Bitmap.class, c0Var);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e(Registry.f40559m, ParcelFileDescriptor.class, Bitmap.class, new y(oVar));
        }
        registry.e(Registry.f40559m, AssetFileDescriptor.class, Bitmap.class, VideoDecoder.c(eVar));
        registry.e(Registry.f40559m, ParcelFileDescriptor.class, Bitmap.class, gVarM).d(Bitmap.class, Bitmap.class, x.a.a()).e(Registry.f40559m, Bitmap.class, Bitmap.class, new e0()).b(Bitmap.class, eVar3).e(Registry.f40560n, ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, jVar)).e(Registry.f40560n, InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, c0Var)).e(Registry.f40560n, ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, gVarM)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(eVar, eVar3)).e("Animation", InputStream.class, com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.j(listG, aVar, bVar)).e("Animation", ByteBuffer.class, com.bumptech.glide.load.resource.gif.c.class, aVar).b(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.d()).d(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, x.a.a()).e(Registry.f40559m, com.bumptech.glide.gifdecoder.a.class, Bitmap.class, new com.bumptech.glide.load.resource.gif.h(eVar)).c(Uri.class, Drawable.class, gVar).c(Uri.class, Bitmap.class, new z(gVar, eVar)).u(new w6.a.C1275a()).d(File.class, ByteBuffer.class, new com.bumptech.glide.load.model.d.b()).d(File.class, InputStream.class, new com.bumptech.glide.load.model.g.e()).c(File.class, File.class, new x6.a()).d(File.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.g.b()).d(File.class, File.class, x.a.a()).u(new com.bumptech.glide.load.data.k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            registry.u(new ParcelFileDescriptorRewinder.a());
        }
        p<Integer, InputStream> pVarG = com.bumptech.glide.load.model.f.g(context);
        p<Integer, AssetFileDescriptor> pVarC = com.bumptech.glide.load.model.f.c(context);
        p<Integer, Drawable> pVarE = com.bumptech.glide.load.model.f.e(context);
        Class cls = Integer.TYPE;
        registry.d(cls, InputStream.class, pVarG).d(Integer.class, InputStream.class, pVarG).d(cls, AssetFileDescriptor.class, pVarC).d(Integer.class, AssetFileDescriptor.class, pVarC).d(cls, Drawable.class, pVarE).d(Integer.class, Drawable.class, pVarE).d(Uri.class, InputStream.class, u.f(context)).d(Uri.class, AssetFileDescriptor.class, u.e(context));
        t.d dVar2 = new t.d(resources);
        t.a aVar3 = new t.a(resources);
        t.c cVar = new t.c(resources);
        registry.d(Integer.class, Uri.class, dVar2).d(cls, Uri.class, dVar2).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls, AssetFileDescriptor.class, aVar3).d(Integer.class, InputStream.class, cVar).d(cls, InputStream.class, cVar);
        registry.d(String.class, InputStream.class, new com.bumptech.glide.load.model.e.c()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.e.c()).d(String.class, InputStream.class, new com.bumptech.glide.load.model.w.c()).d(String.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.w.b()).d(String.class, AssetFileDescriptor.class, new com.bumptech.glide.load.model.w.a()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new com.bumptech.glide.load.model.a.b(context.getAssets())).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.d.a(context)).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.e.a(context));
        if (i10 >= 29) {
            registry.d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.f.c(context));
            registry.d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.stream.f.b(context));
        }
        registry.d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.y.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.y.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new com.bumptech.glide.load.model.y.a(contentResolver)).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.z.a()).d(URL.class, InputStream.class, new com.bumptech.glide.load.model.stream.h.a()).d(Uri.class, File.class, new l.a(context)).d(com.bumptech.glide.load.model.h.class, InputStream.class, new com.bumptech.glide.load.model.stream.b.a()).d(byte[].class, ByteBuffer.class, new com.bumptech.glide.load.model.b.a()).d(byte[].class, InputStream.class, new com.bumptech.glide.load.model.b.d()).d(Uri.class, Uri.class, x.a.a()).d(Drawable.class, Drawable.class, x.a.a()).c(Drawable.class, Drawable.class, new com.bumptech.glide.load.resource.drawable.h()).x(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.transcode.b(resources)).x(Bitmap.class, byte[].class, aVar2).x(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.c(eVar, aVar2, dVar)).x(com.bumptech.glide.load.resource.gif.c.class, byte[].class, dVar);
        com.bumptech.glide.load.g<ByteBuffer, Bitmap> gVarD = VideoDecoder.d(eVar);
        registry.c(ByteBuffer.class, Bitmap.class, gVarD);
        registry.c(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, gVarD));
    }

    private static void c(Context context, Glide glide, Registry registry, List<y6.c> list, @p0 y6.a aVar) {
        for (y6.c cVar : list) {
            try {
                cVar.b(context, glide, registry);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + cVar.getClass().getName(), e10);
            }
        }
        if (aVar != null) {
            aVar.b(context, glide, registry);
        }
    }

    static com.bumptech.glide.util.h.b<Registry> d(Glide glide, List<y6.c> list, @p0 y6.a aVar) {
        return new a(glide, list, aVar);
    }
}
