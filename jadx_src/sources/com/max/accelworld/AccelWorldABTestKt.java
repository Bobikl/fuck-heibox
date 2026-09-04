package com.max.accelworld;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: AccelWorldABTest.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AccelWorldABTestKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(boolean z10, @dl.d l<? super i, b2> foo) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), foo}, null, changeQuickRedirect, true, bb.c.b.Ve, new Class[]{Boolean.TYPE, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(foo, "foo");
        i iVar = new i(z10);
        foo.invoke(iVar);
        yh.a<b2> aVarF = iVar.f();
        if (aVarF != null) {
            aVarF.invoke();
        }
        iVar.d().c(new l<View, b2>() { // from class: com.max.accelworld.AccelWorldABTestKt$DoABTest$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@dl.d View it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.b.We, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.setVisibility(0);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Xe, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view);
                return b2.f124493a;
            }
        });
        iVar.d().b(new l<View, b2>() { // from class: com.max.accelworld.AccelWorldABTestKt$DoABTest$1$3
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@dl.d View it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.b.Ye, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.setVisibility(8);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Ze, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view);
                return b2.f124493a;
            }
        });
        iVar.e().c(new l<View, b2>() { // from class: com.max.accelworld.AccelWorldABTestKt$DoABTest$1$4
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@dl.d View it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.b.f30520af, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.setVisibility(0);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.f30543bf, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view);
                return b2.f124493a;
            }
        });
        iVar.e().b(new l<View, b2>() { // from class: com.max.accelworld.AccelWorldABTestKt$DoABTest$1$5
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@dl.d View it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.b.f30566cf, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.setVisibility(8);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.f30590df, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view);
                return b2.f124493a;
            }
        });
    }
}
