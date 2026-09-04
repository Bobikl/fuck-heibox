package com.taobao.accs.net;

import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class i implements HttpDispatcher.IDispatchEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f98333a;

    i(h hVar) {
        this.f98333a = hVar;
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        ThreadPoolExecutorFactory.schedule(new j(this), 2000L, TimeUnit.MILLISECONDS);
    }
}
