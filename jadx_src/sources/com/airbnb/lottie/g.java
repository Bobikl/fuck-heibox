package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.collection.l2;
import androidx.collection.x0;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: LottieComposition.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<Layer>> f37326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, k> f37327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, com.airbnb.lottie.model.b> f37328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.airbnb.lottie.model.g> f37329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l2<com.airbnb.lottie.model.c> f37330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x0<Layer> f37331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Layer> f37332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f37333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f37334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f37335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f37336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37337n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f37324a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<String> f37325b = new HashSet<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37338o = 0;

    /* JADX INFO: compiled from: LottieComposition.java */
    @Deprecated
    public static class b {

        /* JADX INFO: compiled from: LottieComposition.java */
        public static final class a implements l<g>, com.airbnb.lottie.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final s f37339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f37340b;

            private a(s sVar) {
                this.f37340b = false;
                this.f37339a = sVar;
            }

            @Override // com.airbnb.lottie.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(g gVar) {
                if (this.f37340b) {
                    return;
                }
                this.f37339a.a(gVar);
            }

            @Override // com.airbnb.lottie.b
            public void cancel() {
                this.f37340b = true;
            }
        }

        private b() {
        }

        @Deprecated
        public static com.airbnb.lottie.b a(Context context, String str, s sVar) {
            a aVar = new a(sVar);
            h.e(context, str).f(aVar);
            return aVar;
        }

        @k1
        @p0
        @Deprecated
        public static g b(Context context, String str) {
            return h.g(context, str).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b c(InputStream inputStream, s sVar) {
            a aVar = new a(sVar);
            h.j(inputStream, null).f(aVar);
            return aVar;
        }

        @k1
        @p0
        @Deprecated
        public static g d(InputStream inputStream) {
            return h.k(inputStream, null).b();
        }

        @k1
        @p0
        @Deprecated
        public static g e(InputStream inputStream, boolean z10) {
            if (z10) {
                com.airbnb.lottie.utils.f.e("Lottie now auto-closes input stream!");
            }
            return h.k(inputStream, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b f(JsonReader jsonReader, s sVar) {
            a aVar = new a(sVar);
            h.m(jsonReader, null).f(aVar);
            return aVar;
        }

        @Deprecated
        public static com.airbnb.lottie.b g(String str, s sVar) {
            a aVar = new a(sVar);
            h.p(str, null).f(aVar);
            return aVar;
        }

        @k1
        @p0
        @Deprecated
        public static g h(Resources resources, JSONObject jSONObject) {
            return h.r(jSONObject, null).b();
        }

        @k1
        @p0
        @Deprecated
        public static g i(JsonReader jsonReader) {
            return h.n(jsonReader, null).b();
        }

        @k1
        @p0
        @Deprecated
        public static g j(String str) {
            return h.q(str, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b k(Context context, @u0 int i10, s sVar) {
            a aVar = new a(sVar);
            h.s(context, i10).f(aVar);
            return aVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        com.airbnb.lottie.utils.f.e(str);
        this.f37325b.add(str);
    }

    public Rect b() {
        return this.f37333j;
    }

    public l2<com.airbnb.lottie.model.c> c() {
        return this.f37330g;
    }

    public float d() {
        return (long) ((e() / this.f37336m) * 1000.0f);
    }

    public float e() {
        return this.f37335l - this.f37334k;
    }

    public float f() {
        return this.f37335l;
    }

    public Map<String, com.airbnb.lottie.model.b> g() {
        return this.f37328e;
    }

    public float h(float f10) {
        return com.airbnb.lottie.utils.i.k(this.f37334k, this.f37335l, f10);
    }

    public float i() {
        return this.f37336m;
    }

    public Map<String, k> j() {
        return this.f37327d;
    }

    public List<Layer> k() {
        return this.f37332i;
    }

    @p0
    public com.airbnb.lottie.model.g l(String str) {
        int size = this.f37329f.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.airbnb.lottie.model.g gVar = this.f37329f.get(i10);
            if (gVar.a(str)) {
                return gVar;
            }
        }
        return null;
    }

    public List<com.airbnb.lottie.model.g> m() {
        return this.f37329f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int n() {
        return this.f37338o;
    }

    public t o() {
        return this.f37324a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public List<Layer> p(String str) {
        return this.f37326c.get(str);
    }

    public float q(float f10) {
        float f11 = this.f37334k;
        return (f10 - f11) / (this.f37335l - f11);
    }

    public float r() {
        return this.f37334k;
    }

    public ArrayList<String> s() {
        HashSet<String> hashSet = this.f37325b;
        return new ArrayList<>(Arrays.asList(hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean t() {
        return this.f37337n;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f37332i.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().y("\t"));
        }
        return sb2.toString();
    }

    public boolean u() {
        return !this.f37327d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void v(int i10) {
        this.f37338o += i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void w(Rect rect, float f10, float f11, float f12, List<Layer> list, x0<Layer> x0Var, Map<String, List<Layer>> map, Map<String, k> map2, l2<com.airbnb.lottie.model.c> l2Var, Map<String, com.airbnb.lottie.model.b> map3, List<com.airbnb.lottie.model.g> list2) {
        this.f37333j = rect;
        this.f37334k = f10;
        this.f37335l = f11;
        this.f37336m = f12;
        this.f37332i = list;
        this.f37331h = x0Var;
        this.f37326c = map;
        this.f37327d = map2;
        this.f37330g = l2Var;
        this.f37328e = map3;
        this.f37329f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer x(long j10) {
        return this.f37331h.g(j10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void y(boolean z10) {
        this.f37337n = z10;
    }

    public void z(boolean z10) {
        this.f37324a.g(z10);
    }
}
