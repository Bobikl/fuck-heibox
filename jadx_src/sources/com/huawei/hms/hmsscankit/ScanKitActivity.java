package com.huawei.hms.hmsscankit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.scankit.R;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.w7;

/* JADX INFO: loaded from: classes7.dex */
public class ScanKitActivity extends Activity {
    private static final int REQUEST_SETTING_DETAILS = 1;
    private static final String TAG = "ScanKitActivity";
    static AlertDialog alertDialog;
    static a mDialog;
    private boolean hasCameraPermission;
    private OrientationEventListener mOrientationListener;
    private RemoteView remoteView;
    private int lastRotation = Integer.MAX_VALUE;
    private boolean errorReport = false;
    private boolean showGuide = false;

    private void cameraPermissionChange() {
        a aVar = mDialog;
        if (aVar != null) {
            aVar.dismiss();
        }
        AlertDialog alertDialog2 = alertDialog;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            alertDialog.dismiss();
        }
        if (isFinishing()) {
            return;
        }
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoSetting() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri uriFromParts = Uri.fromParts("package", getPackageName(), null);
        o4.a(TAG, "getPackageName ", getPackageName());
        intent.setData(uriFromParts);
        startActivityForResult(intent, 1);
    }

    private void setActivityUseNotchScreen(Activity activity) {
        if (activity != null) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            activity.getWindow().setAttributes(attributes);
        }
    }

    private void startOrientationChangeListener() {
        OrientationEventListener orientationEventListener = new OrientationEventListener(this) { // from class: com.huawei.hms.hmsscankit.ScanKitActivity.7
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i10) {
                try {
                    int rotation = ScanKitActivity.this.getWindowManager().getDefaultDisplay().getRotation();
                    if (Math.abs(ScanKitActivity.this.lastRotation - rotation) == 2) {
                        ScanKitActivity.this.recreate();
                        Log.i(ScanKitActivity.TAG, "onOrientationChanged: currentRotation" + rotation);
                    }
                    ScanKitActivity.this.lastRotation = rotation;
                } catch (RuntimeException unused) {
                    Log.e(ScanKitActivity.TAG, "onOrientationChanged: RuntimeException");
                }
            }
        };
        this.mOrientationListener = orientationEventListener;
        orientationEventListener.enable();
    }

    @Override // android.app.Activity
    public void finish() {
        this.remoteView.onStop();
        w7.f62539c = true;
        Log.i(TAG, "ScankitActivity finish");
        super.finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.remoteView.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            cameraPermissionChange();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        int intExtra;
        int intExtra2;
        int i10;
        int i11;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.scankit_layout);
        try {
            if (getIntent() != null) {
                intExtra = getIntent().getIntExtra(HmsScanBase.SCAN_FORMAT_FLAG, 0);
                try {
                    intExtra2 = getIntent().getIntExtra(HmsScanBase.SCAN_VIEW_FLAG, 0);
                    try {
                        this.errorReport = getIntent().getBooleanExtra(HmsScanBase.SCAN_ERROR_CHECK_FLAG, false);
                        this.showGuide = getIntent().getBooleanExtra(HmsScanBase.SCAN_GUIDE_FLAG, false);
                    } catch (NullPointerException unused) {
                        o4.d(TAG, "getIntExtra can not get");
                    }
                } catch (NullPointerException unused2) {
                    intExtra2 = 0;
                }
                i11 = intExtra;
                i10 = intExtra2;
            } else {
                i11 = 0;
                i10 = 0;
            }
        } catch (NullPointerException unused3) {
            intExtra = 0;
            intExtra2 = 0;
        }
        boolean zA = w7.a((Context) this);
        this.hasCameraPermission = zA;
        if (!zA && this.showGuide) {
            if (w7.c()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this, getResources().getIdentifier("androidhwext:style/Theme.Emui.Dialog.Alert", null, null));
                builder.setTitle(getString(R.string.permission_dialog_title)).setMessage(getString(R.string.permission_dialog_info)).setPositiveButton(getString(R.string.dialog_go_setting), new DialogInterface.OnClickListener() { // from class: com.huawei.hms.hmsscankit.ScanKitActivity.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i12) {
                        ScanKitActivity.this.gotoSetting();
                    }
                }).setNegativeButton(getString(R.string.dialog_cancel), new DialogInterface.OnClickListener() { // from class: com.huawei.hms.hmsscankit.ScanKitActivity.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i12) {
                    }
                });
                AlertDialog alertDialogCreate = builder.create();
                alertDialog = alertDialogCreate;
                alertDialogCreate.setCanceledOnTouchOutside(false);
                alertDialog.show();
            } else {
                a.c cVar = new a.c(this);
                cVar.b(getString(R.string.permission_dialog_title)).a(getString(R.string.permission_dialog_info)).b(getString(R.string.dialog_go_setting), new DialogInterface.OnClickListener() { // from class: com.huawei.hms.hmsscankit.ScanKitActivity.4
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i12) {
                        ScanKitActivity.this.gotoSetting();
                    }
                }).a(getString(R.string.dialog_cancel), new DialogInterface.OnClickListener() { // from class: com.huawei.hms.hmsscankit.ScanKitActivity.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i12) {
                    }
                });
                a aVarA = cVar.a();
                mDialog = aVarA;
                aVarA.c();
            }
        }
        RemoteView remoteView = new RemoteView(this, false, i11, null, i10, this.hasCameraPermission, this.showGuide);
        this.remoteView = remoteView;
        remoteView.setOnResultCallback(new OnResultCallback() { // from class: com.huawei.hms.hmsscankit.ScanKitActivity.5
            @Override // com.huawei.hms.hmsscankit.OnResultCallback
            public void onResult(HmsScan[] hmsScanArr) {
                HmsScan hmsScan;
                if (hmsScanArr == null || hmsScanArr.length <= 0 || (hmsScan = hmsScanArr[0]) == null || TextUtils.isEmpty(hmsScan.originalValue)) {
                    return;
                }
                Log.i(ScanKitActivity.TAG, "onResult: obtain scanResult begin");
                Intent intent = new Intent();
                intent.putExtra(ScanUtil.RESULT_CODE, 0);
                intent.putExtra(ScanUtil.RESULT, hmsScanArr[0]);
                ScanKitActivity.this.setResult(-1, intent);
                ScanKitActivity.this.finish();
                Log.i(ScanKitActivity.TAG, "onResult: obtain scanResult end");
            }
        });
        this.remoteView.setOnErrorCallback(new OnErrorCallback() { // from class: com.huawei.hms.hmsscankit.ScanKitActivity.6
            @Override // com.huawei.hms.hmsscankit.OnErrorCallback
            public void onError(int i12) {
                Log.i(ScanKitActivity.TAG, "setOnErrorCallback: need report:" + ScanKitActivity.this.errorReport + " errorCode:" + i12);
                if (ScanKitActivity.this.errorReport) {
                    Intent intent = new Intent();
                    intent.putExtra(ScanUtil.RESULT_CODE, i12);
                    ScanKitActivity.this.setResult(-1, intent);
                    ScanKitActivity.this.finish();
                    Log.i(ScanKitActivity.TAG, "onResult: obtain scanResult error end");
                }
            }
        });
        this.remoteView.onCreate(bundle);
        ((ViewGroup) findViewById(R.id.ll_top)).addView(this.remoteView);
        boolean zIsInMultiWindowMode = Build.VERSION.SDK_INT >= 24 ? isInMultiWindowMode() : false;
        Window window = getWindow();
        if (window != null) {
            window.addFlags(201326592);
            if (zIsInMultiWindowMode) {
                window.clearFlags(134217728);
            }
        }
        setActivityUseNotchScreen(this);
        Log.i(TAG, "ScankitActivity on create");
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.remoteView.onDestroy();
        w7.f62539c = true;
        Log.i(TAG, "ScankitActivity onDestroy");
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.remoteView.onPause();
        Log.i(TAG, "ScankitActivity onPause");
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.remoteView.onRequestPermissionsResult(i10, strArr, iArr, this);
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.remoteView.onResume();
        w7.f62539c = false;
        if (!this.hasCameraPermission && w7.a((Context) this)) {
            cameraPermissionChange();
        }
        Log.i(TAG, "ScankitActivity onResume");
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.remoteView.onStart();
        w7.f62539c = false;
        Log.i(TAG, "ScankitActivity onStart");
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (!w7.f62539c) {
            this.remoteView.onStop();
            w7.f62539c = true;
        }
        Log.i(TAG, "ScankitActivity onStop");
    }
}
