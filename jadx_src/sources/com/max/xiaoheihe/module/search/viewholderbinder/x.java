package com.max.xiaoheihe.module.search.viewholderbinder;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.network.ApiException;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.g0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchUserVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class x extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f91885n = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f91886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BBSUserInfoObj f91887m;

    /* JADX INFO: compiled from: SearchUserVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91889c;

        a(GeneralSearchInfo generalSearchInfo) {
            this.f91889c = generalSearchInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43402, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            x.this.g(this.f91889c);
            com.max.xiaoheihe.base.router.b.T(x.this.m(), x.this.H().getUserid()).A();
        }
    }

    /* JADX INFO: compiled from: SearchUserVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43403, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            x.C(x.this);
        }
    }

    /* JADX INFO: compiled from: SearchUserVHB.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f91892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f91893d;

        c(String str, BBSUserInfoObj bBSUserInfoObj) {
            this.f91892c = str;
            this.f91893d = bBSUserInfoObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43404, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            Context contextM = x.this.m();
            f0.n(contextM, "null cannot be cast to non-null type com.max.hbsearch.SearchNewActivity");
            if (((SearchNewActivity) contextM).isActive()) {
                super.onError(e10);
                x.D(x.this, this.f91892c);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43405, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            Context contextM = x.this.m();
            f0.n(contextM, "null cannot be cast to non-null type com.max.hbsearch.SearchNewActivity");
            if (((SearchNewActivity) contextM).isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(x.this.m().getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                this.f91893d.setFollow_status(this.f91892c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43406, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchUserVHB.kt */
    public static final class d implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91895b;

        d(String str) {
            this.f91895b = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 43408, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            x.D(x.this, this.f91895b);
            x xVar = x.this;
            x.B(xVar, xVar.H(), this.f91895b);
            com.max.hbcommon.analytics.l.f66572a.o("0", "search", x.this.H().getUserid());
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 43407, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: SearchUserVHB.kt */
    public static final class e implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91897b;

        e(String str) {
            this.f91897b = str;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 43410, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            x.D(x.this, this.f91897b);
            x xVar = x.this;
            x.B(xVar, xVar.H(), this.f91897b);
            com.max.hbcommon.analytics.l.f66572a.o("0", "search", x.this.H().getUserid());
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 43409, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: SearchUserVHB.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f91899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f91900d;

        f(BBSUserInfoObj bBSUserInfoObj, String str) {
            this.f91899c = bBSUserInfoObj;
            this.f91900d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43411, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            Context contextM = x.this.m();
            f0.n(contextM, "null cannot be cast to non-null type com.max.hbsearch.SearchNewActivity");
            if (((SearchNewActivity) contextM).isActive()) {
                if (!(e10 instanceof ApiException) || com.max.hbcommon.utils.c.u(e10.getMessage())) {
                    super.onError(e10);
                } else {
                    com.max.xiaoheihe.module.bbs.utils.b.X(e10.getMessage());
                }
                x xVar = x.this;
                String follow_status = this.f91899c.getFollow_status();
                f0.o(follow_status, "info.follow_status");
                x.D(xVar, follow_status);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43412, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            Context contextM = x.this.m();
            f0.n(contextM, "null cannot be cast to non-null type com.max.hbsearch.SearchNewActivity");
            if (((SearchNewActivity) contextM).isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(x.this.m().getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                this.f91899c.setFollow_status(this.f91900d);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43413, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    public static final /* synthetic */ io.reactivex.disposables.b B(x xVar, BBSUserInfoObj bBSUserInfoObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xVar, bBSUserInfoObj, str}, null, changeQuickRedirect, true, 43401, new Class[]{x.class, BBSUserInfoObj.class, String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : xVar.E(bBSUserInfoObj, str);
    }

    public static final /* synthetic */ void C(x xVar) {
        if (PatchProxy.proxy(new Object[]{xVar}, null, changeQuickRedirect, true, 43399, new Class[]{x.class}, Void.TYPE).isSupported) {
            return;
        }
        xVar.F();
    }

    public static final /* synthetic */ void D(x xVar, String str) {
        if (PatchProxy.proxy(new Object[]{xVar, str}, null, changeQuickRedirect, true, 43400, new Class[]{x.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        xVar.L(str);
    }

    private final io.reactivex.disposables.b E(BBSUserInfoObj bBSUserInfoObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj, str}, this, changeQuickRedirect, false, 43397, new Class[]{BBSUserInfoObj.class, String.class}, io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        g0 g0VarJ5 = com.max.xiaoheihe.network.i.a().f6(bBSUserInfoObj.getUserid()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str, bBSUserInfoObj));
        f0.o(g0VarJ5, "private fun cancelFollow…   }\n            })\n    }");
        return (io.reactivex.disposables.b) g0VarJ5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    private final void F() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43394, new Class[0], Void.TYPE).isSupported && i0.e(m())) {
            String follow_status = H().getFollow_status();
            if (follow_status != null) {
                switch (follow_status.hashCode()) {
                    case 48:
                        follow_status.equals("0");
                        str = "1";
                        break;
                    case 49:
                        if (!follow_status.equals("1")) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        break;
                    case 50:
                        if (!follow_status.equals("2")) {
                            str = "1";
                        } else {
                            str = "3";
                        }
                        break;
                    case 51:
                        if (!follow_status.equals("3")) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        break;
                    default:
                        str = "1";
                        break;
                }
            } else {
                str = "1";
            }
            if (f0.g("0", H().getFollow_status())) {
                L(str);
                G(H(), str);
                com.max.hbcommon.analytics.l.f66572a.o("1", "search", H().getUserid());
            } else {
                if (f0.g("1", H().getFollow_status())) {
                    com.max.xiaoheihe.view.l.D(m(), m().getString(R.string.cancel_follow_user_confirm), "", m().getString(R.string.confirm), m().getString(R.string.cancel), new d(str));
                    return;
                }
                if (f0.g("2", H().getFollow_status())) {
                    L(str);
                    G(H(), str);
                    com.max.hbcommon.analytics.l.f66572a.o("1", "search", H().getUserid());
                } else if (f0.g("3", H().getFollow_status())) {
                    com.max.xiaoheihe.view.l.D(m(), m().getString(R.string.cancel_follow_user_confirm), "", m().getString(R.string.confirm), m().getString(R.string.cancel), new e(str));
                }
            }
        }
    }

    private final io.reactivex.disposables.b G(BBSUserInfoObj bBSUserInfoObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSUserInfoObj, str}, this, changeQuickRedirect, false, 43396, new Class[]{BBSUserInfoObj.class, String.class}, io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        g0 g0VarJ5 = com.max.xiaoheihe.network.i.a().J7(bBSUserInfoObj.getUserid(), null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(bBSUserInfoObj, str));
        f0.o(g0VarJ5, "private fun followUser(i…   }\n            })\n    }");
        return (io.reactivex.disposables.b) g0VarJ5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void L(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43395, new Class[]{String.class}, Void.TYPE).isSupported) {
        }
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    Drawable drawable = m().getResources().getDrawable(R.drawable.common_add_with_padding_16x16);
                    int iF = ViewUtils.f(m(), 16.0f);
                    drawable.setBounds(0, 0, iF, iF);
                    I().setText(R.string.follow);
                    I().setTextColor(m().getResources().getColor(R.color.white));
                    I().setBackgroundDrawable(m().getResources().getDrawable(R.drawable.text_primary_2dp));
                    I().setCompoundDrawables(drawable, null, null, null);
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    I().setText(R.string.has_followed);
                    I().setTextColor(m().getResources().getColor(R.color.text_secondary_1_color));
                    I().setBackgroundDrawable(m().getResources().getDrawable(R.drawable.divider_color_concept_2dp));
                    I().setCompoundDrawables(null, null, null, null);
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    Drawable drawable2 = m().getResources().getDrawable(R.drawable.account_follow_each_other_v);
                    int iF2 = ViewUtils.f(m(), 16.0f);
                    drawable2.setBounds(0, 0, iF2, iF2);
                    I().setText(R.string.follow);
                    I().setTextColor(m().getResources().getColor(R.color.white));
                    I().setBackgroundDrawable(m().getResources().getDrawable(R.drawable.text_primary_2dp));
                    I().setCompoundDrawables(drawable2, null, null, null);
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    Drawable drawable3 = m().getResources().getDrawable(R.drawable.account_follow_each_other_v);
                    int iF3 = ViewUtils.f(m(), 16.0f);
                    drawable3.setBounds(0, 0, iF3, iF3);
                    drawable3.setColorFilter(m().getResources().getColor(R.color.text_secondary_1_color), PorterDuff.Mode.SRC_ATOP);
                    I().setText(R.string.follow_each_other);
                    I().setTextColor(m().getResources().getColor(R.color.text_secondary_1_color));
                    I().setBackgroundDrawable(m().getResources().getDrawable(R.drawable.divider_color_concept_2dp));
                    I().setCompoundDrawables(drawable3, null, null, null);
                    break;
                }
                break;
        }
    }

    @dl.d
    public final BBSUserInfoObj H() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43391, new Class[0], BBSUserInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSUserInfoObj) patchProxyResultProxy.result;
        }
        BBSUserInfoObj bBSUserInfoObj = this.f91887m;
        if (bBSUserInfoObj != null) {
            return bBSUserInfoObj;
        }
        f0.S("info");
        return null;
    }

    @dl.d
    public final TextView I() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43389, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f91886l;
        if (textView != null) {
            return textView;
        }
        f0.S("tvSubscribe");
        return null;
    }

    public final void J(@dl.d BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj}, this, changeQuickRedirect, false, 43392, new Class[]{BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bBSUserInfoObj, "<set-?>");
        this.f91887m = bBSUserInfoObj;
    }

    public final void K(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 43390, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f91886l = textView;
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43398, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43393, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        Object objA = com.max.hbutils.utils.k.a(data.getInfo(), BBSUserInfoObj.class);
        f0.o(objA, "deserialize(data.info, BBSUserInfoObj::class.java)");
        J((BBSUserInfoObj) objA);
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) viewHolder.i(R.id.iv_avatar);
        TextView textView = (TextView) viewHolder.i(R.id.tv_name);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
        View viewI = viewHolder.i(R.id.tv_subscribe);
        f0.o(viewI, "viewHolder.getView<TextView>(R.id.tv_subscribe)");
        K((TextView) viewI);
        RelativeLayout relativeLayout = (RelativeLayout) viewHolder.i(R.id.vg_level);
        View viewI2 = viewHolder.i(R.id.divider);
        heyBoxAvatarView.setAvatar(H().getAvartar(), H().getAvatar_decoration());
        textView.setText(H().getUsername());
        textView2.setText(H().getRec_tag());
        com.max.xiaoheihe.utils.d.j1(relativeLayout, H());
        String follow_status = H().getFollow_status();
        f0.o(follow_status, "info.follow_status");
        L(follow_status);
        viewHolder.itemView.setTag(data);
        viewHolder.itemView.setOnClickListener(new a(data));
        I().setOnClickListener(new b());
        if (viewI2 == null) {
            return;
        }
        viewI2.setVisibility(8);
    }
}
