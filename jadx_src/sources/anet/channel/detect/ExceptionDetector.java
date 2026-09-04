package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.android.netutil.NetUtils;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class ExceptionDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f29630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f29631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f29632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f29633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    LimitedQueue<Pair<String, Integer>> f29634e = new LimitedQueue<>(10);

    /* JADX INFO: compiled from: Taobao */
    public class LimitedQueue<E> extends LinkedList<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29636b;

        public LimitedQueue(int i10) {
            this.f29636b = i10;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e10) {
            boolean zAdd = super.add(e10);
            while (zAdd && size() > this.f29636b) {
                super.remove();
            }
            return zAdd;
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f29637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f29638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f29639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Future<PingResponse> f29640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Future<PingResponse> f29641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Future<PingResponse> f29642f;

        private a() {
        }

        /* synthetic */ a(ExceptionDetector exceptionDetector, anet.channel.detect.a aVar) {
            this();
        }
    }

    ExceptionDetector() {
    }

    private a a(String str, String str2) {
        a aVar = new a(this, null);
        aVar.f29637a = str;
        try {
            aVar.f29638b = InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
            if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
                aVar.f29639c = connStrategyListByHost.get(0).getIp();
            }
        } else {
            aVar.f29639c = str2;
        }
        String str3 = !TextUtils.isEmpty(aVar.f29639c) ? aVar.f29639c : aVar.f29638b;
        if (!TextUtils.isEmpty(str3)) {
            String str4 = str3;
            aVar.f29640d = new PingTask(str4, 1000, 3, 0, 0).launch();
            aVar.f29641e = new PingTask(str4, 1000, 3, bb.c.b.Cj, 0).launch();
            aVar.f29642f = new PingTask(str4, 1000, 3, bb.c.b.Co, 0).launch();
        }
        return aVar;
    }

    private ArrayList<String> a(String str, int i10) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i11 = 0;
        while (i11 < i10) {
            i11++;
            PingResponse pingResponse = null;
            try {
                pingResponse = (PingResponse) new PingTask(str, 0, 1, 0, i11).launch().get();
            } catch (Exception unused) {
            }
            StringBuilder sb2 = new StringBuilder();
            if (pingResponse != null) {
                String lastHopIPStr = pingResponse.getLastHopIPStr();
                double d10 = pingResponse.getResults()[0].rtt;
                int errcode = pingResponse.getErrcode();
                if (TextUtils.isEmpty(lastHopIPStr)) {
                    lastHopIPStr = androidx.webkit.b.f28327e;
                }
                sb2.append("hop=");
                sb2.append(lastHopIPStr);
                sb2.append(",rtt=");
                sb2.append(d10);
                sb2.append(",errCode=");
                sb2.append(errcode);
            }
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    private JSONObject a(a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (aVar != null && aVar.f29640d != null) {
            jSONObject.put("host", aVar.f29637a);
            jSONObject.put("currentIp", aVar.f29639c);
            jSONObject.put("localIp", aVar.f29638b);
            jSONObject.put("ping", a(aVar.f29640d));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("1200", a(aVar.f29641e));
            jSONObject2.put("1460", a(aVar.f29642f));
            jSONObject.put("MTU", jSONObject2);
            if ("guide-acs.m.taobao.com".equals(aVar.f29637a)) {
                ArrayList<String> arrayListA = a(!TextUtils.isEmpty(aVar.f29639c) ? aVar.f29639c : aVar.f29638b, 5);
                JSONObject jSONObject3 = new JSONObject();
                int i10 = 0;
                while (i10 < arrayListA.size()) {
                    int i11 = i10 + 1;
                    jSONObject3.put(String.valueOf(i11), arrayListA.get(i10));
                    i10 = i11;
                }
                jSONObject.put("traceRoute", jSONObject3);
            }
        }
        return jSONObject;
    }

    private JSONObject a(Future<PingResponse> future) throws ExecutionException, JSONException, InterruptedException {
        JSONObject jSONObject = new JSONObject();
        if (future == null) {
            return jSONObject;
        }
        PingResponse pingResponse = null;
        try {
            pingResponse = future.get();
        } catch (Exception unused) {
        }
        if (pingResponse == null) {
            return jSONObject;
        }
        jSONObject.put(i7.a.i.f119320o, pingResponse.getErrcode());
        JSONArray jSONArray = new JSONArray();
        for (PingEntry pingEntry : pingResponse.getResults()) {
            jSONArray.put("seq=" + pingEntry.seq + ",hop=" + pingEntry.hop + ",rtt=" + pingEntry.rtt);
        }
        jSONObject.put("response", jSONArray);
        return jSONObject;
    }

    public void a() {
        NetworkStatusHelper.addStatusChangeListener(new anet.channel.detect.a(this));
    }

    public void a(RequestStatistic requestStatistic) {
        if (AwcnConfig.isNetworkDetectEnable()) {
            ThreadPoolExecutorFactory.submitDetectTask(new c(this, requestStatistic));
        } else {
            ALog.i("anet.ExceptionDetector", "network detect closed.", null, new Object[0]);
        }
    }

    void b() throws JSONException {
        ALog.e("anet.ExceptionDetector", "network detect start.", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        jSONObject2.put("status", status.getType());
        jSONObject2.put("subType", NetworkStatusHelper.getNetworkSubType());
        if (status != NetworkStatusHelper.NetworkStatus.NO) {
            if (status.isMobile()) {
                jSONObject2.put("apn", NetworkStatusHelper.getApn());
                jSONObject2.put("carrier", NetworkStatusHelper.getCarrier());
            } else {
                jSONObject2.put("bssid", NetworkStatusHelper.getWifiBSSID());
                jSONObject2.put(TPDownloadProxyEnum.USER_SSID, NetworkStatusHelper.getWifiSSID());
            }
            jSONObject2.put(WebviewFragment.A4, NetworkStatusHelper.getProxyType());
        }
        jSONObject.put("NetworkInfo", jSONObject2);
        String defaultGateway = status.isWifi() ? NetUtils.getDefaultGateway("114.114.114.114") : NetUtils.getPreferNextHop("114.114.114.114", 2);
        Future<PingResponse> futureLaunch = !TextUtils.isEmpty(defaultGateway) ? new PingTask(defaultGateway, 1000, 3, 0, 0).launch() : null;
        a aVarA = a("guide-acs.m.taobao.com", this.f29631b);
        a aVarA2 = a("gw.alicdn.com", this.f29633d);
        a aVarA3 = a("msgacs.m.taobao.com", this.f29632c);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("nextHop", defaultGateway);
        jSONObject3.put("ping", a(futureLaunch));
        jSONObject.put("LocalDetect", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(a(aVarA));
        jSONArray.put(a(aVarA2));
        jSONArray.put(a(aVarA3));
        jSONObject.put("InternetDetect", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        for (Pair<String, Integer> pair : this.f29634e) {
            jSONObject4.put((String) pair.first, pair.second);
        }
        jSONObject.put("BizDetect", jSONObject4);
        this.f29634e.clear();
        ALog.e("anet.ExceptionDetector", "network detect result: " + jSONObject.toString(), null, new Object[0]);
    }

    boolean c() {
        if (this.f29634e.size() != 10) {
            return false;
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.NO) {
            ALog.e("anet.ExceptionDetector", "no network", null, new Object[0]);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.f29630a) {
            return false;
        }
        Iterator<Pair<String, Integer>> it = this.f29634e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next().second).intValue();
            if (iIntValue == -202 || iIntValue == -400 || iIntValue == -401 || iIntValue == -405 || iIntValue == -406) {
                i10++;
            }
        }
        boolean z10 = i10 * 2 > 10;
        if (z10) {
            this.f29630a = jCurrentTimeMillis + 1800000;
        }
        return z10;
    }
}
