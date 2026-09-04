package androidx.compose.foundation.lazy;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListScope$-CC, reason: invalid class name */
/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LazyListScope$CC {
    public static void a(w wVar, @dl.e Object obj, @dl.e Object obj2, @dl.d yh.q content) {
        f0.p(content, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static /* synthetic */ void b(w wVar, Object obj, yh.q content) {
        f0.p(content, "content");
        wVar.a(obj, null, content);
    }

    public static void c(w wVar, int i10, @dl.e yh.l lVar, @dl.d yh.l contentType, @dl.d yh.r itemContent) {
        f0.p(contentType, "contentType");
        f0.p(itemContent, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static /* synthetic */ void d(w wVar, int i10, yh.l lVar, yh.r itemContent) {
        f0.p(itemContent, "itemContent");
        wVar.b(i10, lVar, new yh.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$2
            @dl.e
            public final Object a(int i11) {
                return null;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }, itemContent);
    }

    public static /* synthetic */ void i(w wVar, Object obj, Object obj2, yh.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        wVar.a(obj, obj2, qVar);
    }

    public static /* synthetic */ void j(w wVar, Object obj, yh.q qVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        wVar.c(obj, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(w wVar, int i10, yh.l lVar, yh.l lVar2, yh.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = new yh.l() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                @dl.e
                public final Void a(int i12) {
                    return null;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        wVar.b(i10, lVar, lVar2, rVar);
    }

    public static /* synthetic */ void l(w wVar, int i10, yh.l lVar, yh.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        wVar.e(i10, lVar, rVar);
    }

    public static /* synthetic */ void m(w wVar, Object obj, Object obj2, yh.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        wVar.d(obj, obj2, qVar);
    }
}
