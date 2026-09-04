package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.module.bbs.post_edit.post_setting.ActivityPostSettingViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
@ig.d(path = {lb.d.f131136c1})
public class PictureVideoEditPostActivity extends BaseActivity implements com.max.xiaoheihe.module.bbs.adapter.x.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b, z0 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PictureVideoEditPostFragment L = null;
    private ActivityPostSettingViewModel M = null;

    public static Intent M1(Context context, String[] strArr, PictureVideoLinkDraftObj pictureVideoLinkDraftObj, String str, String str2, PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr, pictureVideoLinkDraftObj, str, str2, post_edit_type}, null, changeQuickRedirect, true, 30129, new Class[]{Context.class, String[].class, PictureVideoLinkDraftObj.class, String.class, String.class, PictureVideoEditPostFragment.POST_EDIT_TYPE.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        if (!MainActivity.E4) {
            return N1(context, strArr, pictureVideoLinkDraftObj, str, str2, post_edit_type);
        }
        Intent intent = new Intent(context, (Class<?>) PostTabActivity.class);
        intent.putExtra(PictureVideoEditPostFragment.f82332a4, post_edit_type);
        intent.putExtra(PostTabActivity.f82576x2, post_edit_type == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO ? PostType.Video : PostType.Picture);
        intent.putExtra(PictureVideoEditPostFragment.f82350s4, strArr);
        intent.putExtra(PictureVideoEditPostFragment.f82349r4, str);
        intent.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
        intent.putExtra(PictureVideoEditPostFragment.f82334c4, str2);
        return intent;
    }

    public static Intent N1(Context context, String[] strArr, PictureVideoLinkDraftObj pictureVideoLinkDraftObj, String str, String str2, PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr, pictureVideoLinkDraftObj, str, str2, post_edit_type}, null, changeQuickRedirect, true, 30130, new Class[]{Context.class, String[].class, PictureVideoLinkDraftObj.class, String.class, String.class, PictureVideoEditPostFragment.POST_EDIT_TYPE.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) PictureVideoEditPostActivity.class);
        intent.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
        intent.putExtra(PictureVideoEditPostFragment.f82349r4, str);
        intent.putExtra(PictureVideoEditPostFragment.f82332a4, post_edit_type);
        intent.putExtra(PictureVideoEditPostFragment.f82350s4, strArr);
        intent.putExtra(PictureVideoEditPostFragment.f82334c4, str2);
        return intent;
    }

    public static void O1(Context context, String[] strArr, PictureVideoLinkDraftObj pictureVideoLinkDraftObj, String str, String str2, @androidx.annotation.p0 String str3, PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type, String str4) {
        if (PatchProxy.proxy(new Object[]{context, strArr, pictureVideoLinkDraftObj, str, str2, str3, post_edit_type, str4}, null, changeQuickRedirect, true, 30128, new Class[]{Context.class, String[].class, PictureVideoLinkDraftObj.class, String.class, String.class, String.class, PictureVideoEditPostFragment.POST_EDIT_TYPE.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!MainActivity.E4) {
            Intent intentN1 = N1(context, strArr, pictureVideoLinkDraftObj, str, str2, post_edit_type);
            intentN1.putExtra("source", str4);
            context.startActivity(intentN1);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) PostTabActivity.class);
        intent.putExtra(PictureVideoEditPostFragment.f82332a4, post_edit_type);
        intent.putExtra(PostTabActivity.f82576x2, post_edit_type == PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO ? PostType.Video : PostType.Picture);
        intent.putExtra(PictureVideoEditPostFragment.f82350s4, strArr);
        intent.putExtra(PictureVideoEditPostFragment.f82349r4, str);
        intent.putExtra(PictureVideoEditPostFragment.Z3, pictureVideoLinkDraftObj);
        intent.putExtra(PictureVideoEditPostFragment.f82334c4, str2);
        intent.putExtra("h_src", str3);
        intent.putExtra("source", str4);
        context.startActivity(intent);
    }

    @Override // com.max.xiaoheihe.module.bbs.post_edit.z0
    public void a0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30139, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30134, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L.expressionDeleteClick(view);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void i0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30136, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.i0();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30131, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        if (this.L == null) {
            Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.fragment_container);
            if (fragmentR0 instanceof PictureVideoEditPostFragment) {
                this.L = (PictureVideoEditPostFragment) fragmentR0;
            } else {
                this.L = new PictureVideoEditPostFragment();
            }
            if (getIntent() != null) {
                this.L.setArguments(getIntent().getExtras());
            }
        }
        getSupportFragmentManager().u().y(R.id.fragment_container, this.L).n();
        if (ad.a.a(ad.a.I, false)) {
            return;
        }
        this.M = (ActivityPostSettingViewModel) new androidx.lifecycle.y0(this).a(ActivityPostSettingViewModel.class);
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.x.a
    public void m3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 30137, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.L.m3(i10);
    }

    @Override // com.max.hbexpression.q.a
    public void o0(ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 30133, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L.o0(expressionObj);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30135, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 == -1) {
            if (i10 == 69) {
                this.L.R6(intent);
            } else if (i10 == 1001) {
                this.L.T6(intent);
            } else if (i10 == 2001) {
                this.L.i7();
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30132, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.onBackPressed();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30138, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
    }
}
