package com.max.hbexpression.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExpressionPackViewObj.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ExpressionPackViewObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int expressionType;

    @d
    private final List<ExpressionObj> expressions;

    @d
    private final String packGroupCode;

    @e
    private final String packGroupImg;

    @e
    private final String packGroupName;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpressionPackViewObj(@d List<? extends ExpressionObj> expressions, int i10, @d String packGroupCode, @e String str, @e String str2) {
        f0.p(expressions, "expressions");
        f0.p(packGroupCode, "packGroupCode");
        this.expressions = expressions;
        this.expressionType = i10;
        this.packGroupCode = packGroupCode;
        this.packGroupName = str;
        this.packGroupImg = str2;
    }

    public static /* synthetic */ ExpressionPackViewObj copy$default(ExpressionPackViewObj expressionPackViewObj, List list, int i10, String str, String str2, String str3, int i11, Object obj) {
        int i12 = i10;
        Object[] objArr = {expressionPackViewObj, list, new Integer(i12), str, str2, str3, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.g.f33064r2, new Class[]{ExpressionPackViewObj.class, List.class, cls, String.class, String.class, String.class, cls, Object.class}, ExpressionPackViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ExpressionPackViewObj) patchProxyResultProxy.result;
        }
        List list2 = (i11 & 1) != 0 ? expressionPackViewObj.expressions : list;
        if ((i11 & 2) != 0) {
            i12 = expressionPackViewObj.expressionType;
        }
        return expressionPackViewObj.copy(list2, i12, (i11 & 4) != 0 ? expressionPackViewObj.packGroupCode : str, (i11 & 8) != 0 ? expressionPackViewObj.packGroupName : str2, (i11 & 16) != 0 ? expressionPackViewObj.packGroupImg : str3);
    }

    @d
    public final List<ExpressionObj> component1() {
        return this.expressions;
    }

    public final int component2() {
        return this.expressionType;
    }

    @d
    public final String component3() {
        return this.packGroupCode;
    }

    @e
    public final String component4() {
        return this.packGroupName;
    }

    @e
    public final String component5() {
        return this.packGroupImg;
    }

    @d
    public final ExpressionPackViewObj copy(@d List<? extends ExpressionObj> expressions, int i10, @d String packGroupCode, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressions, new Integer(i10), packGroupCode, str, str2}, this, changeQuickRedirect, false, c.g.f33044q2, new Class[]{List.class, Integer.TYPE, String.class, String.class, String.class}, ExpressionPackViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ExpressionPackViewObj) patchProxyResultProxy.result;
        }
        f0.p(expressions, "expressions");
        f0.p(packGroupCode, "packGroupCode");
        return new ExpressionPackViewObj(expressions, i10, packGroupCode, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.g.f33124u2, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpressionPackViewObj)) {
            return false;
        }
        ExpressionPackViewObj expressionPackViewObj = (ExpressionPackViewObj) obj;
        return f0.g(this.expressions, expressionPackViewObj.expressions) && this.expressionType == expressionPackViewObj.expressionType && f0.g(this.packGroupCode, expressionPackViewObj.packGroupCode) && f0.g(this.packGroupName, expressionPackViewObj.packGroupName) && f0.g(this.packGroupImg, expressionPackViewObj.packGroupImg);
    }

    public final int getExpressionType() {
        return this.expressionType;
    }

    @d
    public final List<ExpressionObj> getExpressions() {
        return this.expressions;
    }

    @d
    public final String getPackGroupCode() {
        return this.packGroupCode;
    }

    @e
    public final String getPackGroupImg() {
        return this.packGroupImg;
    }

    @e
    public final String getPackGroupName() {
        return this.packGroupName;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6656, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((((this.expressions.hashCode() * 31) + this.expressionType) * 31) + this.packGroupCode.hashCode()) * 31;
        String str = this.packGroupName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.packGroupImg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isBigExpressionStyle() {
        return this.expressionType == 0;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33084s2, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ExpressionPackViewObj(expressions=" + this.expressions + ", expressionType=" + this.expressionType + ", packGroupCode=" + this.packGroupCode + ", packGroupName=" + this.packGroupName + ", packGroupImg=" + this.packGroupImg + ')';
    }
}
