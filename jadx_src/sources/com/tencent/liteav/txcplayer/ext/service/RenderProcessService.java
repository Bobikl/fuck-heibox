package com.tencent.liteav.txcplayer.ext.service;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.common.c;
import com.tencent.liteav.txcplayer.ext.host.EngineConst;
import com.tencent.liteav.txcplayer.ext.host.HostEngine;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class RenderProcessService {
    private static final String TAG = "HostEngine-RenderProcessService";
    private static RenderProcessService mInstance;
    private boolean mEnableRenderProcess = true;
    private int mCurrentModel = 0;

    private RenderProcessService() {
    }

    public static RenderProcessService getInstance() {
        if (mInstance == null) {
            synchronized (RenderProcessService.class) {
                if (mInstance == null) {
                    mInstance = new RenderProcessService();
                }
            }
        }
        return mInstance;
    }

    public boolean canRenderProcessWork() {
        if (!isEnableRenderProcess()) {
            LiteavLog.i(TAG, "[canRenderProcessWork],isEnableRenderProcess == false !!!");
            return false;
        }
        if (!HostEngine.getInstance().checkAndLoadPlugin(2)) {
            LiteavLog.i(TAG, "[canRenderProcessWork],isEnableRenderProcess == false !!!");
            return false;
        }
        int i10 = this.mCurrentModel;
        if (i10 == 1 || i10 == 2) {
            HashMap map = new HashMap();
            HostEngine.getInstance().sendSyncRequestToPlugin(2, 104, null, map);
            Object obj = map.get("KEY_RET_PARAM1");
            if (!((obj == null || !(obj instanceof Boolean)) ? false : ((Boolean) obj).booleanValue())) {
                LiteavLog.i(TAG, "[canRenderProcessWork],IS_SUPPORT_RESOLUTION == false !!!");
                return false;
            }
        }
        LiteavLog.i(TAG, "[canRenderProcessWork], finally return true");
        return true;
    }

    public void checkInit(Context context) {
        HostEngine.getInstance().init(context);
    }

    public boolean connectPlayer(ITXVCubePlayer iTXVCubePlayer, Surface surface) {
        if (iTXVCubePlayer == null || surface == null) {
            LiteavLog.w(TAG, "connectPlayer invalid param player or surface is null !!!");
            return false;
        }
        if (!canRenderProcessWork()) {
            LiteavLog.w(TAG, "connectPlayer，postProcessService does not need to work");
            return false;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        map.put(EngineConst.ArgsKey.KEY_PARAM2, surface);
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 100, map, map2);
        Boolean bool = Boolean.FALSE;
        Object obj = map2.get("KEY_RET_PARAM1");
        if (obj != null && (obj instanceof Boolean)) {
            bool = (Boolean) obj;
        }
        return bool.booleanValue();
    }

    public int getVodLicenseFeature() {
        if (HostEngine.getInstance().getAppContext() == null) {
            LiteavLog.w(TAG, "Host engine not init!!");
            return 0;
        }
        boolean z10 = c.b(LicenseChecker.a.PLAYER_MONET) == LicenseChecker.d.OK;
        LiteavLog.i("VodLicenseCheck", "checkValidForPlayerMonet = ".concat(String.valueOf(z10)));
        return z10 ? 1 : 0;
    }

    public boolean isEnableRenderProcess() {
        return this.mEnableRenderProcess;
    }

    public boolean onTouchEvent(ITXVCubePlayer iTXVCubePlayer, MotionEvent motionEvent) {
        if (!canRenderProcessWork()) {
            return false;
        }
        int i10 = this.mCurrentModel;
        if (i10 != 11 && i10 != 12) {
            return false;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        map.put(EngineConst.ArgsKey.KEY_PARAM2, motionEvent);
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 105, map, map2);
        Object obj = map2.get("KEY_RET_PARAM1");
        if (obj == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public void sendPlayerEventToPlugin(ITXVCubePlayer iTXVCubePlayer, int i10, Bundle bundle) {
        if (canRenderProcessWork()) {
            if (iTXVCubePlayer == null) {
                LiteavLog.w(TAG, "sendPlayerEventToPlugin invalid param player is null !!!");
                return;
            }
            HashMap map = new HashMap();
            map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
            map.put(EngineConst.ArgsKey.KEY_PARAM2, Integer.valueOf(i10));
            map.put(EngineConst.ArgsKey.KEY_PARAM3, bundle);
            HostEngine.getInstance().sendSyncRequestToPlugin(2, 106, map, null);
        }
    }

    public void setEnableRenderProcess(boolean z10) {
        LiteavLog.d(TAG, "setEnableRenderProcess: ".concat(String.valueOf(z10)));
        this.mEnableRenderProcess = z10;
    }

    public boolean setSurfaceBufferSize(ITXVCubePlayer iTXVCubePlayer) {
        if (iTXVCubePlayer == null) {
            LiteavLog.w(TAG, "setSurfaceBufferSize invalid param player is null !!!");
            return false;
        }
        if (!canRenderProcessWork()) {
            LiteavLog.w(TAG, "setSurfaceBufferSize，postProcessService does not need to work");
            return false;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 101, map, map2);
        Boolean bool = Boolean.FALSE;
        Object obj = map2.get("KEY_RET_PARAM1");
        if (obj != null && (obj instanceof Boolean)) {
            bool = (Boolean) obj;
        }
        return bool.booleanValue();
    }

    public void stopRenderProcess(ITXVCubePlayer iTXVCubePlayer) {
        if (canRenderProcessWork()) {
            if (iTXVCubePlayer == null) {
                LiteavLog.w(TAG, "stopRenderProcess invalid param player is null !!!");
                return;
            }
            HashMap map = new HashMap();
            map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
            HostEngine.getInstance().sendSyncRequestToPlugin(2, 103, map, null);
        }
    }

    public void updateRenderProcessMode(ITXVCubePlayer iTXVCubePlayer, int i10) {
        this.mCurrentModel = i10;
        if (!canRenderProcessWork()) {
            LiteavLog.w(TAG, "updatePostProcessMode，postProcessService does not need to work");
            return;
        }
        if (iTXVCubePlayer == null) {
            LiteavLog.w(TAG, "updatePostProcessMode invalid param player is null !!!");
            return;
        }
        HashMap map = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        map.put(EngineConst.ArgsKey.KEY_PARAM2, Integer.valueOf(i10));
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 102, map, null);
    }
}
