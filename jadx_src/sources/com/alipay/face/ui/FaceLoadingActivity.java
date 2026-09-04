package com.alipay.face.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.face.R;
import com.alipay.face.WorkState;
import com.alipay.face.api.ZIMFacade;
import com.alipay.face.config.Protocol;
import com.alipay.face.log.RecordLevel;
import com.alipay.face.log.RecordService;
import com.alipay.face.network.model.OCRInfo;
import com.alipay.face.ui.overlay.CommAlertOverlay;
import com.alipay.face.ui.widget.iOSLoadingView;
import com.alipay.face.utils.EnvCheck;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class FaceLoadingActivity extends FaceBaseActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38921e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String[] f38922f = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f38923c = ZIMFacade.ZIM_EXT_PARAMS_VAL_SCREEN_PORT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f38924d = new Handler(new a());

    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (903 == i10) {
                FaceLoadingActivity.this.n((String) message.obj);
                return false;
            }
            if (909 != i10) {
                return false;
            }
            FaceLoadingActivity.this.o();
            return false;
        }
    }

    public class b implements e4.c {
        b() {
        }

        @Override // e4.c
        public String a() {
            return com.alipay.face.c.w().K();
        }

        @Override // e4.c
        public ExecutorService b() {
            return com.alipay.face.network.b.f38805b;
        }

        @Override // e4.c
        public void c(byte[] bArr) {
            com.alipay.face.c.w().k0(bArr);
        }

        @Override // e4.c
        public void d(String str) {
            com.alipay.face.c.w().e0(str);
        }

        @Override // e4.c
        public void e(String str, String str2) {
            OCRInfo oCRInfo = new OCRInfo();
            oCRInfo.name = str;
            oCRInfo.num = str2;
            com.alipay.face.c.w().l0(oCRInfo);
        }

        @Override // e4.c
        public Class<? extends Activity> f() {
            return ToygerPortActivity.class;
        }

        @Override // e4.c
        public void g(byte[] bArr) {
            com.alipay.face.c.w().j0(bArr);
        }

        @Override // e4.c
        public void init() {
            com.alipay.face.c.w().r0(WorkState.INIT);
        }
    }

    public class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38927a;

        c(String str) {
            this.f38927a = str;
        }

        @Override // com.alipay.face.ui.FaceLoadingActivity.f
        public void a() {
            FaceLoadingActivity.this.q(this.f38927a);
        }

        @Override // com.alipay.face.ui.FaceLoadingActivity.f
        public void onCancel() {
        }
    }

    public class d implements com.alipay.face.network.f {
        d() {
        }

        @Override // com.alipay.face.network.f
        public void a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "netInitRes", "netSuccess", "false", "code", String.valueOf(str), "msg", str2);
            FaceLoadingActivity.this.p(str);
        }

        @Override // com.alipay.face.network.f
        public void b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "netInitRes", "status", str, "msg", str2);
            FaceLoadingActivity.this.p(str);
        }

        @Override // com.alipay.face.network.f
        public void onSuccess(String str) {
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_INFO;
            recordService.recordEvent(recordLevel, "netInitRes", "netSuccess", "true", SwitchDetailActivity.P, str);
            try {
                Protocol protocol = (Protocol) JSON.parseObject(str, Protocol.class);
                protocol.parse(protocol.content);
                if (!protocol.isValid()) {
                    RecordService.getInstance().recordEvent(recordLevel, "netInitRes", "parseResult", "false", SwitchDetailActivity.P, str);
                    FaceLoadingActivity.this.p(com.alipay.face.b.a.f38590r);
                } else {
                    com.alipay.face.c.w().f0(protocol);
                    RecordService.getInstance().recordEvent(recordLevel, "netInitRes", "parseResult", "true", SwitchDetailActivity.P, str);
                    FaceLoadingActivity.this.f38924d.sendEmptyMessage(909);
                }
            } catch (Exception unused) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "netInitRes", "parseSuccess", "false", SwitchDetailActivity.P, str);
                FaceLoadingActivity.this.p(com.alipay.face.b.a.f38590r);
            }
        }
    }

    public class e implements CommAlertOverlay.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f38930a;

        e(f fVar) {
            this.f38930a = fVar;
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void a() {
            f fVar = this.f38930a;
            if (fVar != null) {
                fVar.a();
            }
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void onCancel() {
            f fVar = this.f38930a;
            if (fVar != null) {
                fVar.onCancel();
            }
        }
    }

    public interface f {
        void a();

        void onCancel();
    }

    private List<String> k() {
        ArrayList arrayList = new ArrayList();
        for (String str : f38922f) {
            if (checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private void l() {
        int i10 = Build.VERSION.SDK_INT;
        List<String> listK = k();
        if (listK.size() <= 0) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "androidPermssion", "status", "permissions already granted, enter sdk", "android_sdk", String.valueOf(i10));
            m();
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "androidPermission", "status", "permissions not granted, left size=" + listK.size(), "android_sdk", String.valueOf(i10));
        requestPermissions((String[]) listK.toArray(new String[0]), 1024);
    }

    private void m() {
        EnvCheck.EnvErrorType envErrorTypeA = EnvCheck.a();
        if (EnvCheck.EnvErrorType.ENV_SUCCESS != envErrorTypeA) {
            if (EnvCheck.EnvErrorType.ENV_ERROR_LOW_OS == envErrorTypeA) {
                p(com.alipay.face.b.a.f38577e);
            } else if (EnvCheck.EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA == envErrorTypeA) {
                p(com.alipay.face.b.a.f38584l);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enviromentCheck", "result", "false");
            return;
        }
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "enviromentCheck", "result", "success");
        String strK = com.alipay.face.c.w().K();
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra(com.alipay.face.b.f38549c)) ? "" : intent.getStringExtra(com.alipay.face.b.f38549c);
        t(true);
        RecordService.getInstance().recordEvent(recordLevel, "startNetInit", "zimId", strK, "meta", stringExtra);
        com.alipay.face.network.b.d(strK, stringExtra, new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.alipay.face.b.a.f38573a;
        }
        if (!com.alipay.face.c.w().R()) {
            q(str);
        } else {
            if (r(str, new c(str))) {
                return;
            }
            q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Intent intent = null;
        boolean z10 = false;
        if (com.alipay.face.c.w().Q()) {
            try {
                b bVar = new b();
                Method declaredMethod = e4.b.class.getDeclaredMethod("updateOcrCallback", e4.c.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, bVar);
                Method declaredMethod2 = e4.b.class.getDeclaredMethod("startOcr", Context.class);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(null, this);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            if (!TextUtils.isEmpty(this.f38923c) && this.f38923c.equalsIgnoreCase(ZIMFacade.ZIM_EXT_PARAMS_VAL_SCREEN_LAND)) {
                intent = new Intent(this, (Class<?>) ToygerLandActivity.class);
            }
            if (intent == null) {
                intent = new Intent(this, (Class<?>) ToygerPortActivity.class);
            }
            startActivity(intent);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 903;
        messageObtain.obj = str;
        this.f38924d.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "LoadingActivityFinish", "status", com.alipay.sdk.m.x.d.A);
        finish();
        com.alipay.face.c.w().e0(str);
    }

    private boolean r(String str, f fVar) {
        if (str.equalsIgnoreCase(com.alipay.face.b.a.f38590r) || str.equalsIgnoreCase(com.alipay.face.b.a.f38581i) || str.equalsIgnoreCase(com.alipay.face.b.a.f38582j)) {
            s(R.string.F, R.string.f38492w, R.string.f38487r, -1, fVar);
            return true;
        }
        if (!str.equalsIgnoreCase(com.alipay.face.b.a.f38575c) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38586n) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38587o) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38584l) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38577e) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38576d) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38585m)) {
            return false;
        }
        s(R.string.G, R.string.f38493x, R.string.f38487r, -1, fVar);
        return true;
    }

    private void s(int i10, int i11, int i12, int i13, f fVar) {
        t(false);
        CommAlertOverlay commAlertOverlay = (CommAlertOverlay) findViewById(R.id.f38456p);
        if (commAlertOverlay != null) {
            if (i10 > 0) {
                commAlertOverlay.setTitleText(getString(i10));
            }
            if (i11 > 0) {
                commAlertOverlay.setMessageText(getString(i11));
            }
            if (i13 > 0) {
                commAlertOverlay.setButtonType(true);
                commAlertOverlay.setCancelText(getString(i13));
            } else {
                commAlertOverlay.setButtonType(false);
            }
            if (i12 > 0) {
                commAlertOverlay.setConfirmText(getString(i12));
            }
            commAlertOverlay.setVisibility(0);
            commAlertOverlay.setCommAlertOverlayListener(new e(fVar));
        }
    }

    private void t(boolean z10) {
        iOSLoadingView iosloadingview = (iOSLoadingView) findViewById(R.id.f38454n);
        if (iosloadingview != null) {
            if (z10) {
                iosloadingview.setVisibility(0);
            } else {
                iosloadingview.setVisibility(4);
            }
        }
    }

    @Override // com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 26) {
            setRequestedOrientation(1);
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f38923c = intent.getStringExtra(ZIMFacade.ZIM_EXT_PARAMS_KEY_SCREEN_ORIENTATION);
        }
        setContentView(R.layout.f38465a);
        l();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        List<String> listK = k();
        if (i10 != 1024 || listK.size() > 0) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "androidPermission", "status", "permissions not granted after user confirm, exit sdk", "android_sdk", String.valueOf(Build.VERSION.SDK_INT));
            p(com.alipay.face.b.a.f38585m);
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "androidPermission", "status", "permissions granted, after user comfirm, enter sdk", "android_sdk", String.valueOf(Build.VERSION.SDK_INT));
            m();
        }
    }
}
