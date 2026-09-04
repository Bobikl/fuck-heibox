package com.alipay.face.network;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: OssClientHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static d f38812d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f38813a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<b> f38814b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f38815c = new Object();

    /* JADX INFO: compiled from: OssClientHelper.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f38816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f38818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f38819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f38820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f38821g;

        a(Context context, String str, String str2, String str3, String str4, c cVar) {
            this.f38816b = context;
            this.f38817c = str;
            this.f38818d = str2;
            this.f38819e = str3;
            this.f38820f = str4;
            this.f38821g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            for (b bVar : d.this.f38814b) {
                C0298d c0298dF = d.this.f(this.f38816b, this.f38817c, this.f38818d, this.f38819e, this.f38820f, bVar.f38824b, bVar.f38825c, bVar.f38826d);
                if (!TextUtils.isEmpty(c0298dF.f38828b) || !c0298dF.f38827a) {
                    c cVar = this.f38821g;
                    if (cVar != null && !cVar.a(bVar.f38823a, bVar.f38824b, bVar.f38825c, c0298dF.f38828b)) {
                        break;
                    }
                } else {
                    i10++;
                    c cVar2 = this.f38821g;
                    if (cVar2 != null) {
                        cVar2.b(bVar.f38823a, bVar.f38824b, bVar.f38825c);
                    }
                }
            }
            c cVar3 = this.f38821g;
            if (cVar3 != null) {
                cVar3.c(d.this.f38814b.size(), i10);
            }
        }
    }

    /* JADX INFO: compiled from: OssClientHelper.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f38824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f38825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f38826d;

        b(int i10, String str, String str2, byte[] bArr) {
            this.f38823a = i10;
            this.f38824b = str;
            this.f38825c = str2;
            this.f38826d = bArr;
        }
    }

    /* JADX INFO: compiled from: OssClientHelper.java */
    public interface c {
        boolean a(int i10, String str, String str2, String str3);

        boolean b(int i10, String str, String str2);

        void c(int i10, int i11);
    }

    /* JADX INFO: renamed from: com.alipay.face.network.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OssClientHelper.java */
    public static class C0298d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f38827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f38828b;

        private C0298d() {
            this.f38827a = false;
            this.f38828b = "";
        }

        /* synthetic */ C0298d(a aVar) {
            this();
        }
    }

    public static d c() {
        return f38812d;
    }

    public void b(int i10, String str, String str2, byte[] bArr) {
        synchronized (this.f38815c) {
            this.f38814b.add(new b(i10, str, str2, bArr));
        }
    }

    public String d(int i10) {
        synchronized (this.f38815c) {
            for (b bVar : this.f38814b) {
                if (bVar.f38823a == i10) {
                    return bVar.f38825c;
                }
            }
            return "";
        }
    }

    public void e() {
        synchronized (this.f38815c) {
            this.f38814b = new ArrayList<>();
        }
    }

    public C0298d f(Context context, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        return new C0298d(null);
    }

    public void g() {
        e();
    }

    public void h(Context context, String str, String str2, String str3, String str4, c cVar) {
        synchronized (this.f38815c) {
            this.f38813a.execute(new a(context, str, str2, str3, str4, cVar));
        }
    }
}
