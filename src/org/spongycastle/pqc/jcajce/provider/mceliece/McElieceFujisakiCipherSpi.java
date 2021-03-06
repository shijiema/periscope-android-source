// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.pqc.jcajce.provider.mceliece;

import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters;
import org.spongycastle.pqc.crypto.mceliece.McElieceFujisakiCipher;
import org.spongycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;

// Referenced classes of package org.spongycastle.pqc.jcajce.provider.mceliece:
//            McElieceCCA2KeysToParams

public class McElieceFujisakiCipherSpi extends AsymmetricHybridCipher
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{
    public static class McElieceFujisaki extends McElieceFujisakiCipherSpi
    {

        public McElieceFujisaki()
        {
            super(new SHA1Digest(), new McElieceFujisakiCipher());
        }
    }

    public static class McElieceFujisaki224 extends McElieceFujisakiCipherSpi
    {

        public McElieceFujisaki224()
        {
            super(new SHA224Digest(), new McElieceFujisakiCipher());
        }
    }

    public static class McElieceFujisaki256 extends McElieceFujisakiCipherSpi
    {

        public McElieceFujisaki256()
        {
            super(new SHA256Digest(), new McElieceFujisakiCipher());
        }
    }

    public static class McElieceFujisaki384 extends McElieceFujisakiCipherSpi
    {

        public McElieceFujisaki384()
        {
            super(new SHA384Digest(), new McElieceFujisakiCipher());
        }
    }

    public static class McElieceFujisaki512 extends McElieceFujisakiCipherSpi
    {

        public McElieceFujisaki512()
        {
            super(new SHA512Digest(), new McElieceFujisakiCipher());
        }
    }


    private McElieceFujisakiCipher aOf;
    private ByteArrayOutputStream aOg;
    private Digest amS;

    protected McElieceFujisakiCipherSpi(ExtendedDigest extendeddigest, McElieceFujisakiCipher mceliecefujisakicipher)
    {
        amS = extendeddigest;
        aOf = mceliecefujisakicipher;
        aOg = new ByteArrayOutputStream();
    }

    public final byte[] doFinal(byte abyte0[], int i, int j)
    {
        aOg.write(abyte0, i, j);
        abyte0 = aOg.toByteArray();
        aOg.reset();
        if (aOp == 1)
        {
            try
            {
                abyte0 = aOf._mth06E6(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                abyte0.printStackTrace();
                break MISSING_BLOCK_LABEL_76;
            }
            return abyte0;
        }
        if (aOp != 2)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        abyte0 = aOf._mth0E40(abyte0);
        return abyte0;
        abyte0;
        abyte0.printStackTrace();
        return null;
    }

    public final byte[] update(byte abyte0[], int i, int j)
    {
        aOg.write(abyte0, i, j);
        return new byte[0];
    }

    protected final void _mth02CA(Key key, SecureRandom securerandom)
    {
        key = new ParametersWithRandom(McElieceCCA2KeysToParams._mth02BD((PublicKey)key), securerandom);
        amS.reset();
        aOf._mth02CA(true, key);
    }

    protected final void _mth02CB(Key key)
    {
        key = McElieceCCA2KeysToParams._mth02BB((PrivateKey)key);
        amS.reset();
        aOf._mth02CA(false, key);
    }

    public final int _mth02CE(Key key)
    {
        if (key instanceof PublicKey)
        {
            key = (McElieceCCA2KeyParameters)McElieceCCA2KeysToParams._mth02BD((PublicKey)key);
        } else
        {
            key = (McElieceCCA2KeyParameters)McElieceCCA2KeysToParams._mth02BB((PrivateKey)key);
        }
        return McElieceFujisakiCipher._mth02CA(key);
    }
}
