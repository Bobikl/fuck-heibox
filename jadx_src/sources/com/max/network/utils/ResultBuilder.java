package com.max.network.utils;

import bb.c;
import com.max.network.entities.ApiResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.a;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: ResultBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ResultBuilder<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final Displayer displayer;

    @d
    private a<b2> onComplete;

    @d
    private a<b2> onDataEmpty;

    @d
    private l<? super Throwable, b2> onError;

    @d
    private p<? super String, ? super String, b2> onFailed;

    @d
    private l<? super ApiResponse<T>, b2> onRawSuccess;

    @d
    private l<? super T, b2> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ResultBuilder(@e Displayer displayer) {
        this.displayer = displayer;
        this.onSuccess = new l<T, b2>() { // from class: com.max.network.utils.ResultBuilder$onSuccess$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.Pg, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(obj);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@e T t10) {
            }
        };
        this.onRawSuccess = new l<ApiResponse<T>, b2>() { // from class: com.max.network.utils.ResultBuilder$onRawSuccess$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.Og, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke((ApiResponse) obj);
                return b2.f124493a;
            }

            public final void invoke(@e ApiResponse<T> apiResponse) {
            }
        };
        this.onDataEmpty = new a<b2>() { // from class: com.max.network.utils.ResultBuilder$onDataEmpty$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Jg, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        };
        this.onFailed = new p<String, String, b2>(this) { // from class: com.max.network.utils.ResultBuilder$onFailed$1
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ ResultBuilder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(String str, String str2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.Ng, new Class[]{Object.class, Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str, str2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@e String str, @e String str2) {
                Displayer displayer2;
                if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.Mg, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str2 == null || (displayer2 = ((ResultBuilder) this.this$0).displayer) == null) {
                    return;
                }
                displayer2.displayMsg(str2);
            }
        };
        this.onError = new l<Throwable, b2>(this) { // from class: com.max.network.utils.ResultBuilder$onError$1
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ ResultBuilder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, c.m.Lg, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@d Throwable e10) {
                Displayer displayer2;
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, c.m.Kg, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                String message = e10.getMessage();
                if (message == null || (displayer2 = ((ResultBuilder) this.this$0).displayer) == null) {
                    return;
                }
                displayer2.displayMsg(message);
            }
        };
        this.onComplete = new a<b2>() { // from class: com.max.network.utils.ResultBuilder$onComplete$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ig, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        };
    }

    public /* synthetic */ ResultBuilder(Displayer displayer, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : displayer);
    }

    @d
    public final a<b2> getOnComplete() {
        return this.onComplete;
    }

    @d
    public final a<b2> getOnDataEmpty() {
        return this.onDataEmpty;
    }

    @d
    public final l<Throwable, b2> getOnError() {
        return this.onError;
    }

    @d
    public final p<String, String, b2> getOnFailed() {
        return this.onFailed;
    }

    @d
    public final l<ApiResponse<T>, b2> getOnRawSuccess() {
        return this.onRawSuccess;
    }

    @d
    public final l<T, b2> getOnSuccess() {
        return this.onSuccess;
    }

    public final void setOnComplete(@d a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, c.m.Hg, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.onComplete = aVar;
    }

    public final void setOnDataEmpty(@d a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, c.m.Eg, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.onDataEmpty = aVar;
    }

    public final void setOnError(@d l<? super Throwable, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, c.m.Gg, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.onError = lVar;
    }

    public final void setOnFailed(@d p<? super String, ? super String, b2> pVar) {
        if (PatchProxy.proxy(new Object[]{pVar}, this, changeQuickRedirect, false, c.m.Fg, new Class[]{p.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(pVar, "<set-?>");
        this.onFailed = pVar;
    }

    public final void setOnRawSuccess(@d l<? super ApiResponse<T>, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, c.m.Dg, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.onRawSuccess = lVar;
    }

    public final void setOnSuccess(@d l<? super T, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, c.m.Cg, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.onSuccess = lVar;
    }
}
