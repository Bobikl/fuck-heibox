package com.max.xiaoheihe.module.account;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonObject;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: UserHomeFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@com.max.hbcommon.analytics.m(path = lb.d.U1)
@androidx.compose.runtime.internal.o(parameters = 0)
@com.max.hbcommon.base.hblifeevent.fragment.b(lifeEvents = {pf.a.class})
public final class q0 extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f79171d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79172e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f79173f = "is_gesture";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private String f79174b = "-1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f79175c = "-1";

    /* JADX INFO: compiled from: UserHomeFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final q0 a(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24468, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE}, q0.class);
            if (patchProxyResultProxy.isSupported) {
                return (q0) patchProxyResultProxy.result;
            }
            q0 q0Var = new q0();
            Bundle bundle = new Bundle();
            bundle.putString(MeHomeActivity.L, str);
            bundle.putString(MeHomeActivity.M, str2);
            bundle.putString("h_src", str3);
            bundle.putString(MeHomeActivity.O, str4);
            bundle.putBoolean(q0.f79173f, z10);
            q0Var.setArguments(bundle);
            return q0Var;
        }
    }

    private final void L3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24462, new Class[0], Void.TYPE).isSupported && ((MehomefragmentV2) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            Bundle arguments = getArguments();
            int i10 = arguments != null ? arguments.getInt("page_index", 0) : 0;
            if (i10 == 0) {
                Bundle arguments2 = getArguments();
                i10 = arguments2 != null ? (int) arguments2.getDouble("page_index", 0.0d) : 0;
            }
            int i11 = i10;
            String str = this.f79174b;
            String str2 = this.f79175c;
            Bundle arguments3 = getArguments();
            MehomefragmentV2 mehomefragmentV2Q5 = MehomefragmentV2.Q5(str, str2, null, null, i11, arguments3 != null ? arguments3.getBoolean(f79173f) : false);
            kotlin.jvm.internal.f0.o(mehomefragmentV2Q5, "newInstance(mHeyboxId, m…an(ARG_GESTURE) ?: false)");
            getChildFragmentManager().u().b(R.id.fragment_container, mehomefragmentV2Q5).n();
        }
    }

    public final void M3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24463, new Class[0], Void.TYPE).isSupported && isActive()) {
            Fragment fragmentR0 = getChildFragmentManager().r0(R.id.fragment_container);
            MehomefragmentV2 mehomefragmentV2 = fragmentR0 instanceof MehomefragmentV2 ? (MehomefragmentV2) fragmentR0 : null;
            if (mehomefragmentV2 != null) {
                mehomefragmentV2.c6();
            }
        }
    }

    public final void N3(@dl.e String str, @dl.e String str2) {
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    public boolean d2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24466, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(f79173f);
        }
        return false;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24464, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userid", this.f79174b);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(MeHomeActivity.O);
            if (string != null) {
                jsonObject.addProperty(MeHomeActivity.O, string);
            }
            String string2 = arguments.getString("h_src");
            if (string2 != null) {
                jsonObject.addProperty("h_src", string2);
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null && arguments2.getBoolean(f79173f)) {
                z10 = true;
            }
            jsonObject.addProperty(f79173f, z10 ? "1" : "0");
        }
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPagePath() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24467, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean(f79173f)) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return super.getPagePath();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24461, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        setContentView(R.layout.layout_sample_fragment_container);
        this.mContext.getWindow().setFormat(-3);
        com.max.hbutils.utils.t.h0(this.mContext.getWindow());
        com.max.hbutils.utils.t.M(this.mContext, true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(MeHomeActivity.L);
            this.f79174b = string;
            if (string == null) {
                String string2 = arguments.getString("userid");
                this.f79174b = string2;
                if (string2 == null) {
                    this.f79174b = arguments.getString("user_id");
                }
            }
            String string3 = arguments.getString(MeHomeActivity.M);
            this.f79175c = string3;
            String str = this.f79174b;
            if (str == null) {
                str = "-1";
            }
            this.f79174b = str;
            if (string3 == null) {
                string3 = "-1";
            }
            this.f79175c = string3;
        }
        L3();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    public boolean o3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24465, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean(f79173f);
        }
        return false;
    }
}
