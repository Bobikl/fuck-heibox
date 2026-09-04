package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tencent.open.log.SLog;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f101068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"NewApi"})
    protected final WebChromeClient f101069b;

    public c(Context context, int i10) {
        super(context, i10);
        this.f101069b = new WebChromeClient() { // from class: com.tencent.open.c.1
            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i11, String str2) {
                SLog.i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + str + " -- From 222 line " + i11 + " of " + str2);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage == null) {
                    return false;
                }
                SLog.i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + consoleMessage.message() + " -- From  111 line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
                c.this.a(consoleMessage.message());
                return true;
            }
        };
    }

    protected abstract void a(String str);

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f101068a = new b();
    }
}
