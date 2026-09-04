package anet.channel.a;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowStat;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.util.ALog;
import com.taobao.analysis.FlowCenter;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b implements INetworkAnalysis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29603a;

    public b() {
        try {
            Class.forName("com.taobao.analysis.FlowCenter");
            this.f29603a = true;
        } catch (Exception unused) {
            this.f29603a = false;
            ALog.e("DefaultNetworkAnalysis", "no NWNetworkAnalysisSDK sdk", null, new Object[0]);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void commitFlow(FlowStat flowStat) {
        if (this.f29603a) {
            FlowCenter.getInstance().commitFlow(GlobalAppRuntimeInfo.getContext(), flowStat.refer, flowStat.protocoltype, flowStat.req_identifier, flowStat.upstream, flowStat.downstream);
        }
    }
}
