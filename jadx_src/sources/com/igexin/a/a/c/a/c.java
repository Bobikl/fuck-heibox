package com.igexin.a.a.c.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import com.igexin.push.core.x;
import com.igexin.sdk.IUserLoggerInterface;
import com.igexin.sdk.PushManager;

/* JADX INFO: loaded from: classes7.dex */
public class c extends Handler implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Messenger f63198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Messenger f63199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f63200d;

    private c() {
        super(Looper.getMainLooper());
        this.f63197a = "LOG-LogController";
        this.f63200d = new a();
    }

    public static c a() {
        return e.f63201a;
    }

    private void a(Context context) {
        com.igexin.a.a.c.b.a("try to bind log server", new Object[0]);
        try {
            Intent intent = new Intent(context, (Class<?>) x.a().b(context));
            intent.setType("SERVER_LOG");
            context.bindService(intent, this, 1);
        } catch (Exception e10) {
            Log.e("LOG-LogController", "bind service error = " + e10.toString());
        }
    }

    public void a(Context context, IUserLoggerInterface iUserLoggerInterface) {
        if (iUserLoggerInterface == null) {
            Log.i("LOG-LogController", "register parameter can not be null!");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        a(applicationContext);
        this.f63200d.a(iUserLoggerInterface);
        this.f63200d.a();
        a("[LOG-LogController] Sdk version = " + PushManager.getInstance().getVersion(applicationContext));
    }

    public void a(String str) {
        b bVar = this.f63200d;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 2) {
            String string = message.getData().getString("log_data");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (!string.contains("\n")) {
                this.f63200d.a(string);
                return;
            }
            for (String str : string.split("\n")) {
                this.f63200d.a(str);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.igexin.a.a.c.b.a("remote log service connected ", new Object[0]);
        try {
            this.f63199c = new Messenger(iBinder);
            if (this.f63198b == null) {
                this.f63198b = new Messenger(this);
            }
            Message messageObtain = Message.obtain();
            messageObtain.replyTo = this.f63198b;
            messageObtain.what = 1;
            this.f63199c.send(messageObtain);
        } catch (Exception e10) {
            a("Client sent Message to Service error = " + e10);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f63199c = null;
    }
}
