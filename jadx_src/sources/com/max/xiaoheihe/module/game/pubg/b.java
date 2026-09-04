package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGDataObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: PUBGDataAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends u<PUBGDataObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f88155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f88156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f88157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f88158e;

    public b(Context context, List<PUBGDataObj> list, int i10) {
        super(context, list);
        this.f88156c = "";
        this.f88155b = i10;
    }

    public b(Context context, List<PUBGDataObj> list, int i10, String str) {
        this(context, list, i10);
        this.f88156c = str;
    }

    public b(Context context, List<PUBGDataObj> list, int i10, String str, String str2) {
        this(context, list, i10);
        this.f88156c = str;
        this.f88157d = str2;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, PUBGDataObj pUBGDataObj) {
        Object[] objArr = {new Integer(i10), pUBGDataObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38167, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, pUBGDataObj);
    }

    public int n(int i10, PUBGDataObj pUBGDataObj) {
        int i11 = this.f88155b;
        if (i11 != -1) {
            return (i10 == 0 || i10 == i11) ? R.layout.item_pubg_data_accent : R.layout.item_pubg_data;
        }
        return R.layout.item_pubg_data;
    }

    public void o(s.e eVar, PUBGDataObj pUBGDataObj) {
        if (PatchProxy.proxy(new Object[]{eVar, pUBGDataObj}, this, changeQuickRedirect, false, 38166, new Class[]{s.e.class, PUBGDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (eVar.d() == R.layout.item_pubg_data_accent && !com.max.hbcommon.utils.c.u(this.f88156c)) {
            View view = eVar.itemView;
            Integer num = this.f88158e;
            view.setBackgroundColor(num != null ? num.intValue() : com.max.xiaoheihe.module.game.pubg.utils.c.b(this.f88157d, this.f88156c));
        }
        TextView textView = (TextView) eVar.i(R.id.tv_score);
        if (com.max.hbcommon.utils.c.u(pUBGDataObj.getScore())) {
            if (com.max.hbcommon.utils.c.u(pUBGDataObj.getRank())) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(pUBGDataObj.getRank());
                textView.setAlpha(1.0f);
                textView.setTextSize(1, 8.0f);
                if (eVar.d() != R.layout.item_pubg_data_accent) {
                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                }
            }
            eVar.i(R.id.tv_rank).setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(pUBGDataObj.getScore());
            textView.setAlpha(com.max.xiaoheihe.module.game.pubg.utils.c.h(pUBGDataObj.getScore()));
            textView.setTextColor(com.max.xiaoheihe.module.game.pubg.utils.c.i(pUBGDataObj.getScore()));
            textView.setTextSize(1, 12.0f);
            if (com.max.hbcommon.utils.c.u(pUBGDataObj.getRank())) {
                eVar.i(R.id.tv_rank).setVisibility(8);
            } else {
                eVar.p(R.id.tv_rank, pUBGDataObj.getRank());
                eVar.i(R.id.tv_rank).setVisibility(0);
            }
        }
        eVar.p(R.id.tv_value, pUBGDataObj.getValue());
        eVar.p(R.id.tv_desc, pUBGDataObj.getDesc());
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 38168, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, (PUBGDataObj) obj);
    }

    public void p(List<PUBGDataObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 38165, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mDataList = list;
        notifyDataSetChanged();
    }

    public void q(String str) {
        this.f88156c = str;
    }

    public void r(Integer num) {
        this.f88158e = num;
    }
}
