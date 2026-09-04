package com.alipay.face.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.deviceid.DeviceTokenClient;
import com.alipay.face.download.g;
import com.alipay.face.download.i;
import com.alipay.face.log.RecordLevel;
import com.alipay.face.log.RecordService;
import com.alipay.face.log.ZIMCrashCallback;
import com.alipay.face.ui.FaceLoadingActivity;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.face.ToygerFaceService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ZIMFacade {
    public static final String ZIM_EXT_PARAMS_KEY_FACE_PROGRESS_COLOR = "ext_params_key_face_progress_color";
    public static final String ZIM_EXT_PARAMS_KEY_OCR_BOTTOM_BUTTON_COLOR = "ext_params_key_ocr_bottom_button_color";
    public static final String ZIM_EXT_PARAMS_KEY_SCREEN_ORIENTATION = "ext_params_key_screen_orientation";
    public static final String ZIM_EXT_PARAMS_KEY_USE_VIDEO = "ext_params_key_use_video";
    public static final String ZIM_EXT_PARAMS_VAL_SCREEN_LAND = "ext_params_val_screen_land";
    public static final String ZIM_EXT_PARAMS_VAL_SCREEN_PORT = "ext_params_val_screen_port";
    public static final String ZIM_EXT_PARAMS_VAL_USE_VIDEO_FALSE = "false";
    public static final String ZIM_EXT_PARAMS_VAL_USE_VIDEO_TRUE = "true";
    private static String deviceToken = null;
    private static long lastCallTime = -1;
    private Context ctx;
    private ZIMCallback zimCallback = null;

    public class a implements com.alipay.face.api.c {
        a() {
        }

        @Override // com.alipay.face.api.c
        public void a(String str) {
            ZIMFacade.this.sendResponse(str);
        }
    }

    public static final class b implements DeviceTokenClient.InitResultListener {
        b() {
        }

        @Override // com.alipay.deviceid.DeviceTokenClient.InitResultListener
        public void onResult(String str, int i10) {
            String unused = ZIMFacade.deviceToken = str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deviceToken11:");
            sb2.append(ZIMFacade.deviceToken);
            sb2.append(Looper.getMainLooper() == Looper.myLooper());
            ToygerLog.e(sb2.toString());
            if (i10 != 0) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "deviceTokenInit", "status", "false", i7.a.i.f119320o, String.valueOf(i10));
            } else {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "deviceTokenInit", "status", "true");
            }
        }
    }

    public static final class c implements com.alipay.face.api.a {
        c() {
        }

        @Override // com.alipay.face.api.a
        public String a() {
            return "android";
        }

        @Override // com.alipay.face.api.a
        public String b(Context context) {
            return context == null ? "" : context.getPackageName();
        }

        @Override // com.alipay.face.api.a
        public String c() {
            return Build.MODEL;
        }

        @Override // com.alipay.face.api.a
        public String d() {
            return Build.VERSION.RELEASE;
        }

        @Override // com.alipay.face.api.a
        public String e(Context context) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e10) {
                ToygerLog.w(e10);
                return "";
            }
        }

        @Override // com.alipay.face.api.a
        public String f(Context context) {
            return ZIMFacade.getApDidToken(context);
        }
    }

    public class d implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.alipay.face.api.d f38533a;

        d(com.alipay.face.api.d dVar) {
            this.f38533a = dVar;
        }

        @Override // com.alipay.face.download.g.c
        public void a() {
            g.m().w();
            com.alipay.face.api.d dVar = this.f38533a;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // com.alipay.face.download.g.c
        public void b(int i10, int i11, String str) {
            com.alipay.face.api.d dVar = this.f38533a;
            if (dVar != null) {
                dVar.b(i10, i11, str);
            }
        }

        @Override // com.alipay.face.download.g.c
        public void c() {
        }

        @Override // com.alipay.face.download.g.c
        public void d(String str) {
        }

        @Override // com.alipay.face.download.g.c
        public void e(String str) {
        }
    }

    protected ZIMFacade(Context context) {
        this.ctx = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getApDidToken(Context context) {
        if (TextUtils.isEmpty(deviceToken)) {
            deviceToken = DeviceTokenClient.getInstance(context).getTokenResult().apdidToken;
        }
        ToygerLog.e("deviceToken: " + deviceToken);
        return deviceToken;
    }

    public static String getMetaInfos(Context context) {
        return getMetaInfos(context, null);
    }

    public static String getMetaInfos(Context context, Map<String, Object> map) {
        return getMetaInfos(context, map, true);
    }

    private static String getMetaInfos(Context context, Map<String, Object> map, boolean z10) {
        try {
            return JSON.toJSONString(getZimMetaInfo(context, map));
        } catch (Throwable th2) {
            ToygerLog.e(th2);
            return "";
        }
    }

    public static Map getNetStore() {
        return com.alipay.face.network.c.c().b();
    }

    private static ZIMMetaInfo getZimMetaInfo(Context context) {
        return getZimMetaInfo(context, null);
    }

    private static ZIMMetaInfo getZimMetaInfo(Context context, Map<String, Object> map) {
        c cVar = new c();
        ZIMMetaInfo zIMMetaInfo = new ZIMMetaInfo();
        zIMMetaInfo.setApdidToken(cVar.f(context));
        zIMMetaInfo.setAppName(cVar.b(context));
        zIMMetaInfo.setAppVersion(cVar.e(context));
        zIMMetaInfo.setDeviceModel(cVar.c());
        zIMMetaInfo.setDeviceType(cVar.a());
        zIMMetaInfo.setOsVersion(cVar.d());
        zIMMetaInfo.setBioMetaInfo(com.alipay.face.b.f38548b);
        zIMMetaInfo.setZimVer("1.0.0");
        zIMMetaInfo.setSdkVersion(com.alipay.face.b.f38551e);
        return zIMMetaInfo;
    }

    private static void initApdid(Context context) {
        String str = DeviceTokenClient.getInstance(context).getTokenResult().apdidToken;
        deviceToken = str;
        if (TextUtils.isEmpty(str)) {
            DeviceTokenClient.getInstance(context).initToken("zorro", "elBwppCSr9nB1LIQ", new b());
        }
    }

    public static void install(Context context) {
        if (context == null) {
            return;
        }
        RecordService.getInstance().init(context, context.getPackageName());
        initApdid(context);
        ToygerFaceService.preLoad(context);
    }

    public static void reportCrash(String str, ZIMCrashCallback zIMCrashCallback) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "appCrash", "crashInfo", str);
        RecordService.getInstance().reportCrash(zIMCrashCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendResponse(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.alipay.face.b.a.f38573a;
        }
        RecordService.getInstance().flush();
        if (this.zimCallback != null) {
            ZIMResponse zIMResponse = new ZIMResponse();
            zIMResponse.reason = str;
            zIMResponse.deviceToken = com.alipay.face.c.w().t();
            if (com.alipay.face.c.w().F()) {
                zIMResponse.videoFilePath = com.alipay.face.c.w().I();
            }
            zIMResponse.bitmap = com.alipay.face.c.w().E();
            if (com.alipay.face.c.w().Q()) {
                zIMResponse.ocrFrontBitmap = com.alipay.face.c.w().y();
                zIMResponse.ocrBackBitmap = com.alipay.face.c.w().x();
            }
            if (str.equalsIgnoreCase(com.alipay.face.b.a.f38593u)) {
                zIMResponse.code = 1000;
            } else if (str.startsWith(com.alipay.face.b.a.f38595w)) {
                String[] strArrSplit = str.split(lg.a.f131412e);
                if (2 == strArrSplit.length) {
                    zIMResponse.reason = strArrSplit[1];
                }
                zIMResponse.code = 2006;
            } else if (str.equalsIgnoreCase(com.alipay.face.b.a.f38590r) || str.equalsIgnoreCase(com.alipay.face.b.a.f38591s) || str.equalsIgnoreCase(com.alipay.face.b.a.f38592t) || str.equalsIgnoreCase(com.alipay.face.b.a.f38581i) || str.equalsIgnoreCase(com.alipay.face.b.a.f38582j) || str.equalsIgnoreCase(com.alipay.face.b.a.B)) {
                zIMResponse.code = 2002;
            } else if (str.equalsIgnoreCase(com.alipay.face.b.a.f38580h)) {
                zIMResponse.code = 1003;
            } else if (str.equalsIgnoreCase(String.valueOf(2003))) {
                zIMResponse.code = 2003;
            } else {
                zIMResponse.code = 1001;
            }
            this.zimCallback.response(zIMResponse);
        }
    }

    public void checkDownloadFile(Context context, com.alipay.face.api.d dVar) {
        int iQ;
        g.m().t();
        d dVar2 = new d(dVar);
        i iVarK = g.k(context);
        if (iVarK == null || (iQ = g.m().q(context, iVarK, dVar2)) == 2) {
            return;
        }
        if (iQ == 5) {
            dVar.a();
        } else if (iQ == 1) {
            g.m().v();
        } else {
            dVar.a();
        }
    }

    public void destroy() {
        com.alipay.face.ui.b.b().a();
    }

    public ZIMSession getSession() {
        String str = deviceToken;
        int i10 = -1;
        if (TextUtils.isEmpty(str)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "deviceTokenGetSession", "status", "false", i7.a.i.f119320o, String.valueOf(-1));
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "deviceTokenGetSession", "status", "true", com.umeng.analytics.pro.d.aw, str);
            i10 = 0;
        }
        ZIMSession zIMSession = new ZIMSession();
        zIMSession.code = i10;
        zIMSession.session = str;
        return zIMSession;
    }

    public void verify(String str, boolean z10, ZIMCallback zIMCallback) {
        verify(str, z10, null, zIMCallback);
    }

    public void verify(String str, boolean z10, HashMap<String, String> map, ZIMCallback zIMCallback) {
        if (this.ctx == null) {
            sendResponse(com.alipay.face.b.a.f38573a);
            return;
        }
        if (System.currentTimeMillis() - lastCallTime < 2000) {
            return;
        }
        if (com.alipay.face.ui.b.b().c()) {
            sendResponse(com.alipay.face.b.a.f38589q);
            destroy();
            return;
        }
        lastCallTime = System.currentTimeMillis();
        com.alipay.face.network.b.b(this.ctx);
        RecordService.getInstance().init(this.ctx, str);
        this.zimCallback = zIMCallback;
        ZIMSession session = getSession();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "verifyGetSession", "token", session.session);
        com.alipay.face.c.w().g0(session.session);
        com.alipay.face.c.w().s0(str);
        com.alipay.face.c.w().o0(z10);
        com.alipay.face.c.w().t0(new a());
        if (map != null && map.containsKey(ZIM_EXT_PARAMS_KEY_USE_VIDEO) && "true".equalsIgnoreCase(map.get(ZIM_EXT_PARAMS_KEY_USE_VIDEO))) {
            com.alipay.face.c.w().p0(true);
        }
        if (map != null) {
            String str2 = map.get(ZIM_EXT_PARAMS_KEY_OCR_BOTTOM_BUTTON_COLOR);
            if (!TextUtils.isEmpty(str2)) {
                com.alipay.face.ui.a.f39008a = str2;
            }
            String str3 = map.get(ZIM_EXT_PARAMS_KEY_FACE_PROGRESS_COLOR);
            if (!TextUtils.isEmpty(str3)) {
                com.alipay.face.ui.a.f39009b = str3;
            }
        }
        String metaInfos = getMetaInfos(this.ctx);
        Intent intent = new Intent(this.ctx, (Class<?>) FaceLoadingActivity.class);
        intent.putExtra(com.alipay.face.b.f38549c, metaInfos);
        if (map != null && map.containsKey(ZIM_EXT_PARAMS_KEY_SCREEN_ORIENTATION)) {
            intent.putExtra(ZIM_EXT_PARAMS_KEY_SCREEN_ORIENTATION, map.get(ZIM_EXT_PARAMS_KEY_SCREEN_ORIENTATION));
        }
        this.ctx.startActivity(intent);
    }
}
