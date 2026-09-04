package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.work.impl.model.u;
import androidx.work.impl.model.x;
import androidx.work.n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ConstraintsCommandHandler.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28861e = n.i("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f28864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3.e f28865d;

    c(@n0 Context context, int i10, @n0 g gVar) {
        this.f28862a = context;
        this.f28863b = i10;
        this.f28864c = gVar;
        this.f28865d = new o3.e(gVar.g().O(), (o3.c) null);
    }

    @k1
    void a() {
        List<u> listX = this.f28864c.g().P().X().x();
        ConstraintProxy.a(this.f28862a, listX);
        this.f28865d.a(listX);
        ArrayList<u> arrayList = new ArrayList(listX.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (u uVar : listX) {
            String str = uVar.id;
            if (jCurrentTimeMillis >= uVar.c() && (!uVar.B() || this.f28865d.d(str))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str2 = uVar2.id;
            Intent intentB = b.b(this.f28862a, x.a(uVar2));
            n.e().a(f28861e, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f28864c.f().b().execute(new g.b(this.f28864c, intentB, this.f28863b));
        }
        this.f28865d.reset();
    }
}
