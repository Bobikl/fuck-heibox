package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.ezcalendarview.EZCalendarView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.InventoryObj;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.game.GameGridDataCardObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGAccountInfo;
import com.max.xiaoheihe.bean.game.pubg.PUBGCareerObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGDataObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGGameModeObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGGameStatsObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGMenuObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGPlayerOverviewObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGR20DataObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGRatingInfoObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGTrendObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGWeaponMasteryObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGWeaponObj;
import com.max.xiaoheihe.module.account.GameBindingFragment;
import com.max.xiaoheihe.module.account.MineActivity;
import com.max.xiaoheihe.module.game.PlayerLeaderboardsActivity;
import com.max.xiaoheihe.module.game.component.GameDetailDataValueView;
import com.max.xiaoheihe.module.game.component.GameOverviewAllStatsView;
import com.max.xiaoheihe.module.game.pubg.PUBGDetailActivity;
import com.max.xiaoheihe.module.game.pubg.PUBGWeaponsActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.message.common.inter.ITagManager;
import df.m90;
import df.va;
import dl.d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import z5.f;

/* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nPUBGGameDataV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PUBGGameDataV2Fragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGGameDataV2Fragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1945:1\n1#2:1946\n262#3,2:1947\n262#3,2:1949\n262#3,2:1951\n262#3,2:1953\n*S KotlinDebug\n*F\n+ 1 PUBGGameDataV2Fragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGGameDataV2Fragment\n*L\n226#1:1947,2\n232#1:1949,2\n330#1:1951,2\n332#1:1953,2\n*E\n"})
@n9.a({com.max.hbminiprogram.d.class})
@com.max.hbcommon.analytics.m(path = lb.d.J3)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PUBGGameDataV2Fragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.d implements GameBindingFragment.n {

    @dl.d
    public static final String X = "player_id";

    @dl.d
    public static final String Y = "nickname";

    @dl.d
    public static final String Z = "user_id";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    public static final String f89223a0 = "real_name";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    public static final String f89224b0 = "pubg_bg_cover_lottie";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A;

    @dl.e
    private String B;
    private boolean C;

    @dl.e
    private PUBGPlayerOverviewObj D;
    private boolean E;

    @dl.e
    private com.max.hbcommon.base.adapter.s<PUBGMatchObj> J;
    private va K;

    @dl.e
    private PopupWindow M;
    private int N;
    private int O;

    @dl.e
    private ImageView P;

    @dl.e
    private UserProfileUpdatedBroadcastReceiver Q;

    @dl.e
    private GameBindingFragment R;

    @dl.e
    private String S;

    @dl.e
    private ObjectAnimator T;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private String f89226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f89227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f89228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private String f89229w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private List<KeyDescObj> f89232z;

    @dl.d
    public static final a V = new a(null);
    public static final int W = 8;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f89225c0 = com.max.hbutils.utils.a.d("#381601");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private String f89230x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private String f89231y = "";

    @dl.d
    private ArrayList<PlayerRankObj> F = new ArrayList<>();

    @dl.d
    private ArrayList<PlayerInfoObj> G = new ArrayList<>();

    @dl.d
    private ArrayList<PUBGMatchObj> H = new ArrayList<>();

    @dl.d
    private ArrayList<KeyDescObj> I = new ArrayList<>();
    private boolean L = true;
    private final int U = 10;

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public final class UserProfileUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public UserProfileUpdatedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.d Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 39540, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(intent, "intent");
            if (kotlin.jvm.internal.f0.g(lb.a.f131055v, intent.getAction())) {
                PUBGGameDataV2Fragment.W4(PUBGGameDataV2Fragment.this);
            }
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39535, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : PUBGGameDataV2Fragment.f89225c0;
        }

        @dl.e
        @xh.m
        public final Fragment b(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39539, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (map == null) {
                return null;
            }
            Object obj = map.get(com.max.xiaoheihe.module.littleprogram.b.f88740a.b());
            String strValueOf = (String) map.get("nickname");
            String strValueOf2 = (String) map.get("real_name");
            String strValueOf3 = (String) map.get("user_id");
            String strValueOf4 = (String) map.get("player_id");
            if (TextUtils.isEmpty(strValueOf4) && (obj instanceof WebProtocolObj)) {
                strValueOf4 = ((WebProtocolObj) obj).valueOf("player_id");
            }
            if (TextUtils.isEmpty(strValueOf) && (obj instanceof WebProtocolObj)) {
                strValueOf = ((WebProtocolObj) obj).valueOf("nickname");
            }
            if (TextUtils.isEmpty(strValueOf2) && (obj instanceof WebProtocolObj)) {
                strValueOf2 = ((WebProtocolObj) obj).valueOf("real_name");
            }
            if (TextUtils.isEmpty(strValueOf3) && (obj instanceof WebProtocolObj)) {
                strValueOf3 = ((WebProtocolObj) obj).valueOf("user_id");
            }
            return PUBGGameDataV2Fragment.V.e(strValueOf4, strValueOf, strValueOf2, strValueOf3);
        }

        @dl.d
        @xh.m
        public final PUBGGameDataV2Fragment c(@dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 39536, new Class[]{Bundle.class}, PUBGGameDataV2Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PUBGGameDataV2Fragment) patchProxyResultProxy.result;
            }
            PUBGGameDataV2Fragment pUBGGameDataV2Fragment = new PUBGGameDataV2Fragment();
            pUBGGameDataV2Fragment.setArguments(bundle);
            return pUBGGameDataV2Fragment;
        }

        @dl.d
        @xh.m
        public final PUBGGameDataV2Fragment d(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39538, new Class[]{String.class}, PUBGGameDataV2Fragment.class);
            return patchProxyResultProxy.isSupported ? (PUBGGameDataV2Fragment) patchProxyResultProxy.result : e(str, null, null, null);
        }

        @dl.d
        @xh.m
        public final PUBGGameDataV2Fragment e(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 39537, new Class[]{String.class, String.class, String.class, String.class}, PUBGGameDataV2Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PUBGGameDataV2Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString("player_id", str);
            bundle.putString("nickname", str2);
            bundle.putString("real_name", str3);
            bundle.putString("user_id", str4);
            return c(bundle);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class a0<T, Y> implements com.max.xiaoheihe.module.game.pubg.utils.b.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // com.max.xiaoheihe.module.game.pubg.utils.b.m
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            if (PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 39591, new Class[]{Object.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b((KeyDescObj) obj, (Integer) obj2);
        }

        public final void b(KeyDescObj keyDescObj, Integer num) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, num}, this, changeQuickRedirect, false, 39590, new Class[]{KeyDescObj.class, Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGGameDataV2Fragment.this.f89230x = keyDescObj.getKey();
            PUBGGameDataV2Fragment.W4(PUBGGameDataV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    @t0({"SMAP\nPUBGGameDataV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PUBGGameDataV2Fragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGGameDataV2Fragment$getData$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1945:1\n262#2,2:1946\n262#2,2:1948\n262#2,2:1950\n*S KotlinDebug\n*F\n+ 1 PUBGGameDataV2Fragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/pubg/PUBGGameDataV2Fragment$getData$1\n*L\n315#1:1946,2\n316#1:1948,2\n319#1:1950,2\n*E\n"})
    public static final class b extends com.max.hbcommon.network.d<Result<PUBGPlayerOverviewObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39541, new Class[0], Void.TYPE).isSupported && PUBGGameDataV2Fragment.this.isActive()) {
                va vaVar = PUBGGameDataV2Fragment.this.K;
                if (vaVar == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar = null;
                }
                vaVar.f116743k.A(500);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39542, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (PUBGGameDataV2Fragment.this.isActive()) {
                super.onError(e10);
                PUBGGameDataV2Fragment.this.J4().f111334f.setVisibility(8);
                va vaVar = PUBGGameDataV2Fragment.this.K;
                if (vaVar == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar = null;
                }
                vaVar.f116743k.A(500);
                PUBGGameDataV2Fragment.u5(PUBGGameDataV2Fragment.this);
                e10.printStackTrace();
            }
        }

        public void onNext(@dl.d Result<PUBGPlayerOverviewObj> result) {
            PlayerInfoObj player_info;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39543, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (PUBGGameDataV2Fragment.this.isActive()) {
                PUBGGameDataV2Fragment.this.J4().f111334f.setVisibility(8);
                PUBGGameDataV2Fragment.this.D = result.getResult();
                PUBGPlayerOverviewObj pUBGPlayerOverviewObj = PUBGGameDataV2Fragment.this.D;
                va vaVar = null;
                if (!TextUtils.isEmpty((pUBGPlayerOverviewObj == null || (player_info = pUBGPlayerOverviewObj.getPlayer_info()) == null) ? null : player_info.getPlayer_id())) {
                    PUBGGameDataV2Fragment pUBGGameDataV2Fragment = PUBGGameDataV2Fragment.this;
                    PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = pUBGGameDataV2Fragment.D;
                    kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj2);
                    PlayerInfoObj player_info2 = pUBGPlayerOverviewObj2.getPlayer_info();
                    kotlin.jvm.internal.f0.m(player_info2);
                    PUBGGameDataV2Fragment.i5(pUBGGameDataV2Fragment, player_info2.getPlayer_id());
                }
                PUBGGameDataV2Fragment.v5(PUBGGameDataV2Fragment.this);
                PUBGPlayerOverviewObj result2 = result.getResult();
                if (kotlin.jvm.internal.f0.g(result2 != null ? result2.getUpdate_btn_state() : null, "updating")) {
                    PUBGGameDataV2Fragment.x5(PUBGGameDataV2Fragment.this);
                    PUBGGameDataV2Fragment.Y4(PUBGGameDataV2Fragment.this, 0);
                } else {
                    PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = PUBGGameDataV2Fragment.this.D;
                    if (com.max.hbcommon.utils.c.u(pUBGPlayerOverviewObj3 != null ? pUBGPlayerOverviewObj3.getUpdate_btn_desc() : null)) {
                        va vaVar2 = PUBGGameDataV2Fragment.this.K;
                        if (vaVar2 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                        } else {
                            vaVar = vaVar2;
                        }
                        LinearLayout linearLayout = vaVar.M;
                        kotlin.jvm.internal.f0.o(linearLayout, "binding.vgUpdate");
                        linearLayout.setVisibility(8);
                    } else {
                        va vaVar3 = PUBGGameDataV2Fragment.this.K;
                        if (vaVar3 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            vaVar3 = null;
                        }
                        LinearLayout linearLayout2 = vaVar3.M;
                        kotlin.jvm.internal.f0.o(linearLayout2, "binding.vgUpdate");
                        linearLayout2.setVisibility(0);
                        va vaVar4 = PUBGGameDataV2Fragment.this.K;
                        if (vaVar4 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            vaVar4 = null;
                        }
                        ImageView imageView = vaVar4.f116740h;
                        kotlin.jvm.internal.f0.o(imageView, "binding.ivUpdateIcon");
                        imageView.setVisibility(8);
                        va vaVar5 = PUBGGameDataV2Fragment.this.K;
                        if (vaVar5 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            vaVar5 = null;
                        }
                        TextView textView = vaVar5.f116748p;
                        PUBGPlayerOverviewObj pUBGPlayerOverviewObj4 = PUBGGameDataV2Fragment.this.D;
                        textView.setText(pUBGPlayerOverviewObj4 != null ? pUBGPlayerOverviewObj4.getUpdate_btn_desc() : null);
                    }
                }
                PUBGGameDataV2Fragment.this.S4();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39544, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGPlayerOverviewObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class b0 implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 39592, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            List list = PUBGGameDataV2Fragment.this.f89232z;
            int size = list != null ? list.size() : 0;
            int index = keyDescObj.getIndex();
            if (index >= 0 && index < size) {
                z10 = true;
            }
            if (z10) {
                PUBGGameDataV2Fragment.this.A = keyDescObj.getIndex();
                PUBGGameDataV2Fragment.this.f89231y = keyDescObj.getKey();
                va vaVar = PUBGGameDataV2Fragment.this.K;
                if (vaVar == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar = null;
                }
                vaVar.f116745m.setText(keyDescObj.getValue());
                PUBGGameDataV2Fragment.this.f89230x = null;
                PUBGGameDataV2Fragment.this.B = "";
                PUBGGameDataV2Fragment.W4(PUBGGameDataV2Fragment.this);
            }
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39559, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            PUBGGameDataV2Fragment.this.clearCompositeDisposable();
            PUBGGameDataV2Fragment.W4(PUBGGameDataV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class c0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<HeyBoxPopupMenu> f89238b;

        c0(Ref.ObjectRef<HeyBoxPopupMenu> objectRef) {
            this.f89238b = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HeyBoxPopupMenu heyBoxPopupMenu;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39593, new Class[]{View.class}, Void.TYPE).isSupported || (heyBoxPopupMenu = this.f89238b.f124891b) == null) {
                return;
            }
            heyBoxPopupMenu.show();
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class d extends com.max.hbcommon.base.adapter.s<PUBGMatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(Activity activity, ArrayList<PUBGMatchObj> arrayList) {
            super(activity, arrayList, R.layout.item_pubg_matches_v2);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e PUBGMatchObj pUBGMatchObj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, pUBGMatchObj}, this, changeQuickRedirect, false, 39560, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PUBGMatchObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            Activity mContext = ((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.module.littleprogram.fragment.pubg.c.d(mContext, viewHolder.itemView, pUBGMatchObj, viewHolder.getAdapterPosition() == getItemCount() - 1);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PUBGMatchObj pUBGMatchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGMatchObj}, this, changeQuickRedirect, false, 39561, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pUBGMatchObj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39594, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGGameDataV2Fragment pUBGGameDataV2Fragment = PUBGGameDataV2Fragment.this;
            PUBGGameDataV2Fragment.w5(pUBGGameDataV2Fragment, pUBGGameDataV2Fragment.D);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<PUBGWeaponMasteryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(@dl.d Result<PUBGWeaponMasteryObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39562, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (PUBGGameDataV2Fragment.this.isActive()) {
                super.onNext(result);
                PUBGGameDataV2Fragment pUBGGameDataV2Fragment = PUBGGameDataV2Fragment.this;
                PUBGWeaponMasteryObj result2 = result.getResult();
                PUBGGameDataV2Fragment.n5(pUBGGameDataV2Fragment, result2 != null ? result2.getWeapons() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39563, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGWeaponMasteryObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class e0 extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, int i10, @dl.d RecyclerView parent) {
            if (PatchProxy.proxy(new Object[]{outRect, new Integer(i10), parent}, this, changeQuickRedirect, false, 39595, new Class[]{Rect.class, Integer.TYPE, RecyclerView.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(parent, "parent");
            if (i10 == 0) {
                outRect.left = ViewUtils.f(((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext, 10.25f);
            }
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class f implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 39565, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 39564, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class f0 extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f89243b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(ArrayList<KeyDescObj> arrayList, int i10, Activity activity) {
            super(activity, arrayList, R.layout.item_game_overview_mmr_right_data);
            this.f89243b = i10;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 39596, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailDataValueView gameDetailDataValueView = eVar != null ? (GameDetailDataValueView) eVar.i(R.id.v_game_detail_data_value) : null;
            if (gameDetailDataValueView != null) {
                gameDetailDataValueView.setData(keyDescObj);
            }
            ViewGroup.LayoutParams layoutParams = gameDetailDataValueView != null ? gameDetailDataValueView.getLayoutParams() : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f89243b;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 39597, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutoTransition f89245c;

        g(AutoTransition autoTransition) {
            this.f89245c = autoTransition;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39566, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj = PUBGGameDataV2Fragment.this.D;
            if (pUBGPlayerOverviewObj != null) {
                pUBGPlayerOverviewObj.setExpand(Boolean.FALSE);
            }
            va vaVar = PUBGGameDataV2Fragment.this.K;
            if (vaVar == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar = null;
            }
            androidx.transition.v.b(vaVar.f116750r.f114803b, this.f89245c);
            PUBGGameDataV2Fragment.l5(PUBGGameDataV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class g0 extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PUBGGameDataV2Fragment f89246b;

        /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PUBGGameDataV2Fragment f89247b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f89248c;

            a(PUBGGameDataV2Fragment pUBGGameDataV2Fragment, KeyDescObj keyDescObj) {
                this.f89247b = pUBGGameDataV2Fragment;
                this.f89248c = keyDescObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39600, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((com.max.hbcommon.base.d) this.f89247b).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                KeyDescObj keyDescObj = this.f89248c;
                com.max.xiaoheihe.base.router.b.k0(mContext, keyDescObj != null ? keyDescObj.getProtocol() : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(ArrayList<KeyDescObj> arrayList, PUBGGameDataV2Fragment pUBGGameDataV2Fragment, Activity activity) {
            super(activity, arrayList, R.layout.item_game_overview_all_stat);
            this.f89246b = pUBGGameDataV2Fragment;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            View view;
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 39598, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GameOverviewAllStatsView gameOverviewAllStatsView = eVar != null ? (GameOverviewAllStatsView) eVar.i(R.id.v_all_stats) : null;
            if (gameOverviewAllStatsView != null) {
                gameOverviewAllStatsView.setData(keyDescObj);
            }
            if (eVar == null || (view = eVar.itemView) == null) {
                return;
            }
            view.setOnClickListener(new a(this.f89246b, keyDescObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 39599, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutoTransition f89261c;

        h(AutoTransition autoTransition) {
            this.f89261c = autoTransition;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39567, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj = PUBGGameDataV2Fragment.this.D;
            if (pUBGPlayerOverviewObj != null) {
                pUBGPlayerOverviewObj.setExpand(Boolean.TRUE);
            }
            va vaVar = PUBGGameDataV2Fragment.this.K;
            if (vaVar == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar = null;
            }
            androidx.transition.v.b(vaVar.f116750r.f114803b, this.f89261c);
            PUBGGameDataV2Fragment.l5(PUBGGameDataV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class h0 extends com.max.hbcommon.base.adapter.s<MatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f89262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PUBGGameDataV2Fragment f89264d;

        /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PUBGGameDataV2Fragment f89265b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MatchObj f89266c;

            a(PUBGGameDataV2Fragment pUBGGameDataV2Fragment, MatchObj matchObj) {
                this.f89265b = pUBGGameDataV2Fragment;
                this.f89266c = matchObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39603, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((com.max.hbcommon.base.d) this.f89265b).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.j0(mContext, this.f89266c.getProtocol());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(List<MatchObj> list, int i10, int i11, PUBGGameDataV2Fragment pUBGGameDataV2Fragment, Activity activity) {
            super(activity, list, R.layout.item_pubg_recent_20_game);
            this.f89262b = i10;
            this.f89263c = i11;
            this.f89264d = pUBGGameDataV2Fragment;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e MatchObj matchObj) {
            String rank;
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 39601, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MatchObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            int i10 = this.f89262b;
            int i11 = this.f89263c;
            PUBGGameDataV2Fragment pUBGGameDataV2Fragment = this.f89264d;
            if (matchObj != null) {
                ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
                layoutParams.width = i10;
                layoutParams.height = i10;
                eVar.itemView.setLayoutParams(layoutParams);
                eVar.itemView.setBackground(ViewUtils.G(i11, com.max.xiaoheihe.utils.d.e1(matchObj.getBg_color())));
                TextView textView = (TextView) eVar.i(R.id.tv_score);
                textView.setTypeface(bb.d.a().b(5));
                String rank2 = matchObj.getRank();
                if (rank2 != null && kotlin.text.u.v2(rank2, "#", false, 2, null)) {
                    rank = matchObj.getRank();
                } else {
                    rank = '#' + matchObj.getRank();
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rank);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(ViewUtils.f(((com.max.hbcommon.base.d) pUBGGameDataV2Fragment).mContext, 9.0f)), 0, 1, 33);
                textView.setText(spannableStringBuilder);
                textView.setTextColor(com.max.xiaoheihe.utils.d.e1(matchObj.getFont_color()));
                eVar.itemView.setOnClickListener(new a(pUBGGameDataV2Fragment, matchObj));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 39602, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, matchObj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class i implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89268c;

        i(int i10) {
            this.f89268c = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39568, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            va vaVar = PUBGGameDataV2Fragment.this.K;
            va vaVar2 = null;
            if (vaVar == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar = null;
            }
            ViewGroup.LayoutParams layoutParams = vaVar.f116753u.f110893h.getLayoutParams();
            layoutParams.height = iIntValue;
            va vaVar3 = PUBGGameDataV2Fragment.this.K;
            if (vaVar3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar3 = null;
            }
            vaVar3.f116753u.f110893h.setLayoutParams(layoutParams);
            float f10 = (iIntValue * 1.0f) / this.f89268c;
            va vaVar4 = PUBGGameDataV2Fragment.this.K;
            if (vaVar4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar4 = null;
            }
            vaVar4.f116753u.f110888c.setAlpha(f10);
            if (f10 == 0.0f) {
                va vaVar5 = PUBGGameDataV2Fragment.this.K;
                if (vaVar5 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    vaVar2 = vaVar5;
                }
                vaVar2.f116753u.f110888c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class i0 extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, int i10, @dl.d RecyclerView parent) {
            if (PatchProxy.proxy(new Object[]{outRect, new Integer(i10), parent}, this, changeQuickRedirect, false, 39604, new Class[]{Rect.class, Integer.TYPE, RecyclerView.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(parent, "parent");
            if (i10 == 0) {
                outRect.left = ViewUtils.f(((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext, 12.0f);
            }
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class j implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89271c;

        j(int i10) {
            this.f89271c = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39569, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            va vaVar = PUBGGameDataV2Fragment.this.K;
            va vaVar2 = null;
            if (vaVar == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar = null;
            }
            ViewGroup.LayoutParams layoutParams = vaVar.f116753u.f110893h.getLayoutParams();
            layoutParams.height = iIntValue;
            va vaVar3 = PUBGGameDataV2Fragment.this.K;
            if (vaVar3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar3 = null;
            }
            vaVar3.f116753u.f110893h.setLayoutParams(layoutParams);
            int i10 = this.f89271c;
            float f10 = ((i10 - iIntValue) * 1.0f) / i10;
            va vaVar4 = PUBGGameDataV2Fragment.this.K;
            if (vaVar4 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar2 = vaVar4;
            }
            vaVar2.f116753u.f110888c.setAlpha(f10);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class j0 extends com.max.hbcommon.base.adapter.s<InventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0(Activity activity, List<InventoryObj> list) {
            super(activity, list, R.layout.item_inventory);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d InventoryObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 39605, new Class[]{com.max.hbcommon.base.adapter.s.e.class, InventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            int iE = com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color);
            viewHolder.itemView.setBackground(ViewUtils.H(ViewUtils.o(PUBGGameDataV2Fragment.this.getContext(), viewHolder.itemView), iE, iE));
            com.max.hbimage.b.K(data.getIcon_url(), (ImageView) viewHolder.i(R.id.iv_item_inventory));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, InventoryObj inventoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, inventoryObj}, this, changeQuickRedirect, false, 39606, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, inventoryObj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f89275d;

        k(String str, String str2) {
            this.f89274c = str;
            this.f89275d = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39570, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = lb.a.X1 + "?nickname=" + PUBGGameDataV2Fragment.this.f89227u + "&record_time=" + this.f89274c + "&season=" + PUBGGameDataV2Fragment.this.f89231y + "&region=" + PUBGGameDataV2Fragment.this.f89230x + "&player_id=" + PUBGGameDataV2Fragment.this.f89228v;
            Intent intent = new Intent(((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", str);
            intent.putExtra("title", this.f89275d);
            intent.putExtra("isfullScreen", true);
            com.max.heybox.hblog.g.f74531b.q("gotoWebPage: " + str);
            com.max.xiaoheihe.utils.l0.w0(((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext, intent);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class k0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39607, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = PUBGGameDataV2Fragment.this.getContext();
            String str = PUBGGameDataV2Fragment.this.f89228v;
            String str2 = PUBGGameDataV2Fragment.this.f89231y;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj = PUBGGameDataV2Fragment.this.D;
            String bg_img = pUBGPlayerOverviewObj != null ? pUBGPlayerOverviewObj.getBg_img() : null;
            if (bg_img == null) {
                bg_img = "";
            }
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = PUBGGameDataV2Fragment.this.D;
            String bg_cover_lottie = pUBGPlayerOverviewObj2 != null ? pUBGPlayerOverviewObj2.getBg_cover_lottie() : null;
            PUBGWeaponsActivity.N1(context, str, str2, null, bg_img, bg_cover_lottie != null ? bg_cover_lottie : "");
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class l implements EZCalendarView.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.hbcommon.component.ezcalendarview.EZCalendarView.d
        public void a(@dl.e EZCalendarView eZCalendarView, @dl.e Calendar calendar) {
            if (PatchProxy.proxy(new Object[]{eZCalendarView, calendar}, this, changeQuickRedirect, false, 39571, new Class[]{EZCalendarView.class, Calendar.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.m(eZCalendarView);
            Bundle bundleI = eZCalendarView.i(calendar);
            if (bundleI == null) {
                return;
            }
            String string = bundleI.getString("KEY_TITLE");
            Calendar calendar2 = Calendar.getInstance();
            kotlin.jvm.internal.f0.m(calendar);
            calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            String strValueOf = String.valueOf(calendar2.getTimeInMillis() / ((long) 1000));
            String str = lb.a.X1 + "?nickname=" + PUBGGameDataV2Fragment.this.f89227u + "&record_time=" + strValueOf + "&season=" + PUBGGameDataV2Fragment.this.f89231y + "&region=" + PUBGGameDataV2Fragment.this.f89230x + "&player_id=" + PUBGGameDataV2Fragment.this.f89228v;
            Intent intent = new Intent(((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", str);
            intent.putExtra("title", string);
            intent.putExtra("isfullScreen", true);
            com.max.heybox.hblog.g.f74531b.q("gotoWebPage: " + str);
            com.max.xiaoheihe.utils.l0.w0(((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext, intent);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class l0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39608, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGGameDataV2Fragment.k5(PUBGGameDataV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class m implements EZCalendarView.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.component.ezcalendarview.EZCalendarView.e
        public final void a(EZCalendarView eZCalendarView, Calendar calendar) {
            if (PatchProxy.proxy(new Object[]{eZCalendarView, calendar}, this, changeQuickRedirect, false, 39572, new Class[]{EZCalendarView.class, Calendar.class}, Void.TYPE).isSupported) {
                return;
            }
            String strD = com.max.hbutils.utils.w.d(((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext, String.valueOf(calendar.getTimeInMillis() / ((long) 1000)), "MMMMy");
            va vaVar = PUBGGameDataV2Fragment.this.K;
            va vaVar2 = null;
            if (vaVar == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar = null;
            }
            String string = vaVar.f116745m.getText().toString();
            if (!com.max.hbcommon.utils.c.u(string)) {
                strD = strD + ' ' + string;
            }
            va vaVar3 = PUBGGameDataV2Fragment.this.K;
            if (vaVar3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar2 = vaVar3;
            }
            vaVar2.f116753u.f110891f.setText(strD);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class n implements EZCalendarView.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.component.ezcalendarview.EZCalendarView.f
        public final void a(int i10, boolean z10, boolean z11) {
            Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39573, new Class[]{Integer.TYPE, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            va vaVar = null;
            if (z10) {
                va vaVar2 = PUBGGameDataV2Fragment.this.K;
                if (vaVar2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar2 = null;
                }
                vaVar2.f116753u.f110890e.setEnabled(true);
                va vaVar3 = PUBGGameDataV2Fragment.this.K;
                if (vaVar3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar3 = null;
                }
                vaVar3.f116753u.f110890e.setAlpha(1.0f);
            } else {
                va vaVar4 = PUBGGameDataV2Fragment.this.K;
                if (vaVar4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar4 = null;
                }
                vaVar4.f116753u.f110890e.setEnabled(false);
                va vaVar5 = PUBGGameDataV2Fragment.this.K;
                if (vaVar5 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar5 = null;
                }
                vaVar5.f116753u.f110890e.setAlpha(0.4f);
            }
            if (z11) {
                va vaVar6 = PUBGGameDataV2Fragment.this.K;
                if (vaVar6 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar6 = null;
                }
                vaVar6.f116753u.f110889d.setEnabled(true);
                va vaVar7 = PUBGGameDataV2Fragment.this.K;
                if (vaVar7 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    vaVar = vaVar7;
                }
                vaVar.f116753u.f110889d.setAlpha(1.0f);
                return;
            }
            va vaVar8 = PUBGGameDataV2Fragment.this.K;
            if (vaVar8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar8 = null;
            }
            vaVar8.f116753u.f110889d.setEnabled(false);
            va vaVar9 = PUBGGameDataV2Fragment.this.K;
            if (vaVar9 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar9;
            }
            vaVar.f116753u.f110889d.setAlpha(0.4f);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39574, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            va vaVar = PUBGGameDataV2Fragment.this.K;
            if (vaVar == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar = null;
            }
            vaVar.f116753u.f110887b.r(-1, true);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39575, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            va vaVar = PUBGGameDataV2Fragment.this.K;
            if (vaVar == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar = null;
            }
            vaVar.f116753u.f110887b.r(1, true);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39576, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGGameDataV2Fragment pUBGGameDataV2Fragment = PUBGGameDataV2Fragment.this;
            pUBGGameDataV2Fragment.E = true ^ pUBGGameDataV2Fragment.E;
            PUBGGameDataV2Fragment.m5(PUBGGameDataV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39577, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HashMap map = new HashMap();
            map.put(PUBGCommonContainerFragment.A, "friend");
            String str2 = PUBGGameDataV2Fragment.this.f89227u;
            if (str2 == null) {
                str2 = "";
            }
            map.put("nickname", str2);
            String str3 = PUBGGameDataV2Fragment.this.f89231y;
            if (str3 == null) {
                str3 = "";
            }
            map.put("season", str3);
            String str4 = PUBGGameDataV2Fragment.this.f89230x;
            String str5 = "steam";
            if (str4 != null && kotlin.text.u.v2(str4, "steam", false, 2, null)) {
                str = "steam";
            } else {
                str = PUBGGameDataV2Fragment.this.f89230x;
                if (str == null) {
                    str = "";
                }
            }
            map.put("region", str);
            String str6 = PUBGGameDataV2Fragment.this.f89228v;
            if (str6 == null) {
                str6 = "";
            }
            map.put("player_id", str6);
            Activity mContext = ((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            String str7 = PUBGGameDataV2Fragment.this.f89227u;
            String str8 = str7 == null ? "" : str7;
            String str9 = PUBGGameDataV2Fragment.this.f89231y;
            String str10 = str9 == null ? "" : str9;
            String str11 = PUBGGameDataV2Fragment.this.f89230x;
            String str12 = (!(str11 != null && kotlin.text.u.v2(str11, "steam", false, 2, null)) && (str5 = PUBGGameDataV2Fragment.this.f89230x) == null) ? "" : str5;
            String str13 = PUBGGameDataV2Fragment.this.f89228v;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj = PUBGGameDataV2Fragment.this.D;
            String bg_img = pUBGPlayerOverviewObj != null ? pUBGPlayerOverviewObj.getBg_img() : null;
            String str14 = bg_img == null ? "" : bg_img;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = PUBGGameDataV2Fragment.this.D;
            String bg_cover_lottie = pUBGPlayerOverviewObj2 != null ? pUBGPlayerOverviewObj2.getBg_cover_lottie() : null;
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.V(mContext, str8, str10, str12, str13, str14, bg_cover_lottie == null ? "" : bg_cover_lottie));
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class s extends com.max.hbcommon.base.adapter.s<PlayerInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s(Activity activity, ArrayList<PlayerInfoObj> arrayList) {
            super(activity, arrayList, R.layout.item_pubg_follow_list);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e PlayerInfoObj playerInfoObj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, playerInfoObj}, this, changeQuickRedirect, false, 39578, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PlayerInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            com.max.xiaoheihe.module.game.pubg.utils.b.p(viewHolder, playerInfoObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PlayerInfoObj playerInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, playerInfoObj}, this, changeQuickRedirect, false, 39579, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, playerInfoObj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class t extends com.max.hbcommon.base.adapter.s<PlayerRankObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f89285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Ref.BooleanRef booleanRef, Activity activity, ArrayList<PlayerRankObj> arrayList) {
            super(activity, arrayList, R.layout.layout_item_friend_ranking_x_v2);
            this.f89285b = booleanRef;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e PlayerRankObj playerRankObj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, playerRankObj}, this, changeQuickRedirect, false, 39580, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PlayerRankObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            com.max.xiaoheihe.module.game.pubg.utils.b.k(viewHolder, playerRankObj, viewHolder.getAdapterPosition() == 0 && this.f89285b.f124884b, viewHolder.getAdapterPosition() == getItemCount() - 1, true, true, null, true);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PlayerRankObj playerRankObj) {
            if (PatchProxy.proxy(new Object[]{eVar, playerRankObj}, this, changeQuickRedirect, false, 39581, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, playerRankObj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class u extends com.max.hbcommon.base.adapter.s<PUBGMenuObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f89286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f89288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PUBGGameDataV2Fragment f89289e;

        /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PUBGMenuObj f89290b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PUBGGameDataV2Fragment f89291c;

            a(PUBGMenuObj pUBGMenuObj, PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
                this.f89290b = pUBGMenuObj;
                this.f89291c = pUBGGameDataV2Fragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39584, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (!kotlin.jvm.internal.f0.g("1", this.f89290b.getEnable())) {
                    com.max.hbutils.utils.c.f("敬请期待");
                    return;
                }
                if (kotlin.jvm.internal.f0.g("h5", this.f89290b.getType())) {
                    String content_url = this.f89290b.getContent_url();
                    kotlin.jvm.internal.f0.o(content_url, "data.content_url");
                    if (!kotlin.text.u.v2(content_url, "http", false, 2, null)) {
                        Activity mContext = ((com.max.hbcommon.base.d) this.f89291c).mContext;
                        kotlin.jvm.internal.f0.o(mContext, "mContext");
                        com.max.xiaoheihe.base.router.b.k0(mContext, this.f89290b.getContent_url());
                        return;
                    } else {
                        Intent intent = new Intent(((com.max.hbcommon.base.d) this.f89291c).mContext, (Class<?>) WebActionActivity.class);
                        intent.putExtra("pageurl", this.f89290b.getContent_url());
                        intent.putExtra("title", this.f89290b.getDesc());
                        com.max.xiaoheihe.utils.l0.w0(((com.max.hbcommon.base.d) this.f89291c).mContext, intent);
                        return;
                    }
                }
                if (kotlin.jvm.internal.f0.g("leaderboards", this.f89290b.getKey())) {
                    PlayerLeaderboardsActivity.N1(((com.max.hbcommon.base.d) this.f89291c).mContext, lb.a.J0);
                    return;
                }
                if (!kotlin.jvm.internal.f0.g("search", this.f89290b.getKey()) || !com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) this.f89291c).mContext)) {
                    com.max.hbutils.utils.c.f("敬请期待");
                    return;
                }
                PUBGGameDataV2Fragment pUBGGameDataV2Fragment = this.f89291c;
                Activity mContext2 = ((com.max.hbcommon.base.d) pUBGGameDataV2Fragment).mContext;
                kotlin.jvm.internal.f0.o(mContext2, "mContext");
                PUBGGameDataV2Fragment.j5(pUBGGameDataV2Fragment, mContext2, 7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(List<PUBGMenuObj> list, int i10, int i11, int i12, PUBGGameDataV2Fragment pUBGGameDataV2Fragment, Activity activity) {
            super(activity, list, R.layout.item_pubg_func_menu);
            this.f89286b = i10;
            this.f89287c = i11;
            this.f89288d = i12;
            this.f89289e = pUBGGameDataV2Fragment;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.d PUBGMenuObj data) {
            if (PatchProxy.proxy(new Object[]{eVar, data}, this, changeQuickRedirect, false, 39582, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PUBGMenuObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            kotlin.jvm.internal.f0.m(eVar);
            ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = this.f89286b;
            if (this.f89287c > this.f89288d * getItemCount()) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = this.f89287c / getItemCount();
            } else {
                int i10 = this.f89287c;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) (i10 / (((int) ((i10 / this.f89288d) - 0.5f)) + 0.5f));
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
            TextView textView = (TextView) eVar.i(R.id.tv_desc);
            com.max.hbimage.b.K(data.getImage_url(), imageView);
            textView.setText(data.getDesc());
            eVar.itemView.setOnClickListener(new a(data, this.f89289e));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PUBGMenuObj pUBGMenuObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGMenuObj}, this, changeQuickRedirect, false, 39583, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pUBGMenuObj);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39585, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGGameDataV2Fragment pUBGGameDataV2Fragment = PUBGGameDataV2Fragment.this;
            PUBGGameDataV2Fragment.y5(pUBGGameDataV2Fragment, MineActivity.FragmentType.matches, "", "", pUBGGameDataV2Fragment.f89227u, PUBGGameDataV2Fragment.this.f89231y, PUBGGameDataV2Fragment.this.f89230x);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PUBGGameModeObj f89294c;

        w(PUBGGameModeObj pUBGGameModeObj) {
            this.f89294c = pUBGGameModeObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39586, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj = PUBGGameDataV2Fragment.this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj);
            List<KeyDescObj> regions = pUBGPlayerOverviewObj.getRegions();
            kotlin.jvm.internal.f0.n(regions, "null cannot be cast to non-null type java.util.ArrayList<com.max.hbcommon.bean.KeyDescObj>");
            ArrayList arrayList = (ArrayList) regions;
            String str = PUBGGameDataV2Fragment.this.f89227u;
            String mode = this.f89294c.getMode();
            String season = this.f89294c.getSeason();
            String str2 = PUBGGameDataV2Fragment.this.f89230x;
            String str3 = PUBGGameDataV2Fragment.this.B;
            String str4 = PUBGGameDataV2Fragment.this.f89228v;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = PUBGGameDataV2Fragment.this.D;
            String bg_img = pUBGPlayerOverviewObj2 != null ? pUBGPlayerOverviewObj2.getBg_img() : null;
            if (bg_img == null) {
                bg_img = "";
            }
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = PUBGGameDataV2Fragment.this.D;
            String bg_cover_lottie = pUBGPlayerOverviewObj3 != null ? pUBGPlayerOverviewObj3.getBg_cover_lottie() : null;
            PUBGDetailActivity.O1(activity, arrayList, str, mode, season, str2, str3, str4, bg_img, bg_cover_lottie != null ? bg_cover_lottie : "");
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39587, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj = PUBGGameDataV2Fragment.this.D;
            va vaVar = null;
            com.max.hbcache.c.C("PUBG_message_time", pUBGPlayerOverviewObj != null ? pUBGPlayerOverviewObj.getMessage_time() : null);
            va vaVar2 = PUBGGameDataV2Fragment.this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.B.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39588, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) PUBGGameDataV2Fragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.k0(mContext, com.max.hbcommon.network.b.c() + "/game/pubg/certify");
        }
    }

    /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
    public static final class z implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39589, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PUBGGameDataV2Fragment.this.B = z10 ? "1" : "0";
            PUBGGameDataV2Fragment.this.f89230x = "";
            PUBGGameDataV2Fragment.W4(PUBGGameDataV2Fragment.this);
        }
    }

    private final void A5(final int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39489, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ga(this.f89228v, this.f89230x, this.f89231y, this.B).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<StateObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment$getDataUpdateState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39545, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89249b.isActive()) {
                    super.onError(e10);
                    PUBGGameDataV2Fragment.Y4(this.f89249b, i10 + 1);
                }
            }

            public void onNext(@d Result<StateObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39546, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f89249b.isActive()) {
                    final PUBGGameDataV2Fragment pUBGGameDataV2Fragment = this.f89249b;
                    yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$onFailed$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: compiled from: PUBGGameDataV2Fragment.kt */
                        public static final class a implements View.OnClickListener {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ PUBGGameDataV2Fragment f89259b;

                            a(PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
                                this.f89259b = pUBGGameDataV2Fragment;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39558, new Class[]{View.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                PUBGGameDataV2Fragment.x5(this.f89259b);
                                PUBGGameDataV2Fragment.Y4(this.f89259b, 0);
                            }
                        }

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39557, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39556, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            va vaVar = pUBGGameDataV2Fragment.K;
                            va vaVar2 = null;
                            if (vaVar == null) {
                                f0.S("binding");
                                vaVar = null;
                            }
                            LinearLayout linearLayout = vaVar.M;
                            f0.o(linearLayout, "binding.vgUpdate");
                            linearLayout.setVisibility(0);
                            va vaVar3 = pUBGGameDataV2Fragment.K;
                            if (vaVar3 == null) {
                                f0.S("binding");
                                vaVar3 = null;
                            }
                            ImageView imageView = vaVar3.f116740h;
                            f0.o(imageView, "binding.ivUpdateIcon");
                            imageView.setVisibility(8);
                            va vaVar4 = pUBGGameDataV2Fragment.K;
                            if (vaVar4 == null) {
                                f0.S("binding");
                                vaVar4 = null;
                            }
                            vaVar4.f116748p.setText(R.string.update_fail);
                            ObjectAnimator objectAnimator = pUBGGameDataV2Fragment.T;
                            if (objectAnimator != null) {
                                objectAnimator.end();
                            }
                            va vaVar5 = pUBGGameDataV2Fragment.K;
                            if (vaVar5 == null) {
                                f0.S("binding");
                            } else {
                                vaVar2 = vaVar5;
                            }
                            vaVar2.M.setOnClickListener(new a(pUBGGameDataV2Fragment));
                        }
                    };
                    StateObj result2 = result.getResult();
                    String state = result2 != null ? result2.getState() : null;
                    if (!f0.g(state, ITagManager.SUCCESS)) {
                        if (f0.g(state, f.f141859j)) {
                            aVar.invoke();
                            return;
                        } else if (i10 > this.f89249b.U) {
                            aVar.invoke();
                            return;
                        } else {
                            k.f(r0.a(e1.c()), null, null, new PUBGGameDataV2Fragment$getDataUpdateState$1$onNext$1(i10, this.f89249b, result, null), 3, null);
                            return;
                        }
                    }
                    va vaVar = this.f89249b.K;
                    if (vaVar == null) {
                        f0.S("binding");
                        vaVar = null;
                    }
                    LinearLayout linearLayout = vaVar.M;
                    f0.o(linearLayout, "binding.vgUpdate");
                    linearLayout.setVisibility(0);
                    va vaVar2 = this.f89249b.K;
                    if (vaVar2 == null) {
                        f0.S("binding");
                        vaVar2 = null;
                    }
                    ImageView imageView = vaVar2.f116740h;
                    f0.o(imageView, "binding.ivUpdateIcon");
                    imageView.setVisibility(8);
                    va vaVar3 = this.f89249b.K;
                    if (vaVar3 == null) {
                        f0.S("binding");
                        vaVar3 = null;
                    }
                    vaVar3.f116748p.setText(R.string.update_success);
                    ObjectAnimator objectAnimator = this.f89249b.T;
                    if (objectAnimator != null) {
                        objectAnimator.end();
                    }
                    va vaVar4 = this.f89249b.K;
                    if (vaVar4 == null) {
                        f0.S("binding");
                        vaVar4 = null;
                    }
                    vaVar4.M.setOnClickListener(null);
                    PUBGGameDataV2Fragment.W4(this.f89249b);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39547, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<StateObj>) obj);
            }
        }));
    }

    private final void B5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39509, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().B9(this.f89226t, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void C5(Context context, int i10) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 39505, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (context instanceof com.max.hbminiprogram.h) {
            Bundle bundle = new Bundle();
            bundle.putInt(com.max.xiaoheihe.module.search.b.f91614a.e(), i10);
            ((com.max.hbminiprogram.h) context).s0(lb.d.f131253t, bundle);
        } else {
            Activity mContext = this.mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.w0(mContext, i10).A();
        }
    }

    private final boolean D5() {
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj;
        String message_time;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39508, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strO = com.max.hbcache.c.o("PUBG_message_time", "");
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        long j10 = 0;
        long j11 = (TextUtils.isEmpty(pUBGPlayerOverviewObj2 != null ? pUBGPlayerOverviewObj2.getMessage_time() : null) || (pUBGPlayerOverviewObj = this.D) == null || (message_time = pUBGPlayerOverviewObj.getMessage_time()) == null) ? 0L : Long.parseLong(message_time);
        if (!TextUtils.isEmpty(strO)) {
            kotlin.jvm.internal.f0.m(strO);
            j10 = Long.parseLong(strO);
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = this.D;
        return !TextUtils.isEmpty(pUBGPlayerOverviewObj3 != null ? pUBGPlayerOverviewObj3.getMessage() : null) && j11 > j10;
    }

    private final void E5() {
        Activity activity;
        PopupWindow popupWindow;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39502, new Class[0], Void.TYPE).isSupported || (activity = this.mContext) == null || activity.isFinishing() || (popupWindow = this.M) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(popupWindow);
        if (popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.M;
            kotlin.jvm.internal.f0.m(popupWindow2);
            popupWindow2.dismiss();
        }
    }

    @dl.e
    @xh.m
    public static final Fragment F5(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 39521, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : V.b(map);
    }

    @dl.d
    @xh.m
    public static final PUBGGameDataV2Fragment G5(@dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 39518, new Class[]{Bundle.class}, PUBGGameDataV2Fragment.class);
        return patchProxyResultProxy.isSupported ? (PUBGGameDataV2Fragment) patchProxyResultProxy.result : V.c(bundle);
    }

    @dl.d
    @xh.m
    public static final PUBGGameDataV2Fragment H5(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 39520, new Class[]{String.class}, PUBGGameDataV2Fragment.class);
        return patchProxyResultProxy.isSupported ? (PUBGGameDataV2Fragment) patchProxyResultProxy.result : V.d(str);
    }

    @dl.d
    @xh.m
    public static final PUBGGameDataV2Fragment I5(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, null, changeQuickRedirect, true, 39519, new Class[]{String.class, String.class, String.class, String.class}, PUBGGameDataV2Fragment.class);
        return patchProxyResultProxy.isSupported ? (PUBGGameDataV2Fragment) patchProxyResultProxy.result : V.e(str, str2, str3, str4);
    }

    private final void J5() {
        PUBGGameStatsObj stats;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39496, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m90[] m90VarArr = new m90[3];
        va vaVar = this.K;
        if (vaVar == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar = null;
        }
        m90VarArr[0] = vaVar.E;
        va vaVar2 = this.K;
        if (vaVar2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar2 = null;
        }
        m90VarArr[1] = vaVar2.D;
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        m90VarArr[2] = vaVar3.F;
        int i10 = 0;
        for (m90 card : CollectionsKt__CollectionsKt.r(m90VarArr)) {
            int i11 = i10 + 1;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
            List<PUBGGameModeObj> modes = (pUBGPlayerOverviewObj == null || (stats = pUBGPlayerOverviewObj.getStats()) == null) ? null : stats.getModes();
            if (i10 < (modes != null ? modes.size() : 0)) {
                card.b().setVisibility(0);
                kotlin.jvm.internal.f0.o(card, "card");
                kotlin.jvm.internal.f0.m(modes);
                R5(card, modes.get(i10));
            } else {
                card.b().setVisibility(8);
            }
            i10 = i11;
        }
    }

    private final void K5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39507, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.w0(200L);
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        va vaVar = null;
        if (!(pUBGPlayerOverviewObj != null ? kotlin.jvm.internal.f0.g(pUBGPlayerOverviewObj.getExpand(), Boolean.TRUE) : false)) {
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar2 = null;
            }
            vaVar2.f116750r.f114803b.setVisibility(8);
            va vaVar3 = this.K;
            if (vaVar3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar3 = null;
            }
            vaVar3.f116750r.f114804c.setText("更多摘要 \uf0d7");
            va vaVar4 = this.K;
            if (vaVar4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar4 = null;
            }
            vaVar4.f116750r.f114804c.setOnClickListener(new h(autoTransition));
            va vaVar5 = this.K;
            if (vaVar5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar5 = null;
            }
            ViewGroup.LayoutParams layoutParams = vaVar5.f116750r.f114803b.getLayoutParams();
            layoutParams.height = 0;
            va vaVar6 = this.K;
            if (vaVar6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar6 = null;
            }
            vaVar6.f116750r.f114803b.setLayoutParams(layoutParams);
            va vaVar7 = this.K;
            if (vaVar7 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar7;
            }
            vaVar.f116750r.f114806e.b().setVisibility(8);
            return;
        }
        va vaVar8 = this.K;
        if (vaVar8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar8 = null;
        }
        vaVar8.f116750r.f114803b.setVisibility(0);
        va vaVar9 = this.K;
        if (vaVar9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar9 = null;
        }
        vaVar9.f116750r.f114804c.setText("收起 \uf0d8");
        va vaVar10 = this.K;
        if (vaVar10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar10 = null;
        }
        vaVar10.f116750r.f114804c.setOnClickListener(new g(autoTransition));
        va vaVar11 = this.K;
        if (vaVar11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar11 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = vaVar11.f116750r.f114803b.getLayoutParams();
        layoutParams2.height = -2;
        va vaVar12 = this.K;
        if (vaVar12 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar12 = null;
        }
        vaVar12.f116750r.f114803b.setLayoutParams(layoutParams2);
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        if ((pUBGPlayerOverviewObj2 != null ? pUBGPlayerOverviewObj2.getRadar_score() : null) != null) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = this.D;
            if ((pUBGPlayerOverviewObj3 != null ? pUBGPlayerOverviewObj3.getPlayer_rank_round() : null) != null) {
                PUBGPlayerOverviewObj pUBGPlayerOverviewObj4 = this.D;
                if ((pUBGPlayerOverviewObj4 != null ? pUBGPlayerOverviewObj4.getNormal_score_round() : null) != null) {
                    va vaVar13 = this.K;
                    if (vaVar13 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        vaVar = vaVar13;
                    }
                    vaVar.f116750r.f114806e.b().setVisibility(0);
                    return;
                }
            }
        }
        va vaVar14 = this.K;
        if (vaVar14 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar = vaVar14;
        }
        vaVar.f116750r.f114806e.b().setVisibility(8);
    }

    private final void L5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39490, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameBindingFragment gameBindingFragment = this.R;
        if (gameBindingFragment != null && gameBindingFragment.isActive()) {
            GameBindingFragment gameBindingFragment2 = this.R;
            kotlin.jvm.internal.f0.m(gameBindingFragment2);
            gameBindingFragment2.r4();
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        va vaVar = null;
        if ((pUBGPlayerOverviewObj != null ? pUBGPlayerOverviewObj.getPlayer_info() : null) != null) {
            this.rootView.findViewById(R.id.vg_bind_card_container).setVisibility(8);
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.f116738f.setVisibility(0);
            return;
        }
        if (this.C) {
            va vaVar3 = this.K;
            if (vaVar3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar3 = null;
            }
            vaVar3.f116751s.setVisibility(0);
            va vaVar4 = this.K;
            if (vaVar4 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar4;
            }
            vaVar.f116738f.setVisibility(8);
            GameBindingFragment gameBindingFragment3 = (GameBindingFragment) getChildFragmentManager().r0(R.id.vg_bind_card_container);
            this.R = gameBindingFragment3;
            if (gameBindingFragment3 == null) {
                this.R = GameBindingFragment.o4(lb.a.J0, true);
                p0 p0VarU = getChildFragmentManager().u();
                GameBindingFragment gameBindingFragment4 = this.R;
                kotlin.jvm.internal.f0.m(gameBindingFragment4);
                p0 p0VarB = p0VarU.b(R.id.vg_bind_card_container, gameBindingFragment4);
                GameBindingFragment gameBindingFragment5 = this.R;
                kotlin.jvm.internal.f0.m(gameBindingFragment5);
                p0VarB.P(gameBindingFragment5).n();
            }
        }
    }

    private final void M5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39501, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(this.mContext, 400.0f);
        va vaVar = null;
        if (this.E) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iF);
            valueAnimatorOfInt.addUpdateListener(new i(iF));
            valueAnimatorOfInt.start();
            addValueAnimator(valueAnimatorOfInt);
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar2 = null;
            }
            vaVar2.f116753u.f110892g.setTypeface(bb.d.a().b(0));
            va vaVar3 = this.K;
            if (vaVar3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar3 = null;
            }
            TextView textView = vaVar3.f116753u.f110892g;
            Context context = getContext();
            Context context2 = getContext();
            va vaVar4 = this.K;
            if (vaVar4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar4 = null;
            }
            textView.setBackground(com.max.hbutils.utils.q.d(context, R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(context2, vaVar4.f116753u.f110892g)));
            va vaVar5 = this.K;
            if (vaVar5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar5 = null;
            }
            vaVar5.f116753u.f110892g.setClickable(true);
            va vaVar6 = this.K;
            if (vaVar6 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar6;
            }
            vaVar.f116753u.f110892g.setText(getString(R.string.this_week) + " \uf0d8");
            return;
        }
        va vaVar7 = this.K;
        if (vaVar7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar7 = null;
        }
        vaVar7.f116753u.f110888c.setVisibility(0);
        va vaVar8 = this.K;
        if (vaVar8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar8 = null;
        }
        String string = vaVar8.f116753u.f110892g.getText().toString();
        String string2 = getString(R.string.this_week);
        kotlin.jvm.internal.f0.o(string2, "getString(R.string.this_week)");
        if (StringsKt__StringsKt.W2(string, string2, false, 2, null)) {
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iF, 0);
            valueAnimatorOfInt2.addUpdateListener(new j(iF));
            valueAnimatorOfInt2.start();
            addValueAnimator(valueAnimatorOfInt2);
        } else {
            va vaVar9 = this.K;
            if (vaVar9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar9 = null;
            }
            ViewGroup.LayoutParams layoutParams = vaVar9.f116753u.f110893h.getLayoutParams();
            layoutParams.height = 0;
            va vaVar10 = this.K;
            if (vaVar10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar10 = null;
            }
            vaVar10.f116753u.f110893h.setLayoutParams(layoutParams);
            va vaVar11 = this.K;
            if (vaVar11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar11 = null;
            }
            vaVar11.f116753u.f110888c.setAlpha(1.0f);
            va vaVar12 = this.K;
            if (vaVar12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar12 = null;
            }
            vaVar12.f116753u.f110893h.requestLayout();
        }
        va vaVar13 = this.K;
        if (vaVar13 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar13 = null;
        }
        vaVar13.f116753u.f110892g.setTypeface(bb.d.a().b(0));
        va vaVar14 = this.K;
        if (vaVar14 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar14 = null;
        }
        TextView textView2 = vaVar14.f116753u.f110892g;
        Context context3 = getContext();
        Context context4 = getContext();
        va vaVar15 = this.K;
        if (vaVar15 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar15 = null;
        }
        textView2.setBackground(com.max.hbutils.utils.q.d(context3, R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(context4, vaVar15.f116753u.f110892g)));
        va vaVar16 = this.K;
        if (vaVar16 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar16 = null;
        }
        vaVar16.f116753u.f110892g.setClickable(true);
        va vaVar17 = this.K;
        if (vaVar17 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar = vaVar17;
        }
        vaVar.f116753u.f110892g.setText(getString(R.string.this_month) + " \uf0d7");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void N5() {
        String str;
        boolean z10;
        List<PUBGMatchObj> calendar;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39500, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        if (!((pUBGPlayerOverviewObj == null || (calendar = pUBGPlayerOverviewObj.getCalendar()) == null || !(calendar.isEmpty() ^ true)) ? false : true)) {
            va vaVar = null;
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.f116753u.b().setVisibility(8);
            return;
        }
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.f116753u.b().setVisibility(0);
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj2);
        List<PUBGTrendObj> trend = pUBGPlayerOverviewObj2.getTrend();
        int size = trend != null ? trend.size() : 0;
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj3);
        int size2 = pUBGPlayerOverviewObj3.getCalendar().size();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj4 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj4);
            long jR = com.max.hbutils.utils.n.r(pUBGPlayerOverviewObj4.getTrend().get(i10).getTime());
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    z10 = false;
                    break;
                }
                PUBGPlayerOverviewObj pUBGPlayerOverviewObj5 = this.D;
                kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj5);
                long j10 = 1000;
                if (com.max.hbutils.utils.w.J(com.max.hbutils.utils.n.r(pUBGPlayerOverviewObj5.getCalendar().get(i11).getTime()) * j10, j10 * jR)) {
                    PUBGPlayerOverviewObj pUBGPlayerOverviewObj6 = this.D;
                    kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj6);
                    PUBGMatchObj pUBGMatchObj = pUBGPlayerOverviewObj6.getCalendar().get(i11);
                    if (pUBGMatchObj != null) {
                        PUBGPlayerOverviewObj pUBGPlayerOverviewObj7 = this.D;
                        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj7);
                        pUBGMatchObj.setDesc(pUBGPlayerOverviewObj7.getTrend().get(i10).getDesc());
                    }
                    PUBGPlayerOverviewObj pUBGPlayerOverviewObj8 = this.D;
                    kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj8);
                    arrayList.add(pUBGPlayerOverviewObj8.getCalendar().get(i11));
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (!z10) {
                PUBGMatchObj pUBGMatchObj2 = new PUBGMatchObj();
                PUBGPlayerOverviewObj pUBGPlayerOverviewObj9 = this.D;
                kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj9);
                pUBGMatchObj2.setDesc(pUBGPlayerOverviewObj9.getTrend().get(i10).getDesc());
                arrayList.add(pUBGMatchObj2);
            }
        }
        float fL = (ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 339.0f)) / 6.0f;
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        vaVar4.f116753u.f110888c.removeAllViews();
        int i12 = 0;
        while (i12 < size) {
            PUBGMatchObj pUBGMatchObj3 = (PUBGMatchObj) arrayList.get(i12);
            int iQ = com.max.hbutils.utils.n.q(pUBGMatchObj3 != null ? pUBGMatchObj3.getMatch_count() : null);
            PUBGMatchObj pUBGMatchObj4 = (PUBGMatchObj) arrayList.get(i12);
            String time = pUBGMatchObj4 != null ? pUBGMatchObj4.getTime() : null;
            PUBGMatchObj pUBGMatchObj5 = (PUBGMatchObj) arrayList.get(i12);
            String title = pUBGMatchObj5 != null ? pUBGMatchObj5.getTitle() : null;
            LayoutInflater layoutInflater = this.mInflater;
            va vaVar5 = this.K;
            if (vaVar5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar5 = null;
            }
            View viewInflate = layoutInflater.inflate(R.layout.item_pubg_calendar, vaVar5.f116753u.f110888c, z11);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_date);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_score);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = layoutParams == null ? new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 45.0f), ViewUtils.f(this.mContext, 64.0f)) : layoutParams;
            if (i12 != 0) {
                ((LinearLayout.LayoutParams) layoutParams2).setMarginStart((int) fL);
            }
            textView2.setTypeface(bb.d.a().b(5));
            if (iQ > 0) {
                float f10 = ViewUtils.f(this.mContext, 13.0f);
                Activity activity = this.mContext;
                PUBGMatchObj pUBGMatchObj6 = (PUBGMatchObj) arrayList.get(i12);
                textView2.setBackground(ViewUtils.j(f10, com.max.xiaoheihe.module.game.pubg.utils.b.b(activity, pUBGMatchObj6 != null ? pUBGMatchObj6.getTag() : null)));
                Activity activity2 = this.mContext;
                PUBGMatchObj pUBGMatchObj7 = (PUBGMatchObj) arrayList.get(i12);
                textView2.setTextColor(com.max.xiaoheihe.module.game.pubg.utils.b.c(activity2, pUBGMatchObj7 != null ? pUBGMatchObj7.getTag() : null));
                textView2.setText(String.valueOf(iQ));
                viewInflate.setOnClickListener(new k(time, title));
                str = null;
            } else {
                float f11 = ViewUtils.f(this.mContext, 13.0f);
                Activity activity3 = this.mContext;
                PUBGMatchObj pUBGMatchObj8 = (PUBGMatchObj) arrayList.get(i12);
                textView2.setBackground(ViewUtils.j(f11, com.max.xiaoheihe.module.game.pubg.utils.b.b(activity3, pUBGMatchObj8 != null ? pUBGMatchObj8.getTag() : null)));
                Activity activity4 = this.mContext;
                PUBGMatchObj pUBGMatchObj9 = (PUBGMatchObj) arrayList.get(i12);
                textView2.setTextColor(com.max.xiaoheihe.module.game.pubg.utils.b.c(activity4, pUBGMatchObj9 != null ? pUBGMatchObj9.getTag() : null));
                textView2.setText("0");
                str = null;
                viewInflate.setOnClickListener(null);
            }
            int i13 = size;
            float f12 = fL;
            Calendar.getInstance().setTimeInMillis(com.max.hbutils.utils.n.r(time) * ((long) 1000));
            PUBGMatchObj pUBGMatchObj10 = (PUBGMatchObj) arrayList.get(i12);
            textView.setText(pUBGMatchObj10 != null ? pUBGMatchObj10.getDesc() : str);
            va vaVar6 = this.K;
            if (vaVar6 == 0) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar6 = str;
            }
            vaVar6.f116753u.f110888c.addView(viewInflate, layoutParams2);
            i12++;
            size = i13;
            fL = f12;
            z11 = false;
        }
        va vaVar7 = null;
        va vaVar8 = this.K;
        if (vaVar8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar8 = null;
        }
        vaVar8.f116753u.f110893h.setVisibility(0);
        va vaVar9 = this.K;
        if (vaVar9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar9 = null;
        }
        vaVar9.f116753u.f110892g.setVisibility(0);
        va vaVar10 = this.K;
        if (vaVar10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar10 = null;
        }
        bb.d.d(vaVar10.f116753u.f110892g, 0);
        va vaVar11 = this.K;
        if (vaVar11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar11 = null;
        }
        vaVar11.f116753u.f110887b.q(1);
        va vaVar12 = this.K;
        if (vaVar12 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar12 = null;
        }
        vaVar12.f116753u.f110887b.setOnDaySelectedListener(new l());
        va vaVar13 = this.K;
        if (vaVar13 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar13 = null;
        }
        vaVar13.f116753u.f110887b.setOnMonthChangedListener(new m());
        va vaVar14 = this.K;
        if (vaVar14 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar14 = null;
        }
        vaVar14.f116753u.f110887b.setOnUpdateNavButtonListener(new n());
        va vaVar15 = this.K;
        if (vaVar15 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar15 = null;
        }
        vaVar15.f116753u.f110890e.setOnClickListener(new o());
        va vaVar16 = this.K;
        if (vaVar16 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar16 = null;
        }
        vaVar16.f116753u.f110889d.setOnClickListener(new p());
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj10 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj10);
        long j11 = 1000;
        long jR2 = com.max.hbutils.utils.n.r(pUBGPlayerOverviewObj10.getCalendar().get(0).getTime()) * j11;
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj11 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj11);
        Iterator<PUBGMatchObj> it = pUBGPlayerOverviewObj11.getCalendar().iterator();
        long j12 = jR2;
        while (it.hasNext()) {
            long jR3 = com.max.hbutils.utils.n.r(it.next().getTime()) * j11;
            if (jR3 < jR2) {
                jR2 = jR3;
            }
            if (jR3 > j12) {
                j12 = jR3;
            }
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jR2);
        calendar2.set(5, 1);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(j12);
        calendar3.set(5, calendar3.getActualMaximum(5));
        va vaVar17 = this.K;
        if (vaVar17 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar17 = null;
        }
        vaVar17.f116753u.f110887b.setMinDate(calendar2.getTimeInMillis());
        va vaVar18 = this.K;
        if (vaVar18 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar18 = null;
        }
        vaVar18.f116753u.f110887b.setMaxDate(calendar3.getTimeInMillis());
        va vaVar19 = this.K;
        if (vaVar19 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar19 = null;
        }
        vaVar19.f116753u.f110887b.setDate(calendar3.getTimeInMillis(), false);
        va vaVar20 = this.K;
        if (vaVar20 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar20 = null;
        }
        vaVar20.f116753u.f110887b.g();
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj12 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj12);
        for (PUBGMatchObj pUBGMatchObj11 : pUBGPlayerOverviewObj12.getCalendar()) {
            Bundle bundle = new Bundle();
            bundle.putInt("style", 8);
            bundle.putInt(EZCalendarView.B, com.max.xiaoheihe.module.game.pubg.utils.b.b(this.mContext, pUBGMatchObj11.getTag()));
            bundle.putInt(EZCalendarView.D, com.max.xiaoheihe.module.game.pubg.utils.b.c(this.mContext, pUBGMatchObj11.getTag()));
            bundle.putInt(EZCalendarView.C, com.max.hbutils.utils.n.q(pUBGMatchObj11.getMatch_count()));
            bundle.putString("KEY_TITLE", pUBGMatchObj11.getTitle());
            long jR4 = com.max.hbutils.utils.n.r(pUBGMatchObj11.getTime()) * j11;
            va vaVar21 = this.K;
            if (vaVar21 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar21 = null;
            }
            vaVar21.f116753u.f110887b.n(jR4, bundle);
        }
        va vaVar22 = this.K;
        if (vaVar22 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar7 = vaVar22;
        }
        vaVar7.f116753u.f110892g.setOnClickListener(new q());
        M5();
    }

    private final void O5() {
        List<PlayerInfoObj> follow;
        List<PlayerRankObj> friends;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39495, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.F.clear();
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        if (pUBGPlayerOverviewObj != null && (friends = pUBGPlayerOverviewObj.getFriends()) != null) {
            this.F.addAll(friends);
        }
        this.G.clear();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        va vaVar = null;
        if ((pUBGPlayerOverviewObj2 != null ? pUBGPlayerOverviewObj2.getUser_rank() : null) != null) {
            ArrayList<PlayerRankObj> arrayList = this.F;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj3);
            PlayerRankObj user_rank = pUBGPlayerOverviewObj3.getUser_rank();
            kotlin.jvm.internal.f0.m(user_rank);
            arrayList.add(user_rank);
            booleanRef.f124884b = true;
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj4 = this.D;
        if (pUBGPlayerOverviewObj4 != null && (follow = pUBGPlayerOverviewObj4.getFollow()) != null) {
            this.G.addAll(follow);
        }
        if (TextUtils.isEmpty(this.f89227u) || (this.F.isEmpty() && this.G.isEmpty())) {
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.f116757y.b().setVisibility(8);
            return;
        }
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.f116757y.b().setVisibility(0);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        RecyclerView recyclerView = vaVar4.f116757y.f111339b;
        final Activity activity = this.mContext;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity) { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment$refreshFriendList$3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        t tVar = new t(booleanRef, this.mContext, this.F);
        new s(this.mContext, this.G);
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar5 = null;
        }
        vaVar5.f116757y.f111341d.setText(this.C ? com.max.xiaoheihe.utils.d.n0(R.string.my_friend) : com.max.xiaoheihe.utils.d.n0(R.string.his_friend));
        va vaVar6 = this.K;
        if (vaVar6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar6 = null;
        }
        TextView textView = vaVar6.f116757y.f111342e;
        va vaVar7 = this.K;
        if (vaVar7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar7 = null;
        }
        textView.setText(vaVar7.f116757y.f111341d.getText());
        va vaVar8 = this.K;
        if (vaVar8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar8 = null;
        }
        vaVar8.f116757y.f111340c.setTypeface(bb.d.a().b(0));
        va vaVar9 = this.K;
        if (vaVar9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar9 = null;
        }
        TextView textView2 = vaVar9.f116757y.f111340c;
        Context context = getContext();
        Context context2 = getContext();
        va vaVar10 = this.K;
        if (vaVar10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar10 = null;
        }
        textView2.setBackground(com.max.hbutils.utils.q.d(context, R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(context2, vaVar10.f116757y.f111340c)));
        va vaVar11 = this.K;
        if (vaVar11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar11 = null;
        }
        vaVar11.f116757y.f111340c.setClickable(true);
        va vaVar12 = this.K;
        if (vaVar12 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar12 = null;
        }
        vaVar12.f116757y.f111340c.setText("全部好友 \uf0da");
        va vaVar13 = this.K;
        if (vaVar13 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar13 = null;
        }
        vaVar13.f116757y.f111339b.setAdapter(tVar);
        va vaVar14 = this.K;
        if (vaVar14 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar = vaVar14;
        }
        vaVar.f116757y.f111340c.setOnClickListener(new r());
    }

    private final void P5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39504, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        va vaVar = null;
        List<PUBGMenuObj> menu = pUBGPlayerOverviewObj != null ? pUBGPlayerOverviewObj.getMenu() : null;
        if (menu == null || menu.isEmpty()) {
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.I.f112097b.setVisibility(8);
            return;
        }
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.I.f112097b.setVisibility(0);
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj2);
        List<PUBGMenuObj> menu2 = pUBGPlayerOverviewObj2.getMenu();
        kotlin.jvm.internal.f0.m(menu2);
        int iF = ViewUtils.f(this.mContext, 48.0f);
        int iF2 = ViewUtils.f(this.mContext, 54.0f);
        int iL = ViewUtils.L(this.mContext);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        vaVar4.I.f112097b.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar = vaVar5;
        }
        vaVar.I.f112097b.setAdapter(new u(menu2, iF2, iL, iF, this, this.mContext));
    }

    private final void Q5() {
        List<PUBGMatchObj> matches;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39498, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.H.clear();
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        if (pUBGPlayerOverviewObj != null && (matches = pUBGPlayerOverviewObj.getMatches()) != null) {
            this.H.addAll(matches);
        }
        va vaVar = null;
        if (!(!this.H.isEmpty())) {
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.A.b().setVisibility(8);
            return;
        }
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.A.b().setVisibility(0);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        vaVar4.A.f112494c.setTypeface(bb.d.a().b(0));
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar5 = null;
        }
        TextView textView = vaVar5.A.f112494c;
        Context context = getContext();
        Context context2 = getContext();
        va vaVar6 = this.K;
        if (vaVar6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar6 = null;
        }
        textView.setBackground(com.max.hbutils.utils.q.d(context, R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(context2, vaVar6.A.f112494c)));
        va vaVar7 = this.K;
        if (vaVar7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar7 = null;
        }
        vaVar7.A.f112494c.setClickable(true);
        va vaVar8 = this.K;
        if (vaVar8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar8 = null;
        }
        vaVar8.A.f112494c.setText("全部比赛 \uf0da");
        va vaVar9 = this.K;
        if (vaVar9 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar = vaVar9;
        }
        vaVar.A.f112494c.setOnClickListener(new v());
        com.max.hbcommon.base.adapter.s<PUBGMatchObj> sVar = this.J;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
        }
    }

    private final void R5(m90 m90Var, PUBGGameModeObj pUBGGameModeObj) {
        if (PatchProxy.proxy(new Object[]{m90Var, pUBGGameModeObj}, this, changeQuickRedirect, false, 39497, new Class[]{m90.class, PUBGGameModeObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (pUBGGameModeObj == null) {
            m90Var.b().setVisibility(8);
            return;
        }
        List<PUBGDataObj> values = pUBGGameModeObj.getValues();
        if ((values != null ? values.size() : 0) <= 0) {
            m90Var.b().setVisibility(8);
            return;
        }
        m90Var.f113355h.setOnClickListener(new w(pUBGGameModeObj));
        m90Var.f113354g.setText(pUBGGameModeObj.getMode_desc());
        int iE1 = !TextUtils.isEmpty(pUBGGameModeObj.getColor()) ? com.max.xiaoheihe.utils.d.e1(pUBGGameModeObj.getColor()) : com.max.xiaoheihe.module.game.pubg.utils.c.e(pUBGGameModeObj.getMode());
        m90Var.f113354g.setTextColor(iE1);
        com.max.hbimage.b.R(pUBGGameModeObj.getMode_img(), m90Var.f113350c, 0, ViewUtils.f(getContext(), 12.0f), 1, -1);
        m90Var.f113350c.setColorFilter(iE1);
        m90Var.f113353f.setText(pUBGGameModeObj.getMatch_count());
        if (TextUtils.isEmpty(pUBGGameModeObj.getRating_img())) {
            m90Var.f113349b.setVisibility(8);
        } else {
            m90Var.f113349b.setVisibility(0);
            com.max.hbimage.b.K(pUBGGameModeObj.getRating_img(), m90Var.f113349b);
        }
        if (TextUtils.isEmpty(pUBGGameModeObj.getRating_desc())) {
            m90Var.f113352e.setVisibility(8);
        } else {
            m90Var.f113352e.setVisibility(0);
            m90Var.f113352e.setText(pUBGGameModeObj.getRating_desc());
        }
        ArrayList arrayList = new ArrayList();
        if (pUBGGameModeObj.getValues() != null) {
            arrayList.addAll(pUBGGameModeObj.getValues());
        }
        if (m90Var.f113351d.getAdapter() != null) {
            RecyclerView.Adapter adapter = m90Var.f113351d.getAdapter();
            kotlin.jvm.internal.f0.n(adapter, "null cannot be cast to non-null type com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGDataAdapterV2");
            ((com.max.xiaoheihe.module.littleprogram.fragment.pubg.a) adapter).q(pUBGGameModeObj.getMode());
            RecyclerView.Adapter adapter2 = m90Var.f113351d.getAdapter();
            kotlin.jvm.internal.f0.n(adapter2, "null cannot be cast to non-null type com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGDataAdapterV2");
            ((com.max.xiaoheihe.module.littleprogram.fragment.pubg.a) adapter2).p(arrayList);
            return;
        }
        com.max.xiaoheihe.module.littleprogram.fragment.pubg.a aVar = new com.max.xiaoheihe.module.littleprogram.fragment.pubg.a(this.mContext, arrayList, 4, pUBGGameModeObj.getMode(), lb.a.J0);
        aVar.r(Integer.valueOf(iE1));
        aVar.s(Integer.valueOf(ViewUtils.f(this.mContext, 3.0f)));
        RecyclerView recyclerView = m90Var.f113351d;
        final Activity activity = this.mContext;
        recyclerView.setLayoutManager(new GridLayoutManager(activity) { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment$refreshModeCard$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        m90Var.f113351d.setAdapter(aVar);
    }

    private final void S5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39492, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        va vaVar = null;
        if (!D5()) {
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.B.setVisibility(8);
            return;
        }
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.B.setVisibility(0);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        MarqueeTextView marqueeTextView = vaVar4.f116741i;
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        marqueeTextView.setText(pUBGPlayerOverviewObj != null ? pUBGPlayerOverviewObj.getMessage() : null);
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar = vaVar5;
        }
        vaVar.f116739g.setOnClickListener(new x());
    }

    /* JADX WARN: Code duplicated, block: B:142:0x022e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0232  */
    /* JADX WARN: Code duplicated, block: B:200:0x0397  */
    /* JADX WARN: Code duplicated, block: B:202:0x039b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0500  */
    /* JADX WARN: Code duplicated, block: B:285:0x0504  */
    /* JADX WARN: Code duplicated, block: B:288:0x0513  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v50, types: [T, com.max.hbcommon.component.HeyBoxPopupMenu] */
    private final void T5() {
        String nickname;
        va vaVar;
        va vaVar2;
        va vaVar3;
        va vaVar4;
        PUBGCareerObj career;
        List<GameGridDataCardObj> overview;
        PUBGCareerObj career2;
        List<GameGridDataCardObj> overview2;
        PUBGCareerObj career3;
        List<GameGridDataCardObj> overview3;
        List<KeyDescObj> regions;
        KeyDescObj keyDescObj;
        PlayerInfoObj player_info;
        PlayerInfoObj player_info2;
        PlayerInfoObj player_info3;
        PlayerInfoObj player_info4;
        PlayerInfoObj player_info5;
        PlayerInfoObj player_info6;
        PlayerInfoObj player_info7;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39493, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        va vaVar5 = null;
        if (!com.max.hbcommon.utils.c.u((pUBGPlayerOverviewObj == null || (player_info7 = pUBGPlayerOverviewObj.getPlayer_info()) == null) ? null : player_info7.getReal_name())) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
            this.f89227u = (pUBGPlayerOverviewObj2 == null || (player_info6 = pUBGPlayerOverviewObj2.getPlayer_info()) == null) ? null : player_info6.getReal_name();
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = this.D;
        if (!com.max.hbcommon.utils.c.u((pUBGPlayerOverviewObj3 == null || (player_info5 = pUBGPlayerOverviewObj3.getPlayer_info()) == null) ? null : player_info5.getPlayer_id())) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj4 = this.D;
            this.f89228v = (pUBGPlayerOverviewObj4 == null || (player_info4 = pUBGPlayerOverviewObj4.getPlayer_info()) == null) ? null : player_info4.getPlayer_id();
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj5 = this.D;
        if (!com.max.hbcommon.utils.c.u((pUBGPlayerOverviewObj5 == null || (player_info3 = pUBGPlayerOverviewObj5.getPlayer_info()) == null) ? null : player_info3.getNickname())) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj6 = this.D;
            this.f89226t = (pUBGPlayerOverviewObj6 == null || (player_info2 = pUBGPlayerOverviewObj6.getPlayer_info()) == null) ? null : player_info2.getNickname();
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj7 = this.D;
        if (TextUtils.isEmpty((pUBGPlayerOverviewObj7 == null || (player_info = pUBGPlayerOverviewObj7.getPlayer_info()) == null) ? null : player_info.getNickname())) {
            va vaVar6 = this.K;
            if (vaVar6 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar5 = vaVar6;
            }
            vaVar5.H.setVisibility(8);
            return;
        }
        va vaVar7 = this.K;
        if (vaVar7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar7 = null;
        }
        vaVar7.H.setVisibility(0);
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj8 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj8);
        this.f89227u = pUBGPlayerOverviewObj8.getPlayer_info().getReal_name();
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj9 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj9);
        this.f89226t = pUBGPlayerOverviewObj9.getPlayer_info().getNickname();
        if (com.max.hbcommon.utils.c.u(this.f89227u)) {
            this.f89227u = this.f89226t;
        }
        if (com.max.hbcommon.utils.c.u(this.f89228v)) {
            this.f89228v = this.f89227u;
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj10 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj10);
        String avatar = pUBGPlayerOverviewObj10.getPlayer_info().getAvatar();
        va vaVar8 = this.K;
        if (vaVar8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar8 = null;
        }
        com.max.hbimage.b.e0(avatar, vaVar8.f116736d, ViewUtils.f(getContext(), 6.0f), R.drawable.common_default_game_avatar_74x74);
        if (TextUtils.isEmpty(this.f89226t)) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj11 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj11);
            nickname = pUBGPlayerOverviewObj11.getPlayer_info().getSteam_nickname();
            kotlin.jvm.internal.f0.o(nickname, "{\n                data!!…am_nickname\n            }");
        } else {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj12 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj12);
            nickname = pUBGPlayerOverviewObj12.getPlayer_info().getNickname();
            kotlin.jvm.internal.f0.o(nickname, "{\n                data!!…fo.nickname\n            }");
        }
        va vaVar9 = this.K;
        if (vaVar9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar9 = null;
        }
        vaVar9.f116746n.setText(nickname);
        if (this.C) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj13 = this.D;
            String certified = pUBGPlayerOverviewObj13 != null ? pUBGPlayerOverviewObj13.getCertified() : null;
            if (!(certified == null || certified.length() == 0)) {
                PUBGPlayerOverviewObj pUBGPlayerOverviewObj14 = this.D;
                kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj14);
                String certified2 = pUBGPlayerOverviewObj14.getCertified();
                if (kotlin.jvm.internal.f0.g(certified2, "0")) {
                    va vaVar10 = this.K;
                    if (vaVar10 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        vaVar10 = null;
                    }
                    vaVar10.f116752t.setVisibility(8);
                } else if (kotlin.jvm.internal.f0.g(certified2, "1")) {
                    va vaVar11 = this.K;
                    if (vaVar11 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        vaVar11 = null;
                    }
                    vaVar11.f116752t.setVisibility(0);
                    va vaVar12 = this.K;
                    if (vaVar12 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        vaVar12 = null;
                    }
                    vaVar12.f116752t.setOnClickListener(new y());
                } else {
                    va vaVar13 = this.K;
                    if (vaVar13 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        vaVar13 = null;
                    }
                    vaVar13.f116752t.setVisibility(8);
                }
            }
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj15 = this.D;
        if (kotlin.jvm.internal.f0.g("1", pUBGPlayerOverviewObj15 != null ? pUBGPlayerOverviewObj15.getShow_fpp() : null)) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj16 = this.D;
            if (kotlin.jvm.internal.f0.g("1", pUBGPlayerOverviewObj16 != null ? pUBGPlayerOverviewObj16.getShow_person_mode() : null)) {
                vaVar = this.K;
                if (vaVar == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar = null;
                }
                vaVar.f116734b.setVisibility(8);
            } else {
                va vaVar14 = this.K;
                if (vaVar14 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar14 = null;
                }
                vaVar14.f116734b.setVisibility(0);
                if (com.max.hbcommon.utils.c.u(this.B)) {
                    va vaVar15 = this.K;
                    if (vaVar15 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        vaVar15 = null;
                    }
                    CheckBox checkBox = vaVar15.f116734b;
                    PUBGPlayerOverviewObj pUBGPlayerOverviewObj17 = this.D;
                    checkBox.setChecked(kotlin.jvm.internal.f0.g("1", pUBGPlayerOverviewObj17 != null ? pUBGPlayerOverviewObj17.getFpp_default() : null));
                    PUBGPlayerOverviewObj pUBGPlayerOverviewObj18 = this.D;
                    this.B = pUBGPlayerOverviewObj18 != null ? pUBGPlayerOverviewObj18.getFpp_default() : null;
                }
                va vaVar16 = this.K;
                if (vaVar16 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar16 = null;
                }
                vaVar16.f116734b.setOnCheckedChangeListener(new z());
            }
        } else {
            vaVar = this.K;
            if (vaVar == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar = null;
            }
            vaVar.f116734b.setVisibility(8);
        }
        if (com.max.hbcommon.utils.c.u(this.f89230x)) {
            List[] listArr = new List[1];
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj19 = this.D;
            listArr[0] = pUBGPlayerOverviewObj19 != null ? pUBGPlayerOverviewObj19.getRegions() : null;
            if (!com.max.hbcommon.utils.c.w(listArr)) {
                PUBGPlayerOverviewObj pUBGPlayerOverviewObj20 = this.D;
                this.f89230x = (pUBGPlayerOverviewObj20 == null || (regions = pUBGPlayerOverviewObj20.getRegions()) == null || (keyDescObj = regions.get(0)) == null) ? null : keyDescObj.getKey();
            }
        }
        va vaVar17 = this.K;
        if (vaVar17 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar17 = null;
        }
        LinearLayout linearLayout = vaVar17.f116754v;
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj21 = this.D;
        com.max.xiaoheihe.module.game.pubg.utils.b.h(linearLayout, pUBGPlayerOverviewObj21 != null ? pUBGPlayerOverviewObj21.getRegions() : null, this.f89230x, true, new a0());
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj22 = this.D;
        List<KeyDescObj> seasons = pUBGPlayerOverviewObj22 != null ? pUBGPlayerOverviewObj22.getSeasons() : null;
        this.f89232z = seasons;
        if (seasons != null) {
            kotlin.jvm.internal.f0.m(seasons);
            if (seasons.size() > 0) {
                va vaVar18 = this.K;
                if (vaVar18 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar18 = null;
                }
                vaVar18.f116756x.setVisibility(0);
                if (this.L) {
                    List<KeyDescObj> list = this.f89232z;
                    kotlin.jvm.internal.f0.m(list);
                    this.f89231y = list.get(0).getKey();
                    va vaVar19 = this.K;
                    if (vaVar19 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        vaVar19 = null;
                    }
                    TextView textView = vaVar19.f116745m;
                    List<KeyDescObj> list2 = this.f89232z;
                    kotlin.jvm.internal.f0.m(list2);
                    textView.setText(list2.get(0).getValue());
                    this.L = false;
                }
                this.I.clear();
                List<KeyDescObj> list3 = this.f89232z;
                kotlin.jvm.internal.f0.m(list3);
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    List<KeyDescObj> list4 = this.f89232z;
                    kotlin.jvm.internal.f0.m(list4);
                    KeyDescObj keyDescObj2 = list4.get(i10);
                    keyDescObj2.setDesc(keyDescObj2.getValue());
                    keyDescObj2.setIndex(i10);
                    keyDescObj2.setChecked(kotlin.jvm.internal.f0.g(this.f89231y, keyDescObj2.getKey()));
                    this.I.add(keyDescObj2);
                }
                int i11 = this.A;
                List<KeyDescObj> list5 = this.f89232z;
                kotlin.jvm.internal.f0.m(list5);
                if (i11 >= list5.size()) {
                    this.A = 0;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, this.I, true);
                objectRef.f124891b = heyBoxPopupMenu;
                heyBoxPopupMenu.V(true);
                ((HeyBoxPopupMenu) objectRef.f124891b).O(true);
                ((HeyBoxPopupMenu) objectRef.f124891b).M(Color.parseColor("#5F2F0B"));
                ((HeyBoxPopupMenu) objectRef.f124891b).R(new b0());
                va vaVar20 = this.K;
                if (vaVar20 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar20 = null;
                }
                TextView textView2 = vaVar20.f116745m;
                List<KeyDescObj> list6 = this.f89232z;
                kotlin.jvm.internal.f0.m(list6);
                textView2.setText(list6.get(this.A).getValue());
                va vaVar21 = this.K;
                if (vaVar21 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar21 = null;
                }
                vaVar21.f116756x.setOnClickListener(new c0(objectRef));
            } else {
                vaVar2 = this.K;
                if (vaVar2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar2 = null;
                }
                vaVar2.f116756x.setVisibility(8);
            }
        } else {
            vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar2 = null;
            }
            vaVar2.f116756x.setVisibility(8);
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj23 = this.D;
        if (!TextUtils.isEmpty(pUBGPlayerOverviewObj23 != null ? pUBGPlayerOverviewObj23.getRating_name() : null)) {
            va vaVar22 = this.K;
            if (vaVar22 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar22 = null;
            }
            TextView textView3 = vaVar22.C.f112931d;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj24 = this.D;
            textView3.setText(pUBGPlayerOverviewObj24 != null ? pUBGPlayerOverviewObj24.getRating_name() : null);
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj25 = this.D;
        if (!TextUtils.isEmpty(pUBGPlayerOverviewObj25 != null ? pUBGPlayerOverviewObj25.getRating() : null)) {
            va vaVar23 = this.K;
            if (vaVar23 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar23 = null;
            }
            TextView textView4 = vaVar23.C.f112935h;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj26 = this.D;
            textView4.setText(pUBGPlayerOverviewObj26 != null ? pUBGPlayerOverviewObj26.getRating() : null);
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj27 = this.D;
        if (!TextUtils.isEmpty(pUBGPlayerOverviewObj27 != null ? pUBGPlayerOverviewObj27.getRating_desc() : null)) {
            va vaVar24 = this.K;
            if (vaVar24 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar24 = null;
            }
            TextView textView5 = vaVar24.C.f112933f;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj28 = this.D;
            textView5.setText(pUBGPlayerOverviewObj28 != null ? pUBGPlayerOverviewObj28.getRating_desc() : null);
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj29 = this.D;
        if (!TextUtils.isEmpty(pUBGPlayerOverviewObj29 != null ? pUBGPlayerOverviewObj29.getRating_img() : null)) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj30 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj30);
            String rating_img = pUBGPlayerOverviewObj30.getRating_img();
            va vaVar25 = this.K;
            if (vaVar25 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar25 = null;
            }
            com.max.hbimage.b.K(rating_img, vaVar25.C.f112929b);
        }
        va vaVar26 = this.K;
        if (vaVar26 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar26 = null;
        }
        vaVar26.C.f112936i.setOnClickListener(new d0());
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj31 = this.D;
        if (((pUBGPlayerOverviewObj31 == null || (career3 = pUBGPlayerOverviewObj31.getCareer()) == null || (overview3 = career3.getOverview()) == null) ? 0 : overview3.size()) > 0) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj32 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj32);
            PUBGCareerObj career4 = pUBGPlayerOverviewObj32.getCareer();
            kotlin.jvm.internal.f0.m(career4);
            if (career4.getOverview().get(0) != null) {
                va vaVar27 = this.K;
                if (vaVar27 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar27 = null;
                }
                vaVar27.C.f112932e.setVisibility(0);
                va vaVar28 = this.K;
                if (vaVar28 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar28 = null;
                }
                vaVar28.C.f112934g.setVisibility(0);
                va vaVar29 = this.K;
                if (vaVar29 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar29 = null;
                }
                TextView textView6 = vaVar29.C.f112932e;
                PUBGPlayerOverviewObj pUBGPlayerOverviewObj33 = this.D;
                kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj33);
                PUBGCareerObj career5 = pUBGPlayerOverviewObj33.getCareer();
                kotlin.jvm.internal.f0.m(career5);
                GameGridDataCardObj gameGridDataCardObj = career5.getOverview().get(0);
                kotlin.jvm.internal.f0.m(gameGridDataCardObj);
                textView6.setText(gameGridDataCardObj.getDesc());
                va vaVar30 = this.K;
                if (vaVar30 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar30 = null;
                }
                TextView textView7 = vaVar30.C.f112934g;
                PUBGPlayerOverviewObj pUBGPlayerOverviewObj34 = this.D;
                kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj34);
                PUBGCareerObj career6 = pUBGPlayerOverviewObj34.getCareer();
                kotlin.jvm.internal.f0.m(career6);
                GameGridDataCardObj gameGridDataCardObj2 = career6.getOverview().get(0);
                kotlin.jvm.internal.f0.m(gameGridDataCardObj2);
                textView7.setText(gameGridDataCardObj2.getValue());
            } else {
                vaVar3 = this.K;
                if (vaVar3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar3 = null;
                }
                vaVar3.C.f112932e.setVisibility(8);
                vaVar4 = this.K;
                if (vaVar4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar4 = null;
                }
                vaVar4.C.f112934g.setVisibility(8);
            }
        } else {
            vaVar3 = this.K;
            if (vaVar3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar3 = null;
            }
            vaVar3.C.f112932e.setVisibility(8);
            vaVar4 = this.K;
            if (vaVar4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar4 = null;
            }
            vaVar4.C.f112934g.setVisibility(8);
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj35 = this.D;
        if (pUBGPlayerOverviewObj35 != null && (career2 = pUBGPlayerOverviewObj35.getCareer()) != null && (overview2 = career2.getOverview()) != null) {
            if (overview2.size() > 1) {
                int iL = (ViewUtils.L(getContext()) - ViewUtils.f(getContext(), 33.0f)) / 2;
                ArrayList arrayList = new ArrayList();
                for (GameGridDataCardObj gameGridDataCardObj3 : overview2.subList(1, fi.u.B(overview2.size(), 4))) {
                    KeyDescObj keyDescObj3 = new KeyDescObj();
                    keyDescObj3.setValue(gameGridDataCardObj3.getValue());
                    keyDescObj3.setDesc(gameGridDataCardObj3.getDesc());
                    arrayList.add(keyDescObj3);
                }
                ic.a aVar = ic.a.f119343a;
                Activity mContext = this.mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                int iA = (iL - aVar.a(mContext, 20.5f)) / fi.u.B(3, overview2.size() - 1);
                va vaVar31 = this.K;
                if (vaVar31 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar31 = null;
                }
                vaVar31.C.f112930c.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
                va vaVar32 = this.K;
                if (vaVar32 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar32 = null;
                }
                if (vaVar32.C.f112930c.getItemDecorationCount() == 0) {
                    va vaVar33 = this.K;
                    if (vaVar33 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        vaVar33 = null;
                    }
                    vaVar33.C.f112930c.addItemDecoration(new e0());
                }
                va vaVar34 = this.K;
                if (vaVar34 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar34 = null;
                }
                vaVar34.C.f112930c.setAdapter(new f0(arrayList, iA, this.mContext));
            }
            b2 b2Var = b2.f124493a;
        }
        va vaVar35 = this.K;
        if (vaVar35 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar35 = null;
        }
        vaVar35.f116750r.f114804c.setTypeface(bb.d.a().b(0));
        va vaVar36 = this.K;
        if (vaVar36 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar36 = null;
        }
        TextView textView8 = vaVar36.f116750r.f114804c;
        Context context = getContext();
        Context context2 = getContext();
        va vaVar37 = this.K;
        if (vaVar37 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar37 = null;
        }
        textView8.setBackground(com.max.hbutils.utils.q.d(context, R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(context2, vaVar37.f116750r.f114804c)));
        va vaVar38 = this.K;
        if (vaVar38 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar38 = null;
        }
        vaVar38.f116750r.f114804c.setClickable(true);
        K5();
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj36 = this.D;
        if (pUBGPlayerOverviewObj36 == null || (career = pUBGPlayerOverviewObj36.getCareer()) == null || (overview = career.getOverview()) == null) {
            return;
        }
        va vaVar39 = this.K;
        if (vaVar39 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar39 = null;
        }
        com.max.xiaoheihe.module.game.pubg.utils.b.s(vaVar39.f116750r.f114806e.b(), this.D);
        if (overview.size() > 4) {
            ArrayList arrayList2 = new ArrayList();
            for (GameGridDataCardObj gameGridDataCardObj4 : overview.subList(4, overview.size())) {
                KeyDescObj keyDescObj4 = new KeyDescObj();
                keyDescObj4.setValue(gameGridDataCardObj4.getValue());
                keyDescObj4.setDesc(gameGridDataCardObj4.getDesc());
                arrayList2.add(keyDescObj4);
            }
            va vaVar40 = this.K;
            if (vaVar40 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar40 = null;
            }
            if (vaVar40.f116750r.f114803b.getItemDecorationCount() == 0) {
                va vaVar41 = this.K;
                if (vaVar41 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar41 = null;
                }
                RecyclerView recyclerView = vaVar41.f116750r.f114803b;
                ic.a aVar2 = ic.a.f119343a;
                Activity mContext2 = this.mContext;
                kotlin.jvm.internal.f0.o(mContext2, "mContext");
                recyclerView.addItemDecoration(new fc.b(4, aVar2.b(mContext2, 4), false));
            }
            va vaVar42 = this.K;
            if (vaVar42 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar42 = null;
            }
            vaVar42.f116750r.f114803b.setLayoutManager(new GridLayoutManager(this.mContext, 4));
            va vaVar43 = this.K;
            if (vaVar43 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar43 = null;
            }
            vaVar43.f116750r.f114803b.setAdapter(new g0(arrayList2, this, this.mContext));
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj37 = this.D;
        if (!(pUBGPlayerOverviewObj37 != null ? kotlin.jvm.internal.f0.g(pUBGPlayerOverviewObj37.getExpand(), Boolean.TRUE) : false)) {
            va vaVar44 = this.K;
            if (vaVar44 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar44 = null;
            }
            vaVar44.f116750r.f114806e.b().setVisibility(8);
            va vaVar45 = this.K;
            if (vaVar45 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar5 = vaVar45;
            }
            vaVar5.f116750r.f114803b.setVisibility(8);
        }
        b2 b2Var2 = b2.f124493a;
    }

    private final void U5() {
        int i10;
        int i11;
        PUBGR20DataObj r20matches;
        List<String> tags;
        PUBGR20DataObj r20matches2;
        List<MatchObj> match_list;
        PUBGR20DataObj r20matches3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39506, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        va vaVar = null;
        List<MatchObj> match_list2 = (pUBGPlayerOverviewObj == null || (r20matches3 = pUBGPlayerOverviewObj.getR20matches()) == null) ? null : r20matches3.getMatch_list();
        if (match_list2 == null || match_list2.isEmpty()) {
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.J.b().setVisibility(8);
            return;
        }
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.J.b().setVisibility(0);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        TextView textView = vaVar4.J.f113766f;
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj2);
        textView.setText(pUBGPlayerOverviewObj2.getR20matches().getTitle());
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj3);
        if (TextUtils.isEmpty(pUBGPlayerOverviewObj3.getR20matches().getKd())) {
            va vaVar5 = this.K;
            if (vaVar5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar5 = null;
            }
            vaVar5.J.f113769i.setVisibility(8);
            i10 = 0;
        } else {
            va vaVar6 = this.K;
            if (vaVar6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar6 = null;
            }
            vaVar6.J.f113769i.setVisibility(0);
            va vaVar7 = this.K;
            if (vaVar7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar7 = null;
            }
            TextView textView2 = vaVar7.J.f113765e;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj4 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj4);
            textView2.setText(pUBGPlayerOverviewObj4.getR20matches().getKd());
            i10 = 1;
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj5 = this.D;
        kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj5);
        if (TextUtils.isEmpty(pUBGPlayerOverviewObj5.getR20matches().getAvg_rank())) {
            i11 = i10 + 1;
            va vaVar8 = this.K;
            if (vaVar8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar8 = null;
            }
            vaVar8.J.f113768h.setVisibility(8);
        } else {
            i11 = i10 + 1;
            va vaVar9 = this.K;
            if (vaVar9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar9 = null;
            }
            vaVar9.J.f113768h.setVisibility(0);
            va vaVar10 = this.K;
            if (vaVar10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar10 = null;
            }
            TextView textView3 = vaVar10.J.f113763c;
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj6 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj6);
            textView3.setText(pUBGPlayerOverviewObj6.getR20matches().getAvg_rank());
        }
        if (i11 == 2) {
            va vaVar11 = this.K;
            if (vaVar11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar11 = null;
            }
            vaVar11.J.f113764d.setVisibility(0);
        } else {
            va vaVar12 = this.K;
            if (vaVar12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar12 = null;
            }
            vaVar12.J.f113764d.setVisibility(8);
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj7 = this.D;
        if (pUBGPlayerOverviewObj7 != null && (r20matches2 = pUBGPlayerOverviewObj7.getR20matches()) != null && (match_list = r20matches2.getMatch_list()) != null && (!match_list.isEmpty())) {
            va vaVar13 = this.K;
            if (vaVar13 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar13 = null;
            }
            if (vaVar13.J.f113762b.getItemDecorationCount() == 0) {
                va vaVar14 = this.K;
                if (vaVar14 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    vaVar14 = null;
                }
                RecyclerView recyclerView = vaVar14.J.f113762b;
                ic.a aVar = ic.a.f119343a;
                Activity mContext = this.mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                recyclerView.addItemDecoration(new fc.b(10, aVar.b(mContext, 5), false));
            }
            int iL = (ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 69.0f)) / 10;
            int iM = ViewUtils.m(this.mContext, iL, iL);
            va vaVar15 = this.K;
            if (vaVar15 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar15 = null;
            }
            vaVar15.J.f113762b.setLayoutManager(new GridLayoutManager(this.mContext, 10));
            va vaVar16 = this.K;
            if (vaVar16 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar16 = null;
            }
            vaVar16.J.f113762b.setAdapter(new h0(match_list, iL, iM, this, this.mContext));
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj8 = this.D;
        if (pUBGPlayerOverviewObj8 == null || (r20matches = pUBGPlayerOverviewObj8.getR20matches()) == null || (tags = r20matches.getTags()) == null) {
            return;
        }
        if (!(!tags.isEmpty())) {
            va vaVar17 = this.K;
            if (vaVar17 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar17;
            }
            vaVar.J.f113771k.setVisibility(8);
            return;
        }
        va vaVar18 = this.K;
        if (vaVar18 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar18 = null;
        }
        vaVar18.J.f113771k.setVisibility(0);
        va vaVar19 = this.K;
        if (vaVar19 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar19 = null;
        }
        vaVar19.J.f113771k.removeAllViews();
        int i12 = 0;
        for (String str : tags) {
            int i13 = i12 + 1;
            TextView textView4 = new TextView(this.mContext);
            textView4.setText(str);
            textView4.setTextColor(this.mContext.getColor(R.color.white));
            textView4.setTextSize(1, 10.0f);
            textView4.setPadding(ViewUtils.f(this.mContext, 8.0f), 0, ViewUtils.f(this.mContext, 8.0f), 0);
            textView4.setBackground(ViewUtils.G(ViewUtils.f(this.mContext, 3.0f), this.mContext.getColor(R.color.white_alpha5)));
            textView4.setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ViewUtils.f(this.mContext, 20.0f));
            if (i12 != 0) {
                layoutParams.leftMargin = ViewUtils.f(this.mContext, 4.0f);
            }
            va vaVar20 = this.K;
            if (vaVar20 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar20 = null;
            }
            vaVar20.J.f113771k.addView(textView4, layoutParams);
            i12 = i13;
        }
    }

    private final void V5() {
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39494, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        va vaVar = null;
        List<InventoryObj> inventory = pUBGPlayerOverviewObj != null ? pUBGPlayerOverviewObj.getInventory() : null;
        if (inventory == null || inventory.isEmpty()) {
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.L.b().setVisibility(8);
            return;
        }
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.L.b().setVisibility(0);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        vaVar4.L.f115149c.setText(this.C ? getString(R.string.my_repertory_title) : getString(R.string.his_inventory));
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        if (TextUtils.isEmpty(pUBGPlayerOverviewObj2 != null ? pUBGPlayerOverviewObj2.getInventory_value() : null)) {
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj3 = this.D;
            string = String.valueOf(pUBGPlayerOverviewObj3 != null ? pUBGPlayerOverviewObj3.getInventory_count() : 0);
        } else {
            StringBuilder sb2 = new StringBuilder();
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj4 = this.D;
            sb2.append(pUBGPlayerOverviewObj4 != null ? pUBGPlayerOverviewObj4.getInventory_count() : 0);
            sb2.append(' ');
            PUBGPlayerOverviewObj pUBGPlayerOverviewObj5 = this.D;
            kotlin.jvm.internal.f0.m(pUBGPlayerOverviewObj5);
            sb2.append(pUBGPlayerOverviewObj5.getInventory_value());
            string = sb2.toString();
        }
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar5 = null;
        }
        vaVar5.L.f115150d.setText(string);
        va vaVar6 = this.K;
        if (vaVar6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar6 = null;
        }
        vaVar6.L.f115148b.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        va vaVar7 = this.K;
        if (vaVar7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar7 = null;
        }
        vaVar7.L.f115148b.setNestedScrollingEnabled(false);
        va vaVar8 = this.K;
        if (vaVar8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar8 = null;
        }
        if (vaVar8.L.f115148b.getItemDecorationCount() == 0) {
            va vaVar9 = this.K;
            if (vaVar9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar9 = null;
            }
            vaVar9.L.f115148b.addItemDecoration(new i0());
        }
        va vaVar10 = this.K;
        if (vaVar10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar10 = null;
        }
        RecyclerView recyclerView = vaVar10.L.f115148b;
        Activity activity = this.mContext;
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj6 = this.D;
        recyclerView.setAdapter(new j0(activity, pUBGPlayerOverviewObj6 != null ? pUBGPlayerOverviewObj6.getInventory() : null));
    }

    public static final /* synthetic */ void W4(PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment}, null, changeQuickRedirect, true, 39527, new Class[]{PUBGGameDataV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.z5();
    }

    private final void W5(List<? extends PUBGWeaponObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 39510, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        va vaVar = null;
        if (list == null || list.isEmpty()) {
            va vaVar2 = this.K;
            if (vaVar2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                vaVar = vaVar2;
            }
            vaVar.N.b().setVisibility(8);
            return;
        }
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.N.b().setVisibility(0);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        vaVar4.N.f115516c.setTypeface(bb.d.a().b(0));
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar5 = null;
        }
        TextView textView = vaVar5.N.f115516c;
        Context context = getContext();
        Context context2 = getContext();
        va vaVar6 = this.K;
        if (vaVar6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar6 = null;
        }
        textView.setBackground(com.max.hbutils.utils.q.d(context, R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(context2, vaVar6.N.f115516c)));
        va vaVar7 = this.K;
        if (vaVar7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar7 = null;
        }
        vaVar7.N.f115516c.setClickable(true);
        va vaVar8 = this.K;
        if (vaVar8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar8 = null;
        }
        vaVar8.N.f115516c.setText("全部武器 \uf0da");
        va vaVar9 = this.K;
        if (vaVar9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar9 = null;
        }
        vaVar9.N.f115516c.setOnClickListener(new k0());
        va vaVar10 = this.K;
        if (vaVar10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar10 = null;
        }
        vaVar10.N.f115515b.removeAllViews();
        int size = list.size();
        if (size > 5) {
            size = 5;
        }
        int i10 = 0;
        while (i10 < size) {
            LayoutInflater layoutInflater = this.mInflater;
            va vaVar11 = this.K;
            if (vaVar11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar11 = null;
            }
            View viewInflate = layoutInflater.inflate(R.layout.item_weapons_pubg_v2, (ViewGroup) vaVar11.N.f115515b, false);
            com.max.xiaoheihe.module.game.pubg.utils.c.j(new com.max.hbcommon.base.adapter.s.e(R.layout.item_weapons_pubg_v2, viewInflate), list.get(i10), i10 == size + (-1));
            va vaVar12 = this.K;
            if (vaVar12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                vaVar12 = null;
            }
            vaVar12.N.f115515b.addView(viewInflate);
            i10++;
        }
    }

    private final void X5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39491, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.D == null) {
            return;
        }
        S5();
        L5();
        T5();
        P5();
        U5();
        Q5();
        N5();
        J5();
        O5();
        V5();
    }

    public static final /* synthetic */ void Y4(PUBGGameDataV2Fragment pUBGGameDataV2Fragment, int i10) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment, new Integer(i10)}, null, changeQuickRedirect, true, 39526, new Class[]{PUBGGameDataV2Fragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.A5(i10);
    }

    private final void Y5(PUBGPlayerOverviewObj pUBGPlayerOverviewObj) {
        Activity activity;
        va vaVar;
        byte b10;
        if (PatchProxy.proxy(new Object[]{pUBGPlayerOverviewObj}, this, changeQuickRedirect, false, 39503, new Class[]{PUBGPlayerOverviewObj.class}, Void.TYPE).isSupported || (activity = this.mContext) == null || activity.isFinishing() || pUBGPlayerOverviewObj == null) {
            return;
        }
        List<PUBGRatingInfoObj> rating_list = pUBGPlayerOverviewObj.getRating_list();
        if (rating_list == null || rating_list.isEmpty()) {
            return;
        }
        ViewGroup viewGroup = null;
        float f10 = 10.0f;
        if (this.M == null) {
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            int i10 = -2;
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setOrientation(1);
            linearLayout.setOnClickListener(new l0());
            linearLayout.setElevation(ViewUtils.f(this.mContext, 2.0f));
            ImageView imageView = new ImageView(this.mContext);
            this.P = imageView;
            kotlin.jvm.internal.f0.m(imageView);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 10.0f), ViewUtils.f(this.mContext, 6.0f)));
            ImageView imageView2 = this.P;
            kotlin.jvm.internal.f0.m(imageView2);
            imageView2.setImageDrawable(ViewUtils.T(ViewUtils.f(this.mContext, 10.0f), ViewUtils.f(this.mContext, 6.0f), 1, getResources().getColor(R.color.text_primary_1_color_alpha90)));
            linearLayout.addView(this.P);
            LinearLayout linearLayout2 = new LinearLayout(this.mContext);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.setOrientation(1);
            linearLayout2.setBackgroundDrawable(ViewUtils.H(ViewUtils.f(this.mContext, 4.0f), getResources().getColor(R.color.text_primary_1_color_alpha90), getResources().getColor(R.color.text_primary_1_color_alpha90)));
            linearLayout.addView(linearLayout2);
            LayoutInflater layoutInflater = this.mInflater;
            int i11 = R.layout.item_normal_score_detail_pubg;
            View viewInflate = layoutInflater.inflate(R.layout.item_normal_score_detail_pubg, (ViewGroup) null);
            viewInflate.setPadding(ViewUtils.f(this.mContext, 10.0f), ViewUtils.f(this.mContext, 4.0f), ViewUtils.f(this.mContext, 10.0f), ViewUtils.f(this.mContext, 8.0f));
            float f11 = 192.0f;
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 192.0f), -2));
            View viewFindViewById = viewInflate.findViewById(R.id.tv_desc);
            kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.tv_value);
            kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewFindViewById2;
            textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_11));
            textView.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
            textView.setText(com.max.xiaoheihe.utils.d.n0(R.string.rating_info));
            textView2.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_15));
            textView2.setTextColor(getResources().getColor(R.color.white));
            linearLayout2.addView(viewInflate);
            View view = new View(this.mContext);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, ViewUtils.f(this.mContext, 0.5f)));
            view.setBackgroundColor(getResources().getColor(R.color.divider_color_alpha_10));
            linearLayout2.addView(view);
            List<PUBGRatingInfoObj> rating_list2 = pUBGPlayerOverviewObj.getRating_list();
            int size = rating_list2 != null ? rating_list2.size() : 0;
            int i12 = 0;
            while (i12 < size) {
                PUBGRatingInfoObj pUBGRatingInfoObj = rating_list2.get(i12);
                View viewInflate2 = this.mInflater.inflate(i11, viewGroup);
                viewInflate2.setPadding(ViewUtils.f(this.mContext, f10), ViewUtils.f(this.mContext, 3.0f), ViewUtils.f(this.mContext, f10), ViewUtils.f(this.mContext, 3.0f));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, f11), i10);
                if (i12 == 0) {
                    layoutParams.setMargins(0, ViewUtils.f(this.mContext, 3.0f), 0, 0);
                } else if (i12 == size - 1) {
                    layoutParams.setMargins(0, 0, 0, ViewUtils.f(this.mContext, 3.0f));
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                }
                viewInflate2.setLayoutParams(layoutParams);
                View viewFindViewById3 = viewInflate2.findViewById(R.id.tv_desc);
                kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) viewFindViewById3;
                View viewFindViewById4 = viewInflate2.findViewById(R.id.tv_value);
                kotlin.jvm.internal.f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView4 = (TextView) viewFindViewById4;
                View viewFindViewById5 = viewInflate2.findViewById(R.id.iv_rating_img);
                kotlin.jvm.internal.f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.ImageView");
                com.max.hbimage.b.K(pUBGRatingInfoObj.getRating_img(), (ImageView) viewFindViewById5);
                textView3.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_12));
                textView3.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                textView3.setText(pUBGRatingInfoObj.getRating_desc());
                textView4.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_12));
                textView4.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                textView4.setText(pUBGRatingInfoObj.getRange());
                linearLayout2.addView(viewInflate2);
                if (i12 == size - 1) {
                    View view2 = new View(this.mContext);
                    b10 = -1;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, ViewUtils.f(this.mContext, 0.5f));
                    layoutParams2.setMargins(ViewUtils.f(this.mContext, 10.0f), 0, ViewUtils.f(this.mContext, 10.0f), ViewUtils.f(this.mContext, 5.0f));
                    view2.setLayoutParams(layoutParams2);
                    linearLayout2.addView(view2);
                } else {
                    b10 = -1;
                }
                i12++;
                viewGroup = null;
                f10 = 10.0f;
                i10 = -2;
                f11 = 192.0f;
                i11 = R.layout.item_normal_score_detail_pubg;
            }
            this.O = ViewUtils.W(linearLayout2);
            this.N = ViewUtils.V(linearLayout2) + ViewUtils.f(this.mContext, 6.0f);
            PopupWindow popupWindow = new PopupWindow((View) linearLayout, this.O, this.N, true);
            this.M = popupWindow;
            kotlin.jvm.internal.f0.m(popupWindow);
            popupWindow.setTouchable(true);
            PopupWindow popupWindow2 = this.M;
            kotlin.jvm.internal.f0.m(popupWindow2);
            popupWindow2.setBackgroundDrawable(new BitmapDrawable());
            PopupWindow popupWindow3 = this.M;
            kotlin.jvm.internal.f0.m(popupWindow3);
            popupWindow3.setAnimationStyle(R.style.DropDownPopupWindowAnimation);
        }
        PopupWindow popupWindow4 = this.M;
        kotlin.jvm.internal.f0.m(popupWindow4);
        if (popupWindow4.isShowing()) {
            return;
        }
        int[] iArr = new int[2];
        va vaVar2 = this.K;
        if (vaVar2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar2 = null;
        }
        vaVar2.C.f112936i.getLocationOnScreen(iArr);
        int iL = ViewUtils.L(this.mContext);
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        int iW = ViewUtils.W(vaVar3.C.f112936i);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        int iV = ViewUtils.V(vaVar4.C.f112936i);
        int iW2 = ViewUtils.W(this.P);
        ViewUtils.V(this.P);
        int iF = iArr[0];
        if (this.O + iF > iL - ViewUtils.f(this.mContext, 10.0f)) {
            iF = (iL - ViewUtils.f(this.mContext, 10.0f)) - this.O;
        }
        int iF2 = iArr[1] + iV + ViewUtils.f(this.mContext, 3.0f);
        ImageView imageView3 = this.P;
        kotlin.jvm.internal.f0.m(imageView3);
        imageView3.setTranslationX((iArr[0] - iF) + ((iW - iW2) / 2.0f));
        PopupWindow popupWindow5 = this.M;
        kotlin.jvm.internal.f0.m(popupWindow5);
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar = null;
        } else {
            vaVar = vaVar5;
        }
        popupWindow5.showAtLocation(vaVar.C.f112936i, 0, iF, iF2);
    }

    private final void Z5() {
        ObjectAnimator objectAnimator;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39488, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        va vaVar = this.K;
        va vaVar2 = null;
        if (vaVar == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar = null;
        }
        LinearLayout linearLayout = vaVar.M;
        kotlin.jvm.internal.f0.o(linearLayout, "binding.vgUpdate");
        linearLayout.setVisibility(0);
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.M.setOnClickListener(null);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        ImageView imageView = vaVar4.f116740h;
        kotlin.jvm.internal.f0.o(imageView, "binding.ivUpdateIcon");
        imageView.setVisibility(0);
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar5 = null;
        }
        vaVar5.f116748p.setText(R.string.updating);
        ObjectAnimator objectAnimator2 = this.T;
        if (objectAnimator2 != null) {
            if (objectAnimator2 != null && !objectAnimator2.isRunning()) {
                z10 = true;
            }
            if (!z10 || (objectAnimator = this.T) == null) {
                return;
            }
            objectAnimator.start();
            return;
        }
        va vaVar6 = this.K;
        if (vaVar6 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar2 = vaVar6;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vaVar2.f116740h, androidx.constraintlayout.motion.widget.f.f18721i, 0.0f, 360.0f);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.start();
        this.T = objectAnimatorOfFloat;
    }

    private final void a6(MineActivity.FragmentType fragmentType, String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{fragmentType, str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 39499, new Class[]{MineActivity.FragmentType.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        String str6 = this.f89228v;
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        String bg_img = pUBGPlayerOverviewObj != null ? pUBGPlayerOverviewObj.getBg_img() : null;
        String str7 = bg_img == null ? "" : bg_img;
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        String bg_cover_lottie = pUBGPlayerOverviewObj2 != null ? pUBGPlayerOverviewObj2.getBg_cover_lottie() : null;
        MineActivity.W1(context, fragmentType, str, str2, str3, str4, str5, str6, str7, bg_cover_lottie == null ? "" : bg_cover_lottie);
    }

    public static final /* synthetic */ void i5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment, String str) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment, str}, null, changeQuickRedirect, true, 39523, new Class[]{PUBGGameDataV2Fragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.B5(str);
    }

    public static final /* synthetic */ void j5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment, Context context, int i10) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment, context, new Integer(i10)}, null, changeQuickRedirect, true, 39532, new Class[]{PUBGGameDataV2Fragment.class, Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.C5(context, i10);
    }

    public static final /* synthetic */ void k5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment}, null, changeQuickRedirect, true, 39531, new Class[]{PUBGGameDataV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.E5();
    }

    public static final /* synthetic */ void l5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment}, null, changeQuickRedirect, true, 39533, new Class[]{PUBGGameDataV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.K5();
    }

    public static final /* synthetic */ void m5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment}, null, changeQuickRedirect, true, 39530, new Class[]{PUBGGameDataV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.M5();
    }

    public static final /* synthetic */ void n5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment, List list) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment, list}, null, changeQuickRedirect, true, 39534, new Class[]{PUBGGameDataV2Fragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.W5(list);
    }

    public static final /* synthetic */ void u5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment}, null, changeQuickRedirect, true, 39522, new Class[]{PUBGGameDataV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.showError();
    }

    public static final /* synthetic */ void v5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment}, null, changeQuickRedirect, true, 39524, new Class[]{PUBGGameDataV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.X5();
    }

    public static final /* synthetic */ void w5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment, PUBGPlayerOverviewObj pUBGPlayerOverviewObj) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment, pUBGPlayerOverviewObj}, null, changeQuickRedirect, true, 39528, new Class[]{PUBGGameDataV2Fragment.class, PUBGPlayerOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.Y5(pUBGPlayerOverviewObj);
    }

    public static final /* synthetic */ void x5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment}, null, changeQuickRedirect, true, 39525, new Class[]{PUBGGameDataV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.Z5();
    }

    public static final /* synthetic */ void y5(PUBGGameDataV2Fragment pUBGGameDataV2Fragment, MineActivity.FragmentType fragmentType, String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{pUBGGameDataV2Fragment, fragmentType, str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 39529, new Class[]{PUBGGameDataV2Fragment.class, MineActivity.FragmentType.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGGameDataV2Fragment.a6(fragmentType, str, str2, str3, str4, str5);
    }

    @SuppressLint({"AutoDispose"})
    private final void z5() {
        PUBGAccountInfo pubg_account_info;
        PlayerInfoObj player_info;
        PUBGAccountInfo pubg_account_info2;
        PlayerInfoObj player_info2;
        PUBGAccountInfo pubg_account_info3;
        PlayerInfoObj player_info3;
        PUBGAccountInfo pubg_account_info4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39487, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(this.f89227u) && TextUtils.isEmpty(this.f89229w)) {
            User userO = com.max.xiaoheihe.utils.i0.o();
            String player_id = null;
            if (((userO == null || (pubg_account_info4 = userO.getPubg_account_info()) == null) ? null : pubg_account_info4.getPlayer_info()) != null && TextUtils.isEmpty(this.f89228v)) {
                User userO2 = com.max.xiaoheihe.utils.i0.o();
                this.f89227u = (userO2 == null || (pubg_account_info3 = userO2.getPubg_account_info()) == null || (player_info3 = pubg_account_info3.getPlayer_info()) == null) ? null : player_info3.getReal_name();
                User userO3 = com.max.xiaoheihe.utils.i0.o();
                this.f89226t = (userO3 == null || (pubg_account_info2 = userO3.getPubg_account_info()) == null || (player_info2 = pubg_account_info2.getPlayer_info()) == null) ? null : player_info2.getNickname();
                User userO4 = com.max.xiaoheihe.utils.i0.o();
                if (userO4 != null && (pubg_account_info = userO4.getPubg_account_info()) != null && (player_info = pubg_account_info.getPlayer_info()) != null) {
                    player_id = player_info.getPlayer_id();
                }
                this.f89228v = player_id;
                if (TextUtils.isEmpty(this.f89227u)) {
                    this.f89227u = this.f89226t;
                }
                if (TextUtils.isEmpty(this.f89228v)) {
                    this.f89228v = this.f89227u;
                }
            }
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().j9(this.f89228v, this.f89229w, this.f89230x, this.f89231y, this.B).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39513, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f89226t = arguments.getString("nickname");
            this.f89227u = arguments.getString("real_name");
            this.f89229w = arguments.getString("user_id");
            this.f89228v = arguments.getString("player_id");
        }
        if (TextUtils.isEmpty(this.f89227u)) {
            this.f89227u = this.f89226t;
        }
        if (TextUtils.isEmpty(this.f89228v)) {
            this.f89228v = this.f89227u;
        }
        if (com.max.xiaoheihe.module.account.utils.c.e(this.f89227u) == 1 || com.max.xiaoheihe.utils.i0.q(this.f89229w) || (TextUtils.isEmpty(this.f89227u) && TextUtils.isEmpty(this.f89229w))) {
            z10 = true;
        }
        this.C = z10;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void B1(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39516, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_succuess));
        User userI = com.max.xiaoheihe.utils.i0.i();
        String str2 = this.S;
        this.f89227u = str2;
        this.f89226t = str2;
        PlayerInfoObj playerInfoObj = new PlayerInfoObj();
        playerInfoObj.setNickname(this.S);
        playerInfoObj.setReal_name(this.S);
        PUBGAccountInfo pUBGAccountInfo = new PUBGAccountInfo();
        pUBGAccountInfo.setPlayer_info(playerInfoObj);
        userI.setPubg_account_info(pUBGAccountInfo);
        com.max.xiaoheihe.utils.d.x1(this.mContext);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void C0(@dl.e String str, @dl.e Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, th2}, this, changeQuickRedirect, false, 39515, new Class[]{String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (th2 != null) {
            th2.printStackTrace();
        }
        if (!kotlin.jvm.internal.f0.g(GameBindingFragment.f77868u, th2 != null ? th2.getMessage() : null)) {
            if (!kotlin.jvm.internal.f0.g(GameBindingFragment.f77867t, th2 != null ? th2.getMessage() : null)) {
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_fail));
                return;
            }
        }
        com.max.xiaoheihe.view.l.D(this.mContext, "", com.max.xiaoheihe.utils.d.n0(R.string.bind_pubg_fail_message), com.max.xiaoheihe.utils.d.n0(R.string.confirm), null, new f());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39511, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        Activity activity = this.mContext;
        if (!(activity instanceof com.max.hbminiprogram.h)) {
            com.max.hbutils.utils.t.N(activity.getWindow(), true);
        }
        va vaVarC = va.c(this.mInflater);
        kotlin.jvm.internal.f0.o(vaVarC, "inflate(mInflater)");
        this.K = vaVarC;
        va vaVar = null;
        if (vaVarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVarC = null;
        }
        vaVarC.f116743k.setBackgroundResource(R.color.transparent);
        va vaVar2 = this.K;
        if (vaVar2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar2 = null;
        }
        vaVar2.f116743k.i0(true);
        va vaVar3 = this.K;
        if (vaVar3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar3 = null;
        }
        vaVar3.f116743k.b0(false);
        va vaVar4 = this.K;
        if (vaVar4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar4 = null;
        }
        vaVar4.f116743k.S(new c());
        this.J = new d(this.mContext, this.H);
        va vaVar5 = this.K;
        if (vaVar5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar5 = null;
        }
        RecyclerView recyclerView = vaVar5.A.f112493b;
        final Activity activity2 = this.mContext;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity2) { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment$getInnerView$3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        va vaVar6 = this.K;
        if (vaVar6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            vaVar6 = null;
        }
        vaVar6.A.f112493b.setAdapter(this.J);
        z5();
        va vaVar7 = this.K;
        if (vaVar7 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            vaVar = vaVar7;
        }
        SmartRefreshLayout smartRefreshLayoutB = vaVar.b();
        kotlin.jvm.internal.f0.o(smartRefreshLayoutB, "binding.root");
        return smartRefreshLayoutB;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    public boolean O4() {
        return false;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    public void S4() {
        String bg_cover_lottie;
        String bg_img;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39484, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.S4();
        ColorDrawable colorDrawable = new ColorDrawable(f89225c0);
        J4().f111330b.setImageDrawable(colorDrawable);
        J4().f111336h.setBackgroundResource(R.color.pubg_bg_main_color);
        if (!(this.mContext instanceof com.max.hbminiprogram.h)) {
            J4().f111332d.setVisibility(8);
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj = this.D;
        b2 b2Var = null;
        if (pUBGPlayerOverviewObj != null && (bg_img = pUBGPlayerOverviewObj.getBg_img()) != null) {
            if (!(!kotlin.text.u.V1(bg_img))) {
                bg_img = null;
            }
            if (bg_img != null) {
                J4().f111330b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                com.max.hbimage.b.U(bg_img, J4().f111330b, colorDrawable);
            }
        }
        PUBGPlayerOverviewObj pUBGPlayerOverviewObj2 = this.D;
        if (pUBGPlayerOverviewObj2 != null && (bg_cover_lottie = pUBGPlayerOverviewObj2.getBg_cover_lottie()) != null) {
            if (!(!kotlin.text.u.V1(bg_cover_lottie))) {
                bg_cover_lottie = null;
            }
            if (bg_cover_lottie != null) {
                LottieAnimationView updateBackgroundRes$lambda$4$lambda$3 = J4().f111333e;
                kotlin.jvm.internal.f0.o(updateBackgroundRes$lambda$4$lambda$3, "updateBackgroundRes$lambda$4$lambda$3");
                updateBackgroundRes$lambda$4$lambda$3.setVisibility(0);
                updateBackgroundRes$lambda$4$lambda$3.setFailureListener(com.max.xiaoheihe.utils.r.f95734k);
                updateBackgroundRes$lambda$4$lambda$3.setAnimationFromUrl(bg_cover_lottie, f89224b0);
                updateBackgroundRes$lambda$4$lambda$3.E();
                b2Var = b2.f124493a;
            }
        }
        if (b2Var == null) {
            LottieAnimationView lottieAnimationView = J4().f111333e;
            kotlin.jvm.internal.f0.o(lottieAnimationView, "baseBinding.lottieBg");
            lottieAnimationView.setVisibility(8);
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.e
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39512, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (map == null) {
            return null;
        }
        Object obj = map.get(com.max.xiaoheihe.module.littleprogram.b.f88740a.b());
        String strValueOf = (String) map.get("nickname");
        String strValueOf2 = (String) map.get("real_name");
        String strValueOf3 = (String) map.get("user_id");
        String strValueOf4 = (String) map.get("player_id");
        if (TextUtils.isEmpty(strValueOf4) && (obj instanceof WebProtocolObj)) {
            strValueOf4 = ((WebProtocolObj) obj).valueOf("player_id");
        }
        if (TextUtils.isEmpty(strValueOf) && (obj instanceof WebProtocolObj)) {
            strValueOf = ((WebProtocolObj) obj).valueOf("nickname");
        }
        if (TextUtils.isEmpty(strValueOf2) && (obj instanceof WebProtocolObj)) {
            strValueOf2 = ((WebProtocolObj) obj).valueOf("real_name");
        }
        if (TextUtils.isEmpty(strValueOf3) && (obj instanceof WebProtocolObj)) {
            strValueOf3 = ((WebProtocolObj) obj).valueOf("user_id");
        }
        return V.e(strValueOf4, strValueOf, strValueOf2, strValueOf3);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.xiaoheihe.module.account.GameBindingFragment.n
    public boolean g2(@dl.e String str, @dl.e View view, @dl.e EditText editText) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, view, editText}, this, changeQuickRedirect, false, 39514, new Class[]{String.class, View.class, EditText.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.m(editText);
        this.S = editText.getText().toString();
        return false;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39517, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        ObjectAnimator objectAnimator = this.T;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        this.T = null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39486, new Class[0], Void.TYPE).isSupported) {
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

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39483, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        UserProfileUpdatedBroadcastReceiver userProfileUpdatedBroadcastReceiver = new UserProfileUpdatedBroadcastReceiver();
        this.Q = userProfileUpdatedBroadcastReceiver;
        registerReceiver(userProfileUpdatedBroadcastReceiver, lb.a.f131055v);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39485, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.Q);
    }
}
