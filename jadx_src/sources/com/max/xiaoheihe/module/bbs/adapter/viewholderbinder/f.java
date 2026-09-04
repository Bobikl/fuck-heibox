package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WikiItemVHB.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class f extends j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80685f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d i param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.j
    public void g(@dl.d s.e viewHolder, @dl.d WikiOrArticleWrapperObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27549, new Class[]{s.e.class, WikiOrArticleWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        com.max.xiaoheihe.module.bbs.utils.b.R(viewHolder, data.getArticle());
        viewHolder.i(R.id.divider).setVisibility(viewHolder.getAdapterPosition() == i().getItemCount() - 1 ? 8 : 0);
    }
}
