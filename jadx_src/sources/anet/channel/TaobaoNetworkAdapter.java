package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class TaobaoNetworkAdapter implements Serializable {
    public static AtomicBoolean isInited = new AtomicBoolean();

    private static void a(String str, String str2, ConnProtocol connProtocol, boolean z10, boolean z11) {
        StrategyTemplate.getInstance().registerConnProtocol(str, connProtocol);
        if (z10) {
            if (!z11) {
                SessionCenter.getInstance(new Config.Builder().setAppkey(str2).setEnv(ENV.ONLINE).build()).registerSessionInfo(SessionInfo.create(str, z10, false, null, null, null));
            } else {
                SessionCenter.getInstance(new Config.Builder().setAppkey(str2).setEnv(ENV.ONLINE).build()).get(HttpUrl.parse(StringUtils.concatString("https", HttpConstant.SCHEME_SPLIT, str)), anet.channel.entity.c.f29700a, 0L);
            }
        }
    }

    public static void init(Context context, HashMap<String, Object> map) {
        boolean z10;
        if (isInited.compareAndSet(false, true)) {
            if (map != null && AgooConstants.TAOBAO_PACKAGE.equals(map.get(UMModuleRegister.PROCESS))) {
                AwcnConfig.setAccsSessionCreateForbiddenInBg(true);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put("liveng-bfrtc.alibabausercontent.com");
                jSONArray.put("livecb-bfrtc.alibabausercontent.com");
                jSONArray.put("liveca-bfrtc.alibabausercontent.com");
                AwcnConfig.setHttpDnsNotifyWhiteList(jSONArray.toString());
            }
            if (map != null && Constants.CHANNEL_PROCESS_NAME.equals(map.get(UMModuleRegister.PROCESS)) && t3.b.k()) {
                ALog.e("awcn.TaobaoNetworkAdapter", "channelLocalInstanceEnable", null, new Object[0]);
                t3.b.N(false);
            }
            ALog.setLog(new anet.channel.d.a());
            t3.b.M(new anet.channel.c.a());
            AppMonitor.setInstance(new anet.channel.appmonitor.a());
            NetworkAnalysis.setInstance(new anet.channel.a.b());
            anet.channel.fulltrace.a.a(new anet.channel.a.a());
            ThreadPoolExecutorFactory.submitPriorityTask(new j(), ThreadPoolExecutorFactory.Priority.NORMAL);
            if (map != null) {
                try {
                    if (AgooConstants.TAOBAO_PACKAGE.equals(map.get(UMModuleRegister.PROCESS)) && ((Boolean) map.get("isDebuggable")).booleanValue()) {
                        Utils.invokeStaticMethodThrowException("com.taobao.android.request.analysis.RequestRecorder", lg.a.f131415h, new Class[]{Context.class}, context);
                    }
                } catch (Exception e10) {
                    ALog.e("awcn.TaobaoNetworkAdapter", "RequestRecorder error.", null, e10, new Object[0]);
                }
            }
            if (map != null) {
                try {
                    if (!map.containsKey("isNextLaunch") || PreferenceManager.getDefaultSharedPreferences(context).getBoolean(AwcnConfig.NEXT_LAUNCH_FORBID, false)) {
                        z10 = false;
                    } else {
                        GlobalAppRuntimeInfo.addBucketInfo("isNextLaunch", "true");
                        z10 = true;
                    }
                    AwcnConfig.setTbNextLaunch(z10);
                } catch (Exception unused) {
                }
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            boolean z11 = defaultSharedPreferences.getBoolean(AwcnConfig.HTTP3_ENABLE, true);
            AwcnConfig.setHttp3OrangeEnable(z11);
            if (z11 && map != null && AgooConstants.TAOBAO_PACKAGE.equals(map.get(UMModuleRegister.PROCESS))) {
                AwcnConfig.setHttp3Enable(true);
                ALog.e("awcn.TaobaoNetworkAdapter", "http3 enabled.", null, new Object[0]);
            }
            if (map != null) {
                try {
                    String str = (String) map.get(UMModuleRegister.PROCESS);
                    boolean zContainsKey = map.containsKey("ngLaunch");
                    if (AgooConstants.TAOBAO_PACKAGE.equals(str)) {
                        if (defaultSharedPreferences.getBoolean(t3.b.f140641a, true)) {
                            t3.b.C(true);
                            ALog.e("awcn.TaobaoNetworkAdapter", "bindservice optimize enabled.", null, new Object[0]);
                        }
                        String str2 = (String) map.get("onlineAppKey");
                        a("guide-acs.m.taobao.com", str2, ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, ConnType.PK_ACS), true, zContainsKey);
                        ConnProtocol connProtocolValueOf = ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, ConnType.PK_CDN);
                        a("gw.alicdn.com", str2, connProtocolValueOf, false, zContainsKey);
                        a("dorangesource.alicdn.com", str2, connProtocolValueOf, false, zContainsKey);
                        a("ossgw.alicdn.com", str2, connProtocolValueOf, false, zContainsKey);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }
}
