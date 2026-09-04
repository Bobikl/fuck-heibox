package com.max.hbexpression;

import com.max.hbexpression.bean.ExpressionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ExpressionInerFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class d extends a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d W3(ArrayList<List<ExpressionObj>> arrayList, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str}, null, changeQuickRedirect, true, bb.c.f.iD, new Class[]{ArrayList.class, String.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        d dVar = new d();
        dVar.T3(arrayList);
        dVar.U3(str);
        return dVar;
    }

    @Override // com.max.hbexpression.a
    public boolean Q3() {
        return true;
    }

    @Override // com.max.hbexpression.a
    public ArrayList<c> V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32722a, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<c> arrayList = new ArrayList<>();
        ArrayList<List<ExpressionObj>> arrayListN3 = N3();
        if (arrayListN3 != null) {
            for (int i10 = 0; i10 < arrayListN3.size(); i10++) {
                arrayList.add(c.N3(arrayListN3.get(i10), Boolean.FALSE));
            }
        }
        return arrayList;
    }
}
