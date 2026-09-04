package com.huawei.agconnect.core.a;

import com.huawei.agconnect.AGCInitFinishManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class a extends AGCInitFinishManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<AGCInitFinishManager.AGCInitFinishCallback> f60165a = new CopyOnWriteArrayList();

    public static void a() {
        Iterator<AGCInitFinishManager.AGCInitFinishCallback> it = f60165a.iterator();
        while (it.hasNext()) {
            it.next().onFinish();
        }
    }

    @Override // com.huawei.agconnect.AGCInitFinishManager
    public void addAGCInitFinishCallback(AGCInitFinishManager.AGCInitFinishCallback aGCInitFinishCallback) {
        if (aGCInitFinishCallback != null) {
            f60165a.add(aGCInitFinishCallback);
        }
    }
}
