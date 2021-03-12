//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.cnki.android.cajreader.util;

import android.util.Log;

import com.cnki.android.cajreader.ReaderExLib;

import java.io.UnsupportedEncodingException;

public class DecodeUtil {
    public DecodeUtil() {
    }

    public static long DecryptRights(byte[] var0) {
        long var1 = ReaderExLib.DecryptRights(var0);
        Log.d("DecodeUtil", "call DecryptRights " + var1);
        return var1;
    }

    public static int RightsGetErrorCode(long var0) {
        int var2 = ReaderExLib.RightsGetErrorCode(var0);
        Log.d("DecodeUtil", "call RightsGetErrorCode " + var2);
        return var2;
    }

    public static boolean RightsDecryptData(long var0, byte[] var2) {
        Log.d("DecodeUtil", "call RightsDecryptData");
        boolean var3 = ReaderExLib.RightsDecryptData(var0, var2);
        if (var3) {
            try {
                String var4 = new String(var2, "utf-8");
                Log.d("DecodeUtil", var4);
            } catch (UnsupportedEncodingException var5) {
            }
        }

        return var3;
    }

    public static void ReleaseRights(long var0) {
        ReaderExLib.ReleaseRights(var0);
    }
}
