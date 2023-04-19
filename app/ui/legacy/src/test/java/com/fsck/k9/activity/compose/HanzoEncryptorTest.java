package com.fsck.k9.activity.compose;


import java.math.BigInteger;

import com.fsck.k9.activity.HanzoEncryptor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HanzoEncryptorTest {

    @Test
    public void round_function() {
        HanzoEncryptor hanzo_encryptor = new HanzoEncryptor();
        BigInteger dummy_bits = new BigInteger("6148820870539247615");
        BigInteger result_bits = hanzo_encryptor.round_function(new BigInteger("18446744073709551615"), new BigInteger("320265757102059730318470218759311257840"));
        assertEquals(dummy_bits, result_bits);
    }

    @Test
    public void key_function() {
        HanzoEncryptor hanzo_encryptor = new HanzoEncryptor();
        BigInteger dummy = new BigInteger("46522979852472055849086995298378579967");
        BigInteger result = hanzo_encryptor.key_function(new BigInteger("340282366920938463444927863358058659840"), 64);
        assertEquals(dummy, result);
        assertEquals(new BigInteger("258026610946483669448474616064175505408"), hanzo_encryptor.key_function(new BigInteger("17361641481138401520"), 1));
    }

    @Test
    public void encrypt() {
        HanzoEncryptor hanzo_encryptor = new HanzoEncryptor();
        String dummy = "00000000000000000000000000000000cdc3de04538514e673cdaa6b6f0020ca";
        String result = hanzo_encryptor.encrypt(new BigInteger("320265757102059730318470218759311257840"), new BigInteger("320265757102059730318470218759311257840"));
        assertEquals(dummy, result);
    }

    @Test
    public void string_encrypt() {
        HanzoEncryptor hanzo_encryptor = new HanzoEncryptor();
        String a = "e\u0007[hpp4Ç8Î\u008Cà\u001A\u0090¼¹?I×\u0005ÑÉW¯~x7\u008B-²ò¸";
        String dummy = a;
        String result = hanzo_encryptor.string_encrypt("string", new BigInteger("320265757102059730318470218759311257840"));
        assertEquals(dummy, result);
    }

    @Test
    public void string_decrypt() {
        HanzoEncryptor hanzo_encryptor = new HanzoEncryptor();
        String a = "string";
        String dummy = a;
        String result = hanzo_encryptor.string_encrypt(a, new BigInteger("320265757102059730318470218759311257840"));
        result = hanzo_encryptor.string_decrypt(result, new BigInteger("320265757102059730318470218759311257840"));
        assertEquals(dummy, result);
    }
}
