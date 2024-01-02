package com.study.email_verification.redis;

import com.study.email_verification.common.util.RedisUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    @DisplayName("Redis Test")
    public void redisTest() throws Exception {
        // given
        String email = "cnsang166@gmail.com";
        String code = "aaa111";

        // when
        redisUtil.setDataExpire(email, code, 60 * 60L);

        // then
        Assertions.assertTrue(redisUtil.existData("cnsang166@gmail.com"));
        Assertions.assertFalse(redisUtil.existData("cnsang1661@gmail.com"));
        Assertions.assertEquals(redisUtil.getData(email), "aaa111");
    }
}
