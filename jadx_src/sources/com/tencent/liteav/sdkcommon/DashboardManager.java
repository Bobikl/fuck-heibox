package com.tencent.liteav.sdkcommon;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::dashboard")
public class DashboardManager {
    private static final int LOG_MAX_SIZE = 15000;
    private static final String TAG = "DashboardManager";
    private final Context mAppContext;
    private final g mDashboardManagerView;
    private boolean mIsInit;
    private final g.a mSelectedDashboardChangeListener;
    private String mSelectedDashboardId;
    private final Handler mUIHandler;
    private final ArrayList<String> mDashboards = new ArrayList<>();
    private final Map<String, String> mDashboardStatus = new HashMap();
    private final Map<String, StringBuilder> mDashboardLogs = new HashMap();

    public DashboardManager() {
        g.a aVar = new g.a() { // from class: com.tencent.liteav.sdkcommon.DashboardManager.1
            @Override // com.tencent.liteav.sdkcommon.g.a
            public final void a(int i10) {
                if (DashboardManager.this.mDashboards.size() <= i10) {
                    return;
                }
                DashboardManager dashboardManager = DashboardManager.this;
                dashboardManager.mSelectedDashboardId = (String) dashboardManager.mDashboards.get(i10);
                if (DashboardManager.this.mDashboards.contains(DashboardManager.this.mSelectedDashboardId)) {
                    DashboardManager.this.mDashboardManagerView.b((String) DashboardManager.this.mDashboardStatus.get(DashboardManager.this.mSelectedDashboardId));
                    StringBuilder sb2 = (StringBuilder) DashboardManager.this.mDashboardLogs.get(DashboardManager.this.mSelectedDashboardId);
                    if (sb2 != null) {
                        DashboardManager.this.mDashboardManagerView.a(sb2.toString());
                    } else {
                        DashboardManager.this.mDashboardManagerView.a("");
                    }
                }
            }
        };
        this.mSelectedDashboardChangeListener = aVar;
        LiteavLog.i(TAG, "java DashBoardManager Construct");
        this.mIsInit = false;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mDashboardManagerView = new g(applicationContext, aVar);
        this.mUIHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDashboardInternal(String str) {
        if (this.mDashboards.contains(str)) {
            return;
        }
        this.mDashboards.add(str);
        g gVar = this.mDashboardManagerView;
        gVar.f99817e.add(str);
        if (gVar.f99824l == null) {
            gVar.f99824l = gVar.f99817e.getItem(0);
            gVar.f99827o.a(0);
        }
        gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendLogInternal(String str, String str2) {
        g gVar;
        TextView textView;
        if (this.mDashboards.contains(str)) {
            StringBuilder sb2 = this.mDashboardLogs.get(str);
            if (sb2 == null) {
                sb2 = new StringBuilder();
                this.mDashboardLogs.put(str, sb2);
            }
            sb2.append(str2);
            sb2.append("\n");
            if (sb2.length() > LOG_MAX_SIZE) {
                sb2.delete(0, sb2.length() / 2);
            }
            if (!str.equals(this.mSelectedDashboardId) || (textView = (gVar = this.mDashboardManagerView).f99821i) == null) {
                return;
            }
            textView.append(str2 + "\n");
            ScrollView scrollView = gVar.f99823k;
            if (scrollView != null) {
                if ((scrollView.getScrollY() + gVar.f99823k.getHeight()) + gVar.a(100) >= gVar.f99821i.getMeasuredHeight()) {
                    gVar.f99816d.post(i.a(gVar));
                }
            }
        }
    }

    private boolean checkPermission() {
        if (LiteavSystemInfo.getSystemOSVersionInt() <= 23 || Settings.canDrawOverlays(this.mAppContext)) {
            return true;
        }
        Toast.makeText(this.mAppContext, "no system alert window permission, please authorize", 0).show();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    private boolean init() {
        boolean z10;
        g gVar;
        if (this.mIsInit) {
            return true;
        }
        g gVar2 = this.mDashboardManagerView;
        Context context = gVar2.f99815c;
        if (context != null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            gVar2.f99818f = windowManager;
            if (windowManager == null) {
                Log.e("DashboardManagerView", "get windowManager is fail", new Object[0]);
            } else {
                windowManager.getDefaultDisplay().getMetrics(gVar2.f99813a);
                gVar2.f99826n = gVar2.f99813a.heightPixels - gVar2.a(50);
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            gVar = this.mDashboardManagerView;
            if (Build.VERSION.SDK_INT >= 26) {
                gVar.f99814b.type = bb.c.d.f31311j;
            } else {
                gVar.f99814b.type = 2002;
            }
            WindowManager.LayoutParams layoutParams = gVar.f99814b;
            layoutParams.format = 1;
            layoutParams.gravity = 8388659;
            layoutParams.width = gVar.f99813a.widthPixels;
            layoutParams.height = gVar.f99826n;
            layoutParams.x = 0;
            layoutParams.y = 0;
            layoutParams.flags = 32;
            LinearLayout linearLayout = new LinearLayout(gVar.f99815c);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            linearLayout.setOrientation(1);
            linearLayout.setOnTouchListener(new g.b(gVar, (byte) 0));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(gVar.a(70), gVar.a(40));
            Button button = new Button(gVar.f99815c);
            button.setText("Resize");
            button.setLayoutParams(layoutParams2);
            button.setOnClickListener(j.a(gVar, button));
            Button button2 = new Button(gVar.f99815c);
            button2.setText("close");
            layoutParams2.leftMargin = gVar.a(10);
            button2.setLayoutParams(layoutParams2);
            button2.setOnClickListener(k.a(gVar));
            LinearLayout linearLayout2 = new LinearLayout(gVar.f99815c);
            linearLayout2.addView(button);
            linearLayout2.addView(button2);
            linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout2.setOrientation(0);
            linearLayout2.setBackgroundColor(-7829368);
            linearLayout2.setAlpha(0.5f);
            linearLayout.addView(linearLayout2);
            Spinner spinner = new Spinner(gVar.f99815c);
            gVar.f99822j = spinner;
            spinner.setAdapter((SpinnerAdapter) gVar.f99817e);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, gVar.a(30));
            layoutParams3.topMargin = gVar.a(2);
            gVar.f99822j.setLayoutParams(layoutParams3);
            gVar.f99822j.setOnItemSelectedListener(new g.c(gVar, (byte) 0));
            gVar.f99822j.setBackgroundColor(-7829368);
            gVar.f99822j.setAlpha(0.5f);
            linearLayout.addView(gVar.f99822j);
            gVar.f99820h = new TextView(gVar.f99815c);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, gVar.a(160));
            layoutParams4.topMargin = gVar.a(10);
            layoutParams4.leftMargin = gVar.a(10);
            layoutParams4.rightMargin = gVar.a(3);
            gVar.f99820h.setLayoutParams(layoutParams4);
            gVar.f99820h.setTextColor(y1.a.f141526c);
            linearLayout.addView(gVar.f99820h);
            gVar.f99823k = new ScrollView(gVar.f99815c);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, gVar.b());
            layoutParams5.leftMargin = gVar.a(10);
            layoutParams5.rightMargin = gVar.a(3);
            gVar.f99823k.setLayoutParams(layoutParams5);
            gVar.f99823k.setVerticalScrollBarEnabled(true);
            gVar.f99821i = new TextView(gVar.f99815c);
            gVar.f99821i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            gVar.f99821i.setTextColor(y1.a.f141526c);
            gVar.f99823k.addView(gVar.f99821i);
            gVar.f99823k.fullScroll(130);
            linearLayout.addView(gVar.f99823k);
            gVar.f99819g = linearLayout;
            gVar.f99827o.a(0);
            this.mIsInit = true;
            return true;
        }
        Log.e("DashboardManagerView", "dashBoardManagerView context is null", new Object[0]);
        z10 = false;
        if (!z10) {
            return false;
        }
        gVar = this.mDashboardManagerView;
        if (Build.VERSION.SDK_INT >= 26) {
            gVar.f99814b.type = bb.c.d.f31311j;
        } else {
            gVar.f99814b.type = 2002;
        }
        WindowManager.LayoutParams layoutParams6 = gVar.f99814b;
        layoutParams6.format = 1;
        layoutParams6.gravity = 8388659;
        layoutParams6.width = gVar.f99813a.widthPixels;
        layoutParams6.height = gVar.f99826n;
        layoutParams6.x = 0;
        layoutParams6.y = 0;
        layoutParams6.flags = 32;
        LinearLayout linearLayout3 = new LinearLayout(gVar.f99815c);
        linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout3.setOrientation(1);
        linearLayout3.setOnTouchListener(new g.b(gVar, (byte) 0));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(gVar.a(70), gVar.a(40));
        Button button3 = new Button(gVar.f99815c);
        button3.setText("Resize");
        button3.setLayoutParams(layoutParams7);
        button3.setOnClickListener(j.a(gVar, button3));
        Button button4 = new Button(gVar.f99815c);
        button4.setText("close");
        layoutParams7.leftMargin = gVar.a(10);
        button4.setLayoutParams(layoutParams7);
        button4.setOnClickListener(k.a(gVar));
        LinearLayout linearLayout4 = new LinearLayout(gVar.f99815c);
        linearLayout4.addView(button3);
        linearLayout4.addView(button4);
        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout4.setOrientation(0);
        linearLayout4.setBackgroundColor(-7829368);
        linearLayout4.setAlpha(0.5f);
        linearLayout3.addView(linearLayout4);
        Spinner spinner2 = new Spinner(gVar.f99815c);
        gVar.f99822j = spinner2;
        spinner2.setAdapter((SpinnerAdapter) gVar.f99817e);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, gVar.a(30));
        layoutParams8.topMargin = gVar.a(2);
        gVar.f99822j.setLayoutParams(layoutParams8);
        gVar.f99822j.setOnItemSelectedListener(new g.c(gVar, (byte) 0));
        gVar.f99822j.setBackgroundColor(-7829368);
        gVar.f99822j.setAlpha(0.5f);
        linearLayout3.addView(gVar.f99822j);
        gVar.f99820h = new TextView(gVar.f99815c);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, gVar.a(160));
        layoutParams9.topMargin = gVar.a(10);
        layoutParams9.leftMargin = gVar.a(10);
        layoutParams9.rightMargin = gVar.a(3);
        gVar.f99820h.setLayoutParams(layoutParams9);
        gVar.f99820h.setTextColor(y1.a.f141526c);
        linearLayout3.addView(gVar.f99820h);
        gVar.f99823k = new ScrollView(gVar.f99815c);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, gVar.b());
        layoutParams10.leftMargin = gVar.a(10);
        layoutParams10.rightMargin = gVar.a(3);
        gVar.f99823k.setLayoutParams(layoutParams10);
        gVar.f99823k.setVerticalScrollBarEnabled(true);
        gVar.f99821i = new TextView(gVar.f99815c);
        gVar.f99821i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        gVar.f99821i.setTextColor(y1.a.f141526c);
        gVar.f99823k.addView(gVar.f99821i);
        gVar.f99823k.fullScroll(130);
        linearLayout3.addView(gVar.f99823k);
        gVar.f99819g = linearLayout3;
        gVar.f99827o.a(0);
        this.mIsInit = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllDashboardInternal() {
        this.mDashboards.clear();
        this.mDashboardStatus.clear();
        this.mDashboardLogs.clear();
        g gVar = this.mDashboardManagerView;
        gVar.f99817e.clear();
        gVar.f99824l = null;
        TextView textView = gVar.f99820h;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = gVar.f99821i;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDashboardInternal(String str) {
        if (this.mDashboards.contains(str)) {
            this.mDashboards.remove(str);
            this.mDashboardStatus.remove(str);
            this.mDashboardLogs.remove(str);
            g gVar = this.mDashboardManagerView;
            if (str.equals(gVar.f99824l)) {
                int position = gVar.f99817e.getPosition(gVar.f99824l);
                if (position != gVar.f99817e.getCount() - 1) {
                    int i10 = position + 1;
                    gVar.f99824l = gVar.f99817e.getItem(i10);
                    gVar.f99827o.a(i10 - 1);
                    Spinner spinner = gVar.f99822j;
                    if (spinner != null) {
                        spinner.setSelection(i10);
                    }
                } else if (position > 0) {
                    int i11 = position - 1;
                    gVar.f99824l = gVar.f99817e.getItem(i11);
                    gVar.f99827o.a(i11);
                    Spinner spinner2 = gVar.f99822j;
                    if (spinner2 != null) {
                        spinner2.setSelection(i11);
                    }
                }
            }
            gVar.f99817e.remove(str);
            if (gVar.f99817e.getCount() == 0) {
                gVar.f99824l = null;
            }
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusInternal(String str, String str2) {
        if (this.mDashboards.contains(str)) {
            this.mDashboardStatus.put(str, str2);
            if (str.equals(this.mSelectedDashboardId)) {
                this.mDashboardManagerView.b(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDashboardInternal(boolean z10) {
        if (!z10 || (checkPermission() && init())) {
            this.mDashboardManagerView.a(z10);
        } else {
            LiteavLog.i(TAG, "init or check permission is fail");
        }
    }

    public int addDashboard(String str) {
        LiteavLog.i(TAG, "addDashboard dashboardId = ".concat(String.valueOf(str)));
        this.mUIHandler.post(b.a(this, str));
        return 0;
    }

    public int appendLog(String str, String str2) {
        this.mUIHandler.post(f.a(this, str, str2));
        return 0;
    }

    public int removeAllDashboard() {
        LiteavLog.i(TAG, "removeAllDashboard ");
        this.mUIHandler.post(d.a(this));
        return 0;
    }

    public int removeDashboard(String str) {
        LiteavLog.i(TAG, "removeDashboard dashboardId = ".concat(String.valueOf(str)));
        this.mUIHandler.post(c.a(this, str));
        return 0;
    }

    public int setStatus(String str, String str2) {
        this.mUIHandler.post(e.a(this, str, str2));
        return 0;
    }

    public int showDashboard(boolean z10) {
        LiteavLog.i(TAG, "showDashBoard isShow = ".concat(String.valueOf(z10)));
        this.mUIHandler.post(a.a(this, z10));
        return 0;
    }
}
