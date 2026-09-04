package com.huawei.hms.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = "intent.extra.DELEGATE_CLASS_OBJECT";
    public static final String EXTRA_DELEGATE_UPDATE_INFO = "intent.extra.update.info";
    public static final String EXTRA_INTENT = "intent.extra.intent";
    public static final String EXTRA_IS_FULLSCREEN = "intent.extra.isfullscreen";
    public static final String EXTRA_RESULT = "intent.extra.RESULT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f60254b = a("ro.build.hw_emui_api_level", 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBridgeActivityDelegate f60255a;

    public class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f60256a;

        a(ViewGroup viewGroup) {
            this.f60256a = viewGroup;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            try {
                Object objInvoke = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx").getMethod("getDisplaySideRegion", WindowInsets.class).invoke(null, windowInsets);
                if (objInvoke == null) {
                    HMSLog.i("BridgeActivity", "sideRegion is null");
                } else {
                    Rect rect = (Rect) Class.forName("com.huawei.android.view.DisplaySideRegionEx").getMethod("getSafeInsets", new Class[0]).invoke(objInvoke, new Object[0]);
                    ViewGroup viewGroup = this.f60256a;
                    if (viewGroup != null) {
                        viewGroup.setPadding(rect.left, 0, rect.right, 0);
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                HMSLog.e("BridgeActivity", "An exception occurred while reading: onApplyWindowInsets" + e10.getMessage());
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    private static int a(String str, int i10) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i10))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("BridgeActivity", "An exception occurred while reading: EMUI_SDK_INT");
            return i10;
        }
    }

    private void a() {
        View viewFindViewById = getWindow().findViewById(R.id.content);
        if (viewFindViewById == null || !(viewFindViewById instanceof ViewGroup)) {
            HMSLog.e("BridgeActivity", "rootView is null or not ViewGroup");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
            cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getDeclaredConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            HMSLog.e("BridgeActivity", "An exception occurred while reading: setDisplaySideMode" + e10.getMessage());
        }
        getWindow().getDecorView().setOnApplyWindowInsetsListener(new a(viewGroup));
    }

    private static void a(Window window, boolean z10) {
        try {
            window.getClass().getMethod("setHwFloating", Boolean.TYPE).invoke(window, Boolean.valueOf(z10));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e10) {
            HMSLog.e("BridgeActivity", "In setHwFloating, Failed to call Window.setHwFloating()." + e10.getMessage());
        }
    }

    private boolean b() {
        Intent intent = getIntent();
        if (intent == null) {
            HMSLog.e("BridgeActivity", "In initialize, Must not pass in a null intent.");
            return false;
        }
        if (intent.getBooleanExtra(EXTRA_IS_FULLSCREEN, false)) {
            getWindow().setFlags(1024, 1024);
        }
        try {
            String stringExtra = intent.getStringExtra(EXTRA_DELEGATE_CLASS_NAME);
            if (stringExtra == null) {
                HMSLog.e("BridgeActivity", "In initialize, Must not pass in a null or non class object.");
                return false;
            }
            IBridgeActivityDelegate iBridgeActivityDelegate = (IBridgeActivityDelegate) Class.forName(stringExtra).asSubclass(IBridgeActivityDelegate.class).newInstance();
            this.f60255a = iBridgeActivityDelegate;
            try {
                iBridgeActivityDelegate.onBridgeActivityCreate(this);
                return true;
            } catch (RuntimeException e10) {
                HMSLog.e("BridgeActivity", "Run time Exception." + e10.getMessage());
                return false;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException e11) {
            HMSLog.e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e11.getMessage());
            return false;
        }
    }

    private void c() {
        try {
            requestWindowFeature(1);
        } catch (Exception e10) {
            HMSLog.w("BridgeActivity", "requestWindowFeature " + e10.getMessage());
        }
        Window window = getWindow();
        if (f60254b >= 9) {
            window.addFlags(67108864);
            a(window, true);
        }
        window.getDecorView().setSystemUiVisibility(0);
    }

    public static Intent getIntentStartBridgeActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activity));
        return intent;
    }

    public static Intent getIntentStartBridgeActivity(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, false);
        return intent;
    }

    public static void setFullScreenWindowLayoutInDisplayCutout(Window window) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(1280);
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes2), 65536);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("BridgeActivity", "com.huawei.android.view.LayoutParamsEx fail");
        }
    }

    @Override // android.app.Activity
    public void finish() {
        HMSLog.i("BridgeActivity", "Enter finish.");
        super.finish();
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        Intent intentModifyIntentBehaviorsSafe = UIUtil.modifyIntentBehaviorsSafe(super.getIntent());
        if (intentModifyIntentBehaviorsSafe != null) {
            return new SafeIntent(intentModifyIntentBehaviorsSafe);
        }
        return null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        super.onActivityResult(i10, i11, safeIntent);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f60255a;
        if (iBridgeActivityDelegate == null || iBridgeActivityDelegate.onBridgeActivityResult(i10, i11, safeIntent) || isFinishing()) {
            return;
        }
        setResult(i11, UIUtil.modifyIntentBehaviorsSafe(safeIntent));
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f60255a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HMSLog.i("BridgeActivity", "BridgeActivity onCreate");
        if (getIntent() == null) {
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        c();
        a();
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(getApplicationContext());
        }
        setFullScreenWindowLayoutInDisplayCutout(getWindow());
        if (b()) {
            return;
        }
        setResult(1, null);
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f60255a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
        HMSLog.i("BridgeActivity", "BridgeActivity onDestroy");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f60255a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onKeyUp(i10, keyEvent);
        }
        return super.onKeyUp(i10, keyEvent);
    }
}
