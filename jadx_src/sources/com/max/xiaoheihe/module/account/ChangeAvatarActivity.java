package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.swipebacklayout.SwipeBackLayout;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AvatarConfigObj;
import com.max.xiaoheihe.module.account.mine.SetAvatarDecorFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.littleprogram.MiniProgramContainerActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.socialize.UMShareAPI;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: ChangeAvatarActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ChangeAvatarActivity extends BaseActivity {

    @dl.d
    public static final a S = new a(null);
    public static final int T = 8;

    @dl.d
    public static final String U = "ARG_AVATAR_CONFIG";

    @dl.d
    public static final String V = "AVATAR_URL";
    public static final int W = 1001;
    public static final int X = 1002;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private String L;

    @dl.e
    private AvatarConfigObj M;
    private ViewGroup N;
    private ImageView O;

    @dl.e
    private androidx.activity.result.g<Intent> P;

    @dl.e
    private LoadingDialog Q;

    @dl.e
    private HeyBoxPopupMenu R;

    /* JADX INFO: compiled from: ChangeAvatarActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.d String avatarUrl, @dl.e AvatarConfigObj avatarConfigObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, avatarUrl, avatarConfigObj}, this, changeQuickRedirect, false, 22574, new Class[]{Context.class, String.class, AvatarConfigObj.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(avatarUrl, "avatarUrl");
            Intent intent = new Intent(context, (Class<?>) ChangeAvatarActivity.class);
            intent.putExtra(ChangeAvatarActivity.V, avatarUrl);
            intent.putExtra(ChangeAvatarActivity.U, avatarConfigObj);
            return intent;
        }
    }

    /* JADX INFO: compiled from: ChangeAvatarActivity.kt */
    public static final class b implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 22576, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 22575, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == -1) {
                Intent intentA = activityResult.a();
                kotlin.jvm.internal.f0.m(intentA);
                String stringExtra = intentA.getStringExtra(WebActionActivity.f94260l4);
                if (stringExtra != null) {
                    ChangeAvatarActivity.this.L = stringExtra;
                    ImageView imageView = ChangeAvatarActivity.this.O;
                    if (imageView == null) {
                        kotlin.jvm.internal.f0.S("iv_avatar");
                        imageView = null;
                    }
                    com.max.hbimage.b.K(stringExtra, imageView);
                    ChangeAvatarActivity changeAvatarActivity = ChangeAvatarActivity.this;
                    ChangeAvatarActivity.X1(changeAvatarActivity, changeAvatarActivity.L);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ChangeAvatarActivity.kt */
    public static final class c implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f77566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ChangeAvatarActivity f77567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f77569d;

        /* JADX INFO: compiled from: ChangeAvatarActivity.kt */
        public static final class a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ChangeAvatarActivity f77570a;

            a(ChangeAvatarActivity changeAvatarActivity) {
                this.f77570a = changeAvatarActivity;
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22578, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                ChangeAvatarActivity.M1(this.f77570a);
            }
        }

        c(String str, ChangeAvatarActivity changeAvatarActivity, String str2, String str3) {
            this.f77566a = str;
            this.f77567b = changeAvatarActivity;
            this.f77568c = str2;
            this.f77569d = str3;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 22577, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            String key = keyDescObj.getKey();
            if (kotlin.jvm.internal.f0.g(key, this.f77566a)) {
                if (keyDescObj.isCanClick()) {
                    PermissionManager permissionManager = PermissionManager.f71603a;
                    ChangeAvatarActivity changeAvatarActivity = this.f77567b;
                    permissionManager.S(changeAvatarActivity, new a(changeAvatarActivity));
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.f0.g(key, this.f77568c)) {
                ChangeAvatarActivity.T1(this.f77567b);
            } else if (kotlin.jvm.internal.f0.g(key, this.f77569d)) {
                ChangeAvatarActivity changeAvatarActivity2 = this.f77567b;
                changeAvatarActivity2.startActivityForResult(MiniProgramContainerActivity.a.c(MiniProgramContainerActivity.L, changeAvatarActivity2, lb.d.f131216n4, null, 4, null), 1002);
            }
        }
    }

    /* JADX INFO: compiled from: ChangeAvatarActivity.kt */
    public static final class d implements HeyBoxPopupMenu.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.f
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22579, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ChangeAvatarActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: ChangeAvatarActivity.kt */
    public static final class e implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(@dl.d String[] urls, @dl.d String extra) {
            if (PatchProxy.proxy(new Object[]{urls, extra}, this, changeQuickRedirect, false, 22580, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(urls, "urls");
            kotlin.jvm.internal.f0.p(extra, "extra");
            ChangeAvatarActivity.X1(ChangeAvatarActivity.this, urls[0]);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.d String error) {
            if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 22581, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(error, "error");
            if (ChangeAvatarActivity.this.Q != null) {
                LoadingDialog loadingDialog = ChangeAvatarActivity.this.Q;
                kotlin.jvm.internal.f0.m(loadingDialog);
                loadingDialog.c();
            }
            com.max.hbutils.utils.c.f(ChangeAvatarActivity.this.getString(R.string.fail));
            ChangeAvatarActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: ChangeAvatarActivity.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22583, new Class[0], Void.TYPE).isSupported && ChangeAvatarActivity.this.isActive()) {
                com.max.hbutils.utils.c.f(ChangeAvatarActivity.this.getString(R.string.change_success));
                ChangeAvatarActivity.V1(ChangeAvatarActivity.this);
                com.max.xiaoheihe.utils.d.x1(((BaseActivity) ChangeAvatarActivity.this).f66601b);
                ChangeAvatarActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22582, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (ChangeAvatarActivity.this.isActive()) {
                super.onError(e10);
                ChangeAvatarActivity.V1(ChangeAvatarActivity.this);
                ChangeAvatarActivity.this.onBackPressed();
            }
        }
    }

    public static final /* synthetic */ void M1(ChangeAvatarActivity changeAvatarActivity) {
        if (PatchProxy.proxy(new Object[]{changeAvatarActivity}, null, changeQuickRedirect, true, 22571, new Class[]{ChangeAvatarActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        changeAvatarActivity.Y1();
    }

    public static final /* synthetic */ void T1(ChangeAvatarActivity changeAvatarActivity) {
        if (PatchProxy.proxy(new Object[]{changeAvatarActivity}, null, changeQuickRedirect, true, 22572, new Class[]{ChangeAvatarActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        changeAvatarActivity.Z1();
    }

    public static final /* synthetic */ void V1(ChangeAvatarActivity changeAvatarActivity) {
        if (PatchProxy.proxy(new Object[]{changeAvatarActivity}, null, changeQuickRedirect, true, 22573, new Class[]{ChangeAvatarActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        changeAvatarActivity.a2();
    }

    public static final /* synthetic */ void X1(ChangeAvatarActivity changeAvatarActivity, String str) {
        if (PatchProxy.proxy(new Object[]{changeAvatarActivity, str}, null, changeQuickRedirect, true, 22570, new Class[]{ChangeAvatarActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        changeAvatarActivity.j2(str);
    }

    private final void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22562, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.e.g(this, 1, 1001);
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22561, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(this.f66601b, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f130970g4);
        intent.putExtra("title", "选择头像");
        androidx.activity.result.g<Intent> gVar = this.P;
        if (gVar != null) {
            gVar.b(intent);
        }
    }

    private final void a2() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22568, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.Q) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22566, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.N;
        if (viewGroup == null) {
            kotlin.jvm.internal.f0.S("vg_container");
            viewGroup = null;
        }
        viewGroup.setAlpha(0.0f);
        HeyBoxPopupMenu heyBoxPopupMenu = this.R;
        SwipeBackLayout swipeBackLayoutE = heyBoxPopupMenu != null ? heyBoxPopupMenu.e() : null;
        if (swipeBackLayoutE == null) {
            return;
        }
        swipeBackLayoutE.setAlpha(0.0f);
    }

    private final void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22559, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.P = registerForActivityResult(new z.b.m(), new b());
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22558, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.L;
        ImageView imageView = this.O;
        ImageView imageView2 = null;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_avatar");
            imageView = null;
        }
        com.max.hbimage.b.K(str, imageView);
        ImageView imageView3 = this.O;
        if (imageView3 == null) {
            kotlin.jvm.internal.f0.S("iv_avatar");
        } else {
            imageView2 = imageView3;
        }
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        int iL = ViewUtils.L(this);
        layoutParams.height = iL;
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (((ViewUtils.J(this) - ViewUtils.f(this, 200.0f)) - iL) / 2) + com.max.hbutils.utils.t.p(this.f66601b);
    }

    private final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22567, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.Q;
        if (loadingDialog != null) {
            kotlin.jvm.internal.f0.m(loadingDialog);
            if (loadingDialog.i()) {
                return;
            }
        }
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        this.Q = new LoadingDialog(mContext, "").r();
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22560, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        AvatarConfigObj avatarConfigObj = this.M;
        if (avatarConfigObj != null) {
            String change_msg = null;
            boolean zX = com.max.hbcommon.utils.c.x(avatarConfigObj != null ? avatarConfigObj.getCan_change() : null);
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey("changeLocal");
            if (zX) {
                change_msg = "更换头像";
            } else {
                AvatarConfigObj avatarConfigObj2 = this.M;
                if (avatarConfigObj2 != null) {
                    change_msg = avatarConfigObj2.getChange_msg();
                }
            }
            keyDescObj.setDesc(change_msg);
            keyDescObj.setCanClick(zX);
            arrayList.add(keyDescObj);
        }
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey("changeWeb");
        keyDescObj2.setDesc("官方头像库");
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setKey("changeDor");
        keyDescObj3.setDesc("更换头像框");
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.f66601b, arrayList, false);
        this.R = heyBoxPopupMenu;
        heyBoxPopupMenu.Y(true);
        heyBoxPopupMenu.R(new c("changeLocal", this, "changeWeb", "changeDor"));
        heyBoxPopupMenu.O(false);
        heyBoxPopupMenu.setCancelable(false);
        heyBoxPopupMenu.h(0);
        heyBoxPopupMenu.i(false);
        heyBoxPopupMenu.N(new d());
        heyBoxPopupMenu.show();
        heyBoxPopupMenu.f(false);
    }

    private final void i2(File file) {
        if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 22564, new Class[]{File.class}, Void.TYPE).isSupported) {
            return;
        }
        b2();
        f2();
        if (file == null || !file.exists() || file.length() <= 0) {
            return;
        }
        com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), kotlin.collections.s.k(file.getPath()), com.max.xiaoheihe.module.upload.g.f93525b, new e());
    }

    private final void j2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22565, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        b2();
        f2();
        if (com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().g(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    @Override // com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22569, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22557, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        setContentView(R.layout.activity_change_avatar);
        com.max.hbutils.utils.t.A(this.f66601b, com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color), 255);
        overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
        View viewFindViewById = findViewById(R.id.vg_container);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(R.id.vg_container)");
        this.N = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.iv_avatar);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(R.id.iv_avatar)");
        this.O = (ImageView) viewFindViewById2;
        Intent intent = getIntent();
        this.L = intent != null ? intent.getStringExtra(V) : null;
        Intent intent2 = getIntent();
        this.M = (AvatarConfigObj) (intent2 != null ? intent2.getSerializableExtra(U) : null);
        c2();
        e2();
        h2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22563, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 == -1) {
            if (i10 != 69) {
                if (i10 == 1001) {
                    ArrayList<LocalMedia> arrayListG = com.max.mediaselector.lib.basic.q.g(intent);
                    if (arrayListG != null && arrayListG.size() > 0) {
                        File file = new File(PictureVideoEditPostFragment.g7(this));
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        Uri uriFromFile = Uri.fromFile(new File(arrayListG.get(0).G()));
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(uriFromFile);
                        UCrop uCropOf = UCrop.of((ArrayList<Uri>) arrayList, Uri.fromFile(file));
                        uCropOf.getCropIntent().putExtra(UCropPlusActivity.ARG_ONLY_CROP, true);
                        uCropOf.getCropIntent().putExtra(UCrop.Options.EXTRA_CIRCLE_DIMMED_LAYER, true);
                        uCropOf.startWithType(this.f66601b, 1);
                    }
                } else if (i10 == 1002 && intent != null && intent.getBooleanExtra(SetAvatarDecorFragment.f79034z, false)) {
                    super.finish();
                    overridePendingTransition(R.anim.activity_close_enter_to_right, R.anim.activity_close_to_right);
                }
            } else if (intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri");
                if (!com.max.hbcommon.utils.c.w(parcelableArrayListExtra)) {
                    kotlin.jvm.internal.f0.m(parcelableArrayListExtra);
                    File file2 = new File(((Uri) parcelableArrayListExtra.get(0)).getPath());
                    revokeUriPermission(com.max.xiaoheihe.utils.d.w0(this.f66601b, file2), 2);
                    try {
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file2.getPath());
                        ImageView imageView = null;
                        this.L = null;
                        ImageView imageView2 = this.O;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.f0.S("iv_avatar");
                        } else {
                            imageView = imageView2;
                        }
                        imageView.setImageBitmap(bitmapDecodeFile);
                        i2(file2);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }
}
