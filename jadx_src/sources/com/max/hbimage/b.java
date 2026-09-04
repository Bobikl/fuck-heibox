package com.max.hbimage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.renderscript.RSRuntimeException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.Gson;
import com.max.hbimage.bean.common.BackimageObj;
import com.max.hbimage.image.t;
import com.max.hbimage.image.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.b0;
import io.reactivex.c0;
import io.reactivex.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.json.JSONObject;

/* JADX INFO: compiled from: ImageUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<String, File> f70376a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f70377b = 10485760;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f70378c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ImageUtil.java */
    public class a extends com.bumptech.glide.request.target.f<View, Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q f70379i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f70380j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, q qVar, View view2) {
            super(view);
            this.f70379i = qVar;
            this.f70380j = view2;
        }

        @Override // com.bumptech.glide.request.target.f
        public void f(@p0 Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.O5, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f70379i.b(drawable);
            View view = this.f70380j;
            if (!(view instanceof ImageView) || ((ImageView) view).getDrawable() == drawable || ((ImageView) this.f70380j).getDrawable() == null) {
                return;
            }
            ((ImageView) this.f70380j).setImageDrawable(null);
        }

        public void m(@n0 Drawable drawable, @p0 com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            if (PatchProxy.proxy(new Object[]{drawable, fVar}, this, changeQuickRedirect, false, bb.c.g.N5, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f70379i.a(drawable);
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadFailed(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.g.P5, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            m((Drawable) obj, fVar);
        }
    }

    /* JADX INFO: renamed from: com.max.hbimage.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageUtil.java */
    public class C0569b implements com.bumptech.glide.request.g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BackimageObj f70381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f70382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f70383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f70384e;

        /* JADX INFO: renamed from: com.max.hbimage.b$b$a */
        /* JADX INFO: compiled from: ImageUtil.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.S5, new Class[0], Void.TYPE).isSupported || C0569b.this.f70382c.get() == null) {
                    return;
                }
                C0569b c0569b = C0569b.this;
                b.X(c0569b.f70383d, (View) c0569b.f70382c.get(), C0569b.this.f70381b.getBackup(), C0569b.this.f70384e);
            }
        }

        C0569b(BackimageObj backimageObj, WeakReference weakReference, Context context, q qVar) {
            this.f70381b = backimageObj;
            this.f70382c = weakReference;
            this.f70383d = context;
            this.f70384e = qVar;
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@p0 GlideException glideException, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, boolean z10) {
            Object[] objArr = {glideException, obj, pVar, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Q5, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            BackimageObj backimageObj = this.f70381b;
            if (backimageObj != null && backimageObj.getBackup() != null) {
                new Handler().post(new a());
            }
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.R5, new Class[]{Object.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(drawable, obj, pVar, dataSource, z10);
        }

        public boolean c(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class c extends com.bumptech.glide.request.target.e<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f70386b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, q qVar) {
            super(i10, i11);
            this.f70386b = qVar;
        }

        public void a(@n0 Drawable drawable, @p0 com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            if (PatchProxy.proxy(new Object[]{drawable, fVar}, this, changeQuickRedirect, false, bb.c.g.T5, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f70386b.a(drawable);
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.p
        public void onLoadFailed(@p0 Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.U5, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f70386b.onLoadFailed(drawable);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.g.V5, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Drawable) obj, fVar);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class d implements com.bumptech.glide.request.g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BackimageObj f70387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f70388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f70389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f70390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q f70391f;

        /* JADX INFO: compiled from: ImageUtil.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Y5, new Class[0], Void.TYPE).isSupported || d.this.f70388c.get() == null) {
                    return;
                }
                Context context = (Context) d.this.f70388c.get();
                d dVar = d.this;
                b.W(context, dVar.f70389d, dVar.f70390e, dVar.f70387b.getBackup(), d.this.f70391f);
            }
        }

        d(BackimageObj backimageObj, WeakReference weakReference, int i10, int i11, q qVar) {
            this.f70387b = backimageObj;
            this.f70388c = weakReference;
            this.f70389d = i10;
            this.f70390e = i11;
            this.f70391f = qVar;
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@p0 GlideException glideException, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, boolean z10) {
            Object[] objArr = {glideException, obj, pVar, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.W5, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            BackimageObj backimageObj = this.f70387b;
            if (backimageObj != null && backimageObj.getBackup() != null) {
                new Handler().post(new a());
            }
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.X5, new Class[]{Object.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(drawable, obj, pVar, dataSource, z10);
        }

        public boolean c(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class e extends com.bumptech.glide.request.target.n<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f70393e;

        e(q qVar) {
            this.f70393e = qVar;
        }

        public void c(@n0 Drawable drawable, @p0 com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            if (PatchProxy.proxy(new Object[]{drawable, fVar}, this, changeQuickRedirect, false, bb.c.g.Z5, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f70393e.a(drawable);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
        public void onLoadFailed(@p0 Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32729a6, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f70393e.onLoadFailed(drawable);
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.g.f32749b6, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Drawable) obj, fVar);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class f implements com.bumptech.glide.request.g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BackimageObj f70394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f70395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f70396d;

        /* JADX INFO: compiled from: ImageUtil.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32809e6, new Class[0], Void.TYPE).isSupported || f.this.f70395c.get() == null) {
                    return;
                }
                b.Y((Context) f.this.f70395c.get(), f.this.f70394b.getBackup(), f.this.f70396d);
            }
        }

        f(BackimageObj backimageObj, WeakReference weakReference, q qVar) {
            this.f70394b = backimageObj;
            this.f70395c = weakReference;
            this.f70396d = qVar;
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@p0 GlideException glideException, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, boolean z10) {
            Object[] objArr = {glideException, obj, pVar, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.f32769c6, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            BackimageObj backimageObj = this.f70394b;
            if (backimageObj != null && backimageObj.getBackup() != null) {
                new Handler().post(new a());
            }
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.f32789d6, new Class[]{Object.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(drawable, obj, pVar, dataSource, z10);
        }

        public boolean c(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70398a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f70398a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70398a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70398a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70398a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70398a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70398a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70398a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f70398a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class h extends com.bumptech.glide.request.target.n<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f70399e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, int i11, View view) {
            super(i10, i11);
            this.f70399e = view;
        }

        public void c(@n0 @dl.d Bitmap bitmap, @dl.e @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            if (PatchProxy.proxy(new Object[]{bitmap, fVar}, this, changeQuickRedirect, false, bb.c.g.L5, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f70399e.setBackground(new BitmapDrawable(bitmap));
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 @dl.d Object obj, @dl.e @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.g.M5, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Bitmap) obj, fVar);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class i extends com.bumptech.glide.request.target.n<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImageView f70400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f70401f;

        i(ImageView imageView, Context context) {
            this.f70400e = imageView;
            this.f70401f = context;
        }

        public void c(@n0 Drawable drawable, @p0 com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            if (PatchProxy.proxy(new Object[]{drawable, fVar}, this, changeQuickRedirect, false, bb.c.g.f32829f6, new Class[]{Drawable.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbimage.image.a aVar = com.max.hbimage.image.a.f70419a;
            this.f70400e.setImageDrawable(aVar.a(aVar.c(aVar.b(drawable)), this.f70401f));
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.g.f32849g6, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            c((Drawable) obj, fVar);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class j implements com.bumptech.glide.request.g<Drawable> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BackimageObj f70402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f70403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.i f70404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.request.h f70405e;

        /* JADX INFO: compiled from: ImageUtil.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32908j6, new Class[0], Void.TYPE).isSupported || j.this.f70403c.get() == null) {
                    return;
                }
                j jVar = j.this;
                b.a(jVar.f70404d, jVar.f70405e, jVar.f70402b.getBackup(), (ImageView) j.this.f70403c.get());
            }
        }

        j(BackimageObj backimageObj, WeakReference weakReference, com.bumptech.glide.i iVar, com.bumptech.glide.request.h hVar) {
            this.f70402b = backimageObj;
            this.f70403c = weakReference;
            this.f70404d = iVar;
            this.f70405e = hVar;
        }

        @Override // com.bumptech.glide.request.g
        public boolean a(@p0 GlideException glideException, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, boolean z10) {
            Object[] objArr = {glideException, obj, pVar, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.f32869h6, new Class[]{GlideException.class, Object.class, com.bumptech.glide.request.target.p.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            BackimageObj backimageObj = this.f70402b;
            if (backimageObj != null && backimageObj.getBackup() != null) {
                new Handler().post(new a());
            }
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public /* bridge */ /* synthetic */ boolean b(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            Object[] objArr = {drawable, obj, pVar, dataSource, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.f32889i6, new Class[]{Object.class, Object.class, com.bumptech.glide.request.target.p.class, DataSource.class, cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : c(drawable, obj, pVar, dataSource, z10);
        }

        public boolean c(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, DataSource dataSource, boolean z10) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class k implements c0<Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // io.reactivex.c0
        public void a(b0<Object> b0Var) throws Exception {
            if (PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, bb.c.g.f32928k6, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            Glide.e(com.max.hbimage.image.l.a()).b();
            b0Var.onComplete();
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class l extends com.max.hbimage.image.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f70407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f70408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f70409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f70410e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, HashMap map, String str2, List list, r rVar) {
            super(str);
            this.f70407b = map;
            this.f70408c = str2;
            this.f70409d = list;
            this.f70410e = rVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.max.hbimage.image.o
        public void onResourceReady(@n0 File file, @p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
            if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, bb.c.g.f32948l6, new Class[]{File.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onResourceReady(file, fVar);
            this.f70407b.put(this.f70408c, file.getName());
            if (this.f70407b.size() == this.f70409d.size()) {
                this.f70410e.a();
            }
        }

        @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(@n0 File file, @p0 com.bumptech.glide.request.transition.f<? super File> fVar) {
            if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, bb.c.g.f32968m6, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady(file, fVar);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class m implements kh.o<String, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f70411b;

        m(s sVar) {
            this.f70411b = sVar;
        }

        /* JADX WARN: Code duplicated, block: B:62:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r3v9 */
        public Boolean a(String str) throws Exception {
            OutputStream outputStreamOpenOutputStream;
            boolean z10 = true;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.f32988n6, new Class[]{String.class}, Boolean.class);
            if (patchProxyResultProxy.isSupported) {
                return (Boolean) patchProxyResultProxy.result;
            }
            com.bumptech.glide.request.d<File> dVarV1 = Glide.F(com.max.hbimage.image.l.a()).u().load(str).V1();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            File file = dVarV1.get(10L, timeUnit);
            if (file != null) {
                String str2 = b.B(file) ? com.max.mediaselector.lib.config.f.f75143v : ".jpg";
                s sVar = this.f70411b;
                String str3 = (sVar != null ? sVar.getFileName(str) : t.d(str)) + str2;
                Uri uri = Environment.getExternalStorageState().equals("mounted") ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                ContentValues contentValuesU = b.u(com.max.hbimage.image.l.a(), str3);
                Uri uriInsert = com.max.hbimage.image.l.a().getContentResolver().insert(uri, contentValuesU);
                if (uriInsert == null) {
                    return Boolean.FALSE;
                }
                ?? r10 = 0;
                try {
                    try {
                        outputStreamOpenOutputStream = com.max.hbimage.image.l.a().getContentResolver().openOutputStream(uriInsert);
                        try {
                            Files.copy(file.toPath(), outputStreamOpenOutputStream);
                            contentValuesU.clear();
                            contentValuesU.put("is_pending", (Integer) 0);
                            com.max.hbimage.image.l.a().getContentResolver().update(uriInsert, contentValuesU, null, null);
                            if (outputStreamOpenOutputStream != null) {
                                try {
                                    outputStreamOpenOutputStream.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            com.max.hbimage.image.l.a().getContentResolver().delete(uriInsert, null, null);
                            e.printStackTrace();
                            if (outputStreamOpenOutputStream != null) {
                                try {
                                    outputStreamOpenOutputStream.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                            }
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = timeUnit;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    outputStreamOpenOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ Boolean apply(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.f33008o6, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class n implements kh.o<String, File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f70412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f70413c;

        n(String str, s sVar) {
            this.f70412b = str;
            this.f70413c = sVar;
        }

        public File a(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.f33028p6, new Class[]{String.class}, File.class);
            if (patchProxyResultProxy.isSupported) {
                return (File) patchProxyResultProxy.result;
            }
            File file = Glide.F(com.max.hbimage.image.l.a()).u().load(str).V1().get(10L, TimeUnit.SECONDS);
            if (file == null) {
                return null;
            }
            String str2 = b.B(file) ? com.max.mediaselector.lib.config.f.f75143v : ".jpg";
            File file2 = new File(this.f70412b);
            if (!file2.exists() && !file2.mkdirs()) {
                return null;
            }
            s sVar = this.f70413c;
            File file3 = new File(file2, (sVar != null ? sVar.getFileName(str) : t.d(str)) + str2);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return file3;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ File apply(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.f33048q6, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class o implements kh.o<Bitmap, File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f70414b;

        o(String str) {
            this.f70414b = str;
        }

        public File a(Bitmap bitmap) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.f33068r6, new Class[]{Bitmap.class}, File.class);
            if (patchProxyResultProxy.isSupported) {
                return (File) patchProxyResultProxy.result;
            }
            File file = new File(this.f70414b);
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            File file2 = new File(file, ("heybox_" + String.valueOf(System.currentTimeMillis()) + lg.a.f131412e + new Random().nextInt()) + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return file2;
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ File apply(Bitmap bitmap) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.f33088s6, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bitmap);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public class p implements kh.o<Bitmap, File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f70415b;

        p(String str) {
            this.f70415b = str;
        }

        public File a(Bitmap bitmap) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.f33108t6, new Class[]{Bitmap.class}, File.class);
            if (patchProxyResultProxy.isSupported) {
                return (File) patchProxyResultProxy.result;
            }
            File file = new File(this.f70415b);
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            File file2 = new File(file, ("heybox_" + String.valueOf(System.currentTimeMillis()) + lg.a.f131412e + new Random().nextInt()) + com.max.mediaselector.lib.config.f.f75141t);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            return file2;
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ File apply(Bitmap bitmap) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.f33128u6, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bitmap);
        }
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public interface q {
        void a(Drawable drawable);

        void b(@p0 Drawable drawable);

        void onLoadFailed(Drawable drawable);
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public interface r {
        void a();
    }

    /* JADX INFO: compiled from: ImageUtil.java */
    public interface s {
        String getFileName(String str);
    }

    static {
        f70378c = ob.a.b().t() ? "Max" : "HeyBox";
    }

    public static Bitmap A(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.g.A5, new Class[]{Activity.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        View decorView = activity.getWindow().getDecorView();
        return com.max.hbimage.image.c.b(activity, m(decorView, Math.min(u.f(activity), u.h(decorView)), Math.min(u.e(activity), u.g(decorView)), -1, false));
    }

    public static boolean B(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.g.f32907j5, new Class[]{File.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strW = w(file);
        return strW != null && strW.contains("gif");
    }

    public static boolean C(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.g.f32927k5, new Class[]{File.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return Math.max(options.outWidth, options.outHeight) >= 2048;
    }

    public static boolean D(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.Y4, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str != null && (str.toLowerCase().startsWith("http://") || str.toLowerCase().startsWith("https://"));
    }

    public static void E(@n0 ImageView imageView) {
        com.bumptech.glide.j jVarZ;
        if (PatchProxy.proxy(new Object[]{imageView}, null, changeQuickRedirect, true, bb.c.g.f32788d5, new Class[]{ImageView.class}, Void.TYPE).isSupported || (jVarZ = z(imageView)) == null) {
            return;
        }
        jVarZ.p(imageView);
    }

    public static void F(Context context, String str, View view) {
        Object objS;
        if (PatchProxy.proxy(new Object[]{context, str, view}, null, changeQuickRedirect, true, bb.c.g.f33206y4, new Class[]{Context.class, String.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.bumptech.glide.i<Bitmap> iVarL = Glide.F(context).l();
        if (D(str)) {
            objS = str;
            objS = s(str);
        }
        objS = str;
        iVarL.d(objS).z1(new h(u.h(view), u.g(view), view));
    }

    public static void G(@p0 String str, @n0 ImageView imageView, int i10, int i11, int i12) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.Q4, new Class[]{String.class, ImageView.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = imageView.getContext();
        com.bumptech.glide.j jVarZ = z(imageView);
        com.bumptech.glide.request.h hVarT0 = new com.bumptech.glide.request.h().T0(new com.max.hbimage.image.b(context, i10, i11));
        if (i12 != -1) {
            hVarT0 = hVarT0.E0(i12);
        }
        if (jVarZ != null) {
            J(jVarZ.m(), hVarT0, str, imageView);
        }
    }

    public static void H(@p0 String str, @n0 ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{str, imageView}, null, changeQuickRedirect, true, bb.c.g.F4, new Class[]{String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        I(str, imageView, -1);
    }

    public static void I(@p0 String str, @n0 ImageView imageView, int i10) {
        if (PatchProxy.proxy(new Object[]{str, imageView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.G4, new Class[]{String.class, ImageView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        O(str, imageView, i10, -1, -1, 1.0f, true, -1, -1, true, true, null);
    }

    @SuppressLint({"CheckResult"})
    private static void J(@n0 com.bumptech.glide.i<Drawable> iVar, @p0 com.bumptech.glide.request.h hVar, @p0 String str, @n0 ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{iVar, hVar, str, imageView}, null, changeQuickRedirect, true, bb.c.g.X4, new Class[]{com.bumptech.glide.i.class, com.bumptech.glide.request.h.class, String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (hVar != null) {
            if (!hVar.o0() && hVar.m0() && imageView.getScaleType() != null && !hVar.o0() && hVar.m0() && imageView.getScaleType() != null) {
                switch (g.f70398a[imageView.getScaleType().ordinal()]) {
                    case 1:
                        hVar = hVar.clone().s0();
                        break;
                    case 2:
                        hVar = hVar.clone().t0();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        hVar = hVar.clone().v0();
                        break;
                    case 6:
                        hVar = hVar.clone().t0();
                        break;
                }
            }
            iVar = iVar.i(hVar);
        }
        String strE = ob.a.b().e(str);
        BackimageObj backimageObjK = k(str);
        if (backimageObjK != null && backimageObjK.getNormal() != null) {
            strE = backimageObjK.getNormal();
        }
        iVar.E1(new j(backimageObjK, new WeakReference(imageView), iVar, hVar));
        ob.a aVar = ob.a.f132240a;
        String strR = ob.a.b().r(strE);
        if (strR != null && strR.length() > 0) {
            iVar.load(strR).z1(new com.max.hbimage.image.e(imageView));
        } else if (D(strE)) {
            iVar.d(s(strE)).z1(new com.max.hbimage.image.e(imageView));
        } else {
            iVar.load(strE).z1(new com.max.hbimage.image.e(imageView));
        }
    }

    public static void K(@p0 String str, @n0 ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{str, imageView}, null, changeQuickRedirect, true, bb.c.g.B4, new Class[]{String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        L(str, imageView, -1);
    }

    public static void L(@p0 String str, @n0 ImageView imageView, int i10) {
        if (PatchProxy.proxy(new Object[]{str, imageView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.D4, new Class[]{String.class, ImageView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        O(str, imageView, i10, -1, -1, 1.0f, false, -1, -1, true, true, null);
    }

    public static void M(@p0 String str, @n0 ImageView imageView, int i10, int i11) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.M4, new Class[]{String.class, ImageView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        O(str, imageView, i11, -1, -1, 1.0f, false, -1, i10, true, true, null);
    }

    public static void N(@p0 String str, @n0 ImageView imageView, int i10, int i11, int i12) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.P4, new Class[]{String.class, ImageView.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.bumptech.glide.j jVarZ = z(imageView);
        com.bumptech.glide.request.h hVar = new com.bumptech.glide.request.h();
        if (i12 != -1) {
            hVar = hVar.E0(i12);
        }
        if (i10 > 0) {
            hVar = hVar.Z0(new com.max.hbimage.image.s(i10, 0, i11));
        }
        if (jVarZ != null) {
            jVarZ.m().i(hVar).load(str).C1(imageView);
        }
    }

    public static void O(@p0 String str, @n0 ImageView imageView, int i10, int i11, int i12, float f10, boolean z10, int i13, int i14, boolean z11, boolean z12, String str2) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11), new Integer(i12), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i13), new Integer(i14), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.U4, new Class[]{String.class, ImageView.class, cls, cls, cls, Float.TYPE, cls2, cls, cls, cls2, cls2, String.class}, Void.TYPE).isSupported) {
            return;
        }
        S(str, imageView, i10, null, i11, i12, f10, z10, i13, i14, z11, z12, str2);
    }

    public static void P(@p0 String str, @n0 ImageView imageView, int i10, int i11, int i12, float f10, boolean z10, int i13, boolean z11, boolean z12) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11), new Integer(i12), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i13), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.S4, new Class[]{String.class, ImageView.class, cls, cls, cls, Float.TYPE, cls2, cls, cls2, cls2}, Void.TYPE).isSupported) {
            return;
        }
        Q(str, imageView, i10, i11, i12, f10, z10, i13, z11, z12, null);
    }

    public static void Q(@p0 String str, @n0 ImageView imageView, int i10, int i11, int i12, float f10, boolean z10, int i13, boolean z11, boolean z12, String str2) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11), new Integer(i12), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i13), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.T4, new Class[]{String.class, ImageView.class, cls, cls, cls, Float.TYPE, cls2, cls, cls2, cls2, String.class}, Void.TYPE).isSupported) {
            return;
        }
        O(str, imageView, i10, i11, i12, f10, z10, i13, 0, z11, z12, str2);
    }

    @Deprecated
    public static void R(@p0 String str, @n0 ImageView imageView, int i10, int i11, int i12, int i13) {
        com.bumptech.glide.j jVarZ = z(imageView);
        com.bumptech.glide.request.h hVarT0 = new com.bumptech.glide.request.h().T0(new com.max.hbimage.image.d(i10, i11, i12));
        if (i13 != -1) {
            hVarT0 = hVarT0.E0(i13);
        }
        if (jVarZ != null) {
            J(jVarZ.m(), hVarT0, str, imageView);
        }
    }

    public static void S(@p0 String str, @n0 ImageView imageView, int i10, Drawable drawable, int i11, int i12, float f10, boolean z10, int i13, int i14, boolean z11, boolean z12, String str2) {
        Object[] objArr = {str, imageView, new Integer(i10), drawable, new Integer(i11), new Integer(i12), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i13), new Integer(i14), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.V4, new Class[]{String.class, ImageView.class, cls, Drawable.class, cls, cls, Float.TYPE, cls2, cls, cls, cls2, cls2, String.class}, Void.TYPE).isSupported) {
            return;
        }
        T(str, imageView, i10, drawable, i11, i12, f10, z10, i13, i14, z11, z12, str2, false);
    }

    public static void T(@p0 String str, @n0 ImageView imageView, int i10, Drawable drawable, int i11, int i12, float f10, boolean z10, int i13, int i14, boolean z11, boolean z12, String str2, boolean z13) {
        Object[] objArr = {str, imageView, new Integer(i10), drawable, new Integer(i11), new Integer(i12), new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i13), new Integer(i14), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), str2, new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.W4, new Class[]{String.class, ImageView.class, cls, Drawable.class, cls, cls, Float.TYPE, cls2, cls, cls, cls2, cls2, String.class, cls2}, Void.TYPE).isSupported) {
            return;
        }
        com.bumptech.glide.j jVarZ = z(imageView);
        com.bumptech.glide.request.h hVar = new com.bumptech.glide.request.h();
        if (z10) {
            hVar = hVar.m();
        }
        if (i13 > 0) {
            hVar = hVar.Z0(new com.bumptech.glide.load.resource.bitmap.l(), new com.max.hbimage.image.s(i13, 0, i14));
        }
        if (z13) {
            hVar.r();
        }
        if (i10 != -1) {
            hVar = imageView.getContext() != null ? hVar.F0(androidx.core.content.res.i.g(imageView.getContext().getResources(), i10, imageView.getContext().getTheme())) : hVar.E0(i10);
        } else if (drawable != null) {
            hVar = hVar.F0(drawable);
        }
        if (i11 != -1) {
            hVar = hVar.w(i11);
        }
        if (i12 != -1) {
            hVar = hVar.y(i12);
        }
        if (f10 >= 0.0f && f10 < 1.0f) {
            hVar = hVar.P0(f10);
        }
        if (!z12) {
            hVar = hVar.r0(true);
        }
        if (jVarZ != null) {
            com.bumptech.glide.i<Drawable> iVarM = jVarZ.m();
            if (z11 && i10 != -1) {
                iVarM = iVarM.b2(new com.bumptech.glide.load.resource.drawable.e().e(R.anim.fade_in));
            }
            if (!TextUtils.isEmpty(str2)) {
                iVarM = iVarM.Y1(jVarZ.m().load(str2));
            }
            J(iVarM, hVar, str, imageView);
        }
    }

    public static void U(@p0 String str, @n0 ImageView imageView, Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{str, imageView, drawable}, null, changeQuickRedirect, true, bb.c.g.E4, new Class[]{String.class, ImageView.class, Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        S(str, imageView, -1, drawable, -1, -1, 1.0f, false, -1, -1, true, true, null);
    }

    public static void V(String str, ImageView imageView, int i10) {
        if (PatchProxy.proxy(new Object[]{str, imageView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.R4, new Class[]{String.class, ImageView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        T(str, imageView, i10, null, -1, -1, 1.0f, true, -1, 0, false, true, null, true);
    }

    public static void W(Context context, int i10, int i11, String str, q qVar) {
        String normal;
        Object[] objArr = {context, new Integer(i10), new Integer(i11), str, qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.G5, new Class[]{Context.class, cls, cls, String.class, q.class}, Void.TYPE).isSupported) {
            return;
        }
        BackimageObj backimageObjK = k(str);
        if (backimageObjK != null && backimageObjK.getNormal() != null) {
            normal = str;
            normal = str;
            normal = backimageObjK.getNormal();
        }
        normal = str;
        normal = str;
        normal = str;
        WeakReference weakReference = new WeakReference(context);
        com.bumptech.glide.j jVarF = Glide.F(context);
        boolean zD = D(normal);
        Object objS = normal;
        if (zD) {
            objS = s(normal);
        }
        jVarF.d(objS).E1(new d(backimageObjK, weakReference, i10, i11, qVar)).z1(new c(i10, i11, qVar));
    }

    public static void X(Context context, View view, String str, q qVar) {
        String normal;
        if (PatchProxy.proxy(new Object[]{context, view, str, qVar}, null, changeQuickRedirect, true, bb.c.g.F5, new Class[]{Context.class, View.class, String.class, q.class}, Void.TYPE).isSupported) {
            return;
        }
        BackimageObj backimageObjK = k(str);
        if (backimageObjK != null && backimageObjK.getNormal() != null) {
            normal = str;
            normal = str;
            normal = backimageObjK.getNormal();
        }
        normal = str;
        normal = str;
        normal = str;
        WeakReference weakReference = new WeakReference(view);
        com.bumptech.glide.j jVarF = Glide.F(context);
        boolean zD = D(normal);
        Object objS = normal;
        if (zD) {
            objS = s(normal);
        }
        jVarF.d(objS).E1(new C0569b(backimageObjK, weakReference, context, qVar)).z1(new a(view, qVar, view));
    }

    @Deprecated
    public static void Y(Context context, String str, q qVar) {
        BackimageObj backimageObjK = k(str);
        String normal = str;
        if (backimageObjK != null && backimageObjK.getNormal() != null) {
            normal = str;
            normal = backimageObjK.getNormal();
        }
        normal = str;
        WeakReference weakReference = new WeakReference(context);
        com.bumptech.glide.j jVarF = Glide.F(context);
        boolean zD = D(normal);
        Object objS = normal;
        if (zD) {
            objS = s(normal);
        }
        jVarF.d(objS).E1(new f(backimageObjK, weakReference, qVar)).z1(new e(qVar));
    }

    public static void Z(@p0 String str, @n0 ImageView imageView, String str2) {
        if (PatchProxy.proxy(new Object[]{str, imageView, str2}, null, changeQuickRedirect, true, bb.c.g.C4, new Class[]{String.class, ImageView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        O(str, imageView, -1, -1, -1, 1.0f, false, -1, -1, true, true, str2);
    }

    static /* synthetic */ void a(com.bumptech.glide.i iVar, com.bumptech.glide.request.h hVar, String str, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{iVar, hVar, str, imageView}, null, changeQuickRedirect, true, bb.c.g.K5, new Class[]{com.bumptech.glide.i.class, com.bumptech.glide.request.h.class, String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        J(iVar, hVar, str, imageView);
    }

    public static void a0(@p0 Integer num, @n0 ImageView imageView, int i10, int i11, int i12) {
        Object[] objArr = {num, imageView, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.O4, new Class[]{Integer.class, ImageView.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.bumptech.glide.j jVarZ = z(imageView);
        com.bumptech.glide.request.h hVar = new com.bumptech.glide.request.h();
        if (i12 != -1) {
            hVar = hVar.E0(i12);
        }
        if (i10 > 0) {
            hVar = hVar.Z0(new com.max.hbimage.image.s(i10, 0, i11));
        }
        if (jVarZ != null) {
            jVarZ.m().i(hVar).h(num).C1(imageView);
        }
    }

    public static int[] b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.f33166w4, new Class[]{String.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        int iV = v(str);
        if (iV == 0) {
            return x(str);
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile == null) {
            return new int[]{0, 0};
        }
        Bitmap bitmapN0 = n0(bitmapDecodeFile, iV);
        if (bitmapN0 == null) {
            return x(str);
        }
        bitmapDecodeFile.recycle();
        return new int[]{bitmapN0.getWidth(), bitmapN0.getHeight()};
    }

    public static void b0(@p0 Integer num, @n0 ImageView imageView, int i10, int i11, int i12, int i13) {
        Object[] objArr = {num, imageView, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.N4, new Class[]{Integer.class, ImageView.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.bumptech.glide.j jVarZ = z(imageView);
        com.bumptech.glide.request.h hVarT0 = new com.bumptech.glide.request.h().T0(new com.max.hbimage.image.d(i10, i11, i12));
        if (i13 != -1) {
            hVarT0 = hVarT0.E0(i13);
        }
        if (jVarZ != null) {
            jVarZ.m().i(hVarT0).h(num).C1(imageView);
        }
    }

    public static void c(@n0 ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, null, changeQuickRedirect, true, bb.c.g.f32748b5, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        d(imageView, null);
    }

    public static void c0(Context context, String str, @n0 ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{context, str, imageView}, null, changeQuickRedirect, true, bb.c.g.A4, new Class[]{Context.class, String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        Glide.F(context).load(str).z1(new i(imageView, context));
    }

    public static void d(@n0 ImageView imageView, Drawable drawable) {
        com.bumptech.glide.j jVarZ;
        if (PatchProxy.proxy(new Object[]{imageView, drawable}, null, changeQuickRedirect, true, bb.c.g.f32768c5, new Class[]{ImageView.class, Drawable.class}, Void.TYPE).isSupported || (jVarZ = z(imageView)) == null) {
            return;
        }
        jVarZ.p(imageView);
        imageView.setImageDrawable(drawable);
    }

    public static void d0(@p0 String str, @n0 ImageView imageView, int i10) {
        if (PatchProxy.proxy(new Object[]{str, imageView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.H4, new Class[]{String.class, ImageView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        e0(str, imageView, i10, -1);
    }

    public static void e() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32848g5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g();
        f();
    }

    public static void e0(@p0 String str, @n0 ImageView imageView, int i10, int i11) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.I4, new Class[]{String.class, ImageView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0(str, imageView, i10, i11, null);
    }

    public static void f() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32828f5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z.q1(new k()).I5(io.reactivex.schedulers.b.d()).C5();
    }

    public static void f0(@p0 String str, @n0 ImageView imageView, int i10, int i11, String str2) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.J4, new Class[]{String.class, ImageView.class, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        g0(str, imageView, i10, i11, str2, 0);
    }

    public static void g() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32808e5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Glide.e(com.max.hbimage.image.l.a()).c();
    }

    public static void g0(@p0 String str, @n0 ImageView imageView, int i10, int i11, String str2, int i12) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11), str2, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.K4, new Class[]{String.class, ImageView.class, cls, cls, String.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        O(str, imageView, i11, -1, -1, 1.0f, false, i10, i12, true, true, str2);
    }

    public static File h(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.g.I5, new Class[]{Context.class, String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        try {
            String str2 = u.b(System.currentTimeMillis(), "yyyyMMddhhmmss") + new Random().nextInt();
            return o0(bitmapDecodeFile, new File(context.getExternalCacheDir().getAbsolutePath(), str2 + ".jpg").getAbsolutePath());
        } catch (Throwable th2) {
            Log.e("heicToJpg", th2.getMessage());
            return null;
        }
    }

    public static void h0(Context context, String str, ImageView imageView, int i10, int i11, @androidx.annotation.l int i12) {
        Object[] objArr = {context, str, imageView, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.L4, new Class[]{Context.class, String.class, ImageView.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Glide.F(context).load(str).i(com.bumptech.glide.request.h.e1(new com.max.hbimage.image.r(i10, i11, i12))).C1(imageView);
    }

    public static z<File> i(@n0 String str, @p0 s sVar, String... strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, sVar, strArr}, null, changeQuickRedirect, true, bb.c.g.f33047q5, new Class[]{String.class, s.class, String[].class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.I2(strArr).z3(new n(str, sVar));
    }

    public static void i0(List<String> list, r rVar) {
        if (PatchProxy.proxy(new Object[]{list, rVar}, null, changeQuickRedirect, true, bb.c.g.f32967m5, new Class[]{List.class, r.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : list) {
            Glide.F(com.max.hbimage.image.l.a()).u().load(str).z1(new l(str, map, str, list, rVar));
        }
    }

    @w0(api = 29)
    public static z<Boolean> j(@p0 s sVar, String... strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sVar, strArr}, null, changeQuickRedirect, true, bb.c.g.f33027p5, new Class[]{s.class, String[].class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.I2(strArr).z3(new m(sVar));
    }

    public static void j0(String... strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, bb.c.g.f32947l5, new Class[]{String[].class}, Void.TYPE).isSupported) {
            return;
        }
        for (String str : strArr) {
            Glide.F(com.max.hbimage.image.l.a()).u().load(str).z1(new com.max.hbimage.image.o(str));
        }
    }

    public static BackimageObj k(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.J5, new Class[]{String.class}, BackimageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BackimageObj) patchProxyResultProxy.result;
        }
        if (str != null) {
            try {
                if (str.startsWith("http")) {
                    return null;
                }
            } catch (Throwable th2) {
                Log.e("fastGetLoadBackUp", "error: " + th2.getMessage() + "  return self: " + str);
                return null;
            }
        }
        new JSONObject(str);
        return (BackimageObj) new Gson().fromJson(str, BackimageObj.class);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0057  */
    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    public static Bitmap k0(String str, float f10, float f11) {
        int i10;
        float f12;
        Object[] objArr = {str, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.H5, new Class[]{String.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (i11 > i12) {
            float f13 = i11;
            if (f13 > f10) {
                i10 = (int) (f13 / f10);
            } else if (i11 < i12) {
                f12 = i12;
                if (f12 > f11) {
                    i10 = (int) (f12 / f11);
                } else {
                    i10 = 1;
                }
            } else {
                i10 = 1;
            }
        } else if (i11 < i12) {
            f12 = i12;
            if (f12 > f11) {
                i10 = (int) (f12 / f11);
            } else {
                i10 = 1;
            }
        } else {
            i10 = 1;
        }
        options.inSampleSize = i10 > 0 ? i10 : 1;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap l(View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.f33187x5, new Class[]{View.class, cls, cls}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : m(view, i10, i11, -1, true);
    }

    public static void l0(Context context, String... strArr) {
        if (PatchProxy.proxy(new Object[]{context, strArr}, null, changeQuickRedirect, true, bb.c.g.f33167w5, new Class[]{Context.class, String[].class}, Void.TYPE).isSupported || context == null || strArr.length <= 0) {
            return;
        }
        MediaScannerConnection.scanFile(context.getApplicationContext(), strArr, null, null);
    }

    public static Bitmap m(View view, int i10, int i11, int i12, boolean z10) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.f33207y5, new Class[]{View.class, cls, cls, cls, Boolean.TYPE}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : n(view, i10, i11, i12, z10, 1.0f);
    }

    public static Drawable m0(Drawable drawable, Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable, context}, null, changeQuickRedirect, true, bb.c.g.C5, new Class[]{Drawable.class, Context.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        com.max.hbimage.image.a aVar = com.max.hbimage.image.a.f70419a;
        return aVar.a(aVar.c(aVar.b(drawable)), context);
    }

    public static Bitmap n(View view, int i10, int i11, int i12, boolean z10, float f10) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.f33227z5, new Class[]{View.class, cls, cls, cls, Boolean.TYPE, Float.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (view == null || i10 <= 0 || i11 <= 0) {
            return null;
        }
        if (z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
            view.layout(0, 0, i10, i11);
        }
        float f11 = i10;
        int i13 = (int) (f11 * f10);
        float f12 = i11;
        int i14 = (int) (f12 * f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setHasAlpha(true);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(f10, f10);
        view.draw(canvas);
        canvas.setBitmap(null);
        if (i12 <= 0) {
            return bitmapCreateBitmap;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, f11, f12);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        float f13 = i12;
        canvas2.drawRoundRect(rectF, f13, f13, paint);
        canvas2.setBitmap(null);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapCreateBitmap2;
    }

    public static Bitmap n0(Bitmap bitmap, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.f33146v4, new Class[]{Bitmap.class, Integer.TYPE}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (i10 == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Bitmap o(Context context, Bitmap bitmap, int i10, int i11) {
        Object[] objArr = {context, bitmap, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.B5, new Class[]{Context.class, Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (Math.min(width, height) <= i11 || i11 <= 1) {
            i11 = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width / i11, height / i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f10 = 1.0f / i11;
        canvas.scale(f10, f10);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            return com.max.hbimage.image.c.g(context, bitmapCreateBitmap, i10);
        } catch (RSRuntimeException unused) {
            return com.max.hbimage.image.c.c(bitmapCreateBitmap, i10, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[Catch: all -> 0x00b6, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {all -> 0x00b6, blocks: (B:31:0x00ae, B:33:0x00b3), top: B:50:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf A[Catch: all -> 0x00c2, FINALLY_INSNS, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:37:0x00ba, B:39:0x00bf), top: B:44:0x00ba }] */
    public static File o0(Bitmap bitmap, String str) {
        FileOutputStream fileOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, str}, null, changeQuickRedirect, true, bb.c.g.f33147v5, new Class[]{Bitmap.class, String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        File file = new File(str);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            fileOutputStream = new FileOutputStream(file);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                if (byteArrayOutputStream.size() > 10485760) {
                    int iMax = Math.max(1, 1048576000 / byteArrayOutputStream.size());
                    byteArrayOutputStream.close();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, iMax, byteArrayOutputStream2);
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            Log.e("saveAndCompressBitmap", th.getLocalizedMessage() != null ? th.getMessage() : "io error");
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                    if (fileOutputStream != null) {
                                    }
                                } catch (Throwable unused) {
                                    return null;
                                }
                            } else if (fileOutputStream != null) {
                            }
                            return null;
                        } finally {
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (Throwable unused2) {
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        }
                    }
                }
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                bitmap.recycle();
                Log.d("saveAndCompressBitmap", "duration: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                try {
                    byteArrayOutputStream.close();
                    fileOutputStream.close();
                } catch (Throwable unused3) {
                }
                return file;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            byteArrayOutputStream = null;
        }
    }

    public static File p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.f32987n5, new Class[]{String.class}, File.class);
        return patchProxyResultProxy.isSupported ? (File) patchProxyResultProxy.result : f70376a.get(str);
    }

    public static z<File> p0(@n0 String str, Bitmap... bitmapArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bitmapArr}, null, changeQuickRedirect, true, bb.c.g.f33067r5, new Class[]{String.class, Bitmap[].class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.I2(bitmapArr).z3(new o(str));
    }

    public static Bitmap q(@n0 Bitmap bitmap, int i10, int i11) {
        Object[] objArr = {bitmap, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.D5, new Class[]{Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int iMin = Math.min(i10, i11);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setHasAlpha(true);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(7);
        canvas.drawCircle(f11, f11, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static File q0(Bitmap bitmap, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, str}, null, changeQuickRedirect, true, bb.c.g.f33107t5, new Class[]{Bitmap.class, String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        try {
            File file2 = new File(file, ("heybox_" + String.valueOf(System.currentTimeMillis()) + lg.a.f131412e + new Random().nextInt()) + com.max.mediaselector.lib.config.f.f75141t);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            return file2;
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("[ImageUtil][saveBitmap] error: " + th2.getMessage());
            return null;
        }
    }

    public static Bitmap r(@n0 Bitmap bitmap, int i10, int i11, int i12) {
        float f10;
        Object[] objArr = {bitmap, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.E5, new Class[]{Bitmap.class, cls, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i10 == 0 && i11 != 0) {
            i10 = (width * i11) / height;
        } else if (i11 == 0 && i10 != 0) {
            i11 = (height * i10) / width;
        }
        if (i10 == 0) {
            i10 = width;
        }
        if (i11 == 0) {
            i11 = height;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setHasAlpha(true);
        float f11 = i10;
        float f12 = width;
        float f13 = i11;
        float f14 = height;
        float fMax = Math.max(f11 / f12, f13 / f14);
        float f15 = f12 * fMax;
        float f16 = fMax * f14;
        float f17 = (f11 - f15) / 2.0f;
        if (i12 == 0) {
            f10 = 0.0f;
        } else {
            f10 = i12 == 2 ? f13 - f16 : (f13 - f16) / 2.0f;
        }
        RectF rectF = new RectF(f17, f10, f15 + f17, f16 + f10);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static File r0(Bitmap bitmap, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, str}, null, changeQuickRedirect, true, bb.c.g.f33127u5, new Class[]{Bitmap.class, String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        try {
            File file2 = new File(file, ("heybox_" + String.valueOf(System.currentTimeMillis()) + lg.a.f131412e + new Random().nextInt()) + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return file2;
        } catch (Throwable th2) {
            Log.e("saveBitmap", "error: " + th2.getMessage());
            return null;
        }
    }

    public static com.bumptech.glide.load.model.h s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.f32728a5, new Class[]{String.class}, com.bumptech.glide.load.model.h.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.bumptech.glide.load.model.h) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strT = t(str);
        return (strT == null || !(strT.contains("maxjia.com") || strT.contains("max-c.com"))) ? new com.bumptech.glide.load.model.h(str, new com.bumptech.glide.load.model.k.a().b("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").c()) : new com.bumptech.glide.load.model.h(str, new com.bumptech.glide.load.model.k.a().b("Referer", "http://api.maxjia.com/").c());
    }

    public static z<File> s0(@n0 String str, Bitmap... bitmapArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bitmapArr}, null, changeQuickRedirect, true, bb.c.g.f33087s5, new Class[]{String.class, Bitmap[].class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.I2(bitmapArr).z3(new p(str));
    }

    private static String t(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.Z4, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @w0(api = 29)
    public static ContentValues u(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.g.f33007o5, new Class[]{Context.class, String.class}, ContentValues.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentValues) patchProxyResultProxy.result;
        }
        String strV = ob.a.b().v(false);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", com.max.mediaselector.lib.config.h.f75165f);
        contentValues.put("relative_path", strV + File.separator + f70378c);
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public static int v(String str) {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.f33126u4, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.a.C, 1);
            if (attributeInt == 3) {
                i10 = 180;
            } else if (attributeInt == 6) {
                i10 = 90;
            } else {
                if (attributeInt != 8) {
                    return 0;
                }
                i10 = 270;
            }
            return i10;
        } catch (IOException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String w(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.g.f32888i5, new Class[]{File.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return options.outMimeType;
    }

    public static int[] x(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.f33186x4, new Class[]{String.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static int y() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32868h5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
            int i10 = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i10, iArr);
            int[] iArr2 = new int[1];
            int i11 = 0;
            for (int i12 = 0; i12 < iArr[0]; i12++) {
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i12], bb.c.m.Yl, iArr2);
                int i13 = iArr2[0];
                if (i11 < i13) {
                    i11 = i13;
                }
            }
            egl10.eglTerminate(eGLDisplayEglGetDisplay);
            return Math.max(i11, 2048);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static com.bumptech.glide.j z(ImageView imageView) {
        com.bumptech.glide.j jVarD;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView}, null, changeQuickRedirect, true, bb.c.g.f33226z4, new Class[]{ImageView.class}, com.bumptech.glide.j.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.bumptech.glide.j) patchProxyResultProxy.result;
        }
        if (imageView == null) {
            return null;
        }
        try {
            if (imageView.getContext() instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) imageView.getContext();
                if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                    jVarD = Glide.I(fragmentActivity);
                }
                return null;
            }
            if (!(imageView.getContext() instanceof Activity)) {
                if (imageView.getContext() != null) {
                    return Glide.F(imageView.getContext());
                }
                return null;
            }
            Activity activity = (Activity) imageView.getContext();
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                jVarD = Glide.D(activity);
            }
            return null;
            return jVarD;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
