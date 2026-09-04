package com.taobao.accs.flowcontrol;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lg.a;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class FlowControl {
    public static final int DELAY_MAX = -1;
    public static final int DELAY_MAX_BRUSH = -1000;
    public static final int HIGH_FLOW_CTRL = 2;
    public static final int HIGH_FLOW_CTRL_BRUSH = 3;
    public static final int LOW_FLOW_CTRL = 1;
    public static final int NO_FLOW_CTRL = 0;
    public static final String SERVICE_ALL = "ALL";
    public static final String SERVICE_ALL_BRUSH = "ALL_BRUSH";
    public static final int STATUS_FLOW_CTRL_ALL = 420;
    public static final int STATUS_FLOW_CTRL_BRUSH = 422;
    public static final int STATUS_FLOW_CTRL_CUR = 421;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f98274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FlowCtrlInfoHolder f98275b;

    /* JADX INFO: compiled from: Taobao */
    public static class FlowControlInfo implements Serializable {
        private static final long serialVersionUID = -2259991484877844919L;
        public String bizId;
        public long delayTime;
        public long expireTime;
        public String serviceId;
        public long startTime;
        public int status;

        public FlowControlInfo(String str, String str2, int i10, long j10, long j11, long j12) {
            this.serviceId = str;
            this.bizId = str2;
            this.status = i10;
            this.delayTime = j10;
            this.expireTime = j11 <= 0 ? 0L : j11;
            this.startTime = j12 <= 0 ? 0L : j12;
        }

        public boolean isExpired() {
            return System.currentTimeMillis() - (this.startTime + this.expireTime) > 0;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("flow ctrl serviceId:");
            stringBuffer.append(this.serviceId);
            stringBuffer.append(" bizId:");
            stringBuffer.append(this.bizId);
            stringBuffer.append(" status:");
            stringBuffer.append(this.status);
            stringBuffer.append(" delayTime:");
            stringBuffer.append(this.delayTime);
            stringBuffer.append(" startTime:");
            stringBuffer.append(this.startTime);
            stringBuffer.append(" expireTime:");
            stringBuffer.append(this.expireTime);
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class FlowCtrlInfoHolder implements Serializable {
        private static final long serialVersionUID = 6307563052429742524L;
        Map<String, FlowControlInfo> flowCtrlMap = null;

        public FlowControlInfo get(String str, String str2) {
            if (this.flowCtrlMap == null) {
                return null;
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str + a.f131412e + str2;
            }
            return this.flowCtrlMap.get(str);
        }

        public void put(String str, String str2, FlowControlInfo flowControlInfo) {
            if (!TextUtils.isEmpty(str2)) {
                str = str + a.f131412e + str2;
            }
            if (this.flowCtrlMap == null) {
                this.flowCtrlMap = new HashMap();
            }
            this.flowCtrlMap.put(str, flowControlInfo);
        }
    }

    public FlowControl(Context context) {
        this.f98274a = context;
    }

    private void a() {
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.f98275b;
        if (flowCtrlInfoHolder == null || flowCtrlInfoHolder.flowCtrlMap == null) {
            return;
        }
        synchronized (this) {
            Iterator<Map.Entry<String, FlowControlInfo>> it = this.f98275b.flowCtrlMap.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().isExpired()) {
                    it.remove();
                }
            }
        }
    }

    private boolean a(long j10, long j11) {
        if (j10 != 0 && j11 > 0) {
            return true;
        }
        ALog.e("FlowControl", "error flow ctrl info", new Object[0]);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fd A[Catch: all -> 0x0127, TryCatch #2 {all -> 0x0127, blocks: (B:32:0x00ab, B:42:0x00fd, B:43:0x011a, B:47:0x0121, B:36:0x00bd, B:38:0x00db, B:40:0x00e1), top: B:77:0x008d }] */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00fd, please report this as an issue */
    public int a(Map<Integer, String> map, String str) {
        long jLongValue;
        int iIntValue;
        long j10;
        FlowControlInfo flowControlInfo;
        if (map != null) {
            try {
                String str2 = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_STATUS.ordinal()));
                String str3 = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_DELAY.ordinal()));
                String str4 = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_EXPIRE.ordinal()));
                String str5 = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()));
                iIntValue = TextUtils.isEmpty(str2) ? 0 : Integer.valueOf(str2).intValue();
                try {
                    jLongValue = TextUtils.isEmpty(str3) ? 0L : Long.valueOf(str3).longValue();
                    try {
                        long jLongValue2 = TextUtils.isEmpty(str4) ? 0L : Long.valueOf(str4).longValue();
                        if ((iIntValue != 420 && iIntValue != 421 && iIntValue != 422) || !a(jLongValue, jLongValue2)) {
                            return 0;
                        }
                        try {
                            synchronized (this) {
                                try {
                                    if (this.f98275b == null) {
                                        this.f98275b = new FlowCtrlInfoHolder();
                                    }
                                    FlowControlInfo flowControlInfo2 = null;
                                    if (iIntValue == 420) {
                                        j10 = jLongValue;
                                        flowControlInfo = new FlowControlInfo("ALL", "", iIntValue, jLongValue, jLongValue2, System.currentTimeMillis());
                                        this.f98275b.put("ALL", "", flowControlInfo);
                                    } else {
                                        j10 = jLongValue;
                                        if (iIntValue == 422) {
                                            flowControlInfo = new FlowControlInfo(SERVICE_ALL_BRUSH, "", iIntValue, j10, jLongValue2, System.currentTimeMillis());
                                            this.f98275b.put(SERVICE_ALL_BRUSH, "", flowControlInfo);
                                        } else if (iIntValue == 421 && !TextUtils.isEmpty(str)) {
                                            FlowControlInfo flowControlInfo3 = new FlowControlInfo(str, str5, iIntValue, j10, jLongValue2, System.currentTimeMillis());
                                            this.f98275b.put(str, str5, flowControlInfo3);
                                            flowControlInfo2 = flowControlInfo3;
                                        }
                                        if (flowControlInfo2 != null) {
                                            ALog.e("FlowControl", "updateFlowCtrlInfo " + flowControlInfo2.toString(), new Object[0]);
                                        }
                                        jLongValue = j10;
                                    }
                                    flowControlInfo2 = flowControlInfo;
                                    if (flowControlInfo2 != null) {
                                        ALog.e("FlowControl", "updateFlowCtrlInfo " + flowControlInfo2.toString(), new Object[0]);
                                    }
                                    jLongValue = j10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    long j11 = jLongValue;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        jLongValue = j11;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    jLongValue = 0;
                }
            } catch (Throwable th7) {
                th = th7;
                jLongValue = 0;
                iIntValue = 0;
            }
            ALog.e("FlowControl", "updateFlowCtrlInfo", th, new Object[0]);
        } else {
            jLongValue = 0;
            iIntValue = 0;
        }
        if (jLongValue > 0) {
            return 1;
        }
        if (jLongValue == 0) {
            return 0;
        }
        return 422 == iIntValue ? 3 : 2;
    }

    public long a(String str, String str2) {
        long j10;
        long j11;
        long j12;
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.f98275b;
        long j13 = 0;
        if (flowCtrlInfoHolder == null || flowCtrlInfoHolder.flowCtrlMap == null || TextUtils.isEmpty(str)) {
            return 0L;
        }
        synchronized (this) {
            FlowControlInfo flowControlInfo = this.f98275b.get("ALL", null);
            FlowControlInfo flowControlInfo2 = this.f98275b.get(SERVICE_ALL_BRUSH, null);
            FlowControlInfo flowControlInfo3 = this.f98275b.get(str, null);
            FlowControlInfo flowControlInfo4 = this.f98275b.get(str, str2);
            j10 = (flowControlInfo == null || flowControlInfo.isExpired()) ? 0L : flowControlInfo.delayTime;
            long j14 = (flowControlInfo2 == null || flowControlInfo2.isExpired()) ? 0L : flowControlInfo2.delayTime;
            j11 = (flowControlInfo3 == null || flowControlInfo3.isExpired()) ? 0L : flowControlInfo3.delayTime;
            if (flowControlInfo4 != null && !flowControlInfo4.isExpired()) {
                j13 = flowControlInfo4.delayTime;
            }
            j12 = -1;
            if (j10 != -1 && j13 != -1 && j11 != -1) {
                if (j14 == -1) {
                    j12 = -1000;
                } else {
                    long j15 = j10 > j13 ? j10 : j13;
                    j12 = j15 > j11 ? j15 : j11;
                }
            }
            if ((flowControlInfo4 != null && flowControlInfo4.isExpired()) || (flowControlInfo != null && flowControlInfo.isExpired())) {
                a();
            }
        }
        ALog.e("FlowControl", "getFlowCtrlDelay service " + str + " biz " + str2 + " result:" + j12 + " global:" + j10 + " serviceDelay:" + j11 + " bidDelay:" + j13, new Object[0]);
        return j12;
    }
}
