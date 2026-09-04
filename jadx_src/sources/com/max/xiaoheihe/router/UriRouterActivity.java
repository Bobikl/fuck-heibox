package com.max.xiaoheihe.router;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.base.mvvm.BaseActivity;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.router.core.i;
import dl.d;
import dl.e;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: UriRouterActivity.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class UriRouterActivity extends BaseActivity<BaseViewModel> {
    public static final int D = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final Handler C = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: UriRouterActivity.kt */
    public static final class a implements com.sankuai.waimai.router.core.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.sankuai.waimai.router.core.d
        public void onError(@d i request, int i10) {
            if (PatchProxy.proxy(new Object[]{request, new Integer(i10)}, this, changeQuickRedirect, false, 48107, new Class[]{i.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(request, "request");
            v0 v0Var = v0.f124986a;
            String str = String.format("跳转失败：%s \n 错误码：%s", Arrays.copyOf(new Object[]{request.m().toString(), Integer.valueOf(i10)}, 2));
            f0.o(str, "format(format, *args)");
            com.max.hbutils.utils.c.f(str);
            UriRouterActivity.this.finish();
        }

        @Override // com.sankuai.waimai.router.core.d
        public void onSuccess(@d i request) {
            if (PatchProxy.proxy(new Object[]{request}, this, changeQuickRedirect, false, 48106, new Class[]{i.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(request, "request");
            v0 v0Var = v0.f124986a;
            String str = String.format("成功跳转至：%s", Arrays.copyOf(new Object[]{request.m().toString()}, 1));
            f0.o(str, "format(format, *args)");
            com.max.hbutils.utils.c.f(str);
            UriRouterActivity.this.finish();
        }
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    @d
    public Handler V0() {
        return this.C;
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void bindViews() {
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void initViews() {
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 48105, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        com.sankuai.waimai.router.common.c.s0(this, new a());
    }

    @Override // com.max.xiaoheihe.base.mvvm.BaseActivity
    public void t1() {
    }
}
