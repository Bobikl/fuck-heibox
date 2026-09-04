package com.ss.bytertc.engine.flutter.base;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.i1;
import androidx.annotation.n0;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class RTCVideoManager {

    @SuppressLint({"StaticFieldLeak"})
    private static Context mAppCxt;
    private static final HashMap<Integer, RTCRoom> sRTCRoomMap = new HashMap<>();
    private static RTCVideo sRtcVideo;

    private RTCVideoManager() {
    }

    public static void create(String str, IRTCVideoEventHandler iRTCVideoEventHandler, JSONObject jSONObject) {
        try {
            sRtcVideo = RTCVideo.createRTCVideo(mAppCxt, str, iRTCVideoEventHandler, null, jSONObject);
        } catch (Exception e10) {
            throw new RuntimeException("create engine error!", e10);
        }
    }

    public static RTCRoom createRoom(@n0 Integer num, @n0 String str) {
        RTCRoom rTCRoomCreateRTCRoom = getRTCVideo().createRTCRoom(str);
        if (rTCRoomCreateRTCRoom != null) {
            sRTCRoomMap.put(num, rTCRoomCreateRTCRoom);
        }
        return rTCRoomCreateRTCRoom;
    }

    @i1
    public static void destroy() {
        Iterator<Map.Entry<Integer, RTCRoom>> it = sRTCRoomMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().destroy();
            it.remove();
        }
        RTCVideo.destroyRTCVideo();
        sRtcVideo = null;
    }

    public static void destroyRoom(@n0 Integer num) {
        RTCRoom rTCRoomRemove = sRTCRoomMap.remove(num);
        if (rTCRoomRemove != null) {
            rTCRoomRemove.destroy();
        }
    }

    @n0
    public static RTCVideo getRTCVideo() {
        RTCVideo rTCVideo = sRtcVideo;
        if (rTCVideo != null) {
            return rTCVideo;
        }
        throw new IllegalStateException("RTCVideo not created YET.");
    }

    public static RTCRoom getRoom(@n0 Integer num) {
        return sRTCRoomMap.get(num);
    }

    public static boolean hasRTCVideo() {
        return sRtcVideo != null;
    }

    public static void setAppContext(Context context) {
        mAppCxt = context.getApplicationContext();
    }
}
