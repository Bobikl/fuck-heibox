package com.ss.bytertc.engine.flutter.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.i1;
import androidx.annotation.n0;
import com.google.common.base.a;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.base.RTCVideoManager;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.ss.bytertc.engine.type.MessageConfig;
import com.taobao.accs.common.Constants;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RTCRoomPlugin extends RTCFlutterPlugin {
    private final MethodChannel.MethodCallHandler callHandler;
    private final List<RTCFlutterPlugin> flutterPlugins;
    private final Integer mIns;

    @n0
    private final RTCRoom mRTCRoom;
    private final RTCRoomEventProxy mRoomEventHandler;

    public RTCRoomPlugin(Integer num, @n0 RTCRoom rTCRoom) {
        ArrayList arrayList = new ArrayList();
        this.flutterPlugins = arrayList;
        RTCRoomEventProxy rTCRoomEventProxy = new RTCRoomEventProxy();
        this.mRoomEventHandler = rTCRoomEventProxy;
        this.callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.room.RTCRoomPlugin.1
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            @i1
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                RTCRoom rTCRoom2 = RTCRoomPlugin.this.mRTCRoom;
                RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
                String str = methodCall.method;
                str.hashCode();
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -2112277228:
                        if (str.equals("sendUserMessage")) {
                            b10 = 0;
                        }
                        break;
                    case -2000832867:
                        if (str.equals("unsubscribeScreen")) {
                            b10 = 1;
                        }
                        break;
                    case -1985133135:
                        if (str.equals("unsubscribeStream")) {
                            b10 = 2;
                        }
                        break;
                    case -1933380966:
                        if (str.equals("startSubtitle")) {
                            b10 = 3;
                        }
                        break;
                    case -1811922342:
                        if (str.equals("startForwardStreamToRooms")) {
                            b10 = 4;
                        }
                        break;
                    case -1783942046:
                        if (str.equals("unpublishScreen")) {
                            b10 = 5;
                        }
                        break;
                    case -1768242314:
                        if (str.equals("unpublishStream")) {
                            b10 = 6;
                        }
                        break;
                    case -1578369796:
                        if (str.equals("subscribeAllStreams")) {
                            b10 = 7;
                        }
                        break;
                    case -1401803483:
                        if (str.equals("joinRoom")) {
                            b10 = 8;
                        }
                        break;
                    case -1249128956:
                        if (str.equals("sendRoomMessage")) {
                            b10 = 9;
                        }
                        break;
                    case -1100092842:
                        if (str.equals("subscribeScreen")) {
                            b10 = 10;
                        }
                        break;
                    case -1084393110:
                        if (str.equals("subscribeStream")) {
                            b10 = 11;
                        }
                        break;
                    case -841816760:
                        if (str.equals("setRemoteRoomAudioPlaybackVolume")) {
                            b10 = 12;
                        }
                        break;
                    case -751392582:
                        if (str.equals("setAudioSelectionConfig")) {
                            b10 = 13;
                        }
                        break;
                    case -682070783:
                        if (str.equals("setRoomExtraInfo")) {
                            b10 = 14;
                        }
                        break;
                    case -583752016:
                        if (str.equals("updateToken")) {
                            b10 = 15;
                        }
                        break;
                    case -440085245:
                        if (str.equals("sendRoomBinaryMessage")) {
                            b10 = 16;
                        }
                        break;
                    case -346141245:
                        if (str.equals("unsubscribeAllStreams")) {
                            b10 = 17;
                        }
                        break;
                    case -318408907:
                        if (str.equals("setRemoteVideoConfig")) {
                            b10 = a.f56668u;
                        }
                        break;
                    case -234523142:
                        if (str.equals("stopForwardStreamToRooms")) {
                            b10 = 19;
                        }
                        break;
                    case 724244050:
                        if (str.equals("eventHandlerSwitches")) {
                            b10 = a.f56671x;
                        }
                        break;
                    case 1061197370:
                        if (str.equals("stopSubtitle")) {
                            b10 = a.f56672y;
                        }
                        break;
                    case 1154265107:
                        if (str.equals("sendUserBinaryMessage")) {
                            b10 = a.f56673z;
                        }
                        break;
                    case 1269660426:
                        if (str.equals("resumeForwardStreamToAllRooms")) {
                            b10 = a.A;
                        }
                        break;
                    case 1277814478:
                        if (str.equals("resumeAllSubscribedStream")) {
                            b10 = a.B;
                        }
                        break;
                    case 1350806305:
                        if (str.equals("pauseForwardStreamToAllRooms")) {
                            b10 = a.C;
                        }
                        break;
                    case 1456585317:
                        if (str.equals("pauseAllSubscribedStream")) {
                            b10 = a.D;
                        }
                        break;
                    case 1463639615:
                        if (str.equals("setUserVisibility")) {
                            b10 = a.E;
                        }
                        break;
                    case 1661210674:
                        if (str.equals("leaveRoom")) {
                            b10 = a.F;
                        }
                        break;
                    case 1705290205:
                        if (str.equals("setMultiDeviceAVSync")) {
                            b10 = a.G;
                        }
                        break;
                    case 1874754881:
                        if (str.equals("updateForwardStreamToRooms")) {
                            b10 = a.H;
                        }
                        break;
                    case 1997996635:
                        if (str.equals("publishScreen")) {
                            b10 = 31;
                        }
                        break;
                    case 2013696367:
                        if (str.equals("publishStream")) {
                            b10 = 32;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        result.success(Long.valueOf(rTCRoom2.sendUserMessage(rTCTypeBox.optString("uid"), rTCTypeBox.optString("message"), MessageConfig.fromId(rTCTypeBox.optInt("config")))));
                        break;
                    case 1:
                        result.success(Integer.valueOf(rTCRoom2.unsubscribeScreen(rTCTypeBox.optString("uid"), RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 2:
                        result.success(Integer.valueOf(rTCRoom2.unsubscribeStream(rTCTypeBox.optString("uid"), RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 3:
                        result.success(Integer.valueOf(rTCRoom2.startSubtitle(RTCType.toSubtitleConfig(rTCTypeBox.optBox("subtitleConfig")))));
                        break;
                    case 4:
                        result.success(Integer.valueOf(rTCRoom2.startForwardStreamToRooms(RTCType.toForwardStreamInfoList(rTCTypeBox.getList("forwardStreamInfos")))));
                        break;
                    case 5:
                        result.success(Integer.valueOf(rTCRoom2.unpublishScreen(RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 6:
                        result.success(Integer.valueOf(rTCRoom2.unpublishStream(RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 7:
                        result.success(Integer.valueOf(rTCRoom2.subscribeAllStreams(RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 8:
                        result.success(Integer.valueOf(rTCRoom2.joinRoom(rTCTypeBox.optString("token"), RTCType.toUserInfo(rTCTypeBox.optBox(Constants.KEY_USER_ID)), RTCType.toRTCRoomConfig(rTCTypeBox.optBox("roomConfig")))));
                        break;
                    case 9:
                        result.success(Long.valueOf(rTCRoom2.sendRoomMessage(rTCTypeBox.optString("message"))));
                        break;
                    case 10:
                        result.success(Integer.valueOf(rTCRoom2.subscribeScreen(rTCTypeBox.optString("uid"), RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 11:
                        result.success(Integer.valueOf(rTCRoom2.subscribeStream(rTCTypeBox.optString("uid"), RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 12:
                        result.success(Integer.valueOf(rTCRoom2.setRemoteRoomAudioPlaybackVolume(rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q))));
                        break;
                    case 13:
                        result.success(Integer.valueOf(rTCRoom2.setAudioSelectionConfig(RTCType.toAudioSelectionPriority(rTCTypeBox.optInt("audioSelectionPriority")))));
                        break;
                    case 14:
                        result.success(Long.valueOf(rTCRoom2.setRoomExtraInfo(rTCTypeBox.optString("key"), rTCTypeBox.optString("value"))));
                        break;
                    case 15:
                        result.success(Integer.valueOf(rTCRoom2.updateToken(rTCTypeBox.optString("token"))));
                        break;
                    case 16:
                        result.success(Long.valueOf(rTCRoom2.sendRoomBinaryMessage(rTCTypeBox.optBytes("message"))));
                        break;
                    case 17:
                        result.success(Integer.valueOf(rTCRoom2.unsubscribeAllStreams(RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 18:
                        result.success(Integer.valueOf(rTCRoom2.setRemoteVideoConfig(rTCTypeBox.optString("uid"), RTCType.toRemoteVideoConfig(rTCTypeBox.optBox("videoConfig")))));
                        break;
                    case 19:
                        result.success(Integer.valueOf(rTCRoom2.stopForwardStreamToRooms()));
                        break;
                    case 20:
                        RTCRoomPlugin.this.mRoomEventHandler.setSwitch(rTCTypeBox);
                        result.success(null);
                        break;
                    case 21:
                        result.success(Integer.valueOf(rTCRoom2.stopSubtitle()));
                        break;
                    case 22:
                        result.success(Long.valueOf(rTCRoom2.sendUserBinaryMessage(rTCTypeBox.optString("uid"), rTCTypeBox.optBytes("message"), MessageConfig.fromId(rTCTypeBox.optInt("config")))));
                        break;
                    case 23:
                        result.success(Integer.valueOf(rTCRoom2.resumeForwardStreamToAllRooms()));
                        break;
                    case 24:
                        result.success(Integer.valueOf(rTCRoom2.resumeAllSubscribedStream(RTCType.toPauseResumeControlMediaType(rTCTypeBox.optInt("mediaType")))));
                        break;
                    case 25:
                        result.success(Integer.valueOf(rTCRoom2.pauseForwardStreamToAllRooms()));
                        break;
                    case 26:
                        result.success(Integer.valueOf(rTCRoom2.pauseAllSubscribedStream(RTCType.toPauseResumeControlMediaType(rTCTypeBox.optInt("mediaType")))));
                        break;
                    case 27:
                        result.success(Integer.valueOf(rTCRoom2.setUserVisibility(rTCTypeBox.optBoolean("enable"))));
                        break;
                    case 28:
                        result.success(Integer.valueOf(rTCRoom2.leaveRoom()));
                        break;
                    case 29:
                        result.success(Integer.valueOf(rTCRoom2.setMultiDeviceAVSync(rTCTypeBox.optString("audioUid"))));
                        break;
                    case 30:
                        result.success(Integer.valueOf(rTCRoom2.updateForwardStreamToRooms(RTCType.toForwardStreamInfoList(rTCTypeBox.getList("forwardStreamInfos")))));
                        break;
                    case 31:
                        result.success(Integer.valueOf(rTCRoom2.publishScreen(RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    case 32:
                        result.success(Integer.valueOf(rTCRoom2.publishStream(RTCType.toMediaStreamType(rTCTypeBox.optInt("type")))));
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        this.mIns = num;
        rTCRoom.setRTCRoomEventHandler(rTCRoomEventProxy);
        this.mRTCRoom = rTCRoom;
        arrayList.add(new RangeAudioPlugin(num, rTCRoom));
        arrayList.add(new SpatialAudioPlugin(num, rTCRoom));
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        Iterator<RTCFlutterPlugin> it = this.flutterPlugins.iterator();
        while (it.hasNext()) {
            it.next().onAttachedToEngine(flutterPluginBinding);
        }
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_room" + this.mIns);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
        this.mRoomEventHandler.registerEvent(flutterPluginBinding.getBinaryMessenger(), this.mIns.intValue());
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onDetachedFromEngine(flutterPluginBinding);
        Iterator<RTCFlutterPlugin> it = this.flutterPlugins.iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromEngine(flutterPluginBinding);
        }
        RTCVideoManager.destroyRoom(this.mIns);
        this.mRoomEventHandler.destroy();
    }
}
