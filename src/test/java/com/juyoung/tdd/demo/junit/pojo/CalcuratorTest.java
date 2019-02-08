package com.juyoung.tdd.demo.junit.pojo;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

// [1] 단위 테스트 / TestFixture
public class CalcuratorTest {

    private Calcurator calcurator;

    // or Constructor : 하지만 객체가 constructor 사용 시 상태를 갖게 됨으로 jUnit이 지원하는 라이프사이클 이용
    // 라이프사이클 종류 : @Before, @BeforeClass, @After, @AfterClass
    @Before
    public void setUp() throws Exception {
        // given
        calcurator = new Calcurator();
    }

    @Test
    public void calcurator_plus() throws Exception {
        // when
        int result = calcurator.plus(3, 5);
        // then ( assertThat, assertEquals, assertThat 모두 동일 )
//        assertThat(result).isEqualTo(8);
//        assertEquals(8, result);    // org.junit.assert
        assertThat(result, is(8));  // is() : org.hamcrest.Matchers
    }

    @Test
    public void calcurator_plus_multiple() throws Exception {
        int result = calcurator.plus(2, 5, 6, 7);
        assertThat(result, is(20));
    }
}
