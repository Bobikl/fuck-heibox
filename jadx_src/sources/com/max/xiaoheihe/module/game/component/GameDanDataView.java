package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.MMRInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameDanDataView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameDanDataView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86672h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f86673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f86674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f86675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f86676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f86677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private List<KeyDescObj> f86678g;

    /* JADX INFO: compiled from: GameDanDataView.kt */
    public static final class a extends s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List<KeyDescObj> list) {
            super(context, list, R.layout.item_game_overview_mmr_data);
        }

        public void m(@e s.e eVar, @e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 36458, new Class[]{s.e.class, KeyDescObj.class}, Void.TYPE).isSupported || eVar == null || keyDescObj == null) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_value);
            TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
            textView.setText(keyDescObj.getValue());
            textView2.setText(keyDescObj.getDesc());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 36459, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    public GameDanDataView(@e Context context) {
        this(context, null);
    }

    public GameDanDataView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameDanDataView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameDanDataView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f86678g = new ArrayList();
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36456, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setBackground(q.i(getContext(), R.color.white_alpha3, R.color.white_alpha10, 0.5f, ViewUtils.h0(getContext(), ViewUtils.m(getContext(), (ViewUtils.L(getContext()) / 2) - ViewUtils.f(getContext(), 33.0f), ViewUtils.f(getContext(), 64.0f)))));
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_game_dan_icon, (ViewGroup) null);
        f0.o(viewInflate, "from(context).inflate(R.…yout_game_dan_icon, null)");
        setVg_dan_icon(viewInflate);
        getVg_dan_icon().setId(R.id.vg_dan_icon);
        View viewFindViewById = getVg_dan_icon().findViewById(R.id.iv_dan);
        f0.o(viewFindViewById, "vg_dan_icon.findViewById(R.id.iv_dan)");
        setIv_dan((ImageView) viewFindViewById);
        View viewFindViewById2 = getVg_dan_icon().findViewById(R.id.tv_dan_number);
        f0.o(viewFindViewById2, "vg_dan_icon.findViewById(R.id.tv_dan_number)");
        setTv_dan_number((TextView) viewFindViewById2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.setMarginStart(ViewUtils.f(getContext(), 9.0f));
        layoutParams.setMarginEnd(ViewUtils.f(getContext(), 9.0f));
        boolean z10 = ViewUtils.L(getContext()) <= ViewUtils.f(getContext(), 360.0f);
        if (z10) {
            int iF = ViewUtils.f(getContext(), 40.0f);
            layoutParams.width = iF;
            layoutParams.height = iF;
            ViewGroup.LayoutParams layoutParams2 = getTv_dan_number().getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = -ViewUtils.f(getContext(), 1.0f);
        } else {
            int iF2 = ViewUtils.f(getContext(), 50.0f);
            layoutParams.width = iF2;
            layoutParams.height = iF2;
        }
        getVg_dan_icon().setLayoutParams(layoutParams);
        addView(getVg_dan_icon());
        setTv_dan_name(new TextView(getContext()));
        getTv_dan_name().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        getTv_dan_name().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        getTv_dan_name().setTextSize(1, 14.0f);
        getTv_dan_name().setMaxLines(1);
        getTv_dan_name().setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(17, R.id.vg_dan_icon);
        layoutParams3.addRule(6, R.id.vg_dan_icon);
        layoutParams3.topMargin = !z10 ? ViewUtils.f(getContext(), 5.0f) : 0;
        getTv_dan_name().setLayoutParams(layoutParams3);
        addView(getTv_dan_name());
        setRv_dan_datas(new RecyclerView(getContext()));
        getRv_dan_datas().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getRv_dan_datas().setAdapter(new a(getContext(), this.f86678g));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(17, R.id.vg_dan_icon);
        layoutParams4.addRule(8, R.id.vg_dan_icon);
        layoutParams4.bottomMargin = z10 ? 0 : ViewUtils.f(getContext(), 5.0f);
        getRv_dan_datas().setLayoutParams(layoutParams4);
        addView(getRv_dan_datas());
    }

    @d
    public final List<KeyDescObj> getDataList() {
        return this.f86678g;
    }

    @d
    public final ImageView getIv_dan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36447, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86674c;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_dan");
        return null;
    }

    @d
    public final RecyclerView getRv_dan_datas() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36453, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f86677f;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("rv_dan_datas");
        return null;
    }

    @d
    public final TextView getTv_dan_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36451, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86676e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_dan_name");
        return null;
    }

    @d
    public final TextView getTv_dan_number() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36449, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86675d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_dan_number");
        return null;
    }

    @d
    public final View getVg_dan_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36445, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86673b;
        if (view != null) {
            return view;
        }
        f0.S("vg_dan_icon");
        return null;
    }

    public final void setData(@e MMRInfo mMRInfo) {
        if (PatchProxy.proxy(new Object[]{mMRInfo}, this, changeQuickRedirect, false, 36457, new Class[]{MMRInfo.class}, Void.TYPE).isSupported || mMRInfo == null) {
            return;
        }
        com.max.hbimage.b.K(mMRInfo.getDan_icon(), getIv_dan());
        getTv_dan_number().setText(mMRInfo.getDan_value());
        getTv_dan_name().setText(mMRInfo.getDan_name());
        this.f86678g.clear();
        List<KeyDescObj> match_stats = mMRInfo.getMatch_stats();
        if (match_stats != null) {
            this.f86678g.addAll(match_stats);
        }
        RecyclerView.Adapter adapter = getRv_dan_datas().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setDataList(@d List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36455, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f86678g = list;
    }

    public final void setIv_dan(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36448, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86674c = imageView;
    }

    public final void setRv_dan_datas(@d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 36454, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f86677f = recyclerView;
    }

    public final void setTv_dan_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36452, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86676e = textView;
    }

    public final void setTv_dan_number(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36450, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86675d = textView;
    }

    public final void setVg_dan_icon(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36446, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86673b = view;
    }
}
