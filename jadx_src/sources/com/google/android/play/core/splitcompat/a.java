package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.w0;
import androidx.compose.animation.core.s0;
import com.google.android.play.core.splitinstall.e1;
import com.google.android.play.core.splitinstall.f1;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.k1;
import com.google.android.play.core.splitinstall.n0;
import com.google.android.play.core.splitinstall.zzo;
import com.meituan.robust.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference f56191e = new AtomicReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f56192f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f56193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f56194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("emulatedSplits")
    private final Set f56195c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f56196d;

    private a(Context context) {
        try {
            f fVar = new f(context);
            this.f56193a = fVar;
            this.f56196d = new b(fVar);
            this.f56194b = new n0(context);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new zzbh("Failed to initialize FileStorage", e10);
        }
    }

    public static boolean a(@androidx.annotation.n0 Context context) {
        return k(context, false);
    }

    public static boolean b(@androidx.annotation.n0 Context context) {
        if (l()) {
            return false;
        }
        a aVar = (a) f56191e.get();
        if (aVar != null) {
            return aVar.f56196d.b(context, aVar.h());
        }
        if (context.getApplicationContext() != null) {
            a(context.getApplicationContext());
        }
        return a(context);
    }

    public static boolean f(Context context) {
        return k(context, true);
    }

    public static boolean g() {
        return f56191e.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set h() {
        HashSet hashSet;
        synchronized (this.f56195c) {
            hashSet = new HashSet(this.f56195c);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.l(this.f56193a.g((String) it.next()));
        }
        this.f56194b.b();
    }

    @w0(21)
    private final synchronized void j(Context context, boolean z10) throws IOException {
        ZipFile zipFile;
        if (z10) {
            this.f56193a.k();
        } else {
            e.a().execute(new r(this));
        }
        String packageName = context.getPackageName();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
            List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
            Set<u> setJ = this.f56193a.j();
            Set setA = this.f56194b.a();
            HashSet hashSet = new HashSet();
            Iterator it = setJ.iterator();
            while (it.hasNext()) {
                String strB = ((u) it.next()).b();
                if (arrayList.contains(strB) || setA.contains(f1.b(strB))) {
                    hashSet.add(strB);
                    it.remove();
                }
            }
            if (z10) {
                i(hashSet);
            } else if (!hashSet.isEmpty()) {
                e.a().execute(new s(this, hashSet));
            }
            HashSet hashSet2 = new HashSet();
            Iterator it2 = setJ.iterator();
            while (it2.hasNext()) {
                String strB2 = ((u) it2.next()).b();
                if (!f1.e(strB2)) {
                    hashSet2.add(strB2);
                }
            }
            for (String str : arrayList) {
                if (!f1.e(str)) {
                    hashSet2.add(str);
                }
            }
            HashSet<u> hashSet3 = new HashSet(setJ.size());
            for (u uVar : setJ) {
                String strB3 = uVar.b();
                int i10 = f1.f56237d;
                if (strB3.startsWith("config.") || hashSet2.contains(f1.b(uVar.b()))) {
                    hashSet3.add(uVar);
                }
            }
            o oVar = new o(this.f56193a);
            com.google.android.play.core.splitinstall.internal.n nVarA = com.google.android.play.core.splitinstall.internal.o.a();
            ClassLoader classLoader = context.getClassLoader();
            if (z10) {
                nVarA.a(classLoader, oVar.c());
            } else {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    Set setB = oVar.b((u) it3.next());
                    if (setB == null) {
                        it3.remove();
                    } else {
                        nVarA.a(classLoader, setB);
                    }
                }
            }
            HashSet hashSet4 = new HashSet();
            for (u uVar2 : hashSet3) {
                try {
                    zipFile = new ZipFile(uVar2.a());
                    try {
                        ZipEntry entry = zipFile.getEntry(Constants.CLASSES_DEX_NAME);
                        zipFile.close();
                        if (entry == null || nVarA.b(classLoader, this.f56193a.a(uVar2.b()), uVar2.a(), z10)) {
                            hashSet4.add(uVar2.a());
                        } else {
                            Log.w("SplitCompat", "split was not installed ".concat(uVar2.a().toString()));
                        }
                    } catch (IOException e10) {
                        e = e10;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException e11) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e11);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        throw e;
                    }
                } catch (IOException e12) {
                    e = e12;
                    zipFile = null;
                }
            }
            this.f56196d.a(context, hashSet4);
            HashSet hashSet5 = new HashSet();
            for (u uVar3 : hashSet3) {
                if (hashSet4.contains(uVar3.a())) {
                    Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation emulated");
                    hashSet5.add(uVar3.b());
                } else {
                    Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation not emulated.");
                }
            }
            synchronized (this.f56195c) {
                this.f56195c.addAll(hashSet5);
            }
        } catch (PackageManager.NameNotFoundException e13) {
            throw new IOException(String.format("Cannot load data for application '%s'", packageName), e13);
        }
    }

    private static boolean k(final Context context, boolean z10) {
        boolean z11;
        if (l()) {
            return false;
        }
        AtomicReference atomicReference = f56191e;
        a aVar = new a(context);
        while (true) {
            if (s0.a(atomicReference, null, aVar)) {
                z11 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z11 = false;
                break;
            }
        }
        a aVar2 = (a) f56191e.get();
        if (z11) {
            zzo.INSTANCE.zzb(new com.google.android.play.core.splitinstall.internal.k(context, e.a(), new com.google.android.play.core.splitinstall.internal.m(context, aVar2.f56193a, new com.google.android.play.core.splitinstall.internal.h()), aVar2.f56193a, new t()));
            e1.b(new q(aVar2));
            e.a().execute(new Runnable() { // from class: com.google.android.play.core.splitcompat.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    int i10 = a.f56192f;
                    try {
                        k1.h(context2).c(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        }
        try {
            aVar2.j(context, z10);
            return true;
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error installing additional splits", e10);
            return false;
        }
    }

    private static boolean l() {
        return false;
    }
}
