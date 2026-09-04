package rj;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.g0;

/* JADX INFO: compiled from: CutDirsMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f139137b = 0;

    public void a(int i10) {
        this.f139137b = i10;
    }

    @Override // org.apache.tools.ant.util.g0
    public void n0(String str) {
    }

    @Override // org.apache.tools.ant.util.g0
    public void q0(String str) {
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(String str) {
        if (this.f139137b <= 0) {
            throw new BuildException("dirs must be set to a positive number");
        }
        char c10 = File.separatorChar;
        if (str == null) {
            return null;
        }
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, c10).replace(IOUtils.DIR_SEPARATOR_WINDOWS, c10);
        int iIndexOf = strReplace.indexOf(c10);
        for (int i10 = 1; iIndexOf > -1 && i10 < this.f139137b; i10++) {
            iIndexOf = strReplace.indexOf(c10, iIndexOf + 1);
        }
        if (iIndexOf == -1) {
            return null;
        }
        return new String[]{str.substring(iIndexOf + 1)};
    }
}
