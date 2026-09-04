package com.max.xiaoheihe.module.search.viewholderbinder;

import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.module.bbs.HashtagDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHashtagVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class m extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91811l = 0;

    /* JADX INFO: compiled from: SearchHashtagVHB.kt */
    public static final class a implements com.max.xiaoheihe.module.bbs.adapter.t.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91813b;

        a(GeneralSearchInfo generalSearchInfo) {
            this.f91813b = generalSearchInfo;
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.t.a
        public void a(@dl.e HashtagObj hashtagObj) {
            if (PatchProxy.proxy(new Object[]{hashtagObj}, this, changeQuickRedirect, false, 43350, new Class[]{HashtagObj.class}, Void.TYPE).isSupported) {
                return;
            }
            m.this.g(this.f91813b);
            m.this.m().startActivity(HashtagDetailActivity.x2(m.this.m(), hashtagObj != null ? hashtagObj.getName() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43349, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43348, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        HashtagObj info = (HashtagObj) com.max.hbutils.utils.k.a(data.getInfo(), HashtagObj.class);
        com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.a aVar = new com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.a(m(), o().n(), new a(data), false);
        viewHolder.itemView.setTag(data);
        com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.b bVar = new com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.b(aVar);
        f0.o(info, "info");
        bVar.f(viewHolder, info);
    }
}
