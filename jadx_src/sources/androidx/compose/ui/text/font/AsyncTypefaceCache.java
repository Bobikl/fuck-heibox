package androidx.compose.ui.text.font;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0015\u001aB\u0007¢\u0006\u0004\b$\u0010%J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007J(\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJM\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u001e\u0010\u0010\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0086@ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0086\bø\u0001\u0003R\u001d\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u001d8\u0002X\u0082\u0004ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"\u0082\u0002\u0016\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, "Landroidx/compose/ui/text/font/q0;", "platformFontLoader", "result", "", "forever", "Lkotlin/b2;", "e", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "d", "(Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/q0;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "block", "g", "(Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/q0;ZLyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function0;", RXScreenCaptureService.KEY_HEIGHT, ak.av, "Ljava/lang/Object;", "PermanentFailure", "Landroidx/compose/ui/text/caches/b;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$b;", "b", "Landroidx/compose/ui/text/caches/b;", "resultCache", "Landroidx/compose/ui/text/caches/c;", ak.aF, "Landroidx/compose/ui/text/caches/c;", "permanentCache", "Landroidx/compose/ui/text/platform/s;", "Landroidx/compose/ui/text/platform/s;", "cacheLock", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.g
public final class AsyncTypefaceCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object PermanentFailure = a.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.caches.b<Key, a> resultCache = new androidx.compose.ui.text.caches.b<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.caches.c<Key, a> permanentCache = new androidx.compose.ui.text.caches.c<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.platform.s cacheLock = androidx.compose.ui.text.platform.r.a();

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081@\u0018\u00002\u00020\u0001B\u0014\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0010\u0092\u0001\u0004\u0018\u00010\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$a;", "", "", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)Ljava/lang/String;", "", "f", "(Ljava/lang/Object;)I", "other", "", ak.aF, "(Ljava/lang/Object;Ljava/lang/Object;)Z", ak.av, "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "result", "g", "(Ljava/lang/Object;)Z", "isPermanentFailure", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @xh.f
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final Object result;

        private /* synthetic */ a(Object obj) {
            this.result = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        @dl.d
        public static Object b(@dl.e Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && kotlin.jvm.internal.f0.g(obj, ((a) obj2).i());
        }

        public static final boolean d(Object obj, Object obj2) {
            return kotlin.jvm.internal.f0.g(obj, obj2);
        }

        public static int f(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean g(Object obj) {
            return obj == null;
        }

        public static String h(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        @dl.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        public boolean equals(Object obj) {
            return c(this.result, obj);
        }

        public int hashCode() {
            return f(this.result);
        }

        public final /* synthetic */ Object i() {
            return this.result;
        }

        public String toString() {
            return h(this.result);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$b, reason: from toString */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$b;", "", "Landroidx/compose/ui/text/font/u;", ak.av, "b", UiKitSpanObj.TYPE_FONT, "loaderKey", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/ui/text/font/u;", "e", "()Landroidx/compose/ui/text/font/u;", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "<init>", "(Landroidx/compose/ui/text/font/u;Ljava/lang/Object;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final u font;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.e
        private final Object loaderKey;

        public Key(@dl.d u font, @dl.e Object obj) {
            kotlin.jvm.internal.f0.p(font, "font");
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key d(Key key, u uVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                uVar = key.font;
            }
            if ((i10 & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.c(uVar, obj);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u getFont() {
            return this.font;
        }

        @dl.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        @dl.d
        public final Key c(@dl.d u font, @dl.e Object loaderKey) {
            kotlin.jvm.internal.f0.p(font, "font");
            return new Key(font, loaderKey);
        }

        @dl.d
        public final u e() {
            return this.font;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return kotlin.jvm.internal.f0.g(this.font, key.font) && kotlin.jvm.internal.f0.g(this.loaderKey, key.loaderKey);
        }

        @dl.e
        public final Object f() {
            return this.loaderKey;
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        @dl.d
        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public static /* synthetic */ void f(AsyncTypefaceCache asyncTypefaceCache, u uVar, q0 q0Var, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        asyncTypefaceCache.e(uVar, q0Var, obj, z10);
    }

    @dl.e
    public final a d(@dl.d u font, @dl.d q0 platformFontLoader) {
        a aVarG;
        kotlin.jvm.internal.f0.p(font, "font");
        kotlin.jvm.internal.f0.p(platformFontLoader, "platformFontLoader");
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            aVarG = this.resultCache.g(key);
            if (aVarG == null) {
                aVarG = this.permanentCache.e(key);
            }
        }
        return aVarG;
    }

    public final void e(@dl.d u font, @dl.d q0 platformFontLoader, @dl.e Object obj, boolean z10) {
        kotlin.jvm.internal.f0.p(font, "font");
        kotlin.jvm.internal.f0.p(platformFontLoader, "platformFontLoader");
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.n(key, a.a(this.PermanentFailure));
                } else if (z10) {
                    this.permanentCache.n(key, a.a(a.b(obj)));
                } else {
                    this.resultCache.k(key, a.a(a.b(obj)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object g(@dl.d u uVar, @dl.d q0 q0Var, boolean z10, @dl.d yh.l<? super kotlin.coroutines.c<Object>, ? extends Object> lVar, @dl.d kotlin.coroutines.c<Object> cVar) throws Throwable {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        AsyncTypefaceCache asyncTypefaceCache;
        Key key;
        if (cVar instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) cVar;
            int i10 = asyncTypefaceCache$runCached$1.f16471g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.f16471g = i10 - Integer.MIN_VALUE;
            } else {
                asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, cVar);
            }
        } else {
            asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, cVar);
        }
        Object obj = asyncTypefaceCache$runCached$1.f16469e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = asyncTypefaceCache$runCached$1.f16471g;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            Key key2 = new Key(uVar, q0Var.getCacheKey());
            synchronized (this.cacheLock) {
                a aVarG = this.resultCache.g(key2);
                if (aVarG == null) {
                    aVarG = this.permanentCache.e(key2);
                }
                if (aVarG != null) {
                    return aVarG.i();
                }
                b2 b2Var = b2.f124493a;
                asyncTypefaceCache$runCached$1.f16466b = this;
                asyncTypefaceCache$runCached$1.f16467c = key2;
                asyncTypefaceCache$runCached$1.f16468d = z10;
                asyncTypefaceCache$runCached$1.f16471g = 1;
                Object objInvoke = lVar.invoke(asyncTypefaceCache$runCached$1);
                if (objInvoke == objH) {
                    return objH;
                }
                asyncTypefaceCache = this;
                obj = objInvoke;
                key = key2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = asyncTypefaceCache$runCached$1.f16468d;
            key = (Key) asyncTypefaceCache$runCached$1.f16467c;
            asyncTypefaceCache = (AsyncTypefaceCache) asyncTypefaceCache$runCached$1.f16466b;
            kotlin.t0.n(obj);
        }
        synchronized (asyncTypefaceCache.cacheLock) {
            try {
                if (obj == null) {
                    asyncTypefaceCache.permanentCache.n(key, a.a(asyncTypefaceCache.PermanentFailure));
                } else if (z10) {
                    asyncTypefaceCache.permanentCache.n(key, a.a(a.b(obj)));
                } else {
                    asyncTypefaceCache.resultCache.k(key, a.a(a.b(obj)));
                }
                b2 b2Var2 = b2.f124493a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @dl.e
    public final Object h(@dl.d u font, @dl.d q0 platformFontLoader, @dl.d yh.a<? extends Object> block) {
        kotlin.jvm.internal.f0.p(font, "font");
        kotlin.jvm.internal.f0.p(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.f0.p(block, "block");
        synchronized (this.cacheLock) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                a aVar = (a) this.resultCache.g(key);
                if (aVar == null) {
                    aVar = (a) this.permanentCache.e(key);
                }
                if (aVar != null) {
                    Object objI = aVar.i();
                    kotlin.jvm.internal.c0.d(2);
                    kotlin.jvm.internal.c0.c(2);
                    return objI;
                }
                b2 b2Var = b2.f124493a;
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
                Object objInvoke = block.invoke();
                f(this, font, platformFontLoader, objInvoke, false, 8, null);
                return objInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
    }
}
