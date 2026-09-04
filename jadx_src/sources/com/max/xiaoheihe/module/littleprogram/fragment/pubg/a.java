package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGDataObj;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: PUBGDataAdapterV2.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends u<PUBGDataObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f89299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f89300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f89301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f89302f;

    public a(Context context, List<PUBGDataObj> list, int i10) {
        super(context, list);
        this.f89299c = "";
        this.f89302f = 0;
        this.f89298b = i10;
    }

    public a(Context context, List<PUBGDataObj> list, int i10, String str) {
        this(context, list, i10);
        this.f89299c = str;
    }

    public a(Context context, List<PUBGDataObj> list, int i10, String str, String str2) {
        this(context, list, i10);
        this.f89299c = str;
        this.f89300d = str2;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, PUBGDataObj pUBGDataObj) {
        Object[] objArr = {new Integer(i10), pUBGDataObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39399, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, pUBGDataObj);
    }

    public int n(int i10, PUBGDataObj pUBGDataObj) {
        int i11 = this.f89298b;
        if (i11 != -1) {
            return (i10 == 0 || i10 == i11) ? R.layout.item_pubg_data_accent_v2 : R.layout.item_pubg_data_v2;
        }
        return R.layout.item_pubg_data_v2;
    }

    public void o(s.e eVar, PUBGDataObj pUBGDataObj) {
        if (PatchProxy.proxy(new Object[]{eVar, pUBGDataObj}, this, changeQuickRedirect, false, 39397, new Class[]{s.e.class, PUBGDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        switch (eVar.d()) {
            case R.layout.item_pubg_data_accent_v2 /* 2131559408 */:
                if (!com.max.hbcommon.utils.c.u(this.f89299c)) {
                    int i10 = this.f89302f;
                    if (i10 == 0) {
                        View view = eVar.itemView;
                        Integer num = this.f89301e;
                        view.setBackgroundColor(num != null ? num.intValue() : com.max.xiaoheihe.module.game.pubg.utils.c.e(this.f89299c));
                    } else {
                        View view2 = eVar.itemView;
                        Integer num2 = this.f89301e;
                        view2.setBackgroundDrawable(ViewUtils.G(i10, num2 != null ? num2.intValue() : com.max.xiaoheihe.module.game.pubg.utils.c.e(this.f89299c)));
                    }
                }
                break;
            case R.layout.item_pubg_data_v2 /* 2131559409 */:
                if (this.f89302f != 0) {
                    eVar.itemView.setBackgroundResource(R.drawable.bg_white1_b5_r3);
                }
                break;
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
                    textView.setTextColor(d.E(R.color.white_alpha50));
                }
            }
            eVar.i(R.id.tv_rank).setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(pUBGDataObj.getScore());
            textView.setAlpha(com.max.xiaoheihe.module.game.pubg.utils.c.h(pUBGDataObj.getScore()));
            textView.setTextColor(com.max.xiaoheihe.module.game.pubg.utils.c.f(pUBGDataObj.getScore()));
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
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 39400, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, (PUBGDataObj) obj);
    }

    public void p(List<PUBGDataObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 39396, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mDataList = list;
        notifyDataSetChanged();
    }

    public void q(String str) {
        this.f89299c = str;
    }

    public void r(Integer num) {
        this.f89301e = num;
    }

    public void s(Integer num) {
        if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 39398, new Class[]{Integer.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f89302f = num.intValue();
    }
}
