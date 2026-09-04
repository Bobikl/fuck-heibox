package com.max.hbcommon.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: RequestCaptchaTask.java */
/* JADX INFO: loaded from: classes9.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f68159b = new Handler(Looper.getMainLooper());
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f68160a;

    /* JADX INFO: compiled from: RequestCaptchaTask.java */
    public class a implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.hbcommon.network.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestCaptchaTask.java */
        public class RunnableC0549a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ IOException f68162b;

            RunnableC0549a(IOException iOException) {
                this.f68162b = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Hc, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                m.this.f68160a.a(this.f68162b);
            }
        }

        /* JADX INFO: compiled from: RequestCaptchaTask.java */
        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4232, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                m.this.f68160a.a(new Exception("response is not successful"));
            }
        }

        /* JADX INFO: compiled from: RequestCaptchaTask.java */
        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bitmap f68165b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f68166c;

            c(Bitmap bitmap, String str) {
                this.f68165b = bitmap;
                this.f68166c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Jc, new Class[0], Void.TYPE).isSupported || m.this.f68160a == null) {
                    return;
                }
                m.this.f68160a.b(this.f68165b, this.f68166c);
            }
        }

        /* JADX INFO: compiled from: RequestCaptchaTask.java */
        public class d implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Exception f68168b;

            d(Exception exc) {
                this.f68168b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Kc, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                m.this.f68160a.a(this.f68168b);
            }
        }

        a() {
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            if (PatchProxy.proxy(new Object[]{eVar, iOException}, this, changeQuickRedirect, false, bb.c.e.Fc, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            iOException.printStackTrace();
            m.f68159b.post(new RunnableC0549a(iOException));
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, c0 c0Var) throws IOException {
            try {
                try {
                    if (PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, bb.c.e.Gc, new Class[]{okhttp3.e.class, c0.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    try {
                        if (eVar.getCanceled()) {
                            try {
                                d0 d0VarQ = c0Var.q();
                                if (d0VarQ != null) {
                                    d0VarQ.close();
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        if (c0Var.c1()) {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c0Var.q().byteStream());
                            c0Var.K("Set-Cookie");
                            m.f68159b.post(new c(bitmapDecodeStream, c0Var.C("Set-Cookie")));
                            d0 d0VarQ2 = c0Var.q();
                            if (d0VarQ2 != null) {
                                d0VarQ2.close();
                            }
                            return;
                        }
                        m.f68159b.post(new b());
                        try {
                            d0 d0VarQ3 = c0Var.q();
                            if (d0VarQ3 != null) {
                                d0VarQ3.close();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        m.f68159b.post(new d(e12));
                        d0 d0VarQ4 = c0Var.q();
                        if (d0VarQ4 != null) {
                            d0VarQ4.close();
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        d0 d0VarQ5 = c0Var.q();
                        if (d0VarQ5 != null) {
                            d0VarQ5.close();
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    throw th2;
                }
            } catch (Exception e14) {
                e14.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: RequestCaptchaTask.java */
    public interface b {
        void a(Exception exc);

        void b(Bitmap bitmap, String str);
    }

    public m(b bVar) {
        this.f68160a = bVar;
    }

    public void c(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.e.Ec, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        e.c().a(new a0.a().B(str).b()).enqueue(new a());
    }
}
