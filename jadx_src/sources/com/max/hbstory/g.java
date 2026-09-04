package com.max.hbstory;

import android.view.MotionEvent;
import androidx.compose.foundation.b0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import androidx.lifecycle.w0;
import com.google.gson.JsonObject;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.video.player.info.PlaybackState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: StoryViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nStoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryViewModel.kt\ncom/max/hbstory/StoryViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
public final class g extends w0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final LiveData<List<StoryItemsObj>> A;

    @dl.d
    private final i0<List<StoryItemsObj>> B;

    @dl.d
    private final LiveData<List<StoryItemsObj>> C;

    @dl.d
    private final i0<b> D;

    @dl.d
    private final LiveData<b> E;

    @dl.d
    private final i0<Boolean> F;

    @dl.d
    private final LiveData<Boolean> G;

    @dl.d
    private final i0<Boolean> H;

    @dl.d
    private final LiveData<Boolean> I;

    @dl.d
    private final i0<Boolean> J;

    @dl.d
    private final LiveData<Boolean> K;

    @dl.d
    private final i0<Integer> L;

    @dl.d
    private final LiveData<Integer> M;

    @dl.d
    private final i0<Integer> N;

    @dl.d
    private final LiveData<Integer> O;

    @dl.d
    private final i0<Boolean> P;

    @dl.d
    private final LiveData<Boolean> Q;

    @dl.d
    private final i0<Boolean> R;

    @dl.d
    private final LiveData<Boolean> S;

    @dl.d
    private final i0<String> T;

    @dl.d
    private final LiveData<String> U;

    @dl.d
    private final i0<Boolean> V;

    @dl.d
    private final LiveData<Boolean> W;

    @dl.d
    private final i0<b2> X;

    @dl.d
    private final LiveData<b2> Y;

    @dl.d
    private final i0<Boolean> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f72965a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final qd.a f72966b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private final i0<a> f72967b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final i0<d> f72968c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private final LiveData<a> f72969c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final LiveData<d> f72970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final i0<Boolean> f72971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f72972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final i0<Boolean> f72973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f72974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private HashMap<String, String> f72975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final i0<c> f72976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final LiveData<c> f72977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final i0<JsonObject> f72978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final LiveData<JsonObject> f72979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final i0<JsonObject> f72980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final LiveData<JsonObject> f72981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final i0<Integer> f72982p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.d
    private final i0<a> f72983p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    private final LiveData<Boolean> f72984p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final LiveData<Integer> f72985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final i0<PlaybackState> f72986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final LiveData<PlaybackState> f72987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final i0<Integer> f72988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final LiveData<Integer> f72989u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final i0<e> f72990v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final LiveData<e> f72991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final i0<Long> f72992x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    private final LiveData<a> f72993x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final LiveData<Long> f72994y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    private final i0<Boolean> f72995y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final i0<List<StoryItemsObj>> f72996z;

    /* JADX INFO: compiled from: StoryViewModel.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f72997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f72998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72999c;

        public a(float f10, float f11, int i10) {
            this.f72997a = f10;
            this.f72998b = f11;
            this.f72999c = i10;
        }

        public static /* synthetic */ a e(a aVar, float f10, float f11, int i10, int i11, Object obj) {
            Object[] objArr = {aVar, new Float(f10), new Float(f11), new Integer(i10), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            Class cls2 = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.f33596hd, new Class[]{a.class, cls, cls, cls2, cls2, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i11 & 1) != 0) {
                f10 = aVar.f72997a;
            }
            if ((i11 & 2) != 0) {
                f11 = aVar.f72998b;
            }
            if ((i11 & 4) != 0) {
                i10 = aVar.f72999c;
            }
            return aVar.d(f10, f11, i10);
        }

        public final float a() {
            return this.f72997a;
        }

        public final float b() {
            return this.f72998b;
        }

        public final int c() {
            return this.f72999c;
        }

        @dl.d
        public final a d(float f10, float f11, int i10) {
            Object[] objArr = {new Float(f10), new Float(f11), new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33573gd, new Class[]{cls, cls, Integer.TYPE}, a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(f10, f11, i10);
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33665kd, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f72997a, aVar.f72997a) == 0 && Float.compare(this.f72998b, aVar.f72998b) == 0 && this.f72999c == aVar.f72999c;
        }

        public final int f() {
            return this.f72999c;
        }

        public final float g() {
            return this.f72997a;
        }

        public final float h() {
            return this.f72998b;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33642jd, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((Float.floatToIntBits(this.f72997a) * 31) + Float.floatToIntBits(this.f72998b)) * 31) + this.f72999c;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33619id, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "Coordinates(x=" + this.f72997a + ", y=" + this.f72998b + ", rapidTapping=" + this.f72999c + ')';
        }
    }

    /* JADX INFO: compiled from: StoryViewModel.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f73000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private String f73001b;

        public b(boolean z10, @dl.d String useId) {
            f0.p(useId, "useId");
            this.f73000a = z10;
            this.f73001b = useId;
        }

        public static /* synthetic */ b d(b bVar, boolean z10, String str, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, new Byte(z10 ? (byte) 1 : (byte) 0), str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33734nd, new Class[]{b.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                z10 = bVar.f73000a;
            }
            if ((i10 & 2) != 0) {
                str = bVar.f73001b;
            }
            return bVar.c(z10, str);
        }

        public final boolean a() {
            return this.f73000a;
        }

        @dl.d
        public final String b() {
            return this.f73001b;
        }

        @dl.d
        public final b c(boolean z10, @dl.d String useId) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), useId}, this, changeQuickRedirect, false, bb.c.k.f33711md, new Class[]{Boolean.TYPE, String.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            f0.p(useId, "useId");
            return new b(z10, useId);
        }

        @dl.d
        public final String e() {
            return this.f73001b;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33803qd, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f73000a == bVar.f73000a && f0.g(this.f73001b, bVar.f73001b);
        }

        public final boolean f() {
            return this.f73000a;
        }

        public final void g(boolean z10) {
            this.f73000a = z10;
        }

        public final void h(@dl.d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33688ld, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            this.f73001b = str;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33780pd, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (b0.a(this.f73000a) * 31) + this.f73001b.hashCode();
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33757od, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "FollowStatus(isFollowed=" + this.f73000a + ", useId=" + this.f73001b + ')';
        }
    }

    /* JADX INFO: compiled from: StoryViewModel.kt */
    public static final class c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final MotionEvent f73002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final MotionEvent f73003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f73004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f73005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f73006e;

        public c(@dl.e MotionEvent motionEvent, @dl.e MotionEvent motionEvent2, float f10, float f11, boolean z10) {
            this.f73002a = motionEvent;
            this.f73003b = motionEvent2;
            this.f73004c = f10;
            this.f73005d = f11;
            this.f73006e = z10;
        }

        public static /* synthetic */ c g(c cVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11, boolean z10, int i10, Object obj) {
            float f12 = f10;
            float f13 = f11;
            boolean z11 = z10;
            Object[] objArr = {cVar, motionEvent, motionEvent2, new Float(f12), new Float(f13), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.f33847sd, new Class[]{c.class, MotionEvent.class, MotionEvent.class, cls, cls, Boolean.TYPE, Integer.TYPE, Object.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            MotionEvent motionEvent3 = (i10 & 1) != 0 ? cVar.f73002a : motionEvent;
            MotionEvent motionEvent4 = (i10 & 2) != 0 ? cVar.f73003b : motionEvent2;
            if ((i10 & 4) != 0) {
                f12 = cVar.f73004c;
            }
            if ((i10 & 8) != 0) {
                f13 = cVar.f73005d;
            }
            if ((i10 & 16) != 0) {
                z11 = cVar.f73006e;
            }
            return cVar.f(motionEvent3, motionEvent4, f12, f13, z11);
        }

        @dl.e
        public final MotionEvent a() {
            return this.f73002a;
        }

        @dl.e
        public final MotionEvent b() {
            return this.f73003b;
        }

        public final float c() {
            return this.f73004c;
        }

        public final float d() {
            return this.f73005d;
        }

        public final boolean e() {
            return this.f73006e;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33913vd, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return f0.g(this.f73002a, cVar.f73002a) && f0.g(this.f73003b, cVar.f73003b) && Float.compare(this.f73004c, cVar.f73004c) == 0 && Float.compare(this.f73005d, cVar.f73005d) == 0 && this.f73006e == cVar.f73006e;
        }

        @dl.d
        public final c f(@dl.e MotionEvent motionEvent, @dl.e MotionEvent motionEvent2, float f10, float f11, boolean z10) {
            Object[] objArr = {motionEvent, motionEvent2, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33825rd, new Class[]{MotionEvent.class, MotionEvent.class, cls, cls, Boolean.TYPE}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new c(motionEvent, motionEvent2, f10, f11, z10);
        }

        public final float h() {
            return this.f73004c;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33891ud, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            MotionEvent motionEvent = this.f73002a;
            int iHashCode = (motionEvent == null ? 0 : motionEvent.hashCode()) * 31;
            MotionEvent motionEvent2 = this.f73003b;
            return ((((((iHashCode + (motionEvent2 != null ? motionEvent2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f73004c)) * 31) + Float.floatToIntBits(this.f73005d)) * 31) + b0.a(this.f73006e);
        }

        public final float i() {
            return this.f73005d;
        }

        @dl.e
        public final MotionEvent j() {
            return this.f73002a;
        }

        @dl.e
        public final MotionEvent k() {
            return this.f73003b;
        }

        public final boolean l() {
            return this.f73006e;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33869td, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "ScrollEventData(e1=" + this.f73002a + ", e2=" + this.f73003b + ", distanceX=" + this.f73004c + ", distanceY=" + this.f73005d + ", isScrollStop=" + this.f73006e + ')';
        }
    }

    /* JADX INFO: compiled from: StoryViewModel.kt */
    public static final class d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f73007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f73008b;

        public d(float f10, int i10) {
            this.f73007a = f10;
            this.f73008b = i10;
        }

        public final int a() {
            return this.f73008b;
        }

        public final float b() {
            return this.f73007a;
        }

        public final void c(float f10) {
            this.f73007a = f10;
        }
    }

    /* JADX INFO: compiled from: StoryViewModel.kt */
    public static final class e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f73009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f73010b;

        public e(int i10, int i11) {
            this.f73009a = i10;
            this.f73010b = i11;
        }

        public static /* synthetic */ e d(e eVar, int i10, int i11, int i12, Object obj) {
            Object[] objArr = {eVar, new Integer(i10), new Integer(i11), new Integer(i12), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.f33957xd, new Class[]{e.class, cls, cls, cls, Object.class}, e.class);
            if (patchProxyResultProxy.isSupported) {
                return (e) patchProxyResultProxy.result;
            }
            if ((i12 & 1) != 0) {
                i10 = eVar.f73009a;
            }
            if ((i12 & 2) != 0) {
                i11 = eVar.f73010b;
            }
            return eVar.c(i10, i11);
        }

        public final int a() {
            return this.f73009a;
        }

        public final int b() {
            return this.f73010b;
        }

        @dl.d
        public final e c(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33935wd, new Class[]{cls, cls}, e.class);
            return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : new e(i10, i11);
        }

        public final int e() {
            return this.f73010b;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f73009a == eVar.f73009a && this.f73010b == eVar.f73010b;
        }

        public final int f() {
            return this.f73009a;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f34001zd, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.f73009a * 31) + this.f73010b;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33979yd, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "VideoPosition(position=" + this.f73009a + ", duration=" + this.f73010b + ')';
        }
    }

    public g(@dl.d qd.a repository) {
        f0.p(repository, "repository");
        this.f72966b = repository;
        i0<d> i0Var = new i0<>();
        this.f72968c = i0Var;
        this.f72970d = i0Var;
        i0<Boolean> i0Var2 = new i0<>();
        this.f72971e = i0Var2;
        this.f72972f = i0Var2;
        i0<Boolean> i0Var3 = new i0<>();
        this.f72973g = i0Var3;
        this.f72974h = i0Var3;
        this.f72975i = new HashMap<>();
        i0<c> i0Var4 = new i0<>();
        this.f72976j = i0Var4;
        this.f72977k = i0Var4;
        i0<JsonObject> i0Var5 = new i0<>();
        this.f72978l = i0Var5;
        this.f72979m = i0Var5;
        i0<JsonObject> i0Var6 = new i0<>();
        this.f72980n = i0Var6;
        this.f72981o = i0Var6;
        i0<Integer> i0Var7 = new i0<>();
        this.f72982p = i0Var7;
        this.f72985q = i0Var7;
        i0<PlaybackState> i0Var8 = new i0<>();
        this.f72986r = i0Var8;
        this.f72987s = i0Var8;
        i0<Integer> i0Var9 = new i0<>();
        this.f72988t = i0Var9;
        this.f72989u = i0Var9;
        i0<e> i0Var10 = new i0<>();
        this.f72990v = i0Var10;
        this.f72991w = i0Var10;
        i0<Long> i0Var11 = new i0<>();
        this.f72992x = i0Var11;
        this.f72994y = i0Var11;
        i0<List<StoryItemsObj>> i0Var12 = new i0<>(CollectionsKt__CollectionsKt.E());
        this.f72996z = i0Var12;
        this.A = i0Var12;
        i0<List<StoryItemsObj>> i0Var13 = new i0<>(CollectionsKt__CollectionsKt.E());
        this.B = i0Var13;
        this.C = i0Var13;
        i0<b> i0Var14 = new i0<>();
        this.D = i0Var14;
        this.E = i0Var14;
        i0<Boolean> i0Var15 = new i0<>();
        Boolean bool = Boolean.FALSE;
        i0Var15.r(bool);
        this.F = i0Var15;
        this.G = i0Var15;
        i0<Boolean> i0Var16 = new i0<>();
        i0Var16.r(bool);
        this.H = i0Var16;
        this.I = i0Var16;
        i0<Boolean> i0Var17 = new i0<>();
        i0Var17.r(Boolean.TRUE);
        this.J = i0Var17;
        this.K = i0Var17;
        i0<Integer> i0Var18 = new i0<>();
        i0Var18.r(0);
        this.L = i0Var18;
        this.M = i0Var18;
        i0<Integer> i0Var19 = new i0<>();
        i0Var19.r(0);
        this.N = i0Var19;
        this.O = i0Var19;
        i0<Boolean> i0Var20 = new i0<>();
        i0Var20.r(bool);
        this.P = i0Var20;
        this.Q = i0Var20;
        i0<Boolean> i0Var21 = new i0<>();
        i0Var21.r(bool);
        this.R = i0Var21;
        this.S = i0Var21;
        i0<String> i0Var22 = new i0<>();
        this.T = i0Var22;
        this.U = i0Var22;
        i0<Boolean> i0Var23 = new i0<>();
        i0Var23.r(bool);
        this.V = i0Var23;
        this.W = i0Var23;
        i0<b2> i0Var24 = new i0<>();
        this.X = i0Var24;
        this.Y = i0Var24;
        i0<Boolean> i0Var25 = new i0<>();
        this.Z = i0Var25;
        this.f72965a0 = i0Var25;
        i0<a> i0Var26 = new i0<>();
        this.f72967b0 = i0Var26;
        this.f72969c0 = i0Var26;
        i0<a> i0Var27 = new i0<>();
        this.f72983p1 = i0Var27;
        this.f72993x1 = i0Var27;
        i0<Boolean> i0Var28 = new i0<>();
        i0Var28.r(bool);
        this.f72995y1 = i0Var28;
        this.f72984p2 = i0Var28;
    }

    @dl.d
    public final LiveData<c> A() {
        return this.f72977k;
    }

    @dl.d
    public final LiveData<Long> B() {
        return this.f72994y;
    }

    @dl.d
    public final LiveData<Boolean> C() {
        return this.Q;
    }

    @dl.d
    public final LiveData<b2> D() {
        return this.Y;
    }

    @dl.d
    public final LiveData<List<StoryItemsObj>> E() {
        return this.A;
    }

    @dl.d
    public final LiveData<List<StoryItemsObj>> F() {
        return this.C;
    }

    @dl.d
    public final LiveData<String> G() {
        return this.U;
    }

    @dl.d
    public final LiveData<Boolean> H() {
        return this.S;
    }

    @dl.d
    public final LiveData<Boolean> I() {
        return this.K;
    }

    @dl.d
    public final LiveData<Boolean> J() {
        return this.f72972f;
    }

    @dl.d
    public final LiveData<Boolean> K() {
        return this.I;
    }

    @dl.d
    public final LiveData<b> L() {
        return this.E;
    }

    @dl.d
    public final LiveData<Boolean> M() {
        return this.f72984p2;
    }

    @dl.d
    public final LiveData<Boolean> N() {
        return this.G;
    }

    @dl.d
    public final LiveData<Boolean> O() {
        return this.W;
    }

    public final void P(@dl.d a coordinates) {
        if (PatchProxy.proxy(new Object[]{coordinates}, this, changeQuickRedirect, false, bb.c.k.f33527ed, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(coordinates, "coordinates");
        this.f72983p1.r(coordinates);
    }

    public final void Q(@dl.d a coordinates) {
        if (PatchProxy.proxy(new Object[]{coordinates}, this, changeQuickRedirect, false, bb.c.k.f33504dd, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(coordinates, "coordinates");
        this.f72967b0.r(coordinates);
    }

    public final void R(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33480cd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.Z.r(Boolean.valueOf(z10));
    }

    public final void S(@dl.e MotionEvent motionEvent, @dl.e MotionEvent motionEvent2, float f10, float f11, boolean z10) {
        Object[] objArr = {motionEvent, motionEvent2, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Cc, new Class[]{MotionEvent.class, MotionEvent.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f72976j.r(new c(motionEvent, motionEvent2, f10, f11, z10));
    }

    public final void T() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33457bd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.X.r(b2.f124493a);
    }

    public final void U(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Tc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.N.r(Integer.valueOf(i10));
    }

    public final void V(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Yc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.R.r(Boolean.valueOf(z10));
    }

    public final void W(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Fc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f72982p.r(Integer.valueOf(i10));
    }

    public final void X(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Hc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f72988t.r(Integer.valueOf(i10));
    }

    public final void Y(@dl.d e position) {
        if (PatchProxy.proxy(new Object[]{position}, this, changeQuickRedirect, false, bb.c.k.Ic, new Class[]{e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(position, "position");
        this.f72990v.r(position);
    }

    public final void Z(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Pc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.H.r(Boolean.valueOf(z10));
    }

    public final void a0(@dl.d b isFollowed) {
        if (PatchProxy.proxy(new Object[]{isFollowed}, this, changeQuickRedirect, false, bb.c.k.Mc, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(isFollowed, "isFollowed");
        this.D.r(isFollowed);
    }

    public final void b0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33550fd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f72995y1.r(Boolean.valueOf(z10));
    }

    public final void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Qc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.J.r(Boolean.valueOf(z10));
    }

    public final void c0(@dl.d JsonObject position) {
        if (PatchProxy.proxy(new Object[]{position}, this, changeQuickRedirect, false, bb.c.k.Dc, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(position, "position");
        this.f72978l.r(position);
    }

    public final void d0(@dl.d JsonObject position) {
        if (PatchProxy.proxy(new Object[]{position}, this, changeQuickRedirect, false, bb.c.k.Ec, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(position, "position");
        this.f72980n.r(position);
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Sc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.r(Integer.valueOf(this.f72966b.e()));
    }

    public final void e0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Nc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.F.r(Boolean.valueOf(z10));
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Oc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.F.r(Boolean.valueOf(this.f72966b.n()));
    }

    public final void f0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Ac, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f72973g.r(Boolean.valueOf(z10));
    }

    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Lc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.B.r(this.f72966b.g());
    }

    public final void g0(@dl.d PlaybackState playState) {
        if (PatchProxy.proxy(new Object[]{playState}, this, changeQuickRedirect, false, bb.c.k.Gc, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(playState, "playState");
        this.f72986r.r(playState);
    }

    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Vc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.r(Integer.valueOf(this.f72966b.o()));
    }

    public final void h0(@dl.d HashMap<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, bb.c.k.Bc, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.f72975i = map;
    }

    @dl.d
    public final LiveData<d> i() {
        return this.f72970d;
    }

    public final void i0(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.k.Jc, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f72992x.r(Long.valueOf(j10));
    }

    public final void j0(@dl.e List<StoryItemsObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.Kc, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f72996z.r(list);
    }

    @dl.d
    public final LiveData<Integer> k() {
        return this.O;
    }

    public final void k0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Wc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.P.r(Boolean.valueOf(z10));
    }

    public final void l0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Xc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i0<Boolean> i0Var = this.R;
        Boolean boolF = i0Var.f();
        if (boolF == null) {
            boolF = Boolean.FALSE;
        }
        i0Var.r(Boolean.valueOf(!boolF.booleanValue()));
    }

    @dl.d
    public final LiveData<a> m() {
        return this.f72993x1;
    }

    public final void m0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Uc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        i0<Integer> i0Var = this.N;
        Integer numF = i0Var.f();
        if (numF == null) {
            numF = 0;
        }
        i0Var.r(Integer.valueOf(numF.intValue() + (z10 ? 1 : -1)));
    }

    @dl.d
    public final LiveData<Integer> n() {
        return this.f72985q;
    }

    public final void n0(@dl.d String newHint) {
        if (PatchProxy.proxy(new Object[]{newHint}, this, changeQuickRedirect, false, bb.c.k.Zc, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(newHint, "newHint");
        this.T.r(newHint);
    }

    @dl.d
    public final LiveData<Integer> o() {
        return this.f72989u;
    }

    public final void o0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Rc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        i0<Integer> i0Var = this.L;
        Integer numF = i0Var.f();
        if (numF == null) {
            numF = 0;
        }
        i0Var.r(Integer.valueOf(numF.intValue() + (z10 ? 1 : -1)));
    }

    @dl.d
    public final LiveData<e> p() {
        return this.f72991w;
    }

    public final void p0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f34000zc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f72971e.r(Boolean.valueOf(z10));
    }

    public final void q0(@dl.d d sheetHeight) {
        if (PatchProxy.proxy(new Object[]{sheetHeight}, this, changeQuickRedirect, false, bb.c.k.f33978yc, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sheetHeight, "sheetHeight");
        this.f72968c.r(sheetHeight);
    }

    @dl.d
    public final LiveData<a> r() {
        return this.f72969c0;
    }

    public final void r0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33434ad, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.V.r(Boolean.valueOf(z10));
    }

    @dl.d
    public final LiveData<Integer> s() {
        return this.M;
    }

    @dl.d
    public final LiveData<JsonObject> t() {
        return this.f72979m;
    }

    @dl.d
    public final LiveData<JsonObject> u() {
        return this.f72981o;
    }

    @dl.d
    public final LiveData<Boolean> v() {
        return this.f72974h;
    }

    @dl.d
    public final LiveData<Boolean> w() {
        return this.f72965a0;
    }

    @dl.d
    public final LiveData<PlaybackState> x() {
        return this.f72987s;
    }

    @dl.d
    public final HashMap<String, String> y() {
        return this.f72975i;
    }

    @dl.d
    public final qd.a z() {
        return this.f72966b;
    }
}
