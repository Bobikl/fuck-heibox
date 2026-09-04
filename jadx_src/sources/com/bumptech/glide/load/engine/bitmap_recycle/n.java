package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.meituan.robust.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SizeConfigStrategy.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
public class n implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41013d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f41014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f41015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f41016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f41017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Bitmap.Config[] f41018i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f41019a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<b, Bitmap> f41020b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f41021c = new HashMap();

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41022a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f41022a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41022a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41022a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41022a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    @j1
    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f41023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f41025c;

        public b(c cVar) {
            this.f41023a = cVar;
        }

        @j1
        b(c cVar, int i10, Bitmap.Config config) {
            this(cVar);
            b(i10, config);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f41023a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f41024b = i10;
            this.f41025c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f41024b == bVar.f41024b && com.bumptech.glide.util.o.e(this.f41025c, bVar.f41025c);
        }

        public int hashCode() {
            int i10 = this.f41024b * 31;
            Bitmap.Config config = this.f41025c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.h(this.f41024b, this.f41025c);
        }
    }

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    @j1
    public static class c extends d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i10, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f41014e = configArr;
        f41015f = configArr;
        f41016g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f41017h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f41018i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
    }

    private b g(int i10, Bitmap.Config config) {
        b bVarE = this.f41019a.e(i10, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i10));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i10 * 8) {
                if (numCeilingKey.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.f41019a.c(bVarE);
                return this.f41019a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i10, Bitmap.Config config) {
        return Constants.ARRAY_TYPE + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f41015f;
        }
        int i10 = a.f41022a[config.ordinal()];
        if (i10 == 1) {
            return f41014e;
        }
        if (i10 == 2) {
            return f41016g;
        }
        if (i10 != 3) {
            return i10 != 4 ? new Bitmap.Config[]{config} : f41018i;
        }
        return f41017h;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f41021c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f41021c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(com.bumptech.glide.util.o.h(i10, i11, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return h(com.bumptech.glide.util.o.i(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        b bVarE = this.f41019a.e(com.bumptech.glide.util.o.i(bitmap), bitmap.getConfig());
        this.f41020b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f41024b));
        navigableMapJ.put(Integer.valueOf(bVarE.f41024b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @p0
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(com.bumptech.glide.util.o.h(i10, i11, config), config);
        Bitmap bitmapA = this.f41020b.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.f41024b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @p0
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f41020b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(com.bumptech.glide.util.o.i(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f41020b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f41021c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f41021c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
