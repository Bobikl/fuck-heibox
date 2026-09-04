package xyz.luan.audioplayers;

import android.content.Context;
import android.media.AudioManager;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import nl.BytesSource;
import nl.UrlSource;
import xyz.luan.audioplayers.player.WrappedPlayer;
import xyz.luan.audioplayers.player.l;
import yh.p;

/* JADX INFO: compiled from: AudioplayersPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bC\u0010DJT\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042:\u0010\u000b\u001a6\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\nH\u0002J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0011J\u0016\u0010 \u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000fJ\u000e\u0010#\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u000fJ,\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010'\u001a\u0004\u0018\u00010&J$\u0010)\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010'\u001a\u0004\u0018\u00010&J\u000e\u0010*\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0011R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010;R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010A¨\u0006E"}, d2 = {"Lxyz/luan/audioplayers/AudioplayersPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "response", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "Lkotlin/b2;", "Lxyz/luan/audioplayers/FlutterHandler;", "handler", "t", RXScreenCaptureService.KEY_HEIGHT, "q", "", "playerId", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "g", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "onDetachedFromEngine", "Landroid/content/Context;", "e", "Landroid/media/AudioManager;", "f", "player", "j", "i", "", "isPrepared", "o", "message", "n", "m", Constants.KEY_ERROR_CODE, "errorMessage", "", "errorDetails", "k", "l", "p", "Lio/flutter/plugin/common/MethodChannel;", "b", "Lio/flutter/plugin/common/MethodChannel;", "methods", ak.aF, "globalMethods", "Lxyz/luan/audioplayers/g;", "d", "Lxyz/luan/audioplayers/g;", "globalEvents", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Lio/flutter/plugin/common/BinaryMessenger;", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lxyz/luan/audioplayers/player/l;", "Lxyz/luan/audioplayers/player/l;", "soundPoolManager", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "players", "Lxyz/luan/audioplayers/a;", "Lxyz/luan/audioplayers/a;", "defaultAudioContext", "<init>", "()V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class AudioplayersPlugin implements FlutterPlugin {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private MethodChannel methods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private MethodChannel globalMethods;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private g globalEvents;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Context context;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private BinaryMessenger binaryMessenger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private l soundPoolManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ConcurrentHashMap<String, WrappedPlayer> players = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private AudioContextAndroid defaultAudioContext = new AudioContextAndroid();

    private final WrappedPlayer g(String playerId) {
        WrappedPlayer wrappedPlayer = this.players.get(playerId);
        if (wrappedPlayer != null) {
            return wrappedPlayer;
        }
        throw new IllegalStateException("Player has not yet been created or has already been disposed.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1630329231) {
                if (iHashCode != 910310901) {
                    if (iHashCode == 1902436987 && str.equals("setAudioContext")) {
                        AudioManager audioManagerF = f();
                        audioManagerF.setMode(this.defaultAudioContext.k());
                        audioManagerF.setSpeakerphoneOn(this.defaultAudioContext.p());
                        this.defaultAudioContext = d.b(methodCall);
                        result.success(1);
                        return;
                    }
                } else if (str.equals("emitError")) {
                    String str2 = (String) methodCall.argument("code");
                    if (str2 == null) {
                        throw new IllegalStateException("code is required".toString());
                    }
                    String str3 = (String) methodCall.argument("message");
                    if (str3 == null) {
                        throw new IllegalStateException("message is required".toString());
                    }
                    l(str2, str3, null);
                    result.success(1);
                    return;
                }
            } else if (str.equals("emitLog")) {
                String str4 = (String) methodCall.argument("message");
                if (str4 == null) {
                    throw new IllegalStateException("message is required".toString());
                }
                m(str4);
                result.success(1);
                return;
            }
        }
        result.notImplemented();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void q(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("playerId");
        if (str == null) {
            return;
        }
        PlayerMode playerModeValueOf = null;
        l lVar = null;
        ReleaseMode releaseModeValueOf = null;
        if (f0.g(methodCall.method, TopicHashtagWrapper.TYPE_CREATE)) {
            BinaryMessenger binaryMessenger = this.binaryMessenger;
            if (binaryMessenger == null) {
                f0.S("binaryMessenger");
                binaryMessenger = null;
            }
            g gVar = new g(new EventChannel(binaryMessenger, "xyz.luan/audioplayers/events/" + str));
            ConcurrentHashMap<String, WrappedPlayer> concurrentHashMap = this.players;
            AudioContextAndroid audioContextAndroidI = AudioContextAndroid.i(this.defaultAudioContext, false, false, 0, 0, 0, 0, 63, null);
            l lVar2 = this.soundPoolManager;
            if (lVar2 == null) {
                f0.S("soundPoolManager");
            } else {
                lVar = lVar2;
            }
            concurrentHashMap.put(str, new WrappedPlayer(this, gVar, audioContextAndroidI, lVar));
            result.success(1);
            return;
        }
        WrappedPlayer wrappedPlayerG = g(str);
        try {
            String str2 = methodCall.method;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1757019252:
                        if (str2.equals("getCurrentPosition")) {
                            result.success(wrappedPlayerG.j());
                            return;
                        }
                        break;
                    case -1722943962:
                        if (str2.equals("setPlayerMode")) {
                            String str3 = (String) methodCall.argument("playerMode");
                            if (str3 != null) {
                                f0.o(str3, "argument<String>(name) ?: return null");
                                playerModeValueOf = PlayerMode.valueOf(d.d((String) CollectionsKt___CollectionsKt.k3(StringsKt__StringsKt.T4(str3, new char[]{lg.a.f131414g}, false, 0, 6, null))));
                            }
                            if (playerModeValueOf == null) {
                                throw new IllegalStateException("playerMode is required".toString());
                            }
                            wrappedPlayerG.M(playerModeValueOf);
                            result.success(1);
                            return;
                        }
                        break;
                    case -1660487654:
                        if (str2.equals("setBalance")) {
                            Double d10 = (Double) methodCall.argument("balance");
                            if (d10 == null) {
                                throw new IllegalStateException("balance is required".toString());
                            }
                            wrappedPlayerG.K((float) d10.doubleValue());
                            result.success(1);
                            return;
                        }
                        break;
                    case -1630329231:
                        if (str2.equals("emitLog")) {
                            String str4 = (String) methodCall.argument("message");
                            if (str4 == null) {
                                throw new IllegalStateException("message is required".toString());
                            }
                            wrappedPlayerG.x(str4);
                            result.success(1);
                            return;
                        }
                        break;
                    case -934426579:
                        if (str2.equals("resume")) {
                            wrappedPlayerG.H();
                            result.success(1);
                            return;
                        }
                        break;
                    case -402284771:
                        if (str2.equals("setPlaybackRate")) {
                            Double d11 = (Double) methodCall.argument("playbackRate");
                            if (d11 == null) {
                                throw new IllegalStateException("playbackRate is required".toString());
                            }
                            wrappedPlayerG.P((float) d11.doubleValue());
                            result.success(1);
                            return;
                        }
                        break;
                    case -159032046:
                        if (str2.equals("setSourceUrl")) {
                            String str5 = (String) methodCall.argument("url");
                            if (str5 == null) {
                                throw new IllegalStateException("url is required".toString());
                            }
                            Boolean bool = (Boolean) methodCall.argument("isLocal");
                            if (bool == null) {
                                bool = Boolean.FALSE;
                            }
                            try {
                                wrappedPlayerG.T(new UrlSource(str5, bool.booleanValue()));
                                result.success(1);
                                return;
                            } catch (FileNotFoundException e10) {
                                result.error("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", e10);
                                return;
                            }
                        }
                        break;
                        break;
                    case 3526264:
                        if (str2.equals("seek")) {
                            Integer num = (Integer) methodCall.argument(CommonNetImpl.POSITION);
                            if (num == null) {
                                throw new IllegalStateException("position is required".toString());
                            }
                            wrappedPlayerG.J(num.intValue());
                            result.success(1);
                            return;
                        }
                        break;
                    case 3540994:
                        if (str2.equals("stop")) {
                            wrappedPlayerG.W();
                            result.success(1);
                            return;
                        }
                        break;
                    case 85887754:
                        if (str2.equals("getDuration")) {
                            result.success(wrappedPlayerG.k());
                            return;
                        }
                        break;
                    case 106440182:
                        if (str2.equals("pause")) {
                            wrappedPlayerG.G();
                            result.success(1);
                            return;
                        }
                        break;
                    case 670514716:
                        if (str2.equals("setVolume")) {
                            Double d12 = (Double) methodCall.argument(com.max.xiaoheihe.module.voice.component.a.f94101q);
                            if (d12 == null) {
                                throw new IllegalStateException("volume is required".toString());
                            }
                            wrappedPlayerG.U((float) d12.doubleValue());
                            result.success(1);
                            return;
                        }
                        break;
                    case 910310901:
                        if (str2.equals("emitError")) {
                            String str6 = (String) methodCall.argument("code");
                            if (str6 == null) {
                                throw new IllegalStateException("code is required".toString());
                            }
                            String str7 = (String) methodCall.argument("message");
                            if (str7 == null) {
                                throw new IllegalStateException("message is required".toString());
                            }
                            wrappedPlayerG.w(str6, str7, null);
                            result.success(1);
                            return;
                        }
                        break;
                    case 1090594823:
                        if (str2.equals("release")) {
                            wrappedPlayerG.I();
                            result.success(1);
                            return;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            wrappedPlayerG.e();
                            this.players.remove(str);
                            result.success(1);
                            return;
                        }
                        break;
                    case 1771699022:
                        if (str2.equals("setSourceBytes")) {
                            byte[] bArr = (byte[]) methodCall.argument("bytes");
                            if (bArr == null) {
                                throw new IllegalStateException("bytes are required".toString());
                            }
                            wrappedPlayerG.T(new BytesSource(bArr));
                            result.success(1);
                            return;
                        }
                        break;
                    case 1902436987:
                        if (str2.equals("setAudioContext")) {
                            wrappedPlayerG.X(d.b(methodCall));
                            result.success(1);
                            return;
                        }
                        break;
                    case 2096116872:
                        if (str2.equals("setReleaseMode")) {
                            String str8 = (String) methodCall.argument("releaseMode");
                            if (str8 != null) {
                                f0.o(str8, "argument<String>(name) ?: return null");
                                releaseModeValueOf = ReleaseMode.valueOf(d.d((String) CollectionsKt___CollectionsKt.k3(StringsKt__StringsKt.T4(str8, new char[]{lg.a.f131414g}, false, 0, 6, null))));
                            }
                            if (releaseModeValueOf == null) {
                                throw new IllegalStateException("releaseMode is required".toString());
                            }
                            wrappedPlayerG.Q(releaseModeValueOf);
                            result.success(1);
                            return;
                        }
                        break;
                }
            }
            result.notImplemented();
        } catch (Exception e11) {
            result.error("AndroidAudioError", e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AudioplayersPlugin this$0, MethodCall call, MethodChannel.Result response) {
        f0.p(this$0, "this$0");
        f0.p(call, "call");
        f0.p(response, "response");
        this$0.t(call, response, new AudioplayersPlugin$onAttachedToEngine$1$1(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(AudioplayersPlugin this$0, MethodCall call, MethodChannel.Result response) {
        f0.p(this$0, "this$0");
        f0.p(call, "call");
        f0.p(response, "response");
        this$0.t(call, response, new AudioplayersPlugin$onAttachedToEngine$2$1(this$0));
    }

    private final void t(MethodCall methodCall, MethodChannel.Result result, p<? super MethodCall, ? super MethodChannel.Result, b2> pVar) {
        try {
            pVar.invoke(methodCall, result);
        } catch (Exception e10) {
            result.error("Unexpected AndroidAudioError", e10.getMessage(), e10);
        }
    }

    @dl.d
    public final Context e() {
        Context context = this.context;
        if (context == null) {
            f0.S(com.umeng.analytics.pro.d.R);
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        f0.o(applicationContext, "context.applicationContext");
        return applicationContext;
    }

    @dl.d
    public final AudioManager f() {
        Context context = this.context;
        if (context == null) {
            f0.S(com.umeng.analytics.pro.d.R);
            context = null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        f0.n(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void i(@dl.d WrappedPlayer player) {
        f0.p(player, "player");
        g.d(player.getEventHandler(), "audio.onComplete", null, 2, null);
    }

    public final void j(@dl.d WrappedPlayer player) {
        f0.p(player, "player");
        g eventHandler = player.getEventHandler();
        Pair[] pairArr = new Pair[1];
        Integer numK = player.k();
        pairArr[0] = c1.a("value", Integer.valueOf(numK != null ? numK.intValue() : 0));
        eventHandler.c("audio.onDuration", s0.M(pairArr));
    }

    public final void k(@dl.d WrappedPlayer player, @dl.e String str, @dl.e String str2, @dl.e Object obj) {
        f0.p(player, "player");
        player.getEventHandler().b(str, str2, obj);
    }

    public final void l(@dl.e String str, @dl.e String str2, @dl.e Object obj) {
        g gVar = this.globalEvents;
        if (gVar == null) {
            f0.S("globalEvents");
            gVar = null;
        }
        gVar.b(str, str2, obj);
    }

    public final void m(@dl.d String message) {
        f0.p(message, "message");
        g gVar = this.globalEvents;
        if (gVar == null) {
            f0.S("globalEvents");
            gVar = null;
        }
        gVar.c("audio.onLog", s0.M(c1.a("value", message)));
    }

    public final void n(@dl.d WrappedPlayer player, @dl.d String message) {
        f0.p(player, "player");
        f0.p(message, "message");
        player.getEventHandler().c("audio.onLog", s0.M(c1.a("value", message)));
    }

    public final void o(@dl.d WrappedPlayer player, boolean z10) {
        f0.p(player, "player");
        player.getEventHandler().c("audio.onPrepared", s0.M(c1.a("value", Boolean.valueOf(z10))));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@dl.d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        f0.o(applicationContext, "binding.applicationContext");
        this.context = applicationContext;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        f0.o(binaryMessenger, "binding.binaryMessenger");
        this.binaryMessenger = binaryMessenger;
        this.soundPoolManager = new l(this);
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers");
        this.methods = methodChannel;
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: xyz.luan.audioplayers.b
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                AudioplayersPlugin.r(this.f141342b, methodCall, result);
            }
        });
        MethodChannel methodChannel2 = new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global");
        this.globalMethods = methodChannel2;
        methodChannel2.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: xyz.luan.audioplayers.c
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                AudioplayersPlugin.s(this.f141343b, methodCall, result);
            }
        });
        this.globalEvents = new g(new EventChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global/events"));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@dl.d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        Collection<WrappedPlayer> collectionValues = this.players.values();
        f0.o(collectionValues, "players.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((WrappedPlayer) it.next()).e();
        }
        this.players.clear();
        l lVar = this.soundPoolManager;
        g gVar = null;
        if (lVar == null) {
            f0.S("soundPoolManager");
            lVar = null;
        }
        lVar.d();
        g gVar2 = this.globalEvents;
        if (gVar2 == null) {
            f0.S("globalEvents");
        } else {
            gVar = gVar2;
        }
        gVar.a();
    }

    public final void p(@dl.d WrappedPlayer player) {
        f0.p(player, "player");
        g.d(player.getEventHandler(), "audio.onSeekComplete", null, 2, null);
    }
}
