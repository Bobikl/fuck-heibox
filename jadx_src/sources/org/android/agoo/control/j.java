package org.android.agoo.control;

import org.android.agoo.message.MessageService;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BaseIntentService f132840a;

    j(BaseIntentService baseIntentService) {
        this.f132840a = baseIntentService;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.taobao.accs.client.a.f98190f.incrementAndGet();
        this.f132840a.notifyManager = new NotifManager();
        this.f132840a.notifyManager.init(this.f132840a.getApplicationContext());
        this.f132840a.messageService = new MessageService();
        this.f132840a.messageService.a(this.f132840a.getApplicationContext());
        this.f132840a.agooFactory = new AgooFactory();
        this.f132840a.agooFactory.init(this.f132840a.getApplicationContext(), this.f132840a.notifyManager, this.f132840a.messageService);
    }
}
