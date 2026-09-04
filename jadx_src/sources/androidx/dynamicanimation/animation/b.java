package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.x;
import androidx.core.view.j1;
import androidx.dynamicanimation.animation.b;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;

/* JADX INFO: compiled from: DynamicAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b<T extends b<T>> implements androidx.dynamicanimation.animation.a.b {
    public static final float A = 1.0f;
    public static final float B = 0.1f;
    public static final float C = 0.00390625f;
    public static final float D = 0.002f;
    private static final float E = Float.MAX_VALUE;
    private static final float F = 0.75f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f22871m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f22872n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f22873o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f22874p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f22875q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f22876r = new l(androidx.constraintlayout.motion.widget.f.f18721i);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f22877s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f22878t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f22879u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f22880v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f22881w = new C0164b(ak.aD);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f22882x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f22883y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f22884z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f22885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f22886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f22887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f22888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.dynamicanimation.animation.d f22889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f22890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f22891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f22892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f22894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f22895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f22896l;

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class C0164b extends s {
        C0164b(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return j1.F0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            j1.B2(view, f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class f extends androidx.dynamicanimation.animation.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.dynamicanimation.animation.e f22897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, androidx.dynamicanimation.animation.e eVar) {
            super(str);
            this.f22897b = eVar;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(Object obj) {
            return this.f22897b.a();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(Object obj, float f10) {
            this.f22897b.b(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return j1.A0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            j1.w2(view, f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static final class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setX(f10);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f22899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f22900b;

        p() {
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public interface r {
        void a(b bVar, float f10, float f11);
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static abstract class s extends androidx.dynamicanimation.animation.d<View> {
        private s(String str) {
            super(str);
        }

        /* synthetic */ s(String str, g gVar) {
            this(str);
        }
    }

    b(androidx.dynamicanimation.animation.e eVar) {
        this.f22885a = 0.0f;
        this.f22886b = Float.MAX_VALUE;
        this.f22887c = false;
        this.f22890f = false;
        this.f22891g = Float.MAX_VALUE;
        this.f22892h = -Float.MAX_VALUE;
        this.f22893i = 0L;
        this.f22895k = new ArrayList<>();
        this.f22896l = new ArrayList<>();
        this.f22888d = null;
        this.f22889e = new f("FloatValueHolder", eVar);
        this.f22894j = 1.0f;
    }

    <K> b(K k10, androidx.dynamicanimation.animation.d<K> dVar) {
        this.f22885a = 0.0f;
        this.f22886b = Float.MAX_VALUE;
        this.f22887c = false;
        this.f22890f = false;
        this.f22891g = Float.MAX_VALUE;
        this.f22892h = -Float.MAX_VALUE;
        this.f22893i = 0L;
        this.f22895k = new ArrayList<>();
        this.f22896l = new ArrayList<>();
        this.f22888d = k10;
        this.f22889e = dVar;
        if (dVar == f22876r || dVar == f22877s || dVar == f22878t) {
            this.f22894j = 0.1f;
            return;
        }
        if (dVar == f22882x) {
            this.f22894j = 0.00390625f;
        } else if (dVar == f22874p || dVar == f22875q) {
            this.f22894j = 0.00390625f;
        } else {
            this.f22894j = 1.0f;
        }
    }

    private void e(boolean z10) {
        this.f22890f = false;
        androidx.dynamicanimation.animation.a.e().h(this);
        this.f22893i = 0L;
        this.f22887c = false;
        for (int i10 = 0; i10 < this.f22895k.size(); i10++) {
            if (this.f22895k.get(i10) != null) {
                this.f22895k.get(i10).a(this, z10, this.f22886b, this.f22885a);
            }
        }
        n(this.f22895k);
    }

    private float h() {
        return this.f22889e.b(this.f22888d);
    }

    private static <T> void m(ArrayList<T> arrayList, T t10) {
        int iIndexOf = arrayList.indexOf(t10);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    private static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void x() {
        if (this.f22890f) {
            return;
        }
        this.f22890f = true;
        if (!this.f22887c) {
            this.f22886b = h();
        }
        float f10 = this.f22886b;
        if (f10 > this.f22891g || f10 < this.f22892h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        androidx.dynamicanimation.animation.a.e().a(this, 0L);
    }

    @Override // androidx.dynamicanimation.animation.a.b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean a(long j10) {
        long j11 = this.f22893i;
        if (j11 == 0) {
            this.f22893i = j10;
            s(this.f22886b);
            return false;
        }
        this.f22893i = j10;
        boolean zY = y(j10 - j11);
        float fMin = Math.min(this.f22886b, this.f22891g);
        this.f22886b = fMin;
        float fMax = Math.max(fMin, this.f22892h);
        this.f22886b = fMax;
        s(fMax);
        if (zY) {
            e(false);
        }
        return zY;
    }

    public T b(q qVar) {
        if (!this.f22895k.contains(qVar)) {
            this.f22895k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (k()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f22896l.contains(rVar)) {
            this.f22896l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f22890f) {
            e(true);
        }
    }

    abstract float f(float f10, float f11);

    public float g() {
        return this.f22894j;
    }

    float i() {
        return this.f22894j * 0.75f;
    }

    abstract boolean j(float f10, float f11);

    public boolean k() {
        return this.f22890f;
    }

    public void l(q qVar) {
        m(this.f22895k, qVar);
    }

    public void o(r rVar) {
        m(this.f22896l, rVar);
    }

    public T p(float f10) {
        this.f22891g = f10;
        return this;
    }

    public T q(float f10) {
        this.f22892h = f10;
        return this;
    }

    public T r(@x(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f22894j = f10;
        v(f10 * 0.75f);
        return this;
    }

    void s(float f10) {
        this.f22889e.c(this.f22888d, f10);
        for (int i10 = 0; i10 < this.f22896l.size(); i10++) {
            if (this.f22896l.get(i10) != null) {
                this.f22896l.get(i10).a(this, this.f22886b, this.f22885a);
            }
        }
        n(this.f22896l);
    }

    public T t(float f10) {
        this.f22886b = f10;
        this.f22887c = true;
        return this;
    }

    public T u(float f10) {
        this.f22885a = f10;
        return this;
    }

    abstract void v(float f10);

    public void w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f22890f) {
            return;
        }
        x();
    }

    abstract boolean y(long j10);
}
