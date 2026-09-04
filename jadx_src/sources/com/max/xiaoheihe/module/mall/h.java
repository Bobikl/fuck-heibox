package com.max.xiaoheihe.module.mall;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.p0;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallAvatarDecorOptionObj;
import com.max.xiaoheihe.bean.mall.MallAvatarDecorOptionsObj;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class h extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f90730q = "avatar_decor";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f90731r = "session";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f90732s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f90733t = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AvatarDecorationObj f90734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f90735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MallAvatarDecorOptionsObj f90736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f90737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f90738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private FlexboxLayout f90739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f90740p;

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40373, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40374, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            o.l(h.this.getActivity());
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40372, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            h.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40375, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            h.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class e extends com.max.hbcommon.network.d<Result<MallAvatarDecorOptionsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40376, new Class[]{Throwable.class}, Void.TYPE).isSupported && h.this.isActive()) {
                super.onError(th2);
                h.this.f90737m.setVisibility(8);
            }
        }

        public void onNext(Result<MallAvatarDecorOptionsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40377, new Class[]{Result.class}, Void.TYPE).isSupported && h.this.isActive()) {
                super.onNext(result);
                h.this.f90737m.setVisibility(8);
                h.this.f90736l = result.getResult();
                h.Z3(h.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40378, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallAvatarDecorOptionsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class f extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40379, new Class[]{Throwable.class}, Void.TYPE).isSupported && h.this.isActive()) {
                super.onError(th2);
                h.this.f90737m.setVisibility(8);
            }
        }

        public void onNext(Result<MallPayInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40380, new Class[]{Result.class}, Void.TYPE).isSupported && h.this.isActive()) {
                super.onNext(result);
                h.this.f90737m.setVisibility(8);
                MallPayInfoObj result2 = result.getResult();
                if (result2 != null && result2.getOrder_info() != null) {
                    if (com.max.hbutils.utils.n.r(result2.getOrder_info().getCoin()) < com.max.hbutils.utils.n.r(result2.getOrder_info().getCost_coin())) {
                        h.a4(h.this, result2);
                        return;
                    } else {
                        h.b4(h.this, result2);
                        return;
                    }
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(h.this.getString(R.string.fail));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40381, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40382, new Class[]{Throwable.class}, Void.TYPE).isSupported && h.this.isActive()) {
                super.onError(th2);
                h.this.f90737m.setVisibility(8);
            }
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40383, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = h.this.getContext();
            if (!h.this.isActive() || context == null) {
                return;
            }
            super.onNext(result);
            h.this.f90737m.setVisibility(8);
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(h.this.getString(R.string.success));
            } else {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(result.getMsg());
            }
            context.sendBroadcast(new Intent(lb.a.L));
            h.this.dismiss();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40384, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class ViewOnClickListenerC0836h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallAvatarDecorOptionObj f90748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f90749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FlexboxLayout f90750d;

        ViewOnClickListenerC0836h(MallAvatarDecorOptionObj mallAvatarDecorOptionObj, List list, FlexboxLayout flexboxLayout) {
            this.f90748b = mallAvatarDecorOptionObj;
            this.f90749c = list;
            this.f90750d = flexboxLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40385, new Class[]{View.class}, Void.TYPE).isSupported || this.f90748b.isChecked()) {
                return;
            }
            h.c4(h.this, this.f90749c, this.f90748b);
            h.d4(h.this, this.f90750d, this.f90749c);
            h.e4(h.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallAvatarDecorOptionObj f90752b;

        i(MallAvatarDecorOptionObj mallAvatarDecorOptionObj) {
            this.f90752b = mallAvatarDecorOptionObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40386, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            h hVar = h.this;
            h.g4(hVar, hVar.f90734j.getId(), this.f90752b.getPurchase_days());
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40387, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseAvatarDecorDialogFragment.java */
    public class k implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallPayInfoObj f90755b;

        k(MallPayInfoObj mallPayInfoObj) {
            this.f90755b = mallPayInfoObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40388, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            h.Y3(h.this, this.f90755b.getOrder_info().getOrder_id(), h.this.f90735k);
            dialogInterface.dismiss();
        }
    }

    static /* synthetic */ void Y3(h hVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{hVar, str, str2}, null, changeQuickRedirect, true, 40371, new Class[]{h.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.m4(str, str2);
    }

    static /* synthetic */ void Z3(h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, 40364, new Class[]{h.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.l4();
    }

    static /* synthetic */ void a4(h hVar, MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{hVar, mallPayInfoObj}, null, changeQuickRedirect, true, 40365, new Class[]{h.class, MallPayInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.r4(mallPayInfoObj);
    }

    static /* synthetic */ void b4(h hVar, MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{hVar, mallPayInfoObj}, null, changeQuickRedirect, true, 40366, new Class[]{h.class, MallPayInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.q4(mallPayInfoObj);
    }

    static /* synthetic */ void c4(h hVar, List list, MallAvatarDecorOptionObj mallAvatarDecorOptionObj) {
        if (PatchProxy.proxy(new Object[]{hVar, list, mallAvatarDecorOptionObj}, null, changeQuickRedirect, true, 40367, new Class[]{h.class, List.class, MallAvatarDecorOptionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.s4(list, mallAvatarDecorOptionObj);
    }

    static /* synthetic */ void d4(h hVar, FlexboxLayout flexboxLayout, List list) {
        if (PatchProxy.proxy(new Object[]{hVar, flexboxLayout, list}, null, changeQuickRedirect, true, 40368, new Class[]{h.class, FlexboxLayout.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.o4(flexboxLayout, list);
    }

    static /* synthetic */ void e4(h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, 40369, new Class[]{h.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.p4();
    }

    static /* synthetic */ void g4(h hVar, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{hVar, str, str2}, null, changeQuickRedirect, true, 40370, new Class[]{h.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        hVar.h4(str, str2);
    }

    private void h4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 40353, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f90737m.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d3(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private MallAvatarDecorOptionObj i4(List<MallAvatarDecorOptionObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 40358, new Class[]{List.class}, MallAvatarDecorOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallAvatarDecorOptionObj) patchProxyResultProxy.result;
        }
        if (list == null) {
            return null;
        }
        for (MallAvatarDecorOptionObj mallAvatarDecorOptionObj : list) {
            if (mallAvatarDecorOptionObj.isChecked()) {
                return mallAvatarDecorOptionObj;
            }
        }
        return null;
    }

    private void j4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40352, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f90737m.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ac(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static h k4(AvatarDecorationObj avatarDecorationObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{avatarDecorationObj, str}, null, changeQuickRedirect, true, 40349, new Class[]{AvatarDecorationObj.class, String.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f90730q, avatarDecorationObj);
        bundle.putString("session", str);
        hVar.setArguments(bundle);
        return hVar;
    }

    private void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40356, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallAvatarDecorOptionsObj mallAvatarDecorOptionsObj = this.f90736l;
        List<MallAvatarDecorOptionObj> purchase_option = mallAvatarDecorOptionsObj != null ? mallAvatarDecorOptionsObj.getPurchase_option() : null;
        if (purchase_option == null || purchase_option.isEmpty()) {
            return;
        }
        s4(purchase_option, purchase_option.get(0));
        o4(this.f90739o, purchase_option);
        p4();
    }

    private void m4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 40355, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f90737m.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().m(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void n4() {
        MallAvatarDecorOptionObj mallAvatarDecorOptionObjI4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40354, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallAvatarDecorOptionsObj mallAvatarDecorOptionsObj = this.f90736l;
        List<MallAvatarDecorOptionObj> purchase_option = mallAvatarDecorOptionsObj != null ? mallAvatarDecorOptionsObj.getPurchase_option() : null;
        if (purchase_option == null || (mallAvatarDecorOptionObjI4 = i4(purchase_option)) == null) {
            return;
        }
        h4(this.f90734j.getId(), mallAvatarDecorOptionObjI4.getPurchase_days());
    }

    private void o4(FlexboxLayout flexboxLayout, List<MallAvatarDecorOptionObj> list) {
        if (PatchProxy.proxy(new Object[]{flexboxLayout, list}, this, changeQuickRedirect, false, 40359, new Class[]{FlexboxLayout.class, List.class}, Void.TYPE).isSupported || flexboxLayout == null || list == null) {
            return;
        }
        Context context = flexboxLayout.getContext();
        flexboxLayout.removeAllViews();
        int iF = ViewUtils.f(context, 10.0f);
        int iL = (ViewUtils.L(context) - ViewUtils.f(context, 44.0f)) / 3;
        for (MallAvatarDecorOptionObj mallAvatarDecorOptionObj : list) {
            TextView textView = new TextView(context);
            textView.setPadding(iF, iF, iF, iF);
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView.setTextColor(context.getResources().getColor(mallAvatarDecorOptionObj.isChecked() ? R.color.text_primary_1_color : R.color.text_primary_2_color));
            textView.setText(mallAvatarDecorOptionObj.getDesc());
            textView.setGravity(17);
            textView.setMinWidth(iL);
            textView.setMinHeight(ViewUtils.f(context, 40.0f));
            textView.setBackgroundResource(mallAvatarDecorOptionObj.isChecked() ? R.drawable.btn_divider_bg_tile_border_2dp : R.drawable.btn_divider_bg_2dp);
            textView.setOnClickListener(new ViewOnClickListenerC0836h(mallAvatarDecorOptionObj, list, flexboxLayout));
            flexboxLayout.addView(textView);
        }
    }

    private void p4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40360, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallAvatarDecorOptionsObj mallAvatarDecorOptionsObj = this.f90736l;
        List<MallAvatarDecorOptionObj> purchase_option = mallAvatarDecorOptionsObj != null ? mallAvatarDecorOptionsObj.getPurchase_option() : null;
        TextView textView = this.f90738n;
        if (textView == null || purchase_option == null) {
            return;
        }
        textView.getContext();
        MallAvatarDecorOptionObj mallAvatarDecorOptionObjI4 = i4(purchase_option);
        if (mallAvatarDecorOptionObjI4 == null) {
            return;
        }
        String price = mallAvatarDecorOptionObjI4.getPrice();
        this.f90738n.setText(price);
        this.f90740p.setText(String.format(getString(R.string.h_coin_purchase_format), price));
        this.f90740p.setOnClickListener(new i(mallAvatarDecorOptionObjI4));
    }

    private void q4(MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 40361, new Class[]{MallPayInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!isActive() || activity.isFinishing()) {
                return;
            }
            String str = mallPayInfoObj.getOrder_info().getCost_coin() + getString(R.string.h_coin);
            SpannableString spannableString = new SpannableString(getString(R.string.should_cost) + " " + str);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.interactive_color)), spannableString.length() - str.length(), spannableString.length(), 33);
            new com.max.hbcommon.view.a.f(context).y(spannableString).l(getString(R.string.current_h_coin) + ": " + mallPayInfoObj.getOrder_info().getCoin()).u(getString(R.string.purchase), new k(mallPayInfoObj)).o(getString(R.string.cancel), new j()).F();
        }
    }

    private void r4(MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 40362, new Class[]{MallPayInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!isActive() || activity.isFinishing()) {
                return;
            }
            com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(activity).y("H币不足").l(getString(R.string.current_h_coin) + ": " + mallPayInfoObj.getOrder_info().getCoin() + ", 请通过每日签到、活动奖励、赛事竞猜获取更多H币");
            fVarL.u("我知道了", new a());
            fVarL.F();
        }
    }

    private void s4(List<MallAvatarDecorOptionObj> list, MallAvatarDecorOptionObj mallAvatarDecorOptionObj) {
        if (PatchProxy.proxy(new Object[]{list, mallAvatarDecorOptionObj}, this, changeQuickRedirect, false, 40357, new Class[]{List.class, MallAvatarDecorOptionObj.class}, Void.TYPE).isSupported || list == null || mallAvatarDecorOptionObj == null) {
            return;
        }
        for (MallAvatarDecorOptionObj mallAvatarDecorOptionObj2 : list) {
            mallAvatarDecorOptionObj2.setChecked(mallAvatarDecorOptionObj2.equals(mallAvatarDecorOptionObj));
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40363, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 3 && i11 == -1) {
            n4();
        } else if (i10 == 4 && i11 == -1) {
            this.f90740p.postDelayed(new b(), 300L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 40350, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f90734j = (AvatarDecorationObj) getArguments().getSerializable(f90730q);
            this.f90735k = getArguments().getString("session");
        }
        return layoutInflater.inflate(R.layout.fragment_mall_purchase_avatar_decor_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 40351, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f90737m = view.findViewById(R.id.vg_progress);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_close);
        this.f90740p = (TextView) view.findViewById(R.id.tv_confirm);
        this.f90738n = (TextView) view.findViewById(R.id.tv_h_coin);
        this.f90739o = (FlexboxLayout) view.findViewById(R.id.fl_tags);
        c cVar = new c();
        view.setOnClickListener(cVar);
        imageView.setOnClickListener(cVar);
        this.f90740p.setOnClickListener(new d());
        j4(this.f90734j.getId());
    }
}
