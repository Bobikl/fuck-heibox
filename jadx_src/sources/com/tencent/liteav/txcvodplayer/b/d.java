package com.tencent.liteav.txcvodplayer.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f100093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected f f100094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f100095c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Thread f100100h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f100096d = "http://playvideo.qcloud.com/getplayinfo/v2";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f100097e = "https://playvideo.qcloud.com/getplayinfo/v2";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f100098f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f100099g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f100101i = new Handler(Looper.getMainLooper()) { // from class: com.tencent.liteav.txcvodplayer.b.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            d dVar = d.this;
            e eVar = dVar.f100093a;
            if (eVar == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                eVar.a(dVar);
            } else {
                if (i10 != 1) {
                    return;
                }
                eVar.a(dVar, (String) message.obj, message.arg1);
            }
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f100102j = "{\"code\":0,\"message\":\"\",\"playerInfo\":{\"playerId\":\"0\",\"name\":\"初始播放器\",\"defaultVideoClassification\":\"SD\",\"videoClassification\":[{\"id\":\"FLU\",\"name\":\"流畅\",\"definitionList\":[10,510,210,610,10046,710]},{\"id\":\"SD\",\"name\":\"标清\",\"definitionList\":[20,520,220,620,10047,720]},{\"id\":\"HD\",\"name\":\"高清\",\"definitionList\":[30,530,230,630,10048,730]},{\"id\":\"FHD\",\"name\":\"全高清\",\"definitionList\":[40,540,240,640,10049,740]},{\"id\":\"2K\",\"name\":\"2K\",\"definitionList\":[70,570,270,670,370,770]},{\"id\":\"4K\",\"name\":\"4K\",\"definitionList\":[80,580,280,680,380,780]}],\"logoLocation\":\"1\",\"logoPic\":\"\",\"logoUrl\":\"\"},\"coverInfo\":{\"coverUrl\":\"http://1255566655.vod2.myqcloud.com/7e9cee55vodtransgzp1255566655/8f5fbff14564972818519602447/coverBySnapshot/1513156403_1311093072.100_0.jpg?t=5c08d9fa&us=someus&sign=95f34beb353fe32cfe7f8b5e79cc28b1\"},\"imageSpriteInfo\":{\"imageSpriteList\":[{\"definition\":10,\"height\":80,\"width\":142,\"totalCount\":4,\"imageUrls\":[\"http://1255566655.vod2.myqcloud.com/ca754badvodgzp1255566655/8f5fbff14564972818519602447/imageSprite/1513156058_533711271_00001.jpg?t=5c08d9fa&us=someus&sign=79449db4e1fb05a3becfa096613659c3\"],\"webVttUrl\":\"http://1255566655.vod2.myqcloud.com/ca754badvodgzp1255566655/8f5fbff14564972818519602447/imageSprite/1513156058_533711271.vtt?t=5c08d9fa&us=someus&sign=79449db4e1fb05a3becfa096613659c3\"}]},\"videoInfo\":{\"sourceVideo\":{\"url\":\"http://1255566655.vod2.myqcloud.com/ca754badvodgzp1255566655/8f5fbff14564972818519602447/uAnXX0OMLSAA.wmv?t=5c08d9fa&us=someus&sign=659af5dd3f27eb92dc4ed74eb561daa4\",\"definition\":0,\"duration\":30,\"floatDuration\":30.093000411987305,\"size\":26246026,\"bitrate\":6134170,\"height\":720,\"width\":1280,\"container\":\"asf\",\"md5\":\"\",\"videoStreamList\":[{\"bitrate\":5942130,\"height\":720,\"width\":1280,\"codec\":\"vc1\",\"fps\":29}],\"audioStreamList\":[{\"samplingRate\":44100,\"bitrate\":192040,\"codec\":\"wmav2\"}]},\"mas©terPlayList1\":{\"idrAligned\":false,\"url\":\"http://1255566655.vod2.myqcloud.com/7e9cee55vodtransgzp1255566655/8f5fbff14564972818519602447/master_playlist.m3u8?t=5c08d9fa&us=someus&sign=66290475b7182c89193f03b8f74a979d\",\"definition\":10000,\"md5\":\"23ecc2cfe4cb7c8f87af41993ba8c09c\"},\"transcodeList\":[{\"url\":\"http://1255566655.vod2.myqcloud.com/7e9cee55vodtransgzp1255566655/8f5fbff14564972818519602447/v.f220.m3u8?t=5c08d9fa&us=someus&sign=66290475b7182c89193f03b8f74a979d\",\"definition\":220,\"duration\":30,\"floatDuration\":30.08329963684082,\"size\":796,\"bitrate\":646036,\"height\":360,\"width\":640,\"container\":\"hls,applehttp\",\"md5\":\"dce044407826b4d809c16b6d1a9e9f13\",\"videoStreamList\":[{\"bitrate\":607449,\"height\":360,\"width\":640,\"codec\":\"h264\",\"fps\":24}],\"audioStreamList\":[{\"samplingRate\":44100,\"bitrate\":38587,\"codec\":\"aac\"}]},{\"url\":\"http://1255566655.vod2.myqcloud.com/7e9cee55vodtransgzp1255566655/8f5fbff14564972818519602447/v.f230.m3u8?t=5c08d9fa&us=someus&sign=66290475b7182c89193f03b8f74a979d\",\"definition\":230,\"duration\":30,\"floatDuration\":30.04170036315918,\"size\":802,\"bitrate\":1224776,\"height\":720,\"width\":1280,\"container\":\"hls,applehttp\",\"md5\":\"f07bb0be9e2fee967d87b6c310d3c036\",\"videoStreamList\":[{\"bitrate\":1186189,\"height\":720,\"width\":1280,\"codec\":\"h264\",\"fps\":24}],\"audioStreamList\":[{\"samplingRate\":44100,\"bitrate\":38587,\"codec\":\"aac\"}]},{\"url\":\"http://1255566655.vod2.myqcloud.com/7e9cee55vodtransgzp1255566655/8f5fbff14564972818519602447/v.f240.m3u8?t=5c08d9fa&us=someus&sign=66290475b7182c89193f03b8f74a979d\",\"definition\":240,\"duration\":30,\"floatDuration\":0,\"size\":809,\"bitrate\":2866685,\"height\":1080,\"width\":1920,\"container\":\"hls,applehttp\",\"md5\":\"ff8190cf07afceb8ed053b198453e954\",\"videoStreamList\":[{\"bitrate\":2828098,\"height\":1080,\"width\":1920,\"codec\":\"h264\",\"fps\":24}],\"audioStreamList\":[{\"samplingRate\":44100,\"bitrate\":38587,\"codec\":\"aac\"}]},{\"url\":\"http://1255566655.vod2.myqcloud.com/7e9cee55vodtransgzp1255566655/8f5fbff14564972818519602447/v.f210.m3u8?t=5c08d9fa&us=someus&sign=66290475b7182c89193f03b8f74a979d\",\"definition\":210,\"duration\":30,\"floatDuration\":30.08329963684082,\"size\":788,\"bitrate\":358908,\"height\":180,\"width\":320,\"container\":\"hls,applehttp\",\"md5\":\"5fa784e0a588c51dc2d7428ad6787079\",\"videoStreamList\":[{\"bitrate\":320321,\"height\":180,\"width\":320,\"codec\":\"h264\",\"fps\":24}],\"audioStreamList\":[{\"samplingRate\":44100,\"bitrate\":38587,\"codec\":\"aac\"}]},{\"url\":\"http://1255566655.vod2.myqcloud.com/7e9cee55vodtransgzp1255566655/8f5fbff14564972818519602447/v.f10.mp4?t=5c08d9fa&us=someus&sign=66290475b7182c89193f03b8f74a979d\",\"definition\":10,\"duration\":30,\"floatDuration\":30.139400482177734,\"size\":1169168,\"bitrate\":303916,\"height\":180,\"width\":320,\"container\":\"mov,mp4,m4a,3gp,3g2,mj2\",\"md5\":\"85002ed20125acf150d014b192cf39a0\",\"videoStreamList\":[{\"bitrate\":255698,\"height\":180,\"width\":320,\"codec\":\"h264\",\"fps\":24}],\"audioStreamList\":[{\"samplingRate\":44100,\"bitrate\":48218,\"codec\":\"aac\"}]},{\"url\":\"http://1255566655.vod2.myqcloud.com/7e9cee55vodtransgzp1255566655/8f5fbff14564972818519602447/v.f20.mp4?t=5c08d9fa&us=someus&sign=66290475b7182c89193f03b8f74a979d\",\"definition\":20,\"duration\":30,\"floatDuration\":30.139400482177734,\"size\":2158411,\"bitrate\":566647,\"height\":360,\"width\":640,\"container\":\"mov,mp4,m4a,3gp,3g2,mj2\",\"md5\":\"cba3630e5f92325041da7fee336246b6\",\"videoStreamList\":[{\"bitrate\":518429,\"height\":360,\"width\":640,\"codec\":\"h264\",\"fps\":24}],\"audioStreamList\":[{\"samplingRate\":44100,\"bitrate\":48218,\"codec\":\"aac\"}]}]}}";

    static /* synthetic */ void a(d dVar, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        int i10 = jSONObject.getInt("code");
        if (i10 != 0) {
            String string = jSONObject.getString("message");
            LiteavLog.e("TXCVodPlayerNetApi", string);
            dVar.a(string, i10);
        } else {
            f fVar = new f(jSONObject);
            dVar.f100094b = fVar;
            if (fVar.a() == null) {
                dVar.a("No playback address", -3);
            } else {
                dVar.f100101i.sendEmptyMessage(0);
            }
        }
    }

    public final int a(final int i10, final String str, final String str2, final String str3, final int i11, final String str4) {
        if (i10 == 0 || str == null) {
            return -1;
        }
        if ((str2 != null || i11 > 0) && str4 == null) {
            return -1;
        }
        Thread thread = new Thread("getPlayInfo") { // from class: com.tencent.liteav.txcvodplayer.b.d.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() throws Throwable {
                BufferedReader bufferedReader = null;
                try {
                    try {
                        Looper.prepare();
                        String str5 = d.this.f100095c ? String.format(Locale.ROOT, "%s/%d/%s", "https://playvideo.qcloud.com/getplayinfo/v2", Integer.valueOf(i10), str) : String.format(Locale.ROOT, "%s/%d/%s", "http://playvideo.qcloud.com/getplayinfo/v2", Integer.valueOf(i10), str);
                        String str6 = str2;
                        String str7 = str3;
                        int i12 = i11;
                        String str8 = str4;
                        StringBuilder sb2 = new StringBuilder();
                        if (str6 != null) {
                            sb2.append("t=" + str6 + "&");
                        }
                        if (str7 != null) {
                            sb2.append("us=" + str7 + "&");
                        }
                        if (str8 != null) {
                            sb2.append("sign=" + str8 + "&");
                        }
                        if (i12 >= 0) {
                            sb2.append("exper=" + i12 + "&");
                        }
                        if (sb2.length() > 1) {
                            sb2.deleteCharAt(sb2.length() - 1);
                        }
                        String string = sb2.toString();
                        if (string != null) {
                            str5 = str5 + "?" + string;
                        }
                        URL url = new URL(str5);
                        LiteavLog.d("TXCVodPlayerNetApi", "getplayinfo: ".concat(String.valueOf(str5)));
                        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() == 200) {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            try {
                                StringBuilder sb3 = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        sb3.append(line);
                                    }
                                }
                                d.a(d.this, sb3.toString());
                                bufferedReader = bufferedReader2;
                            } catch (JSONException unused) {
                                bufferedReader = bufferedReader2;
                                d.this.a("Incorrect format", -2);
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                        return;
                                    } catch (IOException unused2) {
                                        return;
                                    }
                                }
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                bufferedReader = bufferedReader2;
                                LiteavLog.d("TXCVodPlayerNetApi", "http exception: " + e.getMessage());
                                d.this.a("The request was exceptional", -2);
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                        return;
                                    } catch (IOException unused3) {
                                        return;
                                    }
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            d.this.a("Request failed", -1);
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused5) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (JSONException unused6) {
                } catch (Exception e11) {
                    e = e11;
                }
            }
        };
        this.f100100h = thread;
        thread.start();
        return 0;
    }

    public final f a() {
        return this.f100094b;
    }

    public final void a(e eVar) {
        this.f100093a = eVar;
    }

    protected final void a(String str, int i10) {
        Message message = new Message();
        message.what = 1;
        message.arg1 = i10;
        message.obj = str;
        this.f100101i.sendMessage(message);
    }
}
