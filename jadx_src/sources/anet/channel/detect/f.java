package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import com.max.hbuikit.bean.param.UiKitSpanObj;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class f implements AppLifecycle.AppLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f29651a;

    f(d dVar) {
        this.f29651a = dVar;
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void background() {
        ALog.i("anet.HorseRaceDetector", UiKitSpanObj.TYPE_BACKGROUND, null, new Object[0]);
        if (AwcnConfig.isHorseRaceEnable()) {
            ThreadPoolExecutorFactory.submitHRTask(new g(this));
        }
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void forground() {
    }
}
