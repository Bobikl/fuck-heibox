package com.max.xiaoheihe.module.favour;

import android.content.Intent;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: FavourActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class FavourActivity extends BaseActivity {
    public static final int M = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private i L;

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31632, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("我的收藏");
        this.f66617r.setVisibility(0);
        i iVar = new i();
        this.L = iVar;
        getSupportFragmentManager().u().b(R.id.multi_status_view_container, iVar).m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@dl.e Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 31633, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        i iVar = this.L;
        if (iVar != null) {
            iVar.X3();
        }
    }
}
