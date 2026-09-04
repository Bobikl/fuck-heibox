package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GamePlatformInfoObj;
import com.max.xiaoheihe.bean.game.GamePlatformPriceObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.bean.game.GameRegionPriceObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: ConsoleGameGlobalPricesFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class g extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f87420m = "steam_appid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f87421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f87422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RadioGroup f87423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f87424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private GamePlatformPriceObj f87425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FiltersObj f87426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<GameRegionPriceObj> f87427k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<GameRegionPriceObj> f87428l;

    /* JADX INFO: compiled from: ConsoleGameGlobalPricesFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32280, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ConsoleGameGlobalPricesFragment.java */
    public class b extends com.max.hbcommon.base.adapter.s<GameRegionPriceObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameRegionPriceObj gameRegionPriceObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameRegionPriceObj}, this, changeQuickRedirect, false, 32281, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRegionPriceObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            View viewI = eVar.i(R.id.divider);
            com.max.hbimage.b.K(gameRegionPriceObj.getImage(), imageView);
            textView.setText(gameRegionPriceObj.getName());
            viewI.setVisibility(eVar.getAdapterPosition() == getDataList().size() - 1 ? 8 : 0);
            List<GamePriceObj> data = gameRegionPriceObj.getData();
            LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.ll_data_container);
            int childCount = linearLayout.getChildCount();
            if (childCount > 1) {
                linearLayout.removeViews(1, childCount - 1);
            }
            if (data == null || data.size() <= 0) {
                return;
            }
            for (int i10 = 0; i10 < data.size(); i10++) {
                GamePriceObj gamePriceObj = data.get(i10);
                View viewInflate = LayoutInflater.from(g.this.getContext()).inflate(R.layout.item_cell_platform_price, (ViewGroup) linearLayout, false);
                linearLayout.addView(viewInflate);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_rmb);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_discount);
                TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_cc_value);
                TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_discount_desc);
                bb.d.d(textView2, 2);
                bb.d.d(textView3, 2);
                if (com.max.hbcommon.utils.c.u(gamePriceObj.getCurrent())) {
                    textView2.setText("--");
                } else {
                    textView2.setText(String.format(g.this.getString(R.string.rmb_format), r1.J(gamePriceObj.getCurrent())));
                }
                if (com.max.hbcommon.utils.c.u(gamePriceObj.getCc_value())) {
                    textView4.setText("--");
                } else {
                    textView4.setText(gamePriceObj.getCc_value());
                }
                String str = com.max.hbutils.utils.n.q(gamePriceObj.getDiscount()) > 0 ? String.format("-%s%%", gamePriceObj.getDiscount()) : "";
                if (!com.max.hbcommon.utils.c.u(gamePriceObj.getDiscount_desc())) {
                    if (!com.max.hbcommon.utils.c.u(str)) {
                        str = str + " ";
                    }
                    str = str + gamePriceObj.getDiscount_desc();
                }
                if (com.max.hbcommon.utils.c.u(str)) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                    textView3.setText(str);
                }
                if (com.max.hbcommon.utils.c.u(gamePriceObj.getDeadline_date())) {
                    textView5.setVisibility(8);
                } else {
                    textView5.setVisibility(0);
                    textView5.setText(gamePriceObj.getDeadline_date());
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameRegionPriceObj gameRegionPriceObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameRegionPriceObj}, this, changeQuickRedirect, false, 32282, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameRegionPriceObj);
        }
    }

    /* JADX INFO: compiled from: ConsoleGameGlobalPricesFragment.java */
    public class c implements RadioGroup.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            List<KeyDescObj> filters;
            int i11 = 2;
            if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, 32283, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported || (filters = g.this.f87426j.getFilters()) == null || filters.size() <= 0) {
                return;
            }
            if (i10 == R.id.rb_0) {
                i11 = 0;
            } else if (i10 == R.id.rb_1) {
                i11 = 1;
            } else if (i10 != R.id.rb_2) {
                i11 = i10 == R.id.rb_3 ? 3 : -1;
            }
            if (i11 < 0 || i11 >= filters.size()) {
                return;
            }
            KeyDescObj keyDescObj = filters.get(i11);
            g gVar = g.this;
            g.O3(gVar, gVar.f87426j, keyDescObj);
            g.P3(g.this);
        }
    }

    /* JADX INFO: compiled from: ConsoleGameGlobalPricesFragment.java */
    public class d extends com.max.hbcommon.network.d<Result<GamePlatformPriceObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32284, new Class[]{Throwable.class}, Void.TYPE).isSupported && g.this.isActive()) {
                super.onError(th2);
                g.this.f87421e.setVisibility(8);
            }
        }

        public void onNext(Result<GamePlatformPriceObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32285, new Class[]{Result.class}, Void.TYPE).isSupported && g.this.isActive()) {
                super.onNext(result);
                g.this.f87421e.setVisibility(8);
                g.this.f87425i = result.getResult();
                g.S3(g.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32286, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePlatformPriceObj>) obj);
        }
    }

    static /* synthetic */ void O3(g gVar, FiltersObj filtersObj, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{gVar, filtersObj, keyDescObj}, null, changeQuickRedirect, true, 32277, new Class[]{g.class, FiltersObj.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.Y3(filtersObj, keyDescObj);
    }

    static /* synthetic */ void P3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 32278, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.U3();
    }

    static /* synthetic */ void S3(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 32279, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.X3();
    }

    private KeyDescObj T3(FiltersObj filtersObj) {
        List<KeyDescObj> filters;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj}, this, changeQuickRedirect, false, 32275, new Class[]{FiltersObj.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (filtersObj == null || (filters = filtersObj.getFilters()) == null) {
            return null;
        }
        for (KeyDescObj keyDescObj : filters) {
            if (keyDescObj.isChecked()) {
                return keyDescObj;
            }
        }
        return null;
    }

    private void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32274, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        FiltersObj filtersObj = this.f87426j;
        if (filtersObj != null) {
            String key = filtersObj.getKey();
            KeyDescObj keyDescObjT3 = T3(this.f87426j);
            if (keyDescObjT3 != null) {
                map.put(key, keyDescObjT3.getKey());
            }
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u0(this.f87424h, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static g V3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 32268, new Class[]{String.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putString("steam_appid", str);
        gVar.setArguments(bundle);
        return gVar;
    }

    private void W3(FiltersObj filtersObj) {
        if (PatchProxy.proxy(new Object[]{filtersObj}, this, changeQuickRedirect, false, 32272, new Class[]{FiltersObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (this.f87426j != null) {
            return;
        }
        this.f87426j = filtersObj;
        this.f87423g.removeAllViews();
        this.f87423g.setOnCheckedChangeListener(null);
        List<KeyDescObj> filters = this.f87426j.getFilters();
        if (filters != null && filters.size() > 0) {
            int[] iArr = {R.id.rb_0, R.id.rb_1, R.id.rb_2, R.id.rb_3};
            for (int i10 = 0; i10 < filters.size(); i10++) {
                KeyDescObj keyDescObj = filters.get(i10);
                if (i10 != 0) {
                    View view = new View(context);
                    view.setLayoutParams(new RadioGroup.LayoutParams(ViewUtils.f(context, 1.0f), -1));
                    view.setBackgroundDrawable(getResources().getDrawable(R.color.checked_color));
                    this.f87423g.addView(view);
                }
                RadioButton radioButton = new RadioButton(context);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(0, -1);
                layoutParams.weight = 1.0f;
                radioButton.setLayoutParams(layoutParams);
                if (i10 < 4) {
                    radioButton.setId(iArr[i10]);
                }
                radioButton.setButtonDrawable((Drawable) null);
                radioButton.setGravity(17);
                radioButton.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
                radioButton.setTextColor(context.getResources().getColorStateList(R.color.rb_tab_color));
                if (i10 == 0) {
                    radioButton.setBackgroundDrawable(com.max.xiaoheihe.utils.d.g0(context));
                } else if (i10 == filters.size() - 1) {
                    radioButton.setBackgroundDrawable(com.max.xiaoheihe.utils.d.h0(context));
                } else {
                    radioButton.setBackgroundDrawable(com.max.xiaoheihe.utils.d.f0(context));
                }
                radioButton.setText(keyDescObj.getDesc());
                this.f87423g.addView(radioButton);
                if (i10 == 0) {
                    radioButton.setChecked(true);
                }
            }
        }
        this.f87423g.setOnCheckedChangeListener(new c());
    }

    private void X3() {
        GamePlatformPriceObj gamePlatformPriceObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32271, new Class[0], Void.TYPE).isSupported || (gamePlatformPriceObj = this.f87425i) == null) {
            return;
        }
        List<GameRegionPriceObj> list = gamePlatformPriceObj.getList();
        List<GamePlatformInfoObj> platforms = this.f87425i.getPlatforms();
        this.f87425i.getFilters();
        if (list != null && list.size() > 0) {
            int childCount = this.f87422f.getChildCount();
            if (childCount > 1) {
                this.f87422f.removeViews(1, childCount - 1);
            }
            if (platforms != null && platforms.size() > 0) {
                for (int i10 = 0; i10 < platforms.size(); i10++) {
                    GamePlatformInfoObj gamePlatformInfoObj = platforms.get(i10);
                    View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_cell_platform_price_header, (ViewGroup) this.f87422f, false);
                    this.f87422f.addView(viewInflate);
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
                    com.max.hbimage.b.K(gamePlatformInfoObj.getImg_url(), imageView);
                    imageView.setColorFilter(getResources().getColor(R.color.text_secondary_1_color));
                    textView.setText(gamePlatformInfoObj.getValue());
                }
            }
            this.f87427k.clear();
            this.f87427k.addAll(list);
            this.f87428l.notifyDataSetChanged();
        }
        if (this.f87425i.getFilters() == null || this.f87425i.getFilters().size() <= 0 || this.f87425i.getFilters().get(0).getFilters() == null || this.f87425i.getFilters().get(0).getFilters().size() <= 0) {
            this.f87423g.setVisibility(8);
        } else {
            this.f87423g.setVisibility(0);
            W3(this.f87425i.getFilters().get(0));
        }
    }

    private void Y3(FiltersObj filtersObj, KeyDescObj keyDescObj) {
        List<KeyDescObj> filters;
        if (PatchProxy.proxy(new Object[]{filtersObj, keyDescObj}, this, changeQuickRedirect, false, 32276, new Class[]{FiltersObj.class, KeyDescObj.class}, Void.TYPE).isSupported || filtersObj == null || keyDescObj == null || (filters = filtersObj.getFilters()) == null) {
            return;
        }
        for (KeyDescObj keyDescObj2 : filters) {
            if (keyDescObj2.getKey() == null || !keyDescObj2.getKey().equals(keyDescObj.getKey())) {
                keyDescObj2.setChecked(false);
            } else {
                keyDescObj2.setChecked(true);
            }
        }
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 32269, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f87424h = getArguments().getString("steam_appid");
        }
        return layoutInflater.inflate(R.layout.fragment_console_game_global_prices, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32273, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        U3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 32270, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new a());
        this.f87422f = (LinearLayout) view.findViewById(R.id.ll_header_data_container);
        this.f87423g = (RadioGroup) view.findViewById(R.id.rg_filter);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_game_global_prices);
        this.f87421e = (ProgressBar) view.findViewById(R.id.progress);
        this.f87428l = new b(getContext(), this.f87427k, R.layout.item_platform_price);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(this.f87428l);
    }
}
