package com.bboombboom.backend.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = JasyptConfig.class)
public class JasyptConfigTests {

    private static final Logger logger = LoggerFactory.getLogger(JasyptConfigTests.class);
    
    @Test
    public void jastypt() {
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        
        String password = "password";
        String plainText = "plainText";
        
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(password);
        String enc = pbeEnc.encrypt(plainText);
        logger.info(enc);
    }
}