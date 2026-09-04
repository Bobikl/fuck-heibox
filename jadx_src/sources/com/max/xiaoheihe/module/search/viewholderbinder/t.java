package com.max.xiaoheihe.module.search.viewholderbinder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.search.max.SearchSteamUserDataObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchSteamUserVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class t extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91867l = 0;

    /* JADX INFO: compiled from: SearchSteamUserVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SearchSteamUserDataObj f91870d;

        a(GeneralSearchInfo generalSearchInfo, SearchSteamUserDataObj searchSteamUserDataObj) {
            this.f91869c = generalSearchInfo;
            this.f91870d = searchSteamUserDataObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43378, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            t.this.g(this.f91869c);
            com.max.xiaoheihe.base.router.b.k0(t.this.o().q(), this.f91870d.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43377, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43376, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchSteamUserDataObj searchSteamUserDataObj = (SearchSteamUserDataObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchSteamUserDataObj.class);
        if (searchSteamUserDataObj != null) {
            viewHolder.itemView.setOnClickListener(new a(data, searchSteamUserDataObj));
            View viewI = viewHolder.i(R.id.iv_avatar);
            f0.o(viewI, "viewHolder.getView(R.id.iv_avatar)");
            View viewI2 = viewHolder.i(R.id.tv_name);
            f0.o(viewI2, "viewHolder.getView(R.id.tv_name)");
            View viewI3 = viewHolder.i(R.id.tv_steam_id);
            f0.o(viewI3, "viewHolder.getView(R.id.tv_steam_id)");
            TextView textView = (TextView) viewI3;
            View viewI4 = viewHolder.i(R.id.iv_authentication);
            f0.o(viewI4, "viewHolder.getView(R.id.iv_authentication)");
            ImageView imageView = (ImageView) viewI4;
            com.max.hbimage.b.L(searchSteamUserDataObj.getAvatar(), (ImageView) viewI, R.drawable.ic_default_steam_avatar);
            ((TextView) viewI2).setText(searchSteamUserDataObj.getName());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SteamID：");
            String steam_id = searchSteamUserDataObj.getSteam_id();
            if (steam_id == null) {
                steam_id = "";
            }
            sb2.append(steam_id);
            textView.setText(sb2.toString());
            imageView.setVisibility(com.max.hbcommon.utils.c.x(searchSteamUserDataObj.is_authentication()) ? 0 : 8);
        }
    }
}
