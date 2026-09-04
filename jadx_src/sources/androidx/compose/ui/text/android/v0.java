package androidx.compose.ui.text.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextAndroidCanvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0017J\b\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J$\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001c\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J:\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J2\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000fH\u0016J8\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J0\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0018\u00100\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0012\u00103\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0012\u00104\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000201H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0016J0\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u00109\u001a\u000208H\u0017J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0017J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J\n\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010C\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0018\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J0\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020DH\u0017J(\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0010\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020GH\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0018H\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0005H\u0016J0\u0010O\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JH\u0010O\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010S\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000fH\u0016J*\u0010T\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010T\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010U\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010T\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010U\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JR\u0010T\u001a\u00020\u00032\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017JR\u0010T\u001a\u00020\u00032\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010T\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u0002012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JL\u0010e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020\u000f2\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010d\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J(\u0010i\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u001d2\u0006\u0010g\u001a\u00020\u001d2\u0006\u0010h\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u000fH\u0016J\u0010\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020lH\u0017J\u0018\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020mH\u0016J\u0018\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020oH\u0017J\u0018\u0010k\u001a\u00020\u00032\u0006\u0010j\u001a\u00020l2\u0006\u0010n\u001a\u00020oH\u0017J0\u0010t\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u001d2\u0006\u0010q\u001a\u00020\u001d2\u0006\u0010r\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010w\u001a\u00020\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010w\u001a\u00020\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010x\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J0\u0010x\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010y\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\"\u0010|\u001a\u00020\u00032\u0006\u0010{\u001a\u00020z2\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010|\u001a\u00020\u00032\u0006\u0010{\u001a\u00020z2\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010}\u001a\u00020\u00032\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010~\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J*\u0010\u007f\u001a\u00020\u00032\b\u0010u\u001a\u0004\u0018\u00010a2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u007f\u001a\u00020\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010\u0084\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J$\u0010\u0084\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0083\u0001\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u0019\u0010\u0086\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0086\u0001\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J1\u0010\u0086\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J!\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000fH\u0016J+\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u001d2\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JC\u0010\u008a\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0007\u0010\u0088\u0001\u001a\u00020\u001d2\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JG\u0010\u0091\u0001\u001a\u00020\u00032\u0007\u0010\u008b\u0001\u001a\u00020\u00182\u0007\u0010\u008c\u0001\u001a\u00020\u001d2\u0007\u0010\u008d\u0001\u001a\u00020\u001d2\u0007\u0010\u008e\u0001\u001a\u00020\u00182\u0007\u0010\u008f\u0001\u001a\u00020\u001d2\u0007\u0010\u0090\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J5\u0010\u0091\u0001\u001a\u00020\u00032\u0007\u0010\u008b\u0001\u001a\u00020\u00182\u0007\u0010\u0092\u0001\u001a\u00020a2\u0007\u0010\u008e\u0001\u001a\u00020\u00182\u0007\u0010\u0093\u0001\u001a\u00020a2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JH\u0010\u009b\u0001\u001a\u00020\u00032\u0007\u0010\u0094\u0001\u001a\u00020V2\u0007\u0010\u0095\u0001\u001a\u00020\u000f2\u0007\u0010\u0096\u0001\u001a\u00020a2\u0007\u0010\u0097\u0001\u001a\u00020\u000f2\u0007\u0010\u0098\u0001\u001a\u00020\u000f2\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J<\u0010\u009c\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u009c\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0085\u00012\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009c\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009c\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JF\u0010¢\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0007\u0010 \u0001\u001a\u00020\u001d2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010¢\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0085\u00012\u0006\u0010=\u001a\u00020<2\u0007\u0010 \u0001\u001a\u00020\u001d2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JW\u0010¦\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\u000f2\u0007\u0010¤\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0007\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010¦\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0007\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010¦\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030©\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u001d2\u0007\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017Jw\u0010²\u0001\u001a\u00020\u00032\u0007\u0010n\u001a\u00030ª\u00012\u0007\u0010«\u0001\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020\u000f2\t\u0010¬\u0001\u001a\u0004\u0018\u00010a2\u0007\u0010\u00ad\u0001\u001a\u00020\u000f2\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010d\u001a\u00020\u000f2\n\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00012\u0007\u0010°\u0001\u001a\u00020\u000f2\u0007\u0010±\u0001\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0013\u0010µ\u0001\u001a\u00020\u00032\b\u0010´\u0001\u001a\u00030³\u0001H\u0017R\u0018\u0010·\u0001\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0004\u0010¶\u0001¨\u0006º\u0001"}, d2 = {"Landroidx/compose/ui/text/android/v0;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/b2;", ak.av, "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "enableZ", "disableZ", "isOpaque", "", "getWidth", "getHeight", "getDensity", "density", "setDensity", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "alpha", "saveLayerAlpha", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "clipOutRect", "Landroid/graphics/Path;", FlutterActivityLaunchConfigs.EXTRA_PATH, "clipPath", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "filter", "setDrawFilter", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "Landroid/graphics/Picture;", "picture", "drawPicture", "dst", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "r", "g", "b", "drawARGB", "drawBitmap", com.max.hbsearch.l.W, "", "colors", androidx.constraintlayout.core.motion.utils.w.c.R, "stride", "x", "y", "width", "height", "hasAlpha", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "cx", "cy", "radius", "drawCircle", "color", "drawColor", "", "Landroid/graphics/PorterDuff$Mode;", "mode", "Landroid/graphics/BlendMode;", "startX", "startY", "stopX", "stopY", "drawLine", "pts", "count", "drawLines", "drawOval", "drawPaint", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "drawPath", "drawPoint", "drawPoints", "", "text", UCropPlusActivity.ARG_INDEX, "pos", "drawPosText", "", "drawRect", "drawRGB", "rx", "ry", "drawRoundRect", "outer", "outerRx", "outerRy", ak.au, "innerRx", "innerRy", "drawDoubleRoundRect", "outerRadii", "innerRadii", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", UiKitSpanObj.TYPE_FONT, "drawGlyphs", "drawText", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "", "hOffset", "vOffset", "drawTextOnPath", "contextIndex", "contextCount", "isRtl", "drawTextRun", "contextStart", "contextEnd", "Landroid/graphics/text/MeasuredText;", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "Landroid/graphics/Canvas;", "nativeCanvas", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ClassVerificationFailure"})
public final class v0 extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Canvas nativeCanvas;

    public final void a(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutPath(@dl.d Path path) {
        kotlin.jvm.internal.f0.p(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutRect(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(26)
    public boolean clipOutRect(@dl.d RectF rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@dl.d Path path) {
        kotlin.jvm.internal.f0.p(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipPath(@dl.d Path path, @dl.d Region.Op op) {
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(float left, float top, float right, float bottom, @dl.d Region.Op op) {
        kotlin.jvm.internal.f0.p(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top, right, bottom, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@dl.d Rect rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(@dl.d Rect rect, @dl.d Region.Op op) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@dl.d RectF rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean clipRect(@dl.d RectF rect, @dl.d Region.Op op) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(op, "op");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void concat(@dl.e Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void disableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@dl.d RectF oval, float f10, float f11, boolean z10, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(oval, "oval");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(oval, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@dl.d Bitmap bitmap, float f10, float f11, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@dl.d Bitmap bitmap, @dl.d Matrix matrix, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@dl.d Bitmap bitmap, @dl.e Rect rect, @dl.d Rect dst, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        kotlin.jvm.internal.f0.p(dst, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@dl.d Bitmap bitmap, @dl.e Rect rect, @dl.d RectF dst, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        kotlin.jvm.internal.f0.p(dst, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, dst, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawBitmap(@dl.d int[] colors, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(colors, i10, i11, f10, f11, i12, i13, z10, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawBitmap(@dl.d int[] colors, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(colors, i10, i11, i12, i13, i14, i15, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@dl.d Bitmap bitmap, int i10, int i11, @dl.d float[] verts, int i12, @dl.e int[] iArr, int i13, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        kotlin.jvm.internal.f0.p(verts, "verts");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i10, i11, verts, i12, iArr, i13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f10, float f11, float f12, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawColor(int i10, @dl.d BlendMode mode) {
        kotlin.jvm.internal.f0.p(mode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10, mode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, @dl.d PorterDuff.Mode mode) {
        kotlin.jvm.internal.f0.p(mode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10, mode);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawColor(long j10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j10);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawColor(long j10, @dl.d BlendMode mode) {
        kotlin.jvm.internal.f0.p(mode, "mode");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j10, mode);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawDoubleRoundRect(@dl.d RectF outer, float f10, float f11, @dl.d RectF inner, float f12, float f13, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(outer, "outer");
        kotlin.jvm.internal.f0.p(inner, "inner");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(outer, f10, f11, inner, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawDoubleRoundRect(@dl.d RectF outer, @dl.d float[] outerRadii, @dl.d RectF inner, @dl.d float[] innerRadii, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(outer, "outer");
        kotlin.jvm.internal.f0.p(outerRadii, "outerRadii");
        kotlin.jvm.internal.f0.p(inner, "inner");
        kotlin.jvm.internal.f0.p(innerRadii, "innerRadii");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(31)
    public void drawGlyphs(@dl.d int[] glyphIds, int i10, @dl.d float[] positions, int i11, int i12, @dl.d Font font, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(glyphIds, "glyphIds");
        kotlin.jvm.internal.f0.p(positions, "positions");
        kotlin.jvm.internal.f0.p(font, "font");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawGlyphs(glyphIds, i10, positions, i11, i12, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f10, float f11, float f12, float f13, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@dl.d float[] pts, int i10, int i11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(pts, "pts");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(pts, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@dl.d float[] pts, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(pts, "pts");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(pts, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(@dl.d RectF oval, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(oval, "oval");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(oval, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(31)
    public void drawPatch(@dl.d NinePatch patch, @dl.d Rect dst, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(patch, "patch");
        kotlin.jvm.internal.f0.p(dst, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(31)
    public void drawPatch(@dl.d NinePatch patch, @dl.d RectF dst, @dl.e Paint paint) {
        kotlin.jvm.internal.f0.p(patch, "patch");
        kotlin.jvm.internal.f0.p(dst, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@dl.d Path path, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@dl.d Picture picture) {
        kotlin.jvm.internal.f0.p(picture, "picture");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@dl.d Picture picture, @dl.d Rect dst) {
        kotlin.jvm.internal.f0.p(picture, "picture");
        kotlin.jvm.internal.f0.p(dst, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@dl.d Picture picture, @dl.d RectF dst) {
        kotlin.jvm.internal.f0.p(picture, "picture");
        kotlin.jvm.internal.f0.p(dst, "dst");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f10, float f11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@dl.e float[] fArr, int i10, int i11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@dl.d float[] pts, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(pts, "pts");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(pts, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawPosText(@dl.d String text, @dl.d float[] pos, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(pos, "pos");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(text, pos, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void drawPosText(@dl.d char[] text, int i10, int i11, @dl.d float[] pos, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(pos, "pos");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(text, i10, i11, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@dl.d Rect r10, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(r10, "r");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(r10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@dl.d RectF rect, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawRenderNode(@dl.d RenderNode renderNode) {
        kotlin.jvm.internal.f0.p(renderNode, "renderNode");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@dl.d RectF rect, float f10, float f11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rect, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@dl.d CharSequence text, int i10, int i11, float f10, float f11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@dl.d String text, float f10, float f11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@dl.d String text, int i10, int i11, float f10, float f11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@dl.d char[] text, int i10, int i11, float f10, float f11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@dl.d String text, @dl.d Path path, float f10, float f11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(text, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@dl.d char[] text, int i10, int i11, @dl.d Path path, float f10, float f11, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(text, i10, i11, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void drawTextRun(@dl.d MeasuredText text, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(23)
    public void drawTextRun(@dl.d CharSequence text, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(23)
    public void drawTextRun(@dl.d char[] text, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@dl.d Canvas.VertexMode mode, int i10, @dl.d float[] verts, int i11, @dl.e float[] fArr, int i12, @dl.e int[] iArr, int i13, @dl.e short[] sArr, int i14, int i15, @dl.d Paint paint) {
        kotlin.jvm.internal.f0.p(mode, "mode");
        kotlin.jvm.internal.f0.p(verts, "verts");
        kotlin.jvm.internal.f0.p(paint, "paint");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(mode, i10, verts, i11, fArr, i12, iArr, i13, sArr, i14, i15, paint);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(29)
    public void enableZ() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@dl.d Rect bounds) {
        kotlin.jvm.internal.f0.p(bounds, "bounds");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(bounds);
        if (clipBounds) {
            bounds.set(0, 0, bounds.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    @dl.e
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public void getMatrix(@dl.d Matrix ctm) {
        kotlin.jvm.internal.f0.p(ctm, "ctm");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(30)
    public boolean quickReject(float left, float top, float right, float bottom) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(float left, float top, float right, float bottom, @dl.d Canvas.EdgeType type) {
        kotlin.jvm.internal.f0.p(type, "type");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(left, top, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(30)
    public boolean quickReject(@dl.d Path path) {
        kotlin.jvm.internal.f0.p(path, "path");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(@dl.d Path path, @dl.d Canvas.EdgeType type) {
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(type, "type");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    @androidx.annotation.w0(30)
    public boolean quickReject(@dl.d RectF rect) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rect);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public boolean quickReject(@dl.d RectF rect, @dl.d Canvas.EdgeType type) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(type, "type");
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i10);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f10);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, @dl.e Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayer(float left, float top, float right, float bottom, @dl.e Paint paint, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(left, top, right, bottom, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@dl.e RectF bounds, @dl.e Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(bounds, paint);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayer(@dl.e RectF bounds, @dl.e Paint paint, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(bounds, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(left, top, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@dl.e RectF bounds, int alpha) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    @kotlin.k(message = "Deprecated in Java")
    public int saveLayerAlpha(@dl.e RectF bounds, int alpha, int saveFlags) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public void scale(float f10, float f11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@dl.e Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i10) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i10);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@dl.e DrawFilter drawFilter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@dl.e Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f10, float f11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void translate(float f10, float f11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.f0.S("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f10, f11);
    }
}
