package com.taobao.accs.net;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.ut.monitor.TrafficsMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import java.util.Objects;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Message f98352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f98353b;

    o(k kVar, Message message) {
        this.f98353b = kVar;
        this.f98352a = message;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0252  */
    /* JADX WARN: Code duplicated, block: B:67:0x025b  */
    /* JADX WARN: Code duplicated, block: B:71:0x026f  */
    /* JADX WARN: Code duplicated, block: B:73:0x027e  */
    /* JADX WARN: Code duplicated, block: B:80:0x029f  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ae  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() throws Exception {
        int i10;
        boolean z10;
        Message message;
        String string;
        boolean z11;
        Message message2 = this.f98352a;
        if (message2 != null) {
            if (message2.getNetPermanceMonitor() != null) {
                this.f98352a.getNetPermanceMonitor().onTakeFromQueue();
            }
            int type = this.f98352a.getType();
            try {
                if (ALog.isPrintLog(ALog.Level.D) || "accs-impaas".equals(this.f98352a.serviceId)) {
                    ALog.e(this.f98353b.d(), "sendMessage start", Constants.KEY_DATA_ID, this.f98352a.getDataId(), "type", Message.MsgType.name(type));
                }
                String str = null;
                Session throwsException = null;
                if (type == 1) {
                    Message message3 = this.f98352a;
                    if (message3.host == null) {
                        this.f98353b.f98301e.a(message3, -5);
                        i10 = 1;
                    } else {
                        SessionCenter sessionCenter = SessionCenter.getInstance(this.f98353b.f98305i.getAppKey());
                        this.f98353b.a(sessionCenter, this.f98352a.host.getHost(), false);
                        try {
                            throwsException = sessionCenter.getThrowsException(this.f98352a.host.toString(), ConnType.TypeLevel.SPDY, com.taobao.accs.utl.t.d());
                            string = null;
                        } catch (Exception e10) {
                            ALog.e(this.f98353b.d(), "get session null", e10, new Object[0]);
                            string = e10.toString();
                        }
                        if (throwsException != null) {
                            Message message4 = this.f98352a;
                            k kVar = this.f98353b;
                            byte[] bArrBuild = message4.build(kVar.f98300d, kVar.f98299c);
                            if ("accs".equals(this.f98352a.serviceId) || "accs-impaas".equals(this.f98352a.serviceId)) {
                                String strD = this.f98353b.d();
                                Object[] objArr = new Object[10];
                                objArr[0] = Constants.KEY_DATA_ID;
                                objArr[1] = this.f98352a.getDataId();
                                objArr[2] = "command";
                                Message message5 = this.f98352a;
                                objArr[3] = message5.command;
                                objArr[4] = "host";
                                objArr[5] = message5.host;
                                objArr[6] = "len";
                                objArr[7] = Integer.valueOf(bArrBuild == null ? 0 : bArrBuild.length);
                                objArr[8] = "utdid";
                                objArr[9] = this.f98353b.f98306j;
                                ALog.e(strD, "sendMessage", objArr);
                            } else if (ALog.isPrintLog(ALog.Level.I)) {
                                String strD2 = this.f98353b.d();
                                Object[] objArr2 = new Object[10];
                                objArr2[0] = Constants.KEY_DATA_ID;
                                objArr2[1] = this.f98352a.getDataId();
                                objArr2[2] = "command";
                                Message message6 = this.f98352a;
                                objArr2[3] = message6.command;
                                objArr2[4] = "host";
                                objArr2[5] = message6.host;
                                objArr2[6] = "len";
                                objArr2[7] = Integer.valueOf(bArrBuild == null ? 0 : bArrBuild.length);
                                objArr2[8] = "utdid";
                                objArr2[9] = this.f98353b.f98306j;
                                ALog.d(strD2, "sendMessage", objArr2);
                            }
                            this.f98352a.setSendTime(System.currentTimeMillis());
                            Objects.requireNonNull(bArrBuild);
                            if (bArrBuild.length <= 49152 || this.f98352a.command.intValue() == 102) {
                                this.f98353b.f98301e.a(this.f98352a);
                                Message message7 = this.f98352a;
                                int id2 = message7.isAck ? -message7.getMsgId().getId() : message7.getMsgId().getId();
                                if (this.f98352a.isAck) {
                                    this.f98353b.f98308l.put(Integer.valueOf(id2), this.f98352a);
                                }
                                throwsException.sendCustomFrame(id2, bArrBuild, 200);
                                if (this.f98352a.getNetPermanceMonitor() != null) {
                                    this.f98352a.getNetPermanceMonitor().onSendData();
                                }
                                this.f98353b.a(this.f98352a.getDataId(), this.f98353b.f98305i.isQuickReconnect(), this.f98352a.timeout);
                                this.f98353b.f98301e.a(new TrafficsMonitor.a(this.f98352a.serviceId, GlobalAppRuntimeInfo.isAppBackground(), this.f98352a.host.toString(), bArrBuild.length));
                            } else {
                                this.f98353b.f98301e.a(this.f98352a, -4);
                            }
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        str = string;
                        i10 = 1;
                        z10 = z11;
                    }
                    if (z10 == 0) {
                        if (type == i10) {
                            if (this.f98352a.isTimeOut() || !this.f98353b.a(this.f98352a, 2000)) {
                                this.f98353b.f98301e.a(this.f98352a, -11);
                                String str2 = this.f98352a.serviceId;
                                if (str == null) {
                                    str = "conn time out";
                                }
                                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_SESSION_ERROR, str2, str, String.valueOf(-11));
                            }
                            message = this.f98352a;
                            if (message.retryTimes == 1 && message.getNetPermanceMonitor() != null) {
                                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, "total_accs", 0.0d);
                            }
                        } else {
                            this.f98353b.f98301e.a(this.f98352a, -11);
                            String str3 = this.f98352a.serviceId;
                            if (str == null) {
                                str = "conn time out";
                            }
                            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_SESSION_ERROR, str3, str, String.valueOf(-11));
                        }
                    }
                    if (!"accs".equals(this.f98352a.serviceId) || "accs-impaas".equals(this.f98352a.serviceId)) {
                        ALog.e(this.f98353b.d(), "sendMessage end", Constants.KEY_DATA_ID, this.f98352a.getDataId(), "status", Boolean.valueOf(z10));
                    } else {
                        ALog.e(this.f98353b.d(), "sendMessage end", Constants.KEY_DATA_ID, this.f98352a.getDataId(), "status", Boolean.valueOf(z10));
                        return;
                    }
                }
                i10 = 1;
                ALog.e(this.f98353b.d(), "sendMessage skip", "type", Message.MsgType.name(type));
                z10 = i10;
                if (z10 == 0) {
                    if (type == i10) {
                        if (this.f98352a.isTimeOut()) {
                            this.f98353b.f98301e.a(this.f98352a, -11);
                            String str4 = this.f98352a.serviceId;
                            if (str == null) {
                                str = "conn time out";
                            }
                            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_SESSION_ERROR, str4, str, String.valueOf(-11));
                        } else {
                            this.f98353b.f98301e.a(this.f98352a, -11);
                            String str5 = this.f98352a.serviceId;
                            if (str == null) {
                                str = "conn time out";
                            }
                            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_SESSION_ERROR, str5, str, String.valueOf(-11));
                        }
                        message = this.f98352a;
                        if (message.retryTimes == 1) {
                            com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, "total_accs", 0.0d);
                        }
                    } else {
                        this.f98353b.f98301e.a(this.f98352a, -11);
                        String str6 = this.f98352a.serviceId;
                        if (str == null) {
                            str = "conn time out";
                        }
                        com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_SESSION_ERROR, str6, str, String.valueOf(-11));
                    }
                }
                if ("accs".equals(this.f98352a.serviceId)) {
                }
                ALog.e(this.f98353b.d(), "sendMessage end", Constants.KEY_DATA_ID, this.f98352a.getDataId(), "status", Boolean.valueOf(z10));
            } catch (Throwable th2) {
                try {
                    com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, this.f98352a.serviceId, "", this.f98353b.f98299c + th2.toString());
                    ALog.e(this.f98353b.d(), "sendMessage", th2, new Object[0]);
                    if ("accs".equals(this.f98352a.serviceId) || "accs-impaas".equals(this.f98352a.serviceId)) {
                        ALog.e(this.f98353b.d(), "sendMessage end", Constants.KEY_DATA_ID, this.f98352a.getDataId(), "status", Boolean.TRUE);
                    } else {
                        ALog.e(this.f98353b.d(), "sendMessage end", Constants.KEY_DATA_ID, this.f98352a.getDataId(), "status", Boolean.TRUE);
                    }
                } catch (Throwable th3) {
                    if ("accs".equals(this.f98352a.serviceId) || "accs-impaas".equals(this.f98352a.serviceId)) {
                        ALog.e(this.f98353b.d(), "sendMessage end", Constants.KEY_DATA_ID, this.f98352a.getDataId(), "status", Boolean.TRUE);
                    } else {
                        ALog.e(this.f98353b.d(), "sendMessage end", Constants.KEY_DATA_ID, this.f98352a.getDataId(), "status", Boolean.TRUE);
                    }
                    throw th3;
                }
            }
        }
    }
}
