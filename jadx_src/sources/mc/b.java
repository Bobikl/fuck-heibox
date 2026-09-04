package mc;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import com.max.hbexpression.ExpressionAssetManager;
import com.max.hbexpression.f;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.HashMap;
import java.util.regex.Matcher;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ExpressionTextSpanBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionTextSpanBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionTextSpanBuilder.kt\ncom/max/hbexpression/core/ExpressionTextSpanBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f131844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Spannable f131845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131846c;

    public b(@dl.d Context context, @dl.d Spannable builder, int i10) {
        f0.p(context, "context");
        f0.p(builder, "builder");
        this.f131844a = context;
        this.f131845b = builder;
        this.f131846c = i10;
    }

    public final int a() {
        int iEnd = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33164w2, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HashMap map = new HashMap();
        Spannable spannable = this.f131845b;
        com.max.hbexpression.widget.a[] aVarArr = (com.max.hbexpression.widget.a[]) spannable.getSpans(0, spannable.length(), com.max.hbexpression.widget.a.class);
        int length = aVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(Integer.valueOf(this.f131845b.getSpanStart(aVarArr[i10])), Integer.valueOf(this.f131845b.getSpanEnd(aVarArr[i10])));
        }
        Matcher matcher = c.f131847a.matcher(this.f131845b);
        while (matcher.find()) {
            Integer num = (Integer) map.get(Integer.valueOf(matcher.start()));
            if (num == null || num.intValue() != matcher.end()) {
                String strGroup = matcher.group();
                ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
                f0.m(strGroup);
                String strK = expressionAssetManager.k(strGroup);
                File file = strK != null ? new File(strK) : null;
                g.a aVar = g.f74531b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ExpressionTextSpanBuilder, cacheFile = ");
                sb2.append(file);
                sb2.append(", cacheFile.exists() = ");
                sb2.append(file != null ? Boolean.valueOf(file.exists()) : null);
                aVar.q(sb2.toString());
                int i11 = this.f131846c;
                if (file == null || !file.exists()) {
                    String strB = f.b(strGroup);
                    if (!TextUtils.isEmpty(strB)) {
                        expressionAssetManager.b(strGroup, strB);
                    }
                } else {
                    this.f131845b.setSpan(new com.max.hbexpression.widget.a(this.f131844a, file.getPath(), i11, 2, this.f131846c), matcher.start(), matcher.end(), 33);
                    iEnd += (matcher.end() - matcher.start()) - 1;
                }
            }
        }
        return iEnd;
    }

    @dl.d
    public final Spannable b() {
        return this.f131845b;
    }

    @dl.d
    public final Context c() {
        return this.f131844a;
    }

    public final int d() {
        return this.f131846c;
    }
}
