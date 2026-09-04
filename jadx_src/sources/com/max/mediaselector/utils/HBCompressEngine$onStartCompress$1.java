package com.max.mediaselector.utils;

import android.content.Context;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HBCompressEngine.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nHBCompressEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBCompressEngine.kt\ncom/max/mediaselector/utils/HBCompressEngine$onStartCompress$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1855#2,2:200\n*S KotlinDebug\n*F\n+ 1 HBCompressEngine.kt\ncom/max/mediaselector/utils/HBCompressEngine$onStartCompress$1\n*L\n39#1:200,2\n*E\n"})
@d(c = "com.max.mediaselector.utils.HBCompressEngine$onStartCompress$1", f = "HBCompressEngine.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 104, 119}, m = "invokeSuspend", n = {"it", "it", "uri", "widthBoundary", "heightBoundary", "quality", "it", "uri", "widthBoundary", "heightBoundary", "quality"}, s = {"L$3", "L$3", "L$4", "F$0", "F$1", "I$0", "L$3", "L$4", "F$0", "F$1", "I$0"})
public final class HBCompressEngine$onStartCompress$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f75638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f75639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f75640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f75641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f75642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f75643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f75644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f75645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f75646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f75647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ ArrayList<LocalMedia> f75648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ oe.c<ArrayList<LocalMedia>> f75649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ HBCompressEngine f75650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f75651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ Context f75652p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBCompressEngine$onStartCompress$1(ArrayList<LocalMedia> arrayList, oe.c<ArrayList<LocalMedia>> cVar, HBCompressEngine hBCompressEngine, boolean z10, Context context, kotlin.coroutines.c<? super HBCompressEngine$onStartCompress$1> cVar2) {
        super(2, cVar2);
        this.f75648l = arrayList;
        this.f75649m = cVar;
        this.f75650n = hBCompressEngine;
        this.f75651o = z10;
        this.f75652p = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f34747gb, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HBCompressEngine$onStartCompress$1(this.f75648l, this.f75649m, this.f75650n, this.f75651o, this.f75652p, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34793ib, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34770hb, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBCompressEngine$onStartCompress$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c8 A[Catch: Exception -> 0x041b, TryCatch #1 {Exception -> 0x041b, blocks: (B:134:0x037c, B:136:0x0382, B:120:0x031b, B:124:0x032d, B:129:0x0342, B:152:0x03d7, B:154:0x0406, B:156:0x040c, B:108:0x02ba, B:110:0x02c8, B:112:0x02ce, B:114:0x02e7, B:116:0x02fc, B:118:0x0302), top: B:177:0x037c }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02de  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fc A[Catch: Exception -> 0x041b, TryCatch #1 {Exception -> 0x041b, blocks: (B:134:0x037c, B:136:0x0382, B:120:0x031b, B:124:0x032d, B:129:0x0342, B:152:0x03d7, B:154:0x0406, B:156:0x040c, B:108:0x02ba, B:110:0x02c8, B:112:0x02ce, B:114:0x02e7, B:116:0x02fc, B:118:0x0302), top: B:177:0x037c }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0301  */
    /* JADX WARN: Code duplicated, block: B:120:0x031b A[Catch: Exception -> 0x041b, TryCatch #1 {Exception -> 0x041b, blocks: (B:134:0x037c, B:136:0x0382, B:120:0x031b, B:124:0x032d, B:129:0x0342, B:152:0x03d7, B:154:0x0406, B:156:0x040c, B:108:0x02ba, B:110:0x02c8, B:112:0x02ce, B:114:0x02e7, B:116:0x02fc, B:118:0x0302), top: B:177:0x037c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x03d7 A[Catch: Exception -> 0x041b, TRY_ENTER, TryCatch #1 {Exception -> 0x041b, blocks: (B:134:0x037c, B:136:0x0382, B:120:0x031b, B:124:0x032d, B:129:0x0342, B:152:0x03d7, B:154:0x0406, B:156:0x040c, B:108:0x02ba, B:110:0x02c8, B:112:0x02ce, B:114:0x02e7, B:116:0x02fc, B:118:0x0302), top: B:177:0x037c }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0406 A[Catch: Exception -> 0x041b, TryCatch #1 {Exception -> 0x041b, blocks: (B:134:0x037c, B:136:0x0382, B:120:0x031b, B:124:0x032d, B:129:0x0342, B:152:0x03d7, B:154:0x0406, B:156:0x040c, B:108:0x02ba, B:110:0x02c8, B:112:0x02ce, B:114:0x02e7, B:116:0x02fc, B:118:0x0302), top: B:177:0x037c }] */
    /* JADX WARN: Code duplicated, block: B:155:0x040b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0410  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x0122 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x012c A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0140 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0148  */
    /* JADX WARN: Code duplicated, block: B:46:0x014b A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x014f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0151  */
    /* JADX WARN: Code duplicated, block: B:52:0x0158  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x0165  */
    /* JADX WARN: Code duplicated, block: B:60:0x0197 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d1 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e3 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0213 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0218  */
    /* JADX WARN: Code duplicated, block: B:81:0x0226  */
    /* JADX WARN: Code duplicated, block: B:83:0x022a A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0231 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x023b A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0240 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0246 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x024d A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0258 A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x025d A[Catch: Exception -> 0x0223, TryCatch #4 {Exception -> 0x0223, blocks: (B:27:0x00c7, B:29:0x00cd, B:33:0x00e0, B:37:0x00fa, B:39:0x0122, B:41:0x013a, B:43:0x0140, B:46:0x014b, B:50:0x0152, B:54:0x015b, B:58:0x0166, B:61:0x0198, B:63:0x01a8, B:65:0x01ae, B:67:0x01bd, B:69:0x01d1, B:71:0x01d7, B:73:0x01e3, B:75:0x0213, B:77:0x0219, B:83:0x022a, B:89:0x0246, B:97:0x026a, B:103:0x0285, B:90:0x024d, B:92:0x0258, B:93:0x025d, B:84:0x0231, B:86:0x023b, B:87:0x0240, B:40:0x012c, B:164:0x041f, B:166:0x0423), top: B:182:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0263  */
    /* JADX WARN: Code duplicated, block: B:96:0x0267  */
    /* JADX WARN: Code duplicated, block: B:99:0x027c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.max.mediaselector.lib.entity.LocalMedia] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0369 -> B:175:0x036c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:46:0x014b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.mediaselector.utils.HBCompressEngine$onStartCompress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
