package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f35775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f35777d;

    public at(String str) {
        this.f35776c = str == null ? getClass().getSimpleName() : str;
    }

    public synchronized Object a() {
        if (!this.f35774a) {
            this.f35775b = null;
            this.f35774a = true;
            f.a().a(this.f35776c + " do lock");
            return null;
        }
        try {
            f.a().a(this.f35776c + " wait lock");
            wait();
            f.a().a(this.f35776c + " after wait, result = " + this.f35775b);
            return this.f35775b;
        } catch (Throwable th2) {
            f.a().a(th2);
            return null;
        }
    }

    public void a(e eVar) {
        this.f35777d = eVar;
        f.a().a("last:" + eVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000c A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:8:0x0008, B:10:0x000c), top: B:19:0x0008, outer: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x000c, please report this as an issue */
    public synchronized void a(Object obj) {
        if (obj != null) {
            this.f35775b = obj;
            try {
                if (this.f35774a) {
                    f.a().a(this.f35776c + " notify wait");
                    notifyAll();
                    this.f35774a = false;
                }
            } catch (Throwable th2) {
                f.a().a(th2);
            }
        } else if (this.f35774a) {
            f.a().a(this.f35776c + " notify wait");
            notifyAll();
            this.f35774a = false;
        }
        throw th;
    }

    public synchronized Object b() {
        if (!this.f35774a) {
            return null;
        }
        try {
            f.a().a(this.f35776c + " wait lock");
            wait();
            f.a().a(this.f35776c + " after wait, result = " + this.f35775b);
            return this.f35775b;
        } catch (Throwable th2) {
            f.a().a(th2);
            return null;
        }
    }

    public e c() {
        f.a().a("last:" + this.f35777d.a());
        return this.f35777d;
    }
}
