package anet.channel.strategy;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.google.android.gms.common.internal.s;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class g implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f29932a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    StrategyInfoHolder f29933b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f29934c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    CopyOnWriteArraySet<IStrategyListener> f29935d = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IStrategyFilter f29936e = new h(this);

    g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        if (this.f29933b != null) {
            return false;
        }
        ALog.w("StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.f29932a));
        return true;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void forceRefreshStrategy(String str) {
        if (a() || TextUtils.isEmpty(str)) {
            return;
        }
        ALog.i("awcn.StrategyCenter", "force refresh strategy", null, "host", str);
        this.f29933b.d().a(str, true);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getCNameByHost(String str) {
        if (a() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f29933b.d().getCnameByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getClientIp() {
        return a() ? "" : this.f29933b.d().f29898b;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        return getConnStrategyListByHost(str, this.f29936e);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter) {
        if (TextUtils.isEmpty(str) || a()) {
            return Collections.EMPTY_LIST;
        }
        String cnameByHost = this.f29933b.d().getCnameByHost(str);
        if (!TextUtils.isEmpty(cnameByHost)) {
            str = cnameByHost;
        }
        List listQueryByHost = this.f29933b.d().queryByHost(str);
        if (listQueryByHost.isEmpty()) {
            listQueryByHost = this.f29933b.f29888c.a(str);
        }
        if (listQueryByHost.isEmpty() || iStrategyFilter == null) {
            ALog.d("getConnStrategyListByHost", null, "host", str, "result", listQueryByHost);
            return listQueryByHost;
        }
        boolean z10 = !AwcnConfig.isIpv6Enable() || (AwcnConfig.isIpv6BlackListEnable() && this.f29933b.d().a(str, AwcnConfig.getIpv6BlackListTtl()));
        ListIterator<IConnStrategy> listIterator = listQueryByHost.listIterator();
        while (listIterator.hasNext()) {
            IConnStrategy next = listIterator.next();
            if (!iStrategyFilter.accept(next)) {
                listIterator.remove();
            } else if (z10 && anet.channel.strategy.utils.c.b(next.getIp())) {
                listIterator.remove();
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("getConnStrategyListByHost", null, "host", str, "result", listQueryByHost);
        }
        return listQueryByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getFormalizeUrl(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl == null) {
            ALog.e("awcn.StrategyCenter", "url is invalid.", null, "URL", str);
            return null;
        }
        String strUrlString = httpUrl.urlString();
        try {
            String schemeByHost = getSchemeByHost(httpUrl.host(), httpUrl.scheme());
            if (!schemeByHost.equalsIgnoreCase(httpUrl.scheme())) {
                strUrlString = StringUtils.concatString(schemeByHost, ":", str.substring(str.indexOf("//")));
            }
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.StrategyCenter", "", null, "raw", StringUtils.simplifyString(str, 128), "ret", StringUtils.simplifyString(strUrlString, 128));
            }
        } catch (Exception e10) {
            ALog.e("awcn.StrategyCenter", "getFormalizeUrl failed", null, e10, "raw", str);
        }
        return strUrlString;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    @Deprecated
    public String getSchemeByHost(String str) {
        return getSchemeByHost(str, null);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (a()) {
            return str2;
        }
        String strA = this.f29933b.f29887b.a(str);
        if (strA != null || TextUtils.isEmpty(str2)) {
            str2 = strA;
        }
        if (str2 == null && (str2 = c.a.f29911a.a(str)) == null) {
            str2 = "http";
        }
        ALog.d("awcn.StrategyCenter", "getSchemeByHost", null, "host", str, "scheme", str2);
        return str2;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUnitByHost(String str) {
        if (a()) {
            return null;
        }
        return this.f29933b.f29887b.b(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void initialize(Context context) {
        if (this.f29932a || context == null) {
            return;
        }
        try {
            ALog.i("awcn.StrategyCenter", "StrategyCenter initialize started.", null, new Object[0]);
            AmdcRuntimeInfo.setContext(context);
            m.a(context);
            HttpDispatcher.getInstance().addListener(this);
            this.f29933b = StrategyInfoHolder.a();
            this.f29932a = true;
            ALog.i("awcn.StrategyCenter", "StrategyCenter initialize finished.", null, new Object[0]);
        } catch (Exception e10) {
            ALog.e("awcn.StrategyCenter", "StrategyCenter initialize failed.", null, e10, new Object[0]);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (a() || iConnStrategy == null || !(iConnStrategy instanceof IPConnStrategy)) {
            return;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
        if (iPConnStrategy.f29873b == 1) {
            this.f29933b.f29888c.a(str, iConnStrategy, connEvent);
        } else if (iPConnStrategy.f29873b == 0) {
            this.f29933b.d().a(str, iConnStrategy, connEvent);
        }
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        if (dispatchEvent.eventType != 1 || this.f29933b == null) {
            return;
        }
        ALog.d("awcn.StrategyCenter", "receive amdc event", null, new Object[0]);
        l.d dVarA = l.a((JSONObject) dispatchEvent.extraObject);
        if (dVarA == null) {
            return;
        }
        this.f29933b.a(dVarA);
        saveData();
        Iterator<IStrategyListener> it = this.f29935d.iterator();
        while (it.hasNext()) {
            try {
                it.next().onStrategyUpdated(dVarA);
            } catch (Exception e10) {
                ALog.e("awcn.StrategyCenter", "onStrategyUpdated failed", null, e10, new Object[0]);
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void registerListener(IStrategyListener iStrategyListener) {
        ALog.e("awcn.StrategyCenter", "registerListener", null, s.a.f52543a, this.f29935d);
        if (iStrategyListener != null) {
            this.f29935d.add(iStrategyListener);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void saveData() {
        ALog.i("awcn.StrategyCenter", "saveData", null, new Object[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f29934c > 30000) {
            this.f29934c = jCurrentTimeMillis;
            anet.channel.strategy.utils.a.a(new i(this), 500L);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void switchEnv() {
        m.a();
        HttpDispatcher.getInstance().switchENV();
        StrategyInfoHolder strategyInfoHolder = this.f29933b;
        if (strategyInfoHolder != null) {
            strategyInfoHolder.b();
            this.f29933b = StrategyInfoHolder.a();
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void unregisterListener(IStrategyListener iStrategyListener) {
        ALog.e("awcn.StrategyCenter", "unregisterListener", null, s.a.f52543a, this.f29935d);
        this.f29935d.remove(iStrategyListener);
    }
}
