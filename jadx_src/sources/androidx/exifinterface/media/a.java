package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbutils.utils.w;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.tools.zip.l;

/* JADX INFO: compiled from: ExifInterface.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final String A = "Compression";
    public static final String A0 = "OECF";
    public static final String A1 = "GPSLongitudeRef";
    private static final String A2 = "CameraSettingsIFDPointer";
    public static final short A3 = 9;
    public static final short A4 = 2;
    public static final int A5 = 0;
    private static final int A6 = 9;
    private static final byte A7 = -49;
    public static final String B = "PhotometricInterpretation";
    public static final String B0 = "SensitivityType";
    public static final String B1 = "GPSLongitude";
    private static final String B2 = "ImageProcessingIFDPointer";
    public static final short B3 = 10;
    public static final short B4 = 3;
    public static final int B5 = 1;
    private static final int B6 = 10;
    private static final byte B7 = -38;
    public static final String C = "Orientation";
    public static final String C0 = "StandardOutputSensitivity";
    public static final String C1 = "GPSAltitudeRef";
    private static final int C2 = 512;
    public static final short C3 = 11;
    public static final short C4 = 4;
    private static final int C5 = 5000;
    private static final int C6 = 11;
    static final byte C7 = -31;
    public static final String D = "SamplesPerPixel";
    public static final String D0 = "RecommendedExposureIndex";
    public static final String D1 = "GPSAltitude";
    public static final int D2 = 0;
    public static final short D3 = 12;
    public static final short D4 = 0;
    private static final int D6 = 12;
    private static final byte D7 = -2;
    public static final String E = "PlanarConfiguration";
    public static final String E0 = "ISOSpeed";
    public static final String E1 = "GPSTimeStamp";
    public static final int E2 = 1;
    public static final short E3 = 13;
    public static final short E4 = 1;
    private static final String E5 = "FUJIFILMCCD-RAW";
    private static final int E6 = 13;
    static final byte E7 = -39;
    public static final String F = "YCbCrSubSampling";
    public static final String F0 = "ISOSpeedLatitudeyyy";
    public static final String F1 = "GPSSatellites";
    public static final int F2 = 2;
    public static final short F3 = 14;
    public static final short F4 = 2;
    private static final int F5 = 84;
    private static final int F6 = 8192;
    static final int F7 = 0;
    public static final String G = "YCbCrPositioning";
    public static final String G0 = "ISOSpeedLatitudezzz";
    public static final String G1 = "GPSStatus";
    public static final int G2 = 3;
    public static final short G3 = 15;
    public static final short G4 = 0;
    static final int G7 = 1;
    public static final String H = "XResolution";
    public static final String H0 = "ShutterSpeedValue";
    public static final String H1 = "GPSMeasureMode";
    public static final int H2 = 4;
    public static final short H3 = 16;
    public static final short H4 = 0;
    static final int H7 = 2;
    public static final String I = "YResolution";
    public static final String I0 = "ApertureValue";
    public static final String I1 = "GPSDOP";
    public static final int I2 = 5;
    public static final short I3 = 17;
    public static final short I4 = 0;
    static final int I7 = 3;
    public static final String J = "ResolutionUnit";
    public static final String J0 = "BrightnessValue";
    public static final String J1 = "GPSSpeedRef";
    public static final int J2 = 6;
    public static final short J3 = 18;
    public static final short J4 = 0;
    private static final short J5 = 20306;
    private static final f[] J6;
    static final int J7 = 4;
    public static final String K = "StripOffsets";
    public static final String K0 = "ExposureBiasValue";
    public static final String K1 = "GPSSpeed";
    public static final int K2 = 7;
    public static final short K3 = 19;
    public static final short K4 = 1;
    private static final short K5 = 21330;
    private static final f[] K6;
    static final int K7 = 5;
    public static final String L = "RowsPerStrip";
    public static final String L0 = "MaxApertureValue";
    public static final String L1 = "GPSTrackRef";
    public static final int L2 = 8;
    public static final short L3 = 20;
    public static final short L4 = 2;
    private static final f[] L6;
    static final int L7 = 6;
    public static final String M = "StripByteCounts";
    public static final String M0 = "SubjectDistance";
    public static final String M1 = "GPSTrack";
    public static final short M3 = 21;
    public static final short M4 = 0;
    private static final f[] M6;
    static final int M7 = 7;
    public static final String N = "JPEGInterchangeFormat";
    public static final String N0 = "MeteringMode";
    public static final String N1 = "GPSImgDirectionRef";
    public static final short N3 = 22;
    public static final short N4 = 1;
    private static final int N5 = 8;
    private static final f[] N6;
    static final int N7 = 8;
    public static final String O = "JPEGInterchangeFormatLength";
    public static final String O0 = "LightSource";
    public static final String O1 = "GPSImgDirection";
    public static final short O2 = 1;
    public static final short O3 = 23;
    public static final short O4 = 2;
    private static final int O5 = 12;
    private static final f O6;
    static final int O7 = 9;
    public static final String P = "TransferFunction";
    public static final String P0 = "Flash";
    public static final String P1 = "GPSMapDatum";
    public static final short P2 = 2;
    public static final short P3 = 24;
    public static final short P4 = 3;
    private static final short P5 = 85;
    private static final f[] P6;
    static final int P7 = 10;
    public static final String Q = "WhitePoint";
    public static final String Q0 = "SubjectArea";
    public static final String Q1 = "GPSDestLatitudeRef";
    public static final short Q2 = 1;
    public static final short Q3 = 255;
    public static final String Q4 = "N";
    private static final String Q5 = "PENTAX";
    private static final f[] Q6;
    static final int Q7 = 11;
    public static final String R = "PrimaryChromaticities";
    public static final String R0 = "FocalLength";
    public static final String R1 = "GPSDestLatitude";
    public static final short R2 = 2;
    public static final short R3 = 1;
    public static final String R4 = "S";
    private static final int R5 = 6;
    private static final f[] R6;
    static final int R7 = 12;
    public static final String S = "YCbCrCoefficients";
    public static final String S0 = "FlashEnergy";
    public static final String S1 = "GPSDestLongitudeRef";
    public static final short S2 = 2;
    public static final short S3 = 4;
    public static final String S4 = "E";
    private static final f[] S6;
    static final int S7 = 13;
    public static final String T = "ReferenceBlackWhite";
    public static final String T0 = "SpatialFrequencyResponse";
    public static final String T1 = "GPSDestLongitude";
    public static final short T2 = 3;
    public static final short T3 = 6;
    public static final String T4 = "W";
    static final int T6 = 0;
    static final int T7 = 14;
    public static final String U = "DateTime";
    public static final String U0 = "FocalPlaneXResolution";
    public static final String U1 = "GPSDestBearingRef";
    public static final int U2 = 1;
    public static final short U3 = 8;
    public static final short U4 = 0;
    private static final int U6 = 1;
    private static final Pattern U7;
    public static final String V = "ImageDescription";
    public static final String V0 = "FocalPlaneYResolution";
    public static final String V1 = "GPSDestBearing";
    public static final int V2 = 65535;
    public static final short V3 = 16;
    public static final short V4 = 1;
    private static final int V6 = 2;
    private static final Pattern V7;
    public static final String W = "Make";
    public static final String W0 = "FocalPlaneResolutionUnit";
    public static final String W1 = "GPSDestDistanceRef";
    public static final short W2 = 0;
    public static final short W3 = 24;
    public static final String W4 = "A";
    private static final int W5 = 4;
    private static final int W6 = 3;
    private static final Pattern W7;
    public static final String X = "Model";
    public static final String X0 = "SubjectLocation";
    public static final String X1 = "GPSDestDistance";
    public static final short X2 = 1;
    public static final short X3 = 32;
    public static final String X4 = "V";
    private static final int X5 = 4;
    static final int X6 = 4;
    private static final Pattern X7;
    public static final String Y = "Software";
    public static final String Y0 = "ExposureIndex";
    public static final String Y1 = "GPSProcessingMethod";
    public static final short Y2 = 2;
    public static final short Y3 = 64;
    public static final String Y4 = "2";
    static final int Y6 = 5;
    private static final int Y7 = 19;
    public static final String Z = "Artist";
    public static final String Z0 = "SensingMethod";
    public static final String Z1 = "GPSAreaInformation";
    public static final short Z2 = 3;
    public static final short Z3 = 1;
    public static final String Z4 = "3";
    private static final int Z6 = 6;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f23215a0 = "Copyright";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f23216a1 = "FileSource";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final String f23217a2 = "GPSDateStamp";

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final short f23218a3 = 4;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final short f23219a4 = 2;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final String f23220a5 = "K";

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    private static final int f23221a6 = 4;

    /* JADX INFO: renamed from: a7, reason: collision with root package name */
    private static final int f23222a7 = 7;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f23223b0 = "ExifVersion";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String f23224b1 = "SceneType";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final String f23225b2 = "GPSDifferential";

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final short f23226b3 = 5;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final short f23227b4 = 3;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final String f23228b5 = "M";

    /* JADX INFO: renamed from: b7, reason: collision with root package name */
    private static final int f23230b7 = 8;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f23231c0 = "FlashpixVersion";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final String f23232c1 = "CFAPattern";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final String f23233c2 = "GPSHPositioningError";

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final short f23234c3 = 6;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final short f23235c4 = 4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final String f23236c5 = "N";

    /* JADX INFO: renamed from: c7, reason: collision with root package name */
    private static final int f23238c7 = 9;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f23239d0 = "ColorSpace";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f23240d1 = "CustomRendered";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final String f23241d2 = "InteroperabilityIndex";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final short f23242d3 = 7;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final short f23243d4 = 5;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final String f23244d5 = "T";

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    private static final byte f23245d6 = 47;

    /* JADX INFO: renamed from: d7, reason: collision with root package name */
    static final f[][] f23246d7;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f23247e0 = "Gamma";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f23248e1 = "ExposureMode";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final String f23249e2 = "ThumbnailImageLength";

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final short f23250e3 = 8;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final short f23251e4 = 7;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final String f23252e5 = "M";

    /* JADX INFO: renamed from: e7, reason: collision with root package name */
    private static final f[] f23254e7;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f23255f0 = "PixelXDimension";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f23256f1 = "WhiteBalance";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final String f23257f2 = "ThumbnailImageWidth";

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final short f23258f3 = 0;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final short f23259f4 = 8;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final String f23260f5 = "K";

    /* JADX INFO: renamed from: f7, reason: collision with root package name */
    private static final HashMap<Integer, f>[] f23262f7;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f23263g0 = "PixelYDimension";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f23264g1 = "DigitalZoomRatio";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f23265g2 = "ThumbnailOrientation";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final short f23266g3 = 1;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final short f23267g4 = 0;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final String f23268g5 = "M";

    /* JADX INFO: renamed from: g7, reason: collision with root package name */
    private static final HashMap<String, f>[] f23270g7;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f23271h0 = "ComponentsConfiguration";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final String f23272h1 = "FocalLengthIn35mmFilm";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final String f23273h2 = "DNGVersion";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final short f23274h3 = 2;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final short f23275h4 = 1;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final String f23276h5 = "N";

    /* JADX INFO: renamed from: h7, reason: collision with root package name */
    private static final HashSet<String> f23278h7;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f23279i0 = "CompressedBitsPerPixel";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f23280i1 = "SceneCaptureType";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final String f23281i2 = "DefaultCropSize";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final short f23282i3 = 3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final short f23283i4 = 2;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final short f23284i5 = 0;

    /* JADX INFO: renamed from: i7, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f23286i7;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f23287j0 = "MakerNote";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String f23288j1 = "GainControl";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final String f23289j2 = "ThumbnailImage";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final short f23290j3 = 4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final short f23291j4 = 3;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final short f23292j5 = 1;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    private static final int f23293j6 = 10;

    /* JADX INFO: renamed from: j7, reason: collision with root package name */
    static final Charset f23294j7;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f23295k0 = "UserComment";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String f23296k1 = "Contrast";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final String f23297k2 = "PreviewImageStart";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final short f23298k3 = 5;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final short f23299k4 = 1;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final int f23300k5 = 1;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    private static final int f23301k6 = 4;

    /* JADX INFO: renamed from: k7, reason: collision with root package name */
    static final byte[] f23302k7;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f23303l0 = "RelatedSoundFile";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final String f23304l1 = "Saturation";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final String f23305l2 = "PreviewImageLength";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final short f23306l3 = 6;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final short f23307l4 = 0;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final int f23308l5 = 2;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    private static final int f23309l6 = 4;

    /* JADX INFO: renamed from: l7, reason: collision with root package name */
    private static final byte[] f23310l7;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f23311m0 = "DateTimeOriginal";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String f23312m1 = "Sharpness";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final String f23313m2 = "AspectFrame";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final short f23314m3 = 7;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final short f23315m4 = 1;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final int f23316m5 = 6;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    private static SimpleDateFormat f23317m6 = null;

    /* JADX INFO: renamed from: m7, reason: collision with root package name */
    static final byte f23318m7 = -1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f23319n0 = "DateTimeDigitized";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final String f23320n1 = "DeviceSettingDescription";

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final String f23321n2 = "SensorBottomBorder";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final short f23322n3 = 0;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final short f23323n4 = 0;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final int f23324n5 = 7;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    private static SimpleDateFormat f23325n6 = null;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f23327o0 = "OffsetTime";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final String f23328o1 = "SubjectDistanceRange";

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final String f23329o2 = "SensorLeftBorder";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final short f23330o3 = 1;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final short f23331o4 = 1;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final int f23332o5 = 8;

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    static final short f23333o6 = 18761;

    /* JADX INFO: renamed from: o7, reason: collision with root package name */
    private static final byte f23334o7 = -64;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f23335p0 = "OffsetTimeOriginal";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f23336p1 = "ImageUniqueID";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f23337p2 = "SensorRightBorder";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final short f23338p3 = 2;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final short f23339p4 = 2;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final int f23340p5 = 32773;

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    static final short f23341p6 = 19789;

    /* JADX INFO: renamed from: p7, reason: collision with root package name */
    private static final byte f23342p7 = -63;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f23343q0 = "OffsetTimeDigitized";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @Deprecated
    public static final String f23344q1 = "CameraOwnerName";

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final String f23345q2 = "SensorTopBorder";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final short f23346q3 = 3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    @Deprecated
    public static final int f23347q4 = 0;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final int f23348q5 = 34892;

    /* JADX INFO: renamed from: q7, reason: collision with root package name */
    private static final byte f23350q7 = -62;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f23351r0 = "SubSecTime";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final String f23352r1 = "CameraOwnerName";

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final String f23353r2 = "ISO";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final short f23354r3 = 4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    @Deprecated
    public static final int f23355r4 = 1;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    private static final int f23357r6 = 8;

    /* JADX INFO: renamed from: r7, reason: collision with root package name */
    private static final byte f23358r7 = -61;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f23359s0 = "SubSecTimeOriginal";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f23360s1 = "BodySerialNumber";

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final String f23361s2 = "JpgFromRaw";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final short f23362s3 = 5;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final short f23363s4 = 0;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    private static final int f23365s6 = 1;

    /* JADX INFO: renamed from: s7, reason: collision with root package name */
    private static final byte f23366s7 = -59;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f23367t0 = "SubSecTimeDigitized";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String f23368t1 = "LensSpecification";

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final String f23369t2 = "Xmp";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final short f23370t3 = 6;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final short f23371t4 = 1;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    private static final int f23373t6 = 2;

    /* JADX INFO: renamed from: t7, reason: collision with root package name */
    private static final byte f23374t7 = -58;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f23375u0 = "ExposureTime";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final String f23376u1 = "LensMake";

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final String f23377u2 = "NewSubfileType";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final short f23378u3 = 255;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final short f23379u4 = 0;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final int f23380u5 = 0;

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    private static final int f23381u6 = 3;

    /* JADX INFO: renamed from: u7, reason: collision with root package name */
    private static final byte f23382u7 = -57;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f23384v0 = "FNumber";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final String f23385v1 = "LensModel";

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final String f23386v2 = "SubfileType";

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final short f23387v3 = 0;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final short f23388v4 = 1;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final int f23389v5 = 1;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    private static final int f23390v6 = 4;

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    private static final byte f23391v7 = -55;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f23393w0 = "ExposureProgram";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final String f23394w1 = "LensSerialNumber";

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    private static final String f23395w2 = "ExifIFDPointer";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final short f23396w3 = 1;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final short f23397w4 = 2;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final int f23398w5 = 2;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    private static final int f23399w6 = 5;

    /* JADX INFO: renamed from: w7, reason: collision with root package name */
    private static final byte f23400w7 = -54;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f23401x = "ImageWidth";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f23402x0 = "SpectralSensitivity";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f23403x1 = "GPSVersionID";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f23404x2 = "GPSInfoIFDPointer";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final short f23405x3 = 2;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final short f23406x4 = 3;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final int f23407x5 = 6;

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    private static final int f23408x6 = 6;

    /* JADX INFO: renamed from: x7, reason: collision with root package name */
    private static final byte f23409x7 = -53;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f23410y = "ImageLength";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Deprecated
    public static final String f23411y0 = "ISOSpeedRatings";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f23412y1 = "GPSLatitudeRef";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final String f23413y2 = "InteroperabilityIFDPointer";

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final short f23414y3 = 3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final short f23415y4 = 0;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final int f23416y5 = 0;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    private static final int f23417y6 = 7;

    /* JADX INFO: renamed from: y7, reason: collision with root package name */
    private static final byte f23418y7 = -51;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f23419z = "BitsPerSample";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f23420z0 = "PhotographicSensitivity";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final String f23421z1 = "GPSLatitude";

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private static final String f23422z2 = "SubIFDPointer";

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final short f23423z3 = 4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final short f23424z4 = 1;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final int f23425z5 = 1;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    private static final int f23426z6 = 8;

    /* JADX INFO: renamed from: z7, reason: collision with root package name */
    private static final byte f23427z7 = -50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f23429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f23430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f23433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<Integer> f23434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f23435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f23441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23448u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f23383v = "ExifInterface";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f23392w = Log.isLoggable(f23383v, 3);
    private static final List<Integer> M2 = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> N2 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final int[] f23356r5 = {8, 8, 8};

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final int[] f23364s5 = {4};

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final int[] f23372t5 = {8};

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    private static final byte f23326n7 = -40;
    static final byte[] D5 = {-1, f23326n7, -1};
    private static final byte[] G5 = {102, 116, 121, 112};
    private static final byte[] H5 = {109, 105, 102, org.apache.tools.tar.c.G};
    private static final byte[] I5 = {104, 101, 105, 99};
    private static final byte[] L5 = {79, org.apache.tools.tar.c.O, 89, 77, 80, 0};
    private static final byte[] M5 = {79, org.apache.tools.tar.c.O, 89, 77, 80, 85, org.apache.tools.tar.c.P, 0, 73, 73};
    private static final byte[] S5 = {-119, 80, 78, 71, 13, 10, com.google.common.base.a.D, 10};
    private static final byte[] T5 = {101, org.apache.tools.tar.c.R, 73, 102};
    private static final byte[] U5 = {73, 72, 68, 82};
    private static final byte[] V5 = {73, 69, 78, 68};
    private static final byte[] Y5 = {82, 73, 70, 70};
    private static final byte[] Z5 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    private static final byte[] f23229b6 = {69, org.apache.tools.tar.c.R, 73, 70};

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    static final byte f23349q6 = 42;

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    private static final byte[] f23237c6 = {-99, 1, f23349q6};

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    private static final byte[] f23253e6 = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    private static final byte[] f23261f6 = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    private static final byte[] f23269g6 = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    private static final byte[] f23277h6 = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    private static final byte[] f23285i6 = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] G6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] H6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] I6 = {65, org.apache.tools.tar.c.P, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExifInterface.java */
    public class C0168a extends MediaDataSource {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f23449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f23450c;

        C0168a(i iVar) {
            this.f23450c = iVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f23449b;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f23450c.available())) {
                        return -1;
                    }
                    this.f23450c.e(j10);
                    this.f23449b = j10;
                }
                if (i11 > this.f23450c.available()) {
                    i11 = this.f23450c.available();
                }
                int i12 = this.f23450c.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f23449b += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f23449b = -1L;
            return -1;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ByteOrder f23452f = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final ByteOrder f23453g = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DataInputStream f23454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f23455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f23457e;

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f23455c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f23454b = dataInputStream;
            dataInputStream.mark(0);
            this.f23456d = 0;
            this.f23455c = byteOrder;
        }

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f23456d;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f23454b.available();
        }

        public long b() throws IOException {
            return ((long) readInt()) & KeyboardMap.kValueMask;
        }

        public void c(ByteOrder byteOrder) {
            this.f23455c = byteOrder;
        }

        public void d(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f23454b.skip(i12);
                if (iSkip <= 0) {
                    if (this.f23457e == null) {
                        this.f23457e = new byte[8192];
                    }
                    iSkip = this.f23454b.read(this.f23457e, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f23456d += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f23456d++;
            return this.f23454b.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f23454b.read(bArr, i10, i11);
            this.f23456d += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f23456d++;
            return this.f23454b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f23456d++;
            int i10 = this.f23454b.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f23456d += 2;
            return this.f23454b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f23456d += bArr.length;
            this.f23454b.readFully(bArr);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f23456d += i11;
            this.f23454b.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f23456d += 4;
            int i10 = this.f23454b.read();
            int i11 = this.f23454b.read();
            int i12 = this.f23454b.read();
            int i13 = this.f23454b.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f23455c;
            if (byteOrder == f23452f) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == f23453g) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f23455c);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(a.f23383v, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f23456d += 8;
            int i10 = this.f23454b.read();
            int i11 = this.f23454b.read();
            int i12 = this.f23454b.read();
            int i13 = this.f23454b.read();
            int i14 = this.f23454b.read();
            int i15 = this.f23454b.read();
            int i16 = this.f23454b.read();
            int i17 = this.f23454b.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f23455c;
            if (byteOrder == f23452f) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == f23453g) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f23455c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f23456d += 2;
            int i10 = this.f23454b.read();
            int i11 = this.f23454b.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f23455c;
            if (byteOrder == f23452f) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == f23453g) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f23455c);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f23456d += 2;
            return this.f23454b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f23456d++;
            return this.f23454b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f23456d += 2;
            int i10 = this.f23454b.read();
            int i11 = this.f23454b.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f23455c;
            if (byteOrder == f23452f) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == f23453g) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f23455c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final OutputStream f23458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f23459c;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f23458b = outputStream;
            this.f23459c = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f23459c = byteOrder;
        }

        public void b(int i10) throws IOException {
            this.f23458b.write(i10);
        }

        public void c(int i10) throws IOException {
            ByteOrder byteOrder = this.f23459c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f23458b.write((i10 >>> 0) & 255);
                this.f23458b.write((i10 >>> 8) & 255);
                this.f23458b.write((i10 >>> 16) & 255);
                this.f23458b.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f23458b.write((i10 >>> 24) & 255);
                this.f23458b.write((i10 >>> 16) & 255);
                this.f23458b.write((i10 >>> 8) & 255);
                this.f23458b.write((i10 >>> 0) & 255);
            }
        }

        public void d(short s10) throws IOException {
            ByteOrder byteOrder = this.f23459c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f23458b.write((s10 >>> 0) & 255);
                this.f23458b.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f23458b.write((s10 >>> 8) & 255);
                this.f23458b.write((s10 >>> 0) & 255);
            }
        }

        public void e(long j10) throws IOException {
            c((int) j10);
        }

        public void f(int i10) throws IOException {
            d((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f23458b.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f23458b.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f23460e = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f23463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f23464d;

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f23461a = i10;
            this.f23462b = i11;
            this.f23463c = j10;
            this.f23464d = bArr;
        }

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f23294j7);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double d10, ByteOrder byteOrder) {
            return c(new double[]{d10}, byteOrder);
        }

        public static d c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d d(int i10, ByteOrder byteOrder) {
            return e(new int[]{i10}, byteOrder);
        }

        public static d e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d f(h hVar, ByteOrder byteOrder) {
            return g(new h[]{hVar}, byteOrder);
        }

        public static d g(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[10] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f23469a);
                byteBufferWrap.putInt((int) hVar.f23470b);
            }
            return new d(10, hVarArr.length, byteBufferWrap.array());
        }

        public static d h(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f23294j7);
            return new d(2, bytes.length, bytes);
        }

        public static d i(long j10, ByteOrder byteOrder) {
            return j(new long[]{j10}, byteOrder);
        }

        public static d j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d k(h hVar, ByteOrder byteOrder) {
            return l(new h[]{hVar}, byteOrder);
        }

        public static d l(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[5] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f23469a);
                byteBufferWrap.putInt((int) hVar.f23470b);
            }
            return new d(5, hVarArr.length, byteBufferWrap.array());
        }

        public static d m(int i10, ByteOrder byteOrder) {
            return n(new int[]{i10}, byteOrder);
        }

        public static d n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double o(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objR instanceof String) {
                return Double.parseDouble((String) objR);
            }
            if (objR instanceof long[]) {
                long[] jArr = (long[]) objR;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objR instanceof int[]) {
                int[] iArr = (int[]) objR;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objR instanceof double[]) {
                double[] dArr = (double[]) objR;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objR instanceof h[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            h[] hVarArr = (h[]) objR;
            if (hVarArr.length == 1) {
                return hVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int p(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objR instanceof String) {
                return Integer.parseInt((String) objR);
            }
            if (objR instanceof long[]) {
                long[] jArr = (long[]) objR;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objR instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objR;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String q(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                return null;
            }
            if (objR instanceof String) {
                return (String) objR;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objR instanceof long[]) {
                long[] jArr = (long[]) objR;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb2.toString();
            }
            if (objR instanceof int[]) {
                int[] iArr = (int[]) objR;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb2.toString();
            }
            if (objR instanceof double[]) {
                double[] dArr = (double[]) objR;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb2.toString();
            }
            if (!(objR instanceof h[])) {
                return null;
            }
            h[] hVarArr = (h[]) objR;
            while (i10 < hVarArr.length) {
                sb2.append(hVarArr[i10].f23469a);
                sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb2.append(hVarArr[i10].f23470b);
                i10++;
                if (i10 != hVarArr.length) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:182:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:151:0x0198 */
        Object r(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b10;
            byte b11;
            byte[] bArr;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f23464d);
                    try {
                        bVar.c(byteOrder);
                        int length = 0;
                        boolean z10 = true;
                        switch (this.f23461a) {
                            case 1:
                            case 6:
                                byte[] bArr2 = this.f23464d;
                                if (bArr2.length != 1 || (b10 = bArr2[0]) < 0 || b10 > 1) {
                                    String str = new String(bArr2, a.f23294j7);
                                    try {
                                        bVar.close();
                                        break;
                                    } catch (IOException e10) {
                                        Log.e(a.f23383v, "IOException occurred while closing InputStream", e10);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b10 + org.apache.tools.tar.c.F)});
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e11) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e11);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.f23462b >= a.I6.length) {
                                    int i10 = 0;
                                    while (true) {
                                        bArr = a.I6;
                                        if (i10 < bArr.length) {
                                            if (this.f23464d[i10] != bArr[i10]) {
                                                z10 = false;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                    if (z10) {
                                        length = bArr.length;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (length < this.f23462b && (b11 = this.f23464d[length]) != 0) {
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                String string = sb2.toString();
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e12) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e12);
                                }
                                return string;
                            case 3:
                                int[] iArr = new int[this.f23462b];
                                while (length < this.f23462b) {
                                    iArr[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e13) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e13);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f23462b];
                                while (length < this.f23462b) {
                                    jArr[length] = bVar.b();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e14) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e14);
                                }
                                return jArr;
                            case 5:
                                h[] hVarArr = new h[this.f23462b];
                                while (length < this.f23462b) {
                                    hVarArr[length] = new h(bVar.b(), bVar.b());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e15) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e15);
                                }
                                return hVarArr;
                            case 8:
                                int[] iArr2 = new int[this.f23462b];
                                while (length < this.f23462b) {
                                    iArr2[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e16) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e16);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f23462b];
                                while (length < this.f23462b) {
                                    iArr3[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e17) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e17);
                                }
                                return iArr3;
                            case 10:
                                h[] hVarArr2 = new h[this.f23462b];
                                while (length < this.f23462b) {
                                    hVarArr2[length] = new h(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e18) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e18);
                                }
                                return hVarArr2;
                            case 11:
                                double[] dArr = new double[this.f23462b];
                                while (length < this.f23462b) {
                                    dArr[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e19) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e19);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f23462b];
                                while (length < this.f23462b) {
                                    dArr2[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e20) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e20);
                                }
                                return dArr2;
                            default:
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e21) {
                                    Log.e(a.f23383v, "IOException occurred while closing InputStream", e21);
                                }
                                return null;
                        }
                    } catch (IOException e22) {
                        e = e22;
                        Log.w(a.f23383v, "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e23) {
                                Log.e(a.f23383v, "IOException occurred while closing InputStream", e23);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e24) {
                            Log.e(a.f23383v, "IOException occurred while closing InputStream", e24);
                        }
                    }
                    throw th;
                }
            } catch (IOException e25) {
                e = e25;
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public int s() {
            return a.H6[this.f23461a] * this.f23462b;
        }

        public String toString() {
            return "(" + a.G6[this.f23461a] + ", data length:" + this.f23464d.length + ")";
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface e {
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23468d;

        f(String str, int i10, int i11) {
            this.f23466b = str;
            this.f23465a = i10;
            this.f23467c = i11;
            this.f23468d = -1;
        }

        f(String str, int i10, int i11, int i12) {
            this.f23466b = str;
            this.f23465a = i10;
            this.f23467c = i11;
            this.f23468d = i12;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f23467c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f23468d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface g {
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f23469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f23470b;

        h(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        h(long j10, long j11) {
            if (j11 == 0) {
                this.f23469a = 0L;
                this.f23470b = 1L;
            } else {
                this.f23469a = j10;
                this.f23470b = j11;
            }
        }

        public double a() {
            return this.f23469a / this.f23470b;
        }

        public String toString() {
            return this.f23469a + "/" + this.f23470b;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    public static class i extends b {
        i(InputStream inputStream) throws IOException {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f23454b.mark(Integer.MAX_VALUE);
        }

        i(byte[] bArr) throws IOException {
            super(bArr);
            this.f23454b.mark(Integer.MAX_VALUE);
        }

        public void e(long j10) throws IOException {
            int i10 = this.f23456d;
            if (i10 > j10) {
                this.f23456d = 0;
                this.f23454b.reset();
            } else {
                j10 -= (long) i10;
            }
            d((int) j10);
        }
    }

    static {
        f[] fVarArr = {new f(f23377u2, 254, 4), new f(f23386v2, 255, 4), new f(f23401x, 256, 3, 4), new f(f23410y, 257, 3, 4), new f(f23419z, 258, 3), new f(A, bb.c.b.Z1, 3), new f(B, bb.c.b.f30553c2, 3), new f(V, 270, 2), new f(W, bb.c.b.f30761l2, 2), new f(X, bb.c.b.f30784m2, 2), new f(K, 273, 3, 4), new f(C, bb.c.b.f30830o2, 3), new f(D, bb.c.b.f30898r2, 3), new f(L, bb.c.b.f30920s2, 3, 4), new f(M, bb.c.b.f30942t2, 3, 4), new f(H, bb.c.b.f31008w2, 5), new f(I, bb.c.b.f31030x2, 5), new f(E, bb.c.b.f31052y2, 3), new f(J, bb.c.b.K2, 3), new f(P, 301, 3), new f(Y, 305, 2), new f(U, 306, 2), new f(Z, 315, 2), new f(Q, 318, 5), new f(R, bb.c.b.f30670h3, 5), new f(f23422z2, bb.c.b.f30921s3, 4), new f(N, 513, 4), new f(O, bb.c.b.U6, 4), new f(S, bb.c.b.f30720j7, 5), new f(F, bb.c.b.f30743k7, 3), new f(G, bb.c.b.f30766l7, 3), new f(T, bb.c.b.f30789m7, 5), new f(f23215a0, 33432, 2), new f(f23395w2, 34665, 4), new f(f23404x2, 34853, 4), new f(f23345q2, 4, 4), new f(f23329o2, 5, 4), new f(f23321n2, 6, 4), new f(f23337p2, 7, 4), new f(f23353r2, 23, 3), new f(f23361s2, 46, 7), new f(f23369t2, 700, 1)};
        J6 = fVarArr;
        f[] fVarArr2 = {new f(f23375u0, 33434, 5), new f(f23384v0, 33437, 5), new f(f23393w0, 34850, 3), new f(f23402x0, 34852, 2), new f(f23420z0, 34855, 3), new f(A0, 34856, 7), new f(B0, 34864, 3), new f(C0, 34865, 4), new f(D0, 34866, 4), new f(E0, 34867, 4), new f(F0, 34868, 4), new f(G0, 34869, 4), new f(f23223b0, 36864, 2), new f(f23311m0, 36867, 2), new f(f23319n0, 36868, 2), new f(f23327o0, 36880, 2), new f(f23335p0, 36881, 2), new f(f23343q0, 36882, 2), new f(f23271h0, 37121, 7), new f(f23279i0, 37122, 5), new f(H0, 37377, 10), new f(I0, 37378, 5), new f(J0, 37379, 10), new f(K0, 37380, 10), new f(L0, 37381, 5), new f(M0, 37382, 5), new f(N0, 37383, 3), new f(O0, 37384, 3), new f(P0, 37385, 3), new f(R0, 37386, 5), new f(Q0, 37396, 3), new f(f23287j0, 37500, 7), new f(f23295k0, 37510, 7), new f(f23351r0, 37520, 2), new f(f23359s0, 37521, 2), new f(f23367t0, 37522, 2), new f(f23231c0, l.C3, 7), new f(f23239d0, 40961, 3), new f(f23255f0, 40962, 3, 4), new f(f23263g0, 40963, 3, 4), new f(f23303l0, 40964, 2), new f(f23413y2, 40965, 4), new f(S0, 41483, 5), new f(T0, 41484, 7), new f(U0, 41486, 5), new f(V0, 41487, 5), new f(W0, 41488, 3), new f(X0, 41492, 3), new f(Y0, 41493, 5), new f(Z0, 41495, 3), new f(f23216a1, 41728, 7), new f(f23224b1, 41729, 7), new f(f23232c1, 41730, 7), new f(f23240d1, 41985, 3), new f(f23248e1, 41986, 3), new f(f23256f1, 41987, 3), new f(f23264g1, 41988, 5), new f(f23272h1, 41989, 3), new f(f23280i1, 41990, 3), new f(f23288j1, 41991, 3), new f(f23296k1, 41992, 3), new f(f23304l1, 41993, 3), new f(f23312m1, 41994, 3), new f(f23320n1, 41995, 7), new f(f23328o1, 41996, 3), new f(f23336p1, 42016, 2), new f("CameraOwnerName", 42032, 2), new f(f23360s1, 42033, 2), new f(f23368t1, 42034, 5), new f(f23376u1, 42035, 2), new f(f23385v1, 42036, 2), new f(f23247e0, 42240, 5), new f(f23273h2, 50706, 1), new f(f23281i2, 50720, 3, 4)};
        K6 = fVarArr2;
        f[] fVarArr3 = {new f(f23403x1, 0, 1), new f(f23412y1, 1, 2), new f(f23421z1, 2, 5, 10), new f(A1, 3, 2), new f(B1, 4, 5, 10), new f(C1, 5, 1), new f(D1, 6, 5), new f(E1, 7, 5), new f(F1, 8, 2), new f(G1, 9, 2), new f(H1, 10, 2), new f(I1, 11, 5), new f(J1, 12, 2), new f(K1, 13, 5), new f(L1, 14, 2), new f(M1, 15, 5), new f(N1, 16, 2), new f(O1, 17, 5), new f(P1, 18, 2), new f(Q1, 19, 2), new f(R1, 20, 5), new f(S1, 21, 2), new f(T1, 22, 5), new f(U1, 23, 2), new f(V1, 24, 5), new f(W1, 25, 2), new f(X1, 26, 5), new f(Y1, 27, 7), new f(Z1, 28, 7), new f(f23217a2, 29, 2), new f(f23225b2, 30, 3), new f(f23233c2, 31, 5)};
        L6 = fVarArr3;
        f[] fVarArr4 = {new f(f23241d2, 1, 2)};
        M6 = fVarArr4;
        f[] fVarArr5 = {new f(f23377u2, 254, 4), new f(f23386v2, 255, 4), new f(f23257f2, 256, 3, 4), new f(f23249e2, 257, 3, 4), new f(f23419z, 258, 3), new f(A, bb.c.b.Z1, 3), new f(B, bb.c.b.f30553c2, 3), new f(V, 270, 2), new f(W, bb.c.b.f30761l2, 2), new f(X, bb.c.b.f30784m2, 2), new f(K, 273, 3, 4), new f(f23265g2, bb.c.b.f30830o2, 3), new f(D, bb.c.b.f30898r2, 3), new f(L, bb.c.b.f30920s2, 3, 4), new f(M, bb.c.b.f30942t2, 3, 4), new f(H, bb.c.b.f31008w2, 5), new f(I, bb.c.b.f31030x2, 5), new f(E, bb.c.b.f31052y2, 3), new f(J, bb.c.b.K2, 3), new f(P, 301, 3), new f(Y, 305, 2), new f(U, 306, 2), new f(Z, 315, 2), new f(Q, 318, 5), new f(R, bb.c.b.f30670h3, 5), new f(f23422z2, bb.c.b.f30921s3, 4), new f(N, 513, 4), new f(O, bb.c.b.U6, 4), new f(S, bb.c.b.f30720j7, 5), new f(F, bb.c.b.f30743k7, 3), new f(G, bb.c.b.f30766l7, 3), new f(T, bb.c.b.f30789m7, 5), new f(f23215a0, 33432, 2), new f(f23395w2, 34665, 4), new f(f23404x2, 34853, 4), new f(f23273h2, 50706, 1), new f(f23281i2, 50720, 3, 4)};
        N6 = fVarArr5;
        O6 = new f(K, 273, 3);
        f[] fVarArr6 = {new f(f23289j2, 256, 7), new f(A2, bb.c.k.f33727n6, 4), new f(B2, bb.c.k.T6, 4)};
        P6 = fVarArr6;
        f[] fVarArr7 = {new f(f23297k2, 257, 4), new f(f23305l2, 258, 4)};
        Q6 = fVarArr7;
        f[] fVarArr8 = {new f(f23313m2, 4371, 3)};
        R6 = fVarArr8;
        f[] fVarArr9 = {new f(f23239d0, 55, 3)};
        S6 = fVarArr9;
        f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        f23246d7 = fVarArr10;
        f23254e7 = new f[]{new f(f23422z2, bb.c.b.f30921s3, 4), new f(f23395w2, 34665, 4), new f(f23404x2, 34853, 4), new f(f23413y2, 40965, 4), new f(A2, bb.c.k.f33727n6, 1), new f(B2, bb.c.k.T6, 1)};
        f23262f7 = new HashMap[fVarArr10.length];
        f23270g7 = new HashMap[fVarArr10.length];
        f23278h7 = new HashSet<>(Arrays.asList(f23384v0, f23264g1, f23375u0, M0, E1));
        f23286i7 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f23294j7 = charsetForName;
        f23302k7 = "Exif\u0000\u0000".getBytes(charsetForName);
        f23310l7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f23317m6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(w.f73604k, locale);
        f23325n6 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            f[][] fVarArr11 = f23246d7;
            if (i10 >= fVarArr11.length) {
                HashMap<Integer, Integer> map = f23286i7;
                f[] fVarArr12 = f23254e7;
                map.put(Integer.valueOf(fVarArr12[0].f23465a), 5);
                map.put(Integer.valueOf(fVarArr12[1].f23465a), 1);
                map.put(Integer.valueOf(fVarArr12[2].f23465a), 2);
                map.put(Integer.valueOf(fVarArr12[3].f23465a), 3);
                map.put(Integer.valueOf(fVarArr12[4].f23465a), 7);
                map.put(Integer.valueOf(fVarArr12[5].f23465a), 8);
                U7 = Pattern.compile(".*[1-9].*");
                V7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                W7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                X7 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f23262f7[i10] = new HashMap<>();
            f23270g7[i10] = new HashMap<>();
            for (f fVar : fVarArr11[i10]) {
                f23262f7[i10].put(Integer.valueOf(fVar.f23465a), fVar);
                f23270g7[i10].put(fVar.f23466b, fVar);
            }
            i10++;
        }
    }

    public a(@n0 File file) throws Throwable {
        f[][] fVarArr = f23246d7;
        this.f23433f = new HashMap[fVarArr.length];
        this.f23434g = new HashSet(fVarArr.length);
        this.f23435h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        O(file.getAbsolutePath());
    }

    public a(@n0 FileDescriptor fileDescriptor) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th2;
        f[][] fVarArr = f23246d7;
        this.f23433f = new HashMap[fVarArr.length];
        this.f23434g = new HashSet(fVarArr.length);
        this.f23435h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor == null) {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
        this.f23430c = null;
        this.f23428a = null;
        boolean z10 = false;
        if (X(fileDescriptor)) {
            this.f23429b = fileDescriptor;
            try {
                fileDescriptor = androidx.exifinterface.media.b.a.b(fileDescriptor);
                z10 = true;
            } catch (Exception e10) {
                throw new IOException("Failed to duplicate file descriptor", e10);
            }
        } else {
            this.f23429b = null;
        }
        try {
            fileInputStream = new FileInputStream(fileDescriptor);
            try {
                e0(fileInputStream);
                androidx.exifinterface.media.b.c(fileInputStream);
                if (z10) {
                    androidx.exifinterface.media.b.b(fileDescriptor);
                }
            } catch (Throwable th3) {
                th2 = th3;
                androidx.exifinterface.media.b.c(fileInputStream);
                if (z10) {
                    androidx.exifinterface.media.b.b(fileDescriptor);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th2 = th4;
        }
    }

    public a(@n0 InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    public a(@n0 InputStream inputStream, int i10) throws IOException {
        f[][] fVarArr = f23246d7;
        this.f23433f = new HashMap[fVarArr.length];
        this.f23434g = new HashSet(fVarArr.length);
        this.f23435h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f23428a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f23302k7.length);
            if (!P(bufferedInputStream)) {
                Log.w(f23383v, "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f23432e = true;
            this.f23430c = null;
            this.f23429b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f23430c = (AssetManager.AssetInputStream) inputStream;
            this.f23429b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            if (X(fileInputStream.getFD())) {
                this.f23430c = null;
                this.f23429b = fileInputStream.getFD();
            } else {
                this.f23430c = null;
                this.f23429b = null;
            }
        } else {
            this.f23430c = null;
            this.f23429b = null;
        }
        e0(inputStream);
    }

    public a(@n0 String str) throws Throwable {
        f[][] fVarArr = f23246d7;
        this.f23433f = new HashMap[fVarArr.length];
        this.f23434g = new HashSet(fVarArr.length);
        this.f23435h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        O(str);
    }

    private void A(i iVar) throws Throwable {
        d dVar;
        g0(iVar);
        k0(iVar, 0);
        C0(iVar, 0);
        C0(iVar, 5);
        C0(iVar, 4);
        D0();
        if (this.f23431d != 8 || (dVar = this.f23433f[1].get(f23287j0)) == null) {
            return;
        }
        i iVar2 = new i(dVar.f23464d);
        iVar2.c(this.f23435h);
        iVar2.d(6);
        k0(iVar2, 9);
        d dVar2 = this.f23433f[9].get(f23239d0);
        if (dVar2 != null) {
            this.f23433f[1].put(f23239d0, dVar2);
        }
    }

    private static boolean A0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void B0(int i10, int i11) throws Throwable {
        if (this.f23433f[i10].isEmpty() || this.f23433f[i11].isEmpty()) {
            if (f23392w) {
                Log.d(f23383v, "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f23433f[i10].get(f23410y);
        d dVar2 = this.f23433f[i10].get(f23401x);
        d dVar3 = this.f23433f[i11].get(f23410y);
        d dVar4 = this.f23433f[i11].get(f23401x);
        if (dVar == null || dVar2 == null) {
            if (f23392w) {
                Log.d(f23383v, "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f23392w) {
                Log.d(f23383v, "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iP = dVar.p(this.f23435h);
        int iP2 = dVar2.p(this.f23435h);
        int iP3 = dVar3.p(this.f23435h);
        int iP4 = dVar4.p(this.f23435h);
        if (iP >= iP3 || iP2 >= iP4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f23433f;
        HashMap<String, d> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private void C(i iVar) throws Throwable {
        if (f23392w) {
            Log.d(f23383v, "getRw2Attributes starting with: " + iVar);
        }
        A(iVar);
        d dVar = this.f23433f[0].get(f23361s2);
        if (dVar != null) {
            t(new b(dVar.f23464d), (int) dVar.f23463c, 5);
        }
        d dVar2 = this.f23433f[0].get(f23353r2);
        d dVar3 = this.f23433f[1].get(f23420z0);
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f23433f[1].put(f23420z0, dVar2);
    }

    private void C0(i iVar, int i10) throws Throwable {
        d dVarM;
        d dVarM2;
        d dVar = this.f23433f[i10].get(f23281i2);
        d dVar2 = this.f23433f[i10].get(f23345q2);
        d dVar3 = this.f23433f[i10].get(f23329o2);
        d dVar4 = this.f23433f[i10].get(f23321n2);
        d dVar5 = this.f23433f[i10].get(f23337p2);
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                o0(iVar, i10);
                return;
            }
            int iP = dVar2.p(this.f23435h);
            int iP2 = dVar4.p(this.f23435h);
            int iP3 = dVar5.p(this.f23435h);
            int iP4 = dVar3.p(this.f23435h);
            if (iP2 <= iP || iP3 <= iP4) {
                return;
            }
            d dVarM3 = d.m(iP2 - iP, this.f23435h);
            d dVarM4 = d.m(iP3 - iP4, this.f23435h);
            this.f23433f[i10].put(f23410y, dVarM3);
            this.f23433f[i10].put(f23401x, dVarM4);
            return;
        }
        if (dVar.f23461a == 5) {
            h[] hVarArr = (h[]) dVar.r(this.f23435h);
            if (hVarArr == null || hVarArr.length != 2) {
                Log.w(f23383v, "Invalid crop size values. cropSize=" + Arrays.toString(hVarArr));
                return;
            }
            dVarM = d.k(hVarArr[0], this.f23435h);
            dVarM2 = d.k(hVarArr[1], this.f23435h);
        } else {
            int[] iArr = (int[]) dVar.r(this.f23435h);
            if (iArr == null || iArr.length != 2) {
                Log.w(f23383v, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarM = d.m(iArr[0], this.f23435h);
            dVarM2 = d.m(iArr[1], this.f23435h);
        }
        this.f23433f[i10].put(f23401x, dVarM);
        this.f23433f[i10].put(f23410y, dVarM2);
    }

    private void D(i iVar) throws IOException {
        byte[] bArr = f23302k7;
        iVar.d(bArr.length);
        byte[] bArr2 = new byte[iVar.available()];
        iVar.readFully(bArr2);
        this.f23443p = bArr.length;
        j0(bArr2, 0);
    }

    private void D0() throws Throwable {
        B0(0, 5);
        B0(0, 4);
        B0(5, 4);
        d dVar = this.f23433f[1].get(f23255f0);
        d dVar2 = this.f23433f[1].get(f23263g0);
        if (dVar != null && dVar2 != null) {
            this.f23433f[0].put(f23401x, dVar);
            this.f23433f[0].put(f23410y, dVar2);
        }
        if (this.f23433f[4].isEmpty() && b0(this.f23433f[5])) {
            HashMap<String, d>[] mapArr = this.f23433f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!b0(this.f23433f[4])) {
            Log.d(f23383v, "No image meets the size requirements of a thumbnail image.");
        }
        m0(0, f23265g2, C);
        m0(0, f23249e2, f23410y);
        m0(0, f23257f2, f23401x);
        m0(5, f23265g2, C);
        m0(5, f23249e2, f23410y);
        m0(5, f23257f2, f23401x);
        m0(4, C, f23265g2);
        m0(4, f23410y, f23249e2);
        m0(4, f23401x, f23257f2);
    }

    private int E0(c cVar) throws IOException {
        f[][] fVarArr = f23246d7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : f23254e7) {
            l0(fVar.f23466b);
        }
        if (this.f23436i) {
            if (this.f23437j) {
                l0(K);
                l0(M);
            } else {
                l0(N);
                l0(O);
            }
        }
        for (int i10 = 0; i10 < f23246d7.length; i10++) {
            for (Object obj : this.f23433f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f23433f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f23433f[1].isEmpty()) {
            this.f23433f[0].put(f23254e7[1].f23466b, d.i(0L, this.f23435h));
        }
        if (!this.f23433f[2].isEmpty()) {
            this.f23433f[0].put(f23254e7[2].f23466b, d.i(0L, this.f23435h));
        }
        if (!this.f23433f[3].isEmpty()) {
            this.f23433f[1].put(f23254e7[3].f23466b, d.i(0L, this.f23435h));
        }
        if (this.f23436i) {
            if (this.f23437j) {
                this.f23433f[4].put(K, d.m(0, this.f23435h));
                this.f23433f[4].put(M, d.m(this.f23440m, this.f23435h));
            } else {
                this.f23433f[4].put(N, d.i(0L, this.f23435h));
                this.f23433f[4].put(O, d.i(this.f23440m, this.f23435h));
            }
        }
        for (int i11 = 0; i11 < f23246d7.length; i11++) {
            Iterator<Map.Entry<String, d>> it = this.f23433f[i11].entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int iS = it.next().getValue().s();
                if (iS > 4) {
                    i12 += iS;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < f23246d7.length; i13++) {
            if (!this.f23433f[i13].isEmpty()) {
                iArr[i13] = size;
                size += (this.f23433f[i13].size() * 12) + 2 + 4 + iArr2[i13];
            }
        }
        if (this.f23436i) {
            if (this.f23437j) {
                this.f23433f[4].put(K, d.m(size, this.f23435h));
            } else {
                this.f23433f[4].put(N, d.i(size, this.f23435h));
            }
            this.f23439l = size;
            size += this.f23440m;
        }
        if (this.f23431d == 4) {
            size += 8;
        }
        if (f23392w) {
            for (int i14 = 0; i14 < f23246d7.length; i14++) {
                Log.d(f23383v, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i14), Integer.valueOf(iArr[i14]), Integer.valueOf(this.f23433f[i14].size()), Integer.valueOf(iArr2[i14]), Integer.valueOf(size)));
            }
        }
        if (!this.f23433f[1].isEmpty()) {
            this.f23433f[0].put(f23254e7[1].f23466b, d.i(iArr[1], this.f23435h));
        }
        if (!this.f23433f[2].isEmpty()) {
            this.f23433f[0].put(f23254e7[2].f23466b, d.i(iArr[2], this.f23435h));
        }
        if (!this.f23433f[3].isEmpty()) {
            this.f23433f[1].put(f23254e7[3].f23466b, d.i(iArr[3], this.f23435h));
        }
        int i15 = this.f23431d;
        if (i15 == 4) {
            cVar.f(size);
            cVar.write(f23302k7);
        } else if (i15 == 13) {
            cVar.c(size);
            cVar.write(T5);
        } else if (i15 == 14) {
            cVar.write(f23229b6);
            cVar.c(size);
        }
        cVar.d(this.f23435h == ByteOrder.BIG_ENDIAN ? f23341p6 : f23333o6);
        cVar.a(this.f23435h);
        cVar.f(42);
        cVar.e(8L);
        for (int i16 = 0; i16 < f23246d7.length; i16++) {
            if (!this.f23433f[i16].isEmpty()) {
                cVar.f(this.f23433f[i16].size());
                int size2 = iArr[i16] + 2 + (this.f23433f[i16].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f23433f[i16].entrySet()) {
                    int i17 = f23270g7[i16].get(entry2.getKey()).f23465a;
                    d value = entry2.getValue();
                    int iS2 = value.s();
                    cVar.f(i17);
                    cVar.f(value.f23461a);
                    cVar.c(value.f23462b);
                    if (iS2 > 4) {
                        cVar.e(size2);
                        size2 += iS2;
                    } else {
                        cVar.write(value.f23464d);
                        if (iS2 < 4) {
                            while (iS2 < 4) {
                                cVar.b(0);
                                iS2++;
                            }
                        }
                    }
                }
                if (i16 != 0 || this.f23433f[4].isEmpty()) {
                    cVar.e(0L);
                } else {
                    cVar.e(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f23433f[i16].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f23464d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f23436i) {
            cVar.write(G());
        }
        if (this.f23431d == 14 && size % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return size;
    }

    private void I(b bVar) throws Throwable {
        if (f23392w) {
            Log.d(f23383v, "getWebpAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.LITTLE_ENDIAN);
        bVar.d(Y5.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = Z5;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 4 + 4;
                if (Arrays.equals(f23229b6, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f23443p = i12;
                        j0(bArr3, 0);
                        z0(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.d(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> J(String str) {
        if (str.contains(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
            Pair<Integer, Integer> pairJ = J(strArrSplit[0]);
            if (((Integer) pairJ.first).intValue() == 2) {
                return pairJ;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairJ2 = J(strArrSplit[i10]);
                int iIntValue = (((Integer) pairJ2.first).equals(pairJ.first) || ((Integer) pairJ2.second).equals(pairJ.first)) ? ((Integer) pairJ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairJ.second).intValue() == -1 || !(((Integer) pairJ2.first).equals(pairJ.second) || ((Integer) pairJ2.second).equals(pairJ.second))) ? -1 : ((Integer) pairJ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairJ = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairJ = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairJ;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    if (lValueOf.longValue() < 0 || lValueOf.longValue() > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return lValueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j10 = (long) Double.parseDouble(strArrSplit2[0]);
                long j11 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j10 >= 0 && j11 >= 0) {
                    if (j10 <= 2147483647L && j11 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void K(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get(N);
        d dVar2 = (d) map.get(O);
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iP = dVar.p(this.f23435h);
        int iP2 = dVar2.p(this.f23435h);
        if (this.f23431d == 7) {
            iP += this.f23444q;
        }
        if (iP > 0 && iP2 > 0) {
            this.f23436i = true;
            if (this.f23428a == null && this.f23430c == null && this.f23429b == null) {
                byte[] bArr = new byte[iP2];
                bVar.skip(iP);
                bVar.read(bArr);
                this.f23441n = bArr;
            }
            this.f23439l = iP;
            this.f23440m = iP2;
        }
        if (f23392w) {
            Log.d(f23383v, "Setting thumbnail attributes with offset: " + iP + ", length: " + iP2);
        }
    }

    private void L(b bVar, HashMap map) throws IOException {
        d dVar = (d) map.get(K);
        d dVar2 = (d) map.get(M);
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrD = androidx.exifinterface.media.b.d(dVar.r(this.f23435h));
        long[] jArrD2 = androidx.exifinterface.media.b.d(dVar2.r(this.f23435h));
        if (jArrD == null || jArrD.length == 0) {
            Log.w(f23383v, "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrD2 == null || jArrD2.length == 0) {
            Log.w(f23383v, "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrD.length != jArrD2.length) {
            Log.w(f23383v, "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrD2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f23438k = true;
        this.f23437j = true;
        this.f23436i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jArrD.length; i13++) {
            int i14 = (int) jArrD[i13];
            int i15 = (int) jArrD2[i13];
            if (i13 < jArrD.length - 1 && i14 + i15 != jArrD[i13 + 1]) {
                this.f23438k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                Log.d(f23383v, "Invalid strip offset value");
                return;
            }
            long j12 = i16;
            if (bVar.skip(j12) != j12) {
                Log.d(f23383v, "Failed to skip " + i16 + " bytes.");
                return;
            }
            int i17 = i11 + i16;
            byte[] bArr2 = new byte[i15];
            if (bVar.read(bArr2) != i15) {
                Log.d(f23383v, "Failed to read " + i15 + " bytes.");
                return;
            }
            i11 = i17 + i15;
            System.arraycopy(bArr2, 0, bArr, i12, i15);
            i12 += i15;
        }
        this.f23441n = bArr;
        if (this.f23438k) {
            this.f23439l = (int) jArrD[0];
            this.f23440m = i10;
        }
    }

    private void O(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f23430c = null;
        this.f23428a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (X(fileInputStream2.getFD())) {
                    this.f23429b = fileInputStream2.getFD();
                } else {
                    this.f23429b = null;
                }
                e0(fileInputStream2);
                androidx.exifinterface.media.b.c(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.b.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean P(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f23302k7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f23302k7;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean R(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.read(bArr2);
                    if (!Arrays.equals(bArr2, G5)) {
                        bVar2.close();
                        return false;
                    }
                    long j10 = 16;
                    if (length == 1) {
                        length = bVar2.readLong();
                        if (length < 16) {
                            bVar2.close();
                            return false;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z10 = false;
                    boolean z11 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        if (bVar2.read(bArr3) != 4) {
                            bVar2.close();
                            return false;
                        }
                        if (j12 != 1) {
                            if (Arrays.equals(bArr3, H5)) {
                                z10 = true;
                            } else if (Arrays.equals(bArr3, I5)) {
                                z11 = true;
                            }
                            if (z10 && z11) {
                                bVar2.close();
                                return true;
                            }
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f23392w) {
                        Log.d(f23383v, "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean S(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = D5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean T(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderI0 = i0(bVar2);
                this.f23435h = byteOrderI0;
                bVar2.c(byteOrderI0);
                short s10 = bVar2.readShort();
                boolean z10 = s10 == 20306 || s10 == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean U(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = S5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean V(byte[] bArr) throws IOException {
        byte[] bytes = E5.getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean W(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderI0 = i0(bVar2);
                this.f23435h = byteOrderI0;
                bVar2.c(byteOrderI0);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean X(FileDescriptor fileDescriptor) {
        try {
            androidx.exifinterface.media.b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f23392w) {
                return false;
            }
            Log.d(f23383v, "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean Y(HashMap map) throws IOException {
        d dVar;
        int iP;
        d dVar2 = (d) map.get(f23419z);
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.r(this.f23435h);
            int[] iArr2 = f23356r5;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f23431d == 3 && (dVar = (d) map.get(B)) != null && (((iP = dVar.p(this.f23435h)) == 1 && Arrays.equals(iArr, f23372t5)) || (iP == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f23392w) {
            return false;
        }
        Log.d(f23383v, "Unsupported data type value");
        return false;
    }

    private static boolean Z(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private void a() {
        String strI = i(f23311m0);
        if (strI != null && i(U) == null) {
            this.f23433f[0].put(U, d.h(strI));
        }
        if (i(f23401x) == null) {
            this.f23433f[0].put(f23401x, d.i(0L, this.f23435h));
        }
        if (i(f23410y) == null) {
            this.f23433f[0].put(f23410y, d.i(0L, this.f23435h));
        }
        if (i(C) == null) {
            this.f23433f[0].put(C, d.i(0L, this.f23435h));
        }
        if (i(O0) == null) {
            this.f23433f[1].put(O0, d.i(0L, this.f23435h));
        }
    }

    public static boolean a0(@n0 String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "image/x-fuji-raf":
            case "image/x-samsung-srw":
            case "image/x-sony-arw":
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/x-adobe-dng":
            case "image/x-panasonic-rw2":
            case "image/png":
            case "image/x-pentax-pef":
            case "image/x-olympus-orf":
            case "image/x-nikon-nef":
            case "image/x-nikon-nrw":
            case "image/x-canon-cr2":
                return true;
            default:
                return false;
        }
    }

    private String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private boolean b0(HashMap map) throws IOException {
        d dVar = (d) map.get(f23410y);
        d dVar2 = (d) map.get(f23401x);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.p(this.f23435h) <= 512 && dVar2.p(this.f23435h) <= 512;
    }

    private static double c(String str, String str2) {
        try {
            String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = d10 + (d11 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals(R4) && !str2.equals(T4)) {
                if (!str2.equals("N") && !str2.equals(S4)) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f23294j7;
                sb2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private boolean d0(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = Y5;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = Z5;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[Y5.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void e(b bVar, c cVar, byte[] bArr) throws IOException {
        int i10 = bVar.readInt();
        cVar.write(bArr);
        cVar.c(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        androidx.exifinterface.media.b.f(bVar, cVar, i10);
    }

    private void e0(@n0 InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < f23246d7.length; i10++) {
            try {
                try {
                    this.f23433f[i10] = new HashMap<>();
                } catch (Throwable th2) {
                    a();
                    if (f23392w) {
                        h0();
                    }
                    throw th2;
                }
            } catch (IOException | UnsupportedOperationException e10) {
                boolean z10 = f23392w;
                if (z10) {
                    Log.w(f23383v, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                a();
                if (!z10) {
                    return;
                }
            }
        }
        if (!this.f23432e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f23431d = w(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (A0(this.f23431d)) {
            i iVar = new i(inputStream);
            if (this.f23432e) {
                D(iVar);
            } else {
                int i11 = this.f23431d;
                if (i11 == 12) {
                    s(iVar);
                } else if (i11 == 7) {
                    x(iVar);
                } else if (i11 == 10) {
                    C(iVar);
                } else {
                    A(iVar);
                }
            }
            iVar.e(this.f23443p);
            z0(iVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f23431d;
            if (i12 == 4) {
                t(bVar, 0, 0);
            } else if (i12 == 13) {
                y(bVar);
            } else if (i12 == 9) {
                z(bVar);
            } else if (i12 == 14) {
                I(bVar);
            }
        }
        a();
        if (!f23392w) {
            return;
        }
        h0();
    }

    private static Long f0(@p0 String str, @p0 String str2, @p0 String str3) {
        if (str != null && U7.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f23317m6.parse(str, parsePosition);
                if (date == null && (date = f23325n6.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i10 = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i11 = Integer.parseInt(str3.substring(1, 3));
                    int i12 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(strSubstring) || Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i11 <= 14) {
                        int i13 = ((i11 * 60) + i12) * 60 * 1000;
                        if (!Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(strSubstring)) {
                            i10 = -1;
                        }
                        time += (long) (i13 * i10);
                    }
                }
                if (str2 != null) {
                    time += androidx.exifinterface.media.b.g(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void g0(b bVar) throws IOException {
        ByteOrder byteOrderI0 = i0(bVar);
        this.f23435h = byteOrderI0;
        bVar.c(byteOrderI0);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f23431d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.d(i12);
        }
    }

    private void h0() {
        for (int i10 = 0; i10 < this.f23433f.length; i10++) {
            Log.d(f23383v, "The size of tag group[" + i10 + "]: " + this.f23433f[i10].size());
            for (Map.Entry<String, d> entry : this.f23433f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d(f23383v, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.q(this.f23435h) + "'");
            }
        }
    }

    private ByteOrder i0(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f23392w) {
                Log.d(f23383v, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f23392w) {
                Log.d(f23383v, "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void j0(byte[] bArr, int i10) throws IOException {
        i iVar = new i(bArr);
        g0(iVar);
        k0(iVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x0316  */
    /* JADX WARN: Code duplicated, block: B:139:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0132  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:52:0x015f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0166  */
    /* JADX WARN: Code duplicated, block: B:57:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01da  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x0204  */
    /* JADX WARN: Code duplicated, block: B:76:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0209  */
    /* JADX WARN: Code duplicated, block: B:79:0x020d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0217  */
    /* JADX WARN: Code duplicated, block: B:84:0x021c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0221  */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x0246  */
    /* JADX WARN: Code duplicated, block: B:93:0x0253  */
    /* JADX WARN: Code duplicated, block: B:94:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0260  */
    /* JADX WARN: Code duplicated, block: B:96:0x0282 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0284  */
    /* JADX WARN: Code duplicated, block: B:99:0x029f  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0148, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01da, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0260, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x0284, please report this as an issue */
    private void k0(i iVar, int i10) throws IOException {
        String str;
        short s10;
        long j10;
        boolean z10;
        Integer num;
        String str2;
        long j11;
        long jB;
        int unsignedShort;
        int i11;
        this.f23434g.add(Integer.valueOf(iVar.f23456d));
        short s11 = iVar.readShort();
        boolean z11 = f23392w;
        String str3 = f23383v;
        if (z11) {
            Log.d(f23383v, "numberOfDirectoryEntry: " + ((int) s11));
        }
        if (s11 <= 0) {
            return;
        }
        char c10 = 0;
        short s12 = 0;
        while (s12 < s11) {
            int unsignedShort2 = iVar.readUnsignedShort();
            int unsignedShort3 = iVar.readUnsignedShort();
            int i12 = iVar.readInt();
            long jA = ((long) iVar.a()) + 4;
            f fVar = f23262f7[i10].get(Integer.valueOf(unsignedShort2));
            boolean z12 = f23392w;
            if (z12) {
                Object[] objArr = new Object[5];
                objArr[c10] = Integer.valueOf(i10);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = fVar != null ? fVar.f23466b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i12);
                Log.d(str3, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (fVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = H6;
                    if (unsignedShort3 < iArr.length) {
                        if (fVar.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = fVar.f23467c;
                            }
                            str = str3;
                            s10 = s12;
                            j10 = ((long) i12) * ((long) iArr[unsignedShort3]);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z12) {
                                    Log.d(str, "Skip the tag entry since the number of components is invalid: " + i12);
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (z12) {
                            Log.d(str3, "Skip the tag entry since data format (" + G6[unsignedShort3] + ") is unexpected for tag: " + fVar.f23466b);
                        }
                    }
                    if (z10) {
                        if (j10 > 4) {
                            i11 = iVar.readInt();
                            if (z12) {
                                Log.d(str, "seek to data offset: " + i11);
                            }
                            if (this.f23431d == 7) {
                                if (f23287j0.equals(fVar.f23466b)) {
                                    this.f23444q = i11;
                                } else if (i10 != 6 && f23289j2.equals(fVar.f23466b)) {
                                    this.f23445r = i11;
                                    this.f23446s = i12;
                                    d dVarM = d.m(6, this.f23435h);
                                    d dVarI = d.i(this.f23445r, this.f23435h);
                                    d dVarI2 = d.i(this.f23446s, this.f23435h);
                                    this.f23433f[4].put(A, dVarM);
                                    this.f23433f[4].put(N, dVarI);
                                    this.f23433f[4].put(O, dVarI2);
                                }
                            }
                            iVar.e(i11);
                        } else {
                            jA = jA;
                            str = str;
                            i12 = i12;
                        }
                        num = f23286i7.get(Integer.valueOf(unsignedShort2));
                        if (z12) {
                            str2 = str;
                            Log.d(str2, "nextIfdType: " + num + " byteCount: " + j10);
                        } else {
                            str2 = str;
                        }
                        if (num != null) {
                            jB = -1;
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    jB = iVar.b();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = iVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = iVar.readInt();
                                }
                                if (z12) {
                                    Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jB), fVar.f23466b));
                                }
                                if (jB > 0) {
                                    if (!this.f23434g.contains(Integer.valueOf((int) jB))) {
                                        iVar.e(jB);
                                        k0(iVar, num.intValue());
                                    } else if (z12) {
                                        Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jB + ")");
                                    }
                                } else if (z12) {
                                    Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jB);
                                }
                                iVar.e(jA);
                            } else {
                                unsignedShort = iVar.readUnsignedShort();
                            }
                            jB = unsignedShort;
                            if (z12) {
                                Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jB), fVar.f23466b));
                            }
                            if (jB > 0) {
                                if (!this.f23434g.contains(Integer.valueOf((int) jB))) {
                                    iVar.e(jB);
                                    k0(iVar, num.intValue());
                                } else if (z12) {
                                    Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jB + ")");
                                }
                            } else if (z12) {
                                Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jB);
                            }
                            iVar.e(jA);
                        } else {
                            j11 = jA;
                            int iA = iVar.a() + this.f23443p;
                            byte[] bArr = new byte[(int) j10];
                            iVar.readFully(bArr);
                            d dVar = new d(unsignedShort3, i12, iA, bArr);
                            this.f23433f[i10].put(fVar.f23466b, dVar);
                            if (f23273h2.equals(fVar.f23466b)) {
                                this.f23431d = 3;
                            }
                            if (((!W.equals(fVar.f23466b) || X.equals(fVar.f23466b)) && dVar.q(this.f23435h).contains(Q5)) || (A.equals(fVar.f23466b) && dVar.p(this.f23435h) == 65535)) {
                                this.f23431d = 8;
                            }
                            if (iVar.a() != j11) {
                                iVar.e(j11);
                            }
                        }
                    } else {
                        iVar.e(jA);
                        s11 = s11;
                        str2 = str;
                    }
                    s12 = (short) (s10 + 1);
                    str3 = str2;
                    s11 = s11;
                    c10 = 0;
                }
                str = str3;
                s10 = s12;
                if (z12) {
                    Log.d(str, "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z10 = false;
                if (z10) {
                    iVar.e(jA);
                    s11 = s11;
                    str2 = str;
                } else {
                    if (j10 > 4) {
                        i11 = iVar.readInt();
                        if (z12) {
                            Log.d(str, "seek to data offset: " + i11);
                        }
                        if (this.f23431d == 7) {
                            if (f23287j0.equals(fVar.f23466b)) {
                                this.f23444q = i11;
                            } else if (i10 != 6) {
                            }
                        }
                        iVar.e(i11);
                    } else {
                        jA = jA;
                        str = str;
                        i12 = i12;
                    }
                    num = f23286i7.get(Integer.valueOf(unsignedShort2));
                    if (z12) {
                        str2 = str;
                        Log.d(str2, "nextIfdType: " + num + " byteCount: " + j10);
                    } else {
                        str2 = str;
                    }
                    if (num != null) {
                        jB = -1;
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                jB = iVar.b();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = iVar.readInt();
                            } else {
                                unsignedShort = iVar.readShort();
                            }
                            if (z12) {
                                Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jB), fVar.f23466b));
                            }
                            if (jB > 0) {
                                if (!this.f23434g.contains(Integer.valueOf((int) jB))) {
                                    iVar.e(jB);
                                    k0(iVar, num.intValue());
                                } else if (z12) {
                                    Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jB + ")");
                                }
                            } else if (z12) {
                                Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jB);
                            }
                            iVar.e(jA);
                        } else {
                            unsignedShort = iVar.readUnsignedShort();
                        }
                        jB = unsignedShort;
                        if (z12) {
                            Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jB), fVar.f23466b));
                        }
                        if (jB > 0) {
                            if (!this.f23434g.contains(Integer.valueOf((int) jB))) {
                                iVar.e(jB);
                                k0(iVar, num.intValue());
                            } else if (z12) {
                                Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jB + ")");
                            }
                        } else if (z12) {
                            Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jB);
                        }
                        iVar.e(jA);
                    } else {
                        j11 = jA;
                        int iA2 = iVar.a() + this.f23443p;
                        byte[] bArr2 = new byte[(int) j10];
                        iVar.readFully(bArr2);
                        d dVar2 = new d(unsignedShort3, i12, iA2, bArr2);
                        this.f23433f[i10].put(fVar.f23466b, dVar2);
                        if (f23273h2.equals(fVar.f23466b)) {
                            this.f23431d = 3;
                        }
                        if (!W.equals(fVar.f23466b)) {
                        }
                        this.f23431d = 8;
                        if (iVar.a() != j11) {
                            iVar.e(j11);
                        }
                    }
                }
                s12 = (short) (s10 + 1);
                str3 = str2;
                s11 = s11;
                c10 = 0;
            } else if (z12) {
                Log.d(str3, "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            str = str3;
            s10 = s12;
            j10 = 0;
            z10 = false;
            if (z10) {
                iVar.e(jA);
                s11 = s11;
                str2 = str;
            } else {
                if (j10 > 4) {
                    i11 = iVar.readInt();
                    if (z12) {
                        Log.d(str, "seek to data offset: " + i11);
                    }
                    if (this.f23431d == 7) {
                        if (f23287j0.equals(fVar.f23466b)) {
                            this.f23444q = i11;
                        } else if (i10 != 6) {
                        }
                    }
                    iVar.e(i11);
                } else {
                    jA = jA;
                    str = str;
                    i12 = i12;
                }
                num = f23286i7.get(Integer.valueOf(unsignedShort2));
                if (z12) {
                    str2 = str;
                    Log.d(str2, "nextIfdType: " + num + " byteCount: " + j10);
                } else {
                    str2 = str;
                }
                if (num != null) {
                    jB = -1;
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            jB = iVar.b();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = iVar.readInt();
                        } else {
                            unsignedShort = iVar.readShort();
                        }
                        if (z12) {
                            Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jB), fVar.f23466b));
                        }
                        if (jB > 0) {
                            if (!this.f23434g.contains(Integer.valueOf((int) jB))) {
                                iVar.e(jB);
                                k0(iVar, num.intValue());
                            } else if (z12) {
                                Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jB + ")");
                            }
                        } else if (z12) {
                            Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jB);
                        }
                        iVar.e(jA);
                    } else {
                        unsignedShort = iVar.readUnsignedShort();
                    }
                    jB = unsignedShort;
                    if (z12) {
                        Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jB), fVar.f23466b));
                    }
                    if (jB > 0) {
                        if (!this.f23434g.contains(Integer.valueOf((int) jB))) {
                            iVar.e(jB);
                            k0(iVar, num.intValue());
                        } else if (z12) {
                            Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jB + ")");
                        }
                    } else if (z12) {
                        Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jB);
                    }
                    iVar.e(jA);
                } else {
                    j11 = jA;
                    int iA3 = iVar.a() + this.f23443p;
                    byte[] bArr3 = new byte[(int) j10];
                    iVar.readFully(bArr3);
                    d dVar3 = new d(unsignedShort3, i12, iA3, bArr3);
                    this.f23433f[i10].put(fVar.f23466b, dVar3);
                    if (f23273h2.equals(fVar.f23466b)) {
                        this.f23431d = 3;
                    }
                    if (!W.equals(fVar.f23466b)) {
                    }
                    this.f23431d = 8;
                    if (iVar.a() != j11) {
                        iVar.e(j11);
                    }
                }
            }
            s12 = (short) (s10 + 1);
            str3 = str2;
            s11 = s11;
            c10 = 0;
        }
        String str4 = str3;
        int i13 = iVar.readInt();
        boolean z13 = f23392w;
        if (z13) {
            Log.d(str4, String.format("nextIfdOffset: %d", Integer.valueOf(i13)));
        }
        long j12 = i13;
        if (j12 <= 0) {
            if (z13) {
                Log.d(str4, "Stop reading file since a wrong offset may cause an infinite loop: " + i13);
                return;
            }
            return;
        }
        if (this.f23434g.contains(Integer.valueOf(i13))) {
            if (z13) {
                Log.d(str4, "Stop reading file since re-reading an IFD may cause an infinite loop: " + i13);
                return;
            }
            return;
        }
        iVar.e(j12);
        if (this.f23433f[4].isEmpty()) {
            k0(iVar, 4);
        } else if (this.f23433f[5].isEmpty()) {
            k0(iVar, 5);
        }
    }

    private void l0(String str) {
        for (int i10 = 0; i10 < f23246d7.length; i10++) {
            this.f23433f[i10].remove(str);
        }
    }

    private void m0(int i10, String str, String str2) {
        if (this.f23433f[i10].isEmpty() || this.f23433f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f23433f[i10];
        map.put(str2, map.get(str));
        this.f23433f[i10].remove(str);
    }

    private void o0(i iVar, int i10) throws Throwable {
        d dVar = this.f23433f[i10].get(f23410y);
        d dVar2 = this.f23433f[i10].get(f23401x);
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f23433f[i10].get(N);
            d dVar4 = this.f23433f[i10].get(O);
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iP = dVar3.p(this.f23435h);
            int iP2 = dVar3.p(this.f23435h);
            iVar.e(iP);
            byte[] bArr = new byte[iP2];
            iVar.read(bArr);
            t(new b(bArr), iP, i10);
        }
    }

    @p0
    private d q(@n0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (f23411y0.equals(str)) {
            if (f23392w) {
                Log.d(f23383v, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = f23420z0;
        }
        for (int i10 = 0; i10 < f23246d7.length; i10++) {
            d dVar = this.f23433f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void r0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f23392w) {
            Log.d(f23383v, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d dVarRemove = null;
        if (i(f23369t2) != null && this.f23448u) {
            dVarRemove = this.f23433f[0].remove(f23369t2);
        }
        cVar.b(-1);
        cVar.b(-31);
        E0(cVar);
        if (dVarRemove != null) {
            this.f23433f[0].put(f23369t2, dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.b(-1);
                cVar.b(b10);
                androidx.exifinterface.media.b.e(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.b(-1);
                cVar.b(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.f(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (i11 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i11);
                    i10 -= i11;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort() - 2;
                if (unsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (unsignedShort2 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f23302k7)) {
                        bVar.d(unsignedShort2 - 6);
                    }
                }
                cVar.b(-1);
                cVar.b(b10);
                cVar.f(unsignedShort2 + 2);
                if (unsignedShort2 >= 6) {
                    unsignedShort2 -= 6;
                    cVar.write(bArr2);
                }
                while (unsignedShort2 > 0) {
                    int i12 = bVar.read(bArr, 0, Math.min(unsignedShort2, 4096));
                    if (i12 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i12);
                    unsignedShort2 -= i12;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void s(i iVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                androidx.exifinterface.media.b.C0169b.a(mediaMetadataRetriever, new C0168a(iVar));
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(17);
                String strExtractMetadata7 = null;
                if ("yes".equals(strExtractMetadata5)) {
                    strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                }
                if (strExtractMetadata7 != null) {
                    this.f23433f[0].put(f23401x, d.m(Integer.parseInt(strExtractMetadata7), this.f23435h));
                }
                if (strExtractMetadata != null) {
                    this.f23433f[0].put(f23410y, d.m(Integer.parseInt(strExtractMetadata), this.f23435h));
                }
                if (strExtractMetadata2 != null) {
                    int i10 = 1;
                    int i11 = Integer.parseInt(strExtractMetadata2);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 == 180) {
                        i10 = 3;
                    } else if (i11 == 270) {
                        i10 = 8;
                    }
                    this.f23433f[0].put(C, d.m(i10, this.f23435h));
                }
                if (strExtractMetadata3 != null && strExtractMetadata4 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata3);
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    iVar.e(i12);
                    byte[] bArr = new byte[6];
                    if (iVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f23302k7)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    if (iVar.read(bArr2) != i15) {
                        throw new IOException("Can't read exif");
                    }
                    this.f23443p = i14;
                    j0(bArr2, 0);
                }
                if (f23392w) {
                    Log.d(f23383v, "Heif meta: " + strExtractMetadata7 + "x" + strExtractMetadata + ", rotation " + strExtractMetadata2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    private void s0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (f23392w) {
            Log.d(f23383v, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = S5;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        int i10 = this.f23443p;
        if (i10 == 0) {
            int i11 = bVar.readInt();
            cVar.c(i11);
            androidx.exifinterface.media.b.f(bVar, cVar, i11 + 4 + 4);
        } else {
            androidx.exifinterface.media.b.f(bVar, cVar, ((i10 - bArr.length) - 4) - 4);
            bVar.d(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                E0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f23458b).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.c((int) crc32.getValue());
                androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                androidx.exifinterface.media.b.e(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.b.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184 A[LOOP:0: B:10:0x0038->B:63:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x018e A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void t(androidx.exifinterface.media.a.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.t(androidx.exifinterface.media.a$b, int, int):void");
    }

    private void t0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i10;
        int i11;
        int i12;
        if (f23392w) {
            Log.d(f23383v, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = Y5;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        byte[] bArr2 = Z5;
        bVar.d(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i13 = this.f23443p;
                    if (i13 != 0) {
                        androidx.exifinterface.media.b.f(bVar, cVar2, ((i13 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        bVar.d(4);
                        int i14 = bVar.readInt();
                        if (i14 % 2 != 0) {
                            i14++;
                        }
                        bVar.d(i14);
                        E0(cVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = f23253e6;
                        boolean z10 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i15 = bVar.readInt();
                            byte[] bArr5 = new byte[i15 % 2 == 1 ? i15 + 1 : i15];
                            bVar.read(bArr5);
                            byte b10 = (byte) (8 | bArr5[0]);
                            bArr5[0] = b10;
                            boolean z11 = ((b10 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.c(i15);
                            cVar2.write(bArr5);
                            if (z11) {
                                d(bVar, cVar2, f23277h6, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, f23285i6)) {
                                        break;
                                    } else {
                                        e(bVar, cVar2, bArr6);
                                    }
                                }
                                E0(cVar2);
                            } else {
                                d(bVar, cVar2, f23269g6, f23261f6);
                                E0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = f23269g6;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f23261f6)) {
                                int i16 = bVar.readInt();
                                int i17 = i16 % 2 == 1 ? i16 + 1 : i16;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    if (bVar.read(bArr9) != 3 || !Arrays.equals(f23237c6, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i10 = bVar.readInt();
                                    i17 -= 10;
                                    i12 = (i10 << 2) >> 18;
                                    i11 = (i10 << 18) >> 18;
                                    z10 = false;
                                } else if (!Arrays.equals(bArr3, f23261f6)) {
                                    i10 = 0;
                                    z10 = false;
                                    i11 = 0;
                                    i12 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Encountered error while checking VP8L signature");
                                    }
                                    i10 = bVar.readInt();
                                    i11 = (i10 & 16383) + 1;
                                    i12 = ((i10 & 268419072) >>> 14) + 1;
                                    if ((i10 & 268435456) == 0) {
                                        z10 = false;
                                    }
                                    i17 -= 5;
                                }
                                cVar2.write(bArr4);
                                cVar2.c(10);
                                byte[] bArr10 = new byte[10];
                                if (z10) {
                                    bArr10[0] = (byte) (bArr10[0] | 16);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i18 = i11 - 1;
                                int i19 = i12 - 1;
                                bArr10[4] = (byte) i18;
                                bArr10[5] = (byte) (i18 >> 8);
                                bArr10[6] = (byte) (i18 >> 16);
                                bArr10[7] = (byte) i19;
                                bArr10[8] = (byte) (i19 >> 8);
                                bArr10[9] = (byte) (i19 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.c(i16);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(f23237c6);
                                    cVar2.c(i10);
                                } else if (Arrays.equals(bArr3, f23261f6)) {
                                    cVar2.write(47);
                                    cVar2.c(i10);
                                }
                                androidx.exifinterface.media.b.f(bVar, cVar2, i17);
                                E0(cVar2);
                            }
                        }
                    }
                    androidx.exifinterface.media.b.e(bVar, cVar2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = Z5;
                    cVar.c(size + bArr11.length);
                    cVar.write(bArr11);
                    byteArrayOutputStream2.writeTo(cVar);
                    androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    androidx.exifinterface.media.b.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private int w(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (S(bArr)) {
            return 4;
        }
        if (V(bArr)) {
            return 9;
        }
        if (R(bArr)) {
            return 12;
        }
        if (T(bArr)) {
            return 7;
        }
        if (W(bArr)) {
            return 10;
        }
        if (U(bArr)) {
            return 13;
        }
        return d0(bArr) ? 14 : 0;
    }

    private void x(i iVar) throws Throwable {
        int i10;
        int i11;
        A(iVar);
        d dVar = this.f23433f[1].get(f23287j0);
        if (dVar != null) {
            i iVar2 = new i(dVar.f23464d);
            iVar2.c(this.f23435h);
            byte[] bArr = L5;
            byte[] bArr2 = new byte[bArr.length];
            iVar2.readFully(bArr2);
            iVar2.e(0L);
            byte[] bArr3 = M5;
            byte[] bArr4 = new byte[bArr3.length];
            iVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iVar2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iVar2.e(12L);
            }
            k0(iVar2, 6);
            d dVar2 = this.f23433f[7].get(f23297k2);
            d dVar3 = this.f23433f[7].get(f23305l2);
            if (dVar2 != null && dVar3 != null) {
                this.f23433f[5].put(N, dVar2);
                this.f23433f[5].put(O, dVar3);
            }
            d dVar4 = this.f23433f[8].get(f23313m2);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.r(this.f23435h);
                if (iArr == null || iArr.length != 4) {
                    Log.w(f23383v, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarM = d.m(i14, this.f23435h);
                d dVarM2 = d.m(i15, this.f23435h);
                this.f23433f[0].put(f23401x, dVarM);
                this.f23433f[0].put(f23410y, dVarM2);
            }
        }
    }

    private void y(b bVar) throws Throwable {
        if (f23392w) {
            Log.d(f23383v, "getPngAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = S5;
        bVar.d(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i10 = bVar.readInt();
                int i11 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i12 = i11 + 4;
                if (i12 == 16 && !Arrays.equals(bArr2, U5)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, V5)) {
                    return;
                }
                if (Arrays.equals(bArr2, T5)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int i13 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i13) {
                        this.f23443p = i12;
                        j0(bArr3, 0);
                        D0();
                        z0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i13 + ", calculated CRC value: " + crc32.getValue());
                }
                int i14 = i10 + 4;
                bVar.d(i14);
                length = i12 + i14;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void z(b bVar) throws Throwable {
        boolean z10 = f23392w;
        if (z10) {
            Log.d(f23383v, "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.d(i10 - bVar.a());
        bVar.read(bArr4);
        t(new b(bArr4), i10, 5);
        bVar.d(i12 - bVar.a());
        bVar.c(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d(f23383v, "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == O6.f23465a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarM = d.m(s10, this.f23435h);
                d dVarM2 = d.m(s11, this.f23435h);
                this.f23433f[0].put(f23410y, dVarM);
                this.f23433f[0].put(f23401x, dVarM2);
                if (f23392w) {
                    Log.d(f23383v, "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.d(unsignedShort2);
        }
    }

    private void z0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f23433f[4];
        d dVar = map.get(A);
        if (dVar == null) {
            this.f23442o = 6;
            K(bVar, map);
            return;
        }
        int iP = dVar.p(this.f23435h);
        this.f23442o = iP;
        if (iP != 1) {
            if (iP == 6) {
                K(bVar, map);
                return;
            } else if (iP != 7) {
                return;
            }
        }
        if (Y(map)) {
            L(bVar, map);
        }
    }

    public int B() {
        switch (l(C, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @p0
    public byte[] E() {
        int i10 = this.f23442o;
        if (i10 == 6 || i10 == 7) {
            return G();
        }
        return null;
    }

    @p0
    public Bitmap F() throws Throwable {
        if (!this.f23436i) {
            return null;
        }
        if (this.f23441n == null) {
            this.f23441n = G();
        }
        int i10 = this.f23442o;
        if (i10 == 6 || i10 == 7) {
            return BitmapFactory.decodeByteArray(this.f23441n, 0, this.f23440m);
        }
        if (i10 == 1) {
            int length = this.f23441n.length / 3;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                byte[] bArr = this.f23441n;
                int i12 = i11 * 3;
                iArr[i11] = (bArr[i12] << 16) + 0 + (bArr[i12 + 1] << 8) + bArr[i12 + 2];
            }
            d dVar = this.f23433f[4].get(f23249e2);
            d dVar2 = this.f23433f[4].get(f23257f2);
            if (dVar != null && dVar2 != null) {
                return Bitmap.createBitmap(iArr, dVar2.p(this.f23435h), dVar.p(this.f23435h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @p0
    public byte[] G() throws Throwable {
        FileDescriptor fileDescriptor;
        Exception e10;
        FileDescriptor fileDescriptor2;
        ?? fileInputStream;
        ?? r10 = 0;
        r10 = 0;
        if (!this.f23436i) {
            return null;
        }
        ?? fileInputStream2 = this.f23441n;
        try {
            if (fileInputStream2 != 0) {
                return fileInputStream2;
            }
            try {
                fileInputStream2 = this.f23430c;
                if (fileInputStream2 != 0) {
                    try {
                        if (!fileInputStream2.markSupported()) {
                            Log.d(f23383v, "Cannot read thumbnail from inputstream without mark/reset support");
                            androidx.exifinterface.media.b.c(fileInputStream2);
                            return null;
                        }
                        fileInputStream2.reset();
                        fileInputStream = fileInputStream2;
                        fileDescriptor2 = null;
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e11) {
                        e10 = e11;
                        fileDescriptor2 = null;
                        Log.d(f23383v, "Encountered exception while getting thumbnail", e10);
                        androidx.exifinterface.media.b.c(fileInputStream2);
                        if (fileDescriptor2 != null) {
                            androidx.exifinterface.media.b.b(fileDescriptor2);
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileDescriptor = null;
                        r10 = fileInputStream2;
                        androidx.exifinterface.media.b.c(r10);
                        if (fileDescriptor != null) {
                            androidx.exifinterface.media.b.b(fileDescriptor);
                        }
                        throw th;
                    }
                } else if (this.f23428a != null) {
                    fileInputStream = new FileInputStream(this.f23428a);
                    fileDescriptor2 = null;
                    fileInputStream2 = fileInputStream;
                } else {
                    FileDescriptor fileDescriptorB = androidx.exifinterface.media.b.a.b(this.f23429b);
                    try {
                        androidx.exifinterface.media.b.a.c(fileDescriptorB, 0L, OsConstants.SEEK_SET);
                        fileDescriptor2 = fileDescriptorB;
                        fileInputStream2 = new FileInputStream(fileDescriptorB);
                    } catch (Exception e12) {
                        e10 = e12;
                        fileDescriptor2 = fileDescriptorB;
                        fileInputStream2 = 0;
                        Log.d(f23383v, "Encountered exception while getting thumbnail", e10);
                        androidx.exifinterface.media.b.c(fileInputStream2);
                        if (fileDescriptor2 != null) {
                            androidx.exifinterface.media.b.b(fileDescriptor2);
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileDescriptor = fileDescriptorB;
                        androidx.exifinterface.media.b.c(r10);
                        if (fileDescriptor != null) {
                            androidx.exifinterface.media.b.b(fileDescriptor);
                        }
                        throw th;
                    }
                }
                try {
                    if (fileInputStream2.skip(this.f23439l + this.f23443p) != this.f23439l + this.f23443p) {
                        throw new IOException("Corrupted image");
                    }
                    byte[] bArr = new byte[this.f23440m];
                    if (fileInputStream2.read(bArr) != this.f23440m) {
                        throw new IOException("Corrupted image");
                    }
                    this.f23441n = bArr;
                    androidx.exifinterface.media.b.c(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        androidx.exifinterface.media.b.b(fileDescriptor2);
                    }
                    return bArr;
                } catch (Exception e13) {
                    e10 = e13;
                    Log.d(f23383v, "Encountered exception while getting thumbnail", e10);
                    androidx.exifinterface.media.b.c(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        androidx.exifinterface.media.b.b(fileDescriptor2);
                    }
                    return null;
                }
            } catch (Exception e14) {
                fileInputStream2 = 0;
                e10 = e14;
                fileDescriptor2 = null;
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @p0
    public long[] H() {
        if (this.f23447t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f23436i) {
            return null;
        }
        if (!this.f23437j || this.f23438k) {
            return new long[]{this.f23439l + this.f23443p, this.f23440m};
        }
        return null;
    }

    public boolean M(@n0 String str) {
        return q(str) != null;
    }

    public boolean N() {
        return this.f23436i;
    }

    public boolean Q() {
        int iL = l(C, 1);
        return iL == 2 || iL == 7 || iL == 4 || iL == 5;
    }

    public boolean c0() {
        if (!this.f23436i) {
            return false;
        }
        int i10 = this.f23442o;
        return i10 == 6 || i10 == 7;
    }

    public void f() {
        int i10 = 1;
        switch (l(C, 1)) {
            case 1:
                i10 = 2;
                break;
            case 2:
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        v0(C, Integer.toString(i10));
    }

    public void g() {
        int i10 = 1;
        switch (l(C, 1)) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 0;
                break;
        }
        v0(C, Integer.toString(i10));
    }

    public double h(double d10) {
        double dK = k(D1, -1.0d);
        int iL = l(C1, -1);
        if (dK < 0.0d || iL < 0) {
            return d10;
        }
        return dK * ((double) (iL != 1 ? 1 : -1));
    }

    @p0
    public String i(@n0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            if (!f23278h7.contains(str)) {
                return dVarQ.q(this.f23435h);
            }
            if (str.equals(E1)) {
                int i10 = dVarQ.f23461a;
                if (i10 != 5 && i10 != 10) {
                    Log.w(f23383v, "GPS Timestamp format is not rational. format=" + dVarQ.f23461a);
                    return null;
                }
                h[] hVarArr = (h[]) dVarQ.r(this.f23435h);
                if (hVarArr != null && hVarArr.length == 3) {
                    h hVar = hVarArr[0];
                    h hVar2 = hVarArr[1];
                    h hVar3 = hVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (hVar.f23469a / hVar.f23470b)), Integer.valueOf((int) (hVar2.f23469a / hVar2.f23470b)), Integer.valueOf((int) (hVar3.f23469a / hVar3.f23470b)));
                }
                Log.w(f23383v, "Invalid GPS Timestamp array. array=" + Arrays.toString(hVarArr));
                return null;
            }
            try {
                return Double.toString(dVarQ.o(this.f23435h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @p0
    public byte[] j(@n0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            return dVarQ.f23464d;
        }
        return null;
    }

    public double k(@n0 String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ == null) {
            return d10;
        }
        try {
            return dVarQ.o(this.f23435h);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public int l(@n0 String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ == null) {
            return i10;
        }
        try {
            return dVarQ.p(this.f23435h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    @p0
    public long[] m(@n0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f23447t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            return new long[]{dVarQ.f23463c, dVarQ.f23464d.length};
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public Long n() {
        return f0(i(U), i(f23351r0), i(f23327o0));
    }

    public void n0() {
        v0(C, Integer.toString(1));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public Long o() {
        return f0(i(f23319n0), i(f23367t0), i(f23343q0));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public Long p() {
        return f0(i(f23311m0), i(f23359s0), i(f23335p0));
    }

    public void p0(int i10) {
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int iL = l(C, 1);
        List<Integer> list = M2;
        int iIntValue = 0;
        if (list.contains(Integer.valueOf(iL))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(iL)) + (i10 / 90)) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = N2;
            if (list2.contains(Integer.valueOf(iL))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(iL)) + (i10 / 90)) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        v0(C, Integer.toString(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    public void q0() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e10;
        FileOutputStream fileOutputStream4;
        if (!Z(this.f23431d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f23429b == null && this.f23428a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f23436i && this.f23437j && !this.f23438k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f23447t = true;
        this.f23441n = E();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f23428a != null) {
                fileInputStream = new FileInputStream(this.f23428a);
            } else {
                androidx.exifinterface.media.b.a.c(this.f23429b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f23429b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    androidx.exifinterface.media.b.e(fileInputStream, fileOutputStream);
                    androidx.exifinterface.media.b.c(fileInputStream);
                    androidx.exifinterface.media.b.c(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f23428a != null) {
                                        fileOutputStream3 = new FileOutputStream(this.f23428a);
                                    } else {
                                        androidx.exifinterface.media.b.a.c(this.f23429b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.f23429b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                            try {
                                                int i10 = this.f23431d;
                                                if (i10 == 4) {
                                                    r0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 13) {
                                                    s0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 14) {
                                                    t0(bufferedInputStream, bufferedOutputStream);
                                                }
                                                androidx.exifinterface.media.b.c(bufferedInputStream);
                                                androidx.exifinterface.media.b.c(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f23441n = null;
                                            } catch (Exception e11) {
                                                exc = e11;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f23428a == null) {
                                                            androidx.exifinterface.media.b.a.c(this.f23429b, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream4 = new FileOutputStream(this.f23429b);
                                                        } else {
                                                            fileOutputStream4 = new FileOutputStream(this.f23428a);
                                                        }
                                                        fileOutputStream3 = fileOutputStream4;
                                                        androidx.exifinterface.media.b.e(fileInputStream2, fileOutputStream3);
                                                        androidx.exifinterface.media.b.c(fileInputStream2);
                                                        androidx.exifinterface.media.b.c(fileOutputStream3);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e12) {
                                                        e10 = e12;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e10);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            inputStream = fileInputStream2;
                                                            androidx.exifinterface.media.b.c(inputStream);
                                                            androidx.exifinterface.media.b.c(fileOutputStream3);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = fileInputStream2;
                                                        androidx.exifinterface.media.b.c(inputStream);
                                                        androidx.exifinterface.media.b.c(fileOutputStream3);
                                                        throw th;
                                                    }
                                                } catch (Exception e13) {
                                                    fileInputStream2 = inputStream;
                                                    e10 = e13;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    androidx.exifinterface.media.b.c(inputStream);
                                                    androidx.exifinterface.media.b.c(fileOutputStream3);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e14) {
                                            inputStream = fileInputStream3;
                                            exc = e14;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = bufferedInputStream;
                                            androidx.exifinterface.media.b.c(inputStream);
                                            androidx.exifinterface.media.b.c(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e15) {
                                        inputStream = fileInputStream3;
                                        exc = e15;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    fileOutputStream2 = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream3 = fileOutputStream2;
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (this.f23428a == null) {
                                        androidx.exifinterface.media.b.a.c(this.f23429b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(this.f23429b);
                                    } else {
                                        fileOutputStream4 = new FileOutputStream(this.f23428a);
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    androidx.exifinterface.media.b.e(fileInputStream2, fileOutputStream3);
                                    androidx.exifinterface.media.b.c(fileInputStream2);
                                    androidx.exifinterface.media.b.c(fileOutputStream3);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Exception e17) {
                                e = e17;
                                fileOutputStream2 = null;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            androidx.exifinterface.media.b.c(inputStream);
                            androidx.exifinterface.media.b.c(0);
                            if (0 == 0) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e18) {
                    e = e18;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        androidx.exifinterface.media.b.c(inputStream);
                        androidx.exifinterface.media.b.c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = fileInputStream;
                    androidx.exifinterface.media.b.c(inputStream);
                    androidx.exifinterface.media.b.c(fileOutputStream);
                    throw th;
                }
            } catch (Exception e19) {
                e = e19;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e20) {
            e = e20;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    @SuppressLint({"AutoBoxing"})
    @p0
    public Long r() {
        String strI = i(f23217a2);
        String strI2 = i(E1);
        if (strI != null && strI2 != null) {
            Pattern pattern = U7;
            if (pattern.matcher(strI).matches() || pattern.matcher(strI2).matches()) {
                String str = strI + ' ' + strI2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = f23317m6.parse(str, parsePosition);
                    if (date == null && (date = f23325n6.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Deprecated
    public boolean u(float[] fArr) {
        double[] dArrV = v();
        if (dArrV == null) {
            return false;
        }
        fArr[0] = (float) dArrV[0];
        fArr[1] = (float) dArrV[1];
        return true;
    }

    public void u0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        v0(D1, new h(Math.abs(d10)).toString());
        v0(C1, str);
    }

    @p0
    public double[] v() {
        String strI = i(f23421z1);
        String strI2 = i(f23412y1);
        String strI3 = i(B1);
        String strI4 = i(A1);
        if (strI == null || strI2 == null || strI3 == null || strI4 == null) {
            return null;
        }
        try {
            return new double[]{c(strI, strI2), c(strI3, strI4)};
        } catch (IllegalArgumentException unused) {
            Log.w(f23383v, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strI, strI2, strI3, strI4));
            return null;
        }
    }

    public void v0(@n0 String str, @p0 String str2) {
        f fVar;
        int i10;
        int i11;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ((U.equals(str3) || f23311m0.equals(str3) || f23319n0.equals(str3)) && strReplaceAll != null) {
            boolean zFind = W7.matcher(strReplaceAll).find();
            boolean zFind2 = X7.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w(f23383v, "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ":");
            }
        }
        if (f23411y0.equals(str3)) {
            if (f23392w) {
                Log.d(f23383v, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = f23420z0;
        }
        int i12 = 2;
        int i13 = 1;
        if (strReplaceAll != null && f23278h7.contains(str3)) {
            if (str3.equals(E1)) {
                Matcher matcher = V7.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w(f23383v, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new h(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w(f23383v, "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i14 = 0;
        int i15 = 0;
        while (i15 < f23246d7.length) {
            if ((i15 != 4 || this.f23436i) && (fVar = f23270g7[i15].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairJ = J(strReplaceAll);
                    int i16 = -1;
                    if (fVar.f23467c == ((Integer) pairJ.first).intValue() || fVar.f23467c == ((Integer) pairJ.second).intValue()) {
                        i10 = fVar.f23467c;
                    } else {
                        int i17 = fVar.f23468d;
                        if (i17 == -1 || !(i17 == ((Integer) pairJ.first).intValue() || fVar.f23468d == ((Integer) pairJ.second).intValue())) {
                            int i18 = fVar.f23467c;
                            if (i18 == i13 || i18 == 7 || i18 == i12) {
                                i10 = i18;
                            } else if (f23392w) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = G6;
                                sb2.append(strArr[fVar.f23467c]);
                                sb2.append(fVar.f23468d == -1 ? "" : ", " + strArr[fVar.f23468d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairJ.first).intValue()]);
                                sb2.append(((Integer) pairJ.second).intValue() != -1 ? ", " + strArr[((Integer) pairJ.second).intValue()] : "");
                                sb2.append(")");
                                Log.d(f23383v, sb2.toString());
                            }
                        } else {
                            i10 = fVar.f23468d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i13;
                            this.f23433f[i15].put(str3, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i11 = i13;
                            this.f23433f[i15].put(str3, d.h(strReplaceAll));
                            break;
                        case 3:
                            i11 = i13;
                            String[] strArrSplit = strReplaceAll.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i19 = 0; i19 < strArrSplit.length; i19++) {
                                iArr[i19] = Integer.parseInt(strArrSplit[i19]);
                            }
                            this.f23433f[i15].put(str3, d.n(iArr, this.f23435h));
                            break;
                        case 4:
                            i11 = i13;
                            String[] strArrSplit2 = strReplaceAll.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i20 = 0; i20 < strArrSplit2.length; i20++) {
                                jArr[i20] = Long.parseLong(strArrSplit2[i20]);
                            }
                            this.f23433f[i15].put(str3, d.j(jArr, this.f23435h));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            h[] hVarArr = new h[strArrSplit3.length];
                            int i21 = 0;
                            while (i21 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i21].split("/", i16);
                                hVarArr[i21] = new h((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]));
                                i21++;
                                i16 = -1;
                            }
                            i11 = 1;
                            this.f23433f[i15].put(str3, d.l(hVarArr, this.f23435h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            i11 = i13;
                            if (f23392w) {
                                Log.d(f23383v, "Data format isn't one of expected formats: " + i10);
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i22 = 0; i22 < strArrSplit5.length; i22++) {
                                iArr2[i22] = Integer.parseInt(strArrSplit5[i22]);
                            }
                            this.f23433f[i15].put(str3, d.e(iArr2, this.f23435h));
                            i11 = 1;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            h[] hVarArr2 = new h[strArrSplit6.length];
                            int i23 = i14;
                            while (i23 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i23].split("/", -1);
                                hVarArr2[i23] = new h((long) Double.parseDouble(strArrSplit7[i14]), (long) Double.parseDouble(strArrSplit7[i13]));
                                i23++;
                                strArrSplit6 = strArrSplit6;
                                i14 = 0;
                                i13 = 1;
                            }
                            this.f23433f[i15].put(str3, d.g(hVarArr2, this.f23435h));
                            i11 = 1;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i24 = i14; i24 < strArrSplit8.length; i24++) {
                                dArr[i24] = Double.parseDouble(strArrSplit8[i24]);
                            }
                            this.f23433f[i15].put(str3, d.c(dArr, this.f23435h));
                            break;
                    }
                } else {
                    this.f23433f[i15].remove(str3);
                }
                i11 = i13;
            } else {
                i11 = i13;
            }
            i15++;
            i13 = i11;
            i12 = 2;
            i14 = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void w0(@n0 Long l10) {
        if (l10 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l10.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = "0" + string;
        }
        v0(U, f23317m6.format(new Date(l10.longValue())));
        v0(f23351r0, string);
    }

    public void x0(Location location) {
        if (location == null) {
            return;
        }
        v0(Y1, location.getProvider());
        y0(location.getLatitude(), location.getLongitude());
        u0(location.getAltitude());
        v0(J1, "K");
        v0(K1, new h((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f23317m6.format(new Date(location.getTime())).split("\\s+", -1);
        v0(f23217a2, strArrSplit[0]);
        v0(E1, strArrSplit[1]);
    }

    public void y0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        v0(f23412y1, d10 >= 0.0d ? "N" : R4);
        v0(f23421z1, b(Math.abs(d10)));
        v0(A1, d11 >= 0.0d ? S4 : T4);
        v0(B1, b(Math.abs(d11)));
    }
}
