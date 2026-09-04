package org.android.spdy;

import android.content.Context;
import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.text.y;
import n5.a;
import okio.Utf8;

/* JADX INFO: loaded from: classes5.dex */
public final class SpdyAgent {
    public static final int ACCS_ONLINE_SERVER = 1;
    public static final int ACCS_TEST_SERVER = 0;
    private static final boolean HAVE_CLOSE = false;
    private static final int KB32 = 32768;
    private static final int KB8 = 8192;
    private static final int MAX_SPDY_SESSION_COUNT = 50;
    private static final int MB5 = 5242880;
    static final int MODE_QUIC = 256;
    static final int SPDY_CUSTOM_CONTROL_FRAME_RECV = 4106;
    static final int SPDY_DATA_CHUNK_RECV = 4097;
    static final int SPDY_DATA_RECV = 4098;
    static final int SPDY_DATA_SEND = 4099;
    static final int SPDY_PING_RECV = 4101;
    static final int SPDY_REQUEST_RECV = 4102;
    static final int SPDY_SESSION_CLOSE = 4103;
    static final int SPDY_SESSION_CREATE = 4096;
    static final int SPDY_SESSION_FAILED_ERROR = 4105;
    static final int SPDY_STREAM_CLOSE = 4100;
    static final int SPDY_STREAM_RESPONSE_RECV = 4104;
    private static final String TNET_SO_VERSION = "tnet-3.1.14";
    private static Object domainHashLock = null;
    private static HashMap<String, Integer> domainHashMap = null;
    public static volatile boolean enableDebug = false;
    public static volatile boolean enableTimeGaurd = false;
    private static volatile SpdyAgent gSingleInstance;
    private static volatile boolean loadSucc;
    private static Object lock;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Lock f132858r;
    private static final ReentrantReadWriteLock rwLock;
    private static int totalDomain;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Lock f132859w;
    private AccsSSLCallback accsSSLCallback;
    private long agentNativePtr;
    private HashMap<String, SpdySession> sessionMgr = new HashMap<>(5);
    private LinkedList<SpdySession> sessionQueue = new LinkedList<>();
    private AtomicBoolean closed = new AtomicBoolean();
    private String proxyUsername = null;
    private String proxyPassword = null;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        rwLock = reentrantReadWriteLock;
        f132858r = reentrantReadWriteLock.readLock();
        f132859w = reentrantReadWriteLock.writeLock();
        loadSucc = false;
        gSingleInstance = null;
        lock = new Object();
        domainHashLock = new Object();
        domainHashMap = new HashMap<>();
        totalDomain = 0;
    }

    private SpdyAgent(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback) throws UnsatisfiedLinkError {
        try {
            SoInstallMgrSdk.init(context);
            loadSucc = SoInstallMgrSdk.initSo(TNET_SO_VERSION, 1);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            this.agentNativePtr = initAgent(spdyVersion.getInt(), spdySessionKind.getint(), SslVersion.SLIGHT_VERSION_V1.getint());
            this.accsSSLCallback = accsSSLCallback;
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
        }
        this.closed.set(false);
    }

    static void InvlidCharJudge(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            if ((b10 & 255) < 32 || (b10 & 255) > 126) {
                bArr[i10] = Utf8.REPLACEMENT_BYTE;
            }
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            byte b11 = bArr2[i11];
            if ((b11 & 255) < 32 || (b11 & 255) > 126) {
                bArr2[i11] = Utf8.REPLACEMENT_BYTE;
            }
        }
    }

    private void agentIsOpen() {
        if (this.closed.get()) {
            throw new SpdyErrorException("SPDY_JNI_ERR_ASYNC_CLOSE", TnetStatusCode.TNET_JNI_ERR_ASYNC_CLOSE);
        }
        checkLoadSo();
    }

    private void bioPingRecvCallback(SpdySession spdySession, int i10) {
        spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[bioPingRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.bioPingRecvCallback(spdySession, i10);
        }
    }

    private void checkLoadSo() throws SpdyErrorException {
        if (loadSucc) {
            return;
        }
        try {
            synchronized (lock) {
                if (loadSucc) {
                    return;
                }
                loadSucc = SoInstallMgrSdk.initSo(TNET_SO_VERSION, 1);
                this.agentNativePtr = initAgent(0, 0, 0);
                if (!loadSucc) {
                    throw new SpdyErrorException("TNET_JNI_ERR_LOAD_SO_FAIL", TnetStatusCode.TNET_JNI_ERR_LOAD_SO_FAIL);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static boolean checkLoadSucc() {
        return loadSucc;
    }

    private native int closeSessionN(long j10);

    public static int configIpStackMode(int i10) {
        spduLog.Logi("tnet-jni", "[configIpStackMode] - " + i10);
        return configIpStackModeN(i10);
    }

    private static native int configIpStackModeN(int i10);

    private native int configLogFileN(String str, int i10, int i11);

    private native int configLogFileN(String str, int i10, int i11, int i12);

    private static void crashReporter(int i10) {
    }

    private native long createSessionN(long j10, SpdySession spdySession, int i10, byte[] bArr, char c10, byte[] bArr2, char c11, byte[] bArr3, byte[] bArr4, Object obj, int i11, int i12, int i13, byte[] bArr5);

    static byte[] dataproviderToByteArray(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider) {
        headJudge(spdyRequest.getHeaders());
        if (spdyDataProvider == null) {
            return null;
        }
        String strMapBodyToString = mapBodyToString(spdyDataProvider.postBody);
        byte[] bytes = strMapBodyToString != null ? strMapBodyToString.getBytes() : spdyDataProvider.data;
        if (bytes == null || bytes.length < 5242880) {
            return bytes;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + bytes.length, TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    private native int freeAgent(long j10);

    private int getDomainHashIndex(String str) {
        Integer numValueOf;
        synchronized (domainHashLock) {
            numValueOf = domainHashMap.get(str);
            if (numValueOf == null) {
                HashMap<String, Integer> map = domainHashMap;
                int i10 = totalDomain + 1;
                totalDomain = i10;
                map.put(str, Integer.valueOf(i10));
                numValueOf = Integer.valueOf(totalDomain);
            }
        }
        return numValueOf.intValue();
    }

    public static SpdyAgent getInstance(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind) throws SpdyErrorException, UnsatisfiedLinkError {
        if (gSingleInstance == null) {
            synchronized (lock) {
                if (gSingleInstance == null) {
                    gSingleInstance = new SpdyAgent(context, spdyVersion, spdySessionKind, null);
                }
            }
        }
        return gSingleInstance;
    }

    @Deprecated
    public static SpdyAgent getInstance(Context context, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback) throws SpdyErrorException, UnsatisfiedLinkError {
        if (gSingleInstance == null) {
            synchronized (lock) {
                if (gSingleInstance == null) {
                    gSingleInstance = new SpdyAgent(context, spdyVersion, spdySessionKind, accsSSLCallback);
                }
            }
        }
        return gSingleInstance;
    }

    private void getPerformance(SpdySession spdySession, SslPermData sslPermData) {
    }

    private byte[] getSSLMeta(SpdySession spdySession) {
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[getSSLMeta] - session is null");
            return null;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb != null) {
            return intenalcb.getSSLMeta(spdySession);
        }
        spduLog.Logi("tnet-jni", "[getSSLMeta] - session.intenalcb is null");
        return null;
    }

    private byte[] getSSLPublicKey(int i10, byte[] bArr) {
        AccsSSLCallback accsSSLCallback = this.accsSSLCallback;
        if (accsSSLCallback != null) {
            return accsSSLCallback.getSSLPublicKey(i10, bArr);
        }
        spduLog.Logd("tnet-jni", "[getSSLPublicKey] - accsSSLCallback is null.");
        return null;
    }

    private native long getSession(long j10, byte[] bArr, char c10);

    static void headJudge(Map<String, String> map) {
        if (map != null) {
            int length = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                InvlidCharJudge(key.getBytes(), value.getBytes());
                length += key.length() + 1 + value.length();
                securityCheck(length, value.length());
            }
        }
    }

    private native long initAgent(int i10, int i11, int i12);

    @Deprecated
    public static void inspect(String str) {
    }

    private native void logFileCloseN();

    private native void logFileFlushN();

    static String mapBodyToString(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        if (map == null) {
            return null;
        }
        int length = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb2.append(key);
            sb2.append(a.f132013h);
            sb2.append(value);
            sb2.append(y.f128595d);
            length += key.length() + 1 + value.length();
            tableListJudge(length);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    static String[] mapToByteArray(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        String[] strArr = new String[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i10] = entry.getKey();
            strArr[i10 + 1] = entry.getValue();
            i10 += 2;
        }
        return strArr;
    }

    private int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[putSSLMeta] - session is null");
            return -1;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb != null) {
            return intenalcb.putSSLMeta(spdySession, bArr);
        }
        spduLog.Logi("tnet-jni", "[putSSLMeta] - session.intenalcb is null");
        return -1;
    }

    static void securityCheck(int i10, int i11) {
        if (i10 >= 32768) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + i10, TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
        if (i11 < 8192) {
            return;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:value=" + i11, TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    private native int setConTimeout(long j10, int i10);

    private native int setSessionKind(long j10, int i10);

    private void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i10, int i11) {
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameFailCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyCustomControlFrameFailCallback(spdySession, obj, i10, i11);
        }
    }

    private void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i10, int i11, int i12, int i13, byte[] bArr) {
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyCustomControlFrameRecvCallback(spdySession, obj, i10, i11, i12, i13, bArr);
        }
    }

    private void spdyDataChunkRecvCB(SpdySession spdySession, boolean z10, int i10, SpdyByteArray spdyByteArray, int i11) {
        spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - ");
        long j10 = ((long) i10) & KeyboardMap.kValueMask;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataChunkRecvCB] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataChunkRecvCB(spdySession, z10, j10, spdyByteArray, i11);
        }
    }

    private void spdyDataRecvCallback(SpdySession spdySession, boolean z10, int i10, int i11, int i12) {
        spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - ");
        long j10 = ((long) i10) & KeyboardMap.kValueMask;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataRecvCallback(spdySession, z10, j10, i11, i12);
        }
    }

    private void spdyDataSendCallback(SpdySession spdySession, boolean z10, int i10, int i11, int i12) {
        long j10 = ((long) i10) & KeyboardMap.kValueMask;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyDataSendCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyDataSendCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyDataSendCallback(spdySession, z10, j10, i11, i12);
        }
    }

    private void spdyPingRecvCallback(SpdySession spdySession, int i10, Object obj) {
        spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyPingRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyPingRecvCallback(spdySession, i10, obj);
        }
    }

    private void spdyRequestRecvCallback(SpdySession spdySession, int i10, int i11) {
        long j10 = ((long) i10) & KeyboardMap.kValueMask;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyRequestRecvCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyRequestRecvCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyRequestRecvCallback(spdySession, j10, i11);
        }
    }

    private void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i10) {
        spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - errorCode = " + i10);
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - session is null");
        } else {
            try {
                Intenalcb intenalcb = spdySession.intenalcb;
                if (intenalcb == null) {
                    spduLog.Logi("tnet-jni", "[spdySessionCloseCallback] - session.intenalcb is null");
                } else {
                    intenalcb.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i10);
                }
                spdySession.cleanUp();
            } catch (Throwable th2) {
                spdySession.cleanUp();
                throw th2;
            }
        }
        spdySession.releasePptr();
    }

    private void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdySessionConnectCB] - session.intenalcb is null");
        } else {
            intenalcb.spdySessionConnectCB(spdySession, superviseConnectInfo);
        }
    }

    private void spdySessionFailedError(SpdySession spdySession, int i10, Object obj) {
        spduLog.Logi("tnet-jni", "[spdySessionFailedError] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionFailedError] - session is null");
        } else {
            try {
                Intenalcb intenalcb = spdySession.intenalcb;
                if (intenalcb == null) {
                    spduLog.Logi("tnet-jni", "[spdySessionFailedError] - session.intenalcb is null");
                } else {
                    intenalcb.spdySessionFailedError(spdySession, i10, obj);
                }
                spdySession.cleanUp();
            } catch (Throwable th2) {
                spdySession.cleanUp();
                throw th2;
            }
        }
        spdySession.releasePptr();
    }

    private void spdySessionOnWritable(SpdySession spdySession, Object obj, int i10) {
        spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - ");
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - session is null");
            return;
        }
        try {
            Intenalcb intenalcb = spdySession.intenalcb;
            if (intenalcb == null) {
                spduLog.Logi("tnet-jni", "[spdySessionOnWritable] - session.intenalcb is null");
            } else {
                intenalcb.spdySessionOnWritable(spdySession, obj, i10);
            }
        } catch (Throwable th2) {
            spduLog.Loge("tnet-jni", "[spdySessionOnWritable] - exception:" + th2);
        }
    }

    private void spdyStreamCloseCallback(SpdySession spdySession, int i10, int i11, int i12, SuperviseData superviseData) {
        spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - ");
        long j10 = ((long) i10) & KeyboardMap.kValueMask;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamCloseCallback] - session.intenalcb is null");
        } else {
            intenalcb.spdyStreamCloseCallback(spdySession, j10, i11, i12, superviseData);
        }
    }

    private void spdyStreamResponseRecv(SpdySession spdySession, int i10, String[] strArr, int i11) {
        spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - ");
        Map<String, List<String>> mapStringArrayToMap = stringArrayToMap(strArr);
        long j10 = ((long) i10) & KeyboardMap.kValueMask;
        if (spdySession == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - session is null");
            return;
        }
        Intenalcb intenalcb = spdySession.intenalcb;
        if (intenalcb == null) {
            spduLog.Logi("tnet-jni", "[spdyStreamResponseRecv] - session.intenalcb is null");
        } else {
            intenalcb.spdyOnStreamResponse(spdySession, j10, mapStringArrayToMap, i11);
        }
    }

    static Map<String, List<String>> stringArrayToMap(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        HashMap map = new HashMap(5);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 2;
            if (i11 > strArr.length) {
                return map;
            }
            String str = strArr[i10];
            if (str != null) {
                int i12 = i10 + 1;
                if (strArr[i12] != null) {
                    List arrayList = (List) map.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        map.put(strArr[i10], arrayList);
                    }
                    arrayList.add(strArr[i12]);
                    i10 = i11;
                }
            }
            return null;
        }
    }

    static void tableListJudge(int i10) {
        if (i10 < 5242880) {
            return;
        }
        throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM:total=" + i10, TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    void clearSpdySession(String str, String str2, int i10) {
        if (str != null) {
            Lock lock2 = f132859w;
            lock2.lock();
            try {
                this.sessionMgr.remove(str + str2 + i10);
                lock2.unlock();
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                } finally {
                    f132859w.unlock();
                }
            }
        }
    }

    public void close() {
    }

    int closeSession(long j10) {
        return closeSessionN(j10);
    }

    public int configLogFile(String str, int i10, int i11) {
        if (loadSucc) {
            return configLogFileN(str, i10, i11);
        }
        return -1;
    }

    public int configLogFile(String str, int i10, int i11, int i12) {
        if (loadSucc) {
            return configLogFileN(str, i10, i11, i12);
        }
        return -1;
    }

    @Deprecated
    public SpdySession createSession(String str, Object obj, SessionCb sessionCb, int i10) throws SpdyErrorException {
        return createSession(str, "", obj, sessionCb, null, i10, 0);
    }

    @Deprecated
    public SpdySession createSession(String str, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i10) throws SpdyErrorException {
        return createSession(str, "", obj, sessionCb, sslCertcb, i10, 0);
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, int i10) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, null, i10, 0);
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i10, int i11) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, sslCertcb, i10, i11, -1);
    }

    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i10, int i11, int i12) throws SpdyErrorException {
        return createSession(str, str2, obj, sessionCb, sslCertcb, i10, i11, i12, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0140  */
    /* JADX WARN: Code duplicated, block: B:44:0x0187 A[Catch: all -> 0x013b, TryCatch #2 {all -> 0x013b, blocks: (B:32:0x0107, B:34:0x010b, B:42:0x0167, B:44:0x0187, B:48:0x0192, B:41:0x0163), top: B:75:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x018c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0192 A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #2 {all -> 0x013b, blocks: (B:32:0x0107, B:34:0x010b, B:42:0x0167, B:44:0x0187, B:48:0x0192, B:41:0x0163), top: B:75:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01be  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c8 A[Catch: all -> 0x01df, TRY_ENTER, TryCatch #4 {all -> 0x01df, blocks: (B:50:0x0199, B:56:0x01c8, B:57:0x01de), top: B:79:0x0190 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x01c8, please report this as an issue */
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i10, int i11, int i12, String str3) throws Throwable {
        String str4;
        byte[] bArr;
        char c10;
        SpdySession spdySession;
        long jCreateSessionN;
        int i13;
        SpdyAgent spdyAgent = this;
        if (str == null) {
            throw new SpdyErrorException("SPDY_JNI_ERR_INVALID_PARAM", TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
        String[] strArrSplit = str.split("/");
        int iLastIndexOf = strArrSplit[0].lastIndexOf(58);
        String strSubstring = strArrSplit[0].substring(0, iLastIndexOf);
        String strSubstring2 = strArrSplit[0].substring(iLastIndexOf + 1);
        byte[] bytes = "0.0.0.0".getBytes();
        if (strArrSplit.length != 1) {
            String[] strArrSplit2 = strArrSplit[1].split(":");
            byte[] bytes2 = strArrSplit2[0].getBytes();
            str4 = str;
            c10 = (char) Integer.parseInt(strArrSplit2[1]);
            bArr = bytes2;
        } else {
            str4 = str + "/0.0.0.0:0";
            bArr = bytes;
            c10 = 0;
        }
        agentIsOpen();
        Lock lock2 = f132858r;
        lock2.lock();
        try {
            SpdySession spdySession2 = spdyAgent.sessionMgr.get(str4 + str2 + i10);
            boolean z10 = spdyAgent.sessionMgr.size() >= 50;
            lock2.unlock();
            if (z10) {
                throw new SpdyErrorException("SPDY_SESSION_EXCEED_MAXED: session count exceed max", TnetStatusCode.TNET_SESSION_EXCEED_MAXED);
            }
            if (spdySession2 != null) {
                spdySession2.increRefCount();
                return spdySession2;
            }
            f132859w.lock();
            SpdySession spdySession3 = null;
            try {
                spdySession = spdyAgent.sessionMgr.get(str4 + str2 + i10);
            } catch (Throwable unused) {
                spdySession = null;
            }
            if (spdySession != null) {
                f132859w.unlock();
                spdySession.increRefCount();
                return spdySession;
            }
            try {
                String str5 = str4;
                SpdySession spdySession4 = new SpdySession(0L, this, str4, str2, sessionCb, i10, i11, obj);
                byte[] bytes3 = str3 == null ? null : str3.getBytes();
                int domainHashIndex = spdyAgent.getDomainHashIndex(str2 + i10);
                if (spdyAgent.proxyUsername == null) {
                    spdyAgent = this;
                    jCreateSessionN = createSessionN(spdyAgent.agentNativePtr, spdySession4, domainHashIndex, strSubstring.getBytes(), (char) Integer.parseInt(strSubstring2), bArr, c10, null, null, obj, i10, i11, i12, bytes3);
                    spduLog.Logi("tnet-jni", " create new session: " + str);
                    if ((jCreateSessionN & 1) == 1) {
                        i13 = (int) (jCreateSessionN >> 1);
                        jCreateSessionN = 0;
                    } else {
                        i13 = 0;
                    }
                    if (jCreateSessionN != 0) {
                        spdySession4.setSessionNativePtr(jCreateSessionN);
                        this.sessionMgr.put(str5 + str2 + i10, spdySession4);
                        this.sessionQueue.add(spdySession4);
                        spdySession3 = spdySession4;
                    } else if (i13 != 0) {
                        throw new SpdyErrorException("create session error: " + i13, i13);
                    }
                    f132859w.unlock();
                    return spdySession3;
                }
                try {
                    if (spdyAgent.proxyPassword != null) {
                        jCreateSessionN = createSessionN(spdyAgent.agentNativePtr, spdySession4, domainHashIndex, strSubstring.getBytes(), (char) Integer.parseInt(strSubstring2), bArr, c10, spdyAgent.proxyUsername.getBytes(), spdyAgent.proxyPassword.getBytes(), obj, i10, i11, i12, bytes3);
                    } else {
                        spdyAgent = this;
                        jCreateSessionN = createSessionN(spdyAgent.agentNativePtr, spdySession4, domainHashIndex, strSubstring.getBytes(), (char) Integer.parseInt(strSubstring2), bArr, c10, null, null, obj, i10, i11, i12, bytes3);
                    }
                    spduLog.Logi("tnet-jni", " create new session: " + str);
                    if ((jCreateSessionN & 1) == 1) {
                        i13 = (int) (jCreateSessionN >> 1);
                        jCreateSessionN = 0;
                    } else {
                        i13 = 0;
                    }
                    try {
                        if (jCreateSessionN != 0) {
                            spdySession4.setSessionNativePtr(jCreateSessionN);
                            this.sessionMgr.put(str5 + str2 + i10, spdySession4);
                            this.sessionQueue.add(spdySession4);
                            spdySession3 = spdySession4;
                        } else if (i13 != 0) {
                            throw new SpdyErrorException("create session error: " + i13, i13);
                        }
                        f132859w.unlock();
                        return spdySession3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            f132859w.unlock();
            throw th;
        } catch (Throwable th5) {
            f132858r.unlock();
            throw th5;
        }
    }

    public SpdySession createSession(SessionInfo sessionInfo) throws SpdyErrorException {
        return createSession(sessionInfo.getAuthority(), sessionInfo.getDomain(), sessionInfo.getSessonUserData(), sessionInfo.getSessionCb(), null, sessionInfo.getMode(), sessionInfo.getPubKeySeqNum(), sessionInfo.getConnectionTimeoutMs(), sessionInfo.getCertHost());
    }

    public HashMap<String, SpdySession> getAllSession() {
        return this.sessionMgr;
    }

    public void logFileClose() {
        if (loadSucc) {
            logFileFlushN();
            logFileCloseN();
        }
    }

    public void logFileFlush() {
        if (loadSucc) {
            logFileFlushN();
        }
    }

    void removeSession(SpdySession spdySession) {
        f132859w.lock();
        try {
            this.sessionQueue.remove(spdySession);
        } finally {
            f132859w.unlock();
        }
    }

    public void setAccsSslCallback(AccsSSLCallback accsSSLCallback) {
        spduLog.Logi("tnet-jni", "[setAccsSslCallback] - " + accsSSLCallback.getClass());
        this.accsSSLCallback = accsSSLCallback;
    }

    @Deprecated
    public int setConnectTimeOut(int i10) {
        agentIsOpen();
        try {
            return setConTimeout(this.agentNativePtr, i10);
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void setProxyUsernamePassword(String str, String str2) {
        this.proxyUsername = str;
        this.proxyPassword = str2;
    }

    @Deprecated
    public int setSessionKind(SpdySessionKind spdySessionKind) {
        agentIsOpen();
        try {
            return setSessionKind(this.agentNativePtr, spdySessionKind.getint());
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i10) throws SpdyErrorException {
        return submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, (SslCertcb) null, i10);
    }

    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i10, int i11) throws SpdyErrorException {
        return submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, null, i10, i11);
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i10) throws SpdyErrorException {
        SpdySession spdySessionCreateSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i10, 0, spdyRequest.getConnectionTimeoutMs());
        spdySessionCreateSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return spdySessionCreateSession;
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i10, int i11) throws SpdyErrorException {
        SpdySession spdySessionCreateSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i10, i11, spdyRequest.getConnectionTimeoutMs());
        spdySessionCreateSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return spdySessionCreateSession;
    }

    @Deprecated
    public void switchAccsServer(int i10) {
    }
}
