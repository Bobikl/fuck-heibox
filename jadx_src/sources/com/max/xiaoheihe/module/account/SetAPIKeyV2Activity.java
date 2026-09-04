package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.steaminfo.SteamApiKeySettingObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamApiStateObj;
import com.max.xiaoheihe.module.trade.SetAPIKeyActivity;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x1;
import kotlin.b2;

/* JADX INFO: compiled from: SetAPIKeyV2Activity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(path = {lb.d.F3})
public final class SetAPIKeyV2Activity extends BaseActivity {
    public static final int P = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private x1 L;

    @dl.e
    private LoadingDialog M;

    @dl.e
    private SteamApiKeySettingObj N;

    @dl.e
    private String O;

    /* JADX INFO: compiled from: SetAPIKeyV2Activity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<SteamApiKeySettingObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24003, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SetAPIKeyV2Activity.this.isActive()) {
                super.onError(e10);
                SetAPIKeyV2Activity.V1(SetAPIKeyV2Activity.this);
            }
        }

        public void onNext(@dl.d Result<SteamApiKeySettingObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24004, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SetAPIKeyV2Activity.this.isActive()) {
                SetAPIKeyV2Activity.T1(SetAPIKeyV2Activity.this);
                SetAPIKeyV2Activity setAPIKeyV2Activity = SetAPIKeyV2Activity.this;
                SteamApiKeySettingObj result2 = result.getResult();
                x1 x1Var = null;
                if (result2 != null) {
                    SetAPIKeyV2Activity setAPIKeyV2Activity2 = SetAPIKeyV2Activity.this;
                    x1 x1Var2 = setAPIKeyV2Activity2.L;
                    if (x1Var2 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        x1Var2 = null;
                    }
                    x1Var2.f117344f.setText(result2.getTitle());
                    x1 x1Var3 = setAPIKeyV2Activity2.L;
                    if (x1Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        x1Var3 = null;
                    }
                    x1Var3.f117343e.setText(result2.getDesc());
                    x1 x1Var4 = setAPIKeyV2Activity2.L;
                    if (x1Var4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        x1Var4 = null;
                    }
                    x1Var4.f117342d.setText(result2.getApi_key());
                    x1 x1Var5 = setAPIKeyV2Activity2.L;
                    if (x1Var5 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        x1Var = x1Var5;
                    }
                    x1Var.f117345g.setDataToCreate(result2.getBottom_prompt());
                } else {
                    result2 = null;
                }
                setAPIKeyV2Activity.N = result2;
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24005, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamApiKeySettingObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SetAPIKeyV2Activity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24009, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            x1 x1Var = SetAPIKeyV2Activity.this.L;
            if (x1Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                x1Var = null;
            }
            EditText editText = x1Var.f117342d;
            SetAPIKeyV2Activity setAPIKeyV2Activity = SetAPIKeyV2Activity.this;
            if (com.max.hbcommon.utils.c.u(editText.getText().toString())) {
                com.max.hbutils.utils.c.f("请输入您的 API KEY");
            } else {
                SetAPIKeyV2Activity.W1(setAPIKeyV2Activity);
                setAPIKeyV2Activity.a2(editText.getText().toString());
            }
        }
    }

    /* JADX INFO: compiled from: SetAPIKeyV2Activity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<SteamApiStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24010, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SetAPIKeyV2Activity.this.isActive()) {
                SetAPIKeyV2Activity.Q1(SetAPIKeyV2Activity.this);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<SteamApiStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24011, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SetAPIKeyV2Activity.this.isActive()) {
                super.onNext(result);
                SetAPIKeyV2Activity.Q1(SetAPIKeyV2Activity.this);
                SetAPIKeyV2Activity.this.setResult(-1);
                SetAPIKeyV2Activity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24012, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamApiStateObj>) obj);
        }
    }

    public static final /* synthetic */ void Q1(SetAPIKeyV2Activity setAPIKeyV2Activity) {
        if (PatchProxy.proxy(new Object[]{setAPIKeyV2Activity}, null, changeQuickRedirect, true, 23999, new Class[]{SetAPIKeyV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        setAPIKeyV2Activity.Y1();
    }

    public static final /* synthetic */ void T1(SetAPIKeyV2Activity setAPIKeyV2Activity) {
        if (PatchProxy.proxy(new Object[]{setAPIKeyV2Activity}, null, changeQuickRedirect, true, 24001, new Class[]{SetAPIKeyV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        setAPIKeyV2Activity.x1();
    }

    public static final /* synthetic */ void V1(SetAPIKeyV2Activity setAPIKeyV2Activity) {
        if (PatchProxy.proxy(new Object[]{setAPIKeyV2Activity}, null, changeQuickRedirect, true, 24000, new Class[]{SetAPIKeyV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        setAPIKeyV2Activity.C1();
    }

    public static final /* synthetic */ void W1(SetAPIKeyV2Activity setAPIKeyV2Activity) {
        if (PatchProxy.proxy(new Object[]{setAPIKeyV2Activity}, null, changeQuickRedirect, true, 24002, new Class[]{SetAPIKeyV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        setAPIKeyV2Activity.showLoadingDialog();
    }

    @SuppressLint({"AutoDispose"})
    private final void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23997, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().S2().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23994, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.M;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        this.M = null;
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23992, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("设置API Key");
        x1 x1Var = this.L;
        x1 x1Var2 = null;
        if (x1Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            x1Var = null;
        }
        com.max.xiaoheihe.accelworld.l.u(x1Var.f117346h, R.color.divider_secondary_2_color, 8.0f, R.color.divider_secondary_1_color, 0.5f);
        x1 x1Var3 = this.L;
        if (x1Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            x1Var3 = null;
        }
        com.max.xiaoheihe.accelworld.l.u(x1Var3.f117342d, R.color.background_layer_2_color, 3.0f, R.color.text_primary_1_color_alpha10, 0.5f);
        x1 x1Var4 = this.L;
        if (x1Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            x1Var4 = null;
        }
        TextView textView = x1Var4.f117340b;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, ViewUtils.i(ViewUtils.f(this.f66601b, 3.0f), textView.getContext().getResources().getColor(R.color.dialog_btn_black_color_alpha80), textView.getContext().getResources().getColor(R.color.text_primary_1_color_alpha80)));
        stateListDrawable.addState(new int[0], ViewUtils.i(ViewUtils.f(this.f66601b, 3.0f), textView.getContext().getResources().getColor(R.color.dialog_btn_black_color), textView.getContext().getResources().getColor(R.color.text_primary_1_color)));
        textView.setBackground(stateListDrawable);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.SetAPIKeyV2Activity$initView$3$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final SteamApiKeySettingObj steamApiKeySettingObj;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24006, new Class[]{View.class}, Void.TYPE).isSupported || (steamApiKeySettingObj = this.f78300b.N) == null) {
                    return;
                }
                final SetAPIKeyV2Activity setAPIKeyV2Activity = this.f78300b;
                Activity mContext = ((BaseActivity) setAPIKeyV2Activity).f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                TradeInfoUtilKt.b0(mContext, false, com.max.xiaoheihe.utils.l0.f95686a, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.account.SetAPIKeyV2Activity$initView$3$1$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24008, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24007, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        SetAPIKeyV2Activity setAPIKeyV2Activity2 = setAPIKeyV2Activity;
                        setAPIKeyV2Activity2.startActivityForResult(AutoGetApiKeyActivity.P.c(((BaseActivity) setAPIKeyV2Activity2).f66601b, steamApiKeySettingObj), SetAPIKeyActivity.T.b());
                    }
                }, 8, null);
            }
        });
        x1 x1Var5 = this.L;
        if (x1Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            x1Var2 = x1Var5;
        }
        x1Var2.f117341c.setOnClickListener(new b());
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23993, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.M == null) {
            Activity mContext = this.f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            this.M = new LoadingDialog(mContext, "");
        }
        LoadingDialog loadingDialog = this.M;
        if (loadingDialog != null) {
            loadingDialog.r();
        }
    }

    @SuppressLint({"AutoDispose"})
    public final void a2(@dl.d String api_key) {
        if (PatchProxy.proxy(new Object[]{api_key}, this, changeQuickRedirect, false, 23996, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(api_key, "api_key");
        com.max.xiaoheihe.module.account.mine.l lVar = com.max.xiaoheihe.module.account.mine.l.f79078a;
        io.reactivex.disposables.a aVarV0 = V0();
        kotlin.jvm.internal.f0.o(aVarV0, "getCompositeDisposable()");
        lVar.e(aVarV0, api_key, "0", new c());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23991, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        x1 x1VarC = x1.c(this.f66602c);
        kotlin.jvm.internal.f0.o(x1VarC, "inflate(mInflater)");
        this.L = x1VarC;
        if (x1VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            x1VarC = null;
        }
        setContentView(x1VarC.b());
        Z1();
        E1();
        X1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23998, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == SetAPIKeyActivity.T.b() && i11 == -1 && intent != null) {
            this.O = intent.getStringExtra(AutoGetApiKeyActivity.P.a());
            x1 x1Var = this.L;
            if (x1Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                x1Var = null;
            }
            EditText editText = x1Var.f117342d;
            editText.setText(this.O);
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23995, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        Y1();
    }
}
