package com.max.mediaselector.lib.utils;

import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: SortUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class r {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int c(LocalMediaFolder localMediaFolder, LocalMediaFolder localMediaFolder2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMediaFolder, localMediaFolder2}, null, changeQuickRedirect, true, bb.c.m.L9, new Class[]{LocalMediaFolder.class, LocalMediaFolder.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (localMediaFolder.c() == null || localMediaFolder2.c() == null) {
            return 0;
        }
        return Integer.compare(localMediaFolder2.j(), localMediaFolder.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(LocalMedia localMedia, LocalMedia localMedia2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia, localMedia2}, null, changeQuickRedirect, true, bb.c.m.K9, new Class[]{LocalMedia.class, LocalMedia.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Long.compare(localMedia2.v(), localMedia.v());
    }

    public static void e(List<LocalMediaFolder> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.m.I9, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: com.max.mediaselector.lib.utils.q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return r.c((LocalMediaFolder) obj, (LocalMediaFolder) obj2);
            }
        });
    }

    public static void f(List<LocalMedia> list) {
        if (PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.m.J9, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: com.max.mediaselector.lib.utils.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return r.d((LocalMedia) obj, (LocalMedia) obj2);
            }
        });
    }
}
