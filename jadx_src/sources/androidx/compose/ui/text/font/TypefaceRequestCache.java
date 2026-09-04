package androidx.compose.ui.text.font;

import androidx.compose.runtime.m2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00050\u0004J(\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004J\u0019\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "Landroidx/compose/ui/text/font/e1;", "typefaceRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/f1;", "Lkotlin/b2;", "resolveTypeface", "Landroidx/compose/runtime/m2;", "f", "", "typefaceRequests", "e", "b", "(Landroidx/compose/ui/text/font/e1;)Landroidx/compose/ui/text/font/f1;", "Landroidx/compose/ui/text/platform/s;", ak.av, "Landroidx/compose/ui/text/platform/s;", ak.aF, "()Landroidx/compose/ui/text/platform/s;", "lock", "Landroidx/compose/ui/text/caches/b;", "Landroidx/compose/ui/text/caches/b;", "resultCache", "", "d", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TypefaceRequestCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.platform.s lock = androidx.compose.ui.text.platform.r.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.caches.b<TypefaceRequest, f1> resultCache = new androidx.compose.ui.text.caches.b<>(16);

    @dl.e
    public final f1 b(@dl.d TypefaceRequest typefaceRequest) {
        f1 f1VarG;
        kotlin.jvm.internal.f0.p(typefaceRequest, "typefaceRequest");
        synchronized (this.lock) {
            f1VarG = this.resultCache.g(typefaceRequest);
        }
        return f1VarG;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.text.platform.s getLock() {
        return this.lock;
    }

    public final int d() {
        int iP;
        synchronized (this.lock) {
            iP = this.resultCache.p();
        }
        return iP;
    }

    public final void e(@dl.d List<TypefaceRequest> typefaceRequests, @dl.d yh.l<? super TypefaceRequest, ? extends f1> resolveTypeface) {
        f1 f1VarG;
        kotlin.jvm.internal.f0.p(typefaceRequests, "typefaceRequests");
        kotlin.jvm.internal.f0.p(resolveTypeface, "resolveTypeface");
        int size = typefaceRequests.size();
        for (int i10 = 0; i10 < size; i10++) {
            TypefaceRequest typefaceRequest = typefaceRequests.get(i10);
            synchronized (this.lock) {
                f1VarG = this.resultCache.g(typefaceRequest);
            }
            if (f1VarG == null) {
                try {
                    f1 f1VarInvoke = resolveTypeface.invoke(typefaceRequest);
                    if (f1VarInvoke instanceof f1.a) {
                        continue;
                    } else {
                        synchronized (this.lock) {
                            this.resultCache.k(typefaceRequest, f1VarInvoke);
                        }
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Could not load font", e10);
                }
            }
        }
    }

    @dl.d
    public final m2<Object> f(@dl.d final TypefaceRequest typefaceRequest, @dl.d yh.l<? super yh.l<? super f1, b2>, ? extends f1> resolveTypeface) {
        kotlin.jvm.internal.f0.p(typefaceRequest, "typefaceRequest");
        kotlin.jvm.internal.f0.p(resolveTypeface, "resolveTypeface");
        synchronized (this.lock) {
            f1 f1VarG = this.resultCache.g(typefaceRequest);
            if (f1VarG != null) {
                if (f1VarG.getCacheable()) {
                    return f1VarG;
                }
                this.resultCache.m(typefaceRequest);
            }
            try {
                f1 f1VarInvoke = resolveTypeface.invoke(new yh.l<f1, b2>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d f1 finalResult) {
                        kotlin.jvm.internal.f0.p(finalResult, "finalResult");
                        androidx.compose.ui.text.platform.s lock = this.f16517b.getLock();
                        TypefaceRequestCache typefaceRequestCache = this.f16517b;
                        TypefaceRequest typefaceRequest2 = typefaceRequest;
                        synchronized (lock) {
                            if (finalResult.getCacheable()) {
                                typefaceRequestCache.resultCache.k(typefaceRequest2, finalResult);
                            } else {
                                typefaceRequestCache.resultCache.m(typefaceRequest2);
                            }
                            b2 b2Var = b2.f124493a;
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(f1 f1Var) {
                        a(f1Var);
                        return b2.f124493a;
                    }
                });
                synchronized (this.lock) {
                    if (this.resultCache.g(typefaceRequest) == null && f1VarInvoke.getCacheable()) {
                        this.resultCache.k(typefaceRequest, f1VarInvoke);
                    }
                    b2 b2Var = b2.f124493a;
                }
                return f1VarInvoke;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
