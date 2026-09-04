package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.post_edit.post_setting.ActivityPostSettingViewModel;
import com.max.xiaoheihe.router.interceptors.PostPathInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NewLinkEditActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(interceptors = {PostPathInterceptor.class}, path = {lb.d.A0, lb.d.f131129b1})
public final class NewLinkEditActivity extends BaseActivity implements com.max.xiaoheihe.module.bbs.utils.d.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b, z0 {
    public static final int N = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private NewLinkEditFragment L;

    @dl.e
    private ActivityPostSettingViewModel M;

    @dl.e
    public final NewLinkEditFragment M1() {
        return this.L;
    }

    public final void N1(@dl.e NewLinkEditFragment newLinkEditFragment) {
        this.L = newLinkEditFragment;
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.z0
    public void a0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29676, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(@dl.e View view) {
        NewLinkEditFragment newLinkEditFragment;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29680, new Class[]{View.class}, Void.TYPE).isSupported || (newLinkEditFragment = this.L) == null) {
            return;
        }
        newLinkEditFragment.expressionDeleteClick(view);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        NewLinkEditFragment newLinkEditFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29675, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        setContentView(R.layout.layout_sample_fragment_container);
        if (this.L == null) {
            Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.fragment_container);
            if (fragmentR0 instanceof NewLinkEditFragment) {
                this.L = (NewLinkEditFragment) fragmentR0;
            } else {
                this.L = new NewLinkEditFragment();
            }
            if (getIntent() != null && (newLinkEditFragment = this.L) != null) {
                newLinkEditFragment.setArguments(getIntent().getExtras());
            }
        }
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        NewLinkEditFragment newLinkEditFragment2 = this.L;
        kotlin.jvm.internal.f0.m(newLinkEditFragment2);
        p0VarU.y(R.id.fragment_container, newLinkEditFragment2).n();
        if (ad.a.a(ad.a.I, false)) {
            return;
        }
        this.M = (ActivityPostSettingViewModel) new androidx.lifecycle.y0(this).a(ActivityPostSettingViewModel.class);
    }

    @Override // com.max.hbexpression.q.a
    public void o0(@dl.e ExpressionObj expressionObj) {
        NewLinkEditFragment newLinkEditFragment;
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 29679, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported || (newLinkEditFragment = this.L) == null) {
            return;
        }
        newLinkEditFragment.o0(expressionObj);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        NewLinkEditFragment newLinkEditFragment;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29681, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 == -1) {
            if (i10 == 1001) {
                NewLinkEditFragment newLinkEditFragment2 = this.L;
                if (newLinkEditFragment2 != null) {
                    newLinkEditFragment2.S6(intent);
                }
            } else if (i10 == 1002 && (newLinkEditFragment = this.L) != null) {
                newLinkEditFragment.E6(intent);
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        NewLinkEditFragment newLinkEditFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29677, new Class[0], Void.TYPE).isSupported || (newLinkEditFragment = this.L) == null) {
            return;
        }
        newLinkEditFragment.onBackPressed();
    }

    @Override // com.max.xiaoheihe.module.bbs.utils.d.a
    public void s(boolean z10, int i10) {
        NewLinkEditFragment newLinkEditFragment;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, 29678, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported || (newLinkEditFragment = this.L) == null) {
            return;
        }
        newLinkEditFragment.s(z10, i10);
    }
}
