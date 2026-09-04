package com.max.xiaoheihe.module.account;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.ProfileEditorSettingsObj;
import com.max.xiaoheihe.bean.account.ProfileObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.UCrop;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.socialize.UMShareAPI;
import com.xiaomi.mipush.sdk.Constants;
import df.m4;
import df.z2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131223o4})
public class UpdateAccountActivity extends BaseActivity implements View.OnClickListener, TextView.OnEditorActionListener {
    private static final String S = "arg_prefer";
    public static final String T = "prefer_nickname";
    public static final String U = "prefer_signature";
    private static final int V = 0;
    private static final String W = "headpic.jpg";
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static String[] f78469a0 = {"男", "女"};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static String[] f78470b0 = {"未知", "小学", "初中", "高中", "专科", "本科", "硕士", "博士"};

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static String[] f78471c0 = {"未知", "在校学生", "企业、公司职员", "企业、公司管理者", "党政/事业单位/公务员", "服务业人员", "工人/体力劳动者", "自由职业者", "个体经营者", "务农人员", "暂无职业(下岗、失业)", "退休"};
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private File M;
    private LoadingDialog N;
    private z2 O;
    private androidx.activity.result.g<Intent> P;
    private String Q;
    private boolean R;

    public class a implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 24356, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public void b(ActivityResult activityResult) {
            String stringExtra;
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 24355, new Class[]{ActivityResult.class}, Void.TYPE).isSupported || activityResult.b() != -1 || (stringExtra = activityResult.a().getStringExtra(WebActionActivity.f94260l4)) == null) {
                return;
            }
            UpdateAccountActivity.this.Q = stringExtra;
            UpdateAccountActivity.this.M = null;
            UpdateAccountActivity.this.O.f118142b.setAvatar(stringExtra);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24357, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UpdateAccountActivity.Q1(UpdateAccountActivity.this);
        }
    }

    public class c implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
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
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 24358, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            UpdateAccountActivity.R1(UpdateAccountActivity.this, strArr[0]);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24359, new Class[]{String.class}, Void.TYPE).isSupported || UpdateAccountActivity.this.N == null) {
                return;
            }
            UpdateAccountActivity.this.N.c();
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24361, new Class[0], Void.TYPE).isSupported && UpdateAccountActivity.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(UpdateAccountActivity.this.getString(R.string.change_success));
                if (UpdateAccountActivity.this.N != null) {
                    UpdateAccountActivity.this.N.c();
                }
                com.max.xiaoheihe.utils.d.x1(((BaseActivity) UpdateAccountActivity.this).f66601b);
                UpdateAccountActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24360, new Class[]{Throwable.class}, Void.TYPE).isSupported && UpdateAccountActivity.this.isActive()) {
                super.onError(th2);
                if (UpdateAccountActivity.this.N != null) {
                    UpdateAccountActivity.this.N.c();
                }
            }
        }

        public void onNext(Result<User> result) {
            User result2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24362, new Class[]{Result.class}, Void.TYPE).isSupported || !UpdateAccountActivity.this.isActive() || (result2 = result.getResult()) == null) {
                return;
            }
            ProfileObj profile = result2.getProfile();
            User userO = com.max.xiaoheihe.utils.i0.o();
            if (profile != null) {
                userO.setProfile(profile);
                AccountDetailObj account_detail = userO.getAccount_detail();
                if (profile.getAvatar() != null) {
                    account_detail.setAvartar(profile.getAvatar());
                }
                if (profile.getSignature() != null) {
                    account_detail.setSignature(profile.getSignature());
                }
                if (profile.getNickname() != null) {
                    account_detail.setUsername(profile.getNickname());
                }
            }
            com.max.xiaoheihe.utils.i0.z(userO);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24363, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<User>) obj);
        }
    }

    public class e implements DatePickerDialog.OnDateSetListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            Object[] objArr = {datePicker, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24364, new Class[]{DatePicker.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            UpdateAccountActivity.this.O.f118154n.setText(i10 + "/" + (i11 + 1) + "/" + i12);
        }
    }

    public class f implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f78477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f78478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HeyBoxPopupMenu f78479c;

        f(String[] strArr, TextView textView, HeyBoxPopupMenu heyBoxPopupMenu) {
            this.f78477a = strArr;
            this.f78478b = textView;
            this.f78479c = heyBoxPopupMenu;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            TextView textView;
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 24365, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            int iQ = com.max.hbutils.utils.n.q(keyDescObj.getKey());
            if (!com.max.hbcommon.utils.c.v(this.f78477a)) {
                String[] strArr = this.f78477a;
                if (strArr.length > iQ && (textView = this.f78478b) != null) {
                    textView.setText(strArr[iQ]);
                }
            }
            this.f78479c.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f78481b;

        g(com.max.hbcommon.view.a aVar) {
            this.f78481b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24366, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UpdateAccountActivity.W1(UpdateAccountActivity.this);
            this.f78481b.dismiss();
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.view.a f78483b;

        public class a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24368, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UpdateAccountActivity.X1(UpdateAccountActivity.this);
            }
        }

        h(com.max.hbcommon.view.a aVar) {
            this.f78483b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24367, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78483b.dismiss();
            PermissionManager.f71603a.S(UpdateAccountActivity.this, new a());
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<ProfileEditorSettingsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public void onNext(Result<ProfileEditorSettingsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24369, new Class[]{Result.class}, Void.TYPE).isSupported && UpdateAccountActivity.this.isActive()) {
                String custom_avatar_enabled = result.getResult().getCustom_avatar_enabled();
                com.max.hbcache.c.C(com.max.xiaoheihe.utils.i0.f95405c, custom_avatar_enabled);
                UpdateAccountActivity.this.R = com.max.hbcommon.utils.c.x(custom_avatar_enabled);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24370, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ProfileEditorSettingsObj>) obj);
        }
    }

    public class j implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f78487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EditText f78488c;

        public j(EditText editText, int i10) {
            this.f78488c = editText;
            this.f78487b = i10;
        }

        private String a(CharSequence charSequence, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence, new Integer(i10)}, this, changeQuickRedirect, false, 24373, new Class[]{CharSequence.class, Integer.TYPE}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            for (int i12 = 0; i12 < charSequence.length(); i12++) {
                int iCodePointAt = Character.codePointAt(charSequence, i12);
                if (iCodePointAt < 0 || iCodePointAt > 255) {
                    i11 += 2;
                    if (i11 > i10) {
                        return sb2.toString();
                    }
                    sb2.append(charSequence.charAt(i12));
                } else {
                    if (i11 >= i10) {
                        return sb2.toString();
                    }
                    i11++;
                    sb2.append(charSequence.charAt(i12));
                }
            }
            return sb2.toString();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        public int b(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24372, new Class[]{String.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                int iCodePointAt = Character.codePointAt(str, i11);
                i10 = (iCodePointAt < 0 || iCodePointAt > 255) ? i10 + 2 : i10 + 1;
            }
            return i10;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            int iB;
            Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24371, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported && (iB = b(charSequence.toString())) > this.f78487b) {
                int i13 = i12 + i10;
                CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i13);
                String strA = a(charSequenceSubSequence, this.f78487b - (iB - b(charSequenceSubSequence.toString())));
                if (i13 == charSequence.length()) {
                    this.f78488c.setText(String.valueOf(((Object) charSequence.subSequence(0, i10)) + strA));
                    EditText editText = this.f78488c;
                    editText.setSelection(editText.getText().length());
                    return;
                }
                this.f78488c.setText(String.valueOf(((Object) charSequence.subSequence(0, i10)) + strA + String.valueOf(charSequence.subSequence(i13, charSequence.length()))));
                this.f78488c.setSelection(i10 + strA.length());
            }
        }
    }

    static /* synthetic */ void Q1(UpdateAccountActivity updateAccountActivity) {
        if (PatchProxy.proxy(new Object[]{updateAccountActivity}, null, changeQuickRedirect, true, 24351, new Class[]{UpdateAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        updateAccountActivity.c2();
    }

    static /* synthetic */ void R1(UpdateAccountActivity updateAccountActivity, String str) {
        if (PatchProxy.proxy(new Object[]{updateAccountActivity, str}, null, changeQuickRedirect, true, 24352, new Class[]{UpdateAccountActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        updateAccountActivity.q2(str);
    }

    static /* synthetic */ void W1(UpdateAccountActivity updateAccountActivity) {
        if (PatchProxy.proxy(new Object[]{updateAccountActivity}, null, changeQuickRedirect, true, 24353, new Class[]{UpdateAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        updateAccountActivity.h2();
    }

    static /* synthetic */ void X1(UpdateAccountActivity updateAccountActivity) {
        if (PatchProxy.proxy(new Object[]{updateAccountActivity}, null, changeQuickRedirect, true, 24354, new Class[]{UpdateAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        updateAccountActivity.b2();
    }

    private Uri Z1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24347, new Class[0], Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        File file = new File(com.max.xiaoheihe.utils.d.T());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, System.currentTimeMillis() + W);
        this.M = file2;
        if (!file2.exists()) {
            try {
                this.M.createNewFile();
            } catch (IOException unused) {
                com.max.hbcommon.utils.d.b("zzzz", "creat file IOException");
            }
        }
        return com.max.xiaoheihe.utils.d.w0(this.f66601b, this.M);
    }

    private boolean a2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24340, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(this.O.f118144d.getText().toString())) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("信息不全");
            return false;
        }
        if (this.O.f118144d.getText().toString().length() < 2) {
            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("昵称字数过短");
            return false;
        }
        if (!com.max.hbcommon.utils.c.u(this.O.f118143c.getText().toString()) && !j2(this.O.f118143c.getText().toString())) {
            com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("邮箱格式不正确");
            return false;
        }
        if (!com.max.hbcommon.utils.c.n(this.O.f118144d.getText().toString())) {
            return true;
        }
        com.max.hbutils.utils.c cVar4 = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f("昵称中不能包含特殊符号");
        return false;
    }

    private void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24345, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.e.g(this, 1, 0);
    }

    private void c2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24332, new Class[0], Void.TYPE).isSupported && a2()) {
            this.N = new LoadingDialog(this, getString(R.string.commiting), true).r();
            File file = this.M;
            if (file != null && file.exists() && this.M.length() > 0) {
                com.max.xiaoheihe.module.upload.g.h(this.f66601b, V0(), Collections.singletonList(this.M.getPath()), com.max.xiaoheihe.module.upload.g.f93525b, new c());
            } else if (com.max.hbcommon.utils.c.u(this.Q)) {
                q2(null);
            } else {
                q2(this.Q);
            }
        }
    }

    public static Intent e2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 24328, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) UpdateAccountActivity.class);
        intent.putExtra(S, str);
        return intent;
    }

    private void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24350, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24343, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(this.f66601b, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f130970g4);
        intent.putExtra("title", "选择头像");
        this.P.b(intent);
    }

    private void hideSoftKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24349, new Class[]{View.class}, Void.TYPE).isSupported || (inputMethodManager = (InputMethodManager) this.f66601b.getSystemService("input_method")) == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private void i2() {
        String username;
        String signature;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24334, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        User userI = com.max.xiaoheihe.utils.i0.i();
        String avartar = null;
        if (userI.getAccount_detail() != null) {
            avartar = userI.getAccount_detail().getAvartar();
            username = userI.getAccount_detail().getUsername();
            signature = userI.getAccount_detail().getSignature();
        } else {
            username = null;
            signature = null;
        }
        TextView textView = this.O.f118158r;
        com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
        int i10 = com.max.hbresource.a.f71895c;
        textView.setTypeface(aVar.a(i10));
        this.O.f118142b.a();
        this.O.f118142b.setAvatar(avartar);
        this.O.f118142b.setDecoration(userI.getAccount_detail().getAvatar_decoration());
        this.O.f118163w.setTypeface(aVar.a(i10));
        this.O.f118144d.setText(username);
        this.O.f118165y.setTypeface(aVar.a(i10));
        this.O.f118145e.setText(signature);
        if (T.equals(this.L)) {
            showSoftKeyboard(this.O.f118144d);
        } else if (U.equals(this.L)) {
            showSoftKeyboard(this.O.f118145e);
        }
        this.O.f118162v.setTypeface(aVar.a(i10));
        this.O.f118159s.setTypeface(aVar.a(i10));
        this.O.f118161u.setTypeface(aVar.a(i10));
        this.O.f118160t.setTypeface(aVar.a(i10));
        this.O.f118164x.setTypeface(aVar.a(i10));
        ProfileObj profile = userI.getProfile();
        if (profile != null) {
            this.O.f118157q.setText(com.max.xiaoheihe.utils.d.N1(profile.getGender()));
            this.O.f118154n.setText(com.max.xiaoheihe.utils.d.K1(profile.getBirthday()));
            this.O.f118143c.setText(profile.getEmail());
            this.O.f118156p.setText(profile.getEducation());
            this.O.f118155o.setText(profile.getCareer());
        }
    }

    private void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24342, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.R) {
            m2();
        } else {
            h2();
        }
    }

    private void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24330, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.P = registerForActivityResult(new z.b.m(), new a());
    }

    private void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24344, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m4 m4VarC = m4.c(this.f66602c);
        m4VarC.b().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(this.f66601b).y("头像设置").i(m4VarC.b()).g(true).w(true).E(0).d();
        m4VarC.f113284c.setOnClickListener(new g(aVarD));
        m4VarC.f113285d.setOnClickListener(new h(aVarD));
        aVarD.show();
    }

    private void n2(DatePickerDialog.OnDateSetListener onDateSetListener) {
        DatePickerDialog datePickerDialog;
        if (PatchProxy.proxy(new Object[]{onDateSetListener}, this, changeQuickRedirect, false, 24339, new Class[]{DatePickerDialog.OnDateSetListener.class}, Void.TYPE).isSupported) {
            return;
        }
        String string = this.O.f118154n.getText().toString();
        if (com.max.hbcommon.utils.c.u(string)) {
            datePickerDialog = new DatePickerDialog(this, onDateSetListener, 1998, 0, 1);
        } else {
            String[] strArrSplit = string.split("/");
            if (strArrSplit.length != 3) {
                return;
            } else {
                datePickerDialog = new DatePickerDialog(this, onDateSetListener, com.max.hbutils.utils.n.q(strArrSplit[0]), com.max.hbutils.utils.n.q(strArrSplit[1]) - 1, com.max.hbutils.utils.n.q(strArrSplit[2]));
            }
        }
        datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
        datePickerDialog.show();
    }

    private void o2(String[] strArr, String str, TextView textView) {
        if (PatchProxy.proxy(new Object[]{strArr, str, textView}, this, changeQuickRedirect, false, 24338, new Class[]{String[].class, String.class, TextView.class}, Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey(String.valueOf(i10));
            keyDescObj.setDesc(strArr[i10]);
            keyDescObj.setChecked(strArr[i10].equals(str));
            arrayList.add(keyDescObj);
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this, arrayList);
        heyBoxPopupMenu.R(new f(strArr, textView, heyBoxPopupMenu));
        heyBoxPopupMenu.show();
    }

    private void p2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24337, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 1) {
            o2(f78469a0, this.O.f118157q.getText().toString(), this.O.f118157q);
        } else if (i10 == 2) {
            o2(f78470b0, this.O.f118156p.getText().toString(), this.O.f118156p);
        } else {
            if (i10 != 3) {
                return;
            }
            o2(f78471c0, this.O.f118155o.getText().toString(), this.O.f118155o);
        }
    }

    private void q2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24333, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        map.put("nickname", com.max.xiaoheihe.utils.y.b(com.max.xiaoheihe.utils.d.P1(this.O.f118144d.getText().toString())));
        map.put("signature", com.max.xiaoheihe.utils.y.b(com.max.xiaoheihe.utils.d.O1(this.O.f118145e.getText().toString())));
        if (!com.max.hbcommon.utils.c.u(this.O.f118157q.getText().toString())) {
            map.put(g0.a.G, com.max.xiaoheihe.utils.y.b(com.max.xiaoheihe.utils.d.N1(this.O.f118157q.getText().toString())));
        }
        if (!com.max.hbcommon.utils.c.u(this.O.f118154n.getText().toString())) {
            map.put("birthday", com.max.xiaoheihe.utils.y.b(com.max.xiaoheihe.utils.d.J1(this.O.f118154n.getText().toString())));
        }
        map.put("email", com.max.xiaoheihe.utils.y.b(this.O.f118143c.getText().toString()));
        if (!com.max.hbcommon.utils.c.u(this.O.f118156p.getText().toString())) {
            map.put("education", com.max.xiaoheihe.utils.y.b(this.O.f118156p.getText().toString()));
        }
        if (!com.max.hbcommon.utils.c.u(this.O.f118155o.getText().toString())) {
            map.put("career", com.max.xiaoheihe.utils.y.b(this.O.f118155o.getText().toString()));
        }
        if (!com.max.hbcommon.utils.c.u(str)) {
            map.put(com.max.xiaoheihe.module.upload.g.f93525b, com.max.xiaoheihe.utils.y.b(str));
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U5(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void showSoftKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24348, new Class[]{View.class}, Void.TYPE).isSupported || !view.requestFocus() || (inputMethodManager = (InputMethodManager) this.f66601b.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }

    public boolean j2(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24341, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(str).matches();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24329, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        z2 z2VarC = z2.c(this.f66602c);
        this.O = z2VarC;
        setContentView(z2VarC.b());
        this.L = getIntent().getStringExtra(S);
        this.f66616q.setTitle(R.string.change_userinfo_v2);
        this.f66616q.setAction(R.string.save);
        this.f66616q.O();
        this.f66617r.setVisibility(0);
        this.R = com.max.hbcommon.utils.c.x(com.max.hbcache.c.o(com.max.xiaoheihe.utils.i0.f95405c, "0"));
        l2();
        f2();
        i2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24346, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.d("zzzz", "onActivityResult: " + i10 + ", " + i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + intent);
        if (i11 == -1) {
            if (i10 == 0) {
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
            } else if (i10 == 69 && intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("HEYBOX_UCROP.Multi_OutputUri");
                if (!com.max.hbcommon.utils.c.w(parcelableArrayListExtra)) {
                    File file2 = new File(((Uri) parcelableArrayListExtra.get(0)).getPath());
                    this.M = file2;
                    revokeUriPermission(com.max.xiaoheihe.utils.d.w0(this.f66601b, file2), 2);
                    File file3 = this.M;
                    if (file3 != null) {
                        try {
                            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file3.getPath());
                            this.Q = null;
                            this.O.f118142b.setAvatarBitmap(com.max.hbimage.b.q(bitmapDecodeFile, ViewUtils.f(this.f66601b, 54.0f), ViewUtils.f(this.f66601b, 54.0f)));
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24335, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.O.f118144d.clearFocus();
        this.O.f118145e.clearFocus();
        this.O.f118143c.clearFocus();
        if (view.getId() == R.id.rl_set_icon) {
            k2();
            return;
        }
        if (view.getId() == R.id.rl_set_gender) {
            p2(1);
            return;
        }
        if (view.getId() == R.id.rl_set_birthday) {
            n2(new e());
            return;
        }
        if (view.getId() == R.id.rl_set_education) {
            p2(2);
            return;
        }
        if (view.getId() == R.id.rl_set_career) {
            p2(3);
            return;
        }
        if (view.getId() == R.id.rl_set_nick) {
            showSoftKeyboard(this.O.f118144d);
        } else if (view.getId() == R.id.rl_set_signature) {
            showSoftKeyboard(this.O.f118145e);
        } else if (view.getId() == R.id.rl_set_email) {
            showSoftKeyboard(this.O.f118143c);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 24336, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (i10 == 6) {
            this.O.f118143c.clearFocus();
            this.O.f118144d.clearFocus();
            this.O.f118145e.clearFocus();
        }
        com.max.xiaoheihe.utils.d.D0(this);
        return false;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24331, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O.f118151k.setOnClickListener(this);
        this.O.f118152l.setOnClickListener(this);
        this.O.f118153m.setOnClickListener(this);
        this.O.f118150j.setOnClickListener(this);
        this.O.f118146f.setOnClickListener(this);
        this.O.f118149i.setOnClickListener(this);
        this.O.f118148h.setOnClickListener(this);
        this.O.f118147g.setOnClickListener(this);
        this.f66616q.setActionOnClickListener(new b());
        this.O.f118144d.setOnEditorActionListener(this);
        this.O.f118145e.setOnEditorActionListener(this);
        EditText editText = this.O.f118145e;
        editText.addTextChangedListener(new j(editText, 40));
        this.O.f118143c.setOnEditorActionListener(this);
    }
}
