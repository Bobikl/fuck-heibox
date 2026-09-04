package anet.channel.fulltrace;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile IFullTraceAnalysis f29706a = new C0242a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f29707b = false;

    /* JADX INFO: renamed from: anet.channel.fulltrace.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public static class C0242a implements IFullTraceAnalysis {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IFullTraceAnalysis f29708a;

        C0242a(IFullTraceAnalysis iFullTraceAnalysis) {
            this.f29708a = iFullTraceAnalysis;
            boolean unused = a.f29707b = true;
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public void commitRequest(String str, RequestStatistic requestStatistic) {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (a.f29707b && (iFullTraceAnalysis = this.f29708a) != null) {
                try {
                    iFullTraceAnalysis.commitRequest(str, requestStatistic);
                } catch (Throwable th2) {
                    boolean unused = a.f29707b = false;
                    ALog.e("anet.AnalysisFactory", "fulltrace commit fail.", null, th2, new Object[0]);
                }
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public String createRequest() {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (!a.f29707b || (iFullTraceAnalysis = this.f29708a) == null) {
                return null;
            }
            try {
                return iFullTraceAnalysis.createRequest();
            } catch (Throwable th2) {
                boolean unused = a.f29707b = false;
                ALog.e("anet.AnalysisFactory", "createRequest fail.", null, th2, new Object[0]);
                return null;
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public b getSceneInfo() {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (!a.f29707b || (iFullTraceAnalysis = this.f29708a) == null) {
                return null;
            }
            try {
                return iFullTraceAnalysis.getSceneInfo();
            } catch (Throwable th2) {
                boolean unused = a.f29707b = false;
                ALog.e("anet.AnalysisFactory", "getSceneInfo fail", null, th2, new Object[0]);
                return null;
            }
        }
    }

    public static IFullTraceAnalysis a() {
        return f29706a;
    }

    public static void a(IFullTraceAnalysis iFullTraceAnalysis) {
        f29706a = new C0242a(iFullTraceAnalysis);
    }
}
