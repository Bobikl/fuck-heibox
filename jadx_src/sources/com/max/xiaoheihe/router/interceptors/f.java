package com.max.xiaoheihe.router.interceptors;

import android.util.Log;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameDetailTagWrapperObj;
import com.max.xiaoheihe.module.game.GameParticularTagListActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.open.SocialConstants;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameRankListInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nGameRankListInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameRankListInterceptor.kt\ncom/max/xiaoheihe/router/interceptors/GameRankListInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class f implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94971b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94972a = f.class.getSimpleName();

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48117, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        KeyDescObj keyDescObj = null;
        try {
            Map map = (Map) m.f(request, "game_tag");
            if (map != null) {
                keyDescObj = new KeyDescObj();
                keyDescObj.setFilter_head((String) map.get("filter_head"));
                keyDescObj.setDesc((String) map.get(SocialConstants.PARAM_APP_DESC));
                if (map.get("categories_id") != null) {
                    keyDescObj.setType(GameDetailTagWrapperObj.TYPE_GENRES);
                    keyDescObj.setKey((String) map.get("categories_id"));
                } else {
                    keyDescObj.setKey((String) map.get("key"));
                }
            }
            String strG = m.g(request, "platform");
            if (!com.max.hbcommon.utils.c.u(strG)) {
                if (keyDescObj == null) {
                    keyDescObj = new KeyDescObj();
                }
                keyDescObj.setFilter_head(strG);
                keyDescObj.setDesc(com.max.xiaoheihe.utils.d.n0(R.string.bbs_rank));
            }
            if (keyDescObj != null) {
                keyDescObj.setList_type(m.g(request, "sort_type"));
                keyDescObj.setSort(m.g(request, "sort_type"));
                m.k(request, "tag", keyDescObj);
            }
            m.l(request, GameParticularTagListActivity.O, m.g(request, GameParticularTagListActivity.O));
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message != null) {
                Log.e(this.f94972a, message);
            }
        }
        callback.a();
    }

    public final String b() {
        return this.f94972a;
    }
}
