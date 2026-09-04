package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbcustomview.viewpager2.widget.HBViewPager2;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.PlatformBindStatus;
import com.max.xiaoheihe.bean.account.PlatformCardBgObj;
import com.max.xiaoheihe.bean.account.PlatformCurrentDataObj;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.GameBindingFragment;
import com.max.xiaoheihe.module.account.mine.k;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GamePlatformsCardContainer.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class GamePlatformsCardContainer extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f78870c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final VideoViewX f78871b;

    /* JADX INFO: compiled from: GamePlatformsCardContainer.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f78872b;

        a(Context context) {
            this.f78872b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24909, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f78872b;
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.i0(context, lb.d.f131202l4);
        }
    }

    /* JADX INFO: compiled from: GamePlatformsCardContainer.kt */
    public static final class b implements RadioGroup.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HBViewPager2 f78873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f78874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r1.z0 f78875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f78876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f78877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PlatformBindStatus f78878f;

        b(HBViewPager2 hBViewPager2, boolean z10, r1.z0 z0Var, boolean z11, HomeDataObj homeDataObj, PlatformBindStatus platformBindStatus) {
            this.f78873a = hBViewPager2;
            this.f78874b = z10;
            this.f78875c = z0Var;
            this.f78876d = z11;
            this.f78877e = homeDataObj;
            this.f78878f = platformBindStatus;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
            int i11 = 0;
            if (PatchProxy.proxy(new Object[]{radioGroup, new Integer(i10)}, this, changeQuickRedirect, false, 24910, new Class[]{RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            int childCount = radioGroup.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (i10 == radioGroup.getChildAt(i12).getId()) {
                    i11 = i12;
                    break;
                }
            }
            Log.d("onCheckedChanged", "current:" + i11);
            this.f78873a.setCurrentItem(i11);
            String strI0 = r1.i0(i10);
            if (this.f78874b) {
                com.max.hbcache.c.C(com.max.hbcache.c.f66158y, strI0);
            }
            r1.z0 z0Var = this.f78875c;
            if (z0Var != null) {
                z0Var.a(strI0);
            }
            if (this.f78874b && this.f78876d && this.f78877e.isReport()) {
                r1.a2(r1.i0(i10), r1.O0(this.f78878f, strI0));
            }
        }
    }

    /* JADX INFO: compiled from: GamePlatformsCardContainer.kt */
    public static final class c extends HBViewPager2.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RadioGroup f78879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r1.z0 f78880b;

        c(RadioGroup radioGroup, r1.z0 z0Var) {
            this.f78879a = radioGroup;
            this.f78880b = z0Var;
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
        public void a(int i10) {
            r1.z0 z0Var;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24912, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.a(i10);
            if (i10 != 0 || (z0Var = this.f78880b) == null) {
                return;
            }
            z0Var.b();
        }

        @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
        public void c(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24911, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.c(i10);
            Log.d("vp_platform", "onPageSelected  current:" + i10);
            View childAt = this.f78879a.getChildAt(i10);
            f0.n(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            ((RadioButton) childAt).setChecked(true);
        }
    }

    /* JADX INFO: compiled from: GamePlatformsCardContainer.kt */
    public static final class d extends s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HomeDataObj f78881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PlatformBindStatus f78882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<PlayerRankObj> f78883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r1.z0 f78884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f78885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ GameBindingFragment.n f78886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ GamePlatformsCardContainer f78887h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p000if.a f78888i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Context context, List<String> list, HomeDataObj homeDataObj, PlatformBindStatus platformBindStatus, List<? extends PlayerRankObj> list2, r1.z0 z0Var, k kVar, GameBindingFragment.n nVar, GamePlatformsCardContainer gamePlatformsCardContainer, p000if.a aVar) {
            super(context, list, R.layout.item_platform_card_v2);
            this.f78881b = homeDataObj;
            this.f78882c = platformBindStatus;
            this.f78883d = list2;
            this.f78884e = z0Var;
            this.f78885f = kVar;
            this.f78886g = nVar;
            this.f78887h = gamePlatformsCardContainer;
            this.f78888i = aVar;
        }

        public void m(@dl.d s.e viewHolder, @dl.d String platformName) {
            if (PatchProxy.proxy(new Object[]{viewHolder, platformName}, this, changeQuickRedirect, false, 24913, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(platformName, "platformName");
            View viewB = viewHolder.b();
            f0.n(viewB, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) viewB;
            viewGroup.setTag(R.id.absolute_position, Integer.valueOf(viewHolder.getAbsoluteAdapterPosition()));
            if (viewGroup.getChildCount() == 0) {
                r1.T1(this.f78881b, this.f78882c, platformName, viewGroup, this.f78883d, this.f78884e, this.f78885f, this.f78886g);
                if (this.f78887h.getId() == R.id.rb_platform_steam) {
                    this.f78888i.x(viewGroup.findViewById(R.id.ll_tips));
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 24914, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    public GamePlatformsCardContainer(@dl.e Context context) {
        this(context, null);
    }

    public GamePlatformsCardContainer(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GamePlatformsCardContainer(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = getContext();
        f0.o(context2, "context");
        this.f78871b = new VideoViewX(context2);
        View.inflate(context, R.layout.layout_platforms_card_v2, this);
        CardView cardView = (CardView) findViewById(R.id.vg_container);
        if (cardView != null) {
            cardView.setRadius(ViewUtils.n(context, ViewUtils.L(context), ViewUtils.f(context, 150.0f), ViewUtils.ViewType.IMAGE));
        }
    }

    public static /* synthetic */ void b(GamePlatformsCardContainer gamePlatformsCardContainer, HomeDataObj homeDataObj, List list, String str, r1.z0 z0Var, k kVar, GameBindingFragment.n nVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gamePlatformsCardContainer, homeDataObj, list, str, z0Var, kVar, nVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 24904, new Class[]{GamePlatformsCardContainer.class, HomeDataObj.class, List.class, String.class, r1.z0.class, k.class, GameBindingFragment.n.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePlatformsCardContainer.a(homeDataObj, list, (i10 & 4) != 0 ? GameObj.PLATFORM_STEAM : str, z0Var, kVar, nVar);
    }

    public static /* synthetic */ void d(GamePlatformsCardContainer gamePlatformsCardContainer, HomeDataObj homeDataObj, List list, String str, r1.z0 z0Var, k kVar, GameBindingFragment.n nVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gamePlatformsCardContainer, homeDataObj, list, str, z0Var, kVar, nVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 24906, new Class[]{GamePlatformsCardContainer.class, HomeDataObj.class, List.class, String.class, r1.z0.class, k.class, GameBindingFragment.n.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePlatformsCardContainer.c(homeDataObj, list, (i10 & 4) != 0 ? GameObj.PLATFORM_STEAM : str, z0Var, kVar, nVar);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x02b3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void e(HomeDataObj homeDataObj, RelativeLayout relativeLayout, List<? extends PlayerRankObj> list, r1.z0 z0Var, k kVar, GameBindingFragment.n nVar, boolean z10, PlatformCurrentDataObj platformCurrentDataObj) {
        p000if.a aVar;
        int i10;
        boolean z11;
        if (PatchProxy.proxy(new Object[]{homeDataObj, relativeLayout, list, z0Var, kVar, nVar, new Byte(z10 ? (byte) 1 : (byte) 0), platformCurrentDataObj}, this, changeQuickRedirect, false, 24907, new Class[]{HomeDataObj.class, RelativeLayout.class, List.class, r1.z0.class, k.class, GameBindingFragment.n.class, Boolean.TYPE, PlatformCurrentDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        RadioGroup radioGroup = (RadioGroup) relativeLayout.findViewById(R.id.rg_platforms);
        HBViewPager2 vp_platform = (HBViewPager2) relativeLayout.findViewById(R.id.vp_platform);
        View viewFindViewById = relativeLayout.findViewById(R.id.iv_setting);
        Context context = relativeLayout.getContext();
        vp_platform.setMaxOverScrollPages(1);
        int unBindPlatFormNum = platformCurrentDataObj.getUnBindPlatFormNum();
        String mCurrentPlatform = platformCurrentDataObj.getMCurrentPlatform();
        boolean zIsMe = platformCurrentDataObj.isMe();
        boolean zIsHideEpic = platformCurrentDataObj.isHideEpic();
        PlatformBindStatus platformBindStatusH0 = r1.h0(homeDataObj);
        if (z10 && zIsMe) {
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new a(context));
        } else {
            viewFindViewById.setVisibility(8);
        }
        if ((unBindPlatFormNum <= 0 && !z10) || com.max.hbcommon.utils.c.u(mCurrentPlatform)) {
            relativeLayout.setVisibility(8);
            return;
        }
        relativeLayout.setVisibility(0);
        radioGroup.setVisibility(0);
        radioGroup.removeAllViews();
        for (String str : GameObj.ALL_PLATFORMS) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1808629708:
                        if (str.equals(GameObj.PLATFORM_HARDWARE)) {
                            r1.f2(context, Boolean.FALSE, Boolean.valueOf(zIsMe), Boolean.valueOf(platformBindStatusH0.isBindHardware()), R.id.rb_platform_hardware, R.drawable.rb_platform_hardware, radioGroup, z10);
                        }
                        break;
                    case -889473228:
                        if (str.equals("switch")) {
                            r1.f2(context, Boolean.valueOf(homeDataObj.isSwitch_account_info_hidden()), Boolean.valueOf(zIsMe), Boolean.valueOf(platformBindStatusH0.isBindSwitch()), R.id.rb_platform_switch, R.drawable.rb_platform_switch, radioGroup, z10);
                        }
                        break;
                    case -501007740:
                        if (str.equals(GameObj.PLATFORM_STEAM)) {
                            r1.f2(context, Boolean.FALSE, Boolean.valueOf(zIsMe), Boolean.valueOf(platformBindStatusH0.isBindSteam()), R.id.rb_platform_steam, R.drawable.rb_platform_steam, radioGroup, z10);
                        }
                        break;
                    case 3063128:
                        if (str.equals("csgo")) {
                            r1.f2(context, Boolean.FALSE, Boolean.valueOf(zIsMe), Boolean.valueOf(platformBindStatusH0.isBindCsgo()), R.id.rb_platform_csgo, R.drawable.rb_platform_csgo, radioGroup, z10);
                        }
                        break;
                    case 3119877:
                        if (str.equals("epic")) {
                            if (zIsHideEpic) {
                                Boolean bool = Boolean.TRUE;
                                r1.f2(context, bool, bool, bool, R.id.rb_platform_epic, R.drawable.rb_platform_epic, radioGroup, z10);
                            } else {
                                r1.f2(context, Boolean.valueOf(homeDataObj.isEpic_account_info_hidden()), Boolean.valueOf(zIsMe), Boolean.valueOf(platformBindStatusH0.isBindEpic()), R.id.rb_platform_epic, R.drawable.rb_platform_epic, radioGroup, z10);
                            }
                        }
                        break;
                    case 95773434:
                        if (str.equals("dota2")) {
                            r1.f2(context, Boolean.FALSE, Boolean.valueOf(zIsMe), Boolean.valueOf(platformBindStatusH0.isBindDota2()), R.id.rb_platform_dota, R.drawable.rb_platform_dota, radioGroup, z10);
                        }
                        break;
                    case 538159775:
                        if (str.equals(GameObj.PLATFORM_XBOX)) {
                            r1.f2(context, Boolean.valueOf(homeDataObj.isXbox_account_info_hidden()), Boolean.valueOf(zIsMe), Boolean.valueOf(platformBindStatusH0.isBindXbox()), R.id.rb_platform_xbox, R.drawable.rb_platform_xbox, radioGroup, z10);
                        }
                        break;
                    case 1251955023:
                        if (str.equals(GameObj.PLATFORM_PS)) {
                            r1.f2(context, Boolean.valueOf(homeDataObj.isPsn_account_info_hidden()), Boolean.valueOf(zIsMe), Boolean.valueOf(platformBindStatusH0.isBindPSN()), R.id.rb_platform_ps, R.drawable.rb_platform_ps, radioGroup, z10);
                        }
                        break;
                }
            }
        }
        int iP = r1.P(mCurrentPlatform);
        radioGroup.setOnCheckedChangeListener(null);
        radioGroup.clearCheck();
        int i11 = iP;
        radioGroup.setOnCheckedChangeListener(new b(vp_platform, zIsMe, z0Var, z10, homeDataObj, platformBindStatusH0));
        ArrayList arrayList = new ArrayList();
        int childCount = radioGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            String strI0 = r1.i0(radioGroup.getChildAt(i12).getId());
            f0.o(strI0, "getPlatformByBtnId(rg_platforms.getChildAt(i).id)");
            arrayList.add(strI0);
        }
        vp_platform.setOffscreenPageLimit(arrayList.size());
        List<PlatformCardBgObj> platformCardBgList = r1.l0(homeDataObj, Boolean.valueOf(zIsMe), z10, platformCurrentDataObj);
        HBViewPager2.l pageTransformer = vp_platform.getPageTransformer();
        if (pageTransformer instanceof p000if.a) {
            aVar = (p000if.a) pageTransformer;
            if (!com.max.hbcommon.utils.c.y(aVar.k(), platformCardBgList)) {
                View viewFindViewById2 = relativeLayout.findViewById(R.id.vg_bg_container);
                f0.o(viewFindViewById2, "vg_platforms_container.f…yId(R.id.vg_bg_container)");
                f0.o(platformCardBgList, "platformCardBgList");
                f0.o(vp_platform, "vp_platform");
                aVar = new p000if.a((ViewGroup) viewFindViewById2, platformCardBgList, vp_platform, this.f78871b);
            }
        } else {
            View viewFindViewById3 = relativeLayout.findViewById(R.id.vg_bg_container);
            f0.o(viewFindViewById3, "vg_platforms_container.f…yId(R.id.vg_bg_container)");
            f0.o(platformCardBgList, "platformCardBgList");
            f0.o(vp_platform, "vp_platform");
            aVar = new p000if.a((ViewGroup) viewFindViewById3, platformCardBgList, vp_platform, this.f78871b);
        }
        p000if.a aVar2 = aVar;
        vp_platform.setPageTransformer(aVar2);
        aVar2.w(relativeLayout);
        vp_platform.n(new c(radioGroup, z0Var));
        vp_platform.setAdapter(new d(context, arrayList, homeDataObj, platformBindStatusH0, list, z0Var, kVar, nVar, this, aVar2));
        int childCount2 = radioGroup.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                i10 = i11;
                i13 = 0;
            } else {
                i10 = i11;
                if (i10 != radioGroup.getChildAt(i13).getId()) {
                    i13++;
                    i11 = i10;
                }
            }
        }
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i10);
        if (radioButton == null) {
            if (radioGroup.getChildCount() > 0) {
                z11 = false;
                RadioButton radioButton2 = (RadioButton) radioGroup.getChildAt(0);
                if (radioButton2 != null) {
                    radioButton2.setChecked(true);
                    i13 = 0;
                }
            }
            vp_platform.setCurrentItem(i13, z11);
            PlatformCardBgObj platformCardBgObj = platformCardBgList.get(i13);
            f0.o(platformCardBgObj, "platformCardBgList[current]");
            aVar2.u(platformCardBgObj, i13);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = ViewUtils.f(context, platformCardBgList.get(i13).getHeight());
            relativeLayout.setLayoutParams(layoutParams);
        }
        radioButton.setChecked(true);
        z11 = false;
        vp_platform.setCurrentItem(i13, z11);
        PlatformCardBgObj platformCardBgObj2 = platformCardBgList.get(i13);
        f0.o(platformCardBgObj2, "platformCardBgList[current]");
        aVar2.u(platformCardBgObj2, i13);
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = ViewUtils.f(context, platformCardBgList.get(i13).getHeight());
        relativeLayout.setLayoutParams(layoutParams2);
    }

    public final void a(@dl.d HomeDataObj homeDataObj, @dl.d List<? extends PlayerRankObj> showFriendList, @dl.d String currentPlatform, @dl.d r1.z0 onPlatFormCardListener, @dl.d k steamOnlineStateHolder, @dl.d GameBindingFragment.n gameBindingListener) {
        if (PatchProxy.proxy(new Object[]{homeDataObj, showFriendList, currentPlatform, onPlatFormCardListener, steamOnlineStateHolder, gameBindingListener}, this, changeQuickRedirect, false, 24903, new Class[]{HomeDataObj.class, List.class, String.class, r1.z0.class, k.class, GameBindingFragment.n.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(homeDataObj, "homeDataObj");
        f0.p(showFriendList, "showFriendList");
        f0.p(currentPlatform, "currentPlatform");
        f0.p(onPlatFormCardListener, "onPlatFormCardListener");
        f0.p(steamOnlineStateHolder, "steamOnlineStateHolder");
        f0.p(gameBindingListener, "gameBindingListener");
        c(homeDataObj, showFriendList, currentPlatform, onPlatFormCardListener, steamOnlineStateHolder, gameBindingListener);
    }

    public final void c(@dl.e HomeDataObj homeDataObj, @dl.d List<? extends PlayerRankObj> showFriendList, @dl.d String currentPlatform, @dl.d r1.z0 onPlatFormCardListener, @dl.d k steamOnlineStateHolder, @dl.d GameBindingFragment.n gameBindingListener) {
        if (PatchProxy.proxy(new Object[]{homeDataObj, showFriendList, currentPlatform, onPlatFormCardListener, steamOnlineStateHolder, gameBindingListener}, this, changeQuickRedirect, false, 24905, new Class[]{HomeDataObj.class, List.class, String.class, r1.z0.class, k.class, GameBindingFragment.n.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(showFriendList, "showFriendList");
        f0.p(currentPlatform, "currentPlatform");
        f0.p(onPlatFormCardListener, "onPlatFormCardListener");
        f0.p(steamOnlineStateHolder, "steamOnlineStateHolder");
        f0.p(gameBindingListener, "gameBindingListener");
        g.f74531b.q("GamePlatformsCardContainer, refreshPlatFormCard " + Log.getStackTraceString(new Throwable()));
        if (homeDataObj == null) {
            return;
        }
        PlatformCurrentDataObj data = r1.S(homeDataObj, currentPlatform, true);
        View viewFindViewById = findViewById(R.id.vg_platforms_container);
        f0.o(viewFindViewById, "findViewById(R.id.vg_platforms_container)");
        f0.o(data, "data");
        e(homeDataObj, (RelativeLayout) viewFindViewById, showFriendList, onPlatFormCardListener, steamOnlineStateHolder, gameBindingListener, true, data);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24908, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.f78871b.Q();
    }
}
