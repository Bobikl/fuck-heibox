package cn.fly.verify;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class bm extends bh {
    public bm() {
        super(null, null, bh.a(eh.b("003cff"), (Long) 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<HashMap<String, String>> arrayList) {
        a(((Long) a(eh.b("004c$cbHfe"), 0L)).longValue(), "ALSAMT", arrayList);
        bv.a().a(bv.f35907c, System.currentTimeMillis());
    }

    private boolean m() {
        return by.a(eh.b("003cff"));
    }

    private boolean n() {
        return by.a(eh.b("002NchTd"));
    }

    private boolean o() {
        return by.a(eh.b("002*cf5d"));
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        if (m()) {
            if (!n()) {
                o();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = ((Long) a(eh.b("004c*eh@ic"), 2592000L)).longValue() * 1000;
            long jB = bv.a().b(bv.f35907c, 0L);
            boolean zA = el.a(jCurrentTimeMillis, jB);
            Object obj = this.f35835b;
            final boolean z10 = true;
            boolean z11 = obj != null && (obj instanceof Boolean) && ((Boolean) obj).booleanValue();
            if (jCurrentTimeMillis - jLongValue < jB && zA) {
                z10 = false;
            }
            if (z10 || z11) {
                fz.a(ax.g()).a(false, z11).a(new fz.a() { // from class: cn.fly.verify.bm.1
                    @Override // cn.fly.verify.fz.a
                    public void a(fz.b bVar) {
                        ArrayList<HashMap<String, String>> arrayListD = bVar.d(new int[0]);
                        if (arrayListD == null || arrayListD.isEmpty() || !z10) {
                            return;
                        }
                        bm.this.a(arrayListD);
                    }
                });
            }
        }
    }

    @Override // cn.fly.verify.bh
    protected boolean e() {
        return m() && f();
    }

    @Override // cn.fly.verify.bh
    protected long l() {
        try {
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = calendar.getTimeInMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            calendar.setTime(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
            calendar.add(5, 1);
            long timeInMillis2 = (calendar.getTimeInMillis() - timeInMillis) + ((long) new SecureRandom().nextInt(240000));
            return (timeInMillis2 / 1000) + ((long) (timeInMillis2 % 1000 == 0 ? 0 : 1));
        } catch (Throwable th2) {
            es.a().a(th2);
            return 0L;
        }
    }
}
