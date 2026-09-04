package com.max.xiaoheihe.module.mall;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.module.magic.MagicUtil;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;

/* JADX INFO: loaded from: classes11.dex */
public class AddFreeLicenseFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f89387d = "type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f89388e = "url";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f89389f = "getSelectedPackageIds()";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f89390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f89391c;

    @BindView(R.id.tv_confirm)
    TextView mConfirmTextView;

    @BindView(R.id.vg_confirm)
    View mConfirmView;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.AddFreeLicenseFragment$a$a, reason: collision with other inner class name */
        public class C0817a implements ValueCallback<String> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.AddFreeLicenseFragment$a$a$a, reason: collision with other inner class name */
            public class C0818a implements yh.l<SteamWalletJsObj, b2> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f89394b;

                C0818a(String str) {
                    this.f89394b = str;
                }

                public b2 a(SteamWalletJsObj steamWalletJsObj) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 39786, new Class[]{SteamWalletJsObj.class}, b2.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (b2) patchProxyResultProxy.result;
                    }
                    AddFreeLicenseFragment addFreeLicenseFragment = AddFreeLicenseFragment.this;
                    addFreeLicenseFragment.startActivity(SteamStoreAddFreeGamesActivity.p2(((com.max.hbcommon.base.d) addFreeLicenseFragment).mContext, this.f89394b, steamWalletJsObj));
                    return null;
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(SteamWalletJsObj steamWalletJsObj) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 39787, new Class[]{Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(steamWalletJsObj);
                }
            }

            C0817a() {
            }

            public void a(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39784, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                String strW = l0.w(str);
                if (com.max.hbcommon.utils.c.u(strW)) {
                    return;
                }
                if (!"addfreelicense_epic".equals(AddFreeLicenseFragment.this.f89390b)) {
                    MagicUtil.f89378a.d(((com.max.hbcommon.base.d) AddFreeLicenseFragment.this).mContext, new C0818a(strW));
                } else {
                    AddFreeLicenseFragment addFreeLicenseFragment = AddFreeLicenseFragment.this;
                    addFreeLicenseFragment.startActivity(EpicAddFreeGamesActivity.E2(((com.max.hbcommon.base.d) addFreeLicenseFragment).mContext, strW));
                }
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39785, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a(str);
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebviewFragment webviewFragment;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39783, new Class[]{View.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) AddFreeLicenseFragment.this.getChildFragmentManager().r0(R.id.fragment_container)) == null) {
                return;
            }
            webviewFragment.H6(AddFreeLicenseFragment.f89389f, new C0817a());
        }
    }

    public static AddFreeLicenseFragment P3(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 39779, new Class[]{String.class, String.class}, AddFreeLicenseFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (AddFreeLicenseFragment) patchProxyResultProxy.result;
        }
        AddFreeLicenseFragment addFreeLicenseFragment = new AddFreeLicenseFragment();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putString("url", str2);
        addFreeLicenseFragment.setArguments(bundle);
        return addFreeLicenseFragment;
    }

    public void Q3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39782, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mConfirmView.getLayoutParams();
        marginLayoutParams.bottomMargin = i10;
        this.mConfirmView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39781, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (((WebviewFragment) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            getChildFragmentManager().u().b(R.id.fragment_container, WebviewFragment.u7(this.f89391c)).m();
        }
        this.mConfirmTextView.setOnClickListener(new a());
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39780, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_steam_store_add_free_license);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f89390b = getArguments().getString("type");
            this.f89391c = getArguments().getString("url");
        }
        this.mConfirmTextView.setText(String.format(getString(R.string.add_free_games_format), "addfreelicense_epic".equals(this.f89390b) ? getString(R.string.epic) : getString(R.string.steam)));
        if (this.mIsFirst) {
            showLoading();
        }
    }
}
