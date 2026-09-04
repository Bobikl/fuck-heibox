package com.jd.jdcache.util;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: IUsefulCheck.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static final <T extends b, R extends Collection<T>> R a(R r10, boolean z10) {
        if (r10 != null) {
            Iterator it = r10.iterator();
            while (it.hasNext()) {
                if ((z10 && !((b) it.next()).useful()) || (!z10 && ((b) it.next()).useful())) {
                    it.remove();
                }
            }
        }
        return r10;
    }

    public static /* synthetic */ Collection b(Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return a(collection, z10);
    }
}
