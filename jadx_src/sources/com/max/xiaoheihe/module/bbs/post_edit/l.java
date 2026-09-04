package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: PicPostTopicOrHashtagChooseFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d RecyclerView recyclerView, @dl.d Context viewContext, int i10) {
        if (PatchProxy.proxy(new Object[]{recyclerView, viewContext, new Integer(i10)}, null, changeQuickRedirect, true, 30113, new Class[]{RecyclerView.class, Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "<this>");
        kotlin.jvm.internal.f0.p(viewContext, "viewContext");
        int iF = ViewUtils.f(viewContext, i10);
        if (recyclerView.getItemDecorationCount() <= 0) {
            recyclerView.addItemDecoration(new com.max.hbcustomview.d(iF, 0));
        }
    }
}
