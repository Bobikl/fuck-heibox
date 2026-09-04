package com.max.xiaoheihe.module.account.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.GameCardChildObj;
import com.max.xiaoheihe.bean.game.GameCardObj;
import com.max.xiaoheihe.module.account.GameAccountActivity;
import com.max.xiaoheihe.module.account.MeHomeFragmentx;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.q50;
import df.r50;
import df.t50;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import pokercc.android.expandablerecyclerview.ExpandableAdapter;

/* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a extends ExpandableAdapter<ExpandableAdapter.c> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f78721m = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final Context f78722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final List<GameCardObj> f78723l;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class ViewOnClickListenerC0649a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.account.gameaccount.a f78724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f78725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameCardChildObj f78726d;

        ViewOnClickListenerC0649a(com.max.xiaoheihe.module.account.gameaccount.a aVar, a aVar2, GameCardChildObj gameCardChildObj) {
            this.f78724b = aVar;
            this.f78725c = aVar2;
            this.f78726d = gameCardChildObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24797, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78724b.c(this.f78725c.f78722k, this.f78726d.getAccount_id(), this.f78726d.getGame_type());
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.account.gameaccount.a f78728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f78729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f78730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f78731f;

        b(String str, com.max.xiaoheihe.module.account.gameaccount.a aVar, String str2, String str3, boolean z10) {
            this.f78727b = str;
            this.f78728c = aVar;
            this.f78729d = str2;
            this.f78730e = str3;
            this.f78731f = z10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24798, new Class[]{View.class}, Void.TYPE).isSupported || (str = this.f78727b) == null) {
                return;
            }
            this.f78728c.f(this.f78729d, str, this.f78730e, this.f78731f);
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameCardChildObj f78733c;

        c(GameCardChildObj gameCardChildObj) {
            this.f78733c = gameCardChildObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24799, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(a.this.f78722k, this.f78733c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24800, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.h(a.this.f78722k);
            Context context = a.this.f78722k;
            f0.n(context, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
            com.max.xiaoheihe.module.account.utils.l.D(((BaseActivity) context).V0(), (Activity) a.this.f78722k, false, true, 3);
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f78736c;

        e(View view) {
            this.f78736c = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24801, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            NestedScrollView nestedScrollViewC = ((com.max.xiaoheihe.module.account.adapter.d) a.this.f78722k).C();
            View view = this.f78736c;
            f0.o(view, "this");
            com.max.xiaoheihe.module.account.adapter.e.b(nestedScrollViewC, view, ViewUtils.f(a.this.f78722k, 48));
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f78737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f78738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameCardObj f78739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f78740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f78741f;

        f(boolean z10, a aVar, GameCardObj gameCardObj, boolean z11, int i10) {
            this.f78737b = z10;
            this.f78738c = aVar;
            this.f78739d = gameCardObj;
            this.f78740e = z11;
            this.f78741f = i10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24802, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f78737b) {
                a.t0(this.f78738c, this.f78739d.getGame_name(), this.f78739d.getGame_type(), null);
            } else if (this.f78740e) {
                this.f78738c.q(this.f78741f, true);
            } else {
                this.f78738c.s(this.f78741f, true);
            }
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameCardObj f78742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f78743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f78744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f78745e;

        g(GameCardObj gameCardObj, a aVar, TextView textView, TextView textView2) {
            this.f78742b = gameCardObj;
            this.f78743c = aVar;
            this.f78744d = textView;
            this.f78745e = textView2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24803, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (f0.g("steam", this.f78742b.getGame_type())) {
                Context context = this.f78743c.f78722k;
                f0.n(context, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                com.max.xiaoheihe.module.account.utils.l.D(((BaseActivity) context).V0(), (Activity) this.f78743c.f78722k, false, true, 3);
                return;
            }
            a aVar = this.f78743c;
            GameCardObj gameCardObj = this.f78742b;
            TextView tv_button2 = this.f78744d;
            f0.o(tv_button2, "tv_button2");
            TextView tv_button3 = this.f78745e;
            f0.o(tv_button3, "tv_button3");
            a.s0(aVar, gameCardObj, tv_button2, tv_button3);
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameCardObj f78746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f78747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f78748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f78749e;

        h(GameCardObj gameCardObj, a aVar, TextView textView, TextView textView2) {
            this.f78746b = gameCardObj;
            this.f78747c = aVar;
            this.f78748d = textView;
            this.f78749e = textView2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24804, new Class[]{View.class}, Void.TYPE).isSupported && f0.g("steam", this.f78746b.getGame_type())) {
                a aVar = this.f78747c;
                GameCardObj gameCardObj = this.f78746b;
                TextView tv_button2 = this.f78748d;
                f0.o(tv_button2, "tv_button2");
                TextView tv_button3 = this.f78749e;
                f0.o(tv_button3, "tv_button3");
                a.r0(aVar, gameCardObj, tv_button2, tv_button3);
            }
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameCardObj f78750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f78751c;

        i(GameCardObj gameCardObj, a aVar) {
            this.f78750b = gameCardObj;
            this.f78751c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24805, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f78750b.getProtocol())) {
                com.max.xiaoheihe.base.router.b.k0(this.f78751c.f78722k, this.f78750b.getProtocol());
                return;
            }
            Intent intentQ = r1.Q(this.f78751c.f78722k, this.f78750b.getGame_type(), this.f78750b.getTopic_id());
            if (intentQ != null) {
                this.f78751c.f78722k.startActivity(intentQ);
            }
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24806, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            com.max.xiaoheihe.utils.d.y1(a.this.f78722k, GameAccountActivity.f77825p1);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24807, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class k extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24808, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            com.max.xiaoheihe.utils.d.y1(a.this.f78722k, GameAccountActivity.f77825p1);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24809, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class l implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameCardObj f78754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f78755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f78756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f78757d;

        l(GameCardObj gameCardObj, a aVar, TextView textView, TextView textView2) {
            this.f78754a = gameCardObj;
            this.f78755b = aVar;
            this.f78756c = textView;
            this.f78757d = textView2;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 24810, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78754a.setFriend_code_show(keyDescObj.getKey());
            a.o0(this.f78755b, this.f78754a, this.f78756c, this.f78757d);
            a aVar = this.f78755b;
            String key = keyDescObj.getKey();
            f0.o(key, "data.key");
            a.q0(aVar, key);
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class m implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameCardObj f78758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f78759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f78760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f78761d;

        m(GameCardObj gameCardObj, a aVar, TextView textView, TextView textView2) {
            this.f78758a = gameCardObj;
            this.f78759b = aVar;
            this.f78760c = textView;
            this.f78761d = textView2;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 24811, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78758a.setCard_show(keyDescObj.getKey());
            a.o0(this.f78759b, this.f78758a, this.f78760c, this.f78761d);
            a aVar = this.f78759b;
            String game_type = this.f78758a.getGame_type();
            f0.o(game_type, "gameCardObj.game_type");
            String key = keyDescObj.getKey();
            f0.o(key, "data.key");
            a.p0(aVar, game_type, key);
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class n implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f78764d;

        n(String str, String str2) {
            this.f78763c = str;
            this.f78764d = str2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24812, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a.u0(a.this, this.f78763c, this.f78764d);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class o implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f78765b = new o();
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24813, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
    public static final class p extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f78767c;

        p(String str, a aVar) {
            this.f78766b = str;
            this.f78767c = aVar;
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24814, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            if (f0.g("epic", this.f78766b)) {
                MeHomeFragmentx.Z3 = false;
            }
            com.max.xiaoheihe.utils.d.x1(this.f78767c.f78722k);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24815, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@dl.d Context mContext, @dl.d List<? extends GameCardObj> mDataList) {
        f0.p(mContext, "mContext");
        f0.p(mDataList, "mDataList");
        this.f78722k = mContext;
        this.f78723l = mDataList;
    }

    private final void A0(GameCardObj gameCardObj, TextView textView, TextView textView2) {
        if (PatchProxy.proxy(new Object[]{gameCardObj, textView, textView2}, this, changeQuickRedirect, false, 24781, new Class[]{GameCardObj.class, TextView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        String friend_code_show = gameCardObj.getFriend_code_show();
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj.setDesc(this.f78722k.getResources().getString(R.string.friend_code_hide));
        keyDescObj2.setDesc(this.f78722k.getResources().getString(R.string.friend_code_show));
        keyDescObj.setKey("0");
        keyDescObj2.setKey("1");
        if (f0.g("0", friend_code_show)) {
            keyDescObj.setChecked(true);
        } else if (f0.g("1", friend_code_show)) {
            keyDescObj2.setChecked(true);
        }
        arrayList.add(keyDescObj);
        arrayList.add(keyDescObj2);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.f78722k, arrayList);
        heyBoxPopupMenu.R(new l(gameCardObj, this, textView, textView2));
        heyBoxPopupMenu.show();
    }

    private final void B0(GameCardObj gameCardObj, TextView textView, TextView textView2) {
        if (PatchProxy.proxy(new Object[]{gameCardObj, textView, textView2}, this, changeQuickRedirect, false, 24780, new Class[]{GameCardObj.class, TextView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zV0 = v0(gameCardObj);
        String card_show = gameCardObj.getCard_show();
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        KeyDescObj keyDescObj2 = new KeyDescObj();
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj.setDesc(this.f78722k.getResources().getString(R.string.game_card_hide));
        keyDescObj2.setDesc(this.f78722k.getResources().getString(R.string.game_card_show));
        keyDescObj3.setDesc(this.f78722k.getResources().getString(R.string.game_card_self_only));
        keyDescObj.setKey("0");
        keyDescObj2.setKey("1");
        keyDescObj3.setKey("2");
        if (f0.g("0", card_show)) {
            keyDescObj.setChecked(true);
        } else if (f0.g("1", card_show)) {
            keyDescObj2.setChecked(true);
        } else if (f0.g("2", card_show)) {
            keyDescObj3.setChecked(true);
        }
        if (!zV0) {
            arrayList.add(keyDescObj);
        }
        arrayList.add(keyDescObj2);
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.f78722k, arrayList);
        heyBoxPopupMenu.R(new m(gameCardObj, this, textView, textView2));
        heyBoxPopupMenu.show();
    }

    private final void C0(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 24779, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f0.g("steam", str2)) {
            Context context = this.f78722k;
            f0.n(context, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
            com.max.xiaoheihe.module.account.utils.l.D(((BaseActivity) context).V0(), (Activity) this.f78722k, true, true, 3);
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f78722k);
        v0 v0Var = v0.f124986a;
        String str4 = String.format("%s 解绑", Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str4, "format(format, *args)");
        com.max.hbcommon.view.a.f fVarY = fVar.y(str4);
        String str5 = String.format("你确定要解除%s绑定吗？", Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str5, "format(format, *args)");
        fVarY.l(str5).t(R.string.confirm, new n(str2, str3)).n(R.string.cancel, o.f78765b).F();
    }

    private final void D0(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 24788, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("ChangeBindListAdapterV2, unBindGame, gameType = " + str + ", accountId = " + str2);
        com.max.xiaoheihe.network.i.a().jb(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p(str, this));
    }

    private final void E0(GameCardObj gameCardObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{gameCardObj, textView}, this, changeQuickRedirect, false, 24785, new Class[]{GameCardObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!f0.g("steam", gameCardObj.getGame_type())) {
            textView.setVisibility(8);
            return;
        }
        Context context = this.f78722k;
        float fH0 = ViewUtils.h0(context, ViewUtils.m(context, ViewUtils.W(textView), ViewUtils.V(textView)));
        textView.setVisibility(0);
        String friend_code_show = gameCardObj.getFriend_code_show();
        if (f0.g("0", friend_code_show)) {
            bb.d.d(textView, 0);
            textView.setText(this.f78722k.getResources().getString(R.string.friend_code_hide) + "  \uf0d7");
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, q.o(this.f78722k, R.color.background_card_1_color, fH0));
            stateListDrawable.addState(new int[0], q.o(this.f78722k, R.color.divider_secondary_1_color, fH0));
            textView.setBackground(stateListDrawable);
            textView.setTextColor(this.f78722k.getResources().getColor(R.color.text_secondary_1_color));
            return;
        }
        if (!f0.g("1", friend_code_show)) {
            textView.setVisibility(8);
            return;
        }
        bb.d.d(textView, 0);
        textView.setText(this.f78722k.getResources().getString(R.string.friend_code_show) + "  \uf0d7");
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed}, ViewUtils.w(ViewUtils.f(this.f78722k, fH0), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_start_color), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.BL_TR));
        stateListDrawable2.addState(new int[]{-16842910}, q.o(this.f78722k, R.color.divider_secondary_1_color, fH0));
        stateListDrawable2.addState(new int[0], ViewUtils.w(ViewUtils.f(this.f78722k, fH0), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_start_color), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.BL_TR));
        textView.setBackground(stateListDrawable2);
        textView.setTextColor(this.f78722k.getResources().getColor(R.color.background_layer_2_color));
    }

    private final void F0(GameCardObj gameCardObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{gameCardObj, textView}, this, changeQuickRedirect, false, 24783, new Class[]{GameCardObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f78722k;
        float fH0 = ViewUtils.h0(context, ViewUtils.m(context, ViewUtils.W(textView), ViewUtils.V(textView)));
        if (f0.g("steam", gameCardObj.getGame_type())) {
            return;
        }
        String card_show = gameCardObj.getCard_show();
        if (f0.g("0", card_show)) {
            bb.d.d(textView, 0);
            textView.setText(this.f78722k.getResources().getString(R.string.game_card_hide) + "  \uf0d7");
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, q.o(this.f78722k, R.color.background_card_1_color, fH0));
            stateListDrawable.addState(new int[0], q.o(this.f78722k, R.color.divider_secondary_1_color, fH0));
            textView.setBackground(stateListDrawable);
            textView.setTextColor(this.f78722k.getResources().getColor(R.color.text_secondary_1_color));
            return;
        }
        if (!f0.g("1", card_show)) {
            if (f0.g("2", card_show)) {
                bb.d.d(textView, 0);
                textView.setText(this.f78722k.getResources().getString(R.string.game_card_self_only) + "  \uf0d7");
                textView.setBackground(q.o(this.f78722k, R.color.text_primary_2_color, fH0));
                textView.setTextColor(this.f78722k.getResources().getColor(R.color.background_layer_2_color));
                return;
            }
            return;
        }
        bb.d.d(textView, 0);
        textView.setText(this.f78722k.getResources().getString(R.string.game_card_show) + "  \uf0d7");
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed}, ViewUtils.w(ViewUtils.f(this.f78722k, fH0), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_start_color), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.BL_TR));
        stateListDrawable2.addState(new int[]{-16842910}, q.o(this.f78722k, R.color.background_layer_3_color, fH0));
        stateListDrawable2.addState(new int[0], ViewUtils.w(ViewUtils.f(this.f78722k, fH0), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_start_color), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.BL_TR));
        textView.setBackground(stateListDrawable2);
        textView.setTextColor(this.f78722k.getResources().getColor(R.color.background_layer_2_color));
    }

    private final void G0(GameCardObj gameCardObj, TextView textView) {
        if (!PatchProxy.proxy(new Object[]{gameCardObj, textView}, this, changeQuickRedirect, false, 24784, new Class[]{GameCardObj.class, TextView.class}, Void.TYPE).isSupported && f0.g("steam", gameCardObj.getGame_type())) {
            Context context = this.f78722k;
            float fH0 = ViewUtils.h0(context, ViewUtils.m(context, ViewUtils.W(textView), ViewUtils.V(textView)));
            bb.d.d(textView, 0);
            textView.setText(this.f78722k.getResources().getString(R.string.change_bind2));
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed}, ViewUtils.w(ViewUtils.f(this.f78722k, fH0), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_start_color), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.BL_TR));
            stateListDrawable.addState(new int[]{-16842910}, q.o(this.f78722k, R.color.divider_secondary_1_color, fH0));
            stateListDrawable.addState(new int[0], ViewUtils.w(ViewUtils.f(this.f78722k, fH0), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_start_color), this.f78722k.getResources().getColor(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.BL_TR));
            textView.setBackground(stateListDrawable);
            textView.setTextColor(this.f78722k.getResources().getColor(R.color.background_layer_2_color));
        }
    }

    public static final /* synthetic */ void o0(a aVar, GameCardObj gameCardObj, TextView textView, TextView textView2) {
        if (PatchProxy.proxy(new Object[]{aVar, gameCardObj, textView, textView2}, null, changeQuickRedirect, true, 24794, new Class[]{a.class, GameCardObj.class, TextView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.x0(gameCardObj, textView, textView2);
    }

    public static final /* synthetic */ void p0(a aVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{aVar, str, str2}, null, changeQuickRedirect, true, 24795, new Class[]{a.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.y0(str, str2);
    }

    public static final /* synthetic */ void q0(a aVar, String str) {
        if (PatchProxy.proxy(new Object[]{aVar, str}, null, changeQuickRedirect, true, 24796, new Class[]{a.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.z0(str);
    }

    public static final /* synthetic */ void r0(a aVar, GameCardObj gameCardObj, TextView textView, TextView textView2) {
        if (PatchProxy.proxy(new Object[]{aVar, gameCardObj, textView, textView2}, null, changeQuickRedirect, true, 24792, new Class[]{a.class, GameCardObj.class, TextView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.A0(gameCardObj, textView, textView2);
    }

    public static final /* synthetic */ void s0(a aVar, GameCardObj gameCardObj, TextView textView, TextView textView2) {
        if (PatchProxy.proxy(new Object[]{aVar, gameCardObj, textView, textView2}, null, changeQuickRedirect, true, 24791, new Class[]{a.class, GameCardObj.class, TextView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.B0(gameCardObj, textView, textView2);
    }

    public static final /* synthetic */ void t0(a aVar, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{aVar, str, str2, str3}, null, changeQuickRedirect, true, 24790, new Class[]{a.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.C0(str, str2, str3);
    }

    public static final /* synthetic */ void u0(a aVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{aVar, str, str2}, null, changeQuickRedirect, true, 24793, new Class[]{a.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.D0(str, str2);
    }

    private final boolean v0(GameCardObj gameCardObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameCardObj}, this, changeQuickRedirect, false, 24789, new Class[]{GameCardObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String game_type = gameCardObj.getGame_type();
        if (game_type == null) {
            return false;
        }
        switch (game_type.hashCode()) {
            case -889473228:
                return game_type.equals("switch");
            case -85276806:
                return game_type.equals("switchjp");
            case bb.c.e.f31743d /* 3525 */:
                return game_type.equals("ns");
            case bb.c.e.X /* 3571 */:
                return game_type.equals("pc");
            case 111307:
                return game_type.equals("psn");
            case 3119877:
                return game_type.equals("epic");
            case 3672659:
                return game_type.equals("xbox");
            case 109760848:
                return game_type.equals("steam");
            case 1651377645:
                return game_type.equals("switchall");
            default:
                return false;
        }
    }

    private final void w0(GameCardObj gameCardObj, int i10, boolean z10, View view) {
        String str;
        if (PatchProxy.proxy(new Object[]{gameCardObj, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), view}, this, changeQuickRedirect, false, 24778, new Class[]{GameCardObj.class, Integer.TYPE, Boolean.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        boolean z11 = !com.max.hbcommon.utils.c.w(gameCardObj.getAccounts());
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_icon);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_desc);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_change_bind);
        TextView tv_button2 = (TextView) view.findViewById(R.id.tv_show_or_hide);
        TextView tv_button3 = (TextView) view.findViewById(R.id.tv_show_friend_code);
        View viewFindViewById = view.findViewById(R.id.divider);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z10 ? 8 : 0);
        }
        textView2.setText(gameCardObj.getGame_name());
        textView.setText(gameCardObj.getNickname());
        com.max.hbimage.b.d0(gameCardObj.getIcon(), imageView, ViewUtils.o(this.f78722k, imageView));
        bb.d.d(textView3, 0);
        Context context2 = this.f78722k;
        textView3.setBackground(q.o(this.f78722k, R.color.divider_secondary_1_color, ViewUtils.h0(context2, ViewUtils.o(context2, textView3))));
        if (z11) {
            if (z10) {
                str = context.getResources().getString(R.string.multi_account) + " \uf0d8";
            } else {
                str = context.getResources().getString(R.string.multi_account) + " \uf0d7";
            }
            textView3.setText(str);
        } else {
            textView3.setText(context.getResources().getString(R.string.unbind2));
        }
        textView3.setOnClickListener(new f(z11, this, gameCardObj, z10, i10));
        tv_button2.setOnClickListener(new g(gameCardObj, this, tv_button2, tv_button3));
        tv_button3.setOnClickListener(new h(gameCardObj, this, tv_button2, tv_button3));
        f0.o(tv_button2, "tv_button2");
        f0.o(tv_button3, "tv_button3");
        x0(gameCardObj, tv_button2, tv_button3);
        view.setOnClickListener(new i(gameCardObj, this));
    }

    private final void x0(GameCardObj gameCardObj, TextView textView, TextView textView2) {
        if (PatchProxy.proxy(new Object[]{gameCardObj, textView, textView2}, this, changeQuickRedirect, false, 24782, new Class[]{GameCardObj.class, TextView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean z10 = !com.max.hbcommon.utils.c.w(gameCardObj.getAccounts());
        textView.setVisibility(0);
        if (!f0.g("steam", gameCardObj.getGame_type())) {
            F0(gameCardObj, textView);
            textView2.setVisibility(8);
        } else {
            if (z10) {
                textView.setVisibility(8);
            } else {
                G0(gameCardObj, textView);
            }
            E0(gameCardObj, textView2);
        }
    }

    private final void y0(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 24786, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().o7(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j());
    }

    private final void z0(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24787, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().m3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k());
    }

    @Override // pokercc.android.expandablerecyclerview.ExpandableAdapter
    public int A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24777, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        com.max.heybox.hblog.g.f74531b.q("ChangeBindListAdapterV2, getGroupCount, mDataList.size = " + this.f78723l.size());
        return this.f78723l.size();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    @Override // pokercc.android.expandablerecyclerview.ExpandableAdapter
    public void X(@dl.d ExpandableAdapter.c holder, int i10, int i11, @dl.d List<? extends Object> payloads) {
        List<GameCardChildObj> accounts;
        List<GameCardChildObj> accounts2;
        GameCardChildObj gameCardChildObj;
        boolean z10;
        Object[] objArr = {holder, new Integer(i10), new Integer(i11), payloads};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24773, new Class[]{ExpandableAdapter.c.class, cls, cls, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        f0.p(payloads, "payloads");
        l3.c cVarG = ((com.max.xiaoheihe.module.account.adapter.c) holder).g();
        if (!(cVarG instanceof q50)) {
            if (cVarG instanceof t50) {
                GameCardObj gameCardObj = this.f78723l.get(i10);
                GameCardChildObj gameCardChildObj2 = (gameCardObj == null || (accounts = gameCardObj.getAccounts()) == null) ? null : accounts.get(i11);
                if (f0.g(gameCardChildObj2 != null ? gameCardChildObj2.getGame_type() : null, "steam")) {
                    ((t50) cVarG).b().setOnClickListener(new d());
                    return;
                }
                return;
            }
            return;
        }
        if (i10 < this.f78723l.size()) {
            GameCardObj gameCardObj2 = this.f78723l.get(i10);
            GameCardObj gameCardObj3 = this.f78723l.get(i10);
            if (gameCardObj3 == null || (accounts2 = gameCardObj3.getAccounts()) == null || i11 >= accounts2.size() || (gameCardChildObj = accounts2.get(i11)) == null) {
                return;
            }
            String account_id = gameCardChildObj.getAccount_id();
            if (account_id != null && account_id.length() > 0) {
                if (f0.g(gameCardObj2 != null ? gameCardObj2.getMaster() : null, gameCardChildObj.getAccount_id())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            com.max.xiaoheihe.module.account.gameaccount.a aVar = new com.max.xiaoheihe.module.account.gameaccount.a(this.f78722k);
            q50 q50Var = (q50) cVarG;
            q50Var.f114733d.setText(gameCardChildObj.getDesc1());
            q50Var.f114735f.setText(gameCardChildObj.getDesc2());
            if (com.max.hbcommon.utils.c.u(gameCardChildObj.getDesc3())) {
                q50Var.f114732c.setVisibility(8);
            } else {
                q50Var.f114732c.setText(gameCardChildObj.getDesc3());
            }
            if (gameCardChildObj.getAccount_id() != null && gameCardChildObj.getGame_type() != null && f0.g(gameCardChildObj.getGame_type(), "steam")) {
                q50Var.f114734e.setVisibility(0);
                if (z10) {
                    TextView textView = q50Var.f114734e;
                    textView.setText(R.string.multi_account_current_main_account);
                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                    textView.setTextColor(this.f78722k.getColor(R.color.text_primary_1_color));
                    q50Var.f114734e.setOnClickListener(null);
                } else {
                    TextView textView2 = q50Var.f114734e;
                    textView2.setText(R.string.multi_account_setas_main_account);
                    textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                    textView2.setTextColor(this.f78722k.getColor(R.color.text_secondary_1_color));
                    q50Var.f114734e.setOnClickListener(new ViewOnClickListenerC0649a(aVar, this, gameCardChildObj));
                }
            }
            GameCardObj gameCardObj4 = this.f78723l.get(i10);
            q50Var.f114736g.setOnClickListener(new b(gameCardChildObj.getGame_type(), aVar, gameCardObj4 != null ? gameCardObj4.getGame_name() : null, gameCardChildObj.getAccount_id(), z10));
            if (com.max.hbcommon.utils.c.u(gameCardChildObj.getProtocol())) {
                return;
            }
            q50Var.b().setOnClickListener(new c(gameCardChildObj));
        }
    }

    @Override // pokercc.android.expandablerecyclerview.ExpandableAdapter
    public void Y(@dl.d ExpandableAdapter.c holder, int i10, boolean z10, @dl.d List<? extends Object> payloads) {
        GameCardObj gameCardObj;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), payloads}, this, changeQuickRedirect, false, 24774, new Class[]{ExpandableAdapter.c.class, Integer.TYPE, Boolean.TYPE, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        f0.p(payloads, "payloads");
        if (i10 >= this.f78723l.size() || (gameCardObj = this.f78723l.get(i10)) == null) {
            return;
        }
        View view = holder.itemView;
        f0.o(view, "holder.itemView");
        w0(gameCardObj, i10, z10, view);
    }

    @Override // pokercc.android.expandablerecyclerview.ExpandableAdapter
    @dl.d
    public ExpandableAdapter.c b0(@dl.d ViewGroup viewGroup, int i10) {
        l3.c cVarD;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 24770, new Class[]{ViewGroup.class, Integer.TYPE}, ExpandableAdapter.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (ExpandableAdapter.c) patchProxyResultProxy.result;
        }
        f0.p(viewGroup, "viewGroup");
        if (i10 == -99) {
            cVarD = t50.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            f0.o(cVarD, "inflate(\n               …roup, false\n            )");
        } else {
            cVarD = q50.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            f0.o(cVarD, "inflate(\n               …roup, false\n            )");
        }
        return new com.max.xiaoheihe.module.account.adapter.c(cVarD);
    }

    @Override // pokercc.android.expandablerecyclerview.ExpandableAdapter
    @dl.d
    public ExpandableAdapter.c c0(@dl.d ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 24772, new Class[]{ViewGroup.class, Integer.TYPE}, ExpandableAdapter.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (ExpandableAdapter.c) patchProxyResultProxy.result;
        }
        f0.p(viewGroup, "viewGroup");
        r50 r50VarD = r50.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        f0.o(r50VarD, "inflate(\n            Lay…iewGroup, false\n        )");
        return new com.max.xiaoheihe.module.account.adapter.h(r50VarD);
    }

    @Override // pokercc.android.expandablerecyclerview.ExpandableAdapter
    public void g0(@dl.d ExpandableAdapter.c holder, int i10, long j10, boolean z10) {
        List<GameCardChildObj> accounts;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10), new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24775, new Class[]{ExpandableAdapter.c.class, Integer.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        GameCardObj gameCardObj = this.f78723l.get(i10);
        if (gameCardObj != null && (accounts = gameCardObj.getAccounts()) != null) {
            accounts.size();
        }
        if (z10 && (this.f78722k instanceof com.max.xiaoheihe.module.account.adapter.d)) {
            View view = holder.itemView;
            view.postDelayed(new e(view), j10);
        }
    }

    @Override // pokercc.android.expandablerecyclerview.ExpandableAdapter
    public int v(int i10) {
        List<GameCardChildObj> accounts;
        List<GameCardChildObj> accounts2;
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24776, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChangeBindListAdapterV2, getChildCount, groupPosition = ");
        sb2.append(i10);
        sb2.append(", size = ");
        GameCardObj gameCardObj = this.f78723l.get(i10);
        sb2.append((gameCardObj == null || (accounts2 = gameCardObj.getAccounts()) == null) ? null : Integer.valueOf(accounts2.size()));
        aVar.q(sb2.toString());
        GameCardObj gameCardObj2 = this.f78723l.get(i10);
        if (gameCardObj2 == null || (accounts = gameCardObj2.getAccounts()) == null) {
            return 0;
        }
        return accounts.size();
    }

    @Override // pokercc.android.expandablerecyclerview.ExpandableAdapter
    public int w(int i10, int i11) {
        Integer viewType;
        List<GameCardChildObj> accounts;
        boolean z10 = false;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24771, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        GameCardObj gameCardObj = this.f78723l.get(i10);
        GameCardChildObj gameCardChildObj = (gameCardObj == null || (accounts = gameCardObj.getAccounts()) == null) ? null : accounts.get(i11);
        if (gameCardChildObj != null && (viewType = gameCardChildObj.getViewType()) != null && viewType.intValue() == -99) {
            z10 = true;
        }
        return z10 ? -99 : -98;
    }
}
