package u4;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.w;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f140750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static DataReportResult f140751e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f140752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BugTrackMessageService f140753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DataReportService f140754c;

    public c(Context context, String str) {
        this.f140752a = null;
        this.f140753b = null;
        this.f140754c = null;
        aa aaVar = new aa();
        aaVar.a(str);
        h hVar = new h(context);
        this.f140752a = hVar;
        this.f140753b = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, aaVar);
        this.f140754c = (DataReportService) this.f140752a.a(DataReportService.class, aaVar);
    }

    public static synchronized c e(Context context, String str) {
        if (f140750d == null) {
            f140750d = new c(context, str);
        }
        return f140750d;
    }

    @Override // u4.a
    public DataReportResult a(DataReportRequest dataReportRequest) throws InterruptedException {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f140754c != null) {
            f140751e = null;
            new Thread(new b(this, dataReportRequest)).start();
            for (int i10 = w4.a.f140984a; f140751e == null && i10 >= 0; i10 -= 50) {
                Thread.sleep(50L);
            }
        }
        return f140751e;
    }

    @Override // u4.a
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        if (e6.a.c(str) || (bugTrackMessageService = this.f140753b) == null) {
            return false;
        }
        String strLogCollect = null;
        try {
            strLogCollect = bugTrackMessageService.logCollect(e6.a.j(str));
        } catch (Throwable unused) {
        }
        if (e6.a.c(strLogCollect)) {
            return false;
        }
        return ((Boolean) new JSONObject(strLogCollect).get("success")).booleanValue();
    }
}
