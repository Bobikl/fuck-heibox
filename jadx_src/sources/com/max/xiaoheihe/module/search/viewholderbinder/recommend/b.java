package com.max.xiaoheihe.module.search.viewholderbinder.recommend;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRecGameVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class b extends g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f91846f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d f param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.recommend.g, cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, HeyBoxContentObj heyBoxContentObj) {
        if (PatchProxy.proxy(new Object[]{eVar, heyBoxContentObj}, this, changeQuickRedirect, false, 43431, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, heyBoxContentObj);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.recommend.g
    public void f(@dl.d s.e viewHolder, @dl.d HeyBoxContentObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43430, new Class[]{s.e.class, HeyBoxContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        Object data2 = data.getData();
        f0.n(data2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.GameObj");
        ((GameItemView) viewHolder.i(R.id.giv)).g((GameObj) data2, GameObj.KEY_POINT_GAME_PLATFORM, null, true, null, viewHolder);
        View viewB = viewHolder.b();
        int iF = ViewUtils.f(i(), 12.0f);
        ViewGroup.LayoutParams layoutParams = viewB.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.leftMargin != iF) {
            marginLayoutParams.topMargin = iF;
            marginLayoutParams.bottomMargin = iF;
            marginLayoutParams.rightMargin = iF;
            marginLayoutParams.leftMargin = iF;
            viewB.setLayoutParams(marginLayoutParams);
        }
    }
}
