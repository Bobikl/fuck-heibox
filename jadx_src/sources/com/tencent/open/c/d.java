package com.tencent.open.c;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.open.log.SLog;
import com.tencent.open.web.security.SecureJsInterface;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f101075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private KeyEvent f101076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.tencent.open.web.security.a f101077c;

    public d(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode;
        int unicodeChar;
        SLog.d("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + f101075a);
        if (f101075a && keyEvent.getAction() == 0 && (keyCode = keyEvent.getKeyCode()) != 4 && keyCode != 66) {
            if (keyCode == 67) {
                com.tencent.open.web.security.a.f101205b = true;
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getUnicodeChar() == 0) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (!SecureJsInterface.isPWDEdit || (((unicodeChar = keyEvent.getUnicodeChar()) < 33 || unicodeChar > 95) && (unicodeChar < 97 || unicodeChar > 125))) {
                return super.dispatchKeyEvent(keyEvent);
            }
            KeyEvent keyEvent2 = new KeyEvent(0, 17);
            this.f101076b = keyEvent2;
            return super.dispatchKeyEvent(keyEvent2);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        SLog.i("openSDK_LOG.SecureWebView", "-->create input connection, is edit: " + SecureJsInterface.isPWDEdit);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        SLog.v("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection == null) {
            f101075a = false;
            return inputConnectionOnCreateInputConnection;
        }
        f101075a = true;
        com.tencent.open.web.security.a aVar = new com.tencent.open.web.security.a(super.onCreateInputConnection(editorInfo), false);
        this.f101077c = aVar;
        return aVar;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        int keyCode;
        int unicodeChar;
        SLog.d("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + f101075a);
        if (f101075a && keyEvent.getAction() == 0 && (keyCode = keyEvent.getKeyCode()) != 4 && keyCode != 66) {
            if (keyCode == 67) {
                com.tencent.open.web.security.a.f101205b = true;
                return super.onKeyDown(i10, keyEvent);
            }
            if (keyEvent.getUnicodeChar() == 0) {
                return super.onKeyDown(i10, keyEvent);
            }
            if (!SecureJsInterface.isPWDEdit || (((unicodeChar = keyEvent.getUnicodeChar()) < 33 || unicodeChar > 95) && (unicodeChar < 97 || unicodeChar > 125))) {
                return super.onKeyDown(i10, keyEvent);
            }
            KeyEvent keyEvent2 = new KeyEvent(0, 17);
            this.f101076b = keyEvent2;
            return super.onKeyDown(keyEvent2.getKeyCode(), this.f101076b);
        }
        return super.onKeyDown(i10, keyEvent);
    }
}
