package com.max.mediaselector.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import android.widget.ImageView;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: ImageLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f75683j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Executor f75684k = Executors.newFixedThreadPool(10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static c f75685l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LruCache<String, Bitmap> f75686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedList<e> f75687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Semaphore f75688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f75689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Thread f75690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f75691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Semaphore f75692g = new Semaphore(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f75693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap f75694i;

    /* JADX INFO: compiled from: ImageLoader.java */
    public class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, bb.c.m.Ab, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f fVar = (f) message.obj;
            String str = fVar.f75707c;
            ImageView imageView = fVar.f75706b;
            Bitmap bitmap = fVar.f75705a;
            if (imageView == null || bitmap == null || TextUtils.isEmpty(str) || !str.equals(imageView.getTag().toString())) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: ImageLoader.java */
    public class b extends Thread {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ImageLoader.java */
        public class a extends Handler {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, bb.c.m.Cb, new Class[]{Message.class}, Void.TYPE).isSupported) {
                    return;
                }
                try {
                    c.this.f75688c.acquire();
                } catch (InterruptedException unused) {
                }
                e eVarE = c.e(c.this);
                if (eVarE != null) {
                    eVarE.executeOnExecutor(c.f75684k, Integer.valueOf(c.this.f75693h), Integer.valueOf(c.this.f75693h));
                }
            }
        }

        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Bb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Looper.prepare();
            c.this.f75691f = new a();
            c.this.f75692g.release();
            Looper.loop();
        }
    }

    /* JADX INFO: renamed from: com.max.mediaselector.utils.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageLoader.java */
    public class C0611c extends LruCache<String, Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0611c(int i10) {
            super(i10);
        }

        public int a(String str, Bitmap bitmap) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bitmap}, this, changeQuickRedirect, false, bb.c.m.Db, new Class[]{String.class, Bitmap.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getRowBytes() * bitmap.getHeight();
        }

        @Override // android.util.LruCache
        public /* bridge */ /* synthetic */ int sizeOf(String str, Bitmap bitmap) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bitmap}, this, changeQuickRedirect, false, bb.c.m.Eb, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(str, bitmap);
        }
    }

    /* JADX INFO: compiled from: ImageLoader.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f75699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f75700c;

        d(String str, ImageView imageView) {
            this.f75699b = str;
            this.f75700c = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Fb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            f fVar = new f(c.this, null);
            try {
                mediaMetadataRetriever.setDataSource(this.f75699b);
                fVar.f75705a = mediaMetadataRetriever.getFrameAtTime();
            } catch (Exception unused) {
                fVar.f75705a = c.this.f75694i;
            }
            fVar.f75706b = this.f75700c;
            fVar.f75707c = this.f75699b;
            Message messageObtain = Message.obtain();
            messageObtain.obj = fVar;
            c.this.f75689d.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: ImageLoader.java */
    public class e extends AsyncTask<Integer, Object, Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f75702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<ImageView> f75703b;

        public e(String str, ImageView imageView) {
            if (imageView == null || str == null) {
                throw new IllegalArgumentException("args may not be null");
            }
            this.f75702a = str;
            this.f75703b = new WeakReference<>(imageView);
        }

        public Bitmap a(Integer... numArr) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{numArr}, this, changeQuickRedirect, false, bb.c.m.Gb, new Class[]{Integer[].class}, Bitmap.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bitmap) patchProxyResultProxy.result;
            }
            c.c(c.this, this.f75702a, c.k(c.this, this.f75702a, numArr[0].intValue(), numArr[1].intValue()));
            Bitmap bitmapD = c.d(c.this, this.f75702a);
            c.this.f75688c.release();
            return bitmapD;
        }

        public void b(Bitmap bitmap) {
        }

        public void c(Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.m.Hb, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            f fVar = new f(c.this, null);
            fVar.f75705a = bitmap;
            fVar.f75706b = this.f75703b.get();
            fVar.f75707c = this.f75702a;
            Message messageObtain = Message.obtain();
            messageObtain.obj = fVar;
            c.this.f75689d.sendMessage(messageObtain);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [android.graphics.Bitmap, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Bitmap doInBackground(Integer[] numArr) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{numArr}, this, changeQuickRedirect, false, bb.c.m.Kb, new Class[]{Object[].class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(numArr);
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.m.Ib, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bitmap);
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.m.Jb, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            c(bitmap);
        }
    }

    /* JADX INFO: compiled from: ImageLoader.java */
    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Bitmap f75705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f75706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f75707c;

        private f() {
        }

        /* synthetic */ f(c cVar, a aVar) {
            this();
        }
    }

    private c() {
        w();
    }

    static /* synthetic */ void c(c cVar, String str, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{cVar, str, bitmap}, null, changeQuickRedirect, true, bb.c.m.f35153yb, new Class[]{c.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.l(str, bitmap);
    }

    static /* synthetic */ Bitmap d(c cVar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, str}, null, changeQuickRedirect, true, bb.c.m.f35175zb, new Class[]{c.class, String.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : cVar.t(str);
    }

    static /* synthetic */ e e(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.m.f35109wb, new Class[]{c.class}, e.class);
        return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : cVar.v();
    }

    static /* synthetic */ Bitmap k(c cVar, String str, int i10, int i11) {
        Object[] objArr = {cVar, str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f35131xb, new Class[]{c.class, String.class, cls, cls}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : cVar.p(str, i10, i11);
    }

    private void l(String str, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{str, bitmap}, this, changeQuickRedirect, false, bb.c.m.f35021sb, new Class[]{String.class, Bitmap.class}, Void.TYPE).isSupported || TextUtils.isEmpty(str) || bitmap == null) {
            return;
        }
        this.f75686a.put(str, bitmap);
    }

    private synchronized void m(e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.m.f34954pb, new Class[]{e.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (this.f75691f == null) {
                this.f75692g.acquire();
            }
        } catch (InterruptedException unused) {
        }
        this.f75687b.add(eVar);
        this.f75691f.sendEmptyMessage(0);
    }

    private int n(BitmapFactory.Options options, int i10, int i11) {
        Object[] objArr = {options, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f35065ub, new Class[]{BitmapFactory.Options.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        if (i12 > i10 || i13 > i11) {
            return Math.max(Math.round((i12 * 1.0f) / i10), Math.round((i13 * 1.0f) / i11));
        }
        return 1;
    }

    private Bitmap p(String str, int i10, int i11) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f35087vb, new Class[]{String.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = n(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    private Bitmap t(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.f34999rb, new Class[]{String.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : this.f75686a.get(str);
    }

    public static synchronized c u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34816jb, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (f75685l == null) {
            f75685l = new c();
        }
        return f75685l;
    }

    private synchronized e v() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34977qb, new Class[0], e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        return this.f75687b.removeLast();
    }

    private void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34839kb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x();
        this.f75689d = new a();
        b bVar = new b();
        this.f75690e = bVar;
        bVar.start();
        this.f75687b = new LinkedList<>();
        this.f75688c = new Semaphore(10);
        Context contextA = com.max.mediaselector.utils.b.a();
        if (contextA != null) {
            this.f75694i = BitmapFactory.decodeResource(contextA.getResources(), R.drawable.ic_thumb_fail);
        }
    }

    public void o() {
        LruCache<String, Bitmap> lruCache;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35043tb, new Class[0], Void.TYPE).isSupported || (lruCache = this.f75686a) == null) {
            return;
        }
        lruCache.evictAll();
    }

    public void q(String str, ImageView imageView, int i10, int i11) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f34885mb, new Class[]{String.class, ImageView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(str) || imageView == null) {
            throw new IllegalArgumentException("args may not be null");
        }
        this.f75693h = i10;
        imageView.setTag(str);
        Bitmap bitmapT = t(str);
        if (bitmapT == null) {
            m(new e(str, imageView));
            return;
        }
        f fVar = new f(this, null);
        fVar.f75705a = bitmapT;
        fVar.f75706b = imageView;
        fVar.f75707c = str;
        Message messageObtain = Message.obtain();
        messageObtain.obj = fVar;
        this.f75689d.sendMessage(messageObtain);
    }

    public void r(String str, ImageView imageView, int i10, int i11) {
        Object[] objArr = {str, imageView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f34931ob, new Class[]{String.class, ImageView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(str) || imageView == null) {
            throw new IllegalArgumentException("args may not be null");
        }
        this.f75693h = i10;
        imageView.setTag(str);
        Bitmap bitmapT = t(str);
        if (bitmapT == null) {
            Executors.newSingleThreadExecutor().execute(new d(str, imageView));
        }
        f fVar = new f(this, null);
        fVar.f75705a = bitmapT;
        fVar.f75706b = imageView;
        fVar.f75707c = str;
        Message messageObtain = Message.obtain();
        messageObtain.obj = fVar;
        this.f75689d.sendMessage(messageObtain);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public String s(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.f34908nb, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("args may not be null");
        }
        Bitmap bitmapT = t(str);
        if (bitmapT == null) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                bitmapT = mediaMetadataRetriever.getFrameAtTime();
            } catch (Exception unused) {
                bitmapT = this.f75694i;
            }
        }
        String strEncodeToString = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        bitmapT.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.flush();
                            byteArrayOutputStream.close();
                        }
                        return strEncodeToString;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.flush();
                            byteArrayOutputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        } catch (IOException e13) {
            e = e13;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th2 = th4;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            }
            throw th2;
        }
        return strEncodeToString;
    }

    public void x() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34862lb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f75686a != null) {
            try {
                o();
            } catch (Throwable unused) {
            }
        }
        this.f75686a = new C0611c(((int) Runtime.getRuntime().maxMemory()) / 8);
    }
}
