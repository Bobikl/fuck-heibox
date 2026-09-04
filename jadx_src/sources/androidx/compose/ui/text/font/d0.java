package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0003¨\u0006\r"}, d2 = {"", "Landroidx/compose/ui/text/font/u;", "Landroidx/compose/ui/text/font/e1;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/q0;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class d0 {
    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.ui.text.g
    public static final Pair<List<u>, Object> b(List<? extends u> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, q0 q0Var, yh.l<? super TypefaceRequest, ? extends Object> lVar) {
        Object objC;
        Object objB;
        int size = list.size();
        List listP = null;
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = list.get(i10);
            int loadingStrategy = uVar.getLoadingStrategy();
            e0.Companion companion = e0.INSTANCE;
            if (e0.g(loadingStrategy, companion.b())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(uVar, q0Var.getCacheKey());
                    AsyncTypefaceCache.a aVar = (AsyncTypefaceCache.a) asyncTypefaceCache.resultCache.g(key);
                    if (aVar == null) {
                        aVar = (AsyncTypefaceCache.a) asyncTypefaceCache.permanentCache.e(key);
                    }
                    if (aVar != null) {
                        objC = aVar.i();
                    } else {
                        b2 b2Var = b2.f124493a;
                        try {
                            objC = q0Var.c(uVar);
                            AsyncTypefaceCache.f(asyncTypefaceCache, uVar, q0Var, objC, false, 8, null);
                        } catch (Exception e10) {
                            throw new IllegalStateException("Unable to load font " + uVar, e10);
                        }
                    }
                }
                if (objC != null) {
                    return kotlin.c1.a(listP, i0.a(typefaceRequest.j(), objC, uVar, typefaceRequest.k(), typefaceRequest.i()));
                }
                throw new IllegalStateException("Unable to load font " + uVar);
            }
            if (e0.g(loadingStrategy, companion.c())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(uVar, q0Var.getCacheKey());
                    AsyncTypefaceCache.a aVar2 = (AsyncTypefaceCache.a) asyncTypefaceCache.resultCache.g(key2);
                    if (aVar2 == null) {
                        aVar2 = (AsyncTypefaceCache.a) asyncTypefaceCache.permanentCache.e(key2);
                    }
                    if (aVar2 != null) {
                        objB = aVar2.i();
                    } else {
                        b2 b2Var2 = b2.f124493a;
                        try {
                            Result.a aVar3 = Result.f124476c;
                            objB = Result.b(q0Var.c(uVar));
                        } catch (Throwable th2) {
                            Result.a aVar4 = Result.f124476c;
                            objB = Result.b(kotlin.t0.a(th2));
                        }
                        if (Result.i(objB)) {
                            objB = null;
                        }
                        AsyncTypefaceCache.f(asyncTypefaceCache, uVar, q0Var, objB, false, 8, null);
                    }
                }
                if (objB != null) {
                    return kotlin.c1.a(listP, i0.a(typefaceRequest.j(), objB, uVar, typefaceRequest.k(), typefaceRequest.i()));
                }
            } else {
                if (!e0.g(loadingStrategy, companion.a())) {
                    throw new IllegalStateException("Unknown font type " + uVar);
                }
                AsyncTypefaceCache.a aVarD = asyncTypefaceCache.d(uVar, q0Var);
                if (aVarD != null) {
                    if (!AsyncTypefaceCache.a.g(aVarD.i()) && aVarD.i() != null) {
                        return kotlin.c1.a(listP, i0.a(typefaceRequest.j(), aVarD.i(), uVar, typefaceRequest.k(), typefaceRequest.i()));
                    }
                } else if (listP == null) {
                    listP = CollectionsKt__CollectionsKt.P(uVar);
                } else {
                    listP.add(uVar);
                }
            }
        }
        return kotlin.c1.a(listP, lVar.invoke(typefaceRequest));
    }
}
