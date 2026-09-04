package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ka0;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ScreenshotViewPager.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nScreenshotViewPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotViewPager.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/view/ScreenshotViewPager\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,227:1\n29#2:228\n5#2,2:229\n22#2:231\n7#2:232\n*S KotlinDebug\n*F\n+ 1 ScreenshotViewPager.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/view/ScreenshotViewPager\n*L\n103#1:228\n103#1:229,2\n103#1:231\n103#1:232\n*E\n"})
@o(parameters = 0)
public final class ScreenshotViewPager extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f87602p = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private ViewPager2 f87603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private RecyclerView f87604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private s<BBSTextObj> f87605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e
    private s<BBSTextObj> f87606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d
    private ArrayList<BBSTextObj> f87607o;

    /* JADX INFO: compiled from: ScreenshotViewPager.kt */
    public static final class a extends s<BBSTextObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.view.ScreenshotViewPager$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScreenshotViewPager.kt */
        public static final class ViewOnClickListenerC0800a implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final ViewOnClickListenerC0800a f87609b = new ViewOnClickListenerC0800a();
            public static ChangeQuickRedirect changeQuickRedirect;

            ViewOnClickListenerC0800a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }

        /* JADX INFO: compiled from: ScreenshotViewPager.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ScreenshotViewPager f87610b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageView f87611c;

            b(ScreenshotViewPager screenshotViewPager, ImageView imageView) {
                this.f87610b = screenshotViewPager;
                this.f87611c = imageView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArrayList arrayList;
                int size;
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37787, new Class[]{View.class}, Void.TYPE).isSupported && (size = (arrayList = this.f87610b.f87607o).size()) > 0) {
                    String[] strArr = new String[size];
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        Object obj = arrayList.get(i11);
                        f0.o(obj, "screenshotList[i]");
                        BBSTextObj bBSTextObj = (BBSTextObj) obj;
                        strArr[i11] = bBSTextObj.getUrl();
                        if (bBSTextObj.isChecked()) {
                            i10 = i11;
                        }
                    }
                    ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
                    Context context = this.f87610b.getContext();
                    f0.o(context, "context");
                    ImageViewerHelper.a aVarA = companion.a(context);
                    ImageView ivThumb = this.f87611c;
                    f0.o(ivThumb, "ivThumb");
                    aVarA.m(companion.d(ivThumb, i10), strArr).d(i10).p();
                }
            }
        }

        a(Context context, ArrayList<BBSTextObj> arrayList) {
            super(context, arrayList, R.layout.item_video_big_screen);
        }

        public void m(@d s.e viewHolder, @d BBSTextObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 37785, new Class[]{s.e.class, BBSTextObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_video_thumb);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_video_play);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            com.max.hbimage.b.L(data.getUrl(), imageView, R.drawable.common_default_placeholder_375x210);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (com.max.hbcommon.utils.c.u(data.getUrl())) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.setOnClickListener(ViewOnClickListenerC0800a.f87609b);
            }
            imageView.setOnClickListener(new b(ScreenshotViewPager.this, imageView));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSTextObj bBSTextObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTextObj}, this, changeQuickRedirect, false, 37786, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTextObj);
        }
    }

    /* JADX INFO: compiled from: ScreenshotViewPager.kt */
    public static final class b extends s<BBSTextObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ScreenshotViewPager.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ScreenshotViewPager f87613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSTextObj f87614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ s.e f87615d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f87616e;

            a(ScreenshotViewPager screenshotViewPager, BBSTextObj bBSTextObj, s.e eVar, b bVar) {
                this.f87613b = screenshotViewPager;
                this.f87614c = bBSTextObj;
                this.f87615d = eVar;
                this.f87616e = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37790, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ScreenshotViewPager screenshotViewPager = this.f87613b;
                ScreenshotViewPager.m(screenshotViewPager, screenshotViewPager.f87607o, this.f87614c);
                ScreenshotViewPager.k(this.f87613b, this.f87615d.getAbsoluteAdapterPosition(), true);
                this.f87616e.notifyDataSetChanged();
            }
        }

        b(Context context, ArrayList<BBSTextObj> arrayList) {
            super(context, arrayList, R.layout.item_screenshots_viewpager_banner);
        }

        public void m(@d s.e viewHolder, @d BBSTextObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 37788, new Class[]{s.e.class, BBSTextObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            View viewB = viewHolder.b();
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_video_thumb);
            View viewI = viewHolder.i(R.id.vg_frame);
            viewHolder.i(R.id.vg_video_play).setVisibility(8);
            com.max.hbimage.b.e0(data.getUrl(), imageView, ViewUtils.f(ScreenshotViewPager.this.getContext(), 3.0f), R.drawable.common_default_placeholder_375x210);
            viewB.setTag(data);
            viewI.setBackground(q.K(ScreenshotViewPager.this.getContext(), R.color.text_primary_1_color, 2.0f));
            if (data.isChecked()) {
                viewI.setVisibility(0);
            } else {
                viewI.setVisibility(8);
            }
            viewB.setOnClickListener(new a(ScreenshotViewPager.this, data, viewHolder, this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSTextObj bBSTextObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTextObj}, this, changeQuickRedirect, false, 37789, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSTextObj);
        }
    }

    /* JADX INFO: compiled from: ScreenshotViewPager.kt */
    public static final class c extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37791, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            ScreenshotViewPager screenshotViewPager = ScreenshotViewPager.this;
            ScreenshotViewPager.m(screenshotViewPager, screenshotViewPager.f87607o, (BBSTextObj) ScreenshotViewPager.this.f87607o.get(i10));
            ScreenshotViewPager.l(ScreenshotViewPager.this, i10, true, false, false);
            ScreenshotViewPager.this.f87604l.scrollToPosition(i10);
            s sVar = ScreenshotViewPager.this.f87606n;
            if (sVar != null) {
                sVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenshotViewPager(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenshotViewPager(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotViewPager(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f87607o = new ArrayList<>();
        ka0 ka0VarD = ka0.d(LayoutInflater.from(context), this, true);
        f0.o(ka0VarD, "inflate(LayoutInflater.from(context), this, true)");
        ViewPager2 viewPager2 = ka0VarD.f112533e;
        f0.o(viewPager2, "binding.vp2");
        this.f87603k = viewPager2;
        RecyclerView recyclerView = ka0VarD.f112530b;
        f0.o(recyclerView, "binding.rvScreenshots");
        this.f87604l = recyclerView;
        int iL = (int) (((ViewUtils.L(context) * 211.0f) / 375) + 0.5f);
        ViewGroup.LayoutParams layoutParams = this.f87603k.getLayoutParams();
        f0.o(layoutParams, "viewPager2.layoutParams");
        if (layoutParams.height != iL) {
            layoutParams.height = iL;
            this.f87603k.setLayoutParams(layoutParams);
        }
        o();
    }

    private final BBSTextObj getCurrentScreenshot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37777, new Class[0], BBSTextObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTextObj) patchProxyResultProxy.result;
        }
        for (BBSTextObj bBSTextObj : this.f87607o) {
            if (bBSTextObj.isChecked()) {
                return bBSTextObj;
            }
        }
        return null;
    }

    public static final /* synthetic */ void k(ScreenshotViewPager screenshotViewPager, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{screenshotViewPager, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 37783, new Class[]{ScreenshotViewPager.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        screenshotViewPager.p(i10, z10);
    }

    public static final /* synthetic */ void l(ScreenshotViewPager screenshotViewPager, int i10, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {screenshotViewPager, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 37784, new Class[]{ScreenshotViewPager.class, Integer.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        screenshotViewPager.r(i10, z10, z11, z12);
    }

    public static final /* synthetic */ void m(ScreenshotViewPager screenshotViewPager, List list, BBSTextObj bBSTextObj) {
        if (PatchProxy.proxy(new Object[]{screenshotViewPager, list, bBSTextObj}, null, changeQuickRedirect, true, 37782, new Class[]{ScreenshotViewPager.class, List.class, BBSTextObj.class}, Void.TYPE).isSupported) {
            return;
        }
        screenshotViewPager.t(list, bBSTextObj);
    }

    private final void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37774, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a aVar = new a(getContext(), this.f87607o);
        this.f87605m = aVar;
        this.f87603k.setAdapter(aVar);
    }

    private final void p(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37779, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        q(i10, z10, false);
    }

    private final void q(int i10, boolean z10, boolean z11) {
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37780, new Class[]{Integer.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        r(i10, z10, z11, true);
    }

    private final void r(int i10, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37781, new Class[]{Integer.TYPE, cls, cls, cls}, Void.TYPE).isSupported && !com.max.hbcommon.utils.c.w(this.f87607o) && i10 >= 0 && i10 < this.f87607o.size() && z12 && i10 != this.f87603k.getCurrentItem()) {
            this.f87603k.setCurrentItem(i10, z10);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37776, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BBSTextObj currentScreenshot = getCurrentScreenshot();
        if (this.f87607o.size() > 0) {
            this.f87603k.setVisibility(0);
            this.f87603k.setOffscreenPageLimit(this.f87607o.size());
            t(this.f87607o, currentScreenshot);
            s<BBSTextObj> sVar = this.f87605m;
            if (sVar != null) {
                sVar.notifyDataSetChanged();
            }
        } else {
            this.f87603k.setVisibility(8);
        }
        if (this.f87607o.size() <= 1) {
            this.f87604l.setVisibility(8);
            return;
        }
        this.f87604l.setVisibility(0);
        this.f87604l.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f87604l.setPadding(ViewUtils.f(getContext(), 2.0f), 0, ViewUtils.f(getContext(), 2.0f), 0);
        this.f87604l.clearOnScrollListeners();
        s<BBSTextObj> sVar2 = this.f87606n;
        if (sVar2 == null) {
            b bVar = new b(getContext(), this.f87607o);
            this.f87606n = bVar;
            this.f87604l.setAdapter(bVar);
        } else if (sVar2 != null) {
            sVar2.notifyDataSetChanged();
        }
        this.f87603k.registerOnPageChangeCallback(new c());
    }

    private final void t(List<? extends BBSTextObj> list, BBSTextObj bBSTextObj) {
        if (PatchProxy.proxy(new Object[]{list, bBSTextObj}, this, changeQuickRedirect, false, 37778, new Class[]{List.class, BBSTextObj.class}, Void.TYPE).isSupported || list == null || bBSTextObj == null) {
            return;
        }
        for (BBSTextObj bBSTextObj2 : list) {
            bBSTextObj2.setChecked(f0.g(bBSTextObj2, bBSTextObj));
        }
    }

    public final void n(@d ArrayList<BBSTextObj> screenshotList) {
        String name;
        if (PatchProxy.proxy(new Object[]{screenshotList}, this, changeQuickRedirect, false, 37775, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(screenshotList, "screenshotList");
        String str = "applyScreenshotList, screenshotList = " + screenshotList;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (ScreenshotViewPager.class.isAnonymousClass()) {
            name = ScreenshotViewPager.class.getName();
            f0.m(name);
        } else {
            name = ScreenshotViewPager.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        this.f87607o.clear();
        this.f87607o.addAll(screenshotList);
        s();
    }
}
