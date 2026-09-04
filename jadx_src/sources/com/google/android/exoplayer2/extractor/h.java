package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import androidx.annotation.p0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f45002n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final a f45003o = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45012j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f45014l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f45013k = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f45015m = com.google.android.exoplayer2.extractor.ts.h0.B;

    /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f45016a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.b0("extensionLoaded")
        @p0
        private Constructor<? extends k> f45017b;

        @p0
        private Constructor<? extends k> b() {
            synchronized (this.f45016a) {
                if (this.f45016a.get()) {
                    return this.f45017b;
                }
                try {
                    if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                        this.f45017b = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FLAC extension", e10);
                }
                this.f45016a.set(true);
                return this.f45017b;
            }
        }

        @p0
        public k a(int i10) {
            Constructor<? extends k> constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(Integer.valueOf(i10));
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        }
    }

    private void c(int i10, List<k> list) {
        switch (i10) {
            case 0:
                list.add(new com.google.android.exoplayer2.extractor.ts.b());
                break;
            case 1:
                list.add(new com.google.android.exoplayer2.extractor.ts.e());
                break;
            case 2:
                list.add(new com.google.android.exoplayer2.extractor.ts.h((this.f45005c ? 2 : 0) | ((this.f45006d | (this.f45004b ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new com.google.android.exoplayer2.extractor.amr.b((this.f45005c ? 2 : 0) | this.f45007e | (this.f45004b ? 1 : 0)));
                break;
            case 4:
                k kVarA = f45003o.a(this.f45008f);
                if (kVarA == null) {
                    list.add(new com.google.android.exoplayer2.extractor.flac.e(this.f45008f));
                } else {
                    list.add(kVarA);
                }
                break;
            case 5:
                list.add(new com.google.android.exoplayer2.extractor.flv.c());
                break;
            case 6:
                list.add(new com.google.android.exoplayer2.extractor.mkv.e(this.f45009g));
                break;
            case 7:
                list.add(new com.google.android.exoplayer2.extractor.mp3.f((this.f45005c ? 2 : 0) | this.f45012j | (this.f45004b ? 1 : 0)));
                break;
            case 8:
                list.add(new com.google.android.exoplayer2.extractor.mp4.g(this.f45011i));
                list.add(new com.google.android.exoplayer2.extractor.mp4.k(this.f45010h));
                break;
            case 9:
                list.add(new com.google.android.exoplayer2.extractor.ogg.d());
                break;
            case 10:
                list.add(new com.google.android.exoplayer2.extractor.ts.a0());
                break;
            case 11:
                list.add(new com.google.android.exoplayer2.extractor.ts.h0(this.f45013k, this.f45014l, this.f45015m));
                break;
            case 12:
                list.add(new q8.b());
                break;
            case 14:
                list.add(new com.google.android.exoplayer2.extractor.jpeg.a());
                break;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.q
    public synchronized k[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int iB = com.google.android.exoplayer2.util.n.b(map);
        if (iB != -1) {
            c(iB, arrayList);
        }
        int iC = com.google.android.exoplayer2.util.n.c(uri);
        if (iC != -1 && iC != iB) {
            c(iC, arrayList);
        }
        for (int i10 : f45002n) {
            if (i10 != iB && i10 != iC) {
                c(i10, arrayList);
            }
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    @Override // com.google.android.exoplayer2.extractor.q
    public synchronized k[] b() {
        return a(Uri.EMPTY, new HashMap());
    }

    public synchronized h d(int i10) {
        this.f45006d = i10;
        return this;
    }

    public synchronized h e(int i10) {
        this.f45007e = i10;
        return this;
    }

    public synchronized h f(boolean z10) {
        this.f45005c = z10;
        return this;
    }

    public synchronized h g(boolean z10) {
        this.f45004b = z10;
        return this;
    }

    public synchronized h h(int i10) {
        this.f45008f = i10;
        return this;
    }

    public synchronized h i(int i10) {
        this.f45011i = i10;
        return this;
    }

    public synchronized h j(int i10) {
        this.f45009g = i10;
        return this;
    }

    public synchronized h k(int i10) {
        this.f45012j = i10;
        return this;
    }

    public synchronized h l(int i10) {
        this.f45010h = i10;
        return this;
    }

    public synchronized h m(int i10) {
        this.f45014l = i10;
        return this;
    }

    public synchronized h n(int i10) {
        this.f45013k = i10;
        return this;
    }

    public synchronized h o(int i10) {
        this.f45015m = i10;
        return this;
    }
}
