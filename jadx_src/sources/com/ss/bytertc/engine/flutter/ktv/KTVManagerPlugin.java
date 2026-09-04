package com.ss.bytertc.engine.flutter.ktv;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.ss.bytertc.ktv.IKTVManager;
import com.ss.bytertc.ktv.IKTVPlayer;
import com.ss.bytertc.ktv.data.DownloadLyricType;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class KTVManagerPlugin extends RTCFlutterPlugin {
    private final MethodChannel.MethodCallHandler callHandler;
    private final KTVManagerEventProxy mEventProxy;
    private IKTVManager mKTVManager;
    private KTVPlayerPlugin mKTVPlayer;

    public KTVManagerPlugin(@n0 IKTVManager iKTVManager) {
        KTVManagerEventProxy kTVManagerEventProxy = new KTVManagerEventProxy();
        this.mEventProxy = kTVManagerEventProxy;
        this.callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.ktv.a
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                this.f97962b.lambda$new$0(methodCall, result);
            }
        };
        this.mKTVManager = iKTVManager;
        iKTVManager.setKTVManagerEventHandler(kTVManagerEventProxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MethodCall methodCall, MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "clearCache":
                this.mKTVManager.clearCache();
                result.success(null);
                break;
            case "searchMusic":
                this.mKTVManager.searchMusic(rTCTypeBox.optString("keyWord"), rTCTypeBox.optInt("pageNum"), rTCTypeBox.optInt("pageSize"), RTCType.toMusicFilterTypes(rTCTypeBox.getList("filters")));
                result.success(null);
                break;
            case "cancelDownload":
                this.mKTVManager.cancelDownload(rTCTypeBox.optInt("downloadId"));
                result.success(null);
                break;
            case "downloadLyric":
                result.success(Integer.valueOf(this.mKTVManager.downloadLyric(rTCTypeBox.optString("musicId"), DownloadLyricType.fromId(rTCTypeBox.optInt("lyricType")))));
                break;
            case "downloadMusic":
                result.success(Integer.valueOf(this.mKTVManager.downloadMusic(rTCTypeBox.optString("musicId"))));
                break;
            case "getMusicDetail":
                this.mKTVManager.getMusicDetail(rTCTypeBox.optString("musicId"));
                result.success(null);
                break;
            case "getMusicList":
                this.mKTVManager.getMusicList(rTCTypeBox.optInt("pageNum"), rTCTypeBox.optInt("pageSize"), RTCType.toMusicFilterTypes(rTCTypeBox.getList("filters")));
                result.success(null);
                break;
            case "setMaxCacheSize":
                this.mKTVManager.setMaxCacheSize(rTCTypeBox.optInt("maxCacheSizeMB"));
                result.success(null);
                break;
            case "downloadMidi":
                result.success(Integer.valueOf(this.mKTVManager.downloadMidi(rTCTypeBox.optString("musicId"))));
                break;
            case "getKTVPlayer":
                if (this.mKTVPlayer == null) {
                    IKTVPlayer kTVPlayer = this.mKTVManager.getKTVPlayer();
                    boolean z10 = kTVPlayer != null;
                    if (z10) {
                        KTVPlayerPlugin kTVPlayerPlugin = new KTVPlayerPlugin(kTVPlayer);
                        this.mKTVPlayer = kTVPlayerPlugin;
                        kTVPlayerPlugin.onAttachedToEngine(this.binding);
                    }
                    result.success(Boolean.valueOf(z10));
                    break;
                } else {
                    result.success(Boolean.TRUE);
                    break;
                }
                break;
            case "getHotMusic":
                this.mKTVManager.getHotMusic(RTCType.toMusicHotTypes(rTCTypeBox.getList("hotTypes")), RTCType.toMusicFilterTypes(rTCTypeBox.getList("filters")));
                result.success(null);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_ktv_manager");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
        this.mEventProxy.registerEvent(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onDetachedFromEngine(flutterPluginBinding);
        this.mEventProxy.destroy();
        KTVPlayerPlugin kTVPlayerPlugin = this.mKTVPlayer;
        if (kTVPlayerPlugin != null) {
            kTVPlayerPlugin.onDetachedFromEngine(flutterPluginBinding);
        }
    }
}
