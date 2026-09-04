package com.tencent.thumbplayer.tcmedia.g.h;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.g.b.e;
import com.tencent.thumbplayer.tcmedia.g.b.f;
import com.umeng.analytics.pro.ak;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f102790a = {"csd-0", "csd-1", "csd-2"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f102791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f102792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f102793d;

    static {
        HashSet hashSet = new HashSet();
        f102793d = hashSet;
        hashSet.add("1601");
        hashSet.add("1713");
        hashSet.add("1714");
        hashSet.add("A10-70F");
        hashSet.add("A10-70L");
        hashSet.add("A1601");
        hashSet.add("A2016a40");
        hashSet.add("A7000-a");
        hashSet.add("A7000plus");
        hashSet.add("A7010a48");
        hashSet.add("A7020a48");
        hashSet.add("AquaPowerM");
        hashSet.add("ASUS_X00AD_2");
        hashSet.add("Aura_Note_2");
        hashSet.add("BLACK-1X");
        hashSet.add("BRAVIA_ATV2");
        hashSet.add("BRAVIA_ATV3_4K");
        hashSet.add("C1");
        hashSet.add("ComioS1");
        hashSet.add("CP8676_I02");
        hashSet.add("CPH1609");
        hashSet.add("CPY83_I00");
        hashSet.add("cv1");
        hashSet.add("cv3");
        hashSet.add("deb");
        hashSet.add("E5643");
        hashSet.add("ELUGA_A3_Pro");
        hashSet.add("ELUGA_Note");
        hashSet.add("ELUGA_Prim");
        hashSet.add("ELUGA_Ray_X");
        hashSet.add("EverStar_S");
        hashSet.add("F3111");
        hashSet.add("F3113");
        hashSet.add("F3116");
        hashSet.add("F3211");
        hashSet.add("F3213");
        hashSet.add("F3215");
        hashSet.add("F3311");
        hashSet.add("flo");
        hashSet.add("fugu");
        hashSet.add("GiONEE_CBL7513");
        hashSet.add("GiONEE_GBL7319");
        hashSet.add("GIONEE_GBL7360");
        hashSet.add("GIONEE_SWW1609");
        hashSet.add("GIONEE_SWW1627");
        hashSet.add("GIONEE_SWW1631");
        hashSet.add("GIONEE_WBL5708");
        hashSet.add("GIONEE_WBL7365");
        hashSet.add("GIONEE_WBL7519");
        hashSet.add("griffin");
        hashSet.add("htc_e56ml_dtul");
        hashSet.add("hwALE-H");
        hashSet.add("HWBLN-H");
        hashSet.add("HWCAM-H");
        hashSet.add("HWVNS-H");
        hashSet.add("HWWAS-H");
        hashSet.add("i9031");
        hashSet.add("iball8735_9806");
        hashSet.add("Infinix-X572");
        hashSet.add("iris60");
        hashSet.add("itel_S41");
        hashSet.add("j2xlteins");
        hashSet.add("JGZ");
        hashSet.add("K50a40");
        hashSet.add("kate");
        hashSet.add("l5460");
        hashSet.add("le_x6");
        hashSet.add("LS-5017");
        hashSet.add("M5c");
        hashSet.add("manning");
        hashSet.add("marino_f");
        hashSet.add("MEIZU_M5");
        hashSet.add("mh");
        hashSet.add("mido");
        hashSet.add(ak.aF);
        hashSet.add("namath");
        hashSet.add("nicklaus_f");
        hashSet.add("NX541J");
        hashSet.add("NX573J");
        hashSet.add("OnePlus5T");
        hashSet.add("p212");
        hashSet.add("P681");
        hashSet.add("P85");
        hashSet.add("panell_d");
        hashSet.add("panell_dl");
        hashSet.add("panell_ds");
        hashSet.add("panell_dt");
        hashSet.add("PB2-670M");
        hashSet.add("PGN528");
        hashSet.add("PGN610");
        hashSet.add("PGN611");
        hashSet.add("Phantom6");
        hashSet.add("Pixi4-7_3G");
        hashSet.add("Pixi5-10_4G");
        hashSet.add("PLE");
        hashSet.add("PRO7S");
        hashSet.add("Q350");
        hashSet.add("Q4260");
        hashSet.add("Q427");
        hashSet.add("Q4310");
        hashSet.add("Q5");
        hashSet.add("QM16XE_U");
        hashSet.add("QX1");
        hashSet.add("santoni");
        hashSet.add("Slate_Pro");
        hashSet.add("SVP-DTV15");
        hashSet.add("s905x018");
        hashSet.add("taido_row");
        hashSet.add("TB3-730F");
        hashSet.add("TB3-730X");
        hashSet.add("TB3-850F");
        hashSet.add("TB3-850M");
        hashSet.add("tcl_eu");
        hashSet.add("V1");
        hashSet.add("V23GB");
        hashSet.add("V5");
        hashSet.add("vernee_M5");
        hashSet.add("watson");
        hashSet.add("whyred");
        hashSet.add("woods_f");
        hashSet.add("woods_fn");
        hashSet.add("X3_HK");
        hashSet.add("XE2X");
        hashSet.add("XT1663");
        hashSet.add("Z12_PRO");
        hashSet.add("Z80");
    }

    public static int a(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int a(f fVar, e eVar) {
        if (eVar.f102686i == -1) {
            return a(eVar.f102687j, eVar.f102679b, eVar.f102680c, fVar.f102694d);
        }
        int length = 0;
        for (int i10 = 0; i10 < eVar.f102678a.size(); i10++) {
            length += eVar.f102678a.get(i10).length;
        }
        return eVar.f102686i + length;
    }

    public static int a(String str, int i10, int i11, boolean z10) {
        int iA;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.hashCode();
        int i12 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iA = i10 * i11;
                i12 = 2;
                return (iA * 3) / (i12 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iA = i10 * i11;
                return (iA * 3) / (i12 * 2);
            case "video/avc":
                if ("BRAVIA 4K 2015".equals(TPSystemInfo.getDeviceName()) || ("Amazon".equals(TPSystemInfo.getDeviceManufacturer()) && ("KFSOWI".equals(TPSystemInfo.getDeviceName()) || ("AFTS".equals(TPSystemInfo.getDeviceName()) && z10)))) {
                    return -1;
                }
                iA = a(i10, 16) * a(i11, 16) * 16 * 16;
                i12 = 2;
                return (iA * 3) / (i12 * 2);
            default:
                return -1;
        }
    }

    public static String a(MediaCodec mediaCodec) {
        return mediaCodec.getName();
    }

    public static ArrayList<byte[]> a(MediaFormat mediaFormat) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            String[] strArr = f102790a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(strArr[i10]);
            if (byteBuffer != null) {
                arrayList.add(byteBuffer.array());
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006a A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0012, B:10:0x0018, B:13:0x0022, B:15:0x002a, B:16:0x002c, B:23:0x0046, B:26:0x0050, B:29:0x005a, B:37:0x006c, B:39:0x0072, B:40:0x0087, B:36:0x006a, B:41:0x0089), top: B:47:0x0003 }] */
    public static boolean a() {
        int i10;
        synchronized (c.class) {
            if (!f102791b) {
                String str = Build.DEVICE;
                if ("dangal".equals(str) || ((i10 = Build.VERSION.SDK_INT) <= 27 && "HWEML".equals(str))) {
                    f102792c = true;
                } else if (i10 < 27) {
                    if (f102793d.contains(str)) {
                        f102792c = true;
                    }
                    String deviceName = TPSystemInfo.getDeviceName();
                    byte b10 = -1;
                    int iHashCode = deviceName.hashCode();
                    if (iHashCode != -594534941) {
                        if (iHashCode != 2006354) {
                            if (iHashCode == 2006367 && deviceName.equals("AFTN")) {
                                b10 = 1;
                            }
                        } else if (deviceName.equals("AFTA")) {
                            b10 = 0;
                        }
                    } else if (deviceName.equals("JSN-L21")) {
                        b10 = 2;
                    }
                    if (b10 == 0 || b10 == 1 || b10 == 2) {
                        f102792c = true;
                    }
                }
                if (b.a()) {
                    b.b("TUtils", "deviceNeedsSetOutputSurfaceWorkaround:" + f102792c);
                }
                f102791b = true;
            }
        }
        return f102792c;
    }

    public static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return c(codecCapabilities);
    }

    public static boolean a(String str) {
        return str.contains("video");
    }

    public static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return d(codecCapabilities);
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
