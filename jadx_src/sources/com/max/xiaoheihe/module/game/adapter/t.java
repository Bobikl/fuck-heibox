package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.widget.TextView;
import com.max.hbcommon.bean.question.OptionObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: GameImpressionAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class t extends com.max.hbcommon.base.adapter.s<OptionObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86368d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f86369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f86370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@dl.d Context context, @dl.d List<OptionObj> list) {
        super(context, list, R.layout.item_game_impression);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f86369b = context;
        this.f86370c = ViewUtils.h0(context, ViewUtils.m(context, ViewUtils.f(context, 62.0f), ViewUtils.f(context, 20.0f)));
    }

    @dl.d
    public final Context m() {
        return this.f86369b;
    }

    public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e OptionObj optionObj) {
        if (PatchProxy.proxy(new Object[]{eVar, optionObj}, this, changeQuickRedirect, false, 35632, new Class[]{com.max.hbcommon.base.adapter.s.e.class, OptionObj.class}, Void.TYPE).isSupported || optionObj == null || eVar == null) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_game_impression);
        textView.setText(optionObj.getO_desc());
        textView.setBackground(com.max.hbutils.utils.q.o(this.f86369b, optionObj.isPositive() ? R.color.battery_charging : R.color.white_alpha10, this.f86370c));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, OptionObj optionObj) {
        if (PatchProxy.proxy(new Object[]{eVar, optionObj}, this, changeQuickRedirect, false, 35633, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, optionObj);
    }
}
