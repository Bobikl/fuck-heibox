package com.heybox.imageviewer.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: DataProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: com.heybox.imageviewer.core.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DataProvider.kt */
    public static final class C0493a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d a aVar, @dl.d List<? extends d> exclude, @dl.d d target) {
            if (PatchProxy.proxy(new Object[]{aVar, exclude, target}, null, changeQuickRedirect, true, 155, new Class[]{a.class, List.class, d.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(exclude, "exclude");
            f0.p(target, "target");
        }

        public static void b(@dl.d a aVar, long j10, @dl.d l<? super List<? extends d>, b2> callback) {
            if (PatchProxy.proxy(new Object[]{aVar, new Long(j10), callback}, null, changeQuickRedirect, true, 152, new Class[]{a.class, Long.TYPE, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(callback, "callback");
        }

        @dl.d
        public static List<d> c(@dl.d a aVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 154, new Class[]{a.class}, List.class);
            return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : CollectionsKt__CollectionsKt.E();
        }

        public static void d(@dl.d a aVar, long j10, @dl.d l<? super List<? extends d>, b2> callback) {
            if (PatchProxy.proxy(new Object[]{aVar, new Long(j10), callback}, null, changeQuickRedirect, true, 153, new Class[]{a.class, Long.TYPE, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(callback, "callback");
        }

        @dl.d
        public static List<d> e(@dl.d a aVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 151, new Class[]{a.class}, List.class);
            return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : CollectionsKt__CollectionsKt.E();
        }
    }

    void a(@dl.d List<? extends d> list, @dl.d d dVar);

    @dl.d
    List<d> b();

    void c(long j10, @dl.d l<? super List<? extends d>, b2> lVar);

    @dl.d
    List<d> d();

    void e(long j10, @dl.d l<? super List<? extends d>, b2> lVar);
}
