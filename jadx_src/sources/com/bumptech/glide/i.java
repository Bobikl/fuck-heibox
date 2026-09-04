package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.target.r;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.o;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes6.dex */
public class i<TranscodeType> extends com.bumptech.glide.request.a<i<TranscodeType>> implements Cloneable, g<i<TranscodeType>> {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected static final com.bumptech.glide.request.h f40757p3 = new com.bumptech.glide.request.h().q(com.bumptech.glide.load.engine.h.f41154c).H0(Priority.LOW).Q0(true);
    private boolean G2;
    private final Context W;
    private final j X;
    private final Class<TranscodeType> Y;
    private final Glide Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final d f40758a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @n0
    private k<?, ? super TranscodeType> f40759b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @p0
    private Object f40760c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private List<com.bumptech.glide.request.g<TranscodeType>> f40761p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @p0
    private Float f40762p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @p0
    private i<TranscodeType> f40763x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f40764x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @p0
    private i<TranscodeType> f40765y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f40766y2;

    /* JADX INFO: compiled from: RequestBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f40768b;

        static {
            int[] iArr = new int[Priority.values().length];
            f40768b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40768b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40768b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40768b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f40767a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40767a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40767a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40767a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40767a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40767a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40767a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40767a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected i(@n0 Glide glide, j jVar, Class<TranscodeType> cls, Context context) {
        this.f40764x2 = true;
        this.Z = glide;
        this.X = jVar;
        this.Y = cls;
        this.W = context;
        this.f40759b0 = jVar.x(cls);
        this.f40758a0 = glide.k();
        x1(jVar.v());
        i(jVar.w());
    }

    @SuppressLint({"CheckResult"})
    protected i(Class<TranscodeType> cls, i<?> iVar) {
        this(iVar.Z, iVar.X, cls, iVar.W);
        this.f40760c0 = iVar.f40760c0;
        this.f40766y2 = iVar.f40766y2;
        i(iVar);
    }

    private <Y extends p<TranscodeType>> Y A1(@n0 Y y10, @p0 com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        m.e(y10);
        if (!this.f40766y2) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.request.e eVarJ1 = j1(y10, gVar, aVar, executor);
        com.bumptech.glide.request.e request = y10.getRequest();
        if (eVarJ1.f(request) && !D1(aVar, request)) {
            if (!((com.bumptech.glide.request.e) m.e(request)).isRunning()) {
                request.h();
            }
            return y10;
        }
        this.X.q(y10);
        y10.setRequest(eVarJ1);
        this.X.R(y10, eVarJ1);
        return y10;
    }

    private boolean D1(com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.e eVar) {
        return !aVar.g0() && eVar.isComplete();
    }

    @n0
    private i<TranscodeType> Q1(@p0 Object obj) {
        if (c0()) {
            return clone().Q1(obj);
        }
        this.f40760c0 = obj;
        this.f40766y2 = true;
        return M0();
    }

    private i<TranscodeType> R1(@p0 Uri uri, i<TranscodeType> iVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? iVar : i1(iVar);
    }

    private com.bumptech.glide.request.e S1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, RequestCoordinator requestCoordinator, k<?, ? super TranscodeType> kVar, Priority priority, int i10, int i11, Executor executor) {
        Context context = this.W;
        d dVar = this.f40758a0;
        return SingleRequest.x(context, dVar, obj, this.f40760c0, this.Y, aVar, i10, i11, priority, pVar, gVar, this.f40761p1, requestCoordinator, dVar.f(), kVar.c(), executor);
    }

    private i<TranscodeType> i1(i<TranscodeType> iVar) {
        return iVar.R0(this.W.getTheme()).O0(com.bumptech.glide.signature.a.c(this.W));
    }

    private com.bumptech.glide.request.e j1(p<TranscodeType> pVar, @p0 com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        return k1(new Object(), pVar, gVar, null, this.f40759b0, aVar.S(), aVar.P(), aVar.O(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.request.e k1(Object obj, p<TranscodeType> pVar, @p0 com.bumptech.glide.request.g<TranscodeType> gVar, @p0 RequestCoordinator requestCoordinator, k<?, ? super TranscodeType> kVar, Priority priority, int i10, int i11, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator bVar;
        if (this.f40765y1 != null) {
            bVar = new com.bumptech.glide.request.b(obj, requestCoordinator);
            requestCoordinator2 = bVar;
        } else {
            requestCoordinator2 = null;
            bVar = requestCoordinator;
        }
        com.bumptech.glide.request.e eVarL1 = l1(obj, pVar, gVar, bVar, kVar, priority, i10, i11, aVar, executor);
        if (requestCoordinator2 == null) {
            return eVarL1;
        }
        int iP = this.f40765y1.P();
        int iO = this.f40765y1.O();
        if (o.x(i10, i11) && !this.f40765y1.p0()) {
            iP = aVar.P();
            iO = aVar.O();
        }
        i<TranscodeType> iVar = this.f40765y1;
        com.bumptech.glide.request.b bVar2 = requestCoordinator2;
        bVar2.n(eVarL1, iVar.k1(obj, pVar, gVar, bVar2, iVar.f40759b0, iVar.S(), iP, iO, this.f40765y1, executor));
        return bVar2;
    }

    private com.bumptech.glide.request.e l1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.g<TranscodeType> gVar, @p0 RequestCoordinator requestCoordinator, k<?, ? super TranscodeType> kVar, Priority priority, int i10, int i11, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        i<TranscodeType> iVar = this.f40763x1;
        if (iVar == null) {
            if (this.f40762p2 == null) {
                return S1(obj, pVar, gVar, aVar, requestCoordinator, kVar, priority, i10, i11, executor);
            }
            com.bumptech.glide.request.j jVar = new com.bumptech.glide.request.j(obj, requestCoordinator);
            jVar.m(S1(obj, pVar, gVar, aVar, jVar, kVar, priority, i10, i11, executor), S1(obj, pVar, gVar, aVar.clone().P0(this.f40762p2.floatValue()), jVar, kVar, w1(priority), i10, i11, executor));
            return jVar;
        }
        if (this.G2) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        k<?, ? super TranscodeType> kVar2 = iVar.f40764x2 ? kVar : iVar.f40759b0;
        Priority priorityS = iVar.h0() ? this.f40763x1.S() : w1(priority);
        int iP = this.f40763x1.P();
        int iO = this.f40763x1.O();
        if (o.x(i10, i11) && !this.f40763x1.p0()) {
            iP = aVar.P();
            iO = aVar.O();
        }
        com.bumptech.glide.request.j jVar2 = new com.bumptech.glide.request.j(obj, requestCoordinator);
        com.bumptech.glide.request.e eVarS1 = S1(obj, pVar, gVar, aVar, jVar2, kVar, priority, i10, i11, executor);
        this.G2 = true;
        i<TranscodeType> iVar2 = this.f40763x1;
        com.bumptech.glide.request.e eVarK1 = iVar2.k1(obj, pVar, gVar, jVar2, kVar2, priorityS, iP, iO, iVar2, executor);
        this.G2 = false;
        jVar2.m(eVarS1, eVarK1);
        return jVar2;
    }

    private i<TranscodeType> n1() {
        return clone().q1(null).Y1(null);
    }

    @n0
    private Priority w1(@n0 Priority priority) {
        int i10 = a.f40768b[priority.ordinal()];
        if (i10 == 1) {
            return Priority.NORMAL;
        }
        if (i10 == 2) {
            return Priority.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + S());
    }

    @SuppressLint({"CheckResult"})
    private void x1(List<com.bumptech.glide.request.g<Object>> list) {
        Iterator<com.bumptech.glide.request.g<Object>> it = list.iterator();
        while (it.hasNext()) {
            e1((com.bumptech.glide.request.g) it.next());
        }
    }

    @n0
    <Y extends p<TranscodeType>> Y B1(@n0 Y y10, @p0 com.bumptech.glide.request.g<TranscodeType> gVar, Executor executor) {
        return (Y) A1(y10, gVar, this, executor);
    }

    @n0
    public r<ImageView, TranscodeType> C1(@n0 ImageView imageView) {
        com.bumptech.glide.request.a aVarS0;
        o.b();
        m.e(imageView);
        if (!o0() && m0() && imageView.getScaleType() != null) {
            switch (a.f40767a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarS0 = clone().s0();
                    break;
                case 2:
                    aVarS0 = clone().t0();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarS0 = clone().v0();
                    break;
                case 6:
                    aVarS0 = clone().t0();
                    break;
                default:
                    aVarS0 = this;
                    break;
            }
        } else {
            aVarS0 = this;
        }
        return (r) A1(this.f40758a0.a(imageView, this.Y), null, aVarS0, com.bumptech.glide.util.f.b());
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> E1(@p0 com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (c0()) {
            return clone().E1(gVar);
        }
        this.f40761p1 = null;
        return e1(gVar);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> g(@p0 Bitmap bitmap) {
        return Q1(bitmap).i(com.bumptech.glide.request.h.l1(com.bumptech.glide.load.engine.h.f41153b));
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> c(@p0 Drawable drawable) {
        return Q1(drawable).i(com.bumptech.glide.request.h.l1(com.bumptech.glide.load.engine.h.f41153b));
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: H1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> e(@p0 Uri uri) {
        return R1(uri, Q1(uri));
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> b(@p0 File file) {
        return Q1(file);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> h(@u0 @v @p0 Integer num) {
        return i1(Q1(num));
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> d(@p0 Object obj) {
        return Q1(obj);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> load(@p0 String str) {
        return Q1(str);
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.j
    @Deprecated
    /* JADX INFO: renamed from: N1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> a(@p0 URL url) {
        return Q1(url);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> f(@p0 byte[] bArr) {
        i<TranscodeType> iVarQ1 = Q1(bArr);
        if (!iVarQ1.d0()) {
            iVarQ1 = iVarQ1.i(com.bumptech.glide.request.h.l1(com.bumptech.glide.load.engine.h.f41153b));
        }
        return !iVarQ1.l0() ? iVarQ1.i(com.bumptech.glide.request.h.F1(true)) : iVarQ1;
    }

    @n0
    public p<TranscodeType> T1() {
        return U1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @n0
    public p<TranscodeType> U1(int i10, int i11) {
        return z1(com.bumptech.glide.request.target.m.b(this.X, i10, i11));
    }

    @n0
    public com.bumptech.glide.request.d<TranscodeType> V1() {
        return W1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @n0
    public com.bumptech.glide.request.d<TranscodeType> W1(int i10, int i11) {
        com.bumptech.glide.request.f fVar = new com.bumptech.glide.request.f(i10, i11);
        return (com.bumptech.glide.request.d) B1(fVar, fVar, com.bumptech.glide.util.f.a());
    }

    @n0
    @androidx.annotation.j
    @Deprecated
    public i<TranscodeType> X1(float f10) {
        if (c0()) {
            return clone().X1(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f40762p2 = Float.valueOf(f10);
        return M0();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> Y1(@p0 i<TranscodeType> iVar) {
        if (c0()) {
            return clone().Y1(iVar);
        }
        this.f40763x1 = iVar;
        return M0();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> Z1(@p0 List<i<TranscodeType>> list) {
        i<TranscodeType> iVarY1 = null;
        if (list == null || list.isEmpty()) {
            return Y1(null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            i<TranscodeType> iVar = list.get(size);
            if (iVar != null) {
                iVarY1 = iVarY1 == null ? iVar : iVar.Y1(iVarY1);
            }
        }
        return Y1(iVarY1);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> a2(@p0 i<TranscodeType>... iVarArr) {
        return (iVarArr == null || iVarArr.length == 0) ? Y1(null) : Z1(Arrays.asList(iVarArr));
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> b2(@n0 k<?, ? super TranscodeType> kVar) {
        if (c0()) {
            return clone().b2(kVar);
        }
        this.f40759b0 = (k) m.e(kVar);
        this.f40764x2 = false;
        return M0();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> e1(@p0 com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (c0()) {
            return clone().e1(gVar);
        }
        if (gVar != null) {
            if (this.f40761p1 == null) {
                this.f40761p1 = new ArrayList();
            }
            this.f40761p1.add(gVar);
        }
        return M0();
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return super.equals(iVar) && Objects.equals(this.Y, iVar.Y) && this.f40759b0.equals(iVar.f40759b0) && Objects.equals(this.f40760c0, iVar.f40760c0) && Objects.equals(this.f40761p1, iVar.f40761p1) && Objects.equals(this.f40763x1, iVar.f40763x1) && Objects.equals(this.f40765y1, iVar.f40765y1) && Objects.equals(this.f40762p2, iVar.f40762p2) && this.f40764x2 == iVar.f40764x2 && this.f40766y2 == iVar.f40766y2;
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> i(@n0 com.bumptech.glide.request.a<?> aVar) {
        m.e(aVar);
        return (i) super.i(aVar);
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return o.t(this.f40766y2, o.t(this.f40764x2, o.r(this.f40762p2, o.r(this.f40765y1, o.r(this.f40763x1, o.r(this.f40761p1, o.r(this.f40760c0, o.r(this.f40759b0, o.r(this.Y, super.hashCode())))))))));
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.j
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> clone() {
        i<TranscodeType> iVar = (i) super.clone();
        iVar.f40759b0 = iVar.f40759b0.clone();
        if (iVar.f40761p1 != null) {
            iVar.f40761p1 = new ArrayList(iVar.f40761p1);
        }
        i<TranscodeType> iVar2 = iVar.f40763x1;
        if (iVar2 != null) {
            iVar.f40763x1 = iVar2.clone();
        }
        i<TranscodeType> iVar3 = iVar.f40765y1;
        if (iVar3 != null) {
            iVar.f40765y1 = iVar3.clone();
        }
        return iVar;
    }

    @androidx.annotation.j
    @Deprecated
    public com.bumptech.glide.request.d<File> o1(int i10, int i11) {
        return s1().W1(i10, i11);
    }

    @androidx.annotation.j
    @Deprecated
    public <Y extends p<File>> Y p1(@n0 Y y10) {
        return (Y) s1().z1(y10);
    }

    @n0
    public i<TranscodeType> q1(@p0 i<TranscodeType> iVar) {
        if (c0()) {
            return clone().q1(iVar);
        }
        this.f40765y1 = iVar;
        return M0();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> r1(Object obj) {
        return obj == null ? q1(null) : q1(n1().d(obj));
    }

    @n0
    @androidx.annotation.j
    protected i<File> s1() {
        return new i(File.class, this).i(f40757p3);
    }

    Object t1() {
        return this.f40760c0;
    }

    j u1() {
        return this.X;
    }

    @Deprecated
    public com.bumptech.glide.request.d<TranscodeType> y1(int i10, int i11) {
        return W1(i10, i11);
    }

    @n0
    public <Y extends p<TranscodeType>> Y z1(@n0 Y y10) {
        return (Y) B1(y10, null, com.bumptech.glide.util.f.b());
    }
}
