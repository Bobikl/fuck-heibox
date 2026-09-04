package com.max.xiaoheihe.module.search.viewholderbinder.recommend;

import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRecLinkingVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class c extends g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f91847f = 0;

    /* JADX INFO: compiled from: SearchRecLinkingVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91849c;

        a(BBSLinkObj bBSLinkObj) {
            this.f91849c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43439, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(c.this.i(), this.f91849c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d f param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.recommend.g, cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, HeyBoxContentObj heyBoxContentObj) {
        if (PatchProxy.proxy(new Object[]{eVar, heyBoxContentObj}, this, changeQuickRedirect, false, 43438, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, heyBoxContentObj);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.recommend.g
    public void f(@dl.d s.e viewHolder, @dl.d HeyBoxContentObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43437, new Class[]{s.e.class, HeyBoxContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        Object data2 = data.getData();
        f0.n(data2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.BBSLinkObj");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) data2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bBSLinkObj);
        new com.max.xiaoheihe.module.search.c(i(), arrayList).p(viewHolder, bBSLinkObj);
        viewHolder.itemView.setOnClickListener(new a(bBSLinkObj));
    }
}
