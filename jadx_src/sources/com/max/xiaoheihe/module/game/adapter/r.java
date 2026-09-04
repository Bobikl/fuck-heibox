package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.github.mikephil.charting.data.Entry;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameDetailDataObj;
import com.max.xiaoheihe.bean.game.GamePeakValueObj;
import com.max.xiaoheihe.module.game.component.GameDetailDataItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GameDataAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class r extends com.max.hbcommon.base.adapter.s<GameDetailDataObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f85950c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85951b;

    /* JADX INFO: compiled from: GameDataAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameDetailDataObj f85952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f85953c;

        a(GameDetailDataObj gameDetailDataObj, r rVar) {
            this.f85952b = gameDetailDataObj;
            this.f85953c = rVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String protocol;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35583, new Class[]{View.class}, Void.TYPE).isSupported || (protocol = this.f85952b.getProtocol()) == null) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f85953c.m(), protocol);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@dl.d Context context, @dl.d List<GameDetailDataObj> list) {
        super(context, list, R.layout.item_expandable_grid);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f85951b = context;
    }

    @dl.d
    public final Context m() {
        return this.f85951b;
    }

    public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameDetailDataObj gameDetailDataObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameDetailDataObj}, this, changeQuickRedirect, false, 35581, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameDetailDataObj.class}, Void.TYPE).isSupported || gameDetailDataObj == null || eVar == null) {
            return;
        }
        eVar.itemView.getLayoutParams().width = -1;
        eVar.itemView.setOnClickListener(new a(gameDetailDataObj, this));
        GameDetailDataItemView gameDetailDataItemView = (GameDetailDataItemView) eVar.i(R.id.gddiv);
        if (com.max.hbcommon.utils.c.u(gameDetailDataObj.getProtocol())) {
            gameDetailDataItemView.setBackground(com.max.hbutils.utils.q.o(this.f85951b, R.color.background_card_1_color_alpha60, 0.0f));
            gameDetailDataItemView.setDesc(gameDetailDataObj.getDesc());
        } else {
            gameDetailDataItemView.setBackground(com.max.hbutils.utils.q.d(this.f85951b, R.color.background_card_1_color_alpha60, R.color.background_card_1_color_alpha30, 0.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gameDetailDataObj.getDesc() + "  \uf0da");
            com.max.hbcustomview.spans.g gVar = new com.max.hbcustomview.spans.g(bb.d.a().b(0));
            String desc = gameDetailDataObj.getDesc();
            spannableStringBuilder.setSpan(gVar, desc != null ? desc.length() : 0, spannableStringBuilder.length(), 17);
            gameDetailDataItemView.getTv_desc().setText(spannableStringBuilder);
        }
        gameDetailDataItemView.setRank(gameDetailDataObj.getRank(), gameDetailDataObj.getDelta());
        if (com.max.hbcommon.utils.c.w(gameDetailDataObj.getPeak_values())) {
            if (gameDetailDataObj.getHb_rich_text() != null) {
                gameDetailDataItemView.setType(GameDetailDataItemView.ValueType.OnlyValue);
                gameDetailDataItemView.getTv_value().setRichText(gameDetailDataObj.getHb_rich_text());
                return;
            } else {
                gameDetailDataItemView.setType(GameDetailDataItemView.ValueType.Text);
                gameDetailDataItemView.setValueText(gameDetailDataObj.getValue());
                return;
            }
        }
        gameDetailDataItemView.setType(GameDetailDataItemView.ValueType.Chart);
        ArrayList arrayList = new ArrayList();
        List<GamePeakValueObj> peak_values = gameDetailDataObj.getPeak_values();
        kotlin.jvm.internal.f0.m(peak_values);
        int size = peak_values.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<GamePeakValueObj> peak_values2 = gameDetailDataObj.getPeak_values();
            kotlin.jvm.internal.f0.m(peak_values2);
            GamePeakValueObj gamePeakValueObj = peak_values2.get(i10);
            arrayList.add(new Entry(i10, com.max.hbutils.utils.n.p(gamePeakValueObj != null ? gamePeakValueObj.getPeak_value() : null)));
        }
        gameDetailDataItemView.setValueChart(arrayList);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameDetailDataObj gameDetailDataObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameDetailDataObj}, this, changeQuickRedirect, false, 35582, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, gameDetailDataObj);
    }
}
