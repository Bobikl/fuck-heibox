package j;

import java.util.TimerTask;

/* JADX INFO: compiled from: DebounceTask.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f124186b;

    public a(b bVar) {
        this.f124186b = bVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        b bVar = this.f124186b;
        bVar.f124187a = null;
        bVar.f124189c.run();
    }
}
