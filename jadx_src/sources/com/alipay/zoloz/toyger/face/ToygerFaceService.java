package com.alipay.zoloz.toyger.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import c4.a;
import com.alipay.zoloz.toyger.HandlerThreadPool;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.ToygerCallback;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.TGSensorFrame;
import com.alipay.zoloz.toyger.algorithm.Toyger;
import com.alipay.zoloz.toyger.algorithm.ToygerCameraConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerConfig;
import com.alipay.zoloz.toyger.blob.BlobManager;
import i6.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerFaceService extends ToygerBaseService<ToygerFaceCallback, ToygerFaceState, ToygerFaceAttr, ToygerFaceInfo, ToygerFaceAlgorithmConfig> {
    public static final String KEY_TOYGER_ACTION_TYPE = "toyger_action";
    public static final String KEY_TOYGER_DEPTH_FRAME = "toyger_depth_frame";
    public static final String KEY_TOYGER_FRAME = "toyger_frame";
    public static final String KEY_TOYGER_TIME_CONSUMING = "toygerTimeConsuming";
    public static final String KEY_TOYGER_UID = "uid";
    private static final int QUEUE_LENGTH = 1;
    private static final String TOYGER_ACTION_DEREG = "dereg";
    private static final String TOYGER_ACTION_LOCAL_MATCHING = "local";
    private static final String TOYGER_ACTION_REGISTER = "register";
    private static final String TOYGER_ACTION_REMOTE_MATCHING = "remote";
    static int TOYGER_CALLBACK_CODE_LOG = 0;
    static int TOYGER_CALLBACK_CODE_UPDATE = 1;
    public static final int TOYGER_EVENT_INTERRUPT = 1;
    public static final int TOYGER_EVENT_RESUME = 2;
    private static final int TOYGER_LOGLEVEL_SAVE = 2;
    private static String licenses;
    private static byte[] model;
    private FaceBlobManager blobManager;
    private ToygerRunnable cacheRunnable;
    private ByteBuffer depthImageBuffer;
    private ByteBuffer irImageBuffer;
    private ByteBuffer rgbImagebuffer;
    private static Boolean toygerIsBusy = Boolean.FALSE;
    private static long totalFrame = 0;
    private static long totalProcessFrame = 0;
    private static long totalDropFrame = 0;
    private HashMap<Integer, Double> frameSizeMap = new HashMap<>(3);
    private ToygerFaceAttr fppAttr = new ToygerFaceAttr();
    private HashMap<String, Object> callBackObject = new HashMap<>();
    private HandlerThread mProcessThread = null;
    private HandlerThread mSensorThread = null;
    private HandlerThread mCallbackThread = null;
    private Handler mCallbackThreadHandler = null;
    private Handler mProcessThreadHandler = null;
    private Handler mSensorThreadHandler = null;
    private final BlockingQueue<TGSensorFrame> mSensorQueue = new LinkedBlockingDeque(1);
    private final FrameProcessor mFrameProcessor = new FrameProcessor();
    private final AtomicBoolean mSensorRunning = new AtomicBoolean(false);
    private final AtomicBoolean mImageProcessing = new AtomicBoolean(false);
    private final Semaphore semaphore = new Semaphore(1);
    private float[] cacheGyroData = null;
    private float[] cacheRotationData = null;
    private long cacheTimeStamp = 0;
    public boolean initResult = false;
    private boolean localMatching = false;
    private String cacheUid = null;
    private String cacheToken = null;
    private Context cacheContext = null;
    private String cacheCommand = null;
    private String cacheIfaaMsg = null;
    private String faceStateSignature = null;
    private String faceAttrSignature = null;
    private String tgFrameSignature = null;
    private boolean isMirror = false;
    private ToygerFaceAlgorithmConfig faceAlgConfig = null;

    private FaceBlobManager blobManagerByExtInfo(Map<String, Object> map, ToygerFaceBlobConfig toygerFaceBlobConfig) {
        FaceBlobManager faceBlobManager;
        String str = (String) map.get("meta_serializer");
        String str2 = (str != null ? Integer.parseInt(str) : 2) != 2 ? "com.alipay.zoloz.toyger.face.FaceBlobManagerJson" : "com.alipay.zoloz.toyger.face.FaceBlobManagerPb";
        boolean zBooleanValue = map.containsKey(ToygerBaseService.KEY_ENABLE_ENCUP) ? ((Boolean) map.get(ToygerBaseService.KEY_ENABLE_ENCUP)).booleanValue() : true;
        try {
            Constructor<?> declaredConstructor = Class.forName(str2).getDeclaredConstructor(ToygerFaceBlobConfig.class, Boolean.TYPE);
            declaredConstructor.setAccessible(true);
            faceBlobManager = (FaceBlobManager) declaredConstructor.newInstance(toygerFaceBlobConfig, Boolean.valueOf(zBooleanValue));
        } catch (Throwable unused) {
            ToygerLog.w("TOYGER_FLOW_ANDROID", "blobManagerClassName error");
            faceBlobManager = null;
        }
        faceBlobManager.compressFormat = toygerFaceBlobConfig.uploadImageType;
        faceBlobManager.compressRate = toygerFaceBlobConfig.upload_compress_rate;
        return faceBlobManager;
    }

    private double calculateNeedSize(TGFrame tGFrame, TGDepthFrame tGDepthFrame) {
        double d10 = -1.0d;
        Double dValueOf = Double.valueOf(-1.0d);
        if (tGFrame != null) {
            dValueOf = this.frameSizeMap.get(Integer.valueOf(tGFrame.frameMode));
        }
        if (tGDepthFrame != null) {
            dValueOf = this.frameSizeMap.get(7);
        }
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        if (tGFrame != null) {
            double d11 = tGFrame.width * tGFrame.height;
            double d12 = 0.0d;
            if (tGFrame.frameType != 2) {
                switch (tGFrame.frameMode) {
                    case 0:
                        d12 = 1.5d;
                        break;
                    case 1:
                    case 3:
                        d12 = 4.0d;
                        break;
                    case 2:
                    case 4:
                        d12 = 3.0d;
                        break;
                    case 5:
                        d12 = 1.0d;
                        break;
                    case 6:
                        d12 = 2.0d;
                        break;
                }
                double d13 = d11 * d12;
                dValueOf = new Double(d13);
                d10 = d13;
            }
            this.frameSizeMap.put(Integer.valueOf(tGFrame.frameMode), dValueOf);
        }
        if (tGDepthFrame == null) {
            return d10;
        }
        double d14 = ((double) (tGDepthFrame.width * tGDepthFrame.height)) * 2.0d;
        this.frameSizeMap.put(7, new Double(d14));
        return d14;
    }

    private String collectionStringFromBlobConfig(ToygerFaceBlobConfig toygerFaceBlobConfig) {
        String strConcat = "";
        if (toygerFaceBlobConfig.collection != null) {
            for (int i10 = 0; i10 < toygerFaceBlobConfig.collection.size(); i10++) {
                strConcat = strConcat.length() > 0 ? strConcat.concat("#").concat(toygerFaceBlobConfig.collection.get(i10)) : toygerFaceBlobConfig.collection.get(i10);
            }
        }
        return strConcat;
    }

    private String combinationStringFromFaceAlgorithm(ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig) {
        String strConcat = "";
        for (int i10 = 0; i10 < toygerFaceAlgorithmConfig.liveness_combination.size(); i10++) {
            strConcat = strConcat.length() > 0 ? strConcat.concat("#").concat(toygerFaceAlgorithmConfig.liveness_combination.get(i10)) : toygerFaceAlgorithmConfig.liveness_combination.get(i10);
        }
        return strConcat;
    }

    private void deepCopyIRFrame(TGFrame tGFrame) {
        if (tGFrame != null) {
            int iCalculateNeedSize = (int) calculateNeedSize(tGFrame, null);
            if (this.irImageBuffer == null) {
                this.irImageBuffer = Toyger.allocIRFrameData(iCalculateNeedSize);
            }
            ByteBuffer byteBuffer = tGFrame.byteBuffer;
            if (byteBuffer != null) {
                int iLimit = byteBuffer.limit();
                int iMin = Math.min(iCalculateNeedSize, iLimit);
                this.irImageBuffer.rewind();
                if (iLimit == iCalculateNeedSize) {
                    this.irImageBuffer.put(byteBuffer);
                } else {
                    this.irImageBuffer.put(byteBuffer.array(), 0, iMin);
                }
                this.irImageBuffer.rewind();
                Toyger.fetchIRFrameData(tGFrame.byteBuffer, iMin);
            }
        }
    }

    private void deepCopyRGBFrame(TGFrame tGFrame) {
        if (tGFrame != null) {
            int iCalculateNeedSize = (int) calculateNeedSize(tGFrame, null);
            ByteBuffer byteBuffer = tGFrame.byteBuffer;
            if (this.rgbImagebuffer == null) {
                this.rgbImagebuffer = Toyger.allocRGBFrameData(iCalculateNeedSize);
            }
            if (byteBuffer == null) {
                ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.deepCopyRGBFrame buffer = null");
                return;
            }
            int iLimit = byteBuffer.limit();
            int iMin = Math.min(iLimit, iCalculateNeedSize);
            byteBuffer.position();
            this.rgbImagebuffer.rewind();
            if (iLimit == iCalculateNeedSize) {
                this.rgbImagebuffer.put(byteBuffer);
            } else {
                this.rgbImagebuffer.put(byteBuffer.array(), 0, iMin);
            }
            this.rgbImagebuffer.rewind();
            Toyger.fetchRGBFrameData(this.rgbImagebuffer, iMin);
        }
    }

    private void deepCopyTGDepthFrame(TGDepthFrame tGDepthFrame) {
        if (tGDepthFrame != null) {
            int iCalculateNeedSize = (int) calculateNeedSize(null, tGDepthFrame);
            ByteBuffer byteBuffer = tGDepthFrame.byteBuffer;
            if (this.depthImageBuffer == null) {
                this.depthImageBuffer = Toyger.allocDepthFrameData(iCalculateNeedSize);
            }
            if (byteBuffer == null) {
                ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.deepCopyTGDepthFrame buffer = null");
                return;
            }
            int iLimit = byteBuffer.limit();
            int iMin = Math.min(iLimit, iCalculateNeedSize);
            this.depthImageBuffer.rewind();
            if (iLimit != iCalculateNeedSize) {
                this.depthImageBuffer.put(byteBuffer.array(), 0, iMin);
            } else {
                this.depthImageBuffer.put(byteBuffer);
            }
            this.depthImageBuffer.rewind();
            Toyger.fetchDepthFrameData(this.depthImageBuffer.asShortBuffer(), iMin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initToygerNative(Context context) {
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.initToygerNative");
        HashMap map = new HashMap(4);
        this.faceStateSignature = ToygerFaceState.class.getName().replace(".", "/");
        this.faceAttrSignature = ToygerFaceAttr.class.getName().replace(".", "/");
        this.tgFrameSignature = TGFrame.class.getName().replace(".", "/");
        map.put("Capacity", "3");
        String str = this.faceStateSignature;
        if (str != null && this.faceAttrSignature != null && this.tgFrameSignature != null && model != null) {
            map.put("StateSignature", str);
            map.put("AttrSignature", this.faceAttrSignature);
            map.put("FrameSignature", this.tgFrameSignature);
            map.put("Algorithm", "Face");
            ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.initToygerNative check ok, prepare to init native");
            Toyger.loadLibrary(context);
            boolean zInit = Toyger.init(context, model, licenses, context.getPackageName(), map);
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.initToygerNative init result " + zInit);
            return zInit;
        }
        String str2 = "";
        if (str == null) {
            str2 = "faceStateSignature == null;";
        }
        if (this.faceAttrSignature == null) {
            str2 = str2 + "faceAttrSignature == null;";
        }
        if (this.tgFrameSignature == null) {
            str2 = str2 + "tgFrameSignature == null;";
        }
        if (model == null) {
            str2 = str2 + "model == null;";
        }
        ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceSerivce.initToygerNative: " + str2);
        return false;
    }

    private static boolean load(Context context) {
        byte[] model2 = readModel(context);
        model = model2;
        if (model2 != null) {
            return true;
        }
        ToygerLog.e("TOYGER_FLOW_ANDROID", "fail to read model file");
        return false;
    }

    private ToygerConfig parseToygerConfig(ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig, ToygerFaceBlobConfig toygerFaceBlobConfig, Map<String, Object> map) {
        ToygerCameraConfig toygerCameraConfig;
        ToygerConfig toygerConfig = toygerFaceAlgorithmConfig.toToygerConfig();
        toygerConfig.livenessConfig.collection = collectionStringFromBlobConfig(toygerFaceBlobConfig);
        toygerConfig.livenessConfig.livenessCombinations = combinationStringFromFaceAlgorithm(toygerFaceAlgorithmConfig);
        Map<String, List<Float>> map2 = toygerFaceAlgorithmConfig.threshold;
        if (map2 != null) {
            List<Float> list = map2.get(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS);
            ToygerLog.d("TOYGER_FLOW_ANDROID", "DragonflyLiveness-GotDragonFly");
            List<Float> list2 = list;
            if (list2 != null) {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "DragonflyLiveness-ParamSize:" + list2.size());
                if (list2.size() == 1) {
                    toygerConfig.livenessConfig.dragonflyMax = list2.get(0).floatValue();
                    ToygerLog.d("TOYGER_FLOW_ANDROID", "DragonflyLiveness-Param:" + toygerConfig.livenessConfig.dragonflyMax);
                }
            }
            List<Float> list3 = map2.get(ToygerFaceAlgorithmConfig.GEMINI_LIVENESS);
            if (list3 != null) {
                for (int i10 = 0; i10 < list3.size(); i10++) {
                    float fFloatValue = list3.get(i10).floatValue();
                    if (i10 == 0) {
                        toygerConfig.livenessConfig.geminiMin = fFloatValue;
                    } else if (i10 == 1) {
                        toygerConfig.livenessConfig.geminiMax = fFloatValue;
                    }
                }
            }
            List<Float> list4 = map2.get(ToygerFaceAlgorithmConfig.BAT_LIVENESS);
            if (list4 != null && list4.size() > 0) {
                toygerConfig.livenessConfig.batLivenessThreshold = list4.get(0).floatValue();
            }
            List<Float> list5 = map2.get(ToygerFaceAlgorithmConfig.ZFACE_BLINK_LIVENESS);
            if (list5 != null) {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "blinkThreshold.size" + list5.size());
            } else {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "blinkThreshold is empty");
            }
            if (list5 != null && list5.size() == 2) {
                toygerConfig.livenessConfig.eye_blink_threshold = list5.get(0).floatValue();
                toygerConfig.livenessConfig.eye_occlusion_threshold = list5.get(1).floatValue();
                ToygerLog.d("TOYGER_FLOW_ANDROID", "eye_blink_threshold:" + toygerConfig.livenessConfig.eye_blink_threshold + "---eye_occlusion_threshold:" + toygerConfig.livenessConfig.eye_occlusion_threshold);
            }
            if (map != null && (toygerCameraConfig = (ToygerCameraConfig) map.get(ToygerBaseService.KEY_CAMERA_CONFIG)) != null) {
                toygerConfig.cameraConfig = toygerCameraConfig;
                toygerCameraConfig.isMirror = this.isMirror;
                ToygerLog.i("TOYGER_FLOW_ANDROID", "cameraConfig=" + toygerCameraConfig.toString());
            }
        }
        return toygerConfig;
    }

    public static boolean preLoad(Context context) {
        if (model != null) {
            ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.preLoad(): model is already loaded");
            return true;
        }
        boolean zLoad = load(context);
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.preLoad() : bRet=" + zLoad);
        return zLoad;
    }

    private static byte[] readFile(Context context, String str) {
        byte[] bArr = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            if (inputStreamOpen == null || inputStreamOpen.available() == 0) {
                ToygerLog.e("error asset lenght = 0");
            } else {
                bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
            }
        } catch (IOException e10) {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "load func: InputStream read model exeception" + e10.getStackTrace());
        }
        return bArr;
    }

    private static byte[] readFileByPath(String str) {
        File file = new File(str);
        byte[] bArr = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            if (iAvailable <= 0) {
                return null;
            }
            bArr = new byte[iAvailable];
            fileInputStream.read(bArr);
            return bArr;
        } catch (IOException unused) {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "open downloaded model error");
            return bArr;
        }
    }

    private static byte[] readModel(Context context) {
        return readFile(context, ToygerBaseService.ASSET_FACE);
    }

    private int setupWorkingThread() {
        if (this.mProcessThread == null) {
            HandlerThreadPool.setKeepAliveTime(3000L);
            HandlerThread handlerThreadBorrowHandlerThread = HandlerThreadPool.borrowHandlerThread("ToygerProcessQueue");
            this.mProcessThread = handlerThreadBorrowHandlerThread;
            if (handlerThreadBorrowHandlerThread.getState() == Thread.State.NEW) {
                this.mProcessThread.start();
            }
            if (this.mProcessThread == null) {
                return -1;
            }
        }
        if (this.mProcessThreadHandler == null) {
            this.mProcessThreadHandler = new Handler(this.mProcessThread.getLooper());
        }
        if (this.mCallbackThread == null) {
            HandlerThread handlerThread = new HandlerThread("ToygerCallbackQueue");
            this.mCallbackThread = handlerThread;
            handlerThread.start();
            if (this.mCallbackThread == null) {
                return -3;
            }
        }
        if (this.mCallbackThreadHandler != null) {
            return 0;
        }
        this.mCallbackThreadHandler = new Handler(this.mCallbackThread.getLooper()) { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                if (i10 != 0) {
                    if (i10 != 1) {
                        super.handleMessage(message);
                        return;
                    }
                    HashMap map = (HashMap) message.obj;
                    ToygerFaceState toygerFaceState = (ToygerFaceState) map.get("TOYGER_CALLBACK_STATE_KEY");
                    ToygerFaceAttr toygerFaceAttr = new ToygerFaceAttr((ToygerFaceAttr) map.get("TOYGER_CALLBACK_ATTR_KEY"), ToygerFaceService.this.isMirror);
                    HashMap map2 = new HashMap(2);
                    map2.put(ToygerFaceService.KEY_TOYGER_FRAME, ToygerFaceService.this.mFrameProcessor.getTgFrame());
                    map2.put(ToygerFaceService.KEY_TOYGER_DEPTH_FRAME, ToygerFaceService.this.mFrameProcessor.getTgDepthFrame());
                    if (((ToygerBaseService) ToygerFaceService.this).mToygerCallback != null) {
                        ((ToygerFaceCallback) ((ToygerBaseService) ToygerFaceService.this).mToygerCallback).onStateUpdated(toygerFaceState, toygerFaceAttr, map2);
                        return;
                    }
                    return;
                }
                HashMap map3 = (HashMap) message.obj;
                int i11 = message.arg2;
                if (i11 == 2) {
                    ToygerLog.v("TOYGER_FLOW_NATIVE", map3.toString());
                    return;
                }
                if (i11 == 3) {
                    ToygerLog.d("TOYGER_FLOW_NATIVE", map3.toString());
                    return;
                }
                if (i11 == 4) {
                    ToygerLog.i("TOYGER_FLOW_NATIVE", map3.toString());
                } else if (i11 != 6) {
                    ToygerLog.i("TOYGER_FLOW_NATIVE", map3.toString());
                } else {
                    ToygerLog.e("TOYGER_FLOW_NATIVE", map3.toString());
                }
            }
        };
        return 0;
    }

    private void startGyroServiceWithFaceBlobConfig(ToygerFaceBlobConfig toygerFaceBlobConfig) {
        if (toygerFaceBlobConfig.collection.contains("Gyro")) {
            if (this.mSensorThread == null) {
                HandlerThread handlerThread = new HandlerThread("ToygerSensorProcessQueue");
                this.mSensorThread = handlerThread;
                handlerThread.start();
            }
            if (this.mSensorThreadHandler == null) {
                this.mSensorThreadHandler = new Handler(this.mSensorThread.getLooper());
            }
            super.handleEventTriggered(-8, "");
        }
    }

    private void startLocalMatching(Context context, Map<String, Object> map, ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig) {
    }

    public void addMonitorImage(TGFrame tGFrame) {
        FaceBlobManager faceBlobManager = this.blobManager;
        if (faceBlobManager != null) {
            faceBlobManager.addMonitorImage(tGFrame);
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public boolean config(Map<String, Object> map) {
        ToygerLog.d("TOYGER_FLOW_ANDROID", "ToygerFaceService.config()");
        if (map != null) {
            String str = (String) map.get(ToygerBaseService.KEY_ALGORITHM_CONFIG);
            String str2 = (String) map.get(ToygerBaseService.KEY_PUBLIC_KEY);
            String str3 = (String) map.get(ToygerBaseService.KEY_UPLOAD_CONFIG);
            String str4 = (String) map.get(ToygerBaseService.KEY_IS_MIRROR);
            boolean z10 = false;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.config() Invalid key or upload config!");
                return false;
            }
            ToygerFaceBlobConfig toygerFaceBlobConfigFrom = ToygerFaceBlobConfig.from(str3, str2);
            this.blobManager = blobManagerByExtInfo(map, toygerFaceBlobConfigFrom);
            this.faceAlgConfig = ToygerFaceAlgorithmConfig.from(str);
            this.blobManager.isNano = toygerFaceBlobConfigFrom.collection.contains(BlobManager.SUB_TYPE_NANO);
            if (this.faceAlgConfig.liveness_combination.contains(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS)) {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "collection contains DragonflyLiveness");
            } else {
                ToygerLog.d("TOYGER_FLOW_ANDROID", "collection dont contains DragonflyLiveness");
            }
            if (this.blobManager.isNano && !this.faceAlgConfig.liveness_combination.contains(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS)) {
                this.faceAlgConfig.liveness_combination.add(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS);
                if (!this.faceAlgConfig.threshold.containsKey(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.5f));
                    this.faceAlgConfig.threshold.put(ToygerFaceAlgorithmConfig.DRAGONFLY_LIVENESS, arrayList);
                }
                ToygerLog.d("TOYGER_FLOW_ANDROID", "collection is nano, adding DragonflyLiveness, result=" + this.faceAlgConfig.liveness_combination);
            }
            if (str2 != null) {
                if (str4 != null && Boolean.parseBoolean(str4)) {
                    z10 = true;
                }
                this.isMirror = z10;
                final ToygerConfig toygerConfig = parseToygerConfig(this.faceAlgConfig, toygerFaceBlobConfigFrom, map);
                startGyroServiceWithFaceBlobConfig(toygerFaceBlobConfigFrom);
                if (toygerConfig.livenessConfig.collection.contains(BlobManager.SUB_TYPE_NANO)) {
                    model = readModel(this.cacheContext);
                } else if (model == null) {
                    ToygerLog.i("TOYGER_FLOW_ANDROID", "model == null need reload");
                    byte[] model2 = readModel(this.cacheContext);
                    model = model2;
                    if (model2 == null) {
                        ToygerLog.e("TOYGER_FLOW_ANDROID", "reload model error");
                    }
                }
                Handler handler = this.mProcessThreadHandler;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (ToygerFaceService.this.localMatching) {
                                return;
                            }
                            ToygerFaceService toygerFaceService = ToygerFaceService.this;
                            toygerFaceService.initResult = toygerFaceService.initToygerNative(toygerFaceService.cacheContext);
                            ToygerFaceService toygerFaceService2 = ToygerFaceService.this;
                            if (toygerFaceService2.initResult) {
                                ((ToygerFaceCallback) ((ToygerBaseService) toygerFaceService2).mToygerCallback).onEvent(-100, null);
                                ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.config.native.config");
                                Toyger.config(this, toygerConfig);
                            } else {
                                ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.config() init error !!!!!! won't config");
                                ((ToygerFaceCallback) ((ToygerBaseService) ToygerFaceService.this).mToygerCallback).onEvent(-4, null);
                            }
                            byte[] unused = ToygerFaceService.model = null;
                        }
                    });
                }
            }
        }
        return true;
    }

    public Map<String, Object> generateBlob(Map<String, Object> map) {
        FaceBlobManager faceBlobManager;
        if (map == null || (faceBlobManager = this.blobManager) == null) {
            return null;
        }
        Map<String, Object> mapGenerateBlob = faceBlobManager.generateBlob(map);
        mapGenerateBlob.put("key", this.blobManager.getKey());
        mapGenerateBlob.put(ToygerBaseService.KEY_RES_9_IS_UTF8, Boolean.valueOf(this.blobManager.isUTF8()));
        return mapGenerateBlob;
    }

    public Map<String, Object> generateMonitorBlob() {
        HashMap map;
        byte[] monitorBlob;
        long jCurrentTimeMillis = System.currentTimeMillis();
        FaceBlobManager faceBlobManager = this.blobManager;
        if (faceBlobManager == null || (monitorBlob = faceBlobManager.getMonitorBlob()) == null) {
            map = null;
        } else {
            byte[] key = this.blobManager.getKey();
            map = new HashMap(3);
            map.put("content", monitorBlob);
            map.put("key", key);
            map.put(ToygerBaseService.KEY_RES_9_IS_UTF8, Boolean.valueOf(this.blobManager.isUTF8()));
        }
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.generateMonitorBlob time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        return map;
    }

    public Map<String, Object> generateVideoFileBlob(String str) {
        byte[] fileIdBlob;
        long jCurrentTimeMillis = System.currentTimeMillis();
        FaceBlobManager faceBlobManager = this.blobManager;
        if (faceBlobManager == null || (fileIdBlob = faceBlobManager.getFileIdBlob(str)) == null) {
            return null;
        }
        byte[] key = this.blobManager.getKey();
        HashMap map = new HashMap(3);
        map.put("content", fileIdBlob);
        map.put("key", key);
        map.put(ToygerBaseService.KEY_RES_9_IS_UTF8, Boolean.valueOf(this.blobManager.isUTF8()));
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.generateVideoFileBlob time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        return map;
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleCaptureCompleted(final int i10, final List<ToygerFaceInfo> list, final Map<String, Object> map) {
        this.mCallbackThreadHandler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.11
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ToygerFaceService.this.blobManager.isMirror = ToygerFaceService.this.isMirror;
                System.currentTimeMillis();
                byte[] bArrGenerateBlob = ToygerFaceService.this.blobManager.generateBlob(list, map);
                byte[] key = ToygerFaceService.this.blobManager.getKey();
                boolean z10 = i10 < 0;
                int length = bArrGenerateBlob != null ? bArrGenerateBlob.length : 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("handleCaptureCompleted time cost:");
                sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sb2.append("ms; blob Content size:");
                sb2.append(length);
                sb2.append(z10 ? "|活体失败" : "|活体成功");
                ToygerLog.i("TOYGER_FLOW_ANDROID", sb2.toString());
                long unused = ToygerFaceService.totalDropFrame = 0L;
                long unused2 = ToygerFaceService.totalProcessFrame = 0L;
                long unused3 = ToygerFaceService.totalFrame = 0L;
                if (((ToygerBaseService) ToygerFaceService.this).mToygerCallback != null) {
                    if (z10) {
                        ((ToygerFaceCallback) ((ToygerBaseService) ToygerFaceService.this).mToygerCallback).onAsyncUpload(-200, bArrGenerateBlob, key, ToygerFaceService.this.blobManager.isUTF8());
                    } else {
                        ((ToygerFaceCallback) ((ToygerBaseService) ToygerFaceService.this).mToygerCallback).onComplete(i10, bArrGenerateBlob, key, ToygerFaceService.this.blobManager.isUTF8());
                    }
                }
            }
        });
    }

    public void handleDepthInfoReady(final ToygerDepthInfo toygerDepthInfo) {
        this.mCallbackThreadHandler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.8
            @Override // java.lang.Runnable
            public void run() {
                FaceBlobManager faceBlobManager = ToygerFaceService.this.blobManager;
                ToygerDepthInfo toygerDepthInfo2 = toygerDepthInfo;
                faceBlobManager.depthInfo = toygerDepthInfo2;
                if (toygerDepthInfo2 != null) {
                    ToygerFaceService.this.blobManager.bestDepthImage = ToygerFaceService.this.blobManager.processDepthInfo(toygerDepthInfo);
                }
            }
        });
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleEventTriggered(final int i10, final String str) {
        this.mCallbackThreadHandler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.7
            @Override // java.lang.Runnable
            public void run() {
                ToygerFaceService.super.handleEventTriggered(i10, str);
            }
        });
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleInfoReady(final TGFrame tGFrame, final ToygerFaceAttr toygerFaceAttr) {
        this.mCallbackThreadHandler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.10
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                TGFrame tGFrame2 = tGFrame;
                Bitmap bitmapA = b.a(tGFrame2, tGFrame2.width, 1.0f, !ToygerFaceService.this.isMirror);
                ToygerFaceService.this.blobManager.bestLightImage = b.b(tGFrame, ToygerFaceService.this.blobManager.desireWidth, ToygerFaceService.this.blobManager.compressRate, ToygerFaceService.this.blobManager.compressFormat, ToygerFaceService.this.isMirror);
                ToygerFaceAttr toygerFaceAttr2 = new ToygerFaceAttr(toygerFaceAttr, ToygerFaceService.this.isMirror);
                if (((ToygerBaseService) ToygerFaceService.this).mToygerCallback != null) {
                    ((ToygerFaceCallback) ((ToygerBaseService) ToygerFaceService.this).mToygerCallback).onHighQualityFrame(bitmapA, toygerFaceAttr2);
                    if (ToygerFaceService.this.blobManager.isNano) {
                        ((ToygerFaceCallback) ((ToygerBaseService) ToygerFaceService.this).mToygerCallback).onAsyncUpload(-100, ToygerFaceService.this.blobManager.generateFaceBlob(tGFrame, toygerFaceAttr), ToygerFaceService.this.blobManager.getKey(), ToygerFaceService.this.blobManager.isUTF8());
                    }
                }
                ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.handleInfoReady time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
        });
    }

    public void handleInfraRedInfoReady(final TGFrame tGFrame) {
        this.mCallbackThreadHandler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.9
            @Override // java.lang.Runnable
            public void run() {
                FaceBlobManager faceBlobManager = ToygerFaceService.this.blobManager;
                TGFrame tGFrame2 = tGFrame;
                faceBlobManager.irFrame = tGFrame2;
                if (tGFrame2 != null) {
                    ToygerFaceService.this.blobManager.bestIRImage = ToygerFaceService.this.blobManager.processIRFrameInfo(tGFrame, !ToygerFaceService.this.isMirror);
                }
            }
        });
    }

    public void handleLocalMatchingEvent(int i10) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleLog(int i10, HashMap<String, Object> map) {
        Handler handler = this.mCallbackThreadHandler;
        if (handler != null) {
            this.mCallbackThreadHandler.dispatchMessage(handler.obtainMessage(TOYGER_CALLBACK_CODE_LOG, 0, i10, map));
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleScanCompleted(int i10, List<ToygerFaceInfo> list, Map<String, Object> map) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleStateUpdated(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr) {
        this.callBackObject.put("TOYGER_CALLBACK_STATE_KEY", toygerFaceState);
        this.callBackObject.put("TOYGER_CALLBACK_ATTR_KEY", toygerFaceAttr);
        this.mCallbackThreadHandler.dispatchMessage(this.mCallbackThreadHandler.obtainMessage(TOYGER_CALLBACK_CODE_UPDATE, this.callBackObject));
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public /* bridge */ /* synthetic */ boolean init(Context context, ToygerCallback toygerCallback, String str, String str2, Map map) {
        return init(context, (ToygerFaceCallback) toygerCallback, str, str2, (Map<String, Object>) map);
    }

    public boolean init(Context context, ToygerFaceCallback toygerFaceCallback, String str, String str2, Map<String, Object> map) {
        boolean zInit = init(context, false, toygerFaceCallback);
        if (!zInit) {
            return zInit;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put(ToygerBaseService.KEY_ALGORITHM_CONFIG, str);
        map.put(ToygerBaseService.KEY_UPLOAD_CONFIG, str2);
        return config(map);
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public boolean init(Context context, boolean z10, ToygerFaceCallback toygerFaceCallback) {
        ToygerLog.d("TOYGER_FLOW_ANDROID", "ToygerFaceService.init()");
        toygerIsBusy = Boolean.TRUE;
        int i10 = setupWorkingThread();
        if (i10 < 0) {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.init() setup working thread error" + i10);
            return false;
        }
        this.localMatching = z10;
        this.mToygerCallback = toygerFaceCallback;
        this.cacheContext = context;
        if (model == null && !load(context)) {
            ToygerLog.e("TOYGER_FLOW_ANDROID", "ToygerFaceService.init() fail to load assets file!");
        }
        if (this.mProcessThreadHandler != null) {
            return true;
        }
        ((ToygerFaceCallback) this.mToygerCallback).onEvent(-4, null);
        this.initResult = false;
        return true;
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public boolean processImage(List<TGFrame> list, TGDepthFrame tGDepthFrame) {
        totalFrame++;
        if (this.initResult && this.mImageProcessing.compareAndSet(false, true)) {
            totalProcessFrame++;
            System.currentTimeMillis();
            ArrayList arrayList = new ArrayList(list.size());
            for (TGFrame tGFrame : list) {
                if (tGFrame.frameType == 3) {
                    deepCopyIRFrame(tGFrame);
                } else {
                    if (a.f35585q.booleanValue() && tGDepthFrame != null) {
                        this.mFrameProcessor.initFame(tGFrame.deepCopy(), tGDepthFrame.deepCopy());
                    }
                    deepCopyRGBFrame(tGFrame);
                }
                arrayList.add(tGFrame);
            }
            if (tGDepthFrame != null && tGDepthFrame.byteBuffer != null) {
                deepCopyTGDepthFrame(tGDepthFrame);
            }
            if (this.mProcessThreadHandler != null) {
                if (this.cacheRunnable == null) {
                    this.cacheRunnable = new ToygerRunnable(arrayList, tGDepthFrame, this.fppAttr) { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.4
                        @Override // com.alipay.zoloz.toyger.face.ToygerRunnable, java.lang.Runnable
                        public void run() {
                            super.run();
                            ToygerFaceService.this.mImageProcessing.set(false);
                            ToygerLog.d("TOYGER_FLOW_ANDROID", "ToygerFaceService.processimage process frame count:" + ToygerFaceService.totalProcessFrame + " drop frame count:" + ToygerFaceService.totalDropFrame + ",total frame:" + ToygerFaceService.totalFrame);
                        }
                    };
                }
                ToygerRunnable toygerRunnable = this.cacheRunnable;
                toygerRunnable.frames = arrayList;
                toygerRunnable.depthFrame = tGDepthFrame;
                toygerRunnable.attr = this.fppAttr;
                this.mProcessThreadHandler.post(toygerRunnable);
            }
        } else {
            if (this.initResult) {
                ToygerLog.w("TOYGER_FLOW_ANDROID", "Toyger is busy ....");
            } else {
                ToygerLog.e("TOYGER_FLOW_ANDROID", "init fail, do not processed");
            }
            totalDropFrame++;
        }
        return true;
    }

    public boolean processSensorData(final TGSensorFrame tGSensorFrame) {
        if (tGSensorFrame != null && this.mSensorQueue.offer(tGSensorFrame)) {
            Handler handler = this.mSensorThreadHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (ToygerFaceService.this.mSensorRunning.get()) {
                                TGSensorFrame tGSensorFrame2 = (TGSensorFrame) ToygerFaceService.this.mSensorQueue.poll(1L, TimeUnit.SECONDS);
                                if (tGSensorFrame.gyroData != null) {
                                    ToygerLog.i("zsensor", "processingQueue caching gyroData");
                                    ToygerFaceService.this.cacheGyroData = tGSensorFrame2.gyroData;
                                    ToygerFaceService.this.cacheTimeStamp = tGSensorFrame2.timeStamp;
                                }
                                if (tGSensorFrame.rotationData != null) {
                                    ToygerFaceService.this.cacheRotationData = tGSensorFrame2.rotationData;
                                }
                                if (tGSensorFrame2 != null) {
                                    try {
                                        if (ToygerFaceService.this.cacheGyroData != null) {
                                            Toyger.processSensorData(ToygerFaceService.this.cacheGyroData, null, ToygerFaceService.this.cacheRotationData, ToygerFaceService.this.cacheTimeStamp);
                                            ToygerFaceService.this.cacheGyroData = null;
                                            ToygerFaceService.this.cacheTimeStamp = 0L;
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        ToygerLog.e("TOYGER_FLOW_ANDROID", "Failed toProcess Sensor Data().", th2);
                                        return;
                                    }
                                    ToygerLog.e("TOYGER_FLOW_ANDROID", "Failed to processSensorData", th);
                                }
                            }
                        } catch (Throwable th3) {
                            ToygerLog.e("TOYGER_FLOW_ANDROID", "Failed to processSensorData", th3);
                        }
                    }
                });
            }
        }
        return true;
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public void release() {
        toygerIsBusy = Boolean.FALSE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mSensorRunning.set(false);
        HandlerThread handlerThread = this.mSensorThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release mSensorThread quited time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        Handler handler = this.mProcessThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.6
                @Override // java.lang.Runnable
                public void run() {
                    if (!ToygerFaceService.this.localMatching) {
                        if (ToygerFaceService.this.rgbImagebuffer != null) {
                            Toyger.releaseRGBFrameData(ToygerFaceService.this.rgbImagebuffer);
                            ToygerFaceService.this.rgbImagebuffer = null;
                        }
                        if (ToygerFaceService.this.depthImageBuffer != null) {
                            Toyger.releaseDepthFrameData(ToygerFaceService.this.depthImageBuffer);
                            ToygerFaceService.this.depthImageBuffer = null;
                        }
                        if (ToygerFaceService.this.irImageBuffer != null) {
                            Toyger.releaseIRFrameData(ToygerFaceService.this.irImageBuffer);
                            ToygerFaceService.this.irImageBuffer = null;
                        }
                        Toyger.reset();
                        Toyger.release();
                    }
                    countDownLatch.countDown();
                    ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release mProcessThreadHandler=null, Toyger.release time:" + (System.currentTimeMillis() - jCurrentTimeMillis2) + "ms");
                }
            });
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            HandlerThread handlerThread2 = this.mProcessThread;
            if (handlerThread2 != null) {
                HandlerThreadPool.returnHandlerThread(handlerThread2);
                ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release mProcessThread quited time:" + (System.currentTimeMillis() - jCurrentTimeMillis3) + "ms");
            }
            this.mProcessThread = null;
            this.mProcessThreadHandler.removeCallbacksAndMessages(null);
            this.mProcessThreadHandler = null;
            HandlerThread handlerThread3 = this.mCallbackThread;
            if (handlerThread3 != null) {
                handlerThread3.quitSafely();
                ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release mCallbackThread quited time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
            this.mCallbackThread = null;
            Handler handler2 = this.mCallbackThreadHandler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.mCallbackThreadHandler = null;
            }
        } catch (InterruptedException unused) {
            ToygerLog.i("TOYGER_FLOW_ANDROID", "toyger release exeception");
        }
        this.mImageProcessing.set(false);
        this.localMatching = false;
        this.cacheGyroData = null;
        this.cacheRotationData = null;
        this.cacheContext = null;
        this.cacheUid = null;
        this.cacheToken = null;
        this.cacheCommand = null;
        this.mToygerCallback = null;
        this.tgFrameSignature = null;
        this.faceAttrSignature = null;
        this.faceStateSignature = null;
        this.cacheRunnable = null;
        ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceService.release time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public void reset() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mImageProcessing.set(false);
        Handler handler = this.mProcessThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.alipay.zoloz.toyger.face.ToygerFaceService.5
                @Override // java.lang.Runnable
                public void run() {
                    Toyger.reset();
                }
            });
        }
        ToygerLog.i("TOYGER_FLOW_ANDROID", "reset time cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
