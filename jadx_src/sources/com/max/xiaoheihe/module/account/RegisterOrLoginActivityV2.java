package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.transition.AutoTransition;
import androidx.transition.Slide;
import androidx.transition.TransitionSet;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.network.ApiException;
import com.max.hbcustomview.PinEntryEditText;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbview.AutoOffsettingBackgroundLayout;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.GetRegisterCodeObj;
import com.max.xiaoheihe.bean.account.InterestProfileObj;
import com.max.xiaoheihe.bean.account.InviteInfoObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.UserGroupInfo;
import com.max.xiaoheihe.max.ui.MaxRegisterOrLoginActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.connect.common.Constants;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import df.o4;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.tools.ant.taskdefs.z0;

/* JADX INFO: loaded from: classes9.dex */
public class RegisterOrLoginActivityV2 extends BaseActivity implements com.max.xiaoheihe.module.account.i0 {
    public static final String P3 = "add_account";
    public static final int Q3 = 1;
    public static final int R3 = 3;
    public static final int S3 = 2;
    public static final int T3 = 4;
    public static final int U3 = 6;
    public static final int V3 = 8;
    private static final int W3 = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean G2;
    private CountDownTimer J3;
    private TextView K3;
    private String L;
    private int M;
    private com.max.hbcommon.utils.m M3;
    private View.OnClickListener N;
    private com.max.hbcommon.utils.m N3;
    private View.OnClickListener O;
    private View.OnClickListener P;
    private View.OnClickListener Q;
    private View.OnClickListener R;
    private View.OnClickListener S;
    private View.OnClickListener T;
    private View.OnClickListener U;
    private String W;
    private Timer Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private TimerTask f78236a0;

    @BindView(R.id.auto_offset_background)
    AutoOffsettingBackgroundLayout auto_offset_background;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private LoadingDialog f78237b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private TextWatcher f78238c0;

    @BindView(R.id.cb_privacy)
    CheckBox cb_privacy;

    @BindView(R.id.cl_root)
    ConstraintLayout clRoot;

    @BindView(R.id.et_invite_code)
    EditText etInviteCode;

    @BindView(R.id.et_number)
    EditText etNumber;

    @BindView(R.id.et_pwd)
    EditText etPwd;

    @BindView(R.id.group_invite_code)
    Group groupInviteCode;

    @BindView(R.id.ib_icon_back)
    ImageView ibIconBack;

    @BindView(R.id.iv_area_code_arrow)
    ImageView ivAreaCodeArrow;

    @BindView(R.id.iv_bottom_logo)
    ImageView ivBottomLogo;

    @BindView(R.id.iv_del)
    ImageView ivDel;

    @BindView(R.id.iv_tips_privacy)
    ImageView iv_tips_privacy;

    @BindView(R.id.line_et_bottom)
    Guideline lineEtBottom;

    @BindView(R.id.line_et_top)
    Guideline lineEtTop;

    @BindView(R.id.line_et_number_bottom)
    Guideline line_et_number_bottom;

    @BindView(R.id.line_et_number_right)
    Guideline line_et_number_right;

    @BindView(R.id.mask_background)
    View mask_background;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f78240p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private AnimationDrawable f78241p3;

    @BindView(R.id.pet_verification_code)
    PinEntryEditText petVerificationCode;

    @BindView(R.id.tv_action)
    TextView tvAction;

    @BindView(R.id.tv_area_code)
    TextView tvAreaCode;

    @BindView(R.id.tv_error_message)
    TextView tvErrorMsg;

    @BindView(R.id.tv_forget_pwd)
    TextView tvForgetPwd;

    @BindView(R.id.tv_number)
    TextView tvNumber;

    @BindView(R.id.tv_privacy)
    TextView tvPrivacy;

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_toggle_login)
    TextView tvToggleLogin;

    @BindView(R.id.tv_wechat_login)
    TextView tvWechatLogin;

    @BindView(R.id.v_et_line)
    View vEtLine;

    @BindView(R.id.v_invite_line)
    View vInviteLine;

    @BindView(R.id.vg_area_code)
    LinearLayout vgAreaCode;

    @BindView(R.id.vg_login_by_max)
    ViewGroup vg_login_by_max;

    @BindView(R.id.vg_login_by_wx)
    ViewGroup vg_login_by_wx;

    @BindView(R.id.vg_login_way)
    ViewGroup vg_login_way;

    @BindView(R.id.vg_privacy)
    ViewGroup vg_privacy;

    @BindView(R.id.vg_privacy_check)
    ViewGroup vg_privacy_check;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private InterestProfileObj f78242x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private io.reactivex.disposables.b f78243x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private InviteInfoObj f78244y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f78245y2;
    private final boolean V = false;
    private String X = "+86";
    private int Y = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private UMShareAPI f78239p1 = null;
    private boolean G3 = false;
    private boolean L3 = false;
    private final Handler O3 = new x();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.RegisterOrLoginActivityV2$a$a, reason: collision with other inner class name */
        public class C0639a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f78247a;

            C0639a(View view) {
                this.f78247a = view;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                CheckBox checkBox;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23917, new Class[0], Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || (checkBox = RegisterOrLoginActivityV2.this.cb_privacy) == null) {
                    return;
                }
                checkBox.setChecked(true);
                this.f78247a.performClick();
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23916, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!RegisterOrLoginActivityV2.this.cb_privacy.isChecked()) {
                RegisterOrLoginActivityV2.this.g0(new C0639a(view));
                com.max.xiaoheihe.utils.d.D0(RegisterOrLoginActivityV2.this);
            } else {
                RegisterOrLoginActivityV2 registerOrLoginActivityV2 = RegisterOrLoginActivityV2.this;
                registerOrLoginActivityV2.L = registerOrLoginActivityV2.etNumber.getText().toString();
                RegisterOrLoginActivityV2.O1(RegisterOrLoginActivityV2.this);
            }
        }
    }

    public class a0 extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23976, new Class[0], Void.TYPE).isSupported || RegisterOrLoginActivityV2.this.K3 == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.K3.performClick();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 23975, new Class[]{Long.TYPE}, Void.TYPE).isSupported || RegisterOrLoginActivityV2.this.K3 == null) {
                return;
            }
            String strValueOf = String.valueOf((j10 / 1000) + 1);
            RegisterOrLoginActivityV2.this.K3.setText("进入" + com.max.xiaoheihe.utils.d.A() + "（" + strValueOf + "秒后自动前往)");
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23918, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) RegisterOrLoginActivityV2.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", RegisterOrLoginActivityV2.this.getString(R.string.privacy_agreement));
            intent.putExtra("pageurl", lb.a.C1);
            ((BaseActivity) RegisterOrLoginActivityV2.this).f66601b.startActivity(intent);
        }
    }

    public class b0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23977, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.E2(RegisterOrLoginActivityV2.this);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CheckBox checkBox;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23919, new Class[]{View.class}, Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || (checkBox = RegisterOrLoginActivityV2.this.cb_privacy) == null) {
                return;
            }
            checkBox.setChecked(true ^ checkBox.isChecked());
        }
    }

    public class c0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.utils.l0.g f78253b;

        c0(com.max.xiaoheihe.utils.l0.g gVar) {
            this.f78253b = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23978, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f78253b.a();
            dialogInterface.dismiss();
        }
    }

    public class d implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23920, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported && z10) {
                RegisterOrLoginActivityV2.this.iv_tips_privacy.setVisibility(8);
            }
        }
    }

    public class d0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23979, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.W1(RegisterOrLoginActivityV2.this);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23921, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (RegisterOrLoginActivityV2.this.L3) {
                if (RegisterOrLoginActivityV2.this.M == 1 || RegisterOrLoginActivityV2.this.M == 2) {
                    RegisterOrLoginActivityV2.this.finish();
                    return;
                } else {
                    RegisterOrLoginActivityV2.V1(RegisterOrLoginActivityV2.this);
                    return;
                }
            }
            if (RegisterOrLoginActivityV2.this.M == 1 || RegisterOrLoginActivityV2.this.M == 2) {
                RegisterOrLoginActivityV2.W1(RegisterOrLoginActivityV2.this);
            } else {
                RegisterOrLoginActivityV2.V1(RegisterOrLoginActivityV2.this);
            }
        }
    }

    public class e0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23980, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23922, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.X1(RegisterOrLoginActivityV2.this, view);
        }
    }

    public class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23964, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (RegisterOrLoginActivityV2.this.M == 1) {
                RegisterOrLoginActivityV2.this.M = 2;
            } else {
                RegisterOrLoginActivityV2.this.M = 1;
            }
            RegisterOrLoginActivityV2.G2(RegisterOrLoginActivityV2.this);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23923, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) RegisterOrLoginActivityV2.this).f66601b.startActivityForResult(AreaCodeActivity.T1(((BaseActivity) RegisterOrLoginActivityV2.this).f66601b), 1);
        }
    }

    public class g0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23981, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.H2(RegisterOrLoginActivityV2.this);
        }
    }

    public class h implements PinEntryEditText.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcustomview.PinEntryEditText.i
        public void a(CharSequence charSequence) {
            if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 23924, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.L2(RegisterOrLoginActivityV2.this);
            RegisterOrLoginActivityV2.this.tvAction.performClick();
        }
    }

    public class h0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23982, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.I2(RegisterOrLoginActivityV2.this);
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23925, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.this.etNumber.setText("");
            RegisterOrLoginActivityV2.this.etPwd.setText("");
        }
    }

    public class i0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23983, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (RegisterOrLoginActivityV2.this.M % 2 == 1) {
                RegisterOrLoginActivityV2.this.M = 1;
            } else {
                RegisterOrLoginActivityV2.this.M = 2;
            }
            RegisterOrLoginActivityV2.G2(RegisterOrLoginActivityV2.this);
        }
    }

    public class j extends com.max.hbcommon.network.d<Result<GetRegisterCodeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23927, new Class[0], Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || RegisterOrLoginActivityV2.this.f78237b0 == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.f78237b0.c();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23926, new Class[]{Throwable.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                super.onError(th2);
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }
        }

        public void onNext(Result<GetRegisterCodeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23928, new Class[]{Result.class}, Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || result == null || result.getResult() == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.Y = com.max.hbutils.utils.n.q(result.getResult().getRemain_time());
            RegisterOrLoginActivityV2.h2(RegisterOrLoginActivityV2.this);
            RegisterOrLoginActivityV2.this.Z.schedule(RegisterOrLoginActivityV2.this.f78236a0, 1000L, 1000L);
            if (RegisterOrLoginActivityV2.this.M != 3) {
                RegisterOrLoginActivityV2.k2(RegisterOrLoginActivityV2.this, 3);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23929, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GetRegisterCodeObj>) obj);
        }
    }

    public class j0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23984, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.J2(RegisterOrLoginActivityV2.this);
        }
    }

    public class k extends com.max.hbcommon.network.d<Result<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23931, new Class[0], Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || RegisterOrLoginActivityV2.this.f78237b0 == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.f78237b0.c();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23930, new Class[]{Throwable.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                if (th2 instanceof ApiException) {
                    String strD = ((ApiException) th2).d();
                    if ("relogin".equals(strD) || "expired".equals(strD) || z0.b.f136024i.equals(strD)) {
                        super.onError(th2);
                    } else {
                        RegisterOrLoginActivityV2.this.tvErrorMsg.setVisibility(0);
                        RegisterOrLoginActivityV2.this.tvErrorMsg.setText(th2.getMessage());
                    }
                } else {
                    super.onError(th2);
                }
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }
        }

        public void onNext(Result<User> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23932, new Class[]{Result.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                com.max.hbcache.c.C("user_account", RegisterOrLoginActivityV2.this.X + RegisterOrLoginActivityV2.this.L);
                com.max.hbcache.c.C("user_bind_phone", RegisterOrLoginActivityV2.this.X + RegisterOrLoginActivityV2.this.L);
                RegisterOrLoginActivityV2.m2(RegisterOrLoginActivityV2.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23933, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<User>) obj);
        }
    }

    public class k0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23985, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.K2(RegisterOrLoginActivityV2.this);
        }
    }

    public class l extends com.max.hbcommon.network.d<Result<GetRegisterCodeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23936, new Class[0], Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || RegisterOrLoginActivityV2.this.f78237b0 == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.f78237b0.c();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23935, new Class[]{Throwable.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                super.onError(th2);
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }
        }

        public void onNext(Result<GetRegisterCodeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23937, new Class[]{Result.class}, Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || result == null || result.getResult() == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.Y = com.max.hbutils.utils.n.q(result.getResult().getRemain_time());
            RegisterOrLoginActivityV2.h2(RegisterOrLoginActivityV2.this);
            RegisterOrLoginActivityV2.this.Z.schedule(RegisterOrLoginActivityV2.this.f78236a0, 1000L, 1000L);
            if (RegisterOrLoginActivityV2.this.M != 6) {
                RegisterOrLoginActivityV2.k2(RegisterOrLoginActivityV2.this, 6);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23938, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GetRegisterCodeObj>) obj);
        }
    }

    public class l0 implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 23986, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.L2(RegisterOrLoginActivityV2.this);
            if (editable.length() <= 0 || !(RegisterOrLoginActivityV2.this.etNumber.getVisibility() == 0 || RegisterOrLoginActivityV2.this.etPwd.getVisibility() == 0)) {
                RegisterOrLoginActivityV2.this.ivDel.setVisibility(8);
                EditText editText = RegisterOrLoginActivityV2.this.etNumber;
                com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
                int i10 = com.max.hbresource.a.f71894b;
                editText.setTypeface(aVar.a(i10));
                RegisterOrLoginActivityV2.this.etPwd.setTypeface(aVar.a(i10));
                return;
            }
            EditText editText2 = RegisterOrLoginActivityV2.this.etNumber;
            com.max.hbresource.a aVar2 = com.max.hbresource.a.f71893a;
            int i11 = com.max.hbresource.a.f71895c;
            editText2.setTypeface(aVar2.a(i11));
            RegisterOrLoginActivityV2.this.etPwd.setTypeface(aVar2.a(i11));
            RegisterOrLoginActivityV2.this.ivDel.setVisibility(0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class m extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23940, new Class[0], Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || RegisterOrLoginActivityV2.this.f78237b0 == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.f78237b0.c();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23939, new Class[]{Throwable.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                super.onError(th2);
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23941, new Class[]{Result.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                RegisterOrLoginActivityV2.this.W = result.getKeyMap().get("sid");
                RegisterOrLoginActivityV2.k2(RegisterOrLoginActivityV2.this, 8);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23942, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class n extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23944, new Class[0], Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || RegisterOrLoginActivityV2.this.f78237b0 == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.f78237b0.c();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23943, new Class[]{Throwable.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                super.onError(th2);
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23945, new Class[]{Result.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                RegisterOrLoginActivityV2.k2(RegisterOrLoginActivityV2.this, 4);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23946, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class o extends com.max.hbcommon.network.d<Result<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23948, new Class[0], Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || RegisterOrLoginActivityV2.this.f78237b0 == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.f78237b0.c();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23947, new Class[]{Throwable.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                if (th2 instanceof ApiException) {
                    String strD = ((ApiException) th2).d();
                    if ("relogin".equals(strD) || "expired".equals(strD) || z0.b.f136024i.equals(strD)) {
                        super.onError(th2);
                    } else {
                        RegisterOrLoginActivityV2.this.tvErrorMsg.setVisibility(0);
                        RegisterOrLoginActivityV2.this.tvErrorMsg.setText(th2.getMessage());
                    }
                } else {
                    super.onError(th2);
                }
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }
        }

        public void onNext(Result<User> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23949, new Class[]{Result.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                com.max.hbcache.c.C("user_account", RegisterOrLoginActivityV2.this.X + RegisterOrLoginActivityV2.this.L);
                com.max.hbcache.c.C("user_bind_phone", RegisterOrLoginActivityV2.this.X + RegisterOrLoginActivityV2.this.L);
                RegisterOrLoginActivityV2.m2(RegisterOrLoginActivityV2.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23950, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<User>) obj);
        }
    }

    public class p implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ User f78276b;

        p(User user) {
            this.f78276b = user;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23951, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.o2(RegisterOrLoginActivityV2.this, this.f78276b);
        }
    }

    public class q extends com.max.hbcommon.network.d<Result<UserGroupInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        public void onNext(Result<UserGroupInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23952, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (result != null && result.getResult() != null) {
                UserGroupInfo result2 = result.getResult();
                if (androidx.exifinterface.media.a.W4.equals(result2.getDisplay_steam_preview())) {
                    com.max.hbcache.c.C("display_steam_preview", "1");
                }
                if (androidx.exifinterface.media.a.W4.equals(result2.getDisplay_steam_icon())) {
                    com.max.hbcache.c.C("display_steam_icon", "1");
                }
                if (androidx.exifinterface.media.a.W4.equals(result2.getDisplay_purchase_guarantee())) {
                    com.max.hbcache.c.C("display_purchase_guarantee", "1");
                }
                if (com.max.hbcommon.utils.c.u(result2.getDisplay_steam_msg())) {
                    com.max.hbcache.c.C("display_steam_msg", "");
                } else {
                    com.max.hbcache.c.C("display_steam_msg", result2.getDisplay_steam_msg());
                }
            }
            com.max.hbcache.c.z("user_guide", "1");
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23953, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserGroupInfo>) obj);
        }
    }

    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23954, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2 registerOrLoginActivityV2 = RegisterOrLoginActivityV2.this;
            registerOrLoginActivityV2.L = registerOrLoginActivityV2.etNumber.getText().toString();
            RegisterOrLoginActivityV2.k2(RegisterOrLoginActivityV2.this, 4);
        }
    }

    public class s extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23955, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Message message = new Message();
            message.what = 1;
            RegisterOrLoginActivityV2.this.O3.sendMessage(message);
        }
    }

    public class t implements com.max.xiaoheihe.utils.l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f78281a;

        t(View view) {
            this.f78281a = view;
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public void a() {
            CheckBox checkBox;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23956, new Class[0], Void.TYPE).isSupported || !RegisterOrLoginActivityV2.this.isActive() || (checkBox = RegisterOrLoginActivityV2.this.cb_privacy) == null) {
                return;
            }
            checkBox.setChecked(true);
            this.f78281a.performClick();
        }
    }

    public class u implements UMAuthListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SHARE_MEDIA f78283a;

        public class a implements UMAuthListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f78285a;

            a(String str) {
                this.f78285a = str;
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i10) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10)}, this, changeQuickRedirect, false, 23963, new Class[]{SHARE_MEDIA.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c.f(RegisterOrLoginActivityV2.this.getString(R.string.cancel));
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), map}, this, changeQuickRedirect, false, 23961, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Map.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (map == null) {
                    com.max.hbutils.utils.c.f(RegisterOrLoginActivityV2.this.getString(R.string.fail));
                } else {
                    RegisterOrLoginActivityV2.x2(RegisterOrLoginActivityV2.this, map.get("unionid"), map.get("openid"), this.f78285a, map.get("profile_image_url"), map.get("screen_name"), map.get(g0.a.G));
                }
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), th2}, this, changeQuickRedirect, false, 23962, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c.f(RegisterOrLoginActivityV2.this.getString(R.string.fail));
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        }

        u(SHARE_MEDIA share_media) {
            this.f78283a = share_media;
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onCancel(SHARE_MEDIA share_media, int i10) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10)}, this, changeQuickRedirect, false, 23960, new Class[]{SHARE_MEDIA.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(RegisterOrLoginActivityV2.this.getString(R.string.cancel));
            if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                RegisterOrLoginActivityV2.this.f78237b0.c();
            }
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), map}, this, changeQuickRedirect, false, 23958, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Map.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = map.get("access_token");
            com.max.hbcommon.utils.d.b("weixinlogin", "  doOauthVerifyonComplete");
            if (com.max.hbcommon.utils.c.u(str) || RegisterOrLoginActivityV2.this.f78239p1 == null) {
                return;
            }
            RegisterOrLoginActivityV2.this.f78239p1.getPlatformInfo(((BaseActivity) RegisterOrLoginActivityV2.this).f66601b, this.f78283a, new a(str));
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), th2}, this, changeQuickRedirect, false, 23959, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(RegisterOrLoginActivityV2.this.getString(R.string.fail));
            if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                RegisterOrLoginActivityV2.this.f78237b0.c();
            }
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onStart(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 23957, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("weixinlogin", "  doOauthVerifyonStart");
        }
    }

    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23934, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            RegisterOrLoginActivityV2.f2(RegisterOrLoginActivityV2.this);
        }
    }

    public class w extends com.max.hbcommon.network.d<Result<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78288b;

        w(String str) {
            this.f78288b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23965, new Class[0], Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                super.onComplete();
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23966, new Class[]{Throwable.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                super.onError(th2);
                if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                    RegisterOrLoginActivityV2.this.f78237b0.c();
                }
            }
        }

        public void onNext(Result<User> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23967, new Class[]{Result.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                com.max.hbcache.c.C("user_account", this.f78288b);
                com.max.hbcommon.utils.d.b("zzzzphone", "onNext==" + result);
                RegisterOrLoginActivityV2.m2(RegisterOrLoginActivityV2.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23968, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<User>) obj);
        }
    }

    public class x extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 23969, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            if (RegisterOrLoginActivityV2.this.Y > 1) {
                RegisterOrLoginActivityV2.e2(RegisterOrLoginActivityV2.this);
            } else if (RegisterOrLoginActivityV2.this.f78236a0 != null) {
                RegisterOrLoginActivityV2.this.f78236a0.cancel();
            }
            RegisterOrLoginActivityV2.L2(RegisterOrLoginActivityV2.this);
        }
    }

    public class y extends com.max.hbcommon.network.d<Result<InterestProfileObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23970, new Class[0], Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                super.onComplete();
                RegisterOrLoginActivityV2.this.f78240p2 = true;
                if (RegisterOrLoginActivityV2.this.f78245y2) {
                    if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                        RegisterOrLoginActivityV2.this.f78237b0.c();
                    }
                    RegisterOrLoginActivityV2.A2(RegisterOrLoginActivityV2.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23971, new Class[]{Throwable.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                super.onError(th2);
                RegisterOrLoginActivityV2.this.f78240p2 = true;
                if (RegisterOrLoginActivityV2.this.f78245y2) {
                    if (RegisterOrLoginActivityV2.this.f78237b0 != null) {
                        RegisterOrLoginActivityV2.this.f78237b0.c();
                    }
                    RegisterOrLoginActivityV2.A2(RegisterOrLoginActivityV2.this);
                }
            }
        }

        public void onNext(Result<InterestProfileObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23972, new Class[]{Result.class}, Void.TYPE).isSupported && RegisterOrLoginActivityV2.this.isActive()) {
                RegisterOrLoginActivityV2.this.f78242x1 = result.getResult();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23973, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<InterestProfileObj>) obj);
        }
    }

    public class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f78292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ User f78293c;

        z(androidx.appcompat.app.c cVar, User user) {
            this.f78292b = cVar;
            this.f78293c = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23974, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78292b.dismiss();
            RegisterOrLoginActivityV2.C2(RegisterOrLoginActivityV2.this, this.f78293c);
        }
    }

    static /* synthetic */ void A2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23913, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.T2();
    }

    private void A3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23859, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 1) {
            this.ibIconBack.setImageResource(R.drawable.account_cross_black_22x22);
            this.vg_privacy.setVisibility(0);
            this.vg_privacy_check.setVisibility(0);
            this.tvTitle.setText(R.string.verification_code_login);
            this.tvToggleLogin.setVisibility(0);
            this.tvToggleLogin.setText(R.string.pwd_login);
            H3(true);
            this.vgAreaCode.setVisibility(0);
            this.vEtLine.setVisibility(0);
            this.tvForgetPwd.setVisibility(8);
            this.petVerificationCode.setVisibility(8);
            this.groupInviteCode.setVisibility(8);
            w3(1);
            this.etPwd.setVisibility(8);
        } else if (i10 == 2) {
            this.ibIconBack.setImageResource(R.drawable.account_cross_black_22x22);
            this.vg_privacy.setVisibility(0);
            this.vg_privacy_check.setVisibility(0);
            this.tvTitle.setText(R.string.pwd_login);
            this.tvToggleLogin.setVisibility(0);
            H3(true);
            this.tvToggleLogin.setText(R.string.verification_code_login);
            this.vgAreaCode.setVisibility(0);
            this.vEtLine.setVisibility(0);
            this.tvForgetPwd.setVisibility(8);
            this.petVerificationCode.setVisibility(8);
            this.groupInviteCode.setVisibility(8);
            w3(1);
            this.etPwd.setVisibility(8);
        } else if (i10 == 3) {
            this.ibIconBack.setImageResource(R.drawable.ic_back_in_login);
            this.vg_privacy.setVisibility(8);
            this.tvTitle.setText(R.string.input_verification_code);
            this.tvToggleLogin.setVisibility(8);
            H3(false);
            this.vgAreaCode.setVisibility(8);
            this.vEtLine.setVisibility(8);
            this.tvForgetPwd.setVisibility(8);
            this.petVerificationCode.setVisibility(0);
            this.groupInviteCode.setVisibility(8);
            this.petVerificationCode.setText("");
            w3(0);
            this.etPwd.setVisibility(8);
        } else if (i10 == 4) {
            this.ibIconBack.setImageResource(R.drawable.ic_back_in_login);
            this.vg_privacy.setVisibility(8);
            this.tvTitle.setText(R.string.input_pwd);
            this.tvToggleLogin.setVisibility(8);
            H3(false);
            this.vgAreaCode.setVisibility(8);
            this.vEtLine.setVisibility(0);
            this.tvForgetPwd.setVisibility(0);
            this.petVerificationCode.setVisibility(8);
            this.groupInviteCode.setVisibility(8);
            w3(0);
            this.etPwd.setVisibility(0);
            this.etPwd.setHint(R.string.input_pwd);
            this.etPwd.setText("");
            this.etPwd.requestFocus();
        } else if (i10 == 6) {
            this.ibIconBack.setImageResource(R.drawable.ic_back_in_login);
            this.vg_privacy.setVisibility(8);
            this.tvTitle.setText(R.string.find_pwd_verify_phone);
            this.tvToggleLogin.setVisibility(8);
            H3(false);
            this.vgAreaCode.setVisibility(8);
            this.vEtLine.setVisibility(8);
            this.tvForgetPwd.setVisibility(8);
            this.petVerificationCode.setVisibility(0);
            this.groupInviteCode.setVisibility(8);
            this.petVerificationCode.setText("");
            w3(0);
            this.etPwd.setVisibility(8);
        } else if (i10 == 8) {
            this.ibIconBack.setImageResource(R.drawable.ic_back_in_login);
            this.vg_privacy.setVisibility(8);
            this.tvTitle.setText(R.string.set_new_pwd);
            this.tvToggleLogin.setVisibility(8);
            H3(false);
            this.vgAreaCode.setVisibility(8);
            this.vEtLine.setVisibility(0);
            this.tvForgetPwd.setVisibility(8);
            this.petVerificationCode.setVisibility(8);
            this.groupInviteCode.setVisibility(8);
            w3(0);
            this.etPwd.setVisibility(0);
            this.etPwd.setHint(R.string.input_new_pwd);
            this.etPwd.setText("");
            this.etPwd.requestFocus();
        }
        this.tvErrorMsg.setVisibility(8);
        this.iv_tips_privacy.setVisibility(8);
        if ((this.etNumber.getVisibility() != 0 || this.etNumber.length() <= 0) && (this.etPwd.getVisibility() != 0 || this.etPwd.length() <= 0)) {
            this.ivDel.setVisibility(8);
        } else {
            this.ivDel.setVisibility(0);
        }
        y3();
    }

    private void B3(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 23853, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        this.auto_offset_background.setBitmap(androidx.core.graphics.drawable.e.a(drawable, ViewUtils.f(this.f66601b, 389.0f), ViewUtils.f(this.f66601b, 253.0f), Bitmap.Config.ARGB_8888));
    }

    static /* synthetic */ void C2(RegisterOrLoginActivityV2 registerOrLoginActivityV2, User user) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2, user}, null, changeQuickRedirect, true, 23914, new Class[]{RegisterOrLoginActivityV2.class, User.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.s3(user);
    }

    private void C3() {
        Activity activity;
        Drawable drawableI;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23852, new Class[0], Void.TYPE).isSupported || (activity = this.f66601b) == null || (drawableI = androidx.core.content.d.i(activity, R.drawable.hb_r_bg_login_page)) == null) {
            return;
        }
        P3(drawableI);
    }

    private void D3() {
    }

    static /* synthetic */ void E2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23915, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.I3();
    }

    private void F3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23871, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78237b0 = new LoadingDialog(this, getString(R.string.setting_new_pwd)).r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().vb(com.max.xiaoheihe.utils.w.a(this.X + this.L), com.max.xiaoheihe.utils.w.a(this.etPwd.getText().toString()), this.W).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    static /* synthetic */ void G2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23899, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.g3();
    }

    private void G3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23891, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J3 = new a0(5000L, 1000L).start();
    }

    static /* synthetic */ void H2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23900, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.F3();
    }

    private void H3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23860, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.vg_login_way.setVisibility(8);
        this.tvWechatLogin.setVisibility(z10 ? 0 : 8);
    }

    static /* synthetic */ void I2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23901, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.S2();
    }

    private void I3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23893, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("如您不同意");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, false, true);
        spannableStringBuilder.append((CharSequence) ("，我们将无法为您提供" + com.max.xiaoheihe.utils.d.A() + "app的完整功能，您可以选择使用仅浏览模式或直接退出应用。"));
        TextView textViewL = com.max.xiaoheihe.view.l.l(this.f66601b);
        textViewL.setText(spannableStringBuilder);
        new com.max.hbcommon.view.a.f(HeyBoxApplication.C().E()).i(textViewL).g(true).w(true).E(0).u("去同意", new e0()).o("仍然体验", new d0()).d().show();
    }

    static /* synthetic */ void J2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23902, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.t3();
    }

    static /* synthetic */ void K2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23903, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.u3();
    }

    static /* synthetic */ void L2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23904, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.y3();
    }

    private void L3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23865, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.C("skip_login", "1");
        T2();
    }

    private void M3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23866, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.U0(this);
    }

    private void N3(String str, String str2, int i10, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10), str3}, this, changeQuickRedirect, false, 23854, new Class[]{String.class, String.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(com.max.hbcache.c.L0, str);
        jsonObject.addProperty("code", Integer.valueOf(i10));
        jsonObject.addProperty("action", str2);
        if (str3 != null) {
            try {
                JsonObject jsonObject2 = (JsonObject) com.max.hbutils.utils.k.a(str3, JsonObject.class);
                jsonObject.addProperty("innerCode", Integer.valueOf(jsonObject2.get("innerCode").getAsInt()));
                String asString = jsonObject2.get("innerDesc").getAsString();
                if (asString != null) {
                    jsonObject.addProperty("innerDesc", asString);
                }
            } catch (Throwable unused) {
            }
        }
        com.max.heybox.hblog.g.W("[OneKeyLogin] upload error: " + jsonObject);
        com.max.hbcommon.analytics.d.d("3", lb.d.f131169h, null, jsonObject);
    }

    static /* synthetic */ void O1(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23897, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.e3();
    }

    private void O2() {
        io.reactivex.disposables.b bVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23887, new Class[0], Void.TYPE).isSupported || (bVar = this.f78243x2) == null) {
            return;
        }
        bVar.dispose();
    }

    private void O3(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23883, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.M;
        if ((i10 != 1 && i10 != 2) || this.cb_privacy.isChecked()) {
            n3(SHARE_MEDIA.WEIXIN);
        } else {
            g0(new t(view));
            com.max.xiaoheihe.utils.d.D0(this);
        }
    }

    private void P2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23880, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O3.removeCallbacksAndMessages(null);
        Timer timer = this.Z;
        if (timer != null) {
            timer.cancel();
        }
        TimerTask timerTask = this.f78236a0;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.Z = new Timer(true);
        this.f78236a0 = new s();
    }

    private void P3(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 23851, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        B3(drawable);
    }

    private void Q2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23877, new Class[0], Void.TYPE).isSupported && "".equals(com.max.hbcache.c.j("user_guide"))) {
            W2();
        }
    }

    private void Q3(String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 23885, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzphone", "wechat_id==" + str);
        HashMap map = new HashMap();
        map.put("wechat_id", str);
        map.put(Constants.JumpUrlConstants.URL_KEY_OPENID, str2);
        map.put("access_token", str3);
        map.put(com.max.xiaoheihe.module.upload.g.f93525b, str4);
        map.put("name", str5);
        map.put(g0.a.G, str6);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().N7(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new w(str5)));
    }

    private void S2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23870, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78237b0 = new LoadingDialog(this, getString(R.string.verification_code_verifying)).r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Wa(com.max.xiaoheihe.utils.w.a(this.X + this.L), this.petVerificationCode.getText().toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    private void T2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23876, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f78240p2) {
            this.f78245y2 = true;
            this.f78237b0 = new LoadingDialog(this, null).r();
            return;
        }
        if (this.f78244y1 != null) {
            Q2();
            Intent intentR1 = InviteCodeActivity.R1(this.f66601b, com.max.hbcache.c.o("user_account", "ID:" + com.max.xiaoheihe.utils.i0.j()), this.f78244y1.getDesc(), com.max.hbutils.utils.k.p(this.f78242x1));
            if (this.L3) {
                intentR1.addFlags(32768);
                intentR1.addFlags(268435456);
            }
            startActivity(intentR1);
            finish();
            return;
        }
        InterestProfileObj interestProfileObj = this.f78242x1;
        if (interestProfileObj != null && (!com.max.hbcommon.utils.c.w(interestProfileObj.getOptions()) || !com.max.hbcommon.utils.c.w(this.f78242x1.getTopic_group_list()))) {
            Intent intentA = InterestInitV2Activity.f77935y2.a(this.f66601b, this.f78242x1);
            if (this.L3) {
                intentA.addFlags(32768);
                intentA.addFlags(268435456);
            }
            startActivity(intentA);
            finish();
            return;
        }
        if (!this.L3) {
            M3();
            return;
        }
        Intent intent = new Intent(this.f66601b, (Class<?>) MainActivity.class);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    static /* synthetic */ void V1(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23905, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.i3();
    }

    private Toast V2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23889, new Class[0], Toast.class);
        if (patchProxyResultProxy.isSupported) {
            return (Toast) patchProxyResultProxy.result;
        }
        Toast toast = new Toast(this.f66601b);
        View viewInflate = ((LayoutInflater) this.f66601b.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.toast_main, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_toast)).setText("请先勾选同意用户协议");
        toast.setView(viewInflate);
        toast.setGravity(17, 0, 0);
        return toast;
    }

    static /* synthetic */ void W1(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23906, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.L3();
    }

    private void W2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23878, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().n8().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q());
    }

    static /* synthetic */ void X1(RegisterOrLoginActivityV2 registerOrLoginActivityV2, View view) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2, view}, null, changeQuickRedirect, true, 23907, new Class[]{RegisterOrLoginActivityV2.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.O3(view);
    }

    public static Intent X2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 23849, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) RegisterOrLoginActivityV2.class);
    }

    public static Intent Y2(Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23848, new Class[]{Context.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) RegisterOrLoginActivityV2.class);
        intent.putExtra(P3, z10);
        return intent;
    }

    private void a3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23886, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78240p2 = false;
        io.reactivex.disposables.b bVar = (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ma().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new y());
        this.f78243x2 = bVar;
        V(bVar);
    }

    static /* synthetic */ int e2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        int i10 = registerOrLoginActivityV2.Y - 1;
        registerOrLoginActivityV2.Y = i10;
        return i10;
    }

    private void e3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23867, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78237b0 = new LoadingDialog(this, getString(R.string.sending_verification_code)).r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d1(com.max.xiaoheihe.utils.w.a(this.X + this.L)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    static /* synthetic */ void f2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23898, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.f3();
    }

    private void f3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23869, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78237b0 = new LoadingDialog(this, getString(R.string.sending_verification_code)).r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C2(com.max.xiaoheihe.utils.w.a(this.X + this.L)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l()));
    }

    private void g3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23863, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.z(this.etNumber, true);
        autoTransition.z(this.tvNumber, true);
        autoTransition.z(this.vgAreaCode, true);
        autoTransition.z(this.vEtLine, true);
        autoTransition.z(this.petVerificationCode, true);
        com.max.hbcustomview.transition.b bVar = new com.max.hbcustomview.transition.b(1, ViewUtils.f(this.f66601b, 68.0f), ViewUtils.f(this.f66601b, 46.0f));
        bVar.c(this.tvNumber);
        com.max.hbcustomview.transition.b bVar2 = new com.max.hbcustomview.transition.b(2, ViewUtils.f(this.f66601b, 68.0f), ViewUtils.f(this.f66601b, 46.0f));
        bVar2.c(this.etNumber);
        com.max.hbcustomview.transition.a aVar = new com.max.hbcustomview.transition.a();
        aVar.c(this.tvNumber);
        aVar.c(this.etNumber);
        Slide slide = new Slide(3);
        slide.c(this.vgAreaCode);
        Slide slide2 = new Slide(5);
        slide2.c(this.vEtLine).c(this.petVerificationCode);
        TransitionSet transitionSetN0 = new TransitionSet().N0(autoTransition).N0(bVar).N0(bVar2).N0(aVar).N0(slide).N0(slide2);
        transitionSetN0.z(this.tvToggleLogin, true);
        transitionSetN0.z(this.tvTitle, true);
        transitionSetN0.z(this.ibIconBack, true);
        androidx.transition.v.b(this.clRoot, transitionSetN0);
        A3(this.M);
    }

    static /* synthetic */ void h2(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2}, null, changeQuickRedirect, true, 23908, new Class[]{RegisterOrLoginActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.P2();
    }

    private void h3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23862, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.M == i10) {
            return;
        }
        this.M = i10;
        g3();
    }

    private void i3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23861, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.M;
        if (i10 == 3) {
            this.M = 1;
        } else if (i10 == 4) {
            this.M = 2;
        } else if (i10 == 6) {
            this.M = 4;
        } else if (i10 == 8) {
            this.M = 6;
        }
        g3();
    }

    static /* synthetic */ void k2(RegisterOrLoginActivityV2 registerOrLoginActivityV2, int i10) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2, new Integer(i10)}, null, changeQuickRedirect, true, 23909, new Class[]{RegisterOrLoginActivityV2.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.h3(i10);
    }

    private void k3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23856, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.P = new a();
        this.Q = new v();
        this.N = new f0();
        this.T = new g0();
        this.S = new h0();
        this.O = new i0();
        this.R = new j0();
        this.U = new k0();
        this.f78238c0 = new l0();
        this.tvPrivacy.setOnClickListener(new b());
        this.vg_privacy_check.setOnClickListener(new c());
        this.cb_privacy.setOnCheckedChangeListener(new d());
    }

    private void l3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23857, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tvAreaCode.setText(this.X);
        bb.d.d(this.tvWechatLogin, 0);
        this.tvWechatLogin.setText("\uf1d7 " + com.max.xiaoheihe.utils.d.n0(R.string.login_by_weixin));
    }

    static /* synthetic */ void m2(RegisterOrLoginActivityV2 registerOrLoginActivityV2, User user) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2, user}, null, changeQuickRedirect, true, 23910, new Class[]{RegisterOrLoginActivityV2.class, User.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.q3(user);
    }

    private void n3(SHARE_MEDIA share_media) {
        if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 23884, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported || this.f78239p1 == null) {
            return;
        }
        this.f78237b0 = new LoadingDialog(this, getString(R.string.logining)).r();
        this.f78239p1.doOauthVerify(this, share_media, new u(share_media));
    }

    static /* synthetic */ void o2(RegisterOrLoginActivityV2 registerOrLoginActivityV2, User user) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2, user}, null, changeQuickRedirect, true, 23911, new Class[]{RegisterOrLoginActivityV2.class, User.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.r3(user);
    }

    private void p3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23855, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        startActivity(new Intent(this.f66601b, (Class<?>) MaxRegisterOrLoginActivity.class));
    }

    private void q3(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 23873, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.L3) {
            com.max.xiaoheihe.utils.d.Z0(this.f66601b, new p(user));
        } else {
            r3(user);
        }
    }

    private void r3(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 23874, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.account.accelworld.a.c(user);
        User userO = com.max.xiaoheihe.utils.i0.o();
        userO.setLoginFlag(true);
        if (!com.max.hbcommon.utils.c.u(user.getPkey())) {
            userO.setPkey(user.getPkey());
        }
        if (user.getAccount_detail() != null) {
            userO.setAccount_detail(user.getAccount_detail());
        }
        if (user.getProfile() != null) {
            userO.setProfile(user.getProfile());
        }
        if (user.getVisitor_enabled() != null) {
            userO.setVisitor_enabled(user.getVisitor_enabled());
        }
        userO.setInvite_info(user.getInvite_info());
        com.max.xiaoheihe.utils.i0.z(userO);
        HeyBoxApplication.C().F();
        this.f78244y1 = user.getInvite_info();
        com.max.xiaoheihe.utils.v.h(this.f66601b);
        sendBroadcast(new Intent(lb.a.f130942c0));
        MainActivity.f76171q5 = user.getTips_state();
        if ("1".equals(com.max.hbcache.c.o("valid_ws", ""))) {
            com.max.xiaoheihe.utils.m0.x().C();
        }
        if (user.getVisitor_info() != null && com.max.hbcommon.utils.c.x(user.getVisitor_enabled())) {
            K3(user);
        } else {
            com.max.hbutils.utils.c.f(getString(R.string.login_success));
            s3(user);
        }
    }

    private void s3(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 23875, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.x(user.getNeed_guide())) {
            this.f78242x1 = null;
            this.f78240p2 = true;
            T2();
        } else {
            if (!com.max.hbcommon.utils.c.x(user.getNeed_refresh())) {
                T2();
                return;
            }
            O2();
            this.f78245y2 = true;
            a3();
        }
    }

    private void t3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23868, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78237b0 = new LoadingDialog(this, getString(R.string.logining)).r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F3(com.max.xiaoheihe.utils.w.a(this.X + this.L), this.petVerificationCode.getText().toString(), !com.max.hbcommon.utils.c.u(this.etInviteCode.getText().toString()) ? this.etInviteCode.getText().toString() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k()));
    }

    private void u3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23872, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78237b0 = new LoadingDialog(this, getString(R.string.logining)).r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X(com.max.xiaoheihe.utils.w.a(this.X + this.L), com.max.xiaoheihe.utils.w.a(this.etPwd.getText().toString())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    private void w3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23864, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 1) {
            this.etNumber.setVisibility(8);
            this.tvNumber.setText(this.L);
            this.tvNumber.setVisibility(0);
        } else {
            if (this.etNumber.getVisibility() != 0) {
                this.etNumber.setText(this.L);
            }
            this.etNumber.setVisibility(0);
            this.tvNumber.setVisibility(8);
        }
    }

    static /* synthetic */ void x2(RegisterOrLoginActivityV2 registerOrLoginActivityV2, String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{registerOrLoginActivityV2, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 23912, new Class[]{RegisterOrLoginActivityV2.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        registerOrLoginActivityV2.Q3(str, str2, str3, str4, str5, str6);
    }

    private void y3() {
        com.max.hbresource.a aVar;
        int i10;
        com.max.hbresource.a aVar2;
        int i11;
        com.max.hbresource.a aVar3;
        int i12;
        com.max.hbresource.a aVar4;
        int i13;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23879, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i14 = this.M;
        if (i14 == 1) {
            this.tvAction.setEnabled(this.etNumber.getText().toString().length() > 0);
            TextView textView = this.tvAction;
            if (this.etNumber.getText().toString().length() > 0) {
                aVar = com.max.hbresource.a.f71893a;
                i10 = com.max.hbresource.a.f71895c;
            } else {
                aVar = com.max.hbresource.a.f71893a;
                i10 = com.max.hbresource.a.f71894b;
            }
            textView.setTypeface(aVar.a(i10));
            this.tvAction.setText(R.string.get_verification_code);
            this.tvAction.setOnClickListener(this.P);
            return;
        }
        if (i14 == 2) {
            this.tvAction.setEnabled(this.etNumber.getText().toString().length() > 0);
            TextView textView2 = this.tvAction;
            if (this.etNumber.getText().toString().length() > 0) {
                aVar2 = com.max.hbresource.a.f71893a;
                i11 = com.max.hbresource.a.f71895c;
            } else {
                aVar2 = com.max.hbresource.a.f71893a;
                i11 = com.max.hbresource.a.f71894b;
            }
            textView2.setTypeface(aVar2.a(i11));
            this.tvAction.setText(R.string.next);
            this.tvAction.setOnClickListener(new r());
            return;
        }
        if (i14 == 3) {
            if (this.petVerificationCode.getText().toString().length() == 4) {
                this.tvAction.setEnabled(true);
                this.tvAction.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                this.tvAction.setText(R.string.login);
                this.tvAction.setOnClickListener(this.R);
                return;
            }
            if (this.Y <= 1) {
                this.tvAction.setEnabled(true);
                this.tvAction.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                this.tvAction.setText("重新发送");
                this.tvAction.setOnClickListener(this.P);
                return;
            }
            this.tvAction.setEnabled(false);
            com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b);
            this.tvAction.setText("重新发送(" + this.Y + "s)");
            return;
        }
        if (i14 == 4) {
            this.tvAction.setEnabled(this.etPwd.getText().toString().length() >= 6);
            TextView textView3 = this.tvAction;
            if (this.etPwd.getText().toString().length() >= 6) {
                aVar3 = com.max.hbresource.a.f71893a;
                i12 = com.max.hbresource.a.f71895c;
            } else {
                aVar3 = com.max.hbresource.a.f71893a;
                i12 = com.max.hbresource.a.f71894b;
            }
            textView3.setTypeface(aVar3.a(i12));
            this.tvAction.setText(R.string.login);
            this.tvAction.setOnClickListener(this.U);
            return;
        }
        if (i14 != 6) {
            if (i14 != 8) {
                return;
            }
            this.tvAction.setEnabled(this.etPwd.getText().toString().length() >= 6);
            TextView textView4 = this.tvAction;
            if (this.etPwd.getText().toString().length() >= 6) {
                aVar4 = com.max.hbresource.a.f71893a;
                i13 = com.max.hbresource.a.f71895c;
            } else {
                aVar4 = com.max.hbresource.a.f71893a;
                i13 = com.max.hbresource.a.f71894b;
            }
            textView4.setTypeface(aVar4.a(i13));
            this.tvAction.setText(R.string.complete);
            this.tvAction.setOnClickListener(this.T);
            return;
        }
        if (this.petVerificationCode.getText().toString().length() == 4) {
            this.tvAction.setEnabled(true);
            this.tvAction.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            this.tvAction.setText(R.string.set_new_pwd);
            this.tvAction.setOnClickListener(this.S);
            return;
        }
        if (this.Y <= 1) {
            this.tvAction.setEnabled(true);
            this.tvAction.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            this.tvAction.setText("重新发送");
            this.tvAction.setOnClickListener(this.Q);
            return;
        }
        this.tvAction.setEnabled(false);
        this.tvAction.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        this.tvAction.setText("重新发送(" + this.Y + "s)");
    }

    public void K3(User user) {
        Activity activity;
        if (PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 23890, new Class[]{User.class}, Void.TYPE).isSupported || (activity = this.f66601b) == null || activity.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.f78237b0;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        com.max.xiaoheihe.utils.d.D0(this);
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(this.f66601b);
        o4 o4VarC = o4.c(LayoutInflater.from(this.f66601b));
        o4VarC.f114089g.setVisibility(8);
        o4VarC.f114086d.setText(user.getVisitor_info().getDesc());
        androidx.appcompat.app.c cVarCreate = aVar.setView(o4VarC.b()).b(false).create();
        o4VarC.f114085c.setVisibility(8);
        o4VarC.f114088f.setText(user.getVisitor_info().getTitle());
        o4VarC.f114087e.setText("进入" + com.max.xiaoheihe.utils.d.A() + "（5秒后自动前往");
        TextView textView = o4VarC.f114087e;
        this.K3 = textView;
        textView.setOnClickListener(new z(cVarCreate, user));
        cVarCreate.getWindow().setBackgroundDrawableResource(R.color.transparent);
        cVarCreate.show();
        G3();
    }

    @Override // com.max.xiaoheihe.module.account.i0
    @androidx.annotation.n0
    public View U() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23895, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : new View(this.f66601b);
    }

    @Override // com.max.xiaoheihe.module.account.i0
    public void W() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23894, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n3(SHARE_MEDIA.WEIXIN);
    }

    @Override // com.max.xiaoheihe.module.account.i0
    public void close() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23896, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        L3();
    }

    @Override // com.max.xiaoheihe.module.account.i0
    public void g0(com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 23892, new Class[]{com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("为了更好地保障您的合法权益，请您阅读并同意以下协议");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, false, false);
        spannableStringBuilder.append((CharSequence) "、");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, false, true);
        TextView textViewL = com.max.xiaoheihe.view.l.l(this.f66601b);
        textViewL.setText(spannableStringBuilder);
        textViewL.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        new com.max.hbcommon.view.a.f(HeyBoxApplication.C().E()).y(com.max.xiaoheihe.utils.d.n0(R.string.privacy_dialog_title)).i(textViewL).g(true).w(true).E(0).u("同意", new c0(gVar)).o("不同意", new b0()).d().show();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23850, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_login);
        this.f66620u = ButterKnife.a(this);
        this.f78239p1 = UMShareAPI.get(this);
        this.L3 = getIntent().getBooleanExtra(P3, false);
        com.max.hbutils.utils.t.X(this, 0, null);
        com.max.hbutils.utils.t.M(this.f66601b, true);
        this.M = 1;
        k3();
        l3();
        this.mask_background.setBackground(com.max.hbgradient.a.b(this, false));
        A3(this.M);
        a3();
        C3();
        com.max.xiaoheihe.utils.h.h(this.f66601b);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23882, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 1 && i11 == -1) {
            String stringExtra = intent.getStringExtra(AreaCodeActivity.Q);
            this.X = stringExtra;
            this.tvAreaCode.setText(stringExtra);
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI uMShareAPI = this.f78239p1;
        if (uMShareAPI != null) {
            uMShareAPI.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23888, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.M;
        if (i10 == 1 || i10 == 2) {
            finish();
        } else {
            i3();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23881, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.O3.removeCallbacksAndMessages(null);
        Timer timer = this.Z;
        if (timer != null) {
            timer.cancel();
            this.Z = null;
        }
        TimerTask timerTask = this.f78236a0;
        if (timerTask != null) {
            timerTask.cancel();
            this.f78236a0 = null;
        }
        CountDownTimer countDownTimer = this.J3;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.J3 = null;
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23858, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.f66601b;
        int iH0 = ViewUtils.h0(activity, ViewUtils.o(activity, this.tvAction));
        StateListDrawable stateListDrawable = new StateListDrawable();
        float f10 = iH0;
        stateListDrawable.addState(new int[]{-16842910}, com.max.hbutils.utils.q.o(this.f66601b, R.color.background_card_1_color, f10));
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, com.max.hbutils.utils.q.o(this.f66601b, R.color.text_primary_1_color, f10));
        this.tvAction.setBackground(stateListDrawable);
        this.ibIconBack.setOnClickListener(new e());
        this.tvToggleLogin.setOnClickListener(this.N);
        this.tvWechatLogin.setOnClickListener(new f());
        this.vgAreaCode.setOnClickListener(new g());
        this.tvForgetPwd.setOnClickListener(this.Q);
        this.tvNumber.setOnClickListener(this.O);
        this.petVerificationCode.setOnPinEnteredListener(new h());
        this.etNumber.addTextChangedListener(this.f78238c0);
        this.etPwd.addTextChangedListener(this.f78238c0);
        this.ivDel.setOnClickListener(new i());
    }

    @Override // com.max.xiaoheihe.module.account.i0
    public void w(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3) {
    }
}
