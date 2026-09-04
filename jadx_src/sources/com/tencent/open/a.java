package com.tencent.open;

import android.app.Dialog;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.tencent.open.log.SLog;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static void a(final Dialog dialog, Handler handler) {
        if (dialog == null || dialog.getContext() == null || handler == null) {
            return;
        }
        Toast.makeText(dialog.getContext(), "网页加载异常，请自行下载并安装QQ后，再重新登录。", 0).show();
        handler.postDelayed(new Runnable() { // from class: com.tencent.open.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dialog.dismiss();
                } catch (Exception e10) {
                    SLog.e("openSDK_LOG.DialogUtils", "dismiss dialog exception", e10);
                }
            }
        }, 100L);
    }

    public static void a(Window window) {
        if (window == null) {
            return;
        }
        window.setFlags(1024, 1024);
        int i10 = Build.VERSION.SDK_INT;
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        if (i10 >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }
}
