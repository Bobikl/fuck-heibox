package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.p0;
import androidx.compose.animation.core.s0;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.f1;
import com.google.android.play.core.splitinstall.internal.o1;
import com.google.android.play.core.splitinstall.internal.r0;
import com.google.android.play.core.splitinstall.internal.v0;
import com.google.android.play.core.splitinstall.internal.w0;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.u0;
import com.google.android.play.core.splitinstall.y0;
import com.google.android.play.core.splitinstall.zzo;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class a implements com.google.android.play.core.splitinstall.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f56387p = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f56388q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f56389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f56390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f1 f56391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f56392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f56393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o1 f56394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o1 f56395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f56396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u0 f56397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final File f56398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicReference f56399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f56400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f56401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f56402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m f56403o;

    @Deprecated
    public a(Context context, File file) {
        this(context, file, new f1(context, context.getPackageName()), new w0() { // from class: com.google.android.play.core.splitinstall.testing.h
            @Override // com.google.android.play.core.splitinstall.internal.w0
            public final Object zza() {
                int i10 = a.f56388q;
                return y.f56457a;
            }
        });
    }

    a(Context context, @p0 File file, f1 f1Var, w0 w0Var) {
        Executor executorA = com.google.android.play.core.splitcompat.e.a();
        r0 r0Var = new r0(context);
        m mVar = new Object() { // from class: com.google.android.play.core.splitinstall.testing.m
        };
        this.f56389a = new Handler(Looper.getMainLooper());
        this.f56399k = new AtomicReference();
        this.f56400l = Collections.synchronizedSet(new HashSet());
        this.f56401m = Collections.synchronizedSet(new HashSet());
        this.f56402n = new AtomicBoolean(false);
        this.f56390b = context;
        this.f56398j = file;
        this.f56391c = f1Var;
        this.f56392d = w0Var;
        this.f56396h = executorA;
        this.f56393e = r0Var;
        this.f56403o = mVar;
        this.f56395g = new o1();
        this.f56394f = new o1();
        this.f56397i = zzo.INSTANCE;
    }

    private final com.google.android.gms.tasks.k A(@l9.a final int i10) {
        D(new u() { // from class: com.google.android.play.core.splitinstall.testing.s
            @Override // com.google.android.play.core.splitinstall.testing.u
            public final com.google.android.play.core.splitinstall.f a(com.google.android.play.core.splitinstall.f fVar) {
                int i11 = i10;
                int i12 = a.f56388q;
                if (fVar == null) {
                    return null;
                }
                return com.google.android.play.core.splitinstall.f.b(fVar.h(), 6, i11, fVar.a(), fVar.j(), fVar.f(), fVar.e());
            }
        });
        return com.google.android.gms.tasks.n.f(new SplitInstallException(i10));
    }

    private final y0 B() {
        try {
            y0 y0VarA = this.f56391c.a(this.f56390b.getPackageManager().getPackageInfo(this.f56390b.getPackageName(), 128).applicationInfo.metaData);
            if (y0VarA != null) {
                return y0VarA;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalStateException("App is not found in PackageManager", e10);
        }
    }

    @p0
    private final com.google.android.play.core.splitinstall.f C() {
        return (com.google.android.play.core.splitinstall.f) this.f56399k.get();
    }

    @p0
    private final synchronized com.google.android.play.core.splitinstall.f D(u uVar) {
        com.google.android.play.core.splitinstall.f fVarC = C();
        com.google.android.play.core.splitinstall.f fVarA = uVar.a(fVarC);
        AtomicReference atomicReference = this.f56399k;
        while (!s0.a(atomicReference, fVarC, fVarA)) {
            if (atomicReference.get() != fVarC) {
                return null;
            }
        }
        return fVarA;
    }

    private static String E(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(List list, List list2, List list3, long j10, boolean z10) {
        this.f56397i.zza().a(list, new t(this, list2, list3, j10, z10, list));
    }

    private final void G(final com.google.android.play.core.splitinstall.f fVar) {
        this.f56389a.post(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f56420b.w(fVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(List list, List list2, long j10) {
        this.f56400l.addAll(list);
        this.f56401m.addAll(list2);
        Long lValueOf = Long.valueOf(j10);
        I(5, 0, lValueOf, lValueOf, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I(final int i10, final int i11, @p0 final Long l10, @p0 final Long l11, @p0 final List list, @p0 final Integer num, @p0 final List list2) {
        com.google.android.play.core.splitinstall.f fVarD = D(new u() { // from class: com.google.android.play.core.splitinstall.testing.j
            @Override // com.google.android.play.core.splitinstall.testing.u
            public final com.google.android.play.core.splitinstall.f a(com.google.android.play.core.splitinstall.f fVar) {
                Integer num2 = num;
                int i12 = i10;
                int i13 = i11;
                Long l12 = l10;
                Long l13 = l11;
                List<String> list3 = list;
                List<String> list4 = list2;
                int i14 = a.f56388q;
                com.google.android.play.core.splitinstall.f fVarB = fVar == null ? com.google.android.play.core.splitinstall.f.b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : fVar;
                return com.google.android.play.core.splitinstall.f.b(num2 == null ? fVarB.h() : num2.intValue(), i12, i13, l12 == null ? fVarB.a() : l12.longValue(), l13 == null ? fVarB.j() : l13.longValue(), list3 == null ? fVarB.f() : list3, list4 == null ? fVarB.e() : list4);
            }
        });
        if (fVarD == null) {
            return false;
        }
        G(fVarD);
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> a(List<Locale> list) {
        return com.google.android.gms.tasks.n.f(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Integer> b(final com.google.android.play.core.splitinstall.e eVar) {
        Integer numA;
        int i10;
        File[] fileArr;
        try {
            com.google.android.play.core.splitinstall.f fVarD = D(new u() { // from class: com.google.android.play.core.splitinstall.testing.n
                @Override // com.google.android.play.core.splitinstall.testing.u
                public final com.google.android.play.core.splitinstall.f a(final com.google.android.play.core.splitinstall.f fVar) {
                    final com.google.android.play.core.splitinstall.e eVar2 = eVar;
                    return (com.google.android.play.core.splitinstall.f) zzbx.c(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.q
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SplitInstallException {
                            com.google.android.play.core.splitinstall.f fVar2 = fVar;
                            com.google.android.play.core.splitinstall.e eVar3 = eVar2;
                            int i11 = a.f56388q;
                            if (fVar2 == null || fVar2.d()) {
                                return com.google.android.play.core.splitinstall.f.b(fVar2 != null ? 1 + fVar2.h() : 1, 1, 0, 0L, 0L, eVar3.b(), new ArrayList());
                            }
                            throw new SplitInstallException(-1);
                        }
                    });
                }
            });
            if (fVarD == null) {
                return A(-100);
            }
            int iH = fVarD.h();
            final ArrayList arrayList = new ArrayList();
            Iterator<Locale> it = eVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] fileArrListFiles = this.f56398j.listFiles(new FileFilter() { // from class: com.google.android.play.core.splitinstall.testing.o
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i11 = a.f56388q;
                    return file.getName().endsWith(".apk");
                }
            });
            if (fileArrListFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return A(-5);
            }
            int i11 = 0;
            long length = 0;
            while (i11 < fileArrListFiles.length) {
                File file = fileArrListFiles[i11];
                String strA = v0.a(file);
                String strE = E(strA);
                hashSet.add(strA);
                if (eVar.b().contains(strE)) {
                    String strE2 = E(strA);
                    HashSet hashSet2 = new HashSet(this.f56393e.a());
                    Map mapA = B().a(Arrays.asList(strE2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = mapA.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                        fileArrListFiles = fileArrListFiles;
                    }
                    fileArr = fileArrListFiles;
                    HashSet hashSet4 = new HashSet();
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        Iterator it4 = it3;
                        if (str.contains(lg.a.f131412e)) {
                            str = str.split(lg.a.f131412e, -1)[0];
                        }
                        hashSet4.add(str);
                        it3 = it4;
                        iH = iH;
                    }
                    i10 = iH;
                    hashSet4.addAll(this.f56401m);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : mapA.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strA) || hashSet5.contains(strA)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                    }
                    i11++;
                    fileArrListFiles = fileArr;
                    iH = i10;
                } else {
                    i10 = iH;
                    fileArr = fileArrListFiles;
                }
                List<Locale> listA = eVar.a();
                ArrayList arrayList3 = new ArrayList(this.f56400l);
                arrayList3.addAll(Arrays.asList("", com.google.android.exoplayer2.text.ttml.d.X));
                Map mapA2 = B().a(arrayList3);
                for (Locale locale : listA) {
                    if (mapA2.containsKey(locale.getLanguage()) && ((Set) mapA2.get(locale.getLanguage())).contains(strA)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                        break;
                    }
                }
                i11++;
                fileArrListFiles = fileArr;
                iH = i10;
            }
            int i12 = iH;
            Log.i("FakeSplitInstallManager", "availableSplits " + hashSet.toString() + " want " + String.valueOf(eVar.b()));
            if (eVar.b().size() != 1 || (numA = (Integer) ((y) this.f56392d.zza()).b().get(eVar.b().get(0))) == null) {
                numA = ((y) this.f56392d.zza()).a();
            }
            if (numA != null) {
                return A(numA.intValue());
            }
            if (!hashSet.containsAll(new HashSet(eVar.b()))) {
                return A(-2);
            }
            Long lValueOf = Long.valueOf(length);
            List<String> listB = eVar.b();
            Integer numValueOf = Integer.valueOf(i12);
            I(1, 0, 0L, lValueOf, listB, numValueOf, arrayList);
            this.f56396h.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56438b.y(arrayList2, arrayList);
                }
            });
            return com.google.android.gms.tasks.n.g(numValueOf);
        } catch (zzbx e10) {
            return A(((SplitInstallException) e10.b(SplitInstallException.class)).d());
        }
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> c(List<String> list) {
        return com.google.android.gms.tasks.n.f(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean d(com.google.android.play.core.splitinstall.f fVar, androidx.activity.result.g<IntentSenderRequest> gVar) {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final void e(com.google.android.play.core.splitinstall.g gVar) {
        this.f56394f.a(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> f(List<String> list) {
        return com.google.android.gms.tasks.n.f(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final void g(com.google.android.play.core.splitinstall.g gVar) {
        this.f56394f.b(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final void h(com.google.android.play.core.splitinstall.g gVar) {
        this.f56395g.b(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final void i(com.google.android.play.core.splitinstall.g gVar) {
        this.f56395g.a(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final Set<String> j() {
        HashSet hashSet = new HashSet();
        if (this.f56391c.d() != null) {
            hashSet.addAll(this.f56391c.d());
        }
        hashSet.addAll(this.f56401m);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean k(com.google.android.play.core.splitinstall.f fVar, Activity activity, int i10) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> l(List<Locale> list) {
        return com.google.android.gms.tasks.n.f(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Void> m(final int i10) {
        try {
            com.google.android.play.core.splitinstall.f fVarD = D(new u() { // from class: com.google.android.play.core.splitinstall.testing.k
                @Override // com.google.android.play.core.splitinstall.testing.u
                public final com.google.android.play.core.splitinstall.f a(final com.google.android.play.core.splitinstall.f fVar) {
                    final int i11 = i10;
                    return (com.google.android.play.core.splitinstall.f) zzbx.c(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.r
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SplitInstallException {
                            int i12;
                            com.google.android.play.core.splitinstall.f fVar2 = fVar;
                            int i13 = i11;
                            int i14 = a.f56388q;
                            if (fVar2 != null && i13 == fVar2.h() && ((i12 = fVar2.i()) == 1 || i12 == 2 || i12 == 8 || i12 == 9 || i12 == 7)) {
                                return com.google.android.play.core.splitinstall.f.b(i13, 7, fVar2.c(), fVar2.a(), fVar2.j(), fVar2.f(), fVar2.e());
                            }
                            throw new SplitInstallException(-3);
                        }
                    });
                }
            });
            if (fVarD != null) {
                G(fVarD);
            }
            return com.google.android.gms.tasks.n.g(null);
        } catch (zzbx e10) {
            return com.google.android.gms.tasks.n.f(e10.b(SplitInstallException.class));
        }
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<List<com.google.android.play.core.splitinstall.f>> n() {
        com.google.android.play.core.splitinstall.f fVarC = C();
        return com.google.android.gms.tasks.n.g(fVarC != null ? Collections.singletonList(fVarC) : Collections.emptyList());
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean o(com.google.android.play.core.splitinstall.f fVar, com.google.android.play.core.common.a aVar, int i10) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<com.google.android.play.core.splitinstall.f> p(int i10) {
        com.google.android.play.core.splitinstall.f fVarC = C();
        return (fVarC == null || fVarC.h() != i10) ? com.google.android.gms.tasks.n.f(new SplitInstallException(-4)) : com.google.android.gms.tasks.n.g(fVarC);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final Set<String> q() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f56391c.c());
        hashSet.addAll(this.f56400l);
        return hashSet;
    }

    public void r(boolean z10) {
        this.f56402n.set(z10);
    }

    final File s() {
        return this.f56398j;
    }

    final /* synthetic */ void v(final long j10, final List list, final List list2, final List list3) {
        long jMin = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            jMin = Math.min(j10, jMin + (j10 / 3));
            I(2, 0, Long.valueOf(jMin), Long.valueOf(j10), null, null, null);
            SystemClock.sleep(f56387p);
            com.google.android.play.core.splitinstall.f fVarC = C();
            if (fVarC.i() == 9 || fVarC.i() == 7 || fVarC.i() == 6) {
                return;
            }
        }
        this.f56396h.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f56414b.x(list, list2, list3, j10);
            }
        });
    }

    final /* synthetic */ void w(com.google.android.play.core.splitinstall.f fVar) {
        this.f56394f.c(fVar);
        this.f56395g.c(fVar);
    }

    final /* synthetic */ void x(List list, List list2, List list3, long j10) {
        if (this.f56402n.get()) {
            I(6, -6, null, null, null, null, null);
        } else if (this.f56397i.zza() != null) {
            F(list, list2, list3, j10, false);
        } else {
            H(list2, list3, j10);
        }
    }

    final /* synthetic */ void y(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String strA = v0.a(file);
            Uri uriFromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, this.f56390b.getContentResolver().getType(uriFromFile));
            intent.addFlags(1);
            intent.putExtra(com.huawei.hms.feature.dynamic.b.f60688j, E(strA));
            intent.putExtra("split_id", strA);
            arrayList.add(intent);
            arrayList2.add(E(v0.a(file)));
        }
        com.google.android.play.core.splitinstall.f fVarC = C();
        if (fVarC == null) {
            return;
        }
        final long j10 = fVarC.j();
        this.f56396h.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f56430b.v(j10, arrayList, arrayList2, list2);
            }
        });
    }
}
