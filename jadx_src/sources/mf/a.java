package mf;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.c;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.p50;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: FullScreenCustomFragmentDialog.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a extends c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final C1204a f131902g = new C1204a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f131903h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    public static final String f131904i = "FullScreenCustomFragmentDialog";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final String f131905j = "uikit";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p50 f131906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private UiKitViewObj f131907f;

    /* JADX INFO: renamed from: mf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FullScreenCustomFragmentDialog.kt */
    public static final class C1204a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C1204a() {
        }

        public /* synthetic */ C1204a(u uVar) {
            this();
        }

        @d
        @m
        public final a a(@d UiKitViewObj data) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 31432, new Class[]{UiKitViewObj.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(data, "data");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable(a.f131905j, data);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    private final void N3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31430, new Class[0], Void.TYPE).isSupported || this.f131907f == null) {
            return;
        }
        p50 p50Var = this.f131906e;
        if (p50Var == null) {
            f0.S("binding");
            p50Var = null;
        }
        p50Var.f114447b.setDataToCreate(this.f131907f);
    }

    @d
    @m
    public static final a O3(@d UiKitViewObj uiKitViewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitViewObj}, null, changeQuickRedirect, true, 31431, new Class[]{UiKitViewObj.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : f131902g.a(uiKitViewObj);
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 31427, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.NoBackgroundFullScreenDialog);
    }

    @Override // androidx.fragment.app.Fragment
    @e
    public View onCreateView(@d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 31428, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        p50 p50VarC = p50.c(inflater);
        f0.o(p50VarC, "inflate(inflater)");
        this.f131906e = p50VarC;
        if (p50VarC == null) {
            f0.S("binding");
            p50VarC = null;
        }
        return p50VarC.b();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@d View view, @e Bundle bundle) {
        Window window;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 31429, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        WindowManager.LayoutParams attributes = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.windowAnimations = R.style.HeyboxToastStyle;
        }
        Bundle arguments = getArguments();
        UiKitViewObj uiKitViewObj = (UiKitViewObj) (arguments != null ? arguments.getSerializable(f131905j) : null);
        this.f131907f = uiKitViewObj;
        if (uiKitViewObj != null) {
            N3();
        }
    }
}
