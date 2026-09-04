package com.max.network.utils;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.p;

/* JADX INFO: compiled from: DownloadResultBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DownloadResultBuilder<T> extends ResultBuilder<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private p<? super Long, ? super Long, b2> onLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadResultBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DownloadResultBuilder(@e final Displayer displayer) {
        super(displayer);
        this.onLoading = new p<Long, Long, b2>() { // from class: com.max.network.utils.DownloadResultBuilder$onLoading$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(Long l10, Long l11) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10, l11}, this, changeQuickRedirect, false, c.m.Be, new Class[]{Object.class, Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke(l10.longValue(), l11.longValue());
                return b2.f124493a;
            }

            public final void invoke(long j10, long j11) {
                Displayer displayer2;
                Object[] objArr = {new Long(j10), new Long(j11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Long.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Ae, new Class[]{cls, cls}, Void.TYPE).isSupported || j11 == 0 || (displayer2 = displayer) == null) {
                    return;
                }
                displayer2.displayMsg("Loading : " + ((j10 * ((long) 100)) / j11) + '%');
            }
        };
    }

    public /* synthetic */ DownloadResultBuilder(Displayer displayer, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : displayer);
    }

    @d
    public final p<Long, Long, b2> getOnLoading() {
        return this.onLoading;
    }

    public final void setOnLoading(@d p<? super Long, ? super Long, b2> pVar) {
        if (PatchProxy.proxy(new Object[]{pVar}, this, changeQuickRedirect, false, c.m.f35178ze, new Class[]{p.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(pVar, "<set-?>");
        this.onLoading = pVar;
    }
}
