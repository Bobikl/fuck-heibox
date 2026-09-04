package com.max.hbcommon.analytics;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.MediaStore;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ao;

/* JADX INFO: compiled from: ScreenshotManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class n {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f66578g = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f66579h = {".pending"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f66580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f66581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f66582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentObserver f66583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f66584e = 500;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f66585f = false;

    /* JADX INFO: compiled from: ScreenshotManager.java */
    public interface a {
        void a(long j10, String str, String str2);
    }

    /* JADX INFO: compiled from: ScreenshotManager.java */
    public class b extends ContentObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f66586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f66587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f66588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ContentResolver f66589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f66590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f66591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f66592g;

        /* JADX INFO: compiled from: ScreenshotManager.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f66594b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f66595c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f66596d;

            a(long j10, String str, String str2) {
                this.f66594b = j10;
                this.f66595c = str;
                this.f66596d = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Xt, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                b.a(b.this, this.f66594b, this.f66595c, this.f66596d);
            }
        }

        public b(Handler handler, ContentResolver contentResolver, a aVar) {
            super(handler);
            this.f66586a = new String[]{ao.f104522d, "_display_name", "_data"};
            this.f66587b = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
            this.f66588c = "screenshot";
            this.f66591f = null;
            this.f66592g = -1L;
            this.f66589d = contentResolver;
            this.f66590e = aVar;
        }

        static /* synthetic */ void a(b bVar, long j10, String str, String str2) {
            if (PatchProxy.proxy(new Object[]{bVar, new Long(j10), str, str2}, null, changeQuickRedirect, true, bb.c.b.Wt, new Class[]{b.class, Long.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            bVar.g(j10, str, str2);
        }

        private void b(Uri uri) {
            if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.b.Rt, new Class[]{Uri.class}, Void.TYPE).isSupported) {
                return;
            }
            Cursor cursorQuery = null;
            try {
                com.max.heybox.hblog.g.G("ScreenshotManager handleItem start");
                cursorQuery = this.f66589d.query(uri, this.f66586a, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex(ao.f104522d));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                    if (d(string2) && c(string)) {
                        new Handler(Looper.getMainLooper()).post(new a(j10, string, string2));
                    }
                }
                if (cursorQuery == null) {
                }
            } catch (Throwable th2) {
                try {
                    com.max.heybox.hblog.g.G("ScreenshotManager handleItem error: " + th2.getMessage());
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
        }

        private boolean c(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Tt, new Class[]{String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (str == null) {
                return false;
            }
            return str.toLowerCase().startsWith("screenshot");
        }

        private boolean d(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Ut, new Class[]{String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (str == null) {
                return false;
            }
            for (String str2 : n.f66578g) {
                if (str.toLowerCase().contains(str2)) {
                    return true;
                }
            }
            return false;
        }

        private boolean e(Uri uri) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.b.Qt, new Class[]{Uri.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return uri.toString().matches(this.f66587b + "/[0-9]+");
        }

        private boolean f(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Vt, new Class[]{String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (str == null) {
                return true;
            }
            for (String str2 : n.f66579h) {
                if (str.toLowerCase().contains(str2)) {
                    return true;
                }
            }
            return false;
        }

        private synchronized void g(long j10, String str, String str2) {
            String str3;
            if (PatchProxy.proxy(new Object[]{new Long(j10), str, str2}, this, changeQuickRedirect, false, bb.c.b.St, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.x("ScreenShotManager  id:" + j10 + "  path: " + str2 + "  lastScreenTime: " + this.f66592g + "  scape: " + (System.currentTimeMillis() - this.f66592g));
            if (!f(str2) && (((str3 = this.f66591f) == null || !str3.equals(str2)) && (this.f66592g == -1 || System.currentTimeMillis() - this.f66592g > 500))) {
                this.f66591f = str2;
                this.f66592g = System.currentTimeMillis();
                AccelWorldFileKt.a(this.f66590e, j10, str, str2);
            }
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Nt, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : super.deliverSelfNotifications();
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Ot, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onChange(z10);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), uri}, this, changeQuickRedirect, false, bb.c.b.Pt, new Class[]{Boolean.TYPE, Uri.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onChange(z10, uri);
            if (e(uri)) {
                b(uri);
            }
        }
    }

    public n(ContentResolver contentResolver, a aVar) {
        HandlerThread handlerThread = new HandlerThread("ScreenshotManager");
        this.f66580a = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f66581b = handler;
        this.f66582c = contentResolver;
        this.f66583d = new b(handler, contentResolver, aVar);
        c();
    }

    public synchronized void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Lt, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f66585f) {
            this.f66585f = true;
            try {
                this.f66582c.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f66583d);
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.G("ScreenshotManager register error: " + th2.getMessage());
            }
        }
    }

    public synchronized void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Mt, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f66585f) {
            this.f66585f = false;
            try {
                this.f66582c.unregisterContentObserver(this.f66583d);
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.G("ScreenshotManager unregister error: " + th2.getMessage());
            }
        }
    }
}
