package com.igexin.assist.action;

import android.text.TextUtils;
import com.igexin.assist.MessageBean;
import com.igexin.assist.sdk.AssistPushConsts;

/* JADX INFO: loaded from: classes7.dex */
public class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MessageBean f63292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MessageManger f63293b;

    b(MessageManger messageManger, MessageBean messageBean) {
        this.f63293b = messageManger;
        this.f63292a = messageBean;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            MessageBean messageBean = this.f63292a;
            if (messageBean != null) {
                if (messageBean.getMessageType().equals("token")) {
                    String stringMessage = this.f63292a.getStringMessage();
                    com.igexin.a.a.c.b.a("Assist_MessageManger|token = " + stringMessage, new Object[0]);
                    this.f63293b.a(this.f63292a.getContext(), stringMessage, this.f63292a.extra.getBoolean("isForce"));
                } else if (this.f63292a.getMessageType().equals(AssistPushConsts.MSG_TYPE_PAYLOAD)) {
                    if (!TextUtils.isEmpty(this.f63292a.getStringMessage())) {
                        d dVar = new d();
                        dVar.a(this.f63292a);
                        if (dVar.a(false) && dVar.e().equals(AssistPushConsts.MSG_VALUE_PAYLOAD)) {
                            this.f63293b.a(dVar, this.f63292a.getContext());
                        }
                    }
                } else if (this.f63292a.getMessageType().equals(AssistPushConsts.MSG_TYPE_ACTIONS)) {
                    String stringMessage2 = this.f63292a.getStringMessage();
                    com.igexin.a.a.c.b.a("Assist_MessageManger|actions = " + stringMessage2, new Object[0]);
                    if (!TextUtils.isEmpty(stringMessage2)) {
                        d dVar2 = new d();
                        dVar2.a(this.f63292a);
                        if (dVar2.a(true) && dVar2.e().equals(AssistPushConsts.MSG_VALUE_PAYLOAD)) {
                            this.f63293b.a(this.f63292a.getContext(), dVar2);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("Assist_MessageManger|err = " + th2.toString(), new Object[0]);
            th2.printStackTrace();
        }
    }
}
