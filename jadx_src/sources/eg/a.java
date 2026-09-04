package eg;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseTask.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Leg/a;", "Leg/b;", "Leg/c;", ak.aF, "Leg/d;", ak.av, "Lkotlin/b2;", "finish", "Leg/r;", "pb", "<init>", "(Leg/r;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public r f118617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    @xh.e
    public b f118618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private c f118619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private d f118620d;

    public a(@dl.d r pb2) {
        f0.p(pb2, "pb");
        this.f118617a = pb2;
        this.f118619c = new c(pb2, this);
        this.f118620d = new d(this.f118617a, this);
        this.f118619c = new c(this.f118617a, this);
        this.f118620d = new d(this.f118617a, this);
    }

    @Override // eg.b
    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public d getF118620d() {
        return this.f118620d;
    }

    @Override // eg.b
    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public c getF118619c() {
        return this.f118619c;
    }

    @Override // eg.b
    public void finish() {
        b2 b2Var;
        b bVar = this.f118618b;
        if (bVar == null) {
            b2Var = null;
        } else {
            bVar.request();
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f118617a.f118670m);
            arrayList.addAll(this.f118617a.f118671n);
            arrayList.addAll(this.f118617a.f118668k);
            if (this.f118617a.A()) {
                if (bg.c.c(this.f118617a.h(), s.f118679f)) {
                    this.f118617a.f118669l.add(s.f118679f);
                } else {
                    arrayList.add(s.f118679f);
                }
            }
            if (this.f118617a.D() && this.f118617a.k() >= 23) {
                if (Settings.canDrawOverlays(this.f118617a.h())) {
                    this.f118617a.f118669l.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (this.f118617a.E() && this.f118617a.k() >= 23) {
                if (Settings.System.canWrite(this.f118617a.h())) {
                    this.f118617a.f118669l.add("android.permission.WRITE_SETTINGS");
                } else {
                    arrayList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (this.f118617a.C()) {
                if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                    arrayList.add(v.f118685f);
                } else {
                    this.f118617a.f118669l.add(v.f118685f);
                }
            }
            if (this.f118617a.B()) {
                if (Build.VERSION.SDK_INT < 26 || this.f118617a.k() < 26 || !this.f118617a.h().getPackageManager().canRequestPackageInstalls()) {
                    arrayList.add(u.f118683f);
                } else {
                    this.f118617a.f118669l.add(u.f118683f);
                }
            }
            cg.d dVar = this.f118617a.f118674q;
            if (dVar != null) {
                f0.m(dVar);
                dVar.a(arrayList.isEmpty(), new ArrayList(this.f118617a.f118669l), arrayList);
            }
            this.f118617a.p();
            this.f118617a.x();
        }
    }
}
