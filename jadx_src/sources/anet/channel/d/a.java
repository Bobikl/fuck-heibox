package anet.channel.d;

import anet.channel.util.ALog;
import com.taobao.tlog.adapter.AdapterForTLog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements ALog.ILog {
    private int a(char c10) {
        if (c10 == 'D') {
            return 1;
        }
        if (c10 == 'E') {
            return 4;
        }
        if (c10 == 'I') {
            return 2;
        }
        if (c10 != 'V') {
            return c10 != 'W' ? 5 : 3;
        }
        return 0;
    }

    @Override // anet.channel.util.ALog.ILog
    public void d(String str, String str2) {
        AdapterForTLog.logd(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public void e(String str, String str2) {
        AdapterForTLog.loge(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public void e(String str, String str2, Throwable th2) {
        AdapterForTLog.loge(str, str2, th2);
    }

    @Override // anet.channel.util.ALog.ILog
    public void i(String str, String str2) {
        AdapterForTLog.logi(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isPrintLog(int i10) {
        return i10 >= a(AdapterForTLog.getLogLevel().charAt(0));
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isValid() {
        return AdapterForTLog.isValid();
    }

    @Override // anet.channel.util.ALog.ILog
    public void setLogLevel(int i10) {
    }

    @Override // anet.channel.util.ALog.ILog
    public void w(String str, String str2) {
        AdapterForTLog.logw(str, str2);
    }

    @Override // anet.channel.util.ALog.ILog
    public void w(String str, String str2, Throwable th2) {
        AdapterForTLog.logw(str, str2, th2);
    }
}
