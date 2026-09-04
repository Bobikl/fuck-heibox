package org.apache.tools.ant.util;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PushbackReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
public class LayoutPreservingProperties extends Properties {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LogicalLine> f136707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Integer> f136708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f136709e;

    public static class Blank extends LogicalLine {
        private static final long serialVersionUID = 1;

        public Blank() {
            super("");
        }
    }

    public class Comment extends LogicalLine {
        private static final long serialVersionUID = 1;

        public Comment(String str) {
            super(str);
        }
    }

    public static abstract class LogicalLine implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f136711b;

        public LogicalLine(String str) {
            this.f136711b = str;
        }

        public void a(String str) {
            this.f136711b = str;
        }

        public String toString() {
            return this.f136711b;
        }
    }

    public static class Pair extends LogicalLine implements Cloneable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f136712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f136713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f136714e;

        public Pair(String str) {
            super(str);
            g(str);
        }

        public Pair(String str, String str2) {
            this(str + ContainerUtils.KEY_VALUE_DELIMITER + str2);
        }

        private int b(String str) {
            return e(str.replaceAll("\\\\\\\\", "__").replaceAll("\\\\=", "__").replaceAll("\\\\:", "__").replaceAll("\\\\ ", "__").replaceAll("\\\\t", "__"), " :=\t");
        }

        private int e(String str, String str2) {
            if (str == null || str2 == null) {
                return -1;
            }
            int length = str.length() + 1;
            for (int i10 = 0; i10 < str2.length(); i10++) {
                int iIndexOf = str.indexOf(str2.charAt(i10));
                if (iIndexOf != -1 && iIndexOf < length) {
                    length = iIndexOf;
                }
            }
            if (length == str.length() + 1) {
                return -1;
            }
            return length;
        }

        private void g(String str) {
            int iB = b(str);
            if (iB == -1) {
                this.f136712c = str;
                i(null);
            } else {
                this.f136712c = str.substring(0, iB);
                i(str.substring(iB + 1));
            }
            this.f136712c = j(this.f136712c, " \t\f");
        }

        private String j(String str, String str2) {
            if (str == null) {
                return null;
            }
            int i10 = 0;
            while (i10 < str.length() && str2.indexOf(str.charAt(i10)) != -1) {
                i10++;
            }
            return i10 == str.length() ? "" : str.substring(i10);
        }

        public String c() {
            return this.f136712c;
        }

        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public String d() {
            return this.f136713d;
        }

        public boolean f() {
            return this.f136714e;
        }

        public void h(boolean z10) {
            this.f136714e = z10;
        }

        public void i(String str) {
            this.f136713d = str;
            a(this.f136712c + ContainerUtils.KEY_VALUE_DELIMITER + str);
        }
    }

    public LayoutPreservingProperties() {
        this.f136706b = System.lineSeparator();
        this.f136707c = new ArrayList();
        this.f136708d = new HashMap();
    }

    public LayoutPreservingProperties(Properties properties) {
        super(properties);
        this.f136706b = System.lineSeparator();
        this.f136707c = new ArrayList();
        this.f136708d = new HashMap();
    }

    private String a(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, str.length(), cArr, 0);
        StringBuilder sb2 = new StringBuilder(str.length());
        boolean z11 = true;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = cArr[i10];
            if (c10 != ' ') {
                z11 = false;
            } else if (z10 || z11) {
                sb2.append("\\");
            }
            int iIndexOf = "\t\f\r\n\\:=#!".indexOf(c10);
            if (iIndexOf != -1) {
                sb2.append("\\");
                sb2.append((CharSequence) "tfrn\\:=#!", iIndexOf, iIndexOf + 1);
            } else if (c10 < ' ' || c10 > '~') {
                sb2.append(c(c10));
            } else {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    private String b(String str) {
        return a(str, true);
    }

    private String c(char c10) {
        return "\\" + ((Object) s2.a(c10));
    }

    private String d(String str) {
        return a(str, false);
    }

    private void e(String str, String str2) {
        String strD = d(str2);
        if (this.f136708d.containsKey(str)) {
            ((Pair) this.f136707c.get(this.f136708d.get(str).intValue())).i(strD);
            return;
        }
        String strB = b(str);
        Pair pair = new Pair(strB, strD);
        pair.h(true);
        this.f136708d.put(strB, Integer.valueOf(this.f136707c.size()));
        this.f136707c.add(pair);
    }

    private String h(PushbackReader pushbackReader) throws IOException {
        StringBuilder sb2 = new StringBuilder(80);
        int i10 = pushbackReader.read();
        this.f136706b = System.lineSeparator();
        boolean z10 = false;
        while (i10 >= 0) {
            if (z10 && i10 != 10) {
                pushbackReader.unread(i10);
                break;
            }
            if (i10 == 13) {
                this.f136706b = "\r";
                z10 = true;
            } else {
                if (i10 == 10) {
                    this.f136706b = z10 ? "\r\n" : "\n";
                    break;
                }
                sb2.append((char) i10);
            }
            i10 = pushbackReader.read();
        }
        return sb2.toString();
    }

    private String i(InputStream inputStream) throws IOException {
        LogicalLine blank;
        PushbackReader pushbackReader = new PushbackReader(new InputStreamReader(inputStream, StandardCharsets.ISO_8859_1), 1);
        if (!this.f136707c.isEmpty()) {
            this.f136707c.add(new Blank());
        }
        String strH = h(pushbackReader);
        BufferedReader bufferedReader = new BufferedReader(pushbackReader);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean zK = false;
        boolean zMatches = false;
        while (strH != null) {
            sb2.append(strH);
            sb2.append(this.f136706b);
            if (zK) {
                strH = "\n" + strH;
            } else {
                zMatches = strH.matches("^[ \t\f]*[#!].*");
            }
            if (!zMatches) {
                zK = k(strH);
            }
            sb3.append(strH);
            if (!zK) {
                if (zMatches) {
                    blank = new Comment(sb3.toString());
                } else if (sb3.toString().trim().isEmpty()) {
                    blank = new Blank();
                } else {
                    Pair pair = new Pair(sb3.toString());
                    String strP = p(pair.c());
                    if (this.f136708d.containsKey(strP)) {
                        remove(strP);
                    }
                    this.f136708d.put(strP, Integer.valueOf(this.f136707c.size()));
                    blank = pair;
                }
                this.f136707c.add(blank);
                sb3.setLength(0);
            }
            strH = bufferedReader.readLine();
        }
        return sb2.toString();
    }

    private void j(int i10) {
        int i11 = i10 - 1;
        int i12 = i11;
        while (i12 > 0 && (this.f136707c.get(i12) instanceof Blank)) {
            i12--;
        }
        if (!(this.f136707c.get(i12) instanceof Comment)) {
            return;
        }
        while (i12 >= 0 && (this.f136707c.get(i12) instanceof Comment)) {
            i12--;
        }
        while (true) {
            i12++;
            if (i12 > i11) {
                return;
            } else {
                this.f136707c.set(i12, null);
            }
        }
    }

    private boolean k(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length - 1;
        while (length > 0 && charArray[length] == '\\') {
            length--;
        }
        return ((charArray.length - length) - 1) % 2 == 1;
    }

    private String p(String str) {
        int length = str.length() + 1;
        char[] cArr = new char[length];
        int i10 = 0;
        str.getChars(0, str.length(), cArr, 0);
        cArr[str.length()] = '\n';
        StringBuilder sb2 = new StringBuilder(str.length());
        while (i10 < length) {
            char c10 = cArr[i10];
            if (c10 == '\n') {
                break;
            }
            if (c10 == '\\') {
                i10++;
                char c11 = cArr[i10];
                if (c11 == 'n') {
                    sb2.append('\n');
                } else if (c11 == 'r') {
                    sb2.append('\r');
                } else if (c11 == 'f') {
                    sb2.append('\f');
                } else if (c11 == 't') {
                    sb2.append('\t');
                } else if (c11 == 'u') {
                    char cR = r(cArr, i10 + 1);
                    i10 += 4;
                    sb2.append(cR);
                } else {
                    sb2.append(c11);
                }
            } else {
                sb2.append(c10);
            }
            i10++;
        }
        return sb2.toString();
    }

    private char r(char[] cArr, int i10) {
        return (char) Integer.parseInt(new String(cArr, i10, 4), 16);
    }

    @Override // java.util.Hashtable, java.util.Map
    public void clear() {
        super.clear();
        this.f136708d.clear();
        this.f136707c.clear();
    }

    @Override // java.util.Hashtable
    public Object clone() {
        LayoutPreservingProperties layoutPreservingProperties = (LayoutPreservingProperties) super.clone();
        layoutPreservingProperties.f136708d = new HashMap(this.f136708d);
        ArrayList arrayList = new ArrayList(this.f136707c);
        layoutPreservingProperties.f136707c = arrayList;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LogicalLine logicalLine = layoutPreservingProperties.f136707c.get(i10);
            if (logicalLine instanceof Pair) {
                layoutPreservingProperties.f136707c.set(i10, (Pair) ((Pair) logicalLine).clone());
            }
        }
        return layoutPreservingProperties;
    }

    public boolean f() {
        return this.f136709e;
    }

    public void g(PrintStream printStream) {
        printStream.println("-- logical lines --");
        for (LogicalLine logicalLine : this.f136707c) {
            if (logicalLine instanceof Blank) {
                printStream.println("blank:   \"" + logicalLine + "\"");
            } else if (logicalLine instanceof Comment) {
                printStream.println("comment: \"" + logicalLine + "\"");
            } else if (logicalLine instanceof Pair) {
                printStream.println("pair:    \"" + logicalLine + "\"");
            }
        }
    }

    public void l(File file) throws IOException {
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(file.toPath(), new OpenOption[0]);
        store(outputStreamNewOutputStream, (String) null);
        outputStreamNewOutputStream.close();
    }

    @Override // java.util.Properties
    public void load(InputStream inputStream) throws IOException {
        super.load(new ByteArrayInputStream(i(inputStream).getBytes(StandardCharsets.ISO_8859_1)));
    }

    public void n(boolean z10) {
        this.f136709e = z10;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object put(Object obj, Object obj2) throws NullPointerException {
        Object objPut = super.put(obj, obj2);
        e(obj.toString(), obj2.toString());
        return objPut;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        Integer numRemove = this.f136708d.remove(obj);
        if (numRemove != null) {
            if (this.f136709e) {
                j(numRemove.intValue());
            }
            this.f136707c.set(numRemove.intValue(), null);
        }
        return objRemove;
    }

    @Override // java.util.Properties
    public Object setProperty(String str, String str2) throws NullPointerException {
        Object property = super.setProperty(str, str2);
        e(str, str2);
        return property;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    @Override // java.util.Properties
    public void store(OutputStream outputStream, String str) throws IOException {
        int i10;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.ISO_8859_1);
        int size = this.f136707c.size();
        boolean z10 = false;
        if (str != null) {
            outputStreamWriter.write("#" + str + this.f136706b);
            if (size > 0 && (this.f136707c.get(0) instanceof Comment) && str.equals(this.f136707c.get(0).toString().substring(1))) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        if (size > i10 && (this.f136707c.get(i10) instanceof Comment)) {
            try {
                d0.m(this.f136707c.get(i10).toString().substring(1));
                i10++;
            } catch (ParseException unused) {
            }
        }
        outputStreamWriter.write("#" + d0.h() + this.f136706b);
        for (LogicalLine logicalLine : this.f136707c.subList(i10, size)) {
            if (logicalLine instanceof Pair) {
                if (((Pair) logicalLine).f() && !z10) {
                    outputStreamWriter.write(this.f136706b);
                    z10 = true;
                }
                outputStreamWriter.write(logicalLine.toString() + this.f136706b);
            } else if (logicalLine != null) {
                outputStreamWriter.write(logicalLine.toString() + this.f136706b);
            }
        }
        outputStreamWriter.close();
    }
}
