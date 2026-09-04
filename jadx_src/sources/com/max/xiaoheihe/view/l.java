package com.max.xiaoheihe.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.RadiusCardView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.FeedbackFailedReasonListObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.MedalLevelObj;
import com.max.xiaoheihe.bean.account.PushStateObj;
import com.max.xiaoheihe.bean.account.SignAwardInfo;
import com.max.xiaoheihe.bean.account.SignInInfo;
import com.max.xiaoheihe.bean.account.SignInResultObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.UserMedalV2Obj;
import com.max.xiaoheihe.bean.bbs.AchieveEventObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.CoffeeDialogDataObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.account.UserMedalDetailActivity;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.webview.NativeWebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.ArrayList;

/* JADX INFO: compiled from: DialogManager.java */
/* JADX INFO: loaded from: classes13.dex */
public class l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: DialogManager.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dialog f95949b;

        a(Dialog dialog) {
            this.f95949b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49449, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95949b.dismiss();
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f95950b;

        b(FragmentActivity fragmentActivity) {
            this.f95950b = fragmentActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49450, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.d0(this.f95950b, i0.j(), "achieve").A();
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f95951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserMedalV2Obj f95952c;

        c(FragmentActivity fragmentActivity, UserMedalV2Obj userMedalV2Obj) {
            this.f95951b = fragmentActivity;
            this.f95952c = userMedalV2Obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49451, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l.y(this.f95951b, this.f95952c);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class d implements com.max.hbcommon.component.bottomsheet.t {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.component.bottomsheet.t
        public void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49452, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.TOP.getValue());
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class e implements ShareImageDialogFragment.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f95953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UserMedalV2Obj f95954b;

        e(FragmentActivity fragmentActivity, UserMedalV2Obj userMedalV2Obj) {
            this.f95953a = fragmentActivity;
            this.f95954b = userMedalV2Obj;
        }

        @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.e
        public View a(ViewGroup viewGroup) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 49453, new Class[]{ViewGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            View viewInflate = LayoutInflater.from(this.f95953a).inflate(R.layout.layout_user_medal_share_bg, viewGroup, false);
            View viewFindViewById = viewInflate.findViewById(R.id.vg_detail);
            View viewFindViewById2 = viewInflate.findViewById(R.id.iv_image);
            BBSUserInfoObj bBSUserInfoObj = new BBSUserInfoObj();
            User userI = i0.i();
            bBSUserInfoObj.setAvartar(userI.getAccount_detail().getAvartar());
            bBSUserInfoObj.setUsername(userI.getAccount_detail().getUsername());
            bBSUserInfoObj.setAvatar_decoration(userI.getAccount_detail().getAvatar_decoration());
            viewFindViewById2.setVisibility(0);
            UserMedalV2Obj userMedalV2Obj = this.f95954b;
            UserMedalDetailActivity.b2(viewFindViewById, bBSUserInfoObj, userMedalV2Obj, userMedalV2Obj.getCurrentLevel());
            UserMedalDetailActivity.j2(this.f95953a, viewFindViewById, this.f95954b);
            return viewInflate;
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class f implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AchieveEventObj f95956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Dialog f95957d;

        g(Context context, AchieveEventObj achieveEventObj, Dialog dialog) {
            this.f95955b = context;
            this.f95956c = achieveEventObj;
            this.f95957d = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49454, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f95955b, this.f95956c.getProtocol());
            this.f95957d.dismiss();
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dialog f95958b;

        h(Dialog dialog) {
            this.f95958b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49455, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95958b.dismiss();
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class i implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f95959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f95960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoffeeDialogDataObj f95961d;

        i(BaseActivity baseActivity, Activity activity, CoffeeDialogDataObj coffeeDialogDataObj) {
            this.f95959b = baseActivity;
            this.f95960c = activity;
            this.f95961d = coffeeDialogDataObj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49456, new Class[0], Void.TYPE).isSupported && this.f95959b.isActive()) {
                Dialog dialogU0 = this.f95959b.U0();
                if (dialogU0 == null || !dialogU0.isShowing()) {
                    if (dialogU0 != null) {
                        dialogU0.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f95960c);
                    View viewInflate = this.f95960c.getLayoutInflater().inflate(R.layout.dialog_coffee, (ViewGroup) null, false);
                    l.h(this.f95960c, viewInflate, this.f95961d);
                    AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(this.f95961d.getCancelable_custom()).create();
                    Window window = alertDialogCreate.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawableResource(android.R.color.transparent);
                    }
                    this.f95959b.w1(alertDialogCreate);
                    this.f95959b.N0(alertDialogCreate);
                    alertDialogCreate.show();
                }
            }
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class j implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f95962b;

        j(BaseActivity baseActivity) {
            this.f95962b = baseActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogU0;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49457, new Class[0], Void.TYPE).isSupported && this.f95962b.isActive() && (dialogU0 = this.f95962b.U0()) != null && dialogU0.isShowing()) {
                dialogU0.dismiss();
                this.f95962b.w1(null);
            }
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class k implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.view.m f95963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a.f f95964c;

        k(com.max.xiaoheihe.view.m mVar, com.max.hbcommon.view.a.f fVar) {
            this.f95963b = mVar;
            this.f95964c = fVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 49448, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f95963b.a(this.f95964c.e());
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.view.l$l, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DialogManager.java */
    public class RunnableC0907l implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f95965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f95966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoffeeDialogDataObj f95967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f95968e;

        /* JADX INFO: renamed from: com.max.xiaoheihe.view.l$l$a */
        /* JADX INFO: compiled from: DialogManager.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49460, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                l.m();
                if (com.max.hbcommon.utils.c.u(RunnableC0907l.this.f95967d.getBtnTap())) {
                    return;
                }
                RunnableC0907l runnableC0907l = RunnableC0907l.this;
                com.max.xiaoheihe.base.router.b.k0(runnableC0907l.f95968e, runnableC0907l.f95967d.getBtnTap());
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.view.l$l$b */
        /* JADX INFO: compiled from: DialogManager.java */
        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49461, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                l.m();
                if (com.max.hbcommon.utils.c.u(RunnableC0907l.this.f95967d.getCancel_btn_tap())) {
                    return;
                }
                RunnableC0907l runnableC0907l = RunnableC0907l.this;
                com.max.xiaoheihe.base.router.b.k0(runnableC0907l.f95968e, runnableC0907l.f95967d.getCancel_btn_tap());
            }
        }

        RunnableC0907l(BaseActivity baseActivity, View view, CoffeeDialogDataObj coffeeDialogDataObj, Context context) {
            this.f95965b = baseActivity;
            this.f95966c = view;
            this.f95967d = coffeeDialogDataObj;
            this.f95968e = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49459, new Class[0], Void.TYPE).isSupported || !this.f95965b.isActive() || (view = this.f95966c) == null) {
                return;
            }
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.pb_title);
            TextView textView = (TextView) this.f95966c.findViewById(R.id.tv_title);
            RecyclerView recyclerView = (RecyclerView) this.f95966c.findViewById(R.id.rv_progress);
            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) this.f95966c.findViewById(R.id.vg_button_panel);
            if ("0".equals(this.f95967d.getLoading())) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(0);
            }
            textView.setText(this.f95967d.getTitle());
            if (com.max.hbcommon.utils.c.u(this.f95967d.getBtnText()) && com.max.hbcommon.utils.c.u(this.f95967d.getCancel_btn_text())) {
                bottomButtonLeftItemView.setVisibility(8);
            } else {
                bottomButtonLeftItemView.setVisibility(0);
                if (com.max.hbcommon.utils.c.u(this.f95967d.getBtnText())) {
                    bottomButtonLeftItemView.setShowRightButton(false);
                } else {
                    bottomButtonLeftItemView.setShowRightButton(true);
                    bottomButtonLeftItemView.setRightText(this.f95967d.getBtnText());
                    bottomButtonLeftItemView.setRightClickListener(new a());
                }
                if (com.max.hbcommon.utils.c.u(this.f95967d.getCancel_btn_text())) {
                    bottomButtonLeftItemView.setShowLeftButton(false);
                } else {
                    bottomButtonLeftItemView.setShowLeftButton(true);
                    bottomButtonLeftItemView.setLeftText(this.f95967d.getCancel_btn_text());
                    bottomButtonLeftItemView.setLeftClickListener(new b());
                }
            }
            if (com.max.hbcommon.utils.c.w(this.f95967d.getSteps())) {
                recyclerView.setVisibility(8);
                return;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f95968e));
            recyclerView.setAdapter(new com.max.xiaoheihe.module.game.adapter.c(this.f95968e, this.f95967d.getSteps()));
            recyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class m extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f95971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f95972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f95973f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i10, boolean z10, Context context, boolean z11) {
            super(i10);
            this.f95971d = z10;
            this.f95972e = context;
            this.f95973f = z11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49462, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f95971d) {
                if (this.f95973f) {
                    com.max.xiaoheihe.base.router.b.m0(this.f95972e, "隐私政策", lb.a.E1);
                    return;
                } else {
                    com.max.xiaoheihe.base.router.b.m0(this.f95972e, "用户协议", lb.a.D1);
                    return;
                }
            }
            Intent intent = new Intent(this.f95972e, (Class<?>) NativeWebActionActivity.class);
            if (this.f95973f) {
                intent.putExtra("title", "隐私政策");
                intent.putExtra("pageurl", lb.a.E1);
            } else {
                intent.putExtra("title", "用户协议");
                intent.putExtra("pageurl", lb.a.D1);
            }
            this.f95972e.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f95974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f95976d;

        n(com.max.hbcommon.component.i iVar, Context context, String str) {
            this.f95974b = iVar;
            this.f95975c = context;
            this.f95976d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49463, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95974b.dismiss();
            com.max.xiaoheihe.base.router.b.k0(this.f95975c, this.f95976d);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f95977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f95979d;

        o(com.max.hbcommon.component.i iVar, Context context, String str) {
            this.f95977b = iVar;
            this.f95978c = context;
            this.f95979d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49464, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95977b.dismiss();
            com.max.xiaoheihe.base.router.b.k0(this.f95978c, this.f95979d);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f95980b;

        p(com.max.hbcommon.component.i iVar) {
            this.f95980b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49465, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95980b.dismiss();
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class q implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f95981b;

        q(int i10) {
            this.f95981b = i10;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 49466, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(this.f95981b);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class r extends com.max.hbcommon.network.d<Result<FeedbackFailedReasonListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95982b;

        r(String str) {
            this.f95982b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result<FeedbackFailedReasonListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 49467, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            try {
                if (result.getResult() == null || com.max.hbcommon.utils.c.w(result.getResult().getReason())) {
                    return;
                }
                AppCompatActivity appCompatActivity = (AppCompatActivity) com.max.hbutils.utils.e.b().a();
                if (appCompatActivity.isFinishing()) {
                    return;
                }
                com.max.xiaoheihe.module.game.k.b4(result.getResult().getReason(), this.f95982b).show(appCompatActivity.getSupportFragmentManager(), "FeedBackFailReasonDialogFragment");
            } catch (Throwable th2) {
                Log.e("showFeedBackFailReasonDialog", "error: " + th2.getMessage());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49468, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FeedbackFailedReasonListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class s implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.view.m f95983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a.f f95984c;

        s(com.max.xiaoheihe.view.m mVar, com.max.hbcommon.view.a.f fVar) {
            this.f95983b = mVar;
            this.f95984c = fVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 49458, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f95983b.b(this.f95984c.e());
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class t implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SignInInfo f95985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckBox f95986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f95987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ LayoutInflater f95988e;

        t(SignInInfo signInInfo, CheckBox checkBox, Context context, LayoutInflater layoutInflater) {
            this.f95985b = signInInfo;
            this.f95986c = checkBox;
            this.f95987d = context;
            this.f95988e = layoutInflater;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49469, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                l.x(this.f95985b.getSign_push_state(), "1", this.f95986c, this.f95987d, this.f95988e);
            } else {
                l.x(this.f95985b.getSign_push_state(), "0", this.f95986c, this.f95987d, this.f95988e);
            }
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class u implements l0.h<Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // com.max.xiaoheihe.utils.l0.h
        public void a(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49470, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("签到成功");
        }

        @Override // com.max.xiaoheihe.utils.l0.h
        public void b(Object obj) {
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class v extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.h f95989b;

        v(l0.h hVar) {
            this.f95989b = hVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49472, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            l0.h hVar = this.f95989b;
            if (hVar != null) {
                hVar.b(null);
            }
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 49471, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C(i0.j() + "sign_in_time", System.currentTimeMillis() + "");
            l0.h hVar = this.f95989b;
            if (hVar != null) {
                hVar.a(null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49473, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class w extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f95990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PushStateObj f95991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f95992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ LayoutInflater f95993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95994f;

        /* JADX INFO: compiled from: DialogManager.java */
        public class a implements CompoundButton.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49477, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (z10) {
                    w wVar = w.this;
                    l.x(wVar.f95991c, "1", wVar.f95990b, wVar.f95992d, wVar.f95993e);
                } else {
                    w wVar2 = w.this;
                    l.x(wVar2.f95991c, "0", wVar2.f95990b, wVar2.f95992d, wVar2.f95993e);
                }
            }
        }

        w(CheckBox checkBox, PushStateObj pushStateObj, Context context, LayoutInflater layoutInflater, String str) {
            this.f95990b = checkBox;
            this.f95991c = pushStateObj;
            this.f95992d = context;
            this.f95993e = layoutInflater;
            this.f95994f = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49474, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            this.f95990b.setOnCheckedChangeListener(null);
            this.f95990b.setChecked("1".equals(this.f95991c.getPush_state()));
            this.f95990b.setOnCheckedChangeListener(new a());
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 49475, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            this.f95991c.setPush_state(this.f95994f);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49476, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dialog f95997c;

        x(Context context, Dialog dialog) {
            this.f95996b = context;
            this.f95997c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49478, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.d0(this.f95996b, i0.o().getAccount_detail().getUserid(), "task").A();
            this.f95997c.dismiss();
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dialog f95998b;

        y(Dialog dialog) {
            this.f95998b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49479, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f95998b.dismiss();
        }
    }

    /* JADX INFO: compiled from: DialogManager.java */
    public class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f95999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dialog f96000c;

        z(Context context, Dialog dialog) {
            this.f95999b = context;
            this.f96000c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49480, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.d0(this.f95999b, i0.j(), "achieve").A();
            this.f96000c.dismiss();
        }
    }

    public static void A(CoffeeDialogDataObj coffeeDialogDataObj) {
        if (PatchProxy.proxy(new Object[]{coffeeDialogDataObj}, null, changeQuickRedirect, true, 49431, new Class[]{CoffeeDialogDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        if (activityA instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activityA;
            if (baseActivity.isActive()) {
                baseActivity.runOnUiThread(new i(baseActivity, activityA, coffeeDialogDataObj));
            }
        }
    }

    public static void B(final Context context, final WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{context, webProtocolObj}, null, changeQuickRedirect, true, 49438, new Class[]{Context.class, WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!(context instanceof Activity)) {
            context = com.max.hbutils.utils.e.b().a();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: com.max.xiaoheihe.view.e
                @Override // java.lang.Runnable
                public final void run() {
                    l.n(context, webProtocolObj);
                }
            });
        }
    }

    public static Dialog C(final Context context, SignInInfo signInInfo) {
        final CheckBox checkBox;
        Boolean bool;
        final LayoutInflater layoutInflater;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, signInInfo}, null, changeQuickRedirect, true, 49423, new Class[]{Context.class, SignInInfo.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        final com.max.xiaoheihe.view.d dVarA = new com.max.xiaoheihe.view.d.a(context).a();
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = Boolean.FALSE;
        LayoutInflater layoutInflater2 = (LayoutInflater) context.getSystemService("layout_inflater");
        View viewInflate = layoutInflater2.inflate(R.layout.dialog_custom_check_in, (ViewGroup) null, false);
        dVarA.setContentView(viewInflate);
        TextView textView = (TextView) dVarA.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) dVarA.findViewById(R.id.tv_desc);
        TextView textView3 = (TextView) dVarA.findViewById(R.id.tv_confirm);
        ImageView imageView = (ImageView) dVarA.findViewById(R.id.iv_icon);
        GridLayout gridLayout = (GridLayout) dVarA.findViewById(R.id.grid);
        View viewFindViewById = dVarA.findViewById(R.id.vg_sunday);
        TextView textView4 = (TextView) dVarA.findViewById(R.id.tv_7th_title);
        TextView textView5 = (TextView) dVarA.findViewById(R.id.tv_7th_desc);
        ImageView imageView2 = (ImageView) dVarA.findViewById(R.id.iv_7th_img);
        Boolean bool4 = bool2;
        View viewFindViewById2 = dVarA.findViewById(R.id.vg_outside);
        Boolean bool5 = bool3;
        View viewFindViewById3 = dVarA.findViewById(R.id.container);
        CheckBox checkBox2 = (CheckBox) dVarA.findViewById(R.id.cb_check_in_hint);
        View viewFindViewById4 = viewInflate.findViewById(R.id.vg_check);
        TextView textView6 = (TextView) dVarA.findViewById(R.id.tv_check_in);
        View viewFindViewById5 = dVarA.findViewById(R.id.iv_close);
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.view.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.o(view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.view.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.p(dVarA, view);
            }
        });
        ArrayList<SignAwardInfo> sign_list = signInInfo.getSign_list();
        if (sign_list == null || sign_list.size() != 7) {
            com.max.hbcommon.utils.d.b("cqtest", "sign_list数据错误");
            return null;
        }
        int i10 = 0;
        TextView textView7 = null;
        while (true) {
            checkBox = checkBox2;
            if (i10 >= 6) {
                break;
            }
            SignAwardInfo signAwardInfo = sign_list.get(i10);
            View view = viewFindViewById5;
            com.max.xiaoheihe.view.d dVar = dVarA;
            View viewInflate2 = layoutInflater2.inflate(R.layout.item_check_in_card, (ViewGroup) gridLayout, false);
            TextView textView8 = (TextView) viewInflate2.findViewById(R.id.tv_item_title);
            LayoutInflater layoutInflater3 = layoutInflater2;
            TextView textView9 = (TextView) viewInflate2.findViewById(R.id.tv_item_desc);
            ImageView imageView3 = imageView;
            ImageView imageView4 = (ImageView) viewInflate2.findViewById(R.id.iv_item_img);
            TextView textView10 = textView2;
            View viewFindViewById6 = viewInflate2.findViewById(R.id.v_mask);
            TextView textView11 = textView;
            View viewFindViewById7 = viewInflate2.findViewById(R.id.vg_item);
            View view2 = viewFindViewById;
            textView8.setText(signAwardInfo.getDay());
            String award_name = signAwardInfo.getAward_name();
            ImageView imageView5 = imageView2;
            if (award_name != null) {
                award_name = award_name.replace("\n", "");
            }
            textView9.setText(award_name);
            if ("1".equals(signAwardInfo.is_today())) {
                Boolean bool6 = "1".equals(signAwardInfo.getSigned()) ? Boolean.TRUE : bool5;
                com.max.hbimage.b.c0(context, signAwardInfo.getAward_img(), imageView4);
                viewFindViewById7.setBackgroundResource(R.drawable.gradient_black_sign_color);
                textView9.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                textView8.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                bool5 = bool6;
                bool4 = Boolean.FALSE;
                textView7 = textView8;
            } else {
                com.max.hbimage.b.L(signAwardInfo.getAward_img(), imageView4, R.drawable.ic_heybox_logo_small);
            }
            if (bool4.booleanValue()) {
                viewFindViewById6.setVisibility(0);
                viewFindViewById6.setClickable(true);
                viewFindViewById6.setFocusable(true);
            }
            if ("1".equals(signAwardInfo.getSigned())) {
                textView8.setText("已领取");
            }
            gridLayout.addView(viewInflate2);
            i10++;
            checkBox2 = checkBox;
            viewFindViewById5 = view;
            dVarA = dVar;
            layoutInflater2 = layoutInflater3;
            imageView = imageView3;
            textView2 = textView10;
            textView = textView11;
            viewFindViewById = view2;
            imageView2 = imageView5;
            textView5 = textView5;
        }
        ImageView imageView6 = imageView2;
        LayoutInflater layoutInflater4 = layoutInflater2;
        final com.max.xiaoheihe.view.d dVar2 = dVarA;
        View view3 = viewFindViewById5;
        TextView textView12 = textView;
        TextView textView13 = textView2;
        ImageView imageView7 = imageView;
        View view4 = viewFindViewById;
        SignAwardInfo signAwardInfo2 = sign_list.get(6);
        textView4.setText(signAwardInfo2.getDay());
        textView5.setText(signAwardInfo2.getAward_name());
        if ("1".equals(signAwardInfo2.is_today())) {
            bool = "1".equals(signAwardInfo2.getSigned()) ? Boolean.TRUE : bool5;
            com.max.hbimage.b.c0(context, signAwardInfo2.getAward_img(), imageView6);
            view4.setBackgroundResource(R.drawable.gradient_black_sign_color);
            textView5.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
            textView4.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
        } else {
            com.max.hbimage.b.L(signAwardInfo2.getAward_img(), imageView6, R.drawable.ic_heybox_logo_small);
            bool = bool5;
        }
        if (bool.booleanValue()) {
            textView12.setText("今日已签到");
        } else {
            textView12.setText("签到得好礼");
        }
        textView13.setText(signInInfo.getSign_desc());
        if (signInInfo.getCurrent_user() != null && signInInfo.getCurrent_user().getAvatar() != null) {
            com.max.hbimage.b.d0(signInInfo.getCurrent_user().getAvatar(), imageView7, ViewUtils.f(context, 28.0f));
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                l.q(dVar2, view5);
            }
        });
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.view.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                l.r(checkBox, view5);
            }
        });
        if (signInInfo.getSign_push_state() != null) {
            textView6.setText(signInInfo.getSign_push_state().getPush_type_desc());
            if ("1".equals(signInInfo.getSign_push_state().getPush_state()) && com.max.xiaoheihe.utils.d.N0(context)) {
                checkBox.setChecked(true);
            }
            layoutInflater = layoutInflater4;
            checkBox.setOnCheckedChangeListener(new t(signInInfo, checkBox, context, layoutInflater));
        } else {
            layoutInflater = layoutInflater4;
        }
        if (textView7 != null) {
            if (bool.booleanValue()) {
                textView3.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.view.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        l.s(dVar2, context, checkBox, layoutInflater, view5);
                    }
                });
            } else {
                final TextView textView14 = textView7;
                final LayoutInflater layoutInflater5 = layoutInflater;
                textView3.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.view.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        l.t(textView14, dVar2, context, checkBox, layoutInflater5, view5);
                    }
                });
            }
        }
        Window window = dVar2.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        window.setAttributes(attributes);
        dVar2.show();
        return dVar2;
    }

    public static Dialog D(Context context, String str, String str2, String str3, String str4, com.max.xiaoheihe.view.m mVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, mVar}, null, changeQuickRedirect, true, 49422, new Class[]{Context.class, String.class, String.class, String.class, String.class, com.max.xiaoheihe.view.m.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(context);
        if (!com.max.hbcommon.utils.c.u(str)) {
            fVar.y(str);
        }
        if (!com.max.hbcommon.utils.c.u(str2)) {
            fVar.l(str2);
        }
        if (!com.max.hbcommon.utils.c.u(str3)) {
            fVar.u(str3, new k(mVar, fVar));
        }
        if (!com.max.hbcommon.utils.c.u(str4)) {
            fVar.o(str4, new s(mVar, fVar));
        }
        com.max.hbcommon.view.a aVarD = fVar.d();
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return aVarD;
        }
        aVarD.show();
        return aVarD;
    }

    public static void E(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49440, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        str.hashCode();
        (!str.equals("epic_add_free") ? com.max.xiaoheihe.network.i.a().I() : com.max.xiaoheihe.network.i.a().U3()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new r(str));
    }

    public static Dialog F(Context context, AchieveEventObj achieveEventObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, achieveEventObj}, null, changeQuickRedirect, true, 49430, new Class[]{Context.class, AchieveEventObj.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        com.max.xiaoheihe.view.d dVarA = new com.max.xiaoheihe.view.d.a(context).a();
        dVarA.setContentView(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.dialog_achieve_event, (ViewGroup) null, false));
        TextView textView = (TextView) dVarA.findViewById(R.id.tv_positive_button);
        TextView textView2 = (TextView) dVarA.findViewById(R.id.tv_negative_button);
        TextView textView3 = (TextView) dVarA.findViewById(R.id.tv_title);
        TextView textView4 = (TextView) dVarA.findViewById(R.id.tv_mission_msg);
        ViewGroup viewGroup = (ViewGroup) dVarA.findViewById(R.id.vg_award_exp);
        ViewGroup viewGroup2 = (ViewGroup) dVarA.findViewById(R.id.vg_award_coin);
        TextView textView5 = (TextView) dVarA.findViewById(R.id.tv_desc);
        ViewGroup viewGroup3 = (ViewGroup) dVarA.findViewById(R.id.vg_icon);
        com.max.hbimage.b.K(achieveEventObj.getImg(), (ImageView) dVarA.findViewById(R.id.iv_icon));
        String str = String.format(com.max.xiaoheihe.utils.d.n0(R.string.milestone_dialog_title), achieveEventObj.getText());
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.e1(achieveEventObj.getText_color())), str.indexOf(achieveEventObj.getText()), str.indexOf(achieveEventObj.getText()) + achieveEventObj.getText().length(), 33);
        textView3.setText(spannableString);
        textView5.setText(achieveEventObj.getDesc());
        viewGroup2.setVisibility(8);
        viewGroup.setVisibility(8);
        textView4.setVisibility(8);
        viewGroup3.setBackgroundDrawable(com.max.hbutils.utils.q.o(context, R.color.dialog_bg_color, 28.0f));
        textView.setText("前往查看");
        textView.setOnClickListener(new g(context, achieveEventObj, dVarA));
        textView2.setOnClickListener(new h(dVarA));
        dVarA.show();
        return dVarA;
    }

    public static Dialog G(Context context, AchieveEventObj achieveEventObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, achieveEventObj}, null, changeQuickRedirect, true, 49427, new Class[]{Context.class, AchieveEventObj.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        com.max.xiaoheihe.view.d dVarA = new com.max.xiaoheihe.view.d.a(context).a();
        dVarA.setContentView(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.dialog_misson_event, (ViewGroup) null, false));
        TextView textView = (TextView) dVarA.findViewById(R.id.tv_positive_button);
        TextView textView2 = (TextView) dVarA.findViewById(R.id.tv_negative_button);
        TextView textView3 = (TextView) dVarA.findViewById(R.id.tv_mission_msg);
        ViewGroup viewGroup = (ViewGroup) dVarA.findViewById(R.id.vg_award_exp);
        TextView textView4 = (TextView) dVarA.findViewById(R.id.tv_award_exp);
        ViewGroup viewGroup2 = (ViewGroup) dVarA.findViewById(R.id.vg_award_coin);
        TextView textView5 = (TextView) dVarA.findViewById(R.id.tv_award_coin);
        com.max.hbimage.b.K(achieveEventObj.getImg(), (ImageView) dVarA.findViewById(R.id.iv_img));
        textView3.setText(achieveEventObj.getText());
        if (com.max.hbcommon.utils.c.u(achieveEventObj.getAward_coin())) {
            viewGroup2.setVisibility(8);
        } else {
            viewGroup2.setVisibility(0);
            textView5.setText(achieveEventObj.getAward_coin());
        }
        if (com.max.hbcommon.utils.c.u(achieveEventObj.getAward_exp())) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            textView4.setText(achieveEventObj.getAward_exp());
        }
        textView.setOnClickListener(new z(context, dVarA));
        textView2.setOnClickListener(new a(dVarA));
        dVarA.show();
        return dVarA;
    }

    public static Dialog H(Context context, SignInResultObj signInResultObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, signInResultObj}, null, changeQuickRedirect, true, 49426, new Class[]{Context.class, SignInResultObj.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        com.max.xiaoheihe.view.d dVarA = new com.max.xiaoheihe.view.d.a(context).a();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.dialog_sign_in, (ViewGroup) null, false);
        dVarA.setContentView(viewInflate);
        TextView textView = (TextView) dVarA.findViewById(R.id.tv_hcoin);
        GradientTextView gradientTextView = (GradientTextView) dVarA.findViewById(R.id.tv_member_hcoin);
        TextView textView2 = (TextView) dVarA.findViewById(R.id.tv_title);
        TextView textView3 = (TextView) dVarA.findViewById(R.id.tv_exp);
        ImageView imageView = (ImageView) dVarA.findViewById(R.id.iv_hcoin_up);
        ImageView imageView2 = (ImageView) dVarA.findViewById(R.id.iv_exp_up);
        TextView textView4 = (TextView) dVarA.findViewById(R.id.tv_confirm);
        TextView textView5 = (TextView) dVarA.findViewById(R.id.tv_streak);
        BannerViewPager bannerViewPager = (BannerViewPager) dVarA.findViewById(R.id.banner);
        TextView textView6 = (TextView) dVarA.findViewById(R.id.tv_notify_description);
        View viewFindViewById = dVarA.findViewById(R.id.ll_blank);
        viewInflate.findViewById(R.id.container);
        bb.d.d(textView, 2);
        bb.d.d(gradientTextView, 2);
        bb.d.d(textView3, 2);
        textView.setText("+" + signInResultObj.getSign_in_coin());
        imageView.setVisibility(signInResultObj.isPlus_hcoin() ? 0 : 8);
        imageView2.setVisibility(signInResultObj.isPlus_exp() ? 0 : 8);
        if (com.max.hbcommon.utils.c.u(signInResultObj.getSign_in_member_coin())) {
            gradientTextView.setVisibility(8);
        } else {
            gradientTextView.setVisibility(0);
            gradientTextView.setText("+" + signInResultObj.getSign_in_member_coin());
            gradientTextView.setColors(com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_start_color), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_end_color));
        }
        textView3.setText("+" + signInResultObj.getSign_in_exp());
        if (com.max.hbcommon.utils.c.u(signInResultObj.getDescription())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.max.hbutils.utils.n.q(signInResultObj.getSign_in_streak()) > 1 ? com.max.xiaoheihe.utils.d.n0(R.string.sign_in_streak_desc) : com.max.xiaoheihe.utils.d.n0(R.string.sign_in_streak_desc_single_day));
            sb2.append(" ");
            sb2.append(signInResultObj.getSign_in_streak());
            sb2.append(" 天");
            textView5.setText(sb2.toString());
            textView4.setOnClickListener(new y(dVarA));
        } else {
            textView2.setText(R.string.return_check_in_success);
            textView5.setText(signInResultObj.getDescription());
            textView4.setText("去做任务");
            textView4.setOnClickListener(new x(context, dVarA));
        }
        if (com.max.hbcommon.utils.c.u(signInResultObj.getNotify_description())) {
            textView6.setVisibility(8);
        } else {
            textView6.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(signInResultObj.getNotify_description());
            if (signInResultObj.isPlus_exp() || signInResultObj.isPlus_hcoin()) {
                Drawable drawableMutate = com.max.xiaoheihe.utils.d.X(R.drawable.common_arrow_up_filled2_24x24).getConstantState().newDrawable().mutate();
                drawableMutate.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color), PorterDuff.Mode.SRC_IN);
                drawableMutate.setBounds(0, 0, ViewUtils.f(context, 12.0f), ViewUtils.f(context, 12.0f));
                spannableStringBuilder.append("image", new com.max.hbcustomview.spans.b(drawableMutate, 2, ViewUtils.f(context, 2.0f), 0), 33);
            }
            textView6.setText(spannableStringBuilder);
        }
        textView4.setBackground(ViewUtils.w(ViewUtils.f(context, 5.0f), context.getColor(R.color.icon_gradient_dark_start_color), context.getColor(R.color.icon_gradient_dark_end_color), GradientDrawable.Orientation.LEFT_RIGHT));
        com.max.hbcommon.utils.b.g(bannerViewPager, signInResultObj.getAds_banner(), ViewUtils.f(context, 315.0f), 0.0f);
        if (bannerViewPager.getVisibility() == 0) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        Window window = dVarA.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.2f;
        window.setAttributes(attributes);
        dVarA.show();
        return dVarA;
    }

    static /* synthetic */ void h(Context context, View view, CoffeeDialogDataObj coffeeDialogDataObj) {
        if (PatchProxy.proxy(new Object[]{context, view, coffeeDialogDataObj}, null, changeQuickRedirect, true, 49447, new Class[]{Context.class, View.class, CoffeeDialogDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        v(context, view, coffeeDialogDataObj);
    }

    public static SpannableStringBuilder i(Context context, SpannableStringBuilder spannableStringBuilder, boolean z10, boolean z11) {
        Object[] objArr = {context, spannableStringBuilder, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49436, new Class[]{Context.class, SpannableStringBuilder.class, cls, cls}, SpannableStringBuilder.class);
        return patchProxyResultProxy.isSupported ? (SpannableStringBuilder) patchProxyResultProxy.result : j(context, spannableStringBuilder, z10, z11, com.max.hbcommon.utils.l.a(R.color.click_blue));
    }

    public static SpannableStringBuilder j(Context context, SpannableStringBuilder spannableStringBuilder, boolean z10, boolean z11, int i10) {
        Object[] objArr = {context, spannableStringBuilder, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49437, new Class[]{Context.class, SpannableStringBuilder.class, cls, cls, Integer.TYPE}, SpannableStringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableStringBuilder) patchProxyResultProxy.result;
        }
        String str = z11 ? "《隐私政策》" : "《用户协议》";
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new m(i10, z10, context, z11), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static void k(l0.h<Object> hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, 49424, new Class[]{l0.h.class}, Void.TYPE).isSupported) {
            return;
        }
    }

    public static TextView l(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 49435, new Class[]{Context.class}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = ViewUtils.f(context, 20.0f);
        marginLayoutParams.bottomMargin = ViewUtils.f(context, 20.0f);
        textView.setLayoutParams(marginLayoutParams);
        textView.setGravity(16);
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return textView;
    }

    public static void m() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49432, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        if (activityA instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activityA;
            if (baseActivity.isActive()) {
                baseActivity.runOnUiThread(new j(baseActivity));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Context context, WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{context, webProtocolObj}, null, changeQuickRedirect, true, 49441, new Class[]{Context.class, WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        u(context, webProtocolObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Dialog dialog, View view) {
        if (PatchProxy.proxy(new Object[]{dialog, view}, null, changeQuickRedirect, true, 49446, new Class[]{Dialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Dialog dialog, View view) {
        if (PatchProxy.proxy(new Object[]{dialog, view}, null, changeQuickRedirect, true, 49445, new Class[]{Dialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(CheckBox checkBox, View view) {
        if (PatchProxy.proxy(new Object[]{checkBox, view}, null, changeQuickRedirect, true, 49444, new Class[]{CheckBox.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        checkBox.setChecked(!checkBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Dialog dialog, Context context, CheckBox checkBox, LayoutInflater layoutInflater, View view) {
        if (PatchProxy.proxy(new Object[]{dialog, context, checkBox, layoutInflater, view}, null, changeQuickRedirect, true, 49443, new Class[]{Dialog.class, Context.class, CheckBox.class, LayoutInflater.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        dialog.dismiss();
        if (com.max.xiaoheihe.utils.d.N0(context) || !checkBox.isChecked()) {
            return;
        }
        com.max.xiaoheihe.utils.v.l(context, layoutInflater);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(TextView textView, Dialog dialog, Context context, CheckBox checkBox, LayoutInflater layoutInflater, View view) {
        if (PatchProxy.proxy(new Object[]{textView, dialog, context, checkBox, layoutInflater, view}, null, changeQuickRedirect, true, 49442, new Class[]{TextView.class, Dialog.class, Context.class, CheckBox.class, LayoutInflater.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.setText("已领取");
        dialog.dismiss();
        if (!com.max.xiaoheihe.utils.d.N0(context) && checkBox.isChecked()) {
            com.max.xiaoheihe.utils.v.l(context, layoutInflater);
        }
        k(new u());
    }

    public static void u(Context context, WebProtocolObj webProtocolObj) {
        int i10;
        ViewGroup viewGroup;
        BaseBottomButton leftButton;
        BaseBottomButton rightbutton;
        Context contextA = context;
        if (PatchProxy.proxy(new Object[]{contextA, webProtocolObj}, null, changeQuickRedirect, true, 49439, new Class[]{Context.class, WebProtocolObj.class}, Void.TYPE).isSupported || webProtocolObj == null) {
            return;
        }
        if (!(contextA instanceof Activity)) {
            contextA = com.max.hbutils.utils.e.b().a();
        }
        if (!(contextA instanceof Activity) || ((Activity) contextA).isFinishing()) {
            return;
        }
        View viewInflate = ((LayoutInflater) contextA.getSystemService("layout_inflater")).inflate(R.layout.dialog_custom_bottom, (ViewGroup) null, false);
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i(contextA, viewInflate);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_top_icon);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_top_icon);
        HBUiKitView hBUiKitView = (HBUiKitView) viewInflate.findViewById(R.id.v_hb_ui);
        RadiusCardView radiusCardView = (RadiusCardView) viewInflate.findViewById(R.id.card_content);
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.v_bottom_button);
        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate.findViewById(R.id.vg_scroll_kit);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_close);
        iVar.g(nestedScrollView);
        String strValueOf = webProtocolObj.valueOf("background_color");
        String strValueOf2 = webProtocolObj.valueOf("top_icon");
        String strValueOf3 = webProtocolObj.valueOf(qb.a.f138641d);
        String strValueOf4 = webProtocolObj.valueOf("confirm_protocol");
        String strValueOf5 = webProtocolObj.valueOf("cancel");
        String strValueOf6 = webProtocolObj.valueOf("cancel_protocol");
        String strValueOf7 = webProtocolObj.valueOf("content_ui_json");
        String strValueOf8 = webProtocolObj.valueOf("confirm_btn_bg_color");
        String strValueOf9 = webProtocolObj.valueOf("confirm_btn_text_color");
        String strValueOf10 = webProtocolObj.valueOf("cancel_btn_bg_color");
        String strValueOf11 = webProtocolObj.valueOf("cancel_btn_text_color");
        String strValueOf12 = webProtocolObj.valueOf("top_icon_inset");
        String strValueOf13 = webProtocolObj.valueOf("show_close_btn");
        String strValueOf14 = webProtocolObj.valueOf("disable_drag_close");
        String strValueOf15 = webProtocolObj.valueOf("disable_bg_tap_close");
        int iQ = com.max.hbutils.utils.n.q(webProtocolObj.valueOf("priority_on_conflict"));
        int iH = !com.max.hbcommon.utils.c.u(strValueOf) ? com.max.xiaoheihe.utils.d.H(contextA, strValueOf) : com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color);
        radiusCardView.setBackground(com.max.hbutils.utils.q.F(contextA, iH, 8.0f));
        bottomButtonLeftItemView.setBackgroundColor(iH);
        if (com.max.hbcommon.utils.c.u(strValueOf3)) {
            bottomButtonLeftItemView.setShowRightButton(false);
        } else {
            bottomButtonLeftItemView.setRightButtonEnabled(true);
            bottomButtonLeftItemView.setRightText(strValueOf3);
            bottomButtonLeftItemView.setRightClickListener(new n(iVar, contextA, strValueOf4));
            if (!com.max.hbcommon.utils.c.u(strValueOf8) && !com.max.hbcommon.utils.c.u(strValueOf9) && (rightbutton = bottomButtonLeftItemView.getRightbutton()) != null) {
                rightbutton.f67214l.setBackgroundColor(com.max.hbutils.utils.a.g(strValueOf8));
                rightbutton.f67213k.setTextColor(com.max.hbutils.utils.a.g(strValueOf9));
            }
        }
        if (com.max.hbcommon.utils.c.u(strValueOf5)) {
            i10 = 0;
            bottomButtonLeftItemView.setShowLeftButton(false);
        } else {
            bottomButtonLeftItemView.setLeftButtonEnabled(true);
            bottomButtonLeftItemView.setLeftText(strValueOf5);
            bottomButtonLeftItemView.setLeftClickListener(new o(iVar, contextA, strValueOf6));
            if (!com.max.hbcommon.utils.c.u(strValueOf10) && !com.max.hbcommon.utils.c.u(strValueOf11) && (leftButton = bottomButtonLeftItemView.getLeftButton()) != null) {
                leftButton.f67214l.setBackgroundColor(com.max.hbutils.utils.a.g(strValueOf10));
                leftButton.f67213k.setTextColor(com.max.hbutils.utils.a.g(strValueOf11));
            }
            i10 = 0;
        }
        hBUiKitView.setDataToCreate((UiKitViewObj) com.max.hbutils.utils.k.a(strValueOf7, UiKitViewObj.class));
        if (com.max.hbcommon.utils.c.u(strValueOf2)) {
            viewGroup = viewGroup2;
            viewGroup.setVisibility(8);
        } else {
            viewGroup = viewGroup2;
            viewGroup.setVisibility(i10);
            com.max.hbimage.b.H(strValueOf2, imageView);
        }
        int iF = ViewUtils.f(contextA, com.max.hbutils.utils.n.q(strValueOf12));
        viewGroup.setPadding(iF, iF, iF, iF);
        iVar.d(!com.max.hbcommon.utils.c.x(strValueOf15));
        r24.setVisibility(com.max.hbcommon.utils.c.x(strValueOf13) ? i10 : 8);
        imageView2.setOnClickListener(new p(iVar));
        if (iQ <= 0) {
            iVar.show();
        } else {
            com.max.xiaoheihe.utils.viewprioritymanager.a aVar = com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a;
            if (aVar.c(iQ)) {
                aVar.a(iQ);
                iVar.setOnDismissListener(new q(iQ));
                iVar.show();
            }
        }
        iVar.f(!com.max.hbcommon.utils.c.x(strValueOf14));
    }

    private static void v(Context context, View view, CoffeeDialogDataObj coffeeDialogDataObj) {
        if (PatchProxy.proxy(new Object[]{context, view, coffeeDialogDataObj}, null, changeQuickRedirect, true, 49434, new Class[]{Context.class, View.class, CoffeeDialogDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        if (activityA instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activityA;
            if (baseActivity.isActive()) {
                baseActivity.runOnUiThread(new RunnableC0907l(baseActivity, view, coffeeDialogDataObj, context));
            }
        }
    }

    public static void w(CoffeeDialogDataObj coffeeDialogDataObj) {
        Dialog dialogU0;
        if (PatchProxy.proxy(new Object[]{coffeeDialogDataObj}, null, changeQuickRedirect, true, 49433, new Class[]{CoffeeDialogDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activityA = com.max.hbutils.utils.e.b().a();
        if (activityA instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activityA;
            if (baseActivity.isActive() && (dialogU0 = baseActivity.U0()) != null && dialogU0.isShowing()) {
                v(baseActivity, dialogU0.getWindow().getDecorView(), coffeeDialogDataObj);
            }
        }
    }

    public static void x(PushStateObj pushStateObj, String str, CheckBox checkBox, Context context, LayoutInflater layoutInflater) {
        if (PatchProxy.proxy(new Object[]{pushStateObj, str, checkBox, context, layoutInflater}, null, changeQuickRedirect, true, 49425, new Class[]{PushStateObj.class, String.class, CheckBox.class, Context.class, LayoutInflater.class}, Void.TYPE).isSupported) {
            return;
        }
    }

    public static void y(FragmentActivity fragmentActivity, UserMedalV2Obj userMedalV2Obj) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, userMedalV2Obj}, null, changeQuickRedirect, true, 49429, new Class[]{FragmentActivity.class, UserMedalV2Obj.class}, Void.TYPE).isSupported) {
            return;
        }
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d(fragmentActivity));
        shareImageDialogFragmentX4.D4(new e(fragmentActivity, userMedalV2Obj));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("medal_id", userMedalV2Obj.getMedal_id());
        shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b(com.max.hbshare.c.f72566v, new f(), jsonObject));
        shareImageDialogFragmentX4.show(fragmentActivity.getSupportFragmentManager(), PostPageFactory.M);
    }

    public static void z(FragmentActivity fragmentActivity, UserMedalV2Obj userMedalV2Obj) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, userMedalV2Obj}, null, changeQuickRedirect, true, 49428, new Class[]{FragmentActivity.class, UserMedalV2Obj.class}, Void.TYPE).isSupported || fragmentActivity.isFinishing()) {
            return;
        }
        com.max.xiaoheihe.utils.viewprioritymanager.a aVar = com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a;
        ViewPriority viewPriority = ViewPriority.TOP;
        if (aVar.c(viewPriority.getValue())) {
            MedalLevelObj currentLevel = userMedalV2Obj.getCurrentLevel();
            com.max.hbcommon.component.bottomsheet.a aVar2 = new com.max.hbcommon.component.bottomsheet.a();
            currentLevel.setAchieved(1);
            SpannableString spannableString = new SpannableString(currentLevel.getDesc());
            if (!com.max.hbcommon.utils.c.u(currentLevel.getHighlight_text()) && !com.max.hbcommon.utils.c.u(currentLevel.getDesc()) && currentLevel.getDesc().contains(currentLevel.getHighlight_text())) {
                int iIndexOf = currentLevel.getDesc().indexOf(currentLevel.getHighlight_text());
                spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), iIndexOf, currentLevel.getHighlight_text().length() + iIndexOf, 17);
            }
            aVar2.o(currentLevel.getImg()).k(true).x(false).z("恭喜获得「" + currentLevel.getName() + "」成就").l(spannableString).v("分享", true, new c(fragmentActivity, userMedalV2Obj)).p("查看成就进度", true, new b(fragmentActivity));
            com.max.hbcommon.component.bottomsheet.d dVarB = aVar2.b();
            dVarB.M3(fragmentActivity.getSupportFragmentManager(), "achieve_event");
            aVar.a(viewPriority.getValue());
            dVarB.y4(new d());
        }
    }
}
