// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.GOST28147Engine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            GOST28147

public static class Cipher extends BaseBlockCipher
{

    public Cipher()
    {
        super(new CBCBlockCipher(new GOST28147Engine()), 64);
    }
}
