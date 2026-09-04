package com.max.xiaoheihe.module.bbs.post_edit;

import java.util.Iterator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException(com.google.android.exoplayer2.text.ttml.d.f49783b0);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}
