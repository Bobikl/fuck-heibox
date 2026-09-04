package com.taobao.accs.net;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.o0;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Calendar;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PendingIntent f98320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AlarmManager f98321d;

    e(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.g
    protected void a(int i10) {
        if (GlobalConfig.isAlarmHeartbeatEnable()) {
            if (this.f98321d == null) {
                this.f98321d = (AlarmManager) this.f98325a.getSystemService(o0.K0);
            }
            if (this.f98321d == null) {
                ALog.e("AlarmHeartBeatMgr", "setInner null", new Object[0]);
                return;
            }
            if (this.f98320c == null) {
                Intent intent = new Intent();
                intent.setPackage(this.f98325a.getPackageName());
                intent.addFlags(32);
                intent.setAction(Constants.ACTION_COMMAND);
                intent.putExtra("command", 201);
                this.f98320c = PendingIntent.getBroadcast(this.f98325a, 0, intent, 67108864);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.add(13, i10);
            this.f98321d.set(0, calendar.getTimeInMillis(), this.f98320c);
        }
    }
}
