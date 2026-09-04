package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSPrivacySettingsObj;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ea;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: MomentsPrivacyFragment.java */
/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"NotifyDataSetChanged"})
public class k0 extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RecyclerView f78966b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<KeyDescObj> f78968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CardView f78969e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<KeyDescObj> f78967c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f78970f = false;

    /* JADX INFO: compiled from: MomentsPrivacyFragment.java */
    public class a extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(KeyDescObj keyDescObj, CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23775, new Class[]{KeyDescObj.class, CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            keyDescObj.setValue(z10 ? "1" : "0");
            if (k0.this.f78968d != null) {
                k0.this.f78968d.notifyDataSetChanged();
            }
            k0.M3(k0.this, keyDescObj);
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, final KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 23773, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (keyDescObj == null) {
                com.max.heybox.hblog.g.G("[MomentsPrivacyFragment][onBindViewHolder] invalid data: " + keyDescObj);
                return;
            }
            SettingItemView settingItemView = (SettingItemView) eVar.i(R.id.privacy_siv);
            settingItemView.setTitle(keyDescObj.getName());
            settingItemView.setChecked("1".equals(keyDescObj.getValue()), false);
            settingItemView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.max.xiaoheihe.module.account.j0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    this.f78964b.n(keyDescObj, compoundButton, z10);
                }
            });
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 23774, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: MomentsPrivacyFragment.java */
    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f78972b;

        b(KeyDescObj keyDescObj) {
            this.f78972b = keyDescObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23776, new Class[]{Throwable.class}, Void.TYPE).isSupported && k0.this.isActive()) {
                super.onError(th2);
                if (Objects.equals(this.f78972b.getValue(), "1")) {
                    this.f78972b.setValue("0");
                } else {
                    this.f78972b.setValue("1");
                }
                if (k0.this.f78968d != null) {
                    k0.this.f78968d.notifyDataSetChanged();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23777, new Class[]{Result.class}, Void.TYPE).isSupported && k0.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.d(k0.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.d(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23778, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: MomentsPrivacyFragment.java */
    public class c extends com.max.hbcommon.network.d<Result<BBSPrivacySettingsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23779, new Class[]{Throwable.class}, Void.TYPE).isSupported && k0.this.isActive()) {
                super.onError(th2);
                k0.N3(k0.this);
            }
        }

        public void onNext(Result<BBSPrivacySettingsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23780, new Class[]{Result.class}, Void.TYPE).isSupported || !k0.this.isActive() || result == null || result.getResult() == null) {
                return;
            }
            if (k0.this.f78970f) {
                k0.P3(k0.this, result.getResult().getFilter_options());
            } else {
                k0.P3(k0.this, result.getResult().getPrivacy_options());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23781, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSPrivacySettingsObj>) obj);
        }
    }

    static /* synthetic */ void M3(k0 k0Var, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{k0Var, keyDescObj}, null, changeQuickRedirect, true, 23770, new Class[]{k0.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        k0Var.U3(keyDescObj);
    }

    static /* synthetic */ void N3(k0 k0Var) {
        if (PatchProxy.proxy(new Object[]{k0Var}, null, changeQuickRedirect, true, 23771, new Class[]{k0.class}, Void.TYPE).isSupported) {
            return;
        }
        k0Var.showError();
    }

    static /* synthetic */ void P3(k0 k0Var, List list) {
        if (PatchProxy.proxy(new Object[]{k0Var, list}, null, changeQuickRedirect, true, 23772, new Class[]{k0.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        k0Var.T3(list);
    }

    @SuppressLint({"AutoDispose"})
    private void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23767, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().E7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23764, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78966b.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f78966b.addItemDecoration(new com.max.hbcommon.base.adapter.i(this.mContext));
        a aVar = new a(this.mContext, this.f78967c, R.layout.item_privacy_setting);
        this.f78968d = aVar;
        this.f78966b.setAdapter(aVar);
    }

    public static k0 S3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23761, new Class[]{Boolean.TYPE}, k0.class);
        if (patchProxyResultProxy.isSupported) {
            return (k0) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_moment_content_filter", z10);
        k0 k0Var = new k0();
        k0Var.setArguments(bundle);
        return k0Var;
    }

    private void T3(List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 23769, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null && !list.isEmpty()) {
            this.f78967c.clear();
            this.f78967c.addAll(list);
            this.f78968d.notifyDataSetChanged();
        } else {
            CardView cardView = this.f78969e;
            if (cardView != null) {
                cardView.setVisibility(8);
            }
        }
    }

    private void U3(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 23765, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        for (KeyDescObj keyDescObj2 : this.f78967c) {
            jsonObject.addProperty(keyDescObj2.getKey(), Integer.valueOf(com.max.hbutils.utils.n.q(keyDescObj2.getValue())));
        }
        if (this.f78970f) {
            V3(null, jsonObject.toString(), keyDescObj);
        } else {
            V3(jsonObject.toString(), null, keyDescObj);
        }
    }

    @SuppressLint({"AutoDispose"})
    private void V3(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{str, str2, keyDescObj}, this, changeQuickRedirect, false, 23766, new Class[]{String.class, String.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q0(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(keyDescObj)));
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23763, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ea eaVarD = ea.d(this.mInflater, ((com.max.hbcommon.base.d) this).mContainer, false);
        setContentView(eaVarD);
        this.f78966b = eaVarD.f110105b;
        this.f78969e = eaVarD.f110106c;
        if (this.f78970f) {
            eaVarD.f110107d.setText(this.mContext.getString(R.string.moment_content_prefer_settings_desc));
        } else {
            eaVarD.f110107d.setText(this.mContext.getString(R.string.moments_privacy_settings_desc));
        }
        R3();
        showLoading();
        Q3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 23762, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f78970f = arguments.getBoolean("show_moment_content_filter", false);
        }
        super.onCreate(bundle);
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23768, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        Q3();
    }
}
