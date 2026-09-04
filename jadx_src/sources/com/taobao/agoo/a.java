package com.taobao.agoo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f98524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BaseNotifyClick f98525b;

    a(BaseNotifyClick baseNotifyClick, Intent intent) {
        this.f98525b = baseNotifyClick;
        this.f98524a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        Intent intent = null;
        try {
            Intent intent2 = this.f98524a;
            if (intent2 != null) {
                String msgByThirdPush = this.f98525b.parseMsgByThirdPush(intent2);
                if (TextUtils.isEmpty(msgByThirdPush) || TextUtils.isEmpty(this.f98525b.msgSource)) {
                    ALog.e("accs.BaseNotifyClick", "parseMsgFromNotifyListener null!!", "source", this.f98525b.msgSource);
                } else {
                    if (this.f98525b.notifyManager == null) {
                        this.f98525b.notifyManager = new NotifManager();
                    }
                    if (this.f98525b.agooFactory == null) {
                        this.f98525b.agooFactory = new AgooFactory();
                        this.f98525b.agooFactory.init(this.f98525b.context, this.f98525b.notifyManager, null);
                    }
                    Bundle bundleMsgReceiverPreHandler = this.f98525b.agooFactory.msgReceiverPreHandler(msgByThirdPush.getBytes("UTF-8"), this.f98525b.msgSource, null, false);
                    String string = bundleMsgReceiverPreHandler.getString("body");
                    ALog.i("accs.BaseNotifyClick", "begin parse EncryptedMsg", new Object[0]);
                    String encryptedMsg = AgooFactory.parseEncryptedMsg(string);
                    if (TextUtils.isEmpty(encryptedMsg)) {
                        ALog.e("accs.BaseNotifyClick", "parse EncryptedMsg fail, empty", new Object[0]);
                    } else {
                        bundleMsgReceiverPreHandler.putString("body", encryptedMsg);
                    }
                    Intent intent3 = new Intent();
                    try {
                        intent3.putExtras(bundleMsgReceiverPreHandler);
                        this.f98525b.agooFactory.saveMsg(msgByThirdPush.getBytes("UTF-8"), "2");
                        this.f98525b.reportClickNotifyMsg(intent3);
                        intent = intent3;
                    } catch (Throwable th2) {
                        intent = intent3;
                        th = th2;
                        try {
                            ALog.e("accs.BaseNotifyClick", "buildMessage", th, new Object[0]);
                            try {
                                this.f98525b.onMessage(intent);
                                return;
                            } catch (Throwable th3) {
                                ALog.e("accs.BaseNotifyClick", "onMessage", th3, new Object[0]);
                                return;
                            }
                        } catch (Throwable th4) {
                            try {
                                this.f98525b.onMessage(intent);
                            } catch (Throwable th5) {
                                ALog.e("accs.BaseNotifyClick", "onMessage", th5, new Object[0]);
                            }
                            throw th4;
                        }
                    }
                }
            }
            try {
                this.f98525b.onMessage(intent);
            } catch (Throwable th6) {
                ALog.e("accs.BaseNotifyClick", "onMessage", th6, new Object[0]);
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
