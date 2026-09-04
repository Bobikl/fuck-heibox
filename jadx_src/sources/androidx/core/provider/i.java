package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.b0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.collection.j2;
import androidx.collection.z0;
import androidx.core.graphics.w0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final z0<String, Typeface> f21013a = new z0<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f21014b = k.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f21015c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("LOCK")
    static final j2<String, ArrayList<androidx.core.util.d<e>>> f21016d = new j2<>();

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public class a implements Callable<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f21018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f21019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21020e;

        a(String str, Context context, h hVar, int i10) {
            this.f21017b = str;
            this.f21018c = context;
            this.f21019d = hVar;
            this.f21020e = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return i.c(this.f21017b, this.f21018c, this.f21019d, this.f21020e);
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public class b implements androidx.core.util.d<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f21021b;

        b(androidx.core.provider.a aVar) {
            this.f21021b = aVar;
        }

        @Override // androidx.core.util.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f21021b.b(eVar);
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public class c implements Callable<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f21023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f21024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21025e;

        c(String str, Context context, h hVar, int i10) {
            this.f21022b = str;
            this.f21023c = context;
            this.f21024d = hVar;
            this.f21025e = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return i.c(this.f21022b, this.f21023c, this.f21024d, this.f21025e);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public class d implements androidx.core.util.d<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21026b;

        d(String str) {
            this.f21026b = str;
        }

        @Override // androidx.core.util.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (i.f21015c) {
                j2<String, ArrayList<androidx.core.util.d<e>>> j2Var = i.f21016d;
                ArrayList<androidx.core.util.d<e>> arrayList = j2Var.get(this.f21026b);
                if (arrayList == null) {
                    return;
                }
                j2Var.remove(this.f21026b);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f21027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f21028b;

        e(int i10) {
            this.f21027a = null;
            this.f21028b = i10;
        }

        @SuppressLint({"WrongConstant"})
        e(@n0 Typeface typeface) {
            this.f21027a = typeface;
            this.f21028b = 0;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f21028b == 0;
        }
    }

    private i() {
    }

    private static String a(@n0 h hVar, int i10) {
        return hVar.d() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i10;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(@n0 j.b bVar) {
        int i10 = 1;
        if (bVar.c() != 0) {
            return bVar.c() != 1 ? -3 : -2;
        }
        j.c[] cVarArrB = bVar.b();
        if (cVarArrB != null && cVarArrB.length != 0) {
            i10 = 0;
            for (j.c cVar : cVarArrB) {
                int iB = cVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    @n0
    static e c(@n0 String str, @n0 Context context, @n0 h hVar, int i10) {
        z0<String, Typeface> z0Var = f21013a;
        Typeface typefaceF = z0Var.f(str);
        if (typefaceF != null) {
            return new e(typefaceF);
        }
        try {
            j.b bVarE = g.e(context, hVar, null);
            int iB = b(bVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceD = w0.d(context, null, bVarE.b(), i10);
            if (typefaceD == null) {
                return new e(-3);
            }
            z0Var.j(str, typefaceD);
            return new e(typefaceD);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(@n0 Context context, @n0 h hVar, int i10, @p0 Executor executor, @n0 androidx.core.provider.a aVar) {
        String strA = a(hVar, i10);
        Typeface typefaceF = f21013a.f(strA);
        if (typefaceF != null) {
            aVar.b(new e(typefaceF));
            return typefaceF;
        }
        b bVar = new b(aVar);
        synchronized (f21015c) {
            j2<String, ArrayList<androidx.core.util.d<e>>> j2Var = f21016d;
            ArrayList<androidx.core.util.d<e>> arrayList = j2Var.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.d<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            j2Var.put(strA, arrayList2);
            c cVar = new c(strA, context, hVar, i10);
            if (executor == null) {
                executor = f21014b;
            }
            k.c(executor, cVar, new d(strA));
            return null;
        }
    }

    static Typeface e(@n0 Context context, @n0 h hVar, @n0 androidx.core.provider.a aVar, int i10, int i11) {
        String strA = a(hVar, i10);
        Typeface typefaceF = f21013a.f(strA);
        if (typefaceF != null) {
            aVar.b(new e(typefaceF));
            return typefaceF;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, hVar, i10);
            aVar.b(eVarC);
            return eVarC.f21027a;
        }
        try {
            e eVar = (e) k.d(f21014b, new a(strA, context, hVar, i10), i11);
            aVar.b(eVar);
            return eVar.f21027a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static void f() {
        f21013a.d();
    }
}
