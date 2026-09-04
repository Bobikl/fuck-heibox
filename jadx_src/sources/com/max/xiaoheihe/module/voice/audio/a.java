package com.max.xiaoheihe.module.voice.audio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.b;

/* JADX INFO: compiled from: AudioBuffer.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nAudioBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioBuffer.kt\ncom/max/xiaoheihe/module/voice/audio/AudioBufferKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n13593#2,2:133\n11345#2:135\n11680#2,3:136\n11355#2:139\n11690#2,3:140\n*S KotlinDebug\n*F\n+ 1 AudioBuffer.kt\ncom/max/xiaoheihe/module/voice/audio/AudioBufferKt\n*L\n120#1:133,2\n127#1:135\n127#1:136,3\n131#1:139\n131#1:140,3\n*E\n"})
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final String a(@d byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, 46710, new Class[]{byte[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            String string = Integer.toString(b10, b.a(b.a(2)));
            f0.o(string, "toString(this, checkRadix(radix))");
            arrayList.add(string);
        }
        return CollectionsKt___CollectionsKt.Q5(arrayList).toString();
    }

    @d
    public static final String b(@d short[] sArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sArr}, null, changeQuickRedirect, true, 46711, new Class[]{short[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            String string = Integer.toString(s10, b.a(b.a(2)));
            f0.o(string, "toString(this, checkRadix(radix))");
            arrayList.add(string);
        }
        return CollectionsKt___CollectionsKt.Q5(arrayList).toString();
    }

    @d
    public static final byte[] c(@d short[] sArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sArr}, null, changeQuickRedirect, true, 46709, new Class[]{short[].class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        f0.p(sArr, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sArr.length * 2);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (short s10 : sArr) {
            byteBufferAllocate.putShort(s10);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        f0.o(bArrArray, "byteBuffer.array()");
        return bArrArray;
    }

    @d
    public static final short[] d(@d byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, 46708, new Class[]{byte[].class}, short[].class);
        if (patchProxyResultProxy.isSupported) {
            return (short[]) patchProxyResultProxy.result;
        }
        f0.p(bArr, "<this>");
        short[] sArr = new short[bArr.length / 2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        return sArr;
    }
}
