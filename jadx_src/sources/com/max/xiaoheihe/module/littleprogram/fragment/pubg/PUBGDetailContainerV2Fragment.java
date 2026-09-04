package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbcommon.base.adapter.n;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.sa;
import dl.e;
import java.util.ArrayList;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: PUBGDetailContainerV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nPUBGDetailContainerV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PUBGDetailContainerV2Fragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGDetailContainerV2Fragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,204:1\n1#2:205\n262#3,2:206\n262#3,2:208\n*S KotlinDebug\n*F\n+ 1 PUBGDetailContainerV2Fragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGDetailContainerV2Fragment\n*L\n99#1:206,2\n105#1:208,2\n*E\n"})
@n9.a({com.max.hbminiprogram.d.class})
@o(parameters = 0)
public final class PUBGDetailContainerV2Fragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.d {

    @dl.d
    public static final a C = new a(null);
    public static final int D = 8;

    @dl.d
    public static final String E = "footer_bg_img";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String A;

    @dl.d
    private final ArrayList<Fragment> B = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private sa f89174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @e
    private ArrayList<KeyDescObj> f89175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @e
    private String f89176v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e
    private String f89177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @e
    private String f89178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @e
    private String f89179y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @e
    private String f89180z;

    /* JADX INFO: compiled from: PUBGDetailContainerV2Fragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final PUBGDetailContainerV2Fragment a(@e ArrayList<KeyDescObj> arrayList, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 39409, new Class[]{ArrayList.class, String.class, String.class, String.class, String.class, String.class, String.class}, PUBGDetailContainerV2Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PUBGDetailContainerV2Fragment) patchProxyResultProxy.result;
            }
            PUBGDetailContainerV2Fragment pUBGDetailContainerV2Fragment = new PUBGDetailContainerV2Fragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("region_filter", arrayList);
            bundle.putString("nickname", str);
            bundle.putString("mode", str2);
            bundle.putString("season", str3);
            bundle.putString("region", str4);
            bundle.putString("fpp", str5);
            bundle.putString("player_id", str6);
            pUBGDetailContainerV2Fragment.setArguments(bundle);
            return pUBGDetailContainerV2Fragment;
        }
    }

    /* JADX INFO: compiled from: PUBGDetailContainerV2Fragment.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39410, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailContainerV2Fragment.U4(PUBGDetailContainerV2Fragment.this);
            PUBGDetailContainerV2Fragment.this.J4().f111334f.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailContainerV2Fragment.kt */
    public static final class c implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39411, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            sa saVar = PUBGDetailContainerV2Fragment.this.f89174t;
            if (saVar == null) {
                f0.S("binding");
                saVar = null;
            }
            saVar.f115519b.c(i10);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailContainerV2Fragment.kt */
    public static final class d implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj data, int i10) {
            if (PatchProxy.proxy(new Object[]{data, new Integer(i10)}, this, changeQuickRedirect, false, 39412, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            sa saVar = PUBGDetailContainerV2Fragment.this.f89174t;
            if (saVar == null) {
                f0.S("binding");
                saVar = null;
            }
            saVar.f115520c.setCurrentItem(i10, true);
        }
    }

    public static final /* synthetic */ void U4(PUBGDetailContainerV2Fragment pUBGDetailContainerV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailContainerV2Fragment}, null, changeQuickRedirect, true, 39408, new Class[]{PUBGDetailContainerV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailContainerV2Fragment.W4();
    }

    private final void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39406, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        Bundle arguments = getArguments();
        f0.m(arguments);
        this.f89175u = (ArrayList) arguments.getSerializable("region_filter");
        Bundle arguments2 = getArguments();
        f0.m(arguments2);
        this.f89176v = arguments2.getString("nickname");
        Bundle arguments3 = getArguments();
        f0.m(arguments3);
        this.f89177w = arguments3.getString("mode");
        Bundle arguments4 = getArguments();
        f0.m(arguments4);
        this.f89178x = arguments4.getString("season");
        Bundle arguments5 = getArguments();
        f0.m(arguments5);
        this.f89179y = arguments5.getString("region");
        Bundle arguments6 = getArguments();
        f0.m(arguments6);
        this.f89180z = arguments6.getString("fpp");
        Bundle arguments7 = getArguments();
        f0.m(arguments7);
        String string = arguments7.getString("player_id");
        this.A = string;
        if (TextUtils.isEmpty(string)) {
            this.A = this.f89176v;
        }
    }

    private final void W4() {
        sa saVar;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39405, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.f89175u)) {
            ArrayList arrayList = new ArrayList();
            ArrayList<KeyDescObj> arrayList2 = this.f89175u;
            f0.m(arrayList2);
            int size = arrayList2.size();
            while (true) {
                saVar = null;
                String key = null;
                if (i10 >= size) {
                    break;
                }
                ArrayList<Fragment> arrayList3 = this.B;
                PUBGDetailV2Fragment.a aVar = PUBGDetailV2Fragment.f89184t;
                String str = this.f89176v;
                String str2 = this.f89177w;
                String str3 = this.f89178x;
                String str4 = this.f89180z;
                ArrayList<KeyDescObj> arrayList4 = this.f89175u;
                f0.m(arrayList4);
                KeyDescObj keyDescObj = arrayList4.get(i10);
                arrayList3.add(aVar.a(str, str2, str3, str4, keyDescObj != null ? keyDescObj.getKey() : null, this.A));
                KeyDescObj keyDescObj2 = new KeyDescObj();
                ArrayList<KeyDescObj> arrayList5 = this.f89175u;
                f0.m(arrayList5);
                KeyDescObj keyDescObj3 = arrayList5.get(i10);
                String value = keyDescObj3 != null ? keyDescObj3.getValue() : null;
                keyDescObj2.setKey(value);
                keyDescObj2.setDesc(value);
                ArrayList<KeyDescObj> arrayList6 = this.f89175u;
                f0.m(arrayList6);
                KeyDescObj keyDescObj4 = arrayList6.get(i10);
                if (keyDescObj4 != null) {
                    key = keyDescObj4.getKey();
                }
                keyDescObj2.setChecked(f0.g(key, this.f89179y));
                arrayList.add(keyDescObj2);
                i10++;
            }
            n nVar = new n(getChildFragmentManager(), this.B);
            sa saVar2 = this.f89174t;
            if (saVar2 == null) {
                f0.S("binding");
                saVar2 = null;
            }
            saVar2.f115520c.setAdapter(nVar);
            sa saVar3 = this.f89174t;
            if (saVar3 == null) {
                f0.S("binding");
                saVar3 = null;
            }
            saVar3.f115520c.c(new c());
            sa saVar4 = this.f89174t;
            if (saVar4 == null) {
                f0.S("binding");
                saVar4 = null;
            }
            saVar4.f115519b.setNormalBgColorId(R.color.transparent);
            sa saVar5 = this.f89174t;
            if (saVar5 == null) {
                f0.S("binding");
                saVar5 = null;
            }
            saVar5.f115519b.setSelectBgColorId(R.color.white_alpha5);
            sa saVar6 = this.f89174t;
            if (saVar6 == null) {
                f0.S("binding");
                saVar6 = null;
            }
            saVar6.f115519b.setNormalTextColorId(R.color.white_alpha50);
            sa saVar7 = this.f89174t;
            if (saVar7 == null) {
                f0.S("binding");
                saVar7 = null;
            }
            saVar7.f115519b.setSelectTextColorId(R.color.white);
            sa saVar8 = this.f89174t;
            if (saVar8 == null) {
                f0.S("binding");
                saVar8 = null;
            }
            saVar8.f115519b.setMOnTabCheckedListener(new d());
            sa saVar9 = this.f89174t;
            if (saVar9 == null) {
                f0.S("binding");
                saVar9 = null;
            }
            saVar9.f115519b.setData(arrayList);
            sa saVar10 = this.f89174t;
            if (saVar10 == null) {
                f0.S("binding");
            } else {
                saVar = saVar10;
            }
            saVar.f115519b.d();
            nVar.notifyDataSetChanged();
        }
        showContentView();
    }

    @dl.d
    @m
    public static final PUBGDetailContainerV2Fragment X4(@e ArrayList<KeyDescObj> arrayList, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 39407, new Class[]{ArrayList.class, String.class, String.class, String.class, String.class, String.class, String.class}, PUBGDetailContainerV2Fragment.class);
        return patchProxyResultProxy.isSupported ? (PUBGDetailContainerV2Fragment) patchProxyResultProxy.result : C.a(arrayList, str, str2, str3, str4, str5, str6);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39403, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        sa saVarC = sa.c(this.mInflater);
        f0.o(saVarC, "inflate(mInflater)");
        this.f89174t = saVarC;
        V4();
        sa saVar = this.f89174t;
        sa saVar2 = null;
        if (saVar == null) {
            f0.S("binding");
            saVar = null;
        }
        saVar.b().postDelayed(new b(), 500L);
        sa saVar3 = this.f89174t;
        if (saVar3 == null) {
            f0.S("binding");
        } else {
            saVar2 = saVar3;
        }
        LinearLayout linearLayoutB = saVar2.b();
        f0.o(linearLayoutB, "binding.root");
        return linearLayoutB;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    public boolean O4() {
        return false;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    public void S4() {
        String string;
        String string2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39402, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.S4();
        ColorDrawable colorDrawable = new ColorDrawable(PUBGGameDataV2Fragment.V.a());
        J4().f111330b.setImageDrawable(colorDrawable);
        J4().f111336h.setBackgroundResource(R.color.pubg_bg_main_color);
        Bundle arguments = getArguments();
        b2 b2Var = null;
        if (arguments != null && (string2 = arguments.getString(PUBGCommonContainerFragment.B)) != null) {
            if (!(!kotlin.text.u.V1(string2))) {
                string2 = null;
            }
            if (string2 != null) {
                J4().f111330b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                com.max.hbimage.b.U(string2, J4().f111330b, colorDrawable);
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString(PUBGCommonContainerFragment.C)) != null) {
            if (!(!kotlin.text.u.V1(string))) {
                string = null;
            }
            if (string != null) {
                LottieAnimationView updateBackgroundRes$lambda$4$lambda$3 = J4().f111333e;
                f0.o(updateBackgroundRes$lambda$4$lambda$3, "updateBackgroundRes$lambda$4$lambda$3");
                updateBackgroundRes$lambda$4$lambda$3.setVisibility(0);
                updateBackgroundRes$lambda$4$lambda$3.setFailureListener(r.f95734k);
                updateBackgroundRes$lambda$4$lambda$3.setAnimationFromUrl(string, PUBGGameDataV2Fragment.f89224b0);
                updateBackgroundRes$lambda$4$lambda$3.E();
                b2Var = b2.f124493a;
            }
        }
        if (b2Var == null) {
            LottieAnimationView lottieAnimationView = J4().f111333e;
            f0.o(lottieAnimationView, "baseBinding.lottieBg");
            lottieAnimationView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @e
    public Fragment a2(@e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39401, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) map.get("region_filter");
        ArrayList arrayList2 = new ArrayList();
        f0.m(arrayList);
        for (Object obj : arrayList) {
            if (obj instanceof KeyDescObj) {
                arrayList2.add(obj);
            }
        }
        return C.a(arrayList2, (String) map.get("nickname"), (String) map.get("mode"), (String) map.get("season"), (String) map.get("region"), (String) map.get("fpp"), (String) map.get("player_id"));
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39404, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        LottieAnimationView lottieAnimationView = J4().f111333e;
        if (lottieAnimationView.A()) {
            lottieAnimationView.p();
        }
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.setVisibility(8);
    }
}
