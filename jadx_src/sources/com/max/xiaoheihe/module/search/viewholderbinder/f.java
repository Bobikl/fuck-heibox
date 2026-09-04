package com.max.xiaoheihe.module.search.viewholderbinder;

import android.view.View;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.search.max.SearchDota2MatchObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchDota2MatchVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class f extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91780l = 0;

    /* JADX INFO: compiled from: SearchDota2MatchVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchDota2MatchObj f91782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91783d;

        a(SearchDota2MatchObj searchDota2MatchObj, GeneralSearchInfo generalSearchInfo) {
            this.f91782c = searchDota2MatchObj;
            this.f91783d = generalSearchInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43309, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(f.this.o().q(), this.f91782c.getProtocol());
            f.this.g(this.f91783d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43308, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43307, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchDota2MatchObj searchDota2MatchObj = (SearchDota2MatchObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchDota2MatchObj.class);
        if (searchDota2MatchObj != null) {
            viewHolder.itemView.setOnClickListener(new a(searchDota2MatchObj, data));
            View viewI = viewHolder.i(R.id.tv_match_id);
            f0.o(viewI, "viewHolder.getView(R.id.tv_match_id)");
            ((TextView) viewI).setText(searchDota2MatchObj.getMatch_id());
        }
    }
}
