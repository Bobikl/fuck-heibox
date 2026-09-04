package u4;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: loaded from: classes6.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f140748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f140749c;

    public b(c cVar, DataReportRequest dataReportRequest) {
        this.f140749c = cVar;
        this.f140748b = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DataReportResult unused = c.f140751e = this.f140749c.f140754c.reportData(this.f140748b);
        } catch (Throwable th2) {
            DataReportResult unused2 = c.f140751e = new DataReportResult();
            c.f140751e.success = false;
            c.f140751e.resultCode = "static data rpc upload error, " + e6.a.a(th2);
            e6.a.a(th2);
        }
    }
}
